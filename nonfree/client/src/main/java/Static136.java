import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!eka", name = "o", descriptor = "I")
	public static int anInt2650;

	@OriginalMember(owner = "client!eka", name = "r", descriptor = "[Lclient!pja;")
	public static Class287[] aClass287Array1;

	@OriginalMember(owner = "client!eka", name = "s", descriptor = "Lclient!lga;")
	public static Class223 aClass223_28;

	@OriginalMember(owner = "client!eka", name = "p", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_43 = new Class322(45, 4);

	@OriginalMember(owner = "client!eka", name = "u", descriptor = "[Lclient!m;")
	public static final Interface17[] anInterface17Array1 = new Interface17[75];

	@OriginalMember(owner = "client!eka", name = "q", descriptor = "Lclient!op;")
	public static final Class275 aClass275_7 = new Class275("", 11);

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(I)V")
	public static void method2602() {
		Static534.aClass124Array6 = new Class124[50];
		Static74.anInt1034 = 0;
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(B)V")
	public static void method2603() {
		if (!Static442.aBoolean581) {
			return;
		}
		while (true) {
			while (Static638.anInt9936 < Static59.aClass204_Sub1Array1.length) {
				@Pc(28) Class204_Sub1 local28 = Static59.aClass204_Sub1Array1[Static638.anInt9936];
				if (local28 != null && local28.anInt6032 == -1) {
					if (Static392.aClass6_Sub46_1 == null) {
						Static392.aClass6_Sub46_1 = Static239.aClass5_1.method30(local28.aString70);
					}
					@Pc(58) int local58 = Static392.aClass6_Sub46_1.anInt8354;
					if (local58 == -1) {
						return;
					}
					local28.anInt6032 = local58;
					Static392.aClass6_Sub46_1 = null;
					Static638.anInt9936++;
				} else {
					Static638.anInt9936++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)Lclient!dm;")
	public static Class6_Sub13 method2606() {
		return Static656.anInt10169 == 0 ? new Class6_Sub13() : Static603.aClass6_Sub13Array1[--Static656.anInt10169];
	}
}
