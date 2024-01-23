import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt3156;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString112 = "red:";

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString113 = "Loading - please wait.";

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean227 = true;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt3153 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(SLjava/lang/String;IILjava/lang/String;JII)V")
	public static void method2784(@OriginalArg(0) short arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) long arg5, @OriginalArg(7) int arg6) {
		if (Static118.aBoolean169 || Static152.anInt2876 >= 500) {
			return;
		}
		Static73.aStringArray13[Static152.anInt2876] = arg4;
		Static103.aStringArray19[Static152.anInt2876] = arg1;
		Static153.anIntArray332[Static152.anInt2876] = arg3 == -1 ? Static144.anInt4821 : arg3;
		Static259.aShortArray87[Static152.anInt2876] = arg0;
		Static259.aLongArray12[Static152.anInt2876] = arg5;
		Static56.anIntArray99[Static152.anInt2876] = arg6;
		Static196.anIntArray438[Static152.anInt2876] = arg2;
		Static152.anInt2876++;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method2785(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
	public static int method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 <= arg0 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method2787() {
		for (@Pc(7) int local7 = 0; local7 < Static11.anInt5178; local7++) {
			@Pc(23) int local23 = Static178.anIntArray405[local7];
			@Pc(27) Class10_Sub5_Sub2 local27 = Static110.aClass10_Sub5_Sub2Array1[local23];
			@Pc(31) int local31 = Static249.aClass3_Sub26_Sub1_3.method3915();
			if ((local31 & 0x8) != 0) {
				local31 += Static249.aClass3_Sub26_Sub1_3.method3915() << 8;
			}
			if ((local31 & 0x1) != 0) {
				local27.anInt5076 = Static249.aClass3_Sub26_Sub1_3.method3908();
				if (local27.anInt5076 == 65535) {
					local27.anInt5076 = -1;
				}
			}
			if ((local31 & 0x40) != 0) {
				local27.aString176 = Static249.aClass3_Sub26_Sub1_3.method3931();
				local27.anInt5093 = 100;
			}
			@Pc(87) int local87;
			@Pc(91) int local91;
			if ((local31 & 0x2) != 0) {
				local87 = Static249.aClass3_Sub26_Sub1_3.method3939();
				local91 = Static249.aClass3_Sub26_Sub1_3.method3921();
				local27.method4185(local91, Static124.anInt2371, local87);
			}
			if ((local31 & 0x10) != 0) {
				local87 = Static249.aClass3_Sub26_Sub1_3.method3921();
				local91 = Static249.aClass3_Sub26_Sub1_3.method3939();
				local27.method4185(local91, Static124.anInt2371, local87);
				local27.anInt5064 = Static124.anInt2371 + 300;
				local27.anInt5026 = Static249.aClass3_Sub26_Sub1_3.method3939();
			}
			if ((local31 & 0x20) != 0) {
				local87 = Static249.aClass3_Sub26_Sub1_3.method3909();
				if (local87 == 65535) {
					local87 = -1;
				}
				@Pc(144) boolean local144 = true;
				local91 = Static249.aClass3_Sub26_Sub1_3.method3932();
				if (local87 != -1 && local27.anInt5023 != -1 && Static253.method4288(Static297.method1843(local87).anInt5489).anInt420 < Static253.method4288(Static297.method1843(local27.anInt5023).anInt5489).anInt420) {
					local144 = false;
				}
				if (local144) {
					local27.anInt5047 = 0;
					local27.anInt5069 = 1;
					local27.anInt5023 = local87;
					local27.anInt5101 = 0;
					local27.anInt5033 = local91 >> 16;
					local27.anInt5050 = Static124.anInt2371 + (local91 & 0xFFFF);
					if (local27.anInt5050 > Static124.anInt2371) {
						local27.anInt5047 = -1;
					}
					if (local27.anInt5023 != -1 && Static124.anInt2371 == local27.anInt5050) {
						@Pc(231) int local231 = Static297.method1843(local27.anInt5023).anInt5489;
						if (local231 != -1) {
							@Pc(239) Class15 local239 = Static253.method4288(local231);
							if (local239 != null && local239.anIntArray35 != null) {
								Static158.method2622(local27.anInt5073, 0, local239, false, local27.anInt5016);
							}
						}
					}
				}
			}
			if ((local31 & 0x80) != 0) {
				if (local27.aClass124_1.method3189()) {
					Static5.method103(local27);
				}
				local27.method4209(Static218.method3602(Static249.aClass3_Sub26_Sub1_3.method3908()));
				local27.method4199(local27.aClass124_1.anInt3781);
				local27.anInt5090 = local27.aClass124_1.anInt3758;
				local27.anInt5017 = local27.aClass124_1.anInt3778;
				if (local27.aClass124_1.method3189()) {
					Static114.method5018(0, Static99.anInt1826, null, null, local27.anIntArray535[0], local27, 0, local27.anIntArray537[0]);
				}
			}
			if ((local31 & 0x100) != 0) {
				local87 = Static249.aClass3_Sub26_Sub1_3.method3921();
				@Pc(324) int[] local324 = new int[local87];
				@Pc(327) int[] local327 = new int[local87];
				@Pc(330) int[] local330 = new int[local87];
				for (@Pc(332) int local332 = 0; local332 < local87; local332++) {
					@Pc(339) int local339 = Static249.aClass3_Sub26_Sub1_3.method3909();
					if (local339 == 65535) {
						local339 = -1;
					}
					local324[local332] = local339;
					local327[local332] = Static249.aClass3_Sub26_Sub1_3.method3921();
					local330[local332] = Static249.aClass3_Sub26_Sub1_3.method3895();
				}
				Static220.method4260(local327, local330, local324, local27);
			}
			if ((local31 & 0x200) != 0) {
				local27.anInt5083 = Static249.aClass3_Sub26_Sub1_3.method3909();
				local27.anInt5052 = Static249.aClass3_Sub26_Sub1_3.method3895();
			}
			if ((local31 & 0x4) != 0) {
				local87 = Static249.aClass3_Sub26_Sub1_3.method3948();
				local91 = Static249.aClass3_Sub26_Sub1_3.method3921();
				if (local87 == 65535) {
					local87 = -1;
				}
				Static276.method4530(local91, local27, local87);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
	public static void method2788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg2 - arg3;
		@Pc(10) int local10 = arg0 - arg1;
		if (local10 == 0) {
			if (local6 != 0) {
				Static156.method2600(arg1, arg3, arg2, arg4);
			}
		} else if (local6 == 0) {
			Static224.method4979(arg1, arg0, arg4, arg3);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local6 < 0) {
				local6 = -local6;
			}
			@Pc(62) boolean local62 = local6 > local10;
			@Pc(67) int local67;
			@Pc(71) int local71;
			if (local62) {
				local67 = arg1;
				arg1 = arg3;
				local71 = arg0;
				arg0 = arg2;
				arg3 = local67;
				arg2 = local71;
			}
			if (arg1 > arg0) {
				local67 = arg1;
				arg1 = arg0;
				arg0 = local67;
				local71 = arg3;
				arg3 = arg2;
				arg2 = local71;
			}
			local71 = arg0 - arg1;
			local67 = arg3;
			@Pc(103) int local103 = arg2 - arg3;
			@Pc(108) int local108 = -(local71 >> 1);
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(132) int local132 = arg2 > arg3 ? 1 : -1;
			@Pc(136) int local136;
			if (local62) {
				for (local136 = arg1; local136 <= arg0; local136++) {
					Static129.anIntArrayArray40[local136][local67] = arg4;
					local108 += local103;
					if (local108 > 0) {
						local67 += local132;
						local108 -= local71;
					}
				}
			} else {
				for (local136 = arg1; local136 <= arg0; local136++) {
					Static129.anIntArrayArray40[local67][local136] = arg4;
					local108 += local103;
					if (local108 > 0) {
						local108 -= local71;
						local67 += local132;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIII)I")
	public static int method2789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg2 & 0xF;
		@Pc(14) int local14 = local3 >= 8 ? arg3 : arg1;
		@Pc(31) int local31 = local3 >= 4 ? (local3 == 12 || local3 == 14 ? arg1 : arg0) : arg3;
		return ((local3 & 0x1) == 0 ? local14 : -local14) + ((local3 & 0x2) == 0 ? local31 : -local31);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!jg;)V")
	public static void method2791(@OriginalArg(0) Class85 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2482; local2 <= arg0.anInt2474; local2++) {
			for (@Pc(9) int local9 = arg0.anInt2480; local9 <= arg0.anInt2478; local9++) {
				@Pc(22) Class3_Sub25 local22 = Static146.aClass3_Sub25ArrayArrayArray7[arg0.anInt2483][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt4483; local26++) {
						if (local22.aClass85Array3[local26] == arg0) {
							local22.anInt4483--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt4483; local44++) {
								local22.aClass85Array3[local44] = local22.aClass85Array3[local44 + 1];
								local22.anIntArray498[local44] = local22.anIntArray498[local44 + 1];
							}
							local22.aClass85Array3[local22.anInt4483] = null;
							break;
						}
					}
					local22.anInt4477 = 0;
					for (local26 = 0; local26 < local22.anInt4483; local26++) {
						local22.anInt4477 |= local22.anIntArray498[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIBZII)V")
	public static void method2792(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static283.method4652();
		}
		if (Static73.aFrame1 != null && (arg4 != 3 || arg5 != Static187.anInt3701 || arg2 != Static132.anInt2491)) {
			Static252.method4275(Static73.aFrame1, Static274.aClass176_4);
			Static73.aFrame1 = null;
		}
		if (arg4 == 3 && Static73.aFrame1 == null) {
			Static73.aFrame1 = Static17.method298(Static274.aClass176_4, arg2, 0, arg5);
			if (Static73.aFrame1 != null) {
				Static187.anInt3701 = arg5;
				Static132.anInt2491 = arg2;
				Static188.method3143(Static274.aClass176_4);
			}
		}
		if (arg4 == 3 && Static73.aFrame1 == null) {
			method2792(true, arg1, -1, true, Static255.anInt5254, -1);
			return;
		}
		@Pc(78) Container local78;
		if (Static73.aFrame1 != null) {
			local78 = Static73.aFrame1;
		} else if (Static276.aFrame2 == null) {
			local78 = Static274.aClass176_4.anApplet1;
		} else {
			local78 = Static276.aFrame2;
		}
		Static199.anInt3882 = local78.getSize().width;
		Static256.anInt5286 = local78.getSize().height;
		@Pc(103) Insets local103;
		if (local78 == Static276.aFrame2) {
			local103 = Static276.aFrame2.getInsets();
			Static199.anInt3882 -= local103.left + local103.right;
			Static256.anInt5286 -= local103.bottom + local103.top;
		}
		if (arg4 >= 2) {
			Static123.anInt2333 = Static256.anInt5286;
			Static307.anInt6024 = 0;
			Static253.anInt5224 = Static199.anInt3882;
			Static59.anInt1138 = 0;
		} else {
			Static253.anInt5224 = 765;
			Static307.anInt6024 = 0;
			Static59.anInt1138 = (Static199.anInt3882 - 765) / 2;
			Static123.anInt2333 = 503;
		}
		if (arg0) {
			Static229.method3779(Static224.aCanvas12);
			Static54.method838(Static224.aCanvas12);
			if (Static307.aClass77_1 != null) {
				Static307.aClass77_1.method1849(Static224.aCanvas12);
			}
			Static110.aClient1.method608();
			Static213.method3488(Static224.aCanvas12);
			Static92.method1372(Static224.aCanvas12);
			if (Static307.aClass77_1 != null) {
				Static307.aClass77_1.method1846(Static224.aCanvas12);
			}
		} else {
			if (Static283.aBoolean393) {
				Static283.method4640(Static253.anInt5224, Static123.anInt2333);
			}
			Static224.aCanvas12.setSize(Static253.anInt5224, Static123.anInt2333);
			if (Static276.aFrame2 == local78) {
				local103 = Static276.aFrame2.getInsets();
				Static224.aCanvas12.setLocation(Static59.anInt1138 + local103.left, local103.top + Static307.anInt6024);
			} else {
				Static224.aCanvas12.setLocation(Static59.anInt1138, Static307.anInt6024);
			}
		}
		if (arg4 == 0 && arg1 > 0) {
			Static283.method4629(Static224.aCanvas12);
		}
		if (arg3 && arg4 > 0) {
			Static224.aCanvas12.setIgnoreRepaint(true);
			if (!Static63.aBoolean93) {
				Static286.method4489();
				Static94.aClass128_1 = null;
				Static94.aClass128_1 = Static145.method2479(Static224.aCanvas12, Static123.anInt2333, Static253.anInt5224);
				Static143.method2443();
				if (Static10.anInt190 == 5) {
					Static150.method2554(Static224.aClass3_Sub4_Sub2_14, true);
				} else {
					Static212.method3485(aString113, false);
				}
				try {
					@Pc(253) Graphics local253 = Static224.aCanvas12.getGraphics();
					Static94.aClass128_1.method4291(local253);
				} catch (@Pc(261) Exception local261) {
				}
				Static45.method685();
				if (arg1 == 0) {
					Static94.aClass128_1 = Static145.method2479(Static224.aCanvas12, 503, 765);
				} else {
					Static94.aClass128_1 = null;
				}
				@Pc(282) Class178 local282 = Static274.aClass176_4.method4509(Static110.aClient1.getClass());
				while (local282.anInt5649 == 0) {
					Static150.method2552(100L);
				}
				if (local282.anInt5649 == 1) {
					Static63.aBoolean93 = true;
				}
			}
			if (Static63.aBoolean93) {
				Static283.method4670(Static224.aCanvas12, Static268.anInt5481 * 2);
			}
		}
		if (!Static283.aBoolean393 && arg4 > 0) {
			method2792(true, arg1, -1, true, 0, -1);
			return;
		}
		if (arg4 > 0 && arg1 == 0) {
			Static161.aThread1.setPriority(5);
			Static94.aClass128_1 = null;
			Static119.method1976();
			((Class91_Sub1) Static16.anInterface4_1).method2915(200);
			if (Static67.aBoolean95) {
				Static16.method278(0.7F);
			}
			if (Static43.aClass74ArrayArray1 == null) {
				Static43.aClass74ArrayArray1 = new Class74[13][13];
			}
			Static142.method2409();
			Static193.method3202();
			Static83.method1276();
		} else if (arg4 == 0 && arg1 > 0) {
			Static161.aThread1.setPriority(1);
			Static94.aClass128_1 = Static145.method2479(Static224.aCanvas12, 503, 765);
			Static119.method1979();
			Static71.method1086();
			((Class91_Sub1) Static16.anInterface4_1).method2915(20);
			if (Static67.aBoolean95) {
				if (Static251.anInt5174 == 1) {
					Static16.method278(0.9F);
				}
				if (Static251.anInt5174 == 2) {
					Static16.method278(0.8F);
				}
				if (Static251.anInt5174 == 3) {
					Static16.method278(0.7F);
				}
				if (Static251.anInt5174 == 4) {
					Static16.method278(0.6F);
				}
			}
			Static172.method2862();
			Static83.method1276();
		}
		Static6.aBoolean12 = !Static208.method3462();
		Static71.method1076(Static253.anInt5224, Static123.anInt2333);
		if (arg3) {
			Static264.method4396();
		}
		if (arg4 < 2) {
			Static91.aBoolean139 = false;
		} else {
			Static91.aBoolean139 = true;
		}
		if (Static66.anInt1232 != -1) {
			Static315.method5005(true);
		}
		if (Static150.aClass139_3 != null && (Static10.anInt190 == 30 || Static10.anInt190 == 25)) {
			Static191.method3186();
		}
		for (@Pc(472) int local472 = 0; local472 < 100; local472++) {
			Static292.aBooleanArray129[local472] = true;
		}
		Static176.aBoolean235 = true;
	}
}
