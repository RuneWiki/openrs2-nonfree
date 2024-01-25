import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!or", name = "v", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "[[Lclient!go;")
	public static Class95[][] aClass95ArrayArray3;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "I")
	public static int anInt4906;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	public static int anInt4904 = 0;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_109 = new Class253(14, 3);

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_75 = new Class2(57, 4);

	@OriginalMember(owner = "client!or", name = "y", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ec;)[Lclient!tb;")
	public static Class234[] method3885(@OriginalArg(1) Class61 arg0) {
		if (!arg0.method1454()) {
			return new Class234[0];
		}
		@Pc(21) Class236 local21 = arg0.method1465();
		while (local21.anInt6178 == 0) {
			Static214.method2089(10L);
		}
		if (local21.anInt6178 == 2) {
			return new Class234[0];
		}
		@Pc(47) int[] local47 = (int[]) local21.anObject8;
		@Pc(53) Class234[] local53 = new Class234[local47.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
			@Pc(61) Class234 local61 = new Class234();
			local53[local55] = local61;
			local61.anInt6123 = local47[local55 << 2];
			local61.anInt6121 = local47[(local55 << 2) + 1];
			local61.anInt6125 = local47[(local55 << 2) + 2];
			local61.anInt6120 = local47[(local55 << 2) + 3];
		}
		return local53;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ba;III[Z)Z")
	public static boolean method3886(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static244.aClass165Array8 != Static28.aClass165Array1) {
			@Pc(11) int local11 = Static149.aClass165Array7[arg1].a(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class165 local18 = Static149.aClass165Array7[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.a(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3580(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.b(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
