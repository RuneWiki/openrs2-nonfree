import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	public static final int anInt7604 = 50;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[anInt7604];

	@OriginalMember(owner = "client!on", name = "b", descriptor = "[I")
	public static final int[] anIntArray376 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
	public static final int[] anIntArray377 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
	public static final int[] anIntArray378 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_84 = new Class185(62, 1);

	@OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
	public static final int[] anIntArray379 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[I")
	public static final int[] anIntArray380 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
	public static final int[] anIntArray381 = new int[anInt7604];

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public static int anInt7607 = 1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public static void method6424() {
		for (@Pc(14) Class6_Sub5_Sub9 local14 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local14 != null; local14 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
			if (Static262.method4632(local14.anInt3240)) {
				Static493.method7161(local14);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public static void method6425() {
		Static443.aClass5_12.xa(((float) Static87.aClass6_Sub33_6.aClass14_Sub19_1.method7099() * 0.1F + 0.7F) * Static299.aFloat127);
		Static443.aClass5_12.ZA(Static99.anInt2817, Static273.aFloat124, Static384.aFloat141, (float) (Static485.anInt8563 << 2), (float) (Static101.anInt3117 << 2), (float) (Static538.anInt9323 << 2));
		Static443.aClass5_12.method6138(Static70.aClass31_2);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public static void method6426() {
		Static434.method8405();
		@Pc(12) int local12 = Static87.aClass6_Sub33_6.lb.method6215();
		if (local12 == 2) {
			Static637.method8735(Static467.aClass5_13, Static277.anInt5899, Static294.anInt6026);
		} else if (local12 == 3) {
			Static616.method8468(Static294.anInt6026, Static580.anInt9867, Static467.aClass5_13, Static608.anInt10285, Static277.anInt5899);
		}
		if (Static87.aClass6_Sub33_6.lb.method6213()) {
			Static513.method7358(Static428.aCanvas12);
		}
		if (Static467.aClass5_13 != null) {
			Static537.method7608();
		}
		Static423.aBoolean622 = Static87.aClass6_Sub33_6.lb.method6215() != 0;
		Static238.aBoolean425 = Static87.aClass6_Sub33_6.lb.method6213();
	}
}
