import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array4;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Lclient!sf;")
	public static Class157 aClass157_23 = new Class157(64);

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString89 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "[I")
	public static int[] anIntArray215 = new int[2];

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "Lclient!kk;")
	public static Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "Lclient!lj;")
	public static Class106 aClass106_3 = new Class106(128);

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "Lclient!ka;")
	public static Class93_Sub1 aClass93_Sub1_3 = null;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
	public static volatile int anInt2490 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIIII)V")
	public static void method1845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static53.anInt1319 && arg0 <= Static81.anInt1915) {
			@Pc(16) int local16 = Static30.method572(Static148.anInt3245, arg1, Static166.anInt3675);
			@Pc(22) int local22 = Static30.method572(Static148.anInt3245, arg2, Static166.anInt3675);
			Static234.method3796(local22, arg0, arg3, local16);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method1846() {
		Static110.method1876();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static89.aClass154Array1[local8].method3909();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!la;B)V")
	public static void method1847(@OriginalArg(0) Class102 arg0) {
		@Pc(3) Class110 local3 = null;
		try {
			@Pc(12) Class111 local12 = arg0.method2891("runescape");
			while (local12.anInt3788 == 0) {
				Static138.method2475(1L);
			}
			if (local12.anInt3788 == 1) {
				local3 = (Class110) local12.anObject4;
				@Pc(34) Class2_Sub16 local34 = Static92.method1635();
				local3.method3094(0, local34.aByteArray17, local34.anInt2789);
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			if (local3 != null) {
				local3.method3098();
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass122_1 != null && local7.aClass122_1.aLong142 == arg3) {
			return true;
		} else if (local7.aClass147_1 != null && local7.aClass147_1.aLong178 == arg3) {
			return true;
		} else if (local7.aClass191_1 != null && local7.aClass191_1.aLong209 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1544; local46++) {
				if (local7.aClass170Array1[local46].aLong195 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
	public static int method1849() {
		return ((Static201.anInt4203 == 0 ? 0 : 1) << 22) + ((Static287.anInt5651 == 0 ? 0 : 1) << 21) + ((Static99.anInt2343 == 0 ? 0 : 1) << 20) + ((Static49.aBoolean87 ? 1 : 0) << 19) + ((Static40.aBoolean64 ? 1 : 0) << 16) + ((Static74.aBoolean118 ? 1 : 0) << 15) + ((Static265.aBoolean348 ? 1 : 0) << 13) + ((Static243.anInt4839 & 0x3) << 11) + ((Static191.aBoolean276 ? 1 : 0) << 10) + ((Static206.aBoolean292 ? 1 : 0) << 9) + ((Static19.aBoolean30 ? 1 : 0) << 6) + (Static178.anInt5291 & 0x7) + ((Static47.aBoolean81 ? 1 : 0) << 3) + ((Static3.aBoolean8 ? 1 : 0) << 4) + ((Static185.aBoolean365 ? 1 : 0) << 5) + ((Static226.aBoolean403 ? 1 : 0) << 7) + ((Static154.aBoolean236 ? 1 : 0) << 8) + (Static272.anInt5414 << 17) + (Static97.method1697() << 23);
	}
}
