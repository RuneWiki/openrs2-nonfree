import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	public static int anInt3126;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1139 = Static177.method3050("Too many connections from your address)3");

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1140 = Static177.method3050("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1143 = Static177.method3050("Hidden");

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1141 = aClass46_1143;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1142 = aClass46_1139;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "[I")
	public static final int[] anIntArray291 = new int[1000];

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
	public static final int anInt3131 = 3353893;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lclient!h;")
	public static final Class4_Sub11 aClass4_Sub11_5 = new Class4_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ff;IIIII)V")
	public static void method2307(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static135.anInt3222) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static57.anInt1408) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static84.anInt4112 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class4_Sub7 local62 = Static28.aClass4_Sub7ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static142.anIntArrayArrayArray33[local17][local23][local32] + Static142.anIntArrayArrayArray33[local17][local23 + 1][local32] + Static142.anIntArrayArrayArray33[local17][local23][local32 + 1] + Static142.anIntArrayArrayArray33[local17][local23 + 1][local32 + 1]) / 4 - (Static142.anIntArrayArrayArray33[arg1][arg2][arg3] + Static142.anIntArrayArrayArray33[arg1][arg2 + 1][arg3] + Static142.anIntArrayArrayArray33[arg1][arg2][arg3 + 1] + Static142.anIntArrayArrayArray33[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class24 local151 = local62.aClass24_1;
									if (local151 != null) {
										@Pc(161) Class4_Sub1_Sub1_Sub6 local161;
										if (local151.aClass4_Sub1_Sub1_2 instanceof Class4_Sub1_Sub1_Sub6) {
											local161 = (Class4_Sub1_Sub1_Sub6) local151.aClass4_Sub1_Sub1_2;
											Static51.method999(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass4_Sub1_Sub1_3 instanceof Class4_Sub1_Sub1_Sub6) {
											local161 = (Class4_Sub1_Sub1_Sub6) local151.aClass4_Sub1_Sub1_3;
											Static51.method999(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt1040; local225++) {
										@Pc(231) Class86 local231 = local62.aClass86Array1[local225];
										if (local231 != null && local231.aClass4_Sub1_Sub1_10 instanceof Class4_Sub1_Sub1_Sub6) {
											@Pc(241) Class4_Sub1_Sub1_Sub6 local241 = (Class4_Sub1_Sub1_Sub6) local231.aClass4_Sub1_Sub1_10;
											@Pc(249) int local249 = local231.anInt3584 + 1 - local231.anInt3583;
											@Pc(257) int local257 = local231.anInt3595 + 1 - local231.anInt3581;
											Static51.method999(arg0, local241, (local231.anInt3583 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt3581 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public static void method2308() {
		Static107.anIntArray248 = null;
		Static110.anIntArray253 = null;
		Static35.anIntArray81 = null;
		Static55.anIntArray147 = null;
		Static137.anIntArray312 = null;
		Static12.aByteArrayArray1 = null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public static void method2310() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
	public static boolean method2311(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
