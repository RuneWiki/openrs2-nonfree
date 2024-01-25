import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public static int anInt3244;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public static int anInt3243 = -1;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public static void method3022() {
		if (Static95.anInt6375 == 0 || Static95.anInt6375 == 5) {
			return;
		}
		try {
			if (++Static122.anInt4371 > 2000) {
				if (Static157.aClass173_1 != null) {
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
				}
				if (Static263.anInt5385 >= 1) {
					Static211.anInt4078 = -5;
					Static95.anInt6375 = 0;
					return;
				}
				Static95.anInt6375 = 1;
				Static263.anInt5385++;
				Static122.anInt4371 = 0;
				if (Static256.anInt5074 == Static165.anInt3323) {
					Static256.anInt5074 = Static163.anInt1490;
				} else {
					Static256.anInt5074 = Static165.anInt3323;
				}
			}
			if (Static95.anInt6375 == 1) {
				Static107.aClass193_2 = Static177.aClass168_2.method4848(Static85.aString19, Static256.anInt5074);
				Static95.anInt6375 = 2;
			}
			if (Static95.anInt6375 == 2) {
				if (Static107.aClass193_2.anInt6293 == 2) {
					throw new IOException();
				}
				if (Static107.aClass193_2.anInt6293 != 1) {
					return;
				}
				Static157.aClass173_1 = new Class173((Socket) Static107.aClass193_2.anObject7, Static177.aClass168_2);
				Static107.aClass193_2 = null;
				@Pc(101) long local101 = Static173.aLong103 = Static10.method376(Static244.aString43);
				Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
				@Pc(111) int local111 = (int) (local101 >> 16 & 0x1FL);
				Static74.aClass2_Sub10_Sub1_2.method4430(14);
				Static74.aClass2_Sub10_Sub1_2.method4430(local111);
				Static157.aClass173_1.method5021(2, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				@Pc(142) int local142 = Static157.aClass173_1.method5028();
				if (Static124.aClass94_2 != null) {
					Static124.aClass94_2.method5969();
				}
				if (Static221.aClass94_3 != null) {
					Static221.aClass94_3.method5969();
				}
				if (local142 != 0) {
					Static211.anInt4078 = local142;
					Static95.anInt6375 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				}
				Static95.anInt6375 = 3;
			}
			if (Static95.anInt6375 == 3) {
				if (Static157.aClass173_1.method5024() < 8) {
					return;
				}
				Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, 8);
				Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
				Static131.aLong81 = Static269.aClass2_Sub10_Sub1_3.method4447();
				@Pc(204) int[] local204 = new int[4];
				local204[1] = (int) (Math.random() * 9.9999999E7D);
				Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
				local204[2] = (int) (Static131.aLong81 >> 32);
				local204[0] = (int) (Math.random() * 9.9999999E7D);
				local204[3] = (int) Static131.aLong81;
				Static74.aClass2_Sub10_Sub1_2.method4430(10);
				Static74.aClass2_Sub10_Sub1_2.method4450(local204[0]);
				Static74.aClass2_Sub10_Sub1_2.method4450(local204[1]);
				Static74.aClass2_Sub10_Sub1_2.method4450(local204[2]);
				Static74.aClass2_Sub10_Sub1_2.method4450(local204[3]);
				Static74.aClass2_Sub10_Sub1_2.method4462(Static10.method376(Static244.aString43));
				Static74.aClass2_Sub10_Sub1_2.method4443(Static272.aString56);
				Static74.aClass2_Sub10_Sub1_2.method4405(Static302.aBigInteger2, Static31.aBigInteger1);
				Static337.aClass2_Sub10_Sub1_4.anInt4807 = 0;
				if (Static263.anInt5396 == 40) {
					Static337.aClass2_Sub10_Sub1_4.method4430(18);
				} else {
					Static337.aClass2_Sub10_Sub1_4.method4430(16);
				}
				Static337.aClass2_Sub10_Sub1_4.method4452(Static74.aClass2_Sub10_Sub1_2.anInt4807 + Static124.method3876(Static331.aString28) + 161);
				Static337.aClass2_Sub10_Sub1_4.method4450(569);
				Static337.aClass2_Sub10_Sub1_4.method4430(Static189.anInt5795);
				Static337.aClass2_Sub10_Sub1_4.method4430(Static129.method2627());
				Static337.aClass2_Sub10_Sub1_4.method4452(Static136.anInt2829);
				Static337.aClass2_Sub10_Sub1_4.method4452(Static198.anInt3876);
				Static337.aClass2_Sub10_Sub1_4.method4430(Static7.anInt152);
				Static74.method204(Static337.aClass2_Sub10_Sub1_4);
				Static337.aClass2_Sub10_Sub1_4.method4443(Static331.aString28);
				Static337.aClass2_Sub10_Sub1_4.method4450(Static94.anInt2145);
				Static337.aClass2_Sub10_Sub1_4.method4450(Static269.method4868());
				Static235.aBoolean413 = true;
				Static337.aClass2_Sub10_Sub1_4.method4452(Static352.anInt6926);
				Static337.aClass2_Sub10_Sub1_4.method4450(Static86.aClass191_55.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static275.aClass191_181.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static31.aClass191_18.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static178.aClass191_111.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static299.aClass191_164.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static122.aClass191_148.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static91.aClass191_59.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static201.aClass191_132.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static59.aClass191_35.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static229.aClass191_78.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static261.aClass191_169.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static198.aClass191_129.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static253.aClass191_222.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static318.aClass191_204.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static342.aClass191_221.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static355.aClass191_223.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static184.aClass191_116.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static233.aClass191_150.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static85.aClass191_53.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static68.aClass191_41.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static278.aClass191_182.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static137.aClass191_88.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static205.aClass191_135.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static133.aClass191_84.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static177.aClass191_110.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static179.aClass191_112.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static46.aClass191_26.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static186.aClass191_174.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4450(Static211.aClass191_140.method5453());
				Static337.aClass2_Sub10_Sub1_4.method4418(Static74.aClass2_Sub10_Sub1_2.aByteArray57, Static74.aClass2_Sub10_Sub1_2.anInt4807);
				Static157.aClass173_1.method5021(Static337.aClass2_Sub10_Sub1_4.anInt4807, Static337.aClass2_Sub10_Sub1_4.aByteArray57);
				Static74.aClass2_Sub10_Sub1_2.method2053(local204);
				for (@Pc(570) int local570 = 0; local570 < 4; local570++) {
					local204[local570] += 50;
				}
				Static269.aClass2_Sub10_Sub1_3.method2053(local204);
				Static95.anInt6375 = 4;
			}
			if (Static95.anInt6375 == 4) {
				if (Static157.aClass173_1.method5024() < 1) {
					return;
				}
				@Pc(606) int local606 = Static157.aClass173_1.method5028();
				if (local606 == 21) {
					Static95.anInt6375 = 7;
				} else if (local606 == 29) {
					Static95.anInt6375 = 10;
				} else if (local606 == 1) {
					Static211.anInt4078 = local606;
					Static95.anInt6375 = 5;
					return;
				} else if (local606 == 2) {
					Static95.anInt6375 = 8;
				} else if (local606 == 15) {
					Static95.anInt6375 = 0;
					Static211.anInt4078 = local606;
					return;
				} else if (local606 == 23 && Static263.anInt5385 < 1) {
					Static95.anInt6375 = 1;
					Static122.anInt4371 = 0;
					Static263.anInt5385++;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				} else {
					Static211.anInt4078 = local606;
					Static95.anInt6375 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
					return;
				}
			}
			if (Static95.anInt6375 == 6) {
				Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(17);
				Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
				Static95.anInt6375 = 4;
			} else if (Static95.anInt6375 == 7) {
				if (Static157.aClass173_1.method5024() >= 1) {
					Static15.anInt383 = Static157.aClass173_1.method5028() * 60 + 180;
					Static211.anInt4078 = 21;
					Static95.anInt6375 = 0;
					Static157.aClass173_1.method5027();
					Static157.aClass173_1 = null;
				}
			} else if (Static95.anInt6375 != 10) {
				if (Static95.anInt6375 == 8) {
					if (Static157.aClass173_1.method5024() < 13) {
						return;
					}
					Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, 13);
					Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
					Static295.anInt5969 = Static269.aClass2_Sub10_Sub1_3.method4421();
					Static300.anInt5863 = Static269.aClass2_Sub10_Sub1_3.method4421();
					Static81.aBoolean157 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static97.aBoolean601 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static209.aBoolean436 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static297.aBoolean539 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static40.anInt797 = Static269.aClass2_Sub10_Sub1_3.method4464();
					Static123.aBoolean232 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static58.aBoolean116 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
					Static323.method5668(Static58.aBoolean116);
					Static196.method3527(Static58.aBoolean116);
					Static327.method5754(Static58.aBoolean116);
					if (Static81.aBoolean157 && !Static209.aBoolean436 || Static123.aBoolean232) {
						try {
							Static358.method3(Static177.aClass168_2.anApplet1, "zap");
						} catch (@Pc(894) Throwable local894) {
						}
					} else {
						try {
							Static358.method3(Static177.aClass168_2.anApplet1, "unzap");
						} catch (@Pc(884) Throwable local884) {
						}
					}
					if (Static183.anInt3622 == 0) {
						try {
							Static358.method3(Static177.aClass168_2.anApplet1, "loggedin");
						} catch (@Pc(908) Throwable local908) {
						}
					}
					Static48.anInt1097 = Static269.aClass2_Sub10_Sub1_3.method2048();
					Static71.anInt1574 = Static269.aClass2_Sub10_Sub1_3.method4464();
					Static95.anInt6375 = 9;
				}
				if (Static95.anInt6375 == 9 && Static157.aClass173_1.method5024() >= Static71.anInt1574) {
					Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
					Static157.aClass173_1.method5020(Static269.aClass2_Sub10_Sub1_3.aByteArray57, 0, Static71.anInt1574);
					Static95.anInt6375 = 0;
					Static211.anInt4078 = 2;
					Static29.method762();
					Static278.anInt5657 = -1;
					Static114.method5710(false);
					Static48.anInt1097 = -1;
				}
			} else if (Static157.aClass173_1.method5024() >= 1) {
				Static99.anInt2256 = Static157.aClass173_1.method5028();
				Static95.anInt6375 = 0;
				Static211.anInt4078 = 29;
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
			}
		} catch (@Pc(959) IOException local959) {
			if (Static157.aClass173_1 != null) {
				Static157.aClass173_1.method5027();
				Static157.aClass173_1 = null;
			}
			if (Static263.anInt5385 >= 1) {
				Static211.anInt4078 = -4;
				Static95.anInt6375 = 0;
			} else {
				Static95.anInt6375 = 1;
				if (Static256.anInt5074 == Static165.anInt3323) {
					Static256.anInt5074 = Static163.anInt1490;
				} else {
					Static256.anInt5074 = Static165.anInt3323;
				}
				Static122.anInt4371 = 0;
				Static263.anInt5385++;
			}
		}
	}
}
