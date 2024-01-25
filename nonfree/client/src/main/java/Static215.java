import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public static int anInt4245;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Lclient!fk;")
	public static Class71 aClass71_6;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "F")
	public static float aFloat55 = 0.0F;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
	public static boolean aBoolean349 = true;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_102 = new Class85("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
	public static int anInt4249 = 0;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public static void method3930() {
		if (Static153.anInt2976 == 0) {
			return;
		}
		try {
			if (++Static129.anInt2452 > 1500) {
				if (Static155.aClass41_18 != null) {
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
				}
				if (Static52.anInt971 >= 1) {
					Static153.anInt2976 = 0;
					Static333.anInt6433 = -5;
					return;
				}
				Static153.anInt2976 = 1;
				Static129.anInt2452 = 0;
				Static52.anInt971++;
				if (Static347.anInt6685 == Static89.anInt1684) {
					Static89.anInt1684 = Static309.anInt6049;
				} else {
					Static89.anInt1684 = Static347.anInt6685;
				}
			}
			if (Static153.anInt2976 == 1) {
				Static164.aClass16_4 = Static182.aClass139_5.method3857(Static89.anInt1684, Static214.aString37);
				Static153.anInt2976 = 2;
			}
			@Pc(123) int local123;
			if (Static153.anInt2976 == 2) {
				if (Static164.aClass16_4.anInt381 == 2) {
					throw new IOException();
				}
				if (Static164.aClass16_4.anInt381 != 1) {
					return;
				}
				Static155.aClass41_18 = new Class41((Socket) Static164.aClass16_4.anObject1, Static182.aClass139_5);
				Static164.aClass16_4 = null;
				Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				local123 = Static155.aClass41_18.method830();
				if (Static143.aClass47_1 != null) {
					Static143.aClass47_1.method5324();
				}
				if (Static311.aClass47_3 != null) {
					Static311.aClass47_3.method5324();
				}
				if (local123 != 101) {
					Static153.anInt2976 = 0;
					Static333.anInt6433 = local123;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					return;
				}
				Static153.anInt2976 = 3;
			}
			if (Static153.anInt2976 == 3 && Static155.aClass41_18.method826() >= 2) {
				local123 = Static155.aClass41_18.method830() << 8 | Static155.aClass41_18.method830();
				Static95.method1732(local123);
				if (Static48.anInt918 == -1) {
					Static333.anInt6433 = 6;
					Static153.anInt2976 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
				} else {
					Static153.anInt2976 = 0;
					Static155.aClass41_18.method825();
					Static155.aClass41_18 = null;
					Static170.method3098();
				}
			}
		} catch (@Pc(203) IOException local203) {
			if (Static155.aClass41_18 != null) {
				Static155.aClass41_18.method825();
				Static155.aClass41_18 = null;
			}
			if (Static52.anInt971 < 1) {
				if (Static89.anInt1684 == Static347.anInt6685) {
					Static89.anInt1684 = Static309.anInt6049;
				} else {
					Static89.anInt1684 = Static347.anInt6685;
				}
				Static52.anInt971++;
				Static153.anInt2976 = 1;
				Static129.anInt2452 = 0;
			} else {
				Static333.anInt6433 = -4;
				Static153.anInt2976 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method3931() {
		Static190.aClass109_6.method2850();
	}
}
