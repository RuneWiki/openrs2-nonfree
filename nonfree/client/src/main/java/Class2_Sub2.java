import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
	protected int anInt5637;

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
	protected int anInt5641;

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
	protected int anInt5649;

	@OriginalMember(owner = "client!tw", name = "u", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!tw", name = "B", descriptor = "I")
	protected int anInt5658;

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "Lclient!jba;")
	protected final Class122_Sub1 aClass122_Sub1_12;

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
	protected final int anInt5646;

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
	protected final int anInt5636;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!jba;II)V")
	protected Class2_Sub2(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub1_12 = arg0;
		this.anInt5646 = arg1;
		this.anInt5636 = arg2;
	}

	@OriginalMember(owner = "client!tw", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt5636;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tw", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass122_Sub1_12.method7291()) {
			throw new IllegalStateException();
		} else if (this.method4826(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static478.anInt5660 = arg7;
			if (arg6 != 1) {
				Static478.anInt5647 = arg7 >>> 24;
				Static478.anInt5661 = 256 - Static478.anInt5647;
				if (arg6 == 0) {
					Static478.anInt5639 = arg7 >> 16 & 0xFF;
					Static478.anInt5634 = arg7 >> 8 & 0xFF;
					Static478.anInt5656 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static478.anInt5645 = arg7 >>> 24;
					Static478.anInt5642 = 256 - Static478.anInt5645;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static478.anInt5642 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static478.anInt5642 & 0xFF0000;
					Static478.anInt5663 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method4827(1);
			} else if (arg6 == 0) {
				this.method4827(0);
			} else if (arg6 == 3) {
				this.method4827(3);
			} else if (arg6 == 2) {
				this.method4827(2);
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "([I[III)V")
	protected abstract void method4825(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method4826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5637 + this.anInt5646 + this.anInt5658;
		@Pc(17) int local17 = this.anInt5641 + this.anInt5636 + this.anInt5649;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5646 || local17 != this.anInt5636) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5641;
			local65 = local53 * (float) this.anInt5641;
			local71 = local32 * (float) this.anInt5637;
			local77 = local39 * (float) this.anInt5637;
			@Pc(84) float local84 = -local32 * (float) this.anInt5658;
			@Pc(91) float local91 = -local39 * (float) this.anInt5658;
			@Pc(98) float local98 = -local46 * (float) this.anInt5649;
			@Pc(105) float local105 = -local53 * (float) this.anInt5649;
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
		if (local46 < (float) this.aClass122_Sub1_12.anInt8852) {
			local46 = this.aClass122_Sub1_12.anInt8852;
		}
		if (local53 > (float) this.aClass122_Sub1_12.anInt8842) {
			local53 = this.aClass122_Sub1_12.anInt8842;
		}
		if (local59 < (float) this.aClass122_Sub1_12.anInt8843) {
			local59 = this.aClass122_Sub1_12.anInt8843;
		}
		if (local65 > (float) this.aClass122_Sub1_12.anInt8845) {
			local65 = this.aClass122_Sub1_12.anInt8845;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static478.anInt5648 = this.aClass122_Sub1_12.anInt8838;
		Static478.anInt5650 = (int) ((float) ((int) local59 * Static478.anInt5648) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static478.anInt5643 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5646 / local71);
		Static478.anInt5657 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5636 / local77);
		Static478.anInt5653 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5646 / local77);
		Static478.anInt5638 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5636 / local71);
		Static478.anInt5652 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static478.anInt5633 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static478.anInt5659 = (this.anInt5646 >> 1 << 12) + (Static478.anInt5633 * Static478.anInt5653 >> 4);
		Static478.anInt5654 = (this.anInt5636 >> 1 << 12) + (Static478.anInt5633 * Static478.anInt5638 >> 4);
		Static478.anInt5662 = Static478.anInt5652 * Static478.anInt5643 >> 4;
		Static478.anInt5644 = Static478.anInt5652 * Static478.anInt5657 >> 4;
		Static478.anInt5640 = (int) local46;
		Static478.anInt5655 = (int) local53;
		Static478.anInt5651 = (int) local59;
		Static478.anInt5635 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt5641 + this.anInt5636 + this.anInt5649;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method7362(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass122_Sub1_12.method7291()) {
			throw new IllegalStateException();
		} else if (this.method4826(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class40_Sub3 local20 = (Class40_Sub3) arg6;
			this.method4825(local20.anIntArray825, local20.anIntArray824, Static478.anInt5640 - arg7, -arg8 - (Static478.anInt5635 - Static478.anInt5651));
		}
	}

	@OriginalMember(owner = "client!tw", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt5637 + this.anInt5646 + this.anInt5658;
	}

	@OriginalMember(owner = "client!tw", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5637 = arg0;
		this.anInt5641 = arg1;
		this.anInt5658 = arg2;
		this.anInt5649 = arg3;
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt5646;
	}

	@OriginalMember(owner = "client!tw", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
	protected abstract void method4827(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass122_Sub1_12.method7291()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray560 == null) {
			this.anIntArray560 = new int[4];
		}
		this.aClass122_Sub1_12.d(this.anIntArray560);
		this.aClass122_Sub1_12.F(this.aClass122_Sub1_12.anInt8852, this.aClass122_Sub1_12.anInt8843, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.EA();
		@Pc(40) int local40 = this.ma();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.DA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass122_Sub1_12.N(this.anIntArray560[0], this.anIntArray560[1], this.anIntArray560[2], this.anIntArray560[3]);
	}

	@OriginalMember(owner = "client!tw", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
