import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_152 = new Class171(40, 2);

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_153 = new Class171(18, -1);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)I")
	public static int method8459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ha;Lclient!js;ILclient!ef;ZIIILclient!su;)V")
	public static void method8464(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub46 arg7) {
		@Pc(14) int local14 = arg5 - arg6 / 2 - 5;
		@Pc(18) int local18 = arg4 + 2;
		if (arg1.anInt4949 != 0) {
			arg0.method8054(arg2 * arg3.method2241() + arg4 + 1 - local18, local18, arg6 + 10, local14, arg1.anInt4949);
		}
		if (arg1.anInt4983 != 0) {
			arg0.method8071(arg6 + 10, local14, local18, arg1.anInt4983, arg4 + arg3.method2241() * arg2 + 1 - local18);
		}
		@Pc(71) int local71 = arg1.anInt4960;
		if (arg7.aBoolean638 && arg1.anInt4979 != -1) {
			local71 = arg1.anInt4979;
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			@Pc(95) String local95 = Static307.aStringArray39[local89];
			if (arg2 - 1 > local89) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg3.method2245(arg0, local95, arg5, arg4, local71);
			arg4 += arg3.method2241();
		}
	}
}
