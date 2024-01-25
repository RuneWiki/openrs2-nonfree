import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public static int anInt2393;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Lclient!of;")
	public static final Class174 aClass174_70 = new Class174("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_64 = new Class136(78, 2);

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_64 = new Class163(38, 12);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
	public static void method2071() {
		for (@Pc(1) int local1 = 0; local1 < Static329.anInt5518; local1++) {
			if (!Static66.aBooleanArray6[local1]) {
				@Pc(10) Class226 local10 = Static197.aClass226Array1[local1];
				@Pc(13) Class3_Sub7 local13 = local10.aClass3_Sub7_2;
				@Pc(16) int local16 = local10.anInt6363;
				@Pc(22) int local22 = local13.method2478() - Static22.anInt382;
				@Pc(30) int local30 = (local22 * 2 >> Static437.anInt7308) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method2483() - local22 >> Static437.anInt7308;
				@Pc(53) int local53 = local13.method2481() - local22 >> Static437.anInt7308;
				@Pc(61) int local61 = local13.method2481() + local22 >> Static437.anInt7308;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static342.anInt5746) {
					local61 = Static342.anInt5746 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray111[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static459.anInt5916) {
						local108 = Static459.anInt5916 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class1_Sub2 local141 = Static313.method4388(local16, local125, local78, hi.class);
						if (local141 != null && local141.aByte100 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte100 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray111[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray111[local32 - 1];
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
									local182 = local10.aShortArray111[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray111[local32 + 1];
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
				Static66.aBooleanArray6[local1] = true;
				Static178.aClass55Array1[local16].method3818(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public static void method2072() {
		Static198.aClass268_28.method6160();
	}
}
