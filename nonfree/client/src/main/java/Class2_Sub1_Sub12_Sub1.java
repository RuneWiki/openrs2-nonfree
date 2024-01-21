import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public abstract class Class2_Sub1_Sub12_Sub1 extends Class2_Sub1_Sub12 {

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "[[B")
	protected byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub12_Sub1(@OriginalArg(0) byte[] arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class2_Sub1_Sub12_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aByteArrayArray5 = arg5;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IIIIII)V")
	@Override
	protected final void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 * Static212.anInt4430 + arg1;
		@Pc(13) int local13 = Static212.anInt4430 - arg3;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(28) int local28;
		if (arg2 < Static212.anInt4426) {
			local28 = Static212.anInt4426 - arg2;
			local17 = arg3 * local28;
			arg4 -= local28;
			arg2 = Static212.anInt4426;
			local9 += Static212.anInt4430 * local28;
		}
		if (Static212.anInt4428 < arg4 + arg2) {
			arg4 -= arg2 + arg4 - Static212.anInt4428;
		}
		if (arg1 < Static212.anInt4429) {
			local28 = Static212.anInt4429 - arg1;
			local15 = local28;
			local17 += local28;
			arg1 = Static212.anInt4429;
			local13 += local28;
			arg3 -= local28;
			local9 += local28;
		}
		if (Static212.anInt4427 < arg1 + arg3) {
			local28 = arg3 + arg1 - Static212.anInt4427;
			local15 += local28;
			arg3 -= local28;
			local13 += local28;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static197.method2840(arg4, local15, arg5, local9, arg3, local13, this.aByteArrayArray5[arg0], Static212.anIntArray398, local17);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	@Override
	protected final void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = Static212.anInt4430 - arg3;
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(18) int local18 = arg1 + Static212.anInt4430 * arg2;
		@Pc(30) int local30;
		if (arg2 < Static212.anInt4426) {
			local30 = Static212.anInt4426 - arg2;
			arg4 -= local30;
			arg2 = Static212.anInt4426;
			local18 += Static212.anInt4430 * local30;
			local12 = local30 * arg3;
		}
		if (Static212.anInt4428 < arg2 + arg4) {
			arg4 -= arg2 + arg4 - Static212.anInt4428;
		}
		if (Static212.anInt4429 > arg1) {
			local30 = Static212.anInt4429 - arg1;
			arg3 -= local30;
			local12 += local30;
			local10 = local30;
			local8 += local30;
			local18 += local30;
			arg1 = Static212.anInt4429;
		}
		if (arg1 + arg3 > Static212.anInt4427) {
			local30 = arg3 + arg1 - Static212.anInt4427;
			arg3 -= local30;
			local10 += local30;
			local8 += local30;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static26.method2652(arg4, arg5, Static212.anIntArray398, this.aByteArrayArray5[arg0], local18, local10, local8, arg6, arg3, local12);
		}
	}
}
