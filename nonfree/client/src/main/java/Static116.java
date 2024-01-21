import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
	public static int[] anIntArray441;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!pb;")
	public static Class41 aClass41_75;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1778 = Static69.method1153("Prepared sound engine");

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1776 = aClass64_1778;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1777 = Static69.method1153("backleft2");

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] method2037() {
		@Pc(8) Class1_Sub1_Sub5_Sub2[] local8 = new Class1_Sub1_Sub5_Sub2[Static98.anInt2198];
		for (@Pc(10) int local10 = 0; local10 < Static98.anInt2198; local10++) {
			@Pc(20) Class1_Sub1_Sub5_Sub2 local20 = local8[local10] = new Class1_Sub1_Sub5_Sub2();
			local20.anInt1021 = Static1.anInt47;
			local20.anInt1022 = Static65.anInt1495;
			local20.anInt1018 = Static23.anIntArray95[local10];
			local20.anInt1020 = Static98.anIntArray327[local10];
			local20.anInt1019 = Static91.anIntArray303[local10];
			local20.anInt1023 = anIntArray441[local10];
			@Pc(50) byte[] local50 = aByteArrayArray8[local10];
			@Pc(56) int local56 = local20.anInt1023 * local20.anInt1019;
			local20.anIntArray150 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray150[local62] = Static25.anIntArray437[local50[local62] & 0xFF];
			}
		}
		Static27.method675();
		return local8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method2038() {
		for (@Pc(15) int local15 = 0; local15 < Static39.anInt914; local15++) {
			@Pc(21) int local21 = Static96.anIntArray436[local15];
			@Pc(25) Class1_Sub1_Sub2_Sub1_Sub2 local25 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local21];
			@Pc(29) int local29 = Static64.aClass1_Sub6_Sub1_2.method1837();
			if ((local29 & 0x80) != 0) {
				local29 += Static64.aClass1_Sub6_Sub1_2.method1837() << 8;
			}
			Static85.method2018(local25, local29, local21);
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method2039() {
		aClass64_1778 = null;
		aByteArrayArray8 = null;
		aClass64_1777 = null;
		aClass64_1776 = null;
		anIntArray441 = null;
		aClass41_75 = null;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method2040() {
		for (@Pc(10) Class1_Sub9 local10 = (Class1_Sub9) Static60.aClass50_8.method1151(); local10 != null; local10 = (Class1_Sub9) Static60.aClass50_8.method1141()) {
			if (local10.anInt1885 == -1) {
				local10.anInt1875 = 0;
				Static66.method1129(local10);
			} else {
				local10.method2076();
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZLclient!rd;)V")
	public static void method2041(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		Static49.aClass1_Sub6_Sub1_1.method1877(193);
		Static49.aClass1_Sub6_Sub1_1.method1830(arg1.method1492());
		Static49.aClass1_Sub6_Sub1_1.method1853(arg0);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Lclient!ee;")
	public static Class2 method2042() {
		try {
			return (Class2) Class.forName("Class2_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class2_Sub2();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!nd;IB)Lclient!rd;")
	public static Class64 method2043(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (!Static96.method2002(Static31.method548(arg0), arg1)) {
			return null;
		} else if (arg0.aClass64Array13 == null || arg0.aClass64Array13.length <= arg1 || arg0.aClass64Array13[arg1] == null || arg0.aClass64Array13[arg1].method1477().method1469() == 0) {
			return Static1.aBoolean3 ? Static82.method1383(new Class64[] { Static31.aClass64_489, Static12.method1395(arg1) }) : null;
		} else {
			return arg0.aClass64Array13[arg1];
		}
	}
}
