import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!w;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!wd;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lclient!be;")
	public static Class11_Sub1[] aClass11_Sub1Array1 = new Class11_Sub1[256];

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!va;")
	public static Class61 aClass61_10 = Static88.method1421("cross");

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_13 = Static88.method1421("This world is full)3");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_11 = aClass61_13;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!va;")
	private static Class61 aClass61_12 = Static88.method1421("skill)2");

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
	public static int anInt34 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!va;")
	public static Class61 aClass61_14 = aClass61_12;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lclient!ge;")
	public static Class10_Sub1_Sub6 method33(@OriginalArg(1) int arg0) {
		@Pc(10) Class10_Sub1_Sub6 local10 = (Class10_Sub1_Sub6) Static48.aClass29_36.method644((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static70.aClass11_65.method203(12, arg0);
		local10 = new Class10_Sub1_Sub6();
		if (local20 != null) {
			local10.method585(new Class10_Sub10(local20));
		}
		local10.method587();
		Static48.aClass29_36.method649(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z")
	public static boolean method34(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static105.anInt2641) {
			return true;
		} else if (arg1 == 1 && arg0 == Static96.anInt2448) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static19.anInt631 == arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method35() {
		aLongArray1 = null;
		aClass13_1 = null;
		aClass61_13 = null;
		aClass11_Sub1Array1 = null;
		aClass61_11 = null;
		aClass61_12 = null;
		aClass61_10 = null;
		aClass61_14 = null;
		aClass15_1 = null;
		anIntArray20 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!he;I)Z")
	public static boolean method36(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg1.method203(arg2, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static57.method831(local14);
			return true;
		}
	}
}
