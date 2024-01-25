import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[[Lclient!kp;")
	public static Class196[][] aClass196ArrayArray2;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
	public static int anInt6257 = -1;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
	public static int[] anIntArray430 = new int[1];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public static void method5188() {
		for (@Pc(3) int local3 = 0; local3 < Static416.anInt7186; local3++) {
			@Pc(9) int local9 = Static169.anIntArray198[local3];
			@Pc(16) Class2_Sub32 local16 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local9);
			if (local16 != null) {
				@Pc(21) Class6_Sub1_Sub1_Sub1_Sub1 local21 = local16.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static562.method7639(local21, local21.aClass86_1.anInt2152);
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)V")
	public static void method5191() {
		if (!Static164.method2883()) {
			return;
		}
		if (Static77.aStringArray189 == null) {
			Static286.method4247();
		}
		Static350.aBoolean498 = true;
		Static90.anInt1946 = 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)I")
	public static int method5192(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
	public static void method5193() {
		Static494.method6896(Static89.anInt8689);
	}
}
