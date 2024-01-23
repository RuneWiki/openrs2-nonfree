import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "Z")
	public static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)[Lclient!wk;")
	public static Class43_Sub2[] method1324() {
		@Pc(8) Class43_Sub2[] local8 = new Class43_Sub2[Static288.anInt1353];
		for (@Pc(10) int local10 = 0; local10 < Static288.anInt1353; local10++) {
			local8[local10] = new Class43_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[local10], Static225.anIntArray345[local10], Static92.anIntArray130[local10], Static135.anIntArray225[local10], Static232.aByteArrayArray15[local10], Static147.anIntArray236);
		}
		Static147.method2386();
		return local8;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZILclient!pk;)Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1 method1326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2) {
		return Static247.method4168(arg2, arg0, arg1) ? Static10.method89() : null;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
	public static void method1330(@OriginalArg(0) int arg0) {
		@Pc(12) Class8_Sub23 local12 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local12 != null) {
			local12.method4273();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)I")
	public static int method1331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static170.aByteArrayArrayArray9[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static170.aByteArrayArrayArray9[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!pk;III)[Lclient!me;")
	public static Class43[] method1334(@OriginalArg(0) Class132 arg0, @OriginalArg(3) int arg1) {
		return Static247.method4168(arg0, 0, arg1) ? Static12.method211() : null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V")
	public static void method1335(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(4) String arg2) {
		Static282.method648(9, -1, arg2, arg1, arg0);
	}
}
