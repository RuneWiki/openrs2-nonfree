import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public abstract class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	protected int anInt4748;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
	protected int anInt4756;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	protected int anInt4769;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
	protected int anInt4773;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "Lclient!pk;")
	protected final Class4_Sub2 aClass4_Sub2_9;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
	protected final int anInt4766;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
	protected final int anInt4751;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!pk;II)V")
	protected Class31_Sub1(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub2_9 = arg0;
		this.anInt4766 = arg1;
		this.anInt4751 = arg2;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4773 = arg0;
		this.anInt4748 = arg1;
		this.anInt4756 = arg2;
		this.anInt4769 = arg3;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFFLclient!hb;II)V")
	@Override
	protected final void method4380(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class77 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass4_Sub2_9.method4307()) {
			throw new IllegalStateException();
		}
		this.method4395(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class77_Sub1 local18 = (Class77_Sub1) arg6;
		this.method4396(local18.anIntArray281, local18.anIntArray282, Static176.anInt4758 - arg7, -arg8 - (Static176.anInt4755 - Static176.anInt4767));
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass4_Sub2_9.method4307()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray373 == null) {
			this.anIntArray373 = new int[4];
		}
		this.aClass4_Sub2_9.method4235(this.anIntArray373);
		this.aClass4_Sub2_9.method4210(this.aClass4_Sub2_9.anInt4694, this.aClass4_Sub2_9.anInt4708, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4376();
		@Pc(40) int local40 = this.method4378();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4379(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass4_Sub2_9.method4252(this.anIntArray373[0], this.anIntArray373[1], this.anIntArray373[2], this.anIntArray373[3]);
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "()I")
	@Override
	public final int method4392() {
		return this.anInt4766;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()I")
	@Override
	public final int method4376() {
		return this.anInt4773 + this.anInt4766 + this.anInt4756;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!hb;II)V")
	public abstract void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "()I")
	@Override
	public final int method4393() {
		return this.anInt4751;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
	protected abstract void method4394(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFF)V")
	private void method4395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4773 + this.anInt4766 + this.anInt4756;
		@Pc(17) int local17 = this.anInt4748 + this.anInt4751 + this.anInt4769;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4766 || local17 != this.anInt4751) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4748;
			local65 = local53 * (float) this.anInt4748;
			local71 = local32 * (float) this.anInt4773;
			local77 = local39 * (float) this.anInt4773;
			@Pc(84) float local84 = -local32 * (float) this.anInt4756;
			@Pc(91) float local91 = -local39 * (float) this.anInt4756;
			@Pc(98) float local98 = -local46 * (float) this.anInt4769;
			@Pc(105) float local105 = -local53 * (float) this.anInt4769;
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
		if (local46 < (float) this.aClass4_Sub2_9.anInt4694) {
			local46 = this.aClass4_Sub2_9.anInt4694;
		}
		if (local53 > (float) this.aClass4_Sub2_9.anInt4690) {
			local53 = this.aClass4_Sub2_9.anInt4690;
		}
		if (local59 < (float) this.aClass4_Sub2_9.anInt4708) {
			local59 = this.aClass4_Sub2_9.anInt4708;
		}
		if (local65 > (float) this.aClass4_Sub2_9.anInt4700) {
			local65 = this.aClass4_Sub2_9.anInt4700;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static176.anInt4778 = this.aClass4_Sub2_9.anInt4713;
		Static176.anInt4761 = (int) ((float) ((int) local59 * Static176.anInt4778) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static176.anInt4771 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4766 / local71);
		Static176.anInt4764 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4751 / local77);
		Static176.anInt4752 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4766 / local77);
		Static176.anInt4754 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4751 / local71);
		Static176.anInt4772 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static176.anInt4750 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static176.anInt4759 = (this.anInt4766 >> 1 << 12) + (Static176.anInt4750 * Static176.anInt4752 >> 4);
		Static176.anInt4749 = (this.anInt4751 >> 1 << 12) + (Static176.anInt4750 * Static176.anInt4754 >> 4);
		Static176.anInt4777 = Static176.anInt4772 * Static176.anInt4771 >> 4;
		Static176.anInt4760 = Static176.anInt4772 * Static176.anInt4764 >> 4;
		Static176.anInt4758 = (int) local46;
		Static176.anInt4753 = (int) local53;
		Static176.anInt4767 = (int) local59;
		Static176.anInt4755 = (int) local65;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "()I")
	@Override
	public final int method4378() {
		return this.anInt4748 + this.anInt4751 + this.anInt4769;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([I[III)V")
	protected abstract void method4396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method4375(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass4_Sub2_9.method4307()) {
			throw new IllegalStateException();
		}
		this.method4395(arg0, arg1, arg2, arg3, arg4, arg5);
		Static176.anInt4776 = arg7;
		if (arg6 != 0) {
			Static176.anInt4775 = arg7 >>> 24;
			Static176.anInt4757 = 256 - Static176.anInt4775;
			if (arg6 == 1) {
				Static176.anInt4762 = arg7 >> 16 & 0xFF;
				Static176.anInt4763 = arg7 >> 8 & 0xFF;
				Static176.anInt4774 = arg7 & 0xFF;
			} else {
				Static176.anInt4768 = arg7 >>> 24;
				Static176.anInt4770 = 256 - Static176.anInt4768;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static176.anInt4770 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static176.anInt4770 & 0xFF0000;
				Static176.anInt4765 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4394(0);
		} else if (arg6 == 1) {
			this.method4394(1);
		} else if (arg6 == 2) {
			this.method4394(2);
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
	public abstract void method4379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
