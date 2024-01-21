import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "Lclient!ve;")
	public static Class69 aClass69_14;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_46;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_368 = Static81.method1507("Loading title screen )2 ");

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_369 = Static81.method1507("hitmarks");

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_370 = Static81.method1507("<img=0>");

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Lclient!dj;")
	public static Class24 aClass24_371 = aClass24_368;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_372 = Static81.method1507("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_373 = Static81.method1507("<col=c0ff00>");

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_374 = Static81.method1507("<br>(X");

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_375 = Static81.method1507("(U4");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!ve;Lclient!ve;)V")
	public static void method1053(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1) {
		Static177.aClass69_35 = arg0;
		Static37.aClass69_9 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method1054() {
		@Pc(12) int local12 = Static192.aClass1_Sub7_Sub1_31.method2811(8);
		@Pc(21) int local21;
		if (local12 < Static82.anInt1956) {
			for (local21 = local12; local21 < Static82.anInt1956; local21++) {
				Static57.anIntArray125[Static160.anInt4675++] = Static41.anIntArray115[local21];
			}
		}
		if (Static82.anInt1956 < local12) {
			throw new RuntimeException("gppov1");
		}
		Static82.anInt1956 = 0;
		for (local21 = 0; local21 < local12; local21++) {
			@Pc(68) int local68 = Static41.anIntArray115[local21];
			@Pc(72) Class5_Sub2_Sub1 local72 = Static110.aClass5_Sub2_Sub1Array1[local68];
			@Pc(77) int local77 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
			if (local77 == 0) {
				Static41.anIntArray115[Static82.anInt1956++] = local68;
				local72.anInt2489 = Static42.anInt1100;
			} else {
				@Pc(100) int local100 = Static192.aClass1_Sub7_Sub1_31.method2811(2);
				if (local100 == 0) {
					Static41.anIntArray115[Static82.anInt1956++] = local68;
					local72.anInt2489 = Static42.anInt1100;
					Static127.anIntArray222[Static24.anInt663++] = local68;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local100 == 1) {
						Static41.anIntArray115[Static82.anInt1956++] = local68;
						local72.anInt2489 = Static42.anInt1100;
						local144 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local72.method1892(false, local144);
						local154 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
						if (local154 == 1) {
							Static127.anIntArray222[Static24.anInt663++] = local68;
						}
					} else if (local100 == 2) {
						Static41.anIntArray115[Static82.anInt1956++] = local68;
						local72.anInt2489 = Static42.anInt1100;
						local144 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local72.method1892(true, local144);
						local154 = Static192.aClass1_Sub7_Sub1_31.method2811(3);
						local72.method1892(true, local154);
						@Pc(210) int local210 = Static192.aClass1_Sub7_Sub1_31.method2811(1);
						if (local210 == 1) {
							Static127.anIntArray222[Static24.anInt663++] = local68;
						}
					} else if (local100 == 3) {
						Static57.anIntArray125[Static160.anInt4675++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method1055(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static137.aBooleanArray14[arg0]) {
			return;
		}
		Static133.aClass69_31.method2218(arg0);
		if (Static4.aClass98ArrayArray3[arg0] == null) {
			return;
		}
		@Pc(23) boolean local23 = true;
		for (@Pc(30) int local30 = 0; local30 < Static4.aClass98ArrayArray3[arg0].length; local30++) {
			if (Static4.aClass98ArrayArray3[arg0][local30] != null) {
				if (Static4.aClass98ArrayArray3[arg0][local30].anInt4373 == 2) {
					local23 = false;
				} else {
					Static4.aClass98ArrayArray3[arg0][local30] = null;
				}
			}
		}
		if (local23) {
			Static4.aClass98ArrayArray3[arg0] = null;
		}
		Static137.aBooleanArray14[arg0] = false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
	public static int method1057(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
