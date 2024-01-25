import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Lclient!um;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!gfa;ILclient!jk;IILclient!cj;ILclient!ha;)V")
	public static void method5048(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class172 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class55 arg6, @OriginalArg(8) Class95 arg7) {
		@Pc(14) int local14 = arg0 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg5 + 2;
		if (arg3.anInt4348 != 0) {
			arg7.method6936(arg6.method1012() * arg4 + arg5 + 1 - local18, arg2 + 10, local14, arg3.anInt4348, local18);
		}
		if (arg3.anInt4346 != 0) {
			arg7.method6989(local14, arg3.anInt4346, arg6.method1012() * arg4 + arg5 + 1 - local18, local18, arg2 + 10);
		}
		@Pc(70) int local70 = arg3.anInt4328;
		if (arg1.aBoolean227 && arg3.anInt4335 != -1) {
			local70 = arg3.anInt4335;
		}
		for (@Pc(83) int local83 = 0; local83 < arg4; local83++) {
			@Pc(89) String local89 = Static597.aStringArray46[local83];
			if (arg4 - 1 > local83) {
				local89 = local89.substring(0, local89.length() - 4);
			}
			arg6.method1007(arg7, local89, arg0, arg5, local70);
			arg5 += arg6.method1012();
		}
	}
}
