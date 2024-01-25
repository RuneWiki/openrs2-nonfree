import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
	public static int anInt1061;

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_36 = new Class251(47, 8);

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIII)V")
	public static void method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class136[] local3 = Static8.aClass136Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class136 local11 = local3[local5];
			if (local11 != null && local11.anInt3427 == 2) {
				Static9.method113(local11.anInt3425, arg2 >> 1, local11.anInt3422, local11.anInt3420, local11.anInt3424 * 2, arg1 >> 1);
				if (Static172.anIntArray151[0] > -1 && Static530.anInt9105 % 20 < 10) {
					@Pc(63) Class45 local63 = Static303.aClass45Array28[local11.anInt3429];
					@Pc(71) int local71 = Static172.anIntArray151[0] + arg0 - 12;
					@Pc(79) int local79 = arg3 + Static172.anIntArray151[1] - 28;
					local63.method7488(local71, local79);
					Static140.method2127(local63.method7508() + local71, local71, local63.method7504() + local79, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method1090(@OriginalArg(1) Class310 arg0) {
		Static685.aClass310_54 = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZIIII[B[BI)V")
	public static void method1091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg7++;
				arg5[local31] = (byte) (arg5[local31] - arg6[arg3++]);
				@Pc(44) int local44 = arg7++;
				arg5[local44] = (byte) (arg5[local44] - arg6[arg3++]);
				@Pc(57) int local57 = arg7++;
				arg5[local57] = (byte) (arg5[local57] - arg6[arg3++]);
				@Pc(70) int local70 = arg7++;
				arg5[local70] = (byte) (arg5[local70] - arg6[arg3++]);
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local31 = arg7++;
				arg5[local31] = (byte) (arg5[local31] - arg6[arg3++]);
			}
			arg7 += arg4;
			arg3 += arg1;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!cq;ZZB)V")
	public static void method1092(@OriginalArg(0) Class14_Sub13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) int local6 = arg0.anInt1465;
		@Pc(10) int local10 = (int) arg0.aLong324;
		arg0.method9513();
		if (arg2) {
			Static37.method652(local6);
		}
		Static175.method2582(local6);
		@Pc(27) Class299 local27 = Static391.method5936(local10);
		if (local27 != null) {
			Static538.method7933(local27);
		}
		Static92.method9424();
		if (!arg1 && Static358.anInt6145 != -1) {
			Static323.method5078(Static358.anInt6145, 1);
		}
		@Pc(54) Class190 local54 = new Class190(Static27.aClass125_3);
		for (@Pc(64) Class14_Sub13 local64 = (Class14_Sub13) local54.method4788(); local64 != null; local64 = (Class14_Sub13) local54.method4783()) {
			if (!local64.method9512()) {
				local64 = (Class14_Sub13) local54.method4788();
				if (local64 == null) {
					return;
				}
			}
			if (local64.anInt1466 == 3) {
				@Pc(88) int local88 = (int) local64.aLong324;
				if (local6 == local88 >>> 16) {
					method1092(local64, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1093(@OriginalArg(0) String arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static528.aStringArray39.length; local11++) {
			if (Static528.aStringArray39[local11].equalsIgnoreCase(arg0)) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!th;)Z")
	public static boolean method1094(@OriginalArg(1) Class348 arg0) {
		return arg0 == null ? false : Static247.method4204(arg0.anInt9637, arg0.anInt9641 - arg0.anInt9635, arg0.anInt9635, arg0.anInt9647 - arg0.anInt9644, arg0.anInt9644, arg0.anInt9640 - arg0.anInt9637);
	}
}
