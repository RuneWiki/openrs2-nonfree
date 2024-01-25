import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Lclient!un;")
	public static Class355 aClass355_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	public static void method79() {
		for (@Pc(1) int local1 = 0; local1 < Static581.anInt9734; local1++) {
			if (!Static92.aBooleanArray2[local1]) {
				@Pc(10) Class2 local10 = Static252.aClass2Array1[local1];
				@Pc(13) Class5_Sub43 local13 = local10.aClass5_Sub43_1;
				@Pc(16) int local16 = local10.anInt14;
				@Pc(22) int local22 = local13.method8254() - Static349.anInt6143;
				@Pc(30) int local30 = (local22 * 2 >> Static611.anInt10115) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method8251() - local22 >> Static611.anInt10115;
				@Pc(53) int local53 = local13.method8255() - local22 >> Static611.anInt10115;
				@Pc(61) int local61 = local13.method8255() + local22 >> Static611.anInt10115;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static526.anInt8863) {
					local61 = Static526.anInt8863 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray1[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static328.anInt5870) {
						local108 = Static328.anInt5870 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(144) Class8_Sub1_Sub3 local144 = Static465.method5496(local16, local125, local78, aClass1 == null ? (aClass1 = Class5_Sub1_Sub1.a("vv")) : aClass1);
						if (local144 != null && local144.aByte138 != 0) {
							@Pc(169) boolean local169;
							@Pc(179) boolean local179;
							@Pc(195) short local195;
							@Pc(201) int local201;
							@Pc(207) int local207;
							if (local144.aByte138 == 1) {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 + 1 <= local61) {
									local195 = local10.aShortArray1[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 - 1 >= local53) {
									local195 = local10.aShortArray1[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 4;
								} else if (local179 && !local169) {
									local128 = 2;
								}
							} else {
								local169 = local125 - 1 >= local100;
								local179 = local125 + 1 <= local108;
								if (!local169 && local78 - 1 >= local53) {
									local195 = local10.aShortArray1[local32 - 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local169 = local125 > local201 && local125 < local207;
								}
								if (!local179 && local78 + 1 <= local61) {
									local195 = local10.aShortArray1[local32 + 1];
									local201 = local45 + (local195 >>> 8);
									local207 = local201 + (local195 & 0xFF);
									local179 = local125 > local201 && local125 < local207;
								}
								if (local169 && !local179) {
									local128 = 3;
								} else if (local179 && !local169) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static92.aBooleanArray2[local1] = true;
				Static242.aClass22Array3[local16].method8043(local13, local37);
			}
		}
	}
}
