import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!wm;")
	public static Class390 aClass390_104;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!cja;")
	public static final Class64 aClass64_4 = new Class64();

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Z")
	public static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_85 = new Class305(14, -1);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method7518() {
		@Pc(7) int local7 = Static474.aClass5_Sub41_Sub2_2.method7829();
		Static31.anInt483 = Static474.aClass5_Sub41_Sub2_2.method7818();
		@Pc(15) int local15 = Static474.aClass5_Sub41_Sub2_2.method7838();
		@Pc(19) int local19 = Static474.aClass5_Sub41_Sub2_2.method7838();
		@Pc(30) boolean local30 = Static474.aClass5_Sub41_Sub2_2.method7829() == 1;
		Static470.method6770();
		Static240.method3769(local7);
		Static474.aClass5_Sub41_Sub2_2.method7869();
		@Pc(43) int local43;
		@Pc(46) int local46;
		@Pc(52) int local52;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local43 = 0; local43 < Static201.anInt3834 >> 3; local43++) {
				for (local46 = 0; local46 < Static626.anInt10238 >> 3; local46++) {
					local52 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
					if (local52 == 1) {
						Static396.anIntArrayArrayArray33[local40][local43][local46] = Static474.aClass5_Sub41_Sub2_2.method7871(26);
					} else {
						Static396.anIntArrayArrayArray33[local40][local43][local46] = -1;
					}
				}
			}
		}
		Static474.aClass5_Sub41_Sub2_2.method7878();
		local43 = (Static630.anInt10261 - Static474.aClass5_Sub41_Sub2_2.anInt9230) / 16;
		Static278.anIntArrayArray25 = new int[local43][4];
		for (local46 = 0; local46 < local43; local46++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static278.anIntArrayArray25[local46][local52] = Static474.aClass5_Sub41_Sub2_2.method7804();
			}
		}
		Static611.anIntArray552 = new int[local43];
		Static457.aByteArrayArray25 = new byte[local43][];
		Static62.aByteArrayArray2 = null;
		Static490.anIntArray460 = new int[local43];
		Static267.anIntArray285 = new int[local43];
		Static72.aByteArrayArray3 = new byte[local43][];
		Static200.anIntArray188 = null;
		Static367.aByteArrayArray20 = new byte[local43][];
		Static592.anIntArray537 = new int[local43];
		Static220.aByteArrayArray13 = new byte[local43][];
		Static51.anIntArray37 = new int[local43];
		local43 = 0;
		for (local52 = 0; local52 < 4; local52++) {
			for (@Pc(179) int local179 = 0; local179 < Static201.anInt3834 >> 3; local179++) {
				for (@Pc(182) int local182 = 0; local182 < Static626.anInt10238 >> 3; local182++) {
					@Pc(191) int local191 = Static396.anIntArrayArrayArray33[local52][local179][local182];
					if (local191 != -1) {
						@Pc(200) int local200 = local191 >> 14 & 0x3FF;
						@Pc(206) int local206 = local191 >> 3 & 0x7FF;
						@Pc(216) int local216 = local206 / 8 + (local200 / 8 << 8);
						for (@Pc(218) int local218 = 0; local218 < local43; local218++) {
							if (Static611.anIntArray552[local218] == local216) {
								local216 = -1;
								break;
							}
						}
						if (local216 != -1) {
							Static611.anIntArray552[local43] = local216;
							@Pc(245) int local245 = local216 >> 8 & 0xFF;
							@Pc(249) int local249 = local216 & 0xFF;
							Static267.anIntArray285[local43] = Static260.aClass390_61.method8910("m" + local245 + "_" + local249);
							Static592.anIntArray537[local43] = Static260.aClass390_61.method8910("l" + local245 + "_" + local249);
							Static490.anIntArray460[local43] = Static260.aClass390_61.method8910("um" + local245 + "_" + local249);
							Static51.anIntArray37[local43] = Static260.aClass390_61.method8910("ul" + local245 + "_" + local249);
							local43++;
						}
					}
				}
			}
		}
		Static393.method5767(local15, local30, local19, 11);
	}
}
