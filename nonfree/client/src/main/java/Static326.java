import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!te", name = "U", descriptor = "[Lclient!sc;")
	public static Class215[] aClass215Array1;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_87 = new Class32("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_88 = new Class32("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
	public static int anInt5621 = 0;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Lclient!al;")
	public static final Class2_Sub5 aClass2_Sub5_1 = new Class2_Sub5(0, 0);

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_122 = new Class205(84, 28);

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
	public static void method4843() {
		if (Static216.anInt3923 == 0 || Static216.anInt3923 == 5) {
			return;
		}
		try {
			if (++Static197.anInt3648 > 2000) {
				if (Static88.aClass221_1 != null) {
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
				}
				if (Static181.anInt6172 >= 1) {
					Static216.anInt3923 = 0;
					Static139.anInt2783 = -5;
					return;
				}
				Static181.anInt6172++;
				Static216.anInt3923 = 1;
				if (Static167.anInt5329 == Static255.anInt4505) {
					Static167.anInt5329 = Static41.anInt831;
				} else {
					Static167.anInt5329 = Static255.anInt4505;
				}
				Static197.anInt3648 = 0;
			}
			if (Static216.anInt3923 == 1) {
				Static35.aClass182_1 = Static359.aClass111_5.method2798(Static167.anInt5329, Static61.aString15);
				Static216.anInt3923 = 2;
			}
			if (Static216.anInt3923 == 2) {
				if (Static35.aClass182_1.anInt4498 == 2) {
					throw new IOException();
				}
				if (Static35.aClass182_1.anInt4498 != 1) {
					return;
				}
				Static88.aClass221_1 = new Class221((Socket) Static35.aClass182_1.anObject6, Static359.aClass111_5);
				Static35.aClass182_1 = null;
				@Pc(108) long local108 = Static109.aLong75 = Static363.method5387(Static385.aString67);
				@Pc(115) int local115 = (int) (local108 >> 16 & 0x1FL);
				Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
				Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_1.anInt444);
				Static372.aClass2_Sub16_Sub2_4.method5358(local115);
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, 2);
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				@Pc(150) int local150 = Static88.aClass221_1.method4794();
				if (Static269.aClass85_2 != null) {
					Static269.aClass85_2.method4224();
				}
				if (Static156.aClass85_1 != null) {
					Static156.aClass85_1.method4224();
				}
				if (local150 != 0) {
					Static139.anInt2783 = local150;
					Static216.anInt3923 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					return;
				}
				Static216.anInt3923 = 3;
			}
			if (Static216.anInt3923 == 3) {
				if (Static88.aClass221_1.method4795() < 8) {
					return;
				}
				Static88.aClass221_1.method4800(0, 8, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
				Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
				Static240.aLong143 = Static218.aClass2_Sub16_Sub2_3.method5348();
				@Pc(207) int[] local207 = new int[4];
				local207[0] = (int) (Math.random() * 9.9999999E7D);
				Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
				local207[2] = (int) (Static240.aLong143 >> 32);
				local207[1] = (int) (Math.random() * 9.9999999E7D);
				local207[3] = (int) Static240.aLong143;
				Static372.aClass2_Sub16_Sub2_4.method5358(10);
				Static372.aClass2_Sub16_Sub2_4.method5355(local207[0]);
				Static372.aClass2_Sub16_Sub2_4.method5355(local207[1]);
				Static372.aClass2_Sub16_Sub2_4.method5355(local207[2]);
				Static372.aClass2_Sub16_Sub2_4.method5355(local207[3]);
				Static372.aClass2_Sub16_Sub2_4.method5368(Static363.method5387(Static385.aString67));
				Static372.aClass2_Sub16_Sub2_4.method5362(Static192.aString41);
				Static372.aClass2_Sub16_Sub2_4.method5347(Static200.aBigInteger1, Static278.aBigInteger2);
				Static214.aClass2_Sub16_Sub2_1.anInt6145 = 0;
				if (Static391.anInt6627 == 40) {
					Static214.aClass2_Sub16_Sub2_1.method5358(Static320.aClass17_5.anInt444);
				} else {
					Static214.aClass2_Sub16_Sub2_1.method5358(Static320.aClass17_3.anInt444);
				}
				Static214.aClass2_Sub16_Sub2_1.method5351(Static372.aClass2_Sub16_Sub2_4.anInt6145 + Static204.method3471(Static9.aString6) + 161);
				Static214.aClass2_Sub16_Sub2_1.method5355(573);
				Static214.aClass2_Sub16_Sub2_1.method5358(Static241.anInt4323);
				Static214.aClass2_Sub16_Sub2_1.method5358(Static162.method2888());
				Static214.aClass2_Sub16_Sub2_1.method5351(Static253.anInt4467);
				Static214.aClass2_Sub16_Sub2_1.method5351(Static362.anInt6102);
				Static214.aClass2_Sub16_Sub2_1.method5358(Static131.anInt2686);
				Static193.method3305(Static214.aClass2_Sub16_Sub2_1);
				Static214.aClass2_Sub16_Sub2_1.method5362(Static9.aString6);
				Static214.aClass2_Sub16_Sub2_1.method5355(Static16.anInt383);
				Static214.aClass2_Sub16_Sub2_1.method5355(Static246.method3932());
				Static64.aBoolean92 = true;
				Static214.aClass2_Sub16_Sub2_1.method5351(Static48.anInt968);
				Static214.aClass2_Sub16_Sub2_1.method5355(Static347.aClass171_93.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static137.aClass171_75.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static29.aClass171_10.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static86.aClass171_30.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static329.aClass171_85.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static200.aClass171_51.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static233.aClass171_53.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static237.aClass171_58.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static263.aClass171_64.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static357.aClass171_69.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static138.aClass171_15.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static165.aClass171_41.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static305.aClass171_80.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static120.aClass171_35.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static49.aClass171_17.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static187.aClass171_47.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static308.aClass171_81.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static135.aClass171_46.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static275.aClass171_74.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static81.aClass171_29.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static41.aClass171_13.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static201.aClass171_52.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static320.aClass171_82.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static67.aClass171_25.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static356.aClass171_94.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static93.aClass171_31.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static110.aClass171_34.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static246.aClass171_61.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5355(Static21.aClass171_6.method3771());
				Static214.aClass2_Sub16_Sub2_1.method5344(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				Static88.aClass221_1.method4796(Static214.aClass2_Sub16_Sub2_1.aByteArray112, Static214.aClass2_Sub16_Sub2_1.anInt6145);
				Static372.aClass2_Sub16_Sub2_4.method5376(local207);
				for (@Pc(589) int local589 = 0; local589 < 4; local589++) {
					local207[local589] += 50;
				}
				Static218.aClass2_Sub16_Sub2_3.method5376(local207);
				Static216.anInt3923 = 4;
			}
			@Pc(627) int local627;
			if (Static216.anInt3923 == 4) {
				if (Static88.aClass221_1.method4795() < 1) {
					return;
				}
				local627 = Static88.aClass221_1.method4794();
				if (local627 == 21) {
					Static216.anInt3923 = 7;
				} else if (local627 == 29) {
					Static216.anInt3923 = 11;
				} else if (local627 == 1) {
					Static139.anInt2783 = local627;
					Static216.anInt3923 = 5;
					return;
				} else if (local627 == 2) {
					Static216.anInt3923 = 8;
				} else if (local627 == 15) {
					Static216.anInt3923 = 12;
					Static276.anInt4757 = -2;
				} else if (local627 == 23 && Static181.anInt6172 < 1) {
					Static216.anInt3923 = 1;
					Static181.anInt6172++;
					Static197.anInt3648 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					return;
				} else {
					Static139.anInt2783 = local627;
					Static216.anInt3923 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
					return;
				}
			}
			if (Static216.anInt3923 == 6) {
				Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
				Static372.aClass2_Sub16_Sub2_4.method5381(Static320.aClass17_4.anInt444);
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				Static216.anInt3923 = 4;
			} else if (Static216.anInt3923 == 7) {
				if (Static88.aClass221_1.method4795() >= 1) {
					Static163.anInt2452 = Static88.aClass221_1.method4794() * 60 + 180;
					Static139.anInt2783 = 21;
					Static216.anInt3923 = 0;
					Static88.aClass221_1.method4801();
					Static88.aClass221_1 = null;
				}
			} else if (Static216.anInt3923 != 11) {
				if (Static216.anInt3923 == 8) {
					if (Static88.aClass221_1.method4795() < 13) {
						return;
					}
					Static88.aClass221_1.method4800(0, 13, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
					Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
					Static303.anInt5133 = Static218.aClass2_Sub16_Sub2_3.method5350();
					Static359.anInt6022 = Static218.aClass2_Sub16_Sub2_3.method5350();
					Static305.aBoolean386 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static169.aBoolean245 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static108.aBoolean393 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static51.aBoolean82 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static176.anInt3381 = Static218.aClass2_Sub16_Sub2_3.method5312();
					Static330.aBoolean414 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static269.aBoolean348 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
					Static221.aClass118_6.method2860(Static269.aBoolean348);
					Static15.aClass81_1.method2185(Static269.aBoolean348);
					Static356.aClass48_2.method956(Static269.aBoolean348);
					if (Static305.aBoolean386 && !Static108.aBoolean393 || Static330.aBoolean414) {
						try {
							Static403.method4138("zap", Static359.aClass111_5.anApplet1);
						} catch (@Pc(902) Throwable local902) {
							if (Static195.aBoolean280) {
								try {
									Static359.aClass111_5.anApplet1.getAppletContext().showDocument(new URL(Static359.aClass111_5.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(918) Exception local918) {
								}
							}
						}
					} else {
						try {
							Static403.method4138("unzap", Static359.aClass111_5.anApplet1);
						} catch (@Pc(892) Throwable local892) {
						}
					}
					if (Static17.aClass117_1 == Static141.aClass117_7) {
						try {
							Static403.method4138("loggedin", Static359.aClass111_5.anApplet1);
						} catch (@Pc(930) Throwable local930) {
						}
					}
					Static216.anInt3923 = 10;
				}
				if (Static216.anInt3923 == 10) {
					if (Static218.aClass2_Sub16_Sub2_3.method5385()) {
						if (Static88.aClass221_1.method4795() < 1) {
							return;
						}
						Static88.aClass221_1.method4800(Static218.aClass2_Sub16_Sub2_3.anInt6145 + 2, 1, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
					}
					Static339.aClass205_128 = Static228.method3721()[Static218.aClass2_Sub16_Sub2_3.method5388()];
					Static276.anInt4757 = Static218.aClass2_Sub16_Sub2_3.method5312();
					Static216.anInt3923 = 9;
				}
				if (Static216.anInt3923 == 9) {
					if (Static88.aClass221_1.method4795() >= Static276.anInt4757) {
						Static88.aClass221_1.method4800(0, Static276.anInt4757, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
						Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
						Static216.anInt3923 = 0;
						local627 = Static276.anInt4757;
						Static139.anInt2783 = 2;
						Static30.method550();
						Static199.method3354(Static218.aClass2_Sub16_Sub2_3);
						Static94.anInt1924 = -1;
						Static250.method3961(false);
						if (local627 != Static218.aClass2_Sub16_Sub2_3.anInt6145) {
							throw new RuntimeException("lswp pos:" + Static218.aClass2_Sub16_Sub2_3.anInt6145 + " psize:" + local627);
						}
						Static339.aClass205_128 = null;
					}
				} else if (Static216.anInt3923 == 12) {
					if (Static276.anInt4757 == -2) {
						if (Static88.aClass221_1.method4795() < 2) {
							return;
						}
						Static88.aClass221_1.method4800(0, 2, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
						Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
						Static276.anInt4757 = Static218.aClass2_Sub16_Sub2_3.method5312();
					}
					if (Static88.aClass221_1.method4795() >= Static276.anInt4757) {
						Static88.aClass221_1.method4800(0, Static276.anInt4757, Static218.aClass2_Sub16_Sub2_3.aByteArray112);
						Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
						Static216.anInt3923 = 0;
						Static139.anInt2783 = 15;
						local627 = Static276.anInt4757;
						Static116.method2412();
						Static199.method3354(Static218.aClass2_Sub16_Sub2_3);
						if (local627 != Static218.aClass2_Sub16_Sub2_3.anInt6145) {
							throw new RuntimeException("lswpr pos:" + Static218.aClass2_Sub16_Sub2_3.anInt6145 + " psize:" + local627);
						}
						Static339.aClass205_128 = null;
					}
				}
			} else if (Static88.aClass221_1.method4795() >= 1) {
				Static301.anInt5344 = Static88.aClass221_1.method4794();
				Static216.anInt3923 = 0;
				Static139.anInt2783 = 29;
				Static88.aClass221_1.method4801();
				Static88.aClass221_1 = null;
			}
		} catch (@Pc(1124) IOException local1124) {
			if (Static88.aClass221_1 != null) {
				Static88.aClass221_1.method4801();
				Static88.aClass221_1 = null;
			}
			if (Static181.anInt6172 >= 1) {
				Static216.anInt3923 = 0;
				Static139.anInt2783 = -4;
			} else {
				Static216.anInt3923 = 1;
				if (Static167.anInt5329 == Static255.anInt4505) {
					Static167.anInt5329 = Static41.anInt831;
				} else {
					Static167.anInt5329 = Static255.anInt4505;
				}
				Static197.anInt3648 = 0;
				Static181.anInt6172++;
			}
		}
	}
}
