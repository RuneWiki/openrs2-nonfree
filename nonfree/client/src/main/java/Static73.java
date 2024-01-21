import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Lclient!ab;")
	public static Class3 aClass3_12;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!cf;")
	public static Class20 aClass20_6 = new Class20();

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_676 = Static187.method3089("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_677 = Static187.method3089("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!vd;")
	public static Class92 aClass92_678 = aClass92_676;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	public static int anInt1642 = 1;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	public static int anInt1643 = -1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BB)V")
	public static void method1116(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		local10.anInt4061 = arg0.length - 2;
		Static77.anInt1714 = local10.method3023();
		Static164.anIntArray302 = new int[Static77.anInt1714];
		Static154.anIntArray285 = new int[Static77.anInt1714];
		Static193.anIntArray276 = new int[Static77.anInt1714];
		Static76.anIntArray133 = new int[Static77.anInt1714];
		Static143.aByteArrayArray6 = new byte[Static77.anInt1714][];
		local10.anInt4061 = arg0.length - Static77.anInt1714 * 8 - 7;
		Static92.anInt1967 = local10.method3023();
		Static197.anInt4330 = local10.method3023();
		@Pc(61) int local61 = (local10.method3010() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static77.anInt1714; local63++) {
			Static154.anIntArray285[local63] = local10.method3023();
		}
		for (@Pc(77) int local77 = 0; local77 < Static77.anInt1714; local77++) {
			Static193.anIntArray276[local77] = local10.method3023();
		}
		for (@Pc(95) int local95 = 0; local95 < Static77.anInt1714; local95++) {
			Static164.anIntArray302[local95] = local10.method3023();
		}
		for (@Pc(113) int local113 = 0; local113 < Static77.anInt1714; local113++) {
			Static76.anIntArray133[local113] = local10.method3023();
		}
		local10.anInt4061 = arg0.length + 3 - Static77.anInt1714 * 8 - local61 * 3 - 7;
		Static209.anIntArray365 = new int[local61];
		for (@Pc(148) int local148 = 1; local148 < local61; local148++) {
			Static209.anIntArray365[local148] = local10.method3049();
			if (Static209.anIntArray365[local148] == 0) {
				Static209.anIntArray365[local148] = 1;
			}
		}
		local10.anInt4061 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static77.anInt1714; local181++) {
			@Pc(187) int local187 = Static164.anIntArray302[local181];
			@Pc(191) int local191 = Static76.anIntArray133[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static143.aByteArrayArray6[local181] = local198;
			@Pc(206) int local206 = local10.method3010();
			@Pc(213) int local213;
			if (local206 == 0) {
				for (local213 = 0; local213 < local195; local213++) {
					local198[local213] = local10.method3009();
				}
			} else if (local206 == 1) {
				for (local213 = 0; local213 < local187; local213++) {
					for (@Pc(217) int local217 = 0; local217 < local191; local217++) {
						local198[local213 + local187 * local217] = local10.method3009();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Z")
	public static boolean method1117(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ba;I)V")
	public static void method1118(@OriginalArg(0) Class11 arg0) {
		if (Static31.anInt741 == arg0.anInt274) {
			Static84.aBooleanArray5[arg0.anInt265] = true;
		}
	}
}
