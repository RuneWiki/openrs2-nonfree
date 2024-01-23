import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public abstract class Class2_Sub3_Sub7_Sub1 extends Class2_Sub3_Sub7 {

	@OriginalMember(owner = "client!qd", name = "Gb", descriptor = "[[B")
	protected byte[][] aByteArrayArray7 = new byte[256][];

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3_Sub7_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub3_Sub7_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray7 = arg5;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg1 + arg2 * Static217.anInt4732;
		@Pc(14) int local14 = Static217.anInt4732 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		if (arg2 < Static217.anInt4734) {
			local30 = Static217.anInt4734 - arg2;
			local18 = local30 * arg3;
			arg4 -= local30;
			local9 += local30 * Static217.anInt4732;
			arg2 = Static217.anInt4734;
		}
		if (arg4 + arg2 > Static217.anInt4730) {
			arg4 -= arg2 + arg4 - Static217.anInt4730;
		}
		if (arg1 < Static217.anInt4735) {
			local30 = Static217.anInt4735 - arg1;
			arg1 = Static217.anInt4735;
			local16 = local30;
			local14 += local30;
			local18 += local30;
			local9 += local30;
			arg3 -= local30;
		}
		if (arg3 + arg1 > Static217.anInt4731) {
			local30 = arg1 + arg3 - Static217.anInt4731;
			arg3 -= local30;
			local14 += local30;
			local16 += local30;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static77.method1313(arg4, local16, local14, local18, arg5, this.aByteArrayArray7[arg0], Static217.anIntArray752, local9, arg3);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIIII)V")
	@Override
	protected final void method902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg1 + Static217.anInt4732 * arg2;
		@Pc(14) int local14 = Static217.anInt4732 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(29) int local29;
		if (arg2 < Static217.anInt4734) {
			local29 = Static217.anInt4734 - arg2;
			arg2 = Static217.anInt4734;
			local18 = local29 * arg3;
			arg4 -= local29;
			local9 += Static217.anInt4732 * local29;
		}
		if (Static217.anInt4730 < arg4 + arg2) {
			arg4 -= arg4 + arg2 - Static217.anInt4730;
		}
		if (arg1 < Static217.anInt4735) {
			local29 = Static217.anInt4735 - arg1;
			arg3 -= local29;
			local18 += local29;
			local16 = local29;
			local14 += local29;
			local9 += local29;
			arg1 = Static217.anInt4735;
		}
		if (arg3 + arg1 > Static217.anInt4731) {
			local29 = arg3 + arg1 - Static217.anInt4731;
			local16 += local29;
			local14 += local29;
			arg3 -= local29;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static200.method3567(arg3, local14, local9, local18, this.aByteArrayArray7[arg0], Static217.anIntArray752, arg5, arg4, arg6, local16);
		}
	}
}
