import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!tp", name = "r", descriptor = "Lclient!hm;")
	public static Class107 aClass107_14;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_244 = new Class67(71, 3);

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "[Lclient!ir;")
	public static final Class11_Sub1_Sub3_Sub2[] aClass11_Sub1_Sub3_Sub2Array1 = new Class11_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
	public static void method5167() {
		if (Static212.anInt3922 == 0) {
			return;
		}
		try {
			if (++Static341.anInt5529 > 2000) {
				if (Static337.aClass110_2 != null) {
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
				}
				if (Static396.anInt6368 >= 1) {
					Static228.anInt5704 = -5;
					Static212.anInt3922 = 0;
					return;
				}
				Static341.anInt5529 = 0;
				Static212.anInt3922 = 1;
				Static396.anInt6368++;
				Static335.aClass112_9.aBoolean272 = !Static335.aClass112_9.aBoolean272;
			}
			if (Static212.anInt3922 == 1) {
				Static462.aClass253_8 = Static259.aClass177_2.method3841(Static335.aClass112_9.method2164(), Static335.aClass112_9.aString28);
				Static212.anInt3922 = 2;
			}
			if (Static212.anInt3922 == 2) {
				if (Static462.aClass253_8.anInt6669 == 2) {
					throw new IOException();
				}
				if (Static462.aClass253_8.anInt6669 != 1) {
					return;
				}
				Static337.aClass110_2 = Static397.method5141((Socket) Static462.aClass253_8.anObject9);
				Static462.aClass253_8 = null;
				Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, Static426.aClass1_Sub19_Sub2_2.anInt3698);
				Static212.anInt3922 = 4;
			}
			@Pc(132) int local132;
			if (Static212.anInt3922 == 4) {
				if (!Static337.aClass110_2.method3777(1)) {
					return;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				local132 = Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF;
				if (local132 != 21) {
					Static228.anInt5704 = local132;
					Static212.anInt3922 = 0;
					Static337.aClass110_2.method3781();
					Static337.aClass110_2 = null;
					return;
				}
				Static212.anInt3922 = 5;
			}
			if (Static212.anInt3922 == 5) {
				if (!Static337.aClass110_2.method3777(1)) {
					return;
				}
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, 1);
				Static392.aStringArray48 = new String[Static413.aClass1_Sub19_Sub2_1.aByteArray38[0] & 0xFF];
				Static212.anInt3922 = 6;
			}
			if (Static212.anInt3922 == 6 && Static337.aClass110_2.method3777(Static392.aStringArray48.length * 8)) {
				Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
				Static337.aClass110_2.method3779(0, Static413.aClass1_Sub19_Sub2_1.aByteArray38, Static392.aStringArray48.length * 8);
				for (local132 = 0; local132 < Static392.aStringArray48.length; local132++) {
					Static392.aStringArray48[local132] = Static396.method5137(Static413.aClass1_Sub19_Sub2_1.method2909());
				}
				Static228.anInt5704 = 21;
				Static212.anInt3922 = 0;
				Static337.aClass110_2.method3781();
				Static337.aClass110_2 = null;
			}
		} catch (@Pc(232) IOException local232) {
			if (Static337.aClass110_2 != null) {
				Static337.aClass110_2.method3781();
				Static337.aClass110_2 = null;
			}
			if (Static396.anInt6368 < 1) {
				Static212.anInt3922 = 1;
				Static341.anInt5529 = 0;
				Static335.aClass112_9.aBoolean272 = !Static335.aClass112_9.aBoolean272;
				Static396.anInt6368++;
			} else {
				Static228.anInt5704 = -4;
				Static212.anInt3922 = 0;
			}
		}
	}
}
