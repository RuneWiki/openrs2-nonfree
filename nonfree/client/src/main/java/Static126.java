import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_13;

	@OriginalMember(owner = "client!mi", name = "eb", descriptor = "Lclient!pb;")
	public static Class71 aClass71_24;

	@OriginalMember(owner = "client!mi", name = "lb", descriptor = "I")
	public static int anInt2806;

	@OriginalMember(owner = "client!mi", name = "mb", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_14;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_982 = Static151.method2243("M");

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_983 = Static151.method2243("Texturen geladen)3");

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_984 = Static151.method2243("p12_full");

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lclient!mb;")
	public static Class62 aClass62_985 = aClass62_982;

	@OriginalMember(owner = "client!mi", name = "cb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_986 = Static151.method2243("mem=");

	@OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
	public static int anInt2801 = 0;

	@OriginalMember(owner = "client!mi", name = "kb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_987 = aClass62_982;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)Lclient!gg;")
	public static Class2_Sub7 method1977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class2_Sub7 local3 = new Class2_Sub7();
		local3.anInt1410 = arg0;
		local3.anInt1409 = arg2;
		Static49.aClass58_7.method1708(local3, (long) arg1);
		Static113.method1738(arg0);
		@Pc(30) Class47 local30 = Static143.method2159(arg1);
		if (local30 != null) {
			Static165.method2410(local30);
		}
		if (Static154.aClass47_14 != null) {
			Static165.method2410(Static154.aClass47_14);
			Static154.aClass47_14 = null;
		}
		Static51.anInt1111 = 0;
		Static180.aBoolean167 = false;
		Static135.method2042(Static145.anInt3129, Static21.anInt505, Static46.anInt1034, Static157.anInt3335);
		if (local30 != null) {
			Static208.method3033(local30);
		}
		Static34.method596(arg0);
		if (Static40.anInt969 != -1) {
			Static204.method2973(Static40.anInt969, 1);
		}
		return local3;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIBIIII)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static144.method2183(arg3, Static154.anInt3307, Static15.anInt353);
		@Pc(17) int local17 = Static144.method2183(arg5, Static154.anInt3307, Static15.anInt353);
		@Pc(23) int local23 = Static144.method2183(arg2, Static122.anInt2718, Static153.anInt3279);
		@Pc(29) int local29 = Static144.method2183(arg4, Static122.anInt2718, Static153.anInt3279);
		@Pc(37) int local37 = Static144.method2183(arg3 + arg0, Static154.anInt3307, Static15.anInt353);
		@Pc(46) int local46 = Static144.method2183(arg5 - arg0, Static154.anInt3307, Static15.anInt353);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static19.method345(arg1, Static55.anIntArrayArray8[local48], local23, local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static19.method345(arg1, Static55.anIntArrayArray8[local68], local23, local29);
		}
		@Pc(99) int local99 = Static144.method2183(arg0 + arg2, Static122.anInt2718, Static153.anInt3279);
		@Pc(108) int local108 = Static144.method2183(arg4 - arg0, Static122.anInt2718, Static153.anInt3279);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static55.anIntArrayArray8[local110];
			Static19.method345(arg1, local116, local23, local99);
			Static19.method345(arg1, local116, local108, local29);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIILclient!dh;)V")
	public static void method1979(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class7_Sub2 arg3) {
		Static42.method3003(arg3.anInt3085, arg1, arg3.anInt3046, arg2, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZII)Lclient!mb;")
	public static Class62 method1980(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(26) int local26 = 1;
		@Pc(30) int local30 = arg1 / 10;
		while (local30 != 0) {
			local30 /= 10;
			local26++;
		}
		@Pc(44) int local44 = local26;
		if (arg1 < 0 || arg0) {
			local44 = local26 + 1;
		}
		@Pc(55) byte[] local55 = new byte[local44];
		if (arg1 < 0) {
			local55[0] = 45;
		} else if (arg0) {
			local55[0] = 43;
		}
		for (@Pc(76) int local76 = 0; local76 < local26; local76++) {
			@Pc(82) int local82 = arg1 % 10;
			arg1 /= 10;
			if (local82 < 0) {
				local82 = -local82;
			}
			if (local82 > 9) {
				local82 += 39;
			}
			local55[local44 - local76 - 1] = (byte) (local82 + 48);
		}
		@Pc(120) Class62 local120 = new Class62();
		local120.aByteArray28 = local55;
		local120.anInt2653 = local44;
		return local120;
	}
}
