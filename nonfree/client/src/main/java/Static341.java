import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!nq;")
	public static Class144 aClass144_110;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!nh;")
	public static Class11_Sub10_Sub3 aClass11_Sub10_Sub3_2;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!sg;")
	public static Class97 aClass97_22;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "J")
	public static long aLong206 = 0L;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
	public static int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!uo;Lclient!rr;III)V")
	public static void method5569(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class106 local12;
		if (arg3 < Static232.anInt4703) {
			local12 = Static212.aClass106ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass67_Sub4_1 != null && local12.aClass67_Sub4_1.method5399()) {
				arg1.method5398(0, 0, 128, local12.aClass67_Sub4_1, arg0, true);
			}
		}
		if (arg4 < Static232.anInt4703) {
			local12 = Static212.aClass106ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass67_Sub4_1 != null && local12.aClass67_Sub4_1.method5399()) {
				arg1.method5398(128, 0, 0, local12.aClass67_Sub4_1, arg0, true);
			}
		}
		if (arg3 < Static232.anInt4703 && arg4 < Static300.anInt5931) {
			local12 = Static212.aClass106ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass67_Sub4_1 != null && local12.aClass67_Sub4_1.method5399()) {
				arg1.method5398(128, 0, 128, local12.aClass67_Sub4_1, arg0, true);
			}
		}
		if (arg3 < Static232.anInt4703 && arg4 > 0) {
			local12 = Static212.aClass106ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass67_Sub4_1 != null && local12.aClass67_Sub4_1.method5399()) {
				arg1.method5398(-128, 0, 128, local12.aClass67_Sub4_1, arg0, true);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method5570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class58 local10 = new Class58(16);
		for (@Pc(15) Class11_Sub40 local15 = (Class11_Sub40) Static301.aClass58_35.method1008(); local15 != null; local15 = (Class11_Sub40) Static301.aClass58_35.method1004()) {
			local15.method5701();
			@Pc(26) int local26 = (int) (local15.aLong215 >> 28);
			@Pc(37) int local37 = (int) (local15.aLong215 >> 14 & 0x3FFFL) - arg0;
			@Pc(46) int local46 = (int) (local15.aLong215 & 0x3FFFL) - arg1;
			if (local46 >= 0 && local37 >= 0 && local46 < Static24.anInt454 && Static240.anInt4832 > local37) {
				local10.method1006((long) (local46 | local37 << 14 | local26 << 28), local15);
			}
		}
		Static301.aClass58_35 = local10;
	}
}
