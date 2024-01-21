import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "Lclient!jc;")
	public static Class4_Sub1_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_12;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_7 = new Class66(20);

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "[I")
	public static final int[] anIntArray39 = new int[25];

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_152 = Static177.method3050("yellow:");

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_149 = aClass46_152;

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_150 = aClass46_152;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_153 = Static177.method3050("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "Lclient!jd;")
	public static Class46 aClass46_151 = aClass46_153;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!nh;Lclient!nh;)V")
	public static void method262(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static107.aClass62_28 = arg1;
		Static65.aClass62_15 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Z")
	public static boolean method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static73.anIntArrayArrayArray21[arg0][arg1][arg2];
		if (local7 == -Static87.anInt2220) {
			return false;
		} else if (local7 == Static87.anInt2220) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static72.method1496(local22 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg2], local26 + 1) && Static72.method1496(local22 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg2], local26 + 1) && Static72.method1496(local22 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static72.method1496(local22 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static73.anIntArrayArrayArray21[arg0][arg1][arg2] = Static87.anInt2220;
				return true;
			} else {
				Static73.anIntArrayArrayArray21[arg0][arg1][arg2] = -Static87.anInt2220;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZLclient!jd;)V")
	public static void method264(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(23) int local23 = Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method905(arg1, 250);
		@Pc(30) int local30 = Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method900(arg1, 250) * 13;
		Static145.method2941(6, 6, local23 + 4 + 4, local30 + 4 + 4, 0);
		Static145.method2945(6, 6, local23 + 4 + 4, 4 + 4 + local30, 16777215);
		Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6.method885(arg1, 10, 10, local23, local30, 16777215, -1, 1, 1, 0);
		Static149.method2557(local23 + 8, 6, local30 + 4 + 4, 6);
		if (!arg0) {
			Static117.method2133(local30, 10, local23, 10);
			return;
		}
		try {
			@Pc(116) Graphics local116 = Static137.aCanvas1.getGraphics();
			Static69.aClass42_1.method3018(local116);
		} catch (@Pc(124) Exception local124) {
			Static137.aCanvas1.repaint();
		}
	}
}
