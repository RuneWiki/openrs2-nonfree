import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	public static int anInt3077;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "[Lclient!sr;")
	public static final Class26_Sub2_Sub4_Sub1[] aClass26_Sub2_Sub4_Sub1Array1 = new Class26_Sub2_Sub4_Sub1[32768];

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean185 = true;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
	public static final int[] anIntArray268 = new int[100];

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public static int anInt3074 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
	public static void method2491() {
		for (@Pc(1) int local1 = 0; local1 < Static270.anInt4582; local1++) {
			if (!Static128.aBooleanArray9[local1]) {
				@Pc(10) Class74 local10 = Static302.aClass74Array1[local1];
				@Pc(13) Class7_Sub30 local13 = local10.aClass7_Sub30_2;
				@Pc(16) int local16 = local10.anInt2041;
				@Pc(22) int local22 = local13.method5031() - Static297.anInt4923;
				@Pc(30) int local30 = (local22 * 2 >> Static168.anInt3026) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5032() - local22 >> Static168.anInt3026;
				@Pc(53) int local53 = local13.method5023() - local22 >> Static168.anInt3026;
				@Pc(61) int local61 = local13.method5023() + local22 >> Static168.anInt3026;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static295.anInt4910) {
					local61 = Static295.anInt4910 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray33[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static264.anInt4480) {
						local108 = Static264.anInt4480 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class26_Sub2 local141 = Static14.method152(local16, local125, local78, mv.class);
						if (local141 != null && local141.aByte101 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte101 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray33[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray33[local32 - 1];
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
									local182 = local10.aShortArray33[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray33[local32 + 1];
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
				Static128.aBooleanArray9[local1] = true;
				Static244.aClass165Array8[local16].method3577(local13, local37);
			}
		}
	}
}
