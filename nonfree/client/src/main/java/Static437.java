import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	public static int anInt7354;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public static int anInt7351 = -1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!gi;ZI)V")
	public static void method5904(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) int arg2) {
		Static338.aClass93_13 = arg1;
		Static104.anInt1681 = arg0;
		Static269.anInt2102 = arg2;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!uj;B)V")
	public static void method5905(@OriginalArg(0) Class2_Sub42 arg0) {
		if (Static175.aClass36ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt7060 == 0) {
			local8 = (Interface6) Static45.method700(arg0.anInt7065, arg0.anInt7064, arg0.anInt7066);
		}
		if (arg0.anInt7060 == 1) {
			local8 = (Interface6) Static130.method2044(arg0.anInt7065, arg0.anInt7064, arg0.anInt7066);
		}
		if (arg0.anInt7060 == 2) {
			local8 = (Interface6) Static345.method4857(arg0.anInt7065, arg0.anInt7064, arg0.anInt7066, jq.class);
		}
		if (arg0.anInt7060 == 3) {
			local8 = (Interface6) Static115.method1883(arg0.anInt7065, arg0.anInt7064, arg0.anInt7066);
		}
		if (local8 == null) {
			arg0.anInt7062 = -1;
			arg0.anInt7057 = 0;
			arg0.anInt7063 = 0;
		} else {
			arg0.anInt7062 = local8.method5718();
			arg0.anInt7057 = local8.method5721();
			arg0.anInt7063 = local8.method5723();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!za;IIIII[[[BIIII)V")
	public static void method5907(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg4 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg9 = 1;
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg9 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg9 = 8;
		}
		arg1.K(arg5, arg10, arg11, arg6, arg3, arg2, arg7[arg9 - 1][arg0], arg4, arg8);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public static void method5909() {
		Static121.anInt2062 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static176.aClass2_Sub17Array1[local9] = null;
			Static436.aByteArray89[local9] = 1;
			Static385.aClass175Array1[local9] = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)V")
	public static void method5911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static153.anInt2793; local7++) {
			@Pc(13) Rectangle local13 = Class2_Sub2_Sub9.aRectangleArray1[local7];
			if (local13.x + local13.width > arg3 && local13.x < arg3 + arg0 && local13.height + local13.y > arg1 && local13.y < arg2 + arg1) {
				Static186.aBooleanArray12[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!hw;I)V")
	public static void method5914(@OriginalArg(0) Class2_Sub17 arg0) {
		if (arg0.aByteArray94.length - arg0.anInt7523 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method6138();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray94.length - arg0.anInt7523 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method6148();
		if (arg0.aByteArray94.length - arg0.anInt7523 < local43 * 6) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < local43; local61++) {
			@Pc(67) int local67 = arg0.method6148();
			@Pc(71) int local71 = arg0.method6129();
			if (Static388.anIntArray542.length > local67 && Static203.aBooleanArray15[local67] && (Static73.aClass209_1.method4858(local67).aChar1 != '1' || local71 >= -1 && local71 <= 1)) {
				Static388.anIntArray542[local67] = local71;
			}
		}
	}
}
