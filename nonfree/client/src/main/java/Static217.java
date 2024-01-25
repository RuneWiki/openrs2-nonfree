import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "Lclient!wk;")
	public static Class214 aClass214_2;

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	public static int anInt4438 = 0;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public static int anInt4440 = -1;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	public static int anInt4442 = 99;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method3895() {
		Static59.method899((long) Static293.anInt5807, Static107.aClass129_4);
		if (Static270.anInt5491 != -1) {
			Static37.method551(Static270.anInt5491);
		}
		for (@Pc(19) int local19 = 0; local19 < Static280.anInt219; local19++) {
			if (Static292.aBooleanArray22[local19]) {
				Static18.aBooleanArray1[local19] = true;
			}
			Static83.aBooleanArray8[local19] = Static292.aBooleanArray22[local19];
			Static292.aBooleanArray22[local19] = false;
		}
		Static62.anInt1150 = Static293.anInt5807;
		if (Static107.aClass129_4.method4927()) {
			Static261.aBoolean349 = true;
		}
		if (Static270.anInt5491 != -1) {
			Static280.anInt219 = 0;
			Static22.method311();
		}
		Static107.aClass129_4.method4966();
		Static63.method928(Static294.anInt5815);
		Static244.anInt4932 = 0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
	public static int method3914(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg4;
			arg4 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg5;
		} else {
			return 7 + 1 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
	public static void method3920() {
		if (Static245.anInt6561 == 10 || Static245.anInt6561 == 28) {
			Static218.method2524(Static316.anInt6169 >> 10, Static190.anInt3870 >> 10);
		} else {
			Static218.method2524(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] >> 3, Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] >> 3);
		}
		Static196.method3568();
		Static66.method1705();
		Static53.method801();
		Static69.method1038();
	}
}
