import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public static int anInt4409;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	public static int anInt4410;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_155 = new Class48(65, -1);

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
	public static int anInt4411 = -1;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "[I")
	private static final int[] anIntArray544 = new int[64];

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "Lclient!o;")
	public static final Class169 aClass169_238 = new Class169("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray60 = new String[100];

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	public static void method3910() {
		@Pc(8) int local8 = Static50.aByteArrayArray3.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static50.aByteArrayArray3[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static251.anInt4365; local20++) {
					if (Static223.anIntArray480[local10] == anIntArray544[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					anIntArray544[Static251.anInt4365] = Static223.anIntArray480[local10];
					local18 = Static251.anInt4365++;
				}
				@Pc(67) Class1_Sub33 local67 = new Class1_Sub33(Static50.aByteArrayArray3[local10]);
				@Pc(69) int local69 = 0;
				while (local67.lb < Static50.aByteArrayArray3[local10].length && local69 < 511 && Static309.anInt5243 < 1023) {
					@Pc(88) int local88 = local69++ << 6 | local18;
					@Pc(92) int local92 = local67.method5177();
					@Pc(96) int local96 = local92 >> 14;
					@Pc(102) int local102 = local92 >> 7 & 0x3F;
					@Pc(106) int local106 = local92 & 0x3F;
					@Pc(118) int local118 = (Static223.anIntArray480[local10] >> 8) * 64 + local102 - anInt4410;
					@Pc(132) int local132 = (Static223.anIntArray480[local10] & 0xFF) * 64 + local106 - Static293.anInt5053;
					@Pc(139) Class59 local139 = Static168.aClass196_2.method4452(local67.method5177());
					if (Static171.aClass25_Sub1_Sub1_Sub2Array1[local88] == null && (local139.aByte16 & 0x1) > 0 && Static35.anInt678 == local96 && local118 >= 0 && Static92.anInt1675 > local118 + local139.anInt1420 && local132 >= 0 && Static262.anInt6340 > local132 + local139.anInt1420) {
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local88] = new Class25_Sub1_Sub1_Sub2();
						Static171.aClass25_Sub1_Sub1_Sub2Array1[local88].anInt2331 = local88;
						@Pc(198) Class25_Sub1_Sub1_Sub2 local198 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local88];
						Static131.anIntArray302[Static309.anInt5243++] = local88;
						local198.anInt2319 = Static366.anInt5883;
						local198.method1899(local139);
						local198.method1882(local198.aClass59_1.anInt1420);
						local198.anInt2341 = local198.aClass59_1.anInt1414 << 3;
						if (local198.anInt2341 == 0) {
							local198.method1891(0);
						} else {
							local198.method1891(local198.aClass59_1.aByte18 + 4 << 11 & 0x3A1F);
						}
						local198.method1900(local96, local132, local198.method1877(), true, local118);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZ)V")
	public static void method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static188.aClass135_Sub1_1.anInt3382 == 0 || arg3 == 0 || Static104.anInt1830 >= 50 || arg0 == -1) {
			return;
		}
		Static300.anIntArray609[Static104.anInt1830] = arg0;
		Static254.anIntArray539[Static104.anInt1830] = arg3;
		Static255.anIntArray542[Static104.anInt1830] = arg2;
		Static311.aClass159Array1[Static104.anInt1830] = null;
		Static57.anIntArray700[Static104.anInt1830] = 0;
		Static190.anIntArray390[Static104.anInt1830] = arg1;
		Static104.anInt1830++;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
	public static void method3913() {
		for (@Pc(1) int local1 = 0; local1 < Static164.anInt2967; local1++) {
			if (!Static43.aBooleanArray3[local1]) {
				@Pc(10) Class1_Sub27_Sub1 local10 = Static300.aClass1_Sub27_Sub1Array3[local1];
				@Pc(13) int local13 = local10.anInt3881;
				@Pc(18) int local18 = local10.anInt3868 - Static276.anInt5131;
				@Pc(26) int local26 = (local18 * 2 >> Static365.anInt5876) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt3874 - local18 >> Static365.anInt5876;
				@Pc(47) int local47 = local10.anInt3873 - local18 >> Static365.anInt5876;
				@Pc(54) int local54 = local10.anInt3873 + local18 >> Static365.anInt5876;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static230.anInt6113) {
					local54 = Static230.anInt6113 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray92[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static19.anInt329) {
						local101 = Static19.anInt329 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class25_Sub1 local134 = Static67.method1123(local13, local118, local71, ug.class);
						if (local134 != null && local134.aByte69 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte69 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray92[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray92[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray92[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray92[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static43.aBooleanArray3[local1] = true;
				Static229.aClass42Array3[local13].method3050(local10, local33);
			}
		}
	}
}
