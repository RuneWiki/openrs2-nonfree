import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public abstract class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	protected int anInt6635;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	protected int anInt6639;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	protected int anInt6643;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
	protected int anInt6645;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!wc;")
	protected final Class117_Sub2 aClass117_Sub2_11;

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	protected final int anInt6640;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	protected final int anInt6629;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!wc;II)V")
	protected Class85_Sub1(@OriginalArg(0) Class117_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass117_Sub2_11 = arg0;
		this.anInt6640 = arg1;
		this.anInt6629 = arg2;
	}

	@OriginalMember(owner = "client!fn", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass117_Sub2_11.method5736()) {
			throw new IllegalStateException();
		}
		this.method5289(arg0, arg1, arg2, arg3, arg4, arg5);
		Static121.anInt6653 = arg7;
		if (arg6 != 1) {
			Static121.anInt6628 = arg7 >>> 24;
			Static121.anInt6649 = 256 - Static121.anInt6628;
			if (arg6 == 0) {
				Static121.anInt6654 = arg7 >> 16 & 0xFF;
				Static121.anInt6638 = arg7 >> 8 & 0xFF;
				Static121.anInt6625 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static121.anInt6624 = arg7 >>> 24;
				Static121.anInt6646 = 256 - Static121.anInt6624;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static121.anInt6646 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static121.anInt6646 & 0xFF0000;
				Static121.anInt6631 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5288(1);
		} else if (arg6 == 0) {
			this.method5288(0);
		} else if (arg6 == 3) {
			this.method5288(3);
		} else if (arg6 == 2) {
			this.method5288(2);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fn", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt6640;
	}

	@OriginalMember(owner = "client!fn", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt6639 + this.anInt6629 + this.anInt6643;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[III)V")
	protected abstract void method5287(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)V")
	protected abstract void method5288(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fn", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6645 = arg0;
		this.anInt6639 = arg1;
		this.anInt6635 = arg2;
		this.anInt6643 = arg3;
	}

	@OriginalMember(owner = "client!fn", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass117_Sub2_11.method5736()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray477 == null) {
			this.anIntArray477 = new int[4];
		}
		this.aClass117_Sub2_11.MA(this.anIntArray477);
		this.aClass117_Sub2_11.HA(this.aClass117_Sub2_11.anInt7077, this.aClass117_Sub2_11.anInt7088, arg0 + arg2, arg1 + arg3);
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
		this.aClass117_Sub2_11.ba(this.anIntArray477[0], this.anIntArray477[1], this.anIntArray477[2], this.anIntArray477[3]);
	}

	@OriginalMember(owner = "client!fn", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt6629;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass117_Sub2_11.method5736()) {
			throw new IllegalStateException();
		}
		this.method5289(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class73_Sub2 local18 = (Class73_Sub2) arg6;
		this.method5287(local18.anIntArray160, local18.anIntArray161, Static121.anInt6641 - arg7, -arg8 - (Static121.anInt6644 - Static121.anInt6651));
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFF)V")
	private void method5289(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6645 + this.anInt6640 + this.anInt6635;
		@Pc(17) int local17 = this.anInt6639 + this.anInt6629 + this.anInt6643;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6640 || local17 != this.anInt6629) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6639;
			local65 = local53 * (float) this.anInt6639;
			local71 = local32 * (float) this.anInt6645;
			local77 = local39 * (float) this.anInt6645;
			@Pc(84) float local84 = -local32 * (float) this.anInt6635;
			@Pc(91) float local91 = -local39 * (float) this.anInt6635;
			@Pc(98) float local98 = -local46 * (float) this.anInt6643;
			@Pc(105) float local105 = -local53 * (float) this.anInt6643;
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
		if (local46 < (float) this.aClass117_Sub2_11.anInt7077) {
			local46 = this.aClass117_Sub2_11.anInt7077;
		}
		if (local53 > (float) this.aClass117_Sub2_11.anInt7065) {
			local53 = this.aClass117_Sub2_11.anInt7065;
		}
		if (local59 < (float) this.aClass117_Sub2_11.anInt7088) {
			local59 = this.aClass117_Sub2_11.anInt7088;
		}
		if (local65 > (float) this.aClass117_Sub2_11.anInt7082) {
			local65 = this.aClass117_Sub2_11.anInt7082;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static121.anInt6648 = this.aClass117_Sub2_11.anInt7083;
		Static121.anInt6630 = (int) ((float) ((int) local59 * Static121.anInt6648) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static121.anInt6652 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6640 / local71);
		Static121.anInt6650 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6629 / local77);
		Static121.anInt6634 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6640 / local77);
		Static121.anInt6642 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6629 / local71);
		Static121.anInt6636 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static121.anInt6637 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static121.anInt6627 = (this.anInt6640 >> 1 << 12) + (Static121.anInt6637 * Static121.anInt6634 >> 4);
		Static121.anInt6632 = (this.anInt6629 >> 1 << 12) + (Static121.anInt6637 * Static121.anInt6642 >> 4);
		Static121.anInt6626 = Static121.anInt6636 * Static121.anInt6652 >> 4;
		Static121.anInt6633 = Static121.anInt6636 * Static121.anInt6650 >> 4;
		Static121.anInt6641 = (int) local46;
		Static121.anInt6647 = (int) local53;
		Static121.anInt6651 = (int) local59;
		Static121.anInt6644 = (int) local65;
	}

	@OriginalMember(owner = "client!fn", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt6645 + this.anInt6640 + this.anInt6635;
	}

	@OriginalMember(owner = "client!fn", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
