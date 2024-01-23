import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!lb;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1068(@OriginalArg(0) String arg0) {
		if (Static254.aClass151_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static254.aClass151_2.anInt5555; local21++) {
			if (Static185.method3140(Static48.method983(Static254.aClass151_2.aStringArray39[local21], " ", "<br>"), arg0)) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!hc;Lclient!hc;I)V")
	public static void method1069(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		Static187.aClass51_60 = arg0;
		Static110.aClass51_37 = arg1;
		@Pc(21) int local21 = (int) (Math.random() * 21.0D) - 10;
		Static187.aClass51_60.method1875(34);
		@Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
		Static28.anInt888 = local40 + local10;
		Static264.anInt5542 = local40 + local21;
		@Pc(55) int local55 = (int) (Math.random() * 21.0D) - 10;
		Static149.anInt3578 = local40 + local55;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILclient!ke;ILclient!se;)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class122 arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(14) int local14 = (int) Static230.aFloat51 + Static83.anInt2232 & 0x7FF;
		@Pc(22) int local22 = arg2 * arg2 + arg0 * arg0;
		@Pc(34) int local34 = Math.max(arg5.anInt4695 / 2, arg5.anInt4726 / 2) + 10;
		if (local34 * local34 < local22) {
			return;
		}
		@Pc(55) int local55 = Class132.anIntArray440[local14];
		@Pc(63) int local63 = local55 * 256 / (Static44.anInt1333 + 256);
		@Pc(67) int local67 = Class132.anIntArray439[local14];
		@Pc(75) int local75 = local67 * 256 / (Static44.anInt1333 + 256);
		@Pc(85) int local85 = arg0 * local75 + local63 * arg2 >> 16;
		@Pc(95) int local95 = local75 * arg2 - arg0 * local63 >> 16;
		((Class1_Sub2_Sub4_Sub1) arg3).method902(arg5.anInt4695 / 2 + arg1 + local85 - arg3.anInt1289 / 2, -local95 + arg5.anInt4726 / 2 + arg4 + -(arg3.anInt1280 / 2), arg5.anIntArray378, arg5.anIntArray372);
	}
}
