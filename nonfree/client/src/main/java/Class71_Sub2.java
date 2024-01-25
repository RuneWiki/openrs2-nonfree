import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	private int anInt5594 = 0;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	private int anInt5603 = 0;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private int anInt5593 = 0;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
	private int anInt5607 = 0;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	private final int anInt5598;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	private final int anInt5604;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_13;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!lba;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
	private final boolean aBoolean422;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
	private final boolean aBoolean420;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Z")
	private final boolean aBoolean419;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!mj;IIZ)V")
	public Class71_Sub2(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5598 = arg1;
		this.anInt5604 = arg2;
		this.aClass101_Sub1_13 = arg0;
		this.anInterface10_3 = arg0.method5848(arg2, arg3 ? Static584.aClass244_9 : Static142.aClass244_5, Static114.aClass79_7, arg1);
		this.anInterface10_3.method9107(true, true);
		this.aBoolean422 = arg1 != this.anInterface10_3.method9105();
		this.aBoolean420 = this.anInterface10_3.method9101() != arg2;
		this.aBoolean421 = !this.aBoolean422 && this.anInterface10_3.method9103();
		this.aBoolean419 = !this.aBoolean420 && this.anInterface10_3.method9103();
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!mj;II[III)V")
	public Class71_Sub2(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5598 = arg1;
		this.aClass101_Sub1_13 = arg0;
		this.anInt5604 = arg2;
		this.anInterface10_3 = arg0.method5916(arg3, arg5, arg2, arg1, arg4, false);
		this.anInterface10_3.method9107(true, true);
		this.aBoolean422 = this.anInterface10_3.method9105() != arg1;
		this.aBoolean420 = arg2 != this.anInterface10_3.method9101();
		this.aBoolean421 = !this.aBoolean422 && this.anInterface10_3.method9103();
		this.aBoolean419 = !this.aBoolean420 && this.anInterface10_3.method9103();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()I")
	@Override
	public int method7707() {
		return this.anInt5604;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class76_Sub2 local8 = this.aClass101_Sub1_13.method5829();
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_13.method5832();
		@Pc(18) int local18 = arg0 + this.anInt5603;
		@Pc(23) int local23 = arg1 + this.anInt5607;
		this.anInterface10_3.method9325(Static173.aClass315_8);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(arg4);
		this.aClass101_Sub1_13.method5840(arg2);
		this.aClass101_Sub1_13.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5890(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5933(arg3);
		local8.method7334((float) this.anInt5598, 0.0F, (float) this.anInt5604);
		local8.method9640(local18, local23, 0);
		local13.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5944();
		this.aClass101_Sub1_13.method5918();
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(1, Static175.aClass118_2);
		this.aClass101_Sub1_13.method5890(1, Static175.aClass118_2);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	@Override
	public int method7691() {
		return this.anInt5598;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class76_Sub2 local8 = this.aClass101_Sub1_13.method5829();
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_13.method5832();
		@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) arg6;
		@Pc(19) Interface10 local19 = local16.anInterface10_6;
		this.anInterface10_3.method9325(this.aBoolean422 || this.aBoolean420 ? Static173.aClass315_8 : Static100.aClass315_2);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(1);
		this.aClass101_Sub1_13.method5840(1);
		if (this.aBoolean418) {
			@Pc(67) float local67 = (float) this.anInt5598 / (float) this.method7709();
			@Pc(75) float local75 = (float) this.anInt5604 / (float) this.method7711();
			local8.method7346(1.0F, local67 * (arg2 - arg0), local75 * (arg5 - arg1), 0.0F, (arg4 - arg0) * local75, 0.0F, 0.0F, 0.0F, (arg3 - arg1) * local67);
			local8.method7332(local75 * (arg1 + (float) this.anInt5607), 0.0F, (arg0 + (float) this.anInt5603) * local67);
		} else {
			local8.method7346(1.0F, arg2 - arg0, -arg1 + arg5, 0.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1);
			local8.method7332(arg1, 0.0F, arg0);
		}
		local13.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5862(1);
		this.aClass101_Sub1_13.method5909(local19);
		this.aClass101_Sub1_13.method5891(Static512.aClass381_5, Static175.aClass381_3);
		this.aClass101_Sub1_13.method5954(0, Static175.aClass118_2);
		@Pc(203) Class76_Sub2 local203 = this.aClass101_Sub1_13.method5832();
		local203.method9629(local8);
		local203.method9640(-arg7, -arg8, 0);
		local203.method7349(local19.method9104(1.0F), 1.0F, local19.method9102(1.0F));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5944();
		this.aClass101_Sub1_13.method5918();
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(0, Static44.aClass118_1);
		this.aClass101_Sub1_13.method5891(Static175.aClass381_3, Static175.aClass381_3);
		this.aClass101_Sub1_13.method5909((Interface5) null);
		this.aClass101_Sub1_13.method5862(0);
		this.aClass101_Sub1_13.method5952();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5607 = arg1;
		this.anInt5594 = arg3;
		this.anInt5593 = arg2;
		this.anInt5603 = arg0;
		this.aBoolean418 = this.anInt5603 != 0 || this.anInt5607 != 0 || this.anInt5593 != 0 || this.anInt5594 != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	@Override
	public void method7696(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass101_Sub1_13.na(0, 0, this.anInt5598, this.anInt5604);
		@Pc(22) int[] local22 = new int[this.anInt5598 * this.anInt5604];
		this.anInterface10_3.method9100(this.anInt5604, this.anInt5598, local22);
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (arg0 == 0) {
			for (local38 = 0; local38 < this.anInt5604; local38++) {
				local45 = this.anInt5598 * local38;
				for (local47 = 0; local47 < this.anInt5598; local47++) {
					local22[local45 + local47] = local22[local47 + local45] & 0xFFFFFF | (local15[local47 + local45] & 0xEDFF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local38 = 0; local38 < this.anInt5604; local38++) {
				local45 = this.anInt5598 * local38;
				for (local47 = 0; local47 < this.anInt5598; local47++) {
					local22[local45 + local47] = (local15[local45 + local47] == 0 ? 0 : -16777216) | local22[local45 + local47] & 0xFFFFFF;
				}
			}
		}
		this.method5090(0, 0, this.anInt5598, this.anInt5604, local22, this.anInt5598);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([I)V")
	@Override
	public void method7689(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5603;
		arg0[1] = this.anInt5607;
		arg0[3] = this.anInt5594;
		arg0[2] = this.anInt5593;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class76_Sub2 local8 = this.aClass101_Sub1_13.method5829();
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_13.method5832();
		this.anInterface10_3.method9325(this.aBoolean422 || this.aBoolean420 ? Static173.aClass315_8 : Static100.aClass315_2);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(arg6);
		this.aClass101_Sub1_13.method5840(arg4);
		this.aClass101_Sub1_13.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5890(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5933(arg5);
		local13.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
		if (this.aBoolean418) {
			arg2 = arg2 * this.anInt5598 / this.method7709();
			arg3 = arg3 * this.anInt5604 / this.method7711();
			arg1 += this.anInt5607 * arg3 / this.anInt5604;
			arg0 += this.anInt5603 * arg2 / this.anInt5598;
		}
		local8.method7334((float) arg2, 0.0F, (float) arg3);
		local8.method9640(arg0, arg1, 0);
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5944();
		this.aClass101_Sub1_13.method5918();
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(1, Static175.aClass118_2);
		this.aClass101_Sub1_13.method5890(1, Static175.aClass118_2);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()I")
	@Override
	public int method7709() {
		return this.anInt5598 + this.anInt5603 + this.anInt5593;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class76_Sub2 local8 = this.aClass101_Sub1_13.method5829();
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_13.method5832();
		this.anInterface10_3.method9325(this.aBoolean422 || this.aBoolean420 ? Static173.aClass315_8 : Static100.aClass315_2);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(1);
		this.aClass101_Sub1_13.method5840(arg6);
		this.aClass101_Sub1_13.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5890(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5933(arg7);
		if (this.aBoolean418) {
			@Pc(77) float local77 = (float) this.method7709();
			@Pc(81) float local81 = (float) this.method7711();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(95) float local95 = (arg3 - arg1) / local77;
			@Pc(102) float local102 = (arg4 - arg0) / local81;
			@Pc(109) float local109 = (arg5 - arg1) / local81;
			@Pc(115) float local115 = local102 * (float) this.anInt5607;
			@Pc(121) float local121 = local109 * (float) this.anInt5607;
			@Pc(127) float local127 = (float) this.anInt5603 * local88;
			@Pc(133) float local133 = (float) this.anInt5603 * local95;
			@Pc(140) float local140 = -local88 * (float) this.anInt5593;
			@Pc(147) float local147 = -local95 * (float) this.anInt5593;
			@Pc(154) float local154 = (float) this.anInt5594 * -local102;
			arg4 = arg4 + local127 + local154;
			arg2 = local140 + arg2 + local115;
			@Pc(173) float local173 = (float) this.anInt5594 * -local109;
			arg0 = local115 + arg0 + local127;
			arg3 = local147 + arg3 + local121;
			arg1 = arg1 + local133 + local121;
			arg5 = local133 + arg5 + local173;
		}
		local8.method7346(1.0F, arg2 - arg0, -arg1 + arg5, 0.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg3 - arg1);
		local8.method7332(arg1, 0.0F, arg0);
		local13.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5944();
		this.aClass101_Sub1_13.method5918();
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(1, Static175.aClass118_2);
		this.aClass101_Sub1_13.method5890(1, Static175.aClass118_2);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII[III)V")
	private void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface10_3.method9108(arg5, arg1, arg4, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()I")
	@Override
	public int method7711() {
		return this.anInt5594 + this.anInt5604 + this.anInt5607;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class76_Sub2 local10 = this.aClass101_Sub1_13.method5829();
		@Pc(15) Class76_Sub2 local15 = this.aClass101_Sub1_13.method5832();
		this.anInterface10_3.method9325(Static173.aClass315_8);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(arg6);
		this.aClass101_Sub1_13.method5840(arg4);
		this.aClass101_Sub1_13.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5890(1, Static660.aClass118_5);
		this.aClass101_Sub1_13.method5933(arg5);
		@Pc(73) boolean local73 = this.aBoolean419 && this.anInt5607 == 0 && this.anInt5594 == 0;
		@Pc(86) boolean local86 = this.aBoolean421 && this.anInt5603 == 0 && this.anInt5593 == 0;
		if (local86 & local73) {
			local15.method7334(this.anInterface10_3.method9102((float) arg2), 1.0F, this.anInterface10_3.method9104((float) arg3));
			local10.method7334((float) arg2, 0.0F, (float) arg3);
			local10.method9640(arg0, arg1, 0);
			this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
			this.aClass101_Sub1_13.method5944();
			this.aClass101_Sub1_13.method5918();
		} else {
			@Pc(96) int local96;
			@Pc(99) int local99;
			@Pc(126) int local126;
			@Pc(131) int local131;
			@Pc(178) int local178;
			if (local86) {
				local96 = arg1 + arg3;
				local99 = this.method7711();
				local15.method7334(this.anInterface10_3.method9102((float) arg2), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
				this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
				local126 = this.anInt5607 + arg1;
				local131 = this.anInt5604 + local126;
				while (local131 <= local96) {
					local10.method7334((float) arg2, 0.0F, (float) this.anInt5604);
					local10.method9640(arg0, local126, 0);
					this.aClass101_Sub1_13.method5944();
					local131 += local99;
					this.aClass101_Sub1_13.method5918();
					local126 += local99;
				}
				if (local96 > local126) {
					local178 = local96 - local126;
					local15.method7334(this.anInterface10_3.method9102((float) arg2), 1.0F, this.anInterface10_3.method9104((float) local178));
					this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
					local10.method7334((float) arg2, 0.0F, (float) local178);
					local10.method9640(arg0, local126, 0);
					this.aClass101_Sub1_13.method5944();
					this.aClass101_Sub1_13.method5918();
				}
			} else if (local73) {
				local96 = arg2 + arg0;
				local99 = this.method7709();
				local15.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) arg3));
				this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
				local126 = arg0 + this.anInt5603;
				local131 = this.anInt5598 + local126;
				while (local131 <= local96) {
					local10.method7334((float) this.anInt5598, 0.0F, (float) arg3);
					local10.method9640(local126, arg1, 0);
					this.aClass101_Sub1_13.method5944();
					local131 += local99;
					this.aClass101_Sub1_13.method5918();
					local126 += local99;
				}
				if (local126 < local96) {
					local178 = local96 - local126;
					local15.method7334(this.anInterface10_3.method9102((float) local178), 1.0F, this.anInterface10_3.method9104((float) arg3));
					this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
					local10.method7334((float) local178, 0.0F, (float) arg3);
					local10.method9640(local126, arg1, 0);
					this.aClass101_Sub1_13.method5944();
					this.aClass101_Sub1_13.method5918();
				}
			} else {
				local96 = arg1 + arg3;
				local99 = arg2 + arg0;
				local126 = this.method7709();
				local131 = this.method7711();
				local178 = this.anInt5607 + arg1;
				@Pc(278) int local278;
				@Pc(283) int local283;
				@Pc(330) int local330;
				for (@Pc(248) int local248 = local178 + this.anInt5604; local248 <= local96; local248 += local131) {
					local15.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
					this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
					local278 = this.anInt5603 + arg0;
					for (local283 = this.anInt5598 + local278; local283 <= local99; local283 += local126) {
						local10.method7334((float) this.anInt5598, 0.0F, (float) this.anInt5604);
						local10.method9640(local278, local178, 0);
						this.aClass101_Sub1_13.method5944();
						this.aClass101_Sub1_13.method5918();
						local278 += local126;
					}
					if (local99 > local278) {
						local330 = local99 - local278;
						local15.method7334(this.anInterface10_3.method9102((float) local330), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
						this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
						local10.method7334((float) local330, 0.0F, (float) this.anInt5604);
						local10.method9640(local278, local178, 0);
						this.aClass101_Sub1_13.method5944();
						this.aClass101_Sub1_13.method5918();
					}
					local178 += local131;
				}
				if (local178 < local96) {
					local278 = local96 - local178;
					local15.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) local278));
					this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
					local283 = this.anInt5603 + arg0;
					for (local330 = local283 + this.anInt5598; local330 <= local99; local330 += local126) {
						local10.method7334((float) this.anInt5598, 0.0F, (float) local278);
						local10.method9640(local283, local178, 0);
						this.aClass101_Sub1_13.method5944();
						this.aClass101_Sub1_13.method5918();
						local283 += local126;
					}
					if (local99 > local283) {
						@Pc(480) int local480 = local99 - local283;
						local15.method7334(this.anInterface10_3.method9102((float) local480), 1.0F, this.anInterface10_3.method9104((float) local278));
						this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
						local10.method7334((float) local480, 0.0F, (float) local278);
						local10.method9640(local283, local178, 0);
						this.aClass101_Sub1_13.method5944();
						this.aClass101_Sub1_13.method5918();
					}
				}
			}
		}
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(1, Static175.aClass118_2);
		this.aClass101_Sub1_13.method5890(1, Static175.aClass118_2);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(11) int local11 = arg0 + this.anInt5603;
		@Pc(14) Interface10 local14 = local6.anInterface10_6;
		@Pc(19) int local19 = arg1 + this.anInt5607;
		this.anInterface10_3.method9325(Static173.aClass315_8);
		this.aClass101_Sub1_13.method5855();
		this.aClass101_Sub1_13.method5909(this.anInterface10_3);
		this.aClass101_Sub1_13.method5963(1);
		this.aClass101_Sub1_13.method5840(1);
		@Pc(49) Class76_Sub2 local49 = this.aClass101_Sub1_13.method5829();
		local49.method7334((float) this.anInt5598, 0.0F, (float) this.anInt5604);
		local49.method9640(local11, local19, 0);
		this.aClass101_Sub1_13.method5944();
		@Pc(73) Class76_Sub2 local73 = this.aClass101_Sub1_13.method5832();
		local73.method7334(this.anInterface10_3.method9102((float) this.anInt5598), 1.0F, this.anInterface10_3.method9104((float) this.anInt5604));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5862(1);
		this.aClass101_Sub1_13.method5909(local14);
		this.aClass101_Sub1_13.method5891(Static512.aClass381_5, Static175.aClass381_3);
		this.aClass101_Sub1_13.method5954(0, Static175.aClass118_2);
		@Pc(123) Class76_Sub2 local123 = this.aClass101_Sub1_13.method5832();
		local123.method7334(local14.method9102((float) this.anInt5598), 1.0F, local14.method9104((float) this.anInt5604));
		local123.method7332(local14.method9104((float) (local19 - arg4)), 0.0F, local14.method9102((float) (local11 - arg3)));
		this.aClass101_Sub1_13.method5902(Static174.aClass327_1);
		this.aClass101_Sub1_13.method5918();
		this.aClass101_Sub1_13.method5952();
		this.aClass101_Sub1_13.method5954(0, Static44.aClass118_1);
		this.aClass101_Sub1_13.method5891(Static175.aClass381_3, Static175.aClass381_3);
		this.aClass101_Sub1_13.method5909((Interface5) null);
		this.aClass101_Sub1_13.method5862(0);
		this.aClass101_Sub1_13.method5952();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass101_Sub1_13.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5090(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}
}
