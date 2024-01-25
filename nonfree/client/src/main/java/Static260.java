import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
	public static int anInt4712;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "[I")
	public static final int[] anIntArray234 = new int[14];

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
	public static int anInt4710 = 0;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_86 = new Class337(13, 3);

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)I")
	public static int method4253() {
		return Static483.anInt8236 == 1 ? Static404.anInt6761 : Static111.anInt2087;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BILclient!ha;IIILclient!oj;IIIII)V")
	public static void method4255(@OriginalArg(1) int arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub5_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 < arg3 && arg3 < arg7 + arg9 && arg6 > arg2 - 13 && arg6 < arg2 + 3 && arg5.aBoolean471) {
			arg10 = arg8;
		}
		@Pc(44) int[] local44 = null;
		if (Static155.method1877(arg5.anInt6765)) {
			local44 = Static643.aClass275_2.method6641((int) arg5.aLong172).anIntArray365;
		} else if (arg5.anInt6766 != -1) {
			local44 = Static643.aClass275_2.method6641(arg5.anInt6766).anIntArray365;
		} else if (Static390.method5792(arg5.anInt6765)) {
			@Pc(77) Class5_Sub3 local77 = (Class5_Sub3) Static445.aClass273_29.method6581((long) arg5.aLong172);
			if (local77 != null) {
				@Pc(82) Class4_Sub2_Sub1_Sub1_Sub2 local82 = local77.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				@Pc(85) Class225 local85 = local82.aClass225_1;
				if (local85.anIntArray304 != null) {
					local85 = local85.method4990(Static301.aClass59_1);
				}
				if (local85 != null) {
					local44 = local85.anIntArray305;
				}
			}
		} else if (Static327.method4978(arg5.anInt6765)) {
			@Pc(123) Class181 local123;
			if (arg5.anInt6765 == 1006) {
				local123 = Static61.aClass246_7.method5497((int) arg5.aLong172);
			} else {
				local123 = Static61.aClass246_7.method5497((int) (arg5.aLong172 >>> 32 & 0x7FFFFFFFL));
			}
			if (local123.anIntArray235 != null) {
				local123 = local123.method4279(Static301.aClass59_1);
			}
			if (local123 != null) {
				local44 = local123.anIntArray238;
			}
		}
		@Pc(156) String local156 = Static404.method6045(arg5);
		if (local44 != null) {
			local156 = local156 + Static439.method6671(local44);
		}
		Static16.aClass55_1.method6012(arg10, local156, Static236.aClass28Array10, Static528.anIntArray500, arg2, arg9 + 3);
		if (arg5.aBoolean472) {
			Static17.aClass28_2.method4040(Static485.aClass272_16.method6570(local156) + arg9 + 5, arg2 + -12);
		}
	}
}
