import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!tj;")
	public static Class193 aClass193_77;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public static int anInt4409 = 999999;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method3915() {
		Static327.aClass198_230.method5209();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Lclient!rg;")
	public static Class4_Sub4_Sub15 method3916(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static281.aClass198_202;
		@Pc(14) Class4_Sub4_Sub15 local14;
		synchronized (Static281.aClass198_202) {
			local14 = (Class4_Sub4_Sub15) Static281.aClass198_202.method5210((long) arg0);
			if (local14 == null) {
				local14 = new Class4_Sub4_Sub15(arg0);
				Static281.aClass198_202.method5201(local14, (long) arg0);
			}
		}
		synchronized (local14) {
			return local14.method4672() ? local14 : null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ml;B)[Lclient!j;")
	public static Class101[] method3917(@OriginalArg(0) Class134 arg0) {
		if (!arg0.method3763()) {
			return new Class101[0];
		}
		@Pc(18) Class185 local18 = arg0.method3756();
		while (local18.anInt5682 == 0) {
			Static249.method4396(10L);
		}
		if (local18.anInt5682 == 2) {
			return new Class101[0];
		}
		@Pc(47) int[] local47 = (int[]) local18.anObject4;
		@Pc(53) Class101[] local53 = new Class101[local47.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
			@Pc(61) Class101 local61 = new Class101();
			local53[local55] = local61;
			local61.anInt3228 = local47[local55 << 2];
			local61.anInt3223 = local47[(local55 << 2) + 1];
			local61.anInt3225 = local47[(local55 << 2) + 2];
			local61.anInt3224 = local47[(local55 << 2) + 3];
		}
		return local53;
	}
}
