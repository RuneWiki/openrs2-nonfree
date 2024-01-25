import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!og", name = "Xc", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Z")
	public static boolean method5578(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 49 || arg0 == 3 || arg0 == 16 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
	public static void method5579(@OriginalArg(0) int arg0) {
		Static128.anInt2812 = arg0;
		@Pc(11) Class10 local11 = Static529.aClass10_60;
		synchronized (Static529.aClass10_60) {
			Static529.aClass10_60.method263();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBILclient!saa;)V")
	public static void method5583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub44 arg2) {
		if (arg2 == null || Static187.aClass130_15.aClass3_121 == arg2) {
			return;
		}
		@Pc(20) int local20 = arg2.anInt7684;
		@Pc(23) int local23 = arg2.anInt7687;
		@Pc(26) int local26 = arg2.anInt7685;
		@Pc(30) int local30 = (int) arg2.aLong219;
		@Pc(33) long local33 = arg2.aLong219;
		if (local26 >= 2000) {
			local26 -= 2000;
		}
		@Pc(61) Class3_Sub34 local61;
		if (local26 == 1007) {
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			local61 = Static374.method5522(Static546.aClass298_171, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3131(Static529.anInt8344 + local20);
			local61.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3095(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3095(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		@Pc(134) Class3_Sub34 local134;
		@Pc(115) Class9_Sub1_Sub1_Sub2_Sub2 local115;
		if (local26 == 12) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static387.anInt6667 = arg0;
				Static558.anInt8945 = 2;
				Static556.anInt8908 = 0;
				Static287.anInt5264 = arg1;
				local134 = Static374.method5522(Static318.aClass298_117, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3132(Static63.anInt1712);
				local134.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
				local134.aClass3_Sub11_Sub1_2.method3101(Static550.anInt7639);
				local134.aClass3_Sub11_Sub1_2.method3095(local30);
				local134.aClass3_Sub11_Sub1_2.method3131(Static345.anInt6055);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 1004 || local26 == 1008 || local26 == 1003 || local26 == 1009 || local26 == 1002) {
			Static200.method3626(local30, local20, local26);
		}
		if (local26 == 3) {
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static323.aClass298_179, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3132(Static529.anInt8344 + local20);
			local61.aClass3_Sub11_Sub1_2.method3095(Static463.anInt7588 + local23);
			local61.aClass3_Sub11_Sub1_2.method3103((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local61.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		if (local26 == 23) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static387.anInt6667 = arg0;
				Static556.anInt8908 = 0;
				Static287.anInt5264 = arg1;
				Static558.anInt8945 = 2;
				local134 = Static374.method5522(Static255.aClass298_96, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3132(local30);
				local134.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 1012) {
			Static556.anInt8908 = 0;
			Static387.anInt6667 = arg0;
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static168.aClass298_172, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3131(local30);
			Static131.method2572(local61);
		}
		if (local26 == 9) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static287.anInt5264 = arg1;
				Static558.anInt8945 = 2;
				Static387.anInt6667 = arg0;
				Static556.anInt8908 = 0;
				local134 = Static374.method5522(Static180.aClass298_67, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3095(local30);
				local134.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 47) {
			Static556.anInt8908 = 0;
			Static287.anInt5264 = arg1;
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static303.aClass298_112, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3095(local20 + Static529.anInt8344);
			local61.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3131(local30);
			local61.aClass3_Sub11_Sub1_2.method3132(Static463.anInt7588 + local23);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		if (local26 == 13) {
			Static287.anInt5264 = arg1;
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			Static556.anInt8908 = 0;
			local61 = Static374.method5522(Static512.aClass298_161, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3079(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3131(local30);
			local61.aClass3_Sub11_Sub1_2.method3095(local20 + Static529.anInt8344);
			local61.aClass3_Sub11_Sub1_2.method3103(Static463.anInt7588 + local23);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		@Pc(599) Class3_Sub34 local599;
		@Pc(588) Class9_Sub1_Sub1_Sub2_Sub1 local588;
		@Pc(577) Class3_Sub39 local577;
		if (local26 == 20) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				Static287.anInt5264 = arg1;
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				Static387.anInt6667 = arg0;
				Static556.anInt8908 = 0;
				Static558.anInt8945 = 2;
				local599 = Static374.method5522(Static523.aClass298_182, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3087(Static550.anInt7639);
				local599.aClass3_Sub11_Sub1_2.method3095(Static345.anInt6055);
				local599.aClass3_Sub11_Sub1_2.method3103(Static63.anInt1712);
				local599.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
				local599.aClass3_Sub11_Sub1_2.method3132(local30);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 51) {
			Static287.anInt5264 = arg1;
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			Static558.anInt8945 = 1;
			local61 = Static374.method5522(Static318.aClass298_118, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3087(Static550.anInt7639);
			local61.aClass3_Sub11_Sub1_2.method3131(Static63.anInt1712);
			local61.aClass3_Sub11_Sub1_2.method3131(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3095(Static345.anInt6055);
			local61.aClass3_Sub11_Sub1_2.method3103(local20 + Static529.anInt8344);
			Static131.method2572(local61);
			Static436.method6152(local20, 0, -4, 1, true, 0, local23, 1);
		}
		if (local26 == 18) {
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			Static556.anInt8908 = 0;
			Static387.anInt6667 = arg0;
			local61 = Static374.method5522(Static381.aClass298_137, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3132(Static529.anInt8344 + local20);
			local61.aClass3_Sub11_Sub1_2.method3095(Static463.anInt7588 + local23);
			local61.aClass3_Sub11_Sub1_2.method3132(local30);
			local61.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		if (local26 == 1001) {
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			Static558.anInt8945 = 2;
			Static387.anInt6667 = arg0;
			local61 = Static374.method5522(Static311.aClass298_114, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3131(local30);
			Static131.method2572(local61);
		}
		if (local26 == 11) {
			if (Static274.anInt5067 > 0 && Static478.aClass127_1.method3276(82) && Static478.aClass127_1.method3276(81)) {
				Static31.method563(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, Static529.anInt8344 + local20, Static463.anInt7588 - -local23);
			} else {
				local61 = Static549.method7337(local23, local20, local30);
				if (local30 == 1) {
					local61.aClass3_Sub11_Sub1_2.method3079(-1);
					local61.aClass3_Sub11_Sub1_2.method3079(-1);
					local61.aClass3_Sub11_Sub1_2.method3131((int) Static439.aFloat151);
					local61.aClass3_Sub11_Sub1_2.method3079(57);
					local61.aClass3_Sub11_Sub1_2.method3079(Static278.anInt5101);
					local61.aClass3_Sub11_Sub1_2.method3079(Static435.anInt7196);
					local61.aClass3_Sub11_Sub1_2.method3079(89);
					local61.aClass3_Sub11_Sub1_2.method3131(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975);
					local61.aClass3_Sub11_Sub1_2.method3131(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980);
					local61.aClass3_Sub11_Sub1_2.method3079(63);
				} else {
					Static558.anInt8945 = 1;
					Static556.anInt8908 = 0;
					Static287.anInt5264 = arg1;
					Static387.anInt6667 = arg0;
				}
				Static131.method2572(local61);
				Static436.method6152(local20, 0, -4, 1, true, 0, local23, 1);
			}
		}
		if (local26 == 48) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				Static558.anInt8945 = 2;
				Static387.anInt6667 = arg0;
				Static287.anInt5264 = arg1;
				Static556.anInt8908 = 0;
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				local599 = Static374.method5522(Static539.aClass298_119, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3095(local30);
				local599.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 25) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				Static287.anInt5264 = arg1;
				Static556.anInt8908 = 0;
				Static558.anInt8945 = 2;
				Static387.anInt6667 = arg0;
				local599 = Static374.method5522(Static271.aClass298_101, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				local599.aClass3_Sub11_Sub1_2.method3095(local30);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 30) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static556.anInt8908 = 0;
				Static387.anInt6667 = arg0;
				Static558.anInt8945 = 2;
				Static287.anInt5264 = arg1;
				local134 = Static374.method5522(Static571.aClass298_168, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3131(local30);
				local134.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 4) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static287.anInt5264 = arg1;
				Static387.anInt6667 = arg0;
				Static558.anInt8945 = 2;
				Static556.anInt8908 = 0;
				local134 = Static374.method5522(Static382.aClass298_138, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3132(local30);
				local134.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 21) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static558.anInt8945 = 2;
				Static287.anInt5264 = arg1;
				Static556.anInt8908 = 0;
				Static387.anInt6667 = arg0;
				local134 = Static374.method5522(Static518.aClass298_162, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3131(local30);
				local134.aClass3_Sub11_Sub1_2.method3079(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 5) {
			Static287.anInt5264 = arg1;
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static318.aClass298_117, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3132(Static63.anInt1712);
			local61.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3101(Static550.anInt7639);
			local61.aClass3_Sub11_Sub1_2.method3095(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6429);
			local61.aClass3_Sub11_Sub1_2.method3131(Static345.anInt6055);
			Static131.method2572(local61);
		}
		@Pc(1335) Class203 local1335;
		if (local26 == 57) {
			local1335 = Static582.method7699(local23, local20);
			if (local1335 != null) {
				Static569.method7556(local1335);
			}
		}
		if (local26 == 19) {
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			local61 = Static374.method5522(Static6.aClass298_3, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3103(local30);
			local61.aClass3_Sub11_Sub1_2.method3132(Static463.anInt7588 + local23);
			local61.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3103(Static529.anInt8344 + local20);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		if (local26 == 15) {
			Static287.anInt5264 = arg1;
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			Static556.anInt8908 = 0;
			local61 = Static374.method5522(Static280.aClass298_105, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3132(local30);
			local61.aClass3_Sub11_Sub1_2.method3132(Static463.anInt7588 + local23);
			local61.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3131(Static529.anInt8344 + local20);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		if (local26 == 50) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static558.anInt8945 = 2;
				Static287.anInt5264 = arg1;
				Static387.anInt6667 = arg0;
				Static556.anInt8908 = 0;
				local134 = Static374.method5522(Static250.aClass298_95, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3095(local30);
				local134.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 58) {
			if (Static274.anInt5067 > 0 && Static478.aClass127_1.method3276(82) && Static478.aClass127_1.method3276(81)) {
				Static31.method563(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, Static529.anInt8344 + local20, Static463.anInt7588 + local23);
			} else {
				Static558.anInt8945 = 1;
				Static287.anInt5264 = arg1;
				Static387.anInt6667 = arg0;
				Static556.anInt8908 = 0;
				local61 = Static374.method5522(Static235.aClass298_91, Static220.aClass287_2);
				local61.aClass3_Sub11_Sub1_2.method3131(Static463.anInt7588 + local23);
				local61.aClass3_Sub11_Sub1_2.method3132(Static529.anInt8344 + local20);
				Static131.method2572(local61);
			}
		}
		if (local26 == 6) {
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static59.aClass298_106, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3131(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3131(Static63.anInt1712);
			local61.aClass3_Sub11_Sub1_2.method3103(local20 + Static529.anInt8344);
			local61.aClass3_Sub11_Sub1_2.method3132(Static345.anInt6055);
			local61.aClass3_Sub11_Sub1_2.method3132((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local61.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3100(Static550.anInt7639);
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		if (local26 == 2) {
			local1335 = Static582.method7699(local23, local20);
			if (local1335 != null) {
				Static103.method2177();
				@Pc(1690) Class3_Sub10 local1690 = Static69.method1651(local1335);
				Static80.method7505(local1690.method571(), local1690.anInt723, local1335);
				Static484.aString107 = Static495.method6684(local1335);
				if (Static484.aString107 == null) {
					Static484.aString107 = "Null";
				}
				Static466.aString125 = local1335.aString71 + "<col=ffffff>";
			}
			return;
		}
		if (local26 == 44) {
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static469.aClass298_158, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3111(Static550.anInt7639);
			local61.aClass3_Sub11_Sub1_2.method3131(Static345.anInt6055);
			local61.aClass3_Sub11_Sub1_2.method3095(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3103(local30);
			local61.aClass3_Sub11_Sub1_2.method3103(Static63.anInt1712);
			local61.aClass3_Sub11_Sub1_2.method3132(local20 + Static529.anInt8344);
			local61.aClass3_Sub11_Sub1_2.method3092(Static478.aClass127_1.method3276(82) ? 1 : 0);
			Static131.method2572(local61);
			Static434.method4796(local23, local20);
		}
		if (local26 == 10 || local26 == 1006) {
			Static207.method3701(arg2.aString106, local20, local30, local23);
		}
		if (local26 == 46 && Static48.aClass203_24 == null) {
			Static276.method4415(local23, local20);
			Static48.aClass203_24 = Static582.method7699(local23, local20);
			Static138.method2656(Static48.aClass203_24);
		}
		if (local26 == 22) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				Static387.anInt6667 = arg0;
				Static558.anInt8945 = 2;
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				Static556.anInt8908 = 0;
				Static287.anInt5264 = arg1;
				local599 = Static374.method5522(Static330.aClass298_126, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3131(local30);
				local599.aClass3_Sub11_Sub1_2.method3092(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 8) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static558.anInt8945 = 2;
				Static387.anInt6667 = arg0;
				Static287.anInt5264 = arg1;
				Static556.anInt8908 = 0;
				local134 = Static374.method5522(Static78.aClass298_59, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3103(local30);
				local134.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 59) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				Static556.anInt8908 = 0;
				Static287.anInt5264 = arg1;
				Static387.anInt6667 = arg0;
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				Static558.anInt8945 = 2;
				local599 = Static374.method5522(Static324.aClass298_122, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3131(local30);
				local599.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 45) {
			local115 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local30];
			if (local115 != null) {
				Static387.anInt6667 = arg0;
				Static287.anInt5264 = arg1;
				Static558.anInt8945 = 2;
				Static556.anInt8908 = 0;
				local134 = Static374.method5522(Static465.aClass298_157, Static220.aClass287_2);
				local134.aClass3_Sub11_Sub1_2.method3130(Static478.aClass127_1.method3276(82) ? 1 : 0);
				local134.aClass3_Sub11_Sub1_2.method3131(local30);
				Static131.method2572(local134);
				Static436.method6152(local115.anIntArray518[0], 0, -2, local115.method5569(), true, 0, local115.anIntArray517[0], local115.method5569());
			}
		}
		if (local26 == 49) {
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static62.aClass298_98, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3103(Integer.MAX_VALUE & (int) (local33 >>> 32));
			local61.aClass3_Sub11_Sub1_2.method3093(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3103(local20 + Static529.anInt8344);
			local61.aClass3_Sub11_Sub1_2.method3103(local23 + Static463.anInt7588);
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		if (local26 == 60) {
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				Static387.anInt6667 = arg0;
				Static287.anInt5264 = arg1;
				Static558.anInt8945 = 2;
				Static556.anInt8908 = 0;
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				local599 = Static374.method5522(Static216.aClass298_82, Static220.aClass287_2);
				local599.aClass3_Sub11_Sub1_2.method3092(Static478.aClass127_1.method3276(82) ? 1 : 0);
				local599.aClass3_Sub11_Sub1_2.method3132(local30);
				Static131.method2572(local599);
				Static436.method6152(local588.anIntArray518[0], 0, -2, local588.method5569(), true, 0, local588.anIntArray517[0], local588.method5569());
			}
		}
		if (local26 == 1011) {
			Static387.anInt6667 = arg0;
			Static558.anInt8945 = 2;
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			local577 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local30);
			if (local577 != null) {
				local588 = local577.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				@Pc(2278) Class294 local2278 = local588.aClass294_1;
				if (local2278.anIntArray588 != null) {
					local2278 = local2278.method6429(Static427.aClass56_1);
				}
				if (local2278 != null) {
					@Pc(2297) Class3_Sub34 local2297 = Static374.method5522(Static215.aClass298_81, Static220.aClass287_2);
					local2297.aClass3_Sub11_Sub1_2.method3131(local2278.anInt7626);
					Static131.method2572(local2297);
				}
			}
		}
		if (local26 == 16) {
			Static387.anInt6667 = arg0;
			Static556.anInt8908 = 0;
			Static287.anInt5264 = arg1;
			Static558.anInt8945 = 2;
			local61 = Static374.method5522(Static298.aClass298_177, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3092(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3132(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3103(Static529.anInt8344 + local20);
			local61.aClass3_Sub11_Sub1_2.method3131(Integer.MAX_VALUE & (int) (local33 >>> 32));
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		if (local26 == 17) {
			Static287.anInt5264 = arg1;
			Static556.anInt8908 = 0;
			Static558.anInt8945 = 2;
			Static387.anInt6667 = arg0;
			local61 = Static374.method5522(Static358.aClass298_178, Static220.aClass287_2);
			local61.aClass3_Sub11_Sub1_2.method3079(Static478.aClass127_1.method3276(82) ? 1 : 0);
			local61.aClass3_Sub11_Sub1_2.method3131(local23 + Static463.anInt7588);
			local61.aClass3_Sub11_Sub1_2.method3131((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local61.aClass3_Sub11_Sub1_2.method3131(local20 + Static529.anInt8344);
			Static131.method2572(local61);
			Static524.method6956(local23, local33, local20);
		}
		if (Static380.aBoolean537) {
			Static103.method2177();
		}
		if (Static229.aClass203_76 != null && Static466.anInt8973 == 0) {
			Static138.method2656(Static229.aClass203_76);
		}
	}
}
