import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hfa", name = "H", descriptor = "Lclient!rs;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_52 = new Class349(46, -2);

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!gk;)Lclient!sm;")
	public static Class313 method2490(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(12) String local12 = arg0.method4494();
		@Pc(21) Class322 local21 = Static30.method394()[arg0.method4464()];
		@Pc(28) Class347 local28 = Static226.method2754()[arg0.method4464()];
		@Pc(34) int local34 = arg0.method4478();
		@Pc(38) int local38 = arg0.method4478();
		@Pc(42) int local42 = arg0.method4464();
		@Pc(46) int local46 = arg0.method4464();
		@Pc(50) int local50 = arg0.method4464();
		@Pc(54) int local54 = arg0.method4518();
		@Pc(58) int local58 = arg0.method4518();
		@Pc(62) int local62 = arg0.method4509();
		@Pc(66) int local66 = arg0.method4509();
		@Pc(70) int local70 = arg0.method4509();
		return new Class313(local12, local21, local28, local34, local38, local42, local46, local50, local54, local58, local62, local66, local70);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "()V")
	public static void method2495() {
		for (@Pc(1) int local1 = 0; local1 < Static312.anInt5136; local1++) {
			if (!Static463.aBooleanArray25[local1]) {
				@Pc(10) Class141 local10 = Static375.aClass141Array1[local1];
				@Pc(13) Class2_Sub11 local13 = local10.aClass2_Sub11_1;
				@Pc(16) int local16 = local10.anInt2907;
				@Pc(22) int local22 = local13.method7277() - Static437.anInt7021;
				@Pc(30) int local30 = (local22 * 2 >> Static562.anInt9207) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7276() - local22 >> Static562.anInt9207;
				@Pc(53) int local53 = local13.method7271() - local22 >> Static562.anInt9207;
				@Pc(61) int local61 = local13.method7271() + local22 >> Static562.anInt9207;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static405.anInt6657) {
					local61 = Static405.anInt6657 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray69[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static83.anInt1434) {
						local108 = Static83.anInt1434 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class12_Sub2_Sub1 local141 = Static32.method551(local16, local125, local78, wo.class);
						if (local141 != null && local141.aByte129 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte129 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray69[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray69[local32 - 1];
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
									local182 = local10.aShortArray69[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray69[local32 + 1];
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
				Static463.aBooleanArray25[local1] = true;
				Static114.aClass151Array1[local16].method7674(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIZ)I")
	public static int method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZII)Z")
	public static boolean method2498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static143.method5992(arg0, arg1) & Static554.method7256(arg1, arg0);
	}
}
