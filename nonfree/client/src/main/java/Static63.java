import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
	public static int anInt1754;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_32 = new Class256("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
	public static int anInt1753 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
	public static void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static169.aFloat99 < Static169.aFloat100) {
			Static169.aFloat99 = (float) ((double) Static169.aFloat99 + (double) Static169.aFloat99 / 30.0D);
			if (Static169.aFloat99 > Static169.aFloat100) {
				Static169.aFloat99 = Static169.aFloat100;
			}
			Static39.method728();
			Static169.anInt3157 = (int) Static169.aFloat99 >> 1;
			Static169.aByteArrayArrayArray14 = Static242.method3659(Static169.anInt3157);
		} else if (Static169.aFloat99 > Static169.aFloat100) {
			Static169.aFloat99 = (float) ((double) Static169.aFloat99 - (double) Static169.aFloat99 / 30.0D);
			if (Static169.aFloat99 < Static169.aFloat100) {
				Static169.aFloat99 = Static169.aFloat100;
			}
			Static39.method728();
			Static169.anInt3157 = (int) Static169.aFloat99 >> 1;
			Static169.aByteArrayArrayArray14 = Static242.method3659(Static169.anInt3157);
		}
		if (Static452.anInt7845 != -1 && Static168.anInt3256 != -1) {
			@Pc(79) int local79 = Static452.anInt7845 - Static67.anInt1777;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(94) int local94 = Static168.anInt3256 - Static393.anInt6878;
			if (local94 < 2 || local94 > 2) {
				local94 /= 8;
			}
			Static67.anInt1777 += local79;
			Static393.anInt6878 -= -local94;
			if (local79 == 0 && local94 == 0) {
				Static452.anInt7845 = -1;
				Static168.anInt3256 = -1;
			}
			Static39.method728();
		}
		if (Static176.anInt3420 <= 0) {
			Static167.anInt3227 = -1;
			Static401.anInt6978 = -1;
		} else {
			Static303.anInt5385--;
			if (Static303.anInt5385 == 0) {
				Static176.anInt3420--;
				Static303.anInt5385 = 100;
			}
		}
		if (!Static434.aBoolean644 || Static128.aClass265_20 == null) {
			return;
		}
		for (@Pc(163) Class2_Sub43 local163 = (Class2_Sub43) Static128.aClass265_20.method6005(); local163 != null; local163 = (Class2_Sub43) Static128.aClass265_20.method6001()) {
			@Pc(172) Class83 local172 = Static169.aClass173_3.method4022(local163.aClass2_Sub38_1.anInt6772);
			if (local163.method5776(arg0, arg1)) {
				if (local172.aStringArray12 != null) {
					if (local172.aStringArray12[4] != null) {
						Static333.method4738(-1, local172.aString19, true, 0, 1006, local172.aStringArray12[4], -1, (long) local163.aClass2_Sub38_1.anInt6772, local172.anInt2313, false);
					}
					if (local172.aStringArray12[3] != null) {
						Static333.method4738(-1, local172.aString19, true, 0, 1001, local172.aStringArray12[3], -1, (long) local163.aClass2_Sub38_1.anInt6772, local172.anInt2313, false);
					}
					if (local172.aStringArray12[2] != null) {
						Static333.method4738(-1, local172.aString19, true, 0, 1008, local172.aStringArray12[2], -1, (long) local163.aClass2_Sub38_1.anInt6772, local172.anInt2313, false);
					}
					if (local172.aStringArray12[1] != null) {
						Static333.method4738(-1, local172.aString19, true, 0, 1002, local172.aStringArray12[1], -1, (long) local163.aClass2_Sub38_1.anInt6772, local172.anInt2313, false);
					}
					if (local172.aStringArray12[0] != null) {
						Static333.method4738(-1, local172.aString19, true, 0, 1011, local172.aStringArray12[0], -1, (long) local163.aClass2_Sub38_1.anInt6772, local172.anInt2313, false);
					}
				}
				if (!local163.aClass2_Sub38_1.aBoolean577) {
					local163.aClass2_Sub38_1.aBoolean577 = true;
					Static290.method4226(Static322.aClass222_7, local163.aClass2_Sub38_1.anInt6772, local172.anInt2313);
				}
				if (local163.aClass2_Sub38_1.aBoolean577) {
					Static290.method4226(Static198.aClass222_5, local163.aClass2_Sub38_1.anInt6772, local172.anInt2313);
				}
			} else if (local163.aClass2_Sub38_1.aBoolean577) {
				local163.aClass2_Sub38_1.aBoolean577 = false;
				Static290.method4226(Static446.aClass222_11, local163.aClass2_Sub38_1.anInt6772, local172.anInt2313);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method1252(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(34) int local34 = (arg1 ? Static446.aClass228_2.anInt6699 : Static446.aClass228_2.anInt6698) + local24;
		for (@Pc(36) int local36 = local24; local36 < local34; local36++) {
			@Pc(43) Class2_Sub2_Sub14 local43 = Static446.aClass228_2.method5261(local36);
			if (local43.aBoolean538 && local43.method4847().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static435.aShortArray105 = null;
					Static26.anInt564 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(78) short[] local78 = new short[local11.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local13; local80++) {
						local78[local80] = local11[local80];
					}
					local11 = local78;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static24.anInt521 = 0;
		Static26.anInt564 = local13;
		Static435.aShortArray105 = local11;
		@Pc(113) String[] local113 = new String[Static26.anInt564];
		for (@Pc(115) int local115 = 0; local115 < Static26.anInt564; local115++) {
			local113[local115] = Static446.aClass228_2.method5261(local11[local115]).method4847();
		}
		Static225.method3480(Static435.aShortArray105, local113);
	}
}
