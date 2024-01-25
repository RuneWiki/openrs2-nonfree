import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!ue;")
	public static Class196 aClass196_3;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Lclient!ue;")
	public static Class196 aClass196_4;

	@OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
	public static int anInt3276 = 0;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)V")
	public static void method3391() {
		@Pc(9) Class70 local9 = Static293.aClass70_95;
		synchronized (Static293.aClass70_95) {
			Static293.aClass70_95.method1397(5);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method3392() {
		for (@Pc(3) int local3 = 0; local3 < Static15.anInt281; local3++) {
			@Pc(9) int local9 = Static151.anIntArray352[local3];
			@Pc(13) Class44_Sub4_Sub4_Sub1 local13 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local9];
			@Pc(17) int local17 = Static142.aClass6_Sub10_Sub1_3.method3972();
			if ((local17 & 0x80) != 0) {
				local17 += Static142.aClass6_Sub10_Sub1_3.method3972() << 8;
			}
			Static125.method2484(local17, local9, local13);
		}
	}
}
