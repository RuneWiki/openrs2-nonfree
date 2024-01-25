import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!kj;I)I")
	public static int method3621(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		if (arg0.anInt7673 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(54) int local54;
		if (arg0.anInt7656 != -1) {
			@Pc(14) Class11_Sub5_Sub2 local14 = null;
			if (arg0.anInt7656 < 32768) {
				@Pc(28) Class2_Sub34 local28 = (Class2_Sub34) Static400.aClass220_41.method5099((long) arg0.anInt7656);
				if (local28 != null) {
					local14 = local28.aClass11_Sub5_Sub2_Sub2_2;
				}
			} else if (arg0.anInt7656 >= 32768) {
				local14 = Static435.aClass11_Sub5_Sub2_Sub1Array1[arg0.anInt7656 - 32768];
			}
			if (local14 != null) {
				local54 = arg0.anInt7626 - local14.anInt7626;
				local61 = arg0.anInt7622 - local14.anInt7622;
				if (local54 != 0 || local61 != 0) {
					arg0.method6227((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(162) Class11_Sub5_Sub2_Sub1 local162 = (Class11_Sub5_Sub2_Sub1) arg0;
			if (local162.anInt2418 != -1 && (local162.anInt7707 == 0 || local162.anInt7708 > 0)) {
				local162.method6227(local162.anInt2418);
				local162.anInt2418 = -1;
			}
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(92) Class11_Sub5_Sub2_Sub2 local92 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local92.anInt7711 != -1 && (local92.anInt7707 == 0 || local92.anInt7708 > 0)) {
				local54 = local92.anInt7626 - (local92.anInt7711 - Static386.anInt7205 - Static386.anInt7205) * 64;
				local61 = local92.anInt7622 - (local92.anInt7719 - Static153.anInt2798 - Static153.anInt2798) * 64;
				if (local54 != 0 || local61 != 0) {
					local92.method6227((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local92.anInt7711 = -1;
			}
		}
		return arg0.method6231();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method3622(@OriginalArg(1) int arg0) {
		Static285.anIntArray428 = new int[arg0];
		Static202.anIntArray290 = new int[arg0];
		Static318.anIntArray479 = new int[arg0];
		Static102.anIntArray109 = new int[arg0];
		Static197.anIntArray283 = new int[arg0];
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V")
	public static void method3623(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg0, 5);
		local12.method2578();
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
	public static void method3624(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg0, 14);
		local12.method2578();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILclient!fv;Lclient!fv;)V")
	public static void method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1 arg3, @OriginalArg(4) Class11_Sub1 arg4) {
		@Pc(4) Class36 local4 = Static61.method976(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub1_2 = arg3;
			local4.aClass11_Sub1_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
	public static void method3626() {
		Static215.method3034();
		Static230.method3117();
	}
}
