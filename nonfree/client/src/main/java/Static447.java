import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	public static int anInt7665;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
	public static int anInt7664 = 0;

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "[I")
	public static final int[] anIntArray614 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)V")
	public static void method6111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static304.anInt5637 != arg0) {
			Static231.anIntArray368 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static231.anIntArray368[local9] = (local9 << 12) / arg0;
			}
			Static279.anInt5254 = arg0 - 1;
			Static206.anInt4215 = arg0 * 32;
			Static304.anInt5637 = arg0;
		}
		if (arg1 == Static191.anInt3822) {
			return;
		}
		if (arg1 == Static304.anInt5637) {
			Static376.anIntArray531 = Static231.anIntArray368;
		} else {
			Static376.anIntArray531 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static376.anIntArray531[local9] = (local9 << 12) / arg1;
			}
		}
		Static191.anInt3822 = arg1;
		Static429.anInt7355 = arg1 - 1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!qa;JI)V")
	public static void method6112(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1) {
		Static103.anInt2184 = 0;
		Static321.anInt5400 = Static368.anInt6382;
		Static368.anInt6382 = 0;
		@Pc(14) long local14 = Static167.method2929();
		for (@Pc(19) Class71_Sub6 local19 = (Class71_Sub6) Static299.aClass273_2.method6246(); local19 != null; local19 = (Class71_Sub6) Static299.aClass273_2.method6249()) {
			if (local19.method5786(arg0, arg1)) {
				Static103.anInt2184++;
			}
		}
		if (Static336.aBoolean447 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static299.aClass273_2.method6245() + ", running: " + Static103.anInt2184 + ". Particles: " + Static368.anInt6382 + ". Time taken: " + (Static167.method2929() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)I")
	public static int method6113(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
