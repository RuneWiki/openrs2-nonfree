import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!pd;")
	public static Class20 aClass20_52;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array19;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
	public static int[] anIntArray283 = new int[5];

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1331 = Static28.method504("Loaded title screen");

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1329 = aClass39_1331;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1330 = Static28.method504("Ok");

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1332 = Static28.method504("Could not complete login)3");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1333 = Static28.method504("Untersuchen");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1334 = aClass39_1332;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array20 = new Class39[100];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public static int anInt2562 = 0;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1335 = Static28.method504("p12_full");

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1336 = aClass39_1330;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ja;IZ)V")
	public static void method1845(@OriginalArg(0) Class39 arg0, @OriginalArg(2) boolean arg1) {
		Static17.method1682(6, 6, 200, 30, 0);
		Static17.method1683(6, 6, 200, 30, 16777215);
		Static71.aClass4_Sub2_Sub3_Sub3_4.method1261(arg0, 6, 6, 200, 30, 16777215, -1, 1, 1, 0);
		Static1.method6(6, 200, 6, 30);
		if (!arg1) {
			Static36.method595(6, 6, 200, 30);
			return;
		}
		try {
			@Pc(57) Graphics local57 = Static8.aCanvas1.getGraphics();
			Static91.aClass6_1.method531(local57);
		} catch (@Pc(65) Exception local65) {
			Static8.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)I")
	public static int method1846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub13 local12 = (Class4_Sub13) Static49.aClass42_7.method1055((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray205.length; local30++) {
				if (local12.anIntArray204[local30] == arg0) {
					local23 += local12.anIntArray205[local30];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1847() {
		anIntArray283 = null;
		aClass39Array19 = null;
		aClass39Array20 = null;
		aClass39_1329 = null;
		aClass39_1333 = null;
		aClass39_1331 = null;
		aClass39_1334 = null;
		aClass39_1332 = null;
		aClass39_1330 = null;
		aClass39_1336 = null;
		aClass20_52 = null;
		aClass39_1335 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III[I[Lclient!ub;I)V")
	public static void method1848(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class76[] arg4) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(19) int local19 = arg2 - 1;
		@Pc(23) int local23 = arg1 + 1;
		@Pc(29) int local29 = (arg1 + arg2) / 2;
		@Pc(33) Class76 local33 = arg4[local29];
		arg4[local29] = arg4[arg2];
		arg4[arg2] = local33;
		while (local19 < local23) {
			@Pc(47) boolean local47 = true;
			@Pc(50) int local50;
			@Pc(69) int local69;
			@Pc(72) int local72;
			do {
				local23--;
				for (local50 = 0; local50 < 4; local50++) {
					if (arg3[local50] == 2) {
						local72 = local33.anInt2950;
						local69 = arg4[local23].anInt2950;
					} else if (arg3[local50] == 1) {
						local69 = arg4[local23].anInt2948;
						local72 = local33.anInt2948;
						if (local69 == -1 && arg0[local50] == 1) {
							local69 = 2001;
						}
						if (local72 == -1 && arg0[local50] == 1) {
							local72 = 2001;
						}
					} else if (arg3[local50] == 3) {
						local69 = arg4[local23].aBoolean145 ? 1 : 0;
						local72 = local33.aBoolean145 ? 1 : 0;
					} else {
						local69 = arg4[local23].anInt2951;
						local72 = local33.anInt2951;
					}
					if (local69 != local72) {
						if ((arg0[local50] != 1 || local69 <= local72) && (arg0[local50] != 0 || local69 >= local72)) {
							local47 = false;
						}
						break;
					}
					if (local50 == 3) {
						local47 = false;
					}
				}
			} while (local47);
			local47 = true;
			do {
				local19++;
				for (local50 = 0; local50 < 4; local50++) {
					if (arg3[local50] == 2) {
						local72 = local33.anInt2950;
						local69 = arg4[local19].anInt2950;
					} else if (arg3[local50] == 1) {
						local72 = local33.anInt2948;
						local69 = arg4[local19].anInt2948;
						if (local69 == -1 && arg0[local50] == 1) {
							local69 = 2001;
						}
						if (local72 == -1 && arg0[local50] == 1) {
							local72 = 2001;
						}
					} else if (arg3[local50] == 3) {
						local69 = arg4[local19].aBoolean145 ? 1 : 0;
						local72 = local33.aBoolean145 ? 1 : 0;
					} else {
						local72 = local33.anInt2951;
						local69 = arg4[local19].anInt2951;
					}
					if (local72 != local69) {
						if ((arg0[local50] != 1 || local69 >= local72) && (arg0[local50] != 0 || local69 <= local72)) {
							local47 = false;
						}
						break;
					}
					if (local50 == 3) {
						local47 = false;
					}
				}
			} while (local47);
			if (local19 < local23) {
				@Pc(340) Class76 local340 = arg4[local19];
				arg4[local19] = arg4[local23];
				arg4[local23] = local340;
			}
		}
		method1848(arg0, local23, arg2, arg3, arg4);
		method1848(arg0, arg1, local23 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method1849(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub13 local8 = (Class4_Sub13) Static49.aClass42_7.method1055((long) arg0);
		if (local8 != null) {
			for (@Pc(17) int local17 = 0; local17 < local8.anIntArray204.length; local17++) {
				local8.anIntArray204[local17] = -1;
				local8.anIntArray205[local17] = 0;
			}
		}
	}
}
