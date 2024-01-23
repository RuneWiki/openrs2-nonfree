import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!pk;")
	public static Class132 aClass132_43;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt2477 = 2301979;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lclient!fm;")
	public static Class57[] aClass57Array1 = new Class57[29];

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!wn;")
	public static Class182 aClass182_11 = new Class182();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!tk;B)I")
	public static int method1972(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1) {
		if (!Static42.method668(arg1).method3352(arg0) && arg1.anObjectArray23 == null) {
			return -1;
		} else if (arg1.anIntArray395 == null || arg0 >= arg1.anIntArray395.length) {
			return -1;
		} else {
			return arg1.anIntArray395[arg0];
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!aj;ZIIIIIIIIZB)V")
	public static void method1974(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(34) int local34;
		if (arg5 < 0 || arg5 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local34 = arg0.method2334();
				if (local34 == 0) {
					break;
				}
				if (local34 == 1) {
					arg0.method2334();
					break;
				}
				if (local34 <= 49) {
					arg0.method2334();
				}
			}
			return;
		}
		if (!arg10 && !arg1) {
			Static170.aByteArrayArrayArray9[arg4][arg5][arg3] = 0;
		}
		while (true) {
			local34 = arg0.method2334();
			if (local34 == 0) {
				if (arg10) {
					Static195.anIntArrayArrayArray7[0][arg5 + arg9][arg3 + arg6] = Static87.anIntArrayArrayArray5[0][arg5 + arg9][arg3 + arg6];
				} else if (arg4 == 0) {
					Static195.anIntArrayArrayArray7[0][arg9 + arg5][arg6 + arg3] = -Static97.method1545(arg2 + 556238, 932731 - -arg8) * 8;
				} else {
					Static195.anIntArrayArrayArray7[arg4][arg9 + arg5][arg6 + arg3] = Static195.anIntArrayArrayArray7[arg4 - 1][arg5 + arg9][arg6 + arg3] - 240;
				}
				break;
			}
			if (local34 == 1) {
				@Pc(129) int local129 = arg0.method2334();
				if (arg10) {
					Static195.anIntArrayArrayArray7[0][arg9 + arg5][arg3 + arg6] = local129 * 8 + Static87.anIntArrayArrayArray5[0][arg9 + arg5][arg6 + arg3];
				} else {
					if (local129 == 1) {
						local129 = 0;
					}
					if (arg4 == 0) {
						Static195.anIntArrayArrayArray7[0][arg9 + arg5][arg3 + arg6] = -local129 * 8;
					} else {
						Static195.anIntArrayArrayArray7[arg4][arg5 + arg9][arg3 + arg6] = Static195.anIntArrayArrayArray7[arg4 - 1][arg9 + arg5][arg3 + arg6] - local129 * 8;
					}
				}
				break;
			}
			if (local34 > 49) {
				if (local34 <= 81) {
					if (!arg10 && !arg1) {
						Static170.aByteArrayArrayArray9[arg4][arg5][arg3] = (byte) (local34 - 49);
					}
				} else if (!arg1) {
					Static75.aByteArrayArrayArray4[arg4][arg5][arg3] = (byte) (local34 - 81);
				}
			} else if (arg1) {
				arg0.method2334();
			} else {
				Static147.aByteArrayArrayArray8[arg4][arg5][arg3] = arg0.method2374();
				Static254.aByteArrayArrayArray15[arg4][arg5][arg3] = (byte) ((local34 - 2) / 4);
				Static132.aByteArrayArrayArray6[arg4][arg5][arg3] = (byte) (arg7 + local34 - 2 & 0x3);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fd;")
	public static RuntimeException_Sub1 method1975(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString60 = local9.aString60 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIZIIII)V")
	public static void method1976(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static116.method1900();
		}
		if (Static58.aFrame2 != null && (arg3 != 3 || Static229.anInt4665 != arg1 || arg5 != Static172.anInt3425)) {
			Static178.method2735(Static199.aClass17_3, Static58.aFrame2);
			Static58.aFrame2 = null;
		}
		if (arg3 == 3 && Static58.aFrame2 == null) {
			Static58.aFrame2 = Static39.method610(Static199.aClass17_3, 0, arg1, arg5);
			if (Static58.aFrame2 != null) {
				Static172.anInt3425 = arg5;
				Static229.anInt4665 = arg1;
				Static269.method3754(Static199.aClass17_3);
			}
		}
		if (arg3 == 3 && Static58.aFrame2 == null) {
			method1976(true, -1, true, Static99.anInt2072, arg4, -1);
			return;
		}
		@Pc(83) Container local83;
		if (Static58.aFrame2 != null) {
			local83 = Static58.aFrame2;
		} else if (Static209.aFrame3 == null) {
			local83 = Static199.aClass17_3.anApplet1;
		} else {
			local83 = Static209.aFrame3;
		}
		Static11.anInt2953 = local83.getSize().width;
		Static151.anInt4076 = local83.getSize().height;
		@Pc(107) Insets local107;
		if (Static209.aFrame3 == local83) {
			local107 = Static209.aFrame3.getInsets();
			Static151.anInt4076 -= local107.top + local107.bottom;
			Static11.anInt2953 -= local107.right + local107.left;
		}
		if (arg3 < 2) {
			Static250.anInt4959 = 765;
			Static167.anInt3366 = (Static11.anInt2953 - 765) / 2;
			Static41.anInt884 = 0;
			Static13.anInt356 = 503;
		} else {
			Static167.anInt3366 = 0;
			Static13.anInt356 = Static151.anInt4076;
			Static41.anInt884 = 0;
			Static250.anInt4959 = Static11.anInt2953;
		}
		if (arg0) {
			Static236.method3590(Static39.aCanvas1);
			Static171.method2675(Static39.aCanvas1);
			if (Static21.aClass41_1 != null) {
				Static21.aClass41_1.method1730(Static39.aCanvas1);
			}
			Static249.aClient1.method652();
			Static225.method3500(Static39.aCanvas1);
			Static178.method2737(Static39.aCanvas1);
			if (Static21.aClass41_1 != null) {
				Static21.aClass41_1.method1729(Static39.aCanvas1);
			}
		} else {
			if (Static116.aBoolean188) {
				Static116.method1898(Static250.anInt4959, Static13.anInt356);
			}
			Static39.aCanvas1.setSize(Static250.anInt4959, Static13.anInt356);
			if (Static209.aFrame3 == local83) {
				local107 = Static209.aFrame3.getInsets();
				Static39.aCanvas1.setLocation(Static167.anInt3366 + local107.left, local107.top + Static41.anInt884);
			} else {
				Static39.aCanvas1.setLocation(Static167.anInt3366, Static41.anInt884);
			}
		}
		if (arg3 == 0 && arg4 > 0) {
			Static116.method1890(Static39.aCanvas1);
		}
		if (arg2 && arg3 > 0) {
			Static39.aCanvas1.setIgnoreRepaint(true);
			if (!Static207.aBoolean350) {
				Static242.method3646();
				Static99.aClass4_1 = null;
				Static99.aClass4_1 = Static275.method4088(Static39.aCanvas1, Static13.anInt356, Static250.anInt4959);
				Static103.method1670();
				if (Static23.anInt618 == 5) {
					Static214.method3354(true, Static229.aClass8_Sub1_Sub5_3);
				} else {
					Static261.method3923(Static58.aString83, false);
				}
				try {
					@Pc(273) Graphics local273 = Static39.aCanvas1.getGraphics();
					Static99.aClass4_1.method3763(local273);
				} catch (@Pc(281) Exception local281) {
				}
				Static253.method3796();
				if (arg4 == 0) {
					Static99.aClass4_1 = Static275.method4088(Static39.aCanvas1, 503, 765);
				} else {
					Static99.aClass4_1 = null;
				}
				@Pc(306) Class163 local306 = Static199.aClass17_3.method460(Static249.aClient1.getClass());
				while (local306.anInt5259 == 0) {
					Static162.method2645(100L);
				}
				if (local306.anInt5259 == 1) {
					Static207.aBoolean350 = true;
				}
			}
			if (Static207.aBoolean350) {
				Static116.method1878(Static39.aCanvas1, Static215.anInt4429 * 2);
			}
		}
		if (!Static116.aBoolean188 && arg3 > 0) {
			method1976(true, -1, true, 0, arg4, -1);
			return;
		}
		if (arg3 > 0 && arg4 == 0) {
			Static289.aThread3.setPriority(5);
			Static99.aClass4_1 = null;
			Static262.method3971();
			((Class49_Sub1) Static96.anInterface4_1).method1278(200);
			if (Static76.aBoolean117) {
				Static96.method1525(0.7F);
			}
			if (Static169.aClass24ArrayArray1 == null) {
				Static169.aClass24ArrayArray1 = new Class24[13][13];
			}
			Static186.method2916();
			Static6.method43();
			Static124.method1983();
		} else if (arg3 == 0 && arg4 > 0) {
			Static289.aThread3.setPriority(1);
			Static99.aClass4_1 = Static275.method4088(Static39.aCanvas1, 503, 765);
			Static262.method3974();
			Static223.method3487();
			((Class49_Sub1) Static96.anInterface4_1).method1278(20);
			if (Static76.aBoolean117) {
				if (Static54.anInt1180 == 1) {
					Static96.method1525(0.9F);
				}
				if (Static54.anInt1180 == 2) {
					Static96.method1525(0.8F);
				}
				if (Static54.anInt1180 == 3) {
					Static96.method1525(0.7F);
				}
				if (Static54.anInt1180 == 4) {
					Static96.method1525(0.6F);
				}
			}
			Static252.method3782();
			Static124.method1983();
		}
		Static53.aBoolean85 = !Static158.method2553();
		if (arg2) {
			Static21.method394();
		}
		if (arg3 >= 2) {
			Static76.aBoolean116 = true;
		} else {
			Static76.aBoolean116 = false;
		}
		if (Static248.anInt4917 != -1) {
			Static269.method3756(true);
		}
		if (Static95.aClass92_4 != null && (Static23.anInt618 == 30 || Static23.anInt618 == 25)) {
			Static256.method3845();
		}
		for (@Pc(492) int local492 = 0; local492 < 100; local492++) {
			Static128.aBooleanArray7[local492] = true;
		}
		Static272.aBoolean453 = true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IC)B")
	public static byte method1977(@OriginalArg(1) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1978() {
		Static202.method3135();
		Static183.method2795();
		Static102.method1660();
		Static231.method3535();
		Static158.method2549();
		Static299.method4327();
		Static121.method1946();
		Static141.method2240();
		Static145.method2286();
		Static282.method659();
		Static38.method607();
		Static145.method2289();
		Static229.method3522();
		Static106.method1708();
		Static24.method428();
		Static102.method1661();
		Static164.method2608();
		Static164.method2604();
		if (Static66.anInt4469 != 0) {
			for (@Pc(48) int local48 = 0; local48 < Static74.aByteArrayArray6.length; local48++) {
				Static74.aByteArrayArray6[local48] = null;
			}
			Static83.anInt1804 = 0;
		}
		Static35.method560();
		Static220.method3433();
		Static107.aClass61_16.method1378();
		if (!Static116.aBoolean188) {
			((Class49_Sub1) Static96.anInterface4_1).method1275();
		}
		Static22.aClass125_8.method2950();
		Static230.aClass132_78.method3188();
		Static97.aClass132_38.method3188();
		Static81.aClass132_33.method3188();
		Static207.aClass132_72.method3188();
		Static157.aClass132_92.method3188();
		Static88.aClass132_35.method3188();
		Static28.aClass132_9.method3188();
		Static145.aClass132_55.method3188();
		Static210.aClass132_75.method3188();
		Static246.aClass132_84.method3188();
		Static206.aClass132_71.method3188();
		Static66.aClass61_39.method1378();
	}
}
