import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public static int anInt3102;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	public static int anInt3105;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[Lclient!ff;")
	public static Class24[] aClass24Array2;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt3098 = 0;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1824 = Static107.method1838(" (X");

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1825 = Static107.method1838("Hier wechseln");

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1826 = Static107.method1838("Walk here");

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1827 = aClass28_1826;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method2133() {
		for (@Pc(3) int local3 = -1; local3 < Static35.anInt973; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static160.anIntArray327[local3];
			}
			@Pc(21) Class2_Sub4_Sub1_Sub1_Sub2 local21 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local13];
			if (local21 != null) {
				Static61.method1106(local21, 1);
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)I")
	public static int method2134() {
		return Static103.anInt2565++;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lclient!n;")
	public static Class2_Sub4_Sub14 method2135(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub4_Sub14 local17 = (Class2_Sub4_Sub14) Static130.aClass14_156.method603((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static102.aClass40_Sub1_74.method1771(arg0, 0);
		if (local27 == null) {
			return null;
		}
		local17 = new Class2_Sub4_Sub14();
		@Pc(40) Class2_Sub2 local40 = new Class2_Sub2(local27);
		local40.anInt2385 = local40.aByteArray35.length - 12;
		@Pc(51) int local51 = local40.method1690();
		local17.anInt2627 = local40.method1680();
		local17.anInt2629 = local40.method1680();
		local17.anInt2634 = local40.method1680();
		@Pc(68) int local68 = 0;
		local17.anInt2631 = local40.method1680();
		local40.anInt2385 = 0;
		local17.aClass28_1555 = local40.method1663();
		local17.anIntArray254 = new int[local51];
		local17.aClass28Array36 = new Class28[local51];
		local17.anIntArray253 = new int[local51];
		while (local40.anInt2385 < local40.aByteArray35.length - 12) {
			@Pc(99) int local99 = local40.method1680();
			if (local99 == 3) {
				local17.aClass28Array36[local68] = local40.method1662();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local17.anIntArray254[local68] = local40.method1698();
			} else {
				local17.anIntArray254[local68] = local40.method1690();
			}
			local17.anIntArray253[local68++] = local99;
		}
		Static130.aClass14_156.method607((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public static void method2136() {
		aClass24Array2 = null;
		aClass28_1824 = null;
		aClass28_1826 = null;
		aClass28_1827 = null;
		aClass28_1825 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	public static void method2137(@OriginalArg(0) boolean arg0) {
		Static177.method2757();
		Static8.anInt455++;
		if (Static8.anInt455 < 50 && !arg0) {
			return;
		}
		Static8.anInt455 = 0;
		if (Static62.aBoolean85 || Static155.aClass22_4 == null) {
			return;
		}
		Static128.aClass2_Sub2_Sub1_2.method1711(82);
		try {
			Static155.aClass22_4.method965(Static128.aClass2_Sub2_Sub1_2.anInt2385, Static128.aClass2_Sub2_Sub1_2.aByteArray35);
			Static128.aClass2_Sub2_Sub1_2.anInt2385 = 0;
		} catch (@Pc(44) IOException local44) {
			Static62.aBoolean85 = true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!gg;IILclient!gg;Lclient!gg;)V")
	public static void method2138(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) Class28 arg3) {
		for (@Pc(10) int local10 = 99; local10 > 0; local10--) {
			Static181.anIntArray371[local10] = Static181.anIntArray371[local10 - 1];
			Static79.aClass28Array28[local10] = Static79.aClass28Array28[local10 - 1];
			Static150.aClass28Array49[local10] = Static150.aClass28Array49[local10 - 1];
			Static57.aClass28Array19[local10] = Static57.aClass28Array19[local10 - 1];
		}
		Static79.aClass28Array28[0] = arg3;
		Static150.aClass28Array49[0] = arg0;
		Static110.anInt2668 = Static70.anInt1853;
		Static170.anInt4062++;
		Static57.aClass28Array19[0] = arg2;
		Static181.anIntArray371[0] = arg1;
	}
}
