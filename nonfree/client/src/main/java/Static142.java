import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array9;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public static int anInt2751;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "[I")
	public static int[] anIntArray123 = new int[2];

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	public static void method2416() {
		for (@Pc(3) int local3 = 0; local3 < Static366.aClass130ArrayArray1.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static366.aClass130ArrayArray1[local3].length; local9++) {
				Static366.aClass130ArrayArray1[local3][local9] = Static485.aClass130_1;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BFFF)I")
	public static int method2418(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local12 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method2419() {
		for (@Pc(11) int local11 = 0; local11 < Static439.anInt8379; local11++) {
			@Pc(17) Class239 local17 = Static73.aClass239Array1[local11];
			if (local17.aByte87 == 3) {
				if (local17.aClass1_Sub6_Sub4_4 == null) {
					local17.anInt6459 = Integer.MIN_VALUE;
				} else {
					Static425.aClass1_Sub6_Sub3_2.method6532(local17.aClass1_Sub6_Sub4_4);
				}
			}
		}
	}
}
