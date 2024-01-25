import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt9344;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt9348;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt9345 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBILclient!vq;I)V")
	public static void method7603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub3_Sub3_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class140 local17 = arg2.method5425();
		@Pc(27) int local27 = arg2.anInt6812 - arg2.aClass108_7.anInt2729 & 0x3FFF;
		if (arg1 == -1) {
			if (local27 != 0 || arg2.anInt6841 > 25) {
				if (arg0 < 0 && local17.anInt3598 != -1) {
					arg2.anInt6829 = local17.anInt3598;
				} else if (arg0 <= 0 || local17.anInt3600 == -1) {
					arg2.anInt6829 = local17.anInt3612;
				} else {
					arg2.anInt6829 = local17.anInt3600;
				}
				arg2.aBoolean553 = false;
			} else if (!arg2.aBoolean553 || !local17.method2954(arg2.anInt6829)) {
				arg2.anInt6829 = local17.method2953();
				arg2.aBoolean553 = arg2.anInt6829 != -1;
			}
		} else if (arg2.anInt6781 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(277) int local277 = Static448.anIntArray596[arg3] - arg2.aClass108_7.anInt2729 & 0x3FFF;
			arg2.aBoolean553 = false;
			if (arg1 == 2 && local17.anInt3597 != -1) {
				if (local277 > 2048 && local277 <= 6144 && local17.anInt3610 != -1) {
					arg2.anInt6829 = local17.anInt3610;
				} else if (local277 >= 10240 && local277 < 14336 && local17.anInt3616 != -1) {
					arg2.anInt6829 = local17.anInt3616;
				} else if (local277 <= 6144 || local277 >= 10240 || local17.anInt3625 == -1) {
					arg2.anInt6829 = local17.anInt3597;
				} else {
					arg2.anInt6829 = local17.anInt3625;
				}
			} else if (arg1 == 0 && local17.anInt3593 != -1) {
				if (local277 > 2048 && local277 <= 6144 && local17.anInt3628 != -1) {
					arg2.anInt6829 = local17.anInt3628;
				} else if (local277 >= 10240 && local277 < 14336 && local17.anInt3602 != -1) {
					arg2.anInt6829 = local17.anInt3602;
				} else if (local277 <= 6144 || local277 >= 10240 || local17.anInt3636 == -1) {
					arg2.anInt6829 = local17.anInt3593;
				} else {
					arg2.anInt6829 = local17.anInt3636;
				}
			} else if (local277 > 2048 && local277 <= 6144 && local17.anInt3626 != -1) {
				arg2.anInt6829 = local17.anInt3626;
			} else if (local277 >= 10240 && local277 < 14336 && local17.anInt3629 != -1) {
				arg2.anInt6829 = local17.anInt3629;
			} else if (local277 <= 6144 || local277 >= 10240 || local17.anInt3604 == -1) {
				arg2.anInt6829 = local17.anInt3612;
			} else {
				arg2.anInt6829 = local17.anInt3604;
			}
		} else if (local27 == 0 && arg2.anInt6841 <= 25) {
			arg2.aBoolean553 = false;
			if (arg1 == 2 && local17.anInt3597 != -1) {
				arg2.anInt6829 = local17.anInt3597;
			} else if (arg1 == 0 && local17.anInt3593 != -1) {
				arg2.anInt6829 = local17.anInt3593;
			} else {
				arg2.anInt6829 = local17.anInt3612;
			}
		} else {
			arg2.aBoolean553 = false;
			if (arg1 == 2 && local17.anInt3597 != -1) {
				if (arg0 < 0 && local17.anInt3634 != -1) {
					arg2.anInt6829 = local17.anInt3634;
				} else if (arg0 <= 0 || local17.anInt3615 == -1) {
					arg2.anInt6829 = local17.anInt3597;
				} else {
					arg2.anInt6829 = local17.anInt3615;
				}
			} else if (arg1 == 0 && local17.anInt3593 != -1) {
				if (arg0 < 0 && local17.anInt3631 != -1) {
					arg2.anInt6829 = local17.anInt3631;
				} else if (arg0 <= 0 || local17.anInt3622 == -1) {
					arg2.anInt6829 = local17.anInt3593;
				} else {
					arg2.anInt6829 = local17.anInt3622;
				}
			} else if (arg0 < 0 && local17.anInt3621 != -1) {
				arg2.anInt6829 = local17.anInt3621;
			} else if (arg0 <= 0 || local17.anInt3605 == -1) {
				arg2.anInt6829 = local17.anInt3612;
			} else {
				arg2.anInt6829 = local17.anInt3605;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([BZ)Lclient!f;")
	public static Class22 method7604(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(19) Image local19 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(24) MediaTracker local24 = new MediaTracker(Static399.aClient1);
				local24.addImage(local19, 0);
				local24.waitForAll();
				@Pc(34) int local34 = local19.getWidth(Static399.aClient1);
				@Pc(38) int local38 = local19.getHeight(Static399.aClient1);
				if (!local24.isErrorAny() && local34 >= 0 && local38 >= 0) {
					@Pc(58) int[] local58 = new int[local38 * local34];
					@Pc(70) PixelGrabber local70 = new PixelGrabber(local19, 0, 0, local34, local38, local58, 0, local34);
					local70.grabPixels();
					return Static16.aClass134_1.method6970(local58, local34, local34, local38);
				}
				throw new RuntimeException("");
			} catch (@Pc(82) InterruptedException local82) {
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method7605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static226.anInt6315 / (float) Static226.anInt6314;
		@Pc(11) int local11 = arg2;
		@Pc(22) int local22 = arg3;
		if (local9 < 1.0F) {
			local22 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(49) int local49 = arg1 - (arg3 - local22) / 2;
		@Pc(58) int local58 = arg0 - (arg2 - local11) / 2;
		Static71.anInt1407 = local58 * Static226.anInt6314 / local11;
		Static134.anInt2584 = -1;
		Static493.anInt8491 = -1;
		Static197.anInt6246 = Static226.anInt6315 - local49 * Static226.anInt6315 / local22;
		Static111.method1765();
	}
}
