import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!mf;")
	public static Class48 aClass48_43 = new Class48(500);

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!qc;")
	private static Class60 aClass60_713 = Static121.method2047("Loaded interfaces");

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
	public static int[] anIntArray190 = new int[1000];

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_714 = Static121.method2047("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_715 = aClass60_713;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
	public static int[] anIntArray191 = new int[] { 7, 0, 0, 0, 0, 0, 6, 2, 0, 0, 8, 0, 0, 0, 2, 0, 7, 0, -2, 2, 0, 6, 0, 0, 0, 11, 0, 0, 6, 0, 0, -1, 0, 14, 2, 0, 0, 0, 0, 6, 4, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 1, 0, 6, 4, 0, 0, 3, 0, 0, 0, 0, 4, 0, 8, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, -2, 0, 6, 3, 0, 0, 0, -2, 0, 0, 5, 0, 0, 0, 0, -2, 12, 1, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 2, 0, -1, 1, 4, 0, 4, 0, 1, 5, 2, 0, 0, 5, 0, 0, 6, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -2, 0, 11, 0, 6, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 0, -2, 0, 0, 4, 0, 3, 0, 6, -1, 0, 2, 0, 2, 7, 0, 0, 0, 0, -1, 0, 0, 6, 4, 0, -1, 0, 5, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 5, -2, 6, 0, 2, 0, 2, 0, -2, 0, 0, 0, -2, 0, 0, 4, 0, 0, 0, -1, 0, 15, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_716 = Static121.method2047(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_717 = Static121.method2047("huffman");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_718 = Static121.method2047("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!q;I)I")
	public static int method1384(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(21) Class4_Sub5 local21 = (Class4_Sub5) Static109.aClass66_11.method1834(((long) arg0.anInt2203 << 32) + (long) arg0.anInt2241);
		return local21 == null ? arg0.anInt2214 : local21.anInt654;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1385() {
		anIntArray190 = null;
		aClass60_714 = null;
		aClass60_715 = null;
		aClass60_717 = null;
		aClass60_718 = null;
		aClass48_43 = null;
		anIntArray191 = null;
		aClass60_716 = null;
		aClass60_713 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!qc;IILclient!qc;)V")
	public static void method1386(@OriginalArg(0) Class60 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60 arg2) {
		Static18.method298(arg1, arg0, arg2, null);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
	public static void method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static92.anInt2256; local15++) {
			if (arg2 < Static109.anIntArray290[local15] + Static60.anIntArray235[local15] && arg2 + arg3 > Static60.anIntArray235[local15] && arg0 < Static101.anIntArray276[local15] + Static125.anIntArray330[local15] && arg0 + arg1 > Static125.anIntArray330[local15]) {
				Static74.aBooleanArray9[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
	public static boolean method1388() {
		try {
			if (Static30.anInt836 == 2) {
				if (Static41.aClass4_Sub15_1 == null) {
					Static41.aClass4_Sub15_1 = Static136.method1402(Static82.aClass40_59, Static51.anInt1334, Static15.anInt2965);
					if (Static41.aClass4_Sub15_1 == null) {
						return false;
					}
				}
				if (Static107.aClass63_1 == null) {
					Static107.aClass63_1 = new Class63(Static1.aClass40_2, Static51.aClass40_41);
				}
				if (Static59.aClass4_Sub2_Sub2_2.method570(Static107.aClass63_1, Static20.aClass40_15, Static41.aClass4_Sub15_1)) {
					Static59.aClass4_Sub2_Sub2_2.method554();
					Static59.aClass4_Sub2_Sub2_2.method552(Static3.anInt31);
					Static59.aClass4_Sub2_Sub2_2.method550(Static41.aClass4_Sub15_1, Static48.aBoolean44);
					Static82.aClass40_59 = null;
					Static30.anInt836 = 0;
					Static41.aClass4_Sub15_1 = null;
					Static107.aClass63_1 = null;
					return true;
				}
			}
		} catch (@Pc(68) Exception local68) {
			local68.printStackTrace();
			Static59.aClass4_Sub2_Sub2_2.method553();
			Static30.anInt836 = 0;
			Static107.aClass63_1 = null;
			Static41.aClass4_Sub15_1 = null;
			Static82.aClass40_59 = null;
		}
		return false;
	}
}
