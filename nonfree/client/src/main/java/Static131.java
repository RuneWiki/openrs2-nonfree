import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public static int anInt1511;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt1516;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "[S")
	public static short[] aShortArray56 = new short[256];

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_524 = Static151.method2243("No reply from loginserver)3");

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_525 = Static151.method2243("Fertigkeit)2");

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	public static int anInt1518 = -1;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!mb;")
	public static Class62 aClass62_526 = aClass62_524;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ii;I)Lclient!ii;")
	public static Class47 method1029(@OriginalArg(0) Class47 arg0) {
		@Pc(11) int local11 = Static20.method375(Static155.method2304(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(23) int local23 = 0; local23 < local11; local23++) {
			arg0 = Static143.method2159(arg0.anInt1877);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
	public static boolean method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static20.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static28.anInt638) {
			return false;
		} else if (local7 == Static28.anInt638) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static123.method3147(local22 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg2], local26 + 1) && Static123.method3147(local22 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local26 + 1) && Static123.method3147(local22 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static123.method3147(local22 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static20.anIntArrayArrayArray1[arg0][arg1][arg2] = Static28.anInt638;
				return true;
			} else {
				Static20.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static28.anInt638;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method1031(@OriginalArg(1) Class71 arg0) {
		Static114.aClass71_22 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public static int method1032(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(26) int local26 = local12 | local12 >>> 4;
		@Pc(36) int local36 = local26 | local26 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method1034() {
		for (@Pc(14) Class2_Sub25 local14 = (Class2_Sub25) Static76.aClass13_3.method303(); local14 != null; local14 = (Class2_Sub25) Static76.aClass13_3.method309()) {
			if (local14.anInt4154 == -1) {
				local14.anInt4162 = 0;
				Static3.method94(local14);
			} else {
				local14.method3183();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	public static void method1035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) ((arg0 << 16) + arg1);
		@Pc(24) Class2_Sub1_Sub21 local24 = (Class2_Sub1_Sub21) Static21.aClass58_4.method1704(local14);
		if (local24 != null) {
			Static95.aClass61_1.method1785(local24);
		}
	}
}
