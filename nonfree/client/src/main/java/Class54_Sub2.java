import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "F")
	public float aFloat118;

	@OriginalMember(owner = "client!kl", name = "t", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!kl", name = "L", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!kl", name = "M", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class54_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!kl", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat126 = 1.0F;
		this.aFloat129 = this.aFloat127 = Class211.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat122 = Class211.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat120 = this.aFloat119 = this.aFloat128 = this.aFloat125 = this.aFloat118 = this.aFloat123 = this.aFloat121 = 0.0F;
		this.aFloat124 = -this.aFloat122;
	}

	@OriginalMember(owner = "client!kl", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat127 + this.aFloat123 * (float) arg0 + this.aFloat122 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat119 + (float) arg1 * this.aFloat120 + this.aFloat126 * (float) arg0);
		arg3[1] = (int) (this.aFloat125 * (float) arg0 + this.aFloat129 * (float) arg1 + this.aFloat124 * (float) arg2);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class54 method7693() {
		@Pc(7) Class54_Sub2 local7 = new Class54_Sub2();
		local7.aFloat124 = this.aFloat124;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat118 = this.aFloat118;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat119 = this.aFloat119;
		return local7;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)[F")
	public float[] method4407() {
		Static335.aFloatArray52[14] = this.aFloat121;
		Static335.aFloatArray52[2] = this.aFloat123;
		Static335.aFloatArray52[1] = this.aFloat125;
		Static335.aFloatArray52[4] = this.aFloat120;
		Static335.aFloatArray52[6] = this.aFloat122;
		Static335.aFloatArray52[0] = this.aFloat126;
		Static335.aFloatArray52[13] = this.aFloat118;
		Static335.aFloatArray52[8] = this.aFloat119;
		Static335.aFloatArray52[10] = this.aFloat127;
		Static335.aFloatArray52[12] = this.aFloat128;
		Static335.aFloatArray52[9] = this.aFloat124;
		Static335.aFloatArray52[5] = this.aFloat129;
		return Static335.aFloatArray52;
	}

	@OriginalMember(owner = "client!kl", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat128;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat118;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat121;
		arg0[2] = (int) (local21 * this.aFloat124 + local12 * this.aFloat119 + this.aFloat127 * local29);
		arg0[0] = (int) (this.aFloat123 * local29 + this.aFloat126 * local12 + this.aFloat125 * local21);
		arg0[1] = (int) (local29 * this.aFloat122 + this.aFloat129 * local21 + local12 * this.aFloat120);
	}

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class211.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class211.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat125;
		@Pc(21) float local21 = this.aFloat129;
		@Pc(24) float local24 = this.aFloat124;
		@Pc(27) float local27 = this.aFloat118;
		this.aFloat125 = local9 * local18 - local15 * this.aFloat123;
		this.aFloat129 = local21 * local9 - local15 * this.aFloat122;
		this.aFloat123 = this.aFloat123 * local9 + local15 * local18;
		this.aFloat124 = local24 * local9 - local15 * this.aFloat127;
		this.aFloat122 = local9 * this.aFloat122 + local15 * local21;
		this.aFloat127 = local15 * local24 + local9 * this.aFloat127;
		this.aFloat118 = local27 * local9 - this.aFloat121 * local15;
		this.aFloat121 = local27 * local15 + local9 * this.aFloat121;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat129 = 1.0F;
		this.aFloat126 = this.aFloat127 = Class211.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat119 = Class211.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat120 = this.aFloat128 = this.aFloat125 = this.aFloat124 = this.aFloat118 = this.aFloat122 = this.aFloat121 = 0.0F;
		this.aFloat123 = -this.aFloat119;
	}

	@OriginalMember(owner = "client!kl", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class211.aFloatArray51[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class211.aFloatArray50[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class211.aFloatArray51[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class211.aFloatArray50[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class211.aFloatArray51[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class211.aFloatArray50[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat119 = local21 * local47 + local33 * -local27;
		this.aFloat123 = local27 * local9;
		this.aFloat124 = local39 * local27 + local43 * local21;
		this.aFloat126 = local27 * local47 + local33 * local21;
		this.aFloat127 = local21 * local9;
		this.aFloat125 = local39 * -local21 + local27 * local43;
		this.aFloat120 = local9 * local39;
		this.aFloat129 = local9 * local33;
		this.aFloat122 = -local15;
		this.aFloat121 = -((float) arg2 * this.aFloat127) + (float) -arg0 * this.aFloat123 - (float) arg1 * this.aFloat122;
		this.aFloat118 = -(this.aFloat129 * (float) arg1) + (float) -arg0 * this.aFloat125 - (float) arg2 * this.aFloat124;
		this.aFloat128 = -(this.aFloat120 * (float) arg1) + (float) -arg0 * this.aFloat126 - (float) arg2 * this.aFloat119;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat128 + this.aFloat119 * (float) arg2 + this.aFloat120 * (float) arg1 + (float) arg0 * this.aFloat126);
		arg3[2] = (int) (this.aFloat121 + this.aFloat127 * (float) arg2 + this.aFloat122 * (float) arg1 + this.aFloat123 * (float) arg0);
		arg3[1] = (int) ((float) arg1 * this.aFloat129 + this.aFloat125 * (float) arg0 + (float) arg2 * this.aFloat124 + this.aFloat118);
	}

	@OriginalMember(owner = "client!kl", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub2 local6 = (Class54_Sub2) arg0;
		this.aFloat124 = local6.aFloat124;
		this.aFloat129 = local6.aFloat129;
		this.aFloat118 = local6.aFloat118;
		this.aFloat127 = local6.aFloat127;
		this.aFloat119 = local6.aFloat119;
		this.aFloat122 = local6.aFloat122;
		this.aFloat126 = local6.aFloat126;
		this.aFloat125 = local6.aFloat125;
		this.aFloat121 = local6.aFloat121;
		this.aFloat128 = local6.aFloat128;
		this.aFloat120 = local6.aFloat120;
		this.aFloat123 = local6.aFloat123;
	}

	@OriginalMember(owner = "client!kl", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat126 = this.aFloat129 = this.aFloat127 = 1.0F;
		this.aFloat125 = this.aFloat123 = this.aFloat120 = this.aFloat122 = this.aFloat119 = this.aFloat124 = this.aFloat128 = this.aFloat118 = this.aFloat121 = 0.0F;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)[F")
	public float[] method4408() {
		Static335.aFloatArray52[13] = 0.0F;
		Static335.aFloatArray52[8] = this.aFloat119;
		Static335.aFloatArray52[14] = 0.0F;
		Static335.aFloatArray52[9] = this.aFloat124;
		Static335.aFloatArray52[2] = this.aFloat123;
		Static335.aFloatArray52[4] = this.aFloat120;
		Static335.aFloatArray52[12] = 0.0F;
		Static335.aFloatArray52[1] = this.aFloat125;
		Static335.aFloatArray52[6] = this.aFloat122;
		Static335.aFloatArray52[10] = this.aFloat127;
		Static335.aFloatArray52[5] = this.aFloat129;
		Static335.aFloatArray52[0] = this.aFloat126;
		return Static335.aFloatArray52;
	}

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat118 += arg1;
		this.aFloat121 += arg2;
		this.aFloat128 += arg0;
	}

	@OriginalMember(owner = "client!kl", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class211.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class211.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat119;
		this.aFloat126 = local18 * local9 + local15 * this.aFloat123;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat120 = this.aFloat122 * local15 + local9 * local21;
		this.aFloat123 = this.aFloat123 * local9 - local18 * local15;
		this.aFloat122 = local9 * this.aFloat122 - local21 * local15;
		this.aFloat119 = this.aFloat127 * local15 + local9 * local24;
		this.aFloat127 = this.aFloat127 * local9 - local24 * local15;
		this.aFloat128 = this.aFloat121 * local15 + local37 * local9;
		this.aFloat121 = local9 * this.aFloat121 - local37 * local15;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method4411(@OriginalArg(0) Class54 arg0) {
		@Pc(6) Class54_Sub2 local6 = (Class54_Sub2) arg0;
		this.aFloat119 = local6.aFloat123;
		this.aFloat120 = local6.aFloat125;
		this.aFloat126 = local6.aFloat126;
		this.aFloat129 = local6.aFloat129;
		this.aFloat125 = local6.aFloat120;
		this.aFloat124 = local6.aFloat122;
		this.aFloat123 = local6.aFloat119;
		this.aFloat128 = -(local6.aFloat121 * this.aFloat119 + local6.aFloat118 * this.aFloat120 + this.aFloat126 * local6.aFloat128);
		this.aFloat127 = local6.aFloat127;
		this.aFloat122 = local6.aFloat124;
		this.aFloat118 = -(this.aFloat125 * local6.aFloat128 + local6.aFloat118 * this.aFloat129 + local6.aFloat121 * this.aFloat124);
		this.aFloat121 = -(local6.aFloat128 * this.aFloat123 + local6.aFloat118 * this.aFloat122 + this.aFloat127 * local6.aFloat121);
	}

	@OriginalMember(owner = "client!kl", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat128 = arg0;
		this.aFloat126 = this.aFloat129 = this.aFloat127 = 1.0F;
		this.aFloat121 = arg2;
		this.aFloat125 = this.aFloat123 = this.aFloat120 = this.aFloat122 = this.aFloat119 = this.aFloat124 = 0.0F;
		this.aFloat118 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFIBIIF)V")
	public void method4412(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat125 = this.aFloat123 = this.aFloat120 = this.aFloat122 = this.aFloat119 = this.aFloat124 = 0.0F;
			this.aFloat126 = arg3;
			this.aFloat127 = 1.0F;
			this.aFloat129 = arg2;
		} else {
			@Pc(11) float local11 = Class211.aFloatArray51[arg4 & 0x3FFF];
			@Pc(17) float local17 = Class211.aFloatArray50[arg4 & 0x3FFF];
			this.aFloat127 = 1.0F;
			this.aFloat126 = (float) arg3 * local11;
			this.aFloat129 = local11 * (float) arg2;
			this.aFloat125 = (float) arg3 * local17;
			this.aFloat120 = -local17 * (float) arg2;
			this.aFloat123 = this.aFloat122 = this.aFloat119 = this.aFloat124 = 0.0F;
		}
		this.aFloat128 = arg0;
		this.aFloat121 = arg1;
		this.aFloat118 = arg5;
	}

	@OriginalMember(owner = "client!kl", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat127 = 1.0F;
		this.aFloat126 = this.aFloat129 = Class211.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat125 = Class211.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat119 = this.aFloat128 = this.aFloat124 = this.aFloat118 = this.aFloat123 = this.aFloat122 = this.aFloat121 = 0.0F;
		this.aFloat120 = -this.aFloat125;
	}
}
