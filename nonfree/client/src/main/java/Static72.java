import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
	public static final boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public static int anInt1627 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method1358() {
		Static86.aClass154_29.method4212();
		Static51.aClass154_16.method4212();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public static void method1359() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Long local22 = (Long) local12.invoke(local16, (Object[]) null);
					Static161.anInt3644 = (int) (local22 / 1048576L) + 1;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public static void method1360() {
		if (Static315.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static23.anInt411;
		@Pc(10) int local10 = Static74.anInt1655;
		@Pc(18) int local18 = Static193.anInt4171 - local8 - Static202.anInt4258;
		@Pc(30) int local30 = Static135.anInt3077 - local10 - Static38.anInt832;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static350.aFrame3 == null) {
				local48 = Static212.aClass120_3.anApplet1;
			} else {
				local48 = Static350.aFrame3;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (local48 == Static350.aFrame3) {
				@Pc(63) Insets local63 = Static350.aFrame3.getInsets();
				local57 = local63.top;
				local55 = local63.left;
			}
			@Pc(72) Graphics local72 = local48.getGraphics();
			local72.setColor(Color.black);
			if (local8 > 0) {
				local72.fillRect(local55, local57, local8, Static135.anInt3077);
			}
			if (local10 > 0) {
				local72.fillRect(local55, local57, Static193.anInt4171, local10);
			}
			if (local18 > 0) {
				local72.fillRect(local55 + Static193.anInt4171 - local18, local57, local18, Static135.anInt3077);
			}
			if (local30 > 0) {
				local72.fillRect(local55, Static135.anInt3077 + local57 - local30, Static193.anInt4171, local30);
				return;
			}
		} catch (@Pc(126) Exception local126) {
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!lh;B)V")
	public static void method1361(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class120 arg1) {
		while (true) {
			@Pc(6) Class51 local6 = arg1.method3225(arg0);
			while (local6.anInt1229 == 0) {
				Static270.method5481(10L);
			}
			if (local6.anInt1229 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static270.method5481(100L);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZI)Lclient!mc;")
	public static Class49 method1362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg1 * 475427L ^ (long) arg3 * 97549L ^ (long) arg5 * 67481L ^ (long) arg0 * 986053L ^ (long) arg2 * 32147369L;
		@Pc(44) Class49 local44 = (Class49) Static165.aClass154_54.method4222(local33);
		if (local44 == null) {
			local44 = Static158.aClass92_6.method4448(arg5, arg3, arg1, arg0, arg2, arg4);
			Static165.aClass154_54.method4221(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!vm;Z)V")
	public static void method1363(@OriginalArg(0) Class92 arg0) {
		if (Static104.aBoolean594) {
			Static306.method5191(arg0);
		} else {
			Static149.method2880(arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z")
	public static boolean method1364() {
		@Pc(16) Class4_Sub18 local16 = (Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248;
		if (local16 == null || Static248.aClass130_112.aClass4_144 == local16) {
			return false;
		} else {
			if (local16.anInt2905 >= 2000) {
				local16.anInt2905 -= 2000;
			}
			return local16.anInt2905 == 1006;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg4;
		@Pc(20) int local20 = arg3 - arg4;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local24 << 1;
		@Pc(56) int local56 = local36 << 1;
		@Pc(60) int local60 = local32 << 1;
		@Pc(64) int local64 = arg3 << 1;
		@Pc(68) int local68 = local20 << 1;
		@Pc(77) int local77 = local48 + (1 - local64) * local24;
		@Pc(86) int local86 = local28 - local52 * (local64 - 1);
		@Pc(95) int local95 = local32 * (1 - local68) + local56;
		@Pc(104) int local104 = local36 - local60 * (local68 - 1);
		@Pc(108) int local108 = local24 << 2;
		@Pc(112) int local112 = local28 << 2;
		@Pc(116) int local116 = local32 << 2;
		@Pc(120) int local120 = local36 << 2;
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local52 * (local64 - 3);
		@Pc(134) int local134 = local56 * 3;
		@Pc(140) int local140 = (local68 - 3) * local60;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg3 - 1);
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = local116 * (local20 - 1);
		@Pc(160) int[] local160 = Static30.anIntArrayArray10[arg5];
		Static182.method3394(arg1 - arg6, local160, arg0, arg1 - local16);
		Static182.method3394(arg1 - local16, local160, arg2, arg1 + local16);
		Static182.method3394(arg1 + local16, local160, arg0, arg1 + arg6);
		while (local9 > 0) {
			@Pc(207) boolean local207 = local9 <= local20;
			if (local207) {
				if (local95 < 0) {
					while (local95 < 0) {
						local104 += local150;
						local95 += local134;
						local134 += local120;
						local150 += local120;
						local11++;
					}
				}
				if (local104 < 0) {
					local104 += local150;
					local95 += local134;
					local11++;
					local150 += local120;
					local134 += local120;
				}
				local95 += -local156;
				local104 += -local140;
				local156 -= local116;
				local140 -= local116;
			}
			if (local77 < 0) {
				while (local77 < 0) {
					local86 += local142;
					local77 += local124;
					local142 += local112;
					local124 += local112;
					local7++;
				}
			}
			if (local86 < 0) {
				local77 += local124;
				local86 += local142;
				local124 += local112;
				local7++;
				local142 += local112;
			}
			local86 += -local130;
			local77 += -local148;
			local9--;
			local148 -= local108;
			local130 -= local108;
			@Pc(341) int local341 = arg5 - local9;
			@Pc(346) int local346 = arg5 + local9;
			@Pc(351) int local351 = arg1 + local7;
			@Pc(356) int local356 = arg1 - local7;
			if (local207) {
				@Pc(362) int local362 = local11 + arg1;
				@Pc(366) int local366 = arg1 - local11;
				Static182.method3394(local356, Static30.anIntArrayArray10[local341], arg0, local366);
				Static182.method3394(local366, Static30.anIntArrayArray10[local341], arg2, local362);
				Static182.method3394(local362, Static30.anIntArrayArray10[local341], arg0, local351);
				Static182.method3394(local356, Static30.anIntArrayArray10[local346], arg0, local366);
				Static182.method3394(local366, Static30.anIntArrayArray10[local346], arg2, local362);
				Static182.method3394(local362, Static30.anIntArrayArray10[local346], arg0, local351);
			} else {
				Static182.method3394(local356, Static30.anIntArrayArray10[local341], arg0, local351);
				Static182.method3394(local356, Static30.anIntArrayArray10[local346], arg0, local351);
			}
		}
	}
}
