import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_173 = new Class133(55, -2);

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public static int anInt9439 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method7804() {
		if (Static496.anInt8742 == 0) {
			return;
		}
		try {
			if (++Static138.anInt2797 > 2000) {
				if (Static467.aClass41_1 != null) {
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
				}
				if (Static490.anInt8722 >= 2) {
					Static417.anInt7805 = -5;
					Static496.anInt8742 = 0;
					return;
				}
				Static93.aClass319_6.method7698();
				Static490.anInt8722++;
				Static496.anInt8742 = 1;
				Static138.anInt2797 = 0;
			}
			if (Static496.anInt8742 == 1) {
				Static369.aClass212_4 = Static93.aClass319_6.method7699(Static401.aClass285_11);
				Static496.anInt8742 = 2;
			}
			if (Static496.anInt8742 == 2) {
				if (Static369.aClass212_4.anInt6547 == 2) {
					throw new IOException();
				}
				if (Static369.aClass212_4.anInt6547 != 1) {
					return;
				}
				Static467.aClass41_1 = Static533.method5630((Socket) Static369.aClass212_4.anObject13);
				Static369.aClass212_4 = null;
				Static467.aClass41_1.method1065(Static515.aClass3_Sub27_Sub1_2.anInt9191, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
				Static496.anInt8742 = 4;
			}
			@Pc(124) int local124;
			if (Static496.anInt8742 == 4) {
				if (!Static467.aClass41_1.method1071(1)) {
					return;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				local124 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
				if (local124 != 21) {
					Static417.anInt7805 = local124;
					Static496.anInt8742 = 0;
					Static467.aClass41_1.method1066();
					Static467.aClass41_1 = null;
					return;
				}
				Static496.anInt8742 = 5;
			}
			if (Static496.anInt8742 == 5) {
				if (!Static467.aClass41_1.method1071(1)) {
					return;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				Static296.aStringArray36 = new String[Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF];
				Static496.anInt8742 = 6;
			}
			if (Static496.anInt8742 == 6 && Static467.aClass41_1.method1071(Static296.aStringArray36.length * 8)) {
				Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, Static296.aStringArray36.length * 8);
				for (local124 = 0; local124 < Static296.aStringArray36.length; local124++) {
					Static296.aStringArray36[local124] = Static190.method3578(Static90.aClass3_Sub27_Sub1_1.method7555());
				}
				Static417.anInt7805 = 21;
				Static496.anInt8742 = 0;
				Static467.aClass41_1.method1066();
				Static467.aClass41_1 = null;
			}
		} catch (@Pc(226) IOException local226) {
			if (Static467.aClass41_1 != null) {
				Static467.aClass41_1.method1066();
				Static467.aClass41_1 = null;
			}
			if (Static490.anInt8722 < 2) {
				Static93.aClass319_6.method7698();
				Static138.anInt2797 = 0;
				Static490.anInt8722++;
				Static496.anInt8742 = 1;
			} else {
				Static417.anInt7805 = -4;
				Static496.anInt8742 = 0;
			}
		}
	}
}
