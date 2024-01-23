import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!f", name = "W", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "Lclient!wc;")
	public static Class110 aClass110_8 = new Class110(64);

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public static int anInt1022 = 0;

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "J")
	public static long aLong41 = 0L;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public static int anInt1023 = 20;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mj;IBIIII)V")
	public static void method748(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = arg2 * arg2 + arg1 * arg1;
		if (local11 > 360000) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg0.anInt3021 / 2, arg0.anInt3040 / 2);
		if (local11 <= local35 * local35) {
			Static199.method3561(arg3, arg0, arg1, arg2, arg5, Static53.aClass2_Sub3_Sub8Array4[arg4]);
			return;
		}
		local35 -= 10;
		@Pc(51) int local51 = Static90.anInt2013 + Static140.anInt3197 & 0x7FF;
		@Pc(55) int local55 = Class77.anIntArray632[local51];
		@Pc(63) int local63 = local55 * 256 / (Static62.anInt1225 + 256);
		@Pc(67) int local67 = Class77.anIntArray631[local51];
		@Pc(75) int local75 = local67 * 256 / (Static62.anInt1225 + 256);
		@Pc(85) int local85 = arg2 * local63 - local75 * arg1 >> 16;
		@Pc(95) int local95 = local63 * arg1 + local75 * arg2 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local95, (double) local85);
		@Pc(108) int local108 = (int) (Math.sin(local101) * (double) local35);
		@Pc(115) int local115 = (int) ((double) local35 * Math.cos(local101));
		((Class2_Sub3_Sub8_Sub1) Static12.aClass2_Sub3_Sub8Array1[arg4]).method2268(local108 + arg5 + arg0.anInt3021 / 2 - 10, arg3 + -10 + arg0.anInt3040 / 2 + -local115, local101);
	}
}
