import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "Lclient!tj;")
	public static Class193 aClass193_60;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_185 = new Class159("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "[I")
	public static final int[] anIntArray312 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public static void method3259() {
		Static261.anInt5270 = 0;
		Static51.anInt1369 = 0;
		Static118.anInt2819 = 0;
		Static114.anInt2730 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!mb;III)J")
	public static long method3260(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class18 local15 = Static113.method2380(arg0.method5594());
		@Pc(36) long local36 = (long) ((arg2 | 0x800000) << 7 | arg1 | arg0.method5589() << 14 | arg0.method5590() << 20);
		if (local15.anInt503 == 0) {
			local36 |= local9;
		}
		if (local15.anInt542 == 1) {
			local36 |= local5;
		}
		if (local15.aBoolean39) {
			local36 |= local7;
		}
		return local36 | (long) arg0.method5594() << 32;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method3261(@OriginalArg(0) String arg0) {
		return Static319.method5249(arg0, 16);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public static void method3263() {
		if (Static345.aBoolean488) {
			return;
		}
		Static73.aBoolean138 = true;
		Static345.aBoolean488 = true;
		if (Static24.aBoolean37) {
			Static106.aFloat31 = (int) Static106.aFloat31 - 65 & 0xFFFFFF80;
		} else {
			Static172.aFloat67 += (-Static172.aFloat67 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public static void method3264() {
		for (@Pc(1) int local1 = 0; local1 < Static201.anInt4146; local1++) {
			if (!Static114.aBooleanArray14[local1]) {
				@Pc(10) Class4_Sub33_Sub1 local10 = Static25.aClass4_Sub33_Sub1Array1[local1];
				@Pc(13) int local13 = local10.anInt5312;
				@Pc(18) int local18 = local10.anInt5292 - 64;
				@Pc(26) int local26 = (local18 * 2 >> 7) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt5295 - local18 >> 7;
				@Pc(47) int local47 = local10.anInt5298 - local18 >> 7;
				@Pc(54) int local54 = local10.anInt5298 + local18 >> 7;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static15.anInt1162) {
					local54 = Static15.anInt1162 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray88[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static198.anInt4128) {
						local101 = Static198.anInt4128 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class8_Sub1 local134 = Static347.method5528(local13, local118, local71, sf.class);
						if (local134 != null && local134.aByte78 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte78 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray88[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray88[local28 - 1];
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
									local175 = local10.aShortArray88[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray88[local28 + 1];
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
				Static114.aBooleanArray14[local1] = true;
				Static261.aClass60Array2[local13].method2262(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIZZLclient!b;)V")
	public static void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class14 arg4) {
		if (Static187.anInt3921 >= 50 || (arg4 == null || arg4.anIntArrayArray8 == null || arg4.anIntArrayArray8.length <= arg2 || arg4.anIntArrayArray8[arg2] == null)) {
			return;
		}
		@Pc(30) int local30 = arg4.anIntArrayArray8[arg2][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg4.anIntArrayArray8[arg2].length > 1) {
			local61 = (int) (Math.random() * (double) arg4.anIntArrayArray8[arg2].length);
			if (local61 > 0) {
				local34 = arg4.anIntArrayArray8[arg2][local61];
			}
		}
		@Pc(74) int local74 = local30 & 0x1F;
		if (local74 == 0) {
			if (arg3) {
				Static24.method403(0, 255, local40, local34);
			}
		} else if (Static8.anInt192 != 0) {
			Static318.anIntArray482[Static187.anInt3921] = local34;
			Static357.anIntArray514[Static187.anInt3921] = local40;
			Static63.anIntArray95[Static187.anInt3921] = 0;
			Static249.aClass152Array1[Static187.anInt3921] = null;
			Static37.anIntArray45[Static187.anInt3921] = 255;
			local61 = (arg0 - 64) / 128;
			@Pc(123) int local123 = (arg1 - 64) / 128;
			Static276.anIntArray448[Static187.anInt3921] = (local123 << 8) + (local61 << 16) + local74;
			Static187.anInt3921++;
		}
	}
}
