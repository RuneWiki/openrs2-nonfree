import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!up", name = "G", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_104 = new Class177(36, 4);

	@OriginalMember(owner = "client!up", name = "J", descriptor = "[I")
	public static final int[] anIntArray701 = new int[1024];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([Lclient!o;I)V")
	public static void method5631(@OriginalArg(0) Class137[] arg0) {
		Static105.anInt2415 = arg0.length;
		Static154.aClass137Array6 = new Class137[Static105.anInt2415 + 10];
		Static461.anIntArray726 = new int[Static105.anInt2415 + 10];
		Static469.method6019(arg0, 0, Static154.aClass137Array6, 0, Static105.anInt2415);
		for (@Pc(28) int local28 = 0; local28 < Static105.anInt2415; local28++) {
			Static461.anIntArray726[local28] = Static154.aClass137Array6[local28].Q();
		}
		for (@Pc(42) int local42 = Static105.anInt2415; local42 < Static154.aClass137Array6.length; local42++) {
			Static461.anIntArray726[local42] = 12;
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)V")
	public static void method5632() {
		Static32.method677(Static434.aClass177_106);
		Static433.aClass1_Sub3_Sub1_11.method1208(0);
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(B)V")
	public static void method5633() {
		Static277.aClass203_41 = new Class203();
	}
}
