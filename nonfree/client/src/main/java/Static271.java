import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_39 = new Class276();

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_68 = new Class218(41, 2);

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Lclient!er;")
	public static final Class86 aClass86_7 = new Class86();

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_69 = new Class218(30, -1);

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[S")
	public static final short[] aShortArray89 = new short[] { 18, 45, 2, 6, 20, 13, 16, 57 };

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method4926() {
		if (Static567.anInt9650 == 0) {
			return;
		}
		try {
			if (++Static6.anInt67 > 2000) {
				if (Static412.aClass51_25 != null) {
					Static412.aClass51_25.method3508();
					Static412.aClass51_25 = null;
				}
				if (Static544.anInt9356 >= 2) {
					Static278.anInt7456 = -5;
					Static567.anInt9650 = 0;
					return;
				}
				Static303.aClass278_3.method6940();
				Static544.anInt9356++;
				Static6.anInt67 = 0;
				Static567.anInt9650 = 1;
			}
			if (Static567.anInt9650 == 1) {
				Static235.aClass376_17 = Static303.aClass278_3.method6939(Static379.aClass228_6);
				Static567.anInt9650 = 2;
			}
			if (Static567.anInt9650 == 2) {
				if (Static235.aClass376_17.anInt10510 == 2) {
					throw new IOException();
				}
				if (Static235.aClass376_17.anInt10510 != 1) {
					return;
				}
				Static412.aClass51_25 = Static510.method7403((Socket) Static235.aClass376_17.anObject19);
				Static235.aClass376_17 = null;
				Static388.method6125();
				Static567.anInt9650 = 4;
			}
			if (Static567.anInt9650 == 4 && Static412.aClass51_25.method3507(1)) {
				Static412.aClass51_25.method3509(0, 1, Static281.aClass3_Sub15_Sub1_4.aByteArray106);
				@Pc(115) int local115 = Static281.aClass3_Sub15_Sub1_4.aByteArray106[0] & 0xFF;
				Static567.anInt9650 = 0;
				Static278.anInt7456 = local115;
				Static412.aClass51_25.method3508();
				Static412.aClass51_25 = null;
			}
		} catch (@Pc(126) IOException local126) {
			if (Static412.aClass51_25 != null) {
				Static412.aClass51_25.method3508();
				Static412.aClass51_25 = null;
			}
			if (Static544.anInt9356 >= 2) {
				Static567.anInt9650 = 0;
				Static278.anInt7456 = -4;
			} else {
				Static303.aClass278_3.method6940();
				Static6.anInt67 = 0;
				Static544.anInt9356++;
				Static567.anInt9650 = 1;
			}
		}
	}
}
