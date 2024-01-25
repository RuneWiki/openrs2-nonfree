import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public abstract class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
	private int[] anIntArray763;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	protected int anInt8744;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	protected int anInt8751;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	protected int anInt8758;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
	protected int anInt8770;

	@OriginalMember(owner = "client!ot", name = "C", descriptor = "Lclient!hr;")
	protected final Class4_Sub1 aClass4_Sub1_16;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	protected final int anInt8749;

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
	protected final int anInt8765;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!hr;II)V")
	protected Class104_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_16 = arg0;
		this.anInt8749 = arg1;
		this.anInt8765 = arg2;
	}

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass4_Sub1_16.method2733()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray763 == null) {
			this.anIntArray763 = new int[4];
		}
		this.aClass4_Sub1_16.d(this.anIntArray763);
		this.aClass4_Sub1_16.F(this.aClass4_Sub1_16.anInt2896, this.aClass4_Sub1_16.anInt2869, arg0 + arg2, arg1 + arg3);
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
		this.aClass4_Sub1_16.N(this.anIntArray763[0], this.anIntArray763[1], this.anIntArray763[2], this.anIntArray763[3]);
	}

	@OriginalMember(owner = "client!ot", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt8758 + this.anInt8765 + this.anInt8744;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
	protected abstract void method7654(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ot", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt8765;
	}

	@OriginalMember(owner = "client!ot", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8751 = arg0;
		this.anInt8758 = arg1;
		this.anInt8770 = arg2;
		this.anInt8744 = arg3;
	}

	@OriginalMember(owner = "client!ot", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method7655(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8751 + this.anInt8749 + this.anInt8770;
		@Pc(17) int local17 = this.anInt8758 + this.anInt8765 + this.anInt8744;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8749 || local17 != this.anInt8765) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8758;
			local65 = local53 * (float) this.anInt8758;
			local71 = local32 * (float) this.anInt8751;
			local77 = local39 * (float) this.anInt8751;
			@Pc(84) float local84 = -local32 * (float) this.anInt8770;
			@Pc(91) float local91 = -local39 * (float) this.anInt8770;
			@Pc(98) float local98 = -local46 * (float) this.anInt8744;
			@Pc(105) float local105 = -local53 * (float) this.anInt8744;
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
		if (local46 < (float) this.aClass4_Sub1_16.anInt2896) {
			local46 = this.aClass4_Sub1_16.anInt2896;
		}
		if (local53 > (float) this.aClass4_Sub1_16.anInt2893) {
			local53 = this.aClass4_Sub1_16.anInt2893;
		}
		if (local59 < (float) this.aClass4_Sub1_16.anInt2869) {
			local59 = this.aClass4_Sub1_16.anInt2869;
		}
		if (local65 > (float) this.aClass4_Sub1_16.anInt2882) {
			local65 = this.aClass4_Sub1_16.anInt2882;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static357.anInt8745 = this.aClass4_Sub1_16.anInt2885;
		Static357.anInt8760 = (int) ((float) ((int) local59 * Static357.anInt8745) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static357.anInt8767 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8749 / local71);
		Static357.anInt8746 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8765 / local77);
		Static357.anInt8772 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8749 / local77);
		Static357.anInt8771 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8765 / local71);
		Static357.anInt8761 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static357.anInt8755 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static357.anInt8759 = (this.anInt8749 >> 1 << 12) + (Static357.anInt8755 * Static357.anInt8772 >> 4);
		Static357.anInt8764 = (this.anInt8765 >> 1 << 12) + (Static357.anInt8755 * Static357.anInt8771 >> 4);
		Static357.anInt8763 = Static357.anInt8761 * Static357.anInt8767 >> 4;
		Static357.anInt8773 = Static357.anInt8761 * Static357.anInt8746 >> 4;
		Static357.anInt8754 = (int) local46;
		Static357.anInt8756 = (int) local53;
		Static357.anInt8743 = (int) local59;
		Static357.anInt8750 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([I[III)V")
	protected abstract void method7656(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ot", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ot", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass4_Sub1_16.method2733()) {
			throw new IllegalStateException();
		} else if (this.method7655(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static357.anInt8753 = arg7;
			if (arg6 != 1) {
				Static357.anInt8747 = arg7 >>> 24;
				Static357.anInt8768 = 256 - Static357.anInt8747;
				if (arg6 == 0) {
					Static357.anInt8769 = arg7 >> 16 & 0xFF;
					Static357.anInt8752 = arg7 >> 8 & 0xFF;
					Static357.anInt8762 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static357.anInt8757 = arg7 >>> 24;
					Static357.anInt8766 = 256 - Static357.anInt8757;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static357.anInt8766 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static357.anInt8766 & 0xFF0000;
					Static357.anInt8748 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method7654(1);
			} else if (arg6 == 0) {
				this.method7654(0);
			} else if (arg6 == 3) {
				this.method7654(3);
			} else if (arg6 == 2) {
				this.method7654(2);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt8751 + this.anInt8749 + this.anInt8770;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt8749;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method7715(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass4_Sub1_16.method2733()) {
			throw new IllegalStateException();
		} else if (this.method7655(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class28_Sub3 local20 = (Class28_Sub3) arg6;
			this.method7656(local20.anIntArray630, local20.anIntArray629, Static357.anInt8754 - arg7, -arg8 - (Static357.anInt8750 - Static357.anInt8743));
		}
	}
}
