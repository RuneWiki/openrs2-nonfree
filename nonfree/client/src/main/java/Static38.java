import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!us;")
	public static final Class295 aClass295_1 = new Class295();

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "[B")
	public static final byte[] aByteArray14 = new byte[2048];

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_17 = new Class6(3, 6);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_11 = new Class186(61, 3);

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_12 = new Class186(3, 18);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method1334() {
		if (Static318.anInt6041 == 0) {
			return;
		}
		try {
			if (++Static165.anInt3646 > 2000) {
				if (Static453.aClass154_1 != null) {
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
				}
				if (Static180.anInt3884 >= 1) {
					Static318.anInt6041 = 0;
					Static244.anInt4711 = -5;
					return;
				}
				Static318.anInt6041 = 1;
				Static269.aClass130_6.aBoolean248 = !Static269.aClass130_6.aBoolean248;
				Static165.anInt3646 = 0;
				Static180.anInt3884++;
			}
			if (Static318.anInt6041 == 1) {
				Static317.aClass243_5 = Static91.aClass182_2.method4818(Static269.aClass130_6.aString26, Static269.aClass130_6.method3628());
				Static318.anInt6041 = 2;
			}
			if (Static318.anInt6041 == 2) {
				if (Static317.aClass243_5.anInt6905 == 2) {
					throw new IOException();
				}
				if (Static317.aClass243_5.anInt6905 != 1) {
					return;
				}
				Static453.aClass154_1 = Static252.method4282((Socket) Static317.aClass243_5.anObject12);
				Static317.aClass243_5 = null;
				Static453.aClass154_1.method4023(Static192.aClass1_Sub13_Sub2_1.anInt3400, Static192.aClass1_Sub13_Sub2_1.aByteArray45);
				Static318.anInt6041 = 4;
			}
			@Pc(132) int local132;
			if (Static318.anInt6041 == 4) {
				if (!Static453.aClass154_1.method4019(1)) {
					return;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				local132 = Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF;
				if (local132 != 21) {
					Static244.anInt4711 = local132;
					Static318.anInt6041 = 0;
					Static453.aClass154_1.method4020();
					Static453.aClass154_1 = null;
					return;
				}
				Static318.anInt6041 = 5;
			}
			if (Static318.anInt6041 == 5) {
				if (!Static453.aClass154_1.method4019(1)) {
					return;
				}
				Static453.aClass154_1.method4022(1, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				Static438.aStringArray9 = new String[Static255.aClass1_Sub13_Sub2_2.aByteArray45[0] & 0xFF];
				Static318.anInt6041 = 6;
			}
			if (Static318.anInt6041 == 6 && Static453.aClass154_1.method4019(Static438.aStringArray9.length * 8)) {
				Static255.aClass1_Sub13_Sub2_2.anInt3400 = 0;
				Static453.aClass154_1.method4022(Static438.aStringArray9.length * 8, Static255.aClass1_Sub13_Sub2_2.aByteArray45, 0);
				for (local132 = 0; local132 < Static438.aStringArray9.length; local132++) {
					Static438.aStringArray9[local132] = Static433.method6988(Static255.aClass1_Sub13_Sub2_2.method3015());
				}
				Static244.anInt4711 = 21;
				Static318.anInt6041 = 0;
				Static453.aClass154_1.method4020();
				Static453.aClass154_1 = null;
			}
		} catch (@Pc(236) IOException local236) {
			if (Static453.aClass154_1 != null) {
				Static453.aClass154_1.method4020();
				Static453.aClass154_1 = null;
			}
			if (Static180.anInt3884 >= 1) {
				Static318.anInt6041 = 0;
				Static244.anInt4711 = -4;
			} else {
				Static269.aClass130_6.aBoolean248 = !Static269.aClass130_6.aBoolean248;
				Static180.anInt3884++;
				Static318.anInt6041 = 1;
				Static165.anInt3646 = 0;
			}
		}
	}
}
