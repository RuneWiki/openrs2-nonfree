import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
	public static int anInt3139;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public static int anInt3140;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_103 = new Class217(1, 6);

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_104 = new Class217(28, -2);

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!wk;")
	public static final Class221 aClass221_1 = new Class221();

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!l;")
	public static Class117 aClass117_1 = new Class117();

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "[S")
	public static short[] aShortArray64 = new short[256];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;ILclient!gt;)Lclient!lf;")
	public static Class121 method2881(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (arg1 == 0) {
			return arg2.method2351(arg0);
		}
		@Pc(43) Class121 local43;
		if (arg1 == 1) {
			try {
				Static381.method4931("openjs", arg2.anApplet1, new Object[] { (new URL(arg2.anApplet1.getCodeBase(), arg0)).toString() });
				local43 = new Class121();
				local43.anInt3693 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class121();
				local43.anInt3693 = 2;
				return local43;
			}
		} else if (arg1 == 2) {
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_blank");
				local43 = new Class121();
				local43.anInt3693 = 1;
				return local43;
			} catch (@Pc(85) Exception local85) {
				local43 = new Class121();
				local43.anInt3693 = 2;
				return local43;
			}
		} else if (arg1 == 3) {
			try {
				Static381.method4930(arg2.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg2.anApplet1.getAppletContext().showDocument(new URL(arg2.anApplet1.getCodeBase(), arg0), "_top");
				local43 = new Class121();
				local43.anInt3693 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class121();
				local43.anInt3693 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	public static void method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub5_2 != null) {
			local7.aClass11_Sub5_2 = null;
		}
		if (local7.aClass11_Sub5_1 != null) {
			local7.aClass11_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2883() {
		Static184.anInt3735 = 1;
		Static355.anInt6720 = 0;
		Static69.anInt1602 = -1;
		Static171.anInt3577 = -3;
		Static301.aBoolean434 = false;
		Static219.anInt4422 = 0;
		Static113.anInt2527 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method2884() {
		Static44.method1064(25);
		Static311.method5136();
		System.gc();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!fp;ILclient!kg;II)V")
	public static void method2885(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class92 local10 = arg2.method3110(arg0);
		if (local10 == null) {
			return;
		}
		arg0.method4566(arg3, arg1, arg3 + arg2.anInt3381, arg1 + arg2.anInt3444);
		if (Static294.anInt5663 == 2 || Static294.anInt5663 == 5 || Static331.aClass4_22 == null) {
			arg0.method4594(local10, arg3, arg1);
			return;
		}
		@Pc(63) int local63;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(60) int local60;
		if (Static50.anInt1273 == 4) {
			local63 = Static78.anInt1750;
			local53 = (int) -Static357.aFloat76 & 0x3FFF;
			local66 = Static138.anInt2972;
			local60 = 4096;
		} else {
			local53 = Static163.anInt3359 + (int) -Static357.aFloat76 & 0x3FFF;
			local60 = 4096 - Static293.anInt4951 * 16;
			local63 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729;
			local66 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726;
		}
		@Pc(93) int local93 = local63 / 32 + 48 - (Static311.anInt5653 - 104) * 2;
		@Pc(111) int local111 = Static189.anInt3820 * 4 + 48 + 208 - local66 / 32 - Static189.anInt3820 * 2;
		Static331.aClass4_22.method5958((float) arg2.anInt3381 / 2.0F + (float) arg3, (float) arg1 + (float) arg2.anInt3444 / 2.0F, (float) local93, (float) local111, local60, local53 << 2, local10, arg3, arg1);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class1_Sub9 local145 = (Class1_Sub9) Static337.aClass42_44.method1543(); local145 != null; local145 = (Class1_Sub9) Static337.aClass42_44.method1551()) {
			@Pc(150) int local150 = local145.anInt571;
			local162 = (Static134.aClass86_1.anIntArray210[local150] >> 14 & 0x3FFF) - Static50.anInt1271;
			local172 = (Static134.aClass86_1.anIntArray210[local150] & 0x3FFF) - Static299.anInt4036;
			local183 = local162 * 4 + 2 - local63 / 32;
			local194 = local172 * 4 + 2 - local66 / 32;
			Static44.method1082(local183, Static134.aClass86_1.anIntArray211[local150], arg1, local194, arg2, arg3, arg0, local10);
		}
		for (local162 = 0; local162 < Static235.anInt4750; local162++) {
			local172 = Static228.anIntArray378[local162] * 4 + 2 - local63 / 32;
			local183 = Static14.anIntArray385[local162] * 4 + 2 - local66 / 32;
			@Pc(252) Class71 local252 = Static219.method4081(Static192.anIntArray291[local162]);
			if (local252.anIntArray178 != null) {
				local252 = local252.method2282();
				if (local252 == null || local252.anInt2369 == -1) {
					continue;
				}
			}
			Static44.method1082(local172, local252.anInt2369, arg1, local183, arg2, arg3, arg0, local10);
		}
		for (@Pc(288) Class1_Sub3 local288 = (Class1_Sub3) Static46.aClass38_4.method1474(); local288 != null; local288 = (Class1_Sub3) Static46.aClass38_4.method1470()) {
			local183 = (int) (local288.aLong217 >> 28 & 0x3L);
			if (local183 == Static236.anInt4782) {
				local194 = (int) (local288.aLong217 & 0x3FFFL) * 4 + 2 - local63 / 32;
				@Pc(333) int local333 = (int) (local288.aLong217 >> 14 & 0x3FFFL) * 4 + 2 - local66 / 32;
				Static83.method1772(local194, arg2, Static333.aClass4Array20[0], local333, local10, arg3, arg1);
			}
		}
		@Pc(406) int local406;
		for (local183 = 0; local183 < Static277.anInt5394; local183++) {
			@Pc(363) Class11_Sub2_Sub6_Sub2 local363 = Static231.aClass11_Sub2_Sub6_Sub2Array1[Static81.anIntArray143[local183]];
			if (local363 != null && local363.method5901() && local363.aByte79 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
				@Pc(379) Class208 local379 = local363.aClass208_1;
				if (local379 != null && local379.anIntArray480 != null) {
					local379 = local379.method5539();
				}
				if (local379 != null && local379.aBoolean459 && local379.aBoolean458) {
					local406 = local363.anInt6729 / 32 - local63 / 32;
					@Pc(416) int local416 = local363.anInt6726 / 32 - local66 / 32;
					if (local379.anInt6187 == -1) {
						Static83.method1772(local406, arg2, Static333.aClass4Array20[1], local416, local10, arg3, arg1);
					} else {
						Static44.method1082(local406, local379.anInt6187, arg1, local416, arg2, arg3, arg0, local10);
					}
				}
			}
		}
		local194 = Static99.anInt2276;
		@Pc(461) int[] local461 = Static238.anIntArray382;
		@Pc(499) int local499;
		@Pc(509) int local509;
		@Pc(513) int local513;
		for (local406 = 0; local406 < local194; local406++) {
			@Pc(471) Class11_Sub2_Sub6_Sub1 local471 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local461[local406]];
			if (local471 != null && local471.method5858() && local471 != Static191.aClass11_Sub2_Sub6_Sub1_4 && local471.aByte79 == Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79) {
				local499 = local471.anInt6729 / 32 - local63 / 32;
				local509 = local471.anInt6726 / 32 - local66 / 32;
				@Pc(511) boolean local511 = false;
				for (local513 = 0; local513 < Static195.anInt3948; local513++) {
					if (local471.aString63.equals(Static247.aStringArray29[local513]) && Static28.anIntArray47[local513] != 0) {
						local511 = true;
						break;
					}
				}
				@Pc(539) boolean local539 = false;
				for (@Pc(541) int local541 = 0; local541 < Static135.anInt2903; local541++) {
					if (local471.aString63.equals(Static365.aClass126Array1[local541].aString36)) {
						local539 = true;
						break;
					}
				}
				@Pc(561) boolean local561 = false;
				if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6707 != 0 && local471.anInt6707 != 0 && local471.anInt6707 == Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6707) {
					local561 = true;
				}
				if (local511) {
					Static83.method1772(local499, arg2, Static333.aClass4Array20[3], local509, local10, arg3, arg1);
				} else if (local539) {
					Static83.method1772(local499, arg2, Static333.aClass4Array20[5], local509, local10, arg3, arg1);
				} else if (local561) {
					Static83.method1772(local499, arg2, Static333.aClass4Array20[4], local509, local10, arg3, arg1);
				} else {
					Static83.method1772(local499, arg2, Static333.aClass4Array20[2], local509, local10, arg3, arg1);
				}
			}
		}
		@Pc(641) Class101[] local641 = Static60.aClass101Array1;
		@Pc(734) int local734;
		for (local499 = 0; local499 < local641.length; local499++) {
			@Pc(649) Class101 local649 = local641[local499];
			if (local649 != null && local649.anInt3096 != 0 && Static51.anInt1301 % 20 < 10) {
				@Pc(704) int local704;
				if (local649.anInt3096 == 1 && local649.anInt3103 >= 0 && local649.anInt3103 < Static231.aClass11_Sub2_Sub6_Sub2Array1.length) {
					@Pc(682) Class11_Sub2_Sub6_Sub2 local682 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local649.anInt3103];
					if (local682 != null) {
						local513 = local682.anInt6729 / 32 - local63 / 32;
						local704 = local682.anInt6726 / 32 - local66 / 32;
						Static254.method4768(arg3, local704, local513, 360000, arg2, arg1, local649.anInt3104, local10);
					}
				}
				if (local649.anInt3096 == 2) {
					local734 = (local649.anInt3098 - Static50.anInt1271) * 4 + 2 - local63 / 32;
					local513 = (local649.anInt3094 - Static299.anInt4036) * 4 + 2 - local66 / 32;
					local704 = local649.anInt3107 * 4;
					local704 *= local704;
					Static254.method4768(arg3, local513, local734, local704, arg2, arg1, local649.anInt3104, local10);
				}
				if (local649.anInt3096 == 10 && local649.anInt3103 >= 0 && local649.anInt3103 < Static275.aClass11_Sub2_Sub6_Sub1Array1.length) {
					@Pc(792) Class11_Sub2_Sub6_Sub1 local792 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local649.anInt3103];
					if (local792 != null) {
						local513 = local792.anInt6729 / 32 - local63 / 32;
						local704 = local792.anInt6726 / 32 - local66 / 32;
						Static254.method4768(arg3, local704, local513, 360000, arg2, arg1, local649.anInt3104, local10);
					}
				}
			}
		}
		if (Static50.anInt1273 == 4) {
			return;
		}
		if (Static237.anInt2678 != 0) {
			local509 = Static237.anInt2678 * 4 + (Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() + -1) * 2 + 2 - local63 / 32;
			local734 = Static97.anInt2177 * 4 + (Static191.aClass11_Sub2_Sub6_Sub1_4.method5894() - 1) * 2 + 2 - local66 / 32;
			Static83.method1772(local509, arg2, Static150.aClass4Array19[Static361.aBoolean508 ? 1 : 0], local734, local10, arg3, arg1);
		}
		arg0.method4639(arg1 + arg2.anInt3444 / 2 - 1, arg2.anInt3381 / 2 + -1 + arg3, 3, -1, 3);
		return;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ct;Lclient!ct;Lclient!rs;B)V")
	public static void method2886(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) Interface8 arg2) {
		Static197.aClass30_58 = arg0;
		Static152.aClass30_45 = arg1;
		Static285.anInterface8_2 = arg2;
		if (Static152.aClass30_45 != null) {
			Static270.anInt5274 = Static152.aClass30_45.method1180(1);
		}
		if (Static197.aClass30_58 != null) {
			Static174.anInt3641 = Static197.aClass30_58.method1180(1);
		}
	}
}
