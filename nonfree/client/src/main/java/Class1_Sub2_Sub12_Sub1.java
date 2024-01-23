import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub2_Sub12_Sub1 extends Class1_Sub2_Sub12 {

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray9 = new byte[256][];

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub12_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub12_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray9 = arg5;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static213.anInt4239;
		@Pc(9) int local9 = Static213.anInt4239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static213.anInt4242) {
			local20 = Static213.anInt4242 - arg2;
			arg4 -= local20;
			arg2 = Static213.anInt4242;
			local13 = local20 * arg3;
			local5 += local20 * Static213.anInt4239;
		}
		if (arg2 + arg4 > Static213.anInt4238) {
			arg4 -= arg2 + arg4 - Static213.anInt4238;
		}
		if (arg1 < Static213.anInt4243) {
			local20 = Static213.anInt4243 - arg1;
			arg3 -= local20;
			arg1 = Static213.anInt4243;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static213.anInt4241) {
			local20 = arg1 + arg3 - Static213.anInt4241;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static307.method3293(Static213.anIntArray495, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static213.anInt4239;
		@Pc(9) int local9 = Static213.anInt4239 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static213.anInt4242) {
			local20 = Static213.anInt4242 - arg2;
			arg4 -= local20;
			arg2 = Static213.anInt4242;
			local13 = local20 * arg3;
			local5 += local20 * Static213.anInt4239;
		}
		if (arg2 + arg4 > Static213.anInt4238) {
			arg4 -= arg2 + arg4 - Static213.anInt4238;
		}
		if (arg1 < Static213.anInt4243) {
			local20 = Static213.anInt4243 - arg1;
			arg3 -= local20;
			arg1 = Static213.anInt4243;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static213.anInt4241) {
			local20 = arg1 + arg3 - Static213.anInt4241;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static213.anIntArray494 == null) {
			Static307.method3294(Static213.anIntArray495, this.aByteArrayArray9[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static307.method3295(Static213.anIntArray495, this.aByteArrayArray9[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static213.anIntArray494, Static213.anIntArray493);
		}
	}
}
