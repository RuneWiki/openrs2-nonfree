import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Z")
	public static boolean aBoolean476 = false;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt7192 = -50;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!ju;I)V")
	public static void method5683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub22 arg2) {
		if (arg2 == null || Static248.aClass14_35.aClass2_17 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt3715;
		@Pc(18) int local18 = arg2.anInt3719;
		@Pc(21) int local21 = arg2.anInt3716;
		@Pc(25) int local25 = (int) arg2.aLong114;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg2.aLong114;
		if (local21 == 3) {
			Static115.anInt2620 = 0;
			Static438.anInt7195 = arg1;
			Static124.anInt6125 = arg0;
			Static46.anInt864 = 2;
			Static159.method2586(Static87.aClass54_30);
			Static424.aClass2_Sub23_Sub2_1.method5454(local25);
			Static424.aClass2_Sub23_Sub2_1.method5507(Static324.anInt5624 + local18);
			Static424.aClass2_Sub23_Sub2_1.method5463(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5454(local15 + Static48.anInt962);
			Static42.method3511(local15, local18);
		}
		@Pc(90) Class3_Sub2_Sub1_Sub1 local90;
		if (local21 == 5) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static438.anInt7195 = arg1;
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static159.method2586(Static94.aClass54_31);
				Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 48) {
			Static46.anInt864 = 2;
			Static115.anInt2620 = 0;
			Static124.anInt6125 = arg0;
			Static438.anInt7195 = arg1;
			Static159.method2586(Static390.aClass54_96);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static48.anInt962 + local15);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5502(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static424.aClass2_Sub23_Sub2_1.method5454(local18 + Static324.anInt5624);
			Static116.method2059(local15, local18, local32);
		}
		if (local21 == 45) {
			Static438.anInt7195 = arg1;
			Static115.anInt2620 = 0;
			Static124.anInt6125 = arg0;
			Static46.anInt864 = 2;
			Static159.method2586(Static428.aClass54_103);
			Static424.aClass2_Sub23_Sub2_1.method5507(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5454(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static424.aClass2_Sub23_Sub2_1.method5454(local15 + Static48.anInt962);
			Static116.method2059(local15, local18, local32);
		}
		@Pc(266) Class3_Sub2_Sub1_Sub2 local266;
		if (local21 == 2) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static124.anInt6125 = arg0;
				Static46.anInt864 = 2;
				Static438.anInt7195 = arg1;
				Static115.anInt2620 = 0;
				Static159.method2586(Static312.aClass54_77);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 16) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static124.anInt6125 = arg0;
				Static46.anInt864 = 2;
				Static438.anInt7195 = arg1;
				Static115.anInt2620 = 0;
				Static159.method2586(Static441.aClass54_8);
				Static424.aClass2_Sub23_Sub2_1.method5463(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5507(local25);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		@Pc(389) Class68 local389;
		if (local21 == 15) {
			local389 = Static259.method3899(local15, local18);
			if (local389 != null) {
				Static237.method3667();
				@Pc(396) Class2_Sub42 local396 = Static47.method787(local389);
				Static454.method5861(local389, local396.method5400(), local396.anInt6838);
				Static118.aString34 = Static209.method3317(local389);
				if (Static118.aString34 == null) {
					Static118.aString34 = "Null";
				}
				Static254.aString46 = local389.aString23 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 10) {
			Static115.anInt2620 = 0;
			Static124.anInt6125 = arg0;
			Static438.anInt7195 = arg1;
			Static46.anInt864 = 2;
			Static159.method2586(Static277.aClass54_71);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static48.anInt962 + local15);
			Static424.aClass2_Sub23_Sub2_1.method5498(Static142.anInt3047);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static324.anInt5624 + local18);
			Static424.aClass2_Sub23_Sub2_1.method5454(Static154.anInt3161);
			Static424.aClass2_Sub23_Sub2_1.method5470(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static424.aClass2_Sub23_Sub2_1.method5463(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static423.anInt7418);
			Static116.method2059(local15, local18, local32);
		}
		if (local21 == 1012) {
			Static46.anInt864 = 2;
			Static115.anInt2620 = 0;
			Static438.anInt7195 = arg1;
			Static124.anInt6125 = arg0;
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				@Pc(512) Class65 local512 = local90.aClass65_1;
				if (local512.anIntArray155 != null) {
					local512 = local512.method1710(Static344.aClass108_1);
				}
				if (local512 != null) {
					Static159.method2586(Static364.aClass54_89);
					Static424.aClass2_Sub23_Sub2_1.method5502(local512.anInt2114);
				}
			}
		}
		if (local21 == 60) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static46.anInt864 = 2;
				Static438.anInt7195 = arg1;
				Static115.anInt2620 = 0;
				Static124.anInt6125 = arg0;
				Static159.method2586(Static24.aClass54_73);
				Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5502(local25);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 19) {
			Static438.anInt7195 = arg1;
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static124.anInt6125 = arg0;
			Static159.method2586(Static66.aClass54_5);
			Static424.aClass2_Sub23_Sub2_1.method5470(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static48.anInt962 + local15);
			Static424.aClass2_Sub23_Sub2_1.method5507(local25);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static42.method3511(local15, local18);
		}
		if (local21 == 22) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static438.anInt7195 = arg1;
				Static124.anInt6125 = arg0;
				Static46.anInt864 = 2;
				Static115.anInt2620 = 0;
				Static159.method2586(Static106.aClass54_37);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5463(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 1007) {
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static124.anInt6125 = arg0;
			Static438.anInt7195 = arg1;
			Static159.method2586(Static348.aClass54_67);
			Static424.aClass2_Sub23_Sub2_1.method5502(local25);
		}
		if (local21 == 9 || local21 == 1003) {
			Static108.method2000(local18, arg2.aString43, local15, local25);
		}
		if (local21 == 58) {
			Static438.anInt7195 = arg1;
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static159.method2586(Static383.aClass54_90);
			Static424.aClass2_Sub23_Sub2_1.method5502(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5454(Static48.anInt962 + local15);
			Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5470(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static116.method2059(local15, local18, local32);
		}
		if (local21 == 59) {
			if (Static193.anInt3710 > 0 && Static334.aClass226_1.method4977(82) && Static334.aClass226_1.method4977(81)) {
				Static379.method5082(Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, Static48.anInt962 + local15, Static324.anInt5624 - -local18);
			} else {
				Static63.method1223(local15, local25, local18);
				if (local25 == 1) {
					Static424.aClass2_Sub23_Sub2_1.method5449(-1);
					Static424.aClass2_Sub23_Sub2_1.method5449(-1);
					Static424.aClass2_Sub23_Sub2_1.method5502((int) Static202.aFloat62);
					Static424.aClass2_Sub23_Sub2_1.method5449(57);
					Static424.aClass2_Sub23_Sub2_1.method5449(Static166.anInt3321);
					Static424.aClass2_Sub23_Sub2_1.method5449(Static261.anInt4889);
					Static424.aClass2_Sub23_Sub2_1.method5449(89);
					Static424.aClass2_Sub23_Sub2_1.method5502(Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119);
					Static424.aClass2_Sub23_Sub2_1.method5502(Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121);
					Static424.aClass2_Sub23_Sub2_1.method5449(63);
				} else {
					Static438.anInt7195 = arg1;
					Static46.anInt864 = 1;
					Static115.anInt2620 = 0;
					Static124.anInt6125 = arg0;
				}
				Static346.method4766(0, 0, true, -4, 1, local18, 1, local15);
			}
		}
		if (local21 == 25) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static416.aClass54_100);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5470(local25);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 11) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static221.aClass54_60);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5507(local25);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 49) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static124.anInt6125 = arg0;
				Static438.anInt7195 = arg1;
				Static46.anInt864 = 2;
				Static115.anInt2620 = 0;
				Static159.method2586(Static336.aClass54_85);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 21) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static46.anInt864 = 2;
				Static115.anInt2620 = 0;
				Static124.anInt6125 = arg0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static17.aClass54_10);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5502(local25);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 6) {
			Static124.anInt6125 = arg0;
			Static46.anInt864 = 2;
			Static115.anInt2620 = 0;
			Static438.anInt7195 = arg1;
			Static159.method2586(Static98.aClass54_32);
			Static424.aClass2_Sub23_Sub2_1.method5470(local15 + Static48.anInt962);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static324.anInt5624 + local18);
			Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5454(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static116.method2059(local15, local18, local32);
		}
		if (local21 == 20) {
			Static438.anInt7195 = arg1;
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static159.method2586(Static17.aClass54_11);
			Static424.aClass2_Sub23_Sub2_1.method5470(local25);
			Static424.aClass2_Sub23_Sub2_1.method5454(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5507(local15 + Static48.anInt962);
			Static42.method3511(local15, local18);
		}
		if (local21 == 57) {
			local389 = Static259.method3899(local15, local18);
			if (local389 != null) {
				Static274.method4056(local389);
			}
		}
		if (local21 == 46) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static46.anInt864 = 2;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static84.aClass54_27);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 12) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static438.anInt7195 = arg1;
				Static115.anInt2620 = 0;
				Static124.anInt6125 = arg0;
				Static46.anInt864 = 2;
				Static159.method2586(Static343.aClass54_86);
				Static424.aClass2_Sub23_Sub2_1.method5507(local25);
				Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static423.anInt7418);
				Static424.aClass2_Sub23_Sub2_1.method5478(Static142.anInt3047);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static154.anInt3161);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 17) {
			Static438.anInt7195 = arg1;
			Static46.anInt864 = 2;
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static159.method2586(Static87.aClass54_29);
			Static424.aClass2_Sub23_Sub2_1.method5502(local25);
			Static424.aClass2_Sub23_Sub2_1.method5454(local15 + Static48.anInt962);
			Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5507(Static324.anInt5624 + local18);
			Static42.method3511(local15, local18);
		}
		if (local21 == 1010 || local21 == 1008 || local21 == 1004 || local21 == 1009 || local21 == 1001) {
			Static117.method2076(local15, local21, local25);
		}
		if (local21 == 13) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static124.anInt6125 = arg0;
				Static46.anInt864 = 2;
				Static115.anInt2620 = 0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static202.aClass54_55);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 1011) {
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static438.anInt7195 = arg1;
			Static159.method2586(Static206.aClass54_56);
			Static424.aClass2_Sub23_Sub2_1.method5454(local15 + Static48.anInt962);
			Static424.aClass2_Sub23_Sub2_1.method5507(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5502((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static116.method2059(local15, local18, local32);
		}
		if (local21 == 47) {
			local266 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local266 != null) {
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static438.anInt7195 = arg1;
				Static115.anInt2620 = 0;
				Static159.method2586(Static129.aClass54_42);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local266.method4935(), local266.anIntArray524[0], local266.method4935(), local266.anIntArray525[0]);
			}
		}
		if (local21 == 1006) {
			Static46.anInt864 = 2;
			Static124.anInt6125 = arg0;
			Static438.anInt7195 = arg1;
			Static115.anInt2620 = 0;
			Static159.method2586(Static187.aClass54_53);
			Static424.aClass2_Sub23_Sub2_1.method5502(local25);
		}
		if (local21 == 23) {
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static46.anInt864 = 2;
			Static438.anInt7195 = arg1;
			Static159.method2586(Static173.aClass54_51);
			Static424.aClass2_Sub23_Sub2_1.method5502(local25);
			Static424.aClass2_Sub23_Sub2_1.method5507(local15 + Static48.anInt962);
			Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static324.anInt5624 + local18);
			Static42.method3511(local15, local18);
		}
		if (local21 == 50) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static233.aClass54_64);
				Static424.aClass2_Sub23_Sub2_1.method5507(Static423.anInt7418);
				Static424.aClass2_Sub23_Sub2_1.method5506(Static142.anInt3047);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static154.anInt3161);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5489(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 18) {
			Static46.anInt864 = 2;
			Static124.anInt6125 = arg0;
			Static438.anInt7195 = arg1;
			Static115.anInt2620 = 0;
			Static159.method2586(Static335.aClass54_20);
			Static424.aClass2_Sub23_Sub2_1.method5449(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5454(local25);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static48.anInt962 + local15);
			Static424.aClass2_Sub23_Sub2_1.method5507(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5476(Static142.anInt3047);
			Static424.aClass2_Sub23_Sub2_1.method5502(Static154.anInt3161);
			Static424.aClass2_Sub23_Sub2_1.method5507(Static423.anInt7418);
			Static42.method3511(local15, local18);
		}
		if (local21 == 30) {
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static438.anInt7195 = arg1;
			Static46.anInt864 = 2;
			Static159.method2586(Static343.aClass54_86);
			Static424.aClass2_Sub23_Sub2_1.method5507(Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6137);
			Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static423.anInt7418);
			Static424.aClass2_Sub23_Sub2_1.method5478(Static142.anInt3047);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static154.anInt3161);
		}
		if (local21 == 51) {
			Static46.anInt864 = 1;
			Static438.anInt7195 = arg1;
			Static124.anInt6125 = arg0;
			Static115.anInt2620 = 0;
			Static159.method2586(Static277.aClass54_72);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static154.anInt3161);
			Static424.aClass2_Sub23_Sub2_1.method5470(Static423.anInt7418);
			Static424.aClass2_Sub23_Sub2_1.method5470(local18 + Static324.anInt5624);
			Static424.aClass2_Sub23_Sub2_1.method5507(local15 + Static48.anInt962);
			Static424.aClass2_Sub23_Sub2_1.method5506(Static142.anInt3047);
			Static346.method4766(0, 0, true, -4, 1, local18, 1, local15);
		}
		if (local21 == 4 && Static412.aClass68_14 == null) {
			Static43.method1874(local15, local18);
			Static412.aClass68_14 = Static259.method3899(local15, local18);
			Static78.method1460(Static412.aClass68_14);
		}
		if (local21 == 8) {
			local90 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local90 != null) {
				Static46.anInt864 = 2;
				Static124.anInt6125 = arg0;
				Static115.anInt2620 = 0;
				Static438.anInt7195 = arg1;
				Static159.method2586(Static167.aClass54_50);
				Static424.aClass2_Sub23_Sub2_1.method5454(local25);
				Static424.aClass2_Sub23_Sub2_1.method5459(Static334.aClass226_1.method4977(82) ? 1 : 0);
				Static346.method4766(0, 0, true, -2, local90.method4935(), local90.anIntArray524[0], local90.method4935(), local90.anIntArray525[0]);
			}
		}
		if (local21 == 44) {
			if (Static193.anInt3710 > 0 && Static334.aClass226_1.method4977(82) && Static334.aClass226_1.method4977(81)) {
				Static379.method5082(Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, local15 + Static48.anInt962, local18 + Static324.anInt5624);
			} else {
				Static438.anInt7195 = arg1;
				Static46.anInt864 = 1;
				Static115.anInt2620 = 0;
				Static124.anInt6125 = arg0;
				Static159.method2586(Static222.aClass54_61);
				Static424.aClass2_Sub23_Sub2_1.method5470(Static324.anInt5624 + local18);
				Static424.aClass2_Sub23_Sub2_1.method5502(local15 + Static48.anInt962);
			}
		}
		if (Static385.aBoolean441) {
			Static237.method3667();
		}
		if (Static84.aClass68_2 != null && Static353.anInt5985 == 0) {
			Static78.method1460(Static84.aClass68_2);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ya;IIILclient!ga;I)V")
	public static void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5) {
		if (Static23.anInt564 < 100) {
			Static116.method2053(arg4, arg1);
		}
		arg1.OA(arg5, arg0, arg5 + arg2, arg0 + arg3);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static23.anInt564 < 100) {
			local34 = arg2 / 2 + arg5;
			local45 = arg0 + arg3 / 2 - 20 - 18;
			arg1.O(arg5, arg0, arg2, arg3, -16777216, 0);
			arg1.method4426(local34 - 152, local45, 304, 34, Static124.aColorArray12[Static223.anInt4338].getRGB(), 0);
			arg1.O(local34 - 150, local45 - -2, Static23.anInt564 * 3, 30, Static176.aColorArray2[Static223.anInt4338].getRGB(), 0);
			Static114.aClass116_1.method4821(Static33.aColorArray3[Static223.anInt4338].getRGB(), Static172.aClass209_76.method4562(Static388.anInt6533), -1, local45 + 20, local34);
			return;
		}
		@Pc(116) int local116 = Static133.anInt2851 - (int) ((float) arg2 / Static88.aFloat67);
		local34 = (int) ((float) arg3 / Static88.aFloat67) + Static129.anInt2786;
		local45 = Static133.anInt2851 + (int) ((float) arg2 / Static88.aFloat67);
		Static63.anInt1423 = (int) ((float) (arg2 * 2) / Static88.aFloat67);
		Static446.anInt7246 = (int) ((float) (arg3 * 2) / Static88.aFloat67);
		@Pc(158) int local158 = Static129.anInt2786 - (int) ((float) arg3 / Static88.aFloat67);
		Static377.anInt6401 = Static133.anInt2851 - (int) ((float) arg2 / Static88.aFloat67);
		Static110.anInt2577 = Static129.anInt2786 - (int) ((float) arg3 / Static88.aFloat67);
		Static88.method3639(local116 + Static88.anInt4520, local34 + Static88.anInt4515, Static88.anInt4520 + local45, Static88.anInt4515 + local158, arg5, arg0, arg2 + arg5, arg3 + arg0 + 1);
		Static88.method3641(arg1);
		@Pc(203) Class14 local203 = Static88.method3650(arg1);
		Static305.method4336(local203, arg1);
		if (Static338.anInt6358 > 0) {
			Static377.anInt6398--;
			if (Static377.anInt6398 == 0) {
				Static338.anInt6358--;
				Static377.anInt6398 = 20;
			}
		}
		if (!Static121.aBoolean205) {
			return;
		}
		@Pc(234) int local234 = arg2 + arg5 - 5;
		@Pc(240) int local240 = arg3 + arg0 - 8;
		Static368.aClass116_4.method4812(local240, local234, "Fps:" + Static411.anInt6851, 16776960);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static368.aClass116_4.method4812(local255, local234, "Mem:" + local267 + "k", local269);
		local240 = local255 - 15;
	}
}
