import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
	public static int[] anIntArray640;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
	public static final int[] anIntArray641 = new int[32];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!va;)V")
	public static void method7202(@OriginalArg(1) Class15_Sub2_Sub4 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8961 == Static363.anInt6671 || arg0.anInt8932 == -1 || arg0.anInt8955 != 0) {
			local5 = true;
		} else {
			@Pc(36) Class63 local36 = Static388.aClass324_2.method7265(arg0.anInt8932);
			if (local36.aBoolean103 || local36.anIntArray128[arg0.anInt8975] < arg0.anInt8944 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(60) int local60 = arg0.anInt8961 - arg0.anInt8991;
			@Pc(66) int local66 = Static363.anInt6671 - arg0.anInt8991;
			@Pc(77) int local77 = arg0.lb * 512 + arg0.method7135() * 256;
			@Pc(89) int local89 = arg0.anInt8942 * 512 + arg0.method7135() * 256;
			@Pc(101) int local101 = arg0.anInt8939 * 512 + arg0.method7135() * 256;
			@Pc(112) int local112 = arg0.anInt8977 * 512 + arg0.method7135() * 256;
			arg0.anInt8913 = ((local60 - local66) * local89 + local66 * local112) / local60;
			arg0.anInt8911 = (local77 * (local60 - local66) + local66 * local101) / local60;
		}
		arg0.anInt8995 = 0;
		if (arg0.anInt8986 == 0) {
			arg0.method7143(8192, false);
		}
		if (arg0.anInt8986 == 1) {
			arg0.method7143(12288, false);
		}
		if (arg0.anInt8986 == 2) {
			arg0.method7143(0, false);
		}
		if (arg0.anInt8986 == 3) {
			arg0.method7143(4096, false);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	public static void method7206(@OriginalArg(0) int arg0) {
		Static26.anInt444 = -1;
		if (arg0 == 37) {
			Static490.aFloat33 = 3.0F;
		} else if (arg0 == 50) {
			Static490.aFloat33 = 4.0F;
		} else if (arg0 == 75) {
			Static490.aFloat33 = 6.0F;
		} else if (arg0 == 100) {
			Static490.aFloat33 = 8.0F;
		} else if (arg0 == 200) {
			Static490.aFloat33 = 16.0F;
		}
		Static26.anInt444 = -1;
	}
}
