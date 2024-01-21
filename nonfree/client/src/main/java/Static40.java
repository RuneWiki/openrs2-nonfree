import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "ic", descriptor = "Lclient!pd;")
	public static Class20 aClass20_24;

	@OriginalMember(owner = "client!ga", name = "cc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_576 = Static28.method504("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ga", name = "Vb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_574 = aClass39_576;

	@OriginalMember(owner = "client!ga", name = "Yb", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!ga", name = "bc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_575 = Static28.method504("Location");

	@OriginalMember(owner = "client!ga", name = "fc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_577 = Static28.method504("p11_full");

	@OriginalMember(owner = "client!ga", name = "gc", descriptor = "[I")
	public static int[] anIntArray107 = new int[5];

	@OriginalMember(owner = "client!ga", name = "hc", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!ga", name = "jc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_578 = aClass39_575;

	@OriginalMember(owner = "client!ga", name = "kc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_579 = Static28.method504("<)4col>");

	@OriginalMember(owner = "client!ga", name = "lc", descriptor = "I")
	public static int anInt998 = 0;

	@OriginalMember(owner = "client!ga", name = "pc", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIB)Lclient!ja;")
	public static Class39 method669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) int local7 = 1;
		for (@Pc(21) int local21 = arg0 / 10; local21 != 0; local21 /= 10) {
			local7++;
		}
		@Pc(37) int local37 = local7;
		if (arg0 < 0 || arg1) {
			local37 = local7 + 1;
		}
		@Pc(45) byte[] local45 = new byte[local37];
		if (arg0 < 0) {
			local45[0] = 45;
		} else if (arg1) {
			local45[0] = 43;
		}
		for (@Pc(61) int local61 = 0; local61 < local7; local61++) {
			@Pc(67) int local67 = arg0 % 10;
			arg0 /= 10;
			if (local67 < 0) {
				local67 = -local67;
			}
			if (local67 > 9) {
				local67 += 39;
			}
			local45[local37 - local61 - 1] = (byte) (local67 + 48);
		}
		@Pc(106) Class39 local106 = new Class39();
		local106.anInt1481 = local37;
		local106.aByteArray10 = local45;
		return local106;
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)V")
	public static void method670() {
		aClass39_576 = null;
		aClass39_577 = null;
		aClass39_578 = null;
		aClass20_24 = null;
		anIntArray107 = null;
		aClass39_574 = null;
		aClass39_579 = null;
		aClass39_575 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method671() {
		for (@Pc(6) Class4_Sub2_Sub1_Sub3 local6 = (Class4_Sub2_Sub1_Sub3) Static114.aClass61_13.method1628(); local6 != null; local6 = (Class4_Sub2_Sub1_Sub3) Static114.aClass61_13.method1629()) {
			if (local6.anInt1107 != Static131.anInt3202 || Static71.anInt1738 > local6.anInt1114) {
				local6.method2189();
			} else if (Static71.anInt1738 >= local6.anInt1106) {
				if (local6.anInt1110 > 0) {
					@Pc(43) Class4_Sub2_Sub1_Sub1_Sub2 local43 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local6.anInt1110 - 1];
					if (local43 != null && local43.anInt2643 >= 0 && local43.anInt2643 < 13312 && local43.anInt2641 >= 0 && local43.anInt2641 < 13312) {
						local6.method735(Static71.anInt1738, local43.anInt2643, Static94.method1708(local43.anInt2643, local43.anInt2641, local6.anInt1107) - local6.anInt1115, local43.anInt2641);
					}
				}
				if (local6.anInt1110 < 0) {
					@Pc(92) int local92 = -local6.anInt1110 - 1;
					@Pc(103) Class4_Sub2_Sub1_Sub1_Sub1 local103;
					if (Static30.anInt783 == local92) {
						local103 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1;
					} else {
						local103 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local92];
					}
					if (local103 != null && local103.anInt2643 >= 0 && local103.anInt2643 < 13312 && local103.anInt2641 >= 0 && local103.anInt2641 < 13312) {
						local6.method735(Static71.anInt1738, local103.anInt2643, Static94.method1708(local103.anInt2643, local103.anInt2641, local6.anInt1107) - local6.anInt1115, local103.anInt2641);
					}
				}
				local6.method737(Static39.anInt952);
				Static101.aClass43_1.method1105(Static131.anInt3202, (int) local6.aDouble4, (int) local6.aDouble3, (int) local6.aDouble2, 60, local6, local6.anInt1105, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!ja;Lclient!ja;)V")
	public static void method672(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class39 arg2) {
		Static85.method1521(arg2, null, arg0, arg1);
	}
}
