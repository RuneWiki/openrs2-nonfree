import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!en;")
	public static Class44 aClass44_19 = new Class44();

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)[Lclient!ob;")
	public static Class93[] method2644() {
		@Pc(4) Class93[] local4 = new Class93[Static236.anInt4770];
		for (@Pc(18) int local18 = 0; local18 < Static236.anInt4770; local18++) {
			if (Static116.aBoolean184) {
				local4[local18] = new Class93_Sub2(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local18], Static275.anIntArray522[local18], Static299.anIntArray561[local18], Static187.anIntArray397[local18], Static165.aByteArrayArray9[local18], Static199.anIntArray438);
			} else {
				local4[local18] = new Class93_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local18], Static275.anIntArray522[local18], Static299.anIntArray561[local18], Static187.anIntArray397[local18], Static165.aByteArrayArray9[local18], Static199.anIntArray438);
			}
		}
		Static293.method4502();
		return local4;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
	public static void method2645() {
		Static80.aClass157_14.method4027();
	}
}
