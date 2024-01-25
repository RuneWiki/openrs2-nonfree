import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public static int anInt9463;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!vo;")
	public static Class348 aClass348_117;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public static int anInt9457 = 0;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "J")
	public static final long aLong265 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	public static int anInt9467 = 0;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public static int anInt9470 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
	public static void method7292() {
		for (@Pc(1) int local1 = 0; local1 < Static566.anInt10281; local1++) {
			if (!Static516.aBooleanArray25[local1]) {
				@Pc(10) Class85 local10 = Static201.aClass85Array1[local1];
				@Pc(13) Class4_Sub3 local13 = local10.aClass4_Sub3_1;
				@Pc(16) int local16 = local10.anInt2551;
				@Pc(22) int local22 = local13.method4950() - Static209.anInt4422;
				@Pc(30) int local30 = (local22 * 2 >> Static392.anInt3635) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4954() - local22 >> Static392.anInt3635;
				@Pc(53) int local53 = local13.method4949() - local22 >> Static392.anInt3635;
				@Pc(61) int local61 = local13.method4949() + local22 >> Static392.anInt3635;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static255.anInt5209) {
					local61 = Static255.anInt5209 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray24[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static10.anInt812) {
						local108 = Static10.anInt812 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class21_Sub1_Sub1 local141 = Static36.method1049(local16, local125, local78, at.class);
						if (local141 != null && local141.aByte126 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte126 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray24[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray24[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray24[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray24[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static516.aBooleanArray25[local1] = true;
				Static255.aClass115Array2[local16].method8057(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZZ)V")
	public static void method7293(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static63.anInt1660--;
			if (Static63.anInt1660 == 0) {
				Static394.anIntArray413 = null;
			}
		}
		if (arg0) {
			Static93.anInt2344--;
			if (Static93.anInt2344 == 0) {
				Static117.anIntArray125 = null;
			}
		}
	}
}
