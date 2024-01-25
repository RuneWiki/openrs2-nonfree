import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
	public static int anInt8190 = 0;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)V")
	public static void method7125() {
		if (Static355.anInt6072 == 0 || Static355.anInt6072 == 10) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Static531.anInt9126 == 0) {
				local21 = 250;
			} else {
				local21 = 2000;
			}
			if (Static686.anInt11152 != 2 || Static355.anInt6072 != 20 && Static203.anInt3512 != 42) {
				Static163.anInt2494++;
			}
			if (Static662.aBoolean747 && Static355.anInt6072 >= 6) {
				local21 = 6000;
			}
			if (local21 < Static163.anInt2494) {
				Static591.aClass347_3.method8306();
				if (Static531.anInt9126 >= 3) {
					Static355.anInt6072 = 0;
					Static612.method8634(-5);
					return;
				}
				if (Static686.anInt11152 == 2) {
					Static564.aClass357_4.method8506();
				} else {
					Static575.aClass357_5.method8506();
				}
				Static531.anInt9126++;
				Static163.anInt2494 = 0;
				Static355.anInt6072 = 1;
			}
			if (Static355.anInt6072 == 1) {
				if (Static686.anInt11152 == 2) {
					Static591.aClass347_3.aClass230_9 = Static564.aClass357_4.method8511(Static344.aClass173_5);
				} else {
					Static591.aClass347_3.aClass230_9 = Static575.aClass357_5.method8511(Static344.aClass173_5);
				}
				Static355.anInt6072 = 2;
			}
			@Pc(176) Class14_Sub54 local176;
			@Pc(203) int local203;
			@Pc(250) int local250;
			if (Static355.anInt6072 == 2) {
				if (Static591.aClass347_3.aClass230_9.anInt6256 == 2) {
					throw new IOException();
				}
				if (Static591.aClass347_3.aClass230_9.anInt6256 != 1) {
					return;
				}
				Static591.aClass347_3.aClass278_2 = Static405.method6124((Socket) Static591.aClass347_3.aClass230_9.anObject12);
				Static591.aClass347_3.aClass230_9 = null;
				Static591.aClass347_3.method8304();
				local176 = Static594.method8426();
				if (Static662.aBoolean747) {
					local176.aClass14_Sub21_Sub2_2.method7747(Static307.aClass358_12.anInt9944);
					local176.aClass14_Sub21_Sub2_2.method7751(0);
					local203 = local176.aClass14_Sub21_Sub2_2.anInt8936;
					local176.aClass14_Sub21_Sub2_2.method7730(661);
					if (Static686.anInt11152 == 2) {
						local176.aClass14_Sub21_Sub2_2.method7747(Static387.anInt9114 == 14 ? 1 : 0);
					}
					@Pc(229) Class14_Sub21 local229 = Static61.method1032();
					local229.method7747(Static325.anInt5631);
					local229.method7751((int) (Math.random() * 9.9999999E7D));
					local229.method7747(Static26.anInt352);
					local229.method7730(Static449.anInt7513);
					for (local250 = 0; local250 < 6; local250++) {
						local229.method7730((int) (Math.random() * 9.9999999E7D));
					}
					local229.method7735(Static1.aLong189);
					local229.method7747(Static161.aClass80_6.anInt1861);
					local229.method7747((int) (Math.random() * 9.9999999E7D));
					local229.method7697(Static141.aBigInteger5, Static51.aBigInteger1);
					local176.aClass14_Sub21_Sub2_2.method7743(0, local229.aByteArray99, local229.anInt8936);
					local176.aClass14_Sub21_Sub2_2.method7716(local176.aClass14_Sub21_Sub2_2.anInt8936 - local203);
				} else {
					local176.aClass14_Sub21_Sub2_2.method7747(Static307.aClass358_1.anInt9944);
				}
				Static591.aClass347_3.method8308(local176);
				Static591.aClass347_3.method8303();
				Static355.anInt6072 = 3;
			}
			@Pc(350) int local350;
			if (Static355.anInt6072 == 3) {
				if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				local350 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				if (local350 != 0) {
					Static355.anInt6072 = 0;
					Static612.method8634(local350);
					Static591.aClass347_3.method8306();
					Static40.method670();
					return;
				}
				if (Static662.aBoolean747) {
					Static355.anInt6072 = 4;
				} else {
					Static355.anInt6072 = 8;
				}
			}
			if (Static355.anInt6072 == 4) {
				if (!Static591.aClass347_3.aClass278_2.method6653(2)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(2, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7717(-1978450544);
				Static355.anInt6072 = 5;
			}
			if (Static355.anInt6072 == 5) {
				if (!Static591.aClass347_3.aClass278_2.method6653(Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7757(Static4.anIntArray2);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				@Pc(458) String local458 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7739();
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				@Pc(466) String local466 = "opensn";
				if (!Static571.aBoolean654 || Static637.method8919(Static344.aClass173_5, 1, local458, local466).anInt6256 == 2) {
					Static418.method6275(true, local466, Static344.aClass173_5, local458, Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1);
				}
				Static355.anInt6072 = 6;
			}
			if (Static355.anInt6072 == 6) {
				if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				if ((Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF) == 1) {
					Static355.anInt6072 = 7;
				}
			}
			if (Static355.anInt6072 == 7) {
				if (!Static591.aClass347_3.aClass278_2.method6653(16)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(16, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 16;
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7757(Static4.anIntArray2);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				Static314.aString72 = Static423.aString83 = Static580.method8268(Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7729());
				Static210.aLong121 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7729();
				Static355.anInt6072 = 8;
			}
			@Pc(613) Class14_Sub21_Sub2 local613;
			if (Static355.anInt6072 == 8) {
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				Static591.aClass347_3.method8304();
				local176 = Static594.method8426();
				local613 = local176.aClass14_Sub21_Sub2_2;
				@Pc(641) int local641;
				@Pc(650) Class14_Sub21 local650;
				@Pc(622) Class358 local622;
				if (Static686.anInt11152 == 2) {
					if (Static662.aBoolean747) {
						local622 = Static307.aClass358_13;
					} else {
						local622 = Static307.aClass358_3;
					}
					local613.method7747(local622.anInt9944);
					local613.method7751(0);
					local250 = local613.anInt8936;
					local641 = local613.anInt8936;
					if (!Static662.aBoolean747) {
						local613.method7730(661);
						local613.method7747(Static387.anInt9114 == 14 ? 1 : 0);
						local641 = local613.anInt8936;
						local650 = Static317.method5019();
						local613.method7743(0, local650.aByteArray99, local650.anInt8936);
						local641 = local613.anInt8936;
						local613.method7690(Static314.aString72);
					}
					local613.method7747(Static426.anInt7228);
					local613.method7747(Static141.method2141());
					local613.method7751(Static563.anInt4939);
					local613.method7751(Static506.anInt8791);
					local613.method7747(Static181.aClass14_Sub26_9.aClass43_Sub17_2.method4949());
					Static485.method7320(local613);
					local613.method7690(Static130.aString30);
					local613.method7730(Static449.anInt7513);
					local650 = Static181.aClass14_Sub26_9.method5279();
					local613.method7747(local650.anInt8936);
					local613.method7743(0, local650.aByteArray99, local650.anInt8936);
					Static411.aBoolean499 = true;
					@Pc(832) Class14_Sub21 local832 = new Class14_Sub21(Static526.aClass14_Sub12_1.method1248());
					Static526.aClass14_Sub12_1.method1247(local832);
					local613.method7743(0, local832.aByteArray99, local832.aByteArray99.length);
					local613.method7730(Static130.anInt2077);
					local613.method7735(Static653.aLong311);
					local613.method7747(Static573.aString106 == null ? 0 : 1);
					if (Static573.aString106 != null) {
						local613.method7690(Static573.aString106);
					}
					local613.method7747(Static327.method5103("jagtheora") ? 1 : 0);
					local613.method7747(Static571.aBoolean654 ? 1 : 0);
					Static370.method5553(local613);
					local613.method7710(Static4.anIntArray2, local613.anInt8936, local641);
					local613.method7716(local613.anInt8936 - local250);
				} else {
					if (Static662.aBoolean747) {
						local622 = Static307.aClass358_13;
					} else {
						local622 = Static307.aClass358_5;
					}
					local613.method7747(local622.anInt9944);
					local613.method7751(0);
					local250 = local613.anInt8936;
					local641 = local613.anInt8936;
					if (!Static662.aBoolean747) {
						local613.method7730(661);
						local650 = Static317.method5019();
						local613.method7743(0, local650.aByteArray99, local650.anInt8936);
						local641 = local613.anInt8936;
						local613.method7690(Static314.aString72);
					}
					local613.method7747(Static161.aClass80_6.anInt1861);
					local613.method7747(Static26.anInt352);
					Static485.method7320(local613);
					local613.method7690(Static130.aString30);
					local613.method7730(Static449.anInt7513);
					Static370.method5553(local613);
					local613.method7710(Static4.anIntArray2, local613.anInt8936, local641);
					local613.method7716(local613.anInt8936 - local250);
				}
				Static591.aClass347_3.method8308(local176);
				Static591.aClass347_3.method8303();
				Static591.aClass347_3.aClass197_2 = new Class197(Static4.anIntArray2);
				for (@Pc(924) int local924 = 0; local924 < 4; local924++) {
					Static4.anIntArray2[local924] += 50;
				}
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7760(Static4.anIntArray2);
				Static4.anIntArray2 = null;
				Static355.anInt6072 = 9;
			}
			if (Static355.anInt6072 == 9) {
				if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				local350 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				if (local350 == 21) {
					Static355.anInt6072 = 12;
				} else if (local350 == 29 || local350 == 45) {
					Static272.anInt8983 = local350;
					Static355.anInt6072 = 18;
				} else if (local350 == 1) {
					Static355.anInt6072 = 10;
					Static612.method8634(local350);
					return;
				} else if (local350 == 2) {
					Static355.anInt6072 = 13;
				} else if (local350 == 15) {
					Static591.aClass347_3.anInt9628 = -2;
					Static355.anInt6072 = 19;
				} else if (local350 == 23 && Static531.anInt9126 < 3) {
					Static531.anInt9126++;
					Static355.anInt6072 = 1;
					Static163.anInt2494 = 0;
					Static591.aClass347_3.aClass278_2.method6651();
					Static591.aClass347_3.aClass278_2 = null;
					return;
				} else if (local350 == 42) {
					Static355.anInt6072 = 20;
					Static612.method8634(local350);
					return;
				} else if (!Static537.aBoolean634 || Static662.aBoolean747 || Static325.anInt5631 == -1 || local350 != 35) {
					Static355.anInt6072 = 0;
					Static612.method8634(local350);
					Static591.aClass347_3.aClass278_2.method6651();
					Static591.aClass347_3.aClass278_2 = null;
					Static40.method670();
					return;
				} else {
					Static355.anInt6072 = 1;
					Static662.aBoolean747 = true;
					Static163.anInt2494 = 0;
					Static591.aClass347_3.aClass278_2.method6651();
					Static591.aClass347_3.aClass278_2 = null;
					return;
				}
			}
			if (Static355.anInt6072 == 11) {
				Static591.aClass347_3.method8304();
				local176 = Static594.method8426();
				local613 = local176.aClass14_Sub21_Sub2_2;
				local613.method7759(Static591.aClass347_3.aClass197_2);
				local613.method7761(Static307.aClass358_9.anInt9944);
				Static591.aClass347_3.method8308(local176);
				Static591.aClass347_3.method8303();
				Static355.anInt6072 = 9;
				return;
			}
			if (Static355.anInt6072 == 12) {
				if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				local350 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				Static355.anInt6072 = 0;
				Static270.anInt5019 = local350 * 50;
				Static612.method8634(21);
				Static591.aClass347_3.aClass278_2.method6651();
				Static591.aClass347_3.aClass278_2 = null;
				Static40.method670();
				return;
			}
			if (Static355.anInt6072 == 20) {
				if (!Static591.aClass347_3.aClass278_2.method6653(2)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(2, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static445.anInt7494 = ((Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF) << 8) + (Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[1] & 0xFF);
				Static355.anInt6072 = 9;
				return;
			}
			if (Static355.anInt6072 == 18) {
				if (Static272.anInt8983 == 29) {
					if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
						return;
					}
					Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
					Static368.anInt6246 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				} else if (Static272.anInt8983 == 45) {
					if (!Static591.aClass347_3.aClass278_2.method6653(3)) {
						return;
					}
					Static591.aClass347_3.aClass278_2.method6650(3, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
					Static368.anInt6246 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
					Static301.anInt5895 = ((Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[1] & 0xFF) << 8) + (Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[2] & 0xFF);
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static272.anInt8983);
				}
				Static355.anInt6072 = 0;
				Static612.method8634(Static272.anInt8983);
				Static591.aClass347_3.aClass278_2.method6651();
				Static591.aClass347_3.aClass278_2 = null;
				Static40.method670();
				return;
			}
			if (Static355.anInt6072 == 13) {
				if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(1, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static355.anInt6072 = 14;
				Static311.anInt5504 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				return;
			}
			@Pc(1429) Class14_Sub21_Sub2 local1429;
			if (Static355.anInt6072 == 14) {
				local1429 = Static591.aClass347_3.aClass14_Sub21_Sub2_1;
				if (Static686.anInt11152 == 2) {
					if (!Static591.aClass347_3.aClass278_2.method6653(Static311.anInt5504)) {
						return;
					}
					Static591.aClass347_3.aClass278_2.method6650(Static311.anInt5504, local1429.aByteArray99, 0);
					local1429.anInt8936 = 0;
					Static469.anInt11068 = local1429.method7695(115);
					Static496.anInt8375 = local1429.method7695(120);
					Static321.aBoolean403 = local1429.method7695(94) == 1;
					Static586.aBoolean669 = local1429.method7695(113) == 1;
					Static351.aBoolean772 = local1429.method7695(102) == 1;
					Static292.aBoolean395 = local1429.method7695(102) == 1;
					Static597.anInt9858 = local1429.method7717(-1978450544);
					Static459.aBoolean734 = local1429.method7695(95) == 1;
					Static563.anInt4929 = local1429.method7755();
					Static212.aBoolean270 = local1429.method7695(120) == 1;
					Static532.aString103 = local1429.method7703(0);
					Static212.aClass249_4.method6121(Static212.aBoolean270);
					Static252.aClass56_1.method1045(Static212.aBoolean270);
					Static152.aClass61_1.method1232(Static212.aBoolean270);
				} else if (Static591.aClass347_3.aClass278_2.method6653(Static311.anInt5504)) {
					Static591.aClass347_3.aClass278_2.method6650(Static311.anInt5504, local1429.aByteArray99, 0);
					local1429.anInt8936 = 0;
					Static469.anInt11068 = local1429.method7695(113);
					Static496.anInt8375 = local1429.method7695(118);
					Static321.aBoolean403 = local1429.method7695(100) == 1;
					Static586.aBoolean669 = local1429.method7695(98) == 1;
					Static351.aBoolean772 = local1429.method7695(97) == 1;
					Static549.aLong58 = local1429.method7729();
					Static647.aLong306 = Static549.aLong58 - Static26.method382() - local1429.method7692(-58);
					local203 = local1429.method7695(100);
					Static459.aBoolean734 = (local203 & 0x1) != 0;
					Static111.aBoolean132 = (local203 & 0x2) != 0;
					Static73.anInt1202 = local1429.method7748();
					Static593.aBoolean673 = local1429.method7695(103) == 1;
					Static561.anInt9368 = local1429.method7748();
					Static449.anInt7516 = local1429.method7717(-1978450544);
					Static286.anInt5253 = local1429.method7717(-1978450544);
					Static37.anInt629 = local1429.method7717(-1978450544);
					Static173.anInt2825 = local1429.method7748();
					Static470.aClass230_8 = Static344.aClass173_5.method4232(Static173.anInt2825);
					Static459.anInt10511 = local1429.method7695(101);
					Static313.anInt5514 = local1429.method7717(-1978450544);
					Static502.anInt8747 = local1429.method7717(-1978450544);
					Static339.aBoolean411 = local1429.method7695(121) == 1;
					Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString38 = Static519.aString108 = local1429.method7739();
					Static489.anInt8467 = local1429.method7695(113);
					Static309.anInt8730 = local1429.method7748();
					Static217.aBoolean326 = local1429.method7695(111) == 1;
					Static264.aClass357_2 = new Class357();
					Static264.aClass357_2.anInt9936 = local1429.method7717(-1978450544);
					if (Static264.aClass357_2.anInt9936 == 65535) {
						Static264.aClass357_2.anInt9936 = -1;
					}
					Static264.aClass357_2.aString110 = local1429.method7739();
					if (Static548.aClass59_10 != Static115.aClass59_4) {
						Static264.aClass357_2.anInt9932 = Static264.aClass357_2.anInt9936 + 50000;
						Static264.aClass357_2.anInt9929 = Static264.aClass357_2.anInt9936 + 40000;
					}
					if (Static543.aClass59_9 != Static548.aClass59_10 && (Static548.aClass59_10 != Static268.aClass59_7 || Static469.anInt11068 < 2) && Static564.aClass357_4.method8512(Static537.aClass357_3)) {
						Static277.method4686();
					}
				} else {
					return;
				}
				if (Static321.aBoolean403 && !Static351.aBoolean772 || Static459.aBoolean734) {
					try {
						Static698.method8237(Static531.anApplet2, "zap");
					} catch (@Pc(1828) Throwable local1828) {
						if (Static535.aBoolean633) {
							try {
								Static531.anApplet2.getAppletContext().showDocument(new URL(Static531.anApplet2.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(1846) Exception local1846) {
							}
						}
					}
				} else {
					try {
						Static698.method8237(Static531.anApplet2, "unzap");
					} catch (@Pc(1857) Throwable local1857) {
					}
				}
				if (Static548.aClass59_10 == Static115.aClass59_4) {
					try {
						Static698.method8237(Static531.anApplet2, "loggedin");
					} catch (@Pc(1870) Throwable local1870) {
					}
				}
				if (Static686.anInt11152 != 2) {
					Static355.anInt6072 = 0;
					Static612.method8634(2);
					Static674.method9335();
					Static160.method2323(7);
					Static591.aClass347_3.aClass160_244 = null;
					return;
				}
				Static355.anInt6072 = 16;
			}
			if (Static355.anInt6072 == 16) {
				if (!Static591.aClass347_3.aClass278_2.method6653(3)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(3, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static355.anInt6072 = 17;
			}
			if (Static355.anInt6072 == 17) {
				local1429 = Static591.aClass347_3.aClass14_Sub21_Sub2_1;
				local1429.anInt8936 = 0;
				if (local1429.method7767()) {
					if (!Static591.aClass347_3.aClass278_2.method6653(1)) {
						return;
					}
					Static591.aClass347_3.aClass278_2.method6650(1, local1429.aByteArray99, 3);
				}
				Static591.aClass347_3.aClass160_244 = Static665.method9231()[local1429.method7769()];
				Static591.aClass347_3.anInt9628 = local1429.method7717(-1978450544);
				Static355.anInt6072 = 15;
			}
			if (Static355.anInt6072 == 15) {
				if (!Static591.aClass347_3.aClass278_2.method6653(Static591.aClass347_3.anInt9628)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(Static591.aClass347_3.anInt9628, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				Static355.anInt6072 = 0;
				local350 = Static591.aClass347_3.anInt9628;
				Static612.method8634(2);
				Static570.method8146();
				Static644.method9053(Static591.aClass347_3.aClass14_Sub21_Sub2_1);
				Static406.anInt7033 = -1;
				if (Static591.aClass347_3.aClass160_244 == Static635.aClass160_267) {
					Static479.method7247();
				} else {
					Static343.method5237();
				}
				if (local350 != Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936) {
					throw new RuntimeException("lswp pos:" + Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 + " psize:" + local350);
				}
				Static591.aClass347_3.aClass160_244 = null;
				return;
			}
			if (Static355.anInt6072 == 19) {
				if (Static591.aClass347_3.anInt9628 == -2) {
					if (!Static591.aClass347_3.aClass278_2.method6653(2)) {
						return;
					}
					Static591.aClass347_3.aClass278_2.method6650(2, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
					Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
					Static591.aClass347_3.anInt9628 = Static591.aClass347_3.aClass14_Sub21_Sub2_1.method7717(-1978450544);
				}
				if (!Static591.aClass347_3.aClass278_2.method6653(Static591.aClass347_3.anInt9628)) {
					return;
				}
				Static591.aClass347_3.aClass278_2.method6650(Static591.aClass347_3.anInt9628, Static591.aClass347_3.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
				Static355.anInt6072 = 0;
				local350 = Static591.aClass347_3.anInt9628;
				Static612.method8634(15);
				Static128.method1986();
				Static644.method9053(Static591.aClass347_3.aClass14_Sub21_Sub2_1);
				if (Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 != local350) {
					throw new RuntimeException("lswpr pos:" + Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 + " psize:" + local350);
				}
				Static591.aClass347_3.aClass160_244 = null;
				return;
			}
		} catch (@Pc(2176) IOException local2176) {
			Static591.aClass347_3.method8306();
			if (Static531.anInt9126 < 3) {
				if (Static686.anInt11152 == 2) {
					Static564.aClass357_4.method8506();
				} else {
					Static575.aClass357_5.method8506();
				}
				Static531.anInt9126++;
				Static163.anInt2494 = 0;
				Static355.anInt6072 = 1;
			} else {
				Static355.anInt6072 = 0;
				Static612.method8634(-4);
				Static40.method670();
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)V")
	public static void method7126(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 2);
		local9.method4001();
	}
}
