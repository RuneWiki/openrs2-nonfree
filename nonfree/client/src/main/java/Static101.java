import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_16;

	@OriginalMember(owner = "client!mb", name = "ub", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!mb", name = "vb", descriptor = "Lclient!td;")
	public static Class82 aClass82_2;

	@OriginalMember(owner = "client!mb", name = "yb", descriptor = "[I")
	public static int[] anIntArray31;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	public static int anInt443 = 127;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
	public static int anInt449 = 0;

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "[I")
	public static int[] anIntArray29 = new int[100];

	@OriginalMember(owner = "client!mb", name = "wb", descriptor = "Lclient!id;")
	public static Class35 aClass35_6 = new Class35(32);

	@OriginalMember(owner = "client!mb", name = "xb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_312 = Static107.method1838("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!mb", name = "Ab", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_313 = Static107.method1838("Fps:");

	@OriginalMember(owner = "client!mb", name = "Cb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_314 = Static107.method1838(")2");

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public static void method290() {
		@Pc(9) int local9 = Static151.anInt3390 * 128 + 64;
		@Pc(15) int local15 = Static112.anInt2718 * 128 + 64;
		@Pc(23) int local23 = Static103.method1808(Static103.anInt2568, local15, local9) - Static94.anInt2359;
		if (Static40.anInt1057 < local23) {
			Static40.anInt1057 += Static4.anInt156 + Static168.anInt3786 * (local23 - Static40.anInt1057) / 1000;
			if (local23 < Static40.anInt1057) {
				Static40.anInt1057 = local23;
			}
		}
		if (local9 > Static21.anInt726) {
			Static21.anInt726 += Static4.anInt156 + (local9 - Static21.anInt726) * Static168.anInt3786 / 1000;
			if (Static21.anInt726 > local9) {
				Static21.anInt726 = local9;
			}
		}
		if (local9 < Static21.anInt726) {
			Static21.anInt726 -= Static4.anInt156 + Static168.anInt3786 * (Static21.anInt726 - local9) / 1000;
			if (Static21.anInt726 < local9) {
				Static21.anInt726 = local9;
			}
		}
		if (local23 < Static40.anInt1057) {
			Static40.anInt1057 -= Static168.anInt3786 * (Static40.anInt1057 - local23) / 1000 + Static4.anInt156;
			if (Static40.anInt1057 < local23) {
				Static40.anInt1057 = local23;
			}
		}
		if (Static36.anInt977 < local15) {
			Static36.anInt977 += Static4.anInt156 + (local15 - Static36.anInt977) * Static168.anInt3786 / 1000;
			if (local15 < Static36.anInt977) {
				Static36.anInt977 = local15;
			}
		}
		local9 = Static156.anInt3489 * 128 + 64;
		if (Static36.anInt977 > local15) {
			Static36.anInt977 -= Static4.anInt156 + Static168.anInt3786 * (Static36.anInt977 - local15) / 1000;
			if (local15 > Static36.anInt977) {
				Static36.anInt977 = local15;
			}
		}
		local15 = Static110.anInt2690 * 128 + 64;
		local23 = Static103.method1808(Static103.anInt2568, local15, local9) - Static169.anInt3799;
		@Pc(212) int local212 = local9 - Static21.anInt726;
		@Pc(217) int local217 = local23 - Static40.anInt1057;
		@Pc(222) int local222 = local15 - Static36.anInt977;
		@Pc(233) int local233 = (int) Math.sqrt((double) (local212 * local212 + local222 * local222));
		@Pc(244) int local244 = (int) (Math.atan2((double) local217, (double) local233) * 325.949D) & 0x7FF;
		if (local244 < 128) {
			local244 = 128;
		}
		if (local244 > 383) {
			local244 = 383;
		}
		@Pc(269) int local269 = (int) (-325.949D * Math.atan2((double) local222, (double) local212)) & 0x7FF;
		@Pc(274) int local274 = local269 - Static33.anInt943;
		if (local274 > 1024) {
			local274 -= 2048;
		}
		if (Static112.anInt2716 < local244) {
			Static112.anInt2716 += Static104.anInt2593 + Static81.anInt2528 * (local244 - Static112.anInt2716) / 1000;
			if (Static112.anInt2716 > local244) {
				Static112.anInt2716 = local244;
			}
		}
		if (local274 < -1024) {
			local274 += 2048;
		}
		if (local274 > 0) {
			Static33.anInt943 += Static104.anInt2593 + local274 * Static81.anInt2528 / 1000;
			Static33.anInt943 &= 0x7FF;
		}
		if (local274 < 0) {
			Static33.anInt943 -= Static81.anInt2528 * -local274 / 1000 + Static104.anInt2593;
			Static33.anInt943 &= 0x7FF;
		}
		@Pc(352) int local352 = local269 - Static33.anInt943;
		if (local352 > 1024) {
			local352 -= 2048;
		}
		if (Static112.anInt2716 > local244) {
			Static112.anInt2716 -= (Static112.anInt2716 - local244) * Static81.anInt2528 / 1000 + Static104.anInt2593;
			if (local244 > Static112.anInt2716) {
				Static112.anInt2716 = local244;
			}
		}
		if (local352 < -1024) {
			local352 += 2048;
		}
		if (local352 < 0 && local274 > 0 || local352 > 0 && local274 < 0) {
			Static33.anInt943 = local269;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	public static void method293() {
		anIntArray31 = null;
		anIntArray29 = null;
		aClass28_314 = null;
		aBooleanArray5 = null;
		aClass35_6 = null;
		aClass40_Sub1_16 = null;
		aClass28_313 = null;
		aClass82_2 = null;
		anIntArray30 = null;
		aCRC32_2 = null;
		aClass28_312 = null;
	}
}
