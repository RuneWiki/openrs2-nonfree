import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class115_Sub3 extends Class115 {

	@OriginalMember(owner = "client!og", name = "j", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!og", name = "db", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class115_Sub3() {
		this.method6281();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FIFF)V")
	public void method6300(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat154 = this.aFloat148 = this.aFloat151 = this.aFloat153 = this.aFloat146 = this.aFloat150 = 0.0F;
		this.aFloat143 = arg2;
		this.aFloat144 = arg0;
		this.aFloat152 = this.aFloat147 = this.aFloat145 = (float) 1;
		this.aFloat149 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method6280(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat152;
		@Pc(21) float local21 = this.aFloat151;
		@Pc(24) float local24 = this.aFloat146;
		this.aFloat152 = local9 * local18 - this.aFloat154 * local15;
		@Pc(37) float local37 = this.aFloat143;
		this.aFloat154 = this.aFloat154 * local9 + local18 * local15;
		this.aFloat151 = local9 * local21 - this.aFloat147 * local15;
		this.aFloat147 = this.aFloat147 * local9 + local15 * local21;
		this.aFloat146 = local9 * local24 - this.aFloat150 * local15;
		this.aFloat150 = local9 * this.aFloat150 + local24 * local15;
		this.aFloat143 = local9 * local37 - this.aFloat149 * local15;
		this.aFloat149 = local9 * this.aFloat149 + local37 * local15;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BFFF[FF)V")
	public void method6301(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[0] = this.aFloat151 * arg1 + this.aFloat152 * arg4 + arg0 * this.aFloat146;
		@Pc(75) float local75;
		@Pc(59) float local59;
		@Pc(67) float local67;
		@Pc(51) float local51;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local51 = -arg2 / arg4;
			local67 = this.aFloat144 + local51 * this.aFloat148;
			local75 = this.aFloat152 * local51 + this.aFloat143;
			local59 = local51 * this.aFloat154 + this.aFloat149;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local51 = -arg2 / arg1;
			local75 = this.aFloat151 * local51 + this.aFloat143;
			local59 = local51 * this.aFloat147 + this.aFloat149;
			local67 = local51 * this.aFloat153 + this.aFloat144;
		} else {
			local51 = -arg2 / arg0;
			local59 = this.aFloat149 + local51 * this.aFloat150;
			local67 = this.aFloat144 + local51 * this.aFloat145;
			local75 = local51 * this.aFloat146 + this.aFloat143;
		}
		arg3[2] = arg4 * this.aFloat148 + arg1 * this.aFloat153 + this.aFloat145 * arg0;
		arg3[1] = this.aFloat154 * arg4 + this.aFloat147 * arg1 + arg0 * this.aFloat150;
		arg3[3] = -(arg3[1] * local59 + local75 * arg3[0] + local67 * arg3[2]);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B[F)[F")
	public float[] method6302(@OriginalArg(1) float[] arg0) {
		arg0[14] = this.aFloat144;
		arg0[4] = this.aFloat151;
		arg0[0] = this.aFloat152;
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat143;
		arg0[11] = 0.0F;
		arg0[6] = this.aFloat153;
		arg0[5] = this.aFloat147;
		arg0[7] = 0.0F;
		arg0[13] = this.aFloat149;
		arg0[10] = this.aFloat145;
		arg0[8] = this.aFloat146;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat154;
		arg0[9] = this.aFloat150;
		arg0[2] = this.aFloat148;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([FI)[F")
	public float[] method6303(@OriginalArg(0) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[6] = 0.0F;
		arg0[2] = 0.0F;
		arg0[9] = this.aFloat149;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat143;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat144;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat147;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat152;
		arg0[1] = this.aFloat154;
		arg0[4] = this.aFloat151;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat143);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat149);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat144);
		arg3[0] = (int) (this.aFloat148 * (float) local24 + this.aFloat152 * (float) local6 + (float) local13 * this.aFloat154);
		arg3[1] = (int) ((float) local24 * this.aFloat153 + (float) local13 * this.aFloat147 + this.aFloat151 * (float) local6);
		arg3[2] = (int) ((float) local6 * this.aFloat146 + (float) local13 * this.aFloat150 + this.aFloat145 * (float) local24);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFFFFFFFB)V")
	public void method6304(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat148 = arg3;
		this.aFloat149 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat154 = arg2;
		this.aFloat153 = arg5;
		this.aFloat146 = arg8;
		this.aFloat143 = 0.0F;
		this.aFloat147 = arg6;
		this.aFloat152 = arg7;
		this.aFloat150 = arg4;
		this.aFloat145 = arg0;
		this.aFloat151 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	@Override
	public void method6297(@OriginalArg(0) int arg0) {
		this.aFloat152 = 1.0F;
		this.aFloat147 = this.aFloat145 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat153 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat151 = this.aFloat146 = this.aFloat143 = this.aFloat154 = this.aFloat149 = this.aFloat148 = this.aFloat144 = 0.0F;
		this.aFloat150 = -this.aFloat153;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	@Override
	public void method6291(@OriginalArg(0) int arg0) {
		this.aFloat147 = 1.0F;
		this.aFloat152 = this.aFloat145 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat146 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat148 = -this.aFloat146;
		this.aFloat151 = this.aFloat143 = this.aFloat154 = this.aFloat150 = this.aFloat149 = this.aFloat153 = this.aFloat144 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!hba;)V")
	public void method6305(@OriginalArg(1) Class115 arg0) {
		@Pc(6) Class115_Sub3 local6 = (Class115_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat152;
		@Pc(12) float local12 = this.aFloat154;
		@Pc(15) float local15 = this.aFloat151;
		@Pc(18) float local18 = this.aFloat147;
		@Pc(21) float local21 = this.aFloat146;
		@Pc(24) float local24 = this.aFloat150;
		@Pc(27) float local27 = this.aFloat143;
		@Pc(30) float local30 = this.aFloat149;
		this.aFloat154 = local6.aFloat150 * this.aFloat148 + local6.aFloat147 * local12 + local9 * local6.aFloat154;
		this.aFloat152 = this.aFloat148 * local6.aFloat146 + local6.aFloat151 * local12 + local9 * local6.aFloat152;
		this.aFloat148 = local6.aFloat145 * this.aFloat148 + local6.aFloat153 * local12 + local9 * local6.aFloat148;
		this.aFloat151 = local6.aFloat152 * local15 + local18 * local6.aFloat151 + local6.aFloat146 * this.aFloat153;
		this.aFloat147 = local6.aFloat147 * local18 + local6.aFloat154 * local15 + local6.aFloat150 * this.aFloat153;
		this.aFloat150 = this.aFloat145 * local6.aFloat150 + local6.aFloat147 * local24 + local6.aFloat154 * local21;
		this.aFloat153 = this.aFloat153 * local6.aFloat145 + local18 * local6.aFloat153 + local6.aFloat148 * local15;
		this.aFloat146 = local21 * local6.aFloat152 + local24 * local6.aFloat151 + this.aFloat145 * local6.aFloat146;
		this.aFloat145 = local6.aFloat153 * local24 + local21 * local6.aFloat148 + local6.aFloat145 * this.aFloat145;
		this.aFloat149 = local6.aFloat147 * local30 + local6.aFloat154 * local27 + this.aFloat144 * local6.aFloat150 + local6.aFloat149;
		this.aFloat143 = local27 * local6.aFloat152 + local6.aFloat151 * local30 + local6.aFloat146 * this.aFloat144 + local6.aFloat143;
		this.aFloat144 = this.aFloat144 * local6.aFloat145 + local6.aFloat148 * local27 + local30 * local6.aFloat153 + local6.aFloat144;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([FB)[F")
	public float[] method6306(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat152;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat150;
		arg0[4] = this.aFloat154;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat153;
		arg0[1] = this.aFloat151;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[15] = 0.0F;
		arg0[8] = this.aFloat148;
		arg0[2] = this.aFloat146;
		arg0[5] = this.aFloat147;
		arg0[10] = this.aFloat145;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat149 + (float) arg2 * this.aFloat150 + (float) arg1 * this.aFloat147 + this.aFloat154 * (float) arg0);
		arg3[2] = (int) (this.aFloat144 + this.aFloat145 * (float) arg2 + this.aFloat148 * (float) arg0 + (float) arg1 * this.aFloat153);
		arg3[0] = (int) (this.aFloat143 + this.aFloat152 * (float) arg0 + this.aFloat151 * (float) arg1 + this.aFloat146 * (float) arg2);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFI)F")
	public float method6307(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat143 + arg0 * this.aFloat146 + this.aFloat151 * arg2 + this.aFloat152 * arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[F)[F")
	public float[] method6309(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat151;
		arg0[9] = this.aFloat153;
		arg0[6] = this.aFloat150;
		arg0[14] = 0.0F;
		arg0[7] = this.aFloat149;
		arg0[3] = this.aFloat143;
		arg0[11] = this.aFloat144;
		arg0[10] = this.aFloat145;
		arg0[0] = this.aFloat152;
		arg0[2] = this.aFloat146;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat148;
		arg0[4] = this.aFloat154;
		arg0[15] = 1.0F;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat147;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "([FI)[F")
	public float[] method6310(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat143;
		arg0[5] = this.aFloat147;
		arg0[4] = this.aFloat154;
		arg0[7] = this.aFloat149;
		arg0[0] = this.aFloat152;
		arg0[1] = this.aFloat151;
		arg0[6] = this.aFloat150;
		arg0[2] = this.aFloat146;
		return arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method6282(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115_Sub3 local6 = (Class115_Sub3) arg0;
		this.aFloat148 = local6.aFloat148;
		this.aFloat150 = local6.aFloat150;
		this.aFloat146 = local6.aFloat146;
		this.aFloat143 = local6.aFloat143;
		this.aFloat145 = local6.aFloat145;
		this.aFloat149 = local6.aFloat149;
		this.aFloat152 = local6.aFloat152;
		this.aFloat144 = local6.aFloat144;
		this.aFloat154 = local6.aFloat154;
		this.aFloat147 = local6.aFloat147;
		this.aFloat153 = local6.aFloat153;
		this.aFloat151 = local6.aFloat151;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub5.aFloatArray30[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub5.aFloatArray29[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub5.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub5.aFloatArray29[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat147 = local33 * local9;
		this.aFloat152 = local21 * local33 + local47 * local27;
		this.aFloat150 = local43 * local21 + local27 * local39;
		this.aFloat148 = local9 * local27;
		this.aFloat151 = local39 * local9;
		this.aFloat153 = -local15;
		this.aFloat154 = local43 * local27 + local39 * -local21;
		this.aFloat146 = local47 * local21 + local33 * -local27;
		this.aFloat145 = local9 * local21;
		this.aFloat143 = -(this.aFloat146 * (float) arg2) - this.aFloat151 * (float) arg1 + this.aFloat152 * (float) -arg0;
		this.aFloat149 = this.aFloat154 * (float) -arg0 - (float) arg1 * this.aFloat147 - (float) arg2 * this.aFloat150;
		this.aFloat144 = -(this.aFloat145 * (float) arg2) + (float) -arg0 * this.aFloat148 - this.aFloat153 * (float) arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!hba;Lclient!hba;)V")
	public void method6311(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class115 arg1) {
		@Pc(6) Class115_Sub3 local6 = (Class115_Sub3) arg0;
		@Pc(9) Class115_Sub3 local9 = (Class115_Sub3) arg1;
		this.aFloat152 = local6.aFloat152 * local9.aFloat152 + local6.aFloat151 * local9.aFloat154 + local6.aFloat146 * local9.aFloat148;
		this.aFloat154 = local9.aFloat148 * local6.aFloat150 + local9.aFloat152 * local6.aFloat154 + local6.aFloat147 * local9.aFloat154;
		this.aFloat148 = local6.aFloat153 * local9.aFloat154 + local6.aFloat148 * local9.aFloat152 + local6.aFloat145 * local9.aFloat148;
		this.aFloat151 = local6.aFloat146 * local9.aFloat153 + local9.aFloat147 * local6.aFloat151 + local6.aFloat152 * local9.aFloat151;
		this.aFloat147 = local6.aFloat154 * local9.aFloat151 + local9.aFloat147 * local6.aFloat147 + local6.aFloat150 * local9.aFloat153;
		this.aFloat153 = local9.aFloat147 * local6.aFloat153 + local6.aFloat148 * local9.aFloat151 + local6.aFloat145 * local9.aFloat153;
		this.aFloat146 = local6.aFloat146 * local9.aFloat145 + local9.aFloat150 * local6.aFloat151 + local6.aFloat152 * local9.aFloat146;
		this.aFloat150 = local6.aFloat147 * local9.aFloat150 + local6.aFloat154 * local9.aFloat146 + local9.aFloat145 * local6.aFloat150;
		this.aFloat143 = local6.aFloat143 + local6.aFloat152 * local9.aFloat143 + local9.aFloat149 * local6.aFloat151 + local9.aFloat144 * local6.aFloat146;
		this.aFloat145 = local9.aFloat145 * local6.aFloat145 + local6.aFloat148 * local9.aFloat146 + local9.aFloat150 * local6.aFloat153;
		this.aFloat149 = local9.aFloat144 * local6.aFloat150 + local6.aFloat154 * local9.aFloat143 + local9.aFloat149 * local6.aFloat147 + local6.aFloat149;
		this.aFloat144 = local9.aFloat144 * local6.aFloat145 + local6.aFloat153 * local9.aFloat149 + local9.aFloat143 * local6.aFloat148 + local6.aFloat144;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FZIIFFI)V")
	public void method6312(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat149 = (float) -arg2 + arg3;
			this.aFloat147 = (float) (arg2 * 2);
			this.aFloat143 = arg0 - (float) arg1;
			this.aFloat144 = arg4;
			this.aFloat154 = this.aFloat148 = this.aFloat151 = this.aFloat153 = this.aFloat146 = this.aFloat150 = 0.0F;
			this.aFloat145 = 1.0F;
			this.aFloat152 = (float) (arg1 * 2);
			return;
		}
		@Pc(68) float local68 = Class14_Sub5.aFloatArray30[arg5 & 0x3FFF];
		@Pc(74) float local74 = Class14_Sub5.aFloatArray29[arg5 & 0x3FFF];
		this.aFloat144 = arg4;
		this.aFloat145 = 1.0F;
		this.aFloat147 = (float) arg2 * 2.0F * local68;
		this.aFloat149 = (float) (arg2 * 2) * (-0.5F * local74 - local68 * 0.5F) + arg3;
		this.aFloat148 = this.aFloat153 = this.aFloat146 = this.aFloat150 = 0.0F;
		this.aFloat143 = arg0 + (local74 * 0.5F - local68 * 0.5F) * (float) (arg1 * 2);
		this.aFloat151 = (float) arg2 * -2.0F * local74;
		this.aFloat154 = (float) arg1 * 2.0F * local74;
		this.aFloat152 = (float) arg1 * local68 * 2.0F;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!hba;)V")
	public void method6313(@OriginalArg(1) Class115 arg0) {
		@Pc(6) Class115_Sub3 local6 = (Class115_Sub3) arg0;
		this.aFloat152 = local6.aFloat152;
		this.aFloat151 = local6.aFloat154;
		this.aFloat146 = local6.aFloat148;
		this.aFloat154 = local6.aFloat151;
		this.aFloat150 = local6.aFloat153;
		this.aFloat147 = local6.aFloat147;
		this.aFloat148 = local6.aFloat146;
		this.aFloat145 = local6.aFloat145;
		this.aFloat153 = local6.aFloat150;
		this.aFloat143 = -(this.aFloat152 * local6.aFloat143 + this.aFloat151 * local6.aFloat149 + local6.aFloat144 * this.aFloat146);
		this.aFloat149 = -(local6.aFloat144 * this.aFloat150 + local6.aFloat149 * this.aFloat147 + local6.aFloat143 * this.aFloat154);
		this.aFloat144 = -(local6.aFloat143 * this.aFloat148 + local6.aFloat149 * this.aFloat153 + this.aFloat145 * local6.aFloat144);
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	public void method6295(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat154;
		@Pc(21) float local21 = this.aFloat147;
		@Pc(24) float local24 = this.aFloat150;
		this.aFloat154 = local18 * local9 - local15 * this.aFloat148;
		@Pc(37) float local37 = this.aFloat149;
		this.aFloat148 = this.aFloat148 * local9 + local18 * local15;
		this.aFloat147 = local9 * local21 - this.aFloat153 * local15;
		this.aFloat153 = this.aFloat153 * local9 + local21 * local15;
		this.aFloat150 = local9 * local24 - local15 * this.aFloat145;
		this.aFloat145 = local15 * local24 + this.aFloat145 * local9;
		this.aFloat149 = local37 * local9 - local15 * this.aFloat144;
		this.aFloat144 = local15 * local37 + local9 * this.aFloat144;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	@Override
	public void method6287(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat152;
		@Pc(21) float local21 = this.aFloat151;
		@Pc(24) float local24 = this.aFloat146;
		this.aFloat152 = local18 * local9 + local15 * this.aFloat148;
		@Pc(37) float local37 = this.aFloat143;
		this.aFloat151 = this.aFloat153 * local15 + local21 * local9;
		this.aFloat148 = this.aFloat148 * local9 - local18 * local15;
		this.aFloat153 = local9 * this.aFloat153 - local15 * local21;
		this.aFloat146 = local9 * local24 + local15 * this.aFloat145;
		this.aFloat145 = local9 * this.aFloat145 - local15 * local24;
		this.aFloat143 = this.aFloat144 * local15 + local9 * local37;
		this.aFloat144 = this.aFloat144 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	@Override
	public void method6290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat152 = this.aFloat147 = this.aFloat145 = 1.0F;
		this.aFloat149 = (float) arg1;
		this.aFloat144 = (float) arg2;
		this.aFloat154 = this.aFloat148 = this.aFloat151 = this.aFloat153 = this.aFloat146 = this.aFloat150 = 0.0F;
		this.aFloat143 = (float) arg0;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
	@Override
	public void method6294(@OriginalArg(0) int arg0) {
		this.aFloat145 = 1.0F;
		this.aFloat152 = this.aFloat147 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat154 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat146 = this.aFloat143 = this.aFloat150 = this.aFloat149 = this.aFloat148 = this.aFloat153 = this.aFloat144 = 0.0F;
		this.aFloat151 = -this.aFloat154;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFF[FF)V")
	public void method6315(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[0] = arg1 * this.aFloat146 + this.aFloat151 * arg3 + arg0 * this.aFloat152;
		arg2[2] = arg0 * this.aFloat148 + arg3 * this.aFloat153 + this.aFloat145 * arg1;
		arg2[1] = this.aFloat150 * arg1 + this.aFloat154 * arg0 + arg3 * this.aFloat147;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFZ)F")
	public float method6316(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat144 + this.aFloat145 * arg1 + this.aFloat153 * arg0 + this.aFloat148 * arg2;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public void method6317() {
		this.aFloat154 = -this.aFloat154;
		this.aFloat153 = -this.aFloat153;
		this.aFloat147 = -this.aFloat147;
		this.aFloat145 = -this.aFloat145;
		this.aFloat148 = -this.aFloat148;
		this.aFloat149 = -this.aFloat149;
		this.aFloat144 = -this.aFloat144;
		this.aFloat150 = -this.aFloat150;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6292() {
		@Pc(7) Class115_Sub3 local7 = new Class115_Sub3();
		local7.aFloat144 = this.aFloat144;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat152 = this.aFloat152;
		local7.aFloat149 = this.aFloat149;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat153 = this.aFloat153;
		local7.aFloat154 = this.aFloat154;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat147 = this.aFloat147;
		return local7;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FBFF)V")
	public void method6318(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat152 = arg1;
		this.aFloat154 = 0.0F;
		this.aFloat146 = 0.0F;
		this.aFloat150 = 0.0F;
		this.aFloat144 = 0.0F;
		this.aFloat153 = 0.0F;
		this.aFloat151 = 0.0F;
		this.aFloat145 = arg2;
		this.aFloat147 = arg0;
		this.aFloat149 = 0.0F;
		this.aFloat143 = 0.0F;
		this.aFloat148 = 0.0F;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(FFFI)V")
	public void method6319(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat148 *= arg0;
		this.aFloat147 *= arg1;
		this.aFloat144 *= arg0;
		this.aFloat146 *= arg2;
		this.aFloat152 *= arg2;
		this.aFloat143 *= arg2;
		this.aFloat151 *= arg2;
		this.aFloat145 *= arg0;
		this.aFloat154 *= arg1;
		this.aFloat153 *= arg0;
		this.aFloat150 *= arg1;
		this.aFloat149 *= arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V")
	@Override
	public void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat143 += (float) arg0;
		this.aFloat144 += (float) arg2;
		this.aFloat149 += (float) arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat152 + this.aFloat151 * (float) arg1 + this.aFloat146 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat145 + (float) arg0 * this.aFloat148 + this.aFloat153 * (float) arg1);
		arg3[1] = (int) ((float) arg1 * this.aFloat147 + this.aFloat154 * (float) arg0 + this.aFloat150 * (float) arg2);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(FFFZ)F")
	public float method6320(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat147 + this.aFloat154 * arg1 + this.aFloat150 * arg2 + this.aFloat149;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!hba;I)V")
	public void method6321(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115_Sub3 local6 = (Class115_Sub3) arg0;
		this.aFloat151 = local6.aFloat151;
		this.aFloat148 = local6.aFloat148;
		this.aFloat146 = local6.aFloat146;
		this.aFloat144 = 0.0F;
		this.aFloat143 = 0.0F;
		this.aFloat150 = local6.aFloat150;
		this.aFloat154 = local6.aFloat154;
		this.aFloat149 = (float) 0;
		this.aFloat147 = local6.aFloat147;
		this.aFloat152 = local6.aFloat152;
		this.aFloat145 = local6.aFloat145;
		this.aFloat153 = local6.aFloat153;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([I)V")
	@Override
	public void method6298(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat143;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat149;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat144;
		arg0[1] = (int) (local20 * this.aFloat147 + this.aFloat151 * local12 + this.aFloat153 * local29);
		arg0[2] = (int) (this.aFloat145 * local29 + this.aFloat146 * local12 + local20 * this.aFloat150);
		arg0[0] = (int) (this.aFloat148 * local29 + local20 * this.aFloat154 + local12 * this.aFloat152);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFFF)V")
	public void method6322(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat143 += arg2;
		this.aFloat144 += arg1;
		this.aFloat149 += arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	@Override
	public void method6281() {
		this.aFloat154 = this.aFloat148 = this.aFloat151 = this.aFloat153 = this.aFloat146 = this.aFloat150 = this.aFloat143 = this.aFloat149 = this.aFloat144 = 0.0F;
		this.aFloat152 = this.aFloat147 = this.aFloat145 = 1.0F;
	}
}
