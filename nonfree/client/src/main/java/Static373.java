import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!pc;")
	public static Class188 aClass188_22;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public static void method905() {
		Static268.anInt4957 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static334.anInt5941; local3++) {
			@Pc(8) Class1 local8 = Static325.aClass1Array2[local3];
			@Pc(12) int local12;
			if (Static412.anIntArray482 != null) {
				for (local12 = 0; local12 < Static412.anIntArray482.length; local12++) {
					if (Static412.anIntArray482[local12] != -1000000 && (local8.anInt13 <= Static412.anIntArray482[local12] || local8.anInt19 <= Static412.anIntArray482[local12]) && (local8.anInt17 <= Static349.anIntArray413[local12] || local8.anInt11 <= Static349.anIntArray413[local12]) && (local8.anInt17 >= Static60.anIntArray81[local12] || local8.anInt11 >= Static60.anIntArray81[local12]) && (local8.anInt12 <= Static395.anIntArray458[local12] || local8.anInt21 <= Static395.anIntArray458[local12]) && (local8.anInt12 >= Static347.anIntArray411[local12] || local8.anInt21 >= Static347.anIntArray411[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt1 == 1) {
				local12 = local8.anInt3 + Static178.anInt3432 - Static249.anInt4746;
				if (local12 >= 0 && local12 <= Static178.anInt3432 + Static178.anInt3432) {
					local110 = local8.anInt18 + Static178.anInt3432 - Static404.anInt7034;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static178.anInt3432 + Static178.anInt3432) {
						continue;
					}
					local128 = local8.anInt4 + Static178.anInt3432 - Static404.anInt7034;
					if (local128 > Static178.anInt3432 + Static178.anInt3432) {
						local128 = Static178.anInt3432 + Static178.anInt3432;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static348.aBooleanArrayArray7[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static305.anInt1349 - local8.anInt17;
						if (local164 > Static412.anInt7193) {
							local8.anInt2 = 1;
						} else {
							if (local164 >= -Static412.anInt7193) {
								continue;
							}
							local8.anInt2 = 2;
							local164 = -local164;
						}
						local8.anInt6 = (local8.anInt12 - Static49.anInt1358 << 8) / local164;
						local8.anInt10 = (local8.anInt21 - Static49.anInt1358 << 8) / local164;
						local8.anInt5 = (local8.anInt13 - Static304.anInt5395 << 8) / local164;
						local8.anInt16 = (local8.anInt19 - Static304.anInt5395 << 8) / local164;
						Static58.aClass1Array1[Static268.anInt4957++] = local8;
					}
				}
			} else if (local8.anInt1 == 2) {
				local12 = local8.anInt18 + Static178.anInt3432 - Static404.anInt7034;
				if (local12 >= 0 && local12 <= Static178.anInt3432 + Static178.anInt3432) {
					local110 = local8.anInt3 + Static178.anInt3432 - Static249.anInt4746;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static178.anInt3432 + Static178.anInt3432) {
						continue;
					}
					local128 = local8.anInt7 + Static178.anInt3432 - Static249.anInt4746;
					if (local128 > Static178.anInt3432 + Static178.anInt3432) {
						local128 = Static178.anInt3432 + Static178.anInt3432;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static348.aBooleanArrayArray7[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static49.anInt1358 - local8.anInt12;
						if (local164 > Static412.anInt7193) {
							local8.anInt2 = 3;
						} else {
							if (local164 >= -Static412.anInt7193) {
								continue;
							}
							local8.anInt2 = 4;
							local164 = -local164;
						}
						local8.anInt15 = (local8.anInt17 - Static305.anInt1349 << 8) / local164;
						local8.anInt9 = (local8.anInt11 - Static305.anInt1349 << 8) / local164;
						local8.anInt5 = (local8.anInt13 - Static304.anInt5395 << 8) / local164;
						local8.anInt16 = (local8.anInt19 - Static304.anInt5395 << 8) / local164;
						Static58.aClass1Array1[Static268.anInt4957++] = local8;
					}
				}
			} else if (local8.anInt1 == 4) {
				local12 = local8.anInt13 - Static304.anInt5395;
				if (local12 > Static102.anInt2184) {
					local110 = local8.anInt18 + Static178.anInt3432 - Static404.anInt7034;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static178.anInt3432 + Static178.anInt3432) {
						continue;
					}
					local128 = local8.anInt4 + Static178.anInt3432 - Static404.anInt7034;
					if (local128 > Static178.anInt3432 + Static178.anInt3432) {
						local128 = Static178.anInt3432 + Static178.anInt3432;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3 + Static178.anInt3432 - Static249.anInt4746;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static178.anInt3432 + Static178.anInt3432) {
						continue;
					}
					local164 = local8.anInt7 + Static178.anInt3432 - Static249.anInt4746;
					if (local164 > Static178.anInt3432 + Static178.anInt3432) {
						local164 = Static178.anInt3432 + Static178.anInt3432;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static348.aBooleanArrayArray7[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt2 = 5;
						local8.anInt15 = (local8.anInt17 - Static305.anInt1349 << 8) / local12;
						local8.anInt9 = (local8.anInt11 - Static305.anInt1349 << 8) / local12;
						local8.anInt6 = (local8.anInt12 - Static49.anInt1358 << 8) / local12;
						local8.anInt10 = (local8.anInt21 - Static49.anInt1358 << 8) / local12;
						Static58.aClass1Array1[Static268.anInt4957++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[BI[BII)V")
	public static void method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg1++;
				arg4[local30] += arg5[arg0++];
				@Pc(42) int local42 = arg1++;
				arg4[local42] += arg5[arg0++];
				@Pc(54) int local54 = arg1++;
				arg4[local54] += arg5[arg0++];
				@Pc(66) int local66 = arg1++;
				arg4[local66] += arg5[arg0++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local30 = arg1++;
				arg4[local30] += arg5[arg0++];
			}
			arg0 += arg3;
			arg1 += arg7;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z")
	public static boolean method910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
