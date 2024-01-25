import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public static int anInt7752;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
	public static int[] anIntArray635;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray189 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
	public static volatile long aLong400 = 0L;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I")
	public static int method6255(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method6257(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		Static241.aClass22Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public static void method6259() {
		for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) Static463.aClass181_52.method3972(); local6 != null; local6 = (Class2_Sub3) Static463.aClass181_52.method3975()) {
			if (local6.aBoolean15) {
				local6.method337();
			}
		}
		for (@Pc(37) Class2_Sub3 local37 = (Class2_Sub3) Static294.aClass181_27.method3972(); local37 != null; local37 = (Class2_Sub3) Static294.aClass181_27.method3975()) {
			if (local37.aBoolean15) {
				local37.method337();
			}
		}
	}
}
