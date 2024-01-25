import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static int anInt3848 = 0;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_65 = new Class198("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lclient!hp;")
	public static Class88_Sub2 method3033(@OriginalArg(1) int arg0) {
		@Pc(7) Class107[] local7 = Class15_Sub2.aClass107Array1;
		synchronized (Class15_Sub2.aClass107Array1) {
			@Pc(32) Class88_Sub2 local32;
			if (Class15_Sub2.aClass107Array1.length <= arg0 || Class15_Sub2.aClass107Array1[arg0].method2324()) {
				local32 = new Class88_Sub2();
				local32.aClass88_Sub8Array1 = new Class88_Sub8[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass88_Sub8Array1[local38] = new Class88_Sub8();
				}
			} else {
				local32 = (Class88_Sub2) Class15_Sub2.aClass107Array1[arg0].method2322();
				local32.method5917();
				@Pc(73) int local73 = Static97.anIntArray78[arg0]--;
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!wn;Lclient!cl;IILclient!za;ILclient!ae;)V")
	public static void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class5_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(7) Class6 arg6) {
		@Pc(23) int local23 = arg2.anInt950 - arg3 / 2 - 5;
		@Pc(27) int local27 = arg0 + 2;
		if (arg6.anInt126 != 0) {
			arg5.method5856(local27, arg6.anInt126, arg3 + 10, arg4 * arg1.method5960() + 1 + arg0 + -local27, local23);
		}
		if (arg6.anInt109 != 0) {
			arg5.method5857(local23, local27, arg3 + 10, -local27 + 1 + (arg0 - -(arg1.method5960() * arg4)), arg6.anInt109);
		}
		@Pc(79) int local79 = arg6.anInt98;
		if (arg2.aBoolean77 && arg6.anInt117 != -1) {
			local79 = arg6.anInt117;
		}
		for (@Pc(91) int local91 = 0; local91 < arg4; local91++) {
			@Pc(97) String local97 = Static427.aStringArray45[local91];
			if (local91 < arg4 - 1) {
				local97 = local97.substring(0, local97.length() - 4);
			}
			arg1.method5956(arg5, local97, arg2.anInt950, arg0, local79);
			arg0 += arg1.method5960();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)I")
	public static int method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static169.anIntArray159[arg0 & 0x3] : 256;
	}
}
