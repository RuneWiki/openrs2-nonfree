import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	public static int anInt5364;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([[IB)V")
	public static void method4372(@OriginalArg(0) int[][] arg0) {
		Static220.anIntArrayArray36 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)I")
	public static int method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIIII)V")
	public static void method4376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
		Static110.aClass4_Sub10_Sub1_1.method4618(20);
		Static110.aClass4_Sub10_Sub1_1.method4618(arg3);
		Static110.aClass4_Sub10_Sub1_1.method4618(arg2);
		Static110.aClass4_Sub10_Sub1_1.method4668(arg0);
		Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		Static60.anInt1213 = 0;
		Static250.anInt4760 = 1;
		Static268.anInt5174 = -3;
		Static166.anInt3409 = 0;
	}
}
