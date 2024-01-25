import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IBIIIIII)V")
	public static void method6273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 + arg4;
		@Pc(15) int local15 = arg3 - arg4;
		for (@Pc(17) int local17 = arg6; local17 < local10; local17++) {
			Static208.method3687(arg1, arg2, Static454.anIntArrayArray71[local17], arg5);
		}
		@Pc(35) int local35 = arg1 + arg4;
		for (@Pc(37) int local37 = arg3; local37 > local15; local37--) {
			Static208.method3687(arg1, arg2, Static454.anIntArrayArray71[local37], arg5);
		}
		@Pc(64) int local64 = arg5 - arg4;
		for (@Pc(66) int local66 = local10; local66 <= local15; local66++) {
			@Pc(72) int[] local72 = Static454.anIntArrayArray71[local66];
			Static208.method3687(arg1, arg2, local72, local35);
			Static208.method3687(local35, arg0, local72, local64);
			Static208.method3687(local64, arg2, local72, arg5);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)V")
	public static void method6275(@OriginalArg(0) int arg0) {
		if (Static508.method7071(arg0)) {
			Static417.method5979(Static14.aClass292ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZB)V")
	public static void method6276(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static217.aClass6_Sub2_Sub6_2 != null) {
			Static180.anInt3755 = Static217.aClass6_Sub2_Sub6_2.anInt2238;
		} else {
			Static180.anInt3755 = -1;
		}
		Static1.aClass292_16 = null;
		Static243.aClass361_38 = null;
		Static585.anInt9508 = 0;
		Static217.aClass6_Sub2_Sub6_2 = null;
		Static217.method3355();
		Static217.aClass361_25.method7842();
		Static173.aClass168_5 = null;
		Static29.anInt856 = -1;
		Static40.aClass168_1 = null;
		Static562.anInt9257 = -1;
		Static413.aClass168_8 = null;
		Static217.aClass303_2 = null;
		Static180.aClass168_6 = null;
		Static425.aClass58_39 = null;
		Static121.aClass168_4 = null;
		Static387.aClass168_7 = null;
		Static479.aClass168_9 = null;
		Static68.aClass168_10 = null;
		if (Static217.aClass213_2 != null) {
			Static217.aClass213_2.method5130();
			Static217.aClass213_2.method5128(128, 64);
		}
		if (Static217.aClass3_2 != null) {
			Static217.aClass3_2.method62(64, 64);
		}
		if (Static217.aClass307_2 != null) {
			Static217.aClass307_2.method6637(64);
		}
		Static183.aClass316_1.method6786(64);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method6280(@OriginalArg(1) File arg0) {
		return Static72.method1438(arg0, (int) arg0.length());
	}
}
