import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!gg;")
	private static Class28 aClass28_564 = Static107.method1838("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	public static int anInt958 = -1;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!gg;")
	private static Class28 aClass28_565 = Static107.method1838("Loaded title screen");

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!gg;")
	public static Class28 aClass28_566 = aClass28_564;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	public static int anInt963 = 0;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!gg;")
	public static Class28 aClass28_567 = aClass28_565;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!gg;")
	public static Class28 aClass28_568 = Static107.method1838("Cabbage");

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "[Lclient!gf;")
	public static Class2_Sub4_Sub1_Sub1_Sub2[] aClass2_Sub4_Sub1_Sub1_Sub2Array1 = new Class2_Sub4_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method654() {
		if (Static142.aClass22_3 != null) {
			Static142.aClass22_3.method962();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBIIIII)I")
	public static int method655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(8) int local8 = arg1;
			arg1 = arg4;
			arg4 = local8;
		}
		@Pc(20) int local20 = arg5 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg1 - arg3;
		} else {
			return 7 + 1 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method656() {
		aClass28_566 = null;
		aClass28_565 = null;
		aClass28_568 = null;
		aClass28_567 = null;
		aClass2_Sub4_Sub1_Sub1_Sub2Array1 = null;
		aClass28_564 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public static void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg1; local3 <= arg1 + arg0; local3++) {
			for (@Pc(7) int local7 = arg3; local7 <= arg2 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static69.aByteArrayArrayArray5[0][local7][local3] = 127;
					if (local7 == arg3 && local7 > 0) {
						Static78.anIntArrayArrayArray6[0][local7][local3] = Static78.anIntArrayArrayArray6[0][local7 - 1][local3];
					}
					if (arg2 + arg3 == local7 && local7 < 103) {
						Static78.anIntArrayArrayArray6[0][local7][local3] = Static78.anIntArrayArrayArray6[0][local7 + 1][local3];
					}
					if (arg1 == local3 && local3 > 0) {
						Static78.anIntArrayArrayArray6[0][local7][local3] = Static78.anIntArrayArrayArray6[0][local7][local3 - 1];
					}
					if (local3 == arg0 + arg1 && local3 < 103) {
						Static78.anIntArrayArrayArray6[0][local7][local3] = Static78.anIntArrayArrayArray6[0][local7][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ff;)Lclient!ff;")
	public static Class24 method658(@OriginalArg(1) Class24 arg0) {
		@Pc(12) Class24 local12 = Static141.method2248(arg0);
		if (local12 == null) {
			local12 = arg0.aClass24_3;
		}
		return local12;
	}
}
