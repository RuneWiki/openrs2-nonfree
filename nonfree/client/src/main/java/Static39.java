import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[Lclient!om;")
	public static final Class4_Sub1_Sub16[] aClass4_Sub1_Sub16Array2 = new Class4_Sub1_Sub16[14];

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
	public static final int[] anIntArray105 = new int[250];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIIII)V")
	public static void method732(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static159.aLong121 = 0;
		@Pc(9) int local9 = Static11.method265();
		if (arg3 == 3 || local9 == 3) {
			arg0 = true;
		}
		if (!Static164.aClass92_7.method4492()) {
			arg0 = true;
		}
		Static78.method1413(arg2, arg3, arg1, local9, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static266.method4641(arg0)) {
			Static211.method3686(Static158.aClass72ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public static int method735(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method736() {
		for (@Pc(18) Class4_Sub26 local18 = (Class4_Sub26) Static332.aClass130_149.method3499(); local18 != null; local18 = (Class4_Sub26) Static332.aClass130_149.method3512()) {
			if (local18.anInt3643 == -1) {
				local18.anInt3642 = 0;
				Static27.method480(local18);
			} else {
				local18.method5667();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
	public static int method739() {
		return 2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)V")
	public static void method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (Static124.anInt3576 != arg0) {
			Static149.anIntArray298 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static149.anIntArray298[local17] = (local17 << 12) / arg0;
			}
			Static124.anInt3576 = arg0;
			Static241.anInt5028 = arg0 * 32;
			Static350.anInt6802 = arg0 - 1;
		}
		if (arg1 == Static331.anInt6571) {
			return;
		}
		if (Static124.anInt3576 == arg1) {
			Static64.anIntArray148 = Static149.anIntArray298;
		} else {
			Static64.anIntArray148 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static64.anIntArray148[local17] = (local17 << 12) / arg1;
			}
		}
		Static59.anInt1278 = arg1 - 1;
		Static331.anInt6571 = arg1;
	}
}
