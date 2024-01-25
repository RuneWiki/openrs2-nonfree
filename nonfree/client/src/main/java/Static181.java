import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_58 = new Class40("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_11 = new Class42(64);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!rl;IIBLclient!ra;IILjava/lang/String;ILclient!oh;Lclient!pa;)V")
	public static void method3081(@OriginalArg(0) int arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class13 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class220 arg9, @OriginalArg(11) Class87 arg10) {
		@Pc(16) int local16;
		if (Static166.anInt3343 == 4) {
			local16 = (int) Static476.aFloat339 & 0x3FFF;
		} else {
			local16 = Static352.anInt6565 + (int) Static476.aFloat339 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg9.anInt6627 / 2, arg9.anInt6681 / 2) + 10;
		@Pc(45) int local45 = arg2 * arg2 + arg5 * arg5;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class5_Sub2_Sub16.anIntArray411[local16];
		@Pc(63) int local63 = Class5_Sub2_Sub16.anIntArray410[local16];
		if (Static166.anInt3343 != 4) {
			local63 = local63 * 256 / (Static145.anInt3048 + 256);
			local59 = local59 * 256 / (Static145.anInt3048 + 256);
		}
		@Pc(94) int local94 = local63 * arg5 + arg2 * local59 >> 15;
		@Pc(105) int local105 = arg2 * local63 - local59 * arg5 >> 15;
		@Pc(112) int local112 = arg1.method6112(null, arg7, 100);
		@Pc(120) int local120 = arg1.method6120(null, arg7);
		@Pc(126) int local126 = local94 - local112 / 2;
		if (-arg9.anInt6627 <= local126 && local126 <= arg9.anInt6627 && local105 >= -arg9.anInt6681 && arg9.anInt6681 >= local105) {
			arg4.method7208(arg10, 0, arg6, local112, arg3 + local126 + arg9.anInt6627 / 2, 0, 50, null, arg8, arg8 + arg9.anInt6681 / 2 - arg0 - local105 - local120, null, arg3, arg7);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIILclient!qa;I)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) int arg7) {
		@Pc(24) Interface10 local24 = (Interface10) Static490.method6780(arg7, arg5, arg4);
		@Pc(33) Class283 local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (local24 != null) {
			local33 = Static453.aClass88_3.method2294(local24.method6868());
			local39 = local24.method6866() & 0x3;
			local43 = local24.method6867();
			if (local33.anInt8166 == -1) {
				local50 = arg1;
				if (local33.anInt8152 > 0) {
					local50 = arg0;
				}
				if (local43 == 0 || local43 == 2) {
					if (local39 == 0) {
						arg6.method7064(4, arg2, arg3, local50);
					} else if (local39 == 1) {
						arg6.method7042(4, arg3, arg2, local50);
					} else if (local39 == 2) {
						arg6.method7064(4, arg2 + 3, arg3, local50);
					} else if (local39 == 3) {
						arg6.method7042(4, arg3 + 3, arg2, local50);
					}
				}
				if (local43 == 3) {
					if (local39 == 0) {
						arg6.method7040(local50, 1, arg3, arg2, 1);
					} else if (local39 == 1) {
						arg6.method7040(local50, 1, arg3, arg2 + 3, 1);
					} else if (local39 == 2) {
						arg6.method7040(local50, 1, arg3 + 3, arg2 - -3, 1);
					} else if (local39 == 3) {
						arg6.method7040(local50, 1, arg3 + 3, arg2, 1);
					}
				}
				if (local43 == 2) {
					if (local39 == 0) {
						arg6.method7042(4, arg3, arg2, local50);
					} else if (local39 == 1) {
						arg6.method7064(4, arg2 + 3, arg3, local50);
					} else if (local39 == 2) {
						arg6.method7042(4, arg3 + 3, arg2, local50);
					} else if (local39 == 3) {
						arg6.method7064(4, arg2, arg3, local50);
					}
				}
			} else {
				Static508.method6981(local33, arg2, arg3, arg6, local39);
			}
		}
		local24 = (Interface10) Static188.method3173(arg7, arg5, arg4, p.class);
		if (local24 != null) {
			local33 = Static453.aClass88_3.method2294(local24.method6868());
			local39 = local24.method6866() & 0x3;
			local43 = local24.method6867();
			if (local33.anInt8166 != -1) {
				Static508.method6981(local33, arg2, arg3, arg6, local39);
			} else if (local43 == 9) {
				local50 = -1118482;
				if (local33.anInt8152 > 0) {
					local50 = -1179648;
				}
				if (local39 == 0 || local39 == 2) {
					arg6.method6992(local50, arg2 + 3, arg2, arg3 + 3, arg3);
				} else {
					arg6.method6992(local50, arg2 + 3, arg2, arg3, arg3 + 3);
				}
			}
		}
		local24 = (Interface10) Static469.method6581(arg7, arg5, arg4);
		if (local24 == null) {
			return;
		}
		local33 = Static453.aClass88_3.method2294(local24.method6868());
		local39 = local24.method6866() & 0x3;
		if (local33.anInt8166 != -1) {
			Static508.method6981(local33, arg2, arg3, arg6, local39);
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lclient!im;")
	public static Class147 method3084(@OriginalArg(0) int arg0) {
		@Pc(10) Class147 local10 = (Class147) Static393.aClass288_51.method6745((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static522.aClass117_221.method2962(arg0, 0);
		local10 = new Class147();
		if (local20 != null) {
			local10.method3449(new Class5_Sub3(local20), arg0);
		}
		Static393.aClass288_51.method6746(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(FIFF)F")
	public static float method3085(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg0 * (arg1 - arg2);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method3086() {
		@Pc(8) int local8 = Static348.aByteArrayArray36.length;
		for (@Pc(26) int local26 = 0; local26 < local8; local26++) {
			if (Static348.aByteArrayArray36[local26] != null) {
				@Pc(34) int local34 = -1;
				for (@Pc(36) int local36 = 0; local36 < Static211.anInt3982; local36++) {
					if (Static402.anIntArray559[local36] == Static103.anIntArray76[local26]) {
						local34 = local36;
						break;
					}
				}
				if (local34 == -1) {
					Static402.anIntArray559[Static211.anInt3982] = Static103.anIntArray76[local26];
					local34 = Static211.anInt3982++;
				}
				@Pc(76) Class5_Sub3 local76 = new Class5_Sub3(Static348.aByteArrayArray36[local26]);
				@Pc(78) int local78 = 0;
				while (local76.anInt4960 < Static348.aByteArrayArray36[local26].length && local78 < 511 && Static438.anInt7689 < 1023) {
					@Pc(97) int local97 = local34 | local78++ << 6;
					@Pc(101) int local101 = local76.method4227();
					@Pc(105) int local105 = local101 >> 14;
					@Pc(111) int local111 = local101 >> 7 & 0x3F;
					@Pc(115) int local115 = local101 & 0x3F;
					@Pc(127) int local127 = (Static103.anIntArray76[local26] >> 8) * 64 + local111 - Static515.anInt3214;
					@Pc(139) int local139 = local115 + (Static103.anIntArray76[local26] & 0xFF) * 64 - Static338.anInt6353;
					@Pc(146) Class305 local146 = Static204.aClass282_1.method6596(local76.method4227());
					@Pc(153) Class5_Sub51 local153 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local97);
					if (local153 == null && (local146.aByte97 & 0x1) > 0 && local105 == Static283.anInt5784 && local127 >= 0 && local146.anInt8815 + local127 < Static460.anInt7894 && local139 >= 0 && local146.anInt8815 + local139 < Static235.anInt4493) {
						@Pc(193) Class15_Sub2_Sub1_Sub2 local193 = new Class15_Sub2_Sub1_Sub2();
						local193.anInt4745 = local97;
						@Pc(201) Class5_Sub51 local201 = new Class5_Sub51(local193);
						Static521.aClass42_42.method1106((long) local97, local201);
						Static275.aClass5_Sub51Array1[Static310.anInt6066++] = local201;
						Static547.anIntArray731[Static438.anInt7689++] = local97;
						local193.anInt4749 = Static481.anInt8318;
						local193.method4045(local146);
						local193.method4030(local193.aClass305_1.anInt8815);
						local193.anInt4741 = local193.aClass305_1.anInt8824 << 3;
						local193.method4025(local193.aClass305_1.aByte98 + 4 << 11 & 0x3C4E, true);
						local193.method4050(true, local105, local127, local139, local193.method4035());
					}
				}
			}
		}
	}
}
