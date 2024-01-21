import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class5_Sub2_Sub8_Sub1_Sub1 extends Class5_Sub2_Sub8_Sub1 {

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub8_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class5_Sub2_Sub8_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected void method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static42.anInt969;
		@Pc(9) int local9 = Static42.anInt969 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static42.anInt972) {
			local20 = Static42.anInt972 - arg2;
			arg4 -= local20;
			arg2 = Static42.anInt972;
			local13 = local20 * arg3;
			local5 += local20 * Static42.anInt969;
		}
		if (arg2 + arg4 > Static42.anInt974) {
			arg4 -= arg2 + arg4 - Static42.anInt974;
		}
		if (arg1 < Static42.anInt973) {
			local20 = Static42.anInt973 - arg1;
			arg3 -= local20;
			arg1 = Static42.anInt973;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static42.anInt970) {
			local20 = arg1 + arg3 - Static42.anInt970;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static129.method2008(local11, Static42.anIntArray92, local13, local5, local9, arg4, arg5, super.aByteArrayArray5[arg0], arg3);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected void method1344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static42.anInt969;
		@Pc(9) int local9 = Static42.anInt969 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static42.anInt972) {
			local20 = Static42.anInt972 - arg2;
			arg4 -= local20;
			arg2 = Static42.anInt972;
			local13 = local20 * arg3;
			local5 += local20 * Static42.anInt969;
		}
		if (arg2 + arg4 > Static42.anInt974) {
			arg4 -= arg2 + arg4 - Static42.anInt974;
		}
		if (arg1 < Static42.anInt973) {
			local20 = Static42.anInt973 - arg1;
			arg3 -= local20;
			arg1 = Static42.anInt973;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static42.anInt970) {
			local20 = arg1 + arg3 - Static42.anInt970;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static54.method939(arg6, local9, local5, arg3, arg5, local13, Static42.anIntArray92, arg4, local11, super.aByteArrayArray5[arg0]);
		}
	}
}
