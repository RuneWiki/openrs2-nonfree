import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public abstract class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	protected int anInt5652;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	protected int anInt5654;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
	protected int anInt5676;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
	protected int anInt5677;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!sq;")
	protected final Class155_Sub2 aClass155_Sub2_9;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	protected final int anInt5653;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	protected final int anInt5655;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!sq;II)V")
	protected Class110_Sub2(@OriginalArg(0) Class155_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass155_Sub2_9 = arg0;
		this.anInt5653 = arg1;
		this.anInt5655 = arg2;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	public abstract void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
	@Override
	public final int method5101() {
		return this.anInt5676 + this.anInt5653 + this.anInt5654;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFF)V")
	private void method5104(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5676 + this.anInt5653 + this.anInt5654;
		@Pc(17) int local17 = this.anInt5677 + this.anInt5655 + this.anInt5652;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5653 || local17 != this.anInt5655) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5677;
			local65 = local53 * (float) this.anInt5677;
			local71 = local32 * (float) this.anInt5676;
			local77 = local39 * (float) this.anInt5676;
			@Pc(84) float local84 = -local32 * (float) this.anInt5654;
			@Pc(91) float local91 = -local39 * (float) this.anInt5654;
			@Pc(98) float local98 = -local46 * (float) this.anInt5652;
			@Pc(105) float local105 = -local53 * (float) this.anInt5652;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass155_Sub2_9.anInt5485) {
			local46 = this.aClass155_Sub2_9.anInt5485;
		}
		if (local53 > (float) this.aClass155_Sub2_9.anInt5481) {
			local53 = this.aClass155_Sub2_9.anInt5481;
		}
		if (local59 < (float) this.aClass155_Sub2_9.anInt5495) {
			local59 = this.aClass155_Sub2_9.anInt5495;
		}
		if (local65 > (float) this.aClass155_Sub2_9.anInt5473) {
			local65 = this.aClass155_Sub2_9.anInt5473;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static215.anInt5658 = this.aClass155_Sub2_9.anInt5474;
		Static215.anInt5665 = (int) ((float) ((int) local59 * Static215.anInt5658) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static215.anInt5671 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5653 / local71);
		Static215.anInt5675 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5655 / local77);
		Static215.anInt5651 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5653 / local77);
		Static215.anInt5661 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5655 / local71);
		Static215.anInt5667 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static215.anInt5674 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static215.anInt5666 = (this.anInt5653 >> 1 << 12) + (Static215.anInt5674 * Static215.anInt5651 >> 4);
		Static215.anInt5680 = (this.anInt5655 >> 1 << 12) + (Static215.anInt5674 * Static215.anInt5661 >> 4);
		Static215.anInt5664 = Static215.anInt5667 * Static215.anInt5671 >> 4;
		Static215.anInt5659 = Static215.anInt5667 * Static215.anInt5675 >> 4;
		Static215.anInt5662 = (int) local46;
		Static215.anInt5670 = (int) local53;
		Static215.anInt5669 = (int) local59;
		Static215.anInt5672 = (int) local65;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()I")
	@Override
	public final int method5091() {
		return this.anInt5653;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass155_Sub2_9.method4966()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray610 == null) {
			this.anIntArray610 = new int[4];
		}
		this.aClass155_Sub2_9.method4941(this.anIntArray610);
		this.aClass155_Sub2_9.method4922(this.aClass155_Sub2_9.anInt5485, this.aClass155_Sub2_9.anInt5495, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5101();
		@Pc(40) int local40 = this.method5097();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5085(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass155_Sub2_9.method4867(this.anIntArray610[0], this.anIntArray610[1], this.anIntArray610[2], this.anIntArray610[3]);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!sm;II)V")
	public abstract void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5676 = arg0;
		this.anInt5677 = arg1;
		this.anInt5654 = arg2;
		this.anInt5652 = arg3;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
	@Override
	public final int method5090() {
		return this.anInt5655;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([I[III)V")
	protected abstract void method5105(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFFLclient!sm;II)V")
	@Override
	protected final void method5089(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class38 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass155_Sub2_9.method4966()) {
			throw new IllegalStateException();
		}
		this.method5104(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class38_Sub1 local18 = (Class38_Sub1) arg6;
		this.method5105(local18.anIntArray78, local18.anIntArray79, Static215.anInt5662 - arg7, -arg8 - (Static215.anInt5672 - Static215.anInt5669));
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	protected abstract void method5106(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5088(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass155_Sub2_9.method4966()) {
			throw new IllegalStateException();
		}
		this.method5104(arg0, arg1, arg2, arg3, arg4, arg5);
		Static215.anInt5679 = arg7;
		if (arg6 != 0) {
			Static215.anInt5668 = arg7 >>> 24;
			Static215.anInt5650 = 256 - Static215.anInt5668;
			if (arg6 == 1) {
				Static215.anInt5663 = arg7 >> 16 & 0xFF;
				Static215.anInt5656 = arg7 >> 8 & 0xFF;
				Static215.anInt5657 = arg7 & 0xFF;
			} else {
				Static215.anInt5660 = arg7 >>> 24;
				Static215.anInt5673 = 256 - Static215.anInt5660;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static215.anInt5673 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static215.anInt5673 & 0xFF0000;
				Static215.anInt5678 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5106(0);
		} else if (arg6 == 1) {
			this.method5106(1);
		} else if (arg6 == 2) {
			this.method5106(2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()I")
	@Override
	public final int method5097() {
		return this.anInt5677 + this.anInt5655 + this.anInt5652;
	}
}
