import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	public static int anInt1688;

	@OriginalMember(owner = "client!gi", name = "db", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_534 = Static200.method3116("overlay)3dat");

	@OriginalMember(owner = "client!gi", name = "fb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_535 = Static200.method3116("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!gi", name = "hb", descriptor = "[I")
	public static int[] anIntArray198 = new int[5];

	@OriginalMember(owner = "client!gi", name = "jb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_536 = aClass60_535;

	@OriginalMember(owner = "client!gi", name = "ob", descriptor = "Lclient!kh;")
	private static Class60 aClass60_538 = Static200.method3116("Checking for updates )2 ");

	@OriginalMember(owner = "client!gi", name = "mb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_537 = aClass60_538;

	@OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
	public static int anInt1700 = 1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!cf;IIIIII)Lclient!cf;")
	public static Class9_Sub2 method1233(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) long local13 = (long) arg5;
		@Pc(21) Class9_Sub2 local21 = (Class9_Sub2) Static24.aClass27_17.method965(local13);
		if (local21 == null) {
			@Pc(28) Class9_Sub1 local28 = Static14.method275(Static71.aClass7_Sub1_14, arg5);
			if (local28 == null) {
				return null;
			}
			local21 = local28.method288(64, 768, -50, -10, -50);
			Static24.aClass27_17.method961(local21, local13);
		}
		@Pc(48) int local48 = arg0.method1693();
		@Pc(51) int local51 = arg0.method1692();
		@Pc(54) int local54 = arg0.method1700();
		@Pc(57) int local57 = arg0.method1695();
		local21 = local21.method1699(true, true);
		if (arg1 != 0) {
			local21.method1691(arg1);
		}
		@Pc(73) Class9_Sub2_Sub1 local73 = (Class9_Sub2_Sub1) local21;
		if (Static165.method2268(arg4 + local54, Static180.anInt3841, local48 + arg2) != arg3 || Static165.method2268(arg4 + local57, Static180.anInt3841, local51 + arg2) != arg3) {
			for (@Pc(99) int local99 = 0; local99 < local73.anInt2279; local99++) {
				local73.anIntArray276[local99] += Static165.method2268(arg4 + local73.anIntArray266[local99], Static180.anInt3841, arg2 + local73.anIntArray267[local99]) - arg3;
			}
			local73.aBoolean123 = false;
		}
		return local21;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
	public static void method1236() {
		if (!Static75.aBoolean98) {
			return;
		}
		@Pc(11) Class6 local11 = Static92.method1619(Static27.anInt640, Static96.anInt2254);
		if (local11 != null && local11.anObjectArray8 != null) {
			@Pc(20) Class1_Sub8 local20 = new Class1_Sub8();
			local20.anObjectArray29 = local11.anObjectArray8;
			local20.aClass6_5 = local11;
			Static93.method1622(local20);
		}
		Static75.aBoolean98 = false;
		Static57.method1068(local11);
	}
}
