import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ar", name = "O", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class25_Sub1() {
		this.method4291();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	@Override
	public void method4284(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class41.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class41.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat44;
		@Pc(21) float local21 = this.aFloat38;
		@Pc(24) float local24 = this.aFloat40;
		@Pc(27) float local27 = this.aFloat41;
		this.aFloat44 = local18 * local9 - local15 * this.aFloat42;
		this.aFloat42 = this.aFloat42 * local9 + local15 * local18;
		this.aFloat38 = local9 * local21 - this.aFloat37 * local15;
		this.aFloat40 = local24 * local9 - this.aFloat45 * local15;
		this.aFloat37 = local9 * this.aFloat37 + local15 * local21;
		this.aFloat41 = local9 * local27 - this.aFloat39 * local15;
		this.aFloat45 = this.aFloat45 * local9 + local24 * local15;
		this.aFloat39 = local27 * local15 + this.aFloat39 * local9;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method4297(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub1 local6 = (Class25_Sub1) arg0;
		this.aFloat45 = local6.aFloat45;
		this.aFloat38 = local6.aFloat38;
		this.aFloat42 = local6.aFloat42;
		this.aFloat41 = local6.aFloat41;
		this.aFloat48 = local6.aFloat48;
		this.aFloat40 = local6.aFloat40;
		this.aFloat47 = local6.aFloat47;
		this.aFloat44 = local6.aFloat44;
		this.aFloat39 = local6.aFloat39;
		this.aFloat43 = local6.aFloat43;
		this.aFloat46 = local6.aFloat46;
		this.aFloat37 = local6.aFloat37;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat43 = (float) arg0;
		this.aFloat41 = (float) arg1;
		this.aFloat39 = (float) arg2;
		this.aFloat44 = this.aFloat42 = this.aFloat47 = this.aFloat37 = this.aFloat46 = this.aFloat40 = 0.0F;
		this.aFloat48 = this.aFloat38 = this.aFloat45 = 1.0F;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([I)V")
	@Override
	public void method4299(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat43;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat41;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat39;
		arg0[2] = (int) (this.aFloat45 * local28 + this.aFloat40 * local20 + this.aFloat46 * local12);
		arg0[1] = (int) (this.aFloat37 * local28 + this.aFloat47 * local12 + local20 * this.aFloat38);
		arg0[0] = (int) (this.aFloat48 * local12 + this.aFloat44 * local20 + this.aFloat42 * local28);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class41.aFloatArray24[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class41.aFloatArray23[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class41.aFloatArray24[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class41.aFloatArray23[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class41.aFloatArray24[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class41.aFloatArray23[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat47 = local9 * local39;
		this.aFloat48 = local21 * local33 + local47 * local27;
		this.aFloat37 = -local15;
		this.aFloat46 = -local27 * local33 + local47 * local21;
		this.aFloat44 = local39 * -local21 + local27 * local43;
		this.aFloat40 = local27 * local39 + local43 * local21;
		this.aFloat42 = local9 * local27;
		this.aFloat45 = local21 * local9;
		this.aFloat38 = local33 * local9;
		this.aFloat39 = this.aFloat42 * (float) -arg0 - (float) arg1 * this.aFloat37 - (float) arg2 * this.aFloat45;
		this.aFloat41 = -(this.aFloat40 * (float) arg2) - (float) arg1 * this.aFloat38 + (float) -arg0 * this.aFloat44;
		this.aFloat43 = -((float) arg2 * this.aFloat46) + (float) -arg0 * this.aFloat48 - (float) arg1 * this.aFloat47;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat42 * (float) arg0 + this.aFloat37 * (float) arg1 + this.aFloat45 * (float) arg2);
		arg3[1] = (int) (this.aFloat40 * (float) arg2 + this.aFloat44 * (float) arg0 + this.aFloat38 * (float) arg1);
		arg3[0] = (int) (this.aFloat47 * (float) arg1 + this.aFloat48 * (float) arg0 + (float) arg2 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)[F")
	public float[] method840() {
		Static457.aFloatArray62[0] = this.aFloat48;
		Static457.aFloatArray62[4] = this.aFloat47;
		Static457.aFloatArray62[6] = this.aFloat37;
		Static457.aFloatArray62[12] = 0.0F;
		Static457.aFloatArray62[1] = this.aFloat44;
		Static457.aFloatArray62[13] = 0.0F;
		Static457.aFloatArray62[5] = this.aFloat38;
		Static457.aFloatArray62[14] = 0.0F;
		Static457.aFloatArray62[8] = this.aFloat46;
		Static457.aFloatArray62[9] = this.aFloat40;
		Static457.aFloatArray62[10] = this.aFloat45;
		Static457.aFloatArray62[2] = this.aFloat42;
		return Static457.aFloatArray62;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat45 + (float) arg0 * this.aFloat42 + (float) arg1 * this.aFloat37 + this.aFloat39);
		arg3[1] = (int) (this.aFloat41 + (float) arg2 * this.aFloat40 + this.aFloat38 * (float) arg1 + (float) arg0 * this.aFloat44);
		arg3[0] = (int) (this.aFloat43 + (float) arg0 * this.aFloat48 + this.aFloat47 * (float) arg1 + (float) arg2 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(FIIFFII)V")
	public void method841(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat48 = (float) arg1;
			this.aFloat38 = (float) arg5;
			this.aFloat45 = 1.0F;
			this.aFloat44 = this.aFloat42 = this.aFloat47 = this.aFloat37 = this.aFloat46 = this.aFloat40 = 0.0F;
		} else {
			@Pc(14) float local14 = Class41.aFloatArray24[arg4 & 0x3FFF];
			@Pc(20) float local20 = Class41.aFloatArray23[arg4 & 0x3FFF];
			this.aFloat42 = this.aFloat37 = this.aFloat46 = this.aFloat40 = 0.0F;
			this.aFloat45 = 1.0F;
			this.aFloat38 = local14 * (float) arg5;
			this.aFloat48 = local14 * (float) arg1;
			this.aFloat47 = -local20 * (float) arg5;
			this.aFloat44 = (float) arg1 * local20;
		}
		this.aFloat43 = arg0;
		this.aFloat41 = arg3;
		this.aFloat39 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
	@Override
	public void method4291() {
		this.aFloat44 = this.aFloat42 = this.aFloat47 = this.aFloat37 = this.aFloat46 = this.aFloat40 = this.aFloat43 = this.aFloat41 = this.aFloat39 = 0.0F;
		this.aFloat48 = this.aFloat38 = this.aFloat45 = 1.0F;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!sk;)V")
	public void method843(@OriginalArg(1) Class25 arg0) {
		@Pc(12) Class25_Sub1 local12 = (Class25_Sub1) arg0;
		this.aFloat46 = local12.aFloat42;
		this.aFloat48 = local12.aFloat48;
		this.aFloat47 = local12.aFloat44;
		this.aFloat38 = local12.aFloat38;
		this.aFloat44 = local12.aFloat47;
		this.aFloat40 = local12.aFloat37;
		this.aFloat42 = local12.aFloat46;
		this.aFloat37 = local12.aFloat40;
		this.aFloat45 = local12.aFloat45;
		this.aFloat43 = -(local12.aFloat39 * this.aFloat46 + local12.aFloat41 * this.aFloat47 + this.aFloat48 * local12.aFloat43);
		this.aFloat41 = -(local12.aFloat43 * this.aFloat44 + local12.aFloat41 * this.aFloat38 + local12.aFloat39 * this.aFloat40);
		this.aFloat39 = -(this.aFloat37 * local12.aFloat41 + local12.aFloat43 * this.aFloat42 + local12.aFloat39 * this.aFloat45);
	}

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "(I)[F")
	public float[] method844() {
		Static457.aFloatArray62[5] = this.aFloat38;
		Static457.aFloatArray62[4] = this.aFloat47;
		Static457.aFloatArray62[0] = this.aFloat48;
		Static457.aFloatArray62[8] = this.aFloat46;
		Static457.aFloatArray62[1] = this.aFloat44;
		Static457.aFloatArray62[6] = this.aFloat37;
		Static457.aFloatArray62[9] = this.aFloat40;
		Static457.aFloatArray62[10] = this.aFloat45;
		Static457.aFloatArray62[13] = this.aFloat41;
		Static457.aFloatArray62[12] = this.aFloat43;
		Static457.aFloatArray62[2] = this.aFloat42;
		Static457.aFloatArray62[14] = this.aFloat39;
		return Static457.aFloatArray62;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	@Override
	public void method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat39 += (float) arg2;
		this.aFloat41 += (float) arg1;
		this.aFloat43 += (float) arg0;
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V")
	@Override
	public void method4298(@OriginalArg(0) int arg0) {
		this.aFloat45 = 1.0F;
		this.aFloat48 = this.aFloat38 = Class41.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat44 = Class41.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat46 = this.aFloat43 = this.aFloat40 = this.aFloat41 = this.aFloat42 = this.aFloat37 = this.aFloat39 = 0.0F;
		this.aFloat47 = -this.aFloat44;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method4292() {
		@Pc(7) Class25_Sub1 local7 = new Class25_Sub1();
		local7.aFloat39 = this.aFloat39;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat47 = this.aFloat47;
		return local7;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
	@Override
	public void method4289(@OriginalArg(0) int arg0) {
		this.aFloat38 = 1.0F;
		this.aFloat48 = this.aFloat45 = Class41.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat46 = Class41.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat42 = -this.aFloat46;
		this.aFloat47 = this.aFloat43 = this.aFloat44 = this.aFloat40 = this.aFloat41 = this.aFloat37 = this.aFloat39 = 0.0F;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	@Override
	public void method4285(@OriginalArg(0) int arg0) {
		this.aFloat48 = 1.0F;
		this.aFloat38 = this.aFloat45 = Class41.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat37 = Class41.aFloatArray23[arg0 & 0x3FFF];
		this.aFloat40 = -this.aFloat37;
		this.aFloat47 = this.aFloat46 = this.aFloat43 = this.aFloat44 = this.aFloat41 = this.aFloat42 = this.aFloat39 = 0.0F;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	@Override
	public void method4293(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class41.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class41.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat48;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat46;
		this.aFloat48 = local18 * local9 - this.aFloat44 * local15;
		@Pc(38) float local38 = this.aFloat43;
		this.aFloat47 = local9 * local21 - this.aFloat38 * local15;
		this.aFloat44 = local15 * local18 + this.aFloat44 * local9;
		this.aFloat38 = local21 * local15 + local9 * this.aFloat38;
		this.aFloat46 = local9 * local24 - local15 * this.aFloat40;
		this.aFloat40 = local24 * local15 + this.aFloat40 * local9;
		this.aFloat43 = local38 * local9 - local15 * this.aFloat41;
		this.aFloat41 = local38 * local15 + this.aFloat41 * local9;
	}

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "(I)V")
	public void method845() {
		this.aFloat39 = -this.aFloat39;
		this.aFloat41 = -this.aFloat41;
		this.aFloat37 = -this.aFloat37;
		this.aFloat42 = -this.aFloat42;
		this.aFloat44 = -this.aFloat44;
		this.aFloat40 = -this.aFloat40;
		this.aFloat45 = -this.aFloat45;
		this.aFloat38 = -this.aFloat38;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([FFFFFI)V")
	public void method846(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg0[0] = this.aFloat48 * arg3 + arg2 * this.aFloat47 + arg1 * this.aFloat46;
		arg0[1] = arg1 * this.aFloat40 + this.aFloat38 * arg2 + arg3 * this.aFloat44;
		arg0[2] = arg3 * this.aFloat42 + this.aFloat37 * arg2 + this.aFloat45 * arg1;
		@Pc(77) float local77;
		@Pc(93) float local93;
		@Pc(85) float local85;
		@Pc(69) float local69;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local69 = -arg4 / arg3;
			local77 = this.aFloat43 + local69 * this.aFloat48;
			local85 = this.aFloat42 * local69 + this.aFloat39;
			local93 = this.aFloat44 * local69 + this.aFloat41;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local69 = -arg4 / arg2;
			local77 = this.aFloat47 * local69 + this.aFloat43;
			local93 = this.aFloat41 + local69 * this.aFloat38;
			local85 = this.aFloat39 + this.aFloat37 * local69;
		} else {
			local69 = -arg4 / arg1;
			local93 = this.aFloat41 + local69 * this.aFloat40;
			local85 = this.aFloat45 * local69 + this.aFloat39;
			local77 = local69 * this.aFloat46 + this.aFloat43;
		}
		arg0[3] = -(arg0[2] * local85 + arg0[0] * local77 + arg0[1] * local93);
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
	@Override
	public void method4288(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class41.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class41.aFloatArray23[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat48;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat46;
		this.aFloat48 = local9 * local18 + this.aFloat42 * local15;
		@Pc(37) float local37 = this.aFloat43;
		this.aFloat47 = local21 * local9 + local15 * this.aFloat37;
		this.aFloat42 = local9 * this.aFloat42 - local18 * local15;
		this.aFloat46 = local9 * local24 + local15 * this.aFloat45;
		this.aFloat37 = local9 * this.aFloat37 - local21 * local15;
		this.aFloat43 = local9 * local37 + this.aFloat39 * local15;
		this.aFloat45 = local9 * this.aFloat45 - local24 * local15;
		this.aFloat39 = this.aFloat39 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat43);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat41);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat39);
		arg3[0] = (int) ((float) local24 * this.aFloat42 + this.aFloat44 * (float) local17 + (float) local10 * this.aFloat48);
		arg3[1] = (int) ((float) local24 * this.aFloat37 + this.aFloat47 * (float) local10 + this.aFloat38 * (float) local17);
		arg3[2] = (int) (this.aFloat45 * (float) local24 + this.aFloat40 * (float) local17 + (float) local10 * this.aFloat46);
	}
}
