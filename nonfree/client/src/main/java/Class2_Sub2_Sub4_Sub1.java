import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public abstract class Class2_Sub2_Sub4_Sub1 extends Class2_Sub2_Sub4 {

	@OriginalMember(owner = "client!mg", name = "wb", descriptor = "[[B")
	protected byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub2_Sub4_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray3 = arg5;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected final void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 * Static64.anInt1698 + arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = Static64.anInt1698 - arg3;
		@Pc(18) int local18 = 0;
		@Pc(26) int local26;
		if (Static64.anInt1699 > arg2) {
			local26 = Static64.anInt1699 - arg2;
			arg2 = Static64.anInt1699;
			local18 = arg3 * local26;
			arg4 -= local26;
			local9 += local26 * Static64.anInt1698;
		}
		if (Static64.anInt1700 < arg2 + arg4) {
			arg4 -= arg2 + arg4 - Static64.anInt1700;
		}
		if (arg1 < Static64.anInt1697) {
			local26 = Static64.anInt1697 - arg1;
			arg1 = Static64.anInt1697;
			local11 = local26;
			local16 += local26;
			local18 += local26;
			local9 += local26;
			arg3 -= local26;
		}
		if (Static64.anInt1701 < arg1 + arg3) {
			local26 = arg3 + arg1 - Static64.anInt1701;
			arg3 -= local26;
			local16 += local26;
			local11 += local26;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static83.method1495(Static64.anIntArray163, arg3, arg6, local18, local16, this.aByteArrayArray3[arg0], arg5, local9, arg4, local11);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = Static64.anInt1698 - arg3;
		@Pc(14) int local14 = Static64.anInt1698 * arg2 + arg1;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(25) int local25;
		if (arg2 < Static64.anInt1699) {
			local25 = Static64.anInt1699 - arg2;
			local18 = local25 * arg3;
			arg4 -= local25;
			local14 += Static64.anInt1698 * local25;
			arg2 = Static64.anInt1699;
		}
		if (Static64.anInt1700 < arg2 + arg4) {
			arg4 -= arg4 + arg2 - Static64.anInt1700;
		}
		if (Static64.anInt1697 > arg1) {
			local25 = Static64.anInt1697 - arg1;
			local14 += local25;
			local16 = local25;
			local18 += local25;
			arg3 -= local25;
			local8 += local25;
			arg1 = Static64.anInt1697;
		}
		if (arg1 + arg3 > Static64.anInt1701) {
			local25 = arg1 + arg3 - Static64.anInt1701;
			local8 += local25;
			arg3 -= local25;
			local16 += local25;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static69.method1265(arg5, local16, local14, this.aByteArrayArray3[arg0], arg3, arg4, local8, Static64.anIntArray163, local18);
		}
	}
}
