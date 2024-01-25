import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt5489;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt5491;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_7;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_59 = new Class307(64);

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_53 = new Class144(66, -1);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static void method4884() {
		@Pc(8) Class3_Sub2_Sub1 local8 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		for (@Pc(10) int local10 = 0; local10 < Static412.anInt6361; local10++) {
			@Pc(18) int local18 = Static493.anIntArray574[local10];
			@Pc(26) Class9_Sub1_Sub1_Sub2_Sub2 local26 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) local18)).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(30) int local30 = local8.method2048(255);
			if ((local30 & 0x80) != 0) {
				local30 += local8.method2048(255) << 8;
			}
			if ((local30 & 0x100) != 0) {
				local30 += local8.method2048(255) << 16;
			}
			@Pc(65) int local65;
			if ((local30 & 0x8000) != 0) {
				local65 = local8.method2044();
				local26.anInt8779 = local8.method2048(255);
				local26.anInt8777 = local8.method2039();
				local26.aBoolean592 = (local65 & 0x8000) != 0;
				local26.anInt8788 = local65 & 0x7FFF;
				local26.anInt8797 = Static716.anInt11157 + local26.anInt8788 + local26.anInt8779;
			}
			@Pc(112) int local112;
			@Pc(121) int local121;
			@Pc(125) int local125;
			@Pc(131) int local131;
			@Pc(148) boolean local148;
			if ((local30 & 0x10) != 0) {
				local65 = local8.method2028(-14795);
				local112 = local8.method2011();
				if (local65 == 65535) {
					local65 = -1;
				}
				local121 = local8.method2039();
				local125 = local121 & 0x7;
				local131 = local121 >> 3 & 0xF;
				if (local131 == 15) {
					local131 = -1;
				}
				local148 = (local121 >> 7 & 0x1) == 1;
				local26.method7480(0, local148, local125, local112, local65, local131);
			}
			if ((local30 & 0x1) != 0) {
				if (local26.aClass219_1.method5038()) {
					Static454.method6007(local26);
				}
				local26.method7509(Static255.aClass14_1.method619(local8.method2029()));
				local26.method7481(local26.aClass219_1.anInt5693);
				local26.anInt8807 = local26.aClass219_1.lb << 3;
				if (local26.aClass219_1.method5038()) {
					Static296.method4149(local26.anIntArray644[0], (Class9_Sub1_Sub1_Sub2_Sub1) null, 0, (Class247) null, local26, local26.aByte139, local26.anIntArray643[0]);
				}
			}
			if ((local30 & 0x4) != 0) {
				local26.method7505(local8.method2014());
			}
			@Pc(248) int[] local248;
			@Pc(251) int[] local251;
			@Pc(264) int local264;
			if ((local30 & 0x200) != 0) {
				local65 = local8.method2075();
				local248 = new int[local65];
				local251 = new int[local65];
				@Pc(254) int[] local254 = new int[local65];
				for (local131 = 0; local131 < local65; local131++) {
					local264 = local8.method2029();
					if (local264 == 65535) {
						local264 = -1;
					}
					local248[local131] = local264;
					local251[local131] = local8.method2053();
					local254[local131] = local8.method2060();
				}
				Static518.method6974(local254, local248, local26, local251);
			}
			if ((local30 & 0x10000) != 0) {
				local65 = local8.method2060();
				local112 = local8.method2069();
				if (local65 == 65535) {
					local65 = -1;
				}
				local121 = local8.method2053();
				local125 = local121 & 0x7;
				local131 = local121 >> 3 & 0xF;
				if (local131 == 15) {
					local131 = -1;
				}
				local148 = (local121 >> 7 & 0x1) == 1;
				local26.method7480(3, local148, local125, local112, local65, local131);
			}
			if ((local30 & 0x40) != 0) {
				@Pc(370) int[] local370 = new int[4];
				for (local112 = 0; local112 < 4; local112++) {
					local370[local112] = local8.method2060();
					if (local370[local112] == 65535) {
						local370[local112] = -1;
					}
				}
				local121 = local8.method2075();
				Static98.method1975(local370, true, local26, local121);
			}
			if ((local30 & 0x8) != 0) {
				local26.anInt8767 = local8.method2044();
				if (local26.anInt8767 == 65535) {
					local26.anInt8767 = -1;
				}
			}
			if ((local30 & 0x40000) != 0) {
				local26.aString115 = local8.method2014();
				if ("".equals(local26.aString115) || local26.aString115.equals(local26.aClass219_1.aString69)) {
					local26.aString115 = local26.aClass219_1.aString69;
				}
			}
			if ((local30 & 0x2000) != 0) {
				local65 = local8.method2044();
				local112 = local8.method2036();
				if (local65 == 65535) {
					local65 = -1;
				}
				local121 = local8.method2048(255);
				local125 = local121 & 0x7;
				local131 = local121 >> 3 & 0xF;
				if (local131 == 15) {
					local131 = -1;
				}
				local148 = (local121 >> 7 & 0x1) == 1;
				local26.method7480(1, local148, local125, local112, local65, local131);
			}
			if ((local30 & 0x4000) != 0) {
				local26.aByte128 = local8.method2062();
				local26.aByte127 = local8.method2049();
				local26.aByte129 = local8.method2062();
				local26.aByte130 = (byte) local8.method2053();
				local26.anInt8804 = Static716.anInt11157 + local8.method2060();
				local26.anInt8802 = Static716.anInt11157 + local8.method2028(-14795);
			}
			if ((local30 & 0x2) != 0) {
				local26.anInt8842 = local8.method2044();
				local26.anInt8839 = local8.method2060();
			}
			if ((local30 & 0x100000) != 0) {
				local26.anInt8835 = local8.method2044();
				if (local26.anInt8835 == 65535) {
					local26.anInt8835 = local26.aClass219_1.anInt5702;
				}
			}
			if ((local30 & 0x400) != 0) {
				local26.anInt8813 = local8.method2023();
				local26.anInt8806 = local8.method2022();
				local26.anInt8810 = local8.method2062();
				local26.anInt8808 = local8.method2023();
				local26.anInt8811 = local8.method2044() + Static716.anInt11157;
				local26.anInt8812 = local8.method2029() + Static716.anInt11157;
				local26.anInt8805 = local8.method2075();
				local26.anInt8806 += local26.anIntArray643[0];
				local26.anInt8808 += local26.anIntArray643[0];
				local26.anInt8813 += local26.anIntArray644[0];
				local26.anInt8817 = 1;
				local26.anInt8810 += local26.anIntArray644[0];
				local26.anInt8816 = 0;
			}
			@Pc(802) int local802;
			@Pc(829) int local829;
			@Pc(819) short[] local819;
			@Pc(760) int[] local760;
			@Pc(792) short[] local792;
			@Pc(862) long local862;
			if ((local30 & 0x20000) != 0) {
				local65 = local26.aClass219_1.anIntArray406.length;
				local112 = 0;
				if (local26.aClass219_1.aShortArray68 != null) {
					local112 = local26.aClass219_1.aShortArray68.length;
				}
				if (local26.aClass219_1.aShortArray69 != null) {
					local112 = local26.aClass219_1.aShortArray69.length;
				}
				local125 = local8.method2048(255);
				if ((local125 & 0x1) != 1) {
					local760 = null;
					if ((local125 & 0x2) == 2) {
						local760 = new int[local65];
						for (local264 = 0; local264 < local65; local264++) {
							local760[local264] = local8.method2029();
						}
					}
					local792 = null;
					if ((local125 & 0x4) == 4) {
						local792 = new short[local112];
						for (local802 = 0; local802 < local112; local802++) {
							local792[local802] = (short) local8.method2044();
						}
					}
					local819 = null;
					if ((local125 & 0x8) == 8) {
						local819 = new short[0];
						for (local829 = 0; local829 < 0; local829++) {
							local819[local829] = (short) local8.method2029();
						}
					}
					local862 = (long) local26.anInt8840++ << 32 | (long) local18;
					new Class187(local862, local760, local792, local819);
				}
			}
			if ((local30 & 0x80000) != 0) {
				local65 = local8.method2044();
				if (local65 == 65535) {
					local65 = -1;
				}
				local112 = local8.method2036();
				local121 = local8.method2039();
				local125 = local121 & 0x7;
				local131 = local121 >> 3 & 0xF;
				if (local131 == 15) {
					local131 = -1;
				}
				local148 = (local121 >> 7 & 0x1) == 1;
				local26.method7480(2, local148, local125, local112, local65, local131);
			}
			if ((local30 & 0x1000) != 0) {
				local65 = local8.method2039();
				local248 = new int[local65];
				local251 = new int[local65];
				for (local125 = 0; local125 < local65; local125++) {
					local131 = local8.method2060();
					if ((local131 & 0xC000) == 49152) {
						local264 = local8.method2044();
						local248[local125] = local131 << 16 | local264;
					} else {
						local248[local125] = local131;
					}
					local251[local125] = local8.method2044();
				}
				local26.method7483(local251, local248);
			}
			if ((local30 & 0x20) != 0) {
				local65 = local8.method2039();
				if (local65 > 0) {
					for (local112 = 0; local112 < local65; local112++) {
						local125 = -1;
						local131 = -1;
						local264 = -1;
						local121 = local8.method2054();
						if (local121 == 32767) {
							local121 = local8.method2054();
							local131 = local8.method2054();
							local125 = local8.method2054();
							local264 = local8.method2054();
						} else if (local121 == 32766) {
							local121 = -1;
						} else {
							local131 = local8.method2054();
						}
						local802 = local8.method2054();
						local829 = local8.method2039();
						local26.method7497(local121, Static716.anInt11157, local131, local829, local264, local802, local125);
					}
				}
			}
			if ((local30 & 0x800) != 0) {
				local65 = local26.aClass219_1.anIntArray408.length;
				local112 = 0;
				if (local26.aClass219_1.aShortArray68 != null) {
					local112 = local26.aClass219_1.aShortArray68.length;
				}
				local121 = 0;
				if (local26.aClass219_1.aShortArray69 != null) {
					local121 = local26.aClass219_1.aShortArray69.length;
				}
				local125 = local8.method2053();
				if ((local125 & 0x1) == 1) {
					local26.aClass187_1 = null;
				} else {
					local760 = null;
					if ((local125 & 0x2) == 2) {
						local760 = new int[local65];
						for (local264 = 0; local264 < local65; local264++) {
							local760[local264] = local8.method2060();
						}
					}
					local792 = null;
					if ((local125 & 0x4) == 4) {
						local792 = new short[local112];
						for (local802 = 0; local802 < local112; local802++) {
							local792[local802] = (short) local8.method2060();
						}
					}
					local819 = null;
					if ((local125 & 0x8) == 8) {
						local819 = new short[local121];
						for (local829 = 0; local829 < local121; local829++) {
							local819[local829] = (short) local8.method2044();
						}
					}
					local862 = (long) local26.anInt8828++ << 32 | (long) local18;
					local26.aClass187_1 = new Class187(local862, local760, local792, local819);
				}
			}
		}
		if (false) {
			anInterface4_7 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public static void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub21 local8 = Static136.method2378(0L, 15);
		local8.method9256();
		local8.anInt10899 = arg0;
		local8.anInt10897 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method4886() {
		Static256.aClass342_26 = new Class342();
	}
}
