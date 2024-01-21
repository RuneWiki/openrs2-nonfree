import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hd", name = "hc", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_689 = Static177.method3050("scroll:");

	@OriginalMember(owner = "client!hd", name = "bc", descriptor = "Lclient!jd;")
	public static Class46 aClass46_687 = aClass46_689;

	@OriginalMember(owner = "client!hd", name = "dc", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hd", name = "fc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_688 = aClass46_689;

	@OriginalMember(owner = "client!hd", name = "gc", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!hd", name = "jc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_690 = Static177.method3050("hint_mapmarkers");

	@OriginalMember(owner = "client!hd", name = "kc", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!hd", name = "lc", descriptor = "[I")
	public static final int[] anIntArray165 = new int[100];

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)J")
	public static long method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass65_1 == null ? 0L : local7.aClass65_1.aLong107;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)Z")
	public static boolean method1449(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIIIII)V")
	public static void method1451(@OriginalArg(0) int[] arg0) {
		Static139.anInt3253 = 25;
		Static72.aBooleanArrayArrayArrayArray1 = new boolean[8][32][Static139.anInt3253 + Static139.anInt3253 + 1][Static139.anInt3253 + Static139.anInt3253 + 1];
		Static177.anInt3973 = 0;
		Static118.anInt2877 = 0;
		Static54.anInt1365 = 512;
		Static178.anInt3989 = 334;
		Static105.anInt2624 = 256;
		Static4.anInt2819 = 167;
		@Pc(45) boolean[][][][] local45 = new boolean[9][32][Static139.anInt3253 + Static139.anInt3253 + 3][Static139.anInt3253 + Static139.anInt3253 + 3];
		@Pc(50) int local50;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(93) int local93;
		@Pc(97) int local97;
		for (@Pc(47) int local47 = 128; local47 <= 384; local47 += 32) {
			for (local50 = 0; local50 < 2048; local50 += 64) {
				Static52.anInt1322 = Class4_Sub1_Sub7_Sub4.anIntArray412[local47];
				Static80.anInt2008 = Class4_Sub1_Sub7_Sub4.anIntArray416[local47];
				Static55.anInt1367 = Class4_Sub1_Sub7_Sub4.anIntArray412[local50];
				Static177.anInt3970 = Class4_Sub1_Sub7_Sub4.anIntArray416[local50];
				local73 = (local47 - 128) / 32;
				local77 = local50 / 64;
				for (local82 = -(Static139.anInt3253 + 1); local82 <= Static139.anInt3253 + 1; local82++) {
					for (@Pc(88) int local88 = -(Static139.anInt3253 + 1); local88 <= Static139.anInt3253 + 1; local88++) {
						local93 = local82 * 128;
						local97 = local88 * 128;
						@Pc(99) boolean local99 = false;
						for (@Pc(102) int local102 = -500; local102 <= 800; local102 += 128) {
							if (Static95.method2234(local93, arg0[local73] + local102, local97)) {
								local99 = true;
								break;
							}
						}
						local45[local73][local77][local82 + Static139.anInt3253 + 1][local88 + Static139.anInt3253 + 1] = local99;
					}
				}
			}
		}
		for (local50 = 0; local50 < 8; local50++) {
			for (local73 = 0; local73 < 32; local73++) {
				for (local77 = -Static139.anInt3253; local77 < Static139.anInt3253; local77++) {
					for (local82 = -Static139.anInt3253; local82 < Static139.anInt3253; local82++) {
						@Pc(174) boolean local174 = false;
						label76: for (local93 = -1; local93 <= 1; local93++) {
							for (local97 = -1; local97 <= 1; local97++) {
								if (local45[local50][local73][local77 + local93 + Static139.anInt3253 + 1][local82 + local97 + Static139.anInt3253 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50][(local73 + 1) % 31][local77 + local93 + Static139.anInt3253 + 1][local82 + local97 + Static139.anInt3253 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][local73][local77 + local93 + Static139.anInt3253 + 1][local82 + local97 + Static139.anInt3253 + 1]) {
									local174 = true;
									break label76;
								}
								if (local45[local50 + 1][(local73 + 1) % 31][local77 + local93 + Static139.anInt3253 + 1][local82 + local97 + Static139.anInt3253 + 1]) {
									local174 = true;
									break label76;
								}
							}
						}
						Static72.aBooleanArrayArrayArrayArray1[local50][local73][local77 + Static139.anInt3253][local82 + Static139.anInt3253] = local174;
					}
				}
			}
		}
	}
}
