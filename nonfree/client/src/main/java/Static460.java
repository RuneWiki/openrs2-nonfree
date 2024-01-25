import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rfa", name = "V", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!rfa", name = "M", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_125 = new Class349(59, 2);

	@OriginalMember(owner = "client!rfa", name = "P", descriptor = "Lclient!nw;")
	public static final Class247 aClass247_4 = new Class247();

	@OriginalMember(owner = "client!rfa", name = "U", descriptor = "I")
	public static int anInt7404 = -1;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
	public static void method5966() {
		if (Static122.anInt2094 == -1) {
			return;
		}
		@Pc(17) int local17 = Static205.aClass131_1.method6544();
		@Pc(21) int local21 = Static205.aClass131_1.method6542();
		@Pc(26) Class2_Sub29 local26 = (Class2_Sub29) Static359.aClass70_17.method1264();
		if (local26 != null) {
			local17 = local26.method6294();
			local21 = local26.method6293();
		}
		Static135.method6627(0, 0, Static122.anInt2094, Static187.anInt8962, local17, 0, 0, local21, Static172.anInt2621);
		if (Static176.aClass273_5 != null) {
			Static172.method2261(local17, local21);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!r;Z)V")
	public static void method5968(@OriginalArg(0) Class162 arg0) {
		@Pc(7) int local7 = Static214.anInt3100;
		@Pc(9) int local9 = Static312.anInt5139;
		@Pc(11) int local11 = Static428.anInt6943;
		@Pc(15) int local15 = Static524.anInt8323 - 3;
		if (Static316.aClass38_27 == null || Static369.aClass38_43 == null) {
			if (Static241.aClass229_54.method4954(Static85.anInt1441) && Static241.aClass229_54.method4954(Static557.anInt9126)) {
				Static316.aClass38_27 = arg0.method6845(Static603.method7117(Static241.aClass229_54, Static85.anInt1441, 0), true);
				@Pc(65) Class344 local65 = Static603.method7117(Static241.aClass229_54, Static557.anInt9126, 0);
				Static369.aClass38_43 = arg0.method6845(local65, true);
				local65.method7122();
				Static25.aClass38_5 = arg0.method6845(local65, true);
			} else {
				arg0.J(local7, local9, local11, 20, Static13.anInt6563 | 255 - Static454.anInt7270 << 24, 1);
			}
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (Static316.aClass38_27 != null && Static369.aClass38_43 != null) {
			local92 = (local11 - Static369.aClass38_43.E() * 2) / Static316.aClass38_27.E();
			for (local94 = 0; local94 < local92; local94++) {
				Static316.aClass38_27.method7463(Static369.aClass38_43.E() + local7 + local94 * Static316.aClass38_27.E(), local9);
			}
			Static369.aClass38_43.method7463(local7, local9);
			Static25.aClass38_5.method7463(local11 + local7 - Static25.aClass38_5.E(), local9);
		}
		Static81.aClass37_16.method7723(local7 + 3, Static229.aClass159_26.method2776(Static261.anInt4297), Static554.anInt9070 | 0xFF000000, local9 + 14, -1);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static13.anInt6563 | -Static454.anInt7270 + 255 << 24, 1);
		local92 = Static205.aClass131_1.method6544();
		local94 = Static205.aClass131_1.method6542();
		@Pc(178) int local178 = 0;
		@Pc(199) int local199;
		for (@Pc(183) Class2_Sub27 local183 = (Class2_Sub27) Static411.aClass70_43.method1264(); local183 != null; local183 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			local199 = local9 + (Static484.anInt7715 + -1 - local178) * 16 + 33;
			if (local92 > local7 && local92 < local11 + local7 && local199 - 13 < local94 && local199 + 4 > local94 && local183.aBoolean322) {
				arg0.J(local7, local199 - 12, local11, 16, 255 - Static592.anInt9610 << 24 | Static2.anInt13, 1);
			}
			local178++;
		}
		if ((Static86.aClass38_8 == null || Static5.aClass38_1 == null || Static349.aClass38_31 == null) && Static241.aClass229_54.method4954(Static89.anInt1595) && Static241.aClass229_54.method4954(Static503.anInt8011) && Static241.aClass229_54.method4954(Static487.anInt7737)) {
			@Pc(271) Class344 local271 = Static603.method7117(Static241.aClass229_54, Static503.anInt8011, 0);
			Static5.aClass38_1 = arg0.method6845(local271, true);
			local271.method7122();
			Static348.aClass38_29 = arg0.method6845(local271, true);
			Static86.aClass38_8 = arg0.method6845(Static603.method7117(Static241.aClass229_54, Static89.anInt1595, 0), true);
			@Pc(296) Class344 local296 = Static603.method7117(Static241.aClass229_54, Static487.anInt7737, 0);
			Static349.aClass38_31 = arg0.method6845(local296, true);
			local296.method7122();
			Static412.aClass38_30 = arg0.method6845(local296, true);
		}
		local178 = 0;
		@Pc(367) int local367;
		@Pc(329) int local329;
		if (Static86.aClass38_8 != null && Static5.aClass38_1 != null && Static349.aClass38_31 != null) {
			local199 = (local11 - Static349.aClass38_31.E() * 2) / Static86.aClass38_8.E();
			for (local329 = 0; local329 < local199; local329++) {
				Static86.aClass38_8.method7463(local7 + Static349.aClass38_31.E() + local329 * Static86.aClass38_8.E(), -Static86.aClass38_8.u() + local9 - -local15);
			}
			local367 = (local15 - Static349.aClass38_31.u() - 20) / Static5.aClass38_1.u();
			for (@Pc(369) int local369 = 0; local369 < local367; local369++) {
				Static5.aClass38_1.method7463(local7, local369 * Static5.aClass38_1.u() + local9 + 20);
				Static348.aClass38_29.method7463(local7 + local11 - Static348.aClass38_29.E(), Static5.aClass38_1.u() * local369 + 20 + local9);
			}
			Static349.aClass38_31.method7463(local7, local15 + local9 - Static349.aClass38_31.u());
			Static412.aClass38_30.method7463(local7 + local11 - Static349.aClass38_31.E(), local9 - (-local15 + Static349.aClass38_31.u()));
		}
		for (@Pc(438) Class2_Sub27 local438 = (Class2_Sub27) Static411.aClass70_43.method1264(); local438 != null; local438 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			local329 = local9 + (Static484.anInt7715 - local178 - 1) * 16 + 13 + 20;
			local367 = Static554.anInt9070 | 0xFF000000;
			if (local92 > local7 && local92 < local7 + local11 && local329 - 13 < local94 && local329 + 4 > local94 && local438.aBoolean322) {
				local367 = Static77.anInt1384 | 0xFF000000;
			}
			@Pc(500) int[] local500 = null;
			if (Static427.method5678(local438.anInt4323)) {
				local500 = Static466.aClass130_2.method2311((int) local438.aLong113).anIntArray282;
			} else if (local438.anInt4325 != -1) {
				local500 = Static466.aClass130_2.method2311(local438.anInt4325).anIntArray282;
			} else if (Static577.method7485(local438.anInt4323)) {
				@Pc(523) Class2_Sub5 local523 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local438.aLong113);
				if (local523 != null) {
					@Pc(528) Class12_Sub2_Sub1_Sub4_Sub2 local528 = local523.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					@Pc(531) Class295 local531 = local528.aClass295_1;
					if (local531.anIntArray493 != null) {
						local531 = local531.method5942(Static426.aClass160_1);
					}
					if (local531 != null) {
						local500 = local531.anIntArray491;
					}
				}
			} else if (Static219.method2681(local438.anInt4323)) {
				@Pc(563) Class216 local563;
				if (local438.anInt4323 == 1007) {
					local563 = Static362.aClass290_2.method5799((int) local438.aLong113);
				} else {
					local563 = Static362.aClass290_2.method5799((int) (local438.aLong113 >>> 32 & 0x7FFFFFFFL));
				}
				if (local563.anIntArray362 != null) {
					local563 = local563.method4560(Static426.aClass160_1);
				}
				if (local563 != null) {
					local500 = local563.anIntArray364;
				}
			}
			@Pc(609) String local609 = Static491.method6283(local438);
			if (local500 != null) {
				local609 = local609 + Static88.method1301(local500);
			}
			Static81.aClass37_16.method7714(local7 + 3, local329, local367, Static309.anIntArray355, local609, Static389.aClass38Array21);
			if (local438.aBoolean321) {
				Static380.aClass38_40.method7463(Static537.aClass112_11.method2078(local609) + local7 + 5, local329 + -12);
			}
			local178++;
		}
		Static390.method5389(Static312.anInt5139, Static524.anInt8323, Static428.anInt6943, Static214.anInt3100);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "()V")
	public static void method5969() {
		for (@Pc(1) int local1 = 0; local1 < Static49.aClass128Array2.length; local1++) {
			Static49.aClass128Array2[local1].method2301();
		}
		Static49.aClass128Array2 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!f;IIILclient!ps;Lclient!ua;BI)V")
	public static void method5970(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class273 arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(7) int arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static489.anInt7763 == 4) {
			local14 = (int) Static313.aFloat157 & 0x3FFF;
		} else {
			local14 = (int) Static313.aFloat157 + Static525.anInt8446 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg4.anInt6883 / 2, arg4.anInt6814 / 2) + 10;
		@Pc(44) int local44 = arg2 * arg2 + arg1 * arg1;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(62) int local62 = Class285.anIntArray476[local14];
		@Pc(66) int local66 = Class285.anIntArray475[local14];
		if (Static489.anInt7763 != 4) {
			local62 = local62 * 256 / (Static434.anInt6973 + 256);
			local66 = local66 * 256 / (Static434.anInt6973 + 256);
		}
		@Pc(98) int local98 = arg2 * local62 + local66 * arg1 >> 14;
		@Pc(109) int local109 = arg2 * local66 - local62 * arg1 >> 14;
		arg0.method7464(arg6 + arg4.anInt6883 / 2 + local98 - arg0.A() / 2, arg3 + (arg4.anInt6814 / 2 - (local109 - -(arg0.ca() / 2))), arg5, arg6, arg3);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZII)I")
	public static int method5971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static138.anIntArray185[arg1 & 0x3] : Static543.anIntArray582[arg1 & 0x3];
	}
}
