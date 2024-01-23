import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public abstract class Class1_Sub1_Sub14_Sub1 extends Class1_Sub1_Sub14 {

	@OriginalMember(owner = "client!ob", name = "Gb", descriptor = "[I")
	public static int[] anIntArray593 = new int[4096];

	@OriginalMember(owner = "client!ob", name = "Db", descriptor = "[[B")
	protected byte[][] aByteArrayArray10 = new byte[256][];

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray593[local12] = Static197.method3068(local12);
		}
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub1_Sub14_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray10 = arg5;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub14_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected final void method3311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg2 * Static76.anInt1846 + arg1;
		@Pc(13) int local13 = Static76.anInt1846 - arg3;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25;
		if (Static76.anInt1847 > arg2) {
			local25 = Static76.anInt1847 - arg2;
			local5 += local25 * Static76.anInt1846;
			arg4 -= local25;
			arg2 = Static76.anInt1847;
			local17 = local25 * arg3;
		}
		if (Static76.anInt1843 > arg1) {
			local25 = Static76.anInt1843 - arg1;
			local17 += local25;
			local5 += local25;
			local15 = local25;
			local13 += local25;
			arg3 -= local25;
			arg1 = Static76.anInt1843;
		}
		if (Static76.anInt1844 < arg4 + arg2) {
			arg4 -= arg4 + arg2 - Static76.anInt1844;
		}
		if (Static76.anInt1845 < arg3 + arg1) {
			local25 = arg1 + arg3 - Static76.anInt1845;
			arg3 -= local25;
			local13 += local25;
			local15 += local25;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static197.method3072(this.aByteArrayArray10[arg0], arg5, arg6, Static76.anIntArray214, arg4, local5, local15, arg3, local13, local17);
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void method3318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg1 + Static76.anInt1846 * arg2;
		@Pc(11) int local11 = Static76.anInt1846 - arg3;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27;
		if (Static76.anInt1847 > arg2) {
			local27 = Static76.anInt1847 - arg2;
			local6 += Static76.anInt1846 * local27;
			local19 = arg3 * local27;
			arg2 = Static76.anInt1847;
			arg4 -= local27;
		}
		if (arg2 + arg4 > Static76.anInt1844) {
			arg4 -= arg4 + arg2 - Static76.anInt1844;
		}
		if (arg1 < Static76.anInt1843) {
			local27 = Static76.anInt1843 - arg1;
			arg3 -= local27;
			arg1 = Static76.anInt1843;
			local17 = local27;
			local11 += local27;
			local19 += local27;
			local6 += local27;
		}
		if (arg1 + arg3 > Static76.anInt1845) {
			local27 = arg3 + arg1 - Static76.anInt1845;
			local17 += local27;
			local11 += local27;
			arg3 -= local27;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static19.method333(Static76.anIntArray214, arg3, arg5, arg4, local17, local11, local19, this.aByteArrayArray10[arg0], local6);
		}
	}
}
