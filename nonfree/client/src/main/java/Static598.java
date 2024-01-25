import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "J")
	public static long aLong272;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_42 = new Class125(16);

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Lclient!av;")
	public static final Class27 aClass27_17 = new Class27(4, 7);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBIII)V")
	public static void method8461(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static410.anInt7068 = 0;
		Static468.anInt7895 = 0;
		Static382.anInt6719 = arg1;
		Static281.anInt5188 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z")
	public static boolean method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)V")
	public static void method8463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (arg1 != Static613.anInt10114) {
			Static588.anIntArray506 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static588.anIntArray506[local22] = (local22 << 12) / arg1;
			}
			Static677.anInt11036 = arg1 - 1;
			Static246.anInt4676 = arg1 * 32;
			Static613.anInt10114 = arg1;
		}
		if (arg0 == Static497.anInt8633) {
			return;
		}
		if (arg0 == Static613.anInt10114) {
			Static655.anIntArray573 = Static588.anIntArray506;
		} else {
			Static655.anIntArray573 = new int[arg0];
			for (local22 = 0; local22 < arg0; local22++) {
				Static655.anIntArray573[local22] = (local22 << 12) / arg0;
			}
		}
		Static660.anInt6757 = arg0 - 1;
		Static497.anInt8633 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
	public static void method8465(@OriginalArg(1) int arg0) {
		if (Static625.anInt11174 == 0) {
			Static472.aClass14_Sub1_Sub3_3.method1890(arg0);
		} else {
			Static210.anInt3677 = arg0;
		}
	}
}
