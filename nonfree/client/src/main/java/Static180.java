import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "Lclient!he;")
	public static Class39 aClass39_4;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1323 = Static161.method2452("Use");

	@OriginalMember(owner = "client!sj", name = "db", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1324 = aClass20_1323;

	@OriginalMember(owner = "client!sj", name = "mb", descriptor = "I")
	public static int anInt3609 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)I")
	public static int method2718(@OriginalArg(0) int arg0) {
		if (Static140.anInt2923 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!dc;Lclient!dc;Lclient!wa;I)[Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1[] method2721(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class23 arg2) {
		@Pc(9) int local9 = arg2.method734(arg0);
		@Pc(15) int local15 = arg2.method737(arg1, local9);
		return Static59.method1007(local15, local9, arg2);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	public static void method2722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class5_Sub3 local28 = Static157.aClass5_Sub3ArrayArrayArray2[local9][arg0][arg1] = Static157.aClass5_Sub3ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt338--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt333; local38++) {
					@Pc(44) Class43 local44 = local28.aClass43Array1[local38];
					if ((local44.aLong102 >> 29 & 0x3L) == 2L && local44.anInt1811 == arg0 && local44.anInt1816 == arg1) {
						local44.anInt1809--;
					}
				}
			}
		}
		if (Static157.aClass5_Sub3ArrayArrayArray2[0][arg0][arg1] == null) {
			Static157.aClass5_Sub3ArrayArrayArray2[0][arg0][arg1] = new Class5_Sub3(0, arg0, arg1);
		}
		Static157.aClass5_Sub3ArrayArrayArray2[0][arg0][arg1].aClass5_Sub3_1 = local7;
		Static157.aClass5_Sub3ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	public static void method2725() {
		Static53.method920(Static101.anInt2163, Static90.anInt1933, Static130.anInt2715);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)I")
	public static int method2727(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
