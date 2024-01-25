import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "[Lclient!dv;")
	public static final Class77[] aClass77Array2 = new Class77[14];

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!oa;IBII)Lclient!ba;")
	public static Class9 method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class9 local12 = (Class9) Static99.aClass223_12.method4943(local6);
		if (local12 == null) {
			@Pc(27) Class266 local27 = Static329.method4945(Static436.aClass31_97, arg4);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt7035 < 13) {
				local27.method5852();
			}
			local12 = arg2.method6779(local27, 2055, Static96.anInt2431, 64, 768);
			Static99.aClass223_12.method4938(local6, local12);
		}
		local12 = local12.method4006((byte) 2, 2055, true);
		if (arg5 != 0) {
			local12.I(arg5);
		}
		if (arg0 != 0) {
			local12.AA(arg0);
		}
		if (arg1 != 0) {
			local12.v(arg1);
		}
		if (arg3 != 0) {
			local12.m(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I")
	public static int method5028(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(39) int local39 = local25 | local25 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([JBII[I)V")
	public static void method5029(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg2) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) long local29 = arg0[local23];
		arg0[local23] = arg0[arg1];
		arg0[arg1] = local29;
		@Pc(43) int local43 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg2; local65 < arg1; local65++) {
			if ((long) (local65 & local63) + local29 > arg0[local65]) {
				@Pc(86) long local86 = arg0[local65];
				arg0[local65] = arg0[local25];
				arg0[local25] = local86;
				@Pc(100) int local100 = arg3[local65];
				arg3[local65] = arg3[local25];
				arg3[local25++] = local100;
			}
		}
		arg0[arg1] = arg0[local25];
		arg0[local25] = local29;
		arg3[arg1] = arg3[local25];
		arg3[local25] = local43;
		method5029(arg0, local25 - 1, arg2, arg3);
		method5029(arg0, arg1, local25 + 1, arg3);
	}
}
