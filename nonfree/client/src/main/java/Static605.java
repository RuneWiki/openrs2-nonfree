import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "Lclient!pda;")
	public static Class51 aClass51_10;

	@OriginalMember(owner = "client!vea", name = "G", descriptor = "I")
	public static int anInt10017 = 0;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!ria;)V")
	public static void method8507(@OriginalArg(1) Class303 arg0) {
		if (Static531.anInt8552 != arg0.anInt7972) {
			return;
		}
		if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82 == null) {
			arg0.anInt7945 = 0;
			arg0.anInt7992 = 0;
			return;
		}
		arg0.anInt7997 = 150;
		arg0.anInt7967 = (int) (Math.sin((double) Static389.anInt6694 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7956 = 5;
		arg0.anInt7992 = Static608.anInt10056;
		arg0.anInt7945 = Static480.method6805(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82);
		arg0.anInt7931 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8095;
		arg0.anInt7913 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8128;
		arg0.anInt7990 = 0;
		arg0.anInt8005 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8059;
		@Pc(72) Class228 local72 = arg0.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(arg0.anInt7931);
		if (local72 != null) {
			Static70.method1614(local72, arg0.anInt8005);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "()V")
	public static void method8509() {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt53; local1++) {
			if (!Static420.aBooleanArray20[local1]) {
				@Pc(10) Class342 local10 = Static547.aClass342Array1[local1];
				@Pc(13) Class2_Sub12 local13 = local10.aClass2_Sub12_1;
				@Pc(16) int local16 = local10.anInt9281;
				@Pc(22) int local22 = local13.method7418() - Static620.anInt10145;
				@Pc(30) int local30 = (local22 * 2 >> Static326.anInt5713) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method7415() - local22 >> Static326.anInt5713;
				@Pc(53) int local53 = local13.method7421() - local22 >> Static326.anInt5713;
				@Pc(61) int local61 = local13.method7421() + local22 >> Static326.anInt5713;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static389.anInt6693) {
					local61 = Static389.anInt6693 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray141[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static595.anInt9881) {
						local108 = Static595.anInt9881 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class16_Sub1_Sub1 local141 = Static22.method567(local16, local125, local78, ii.class);
						if (local141 != null && local141.aByte110 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte110 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray141[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray141[local32 - 1];
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
									local182 = local10.aShortArray141[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray141[local32 + 1];
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
				Static420.aBooleanArray20[local1] = true;
				Static511.aClass91Array3[local16].method7455(local13, local37);
			}
		}
	}
}
