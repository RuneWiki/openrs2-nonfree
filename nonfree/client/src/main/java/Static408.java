import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!po", name = "v", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "S")
	public static short aShort85 = 256;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
	public static boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static98.method1465(arg1, arg0) || Static308.method4627(arg1, arg0);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	public static void method5840() {
		Static79.aClass207_5.method4392();
		Static301.aClass207_29.method4392();
		Static201.aClass207_21.method4392();
		Static593.aClass207_62.method4392();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)V")
	public static void method5841(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static560.method7571(arg0 - 1L);
			Static560.method7571(1L);
		} else {
			Static560.method7571(arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)V")
	public static void method5842(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg0, 6);
		local10.method4835();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!hb;)V")
	public static void method5843(@OriginalArg(1) Class11_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(11) Class1_Sub4 local11 = (Class1_Sub4) Static60.aClass91_3.method2271((long) arg0.anInt7524);
		if (local11 == null) {
			return;
		}
		if (local11.aClass1_Sub6_Sub4_1 != null) {
			Static425.aClass1_Sub6_Sub3_2.method6532(local11.aClass1_Sub6_Sub4_1);
			local11.aClass1_Sub6_Sub4_1 = null;
		}
		local11.method7908();
	}
}
