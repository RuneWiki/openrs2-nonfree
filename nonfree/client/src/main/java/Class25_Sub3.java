import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!jba", name = "U", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!jba", name = "W", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!jba", name = "ab", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!jba", name = "fb", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "()V")
	public Class25_Sub3() {
		this.method4291();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FFFBFFFFFF)V")
	public void method4305(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat131 = arg4;
		this.aFloat128 = 0.0F;
		this.aFloat130 = arg7;
		this.aFloat126 = arg0;
		this.aFloat129 = 0.0F;
		this.aFloat125 = arg1;
		this.aFloat120 = arg6;
		this.aFloat124 = arg2;
		this.aFloat127 = arg3;
		this.aFloat122 = 0.0F;
		this.aFloat121 = arg5;
		this.aFloat123 = arg8;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class23_Sub2_Sub3.aFloatArray76[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class23_Sub2_Sub3.aFloatArray75[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class23_Sub2_Sub3.aFloatArray76[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class23_Sub2_Sub3.aFloatArray75[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat125 = -local15;
		this.aFloat127 = local43 * local27 + local39 * -local21;
		this.aFloat123 = local27 * local39 + local43 * local21;
		this.aFloat126 = local33 * -local27 + local21 * local47;
		this.aFloat121 = local33 * local21 + local47 * local27;
		this.aFloat124 = local9 * local21;
		this.aFloat130 = local33 * local9;
		this.aFloat131 = local27 * local9;
		this.aFloat120 = local9 * local39;
		this.aFloat129 = -((float) arg1 * this.aFloat120) + this.aFloat121 * (float) -arg0 - (float) arg2 * this.aFloat126;
		this.aFloat128 = -((float) arg2 * this.aFloat123) - this.aFloat130 * (float) arg1 + this.aFloat127 * (float) -arg0;
		this.aFloat122 = -(this.aFloat124 * (float) arg2) - (float) arg1 * this.aFloat125 + this.aFloat131 * (float) -arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	@Override
	public void method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat122 += (float) arg2;
		this.aFloat129 += (float) arg0;
		this.aFloat128 += (float) arg1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat130 * (float) arg1 + (float) arg0 * this.aFloat127 + (float) arg2 * this.aFloat123 + this.aFloat128);
		arg3[0] = (int) ((float) arg0 * this.aFloat121 + this.aFloat120 * (float) arg1 + this.aFloat126 * (float) arg2 + this.aFloat129);
		arg3[2] = (int) (this.aFloat122 + this.aFloat131 * (float) arg0 + (float) arg1 * this.aFloat125 + this.aFloat124 * (float) arg2);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IFFF)F")
	public float method4306(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat124 * arg0 + this.aFloat125 * arg2 + this.aFloat131 * arg1 + this.aFloat122;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([FIFFF)V")
	public void method4307(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[1] = arg1 * this.aFloat123 + this.aFloat130 * arg2 + arg3 * this.aFloat127;
		arg0[2] = this.aFloat124 * arg1 + this.aFloat131 * arg3 + this.aFloat125 * arg2;
		arg0[0] = arg3 * this.aFloat121 + arg2 * this.aFloat120 + arg1 * this.aFloat126;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method4292() {
		@Pc(7) Class25_Sub3 local7 = new Class25_Sub3();
		local7.aFloat130 = this.aFloat130;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat129 = this.aFloat129;
		return local7;
	}

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
	@Override
	public void method4298(@OriginalArg(0) int arg0) {
		this.aFloat124 = 1.0F;
		this.aFloat121 = this.aFloat130 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat127 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat126 = this.aFloat129 = this.aFloat123 = this.aFloat128 = this.aFloat131 = this.aFloat125 = this.aFloat122 = 0.0F;
		this.aFloat120 = -this.aFloat127;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!sk;Lclient!sk;)V")
	public void method4309(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		@Pc(9) Class25_Sub3 local9 = (Class25_Sub3) arg1;
		this.aFloat121 = local6.aFloat120 * local9.aFloat127 + local6.aFloat121 * local9.aFloat121 + local6.aFloat126 * local9.aFloat131;
		this.aFloat127 = local9.aFloat131 * local6.aFloat123 + local6.aFloat130 * local9.aFloat127 + local6.aFloat127 * local9.aFloat121;
		this.aFloat120 = local6.aFloat120 * local9.aFloat130 + local6.aFloat121 * local9.aFloat120 + local6.aFloat126 * local9.aFloat125;
		this.aFloat131 = local6.aFloat124 * local9.aFloat131 + local6.aFloat131 * local9.aFloat121 + local9.aFloat127 * local6.aFloat125;
		this.aFloat130 = local6.aFloat123 * local9.aFloat125 + local9.aFloat130 * local6.aFloat130 + local9.aFloat120 * local6.aFloat127;
		this.aFloat126 = local9.aFloat124 * local6.aFloat126 + local9.aFloat123 * local6.aFloat120 + local9.aFloat126 * local6.aFloat121;
		this.aFloat125 = local6.aFloat124 * local9.aFloat125 + local6.aFloat131 * local9.aFloat120 + local6.aFloat125 * local9.aFloat130;
		this.aFloat123 = local9.aFloat123 * local6.aFloat130 + local9.aFloat126 * local6.aFloat127 + local6.aFloat123 * local9.aFloat124;
		this.aFloat124 = local6.aFloat124 * local9.aFloat124 + local9.aFloat126 * local6.aFloat131 + local6.aFloat125 * local9.aFloat123;
		this.aFloat129 = local9.aFloat122 * local6.aFloat126 + local9.aFloat128 * local6.aFloat120 + local9.aFloat129 * local6.aFloat121 + local6.aFloat129;
		this.aFloat128 = local6.aFloat127 * local9.aFloat129 + local6.aFloat130 * local9.aFloat128 + local6.aFloat123 * local9.aFloat122 + local6.aFloat128;
		this.aFloat122 = local6.aFloat125 * local9.aFloat128 + local9.aFloat129 * local6.aFloat131 + local6.aFloat124 * local9.aFloat122 + local6.aFloat122;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!sk;Z)V")
	public void method4311(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat121;
		@Pc(12) float local12 = this.aFloat127;
		@Pc(15) float local15 = this.aFloat120;
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat126;
		@Pc(24) float local24 = this.aFloat123;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat127 = local6.aFloat123 * this.aFloat131 + local6.aFloat130 * local12 + local6.aFloat127 * local9;
		this.aFloat121 = local6.aFloat126 * this.aFloat131 + local6.aFloat121 * local9 + local6.aFloat120 * local12;
		@Pc(69) float local69 = this.aFloat128;
		this.aFloat130 = local6.aFloat130 * local18 + local6.aFloat127 * local15 + local6.aFloat123 * this.aFloat125;
		this.aFloat120 = this.aFloat125 * local6.aFloat126 + local6.aFloat120 * local18 + local6.aFloat121 * local15;
		this.aFloat131 = local12 * local6.aFloat125 + local9 * local6.aFloat131 + this.aFloat131 * local6.aFloat124;
		this.aFloat123 = local6.aFloat127 * local21 + local24 * local6.aFloat130 + local6.aFloat123 * this.aFloat124;
		this.aFloat125 = local6.aFloat125 * local18 + local15 * local6.aFloat131 + this.aFloat125 * local6.aFloat124;
		this.aFloat126 = this.aFloat124 * local6.aFloat126 + local24 * local6.aFloat120 + local21 * local6.aFloat121;
		this.aFloat128 = local6.aFloat128 + local27 * local6.aFloat127 + local69 * local6.aFloat130 + this.aFloat122 * local6.aFloat123;
		this.aFloat124 = this.aFloat124 * local6.aFloat124 + local21 * local6.aFloat131 + local6.aFloat125 * local24;
		this.aFloat129 = local6.aFloat129 + this.aFloat122 * local6.aFloat126 + local27 * local6.aFloat121 + local6.aFloat120 * local69;
		this.aFloat122 = local6.aFloat122 + local6.aFloat124 * this.aFloat122 + local27 * local6.aFloat131 + local69 * local6.aFloat125;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat127 = this.aFloat131 = this.aFloat120 = this.aFloat125 = this.aFloat126 = this.aFloat123 = 0.0F;
		this.aFloat122 = (float) arg2;
		this.aFloat128 = (float) arg1;
		this.aFloat129 = (float) arg0;
		this.aFloat121 = this.aFloat130 = this.aFloat124 = 1.0F;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I[F)[F")
	public float[] method4312(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat120;
		arg0[4] = this.aFloat127;
		arg0[6] = this.aFloat123;
		arg0[5] = this.aFloat130;
		arg0[0] = this.aFloat121;
		arg0[7] = this.aFloat128;
		arg0[3] = this.aFloat129;
		arg0[2] = this.aFloat126;
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
	@Override
	public void method4289(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat121 = this.aFloat124 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat126 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat120 = this.aFloat129 = this.aFloat127 = this.aFloat123 = this.aFloat128 = this.aFloat125 = this.aFloat122 = 0.0F;
		this.aFloat131 = -this.aFloat126;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	@Override
	public void method4284(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat127;
		@Pc(21) float local21 = this.aFloat130;
		@Pc(24) float local24 = this.aFloat123;
		@Pc(27) float local27 = this.aFloat128;
		this.aFloat127 = local9 * local18 - local15 * this.aFloat131;
		this.aFloat131 = local9 * this.aFloat131 + local18 * local15;
		this.aFloat130 = local21 * local9 - local15 * this.aFloat125;
		this.aFloat125 = local9 * this.aFloat125 + local15 * local21;
		this.aFloat123 = local24 * local9 - local15 * this.aFloat124;
		this.aFloat124 = local9 * this.aFloat124 + local24 * local15;
		this.aFloat128 = local27 * local9 - local15 * this.aFloat122;
		this.aFloat122 = this.aFloat122 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat125 + this.aFloat131 * (float) arg0 + (float) arg2 * this.aFloat124);
		arg3[1] = (int) (this.aFloat130 * (float) arg1 + this.aFloat127 * (float) arg0 + this.aFloat123 * (float) arg2);
		arg3[0] = (int) (this.aFloat126 * (float) arg2 + this.aFloat121 * (float) arg0 + this.aFloat120 * (float) arg1);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FIFF)F")
	public float method4314(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat120 * arg1 + this.aFloat121 * arg0 + this.aFloat126 * arg2 + this.aFloat129;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)V")
	@Override
	public void method4288(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat121;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat126;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat121 = local15 * this.aFloat131 + local9 * local18;
		this.aFloat131 = this.aFloat131 * local9 - local15 * local18;
		this.aFloat120 = local21 * local9 + local15 * this.aFloat125;
		this.aFloat125 = this.aFloat125 * local9 - local21 * local15;
		this.aFloat126 = this.aFloat124 * local15 + local24 * local9;
		this.aFloat129 = local15 * this.aFloat122 + local9 * local27;
		this.aFloat124 = this.aFloat124 * local9 - local24 * local15;
		this.aFloat122 = this.aFloat122 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIFIFIF)V")
	public void method4315(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat124 = 1.0F;
			this.aFloat130 = (float) (arg0 * 2);
			this.aFloat121 = (float) (arg4 * 2);
			this.aFloat129 = arg1 - (float) arg4;
			this.aFloat122 = arg3;
			this.aFloat127 = this.aFloat131 = this.aFloat120 = this.aFloat125 = this.aFloat126 = this.aFloat123 = 0.0F;
			this.aFloat128 = (float) -arg0 + arg5;
			return;
		}
		@Pc(13) float local13 = Class23_Sub2_Sub3.aFloatArray76[arg2 & 0x3FFF];
		@Pc(19) float local19 = Class23_Sub2_Sub3.aFloatArray75[arg2 & 0x3FFF];
		this.aFloat131 = this.aFloat125 = this.aFloat126 = this.aFloat123 = 0.0F;
		this.aFloat130 = (float) arg0 * 2.0F * local13;
		this.aFloat129 = (float) (arg4 * 2) * (local19 * 0.5F - local13 * 0.5F) + arg1;
		this.aFloat121 = (float) arg4 * local13 * 2.0F;
		this.aFloat127 = local19 * 2.0F * (float) arg4;
		this.aFloat122 = arg3;
		this.aFloat128 = arg5 + (local19 * -0.5F - local13 * 0.5F) * (float) (arg0 * 2);
		this.aFloat124 = 1.0F;
		this.aFloat120 = -2.0F * local19 * (float) arg0;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I[F)[F")
	public float[] method4316(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat126;
		arg0[4] = this.aFloat127;
		arg0[1] = this.aFloat120;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat124;
		arg0[8] = this.aFloat131;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat123;
		arg0[0] = this.aFloat121;
		arg0[5] = this.aFloat130;
		arg0[13] = 0.0F;
		arg0[15] = 0.0F;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat125;
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FI[FFFF)V")
	public void method4317(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(42) float local42;
		@Pc(34) float local34;
		@Pc(50) float local50;
		@Pc(26) float local26;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local26 = -arg3 / arg4;
			local42 = this.aFloat121 * local26 + this.aFloat129;
			local50 = this.aFloat131 * local26 + this.aFloat122;
			local34 = this.aFloat128 + this.aFloat127 * local26;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local26 = -arg3 / arg2;
			local34 = this.aFloat128 + this.aFloat130 * local26;
			local42 = local26 * this.aFloat120 + this.aFloat129;
			local50 = this.aFloat122 + this.aFloat125 * local26;
		} else {
			local26 = -arg3 / arg0;
			local42 = local26 * this.aFloat126 + this.aFloat129;
			local34 = this.aFloat128 + this.aFloat123 * local26;
			local50 = this.aFloat122 + this.aFloat124 * local26;
		}
		arg1[2] = arg2 * this.aFloat125 + arg4 * this.aFloat131 + arg0 * this.aFloat124;
		arg1[1] = arg2 * this.aFloat130 + arg4 * this.aFloat127 + arg0 * this.aFloat123;
		arg1[0] = this.aFloat121 * arg4 + arg2 * this.aFloat120 + this.aFloat126 * arg0;
		arg1[3] = -(arg1[1] * local34 + arg1[0] * local42 + local50 * arg1[2]);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!sk;)V")
	public void method4318(@OriginalArg(1) Class25 arg0) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		this.aFloat124 = local6.aFloat124;
		this.aFloat128 = (float) 0;
		this.aFloat130 = local6.aFloat130;
		this.aFloat129 = 0.0F;
		this.aFloat120 = local6.aFloat120;
		this.aFloat126 = local6.aFloat126;
		this.aFloat131 = local6.aFloat131;
		this.aFloat125 = local6.aFloat125;
		this.aFloat127 = local6.aFloat127;
		this.aFloat122 = 0.0F;
		this.aFloat121 = local6.aFloat121;
		this.aFloat123 = local6.aFloat123;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FFIF)V")
	public void method4319(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat127 = this.aFloat131 = this.aFloat120 = this.aFloat125 = this.aFloat126 = this.aFloat123 = 0.0F;
		this.aFloat129 = arg2;
		this.aFloat128 = arg1;
		this.aFloat122 = arg0;
		this.aFloat121 = this.aFloat130 = this.aFloat124 = 1.0F;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(FIFF)V")
	public void method4320(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat128 *= arg2;
		this.aFloat122 *= arg0;
		this.aFloat124 *= arg0;
		this.aFloat123 *= arg2;
		this.aFloat126 *= arg1;
		this.aFloat129 *= arg1;
		this.aFloat130 *= arg2;
		this.aFloat131 *= arg0;
		this.aFloat121 *= arg1;
		this.aFloat120 *= arg1;
		this.aFloat127 *= arg2;
		this.aFloat125 *= arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([FZ)[F")
	public float[] method4321(@OriginalArg(0) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat122;
		arg0[9] = this.aFloat128;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat121;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat127;
		arg0[4] = this.aFloat120;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[2] = 0.0F;
		arg0[8] = this.aFloat129;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat130;
		arg0[7] = 0.0F;
		arg0[6] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	@Override
	public void method4285(@OriginalArg(0) int arg0) {
		this.aFloat121 = 1.0F;
		this.aFloat130 = this.aFloat124 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat125 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat123 = -this.aFloat125;
		this.aFloat120 = this.aFloat126 = this.aFloat129 = this.aFloat127 = this.aFloat128 = this.aFloat131 = this.aFloat122 = 0.0F;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(FFIF)V")
	public void method4322(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat128 += arg2;
		this.aFloat122 += arg1;
		this.aFloat129 += arg0;
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)V")
	@Override
	public void method4293(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat121;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat126;
		@Pc(27) float local27 = this.aFloat129;
		this.aFloat121 = local9 * local18 - local15 * this.aFloat127;
		this.aFloat120 = local9 * local21 - this.aFloat130 * local15;
		this.aFloat127 = local15 * local18 + local9 * this.aFloat127;
		this.aFloat130 = local15 * local21 + this.aFloat130 * local9;
		this.aFloat126 = local24 * local9 - local15 * this.aFloat123;
		this.aFloat129 = local9 * local27 - local15 * this.aFloat128;
		this.aFloat123 = this.aFloat123 * local9 + local15 * local24;
		this.aFloat128 = local9 * this.aFloat128 + local15 * local27;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(FFIF)V")
	public void method4323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat121 = arg0;
		this.aFloat123 = 0.0F;
		this.aFloat128 = 0.0F;
		this.aFloat131 = 0.0F;
		this.aFloat127 = 0.0F;
		this.aFloat122 = 0.0F;
		this.aFloat120 = 0.0F;
		this.aFloat130 = arg1;
		this.aFloat125 = 0.0F;
		this.aFloat129 = 0.0F;
		this.aFloat124 = arg2;
		this.aFloat126 = 0.0F;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
	public void method4324() {
		this.aFloat131 = -this.aFloat131;
		this.aFloat122 = -this.aFloat122;
		this.aFloat124 = -this.aFloat124;
		this.aFloat127 = -this.aFloat127;
		this.aFloat123 = -this.aFloat123;
		this.aFloat128 = -this.aFloat128;
		this.aFloat125 = -this.aFloat125;
		this.aFloat130 = -this.aFloat130;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method4297(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		this.aFloat131 = local6.aFloat131;
		this.aFloat120 = local6.aFloat120;
		this.aFloat128 = local6.aFloat128;
		this.aFloat129 = local6.aFloat129;
		this.aFloat124 = local6.aFloat124;
		this.aFloat126 = local6.aFloat126;
		this.aFloat122 = local6.aFloat122;
		this.aFloat130 = local6.aFloat130;
		this.aFloat123 = local6.aFloat123;
		this.aFloat121 = local6.aFloat121;
		this.aFloat125 = local6.aFloat125;
		this.aFloat127 = local6.aFloat127;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([FI)[F")
	public float[] method4325(@OriginalArg(0) float[] arg0) {
		arg0[2] = this.aFloat131;
		arg0[8] = this.aFloat126;
		arg0[0] = this.aFloat121;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat120;
		arg0[12] = this.aFloat129;
		arg0[6] = this.aFloat125;
		arg0[5] = this.aFloat130;
		arg0[9] = this.aFloat123;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat124;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat127;
		arg0[14] = this.aFloat122;
		arg0[13] = this.aFloat128;
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([I)V")
	@Override
	public void method4299(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat129;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat128;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat122;
		arg0[0] = (int) (local11 * this.aFloat121 + this.aFloat127 * local19 + local27 * this.aFloat131);
		arg0[2] = (int) (local27 * this.aFloat124 + local19 * this.aFloat123 + this.aFloat126 * local11);
		arg0[1] = (int) (local27 * this.aFloat125 + local11 * this.aFloat120 + this.aFloat130 * local19);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!sk;I)V")
	public void method4326(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		this.aFloat120 = local6.aFloat127;
		this.aFloat126 = local6.aFloat131;
		this.aFloat121 = local6.aFloat121;
		this.aFloat123 = local6.aFloat125;
		this.aFloat131 = local6.aFloat126;
		this.aFloat127 = local6.aFloat120;
		this.aFloat130 = local6.aFloat130;
		this.aFloat125 = local6.aFloat123;
		this.aFloat129 = -(this.aFloat126 * local6.aFloat122 + local6.aFloat129 * this.aFloat121 + local6.aFloat128 * this.aFloat120);
		this.aFloat124 = local6.aFloat124;
		this.aFloat128 = -(local6.aFloat122 * this.aFloat123 + local6.aFloat128 * this.aFloat130 + this.aFloat127 * local6.aFloat129);
		this.aFloat122 = -(local6.aFloat122 * this.aFloat124 + local6.aFloat128 * this.aFloat125 + this.aFloat131 * local6.aFloat129);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat122);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat129);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat128);
		arg3[1] = (int) ((float) local6 * this.aFloat125 + (float) local24 * this.aFloat130 + (float) local13 * this.aFloat120);
		arg3[0] = (int) ((float) local24 * this.aFloat127 + (float) local13 * this.aFloat121 + (float) local6 * this.aFloat131);
		arg3[2] = (int) ((float) local13 * this.aFloat126 + this.aFloat123 * (float) local24 + (float) local6 * this.aFloat124);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(FFIF)F")
	public float method4327(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat130 * arg1 + arg2 * this.aFloat127 + arg0 * this.aFloat123 + this.aFloat128;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([FB)[F")
	public float[] method4328(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat129;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat131;
		arg0[5] = this.aFloat130;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat123;
		arg0[0] = this.aFloat121;
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat124;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat125;
		arg0[2] = this.aFloat126;
		arg0[7] = this.aFloat128;
		arg0[4] = this.aFloat127;
		arg0[11] = this.aFloat122;
		arg0[1] = this.aFloat120;
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "()V")
	@Override
	public void method4291() {
		this.aFloat121 = this.aFloat130 = this.aFloat124 = 1.0F;
		this.aFloat127 = this.aFloat131 = this.aFloat120 = this.aFloat125 = this.aFloat126 = this.aFloat123 = this.aFloat129 = this.aFloat128 = this.aFloat122 = 0.0F;
	}
}
