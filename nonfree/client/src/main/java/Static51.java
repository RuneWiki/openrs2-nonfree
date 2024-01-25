import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "J")
	public static long aLong29 = -1L;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_21 = new Class268(94, -1);

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
	public static int anInt935 = -1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIILclient!d;BLclient!ha;)V")
	public static void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(6) Class100 arg5) {
		if (Static433.anInt7858 < 100) {
			Static407.method5570(arg5, arg4);
		}
		arg5.KA(arg3, arg2, arg3 + arg1, arg2 + arg0);
		@Pc(38) int local38;
		@Pc(57) int local57;
		if (Static433.anInt7858 < 100) {
			local38 = arg1 / 2 + arg3;
			arg5.aa(arg3, arg2, arg1, arg0, -16777216, 0);
			local57 = arg0 / 2 + arg2 - 20 - 18;
			arg5.method8845(local38 - 152, local57, 304, 34, Static294.aColorArray2[Static406.anInt7525].getRGB(), 0);
			arg5.aa(local38 - 150, local57 + 2, Static433.anInt7858 * 3, 30, Static611.aColorArray3[Static406.anInt7525].getRGB(), 0);
			Static173.aClass50_5.method5734(local38, Static317.aClass192_18.method5299(Static307.anInt5931), -1, local57 + 20, Static138.aColorArray1[Static406.anInt7525].getRGB());
			return;
		}
		@Pc(115) int local115 = Static526.anInt9146 - (int) ((float) arg1 / Static487.aFloat144);
		local38 = Static78.anInt1658 + (int) ((float) arg0 / Static487.aFloat144);
		local57 = Static526.anInt9146 + (int) ((float) arg1 / Static487.aFloat144);
		Static72.anInt1516 = Static526.anInt9146 - (int) ((float) arg1 / Static487.aFloat144);
		Static122.anInt2384 = (int) ((float) (arg1 * 2) / Static487.aFloat144);
		Static284.anInt7920 = Static78.anInt1658 - (int) ((float) arg0 / Static487.aFloat144);
		Static354.anInt1505 = (int) ((float) (arg0 * 2) / Static487.aFloat144);
		@Pc(180) int local180 = Static78.anInt1658 - (int) ((float) arg0 / Static487.aFloat144);
		Static487.method6438(Static487.anInt7459 + local115, Static487.anInt7453 + local38, local57 + Static487.anInt7459, Static487.anInt7453 + local180, arg3, arg2, arg3 + arg1, arg2 + 1 + arg0);
		Static487.method6434(arg5);
		@Pc(209) Class8 local209 = Static487.method6439(arg5);
		Static98.method1585(arg5, local209);
		if (Static344.anInt6482 > 0) {
			Static243.anInt4836--;
			if (Static243.anInt4836 == 0) {
				Static243.anInt4836 = 20;
				Static344.anInt6482--;
			}
		}
		if (!Static403.aBoolean505) {
			return;
		}
		@Pc(242) int local242 = arg1 + arg3 - 5;
		@Pc(248) int local248 = arg0 + arg2 - 8;
		Static43.aClass50_2.method5735(local242, "Fps:" + Static340.anInt6735, -1, 16776960, local248);
		@Pc(263) int local263 = local248 - 15;
		@Pc(265) Runtime local265 = Runtime.getRuntime();
		@Pc(274) int local274 = (int) ((local265.totalMemory() - local265.freeMemory()) / 1024L);
		@Pc(276) int local276 = 16776960;
		if (local274 > 65536) {
			local276 = 16711680;
		}
		Static43.aClass50_2.method5735(local242, "Mem:" + local274 + "k", -1, local276, local263);
		local248 = local263 - 15;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	public static void method884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(88) Class97 local88 = Static272.aClass97ArrayArrayArray3[arg0][arg3][arg1];
			if (local88 != null) {
				if (arg2 == 1) {
					local88.aShort41 = 0;
				} else if (arg2 == 2) {
					local88.aShort42 = 0;
				}
			}
			Static296.method5101();
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static572.anInt9600; local19++) {
			@Pc(25) Class226 local25 = Static65.aClass226Array1[local19];
			if (arg2 == local25.aByte79 && local25.aShort77 == arg3 && local25.aShort79 == arg1 || arg3 == local25.aShort80 && local25.aShort79 == arg1) {
				if (Static572.anInt9600 != local19) {
					Static655.method5831(Static65.aClass226Array1, local19 + 1, Static65.aClass226Array1, local19, Static65.aClass226Array1.length - local19 - 1);
				}
				Static572.anInt9600--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I")
	public static int method885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
