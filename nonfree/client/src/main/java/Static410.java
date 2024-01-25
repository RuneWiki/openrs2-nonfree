import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
	public static int anInt7653;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V")
	public static void method6766() {
		if (Static148.anIntArray154 != null && Static464.anIntArray420 != null) {
			return;
		}
		Static148.anIntArray154 = new int[256];
		Static464.anIntArray420 = new int[256];
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(29) double local29 = (double) local20 / 255.0D * 6.283185307179586D;
			Static148.anIntArray154[local20] = (int) (Math.sin(local29) * 4096.0D);
			Static464.anIntArray420[local20] = (int) (Math.cos(local29) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!nea;)I")
	public static int method6767(@OriginalArg(1) Class244 arg0) {
		if (arg0 == Static142.aClass244_5) {
			return 6407;
		} else if (arg0 == Static584.aClass244_9) {
			return 6408;
		} else if (arg0 == Static612.aClass244_15) {
			return 6406;
		} else if (arg0 == Static314.aClass244_12) {
			return 6409;
		} else if (arg0 == Static105.aClass244_4) {
			return 6410;
		} else if (arg0 == Static412.aClass244_13) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIBII)V")
	public static void method6768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 - arg5;
		@Pc(14) int local14 = arg3 + arg5;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static567.method8614(arg4, arg1, Static186.anIntArrayArray12[local16], arg2);
		}
		@Pc(34) int local34 = arg4 + arg5;
		for (@Pc(36) int local36 = arg0; local36 > local9; local36--) {
			Static567.method8614(arg4, arg1, Static186.anIntArrayArray12[local36], arg2);
		}
		@Pc(55) int local55 = arg1 - arg5;
		for (@Pc(62) int local62 = local14; local62 <= local9; local62++) {
			@Pc(68) int[] local68 = Static186.anIntArrayArray12[local62];
			Static567.method8614(arg4, local34, local68, arg2);
			Static567.method8614(local55, arg1, local68, arg2);
		}
	}
}
