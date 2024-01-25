import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!caa", name = "F", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_23 = new Class208(52, 7);

	@OriginalMember(owner = "client!caa", name = "eb", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_24 = new Class208(61, 2);

	@OriginalMember(owner = "client!caa", name = "fb", descriptor = "Lclient!em;")
	public static final Class83 aClass83_32 = new Class83(9, 3);

	@OriginalMember(owner = "client!caa", name = "gb", descriptor = "Lclient!em;")
	public static final Class83 aClass83_33 = new Class83(76, -2);

	@OriginalMember(owner = "client!caa", name = "hb", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_25 = new Class208(6, 3);

	@OriginalMember(owner = "client!caa", name = "ib", descriptor = "I")
	public static int anInt1021 = 0;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "()V")
	public static void method899() {
		for (@Pc(1) int local1 = 0; local1 < Static356.anInt6520; local1++) {
			if (!Static328.aBooleanArray27[local1]) {
				@Pc(10) Class49 local10 = Static31.aClass49Array1[local1];
				@Pc(13) Class1_Sub24 local13 = local10.aClass1_Sub24_1;
				@Pc(16) int local16 = local10.anInt1425;
				@Pc(22) int local22 = local13.method7610() - Static513.anInt8858;
				@Pc(30) int local30 = (local22 * 2 >> Static166.anInt7796) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7609() - local22 >> Static166.anInt7796;
				@Pc(53) int local53 = local13.method7608() - local22 >> Static166.anInt7796;
				@Pc(61) int local61 = local13.method7608() + local22 >> Static166.anInt7796;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static191.anInt3757) {
					local61 = Static191.anInt3757 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray10[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static327.anInt5993) {
						local108 = Static327.anInt5993 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub1_Sub1 local141 = Static432.method6172(local16, local125, local78, tg.class);
						if (local141 != null && local141.aByte102 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte102 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray10[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray10[local32 - 1];
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
									local182 = local10.aShortArray10[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray10[local32 + 1];
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
				Static328.aBooleanArray27[local1] = true;
				Static310.aClass129Array5[local16].method6482(local13, local37);
			}
		}
	}
}
