import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array11;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "I")
	public static int anInt2706;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_972 = Static64.method1101("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_971 = aClass51_972;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
	public static int anInt2710 = 100;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
	public static void method2152(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static23.aClass105_3.method3120(); local10 != null; local10 = (Class1_Sub18) Static23.aClass105_3.method3109()) {
			if (local10.aClass1_Sub4_Sub4_2 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(local10.aClass1_Sub4_Sub4_2);
				local10.aClass1_Sub4_Sub4_2 = null;
			}
			if (local10.aClass1_Sub4_Sub4_3 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(local10.aClass1_Sub4_Sub4_3);
				local10.aClass1_Sub4_Sub4_3 = null;
			}
			local10.method3758();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class1_Sub18 local49 = (Class1_Sub18) Static150.aClass105_16.method3120(); local49 != null; local49 = (Class1_Sub18) Static150.aClass105_16.method3109()) {
			if (local49.aClass1_Sub4_Sub4_2 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(local49.aClass1_Sub4_Sub4_2);
				local49.aClass1_Sub4_Sub4_2 = null;
			}
			local49.method3758();
		}
		for (@Pc(76) Class1_Sub18 local76 = (Class1_Sub18) Static92.aClass102_11.method3086(); local76 != null; local76 = (Class1_Sub18) Static92.aClass102_11.method3087()) {
			if (local76.aClass1_Sub4_Sub4_2 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(local76.aClass1_Sub4_Sub4_2);
				local76.aClass1_Sub4_Sub4_2 = null;
			}
			local76.method3758();
		}
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(I)Lclient!ik;")
	public static Class1_Sub2_Sub10 method2153() {
		@Pc(10) Class1_Sub2_Sub10 local10 = (Class1_Sub2_Sub10) Static146.aClass116_3.method3453();
		if (local10 != null) {
			local10.method3758();
			local10.method3318();
			return local10;
		}
		do {
			local10 = (Class1_Sub2_Sub10) Static144.aClass116_5.method3453();
			if (local10 == null) {
				return null;
			}
			if (local10.method1525() > Static144.method2489()) {
				return null;
			}
			local10.method3758();
			local10.method3318();
		} while ((local10.aLong156 & Long.MIN_VALUE) == 0L);
		return local10;
	}
}
