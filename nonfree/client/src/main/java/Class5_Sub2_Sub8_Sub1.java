import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class5_Sub2_Sub8_Sub1 extends Class5_Sub2_Sub8 {

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "[[B")
	protected byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class5_Sub2_Sub8_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray5 = arg5;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub8_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected final void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = Static42.anInt969 * arg2 + arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = Static42.anInt969 - arg3;
		@Pc(24) int local24;
		if (Static42.anInt972 > arg2) {
			local24 = Static42.anInt972 - arg2;
			arg2 = Static42.anInt972;
			local9 += Static42.anInt969 * local24;
			arg4 -= local24;
			local11 = local24 * arg3;
		}
		@Pc(44) int local44 = 0;
		if (Static42.anInt974 < arg2 + arg4) {
			arg4 -= arg2 + arg4 - Static42.anInt974;
		}
		if (arg1 < Static42.anInt973) {
			local24 = Static42.anInt973 - arg1;
			local44 = local24;
			local9 += local24;
			local16 += local24;
			arg3 -= local24;
			local11 += local24;
			arg1 = Static42.anInt973;
		}
		if (arg1 + arg3 > Static42.anInt970) {
			local24 = arg1 + arg3 - Static42.anInt970;
			local16 += local24;
			local44 += local24;
			arg3 -= local24;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static54.method939(arg6, local16, local9, arg3, arg5, local11, Static42.anIntArray92, arg4, local44, this.aByteArrayArray5[arg0]);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 * Static42.anInt969 + arg1;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		if (Static42.anInt972 > arg2) {
			local23 = Static42.anInt972 - arg2;
			local11 = local23 * arg3;
			local9 += Static42.anInt969 * local23;
			arg4 -= local23;
			arg2 = Static42.anInt972;
		}
		@Pc(43) int local43 = 0;
		if (Static42.anInt974 < arg4 + arg2) {
			arg4 -= arg2 + arg4 - Static42.anInt974;
		}
		@Pc(63) int local63 = Static42.anInt969 - arg3;
		if (Static42.anInt973 > arg1) {
			local23 = Static42.anInt973 - arg1;
			local11 += local23;
			local9 += local23;
			local63 += local23;
			arg3 -= local23;
			arg1 = Static42.anInt973;
			local43 = local23;
		}
		if (Static42.anInt970 < arg1 + arg3) {
			local23 = arg3 + arg1 - Static42.anInt970;
			arg3 -= local23;
			local43 += local23;
			local63 += local23;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static129.method2008(local43, Static42.anIntArray92, local11, local9, local63, arg4, arg5, this.aByteArrayArray5[arg0], arg3);
		}
	}
}
