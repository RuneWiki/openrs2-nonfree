import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_15 = new Class44(4);

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public static void method2555() {
		if (Static17.anInt529 == 0) {
			return;
		}
		try {
			if (++Static2.anInt6387 > 2000) {
				if (Static177.aClass73_6 != null) {
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
				}
				if (Static103.anInt2234 >= 1) {
					Static17.anInt529 = 0;
					Static203.anInt3801 = -5;
					return;
				}
				Static17.anInt529 = 1;
				if (Static154.anInt3148 == Static263.anInt4756) {
					Static154.anInt3148 = Static124.anInt2566;
				} else {
					Static154.anInt3148 = Static263.anInt4756;
				}
				Static103.anInt2234++;
				Static2.anInt6387 = 0;
			}
			if (Static17.anInt529 == 1) {
				Static294.aClass122_6 = Static45.aClass209_127.method4688(Static154.anInt3148, Static207.aString29);
				Static17.anInt529 = 2;
			}
			@Pc(112) int local112;
			if (Static17.anInt529 == 2) {
				if (Static294.aClass122_6.anInt3557 == 2) {
					throw new IOException();
				}
				if (Static294.aClass122_6.anInt3557 != 1) {
					return;
				}
				Static177.aClass73_6 = new Class73((Socket) Static294.aClass122_6.anObject7, Static45.aClass209_127);
				Static294.aClass122_6 = null;
				Static177.aClass73_6.method1873(Static109.aClass6_Sub1_Sub1_5.anInt7898, Static109.aClass6_Sub1_Sub1_5.aByteArray96);
				Static141.method1127();
				local112 = Static177.aClass73_6.method1874();
				Static141.method1127();
				if (local112 != 21) {
					Static203.anInt3801 = local112;
					Static17.anInt529 = 0;
					Static177.aClass73_6.method1875();
					Static177.aClass73_6 = null;
					return;
				}
				Static17.anInt529 = 3;
			}
			if (Static17.anInt529 == 3) {
				if (Static177.aClass73_6.method1872() < 1) {
					return;
				}
				Static156.aStringArray18 = new String[Static177.aClass73_6.method1874()];
				Static17.anInt529 = 4;
			}
			if (Static17.anInt529 == 4 && Static177.aClass73_6.method1872() >= Static156.aStringArray18.length * 8) {
				Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
				Static177.aClass73_6.method1877(Static156.aStringArray18.length * 8, Static232.aClass6_Sub1_Sub1_4.aByteArray96, 0);
				for (local112 = 0; local112 < Static156.aStringArray18.length; local112++) {
					Static156.aStringArray18[local112] = Static9.method305(Static232.aClass6_Sub1_Sub1_4.method6467());
				}
				Static17.anInt529 = 0;
				Static203.anInt3801 = 21;
				Static177.aClass73_6.method1875();
				Static177.aClass73_6 = null;
			}
		} catch (@Pc(206) IOException local206) {
			if (Static177.aClass73_6 != null) {
				Static177.aClass73_6.method1875();
				Static177.aClass73_6 = null;
			}
			if (Static103.anInt2234 < 1) {
				Static2.anInt6387 = 0;
				Static17.anInt529 = 1;
				if (Static263.anInt4756 == Static154.anInt3148) {
					Static154.anInt3148 = Static124.anInt2566;
				} else {
					Static154.anInt3148 = Static263.anInt4756;
				}
				Static103.anInt2234++;
			} else {
				Static17.anInt529 = 0;
				Static203.anInt3801 = -4;
			}
		}
	}
}
