import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!ul;")
	public static Class172 aClass172_3 = new Class172(50);

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString16 = "";

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < Static209.aClass100_3.anInt3236; local3++) {
			if (Static209.aClass100_3.method2544(local3)) {
				@Pc(46) int[] local46 = Static115.aClass4_Sub2_Sub18_1.method3540(Static209.aClass100_3.anIntArray266[local3] & 0x3FFF, Static209.aClass100_3.anIntArray266[local3] >> 14 & 0x3FFF, (Static209.aClass100_3.anIntArray266[local3] & 0x35A0830D) >> 28);
				if (local46 != null) {
					@Pc(56) int local56 = local46[1] - Static175.anInt3552;
					@Pc(67) int local67 = Static158.anInt3242 + Static133.anInt2663 - local46[2] - 1;
					@Pc(84) int local84 = arg0 + (arg4 - arg0) * (local56 - arg7) / (arg1 - arg7);
					@Pc(102) int local102 = arg6 + (arg2 - arg6) * (-arg3 + local67) / (arg5 - arg3);
					@Pc(104) int local104 = 16777215;
					@Pc(106) Class177 local106 = null;
					@Pc(111) int local111 = Static209.aClass100_3.method2542(local3);
					if (local111 == 0) {
						if ((double) Static64.aFloat35 == 3.0D) {
							local106 = Static299.aClass177_7;
						}
						if ((double) Static64.aFloat35 == 4.0D) {
							local106 = Static143.aClass177_6;
						}
						if ((double) Static64.aFloat35 == 6.0D) {
							local106 = Static308.aClass177_8;
						}
						if ((double) Static64.aFloat35 >= 8.0D) {
							local106 = Static114.aClass177_4;
						}
					}
					if (local111 == 1) {
						if ((double) Static64.aFloat35 == 3.0D) {
							local106 = Static308.aClass177_8;
						}
						if ((double) Static64.aFloat35 == 4.0D) {
							local106 = Static114.aClass177_4;
						}
						if ((double) Static64.aFloat35 == 6.0D) {
							local106 = Static74.aClass177_1;
						}
						if ((double) Static64.aFloat35 >= 8.0D) {
							local106 = Static101.aClass177_2;
						}
					}
					if (local111 == 2) {
						if ((double) Static64.aFloat35 == 3.0D) {
							local106 = Static74.aClass177_1;
						}
						local104 = 16755200;
						if ((double) Static64.aFloat35 == 4.0D) {
							local106 = Static101.aClass177_2;
						}
						if ((double) Static64.aFloat35 == 6.0D) {
							local106 = Static112.aClass177_3;
						}
						if ((double) Static64.aFloat35 >= 8.0D) {
							local106 = Static132.aClass177_5;
						}
					}
					if (Static209.aClass100_3.anIntArray265[local3] != -1) {
						local104 = Static209.aClass100_3.anIntArray265[local3];
					}
					if (local106 != null) {
						@Pc(243) int local243 = Static131.aClass4_Sub2_Sub9_2.method4099(Static209.aClass100_3.aStringArray22[local3], null, Static102.aStringArray11);
						local102 -= (local243 - 1) * local106.method4509() / 2;
						local102 += local106.method4508() / 2;
						for (@Pc(263) int local263 = 0; local263 < local243; local263++) {
							@Pc(270) String local270 = Static102.aStringArray11[local263];
							if (local243 - 1 > local263) {
								local270 = local270.substring(0, local270.length() - 4);
							}
							local106.method4510(local270, local84, local102, local104);
							local102 += local106.method4509();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Lclient!wb;")
	public static Class4_Sub2_Sub4 method258() {
		@Pc(19) int local19 = Static246.anIntArray386[0] * Static107.anIntArray188[0];
		@Pc(23) byte[] local23 = Static99.aByteArrayArray8[0];
		@Pc(26) int[] local26 = new int[local19];
		for (@Pc(28) int local28 = 0; local28 < local19; local28++) {
			local26[local28] = Static138.anIntArray228[local23[local28] & 0xFF];
		}
		@Pc(69) Class4_Sub2_Sub4 local69;
		if (Static251.aBoolean330) {
			local69 = new Class4_Sub2_Sub4_Sub1(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], local26);
		} else {
			local69 = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], local26);
		}
		Static184.method2969();
		return local69;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
	public static void method259(@OriginalArg(0) int arg0) {
		Static115.anInt2343 = 20;
		Static64.anInt1391 = 3;
		Static236.anInt4701 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!we;ILjava/awt/Frame;)V")
	public static void method261(@OriginalArg(0) Class184 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class119 local6 = arg0.method4617(arg1);
			while (local6.anInt3695 == 0) {
				Static193.method3169(10L);
			}
			if (local6.anInt3695 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static193.method3169(100L);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZLclient!tl;I)V")
	public static void method262(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		@Pc(8) int local8 = arg1.anInt5208;
		@Pc(12) int local12 = (int) arg1.aLong211;
		arg1.method4690();
		if (arg0) {
			Static97.method3590(local8);
		}
		Static299.method4596(local8);
		@Pc(27) Class97 local27 = Static148.method2340(local12);
		if (local27 != null) {
			Static178.method2927(local27);
		}
		@Pc(36) int local36 = Static286.anInt5602;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local36; local43++) {
			if (Static144.method2296(Static256.aShortArray81[local43])) {
				Static167.method2663(local43);
			}
		}
		if (Static286.anInt5602 == 1) {
			Static137.aBoolean176 = false;
			Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
		} else {
			Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
			local43 = Static86.aClass4_Sub2_Sub9_3.method4086(Static187.aString131);
			for (@Pc(78) int local78 = 0; local78 < Static286.anInt5602; local78++) {
				@Pc(87) int local87 = Static86.aClass4_Sub2_Sub9_3.method4086(Static149.method2347(local78));
				if (local87 > local43) {
					local43 = local87;
				}
			}
			Static43.anInt870 = (Static86.aBoolean103 ? 26 : 22) + Static286.anInt5602 * 15;
			Static16.anInt356 = local43 + 8;
		}
		if (Static56.anInt1264 != -1) {
			Static85.method1423(Static56.anInt1264, 1);
		}
	}
}
