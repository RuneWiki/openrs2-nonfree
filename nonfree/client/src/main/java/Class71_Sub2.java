import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public abstract class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public int anInt9716;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
	private int[] anIntArray706;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public int anInt9720;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public int anInt9726;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	public int anInt9729;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!fv;")
	protected final Class90_Sub2 aClass90_Sub2_17;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	public final int anInt9728;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public final int anInt9710;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!fv;II)V")
	protected Class71_Sub2(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass90_Sub2_17 = arg0;
		this.anInt9728 = arg1;
		this.anInt9710 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected final void method7771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass90_Sub2_17.method6765()) {
			throw new IllegalStateException();
		} else if (this.method7779(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class17_Sub2 local20 = (Class17_Sub2) arg6;
			this.method7777(local20.anIntArray151, local20.anIntArray150, Static218.anInt9711 - arg7, -arg8 - (Static218.anInt9718 - Static218.anInt9712));
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!fa;II)V")
	public abstract void method7769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ie", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass90_Sub2_17.method6765()) {
			throw new IllegalStateException();
		} else if (this.method7779(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static218.anInt9721 = arg7;
			if (arg6 != 1) {
				Static218.anInt9730 = arg7 >>> 24;
				Static218.anInt9727 = 256 - Static218.anInt9730;
				if (arg6 == 0) {
					Static218.anInt9715 = arg7 >> 16 & 0xFF;
					Static218.anInt9717 = arg7 >> 8 & 0xFF;
					Static218.anInt9735 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static218.anInt9725 = arg7 >>> 24;
					Static218.anInt9734 = 256 - Static218.anInt9725;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static218.anInt9734 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static218.anInt9734 & 0xFF0000;
					Static218.anInt9724 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7778(1);
			} else if (arg6 == 0) {
				this.method7778(0);
			} else if (arg6 == 3) {
				this.method7778(3);
			} else if (arg6 == 2) {
				this.method7778(2);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[III)V")
	protected abstract void method7777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
	@Override
	public final int b() {
		return this.anInt9710;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	protected abstract void method7778(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7779(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt9716 + this.anInt9728 + this.anInt9729;
		@Pc(17) int local17 = this.anInt9720 + this.anInt9710 + this.anInt9726;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt9728 || local17 != this.anInt9710) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt9720;
			local65 = local53 * (float) this.anInt9720;
			local71 = local32 * (float) this.anInt9716;
			local77 = local39 * (float) this.anInt9716;
			@Pc(84) float local84 = -local32 * (float) this.anInt9729;
			@Pc(91) float local91 = -local39 * (float) this.anInt9729;
			@Pc(98) float local98 = -local46 * (float) this.anInt9726;
			@Pc(105) float local105 = -local53 * (float) this.anInt9726;
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
		if (local46 < (float) this.aClass90_Sub2_17.anInt8486) {
			local46 = this.aClass90_Sub2_17.anInt8486;
		}
		if (local53 > (float) this.aClass90_Sub2_17.anInt8491) {
			local53 = this.aClass90_Sub2_17.anInt8491;
		}
		if (local59 < (float) this.aClass90_Sub2_17.anInt8509) {
			local59 = this.aClass90_Sub2_17.anInt8509;
		}
		if (local65 > (float) this.aClass90_Sub2_17.anInt8494) {
			local65 = this.aClass90_Sub2_17.anInt8494;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static218.anInt9732 = this.aClass90_Sub2_17.anInt8497;
		Static218.anInt9719 = (int) ((float) ((int) local59 * Static218.anInt9732) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static218.anInt9736 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt9728 / local71);
		Static218.anInt9713 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt9710 / local77);
		Static218.anInt9733 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt9728 / local77);
		Static218.anInt9739 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt9710 / local71);
		Static218.anInt9723 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static218.anInt9737 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static218.anInt9722 = (this.anInt9728 >> 1 << 12) + (Static218.anInt9737 * Static218.anInt9733 >> 4);
		Static218.anInt9738 = (this.anInt9710 >> 1 << 12) + (Static218.anInt9737 * Static218.anInt9739 >> 4);
		Static218.anInt9731 = Static218.anInt9723 * Static218.anInt9736 >> 4;
		Static218.anInt9740 = Static218.anInt9723 * Static218.anInt9713 >> 4;
		Static218.anInt9711 = (int) local46;
		Static218.anInt9714 = (int) local53;
		Static218.anInt9712 = (int) local59;
		Static218.anInt9718 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()I")
	@Override
	public final int a() {
		return this.anInt9720 + this.anInt9710 + this.anInt9726;
	}

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "(IIIII)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ie", name = "QA", descriptor = "()I")
	@Override
	public final int QA() {
		return this.anInt9728;
	}

	@OriginalMember(owner = "client!ie", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public final void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass90_Sub2_17.method6765()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray706 == null) {
			this.anIntArray706 = new int[4];
		}
		this.aClass90_Sub2_17.A(this.anIntArray706);
		this.aClass90_Sub2_17.Q(this.aClass90_Sub2_17.anInt8486, this.aClass90_Sub2_17.anInt8509, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.AA();
		@Pc(40) int local40 = this.a();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.I(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass90_Sub2_17.ca(this.anIntArray706[0], this.anIntArray706[1], this.anIntArray706[2], this.anIntArray706[3]);
	}

	@OriginalMember(owner = "client!ie", name = "AA", descriptor = "()I")
	@Override
	public final int AA() {
		return this.anInt9716 + this.anInt9728 + this.anInt9729;
	}

	@OriginalMember(owner = "client!ie", name = "EA", descriptor = "(IIII)V")
	@Override
	public final void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9716 = arg0;
		this.anInt9720 = arg1;
		this.anInt9729 = arg2;
		this.anInt9726 = arg3;
	}

	@OriginalMember(owner = "client!ie", name = "KA", descriptor = "(IIIIIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
