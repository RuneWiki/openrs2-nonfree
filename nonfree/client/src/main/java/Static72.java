import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!p;")
	public static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static int anInt1905 = 0;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_943 = Static69.method1231("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!je;")
	private static Class40 aClass40_946 = Static69.method1231("Location");

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_944 = aClass40_946;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_945 = Static69.method1231("mapback");

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_947 = Static69.method1231("weiss:");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
	public static int method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg0;
		return (local8 * (arg1 & 0xFF00) + (arg2 & 0xFF00) * arg0 & 0xFF0000) + ((arg1 & 0xFF00FF) * local8 + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1225() {
		aClass56_1 = null;
		aClass40_945 = null;
		aClass40_946 = null;
		aClass40_944 = null;
		aClass40_947 = null;
		aClass40_943 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method1226(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt1796 == 0) {
			return;
		}
		@Pc(38) int local38;
		@Pc(31) int local31;
		if (arg0.anInt1815 != -1 && arg0.anInt1815 < 32768) {
			@Pc(22) Class2_Sub1_Sub1_Sub3_Sub1 local22 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt1815];
			if (local22 != null) {
				local31 = arg0.anInt1792 - local22.anInt1792;
				local38 = arg0.anInt1788 - local22.anInt1788;
				if (local38 != 0 || local31 != 0) {
					arg0.anInt1801 = (int) (Math.atan2((double) local38, (double) local31) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(66) int local66;
		if (arg0.anInt1815 >= 32768) {
			local66 = arg0.anInt1815 - 32768;
			if (local66 == Static56.anInt1466) {
				local66 = 2047;
			}
			@Pc(79) Class2_Sub1_Sub1_Sub3_Sub2 local79 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local66];
			if (local79 != null) {
				local31 = arg0.anInt1788 - local79.anInt1788;
				@Pc(95) int local95 = arg0.anInt1792 - local79.anInt1792;
				if (local31 != 0 || local95 != 0) {
					arg0.anInt1801 = (int) (Math.atan2((double) local31, (double) local95) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1799 != 0 || arg0.anInt1819 != 0) && (arg0.anInt1779 == 0 || arg0.anInt1770 > 0)) {
			local66 = arg0.anInt1788 - (arg0.anInt1799 - Static107.anInt2546 - Static107.anInt2546) * 64;
			local38 = arg0.anInt1792 - (arg0.anInt1819 - Static29.anInt720 - Static29.anInt720) * 64;
			if (local66 != 0 || local38 != 0) {
				arg0.anInt1801 = (int) (Math.atan2((double) local66, (double) local38) * 325.949D) & 0x7FF;
			}
			arg0.anInt1799 = 0;
			arg0.anInt1819 = 0;
		}
		local66 = arg0.anInt1801 - arg0.anInt1818 & 0x7FF;
		if (local66 == 0) {
			arg0.anInt1772 = 0;
			return;
		}
		arg0.anInt1772++;
		@Pc(217) boolean local217;
		if (local66 <= 1024) {
			arg0.anInt1818 += arg0.anInt1796;
			local217 = true;
			if (arg0.anInt1796 > local66 || local66 > 2048 - arg0.anInt1796) {
				local217 = false;
				arg0.anInt1818 = arg0.anInt1801;
			}
			if (arg0.anInt1786 == arg0.anInt1790 && (arg0.anInt1772 > 25 || local217)) {
				if (arg0.anInt1822 == -1) {
					arg0.anInt1790 = arg0.anInt1771;
				} else {
					arg0.anInt1790 = arg0.anInt1822;
				}
			}
		} else {
			arg0.anInt1818 -= arg0.anInt1796;
			local217 = true;
			if (local66 < arg0.anInt1796 || 2048 - arg0.anInt1796 < local66) {
				local217 = false;
				arg0.anInt1818 = arg0.anInt1801;
			}
			if (arg0.anInt1786 == arg0.anInt1790 && (arg0.anInt1772 > 25 || local217)) {
				if (arg0.anInt1812 == -1) {
					arg0.anInt1790 = arg0.anInt1771;
				} else {
					arg0.anInt1790 = arg0.anInt1812;
				}
			}
		}
		arg0.anInt1818 &= 0x7FF;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lclient!je;")
	public static Class40 method1227(@OriginalArg(0) int arg0) {
		return Static40.method722(new Class40[] { Static49.method886(arg0 >> 24 & 0xFF), Static122.aClass40_1546, Static49.method886(arg0 >> 16 & 0xFF), Static122.aClass40_1546, Static49.method886(arg0 >> 8 & 0xFF), Static122.aClass40_1546, Static49.method886(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!je;Lclient!je;II)V")
	public static void method1228(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) int arg2) {
		Static56.method1001(arg2, null, arg1, arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method1229(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg0);
		if (local10 != null) {
			local10.method2209();
		}
	}
}
