import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public abstract class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
	protected int anInt5588;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	protected int anInt5590;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	protected int anInt5594;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "[I")
	private int[] anIntArray629;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
	protected int anInt5606;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!jn;")
	protected final Class81_Sub2 aClass81_Sub2_11;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
	protected final int anInt5604;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	protected final int anInt5592;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!jn;II)V")
	protected Class40_Sub1(@OriginalArg(0) Class81_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass81_Sub2_11 = arg0;
		this.anInt5604 = arg1;
		this.anInt5592 = arg2;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(II)V")
	protected abstract void method5088(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[III)V")
	protected abstract void method5089(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "()I")
	@Override
	public final int method5083() {
		return this.anInt5606 + this.anInt5604 + this.anInt5588;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
	public abstract void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5068(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass81_Sub2_11.method3054()) {
			throw new IllegalStateException();
		}
		this.method5090(arg0, arg1, arg2, arg3, arg4, arg5);
		Static48.anInt5608 = arg7;
		if (arg6 != 0) {
			Static48.anInt5584 = arg7 >>> 24;
			Static48.anInt5589 = 256 - Static48.anInt5584;
			if (arg6 == 1) {
				Static48.anInt5596 = arg7 >> 16 & 0xFF;
				Static48.anInt5602 = arg7 >> 8 & 0xFF;
				Static48.anInt5605 = arg7 & 0xFF;
			} else {
				Static48.anInt5587 = arg7 >>> 24;
				Static48.anInt5586 = 256 - Static48.anInt5587;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static48.anInt5586 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static48.anInt5586 & 0xFF0000;
				Static48.anInt5595 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method5088(0);
		} else if (arg6 == 1) {
			this.method5088(1);
		} else if (arg6 == 2) {
			this.method5088(2);
		}
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "()I")
	@Override
	public final int method5084() {
		return this.anInt5594 + this.anInt5592 + this.anInt5590;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass81_Sub2_11.method3054()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray629 == null) {
			this.anIntArray629 = new int[4];
		}
		this.aClass81_Sub2_11.method2989(this.anIntArray629);
		this.aClass81_Sub2_11.method2953(this.aClass81_Sub2_11.anInt2847, this.aClass81_Sub2_11.anInt2844, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5083();
		@Pc(40) int local40 = this.method5084();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5085(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass81_Sub2_11.method3033(this.anIntArray629[0], this.anIntArray629[1], this.anIntArray629[2], this.anIntArray629[3]);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFF)V")
	private void method5090(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5606 + this.anInt5604 + this.anInt5588;
		@Pc(17) int local17 = this.anInt5594 + this.anInt5592 + this.anInt5590;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5604 || local17 != this.anInt5592) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5594;
			local65 = local53 * (float) this.anInt5594;
			local71 = local32 * (float) this.anInt5606;
			local77 = local39 * (float) this.anInt5606;
			@Pc(84) float local84 = -local32 * (float) this.anInt5588;
			@Pc(91) float local91 = -local39 * (float) this.anInt5588;
			@Pc(98) float local98 = -local46 * (float) this.anInt5590;
			@Pc(105) float local105 = -local53 * (float) this.anInt5590;
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
		if (local46 < (float) this.aClass81_Sub2_11.anInt2847) {
			local46 = this.aClass81_Sub2_11.anInt2847;
		}
		if (local53 > (float) this.aClass81_Sub2_11.anInt2838) {
			local53 = this.aClass81_Sub2_11.anInt2838;
		}
		if (local59 < (float) this.aClass81_Sub2_11.anInt2844) {
			local59 = this.aClass81_Sub2_11.anInt2844;
		}
		if (local65 > (float) this.aClass81_Sub2_11.lb) {
			local65 = this.aClass81_Sub2_11.lb;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static48.anInt5598 = this.aClass81_Sub2_11.anInt2836;
		Static48.anInt5603 = (int) ((float) ((int) local59 * Static48.anInt5598) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static48.anInt5613 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5604 / local71);
		Static48.anInt5597 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5592 / local77);
		Static48.anInt5591 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5604 / local77);
		Static48.anInt5610 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5592 / local71);
		Static48.anInt5593 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static48.anInt5600 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static48.anInt5614 = (this.anInt5604 >> 1 << 12) + (Static48.anInt5600 * Static48.anInt5591 >> 4);
		Static48.anInt5599 = (this.anInt5592 >> 1 << 12) + (Static48.anInt5600 * Static48.anInt5610 >> 4);
		Static48.anInt5609 = Static48.anInt5593 * Static48.anInt5613 >> 4;
		Static48.anInt5611 = Static48.anInt5593 * Static48.anInt5597 >> 4;
		Static48.anInt5601 = (int) local46;
		Static48.anInt5585 = (int) local53;
		Static48.anInt5612 = (int) local59;
		Static48.anInt5607 = (int) local65;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFLclient!rn;II)V")
	@Override
	protected final void method5080(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass81_Sub2_11.method3054()) {
			throw new IllegalStateException();
		}
		this.method5090(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class74_Sub2 local18 = (Class74_Sub2) arg6;
		this.method5089(local18.anIntArray662, local18.anIntArray663, Static48.anInt5601 - arg7, -arg8 - (Static48.anInt5607 - Static48.anInt5612));
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "()I")
	@Override
	public final int method5075() {
		return this.anInt5592;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5606 = arg0;
		this.anInt5594 = arg1;
		this.anInt5588 = arg2;
		this.anInt5590 = arg3;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "()I")
	@Override
	public final int method5071() {
		return this.anInt5604;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!rn;II)V")
	public abstract void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
