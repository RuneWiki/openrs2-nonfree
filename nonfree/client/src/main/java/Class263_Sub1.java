import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class263_Sub1 extends Class263 {

	@OriginalMember(owner = "client!oba", name = "J", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!oba", name = "L", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!oba", name = "H", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!oba", name = "G", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!oba", name = "C", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class263_Sub1() {
		this.method8432();
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
	@Override
	public void method8435(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat133;
		@Pc(24) float local24 = this.aFloat131;
		this.aFloat126 = local9 * local18 + this.aFloat123 * local15;
		@Pc(37) float local37 = this.aFloat130;
		this.aFloat123 = this.aFloat123 * local9 - local18 * local15;
		this.aFloat133 = local15 * this.aFloat125 + local9 * local21;
		this.aFloat125 = this.aFloat125 * local9 - local15 * local21;
		this.aFloat131 = local9 * local24 + local15 * this.aFloat124;
		this.aFloat130 = local15 * this.aFloat127 + local9 * local37;
		this.aFloat124 = local9 * this.aFloat124 - local24 * local15;
		this.aFloat127 = this.aFloat127 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)[F")
	public float[] method6419() {
		Static249.aFloatArray40[1] = this.aFloat129;
		Static249.aFloatArray40[10] = this.aFloat124;
		Static249.aFloatArray40[8] = this.aFloat131;
		Static249.aFloatArray40[14] = this.aFloat127;
		Static249.aFloatArray40[2] = this.aFloat123;
		Static249.aFloatArray40[5] = this.aFloat122;
		Static249.aFloatArray40[12] = this.aFloat130;
		Static249.aFloatArray40[6] = this.aFloat125;
		Static249.aFloatArray40[4] = this.aFloat133;
		Static249.aFloatArray40[13] = this.aFloat128;
		Static249.aFloatArray40[0] = this.aFloat126;
		Static249.aFloatArray40[9] = this.aFloat132;
		return Static249.aFloatArray40;
	}

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "(I)[F")
	public float[] method6420() {
		Static249.aFloatArray40[1] = this.aFloat129;
		Static249.aFloatArray40[2] = this.aFloat123;
		Static249.aFloatArray40[12] = 0.0F;
		Static249.aFloatArray40[8] = this.aFloat131;
		Static249.aFloatArray40[6] = this.aFloat125;
		Static249.aFloatArray40[9] = this.aFloat132;
		Static249.aFloatArray40[13] = 0.0F;
		Static249.aFloatArray40[14] = (float) 0;
		Static249.aFloatArray40[5] = this.aFloat122;
		Static249.aFloatArray40[4] = this.aFloat133;
		Static249.aFloatArray40[10] = this.aFloat124;
		Static249.aFloatArray40[0] = this.aFloat126;
		return Static249.aFloatArray40;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub16_Sub1.aFloatArray9[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub16_Sub1.aFloatArray8[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub16_Sub1.aFloatArray9[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub16_Sub1.aFloatArray8[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub16_Sub1.aFloatArray9[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub16_Sub1.aFloatArray8[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat131 = local47 * local21 + -local27 * local33;
		this.aFloat129 = local43 * local27 + local39 * -local21;
		this.aFloat124 = local9 * local21;
		this.aFloat132 = local21 * local43 + local27 * local39;
		this.aFloat123 = local27 * local9;
		this.aFloat126 = local47 * local27 + local21 * local33;
		this.aFloat125 = -local15;
		this.aFloat122 = local9 * local33;
		this.aFloat133 = local39 * local9;
		this.aFloat128 = -((float) arg1 * this.aFloat122) + this.aFloat129 * (float) -arg0 - (float) arg2 * this.aFloat132;
		this.aFloat127 = -((float) arg2 * this.aFloat124) + this.aFloat123 * (float) -arg0 - this.aFloat125 * (float) arg1;
		this.aFloat130 = -(this.aFloat133 * (float) arg1) + (float) -arg0 * this.aFloat126 - this.aFloat131 * (float) arg2;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(FIIFBFI)V")
	public void method6421(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat126 = (float) arg5;
			this.aFloat122 = (float) arg1;
			this.aFloat124 = 1.0F;
			this.aFloat129 = this.aFloat123 = this.aFloat133 = this.aFloat125 = this.aFloat131 = this.aFloat132 = 0.0F;
		} else {
			@Pc(47) float local47 = Class14_Sub16_Sub1.aFloatArray9[arg2 & 0x3FFF];
			@Pc(53) float local53 = Class14_Sub16_Sub1.aFloatArray8[arg2 & 0x3FFF];
			this.aFloat129 = local53 * (float) arg5;
			this.aFloat133 = (float) arg1 * -local53;
			this.aFloat126 = (float) arg5 * local47;
			this.aFloat123 = this.aFloat125 = this.aFloat131 = this.aFloat132 = 0.0F;
			this.aFloat124 = 1.0F;
			this.aFloat122 = (float) arg1 * local47;
		}
		this.aFloat128 = arg3;
		this.aFloat130 = arg4;
		this.aFloat127 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat128);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat127);
		@Pc(20) int local20 = (int) ((float) arg0 - this.aFloat130);
		arg3[2] = (int) (this.aFloat124 * (float) local13 + this.aFloat131 * (float) local20 + this.aFloat132 * (float) local6);
		arg3[1] = (int) ((float) local20 * this.aFloat133 + this.aFloat122 * (float) local6 + this.aFloat125 * (float) local13);
		arg3[0] = (int) ((float) local13 * this.aFloat123 + (float) local6 * this.aFloat129 + (float) local20 * this.aFloat126);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method8437(@OriginalArg(0) Class263 arg0) {
		@Pc(6) Class263_Sub1 local6 = (Class263_Sub1) arg0;
		this.aFloat126 = local6.aFloat126;
		this.aFloat125 = local6.aFloat125;
		this.aFloat122 = local6.aFloat122;
		this.aFloat130 = local6.aFloat130;
		this.aFloat131 = local6.aFloat131;
		this.aFloat132 = local6.aFloat132;
		this.aFloat129 = local6.aFloat129;
		this.aFloat123 = local6.aFloat123;
		this.aFloat128 = local6.aFloat128;
		this.aFloat127 = local6.aFloat127;
		this.aFloat124 = local6.aFloat124;
		this.aFloat133 = local6.aFloat133;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat127 += (float) arg2;
		this.aFloat128 += (float) arg1;
		this.aFloat130 += (float) arg0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "([I)V")
	@Override
	public void method8443(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat130;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat128;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat127;
		arg0[1] = (int) (local12 * this.aFloat133 + local20 * this.aFloat122 + local28 * this.aFloat125);
		arg0[0] = (int) (this.aFloat129 * local20 + this.aFloat126 * local12 + local28 * this.aFloat123);
		arg0[2] = (int) (this.aFloat124 * local28 + this.aFloat132 * local20 + local12 * this.aFloat131);
	}

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "(I)V")
	@Override
	public void method8449(@OriginalArg(0) int arg0) {
		this.aFloat124 = 1.0F;
		this.aFloat126 = this.aFloat122 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat129 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat131 = this.aFloat130 = this.aFloat132 = this.aFloat128 = this.aFloat123 = this.aFloat125 = this.aFloat127 = 0.0F;
		this.aFloat133 = -this.aFloat129;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V")
	public void method6422() {
		this.aFloat132 = -this.aFloat132;
		this.aFloat128 = -this.aFloat128;
		this.aFloat125 = -this.aFloat125;
		this.aFloat123 = -this.aFloat123;
		this.aFloat124 = -this.aFloat124;
		this.aFloat129 = -this.aFloat129;
		this.aFloat122 = -this.aFloat122;
		this.aFloat127 = -this.aFloat127;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	@Override
	public void method8436(@OriginalArg(0) int arg0) {
		this.aFloat126 = 1.0F;
		this.aFloat122 = this.aFloat124 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat125 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat132 = -this.aFloat125;
		this.aFloat133 = this.aFloat131 = this.aFloat130 = this.aFloat129 = this.aFloat128 = this.aFloat123 = this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat133 + this.aFloat126 * (float) arg0 + this.aFloat131 * (float) arg2 + this.aFloat130);
		arg3[2] = (int) ((float) arg1 * this.aFloat125 + (float) arg0 * this.aFloat123 + this.aFloat124 * (float) arg2 + this.aFloat127);
		arg3[1] = (int) (this.aFloat128 + (float) arg2 * this.aFloat132 + this.aFloat129 * (float) arg0 + (float) arg1 * this.aFloat122);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(FFFFI[F)V")
	public void method6423(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[0] = this.aFloat133 * arg3 + arg1 * this.aFloat126 + this.aFloat131 * arg0;
		@Pc(59) float local59;
		@Pc(43) float local43;
		@Pc(51) float local51;
		@Pc(35) float local35;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local35 = -arg2 / arg1;
			local43 = this.aFloat128 + local35 * this.aFloat129;
			local51 = this.aFloat127 + local35 * this.aFloat123;
			local59 = local35 * this.aFloat126 + this.aFloat130;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg2 / arg3;
			local43 = this.aFloat122 * local35 + this.aFloat128;
			local51 = this.aFloat125 * local35 + this.aFloat127;
			local59 = local35 * this.aFloat133 + this.aFloat130;
		} else {
			local35 = -arg2 / arg0;
			local51 = local35 * this.aFloat124 + this.aFloat127;
			local43 = local35 * this.aFloat132 + this.aFloat128;
			local59 = this.aFloat130 + local35 * this.aFloat131;
		}
		arg4[1] = this.aFloat132 * arg0 + this.aFloat129 * arg1 + this.aFloat122 * arg3;
		arg4[2] = arg0 * this.aFloat124 + arg3 * this.aFloat125 + arg1 * this.aFloat123;
		arg4[3] = -(local51 * arg4[2] + arg4[1] * local43 + local59 * arg4[0]);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(III)V")
	@Override
	public void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat127 = (float) arg2;
		this.aFloat126 = this.aFloat122 = this.aFloat124 = 1.0F;
		this.aFloat130 = (float) arg0;
		this.aFloat129 = this.aFloat123 = this.aFloat133 = this.aFloat125 = this.aFloat131 = this.aFloat132 = 0.0F;
		this.aFloat128 = (float) arg1;
	}

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "(I)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat133;
		@Pc(24) float local24 = this.aFloat131;
		@Pc(27) float local27 = this.aFloat130;
		this.aFloat126 = local9 * local18 - local15 * this.aFloat129;
		this.aFloat133 = local9 * local21 - local15 * this.aFloat122;
		this.aFloat129 = this.aFloat129 * local9 + local15 * local18;
		this.aFloat131 = local24 * local9 - this.aFloat132 * local15;
		this.aFloat122 = this.aFloat122 * local9 + local21 * local15;
		this.aFloat132 = local15 * local24 + this.aFloat132 * local9;
		this.aFloat130 = local27 * local9 - local15 * this.aFloat128;
		this.aFloat128 = local27 * local15 + local9 * this.aFloat128;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method6424(@OriginalArg(0) Class263 arg0) {
		@Pc(11) Class263_Sub1 local11 = (Class263_Sub1) arg0;
		this.aFloat126 = local11.aFloat126;
		this.aFloat131 = local11.aFloat123;
		this.aFloat133 = local11.aFloat129;
		this.aFloat122 = local11.aFloat122;
		this.aFloat132 = local11.aFloat125;
		this.aFloat123 = local11.aFloat131;
		this.aFloat129 = local11.aFloat133;
		this.aFloat125 = local11.aFloat132;
		this.aFloat124 = local11.aFloat124;
		this.aFloat130 = -(local11.aFloat127 * this.aFloat131 + this.aFloat133 * local11.aFloat128 + local11.aFloat130 * this.aFloat126);
		this.aFloat128 = -(this.aFloat129 * local11.aFloat130 + local11.aFloat128 * this.aFloat122 + local11.aFloat127 * this.aFloat132);
		this.aFloat127 = -(local11.aFloat127 * this.aFloat124 + this.aFloat125 * local11.aFloat128 + local11.aFloat130 * this.aFloat123);
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat124 + (float) arg0 * this.aFloat123 + (float) arg1 * this.aFloat125);
		arg3[1] = (int) ((float) arg2 * this.aFloat132 + (float) arg0 * this.aFloat129 + (float) arg1 * this.aFloat122);
		arg3[0] = (int) ((float) arg2 * this.aFloat131 + this.aFloat133 * (float) arg1 + this.aFloat126 * (float) arg0);
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
	@Override
	public void method8439(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat129;
		@Pc(21) float local21 = this.aFloat122;
		@Pc(24) float local24 = this.aFloat132;
		this.aFloat129 = local18 * local9 - this.aFloat123 * local15;
		@Pc(37) float local37 = this.aFloat128;
		this.aFloat122 = local9 * local21 - this.aFloat125 * local15;
		this.aFloat123 = local15 * local18 + this.aFloat123 * local9;
		this.aFloat125 = this.aFloat125 * local9 + local21 * local15;
		this.aFloat132 = local9 * local24 - local15 * this.aFloat124;
		this.aFloat128 = local37 * local9 - this.aFloat127 * local15;
		this.aFloat124 = local24 * local15 + local9 * this.aFloat124;
		this.aFloat127 = this.aFloat127 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "()V")
	@Override
	public void method8432() {
		this.aFloat126 = this.aFloat122 = this.aFloat124 = 1.0F;
		this.aFloat129 = this.aFloat123 = this.aFloat133 = this.aFloat125 = this.aFloat131 = this.aFloat132 = this.aFloat130 = this.aFloat128 = this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0) {
		this.aFloat122 = 1.0F;
		this.aFloat126 = this.aFloat124 = Class14_Sub16_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat131 = Class14_Sub16_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat133 = this.aFloat130 = this.aFloat129 = this.aFloat132 = this.aFloat128 = this.aFloat125 = this.aFloat127 = 0.0F;
		this.aFloat123 = -this.aFloat131;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "()Lclient!rd;")
	@Override
	public Class263 method8434() {
		@Pc(7) Class263_Sub1 local7 = new Class263_Sub1();
		local7.aFloat122 = this.aFloat122;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat123 = this.aFloat123;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat126 = this.aFloat126;
		return local7;
	}
}
