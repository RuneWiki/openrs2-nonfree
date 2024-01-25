import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public static int anInt3760;

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "Lclient!ni;")
	public static Class223 aClass223_47;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_58 = new Class73(104, -2);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I[BI[BIIIII)V")
	public static void method3191(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(18) int local18 = -(arg7 & 0x3);
		for (@Pc(21) int local21 = -arg2; local21 < 0; local21++) {
			@Pc(29) int local29;
			for (@Pc(25) int local25 = local10; local25 < 0; local25++) {
				local29 = arg6++;
				arg1[local29] += arg3[arg4++];
				@Pc(41) int local41 = arg6++;
				arg1[local41] += arg3[arg4++];
				@Pc(53) int local53 = arg6++;
				arg1[local53] += arg3[arg4++];
				@Pc(65) int local65 = arg6++;
				arg1[local65] += arg3[arg4++];
			}
			for (@Pc(80) int local80 = local18; local80 < 0; local80++) {
				local29 = arg6++;
				arg1[local29] += arg3[arg4++];
			}
			arg6 += arg5;
			arg4 += arg0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIZI)Z")
	public static boolean method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0];
		@Pc(13) int local13 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0];
		if (local8 < 0 || Static306.anInt6176 <= local8 || local13 < 0 || local13 >= Static108.anInt2930) {
			return false;
		} else if (arg5 >= 0 && arg5 < Static306.anInt6176 && arg4 >= 0 && arg4 < Static108.anInt2930) {
			@Pc(64) int local64 = Static568.method2131(Static313.aClass258Array1[Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135], Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620(), Static267.anIntArray255, arg1, arg0, arg4, arg2, local13, Static217.anIntArray207, arg6, arg5, arg3, local8, arg7);
			if (local64 < 1) {
				return false;
			}
			Static473.anInt8390 = Static267.anIntArray255[local64 - 1];
			Static445.anInt8080 = Static217.anIntArray207[local64 - 1];
			Static622.aBoolean830 = false;
			Static269.method8233();
			return true;
		} else {
			return false;
		}
	}
}
