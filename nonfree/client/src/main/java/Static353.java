import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public static int anInt7069 = 0;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Lclient!uaa;")
	public static final Class320 aClass320_7 = new Class320("WIP", 2);

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!xa;ILclient!fa;ILclient!tc;III)V")
	public static void method5872(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class305 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static267.anInt5668 == 4) {
			local14 = (int) Static533.aFloat188 & 0x3FFF;
		} else {
			local14 = Static288.anInt5964 + (int) Static533.aFloat188 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg4.anInt9242 / 2, arg4.anInt9160 / 2) + 10;
		@Pc(42) int local42 = arg3 * arg3 + arg5 * arg5;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(52) int local52 = Class2_Sub3.anIntArray620[local14];
		@Pc(56) int local56 = Class2_Sub3.anIntArray621[local14];
		if (Static267.anInt5668 != 4) {
			local52 = local52 * 256 / (Static66.anInt1706 + 256);
			local56 = local56 * 256 / (Static66.anInt1706 + 256);
		}
		@Pc(85) int local85 = arg3 * local52 + arg5 * local56 >> 14;
		@Pc(101) int local101 = local56 * arg3 - arg5 * local52 >> 14;
		arg0.method7077(local85 + arg4.anInt9242 / 2 + arg6 - arg0.AA() / 2, -local101 + arg4.anInt9160 / 2 + arg1 - arg0.a() / 2, arg2, arg6, arg1);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method5873(@OriginalArg(0) Class254 arg0) {
		Static580.anInt10228 = arg0.method6414("p11_full");
		Static536.anInt9710 = arg0.method6414("p12_full");
		Static262.anInt5579 = arg0.method6414("b12_full");
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZI)V")
	public static void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class3_Sub29 local8 = Static535.method7881(arg1, arg0);
		if (local8 != null) {
			for (@Pc(25) int local25 = 0; local25 < local8.anIntArray328.length; local25++) {
				local8.anIntArray328[local25] = -1;
				local8.anIntArray329[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)I")
	public static int method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg0;
			arg0 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg2;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg4;
		} else {
			return arg1;
		}
	}
}
