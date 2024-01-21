import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
	public static int anInt3284;

	@OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
	public static int anInt3286;

	@OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
	public static int anInt3283 = 0;

	@OriginalMember(owner = "client!rh", name = "kb", descriptor = "[I")
	public static int[] anIntArray309 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
	public static int anInt3285 = 0;

	@OriginalMember(owner = "client!rh", name = "pb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!rh", name = "ub", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1934 = Static107.method1838("Select a world");

	@OriginalMember(owner = "client!rh", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1933 = aClass28_1934;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
	public static void method2277() {
		aClass28_1934 = null;
		aCalendar1 = null;
		anIntArray309 = null;
		aClass28_1933 = null;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
	public static void method2278() {
		Static116.anInt2829 = -1;
		Static124.anInt2925 = -1;
		Static103.anInt2571 = 0;
		Static113.anInt2734 = -1;
		Static84.anInt2129 = 0;
		Static82.anInt2102 = 0;
		Static19.anInt890 = 0;
		Static150.anInt3365 = 0;
		Static169.aBoolean165 = false;
		Static148.anInt3347 = -1;
		Static98.anInt2452 = 0;
		Static128.aClass2_Sub2_Sub1_2.anInt2385 = 0;
		Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1.length; local35++) {
			if (Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local35] != null) {
				Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local35].anInt1625 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1.length; local57++) {
			if (Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local57] != null) {
				Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local57].anInt1625 = -1;
			}
		}
		Static93.method1627();
		Static110.method1877(30);
		for (@Pc(90) int local90 = 0; local90 < 100; local90++) {
			Static123.aBooleanArray17[local90] = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!eh;B)V")
	public static void method2279(@OriginalArg(0) Class2_Sub4_Sub1_Sub1 arg0) {
		if (arg0.anInt1612 == 0) {
			return;
		}
		@Pc(44) int local44;
		@Pc(37) int local37;
		if (arg0.anInt1625 != -1 && arg0.anInt1625 < 32768) {
			@Pc(29) Class2_Sub4_Sub1_Sub1_Sub1 local29 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[arg0.anInt1625];
			if (local29 != null) {
				local37 = arg0.anInt1635 - local29.anInt1635;
				local44 = arg0.anInt1633 - local29.anInt1633;
				if (local44 != 0 || local37 != 0) {
					arg0.anInt1623 = (int) (Math.atan2((double) local44, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt1625 >= 32768) {
			local75 = arg0.anInt1625 - 32768;
			if (local75 == Static50.anInt1313) {
				local75 = 2047;
			}
			@Pc(88) Class2_Sub4_Sub1_Sub1_Sub2 local88 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local75];
			if (local88 != null) {
				local37 = arg0.anInt1633 - local88.anInt1633;
				@Pc(104) int local104 = arg0.anInt1635 - local88.anInt1635;
				if (local37 != 0 || local104 != 0) {
					arg0.anInt1623 = (int) (Math.atan2((double) local37, (double) local104) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1651 != 0 || arg0.anInt1615 != 0) && (arg0.anInt1643 == 0 || arg0.anInt1638 > 0)) {
			local75 = arg0.anInt1633 - (arg0.anInt1651 - Static3.anInt2434 - Static3.anInt2434) * 64;
			local44 = arg0.anInt1635 - (arg0.anInt1615 - Static39.anInt1055 - Static39.anInt1055) * 64;
			if (local75 != 0 || local44 != 0) {
				arg0.anInt1623 = (int) (Math.atan2((double) local75, (double) local44) * 325.949D) & 0x7FF;
			}
			arg0.anInt1615 = 0;
			arg0.anInt1651 = 0;
		}
		local75 = arg0.anInt1623 - arg0.anInt1603 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt1636 = 0;
			return;
		}
		arg0.anInt1636++;
		@Pc(221) boolean local221;
		if (local75 <= 1024) {
			arg0.anInt1603 += arg0.anInt1612;
			local221 = true;
			if (local75 < arg0.anInt1612 || 2048 - arg0.anInt1612 < local75) {
				arg0.anInt1603 = arg0.anInt1623;
				local221 = false;
			}
			if (arg0.anInt1606 == arg0.anInt1608 && (arg0.anInt1636 > 25 || local221)) {
				if (arg0.anInt1628 == -1) {
					arg0.anInt1606 = arg0.anInt1610;
				} else {
					arg0.anInt1606 = arg0.anInt1628;
				}
			}
		} else {
			arg0.anInt1603 -= arg0.anInt1612;
			local221 = true;
			if (local75 < arg0.anInt1612 || local75 > 2048 - arg0.anInt1612) {
				arg0.anInt1603 = arg0.anInt1623;
				local221 = false;
			}
			if (arg0.anInt1606 == arg0.anInt1608 && (arg0.anInt1636 > 25 || local221)) {
				if (arg0.anInt1649 == -1) {
					arg0.anInt1606 = arg0.anInt1610;
				} else {
					arg0.anInt1606 = arg0.anInt1649;
				}
			}
		}
		arg0.anInt1603 &= 0x7FF;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZJ)V")
	public static void method2280(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static92.anInt2333; local14++) {
			if (Static11.aLongArray3[local14] == arg0) {
				Static92.anInt2333--;
				for (@Pc(28) int local28 = local14; local28 < Static92.anInt2333; local28++) {
					Static11.aLongArray3[local28] = Static11.aLongArray3[local28 + 1];
					Static127.aClass28Array42[local28] = Static127.aClass28Array42[local28 + 1];
				}
				Static30.anInt928 = Static70.anInt1853;
				Static128.aClass2_Sub2_Sub1_2.method1711(79);
				Static128.aClass2_Sub2_Sub1_2.method1666(arg0);
				break;
			}
		}
	}
}
