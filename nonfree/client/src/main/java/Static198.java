import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "[J")
	public static long[] aLongArray10;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "Lclient!in;")
	public static final Class169 aClass169_103 = new Class169(119, 4);

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "Lclient!in;")
	public static final Class169 aClass169_104 = new Class169(126, 0);

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lclient!in;")
	public static final Class169 aClass169_105 = new Class169(14, 2);

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_9 = new Class148(3, 2);

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	public static int anInt4183 = -1;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!of;)Lclient!of;")
	public static Class2_Sub26_Sub3 method3806(@OriginalArg(1) Class2_Sub26_Sub3 arg0) {
		@Pc(14) Class2_Sub26_Sub3 local14 = arg0 == null ? new Class2_Sub26_Sub3() : new Class2_Sub26_Sub3(arg0);
		local14.method6977();
		return local14;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)V")
	public static void method3807(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static62.anInt1184 - Static438.anInt7963;
		if (local8 >= 100) {
			Static484.anInt8685 = 1;
			Static533.anInt9359 = -1;
			Static5.anInt83 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static320.aFloat118;
		if (local21 < Static612.anInt10754 >> 8) {
			local21 = Static612.anInt10754 >> 8;
		}
		if (Static488.aBooleanArray50[4] && local21 < Static103.anIntArray95[4] + 128) {
			local21 = Static103.anIntArray95[4] + 128;
		}
		@Pc(59) int local59 = (int) Static278.aFloat108 + Static25.anInt454 & 0x3FFF;
		Static217.method4043((local21 >> 3) * 3 + 600 << 2, local59, Static10.method154(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022, Static547.anInt9550) - 200, local21, Static461.anInt8253, arg0, Static386.anInt7301);
		@Pc(113) float local113 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static108.anInt1987 = (int) ((float) Static57.anInt1113 + (float) (Static108.anInt1987 - Static57.anInt1113) * local113);
		Static598.anInt10387 = (int) ((float) Static533.anInt9351 + local113 * (float) (Static598.anInt10387 - Static533.anInt9351));
		Static550.anInt9633 = (int) ((float) (Static550.anInt9633 - Static56.anInt1100) * local113 + (float) Static56.anInt1100);
		Static229.anInt4615 = (int) ((float) (Static229.anInt4615 - Static410.anInt7653) * local113 + (float) Static410.anInt7653);
		@Pc(165) int local165 = Static152.anInt3290 - Static97.anInt1731;
		if (local165 > 8192) {
			local165 -= 16384;
		} else if (local165 < -8192) {
			local165 += 16384;
		}
		Static152.anInt3290 = (int) ((float) Static97.anInt1731 + local113 * (float) local165);
		Static152.anInt3290 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)I")
	public static int method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg0 < arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}
}
