import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_196 = Static186.method3527(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!hh;")
	public static Class50 aClass50_197 = Static186.method3527("<col=ffffff>");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pa;IIZ)Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 method363(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static166.method2741() : null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	public static int method364() {
		return 6;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)Lclient!gf;")
	public static Class41 method365(@OriginalArg(1) int arg0) {
		@Pc(10) Class41 local10 = (Class41) Static144.aClass84_24.method2579((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static150.aClass86_55.method3325(3, arg0);
		local10 = new Class41();
		if (local20 != null) {
			local10.method1023(new Class1_Sub17(local20));
		}
		Static144.aClass84_24.method2582(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIIII)V")
	public static void method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static230.anInt3197 = arg5;
		Static140.anInt2856 = arg0;
		Static220.anInt4292 = arg1;
		Static63.anInt1256 = arg3;
		Static190.anInt3916 = arg4;
		if (arg2 && Static190.anInt3916 >= 100) {
			Static159.anInt4227 = Static63.anInt1256 * 128 + 64;
			Static137.anInt2804 = Static230.anInt3197 * 128 + 64;
			Static32.anInt601 = Static131.method2213(Static137.anInt2804, Static159.anInt4227, Static212.anInt4195) - Static140.anInt2856;
		}
		Static28.anInt544 = 2;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)[Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1[] method368() {
		@Pc(4) Class1_Sub1_Sub8_Sub1[] local4 = new Class1_Sub1_Sub8_Sub1[Static70.anInt1320];
		for (@Pc(6) int local6 = 0; local6 < Static70.anInt1320; local6++) {
			@Pc(16) int local16 = Static101.anIntArray191[local6] * Static8.anIntArray20[local6];
			@Pc(20) byte[] local20 = Static191.aByteArrayArray11[local6];
			@Pc(23) int[] local23 = new int[local16];
			for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
				local23[local25] = Static78.anIntArray127[local20[local25] & 0xFF];
			}
			local4[local6] = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local6], Static228.anIntArray507[local6], Static8.anIntArray20[local6], Static101.anIntArray191[local6], local23);
		}
		Static216.method3375();
		return local4;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIILclient!ta;IJIIII)Z")
	public static boolean method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static99.method3532(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
