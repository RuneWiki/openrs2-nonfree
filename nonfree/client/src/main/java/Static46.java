import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_402 = Static120.method2057("purple:");

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_401 = aClass81_402;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_403 = Static120.method2057("me");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!rh;")
	public static Class77 aClass77_7 = null;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_404 = Static120.method2057("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_405 = Static120.method2057("Hidden)2");

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	public static int anInt1126 = 0;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_406 = Static120.method2057("(Udns");

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!tg;")
	public static Class81 aClass81_407 = aClass81_402;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!ca;")
	public static Class1_Sub2_Sub4 method848(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub4 local15 = (Class1_Sub2_Sub4) Static50.aClass59_10.method1970((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static33.aClass82_16.method2942(arg0, 14);
		local15 = new Class1_Sub2_Sub4();
		if (local25 != null) {
			local15.method420(new Class1_Sub8(local25));
		}
		Static50.aClass59_10.method1973(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method849() {
		aClass81_405 = null;
		aClass81_403 = null;
		aClass77_7 = null;
		aClass81_406 = null;
		aClass81_402 = null;
		aClass81_404 = null;
		aClass81_401 = null;
		aClass81_407 = null;
		aShortArray10 = null;
	}
}
