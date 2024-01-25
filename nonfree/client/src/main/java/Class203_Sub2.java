import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class203_Sub2 extends Class203 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class203_Sub2() {
		this.method8337();
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	@Override
	public void method8338(@OriginalArg(0) int arg0) {
		this.aFloat122 = 1.0F;
		this.aFloat120 = this.aFloat127 = Class307.aFloatArray88[arg0 & 0x3FFF];
		this.aFloat123 = Class307.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat128 = this.aFloat126 = this.aFloat121 = this.aFloat129 = this.aFloat125 = this.aFloat130 = this.aFloat131 = 0.0F;
		this.aFloat124 = -this.aFloat123;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class307.aFloatArray88[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class307.aFloatArray89[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class307.aFloatArray88[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class307.aFloatArray89[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class307.aFloatArray88[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class307.aFloatArray89[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat125 = local27 * local9;
		this.aFloat128 = local33 * -local27 + local47 * local21;
		this.aFloat123 = -local21 * local39 + local27 * local43;
		this.aFloat120 = local47 * local27 + local33 * local21;
		this.aFloat127 = local33 * local9;
		this.aFloat124 = local39 * local9;
		this.aFloat122 = local9 * local21;
		this.aFloat130 = -local15;
		this.aFloat121 = local21 * local43 + local27 * local39;
		this.aFloat131 = -((float) arg1 * this.aFloat130) + this.aFloat125 * (float) -arg0 - this.aFloat122 * (float) arg2;
		this.aFloat126 = this.aFloat120 * (float) -arg0 - this.aFloat124 * (float) arg1 - this.aFloat128 * (float) arg2;
		this.aFloat129 = (float) -arg0 * this.aFloat123 - this.aFloat127 * (float) arg1 - this.aFloat121 * (float) arg2;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(FFFIIII)V")
	public void method6183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat120 = (float) arg5;
			this.aFloat122 = 1.0F;
			this.aFloat123 = this.aFloat125 = this.aFloat124 = this.aFloat130 = this.aFloat128 = this.aFloat121 = 0.0F;
			this.aFloat127 = (float) arg4;
		} else {
			@Pc(23) float local23 = Class307.aFloatArray88[arg3 & 0x3FFF];
			@Pc(29) float local29 = Class307.aFloatArray89[arg3 & 0x3FFF];
			this.aFloat123 = local29 * (float) arg5;
			this.aFloat124 = (float) arg4 * -local29;
			this.aFloat127 = local23 * (float) arg4;
			this.aFloat120 = local23 * (float) arg5;
			this.aFloat122 = 1.0F;
			this.aFloat125 = this.aFloat130 = this.aFloat128 = this.aFloat121 = 0.0F;
		}
		this.aFloat129 = arg1;
		this.aFloat126 = arg2;
		this.aFloat131 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	@Override
	public void method8332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat120 = this.aFloat127 = this.aFloat122 = 1.0F;
		this.aFloat129 = (float) arg1;
		this.aFloat126 = (float) arg0;
		this.aFloat123 = this.aFloat125 = this.aFloat124 = this.aFloat130 = this.aFloat128 = this.aFloat121 = 0.0F;
		this.aFloat131 = (float) arg2;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
	@Override
	public void method8324(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class307.aFloatArray88[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class307.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat120;
		@Pc(21) float local21 = this.aFloat124;
		@Pc(24) float local24 = this.aFloat128;
		this.aFloat120 = local15 * this.aFloat125 + local18 * local9;
		@Pc(37) float local37 = this.aFloat126;
		this.aFloat124 = this.aFloat130 * local15 + local21 * local9;
		this.aFloat125 = this.aFloat125 * local9 - local18 * local15;
		this.aFloat128 = local9 * local24 + this.aFloat122 * local15;
		this.aFloat130 = local9 * this.aFloat130 - local15 * local21;
		this.aFloat126 = this.aFloat131 * local15 + local9 * local37;
		this.aFloat122 = local9 * this.aFloat122 - local15 * local24;
		this.aFloat131 = local9 * this.aFloat131 - local15 * local37;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	@Override
	public void method8326(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class307.aFloatArray88[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class307.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat123;
		@Pc(21) float local21 = this.aFloat127;
		@Pc(24) float local24 = this.aFloat121;
		this.aFloat123 = local18 * local9 - this.aFloat125 * local15;
		@Pc(37) float local37 = this.aFloat129;
		this.aFloat127 = local21 * local9 - this.aFloat130 * local15;
		this.aFloat125 = local9 * this.aFloat125 + local18 * local15;
		this.aFloat121 = local9 * local24 - this.aFloat122 * local15;
		this.aFloat130 = local15 * local21 + this.aFloat130 * local9;
		this.aFloat122 = local9 * this.aFloat122 + local24 * local15;
		this.aFloat129 = local37 * local9 - local15 * this.aFloat131;
		this.aFloat131 = local9 * this.aFloat131 + local37 * local15;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!qq;I)V")
	public void method6184(@OriginalArg(0) Class203 arg0) {
		@Pc(11) Class203_Sub2 local11 = (Class203_Sub2) arg0;
		this.aFloat124 = local11.aFloat123;
		this.aFloat128 = local11.aFloat125;
		this.aFloat120 = local11.aFloat120;
		this.aFloat123 = local11.aFloat124;
		this.aFloat121 = local11.aFloat130;
		this.aFloat125 = local11.aFloat128;
		this.aFloat127 = local11.aFloat127;
		this.aFloat122 = local11.aFloat122;
		this.aFloat130 = local11.aFloat121;
		this.aFloat126 = -(this.aFloat128 * local11.aFloat131 + this.aFloat124 * local11.aFloat129 + local11.aFloat126 * this.aFloat120);
		this.aFloat129 = -(local11.aFloat131 * this.aFloat121 + local11.aFloat126 * this.aFloat123 + local11.aFloat129 * this.aFloat127);
		this.aFloat131 = -(this.aFloat122 * local11.aFloat131 + this.aFloat125 * local11.aFloat126 + local11.aFloat129 * this.aFloat130);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat129 + this.aFloat123 * (float) arg0 + (float) arg1 * this.aFloat127 + this.aFloat121 * (float) arg2);
		arg3[0] = (int) (this.aFloat126 + (float) arg1 * this.aFloat124 + (float) arg0 * this.aFloat120 + this.aFloat128 * (float) arg2);
		arg3[2] = (int) (this.aFloat122 * (float) arg2 + (float) arg1 * this.aFloat130 + (float) arg0 * this.aFloat125 + this.aFloat131);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I)V")
	@Override
	public void method8333(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat126;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat129;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat131;
		arg0[0] = (int) (this.aFloat123 * local19 + local11 * this.aFloat120 + this.aFloat125 * local27);
		arg0[2] = (int) (this.aFloat122 * local27 + this.aFloat128 * local11 + this.aFloat121 * local19);
		arg0[1] = (int) (this.aFloat124 * local11 + this.aFloat127 * local19 + local27 * this.aFloat130);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0) {
		this.aFloat120 = 1.0F;
		this.aFloat127 = this.aFloat122 = Class307.aFloatArray88[arg0 & 0x3FFF];
		this.aFloat130 = Class307.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat121 = -this.aFloat130;
		this.aFloat124 = this.aFloat128 = this.aFloat126 = this.aFloat123 = this.aFloat129 = this.aFloat125 = this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat122 + this.aFloat130 * (float) arg1 + this.aFloat125 * (float) arg0);
		arg3[1] = (int) (this.aFloat121 * (float) arg2 + (float) arg0 * this.aFloat123 + this.aFloat127 * (float) arg1);
		arg3[0] = (int) (this.aFloat120 * (float) arg0 + (float) arg1 * this.aFloat124 + this.aFloat128 * (float) arg2);
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V")
	public void method6186() {
		this.aFloat125 = -this.aFloat125;
		this.aFloat129 = -this.aFloat129;
		this.aFloat130 = -this.aFloat130;
		this.aFloat131 = -this.aFloat131;
		this.aFloat121 = -this.aFloat121;
		this.aFloat127 = -this.aFloat127;
		this.aFloat123 = -this.aFloat123;
		this.aFloat122 = -this.aFloat122;
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(I)[F")
	public float[] method6188() {
		Static110.aFloatArray16[10] = this.aFloat122;
		Static110.aFloatArray16[6] = this.aFloat130;
		Static110.aFloatArray16[14] = 0.0F;
		Static110.aFloatArray16[0] = this.aFloat120;
		Static110.aFloatArray16[2] = this.aFloat125;
		Static110.aFloatArray16[8] = this.aFloat128;
		Static110.aFloatArray16[1] = this.aFloat123;
		Static110.aFloatArray16[4] = this.aFloat124;
		Static110.aFloatArray16[9] = this.aFloat121;
		Static110.aFloatArray16[13] = 0.0F;
		Static110.aFloatArray16[5] = this.aFloat127;
		Static110.aFloatArray16[12] = 0.0F;
		return Static110.aFloatArray16;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method8336(@OriginalArg(0) Class203 arg0) {
		@Pc(6) Class203_Sub2 local6 = (Class203_Sub2) arg0;
		this.aFloat123 = local6.aFloat123;
		this.aFloat130 = local6.aFloat130;
		this.aFloat129 = local6.aFloat129;
		this.aFloat126 = local6.aFloat126;
		this.aFloat120 = local6.aFloat120;
		this.aFloat121 = local6.aFloat121;
		this.aFloat122 = local6.aFloat122;
		this.aFloat124 = local6.aFloat124;
		this.aFloat131 = local6.aFloat131;
		this.aFloat125 = local6.aFloat125;
		this.aFloat128 = local6.aFloat128;
		this.aFloat127 = local6.aFloat127;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
	@Override
	public void method8331(@OriginalArg(0) int arg0) {
		this.aFloat127 = 1.0F;
		this.aFloat120 = this.aFloat122 = Class307.aFloatArray88[arg0 & 0x3FFF];
		this.aFloat128 = Class307.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat125 = -this.aFloat128;
		this.aFloat124 = this.aFloat126 = this.aFloat123 = this.aFloat121 = this.aFloat129 = this.aFloat130 = this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class307.aFloatArray88[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class307.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat120;
		@Pc(21) float local21 = this.aFloat124;
		@Pc(24) float local24 = this.aFloat128;
		this.aFloat120 = local9 * local18 - local15 * this.aFloat123;
		@Pc(38) float local38 = this.aFloat126;
		this.aFloat124 = local9 * local21 - this.aFloat127 * local15;
		this.aFloat123 = local9 * this.aFloat123 + local15 * local18;
		this.aFloat128 = local24 * local9 - this.aFloat121 * local15;
		this.aFloat127 = local21 * local15 + this.aFloat127 * local9;
		this.aFloat121 = local9 * this.aFloat121 + local15 * local24;
		this.aFloat126 = local38 * local9 - this.aFloat129 * local15;
		this.aFloat129 = local38 * local15 + local9 * this.aFloat129;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat126);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat131);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat129);
		arg3[2] = (int) ((float) local17 * this.aFloat122 + this.aFloat128 * (float) local10 + (float) local24 * this.aFloat121);
		arg3[1] = (int) (this.aFloat124 * (float) local10 + this.aFloat127 * (float) local24 + (float) local17 * this.aFloat130);
		arg3[0] = (int) (this.aFloat123 * (float) local24 + (float) local10 * this.aFloat120 + (float) local17 * this.aFloat125);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method8323() {
		@Pc(7) Class203_Sub2 local7 = new Class203_Sub2();
		local7.aFloat126 = this.aFloat126;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat129 = this.aFloat129;
		return local7;
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(I)[F")
	public float[] method6190() {
		Static110.aFloatArray16[13] = this.aFloat129;
		Static110.aFloatArray16[5] = this.aFloat127;
		Static110.aFloatArray16[10] = this.aFloat122;
		Static110.aFloatArray16[0] = this.aFloat120;
		Static110.aFloatArray16[2] = this.aFloat125;
		Static110.aFloatArray16[1] = this.aFloat123;
		Static110.aFloatArray16[6] = this.aFloat130;
		Static110.aFloatArray16[12] = this.aFloat126;
		Static110.aFloatArray16[8] = this.aFloat128;
		Static110.aFloatArray16[9] = this.aFloat121;
		Static110.aFloatArray16[14] = this.aFloat131;
		Static110.aFloatArray16[4] = this.aFloat124;
		return Static110.aFloatArray16;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	@Override
	public void method8337() {
		this.aFloat123 = this.aFloat125 = this.aFloat124 = this.aFloat130 = this.aFloat128 = this.aFloat121 = this.aFloat126 = this.aFloat129 = this.aFloat131 = 0.0F;
		this.aFloat120 = this.aFloat127 = this.aFloat122 = 1.0F;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat131 += (float) arg2;
		this.aFloat126 += (float) arg0;
		this.aFloat129 += (float) arg1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IFF[FFF)V")
	public void method6191(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(67) float local67;
		@Pc(43) float local43;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local43 = -arg4 / arg1;
			local67 = this.aFloat131 + local43 * this.aFloat125;
			local59 = this.aFloat123 * local43 + this.aFloat129;
			local51 = this.aFloat126 + local43 * this.aFloat120;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local43 = -arg4 / arg0;
			local51 = this.aFloat124 * local43 + this.aFloat126;
			local67 = local43 * this.aFloat130 + this.aFloat131;
			local59 = local43 * this.aFloat127 + this.aFloat129;
		} else {
			local43 = -arg4 / arg3;
			local51 = this.aFloat128 * local43 + this.aFloat126;
			local59 = this.aFloat121 * local43 + this.aFloat129;
			local67 = this.aFloat122 * local43 + this.aFloat131;
		}
		arg2[0] = this.aFloat124 * arg0 + arg1 * this.aFloat120 + arg3 * this.aFloat128;
		arg2[2] = this.aFloat122 * arg3 + this.aFloat125 * arg1 + arg0 * this.aFloat130;
		arg2[1] = this.aFloat121 * arg3 + arg1 * this.aFloat123 + arg0 * this.aFloat127;
		arg2[3] = -(arg2[0] * local51 + local59 * arg2[1] + arg2[2] * local67);
	}
}
