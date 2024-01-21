import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public abstract class Class2_Sub2_Sub5_Sub1 extends Class2_Sub2_Sub5 {

	@OriginalMember(owner = "client!ch", name = "tb", descriptor = "[[B")
	protected byte[][] aByteArrayArray8 = new byte[256][];

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub2_Sub5_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray8 = arg5;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub5_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = Static126.anInt2775 * arg2 + arg1;
		@Pc(14) int local14 = Static126.anInt2775 - arg3;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(26) int local26;
		if (Static126.anInt2776 > arg2) {
			local26 = Static126.anInt2776 - arg2;
			arg4 -= local26;
			arg2 = Static126.anInt2776;
			local18 = local26 * arg3;
			local9 += Static126.anInt2775 * local26;
		}
		if (Static126.anInt2778 < arg4 + arg2) {
			arg4 -= arg4 + arg2 - Static126.anInt2778;
		}
		if (Static126.anInt2774 > arg1) {
			local26 = Static126.anInt2774 - arg1;
			local14 += local26;
			local18 += local26;
			local9 += local26;
			arg1 = Static126.anInt2774;
			arg3 -= local26;
			local16 = local26;
		}
		if (Static126.anInt2777 < arg3 + arg1) {
			local26 = arg3 + arg1 - Static126.anInt2777;
			local16 += local26;
			arg3 -= local26;
			local14 += local26;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static142.method2283(local14, local16, arg5, Static126.anIntArray279, arg3, this.aByteArrayArray8[arg0], local18, arg4, local9);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected final void method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = Static126.anInt2775 - arg3;
		@Pc(14) int local14 = Static126.anInt2775 * arg2 + arg1;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(29) int local29;
		if (arg2 < Static126.anInt2776) {
			local29 = Static126.anInt2776 - arg2;
			local14 += local29 * Static126.anInt2775;
			arg2 = Static126.anInt2776;
			arg4 -= local29;
			local18 = local29 * arg3;
		}
		if (Static126.anInt2778 < arg4 + arg2) {
			arg4 -= arg2 + arg4 - Static126.anInt2778;
		}
		if (arg1 < Static126.anInt2774) {
			local29 = Static126.anInt2774 - arg1;
			local16 = local29;
			local18 += local29;
			arg3 -= local29;
			arg1 = Static126.anInt2774;
			local8 += local29;
			local14 += local29;
		}
		if (arg1 + arg3 > Static126.anInt2777) {
			local29 = arg1 + arg3 - Static126.anInt2777;
			local16 += local29;
			local8 += local29;
			arg3 -= local29;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static82.method1479(local16, arg5, Static126.anIntArray279, arg3, local8, local18, this.aByteArrayArray8[arg0], arg4, arg6, local14);
		}
	}
}
