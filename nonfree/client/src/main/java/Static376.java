import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!og", name = "J", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "[J")
	public static final long[] aLongArray15 = new long[10];

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_104 = new Class90(77, 12);

	@OriginalMember(owner = "client!og", name = "R", descriptor = "[I")
	public static final int[] anIntArray400 = new int[1];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public static void method5842() {
		for (@Pc(6) Class21_Sub9 local6 = (Class21_Sub9) Static62.aClass158_19.method3719(); local6 != null; local6 = (Class21_Sub9) Static62.aClass158_19.method3719()) {
			Static242.method7882(local6);
		}
		@Pc(33) int local33;
		@Pc(32) int local32;
		if (Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614)) {
			local32 = 3;
			local33 = 0;
		} else {
			local32 = Static550.anInt10029;
			local33 = Static550.anInt10029;
		}
		Static70.method1541();
		for (@Pc(42) int local42 = local33; local42 <= local32; local42++) {
			Static70.method1535();
			Static70.method1543(local42);
			Static70.method1538(local42);
		}
		Static70.method1536();
		Static70.method1544();
	}
}
