import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt960;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	public static int anInt947 = -1;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_316 = Static161.method2971("null");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_318 = Static161.method2971("No response from server)3");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_317 = aClass13_318;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_5 = new Class47(20);

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	public static int[] anIntArray111 = new int[100];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Lclient!t;")
	public static Class1_Sub2_Sub18 method805(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub18 local6 = (Class1_Sub2_Sub18) Static85.aClass47_17.method1999((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static54.aClass4_48.method2243(14, arg0);
		local6 = new Class1_Sub2_Sub18();
		if (local25 != null) {
			local6.method2756(new Class1_Sub8(local25));
		}
		Static85.aClass47_17.method1998(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method808(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub6 local12 = (Class1_Sub6) Static22.aClass45_8.method1982(); local12 != null; local12 = (Class1_Sub6) Static22.aClass45_8.method1986()) {
			if ((long) arg0 == (local12.aLong158 >> 48 & 0xFFFFL)) {
				local12.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method809() {
		aClass13_318 = null;
		aClass13_316 = null;
		aClass47_5 = null;
		anIntArray111 = null;
		aClass13_317 = null;
		aShortArrayArray3 = null;
	}
}
