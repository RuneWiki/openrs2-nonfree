import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_9;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!u;")
	public static Class76 aClass76_82;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!u;")
	public static Class76 aClass76_83;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ma;")
	public static Class49 aClass49_2 = new Class49();

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public static volatile int anInt2866 = -1;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public static int anInt2869 = 0;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!rf;")
	public static Class70 aClass70_930 = Static49.method1293("mod_icons");

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!rf;")
	private static Class70 aClass70_932 = Static49.method1293("Members object");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Lclient!rf;")
	public static Class70 aClass70_931 = aClass70_932;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!rf;")
	public static Class70 aClass70_933 = Static49.method1293("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2118() {
		aClass76_Sub1_9 = null;
		aClass76_82 = null;
		aClass70_930 = null;
		aClass49_2 = null;
		aString4 = null;
		aClass76_83 = null;
		aClass70_931 = null;
		aClass70_932 = null;
		anIntArray272 = null;
		aClass70_933 = null;
		anIntArray271 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!rf;ILclient!fa;)I")
	public static int method2119(@OriginalArg(0) Class70 arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		@Pc(11) int local11 = arg1.anInt1592;
		arg1.method1242(arg0.anInt3915);
		arg1.anInt1592 += Static114.aClass71_1.method3047(arg1.aByteArray25, 0, arg1.anInt1592, arg0.anInt3915, arg0.aByteArray46);
		return arg1.anInt1592 - local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!de;)V")
	public static void method2120(@OriginalArg(1) Class1_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anInt2031 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0.anInt2050 != -1 && arg0.anInt2050 < 32768) {
			@Pc(25) Class1_Sub1_Sub4_Sub2_Sub2 local25 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[arg0.anInt2050];
			if (local25 != null) {
				local34 = arg0.anInt2030 - local25.anInt2030;
				local40 = arg0.anInt2001 - local25.anInt2001;
				if (local34 != 0 || local40 != 0) {
					arg0.anInt2047 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(68) int local68;
		if (arg0.anInt2050 >= 32768) {
			local68 = arg0.anInt2050 - 32768;
			if (Static177.anInt4484 == local68) {
				local68 = 2047;
			}
			@Pc(81) Class1_Sub1_Sub4_Sub2_Sub1 local81 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local68];
			if (local81 != null) {
				@Pc(89) int local89 = arg0.anInt2001 - local81.anInt2001;
				local40 = arg0.anInt2030 - local81.anInt2030;
				if (local40 != 0 || local89 != 0) {
					arg0.anInt2047 = (int) (Math.atan2((double) local40, (double) local89) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1997 != 0 || arg0.anInt2023 != 0) && (arg0.anInt2021 == 0 || arg0.anInt2015 > 0)) {
			local68 = arg0.anInt2030 - (arg0.anInt1997 - Static154.anInt4068 - Static154.anInt4068) * 64;
			local34 = arg0.anInt2001 - (arg0.anInt2023 - Static64.anInt987 - Static64.anInt987) * 64;
			if (local68 != 0 || local34 != 0) {
				arg0.anInt2047 = (int) (Math.atan2((double) local68, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt2023 = 0;
			arg0.anInt1997 = 0;
		}
		local68 = arg0.anInt2047 - arg0.anInt2040 & 0x7FF;
		if (local68 == 0) {
			arg0.anInt2011 = 0;
			return;
		}
		arg0.anInt2011++;
		@Pc(222) boolean local222;
		if (local68 > 1024) {
			arg0.anInt2040 -= arg0.anInt2031;
			local222 = true;
			if (arg0.anInt2031 > local68 || 2048 - arg0.anInt2031 < local68) {
				local222 = false;
				arg0.anInt2040 = arg0.anInt2047;
			}
			if (arg0.anInt2020 == arg0.anInt2034 && (arg0.anInt2011 > 25 || local222)) {
				if (arg0.anInt2024 == -1) {
					arg0.anInt2020 = arg0.anInt2043;
				} else {
					arg0.anInt2020 = arg0.anInt2024;
				}
			}
		} else {
			arg0.anInt2040 += arg0.anInt2031;
			local222 = true;
			if (arg0.anInt2031 > local68 || local68 > 2048 - arg0.anInt2031) {
				arg0.anInt2040 = arg0.anInt2047;
				local222 = false;
			}
			if (arg0.anInt2020 == arg0.anInt2034 && (arg0.anInt2011 > 25 || local222)) {
				if (arg0.anInt2003 == -1) {
					arg0.anInt2020 = arg0.anInt2043;
				} else {
					arg0.anInt2020 = arg0.anInt2003;
				}
			}
		}
		arg0.anInt2040 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Z")
	public static boolean method2121(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method2122() {
		if (Static176.aClass43_44 != null) {
			Static176.aClass43_44.method2042();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public static void method2123(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
	}
}
