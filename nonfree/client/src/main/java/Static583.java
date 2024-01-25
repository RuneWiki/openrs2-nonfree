import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	public static int anInt9804;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "I")
	public static int anInt9806;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	public static int anInt9799 = 0;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)V")
	public static void method8429(@OriginalArg(0) boolean arg0) {
		if (Static495.aClass170_2 != null) {
			Static495.aClass170_2.method8119();
			Static495.aClass170_2 = null;
		}
		Static548.anInt9248 = 0;
		Static573.method2148();
		Static202.method3545();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static322.aClass352Array1[local19].method8347();
		}
		Static232.method3875(false);
		System.gc();
		Static630.method8907();
		Static407.anInt7117 = -1;
		Static327.aBoolean403 = false;
		Static283.method4494();
		Static155.method1875(true);
		Static233.anInt4295 = 0;
		Static613.anInt10268 = 0;
		Static565.anInt9560 = 0;
		Static567.anInt9589 = 0;
		Static412.anInt7175 = 0;
		Static268.anInt4809 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static82.aClass154Array1.length; local60++) {
			Static82.aClass154Array1[local60] = null;
		}
		Static340.method5108();
		for (@Pc(79) int local79 = 0; local79 < 2048; local79++) {
			Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local79] = null;
		}
		Static280.anInt4989 = 0;
		Static445.aClass273_29.method6586();
		Static235.anInt4322 = 0;
		Static440.aClass273_28.method6586();
		Static236.method3917();
		Static621.anInt10361 = 0;
		Static301.aClass59_1.method1310();
		Static615.method8778();
		Static288.method4540();
		Static530.aLong253 = 0L;
		Static21.aClass5_Sub19_1 = null;
		if (arg0) {
			Static358.method5312(12);
			return;
		}
		Static358.method5312(3);
		try {
			Static653.method5177(Static7.anApplet1, "loggedout");
		} catch (@Pc(134) Throwable local134) {
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	public static void method8431() {
		Static9.aClass133_1.method7269(Static182.aClass113_3);
		Static9.aClass133_1.DA(Static440.anInt7532, Static18.anInt266, Static239.anInt4420, Static42.anInt934);
	}
}
