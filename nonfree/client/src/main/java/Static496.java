import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ul", name = "T", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_144 = new Class40("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

	@OriginalMember(owner = "client!ul", name = "ab", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_208 = new Class150(69, -2);

	@OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
	public static int anInt8516 = -1;

	@OriginalMember(owner = "client!ul", name = "cb", descriptor = "[I")
	public static final int[] anIntArray660 = new int[32];

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)V")
	public static void method6876() {
		if (Static83.anInt1578 == 0) {
			return;
		}
		try {
			if (++Static353.anInt6598 > 2000) {
				if (client.lb != null) {
					client.lb.method4920();
					client.lb = null;
				}
				if (Static296.anInt5925 >= 1) {
					Static464.anInt7964 = -5;
					Static83.anInt1578 = 0;
					return;
				}
				Static83.anInt1578 = 1;
				Static353.anInt6598 = 0;
				Static453.aClass43_4.aBoolean60 = !Static453.aClass43_4.aBoolean60;
				Static296.anInt5925++;
			}
			if (Static83.anInt1578 == 1) {
				Static301.aClass83_7 = Static159.aClass9_10.method276(Static453.aClass43_4.aString27, Static453.aClass43_4.method1116());
				Static83.anInt1578 = 2;
			}
			if (Static83.anInt1578 == 2) {
				if (Static301.aClass83_7.anInt2495 == 2) {
					throw new IOException();
				}
				if (Static301.aClass83_7.anInt2495 != 1) {
					return;
				}
				client.lb = Static147.method2756((Socket) Static301.aClass83_7.anObject8);
				Static301.aClass83_7 = null;
				client.lb.method4910(Static164.aClass5_Sub3_Sub1_2.anInt4960, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
				Static83.anInt1578 = 4;
			}
			@Pc(126) int local126;
			if (Static83.anInt1578 == 4) {
				if (!client.lb.method4916(1)) {
					return;
				}
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				local126 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
				if (local126 != 21) {
					Static83.anInt1578 = 0;
					Static464.anInt7964 = local126;
					client.lb.method4920();
					client.lb = null;
					return;
				}
				Static83.anInt1578 = 5;
			}
			if (Static83.anInt1578 == 5) {
				if (!client.lb.method4916(1)) {
					return;
				}
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				Static494.aStringArray36 = new String[Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF];
				Static83.anInt1578 = 6;
			}
			if (Static83.anInt1578 == 6 && client.lb.method4916(Static494.aStringArray36.length * 8)) {
				Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
				client.lb.method4918(0, Static494.aStringArray36.length * 8, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				for (local126 = 0; local126 < Static494.aStringArray36.length; local126++) {
					Static494.aStringArray36[local126] = Static193.method3234(Static131.aClass5_Sub3_Sub1_1.method4172());
				}
				Static464.anInt7964 = 21;
				Static83.anInt1578 = 0;
				client.lb.method4920();
				client.lb = null;
			}
		} catch (@Pc(239) IOException local239) {
			if (client.lb != null) {
				client.lb.method4920();
				client.lb = null;
			}
			if (Static296.anInt5925 >= 1) {
				Static83.anInt1578 = 0;
				Static464.anInt7964 = -4;
			} else {
				Static83.anInt1578 = 1;
				Static296.anInt5925++;
				Static353.anInt6598 = 0;
				Static453.aClass43_4.aBoolean60 = !Static453.aClass43_4.aBoolean60;
			}
		}
	}
}
