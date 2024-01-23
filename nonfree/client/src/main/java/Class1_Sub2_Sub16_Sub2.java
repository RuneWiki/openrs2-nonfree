import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub16_Sub2 extends Class1_Sub2_Sub16 {

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray115 = new byte[256][];

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub16_Sub2(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub16_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray115 = arg5;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static203.anInt4507;
		@Pc(9) int local9 = Static203.anInt4507 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static203.anInt4509) {
			local20 = Static203.anInt4509 - arg2;
			arg4 -= local20;
			arg2 = Static203.anInt4509;
			local13 = local20 * arg3;
			local5 += local20 * Static203.anInt4507;
		}
		if (arg2 + arg4 > Static203.anInt4506) {
			arg4 -= arg2 + arg4 - Static203.anInt4506;
		}
		if (arg1 < Static203.anInt4508) {
			local20 = Static203.anInt4508 - arg1;
			arg3 -= local20;
			arg1 = Static203.anInt4508;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static203.anInt4510) {
			local20 = arg1 + arg3 - Static203.anInt4510;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static309.method3988(Static203.anIntArray460, this.aByteArrayArray115[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static203.anInt4507;
		@Pc(9) int local9 = Static203.anInt4507 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static203.anInt4509) {
			local20 = Static203.anInt4509 - arg2;
			arg4 -= local20;
			arg2 = Static203.anInt4509;
			local13 = local20 * arg3;
			local5 += local20 * Static203.anInt4507;
		}
		if (arg2 + arg4 > Static203.anInt4506) {
			arg4 -= arg2 + arg4 - Static203.anInt4506;
		}
		if (arg1 < Static203.anInt4508) {
			local20 = Static203.anInt4508 - arg1;
			arg3 -= local20;
			arg1 = Static203.anInt4508;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static203.anInt4510) {
			local20 = arg1 + arg3 - Static203.anInt4510;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static203.anIntArray462 == null) {
			Static309.method3989(Static203.anIntArray460, this.aByteArrayArray115[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static309.method3990(Static203.anIntArray460, this.aByteArrayArray115[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static203.anIntArray462, Static203.anIntArray461);
		}
	}
}
