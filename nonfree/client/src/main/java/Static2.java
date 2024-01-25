import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt3510;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!h;")
	public static Class1_Sub15 aClass1_Sub15_3 = null;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
	public static int method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg1;
		@Pc(26) int local26 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return ((local8 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local8 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!gp;Lclient!gp;IIZIZ)I")
	public static int method3249(@OriginalArg(0) Class74_Sub1 arg0, @OriginalArg(1) Class74_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static309.method5203(arg1, arg2, arg5, arg0);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = Static309.method5203(arg1, arg3, arg4, arg0);
			return arg4 ? -local32 : local32;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZIIIIII)V")
	public static void method3283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg1;
		@Pc(15) int local15 = arg3 + arg1;
		for (@Pc(17) int local17 = arg3; local17 < local15; local17++) {
			Static97.method1784(arg0, Static327.anIntArrayArray63[local17], arg2, arg6);
		}
		@Pc(36) int local36 = arg6 - arg1;
		@Pc(40) int local40 = arg1 + arg0;
		for (@Pc(42) int local42 = arg5; local42 > local10; local42--) {
			Static97.method1784(arg0, Static327.anIntArrayArray63[local42], arg2, arg6);
		}
		for (@Pc(58) int local58 = local15; local58 <= local10; local58++) {
			@Pc(64) int[] local64 = Static327.anIntArrayArray63[local58];
			Static97.method1784(arg0, local64, arg2, local40);
			Static97.method1784(local40, local64, arg4, local36);
			Static97.method1784(local36, local64, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qj;Lclient!qj;)V")
	public static void method3290(@OriginalArg(1) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static306.aClass165_93 = arg1;
		Static56.aClass165_21 = arg0;
		Static56.aClass165_21.method4499(36);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!kq;BLclient!sr;)Lclient!aa;")
	public static synchronized Class2 method3301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Class110 arg3, @OriginalArg(5) Interface7 arg4) {
		@Pc(14) int local14 = -1;
		for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
			if (!Static178.aBooleanArray19[local16]) {
				local14 = local16;
				break;
			}
		}
		if (local14 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(61) Class2 local61;
		if (arg1 == 0) {
			local61 = Static245.method4341(arg2, local14, arg4);
		} else if (arg1 == 1) {
			local61 = Static322.method5389(arg3, local14, arg4, arg2, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static178.aBooleanArray19[local14] = true;
		return local61;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[I[JII)V")
	public static void method3303(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if ((long) (local46 & 0x1) + local20 > arg1[local46]) {
				@Pc(63) long local63 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local63;
				@Pc(77) int local77 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local77;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method3303(arg0, arg1, arg2, local16 - 1);
		method3303(arg0, arg1, local16 + 1, arg3);
	}
}
