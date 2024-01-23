import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub2_Sub15_Sub1 extends Class1_Sub2_Sub15 {

	@OriginalMember(owner = "client!uc", name = "Gb", descriptor = "[[B")
	private byte[][] aByteArrayArray11 = new byte[256][];

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub15_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray11 = arg5;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub15_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static205.anInt4388;
		@Pc(9) int local9 = Static205.anInt4388 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static205.anInt4393) {
			local20 = Static205.anInt4393 - arg2;
			arg4 -= local20;
			arg2 = Static205.anInt4393;
			local13 = local20 * arg3;
			local5 += local20 * Static205.anInt4388;
		}
		if (arg2 + arg4 > Static205.anInt4390) {
			arg4 -= arg2 + arg4 - Static205.anInt4390;
		}
		if (arg1 < Static205.anInt4392) {
			local20 = Static205.anInt4392 - arg1;
			arg3 -= local20;
			arg1 = Static205.anInt4392;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static205.anInt4391) {
			local20 = arg1 + arg3 - Static205.anInt4391;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static205.anIntArray359 == null) {
			Static244.method3352(Static205.anIntArray358, this.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static244.method3354(Static205.anIntArray358, this.aByteArrayArray11[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static205.anIntArray359, Static205.anIntArray360);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static205.anInt4388;
		@Pc(9) int local9 = Static205.anInt4388 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static205.anInt4393) {
			local20 = Static205.anInt4393 - arg2;
			arg4 -= local20;
			arg2 = Static205.anInt4393;
			local13 = local20 * arg3;
			local5 += local20 * Static205.anInt4388;
		}
		if (arg2 + arg4 > Static205.anInt4390) {
			arg4 -= arg2 + arg4 - Static205.anInt4390;
		}
		if (arg1 < Static205.anInt4392) {
			local20 = Static205.anInt4392 - arg1;
			arg3 -= local20;
			arg1 = Static205.anInt4392;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static205.anInt4391) {
			local20 = arg1 + arg3 - Static205.anInt4391;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static244.method3353(Static205.anIntArray358, this.aByteArrayArray11[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
