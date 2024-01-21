import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	public static int[] anIntArray642;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "Lclient!oa;")
	public static Class2_Sub18 aClass2_Sub18_109;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!bb;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_103;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	public static int anInt4578;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1555 = Static146.method2172("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1556 = Static146.method2172("p11_full");

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
	public static short[] aShortArray139 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt4572 = 0;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
	public static int[] anIntArray643 = new int[32768];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!cb;")
	public static Class10 aClass10_120 = new Class10();

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt4574 = -1;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	public static int anInt4576 = 0;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1557 = aClass77_1555;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method3001() {
		aClass2_Sub18_109 = null;
		aClass2_Sub2_Sub4_103 = null;
		anIntArray643 = null;
		aClass77_1556 = null;
		aClass10_120 = null;
		anIntArray642 = null;
		aClass77_1557 = null;
		aClass77_1555 = null;
		aShortArray139 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub16 local7 = null;
		for (@Pc(12) Class2_Sub16 local12 = (Class2_Sub16) Static51.aClass10_37.method444(); local12 != null; local12 = (Class2_Sub16) Static51.aClass10_37.method451()) {
			if (arg1 == local12.anInt2392 && arg5 == local12.anInt2376 && local12.anInt2386 == arg0 && local12.anInt2385 == arg8) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub16();
			local7.anInt2386 = arg0;
			local7.anInt2385 = arg8;
			local7.anInt2392 = arg1;
			local7.anInt2376 = arg5;
			Static19.method440(local7);
			Static51.aClass10_37.method448(local7);
		}
		local7.anInt2382 = arg6;
		local7.anInt2381 = arg3;
		local7.anInt2380 = arg7;
		local7.anInt2384 = arg2;
		local7.anInt2390 = arg4;
	}
}
