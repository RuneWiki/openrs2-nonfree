import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public abstract class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	protected int anInt5693;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
	protected int anInt5705;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
	protected int anInt5709;

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "I")
	protected int anInt5717;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "Lclient!sr;")
	protected final Class50_Sub2 aClass50_Sub2_8;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "I")
	protected final int anInt5712;

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "I")
	protected final int anInt5719;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!sr;II)V")
	protected Class80_Sub2(@OriginalArg(0) Class50_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass50_Sub2_8 = arg0;
		this.anInt5712 = arg1;
		this.anInt5719 = arg2;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class49 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		}
		this.method4544(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class49_Sub1 local18 = (Class49_Sub1) arg6;
		this.method4545(local18.anIntArray102, local18.anIntArray103, Static183.anInt5698 - arg7, -arg8 - (Static183.anInt5695 - Static183.anInt5696));
	}

	@OriginalMember(owner = "client!iu", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!iu", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!iu", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt5719;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!iu", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5717 = arg0;
		this.anInt5709 = arg1;
		this.anInt5693 = arg2;
		this.anInt5705 = arg3;
	}

	@OriginalMember(owner = "client!iu", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt5709 + this.anInt5719 + this.anInt5705;
	}

	@OriginalMember(owner = "client!iu", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt5712;
	}

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		}
		this.method4544(arg0, arg1, arg2, arg3, arg4, arg5);
		Static183.anInt5692 = arg7;
		if (arg6 != 1) {
			Static183.anInt5701 = arg7 >>> 24;
			Static183.anInt5720 = 256 - Static183.anInt5701;
			if (arg6 == 0) {
				Static183.anInt5706 = arg7 >> 16 & 0xFF;
				Static183.anInt5713 = arg7 >> 8 & 0xFF;
				Static183.anInt5699 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static183.anInt5715 = arg7 >>> 24;
				Static183.anInt5714 = 256 - Static183.anInt5715;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static183.anInt5714 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static183.anInt5714 & 0xFF0000;
				Static183.anInt5690 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method4543(1);
		} else if (arg6 == 0) {
			this.method4543(0);
		} else if (arg6 == 3) {
			this.method4543(3);
		} else if (arg6 == 2) {
			this.method4543(2);
		}
	}

	@OriginalMember(owner = "client!iu", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt5717 + this.anInt5712 + this.anInt5693;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
	protected abstract void method4543(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(FFFFFF)V")
	private void method4544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt5717 + this.anInt5712 + this.anInt5693;
		@Pc(17) int local17 = this.anInt5709 + this.anInt5719 + this.anInt5705;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt5712 || local17 != this.anInt5719) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt5709;
			local65 = local53 * (float) this.anInt5709;
			local71 = local32 * (float) this.anInt5717;
			local77 = local39 * (float) this.anInt5717;
			@Pc(84) float local84 = -local32 * (float) this.anInt5693;
			@Pc(91) float local91 = -local39 * (float) this.anInt5693;
			@Pc(98) float local98 = -local46 * (float) this.anInt5705;
			@Pc(105) float local105 = -local53 * (float) this.anInt5705;
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
		if (local46 < (float) this.aClass50_Sub2_8.anInt6466) {
			local46 = this.aClass50_Sub2_8.anInt6466;
		}
		if (local53 > (float) this.aClass50_Sub2_8.anInt6475) {
			local53 = this.aClass50_Sub2_8.anInt6475;
		}
		if (local59 < (float) this.aClass50_Sub2_8.anInt6471) {
			local59 = this.aClass50_Sub2_8.anInt6471;
		}
		if (local65 > (float) this.aClass50_Sub2_8.anInt6474) {
			local65 = this.aClass50_Sub2_8.anInt6474;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static183.anInt5718 = this.aClass50_Sub2_8.anInt6478;
		Static183.anInt5710 = (int) ((float) ((int) local59 * Static183.anInt5718) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static183.anInt5711 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt5712 / local71);
		Static183.anInt5694 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt5719 / local77);
		Static183.anInt5703 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt5712 / local77);
		Static183.anInt5702 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt5719 / local71);
		Static183.anInt5708 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static183.anInt5697 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static183.anInt5704 = (this.anInt5712 >> 1 << 12) + (Static183.anInt5697 * Static183.anInt5703 >> 4);
		Static183.anInt5700 = (this.anInt5719 >> 1 << 12) + (Static183.anInt5697 * Static183.anInt5702 >> 4);
		Static183.anInt5716 = Static183.anInt5708 * Static183.anInt5711 >> 4;
		Static183.anInt5691 = Static183.anInt5708 * Static183.anInt5694 >> 4;
		Static183.anInt5698 = (int) local46;
		Static183.anInt5707 = (int) local53;
		Static183.anInt5696 = (int) local59;
		Static183.anInt5695 = (int) local65;
	}

	@OriginalMember(owner = "client!iu", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass50_Sub2_8.method5087()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray557 == null) {
			this.anIntArray557 = new int[4];
		}
		this.aClass50_Sub2_8.MA(this.anIntArray557);
		this.aClass50_Sub2_8.HA(this.aClass50_Sub2_8.anInt6466, this.aClass50_Sub2_8.anInt6471, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.RA();
		@Pc(40) int local40 = this.Q();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.W(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass50_Sub2_8.ba(this.anIntArray557[0], this.anIntArray557[1], this.anIntArray557[2], this.anIntArray557[3]);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([I[III)V")
	protected abstract void method4545(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
