import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class107_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class247.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class247.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat43;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat36;
		@Pc(27) float local27 = this.aFloat42;
		this.aFloat43 = local15 * this.aFloat45 + local9 * local18;
		this.aFloat41 = local21 * local9 + this.aFloat46 * local15;
		this.aFloat45 = this.aFloat45 * local9 - local18 * local15;
		this.aFloat46 = this.aFloat46 * local9 - local15 * local21;
		this.aFloat36 = local24 * local9 + local15 * this.aFloat39;
		this.aFloat39 = this.aFloat39 * local9 - local24 * local15;
		this.aFloat42 = local9 * local27 + local15 * this.aFloat35;
		this.aFloat35 = local9 * this.aFloat35 - local27 * local15;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)[F")
	public float[] method3747() {
		Static132.aFloatArray7[9] = this.aFloat40;
		Static132.aFloatArray7[10] = this.aFloat39;
		Static132.aFloatArray7[1] = this.aFloat37;
		Static132.aFloatArray7[12] = 0.0F;
		Static132.aFloatArray7[2] = this.aFloat45;
		Static132.aFloatArray7[4] = this.aFloat41;
		Static132.aFloatArray7[5] = this.aFloat38;
		Static132.aFloatArray7[0] = this.aFloat43;
		Static132.aFloatArray7[8] = this.aFloat36;
		Static132.aFloatArray7[13] = 0.0F;
		Static132.aFloatArray7[14] = 0.0F;
		Static132.aFloatArray7[6] = this.aFloat46;
		return Static132.aFloatArray7;
	}

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class247.aFloatArray16[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class247.aFloatArray15[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class247.aFloatArray16[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class247.aFloatArray15[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class247.aFloatArray16[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class247.aFloatArray15[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat46 = -local15;
		this.aFloat43 = local21 * local33 + local47 * local27;
		this.aFloat37 = local27 * local43 + local39 * -local21;
		this.aFloat38 = local9 * local33;
		this.aFloat39 = local9 * local21;
		this.aFloat41 = local9 * local39;
		this.aFloat36 = -local27 * local33 + local47 * local21;
		this.aFloat40 = local39 * local27 + local21 * local43;
		this.aFloat45 = local27 * local9;
		this.aFloat35 = -(this.aFloat46 * (float) arg1) + (float) -arg0 * this.aFloat45 - (float) arg2 * this.aFloat39;
		this.aFloat44 = -(this.aFloat38 * (float) arg1) + this.aFloat37 * (float) -arg0 - (float) arg2 * this.aFloat40;
		this.aFloat42 = this.aFloat43 * (float) -arg0 - this.aFloat41 * (float) arg1 - this.aFloat36 * (float) arg2;
	}

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat38 = 1.0F;
		this.aFloat43 = this.aFloat39 = Class247.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat36 = Class247.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat36;
		this.aFloat41 = this.aFloat42 = this.aFloat37 = this.aFloat40 = this.aFloat44 = this.aFloat46 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!mn", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat37 = this.aFloat45 = this.aFloat41 = this.aFloat46 = this.aFloat36 = this.aFloat40 = this.aFloat42 = this.aFloat44 = this.aFloat35 = 0.0F;
		this.aFloat43 = this.aFloat38 = this.aFloat39 = 1.0F;
	}

	@OriginalMember(owner = "client!mn", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat44 += arg1;
		this.aFloat35 += arg2;
		this.aFloat42 += arg0;
	}

	@OriginalMember(owner = "client!mn", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat43 = 1.0F;
		this.aFloat38 = this.aFloat39 = Class247.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat46 = Class247.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat40 = -this.aFloat46;
		this.aFloat41 = this.aFloat36 = this.aFloat42 = this.aFloat37 = this.aFloat44 = this.aFloat45 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class107 method4904() {
		@Pc(7) Class107_Sub1 local7 = new Class107_Sub1();
		local7.aFloat41 = this.aFloat41;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat35 = this.aFloat35;
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method3748(@OriginalArg(0) Class107 arg0) {
		@Pc(6) Class107_Sub1 local6 = (Class107_Sub1) arg0;
		this.aFloat41 = local6.aFloat37;
		this.aFloat36 = local6.aFloat45;
		this.aFloat43 = local6.aFloat43;
		this.aFloat40 = local6.aFloat46;
		this.aFloat38 = local6.aFloat38;
		this.aFloat45 = local6.aFloat36;
		this.aFloat37 = local6.aFloat41;
		this.aFloat46 = local6.aFloat40;
		this.aFloat39 = local6.aFloat39;
		this.aFloat42 = -(local6.aFloat35 * this.aFloat36 + this.aFloat43 * local6.aFloat42 + this.aFloat41 * local6.aFloat44);
		this.aFloat44 = -(local6.aFloat44 * this.aFloat38 + local6.aFloat42 * this.aFloat37 + local6.aFloat35 * this.aFloat40);
		this.aFloat35 = -(local6.aFloat42 * this.aFloat45 + this.aFloat46 * local6.aFloat44 + this.aFloat39 * local6.aFloat35);
	}

	@OriginalMember(owner = "client!mn", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class247.aFloatArray16[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class247.aFloatArray15[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat37;
		@Pc(21) float local21 = this.aFloat38;
		@Pc(24) float local24 = this.aFloat40;
		this.aFloat37 = local9 * local18 - this.aFloat45 * local15;
		@Pc(38) float local38 = this.aFloat44;
		this.aFloat38 = local9 * local21 - local15 * this.aFloat46;
		this.aFloat45 = local18 * local15 + this.aFloat45 * local9;
		this.aFloat46 = local21 * local15 + this.aFloat46 * local9;
		this.aFloat40 = local9 * local24 - local15 * this.aFloat39;
		this.aFloat39 = local15 * local24 + local9 * this.aFloat39;
		this.aFloat44 = local9 * local38 - local15 * this.aFloat35;
		this.aFloat35 = local15 * local38 + this.aFloat35 * local9;
	}

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat37 = this.aFloat45 = this.aFloat41 = this.aFloat46 = this.aFloat36 = this.aFloat40 = 0.0F;
		this.aFloat44 = arg1;
		this.aFloat43 = this.aFloat38 = this.aFloat39 = 1.0F;
		this.aFloat42 = arg0;
		this.aFloat35 = arg2;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)[F")
	public float[] method3750() {
		Static132.aFloatArray7[8] = this.aFloat36;
		Static132.aFloatArray7[10] = this.aFloat39;
		Static132.aFloatArray7[9] = this.aFloat40;
		Static132.aFloatArray7[4] = this.aFloat41;
		Static132.aFloatArray7[1] = this.aFloat37;
		Static132.aFloatArray7[0] = this.aFloat43;
		Static132.aFloatArray7[5] = this.aFloat38;
		Static132.aFloatArray7[12] = this.aFloat42;
		Static132.aFloatArray7[2] = this.aFloat45;
		Static132.aFloatArray7[13] = this.aFloat44;
		Static132.aFloatArray7[14] = this.aFloat35;
		Static132.aFloatArray7[6] = this.aFloat46;
		return Static132.aFloatArray7;
	}

	@OriginalMember(owner = "client!mn", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat42;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat44;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat35;
		arg0[2] = (int) (this.aFloat39 * local30 + local21 * this.aFloat40 + this.aFloat36 * local12);
		arg0[0] = (int) (local21 * this.aFloat37 + local12 * this.aFloat43 + local30 * this.aFloat45);
		arg0[1] = (int) (this.aFloat46 * local30 + local12 * this.aFloat41 + this.aFloat38 * local21);
	}

	@OriginalMember(owner = "client!mn", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class107 arg0) {
		@Pc(6) Class107_Sub1 local6 = (Class107_Sub1) arg0;
		this.aFloat39 = local6.aFloat39;
		this.aFloat46 = local6.aFloat46;
		this.aFloat35 = local6.aFloat35;
		this.aFloat41 = local6.aFloat41;
		this.aFloat43 = local6.aFloat43;
		this.aFloat36 = local6.aFloat36;
		this.aFloat45 = local6.aFloat45;
		this.aFloat42 = local6.aFloat42;
		this.aFloat38 = local6.aFloat38;
		this.aFloat37 = local6.aFloat37;
		this.aFloat44 = local6.aFloat44;
		this.aFloat40 = local6.aFloat40;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat44 + this.aFloat40 * (float) arg2 + this.aFloat38 * (float) arg1 + (float) arg0 * this.aFloat37);
		arg3[2] = (int) (this.aFloat45 * (float) arg0 + this.aFloat46 * (float) arg1 + this.aFloat39 * (float) arg2 + this.aFloat35);
		arg3[0] = (int) ((float) arg0 * this.aFloat43 + this.aFloat41 * (float) arg1 + this.aFloat36 * (float) arg2 + this.aFloat42);
	}

	@OriginalMember(owner = "client!mn", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat43 = this.aFloat38 = Class247.aFloatArray16[arg0 & 0x3FFF];
		this.aFloat37 = Class247.aFloatArray15[arg0 & 0x3FFF];
		this.aFloat36 = this.aFloat42 = this.aFloat40 = this.aFloat44 = this.aFloat45 = this.aFloat46 = this.aFloat35 = 0.0F;
		this.aFloat41 = -this.aFloat37;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIFIFFI)V")
	public void method3752(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat38 = arg2;
			this.aFloat37 = this.aFloat45 = this.aFloat41 = this.aFloat46 = this.aFloat36 = this.aFloat40 = 0.0F;
			this.aFloat43 = arg0;
			this.aFloat39 = 1.0F;
		} else {
			@Pc(8) float local8 = Class247.aFloatArray16[arg5 & 0x3FFF];
			@Pc(14) float local14 = Class247.aFloatArray15[arg5 & 0x3FFF];
			this.aFloat39 = 1.0F;
			this.aFloat45 = this.aFloat46 = this.aFloat36 = this.aFloat40 = 0.0F;
			this.aFloat38 = (float) arg2 * local8;
			this.aFloat43 = local8 * (float) arg0;
			this.aFloat41 = -local14 * (float) arg2;
			this.aFloat37 = local14 * (float) arg0;
		}
		this.aFloat42 = arg1;
		this.aFloat35 = arg3;
		this.aFloat44 = arg4;
	}

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat39 + (float) arg1 * this.aFloat46 + this.aFloat45 * (float) arg0);
		arg3[0] = (int) ((float) arg2 * this.aFloat36 + (float) arg1 * this.aFloat41 + (float) arg0 * this.aFloat43);
		arg3[1] = (int) ((float) arg2 * this.aFloat40 + this.aFloat37 * (float) arg0 + (float) arg1 * this.aFloat38);
	}
}
