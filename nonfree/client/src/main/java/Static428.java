import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "Lclient!gga;")
	public static Class124 aClass124_85;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
	public static int anInt7848;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "J")
	public static long aLong218;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Lclient!ne;")
	public static Class15_Sub3_Sub5 method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass15_Sub3_Sub5_1 == null ? null : local7.aClass15_Sub3_Sub5_1;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIILclient!lea;)Lclient!uk;")
	public static Class50_Sub4_Sub1 method7018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class101_Sub2 arg4) {
		if (arg4.aBoolean457 || Static100.method1457(arg0) && Static100.method1457(arg2)) {
			return new Class50_Sub4_Sub1(arg4, 3553, arg3, arg1, arg0, arg2, true);
		} else if (arg4.aBoolean467) {
			return new Class50_Sub4_Sub1(arg4, 34037, arg3, arg1, arg0, arg2, true);
		} else {
			return new Class50_Sub4_Sub1(arg4, arg3, arg1, arg0, arg2, Static432.method7064(arg0), Static432.method7064(arg2), true);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZI)V")
	public static void method7019(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static331.aClass2_Sub1_Sub9_3 != null) {
			Static227.anInt4605 = Static331.aClass2_Sub1_Sub9_3.anInt5173;
		} else {
			Static227.anInt4605 = -1;
		}
		Class15_Sub3_Sub3_Sub2.lb = null;
		Static331.aClass2_Sub1_Sub9_3 = null;
		Static527.aClass357_137 = null;
		Static95.anInt1689 = 0;
		Static331.method9075();
		Static331.aClass271_65.method7181();
		Static463.aClass144_5 = null;
		Static489.aClass144_7 = null;
		Static331.aClass75_2 = null;
		Static125.aClass144_2 = null;
		Static391.aClass144_4 = null;
		Static565.aClass144_8 = null;
		Static328.aClass71_12 = null;
		Static474.aClass144_6 = null;
		Static122.aClass144_1 = null;
		Static377.aClass144_3 = null;
		Static22.anInt389 = -1;
		Static69.anInt1350 = -1;
		if (Static331.aClass5_4 != null) {
			Static331.aClass5_4.method99();
			Static331.aClass5_4.method96(64, 128);
		}
		if (Static331.aClass353_4 != null) {
			Static331.aClass353_4.method8897(64, 64);
		}
		if (Static331.aClass328_4 != null) {
			Static331.aClass328_4.method8255(64);
		}
		Static395.aClass140_1.method4037(64);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIII)V")
	public static void method7020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class2_Sub1_Sub5 local14 = Static653.method9595(18, (long) arg3 << 32 | (long) arg0);
		local14.method2486();
		local14.anInt2674 = arg2;
		local14.anInt2680 = arg1;
	}
}
