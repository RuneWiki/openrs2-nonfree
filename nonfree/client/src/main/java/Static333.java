import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "Z")
	public static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "Lclient!ak;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "[I")
	public static int[] anIntArray408 = new int[1];

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "Lclient!mja;")
	public static Class234 aClass234_5 = null;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIII)V")
	public static void method4592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static55.anInt1260 = arg2;
		Static402.anInt5849 = arg3;
		Static58.anInt1276 = arg4;
		Static260.anInt8169 = arg1;
		Static608.anInt9348 = arg0;
		if (Static608.anInt9348 >= 100) {
			@Pc(29) int local29 = Static260.anInt8169 * 512 + 256;
			@Pc(35) int local35 = Static402.anInt5849 * 512 + 256;
			@Pc(43) int local43 = Static674.method8951(Static296.anInt4684, local35, local29) - Static58.anInt1276;
			@Pc(47) int local47 = local29 - Static611.anInt9382;
			@Pc(52) int local52 = local43 - Static618.anInt9710;
			@Pc(57) int local57 = local35 - Static652.anInt10283;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local47 * local47));
			Static383.anInt9871 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static226.anInt3586 = (int) (Math.atan2((double) local47, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			Static571.anInt8879 = 0;
			if (Static383.anInt9871 < 1024) {
				Static383.anInt9871 = 1024;
			}
			if (Static383.anInt9871 > 3072) {
				Static383.anInt9871 = 3072;
			}
		}
		Static286.anInt4563 = -1;
		Static77.anInt1632 = -1;
		Static259.anInt4200 = 2;
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(III)Z")
	public static boolean method4594(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)V")
	public static void method4595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static81.anInt1716;
		@Pc(7) int local7 = Static400.anInt5823;
		if (Static423.aBoolean517) {
			local5 += Static383.method8455();
			local7 += Static286.method4120();
		}
		@Pc(33) Class17 local33;
		if (Static645.anInt10146 == 1) {
			local33 = Static300.aClass17Array9[Static23.anInt506 / 100];
			local33.method5246(local5 - 8, local7 + -8);
			Static100.method2025(local7 - 8, local33.method5256() + local5 - 8, local5 - 8, local7 + -8 - -local33.method5251());
		}
		if (Static645.anInt10146 == 2) {
			local33 = Static300.aClass17Array9[Static23.anInt506 / 100 + 4];
			local33.method5246(local5 - 8, local7 + -8);
			Static100.method2025(local7 - 8, local5 + -8 - -local33.method5256(), local5 - 8, local7 - 8 - -local33.method5251());
		}
		Static413.method5201();
	}
}
