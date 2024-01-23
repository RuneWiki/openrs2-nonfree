import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!nc;")
	public static Class112 aClass112_115;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	public static int anInt5846;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[Lclient!u;")
	public static Class13_Sub5_Sub2[] aClass13_Sub5_Sub2Array114 = new Class13_Sub5_Sub2[32768];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) String local36 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local36);
		Static12.method232(local36);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!of;B)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub26 arg4) {
		if (arg4.anInt3910 == -1 && arg4.anIntArray309 == null) {
			return;
		}
		@Pc(17) int local17 = 0;
		if (arg4.anInt3908 < arg0) {
			local17 = arg0 - arg4.anInt3908;
		} else if (arg0 < arg4.anInt3915) {
			local17 = arg4.anInt3915 - arg0;
		}
		@Pc(51) int local51 = arg4.anInt3917 * Static192.anInt815 >> 8;
		if (arg2 > arg4.anInt3912) {
			local17 += arg2 - arg4.anInt3912;
		} else if (arg4.anInt3914 > arg2) {
			local17 += arg4.anInt3914 - arg2;
		}
		if (arg4.anInt3920 == 0 || local17 - 64 > arg4.anInt3920 || Static192.anInt815 == 0 || arg4.anInt3907 != arg1) {
			if (arg4.aClass4_Sub6_Sub1_3 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(arg4.aClass4_Sub6_Sub1_3);
				arg4.aClass4_Sub6_Sub1_3 = null;
			}
			if (arg4.aClass4_Sub6_Sub1_2 != null) {
				Static10.aClass4_Sub6_Sub4_1.method3730(arg4.aClass4_Sub6_Sub1_2);
				arg4.aClass4_Sub6_Sub1_2 = null;
			}
			return;
		}
		local17 -= 64;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(153) int local153 = local51 * (arg4.anInt3920 - local17) / arg4.anInt3920;
		if (arg4.aClass4_Sub6_Sub1_3 != null) {
			arg4.aClass4_Sub6_Sub1_3.method491(local153);
		} else if (arg4.anInt3910 >= 0) {
			@Pc(165) Class56 local165 = Static313.method1431(Static137.aClass22_47, arg4.anInt3910, 0);
			if (local165 != null) {
				@Pc(172) Class4_Sub5_Sub1 local172 = local165.method1434().method3689(Static93.aClass16_2);
				@Pc(177) Class4_Sub6_Sub1 local177 = Static310.method486(local172, local153);
				local177.method492(-1);
				Static10.aClass4_Sub6_Sub4_1.method3731(local177);
				arg4.aClass4_Sub6_Sub1_3 = local177;
			}
		}
		if (arg4.aClass4_Sub6_Sub1_2 != null) {
			arg4.aClass4_Sub6_Sub1_2.method491(local153);
			if (!arg4.aClass4_Sub6_Sub1_2.method4694()) {
				arg4.aClass4_Sub6_Sub1_2 = null;
			}
		} else if (arg4.anIntArray309 != null && (arg4.anInt3919 -= arg3) <= 0) {
			@Pc(232) int local232 = (int) ((double) arg4.anIntArray309.length * Math.random());
			@Pc(240) Class56 local240 = Static313.method1431(Static137.aClass22_47, arg4.anIntArray309[local232], 0);
			if (local240 != null) {
				@Pc(249) Class4_Sub5_Sub1 local249 = local240.method1434().method3689(Static93.aClass16_2);
				@Pc(254) Class4_Sub6_Sub1 local254 = Static310.method486(local249, local153);
				local254.method492(0);
				Static10.aClass4_Sub6_Sub4_1.method3731(local254);
				arg4.aClass4_Sub6_Sub1_2 = local254;
				arg4.anInt3919 = (int) (Math.random() * (double) (arg4.anInt3911 - arg4.anInt3909)) + arg4.anInt3909;
			}
		}
	}
}
