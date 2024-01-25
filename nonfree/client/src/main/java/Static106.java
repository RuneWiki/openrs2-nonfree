import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!sea;")
	public static Class308 aClass308_41;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!kr;")
	public static final Class196 aClass196_2 = new Class196();

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt1789 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public static void method1494(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub8_Sub9 local16 = Static465.method6470(arg0, 12);
		local16.method4835();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public static void method1498(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static287.aFloat106 = 3.0F;
		} else if (arg0 == 50) {
			Static287.aFloat106 = 4.0F;
		} else if (arg0 == 75) {
			Static287.aFloat106 = 6.0F;
		} else if (arg0 == 100) {
			Static287.aFloat106 = 8.0F;
		} else if (arg0 == 200) {
			Static287.aFloat106 = 16.0F;
		}
		Static100.anInt1767 = -1;
		Static100.anInt1767 = -1;
	}
}
