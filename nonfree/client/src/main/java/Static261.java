import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!jo;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_10 = new Class62(7, 15);

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "[I")
	public static final int[] anIntArray888 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_37 = new Class30();

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public static void method4034() {
		for (@Pc(12) Class10_Sub4 local12 = (Class10_Sub4) Static303.aClass154_7.method3484(); local12 != null; local12 = (Class10_Sub4) Static303.aClass154_7.method3484()) {
			Static358.method2045(local12);
		}
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (Static231.method3740()) {
			local33 = 0;
			local35 = 3;
		} else {
			local35 = Static130.anInt2658;
			local33 = Static130.anInt2658;
		}
		Static45.method783();
		for (@Pc(44) int local44 = local33; local44 <= local35; local44++) {
			Static45.method773();
			Static45.method781(local44);
			Static45.method785(local44);
		}
		Static45.method772();
		Static45.method780();
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	public static void method4036() {
		@Pc(5) Class160 local5 = Static208.aClass160_33;
		synchronized (Static208.aClass160_33) {
			Static208.aClass160_33.method3595();
		}
		local5 = Static238.aClass160_36;
		synchronized (Static238.aClass160_36) {
			Static238.aClass160_36.method3595();
		}
	}
}
