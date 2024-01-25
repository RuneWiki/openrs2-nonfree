import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eka", name = "h", descriptor = "Lclient!nt;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!eka", name = "k", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
	public static int anInt2261 = 100;

	@OriginalMember(owner = "client!eka", name = "i", descriptor = "I")
	public static int anInt2262 = 0;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZ)I")
	public static int method2040(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIILclient!jd;Lclient!jd;)V")
	public static void method2041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub1_Sub5 arg3, @OriginalArg(4) Class41_Sub1_Sub5 arg4) {
		@Pc(4) Class313 local4 = Static40.method503(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub1_Sub5_1 = arg3;
		local4.aClass41_Sub1_Sub5_2 = arg4;
		@Pc(19) int local19 = Static298.aClass88Array3 == Static176.aClass88Array1 ? 1 : 0;
		if (!arg3.method8650()) {
			arg3.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local19];
			Static126.aClass41_Sub1Array2[local19] = arg3;
		} else if (arg3.method8647()) {
			arg3.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local19];
			Static227.aClass41_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local19];
			Static271.aClass41_Sub1Array4[local19] = arg3;
			Static677.aBoolean794 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8650()) {
			if (arg4.method8647()) {
				arg4.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local19];
				Static227.aClass41_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local19];
			Static271.aClass41_Sub1Array4[local19] = arg4;
			Static677.aBoolean794 = true;
			return;
		}
		arg4.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local19];
		Static126.aClass41_Sub1Array2[local19] = arg4;
	}
}
