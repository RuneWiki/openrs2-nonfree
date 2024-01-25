import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	public static int anInt4337;

	@OriginalMember(owner = "client!it", name = "E", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_116 = new Class363(45, 19);

	@OriginalMember(owner = "client!it", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[128][128];

	@OriginalMember(owner = "client!it", name = "K", descriptor = "I")
	public static int anInt4344 = -1;

	@OriginalMember(owner = "client!it", name = "L", descriptor = "I")
	public static int anInt4345 = 1;

	@OriginalMember(owner = "client!it", name = "M", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_74 = new Class286(76, 4);

	@OriginalMember(owner = "client!it", name = "N", descriptor = "I")
	public static int anInt4346 = -1;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V")
	public static void method3625() {
		Static268.aClass313_63.method6983();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)I")
	public static int method3626(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BIIIII)V")
	public static void method3627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static309.anInt5528 = arg4;
		Static204.anInt3987 = arg0;
		Static412.anInt568 = arg3;
		Static330.anInt6084 = arg2;
		Static285.anInt6373 = arg1;
		if (Static309.anInt5528 >= 100) {
			@Pc(22) int local22 = Static285.anInt6373 * 512 + 256;
			@Pc(28) int local28 = Static330.anInt6084 * 512 + 256;
			@Pc(37) int local37 = Static524.method7217(local22, Static566.anInt9278, local28) - Static412.anInt568;
			@Pc(42) int local42 = local22 - Static90.anInt1932;
			@Pc(46) int local46 = local37 - Static548.anInt8906;
			@Pc(51) int local51 = local28 - Static7.anInt337;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local42 * local42 + local51 * local51));
			Static323.anInt6015 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static177.anInt3712 = (int) (Math.atan2((double) local42, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static323.anInt6015 < 1024) {
				Static323.anInt6015 = 1024;
			}
			Static443.anInt7768 = 0;
			if (Static323.anInt6015 > 3072) {
				Static323.anInt6015 = 3072;
			}
		}
		Static94.anInt2006 = -1;
		Static238.anInt4482 = -1;
		Static311.anInt5570 = 2;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!pl;I)V")
	public static void method3628(@OriginalArg(0) Class259 arg0) {
		Static334.anInt6169 = arg0.method5961("hitmarks");
		Static556.anInt9127 = arg0.method5961("hitbar_default");
		Static217.anInt4149 = arg0.method5961("timerbar_default");
		Static35.anInt904 = arg0.method5961("headicons_pk");
		Static339.anInt2918 = arg0.method5961("headicons_prayer");
		Static377.anInt6693 = arg0.method5961("hint_headicons");
		Static154.anInt3073 = arg0.method5961("hint_mapmarkers");
		Static491.anInt5542 = arg0.method5961("mapflag");
		Static272.anInt4944 = arg0.method5961("cross");
		Static90.anInt1950 = arg0.method5961("mapdots");
		Static285.anInt6375 = arg0.method5961("scrollbar");
		Static124.anInt2401 = arg0.method5961("name_icons");
		Static422.anInt7224 = arg0.method5961("floorshadows");
		Static572.anInt9309 = arg0.method5961("compass");
		Static45.anInt1120 = arg0.method5961("otherlevel");
		Static349.anInt6280 = arg0.method5961("hint_mapedge");
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method3629(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static19.method380(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local37 >= local34);
			return Static509.method7071(arg1, local37);
		}
	}
}
