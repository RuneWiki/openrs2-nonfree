import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!p;")
	public static Class45 aClass45_4;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
	public static int anInt135;

	@OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 5)
	public static void method83(@OriginalArg(1) Graphics arg0) {
		Static56.aClass45_23.method1474(arg0, 17, 357);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)I", line = 38)
	public static int method84(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static99.method1655(4, arg1 + 45365, arg0 + 91923) + (Static99.method1655(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static99.method1655(1, arg1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ud;Lclient!o;BLclient!o;)[Lclient!qb;", line = 72)
	public static Class2_Sub2_Sub2_Sub3[] method85(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(9) int local9 = arg0.method80(arg1);
		@Pc(15) int local15 = arg0.method72(arg2, local9);
		return Static7.method194(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ge;I)V", line = 87)
	public static void method86(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.anInt823 == 0) {
			local6 = Static85.aClass55_1.method1459(arg0.anInt817, arg0.anInt818, arg0.anInt821);
		}
		if (arg0.anInt823 == 1) {
			local6 = Static85.aClass55_1.method1419(arg0.anInt817, arg0.anInt818, arg0.anInt821);
		}
		@Pc(40) int local40 = -1;
		if (arg0.anInt823 == 2) {
			local6 = Static85.aClass55_1.method1429(arg0.anInt817, arg0.anInt818, arg0.anInt821);
		}
		@Pc(55) int local55 = 0;
		if (arg0.anInt823 == 3) {
			local6 = Static85.aClass55_1.method1458(arg0.anInt817, arg0.anInt818, arg0.anInt821);
		}
		@Pc(70) int local70 = 0;
		if (local6 != 0) {
			local40 = local6 >> 14 & 0x7FFF;
			@Pc(88) int local88 = Static85.aClass55_1.method1449(arg0.anInt817, arg0.anInt818, arg0.anInt821, local6);
			local70 = local88 >> 6 & 0x3;
			local55 = local88 & 0x1F;
		}
		arg0.anInt820 = local40;
		arg0.anInt825 = local70;
		arg0.anInt830 = local55;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)I", line = 369)
	public static int method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & (local16 * local16 * 15731 + 789221) * local16 + 1376312589;
		return local30 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mc;Lclient!o;I)Lclient!o;", line = 385)
	public static Class40 method94(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) Class40 arg1) {
		if (arg1.method1200(Class32.aClass40_430) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method1200(Class42.aClass40_525);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method1200(Class12_Sub2.aClass40_344);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method1200(Applet_Sub1.aClass40_102);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method1200(Class60.aClass40_681);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method1200(Class2_Sub11.aClass40_495);
											if (local13 == -1) {
												return arg1;
											}
											arg1 = Static72.method1334(new Class40[] { arg1.method1180(local13, 0), Static92.method1581(Static99.method1660(4, arg0)), arg1.method1185(local13 + 2) });
										}
									}
									arg1 = Static72.method1334(new Class40[] { arg1.method1180(local13, 0), Static92.method1581(Static99.method1660(3, arg0)), arg1.method1185(local13 + 2) });
								}
							}
							arg1 = Static72.method1334(new Class40[] { arg1.method1180(local13, 0), Static92.method1581(Static99.method1660(2, arg0)), arg1.method1185(local13 + 2) });
						}
					}
					arg1 = Static72.method1334(new Class40[] { arg1.method1180(local13, 0), Static92.method1581(Static99.method1660(1, arg0)), arg1.method1185(local13 + 2) });
				}
			}
			arg1 = Static72.method1334(new Class40[] { arg1.method1180(local13, 0), Static92.method1581(Static99.method1660(0, arg0)), arg1.method1185(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 563)
	public static void method96() {
		aClass45_4 = null;
		anIntArray17 = null;
		Class5_Sub1.aClass40_30 = null;
		Class5_Sub1.aClass40_29 = null;
	}
}
