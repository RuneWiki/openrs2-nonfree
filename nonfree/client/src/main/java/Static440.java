import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public static int anInt8157;

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
	public static int anInt8154 = 0;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "[I")
	public static final int[] anIntArray538 = new int[3];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIB)V")
	public static void method6960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17 = arg1 * Static74.aClass2_Sub13_5.aClass14_Sub6_4.method3223() >> 8;
		if (local17 == 0 || arg0 == -1) {
			return;
		}
		if (!Static301.aBoolean468 && Static580.anInt10350 != -1 && Static425.method6833() && !Static93.method2532()) {
			Static490.aClass2_Sub8_Sub3_6 = Static229.method4396();
			@Pc(43) Class2_Sub8_Sub3 local43 = Static433.method6890(Static490.aClass2_Sub8_Sub3_6);
			Static263.method4857(local43);
		}
		Static196.method3971(arg0, Static361.aClass157_187, local17);
		Static143.method7504(255, -1);
		Static301.aBoolean468 = true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!jb;")
	public static Class3_Sub1_Sub3 method6961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class243 local14 = local7.aClass243_1; local14 != null; local14 = local14.aClass243_3) {
			@Pc(18) Class3_Sub1_Sub3 local18 = local14.aClass3_Sub1_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort118 == arg1 && local18.aShort120 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
