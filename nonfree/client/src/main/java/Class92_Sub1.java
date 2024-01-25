import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!eia", name = "w", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!eia", name = "z", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!eia", name = "H", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!eia", name = "J", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!eia", name = "L", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!eia", name = "M", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!eia", name = "O", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!eia", name = "X", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!eia", name = "ab", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!eia", name = "gb", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!eia", name = "hb", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!eia", name = "kb", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "()V")
	public Class92_Sub1() {
		this.method3853();
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat46 * (float) arg2 + this.aFloat48 * (float) arg0 + this.aFloat41 * (float) arg1 + this.aFloat44);
		arg3[1] = (int) (this.aFloat43 * (float) arg2 + (float) arg0 * this.aFloat47 + this.aFloat40 * (float) arg1 + this.aFloat42);
		arg3[0] = (int) ((float) arg0 * this.aFloat49 + (float) arg1 * this.aFloat51 + (float) arg2 * this.aFloat45 + this.aFloat50);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!nh;I)V")
	public void method2293(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class92_Sub1 local6 = (Class92_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat49;
		@Pc(12) float local12 = this.aFloat47;
		@Pc(18) float local18 = this.aFloat51;
		@Pc(21) float local21 = this.aFloat40;
		@Pc(24) float local24 = this.aFloat45;
		@Pc(27) float local27 = this.aFloat43;
		@Pc(30) float local30 = this.aFloat50;
		this.aFloat47 = local6.aFloat43 * this.aFloat48 + local12 * local6.aFloat40 + local9 * local6.aFloat47;
		@Pc(50) float local50 = this.aFloat42;
		this.aFloat49 = local12 * local6.aFloat51 + local6.aFloat49 * local9 + local6.aFloat45 * this.aFloat48;
		this.aFloat40 = local18 * local6.aFloat47 + local21 * local6.aFloat40 + local6.aFloat43 * this.aFloat41;
		this.aFloat51 = this.aFloat41 * local6.aFloat45 + local18 * local6.aFloat49 + local6.aFloat51 * local21;
		this.aFloat48 = this.aFloat48 * local6.aFloat46 + local12 * local6.aFloat41 + local9 * local6.aFloat48;
		this.aFloat41 = local6.aFloat46 * this.aFloat41 + local18 * local6.aFloat48 + local6.aFloat41 * local21;
		this.aFloat43 = this.aFloat46 * local6.aFloat43 + local27 * local6.aFloat40 + local6.aFloat47 * local24;
		this.aFloat45 = this.aFloat46 * local6.aFloat45 + local27 * local6.aFloat51 + local24 * local6.aFloat49;
		this.aFloat46 = this.aFloat46 * local6.aFloat46 + local27 * local6.aFloat41 + local24 * local6.aFloat48;
		this.aFloat50 = local6.aFloat50 + this.aFloat44 * local6.aFloat45 + local6.aFloat51 * local50 + local6.aFloat49 * local30;
		this.aFloat42 = local6.aFloat42 + local6.aFloat40 * local50 + local6.aFloat47 * local30 + local6.aFloat43 * this.aFloat44;
		this.aFloat44 = local6.aFloat46 * this.aFloat44 + local6.aFloat48 * local30 + local50 * local6.aFloat41 + local6.aFloat44;
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(III[I)V")
	@Override
	public void method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat44);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat42);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat50);
		arg3[2] = (int) ((float) local13 * this.aFloat43 + this.aFloat45 * (float) local24 + this.aFloat46 * (float) local6);
		arg3[0] = (int) (this.aFloat49 * (float) local24 + (float) local13 * this.aFloat47 + this.aFloat48 * (float) local6);
		arg3[1] = (int) (this.aFloat40 * (float) local13 + (float) local24 * this.aFloat51 + this.aFloat41 * (float) local6);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FBFFF[F)V")
	public void method2294(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = this.aFloat41 * arg0 + arg3 * this.aFloat48 + this.aFloat46 * arg2;
		@Pc(59) float local59;
		@Pc(51) float local51;
		@Pc(43) float local43;
		@Pc(35) float local35;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local35 = -arg1 / arg3;
			local43 = local35 * this.aFloat48 + this.aFloat44;
			local51 = this.aFloat47 * local35 + this.aFloat42;
			local59 = local35 * this.aFloat49 + this.aFloat50;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local35 = -arg1 / arg0;
			local51 = local35 * this.aFloat40 + this.aFloat42;
			local59 = this.aFloat50 + local35 * this.aFloat51;
			local43 = this.aFloat44 + this.aFloat41 * local35;
		} else {
			local35 = -arg1 / arg2;
			local51 = this.aFloat42 + local35 * this.aFloat43;
			local43 = this.aFloat46 * local35 + this.aFloat44;
			local59 = this.aFloat45 * local35 + this.aFloat50;
		}
		arg4[0] = arg2 * this.aFloat45 + this.aFloat49 * arg3 + arg0 * this.aFloat51;
		arg4[1] = this.aFloat43 * arg2 + this.aFloat47 * arg3 + arg0 * this.aFloat40;
		arg4[3] = -(local43 * arg4[2] + arg4[1] * local51 + arg4[0] * local59);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FFIF)F")
	public float method2295(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat41 + this.aFloat48 * arg2 + arg0 * this.aFloat46 + this.aFloat44;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([FZ)[F")
	public float[] method2296(@OriginalArg(0) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat42;
		arg0[2] = this.aFloat48;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat49;
		arg0[1] = this.aFloat47;
		arg0[10] = this.aFloat46;
		arg0[8] = this.aFloat45;
		arg0[14] = this.aFloat44;
		arg0[5] = this.aFloat40;
		arg0[9] = this.aFloat43;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat51;
		arg0[12] = this.aFloat50;
		arg0[6] = this.aFloat41;
		return arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "()V")
	@Override
	public void method3853() {
		this.aFloat47 = this.aFloat48 = this.aFloat51 = this.aFloat41 = this.aFloat45 = this.aFloat43 = this.aFloat50 = this.aFloat42 = this.aFloat44 = 0.0F;
		this.aFloat49 = this.aFloat40 = this.aFloat46 = 1.0F;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V")
	@Override
	public void method3858(@OriginalArg(0) int arg0) {
		this.aFloat40 = 1.0F;
		this.aFloat49 = this.aFloat46 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat45 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat51 = this.aFloat50 = this.aFloat47 = this.aFloat43 = this.aFloat42 = this.aFloat41 = this.aFloat44 = 0.0F;
		this.aFloat48 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "(I)V")
	@Override
	public void method3860(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat49;
		@Pc(21) float local21 = this.aFloat51;
		@Pc(24) float local24 = this.aFloat45;
		this.aFloat49 = local9 * local18 - local15 * this.aFloat47;
		@Pc(38) float local38 = this.aFloat50;
		this.aFloat47 = local9 * this.aFloat47 + local15 * local18;
		this.aFloat51 = local21 * local9 - local15 * this.aFloat40;
		this.aFloat40 = local15 * local21 + local9 * this.aFloat40;
		this.aFloat45 = local24 * local9 - this.aFloat43 * local15;
		this.aFloat50 = local9 * local38 - this.aFloat42 * local15;
		this.aFloat43 = local9 * this.aFloat43 + local15 * local24;
		this.aFloat42 = local15 * local38 + local9 * this.aFloat42;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z[F)[F")
	public float[] method2297(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat43;
		arg0[14] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat46;
		arg0[15] = 0.0F;
		arg0[1] = this.aFloat51;
		arg0[9] = this.aFloat41;
		arg0[5] = this.aFloat40;
		arg0[4] = this.aFloat47;
		arg0[0] = this.aFloat49;
		arg0[8] = this.aFloat48;
		arg0[7] = 0.0F;
		arg0[2] = this.aFloat45;
		return arg0;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(III)V")
	@Override
	public void method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat42 = (float) arg1;
		this.aFloat50 = (float) arg0;
		this.aFloat47 = this.aFloat48 = this.aFloat51 = this.aFloat41 = this.aFloat45 = this.aFloat43 = 0.0F;
		this.aFloat44 = (float) arg2;
		this.aFloat49 = this.aFloat40 = this.aFloat46 = 1.0F;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method3865(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class92_Sub1 local6 = (Class92_Sub1) arg0;
		this.aFloat49 = local6.aFloat49;
		this.aFloat41 = local6.aFloat41;
		this.aFloat47 = local6.aFloat47;
		this.aFloat46 = local6.aFloat46;
		this.aFloat44 = local6.aFloat44;
		this.aFloat48 = local6.aFloat48;
		this.aFloat40 = local6.aFloat40;
		this.aFloat43 = local6.aFloat43;
		this.aFloat51 = local6.aFloat51;
		this.aFloat45 = local6.aFloat45;
		this.aFloat50 = local6.aFloat50;
		this.aFloat42 = local6.aFloat42;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZFFF)F")
	public float method2298(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat42 + this.aFloat43 * arg2 + arg0 * this.aFloat47 + this.aFloat40 * arg1;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IFFF)F")
	public float method2299(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat50 + arg2 * this.aFloat45 + arg1 * this.aFloat49 + arg0 * this.aFloat51;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLclient!nh;)V")
	public void method2301(@OriginalArg(1) Class92 arg0) {
		@Pc(6) Class92_Sub1 local6 = (Class92_Sub1) arg0;
		this.aFloat45 = local6.aFloat48;
		this.aFloat51 = local6.aFloat47;
		this.aFloat49 = local6.aFloat49;
		this.aFloat48 = local6.aFloat45;
		this.aFloat47 = local6.aFloat51;
		this.aFloat43 = local6.aFloat41;
		this.aFloat40 = local6.aFloat40;
		this.aFloat41 = local6.aFloat43;
		this.aFloat46 = local6.aFloat46;
		this.aFloat50 = -(this.aFloat51 * local6.aFloat42 + this.aFloat49 * local6.aFloat50 + this.aFloat45 * local6.aFloat44);
		this.aFloat42 = -(this.aFloat47 * local6.aFloat50 + this.aFloat40 * local6.aFloat42 + local6.aFloat44 * this.aFloat43);
		this.aFloat44 = -(this.aFloat48 * local6.aFloat50 + this.aFloat41 * local6.aFloat42 + this.aFloat46 * local6.aFloat44);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FFFB)V")
	public void method2302(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat50 = 0.0F;
		this.aFloat40 = arg0;
		this.aFloat43 = 0.0F;
		this.aFloat42 = 0.0F;
		this.aFloat44 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat48 = 0.0F;
		this.aFloat51 = 0.0F;
		this.aFloat45 = 0.0F;
		this.aFloat49 = arg2;
		this.aFloat46 = arg1;
		this.aFloat47 = 0.0F;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[F)[F")
	public float[] method2303(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat49;
		arg0[6] = this.aFloat43;
		arg0[3] = this.aFloat50;
		arg0[4] = this.aFloat47;
		arg0[5] = this.aFloat40;
		arg0[1] = this.aFloat51;
		arg0[2] = this.aFloat45;
		arg0[7] = this.aFloat42;
		return arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	@Override
	public void method3852(@OriginalArg(0) int arg0) {
		this.aFloat49 = 1.0F;
		this.aFloat40 = this.aFloat46 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat41 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat51 = this.aFloat45 = this.aFloat50 = this.aFloat47 = this.aFloat42 = this.aFloat48 = this.aFloat44 = 0.0F;
		this.aFloat43 = -this.aFloat41;
	}

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "(I)V")
	@Override
	public void method3866(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat47;
		@Pc(21) float local21 = this.aFloat40;
		@Pc(24) float local24 = this.aFloat43;
		@Pc(27) float local27 = this.aFloat42;
		this.aFloat47 = local18 * local9 - local15 * this.aFloat48;
		this.aFloat48 = local18 * local15 + this.aFloat48 * local9;
		this.aFloat40 = local21 * local9 - local15 * this.aFloat41;
		this.aFloat43 = local9 * local24 - local15 * this.aFloat46;
		this.aFloat41 = local21 * local15 + local9 * this.aFloat41;
		this.aFloat42 = local27 * local9 - this.aFloat44 * local15;
		this.aFloat46 = this.aFloat46 * local9 + local24 * local15;
		this.aFloat44 = local15 * local27 + local9 * this.aFloat44;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat43 + this.aFloat40 * (float) arg1 + this.aFloat47 * (float) arg0);
		arg3[0] = (int) (this.aFloat51 * (float) arg1 + this.aFloat49 * (float) arg0 + (float) arg2 * this.aFloat45);
		arg3[2] = (int) ((float) arg2 * this.aFloat46 + this.aFloat48 * (float) arg0 + (float) arg1 * this.aFloat41);
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(Lclient!nh;I)V")
	public void method2304(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class92_Sub1 local6 = (Class92_Sub1) arg0;
		this.aFloat51 = local6.aFloat51;
		this.aFloat40 = local6.aFloat40;
		this.aFloat46 = local6.aFloat46;
		this.aFloat47 = local6.aFloat47;
		this.aFloat50 = 0.0F;
		this.aFloat42 = (float) 0;
		this.aFloat44 = 0.0F;
		this.aFloat41 = local6.aFloat41;
		this.aFloat43 = local6.aFloat43;
		this.aFloat49 = local6.aFloat49;
		this.aFloat45 = local6.aFloat45;
		this.aFloat48 = local6.aFloat48;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FFFFFFFIFF)V")
	public void method2306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat47 = arg3;
		this.aFloat45 = arg6;
		this.aFloat40 = arg1;
		this.aFloat41 = arg2;
		this.aFloat44 = 0.0F;
		this.aFloat50 = 0.0F;
		this.aFloat42 = 0.0F;
		this.aFloat46 = arg5;
		this.aFloat51 = arg7;
		this.aFloat48 = arg4;
		this.aFloat43 = arg0;
		this.aFloat49 = arg8;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I[F)[F")
	public float[] method2308(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat40;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat44;
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[2] = 0.0F;
		arg0[8] = this.aFloat50;
		arg0[9] = this.aFloat42;
		arg0[6] = 0.0F;
		arg0[0] = this.aFloat49;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat47;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat51;
		return arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([FFBFF)V")
	public void method2309(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[2] = this.aFloat48 * arg2 + this.aFloat41 * arg3 + this.aFloat46 * arg1;
		arg0[0] = arg1 * this.aFloat45 + this.aFloat49 * arg2 + this.aFloat51 * arg3;
		arg0[1] = arg2 * this.aFloat47 + arg3 * this.aFloat40 + arg1 * this.aFloat43;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BIFIFFI)V")
	public void method2310(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat49 = (float) (arg2 * 2);
			this.aFloat50 = (float) -arg2 + arg1;
			this.aFloat46 = 1.0F;
			this.aFloat47 = this.aFloat48 = this.aFloat51 = this.aFloat41 = this.aFloat45 = this.aFloat43 = 0.0F;
			this.aFloat40 = (float) (arg0 * 2);
			this.aFloat42 = arg3 - (float) arg0;
			this.aFloat44 = arg4;
			return;
		}
		@Pc(10) float local10 = Class319.aFloatArray58[arg5 & 0x3FFF];
		@Pc(16) float local16 = Class319.aFloatArray59[arg5 & 0x3FFF];
		this.aFloat50 = (local16 * 0.5F - local10 * 0.5F) * (float) (arg2 * 2) + arg1;
		this.aFloat46 = 1.0F;
		this.aFloat42 = (float) (arg0 * 2) * (-0.5F * local16 - local10 * 0.5F) + arg3;
		this.aFloat48 = this.aFloat41 = this.aFloat45 = this.aFloat43 = 0.0F;
		this.aFloat49 = local10 * 2.0F * (float) arg2;
		this.aFloat51 = (float) arg0 * -2.0F * local16;
		this.aFloat47 = local16 * 2.0F * (float) arg2;
		this.aFloat44 = arg4;
		this.aFloat40 = local10 * 2.0F * (float) arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FFFI)V")
	public void method2311(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat44 += arg1;
		this.aFloat42 += arg0;
		this.aFloat50 += arg2;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!nh;Lclient!nh;)V")
	public void method2312(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1) {
		@Pc(6) Class92_Sub1 local6 = (Class92_Sub1) arg0;
		@Pc(9) Class92_Sub1 local9 = (Class92_Sub1) arg1;
		this.aFloat49 = local6.aFloat49 * local9.aFloat49 + local9.aFloat47 * local6.aFloat51 + local6.aFloat45 * local9.aFloat48;
		this.aFloat47 = local6.aFloat43 * local9.aFloat48 + local6.aFloat47 * local9.aFloat49 + local9.aFloat47 * local6.aFloat40;
		this.aFloat51 = local9.aFloat41 * local6.aFloat45 + local9.aFloat40 * local6.aFloat51 + local9.aFloat51 * local6.aFloat49;
		this.aFloat48 = local6.aFloat46 * local9.aFloat48 + local9.aFloat47 * local6.aFloat41 + local9.aFloat49 * local6.aFloat48;
		this.aFloat40 = local6.aFloat47 * local9.aFloat51 + local6.aFloat40 * local9.aFloat40 + local6.aFloat43 * local9.aFloat41;
		this.aFloat41 = local6.aFloat46 * local9.aFloat41 + local9.aFloat51 * local6.aFloat48 + local9.aFloat40 * local6.aFloat41;
		this.aFloat45 = local6.aFloat45 * local9.aFloat46 + local9.aFloat45 * local6.aFloat49 + local9.aFloat43 * local6.aFloat51;
		this.aFloat43 = local9.aFloat45 * local6.aFloat47 + local6.aFloat40 * local9.aFloat43 + local9.aFloat46 * local6.aFloat43;
		this.aFloat50 = local6.aFloat50 + local6.aFloat49 * local9.aFloat50 + local9.aFloat42 * local6.aFloat51 + local6.aFloat45 * local9.aFloat44;
		this.aFloat46 = local6.aFloat46 * local9.aFloat46 + local6.aFloat48 * local9.aFloat45 + local9.aFloat43 * local6.aFloat41;
		this.aFloat42 = local6.aFloat43 * local9.aFloat44 + local6.aFloat40 * local9.aFloat42 + local9.aFloat50 * local6.aFloat47 + local6.aFloat42;
		this.aFloat44 = local6.aFloat44 + local9.aFloat44 * local6.aFloat46 + local9.aFloat50 * local6.aFloat48 + local9.aFloat42 * local6.aFloat41;
	}

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "(I)V")
	@Override
	public void method3861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat49;
		@Pc(21) float local21 = this.aFloat51;
		@Pc(24) float local24 = this.aFloat45;
		this.aFloat49 = local18 * local9 + local15 * this.aFloat48;
		@Pc(37) float local37 = this.aFloat50;
		this.aFloat51 = local15 * this.aFloat41 + local21 * local9;
		this.aFloat48 = this.aFloat48 * local9 - local18 * local15;
		this.aFloat41 = local9 * this.aFloat41 - local15 * local21;
		this.aFloat45 = local15 * this.aFloat46 + local24 * local9;
		this.aFloat46 = this.aFloat46 * local9 - local24 * local15;
		this.aFloat50 = this.aFloat44 * local15 + local37 * local9;
		this.aFloat44 = this.aFloat44 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(I[F)[F")
	public float[] method2313(@OriginalArg(1) float[] arg0) {
		arg0[11] = this.aFloat44;
		arg0[6] = this.aFloat43;
		arg0[9] = this.aFloat41;
		arg0[1] = this.aFloat51;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat49;
		arg0[10] = this.aFloat46;
		arg0[2] = this.aFloat45;
		arg0[4] = this.aFloat47;
		arg0[5] = this.aFloat40;
		arg0[8] = this.aFloat48;
		arg0[13] = (float) 0;
		arg0[3] = this.aFloat50;
		arg0[7] = this.aFloat42;
		arg0[12] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method3857() {
		@Pc(7) Class92_Sub1 local7 = new Class92_Sub1();
		local7.aFloat50 = this.aFloat50;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat48 = this.aFloat48;
		return local7;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([I)V")
	@Override
	public void method3869(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat50;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat42;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat44;
		arg0[0] = (int) (this.aFloat49 * local12 + this.aFloat47 * local21 + this.aFloat48 * local29);
		arg0[1] = (int) (this.aFloat51 * local12 + local21 * this.aFloat40 + this.aFloat41 * local29);
		arg0[2] = (int) (local12 * this.aFloat45 + local21 * this.aFloat43 + this.aFloat46 * local29);
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(FFFB)V")
	public void method2314(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat50 = arg2;
		this.aFloat42 = arg1;
		this.aFloat49 = this.aFloat40 = this.aFloat46 = 1.0F;
		this.aFloat47 = this.aFloat48 = this.aFloat51 = this.aFloat41 = this.aFloat45 = this.aFloat43 = 0.0F;
		this.aFloat44 = arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class319.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class319.aFloatArray59[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class319.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class319.aFloatArray59[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat49 = local33 * local21 + local47 * local27;
		this.aFloat45 = local33 * -local27 + local21 * local47;
		this.aFloat41 = -local15;
		this.aFloat48 = local9 * local27;
		this.aFloat46 = local9 * local21;
		this.aFloat43 = local21 * local43 + local27 * local39;
		this.aFloat40 = local33 * local9;
		this.aFloat51 = local39 * local9;
		this.aFloat47 = local27 * local43 + local39 * -local21;
		this.aFloat50 = this.aFloat49 * (float) -arg0 - (float) arg1 * this.aFloat51 - this.aFloat45 * (float) arg2;
		this.aFloat44 = -(this.aFloat41 * (float) arg1) + (float) -arg0 * this.aFloat48 - this.aFloat46 * (float) arg2;
		this.aFloat42 = -((float) arg1 * this.aFloat40) + (float) -arg0 * this.aFloat47 - (float) arg2 * this.aFloat43;
	}

	@OriginalMember(owner = "client!eia", name = "h", descriptor = "(I)V")
	@Override
	public void method3868(@OriginalArg(0) int arg0) {
		this.aFloat46 = 1.0F;
		this.aFloat49 = this.aFloat40 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat47 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat45 = this.aFloat50 = this.aFloat43 = this.aFloat42 = this.aFloat48 = this.aFloat41 = this.aFloat44 = 0.0F;
		this.aFloat51 = -this.aFloat47;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(FIFF)V")
	public void method2315(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat49 *= arg1;
		this.aFloat47 *= arg0;
		this.aFloat45 *= arg1;
		this.aFloat51 *= arg1;
		this.aFloat42 *= arg0;
		this.aFloat40 *= arg0;
		this.aFloat44 *= arg2;
		this.aFloat50 *= arg1;
		this.aFloat41 *= arg2;
		this.aFloat48 *= arg2;
		this.aFloat43 *= arg0;
		this.aFloat46 *= arg2;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)V")
	@Override
	public void method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 += (float) arg0;
		this.aFloat42 += (float) arg1;
		this.aFloat44 += (float) arg2;
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(B)V")
	public void method2316() {
		this.aFloat43 = -this.aFloat43;
		this.aFloat42 = -this.aFloat42;
		this.aFloat47 = -this.aFloat47;
		this.aFloat46 = -this.aFloat46;
		this.aFloat48 = -this.aFloat48;
		this.aFloat40 = -this.aFloat40;
		this.aFloat44 = -this.aFloat44;
		this.aFloat41 = -this.aFloat41;
	}
}
