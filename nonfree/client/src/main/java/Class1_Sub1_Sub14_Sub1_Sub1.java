import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub1_Sub14_Sub1_Sub1 extends Class1_Sub1_Sub14_Sub1 {

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub14_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub1_Sub14_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected void method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static76.anInt1846;
		@Pc(9) int local9 = Static76.anInt1846 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static76.anInt1847) {
			local20 = Static76.anInt1847 - arg2;
			arg4 -= local20;
			arg2 = Static76.anInt1847;
			local13 = local20 * arg3;
			local5 += local20 * Static76.anInt1846;
		}
		if (arg2 + arg4 > Static76.anInt1844) {
			arg4 -= arg2 + arg4 - Static76.anInt1844;
		}
		if (arg1 < Static76.anInt1843) {
			local20 = Static76.anInt1843 - arg1;
			arg3 -= local20;
			arg1 = Static76.anInt1843;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static76.anInt1845) {
			local20 = arg1 + arg3 - Static76.anInt1845;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static197.method3072(super.aByteArrayArray10[arg0], arg5, arg6, Static76.anIntArray214, arg4, local5, local11, arg3, local9, local13);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected void method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static76.anInt1846;
		@Pc(9) int local9 = Static76.anInt1846 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static76.anInt1847) {
			local20 = Static76.anInt1847 - arg2;
			arg4 -= local20;
			arg2 = Static76.anInt1847;
			local13 = local20 * arg3;
			local5 += local20 * Static76.anInt1846;
		}
		if (arg2 + arg4 > Static76.anInt1844) {
			arg4 -= arg2 + arg4 - Static76.anInt1844;
		}
		if (arg1 < Static76.anInt1843) {
			local20 = Static76.anInt1843 - arg1;
			arg3 -= local20;
			arg1 = Static76.anInt1843;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static76.anInt1845) {
			local20 = arg1 + arg3 - Static76.anInt1845;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static19.method333(Static76.anIntArray214, arg3, arg5, arg4, local11, local9, local13, super.aByteArrayArray10[arg0], local5);
		}
	}
}
