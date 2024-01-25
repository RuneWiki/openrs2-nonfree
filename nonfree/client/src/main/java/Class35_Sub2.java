import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public abstract class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
	protected int anInt7728;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
	protected int anInt7729;

	@OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
	protected int anInt7733;

	@OriginalMember(owner = "client!qaa", name = "q", descriptor = "[I")
	private int[] anIntArray593;

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
	protected int anInt7753;

	@OriginalMember(owner = "client!qaa", name = "G", descriptor = "Lclient!fg;")
	protected final Class39_Sub1 aClass39_Sub1_15;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
	protected final int anInt7724;

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	protected final int anInt7726;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!fg;II)V")
	protected Class35_Sub2(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub1_15 = arg0;
		this.anInt7724 = arg1;
		this.anInt7726 = arg2;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6485(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7733 + this.anInt7724 + this.anInt7728;
		@Pc(17) int local17 = this.anInt7729 + this.anInt7726 + this.anInt7753;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7724 || local17 != this.anInt7726) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7729;
			local65 = local53 * (float) this.anInt7729;
			local71 = local32 * (float) this.anInt7733;
			local77 = local39 * (float) this.anInt7733;
			@Pc(84) float local84 = -local32 * (float) this.anInt7728;
			@Pc(91) float local91 = -local39 * (float) this.anInt7728;
			@Pc(98) float local98 = -local46 * (float) this.anInt7753;
			@Pc(105) float local105 = -local53 * (float) this.anInt7753;
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
		if (local46 < (float) this.aClass39_Sub1_15.anInt2084) {
			local46 = this.aClass39_Sub1_15.anInt2084;
		}
		if (local53 > (float) this.aClass39_Sub1_15.anInt2074) {
			local53 = this.aClass39_Sub1_15.anInt2074;
		}
		if (local59 < (float) this.aClass39_Sub1_15.anInt2061) {
			local59 = this.aClass39_Sub1_15.anInt2061;
		}
		if (local65 > (float) this.aClass39_Sub1_15.anInt2070) {
			local65 = this.aClass39_Sub1_15.anInt2070;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static385.anInt7731 = this.aClass39_Sub1_15.anInt2068;
		Static385.anInt7736 = (int) ((float) ((int) local59 * Static385.anInt7731) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static385.anInt7754 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7724 / local71);
		Static385.anInt7740 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7726 / local77);
		Static385.anInt7747 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7724 / local77);
		Static385.anInt7743 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7726 / local71);
		Static385.anInt7737 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static385.anInt7735 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static385.anInt7748 = (this.anInt7724 >> 1 << 12) + (Static385.anInt7735 * Static385.anInt7747 >> 4);
		Static385.anInt7727 = (this.anInt7726 >> 1 << 12) + (Static385.anInt7735 * Static385.anInt7743 >> 4);
		Static385.anInt7745 = Static385.anInt7737 * Static385.anInt7754 >> 4;
		Static385.anInt7741 = Static385.anInt7737 * Static385.anInt7740 >> 4;
		Static385.anInt7746 = (int) local46;
		Static385.anInt7730 = (int) local53;
		Static385.anInt7739 = (int) local59;
		Static385.anInt7752 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "([I[III)V")
	protected abstract void method6486(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)V")
	protected abstract void method6487(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qaa", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt7729 + this.anInt7726 + this.anInt7753;
	}

	@OriginalMember(owner = "client!qaa", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!qaa", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7733 = arg0;
		this.anInt7729 = arg1;
		this.anInt7728 = arg2;
		this.anInt7753 = arg3;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt7724;
	}

	@OriginalMember(owner = "client!qaa", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt7733 + this.anInt7724 + this.anInt7728;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method7345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass39_Sub1_15.method2057()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray593 == null) {
			this.anIntArray593 = new int[4];
		}
		this.aClass39_Sub1_15.d(this.anIntArray593);
		this.aClass39_Sub1_15.F(this.aClass39_Sub1_15.anInt2084, this.aClass39_Sub1_15.anInt2061, arg0 + arg2, arg1 + arg3);
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
		this.aClass39_Sub1_15.N(this.anIntArray593[0], this.anIntArray593[1], this.anIntArray593[2], this.anIntArray593[3]);
	}

	@OriginalMember(owner = "client!qaa", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt7726;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method7344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass39_Sub1_15.method2057()) {
			throw new IllegalStateException();
		} else if (this.method6485(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class209_Sub3 local20 = (Class209_Sub3) arg6;
			this.method6486(local20.anIntArray755, local20.anIntArray756, Static385.anInt7746 - arg7, -arg8 - (Static385.anInt7752 - Static385.anInt7739));
		}
	}

	@OriginalMember(owner = "client!qaa", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qaa", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass39_Sub1_15.method2057()) {
			throw new IllegalStateException();
		} else if (this.method6485(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static385.anInt7725 = arg7;
			if (arg6 != 1) {
				Static385.anInt7732 = arg7 >>> 24;
				Static385.anInt7734 = 256 - Static385.anInt7732;
				if (arg6 == 0) {
					Static385.anInt7751 = arg7 >> 16 & 0xFF;
					Static385.anInt7738 = arg7 >> 8 & 0xFF;
					Static385.anInt7750 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static385.anInt7749 = arg7 >>> 24;
					Static385.anInt7742 = 256 - Static385.anInt7749;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static385.anInt7742 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static385.anInt7742 & 0xFF0000;
					Static385.anInt7744 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6487(1);
			} else if (arg6 == 0) {
				this.method6487(0);
			} else if (arg6 == 3) {
				this.method6487(3);
			} else if (arg6 == 2) {
				this.method6487(2);
			}
		}
	}
}
