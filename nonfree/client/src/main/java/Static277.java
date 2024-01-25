import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public static void method4593() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static518.aBooleanArray39[local7] = false;
		}
		Static35.anInt1112 = -1;
		Static49.anInt1348 = 0;
		Static4.anInt135 = Static508.anInt8998;
		Static454.anInt8403 = -1;
		Static222.anInt4655 = Static5.anInt142;
		Static24.anInt8438 = Static86.anInt2132;
		Static95.anInt2289 = Static348.anInt6726;
		Static460.anInt8490 = Static393.anInt7341;
		Static84.anInt1994 = 5;
		Static110.anInt2515 = 0;
		Static502.anInt8936 = Static390.anInt7318;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method4595(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static510.method5612(arg1, arg2, arg0, arg5, -1, null, arg3, arg4);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method4596(@OriginalArg(0) Class9 arg0) {
		@Pc(7) int local7 = Static69.anInt1684;
		@Pc(9) int local9 = Static230.anInt4775;
		@Pc(11) int local11 = Static24.anInt8441;
		@Pc(13) int local13 = Static430.anInt868;
		arg0.method5409(local13, local11, -10660793, local9, local7);
		arg0.method5409(16, local11 - 2, -16777216, local9 - -1, local7 + 1);
		arg0.method5444(local9 + 18, -16777216, local11 - 2, local7 + 1, local13 + -19);
		Static489.aClass73_5.method7888(Static222.aClass152_69.method4002(Static286.anInt5468), -10660793, -1, local7 + 3, local9 + 14);
		@Pc(74) int local74 = Static401.aClass4_1.method1216();
		@Pc(78) int local78 = Static401.aClass4_1.method1215();
		@Pc(80) int local80 = 0;
		for (@Pc(85) Class6_Sub42 local85 = (Class6_Sub42) Static207.aClass211_29.method5183(); local85 != null; local85 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			@Pc(100) int local100 = (Static205.anInt4369 - local80 - 1) * 16 + local9 + 31;
			@Pc(102) short local102 = -1;
			if (local7 < local74 && local11 + local7 > local74 && local100 - 13 < local78 && local100 + 3 > local78 && local85.aBoolean605) {
				local102 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static394.method6227(local85.anInt8285)) {
				local135 = Static98.aClass203_1.method4899((int) local85.aLong200).anIntArray288;
			} else if (local85.anInt8289 != -1) {
				local135 = Static98.aClass203_1.method4899(local85.anInt8289).anIntArray288;
			} else if (Static390.method6168(local85.anInt8285)) {
				@Pc(176) Class6_Sub33 local176 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local85.aLong200);
				if (local176 != null) {
					@Pc(181) Class11_Sub1_Sub1_Sub1 local181 = local176.aClass11_Sub1_Sub1_Sub1_2;
					@Pc(184) Class222 local184 = local181.aClass222_1;
					if (local184.anIntArray464 != null) {
						local184 = local184.method5329(Static435.aClass234_1);
					}
					if (local184 != null) {
						local135 = local184.anIntArray463;
					}
				}
			} else if (Static472.method5255(local85.anInt8285)) {
				@Pc(220) Class31 local220;
				if (local85.anInt8285 == 1009) {
					local220 = Static480.aClass57_11.method1469((int) local85.aLong200);
				} else {
					local220 = Static480.aClass57_11.method1469((int) (local85.aLong200 >>> 32 & 0x7FFFFFFFL));
				}
				if (local220.anIntArray69 != null) {
					local220 = local220.method1029(Static435.aClass234_1);
				}
				if (local220 != null) {
					local135 = local220.anIntArray72;
				}
			}
			@Pc(245) String local245 = Static84.method1839(local85);
			if (local135 != null) {
				local245 = local245 + Static506.method7533(local135);
			}
			Static489.aClass73_5.method7899(Static451.aClass66Array11, local102, local7 + 3, local245, Static235.anIntArray314, local100);
			if (local85.aBoolean607) {
				Static270.aClass66_24.method8066(Static1.aClass82_1.method2292(local245) + local7 + 5, local100 + -12);
			}
			local80++;
		}
		Static173.method3500(Static430.anInt868, Static230.anInt4775, Static24.anInt8441, Static69.anInt1684);
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)Z")
	public static boolean method4598() throws IOException {
		if (Static52.aClass64_1 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static180.aClass254_74 == null) {
			if (Static246.aBoolean381) {
				if (!Static52.aClass64_1.method1820(1)) {
					return false;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
				Static246.aBoolean381 = false;
				Static406.anInt9845++;
				Static258.anInt5222 = 0;
			}
			Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
			if (Static345.aClass6_Sub26_Sub2_1.method5004()) {
				if (!Static52.aClass64_1.method1820(1)) {
					return false;
				}
				Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 1, 1);
				Static406.anInt9845++;
				Static258.anInt5222 = 0;
			}
			Static246.aBoolean381 = true;
			@Pc(71) Class254[] local71 = Static233.method4119();
			local75 = Static345.aClass6_Sub26_Sub2_1.method5003();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static345.aClass6_Sub26_Sub2_1.anInt5769);
			}
			Static180.aClass254_74 = local71[local75];
			Static462.anInt8534 = Static180.aClass254_74.anInt7557;
		}
		if (Static462.anInt8534 == -1) {
			if (!Static52.aClass64_1.method1820(1)) {
				return false;
			}
			Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 1);
			Static258.anInt5222 = 0;
			Static462.anInt8534 = Static345.aClass6_Sub26_Sub2_1.aByteArray65[0] & 0xFF;
			Static406.anInt9845++;
		}
		if (Static462.anInt8534 == -2) {
			if (!Static52.aClass64_1.method1820(2)) {
				return false;
			}
			Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, 2);
			Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
			Static462.anInt8534 = Static345.aClass6_Sub26_Sub2_1.method4999();
			Static258.anInt5222 = 0;
			Static406.anInt9845 += 2;
		}
		if (Static462.anInt8534 > 0) {
			if (!Static52.aClass64_1.method1820(Static462.anInt8534)) {
				return false;
			}
			Static345.aClass6_Sub26_Sub2_1.anInt5769 = 0;
			Static52.aClass64_1.method1813(Static345.aClass6_Sub26_Sub2_1.aByteArray65, 0, Static462.anInt8534);
			Static406.anInt9845 += Static462.anInt8534;
			Static258.anInt5222 = 0;
		}
		Static555.aClass254_173 = Static467.aClass254_148;
		Static467.aClass254_148 = Static205.aClass254_80;
		Static205.aClass254_80 = Static180.aClass254_74;
		@Pc(221) int local221;
		@Pc(225) int local225;
		@Pc(236) int local236;
		@Pc(242) int local242;
		@Pc(208) int local208;
		@Pc(252) long local252;
		@Pc(258) Class6_Sub44 local258;
		@Pc(273) Class6_Sub44 local273;
		if (Static86.aClass254_40 == Static180.aClass254_74) {
			local208 = Static345.aClass6_Sub26_Sub2_1.method5000();
			local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
			if (local75 == 65535) {
				local75 = -1;
			}
			local221 = Static345.aClass6_Sub26_Sub2_1.method5000();
			local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
			if (local225 == 65535) {
				local225 = -1;
			}
			local236 = Static345.aClass6_Sub26_Sub2_1.method4967();
			if (Static45.method1140(local236)) {
				for (local242 = local225; local242 <= local75; local242++) {
					local252 = ((long) local221 << 32) + (long) local242;
					local258 = (Class6_Sub44) Static122.aClass305_17.method7447(local252);
					if (local258 != null) {
						local273 = new Class6_Sub44(local208, local258.anInt8798);
						local258.method8151();
					} else if (local242 == -1) {
						local273 = new Class6_Sub44(local208, Static223.method4011(local221).aClass6_Sub44_1.anInt8798);
					} else {
						local273 = new Class6_Sub44(local208, -1);
					}
					Static122.aClass305_17.method7448(local252, local273);
				}
			}
			Static180.aClass254_74 = null;
			return true;
		} else if (Static522.aClass254_166 == Static180.aClass254_74) {
			Static244.method4254();
			Static180.aClass254_74 = null;
			return true;
		} else {
			@Pc(335) String local335;
			@Pc(331) boolean local331;
			@Pc(337) String local337;
			@Pc(383) String local383;
			@Pc(349) boolean local349;
			if (Static180.aClass254_74 == Static110.aClass254_49) {
				local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
				local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
				local337 = local335;
				if (local331) {
					local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
				}
				local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local349 = false;
				if (local225 <= 1) {
					if (Static200.aBoolean349 && !Static554.aBoolean702 || Static245.aBoolean376) {
						local349 = true;
					} else if (local225 <= 1 && Static178.method3528(local337)) {
						local349 = true;
					}
				}
				if (!local349 && Static119.anInt2416 == 0) {
					local383 = Static177.method3519(Static540.method8015(Static345.aClass6_Sub26_Sub2_1));
					if (local225 == 2) {
						Static510.method5612(24, "<img=1>" + local337, "<img=1>" + local335, local383, -1, null, local335, 0);
					} else if (local225 == 1) {
						Static510.method5612(24, "<img=0>" + local337, "<img=0>" + local335, local383, -1, null, local335, 0);
					} else {
						Static510.method5612(24, local337, local335, local383, -1, null, local335, 0);
					}
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static364.aClass254_135) {
				Static22.method867(false);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static383.aClass254_134) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
				if (local208 == 255) {
					local75 = -1;
					local208 = -1;
				}
				Static181.method1448(local75, local208);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static487.aClass254_153) {
				Static6.aClass135_1 = Static487.method7351(Static345.aClass6_Sub26_Sub2_1.method4966());
				Static180.aClass254_74 = null;
				return true;
			} else if (Static558.aClass254_174 == Static180.aClass254_74) {
				Static3.method5143(Static342.aClass117_11);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static398.aClass254_138) {
				Static3.method5143(Static46.aClass117_1);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static565.aClass254_175 == Static180.aClass254_74) {
				Static180.aClass254_74 = null;
				Static435.anInt7934 = 1;
				Static435.anInt7935 = Static32.anInt1035;
				return true;
			} else if (Static576.aClass254_182 == Static180.aClass254_74) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
				@Pc(559) Object[] local559 = new Object[local335.length() + 1];
				for (local225 = local335.length() - 1; local225 >= 0; local225--) {
					if (local335.charAt(local225) == 's') {
						local559[local225 + 1] = Static345.aClass6_Sub26_Sub2_1.method4941();
					} else {
						local559[local225 + 1] = Integer.valueOf(Static345.aClass6_Sub26_Sub2_1.method5000());
					}
				}
				local559[0] = Integer.valueOf(Static345.aClass6_Sub26_Sub2_1.method5000());
				if (Static45.method1140(local208)) {
					@Pc(617) Class6_Sub38 local617 = new Class6_Sub38();
					local617.anObjectArray36 = local559;
					Static89.method1979(local617);
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static582.aClass254_183 == Static180.aClass254_74) {
				Static3.method5143(Static136.aClass117_4);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static514.aClass254_161) {
				Static366.method5845(false);
				Static180.aClass254_74 = null;
				return false;
			} else if (Static451.aClass254_145 == Static180.aClass254_74) {
				local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
				@Pc(665) byte[] local665 = new byte[Static462.anInt8534 - 1];
				Static345.aClass6_Sub26_Sub2_1.method4977(Static462.anInt8534 - 1, local665);
				Static456.method7063(local331, local665);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static335.aClass254_118) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4985();
				local75 = Static345.aClass6_Sub26_Sub2_1.method4967();
				if (local75 == 65535) {
					local75 = -1;
				}
				local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
				local225 = Static345.aClass6_Sub26_Sub2_1.method4983();
				local236 = Static345.aClass6_Sub26_Sub2_1.method4983();
				if (local236 == 65535) {
					local236 = -1;
				}
				if (Static45.method1140(local221)) {
					for (local242 = local75; local242 <= local236; local242++) {
						local252 = ((long) local208 << 32) + (long) local242;
						local258 = (Class6_Sub44) Static122.aClass305_17.method7447(local252);
						if (local258 != null) {
							local273 = new Class6_Sub44(local258.anInt8800, local225);
							local258.method8151();
						} else if (local242 == -1) {
							local273 = new Class6_Sub44(Static223.method4011(local208).aClass6_Sub44_1.anInt8800, local225);
						} else {
							local273 = new Class6_Sub44(0, local225);
						}
						Static122.aClass305_17.method7448(local252, local273);
					}
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static559.aClass254_168) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
				local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
				if (local75 == 65535) {
					local75 = -1;
				}
				local221 = Static345.aClass6_Sub26_Sub2_1.method4985();
				if (Static45.method1140(local208)) {
					Static339.method5354(2, -1, local75, local221);
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static487.aClass254_154 == Static180.aClass254_74) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
				if (local208 == 65535) {
					local208 = -1;
				}
				local75 = Static345.aClass6_Sub26_Sub2_1.method4985();
				local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
				if (Static45.method1140(local221)) {
					Static339.method5354(1, -1, local208, local75);
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static271.aClass254_98) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4985();
				local75 = Static345.aClass6_Sub26_Sub2_1.method4967();
				Static435.aClass234_1.method5837(local208, local75);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static246.aClass254_91 == Static180.aClass254_74) {
				Static3.method5143(Static556.aClass117_18);
				Static180.aClass254_74 = null;
				return true;
			} else if (Static470.aClass254_150 == Static180.aClass254_74) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
				if (Static45.method1140(local208)) {
					Static37.method1092();
				}
				Static180.aClass254_74 = null;
				return true;
			} else if (Static180.aClass254_74 == Static289.aClass254_108) {
				local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
				local75 = Static345.aClass6_Sub26_Sub2_1.method4958();
				Static435.aClass234_1.method5834(local75, local208);
				Static180.aClass254_74 = null;
				return true;
			} else {
				@Pc(943) String local943;
				if (Static191.aClass254_76 == Static180.aClass254_74) {
					local943 = Static345.aClass6_Sub26_Sub2_1.method4941();
					local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
					local221 = Static345.aClass6_Sub26_Sub2_1.method4983();
					if (Static45.method1140(local221)) {
						Static445.method6827(local75, local943);
					}
					Static180.aClass254_74 = null;
					return true;
				}
				@Pc(1062) String local1062;
				@Pc(1103) int local1103;
				@Pc(1013) boolean local1013;
				@Pc(1043) int local1043;
				if (Static180.aClass254_74 == Static122.aClass254_53) {
					local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
					@Pc(979) Class11_Sub1_Sub1_Sub2 local979;
					if (Static412.anInt7714 == local208) {
						local979 = Static350.aClass11_Sub1_Sub1_Sub2_4;
					} else {
						local979 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local208];
					}
					if (local979 == null) {
						Static180.aClass254_74 = null;
						return true;
					}
					local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
					local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
					local349 = (local221 & 0x8000) != 0;
					if (local979.aString95 != null && local979.aClass67_1 != null) {
						local1013 = false;
						if (local225 <= 1) {
							if (!local349 && (Static200.aBoolean349 && !Static554.aBoolean702 || Static245.aBoolean376)) {
								local1013 = true;
							} else if (Static178.method3528(local979.aString95)) {
								local1013 = true;
							}
						}
						if (!local1013 && Static119.anInt2416 == 0) {
							local1043 = -1;
							if (local349) {
								local221 &= 0x7FFF;
								@Pc(1053) Class39 local1053 = Static426.method6566(Static345.aClass6_Sub26_Sub2_1);
								local1043 = local1053.anInt1256;
								local1062 = local1053.aClass6_Sub4_Sub1_1.method965(Static345.aClass6_Sub26_Sub2_1);
							} else {
								local1062 = Static177.method3519(Static540.method8015(Static345.aClass6_Sub26_Sub2_1));
							}
							local979.aString94 = local1062.trim();
							local979.anInt7426 = local221 >> 8;
							local979.anInt7419 = 150;
							local979.anInt7369 = local221 & 0xFF;
							if (local225 == 1 || local225 == 2) {
								local1103 = local349 ? 17 : 1;
							} else {
								local1103 = local349 ? 17 : 2;
							}
							if (local225 == 2) {
								Static510.method5612(local1103, "<img=1>" + local979.method6226(), "<img=1>" + local979.method6223(), local1062, local1043, null, local979.aString96, 0);
							} else if (local225 == 1) {
								Static510.method5612(local1103, "<img=0>" + local979.method6226(), "<img=0>" + local979.method6223(), local1062, local1043, null, local979.aString96, 0);
							} else {
								Static510.method5612(local1103, local979.method6226(), local979.method6223(), local1062, local1043, null, local979.aString96, 0);
							}
						}
					}
					Static180.aClass254_74 = null;
					return true;
				} else if (Static342.aClass254_121 == Static180.aClass254_74) {
					Static435.aClass234_1.method5835();
					Static498.anInt8882 += 32;
					Static180.aClass254_74 = null;
					return true;
				} else if (Static132.aClass254_163 == Static180.aClass254_74) {
					Static147.anInt3044 = Static345.aClass6_Sub26_Sub2_1.method4988();
					Static560.anInt9526 = Static345.aClass6_Sub26_Sub2_1.method4964() << 3;
					Static314.anInt8006 = Static345.aClass6_Sub26_Sub2_1.method4972() << 3;
					Static180.aClass254_74 = null;
					return true;
				} else if (Static268.aClass254_158 == Static180.aClass254_74) {
					Static3.method5143(Static533.aClass117_16);
					Static180.aClass254_74 = null;
					return true;
				} else if (Static180.aClass254_74 == Static282.aClass254_103) {
					local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
					if (Static45.method1140(local208)) {
						method4593();
					}
					Static180.aClass254_74 = null;
					return true;
				} else if (Static205.aClass254_81 == Static180.aClass254_74) {
					Static3.method5143(Static166.aClass117_6);
					Static180.aClass254_74 = null;
					return true;
				} else if (Static180.aClass254_74 == Static314.aClass254_143) {
					local208 = Static345.aClass6_Sub26_Sub2_1.method4957();
					local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
					local221 = Static345.aClass6_Sub26_Sub2_1.method4966();
					if (Static45.method1140(local75)) {
						if (local221 == 2) {
							Static578.method8143();
						}
						Static6.anInt302 = local208;
						Static76.method1689(local208);
						Static171.method3490(false);
						Static89.method1984(Static6.anInt302);
						for (local225 = 0; local225 < 100; local225++) {
							Static429.aBooleanArray27[local225] = true;
						}
					}
					Static180.aClass254_74 = null;
					return true;
				} else {
					@Pc(1372) int local1372;
					if (Static21.aClass254_14 == Static180.aClass254_74) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
						if (local208 == 65535) {
							local208 = -1;
						}
						local75 = Static345.aClass6_Sub26_Sub2_1.method4954();
						local221 = local75 >> 2;
						local225 = local75 & 0x3;
						local236 = Static476.anIntArray768[local221];
						local242 = Static345.aClass6_Sub26_Sub2_1.method4969();
						local1372 = local242 >> 28 & 0x3;
						local1043 = local242 >> 14 & 0x3FFF;
						local1043 -= Static191.anInt4147;
						local1103 = local242 & 0x3FFF;
						local1103 -= Static247.anInt5049;
						Static213.method4959(local1103, local225, local1372, local236, local1043, local208, local221);
						Static180.aClass254_74 = null;
						return true;
					}
					@Pc(1427) boolean local1427;
					if (Static534.aClass254_171 == Static180.aClass254_74) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
						local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
						local1427 = (local75 & 0x1) == 1;
						while (Static345.aClass6_Sub26_Sub2_1.anInt5769 < Static462.anInt8534) {
							local225 = Static345.aClass6_Sub26_Sub2_1.method4973();
							local236 = Static345.aClass6_Sub26_Sub2_1.method4999();
							local242 = 0;
							if (local236 != 0) {
								local242 = Static345.aClass6_Sub26_Sub2_1.method4966();
								if (local242 == 255) {
									local242 = Static345.aClass6_Sub26_Sub2_1.method5000();
								}
							}
							Static42.method1133(local236 - 1, local225, local242, local208, local1427);
						}
						Static105.anIntArray182[Static222.anInt4654++ & 0x1F] = local208;
						Static180.aClass254_74 = null;
						return true;
					} else if (Static180.aClass254_74 == Static285.aClass254_107) {
						Static22.method867(true);
						Static180.aClass254_74 = null;
						return true;
					} else if (Static360.aClass254_124 == Static180.aClass254_74) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4954();
						local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
						if (Static45.method1140(local75)) {
							Static387.anInt7250 = local208;
						}
						Static180.aClass254_74 = null;
						return true;
					} else if (Static180.aClass254_74 == Static499.aClass254_156) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
						local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
						local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
						if (Static45.method1140(local221)) {
							Static445.method6827(local208, local335);
						}
						Static180.aClass254_74 = null;
						return true;
					} else if (Static237.aClass254_88 == Static180.aClass254_74) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
						if (local208 == 65535) {
							local208 = -1;
						}
						local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
						local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
						local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
						Static96.method2072(local75, local221, local225, false, local208);
						Static180.aClass254_74 = null;
						return true;
					} else if (Static193.aClass254_77 == Static180.aClass254_74) {
						local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
						if (local208 == 65535) {
							local208 = -1;
						}
						local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
						local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
						local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
						Static445.method6828(local75, local208, local225, local221);
						Static180.aClass254_74 = null;
						return true;
					} else if (Static180.aClass254_74 == Static365.aClass254_126) {
						Static147.anInt3044 = Static345.aClass6_Sub26_Sub2_1.method4988();
						Static314.anInt8006 = Static345.aClass6_Sub26_Sub2_1.method4964() << 3;
						Static560.anInt9526 = Static345.aClass6_Sub26_Sub2_1.method4972() << 3;
						while (Static345.aClass6_Sub26_Sub2_1.anInt5769 < Static462.anInt8534) {
							@Pc(1647) Class117 local1647 = Static359.method5461()[Static345.aClass6_Sub26_Sub2_1.method4966()];
							Static3.method5143(local1647);
						}
						Static180.aClass254_74 = null;
						return true;
					} else {
						@Pc(1688) String local1688;
						@Pc(1698) String local1698;
						if (Static326.aClass254_114 == Static180.aClass254_74) {
							local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
							@Pc(1680) boolean local1680 = (local208 & 0x1) == 1;
							local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
							local1688 = Static345.aClass6_Sub26_Sub2_1.method4941();
							if (local1688.equals("")) {
								local1688 = local337;
							}
							local1698 = Static345.aClass6_Sub26_Sub2_1.method4941();
							local383 = Static345.aClass6_Sub26_Sub2_1.method4941();
							if (local383.equals("")) {
								local383 = local1698;
							}
							if (local1680) {
								for (local1372 = 0; local1372 < Static104.anInt7872; local1372++) {
									if (Static548.aStringArray49[local1372].equals(local383)) {
										Static60.aStringArray7[local1372] = local337;
										Static548.aStringArray49[local1372] = local1688;
										Static437.aStringArray46[local1372] = local1698;
										Static444.aStringArray47[local1372] = local383;
										break;
									}
								}
							} else {
								Static60.aStringArray7[Static104.anInt7872] = local337;
								Static548.aStringArray49[Static104.anInt7872] = local1688;
								Static437.aStringArray46[Static104.anInt7872] = local1698;
								Static444.aStringArray47[Static104.anInt7872] = local383;
								Static354.aBooleanArray24[Static104.anInt7872] = (local208 & 0x2) == 2;
								Static104.anInt7872++;
							}
							Static180.aClass254_74 = null;
							Static435.anInt7935 = Static32.anInt1035;
							return true;
						}
						@Pc(1872) int local1872;
						@Pc(1878) int local1878;
						@Pc(2059) int local2059;
						@Pc(1968) boolean local1968;
						@Pc(1880) int local1880;
						@Pc(2325) int local2325;
						if (Static180.aClass254_74 == Static332.aClass254_117) {
							local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
							local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
							local221 = Static345.aClass6_Sub26_Sub2_1.method4988();
							local225 = Static345.aClass6_Sub26_Sub2_1.method4967();
							local236 = Static345.aClass6_Sub26_Sub2_1.method4958();
							local1013 = (local221 & 0x80) != 0;
							if (local236 >> 30 == 0) {
								@Pc(2000) Class212 local2000;
								@Pc(2016) Class16 local2016;
								@Pc(2024) Class16 local2024;
								if (local236 >> 29 != 0) {
									local1372 = local236 & 0xFFFF;
									@Pc(2270) Class6_Sub33 local2270 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local1372);
									if (local2270 != null) {
										@Pc(2275) Class11_Sub1_Sub1_Sub1 local2275 = local2270.aClass11_Sub1_Sub1_Sub1_2;
										if (local75 == 65535) {
											local75 = -1;
										}
										@Pc(2282) boolean local2282 = true;
										local1878 = local1013 ? local2275.anInt7393 : local2275.anInt7384;
										if (local75 != -1 && local1878 != -1) {
											if (local75 == local1878) {
												local2000 = Static355.aClass278_2.method6826(local75);
												if (local2000.aBoolean450 && local2000.anInt6056 != -1) {
													local2016 = Static114.aClass156_2.method4101(local2000.anInt6056);
													local2325 = local2016.anInt581;
													if (local2325 == 0 || local2325 == 2) {
														local2282 = false;
													} else if (local2325 == 1) {
														local2282 = true;
													}
												}
											} else {
												local2000 = Static355.aClass278_2.method6826(local75);
												@Pc(2358) Class212 local2358 = Static355.aClass278_2.method6826(local1878);
												if (local2000.anInt6056 != -1 && local2358.anInt6056 != -1) {
													local2024 = Static114.aClass156_2.method4101(local2000.anInt6056);
													@Pc(2379) Class16 local2379 = Static114.aClass156_2.method4101(local2358.anInt6056);
													if (local2379.anInt582 > local2024.anInt582) {
														local2282 = false;
													}
												}
											}
										}
										if (local2282) {
											if (local1013) {
												local2275.anInt7423 = 1;
												local2275.anInt7402 = local208;
												local2275.anInt7409 = local221 & 0x7;
												local2275.anInt7360 = 0;
												local2275.anInt7393 = local75;
												local2275.anInt7425 = 0;
												local2275.anInt7385 = Static508.anInt8998 + local225;
												if (Static508.anInt8998 < local2275.anInt7385) {
													local2275.anInt7360 = -1;
												}
												if (local2275.anInt7393 != -1 && local2275.anInt7385 == Static508.anInt8998) {
													local1880 = Static355.aClass278_2.method6826(local2275.anInt7393).anInt6056;
													if (local1880 != -1) {
														local2016 = Static114.aClass156_2.method4101(local1880);
														if (local2016 != null && local2016.anIntArray47 != null) {
															Static360.method5794(local2275.anInt7347, local2016, local2275.anInt7351, local2275.aByte77, 0, false);
														}
													}
												}
											} else {
												local2275.anInt7417 = 0;
												local2275.anInt7405 = local225 + Static508.anInt8998;
												local2275.anInt7398 = 1;
												local2275.anInt7430 = local221 & 0x7;
												local2275.anInt7384 = local75;
												local2275.anInt7408 = 0;
												local2275.anInt7418 = local208;
												if (local2275.anInt7405 > Static508.anInt8998) {
													local2275.anInt7417 = -1;
												}
												if (local2275.anInt7384 != -1 && local2275.anInt7405 == Static508.anInt8998) {
													local1880 = Static355.aClass278_2.method6826(local2275.anInt7384).anInt6056;
													if (local1880 != -1) {
														local2016 = Static114.aClass156_2.method4101(local1880);
														if (local2016 != null && local2016.anIntArray47 != null) {
															Static360.method5794(local2275.anInt7347, local2016, local2275.anInt7351, local2275.aByte77, 0, false);
														}
													}
												}
											}
										}
									}
								} else if (local236 >> 28 != 0) {
									local1372 = local236 & 0xFFFF;
									@Pc(1951) Class11_Sub1_Sub1_Sub2 local1951;
									if (local1372 == Static412.anInt7714) {
										local1951 = Static350.aClass11_Sub1_Sub1_Sub2_4;
									} else {
										local1951 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local1372];
									}
									if (local1951 != null) {
										if (local75 == 65535) {
											local75 = -1;
										}
										local1968 = true;
										local1872 = local1013 ? local1951.anInt7393 : local1951.anInt7384;
										@Pc(2056) Class16 local2056;
										if (local75 != -1 && local1872 != -1) {
											@Pc(1995) Class212 local1995;
											if (local75 == local1872) {
												local1995 = Static355.aClass278_2.method6826(local75);
												if (local1995.aBoolean450 && local1995.anInt6056 != -1) {
													local2056 = Static114.aClass156_2.method4101(local1995.anInt6056);
													local2059 = local2056.anInt581;
													if (local2059 == 0 || local2059 == 2) {
														local1968 = false;
													} else if (local2059 == 1) {
														local1968 = true;
													}
												}
											} else {
												local1995 = Static355.aClass278_2.method6826(local75);
												local2000 = Static355.aClass278_2.method6826(local1872);
												if (local1995.anInt6056 != -1 && local2000.anInt6056 != -1) {
													local2016 = Static114.aClass156_2.method4101(local1995.anInt6056);
													local2024 = Static114.aClass156_2.method4101(local2000.anInt6056);
													if (local2016.anInt582 < local2024.anInt582) {
														local1968 = false;
													}
												}
											}
										}
										if (local1968) {
											if (local1013) {
												local1951.anInt7402 = local208;
												local1951.anInt7409 = local221 & 0x7;
												local1951.anInt7360 = 0;
												local1951.anInt7385 = local225 + Static508.anInt8998;
												local1951.anInt7393 = local75;
												local1951.anInt7423 = 1;
												local1951.anInt7425 = 0;
												if (local1951.anInt7393 == 65535) {
													local1951.anInt7393 = -1;
												}
												if (Static508.anInt8998 < local1951.anInt7385) {
													local1951.anInt7360 = -1;
												}
												if (local1951.anInt7393 != -1 && local1951.anInt7385 == Static508.anInt8998) {
													local1878 = Static355.aClass278_2.method6826(local1951.anInt7393).anInt6056;
													if (local1878 != -1) {
														local2056 = Static114.aClass156_2.method4101(local1878);
														if (local2056 != null && local2056.anIntArray47 != null) {
															Static360.method5794(local1951.anInt7347, local2056, local1951.anInt7351, local1951.aByte77, 0, local1951 == Static350.aClass11_Sub1_Sub1_Sub2_4);
														}
													}
												}
											} else {
												local1951.anInt7417 = 0;
												local1951.anInt7405 = local225 + Static508.anInt8998;
												local1951.anInt7408 = 0;
												local1951.anInt7418 = local208;
												local1951.anInt7384 = local75;
												local1951.anInt7398 = 1;
												local1951.anInt7430 = local221 & 0x7;
												if (local1951.anInt7384 == 65535) {
													local1951.anInt7384 = -1;
												}
												if (local1951.anInt7405 > Static508.anInt8998) {
													local1951.anInt7417 = -1;
												}
												if (local1951.anInt7384 != -1 && Static508.anInt8998 == local1951.anInt7405) {
													local1878 = Static355.aClass278_2.method6826(local1951.anInt7384).anInt6056;
													if (local1878 != -1) {
														local2056 = Static114.aClass156_2.method4101(local1878);
														if (local2056 != null && local2056.anIntArray47 != null) {
															Static360.method5794(local1951.anInt7347, local2056, local1951.anInt7351, local1951.aByte77, 0, local1951 == Static350.aClass11_Sub1_Sub1_Sub2_4);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local1372 = local236 >> 28 & 0x3;
								local1043 = (local236 >> 14 & 0x3FFF) - Static191.anInt4147;
								local1103 = (local236 & 0x3FFF) - Static247.anInt5049;
								if (local1043 >= 0 && local1103 >= 0 && Static228.anInt4746 > local1043 && Static44.anInt1275 > local1103) {
									local1872 = local1043 * 512 + 256;
									local1878 = local1103 * 512 + 256;
									local1880 = local1372;
									if (local1372 < 3 && Static539.method7769(local1043, local1103)) {
										local1880 = local1372 + 1;
									}
									@Pc(1917) Class11_Sub1_Sub2 local1917 = new Class11_Sub1_Sub2(local75, 0, Static508.anInt8998, local1372, local1880, local1872, Static482.method7333(local1372, local1878, local1872) - local208, local1878, local1043, local1043, local1103, local1103, local221 & 0x7);
									Static409.aClass211_62.method5173(new Class6_Sub4_Sub17(local1917));
								}
							}
							Static180.aClass254_74 = null;
							return true;
						} else if (Static180.aClass254_74 == Static410.aClass254_140) {
							Static3.method5143(Static378.aClass117_13);
							Static180.aClass254_74 = null;
							return true;
						} else if (Static329.aClass254_115 == Static180.aClass254_74) {
							if (Static140.method2631(Static325.anInt6149)) {
								Static291.anInt5565 = (int) ((float) Static345.aClass6_Sub26_Sub2_1.method4999() * 2.5F);
							} else {
								Static291.anInt5565 = Static345.aClass6_Sub26_Sub2_1.method4999() * 30;
							}
							Static409.anInt7646 = Static32.anInt1035;
							Static180.aClass254_74 = null;
							return true;
						} else if (Static180.aClass254_74 == Static60.aClass254_33) {
							local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
							local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
							local221 = Static345.aClass6_Sub26_Sub2_1.method5000();
							local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
							local236 = Static345.aClass6_Sub26_Sub2_1.method4999();
							if (Static45.method1140(local225)) {
								Static339.method5354(7, local236, local75 << 16 | local208, local221);
							}
							Static180.aClass254_74 = null;
							return true;
						} else if (Static180.aClass254_74 == Static209.aClass254_82) {
							for (local208 = 0; local208 < Static239.aClass11_Sub1_Sub1_Sub2Array1.length; local208++) {
								if (Static239.aClass11_Sub1_Sub1_Sub2Array1[local208] != null) {
									Static239.aClass11_Sub1_Sub1_Sub2Array1[local208].anInt7387 = -1;
								}
							}
							for (local75 = 0; local75 < Static452.anInt8286; local75++) {
								Static9.aClass6_Sub33Array1[local75].aClass11_Sub1_Sub1_Sub1_2.anInt7387 = -1;
							}
							Static180.aClass254_74 = null;
							return true;
						} else {
							@Pc(2849) boolean local2849;
							@Pc(2872) Class241 local2872;
							if (Static180.aClass254_74 == Static518.aClass254_164) {
								Static91.anInt2223 = Static32.anInt1035;
								if (Static462.anInt8534 == 0) {
									Static309.aString68 = null;
									Static211.aClass241Array4 = null;
									Static180.aClass254_74 = null;
									Static569.aString114 = null;
									Static523.anInt9087 = 0;
									return true;
								}
								Static309.aString68 = Static345.aClass6_Sub26_Sub2_1.method4941();
								local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
								if (local331) {
									Static345.aClass6_Sub26_Sub2_1.method4941();
								}
								@Pc(2721) long local2721 = Static345.aClass6_Sub26_Sub2_1.method4935();
								Static569.aString114 = Static141.method2654(local2721);
								Static576.aByte108 = Static345.aClass6_Sub26_Sub2_1.method4972();
								local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
								if (local225 == 255) {
									Static180.aClass254_74 = null;
									return true;
								}
								Static523.anInt9087 = local225;
								@Pc(2747) Class241[] local2747 = new Class241[100];
								for (local242 = 0; local242 < Static523.anInt9087; local242++) {
									local2747[local242] = new Class241();
									local2747[local242].aString84 = Static345.aClass6_Sub26_Sub2_1.method4941();
									local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
									if (local331) {
										local2747[local242].aString85 = Static345.aClass6_Sub26_Sub2_1.method4941();
									} else {
										local2747[local242].aString85 = local2747[local242].aString84;
									}
									local2747[local242].aString83 = Static495.method7439(local2747[local242].aString85);
									local2747[local242].anInt7110 = Static345.aClass6_Sub26_Sub2_1.method4999();
									local2747[local242].aByte76 = Static345.aClass6_Sub26_Sub2_1.method4972();
									local2747[local242].aString82 = Static345.aClass6_Sub26_Sub2_1.method4941();
									if (local2747[local242].aString85.equals(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95)) {
										Static177.aByte40 = local2747[local242].aByte76;
									}
								}
								local1103 = Static523.anInt9087;
								while (local1103 > 0) {
									local1103--;
									local2849 = true;
									for (local1872 = 0; local1872 < local1103; local1872++) {
										if (local2747[local1872].aString83.compareTo(local2747[local1872 + 1].aString83) > 0) {
											local2872 = local2747[local1872];
											local2747[local1872] = local2747[local1872 + 1];
											local2849 = false;
											local2747[local1872 + 1] = local2872;
										}
									}
									if (local2849) {
										break;
									}
								}
								Static211.aClass241Array4 = local2747;
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static272.aClass254_99) {
								Static366.method5845(Static390.aBoolean536);
								Static180.aClass254_74 = null;
								return false;
							} else if (Static180.aClass254_74 == Static22.aClass254_16) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4978();
								local1427 = (local75 & 0x1) == 1;
								Static18.method846(local208, local1427);
								Static105.anIntArray182[Static222.anInt4654++ & 0x1F] = local208;
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static335.aClass254_119) {
								Static179.anInt3991 = Static345.aClass6_Sub26_Sub2_1.method4953();
								Static200.aBoolean349 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static349.aClass254_122) {
								local943 = Static345.aClass6_Sub26_Sub2_1.method4941();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
								local337 = Static96.aClass221_2.method5320(local75).method965(Static345.aClass6_Sub26_Sub2_1);
								Static510.method5612(19, local943, local943, local337, local75, null, local943, 0);
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static134.aClass254_160) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local221 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local225 = Static345.aClass6_Sub26_Sub2_1.method4999() << 2;
								local236 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local242 = Static345.aClass6_Sub26_Sub2_1.method4966();
								if (Static45.method1140(local208)) {
									Static400.method6288(local242, local221, local225, local236, local75);
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static126.aClass254_59) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local221 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local236 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local242 = Static345.aClass6_Sub26_Sub2_1.method4999();
								if (Static45.method1140(local208)) {
									Static518.aBooleanArray39[local75] = true;
									Static205.anIntArray283[local75] = local221;
									Static556.anIntArray818[local75] = local225;
									Static115.anIntArray203[local75] = local236;
									Static314.anIntArray573[local75] = local242;
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static37.aClass254_19 == Static180.aClass254_74) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4969();
								local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
								if (Static45.method1140(local221)) {
									Static333.method5301(local75, local208);
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static329.aClass254_116) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
								local75 = local208 >> 5;
								local221 = local208 & 0x1F;
								if (local221 == 0) {
									Static83.aClass332Array2[local75] = null;
									Static180.aClass254_74 = null;
									return true;
								}
								@Pc(3178) Class332 local3178 = new Class332();
								local3178.anInt9341 = local221;
								local3178.anInt9335 = Static345.aClass6_Sub26_Sub2_1.method4966();
								if (local3178.anInt9335 >= 0 && local3178.anInt9335 < Static447.aClass66Array10.length) {
									if (local3178.anInt9341 == 1 || local3178.anInt9341 == 10) {
										local3178.anInt9334 = Static345.aClass6_Sub26_Sub2_1.method4999();
										Static345.aClass6_Sub26_Sub2_1.anInt5769 += 6;
									} else if (local3178.anInt9341 >= 2 && local3178.anInt9341 <= 6) {
										if (local3178.anInt9341 == 2) {
											local3178.anInt9343 = 256;
											local3178.anInt9339 = 256;
										}
										if (local3178.anInt9341 == 3) {
											local3178.anInt9339 = 0;
											local3178.anInt9343 = 256;
										}
										if (local3178.anInt9341 == 4) {
											local3178.anInt9339 = 512;
											local3178.anInt9343 = 256;
										}
										if (local3178.anInt9341 == 5) {
											local3178.anInt9339 = 256;
											local3178.anInt9343 = 0;
										}
										if (local3178.anInt9341 == 6) {
											local3178.anInt9339 = 256;
											local3178.anInt9343 = 512;
										}
										local3178.anInt9341 = 2;
										local3178.anInt9338 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local3178.anInt9339 += Static345.aClass6_Sub26_Sub2_1.method4999() - Static191.anInt4147 << 9;
										local3178.anInt9343 += Static345.aClass6_Sub26_Sub2_1.method4999() - Static247.anInt5049 << 9;
										local3178.anInt9340 = Static345.aClass6_Sub26_Sub2_1.method4966() << 2;
										local3178.anInt9337 = Static345.aClass6_Sub26_Sub2_1.method4999();
									}
									local3178.anInt9342 = Static345.aClass6_Sub26_Sub2_1.method4999();
									if (local3178.anInt9342 == 65535) {
										local3178.anInt9342 = -1;
									}
									Static83.aClass332Array2[local75] = local3178;
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static279.aClass254_100) {
								Static180.anInt4052 = Static345.aClass6_Sub26_Sub2_1.method4966();
								Static409.anInt7646 = Static32.anInt1035;
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static229.aClass254_86) {
								local208 = Static345.aClass6_Sub26_Sub2_1.method4957();
								local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
								@Pc(3384) byte local3384 = Static345.aClass6_Sub26_Sub2_1.method4980();
								if (Static45.method1140(local75)) {
									Static460.method7137(local208, local3384);
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static10.aClass254_9 == Static180.aClass254_74) {
								local943 = Static345.aClass6_Sub26_Sub2_1.method4941();
								local1427 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
								if (local1427) {
									local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
								} else {
									local335 = local943;
								}
								local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
								@Pc(3434) byte local3434 = Static345.aClass6_Sub26_Sub2_1.method4972();
								local1013 = false;
								if (local3434 == -128) {
									local1013 = true;
								}
								if (local1013) {
									if (Static523.anInt9087 == 0) {
										Static180.aClass254_74 = null;
										return true;
									}
									for (local1372 = 0; Static523.anInt9087 > local1372 && (!Static211.aClass241Array4[local1372].aString85.equals(local335) || Static211.aClass241Array4[local1372].anInt7110 != local225); local1372++) {
									}
									if (local1372 < Static523.anInt9087) {
										while (Static523.anInt9087 - 1 > local1372) {
											Static211.aClass241Array4[local1372] = Static211.aClass241Array4[local1372 + 1];
											local1372++;
										}
										Static523.anInt9087--;
										Static211.aClass241Array4[Static523.anInt9087] = null;
									}
								} else {
									local1062 = Static345.aClass6_Sub26_Sub2_1.method4941();
									local2872 = new Class241();
									local2872.aString85 = local335;
									local2872.aString84 = local943;
									local2872.aString83 = Static495.method7439(local2872.aString85);
									local2872.aString82 = local1062;
									local2872.aByte76 = local3434;
									local2872.anInt7110 = local225;
									for (local1103 = Static523.anInt9087 - 1; local1103 >= 0; local1103--) {
										local1872 = Static211.aClass241Array4[local1103].aString83.compareTo(local2872.aString83);
										if (local1872 == 0) {
											Static211.aClass241Array4[local1103].anInt7110 = local225;
											Static211.aClass241Array4[local1103].aByte76 = local3434;
											Static211.aClass241Array4[local1103].aString82 = local1062;
											if (local335.equals(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95)) {
												Static177.aByte40 = local3434;
											}
											Static91.anInt2223 = Static32.anInt1035;
											Static180.aClass254_74 = null;
											return true;
										}
										if (local1872 < 0) {
											break;
										}
									}
									if (Static523.anInt9087 >= Static211.aClass241Array4.length) {
										Static180.aClass254_74 = null;
										return true;
									}
									for (local1872 = Static523.anInt9087 - 1; local1872 > local1103; local1872--) {
										Static211.aClass241Array4[local1872 + 1] = Static211.aClass241Array4[local1872];
									}
									if (Static523.anInt9087 == 0) {
										Static211.aClass241Array4 = new Class241[100];
									}
									Static211.aClass241Array4[local1103 + 1] = local2872;
									Static523.anInt9087++;
									if (local335.equals(Static350.aClass11_Sub1_Sub1_Sub2_4.aString95)) {
										Static177.aByte40 = local3434;
									}
								}
								Static180.aClass254_74 = null;
								Static91.anInt2223 = Static32.anInt1035;
								return true;
							} else if (Static180.aClass254_74 == Static573.aClass254_177) {
								while (Static345.aClass6_Sub26_Sub2_1.anInt5769 < Static462.anInt8534) {
									local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
									local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
									local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
									local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
									local236 = Static345.aClass6_Sub26_Sub2_1.method4966();
									local383 = "";
									local2849 = false;
									if (local225 > 0) {
										local383 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local2849 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
									}
									for (local1043 = 0; local1043 < Static241.anInt4921; local1043++) {
										if (local331) {
											if (local337.equals(Static381.aStringArray42[local1043])) {
												Static381.aStringArray42[local1043] = local335;
												local335 = null;
												Static87.aStringArray9[local1043] = local337;
												break;
											}
										} else if (local335.equals(Static381.aStringArray42[local1043])) {
											if (Static331.anIntArray846[local1043] != local225) {
												local1968 = true;
												for (@Pc(3754) Class5_Sub1_Sub2 local3754 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6544(); local3754 != null; local3754 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6543()) {
													if (local3754.aString53.equals(local335)) {
														if (local225 != 0 && local3754.aShort43 == 0) {
															local1968 = false;
															local3754.method7282();
														} else if (local225 == 0 && local3754.aShort43 != 0) {
															local1968 = false;
															local3754.method7282();
														}
													}
												}
												if (local1968) {
													Static188.aClass267_3.method6538(new Class5_Sub1_Sub2(local335, local225));
												}
												Static331.anIntArray846[local1043] = local225;
											}
											Static87.aStringArray9[local1043] = local337;
											Static208.aStringArray25[local1043] = local383;
											Static578.anIntArray844[local1043] = local236;
											Static199.aBooleanArray13[local1043] = local2849;
											local335 = null;
											break;
										}
									}
									if (local335 != null && Static241.anInt4921 < 200) {
										Static381.aStringArray42[Static241.anInt4921] = local335;
										Static87.aStringArray9[Static241.anInt4921] = local337;
										Static331.anIntArray846[Static241.anInt4921] = local225;
										Static208.aStringArray25[Static241.anInt4921] = local383;
										Static578.anIntArray844[Static241.anInt4921] = local236;
										Static199.aBooleanArray13[Static241.anInt4921] = local2849;
										Static241.anInt4921++;
									}
								}
								Static435.anInt7934 = 2;
								Static435.anInt7935 = Static32.anInt1035;
								local75 = Static241.anInt4921;
								while (local75 > 0) {
									local331 = true;
									local75--;
									for (local221 = 0; local221 < local75; local221++) {
										if (Static331.anIntArray846[local221] != Static293.aClass275_2.anInt7968 && Static293.aClass275_2.anInt7968 == Static331.anIntArray846[local221 + 1] || Static331.anIntArray846[local221] == 0 && Static331.anIntArray846[local221 + 1] != 0) {
											local225 = Static331.anIntArray846[local221];
											Static331.anIntArray846[local221] = Static331.anIntArray846[local221 + 1];
											Static331.anIntArray846[local221 + 1] = local225;
											local1698 = Static208.aStringArray25[local221];
											Static208.aStringArray25[local221] = Static208.aStringArray25[local221 + 1];
											Static208.aStringArray25[local221 + 1] = local1698;
											local383 = Static381.aStringArray42[local221];
											Static381.aStringArray42[local221] = Static381.aStringArray42[local221 + 1];
											Static381.aStringArray42[local221 + 1] = local383;
											local1062 = Static87.aStringArray9[local221];
											Static87.aStringArray9[local221] = Static87.aStringArray9[local221 + 1];
											Static87.aStringArray9[local221 + 1] = local1062;
											local1043 = Static578.anIntArray844[local221];
											Static578.anIntArray844[local221] = Static578.anIntArray844[local221 + 1];
											Static578.anIntArray844[local221 + 1] = local1043;
											local1968 = Static199.aBooleanArray13[local221];
											Static199.aBooleanArray13[local221] = Static199.aBooleanArray13[local221 + 1];
											Static199.aBooleanArray13[local221 + 1] = local1968;
											local331 = false;
										}
									}
									if (local331) {
										break;
									}
								}
								Static180.aClass254_74 = null;
								return true;
							} else if (Static180.aClass254_74 == Static150.aClass254_137) {
								Static314.method6696();
								Static180.aClass254_74 = null;
								return false;
							} else {
								@Pc(4089) Class6_Sub48 local4089;
								if (Static180.aClass254_74 == Static52.aClass254_27) {
									local208 = Static345.aClass6_Sub26_Sub2_1.method4969();
									local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
									local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
									local225 = Static345.aClass6_Sub26_Sub2_1.method4954();
									if (Static45.method1140(local221)) {
										local4089 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local208);
										if (local4089 != null) {
											Static551.method7862(local4089.anInt9207 != local75, false, local4089);
										}
										Static567.method6404(local225, false, local75, local208);
									}
									Static180.aClass254_74 = null;
									return true;
								} else if (Static112.aClass254_51 == Static180.aClass254_74) {
									local208 = Static345.aClass6_Sub26_Sub2_1.method4985();
									local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
									local221 = Static345.aClass6_Sub26_Sub2_1.method4967();
									if (Static45.method1140(local221)) {
										Static529.method7709(local208, local75);
									}
									Static180.aClass254_74 = null;
									return true;
								} else if (Static180.aClass254_74 == Static81.aClass254_37) {
									Static518.method7592(Static345.aClass6_Sub26_Sub2_1.method4941());
									Static180.aClass254_74 = null;
									return true;
								} else {
									@Pc(4198) long local4198;
									@Pc(4188) long local4188;
									@Pc(4193) long local4193;
									if (Static258.aClass254_95 == Static180.aClass254_74) {
										local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local337 = local335;
										if (local331) {
											local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
										}
										local4188 = Static345.aClass6_Sub26_Sub2_1.method4935();
										local4193 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local4198 = Static345.aClass6_Sub26_Sub2_1.method4949();
										local1872 = Static345.aClass6_Sub26_Sub2_1.method4966();
										@Pc(4208) long local4208 = (local4193 << 32) + local4198;
										@Pc(4210) boolean local4210 = false;
										local2325 = 0;
										while (true) {
											if (local2325 >= 100) {
												if (local1872 <= 1) {
													if (Static200.aBoolean349 && !Static554.aBoolean702 || Static245.aBoolean376) {
														local4210 = true;
													} else if (Static178.method3528(local337)) {
														local4210 = true;
													}
												}
												break;
											}
											if (local4208 == Static475.aLongArray10[local2325]) {
												local4210 = true;
												break;
											}
											local2325++;
										}
										if (!local4210 && Static119.anInt2416 == 0) {
											Static475.aLongArray10[Static269.anInt5294] = local4208;
											Static269.anInt5294 = (Static269.anInt5294 + 1) % 100;
											@Pc(4267) String local4267 = Static177.method3519(Static540.method8015(Static345.aClass6_Sub26_Sub2_1));
											if (local1872 == 2 || local1872 == 3) {
												Static510.method5612(9, "<img=1>" + local337, "<img=1>" + local335, local4267, -1, Static395.method6255(local4188), local335, 0);
											} else if (local1872 == 1) {
												Static510.method5612(9, "<img=0>" + local337, "<img=0>" + local335, local4267, -1, Static395.method6255(local4188), local335, 0);
											} else {
												Static510.method5612(9, local337, local335, local4267, -1, Static395.method6255(local4188), local335, 0);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static148.aClass254_181) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4958();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4967();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4983();
										if (local221 == 65535) {
											local221 = -1;
										}
										if (Static45.method1140(local75)) {
											Static66.method1373(local208, local221);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static414.aClass254_141) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4958();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4940();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
										if (Static45.method1140(local221)) {
											Static554.method7901(local75, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static236.aClass254_87) {
										local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local337 = local335;
										if (local331) {
											local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
										}
										local4188 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local4193 = Static345.aClass6_Sub26_Sub2_1.method4949();
										local1043 = Static345.aClass6_Sub26_Sub2_1.method4966();
										@Pc(4465) long local4465 = local4193 + (local4188 << 32);
										@Pc(4467) boolean local4467 = false;
										local1880 = 0;
										while (true) {
											if (local1880 >= 100) {
												if (local1043 <= 1) {
													if (Static200.aBoolean349 && !Static554.aBoolean702 || Static245.aBoolean376) {
														local4467 = true;
													} else if (Static178.method3528(local337)) {
														local4467 = true;
													}
												}
												break;
											}
											if (Static475.aLongArray10[local1880] == local4465) {
												local4467 = true;
												break;
											}
											local1880++;
										}
										if (!local4467 && Static119.anInt2416 == 0) {
											Static475.aLongArray10[Static269.anInt5294] = local4465;
											Static269.anInt5294 = (Static269.anInt5294 + 1) % 100;
											@Pc(4535) String local4535 = Static177.method3519(Static540.method8015(Static345.aClass6_Sub26_Sub2_1));
											if (local1043 == 2) {
												Static510.method5612(7, "<img=1>" + local337, "<img=1>" + local335, local4535, -1, null, local335, 0);
											} else if (local1043 == 1) {
												Static510.method5612(7, "<img=0>" + local337, "<img=0>" + local335, local4535, -1, null, local335, 0);
											} else {
												Static510.method5612(3, local337, local335, local4535, -1, null, local335, 0);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static575.aClass254_180) {
										if (Static6.anInt302 != -1) {
											Static417.method6511(Static6.anInt302, 0);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static8.aClass254_8) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4983();
										if (Static45.method1140(local75)) {
											Static67.method1399(local221, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static574.aClass254_178 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
										if (local208 == 65535) {
											local208 = -1;
										}
										local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4954();
										Static496.method7444(local221, local75, local208);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static189.aClass254_75) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4988();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
										if (local75 == 65535) {
											local75 = -1;
										}
										local221 = Static345.aClass6_Sub26_Sub2_1.method4968();
										Static204.method3800(local75, local208, local221);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static380.aClass254_131) {
										Static427.aString115 = Static462.anInt8534 <= 2 ? Static222.aClass152_71.method4002(Static286.anInt5468) : Static345.aClass6_Sub26_Sub2_1.method4941();
										Static380.anInt7112 = Static462.anInt8534 > 0 ? Static345.aClass6_Sub26_Sub2_1.method4999() : -1;
										if (Static380.anInt7112 == 65535) {
											Static380.anInt7112 = -1;
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static260.aClass254_97 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										@Pc(4750) byte local4750 = Static345.aClass6_Sub26_Sub2_1.method4972();
										Static435.aClass234_1.method5834(local4750, local208);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static342.aClass254_120 == Static180.aClass254_74) {
										Static3.method5143(Static236.aClass117_8);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static167.aClass254_72) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4958();
										if (Static45.method1140(local208)) {
											Static339.method5354(5, 0, Static412.anInt7714, local75);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static287.aClass254_104) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method5000();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4967();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4969();
										if (Static45.method1140(local221)) {
											Static339.method5354(5, local225, local75, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static201.aClass254_79 == Static180.aClass254_74) {
										Static426.anInt7851 = Static345.aClass6_Sub26_Sub2_1.method4966();
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static402.aClass254_176) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method5000();
										if (Static45.method1140(local208)) {
											@Pc(4866) Class6_Sub48 local4866 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local75);
											if (local4866 != null) {
												Static551.method7862(true, false, local4866);
											}
											if (Static469.aClass93_15 != null) {
												Static468.method7221(Static469.aClass93_15);
												Static469.aClass93_15 = null;
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static292.aClass254_109 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4973();
										local75 = Static345.aClass6_Sub26_Sub2_1.method5000();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local1688 = "";
										local1698 = local1688;
										if ((local221 & 0x1) != 0) {
											local1688 = Static345.aClass6_Sub26_Sub2_1.method4941();
											if ((local221 & 0x2) == 0) {
												local1698 = local1688;
											} else {
												local1698 = Static345.aClass6_Sub26_Sub2_1.method4941();
											}
										}
										local383 = Static345.aClass6_Sub26_Sub2_1.method4941();
										if (local208 == 99) {
											Static280.method3700(local383);
										} else if (local1698.equals("") || !Static178.method3528(local1698)) {
											method4595(local1688, local208, local1698, local1688, local75, local383);
										} else {
											Static180.aClass254_74 = null;
											return true;
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static156.aClass254_68 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4957();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4958();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4967();
										if (Static45.method1140(local225)) {
											Static430.method840(local75, local221 + (local208 << 16));
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static575.aClass254_179 == Static180.aClass254_74) {
										Static3.method5143(Static62.aClass117_12);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static421.aClass254_142) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4969();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
										if (Static45.method1140(local75)) {
											Static412.method6434(local221, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static22.aClass254_15) {
										Static60.method1327(Static345.aClass6_Sub26_Sub2_1, Static414.aClass246_5, Static462.anInt8534);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static514.aClass254_162 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										if (local208 == 65535) {
											local208 = -1;
										}
										local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
										Static96.method2072(local75, local221, local225, true, local208);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static71.aClass254_35) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local1427 = (local75 & 0x1) == 1;
										Static238.method4201(local1427, local208);
										local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
										for (local236 = 0; local236 < local225; local236++) {
											local242 = Static345.aClass6_Sub26_Sub2_1.method4954();
											if (local242 == 255) {
												local242 = Static345.aClass6_Sub26_Sub2_1.method4985();
											}
											local1372 = Static345.aClass6_Sub26_Sub2_1.method4999();
											Static42.method1133(local1372 - 1, local236, local242, local208, local1427);
										}
										Static105.anIntArray182[Static222.anInt4654++ & 0x1F] = local208;
										Static180.aClass254_74 = null;
										return true;
									} else if (Static66.aClass254_34 == Static180.aClass254_74) {
										local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local337 = local335;
										if (local331) {
											local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
										}
										local4188 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local4193 = Static345.aClass6_Sub26_Sub2_1.method4949();
										local1043 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local1103 = Static345.aClass6_Sub26_Sub2_1.method4999();
										@Pc(5230) long local5230 = (local4188 << 32) + local4193;
										@Pc(5232) boolean local5232 = false;
										local2059 = 0;
										while (true) {
											if (local2059 >= 100) {
												if (local1043 <= 1 && Static178.method3528(local337)) {
													local5232 = true;
												}
												break;
											}
											if (local5230 == Static475.aLongArray10[local2059]) {
												local5232 = true;
												break;
											}
											local2059++;
										}
										if (!local5232 && Static119.anInt2416 == 0) {
											Static475.aLongArray10[Static269.anInt5294] = local5230;
											Static269.anInt5294 = (Static269.anInt5294 + 1) % 100;
											@Pc(5286) String local5286 = Static96.aClass221_2.method5320(local1103).method965(Static345.aClass6_Sub26_Sub2_1);
											if (local1043 == 2) {
												Static510.method5612(18, "<img=1>" + local337, "<img=1>" + local335, local5286, local1103, null, local335, 0);
											} else if (local1043 == 1) {
												Static510.method5612(18, "<img=0>" + local337, "<img=0>" + local335, local5286, local1103, null, local335, 0);
											} else {
												Static510.method5612(18, local337, local335, local5286, local1103, null, local335, 0);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static515.aClass254_146) {
										Static3.method5143(Static308.aClass117_10);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static524.aClass254_167 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4940();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4940();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4985();
										if (Static45.method1140(local208)) {
											Static448.method6876(local75, local225, local221);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static126.aClass254_58 == Static180.aClass254_74) {
										Static127.anInt2741 = Static345.aClass6_Sub26_Sub2_1.method4974();
										Static180.aClass254_74 = null;
										Static409.anInt7646 = Static32.anInt1035;
										return true;
									} else if (Static59.aClass254_32 == Static180.aClass254_74) {
										Static560.anInt9526 = Static345.aClass6_Sub26_Sub2_1.method4972() << 3;
										Static147.anInt3044 = Static345.aClass6_Sub26_Sub2_1.method4954();
										Static314.anInt8006 = Static345.aClass6_Sub26_Sub2_1.method4980() << 3;
										for (@Pc(5435) Class6_Sub35 local5435 = (Class6_Sub35) Static516.aClass305_37.method7445(); local5435 != null; local5435 = (Class6_Sub35) Static516.aClass305_37.method7449()) {
											local75 = (int) (local5435.aLong252 >> 28 & 0x3L);
											local221 = (int) (local5435.aLong252 & 0x3FFFL);
											local225 = local221 - Static191.anInt4147;
											local236 = (int) (local5435.aLong252 >> 14 & 0x3FFFL);
											local242 = local236 - Static247.anInt5049;
											if (local75 == Static147.anInt3044 && local225 >= Static560.anInt9526 && Static560.anInt9526 + 8 > local225 && Static314.anInt8006 <= local242 && local242 < Static314.anInt8006 + 8) {
												local5435.method8151();
												if (local225 >= 0 && local242 >= 0 && local225 < Static228.anInt4746 && Static44.anInt1275 > local242) {
													Static337.method5317(local225, Static147.anInt3044, local242);
												}
											}
										}
										for (@Pc(5542) Class6_Sub41 local5542 = (Class6_Sub41) Static532.aClass211_72.method5183(); local5542 != null; local5542 = (Class6_Sub41) Static532.aClass211_72.method5177()) {
											if (local5542.anInt8273 >= Static560.anInt9526 && local5542.anInt8273 < Static560.anInt9526 + 8 && local5542.anInt8275 >= Static314.anInt8006 && local5542.anInt8275 < Static314.anInt8006 + 8 && Static147.anInt3044 == local5542.anInt8271) {
												local5542.anInt8267 = 0;
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static247.aClass254_93) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method5000();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4957();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										if (Static45.method1140(local75)) {
											Static123.method2426(local221, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static124.aClass254_55) {
										if (Static345.aFrame2 != null) {
											Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
										}
										@Pc(5636) byte[] local5636 = new byte[Static462.anInt8534];
										Static345.aClass6_Sub26_Sub2_1.method5001(local5636, Static462.anInt8534);
										local335 = Static211.method8131(Static462.anInt8534, 0, local5636);
										Static367.method5851(Static414.aClass246_5, true, local335, Static5.anInt145 == 1);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static532.aClass254_170) {
										local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local337 = local335;
										if (local331) {
											local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
										}
										local225 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local236 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local1013 = false;
										if (local225 <= 1 && Static178.method3528(local337)) {
											local1013 = true;
										}
										if (!local1013 && Static119.anInt2416 == 0) {
											local1062 = Static96.aClass221_2.method5320(local236).method965(Static345.aClass6_Sub26_Sub2_1);
											if (local225 == 2) {
												Static510.method5612(25, "<img=1>" + local337, "<img=1>" + local335, local1062, local236, null, local335, 0);
											} else if (local225 == 1) {
												Static510.method5612(25, "<img=0>" + local337, "<img=0>" + local335, local1062, local236, null, local335, 0);
											} else {
												Static510.method5612(25, local337, local335, local1062, local236, null, local335, 0);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static178.aClass254_73) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4978();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4978();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4958();
										Static313.anIntArray767[local75] = local221;
										Static499.anIntArray785[local75] = local208;
										Static566.anIntArray824[local75] = 1;
										local225 = Static307.anIntArray100[local75] - 1;
										for (local236 = 0; local236 < local225; local236++) {
											if (Class179_Sub2.anIntArray760[local236] <= local221) {
												Static566.anIntArray824[local75] = local236 + 2;
											}
										}
										Static382.anIntArray504[Static321.anInt6070++ & 0x1F] = local75;
										Static180.aClass254_74 = null;
										return true;
									} else if (Static128.aClass254_60 == Static180.aClass254_74) {
										Static3.method5143(Static532.aClass117_15);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static324.aClass254_113) {
										Static3.method5143(Static167.aClass117_7);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static216.aClass254_85) {
										Static3.method5143(Static453.aClass117_14);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static476.aClass254_151) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4985();
										if (Static45.method1140(local208)) {
											Static339.method5354(3, -1, -1, local75);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static281.aClass254_102 == Static180.aClass254_74) {
										Static3.method5143(Static161.aClass117_5);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static133.aClass254_61) {
										Static513.anInt9024 = Static345.aClass6_Sub26_Sub2_1.method4966();
										Static140.anInt2983 = Static345.aClass6_Sub26_Sub2_1.method4978();
										Static180.aClass254_74 = null;
										return true;
									} else if (Static51.aClass254_26 == Static180.aClass254_74) {
										Static220.method3992();
										Static180.aClass254_74 = null;
										return false;
									} else if (Static428.aClass254_147 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4967();
										local75 = Static345.aClass6_Sub26_Sub2_1.method5000();
										local221 = Static345.aClass6_Sub26_Sub2_1.method5000();
										if (Static45.method1140(local208)) {
											@Pc(5980) Class6_Sub48 local5980 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local75);
											local4089 = (Class6_Sub48) Static459.aClass305_24.method7447((long) local221);
											if (local4089 != null) {
												Static551.method7862(local5980 == null || local5980.anInt9207 != local4089.anInt9207, false, local4089);
											}
											if (local5980 != null) {
												local5980.method8151();
												Static459.aClass305_24.method7448((long) local221, local5980);
											}
											@Pc(6018) Class93 local6018 = Static223.method4011(local75);
											if (local6018 != null) {
												Static468.method7221(local6018);
											}
											local6018 = Static223.method4011(local221);
											if (local6018 != null) {
												Static468.method7221(local6018);
												Static29.method991(local6018, true);
											}
											if (Static6.anInt302 != -1) {
												Static417.method6511(Static6.anInt302, 1);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static268.aClass254_159) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
										if (local75 == 65535) {
											local75 = -1;
										}
										local221 = Static345.aClass6_Sub26_Sub2_1.method4988();
										local1688 = Static345.aClass6_Sub26_Sub2_1.method4941();
										if (local208 >= 1 && local208 <= 8) {
											if (local1688.equalsIgnoreCase("null")) {
												local1688 = null;
											}
											Static301.aStringArray31[local208 - 1] = local1688;
											Static396.anIntArray529[local208 - 1] = local75;
											Static194.aBooleanArray12[local208 - 1] = local221 == 0;
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static115.aClass254_52 == Static180.aClass254_74) {
										Static3.method5143(Static70.aClass117_3);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static124.aClass254_54) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local221 = Static345.aClass6_Sub26_Sub2_1.method5000();
										if (Static45.method1140(local208)) {
											Static446.method5097(local221, local335);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static33.aClass254_18) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method5000();
										Static255.aClass280_4 = Static414.aClass246_5.method6142(local208);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static13.aClass254_10 == Static180.aClass254_74) {
										Static180.aClass254_74 = null;
										return false;
									} else if (Static279.aClass254_101 == Static180.aClass254_74) {
										Static3.method5143(Static541.aClass117_17);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static247.aClass254_92) {
										local331 = Static345.aClass6_Sub26_Sub2_1.method4966() == 1;
										local335 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local337 = local335;
										if (local331) {
											local337 = Static345.aClass6_Sub26_Sub2_1.method4941();
										}
										local4188 = Static345.aClass6_Sub26_Sub2_1.method4935();
										local4193 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local4198 = Static345.aClass6_Sub26_Sub2_1.method4949();
										local1872 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local1878 = Static345.aClass6_Sub26_Sub2_1.method4999();
										@Pc(6253) long local6253 = (local4193 << 32) + local4198;
										@Pc(6255) boolean local6255 = false;
										@Pc(6257) int local6257 = 0;
										while (true) {
											if (local6257 >= 100) {
												if (local1872 <= 1 && Static178.method3528(local337)) {
													local6255 = true;
												}
												break;
											}
											if (Static475.aLongArray10[local6257] == local6253) {
												local6255 = true;
												break;
											}
											local6257++;
										}
										if (!local6255 && Static119.anInt2416 == 0) {
											Static475.aLongArray10[Static269.anInt5294] = local6253;
											Static269.anInt5294 = (Static269.anInt5294 + 1) % 100;
											@Pc(6306) String local6306 = Static96.aClass221_2.method5320(local1878).method965(Static345.aClass6_Sub26_Sub2_1);
											if (local1872 == 2) {
												Static510.method5612(20, "<img=1>" + local337, "<img=1>" + local335, local6306, local1878, Static395.method6255(local4188), local335, 0);
											} else if (local1872 == 1) {
												Static510.method5612(20, "<img=0>" + local337, "<img=0>" + local335, local6306, local1878, Static395.method6255(local4188), local335, 0);
											} else {
												Static510.method5612(20, local337, local335, local6306, local1878, Static395.method6255(local4188), local335, 0);
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static45.aClass254_20 == Static180.aClass254_74) {
										Static104.anInt7872 = Static345.aClass6_Sub26_Sub2_1.method4966();
										for (local208 = 0; local208 < Static104.anInt7872; local208++) {
											Static60.aStringArray7[local208] = Static345.aClass6_Sub26_Sub2_1.method4941();
											Static548.aStringArray49[local208] = Static345.aClass6_Sub26_Sub2_1.method4941();
											if (Static548.aStringArray49[local208].equals("")) {
												Static548.aStringArray49[local208] = Static60.aStringArray7[local208];
											}
											Static437.aStringArray46[local208] = Static345.aClass6_Sub26_Sub2_1.method4941();
											Static444.aStringArray47[local208] = Static345.aClass6_Sub26_Sub2_1.method4941();
											if (Static444.aStringArray47[local208].equals("")) {
												Static444.aStringArray47[local208] = Static437.aStringArray46[local208];
											}
											Static354.aBooleanArray24[local208] = false;
										}
										Static435.anInt7935 = Static32.anInt1035;
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static561.aClass254_46) {
										Static61.method1331(Static462.anInt8534, Static345.aClass6_Sub26_Sub2_1);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static493.aClass254_155) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4967();
										Static435.aClass234_1.method5837(local208, local75);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static151.aClass254_67 == Static180.aClass254_74) {
										Static345.aClass6_Sub26_Sub2_1.anInt5769 += 28;
										if (Static345.aClass6_Sub26_Sub2_1.method4952()) {
											Static10.method621(Static345.aClass6_Sub26_Sub2_1.anInt5769 - 28, Static345.aClass6_Sub26_Sub2_1);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static287.aClass254_105) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method5000();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										if (Static45.method1140(local221)) {
											Static460.method7137(local208, local75);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static559.aClass254_169) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4999();
										if (Static45.method1140(local208) && Static336.aClass93ArrayArray2[local75] != null) {
											for (local236 = local221; local236 < local225; local236++) {
												local242 = Static345.aClass6_Sub26_Sub2_1.method4949();
												if (Static336.aClass93ArrayArray2[local75].length > local236 && Static336.aClass93ArrayArray2[local75][local236] != null) {
													Static336.aClass93ArrayArray2[local75][local236].anInt2804 = local242;
												}
											}
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static477.aClass254_152 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4966();
										if (Static345.aClass6_Sub26_Sub2_1.method4966() == 0) {
											Static572.aClass48Array1[local208] = new Class48();
										} else {
											Static345.aClass6_Sub26_Sub2_1.anInt5769--;
											Static572.aClass48Array1[local208] = new Class48(Static345.aClass6_Sub26_Sub2_1);
										}
										Static180.aClass254_74 = null;
										Static454.anInt8400 = Static32.anInt1035;
										return true;
									} else if (Static180.aClass254_74 == Static365.aClass254_125) {
										local943 = Static345.aClass6_Sub26_Sub2_1.method4941();
										local335 = Static177.method3519(Static540.method8015(Static345.aClass6_Sub26_Sub2_1));
										method4595(local943, 6, local943, local943, 0, local335);
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static4.aClass254_1) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4958();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4957();
										if (local221 == 65535) {
											local221 = -1;
										}
										local225 = Static345.aClass6_Sub26_Sub2_1.method4985();
										if (Static45.method1140(local208)) {
											Static176.method3518(local221, local225, local75);
											@Pc(6727) Class145 local6727 = Static98.aClass203_1.method4899(local221);
											Static271.method4569(local6727.anInt4465, local6727.anInt4470, local225, local6727.anInt4463);
											Static125.method2482(local6727.anInt4441, local6727.anInt4461, local225, local6727.anInt4449);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static180.aClass254_74 == Static520.aClass254_165) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4999() << 2;
										local236 = Static345.aClass6_Sub26_Sub2_1.method4966();
										local242 = Static345.aClass6_Sub26_Sub2_1.method4966();
										if (Static45.method1140(local208)) {
											Static350.method5060(local221, local236, local75, local242, local225, true);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static260.aClass254_96 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4969();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4999();
										local225 = Static345.aClass6_Sub26_Sub2_1.method4957();
										local236 = Static345.aClass6_Sub26_Sub2_1.method4983();
										if (Static45.method1140(local225)) {
											Static271.method4569(local236, local221, local208, local75);
										}
										Static180.aClass254_74 = null;
										return true;
									} else if (Static441.aClass254_144 == Static180.aClass254_74) {
										local208 = Static345.aClass6_Sub26_Sub2_1.method4957();
										local75 = Static345.aClass6_Sub26_Sub2_1.method4983();
										local221 = Static345.aClass6_Sub26_Sub2_1.method4988();
										@Pc(6867) Class6_Sub33 local6867 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local75);
										if (local6867 != null) {
											Static60.method1328(local6867.aClass11_Sub1_Sub1_Sub1_2, local221, local208);
										}
										Static180.aClass254_74 = null;
										return true;
									} else {
										Static5.method211(null, "T1 - " + (Static180.aClass254_74 == null ? -1 : Static180.aClass254_74.method6299()) + "," + (Static467.aClass254_148 == null ? -1 : Static467.aClass254_148.method6299()) + "," + (Static555.aClass254_173 == null ? -1 : Static555.aClass254_173.method6299()) + " - " + Static462.anInt8534);
										Static366.method5845(false);
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	public static void method4599() {
		@Pc(7) Class155 local7 = null;
		try {
			local7 = Static389.method6137("2");
			@Pc(20) Class6_Sub26 local20 = new Class6_Sub26(Static79.anInt9882 * 6 + 3);
			local20.method4950(1, -81849);
			local20.method4962(Static79.anInt9882);
			for (@Pc(37) int local37 = 0; local37 < Static67.anIntArray106.length; local37++) {
				if (Static30.aBooleanArray4[local37]) {
					local20.method4962(local37);
					local20.method4979(Static67.anIntArray106[local37]);
				}
			}
			local7.method4079(local20.anInt5769, local20.aByteArray65, 0);
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method4077();
			}
		} catch (@Pc(81) Exception local81) {
		}
		Static110.aLong56 = Static174.method3502();
		Static321.aBoolean451 = false;
	}
}
