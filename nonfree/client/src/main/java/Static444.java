import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "Lclient!daa;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_134 = new Class322(108, 8);

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_135 = new Class322(57, 0);

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "Z")
	public static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!jka;III)V")
	public static void method6881(@OriginalArg(0) Class6_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || Static116.aClass340_17.aClass6_283 == arg0) {
			return;
		}
		@Pc(18) int local18 = arg0.anInt5168;
		@Pc(21) int local21 = arg0.anInt5167;
		@Pc(31) int local31 = arg0.anInt5173;
		@Pc(35) int local35 = (int) arg0.aLong169;
		@Pc(38) long local38 = arg0.aLong169;
		if (local31 >= 2000) {
			local31 -= 2000;
		}
		if (local31 == 6 || local31 == 1007) {
			Static252.method8468(local35, arg0.aString55, local18, local21);
		}
		@Pc(88) Class6_Sub13 local88;
		if (local31 == 3) {
			Static458.anInt7940 = arg2;
			Static266.anInt5026 = 2;
			Static205.anInt4119 = arg1;
			Static129.anInt2573 = 0;
			local88 = Static30.method353(Static13.aClass241_5, Static525.aClass260_4.aClass270_2);
			local88.aClass6_Sub15_Sub1_1.method2984(Static270.anInt5047);
			local88.aClass6_Sub15_Sub1_1.method3045(local21 + Static404.anInt7039);
			local88.aClass6_Sub15_Sub1_1.method3024(Static227.anInt4416);
			local88.aClass6_Sub15_Sub1_1.method3020(local18 + Static50.anInt606);
			local88.aClass6_Sub15_Sub1_1.method3045(Static607.anInt9574);
			local88.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
			local88.aClass6_Sub15_Sub1_1.method3045((int) (local38 >>> 32) & Integer.MAX_VALUE);
			Static525.aClass260_4.method6404(local88);
			Static622.method8538(local21, local38, local18);
		}
		if (local31 == 47) {
			Static129.anInt2573 = 0;
			Static266.anInt5026 = 2;
			Static205.anInt4119 = arg1;
			Static458.anInt7940 = arg2;
			local88 = Static30.method353(Static200.aClass241_50, Static525.aClass260_4.aClass270_2);
			local88.aClass6_Sub15_Sub1_1.method3017(Static227.anInt4416);
			local88.aClass6_Sub15_Sub1_1.method3045(Static404.anInt7039 + local21);
			local88.aClass6_Sub15_Sub1_1.method2984(Static50.anInt606 + local18);
			local88.aClass6_Sub15_Sub1_1.method3020(Static270.anInt5047);
			local88.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
			local88.aClass6_Sub15_Sub1_1.method2984(local35);
			local88.aClass6_Sub15_Sub1_1.method3040(Static607.anInt9574);
			Static525.aClass260_4.method6404(local88);
			Static613.method8456(local18, local21);
		}
		if (local31 == 49) {
			if (Static679.anInt6104 > 0 && Static435.aClass148_1.method3952(82) && Static435.aClass148_1.method3952(81)) {
				Static86.method1253(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, local18 + Static50.anInt606, local21 + Static404.anInt7039);
			} else {
				Static266.anInt5026 = 1;
				Static205.anInt4119 = arg1;
				Static129.anInt2573 = 0;
				Static458.anInt7940 = arg2;
				local88 = Static30.method353(Static574.aClass241_111, Static525.aClass260_4.aClass270_2);
				local88.aClass6_Sub15_Sub1_1.method3045(local21 + Static404.anInt7039);
				local88.aClass6_Sub15_Sub1_1.method3020(local18 + Static50.anInt606);
				Static525.aClass260_4.method6404(local88);
			}
		}
		@Pc(336) Class6_Sub13 local336;
		if (local31 == 48) {
			@Pc(316) Class60_Sub1_Sub1_Sub3_Sub1 local316 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local35];
			if (local316 != null) {
				Static458.anInt7940 = arg2;
				Static129.anInt2573 = 0;
				Static266.anInt5026 = 2;
				Static205.anInt4119 = arg1;
				local336 = Static30.method353(Static219.aClass241_60, Static525.aClass260_4.aClass270_2);
				local336.aClass6_Sub15_Sub1_1.method3040(Static270.anInt5047);
				local336.aClass6_Sub15_Sub1_1.method3029(Static227.anInt4416);
				local336.aClass6_Sub15_Sub1_1.method3040(local35);
				local336.aClass6_Sub15_Sub1_1.method2984(Static607.anInt9574);
				local336.aClass6_Sub15_Sub1_1.method3010(Static435.aClass148_1.method3952(82) ? 1 : 0);
				Static525.aClass260_4.method6404(local336);
				Static223.method4038(0, -2, true, local316.method4424((byte) -28), local316.anIntArray263[0], local316.anIntArray264[0], 0, local316.method4424((byte) -28));
			}
		}
		if (local31 == 60 && Static339.aClass381_8 == null) {
			Static31.method414(local21, local18);
			Static339.aClass381_8 = Static347.method5333(local18, local21);
			Static168.method3312(Static339.aClass381_8);
		}
		@Pc(452) Class6_Sub13 local452;
		if (local31 == 19) {
			@Pc(429) Class6_Sub11 local429 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local35);
			if (local429 != null) {
				Static458.anInt7940 = arg2;
				Static266.anInt5026 = 2;
				Static129.anInt2573 = 0;
				Static205.anInt4119 = arg1;
				@Pc(446) Class60_Sub1_Sub1_Sub3_Sub2 local446 = local429.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				local452 = Static30.method353(Static74.aClass241_18, Static525.aClass260_4.aClass270_2);
				local452.aClass6_Sub15_Sub1_1.method3023(Static227.anInt4416);
				local452.aClass6_Sub15_Sub1_1.method2984(Static270.anInt5047);
				local452.aClass6_Sub15_Sub1_1.method3020(Static607.anInt9574);
				local452.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
				local452.aClass6_Sub15_Sub1_1.method2984(local35);
				Static525.aClass260_4.method6404(local452);
				Static223.method4038(0, -2, true, local446.method4424((byte) -28), local446.anIntArray263[0], local446.anIntArray264[0], 0, local446.method4424((byte) -28));
			}
		}
		if (local31 == 21) {
			Static266.anInt5026 = 2;
			Static205.anInt4119 = arg1;
			Static129.anInt2573 = 0;
			Static458.anInt7940 = arg2;
			local88 = Static30.method353(Static219.aClass241_60, Static525.aClass260_4.aClass270_2);
			local88.aClass6_Sub15_Sub1_1.method3040(Static270.anInt5047);
			local88.aClass6_Sub15_Sub1_1.method3029(Static227.anInt4416);
			local88.aClass6_Sub15_Sub1_1.method3040(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt4845);
			local88.aClass6_Sub15_Sub1_1.method2984(Static607.anInt9574);
			local88.aClass6_Sub15_Sub1_1.method3010(Static435.aClass148_1.method3952(82) ? 1 : 0);
			Static525.aClass260_4.method6404(local88);
		}
		if (local31 == 45) {
			@Pc(581) Class381 local581 = Static347.method5333(local18, local21);
			if (local581 != null) {
				Static308.method4895(local581);
			}
		}
		@Pc(590) Class241 local590 = null;
		if (local31 == 50) {
			local590 = Static118.aClass241_34;
		} else if (local31 == 12) {
			local590 = Static83.aClass241_21;
		} else if (local31 == 9) {
			local590 = Static666.aClass241_122;
		} else if (local31 == 51) {
			local590 = Static103.aClass241_28;
		} else if (local31 == 1002) {
			local590 = Static9.aClass241_4;
		} else if (local31 == 1009) {
			local590 = Static205.aClass241_55;
		}
		if (local590 != null) {
			Static205.anInt4119 = arg1;
			Static129.anInt2573 = 0;
			Static458.anInt7940 = arg2;
			Static266.anInt5026 = 2;
			local336 = Static30.method353(local590, Static525.aClass260_4.aClass270_2);
			local336.aClass6_Sub15_Sub1_1.method3045(Integer.MAX_VALUE & (int) (local38 >>> 32));
			local336.aClass6_Sub15_Sub1_1.method3040(local18 + Static50.anInt606);
			local336.aClass6_Sub15_Sub1_1.method3040(local21 + Static404.anInt7039);
			local336.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
			Static525.aClass260_4.method6404(local336);
			Static622.method8538(local21, local38, local18);
		}
		if (local31 == 17) {
			if (Static679.anInt6104 > 0 && Static435.aClass148_1.method3952(82) && Static435.aClass148_1.method3952(81)) {
				Static86.method1253(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, local18 + Static50.anInt606, local21 + Static404.anInt7039);
			} else {
				local336 = Static546.method7739(local21, local18, local35);
				if (local35 == 1) {
					local336.aClass6_Sub15_Sub1_1.method3016(-1);
					local336.aClass6_Sub15_Sub1_1.method3016(-1);
					local336.aClass6_Sub15_Sub1_1.method3040((int) Static409.aFloat135);
					local336.aClass6_Sub15_Sub1_1.method3016(57);
					local336.aClass6_Sub15_Sub1_1.method3016(Static51.anInt622);
					local336.aClass6_Sub15_Sub1_1.method3016(Static41.anInt542);
					local336.aClass6_Sub15_Sub1_1.method3016(89);
					local336.aClass6_Sub15_Sub1_1.method3040(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048);
					local336.aClass6_Sub15_Sub1_1.method3040(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057);
					local336.aClass6_Sub15_Sub1_1.method3016(63);
				} else {
					Static129.anInt2573 = 0;
					Static458.anInt7940 = arg2;
					Static266.anInt5026 = 1;
					Static205.anInt4119 = arg1;
				}
				Static525.aClass260_4.method6404(local336);
				Static223.method4038(0, -4, true, 1, local18, local21, 0, 1);
			}
		}
		@Pc(839) Class241 local839 = null;
		if (local31 == 22) {
			local839 = Static125.aClass241_36;
		} else if (local31 == 8) {
			local839 = Static68.aClass241_102;
		} else if (local31 == 5) {
			local839 = Static28.aClass241_9;
		} else if (local31 == 20) {
			local839 = Static347.aClass241_78;
		} else if (local31 == 4) {
			local839 = Static345.aClass241_76;
		} else if (local31 == 1003) {
			local839 = Static31.aClass241_10;
		}
		if (local839 != null) {
			@Pc(899) Class6_Sub11 local899 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local35);
			if (local899 != null) {
				Static205.anInt4119 = arg1;
				Static458.anInt7940 = arg2;
				@Pc(912) Class60_Sub1_Sub1_Sub3_Sub2 local912 = local899.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				Static129.anInt2573 = 0;
				Static266.anInt5026 = 2;
				@Pc(922) Class6_Sub13 local922 = Static30.method353(local839, Static525.aClass260_4.aClass270_2);
				local922.aClass6_Sub15_Sub1_1.method3016(Static435.aClass148_1.method3952(82) ? 1 : 0);
				local922.aClass6_Sub15_Sub1_1.method2984(local35);
				Static525.aClass260_4.method6404(local922);
				Static223.method4038(0, -2, true, local912.method4424((byte) -28), local912.anIntArray263[0], local912.anIntArray264[0], 0, local912.method4424((byte) -28));
			}
		}
		if (local31 == 44) {
			Static266.anInt5026 = 1;
			Static458.anInt7940 = arg2;
			Static129.anInt2573 = 0;
			Static205.anInt4119 = arg1;
			local452 = Static30.method353(Static181.aClass241_109, Static525.aClass260_4.aClass270_2);
			local452.aClass6_Sub15_Sub1_1.method2984(Static270.anInt5047);
			local452.aClass6_Sub15_Sub1_1.method3045(Static50.anInt606 + local18);
			local452.aClass6_Sub15_Sub1_1.method3040(local21 + Static404.anInt7039);
			local452.aClass6_Sub15_Sub1_1.method3020(Static607.anInt9574);
			local452.aClass6_Sub15_Sub1_1.method3023(Static227.anInt4416);
			Static525.aClass260_4.method6404(local452);
			Static223.method4038(0, -4, true, 1, local18, local21, 0, 1);
		}
		if (local31 == 11) {
			@Pc(1048) Class381 local1048 = Static347.method5333(local18, local21);
			if (local1048 != null) {
				Static565.method7967();
				@Pc(1055) Class6_Sub32 local1055 = Static78.method1061(local1048);
				Static154.method3074(local1055.method5217(), local1048, local1055.anInt5779);
				Static185.aString41 = Static346.method5315(local1048);
				Static6.aString5 = local1048.aString121 + "<col=ffffff>";
				if (Static185.aString41 == null) {
					Static185.aString41 = "Null";
				}
			}
			return;
		}
		if (local31 == 1012 || local31 == 1011 || local31 == 1004 || local31 == 1001 || local31 == 1010) {
			Static33.method442(local35, local31, local18);
		}
		@Pc(1124) Class241 local1124 = null;
		if (local31 == 57) {
			local1124 = Static686.aClass241_127;
		} else if (local31 == 52) {
			local1124 = Static205.aClass241_54;
		} else if (local31 == 16) {
			local1124 = Static229.aClass241_63;
		} else if (local31 == 2) {
			local1124 = Static539.aClass241_105;
		} else if (local31 == 18) {
			local1124 = Static455.aClass241_97;
		} else if (local31 == 1008) {
			local1124 = Static411.aClass241_90;
		}
		if (local1124 != null) {
			Static205.anInt4119 = arg1;
			Static458.anInt7940 = arg2;
			Static266.anInt5026 = 2;
			Static129.anInt2573 = 0;
			@Pc(1187) Class6_Sub13 local1187 = Static30.method353(local1124, Static525.aClass260_4.aClass270_2);
			local1187.aClass6_Sub15_Sub1_1.method3037(Static435.aClass148_1.method3952(82) ? 1 : 0);
			local1187.aClass6_Sub15_Sub1_1.method3040(Static404.anInt7039 + local21);
			local1187.aClass6_Sub15_Sub1_1.method3020(Static50.anInt606 + local18);
			local1187.aClass6_Sub15_Sub1_1.method3040(local35);
			Static525.aClass260_4.method6404(local1187);
			Static613.method8456(local18, local21);
		}
		@Pc(1229) Class241 local1229 = null;
		if (local31 == 23) {
			local1229 = Static338.aClass241_75;
		} else if (local31 == 13) {
			local1229 = Static492.aClass241_43;
		} else if (local31 == 15) {
			local1229 = Static175.aClass241_45;
		} else if (local31 == 10) {
			local1229 = Static485.aClass241_100;
		} else if (local31 == 53) {
			local1229 = Static658.aClass241_121;
		} else if (local31 == 46) {
			local1229 = Static431.aClass241_93;
		} else if (local31 == 58) {
			local1229 = Static221.aClass241_61;
		} else if (local31 == 59) {
			local1229 = Static91.aClass241_24;
		} else if (local31 == 30) {
			local1229 = Static597.aClass241_113;
		} else if (local31 == 25) {
			local1229 = Static399.aClass241_87;
		}
		if (local1229 != null) {
			@Pc(1314) Class60_Sub1_Sub1_Sub3_Sub1 local1314 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local35];
			if (local1314 != null) {
				Static266.anInt5026 = 2;
				Static205.anInt4119 = arg1;
				Static458.anInt7940 = arg2;
				Static129.anInt2573 = 0;
				@Pc(1334) Class6_Sub13 local1334 = Static30.method353(local1229, Static525.aClass260_4.aClass270_2);
				local1334.aClass6_Sub15_Sub1_1.method2984(local35);
				local1334.aClass6_Sub15_Sub1_1.method3016(Static435.aClass148_1.method3952(82) ? 1 : 0);
				Static525.aClass260_4.method6404(local1334);
				Static223.method4038(0, -2, true, local1314.method4424((byte) -28), local1314.anIntArray263[0], local1314.anIntArray264[0], 0, local1314.method4424((byte) -28));
			}
		}
		if (Static162.aBoolean266) {
			Static565.method7967();
		}
		if (Static302.aClass381_7 != null && Static426.anInt10021 == 0) {
			Static168.method3312(Static302.aClass381_7);
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)V")
	public static void method6882() {
		@Pc(10) Class359 local10 = Static307.aClass359_44;
		synchronized (Static307.aClass359_44) {
			Static307.aClass359_44.method8502(5);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lclient!jo;")
	public static Class194 method6883() {
		try {
			return (Class194) Class.forName("vv").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}
}
