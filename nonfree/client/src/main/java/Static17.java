import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
	public static boolean aBoolean18;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_131 = Static81.method1507("cookieprefix");

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_132 = Static81.method1507(" more options");

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_133 = Static81.method1507("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_134 = Static81.method1507(":duelstake:");

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
	public static final int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_135 = aClass24_132;

	@OriginalMember(owner = "client!bh", name = "fb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_136 = Static81.method1507("compass");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!vc;)Z")
	public static boolean method391(@OriginalArg(1) Class98 arg0) {
		if (arg0.anIntArray388 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray388.length; local12++) {
			@Pc(19) int local19 = Static150.method2584(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray384[local12];
			if (arg0.anIntArray388[local12] == 2) {
				if (local19 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray388[local12] == 3) {
				if (local24 >= local19) {
					return false;
				}
			} else if (arg0.anIntArray388[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
	public static void method392() {
		while (true) {
			if (Static192.aClass1_Sub7_Sub1_31.method2807(Static80.anInt1916) >= 27) {
				@Pc(18) int local18 = Static192.aClass1_Sub7_Sub1_31.method2811(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static148.aClass5_Sub2_Sub2Array1[local18] == null) {
						local25 = true;
						Static148.aClass5_Sub2_Sub2Array1[local18] = new Class5_Sub2_Sub2();
					}
					@Pc(41) Class5_Sub2_Sub2 local41 = Static148.aClass5_Sub2_Sub2Array1[local18];
					Static138.anIntArray254[Static138.anInt3107++] = local18;
					local41.anInt2489 = Static42.anInt1100;
					@Pc(59) int local59 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
					if (local59 == 1) {
						Static127.anIntArray222[Static24.anInt663++] = local18;
					}
					@Pc(79) int local79 = Static74.anIntArray153[Static192.aClass1_Sub7_Sub1_31.method2811(3)];
					if (local25) {
						local41.anInt2463 = local41.anInt2474 = local79;
					}
					local41.aClass1_Sub2_Sub21_1 = Static135.method2296(Static192.aClass1_Sub7_Sub1_31.method2811(14));
					@Pc(100) int local100 = Static192.aClass1_Sub7_Sub1_31.method2811(5);
					@Pc(105) int local105 = Static192.aClass1_Sub7_Sub1_31.method2811(5);
					@Pc(110) int local110 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
					local41.anInt2484 = local41.aClass1_Sub2_Sub21_1.anInt3960;
					local41.anInt2492 = local41.aClass1_Sub2_Sub21_1.anInt3942;
					local41.anInt2494 = local41.aClass1_Sub2_Sub21_1.anInt3952;
					if (local100 > 15) {
						local100 -= 32;
					}
					if (local105 > 15) {
						local105 -= 32;
					}
					local41.anInt2454 = local41.aClass1_Sub2_Sub21_1.anInt3969;
					local41.anInt2497 = local41.aClass1_Sub2_Sub21_1.anInt3954;
					local41.anInt2499 = local41.aClass1_Sub2_Sub21_1.anInt3965;
					local41.anInt2449 = local41.aClass1_Sub2_Sub21_1.anInt3941;
					local41.anInt2450 = local41.aClass1_Sub2_Sub21_1.anInt3950;
					local41.anInt2480 = local41.aClass1_Sub2_Sub21_1.anInt3966;
					if (local41.anInt2454 == 0) {
						local41.anInt2474 = 0;
					}
					local41.method1889(local105 + Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], Static87.aClass5_Sub2_Sub1_1.anIntArray196[0] + local100, local110 == 1);
					continue;
				}
			}
			Static192.aClass1_Sub7_Sub1_31.method2804();
			return;
		}
	}
}
