import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "[I")
	public static int[] anIntArray531;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_19 = new Class49(9, 5);

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "[I")
	public static final int[] anIntArray530 = new int[2];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method5361(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static67.anInt1640 = -1;
		Static147.anInt3063 = 1;
		Static430.method5922(arg0, arg1);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
	public static void method5362() {
		for (@Pc(1) int local1 = 0; local1 < Static398.anInt7036; local1++) {
			if (!Static141.aBooleanArray158[local1]) {
				@Pc(10) Class153 local10 = client.lb[local1];
				@Pc(13) Class4_Sub17 local13 = local10.aClass4_Sub17_2;
				@Pc(16) int local16 = local10.anInt4679;
				@Pc(22) int local22 = local13.method6160() - Static423.anInt7318;
				@Pc(30) int local30 = (local22 * 2 >> Static391.anInt6797) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method6165() - local22 >> Static391.anInt6797;
				@Pc(53) int local53 = local13.method6161() - local22 >> Static391.anInt6797;
				@Pc(61) int local61 = local13.method6161() + local22 >> Static391.anInt6797;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static268.anInt5106) {
					local61 = Static268.anInt5106 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray74[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static230.anInt4581) {
						local108 = Static230.anInt4581 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub5 local141 = Static422.method5870(local16, local125, local78, sv.class);
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
									local182 = local10.aShortArray74[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray74[local32 - 1];
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
									local182 = local10.aShortArray74[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray74[local32 + 1];
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
				Static141.aBooleanArray158[local1] = true;
				Static389.aClass14Array3[local16].method2555(local13, local37);
			}
		}
	}
}
