import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
	public static int anInt4231;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
	public static int anInt4232;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1464 = Static151.method2243("::rect_debug");

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1465 = Static151.method2243("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_19 = new Class13();

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Lclient!lc;")
	public static Class58 aClass58_14 = new Class58(32);

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1466 = Static151.method2243("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1467 = Static151.method2243(" ");

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
	public static int anInt4233 = 0;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
	public static int anInt4234 = -1;

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1468 = aClass62_1467;

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1469 = aClass62_1466;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)Lclient!ah;")
	public static Class6 method2970() {
		try {
			return (Class6) Class.forName("Class6_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class6_Sub1();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[B")
	public static byte[] method2971(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub5 local13 = (Class2_Sub1_Sub5) Static132.aClass53_15.method1648((long) arg0);
		if (local13 == null) {
			@Pc(18) byte[] local18 = new byte[512];
			@Pc(24) Random local24 = new Random((long) arg0);
			for (@Pc(26) int local26 = 0; local26 < 255; local26++) {
				local18[local26] = (byte) local26;
			}
			for (@Pc(41) int local41 = 0; local41 < 255; local41++) {
				@Pc(48) int local48 = 255 - local41;
				@Pc(53) int local53 = Static120.method1889(local24, local48);
				@Pc(57) byte local57 = local18[local53];
				local18[local53] = local18[local48];
				local18[local48] = local18[511 - local41] = local57;
			}
			local13 = new Class2_Sub1_Sub5(local18);
			Static132.aClass53_15.method1645((long) arg0, local13);
		}
		return local13.aByteArray5;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lclient!ce;")
	public static Class2_Sub1_Sub4 method2972(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub4 local12 = (Class2_Sub1_Sub4) Static152.aClass53_18.method1648((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static134.aClass71_26.method2130(5, arg0);
		local12 = new Class2_Sub1_Sub4();
		if (local22 != null) {
			local12.method433(new Class2_Sub11(local22));
		}
		Static152.aClass53_18.method1645((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public static void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static124.method1934(arg0)) {
			Static208.method3039(arg1, Static89.aClass47ArrayArray1[arg0]);
		}
	}
}
