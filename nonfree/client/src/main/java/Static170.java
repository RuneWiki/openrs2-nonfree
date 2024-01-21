import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!qb;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[104][104];

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public static volatile int anInt4199 = -1;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static int[] anIntArray600 = new int[256];

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1440 = Static146.method2172("mapscene");

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	public static int anInt4200 = 0;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1441 = Static146.method2172("Einloggen");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLclient!ke;Lclient!ke;I)Lclient!kf;")
	public static Class2_Sub2_Sub14 method2834(@OriginalArg(2) Class43 arg0, @OriginalArg(3) Class43 arg1, @OriginalArg(4) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(15) int[] local15 = arg1.method2217(arg2);
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(26) byte[] local26 = arg1.method2222(local15[local17], arg2);
			if (local26 == null) {
				local5 = false;
			} else {
				@Pc(45) int local45 = (local26[0] & 0xFF) << 8 | local26[1] & 0xFF;
				@Pc(53) byte[] local53 = arg0.method2222(0, local45);
				if (local53 == null) {
					local5 = false;
				}
			}
		}
		if (!local5) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub14(arg1, arg0, arg2, false);
		} catch (@Pc(86) Exception local86) {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
	public static void method2835(@OriginalArg(0) int arg0) {
		if (!Static40.method798(arg0)) {
			return;
		}
		@Pc(14) Class66[] local14 = Static125.aClass66ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local14.length; local24++) {
			@Pc(30) Class66 local30 = local14[local24];
			if (local30 != null) {
				local30.anInt3209 = 0;
				local30.anInt3226 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method2836() {
		@Pc(1) Class30 local1 = Static84.aClass30_2;
		synchronized (Static84.aClass30_2) {
			Static31.anInt887 = Static23.anInt715;
			Static20.anInt631 = Static76.anInt1994;
			Static132.anInt3185 = anInt4199;
			Static50.anInt1384 = Static79.anInt2064;
			Static156.anInt3884 = Static143.anInt3516;
			Static38.anInt1113 = Static15.anInt486;
			Static114.aLong92 = Static177.aLong131;
			Static79.anInt2064 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!qf;II)I")
	public static int method2837(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray27 == null || arg1 >= arg0.anIntArrayArray27.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray27[arg1];
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(35) int local35 = local24[local26++];
				@Pc(37) byte local37 = 0;
				@Pc(39) int local39 = 0;
				if (local35 == 0) {
					return local30;
				}
				if (local35 == 1) {
					local39 = Static147.anIntArray521[local24[local26++]];
				}
				if (local35 == 15) {
					local37 = 1;
				}
				if (local35 == 2) {
					local39 = Static78.anIntArray343[local24[local26++]];
				}
				if (local35 == 16) {
					local37 = 2;
				}
				if (local35 == 17) {
					local37 = 3;
				}
				if (local35 == 3) {
					local39 = Static111.anIntArray428[local24[local26++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class66 local117;
				@Pc(122) int local122;
				@Pc(135) int local135;
				if (local35 == 4) {
					local106 = local24[local26++] << 16;
					@Pc(113) int local113 = local106 + local24[local26++];
					local117 = Static55.method1034(local113);
					local122 = local24[local26++];
					if (local122 != -1 && (!Static158.method2689(local122).aBoolean81 || Static153.aBoolean154)) {
						for (local135 = 0; local135 < local117.anIntArray468.length; local135++) {
							if (local117.anIntArray468[local135] == local122 + 1) {
								local39 += local117.anIntArray474[local135];
							}
						}
					}
				}
				if (local35 == 5) {
					local39 = Static6.anIntArray24[local24[local26++]];
				}
				if (local35 == 6) {
					local39 = Class2_Sub1_Sub20.anIntArray395[Static78.anIntArray343[local24[local26++]] - 1];
				}
				if (local35 == 7) {
					local39 = Static6.anIntArray24[local24[local26++]] * 100 / 46875;
				}
				if (local35 == 8) {
					local39 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4342;
				}
				if (local35 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static59.aBooleanArray6[local106]) {
							local39 += Static78.anIntArray343[local106];
						}
					}
				}
				if (local35 == 10) {
					local106 = local24[local26++] << 16;
					local106 += local24[local26++];
					local117 = Static55.method1034(local106);
					local122 = local24[local26++];
					if (local122 != -1 && (!Static158.method2689(local122).aBoolean81 || Static153.aBoolean154)) {
						for (local135 = 0; local135 < local117.anIntArray468.length; local135++) {
							if (local122 + 1 == local117.anIntArray468[local135]) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local35 == 11) {
					local39 = Static162.anInt1247;
				}
				if (local35 == 12) {
					local39 = Static82.anInt2150;
				}
				if (local35 == 13) {
					local106 = Static6.anIntArray24[local24[local26++]];
					@Pc(328) int local328 = local24[local26++];
					local39 = (local106 & 0x1 << local328) == 0 ? 0 : 1;
				}
				if (local35 == 14) {
					local106 = local24[local26++];
					local39 = Static53.method1023(local106);
				}
				if (local35 == 18) {
					local39 = (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 >> 7) + Static157.anInt3889;
				}
				if (local35 == 19) {
					local39 = (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 >> 7) + Static168.anInt4143;
				}
				if (local35 == 20) {
					local39 = local24[local26++];
				}
				if (local37 == 0) {
					if (local28 == 0) {
						local30 += local39;
					}
					if (local28 == 1) {
						local30 -= local39;
					}
					if (local28 == 2 && local39 != 0) {
						local30 /= local39;
					}
					if (local28 == 3) {
						local30 *= local39;
					}
					local28 = 0;
				} else {
					local28 = local37;
				}
			}
		} catch (@Pc(429) Exception local429) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method2838() {
		aClass77_1440 = null;
		aFontMetrics1 = null;
		anIntArrayArray37 = null;
		anInterface2_2 = null;
		aByteArrayArray10 = null;
		aClass77_1441 = null;
		anIntArray600 = null;
	}
}
