import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!ss;")
	public static Class205 aClass205_2;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray10 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!hu;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!la;II)Lclient!td;")
	public static Class24 method2506(@OriginalArg(0) Class196 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class24 local12 = (Class24) Static315.aClass102_36.method2677((long) arg1);
		if (local12 == null) {
			if (Static47.aBoolean91) {
				local12 = Static323.aClass5_9.method7525(Static645.method2762(arg0, arg1), true);
			} else {
				local12 = Static25.method6691(arg0.method5113(arg1));
			}
			Static315.aClass102_36.method2674((long) arg1, local12);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([BIBII[BIII)V")
	public static void method2507(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg2++;
				arg0[local26] = (byte) (arg0[local26] - arg4[arg7++]);
				@Pc(39) int local39 = arg2++;
				arg0[local39] = (byte) (arg0[local39] - arg4[arg7++]);
				@Pc(52) int local52 = arg2++;
				arg0[local52] = (byte) (arg0[local52] - arg4[arg7++]);
				@Pc(65) int local65 = arg2++;
				arg0[local65] = (byte) (arg0[local65] - arg4[arg7++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg2++;
				arg0[local26] = (byte) (arg0[local26] - arg4[arg7++]);
			}
			arg7 += arg6;
			arg2 += arg3;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static72.anInt1724 = arg1;
		Static157.anInt3107 = arg0;
		Static160.anInt3139 = arg3;
		Static294.anInt5192 = arg2;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
	public static void method2510() {
		if (Static205.aClass138_2.aBoolean276 && Static148.aClass363_3.anInt9891 != -1) {
			Static404.method6472(Static148.aClass363_3.anInt9891, Static148.aClass363_3.aString109);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method2511() {
		@Pc(5) int local5 = 0;
		if (Static262.aClass3_Sub27_12.aClass21_Sub12_1.method4533() == 1) {
			local5 = 55;
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3111() == 0) {
			local5 |= 0x40;
		}
		Static269.method4426(local5);
		Static105.aClass302_1.method7468(local5);
		Static320.aClass53_2.method1776(local5);
		Static547.aClass177_2.method4473(local5);
		Static275.aClass68_2.method2080(local5);
		Static65.method1665(local5);
		Static153.method2809(local5);
		Static588.method8286(local5);
		Static437.method6810(local5);
		Static73.method1756();
	}
}
