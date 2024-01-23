import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class1_Sub2_Sub11_Sub1 extends Class1_Sub2_Sub11 {

	@OriginalMember(owner = "client!nf", name = "Hb", descriptor = "[[B")
	protected byte[][] aByteArrayArray6 = new byte[256][];

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub11_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub11_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray6 = arg5;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected final void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 * Static96.anInt2126 + arg1;
		@Pc(13) int local13 = Static96.anInt2126 - arg3;
		@Pc(15) int local15 = 0;
		@Pc(26) int local26;
		if (Static96.anInt2124 > arg2) {
			local26 = Static96.anInt2124 - arg2;
			local15 = local26 * arg3;
			arg2 = Static96.anInt2124;
			arg4 -= local26;
			local9 += local26 * Static96.anInt2126;
		}
		if (arg4 + arg2 > Static96.anInt2125) {
			arg4 -= arg2 + arg4 - Static96.anInt2125;
		}
		@Pc(60) int local60 = 0;
		if (Static96.anInt2121 > arg1) {
			local26 = Static96.anInt2121 - arg1;
			local9 += local26;
			arg3 -= local26;
			local13 += local26;
			arg1 = Static96.anInt2121;
			local15 += local26;
			local60 = local26;
		}
		if (arg3 + arg1 > Static96.anInt2123) {
			local26 = arg1 + arg3 - Static96.anInt2123;
			arg3 -= local26;
			local13 += local26;
			local60 += local26;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static147.method2522(arg4, Static96.anIntArray137, this.aByteArrayArray6[arg0], local15, arg6, arg3, local13, local9, local60, arg5);
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg1 + arg2 * Static96.anInt2126;
		@Pc(14) int local14 = Static96.anInt2126 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		if (arg2 < Static96.anInt2124) {
			local30 = Static96.anInt2124 - arg2;
			arg2 = Static96.anInt2124;
			arg4 -= local30;
			local10 += local30 * Static96.anInt2126;
			local16 = arg3 * local30;
		}
		if (arg2 + arg4 > Static96.anInt2125) {
			arg4 -= arg2 + arg4 - Static96.anInt2125;
		}
		if (arg1 < Static96.anInt2121) {
			local30 = Static96.anInt2121 - arg1;
			arg3 -= local30;
			local14 += local30;
			local18 = local30;
			local10 += local30;
			arg1 = Static96.anInt2121;
			local16 += local30;
		}
		if (arg1 + arg3 > Static96.anInt2123) {
			local30 = arg1 + arg3 - Static96.anInt2123;
			local14 += local30;
			arg3 -= local30;
			local18 += local30;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static103.method3818(local14, this.aByteArrayArray6[arg0], Static96.anIntArray137, arg5, local10, arg3, local16, arg4, local18);
		}
	}
}
