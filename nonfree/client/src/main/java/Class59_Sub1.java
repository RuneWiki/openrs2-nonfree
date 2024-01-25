import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public abstract class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
	protected int anInt7683;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
	protected int anInt7684;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	protected int anInt7696;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	protected int anInt7698;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!ni;")
	protected final Class143_Sub3 aClass143_Sub3_10;

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
	public final int anInt7709;

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
	public final int anInt7701;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ni;II)V")
	public Class59_Sub1(@OriginalArg(0) Class143_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass143_Sub3_10 = arg0;
		this.anInt7709 = arg1;
		this.anInt7701 = arg2;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "()I")
	@Override
	public final int method8053() {
		return this.anInt7696 + this.anInt7709 + this.anInt7698;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method8060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass143_Sub3_10.method5828()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray430 == null) {
			this.anIntArray430 = new int[4];
		}
		this.aClass143_Sub3_10.K(this.anIntArray430);
		this.aClass143_Sub3_10.T(this.aClass143_Sub3_10.anInt6859, this.aClass143_Sub3_10.anInt6856, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method8053();
		@Pc(40) int local40 = this.method8064();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method8067(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass143_Sub3_10.KA(this.anIntArray430[0], this.anIntArray430[1], this.anIntArray430[2], this.anIntArray430[3]);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method8065(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass143_Sub3_10.method5828()) {
			throw new IllegalStateException();
		} else if (this.method6544(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method6542(local20.anIntArray102, local20.anIntArray101, Static349.anInt7702 - arg7, -arg8 - (Static349.anInt7685 - Static349.anInt7710));
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([I[III)V")
	protected abstract void method6542(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIII)V")
	public abstract void method8067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()I")
	@Override
	public final int method8061() {
		return this.anInt7701;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method8072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([I)V")
	@Override
	public final void method8059(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7696;
		arg0[1] = this.anInt7683;
		arg0[2] = this.anInt7698;
		arg0[3] = this.anInt7684;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()I")
	@Override
	public final int method8049() {
		return this.anInt7709;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "()I")
	@Override
	public final int method8064() {
		return this.anInt7683 + this.anInt7701 + this.anInt7684;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7696 + this.anInt7709 + this.anInt7698;
		@Pc(17) int local17 = this.anInt7683 + this.anInt7701 + this.anInt7684;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7709 || local17 != this.anInt7701) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7683;
			local65 = local53 * (float) this.anInt7683;
			local71 = local32 * (float) this.anInt7696;
			local77 = local39 * (float) this.anInt7696;
			@Pc(84) float local84 = -local32 * (float) this.anInt7698;
			@Pc(91) float local91 = -local39 * (float) this.anInt7698;
			@Pc(98) float local98 = -local46 * (float) this.anInt7684;
			@Pc(105) float local105 = -local53 * (float) this.anInt7684;
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
		if (local46 < (float) this.aClass143_Sub3_10.anInt6859) {
			local46 = (float) this.aClass143_Sub3_10.anInt6859;
		}
		if (local53 > (float) this.aClass143_Sub3_10.anInt6870) {
			local53 = (float) this.aClass143_Sub3_10.anInt6870;
		}
		if (local59 < (float) this.aClass143_Sub3_10.anInt6856) {
			local59 = (float) this.aClass143_Sub3_10.anInt6856;
		}
		if (local65 > (float) this.aClass143_Sub3_10.anInt6852) {
			local65 = (float) this.aClass143_Sub3_10.anInt6852;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static349.anInt7691 = this.aClass143_Sub3_10.anInt6863;
		Static349.anInt7699 = (int) ((float) ((int) local59 * Static349.anInt7691) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static349.anInt7693 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7709 / local71);
		Static349.anInt7707 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7701 / local77);
		Static349.anInt7697 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7709 / local77);
		Static349.anInt7704 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7701 / local71);
		Static349.anInt7694 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static349.anInt7700 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static349.anInt7705 = (this.anInt7709 >> 1 << 12) + (Static349.anInt7700 * Static349.anInt7697 >> 4);
		Static349.anInt7692 = (this.anInt7701 >> 1 << 12) + (Static349.anInt7700 * Static349.anInt7704 >> 4);
		Static349.anInt7682 = Static349.anInt7694 * Static349.anInt7693 >> 4;
		Static349.anInt7687 = Static349.anInt7694 * Static349.anInt7707 >> 4;
		Static349.anInt7702 = (int) local46;
		Static349.anInt7680 = (int) local53;
		Static349.anInt7710 = (int) local59;
		Static349.anInt7685 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7696 = arg0;
		this.anInt7683 = arg1;
		this.anInt7698 = arg2;
		this.anInt7684 = arg3;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	protected abstract void method6545(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method8051(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass143_Sub3_10.method5828()) {
			throw new IllegalStateException();
		} else if (this.method6544(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static349.anInt7689 = arg7;
			if (arg6 != 1) {
				Static349.anInt7703 = arg7 >>> 24;
				Static349.anInt7706 = 256 - Static349.anInt7703;
				if (arg6 == 0) {
					Static349.anInt7681 = arg7 >> 16 & 0xFF;
					Static349.anInt7686 = arg7 >> 8 & 0xFF;
					Static349.anInt7690 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static349.anInt7695 = arg7 >>> 24;
					Static349.anInt7708 = 256 - Static349.anInt7695;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static349.anInt7708 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static349.anInt7708 & 0xFF0000;
					Static349.anInt7688 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6545(1);
			} else if (arg6 == 0) {
				this.method6545(0);
			} else if (arg6 == 3) {
				this.method6545(3);
			} else if (arg6 == 2) {
				this.method6545(2);
			}
		}
	}
}
