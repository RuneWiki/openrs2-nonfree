import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
	public static int anInt8829;

	@OriginalMember(owner = "client!rt", name = "H", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_116 = new Class218(35, -1);

	@OriginalMember(owner = "client!rt", name = "K", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_117 = new Class218(1, -1);

	@OriginalMember(owner = "client!rt", name = "O", descriptor = "[Lclient!in;")
	public static Class148[] aClass148Array1 = null;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
	public static void method7285() {
		@Pc(8) Class3_Sub30 local8 = (Class3_Sub30) Static264.aClass276_37.method6907();
		@Pc(24) boolean local24 = Static233.aClass108_7 != null || Static604.anInt10035 > 0;
		@Pc(28) int local28 = local8.method6363();
		@Pc(32) int local32 = local8.method6367();
		if (local24) {
			Static269.anInt5798 = 1;
		}
		if (local24) {
			Static156.aClass3_Sub1_Sub4_2 = Static300.aClass3_Sub1_Sub4_3;
		} else {
			Static422.method8088(local28, Static300.aClass3_Sub1_Sub4_3, local32);
		}
	}
}
