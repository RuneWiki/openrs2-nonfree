import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static int anInt2106;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	public static int anInt2101 = -1;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public static int anInt2104 = 0;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method1705() {
		Static85.aClass129_2.method4937(((float) Static37.anInt693 * 0.1F + 0.7F) * Static7.aFloat1);
		Static85.aClass129_2.method4925(Static262.anInt5357, Static148.aFloat20, Static86.aFloat12, (float) Static77.anInt6707, (float) Static265.anInt5430, (float) Static309.anInt6128);
		Static85.aClass129_2.method4973(Static294.aClass132_2);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method1707() {
		for (@Pc(3) int local3 = 0; local3 < Static306.anInt6038; local3++) {
			@Pc(9) int local9 = Static291.anIntArray446[local3]--;
			if (Static291.anIntArray446[local3] >= -10) {
				@Pc(84) Class102 local84 = Static53.aClass102Array1[local3];
				if (local84 == null) {
					local84 = Static365.method1992(Static177.aClass144_45, Static253.anIntArray393[local3], 0);
					if (local84 == null) {
						continue;
					}
					Static291.anIntArray446[local3] += local84.method1993();
					Static53.aClass102Array1[local3] = local84;
				}
				if (Static291.anIntArray446[local3] < 0) {
					@Pc(130) int local130;
					if (Static64.anIntArray76[local3] == 0) {
						local130 = Static289.anInt5719 * Static75.anIntArray93[local3] >> 8;
					} else {
						@Pc(140) int local140 = (Static64.anIntArray76[local3] & 0xFF) * 128;
						@Pc(148) int local148 = Static64.anIntArray76[local3] >> 16 & 0xFF;
						@Pc(158) int local158 = local148 * 128 + 64 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308;
						if (local158 < 0) {
							local158 = -local158;
						}
						@Pc(171) int local171 = Static64.anIntArray76[local3] >> 8 & 0xFF;
						@Pc(181) int local181 = local171 * 128 + 64 - Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310;
						if (local181 < 0) {
							local181 = -local181;
						}
						@Pc(192) int local192 = local181 + local158 - 128;
						if (local140 < local192) {
							Static291.anIntArray446[local3] = -100;
							continue;
						}
						if (local192 < 0) {
							local192 = 0;
						}
						local130 = Static75.anIntArray93[local3] * (local140 - local192) * Static326.anInt5865 / local140 >> 8;
					}
					if (local130 > 0) {
						@Pc(227) Class11_Sub15_Sub1 local227 = local84.method1995().method5478(Static107.aClass103_1);
						@Pc(232) Class11_Sub10_Sub1 local232 = Static361.method773(local227, local130);
						local232.method797(Static270.anIntArray416[local3] - 1);
						Static341.aClass11_Sub10_Sub3_2.method3741(local232);
					}
					Static291.anIntArray446[local3] = -100;
				}
			} else {
				Static306.anInt6038--;
				for (@Pc(23) int local23 = local3; local23 < Static306.anInt6038; local23++) {
					Static253.anIntArray393[local23] = Static253.anIntArray393[local23 + 1];
					Static53.aClass102Array1[local23] = Static53.aClass102Array1[local23 + 1];
					Static270.anIntArray416[local23] = Static270.anIntArray416[local23 + 1];
					Static291.anIntArray446[local23] = Static291.anIntArray446[local23 + 1];
					Static64.anIntArray76[local23] = Static64.anIntArray76[local23 + 1];
					Static75.anIntArray93[local23] = Static75.anIntArray93[local23 + 1];
				}
				local3--;
			}
		}
		if (Static120.aBoolean103 && !Static74.method1141()) {
			if (Static249.anInt4975 != 0 && Static43.anInt850 != -1) {
				Static7.method65(Static249.anInt4975, Static135.aClass144_38, Static43.anInt850);
			}
			Static120.aBoolean103 = false;
		} else if (Static249.anInt4975 != 0 && Static43.anInt850 != -1 && !Static74.method1141()) {
			Static313.aClass11_Sub25_Sub1_5.method2454(89);
			Static313.aClass11_Sub25_Sub1_5.method5168(Static43.anInt850);
			Static43.anInt850 = -1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lclient!vq;")
	public static Class208 method1708(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static34.aClass26_4;
		@Pc(14) Class208 local14;
		synchronized (Static34.aClass26_4) {
			local14 = (Class208) Static34.aClass26_4.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static7.aClass144_3.method3896(Static141.method2177(arg0), Static246.method4313(arg0));
		local14 = new Class208();
		if (local39 != null) {
			local14.method5565(new Class11_Sub25(local39));
		}
		@Pc(54) Class26 local54 = Static34.aClass26_4;
		synchronized (Static34.aClass26_4) {
			Static34.aClass26_4.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!vd;ZZI)V")
	public static void method1709(@OriginalArg(0) Class11_Sub41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt6364;
		@Pc(12) int local12 = (int) arg0.aLong215;
		arg0.method5701();
		if (arg1) {
			Static297.method4915(local8);
		}
		Static152.method4676(local8);
		@Pc(27) Class137 local27 = Static166.method2688(local12);
		if (local27 != null) {
			Static69.method1039(local27);
		}
		Static259.method4517();
		if (!arg2 && Static270.anInt5491 != -1) {
			Static313.method5275(1, Static270.anInt5491);
		}
		@Pc(59) Class187 local59 = new Class187(Static197.aClass58_18);
		for (@Pc(64) Class11_Sub41 local64 = (Class11_Sub41) local59.method5111(); local64 != null; local64 = (Class11_Sub41) local59.method5109()) {
			if (!local64.method5704()) {
				local64 = (Class11_Sub41) local59.method5111();
				if (local64 == null) {
					return;
				}
			}
			if (local64.anInt6363 == 3) {
				@Pc(86) int local86 = (int) local64.aLong215;
				if (local86 >>> 16 == local8) {
					method1709(local64, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method1710(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static88.method1287(local18) : local18;
		} else if (arg1 instanceof Class162) {
			@Pc(32) Class162 local32 = (Class162) arg1;
			return local32.method4440();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
