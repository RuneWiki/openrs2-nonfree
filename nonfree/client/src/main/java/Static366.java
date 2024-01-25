import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	public static int anInt6051;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public static int anInt6052;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array13;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_224 = new Class56(104, 12);

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public static int anInt6050 = -2;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
	public static void method4857() {
		for (@Pc(1) int local1 = 0; local1 < Static440.anInt7325; local1++) {
			if (!Static371.aBooleanArray28[local1]) {
				@Pc(10) Class154 local10 = Static367.aClass154Array1[local1];
				@Pc(13) Class4_Sub7 local13 = local10.aClass4_Sub7_1;
				@Pc(16) int local16 = local10.anInt3704;
				@Pc(22) int local22 = local13.method4446() - Static390.anInt7654;
				@Pc(30) int local30 = (local22 * 2 >> Static145.anInt2581) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4451() - local22 >> Static145.anInt2581;
				@Pc(53) int local53 = local13.method4449() - local22 >> Static145.anInt2581;
				@Pc(61) int local61 = local13.method4449() + local22 >> Static145.anInt2581;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static18.anInt297) {
					local61 = Static18.anInt297 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray57[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static81.anInt1606) {
						local108 = Static81.anInt1606 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class8_Sub3 local141 = Static64.method926(local16, local125, local78, vn.class);
						if (local141 != null && local141.aByte98 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte98 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray57[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray57[local32 - 1];
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
									local182 = local10.aShortArray57[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray57[local32 + 1];
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
				Static371.aBooleanArray28[local1] = true;
				Static278.aClass41Array3[local16].method5561(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
	public static void method4859(@OriginalArg(1) int arg0) {
		if (Static136.anIntArray209 == null || arg0 > Static136.anIntArray209.length) {
			Static136.anIntArray209 = new int[arg0];
		}
	}
}
