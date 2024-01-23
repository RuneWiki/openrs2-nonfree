import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public static int anInt4795;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array12;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[S")
	public static short[] aShortArray158 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V")
	public static void method3890(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static140.anInt3196 >= 100 && Static116.anInt2733 != 1 || Static140.anInt3196 >= 200) {
			Static95.method1663(Static73.aClass78_352, Static198.aClass78_784, 0);
			return;
		}
		@Pc(33) Class78 local33 = Static103.method1785(arg0).method3048();
		for (@Pc(35) int local35 = 0; local35 < Static140.anInt3196; local35++) {
			if (arg0 == Static200.aLongArray12[local35]) {
				Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { local33, Static98.aClass78_474 }), 0);
				return;
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static72.anInt4686; local77++) {
			if (arg0 == Static100.aLongArray6[local77]) {
				Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { Static64.aClass78_303, local33, Static11.aClass78_44 }), 0);
				return;
			}
		}
		if (local33.method3043(Static31.aClass5_Sub2_Sub2_1.aClass78_423)) {
			Static95.method1663(Static73.aClass78_352, Static80.aClass78_385, 0);
			return;
		}
		Static159.aClass78Array31[Static140.anInt3196] = local33;
		Static200.aLongArray12[Static140.anInt3196] = arg0;
		Static87.anIntArray347[Static140.anInt3196] = 0;
		Static193.aClass78Array34[Static140.anInt3196] = Static73.aClass78_352;
		Static125.anIntArray278[Static140.anInt3196] = 0;
		Static43.aBooleanArray25[Static140.anInt3196] = false;
		Static140.anInt3196++;
		Static140.anInt3198 = Static133.anInt3087;
		Static161.aClass2_Sub23_Sub1_5.method2155(240);
		Static161.aClass2_Sub23_Sub1_5.method2103(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB[II)V")
	public static void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(14) int local14 = local11 - 7;
		while (local14 > arg1) {
			@Pc(17) int local17 = arg1 + 1;
			arg2[local17] = arg0;
			@Pc(22) int local22 = local17 + 1;
			arg2[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg2[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg2[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg2[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg2[local42] = arg0;
			@Pc(47) int local47 = local42 + 1;
			arg2[local47] = arg0;
			arg1 = local47 + 1;
			arg2[arg1] = arg0;
		}
		while (local11 > arg1) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)[Lclient!uj;")
	public static Class79[] method3895() {
		@Pc(4) Class79[] local4 = new Class79[Static113.anInt2492];
		for (@Pc(6) int local6 = 0; local6 < Static113.anInt2492; local6++) {
			local4[local6] = new Class79_Sub1(Static142.anInt3236, Static100.anInt2184, Static186.anIntArray702[local6], Static37.anIntArray108[local6], Static113.anIntArray423[local6], Static131.anIntArray489[local6], Static31.aByteArrayArray3[local6], Static198.anIntArray725);
		}
		Static28.method365();
		return local4;
	}
}
