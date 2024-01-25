import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!gu", name = "q", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!gu", name = "F", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class11_Sub2() {
		this.K();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIFIFF)V")
	public void method2181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat41 = this.aFloat47 = this.aFloat37 = this.aFloat45 = this.aFloat44 = this.aFloat39 = 0.0F;
			this.aFloat43 = arg1;
			this.aFloat42 = arg0;
			this.aFloat40 = 1.0F;
		} else {
			@Pc(45) float local45 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg3 & 0x3FFF];
			@Pc(51) float local51 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg3 & 0x3FFF];
			this.aFloat37 = (float) arg1 * -local51;
			this.aFloat41 = (float) arg0 * local51;
			this.aFloat47 = this.aFloat45 = this.aFloat44 = this.aFloat39 = 0.0F;
			this.aFloat42 = local45 * (float) arg0;
			this.aFloat43 = local45 * (float) arg1;
			this.aFloat40 = 1.0F;
		}
		this.aFloat36 = arg4;
		this.aFloat46 = arg2;
		this.aFloat38 = arg5;
	}

	@OriginalMember(owner = "client!gu", name = "ya", descriptor = "(Lclient!n;)V")
	@Override
	public void ya(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub2 local6 = (Class11_Sub2) arg0;
		this.aFloat40 = local6.aFloat40;
		this.aFloat44 = local6.aFloat44;
		this.aFloat41 = local6.aFloat41;
		this.aFloat38 = local6.aFloat38;
		this.aFloat43 = local6.aFloat43;
		this.aFloat36 = local6.aFloat36;
		this.aFloat42 = local6.aFloat42;
		this.aFloat37 = local6.aFloat37;
		this.aFloat45 = local6.aFloat45;
		this.aFloat39 = local6.aFloat39;
		this.aFloat46 = local6.aFloat46;
		this.aFloat47 = local6.aFloat47;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)[F")
	public float[] method2183() {
		Static168.aFloatArray11[0] = this.aFloat42;
		Static168.aFloatArray11[2] = this.aFloat47;
		Static168.aFloatArray11[1] = this.aFloat41;
		Static168.aFloatArray11[9] = this.aFloat39;
		Static168.aFloatArray11[14] = this.aFloat38;
		Static168.aFloatArray11[6] = this.aFloat45;
		Static168.aFloatArray11[10] = this.aFloat40;
		Static168.aFloatArray11[8] = this.aFloat44;
		Static168.aFloatArray11[12] = this.aFloat46;
		Static168.aFloatArray11[13] = this.aFloat36;
		Static168.aFloatArray11[4] = this.aFloat37;
		Static168.aFloatArray11[5] = this.aFloat43;
		return Static168.aFloatArray11;
	}

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.aFloat43 = 1.0F;
		this.aFloat42 = this.aFloat40 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat44 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat47 = -this.aFloat44;
		this.aFloat37 = this.aFloat46 = this.aFloat41 = this.aFloat39 = this.aFloat36 = this.aFloat45 = this.aFloat38 = 0.0F;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat42 * (float) arg0 + (float) arg1 * this.aFloat37 + (float) arg2 * this.aFloat44 + this.aFloat46);
		arg3[1] = (int) (this.aFloat36 + (float) arg2 * this.aFloat39 + (float) arg0 * this.aFloat41 + this.aFloat43 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat40 + this.aFloat45 * (float) arg1 + this.aFloat47 * (float) arg0 + this.aFloat38);
	}

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "([I)V")
	@Override
	public void M(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat46;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat36;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat38;
		arg0[0] = (int) (local28 * this.aFloat47 + local11 * this.aFloat42 + this.aFloat41 * local19);
		arg0[1] = (int) (this.aFloat45 * local28 + this.aFloat43 * local19 + this.aFloat37 * local11);
		arg0[2] = (int) (this.aFloat39 * local19 + this.aFloat44 * local11 + local28 * this.aFloat40);
	}

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "()V")
	@Override
	public void K() {
		this.aFloat41 = this.aFloat47 = this.aFloat37 = this.aFloat45 = this.aFloat44 = this.aFloat39 = this.aFloat46 = this.aFloat36 = this.aFloat38 = 0.0F;
		this.aFloat42 = this.aFloat43 = this.aFloat40 = 1.0F;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!n;I)V")
	public void method2186(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub2 local6 = (Class11_Sub2) arg0;
		this.aFloat44 = local6.aFloat47;
		this.aFloat37 = local6.aFloat41;
		this.aFloat42 = local6.aFloat42;
		this.aFloat39 = local6.aFloat45;
		this.aFloat43 = local6.aFloat43;
		this.aFloat47 = local6.aFloat44;
		this.aFloat41 = local6.aFloat37;
		this.aFloat46 = -(this.aFloat37 * local6.aFloat36 + local6.aFloat46 * this.aFloat42 + this.aFloat44 * local6.aFloat38);
		this.aFloat45 = local6.aFloat39;
		this.aFloat40 = local6.aFloat40;
		this.aFloat36 = -(local6.aFloat46 * this.aFloat41 + this.aFloat43 * local6.aFloat36 + this.aFloat39 * local6.aFloat38);
		this.aFloat38 = -(this.aFloat45 * local6.aFloat36 + local6.aFloat46 * this.aFloat47 + this.aFloat40 * local6.aFloat38);
	}

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "(III[I)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat43 * (float) arg1 + (float) arg0 * this.aFloat41 + this.aFloat39 * (float) arg2);
		arg3[0] = (int) (this.aFloat44 * (float) arg2 + this.aFloat42 * (float) arg0 + this.aFloat37 * (float) arg1);
		arg3[2] = (int) (this.aFloat40 * (float) arg2 + this.aFloat45 * (float) arg1 + this.aFloat47 * (float) arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()Lclient!n;")
	@Override
	public Class11 method2905() {
		@Pc(7) Class11_Sub2 local7 = new Class11_Sub2();
		local7.aFloat38 = this.aFloat38;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat46 = this.aFloat46;
		return local7;
	}

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "(III)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat46 = arg0;
		this.aFloat38 = arg2;
		this.aFloat41 = this.aFloat47 = this.aFloat37 = this.aFloat45 = this.aFloat44 = this.aFloat39 = 0.0F;
		this.aFloat36 = arg1;
		this.aFloat42 = this.aFloat43 = this.aFloat40 = 1.0F;
	}

	@OriginalMember(owner = "client!gu", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.aFloat42 = 1.0F;
		this.aFloat43 = this.aFloat40 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat45 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat37 = this.aFloat44 = this.aFloat46 = this.aFloat41 = this.aFloat36 = this.aFloat47 = this.aFloat38 = 0.0F;
		this.aFloat39 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat38 += arg2;
		this.aFloat46 += arg0;
		this.aFloat36 += arg1;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)[F")
	public float[] method2187() {
		Static168.aFloatArray11[5] = this.aFloat43;
		Static168.aFloatArray11[14] = 0.0F;
		Static168.aFloatArray11[2] = this.aFloat47;
		Static168.aFloatArray11[9] = this.aFloat39;
		Static168.aFloatArray11[8] = this.aFloat44;
		Static168.aFloatArray11[6] = this.aFloat45;
		Static168.aFloatArray11[4] = this.aFloat37;
		Static168.aFloatArray11[13] = 0.0F;
		Static168.aFloatArray11[10] = this.aFloat40;
		Static168.aFloatArray11[12] = 0.0F;
		Static168.aFloatArray11[0] = this.aFloat42;
		Static168.aFloatArray11[1] = this.aFloat41;
		return Static168.aFloatArray11;
	}

	@OriginalMember(owner = "client!gu", name = "ba", descriptor = "(I)V")
	@Override
	public void ba(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat41;
		@Pc(21) float local21 = this.aFloat43;
		@Pc(24) float local24 = this.aFloat39;
		@Pc(27) float local27 = this.aFloat36;
		this.aFloat41 = local18 * local9 - local15 * this.aFloat47;
		this.aFloat43 = local9 * local21 - local15 * this.aFloat45;
		this.aFloat47 = local15 * local18 + this.aFloat47 * local9;
		this.aFloat39 = local9 * local24 - local15 * this.aFloat40;
		this.aFloat45 = this.aFloat45 * local9 + local15 * local21;
		this.aFloat36 = local9 * local27 - local15 * this.aFloat38;
		this.aFloat40 = local9 * this.aFloat40 + local24 * local15;
		this.aFloat38 = this.aFloat38 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!gu", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		this.aFloat40 = 1.0F;
		this.aFloat42 = this.aFloat43 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat41 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat37 = -this.aFloat41;
		this.aFloat44 = this.aFloat46 = this.aFloat39 = this.aFloat36 = this.aFloat47 = this.aFloat45 = this.aFloat38 = 0.0F;
	}

	@OriginalMember(owner = "client!gu", name = "CA", descriptor = "(I)V")
	@Override
	public void CA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat42;
		@Pc(21) float local21 = this.aFloat37;
		@Pc(24) float local24 = this.aFloat44;
		@Pc(27) float local27 = this.aFloat46;
		this.aFloat42 = local15 * this.aFloat47 + local18 * local9;
		this.aFloat37 = this.aFloat45 * local15 + local21 * local9;
		this.aFloat47 = local9 * this.aFloat47 - local15 * local18;
		this.aFloat45 = local9 * this.aFloat45 - local21 * local15;
		this.aFloat44 = local9 * local24 + local15 * this.aFloat40;
		this.aFloat40 = local9 * this.aFloat40 - local15 * local24;
		this.aFloat46 = this.aFloat38 * local15 + local27 * local9;
		this.aFloat38 = local9 * this.aFloat38 - local15 * local27;
	}

	@OriginalMember(owner = "client!gu", name = "IA", descriptor = "(IIIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub3_Sub11_Sub1.aFloatArray10[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub3_Sub11_Sub1.aFloatArray9[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat42 = local27 * local47 + local21 * local33;
		this.aFloat45 = -local15;
		this.aFloat41 = local39 * -local21 + local27 * local43;
		this.aFloat37 = local39 * local9;
		this.aFloat39 = local21 * local43 + local39 * local27;
		this.aFloat43 = local9 * local33;
		this.aFloat40 = local9 * local21;
		this.aFloat44 = local33 * -local27 + local47 * local21;
		this.aFloat47 = local27 * local9;
		this.aFloat38 = (float) -arg0 * this.aFloat47 - this.aFloat45 * (float) arg1 - (float) arg2 * this.aFloat40;
		this.aFloat36 = this.aFloat41 * (float) -arg0 - this.aFloat43 * (float) arg1 - this.aFloat39 * (float) arg2;
		this.aFloat46 = -(this.aFloat44 * (float) arg2) - (float) arg1 * this.aFloat37 + this.aFloat42 * (float) -arg0;
	}
}
