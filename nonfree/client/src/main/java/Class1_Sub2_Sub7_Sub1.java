import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class1_Sub2_Sub7_Sub1 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!hg", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub7_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub7_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray4 = arg5;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static189.anInt4234;
		@Pc(9) int local9 = Static189.anInt4234 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static189.anInt4231) {
			local20 = Static189.anInt4231 - arg2;
			arg4 -= local20;
			arg2 = Static189.anInt4231;
			local13 = local20 * arg3;
			local5 += local20 * Static189.anInt4234;
		}
		if (arg2 + arg4 > Static189.anInt4233) {
			arg4 -= arg2 + arg4 - Static189.anInt4233;
		}
		if (arg1 < Static189.anInt4232) {
			local20 = Static189.anInt4232 - arg1;
			arg3 -= local20;
			arg1 = Static189.anInt4232;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static189.anInt4229) {
			local20 = arg1 + arg3 - Static189.anInt4229;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		}
		if (Static189.anIntArray318 == null) {
			Static272.method1948(Static189.anIntArray319, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		} else {
			Static272.method1946(Static189.anIntArray319, this.aByteArrayArray4[arg0], arg1, arg2, arg3, arg4, arg5, local13, local5, local9, local11, Static189.anIntArray318, Static189.anIntArray317);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static189.anInt4234;
		@Pc(9) int local9 = Static189.anInt4234 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static189.anInt4231) {
			local20 = Static189.anInt4231 - arg2;
			arg4 -= local20;
			arg2 = Static189.anInt4231;
			local13 = local20 * arg3;
			local5 += local20 * Static189.anInt4234;
		}
		if (arg2 + arg4 > Static189.anInt4233) {
			arg4 -= arg2 + arg4 - Static189.anInt4233;
		}
		if (arg1 < Static189.anInt4232) {
			local20 = Static189.anInt4232 - arg1;
			arg3 -= local20;
			arg1 = Static189.anInt4232;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static189.anInt4229) {
			local20 = arg1 + arg3 - Static189.anInt4229;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static272.method1947(Static189.anIntArray319, this.aByteArrayArray4[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
