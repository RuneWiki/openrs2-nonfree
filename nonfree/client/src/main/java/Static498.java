import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt7923;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	public static int anInt7926;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!qf;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method6714(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static4.aClass43_1 = Static442.method7138(Static278.aClass3_Sub13_Sub1_1.anInt5159 * 2, Static56.anInterface8_3, 0, Static542.aClass246_250, Static347.aCanvas9);
			if (arg1 != null) {
				Static4.aClass43_1.ja(0);
				@Pc(167) Class58 local167 = Static14.method232(Static304.anInt5516, Static467.aClass246_221);
				@Pc(176) Class117 local176 = Static4.aClass43_1.method7139(local167, Static606.method7593(Static171.aClass246_84, Static304.anInt5516));
				Static572.method6782();
				Static392.method5757(Static4.aClass43_1, arg1, true, local176, local167);
			}
		} else {
			@Pc(15) Class43 local15 = null;
			@Pc(36) Class58 local36;
			@Pc(45) Class117 local45;
			if (arg1 != null) {
				local15 = Static442.method7138(0, Static56.anInterface8_3, 0, Static542.aClass246_250, Static347.aCanvas9);
				local15.ja(0);
				local36 = Static14.method232(Static304.anInt5516, Static467.aClass246_221);
				local45 = local15.method7139(local36, Static606.method7593(Static171.aClass246_84, Static304.anInt5516));
				Static572.method6782();
				Static392.method5757(local15, arg1, true, local45, local36);
			}
			try {
				Static4.aClass43_1 = Static442.method7138(Static278.aClass3_Sub13_Sub1_1.anInt5159 * 2, Static56.anInterface8_3, arg0, Static542.aClass246_250, Static347.aCanvas9);
				if (arg1 != null) {
					local15.ja(0);
					local36 = Static14.method232(Static304.anInt5516, Static467.aClass246_221);
					local45 = local15.method7139(local36, Static606.method7593(Static171.aClass246_84, Static304.anInt5516));
					Static572.method6782();
					Static392.method5757(local15, arg1, true, local45, local36);
				}
				if (Static4.aClass43_1.method7150()) {
					@Pc(99) boolean local99 = true;
					try {
						local99 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(109) Throwable local109) {
					}
					@Pc(115) Class3_Sub16 local115;
					if (local99) {
						local115 = Static4.aClass43_1.method7193(146800640);
					} else {
						local115 = Static4.aClass43_1.method7193(104857600);
					}
					Static4.aClass43_1.method7201(local115);
				}
			} catch (@Pc(126) Throwable local126) {
				arg0 = 0;
				Static4.aClass43_1 = Static442.method7138(0, Static56.anInterface8_3, 0, Static542.aClass246_250, Static347.aCanvas9);
			}
			if (local15 != null) {
				try {
					local15.method7179();
				} catch (@Pc(143) Throwable local143) {
				}
			}
		}
		Static260.anInt4932 = arg0;
		Static334.method5138();
		Static4.aClass43_1.va(32);
		Static328.aClass109_5 = Static4.aClass43_1.method7160();
		Static315.aClass109_4 = Static4.aClass43_1.method7160();
		Static425.method6060();
		Static4.aClass43_1.method7195(!Static278.aClass3_Sub13_Sub1_1.aBoolean409);
		if (Static4.aClass43_1.method7146()) {
			Static531.method7010(Static278.aClass3_Sub13_Sub1_1.aBoolean408);
		}
		Static453.method6304(Static271.anInt5050 >> 3, Static4.aClass43_1, Static400.anInt6818 >> 3);
		Static578.method7669();
		Static182.aClass54Array1 = null;
		Static14.aBoolean20 = true;
		Static529.aBoolean647 = false;
	}
}
