import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "F")
	public float aFloat119;

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "F")
	public float aFloat120;

	@OriginalMember(owner = "client!haa", name = "v", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!haa", name = "z", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!haa", name = "B", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!haa", name = "C", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!haa", name = "H", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!haa", name = "P", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!haa", name = "U", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!haa", name = "X", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!haa", name = "bb", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class30_Sub2() {
		this.method4665();
	}

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)V")
	@Override
	public void method4657(@OriginalArg(0) int arg0) {
		this.aFloat125 = 1.0F;
		this.aFloat124 = this.aFloat126 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat122 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat120 = -this.aFloat122;
		this.aFloat121 = this.aFloat128 = this.aFloat129 = this.aFloat123 = this.aFloat130 = this.aFloat119 = this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFIF)V")
	public void method4034(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat127 *= arg1;
		this.aFloat128 *= arg2;
		this.aFloat129 *= arg0;
		this.aFloat122 *= arg0;
		this.aFloat121 *= arg2;
		this.aFloat126 *= arg0;
		this.aFloat123 *= arg0;
		this.aFloat125 *= arg1;
		this.aFloat130 *= arg1;
		this.aFloat124 *= arg2;
		this.aFloat119 *= arg1;
		this.aFloat120 *= arg2;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(III)V")
	@Override
	public void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat127 = arg2;
		this.aFloat124 = this.aFloat126 = this.aFloat125 = 1.0F;
		this.aFloat123 = arg1;
		this.aFloat128 = arg0;
		this.aFloat122 = this.aFloat130 = this.aFloat120 = this.aFloat119 = this.aFloat121 = this.aFloat129 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "()V")
	@Override
	public void method4665() {
		this.aFloat124 = this.aFloat126 = this.aFloat125 = 1.0F;
		this.aFloat122 = this.aFloat130 = this.aFloat120 = this.aFloat119 = this.aFloat121 = this.aFloat129 = this.aFloat128 = this.aFloat123 = this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([FI)[F")
	public float[] method4035(@OriginalArg(0) float[] arg0) {
		arg0[7] = this.aFloat123;
		arg0[5] = this.aFloat126;
		arg0[4] = this.aFloat122;
		arg0[6] = this.aFloat129;
		arg0[1] = this.aFloat120;
		arg0[2] = this.aFloat121;
		arg0[3] = this.aFloat128;
		arg0[0] = this.aFloat124;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub12.aFloatArray53[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub12.aFloatArray52[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub12.aFloatArray53[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub12.aFloatArray52[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat120 = local39 * local9;
		this.aFloat121 = -local27 * local33 + local21 * local47;
		this.aFloat125 = local9 * local21;
		this.aFloat129 = local39 * local27 + local43 * local21;
		this.aFloat124 = local21 * local33 + local47 * local27;
		this.aFloat130 = local9 * local27;
		this.aFloat126 = local33 * local9;
		this.aFloat119 = -local15;
		this.aFloat122 = local27 * local43 + local39 * -local21;
		this.aFloat128 = -(this.aFloat121 * (float) arg2) - (float) arg1 * this.aFloat120 + this.aFloat124 * (float) -arg0;
		this.aFloat123 = (float) -arg0 * this.aFloat122 - this.aFloat126 * (float) arg1 - (float) arg2 * this.aFloat129;
		this.aFloat127 = -(this.aFloat125 * (float) arg2) + this.aFloat130 * (float) -arg0 - this.aFloat119 * (float) arg1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	@Override
	public void method4650(@OriginalArg(0) int arg0) {
		this.aFloat126 = 1.0F;
		this.aFloat124 = this.aFloat125 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat121 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat130 = -this.aFloat121;
		this.aFloat120 = this.aFloat128 = this.aFloat122 = this.aFloat129 = this.aFloat123 = this.aFloat119 = this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
	@Override
	public void method4654(@OriginalArg(0) int arg0) {
		this.aFloat124 = 1.0F;
		this.aFloat126 = this.aFloat125 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat119 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat120 = this.aFloat121 = this.aFloat128 = this.aFloat122 = this.aFloat123 = this.aFloat130 = this.aFloat127 = 0.0F;
		this.aFloat129 = -this.aFloat119;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat127);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat128);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat123);
		arg3[2] = (int) ((float) local10 * this.aFloat125 + (float) local24 * this.aFloat129 + (float) local17 * this.aFloat121);
		arg3[0] = (int) ((float) local17 * this.aFloat124 + (float) local24 * this.aFloat122 + this.aFloat130 * (float) local10);
		arg3[1] = (int) (this.aFloat120 * (float) local17 + this.aFloat126 * (float) local24 + this.aFloat119 * (float) local10);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FZFF)V")
	public void method4036(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat123 = arg0;
		this.aFloat127 = arg1;
		this.aFloat124 = this.aFloat126 = this.aFloat125 = 1.0F;
		this.aFloat128 = arg2;
		this.aFloat122 = this.aFloat130 = this.aFloat120 = this.aFloat119 = this.aFloat121 = this.aFloat129 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)V")
	@Override
	public void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat128 += arg0;
		this.aFloat123 += arg1;
		this.aFloat127 += arg2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!bca;B)V")
	public void method4037(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class30_Sub2 local6 = (Class30_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat124;
		@Pc(12) float local12 = this.aFloat122;
		@Pc(15) float local15 = this.aFloat120;
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat121;
		@Pc(24) float local24 = this.aFloat129;
		@Pc(33) float local33 = this.aFloat128;
		this.aFloat122 = local9 * local6.aFloat122 + local6.aFloat126 * local12 + this.aFloat130 * local6.aFloat129;
		this.aFloat124 = local6.aFloat121 * this.aFloat130 + local6.aFloat124 * local9 + local12 * local6.aFloat120;
		@Pc(70) float local70 = this.aFloat123;
		this.aFloat126 = local6.aFloat129 * this.aFloat119 + local15 * local6.aFloat122 + local6.aFloat126 * local18;
		this.aFloat120 = this.aFloat119 * local6.aFloat121 + local6.aFloat124 * local15 + local18 * local6.aFloat120;
		this.aFloat130 = local12 * local6.aFloat119 + local6.aFloat130 * local9 + this.aFloat130 * local6.aFloat125;
		this.aFloat119 = this.aFloat119 * local6.aFloat125 + local18 * local6.aFloat119 + local6.aFloat130 * local15;
		this.aFloat129 = local6.aFloat126 * local24 + local6.aFloat122 * local21 + this.aFloat125 * local6.aFloat129;
		this.aFloat121 = this.aFloat125 * local6.aFloat121 + local6.aFloat124 * local21 + local24 * local6.aFloat120;
		this.aFloat128 = local6.aFloat128 + local33 * local6.aFloat124 + local6.aFloat120 * local70 + local6.aFloat121 * this.aFloat127;
		this.aFloat123 = local6.aFloat122 * local33 + local70 * local6.aFloat126 + this.aFloat127 * local6.aFloat129 + local6.aFloat123;
		this.aFloat125 = this.aFloat125 * local6.aFloat125 + local6.aFloat130 * local21 + local6.aFloat119 * local24;
		this.aFloat127 = local6.aFloat130 * local33 + local6.aFloat119 * local70 + this.aFloat127 * local6.aFloat125 + local6.aFloat127;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "([FI)[F")
	public float[] method4038(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[13] = this.aFloat123;
		arg0[14] = this.aFloat127;
		arg0[12] = this.aFloat128;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat129;
		arg0[8] = this.aFloat121;
		arg0[4] = this.aFloat120;
		arg0[0] = this.aFloat124;
		arg0[10] = this.aFloat125;
		arg0[5] = this.aFloat126;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat122;
		arg0[3] = 0;
		arg0[2] = this.aFloat130;
		arg0[6] = this.aFloat119;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(F[FFFFB)V")
	public void method4039(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg1[0] = arg2 * this.aFloat120 + arg3 * this.aFloat124 + this.aFloat121 * arg0;
		arg1[1] = this.aFloat122 * arg3 + arg2 * this.aFloat126 + this.aFloat129 * arg0;
		@Pc(74) float local74;
		@Pc(82) float local82;
		@Pc(66) float local66;
		@Pc(58) float local58;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local58 = -arg4 / arg3;
			local66 = this.aFloat127 + local58 * this.aFloat130;
			local74 = this.aFloat128 + local58 * this.aFloat124;
			local82 = local58 * this.aFloat122 + this.aFloat123;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local58 = -arg4 / arg2;
			local82 = this.aFloat123 + local58 * this.aFloat126;
			local66 = this.aFloat127 + this.aFloat119 * local58;
			local74 = this.aFloat128 + this.aFloat120 * local58;
		} else {
			local58 = -arg4 / arg0;
			local74 = this.aFloat121 * local58 + this.aFloat128;
			local82 = this.aFloat129 * local58 + this.aFloat123;
			local66 = this.aFloat127 + local58 * this.aFloat125;
		}
		arg1[2] = arg0 * this.aFloat125 + this.aFloat119 * arg2 + arg3 * this.aFloat130;
		arg1[3] = -(arg1[2] * local66 + arg1[0] * local74 + arg1[1] * local82);
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)V")
	@Override
	public void method4655(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat122;
		@Pc(21) float local21 = this.aFloat126;
		@Pc(24) float local24 = this.aFloat129;
		this.aFloat122 = local18 * local9 - local15 * this.aFloat130;
		@Pc(37) float local37 = this.aFloat123;
		this.aFloat126 = local21 * local9 - local15 * this.aFloat119;
		this.aFloat130 = local9 * this.aFloat130 + local15 * local18;
		this.aFloat119 = local9 * this.aFloat119 + local15 * local21;
		this.aFloat129 = local24 * local9 - this.aFloat125 * local15;
		this.aFloat123 = local9 * local37 - local15 * this.aFloat127;
		this.aFloat125 = local9 * this.aFloat125 + local24 * local15;
		this.aFloat127 = local15 * local37 + local9 * this.aFloat127;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(FZFF)V")
	public void method4040(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat127 += arg1;
		this.aFloat128 += arg2;
		this.aFloat123 += arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BFFF)F")
	public float method4042(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat126 * arg2 + arg0 * this.aFloat122 + arg1 * this.aFloat129 + this.aFloat123;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFBF[F)V")
	public void method4043(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = arg2 * this.aFloat125 + this.aFloat119 * arg1 + this.aFloat130 * arg0;
		arg3[1] = this.aFloat129 * arg2 + arg1 * this.aFloat126 + arg0 * this.aFloat122;
		arg3[0] = arg2 * this.aFloat121 + this.aFloat124 * arg0 + arg1 * this.aFloat120;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[F)[F")
	public float[] method4044(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat121;
		arg0[0] = this.aFloat124;
		arg0[6] = this.aFloat129;
		arg0[13] = 0.0F;
		arg0[3] = this.aFloat128;
		arg0[7] = this.aFloat123;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat125;
		arg0[8] = this.aFloat130;
		arg0[1] = this.aFloat120;
		arg0[5] = this.aFloat126;
		arg0[9] = this.aFloat119;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat122;
		arg0[11] = this.aFloat127;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method4662() {
		@Pc(7) Class30_Sub2 local7 = new Class30_Sub2();
		local7.aFloat119 = this.aFloat119;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat120 = this.aFloat120;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat129 = this.aFloat129;
		return local7;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!bca;)V")
	public void method4046(@OriginalArg(1) Class30 arg0) {
		@Pc(12) Class30_Sub2 local12 = (Class30_Sub2) arg0;
		this.aFloat124 = local12.aFloat124;
		this.aFloat123 = 0.0F;
		this.aFloat126 = local12.aFloat126;
		this.aFloat130 = local12.aFloat130;
		this.aFloat119 = local12.aFloat119;
		this.aFloat125 = local12.aFloat125;
		this.aFloat120 = local12.aFloat120;
		this.aFloat122 = local12.aFloat122;
		this.aFloat129 = local12.aFloat129;
		this.aFloat127 = 0.0F;
		this.aFloat128 = 0.0F;
		this.aFloat121 = local12.aFloat121;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!bca;Lclient!bca;)V")
	public void method4047(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		@Pc(6) Class30_Sub2 local6 = (Class30_Sub2) arg0;
		@Pc(9) Class30_Sub2 local9 = (Class30_Sub2) arg1;
		this.aFloat124 = local6.aFloat121 * local9.aFloat130 + local6.aFloat124 * local9.aFloat124 + local9.aFloat122 * local6.aFloat120;
		this.aFloat122 = local6.aFloat126 * local9.aFloat122 + local9.aFloat124 * local6.aFloat122 + local6.aFloat129 * local9.aFloat130;
		this.aFloat130 = local9.aFloat130 * local6.aFloat125 + local6.aFloat130 * local9.aFloat124 + local9.aFloat122 * local6.aFloat119;
		this.aFloat120 = local9.aFloat119 * local6.aFloat121 + local9.aFloat126 * local6.aFloat120 + local9.aFloat120 * local6.aFloat124;
		this.aFloat126 = local6.aFloat122 * local9.aFloat120 + local9.aFloat126 * local6.aFloat126 + local6.aFloat129 * local9.aFloat119;
		this.aFloat121 = local6.aFloat120 * local9.aFloat129 + local6.aFloat124 * local9.aFloat121 + local6.aFloat121 * local9.aFloat125;
		this.aFloat119 = local6.aFloat125 * local9.aFloat119 + local6.aFloat130 * local9.aFloat120 + local6.aFloat119 * local9.aFloat126;
		this.aFloat129 = local6.aFloat122 * local9.aFloat121 + local6.aFloat126 * local9.aFloat129 + local9.aFloat125 * local6.aFloat129;
		this.aFloat128 = local6.aFloat128 + local9.aFloat127 * local6.aFloat121 + local9.aFloat123 * local6.aFloat120 + local6.aFloat124 * local9.aFloat128;
		this.aFloat125 = local6.aFloat119 * local9.aFloat129 + local6.aFloat130 * local9.aFloat121 + local6.aFloat125 * local9.aFloat125;
		this.aFloat123 = local6.aFloat123 + local6.aFloat129 * local9.aFloat127 + local9.aFloat123 * local6.aFloat126 + local6.aFloat122 * local9.aFloat128;
		this.aFloat127 = local6.aFloat119 * local9.aFloat123 + local6.aFloat130 * local9.aFloat128 + local9.aFloat127 * local6.aFloat125 + local6.aFloat127;
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "([FI)[F")
	public float[] method4048(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat122;
		arg0[5] = this.aFloat126;
		arg0[6] = 0.0F;
		arg0[3] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat120;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat127;
		arg0[2] = 0.0F;
		arg0[0] = this.aFloat124;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat128;
		arg0[9] = this.aFloat123;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFBF)F")
	public float method4049(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * this.aFloat121 + arg1 * this.aFloat120 + arg2 * this.aFloat124 + this.aFloat128;
	}

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)V")
	@Override
	public void method4663(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat124;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat121;
		@Pc(27) float local27 = this.aFloat128;
		this.aFloat124 = local18 * local9 - this.aFloat122 * local15;
		this.aFloat122 = local9 * this.aFloat122 + local18 * local15;
		this.aFloat120 = local21 * local9 - this.aFloat126 * local15;
		this.aFloat126 = this.aFloat126 * local9 + local21 * local15;
		this.aFloat121 = local24 * local9 - local15 * this.aFloat129;
		this.aFloat128 = local9 * local27 - local15 * this.aFloat123;
		this.aFloat129 = local15 * local24 + local9 * this.aFloat129;
		this.aFloat123 = local15 * local27 + this.aFloat123 * local9;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([I)V")
	@Override
	public void method4645(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat128;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat123;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat127;
		arg0[2] = (int) (local28 * this.aFloat125 + this.aFloat121 * local12 + local20 * this.aFloat129);
		arg0[1] = (int) (this.aFloat119 * local28 + this.aFloat126 * local20 + local12 * this.aFloat120);
		arg0[0] = (int) (this.aFloat122 * local20 + this.aFloat124 * local12 + local28 * this.aFloat130);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat119 + this.aFloat130 * (float) arg0 + this.aFloat125 * (float) arg2 + this.aFloat127);
		arg3[1] = (int) (this.aFloat129 * (float) arg2 + this.aFloat126 * (float) arg1 + (float) arg0 * this.aFloat122 + this.aFloat123);
		arg3[0] = (int) (this.aFloat128 + this.aFloat121 * (float) arg2 + (float) arg0 * this.aFloat124 + this.aFloat120 * (float) arg1);
	}

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat124 + this.aFloat120 * (float) arg1 + (float) arg2 * this.aFloat121);
		arg3[1] = (int) ((float) arg1 * this.aFloat126 + this.aFloat122 * (float) arg0 + this.aFloat129 * (float) arg2);
		arg3[2] = (int) ((float) arg0 * this.aFloat130 + this.aFloat119 * (float) arg1 + (float) arg2 * this.aFloat125);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I[F)[F")
	public float[] method4050(@OriginalArg(1) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat130;
		arg0[6] = this.aFloat129;
		arg0[4] = this.aFloat122;
		arg0[2] = this.aFloat121;
		arg0[11] = 0.0F;
		arg0[15] = 0.0F;
		arg0[9] = this.aFloat119;
		arg0[12] = 0.0F;
		arg0[13] = 0;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat120;
		arg0[0] = this.aFloat124;
		arg0[10] = this.aFloat125;
		arg0[5] = this.aFloat126;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(ILclient!bca;)V")
	public void method4051(@OriginalArg(1) Class30 arg0) {
		@Pc(6) Class30_Sub2 local6 = (Class30_Sub2) arg0;
		this.aFloat120 = local6.aFloat122;
		this.aFloat121 = local6.aFloat130;
		this.aFloat124 = local6.aFloat124;
		this.aFloat122 = local6.aFloat120;
		this.aFloat126 = local6.aFloat126;
		this.aFloat130 = local6.aFloat121;
		this.aFloat129 = local6.aFloat119;
		this.aFloat119 = local6.aFloat129;
		this.aFloat128 = -(this.aFloat121 * local6.aFloat127 + local6.aFloat123 * this.aFloat120 + local6.aFloat128 * this.aFloat124);
		this.aFloat125 = local6.aFloat125;
		this.aFloat123 = -(local6.aFloat127 * this.aFloat129 + this.aFloat122 * local6.aFloat128 + local6.aFloat123 * this.aFloat126);
		this.aFloat127 = -(local6.aFloat123 * this.aFloat119 + this.aFloat130 * local6.aFloat128 + this.aFloat125 * local6.aFloat127);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	@Override
	public void method4651(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat124;
		@Pc(21) float local21 = this.aFloat120;
		@Pc(24) float local24 = this.aFloat121;
		this.aFloat124 = local9 * local18 + this.aFloat130 * local15;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat130 = this.aFloat130 * local9 - local15 * local18;
		this.aFloat120 = local9 * local21 + local15 * this.aFloat119;
		this.aFloat119 = this.aFloat119 * local9 - local15 * local21;
		this.aFloat121 = local9 * local24 + this.aFloat125 * local15;
		this.aFloat125 = this.aFloat125 * local9 - local24 * local15;
		this.aFloat128 = local37 * local9 + local15 * this.aFloat127;
		this.aFloat127 = local9 * this.aFloat127 - local37 * local15;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFFB)V")
	public void method4052(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat126 = arg1;
		this.aFloat121 = 0.0F;
		this.aFloat120 = 0.0F;
		this.aFloat128 = 0.0F;
		this.aFloat125 = arg0;
		this.aFloat127 = 0.0F;
		this.aFloat129 = 0.0F;
		this.aFloat123 = 0.0F;
		this.aFloat130 = 0.0F;
		this.aFloat122 = 0.0F;
		this.aFloat119 = 0.0F;
		this.aFloat124 = arg2;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(BFFF)F")
	public float method4053(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat127 + this.aFloat130 * arg0 + arg2 * this.aFloat119 + this.aFloat125 * arg1;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V")
	public void method4054() {
		this.aFloat123 = -this.aFloat123;
		this.aFloat119 = -this.aFloat119;
		this.aFloat130 = -this.aFloat130;
		this.aFloat129 = -this.aFloat129;
		this.aFloat127 = -this.aFloat127;
		this.aFloat125 = -this.aFloat125;
		this.aFloat122 = -this.aFloat122;
		this.aFloat126 = -this.aFloat126;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method4653(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class30_Sub2 local6 = (Class30_Sub2) arg0;
		this.aFloat127 = local6.aFloat127;
		this.aFloat130 = local6.aFloat130;
		this.aFloat128 = local6.aFloat128;
		this.aFloat120 = local6.aFloat120;
		this.aFloat119 = local6.aFloat119;
		this.aFloat124 = local6.aFloat124;
		this.aFloat121 = local6.aFloat121;
		this.aFloat129 = local6.aFloat129;
		this.aFloat125 = local6.aFloat125;
		this.aFloat126 = local6.aFloat126;
		this.aFloat123 = local6.aFloat123;
		this.aFloat122 = local6.aFloat122;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFFFFFFFFI)V")
	public void method4055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat122 = arg1;
		this.aFloat125 = arg0;
		this.aFloat120 = arg2;
		this.aFloat127 = 0.0F;
		this.aFloat129 = arg7;
		this.aFloat128 = 0.0F;
		this.aFloat126 = arg5;
		this.aFloat121 = arg6;
		this.aFloat123 = 0;
		this.aFloat119 = arg4;
		this.aFloat130 = arg3;
		this.aFloat124 = arg8;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIFFFI)V")
	public void method4056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat122 = this.aFloat130 = this.aFloat120 = this.aFloat119 = this.aFloat121 = this.aFloat129 = 0.0F;
			this.aFloat128 = arg2 - (float) arg5;
			this.aFloat125 = 1.0F;
			this.aFloat123 = (float) -arg1 + arg4;
			this.aFloat124 = arg5 * 2;
			this.aFloat126 = arg1 * 2;
			this.aFloat127 = arg3;
			return;
		}
		@Pc(12) float local12 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(18) float local18 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat124 = local12 * 2.0F * (float) arg5;
		this.aFloat123 = (-0.5F * local18 - local12 * 0.5F) * (float) (arg1 * 2) + arg4;
		this.aFloat126 = (float) arg1 * local12 * 2.0F;
		this.aFloat125 = 1.0F;
		this.aFloat120 = -2.0F * local18 * (float) arg1;
		this.aFloat130 = this.aFloat119 = this.aFloat121 = this.aFloat129 = 0.0F;
		this.aFloat127 = arg3;
		this.aFloat122 = (float) arg5 * local18 * 2.0F;
		this.aFloat128 = arg2 + (float) (arg5 * 2) * (local18 * 0.5F - local12 * 0.5F);
	}
}
