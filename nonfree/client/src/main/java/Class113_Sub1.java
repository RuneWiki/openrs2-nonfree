import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class113_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!g", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat49;
		@Pc(21) float local21 = this.aFloat39;
		@Pc(24) float local24 = this.aFloat45;
		@Pc(27) float local27 = this.aFloat46;
		this.aFloat49 = local18 * local9 - local15 * this.aFloat38;
		this.aFloat39 = local9 * local21 - this.aFloat48 * local15;
		this.aFloat38 = local18 * local15 + local9 * this.aFloat38;
		this.aFloat45 = local9 * local24 - local15 * this.aFloat43;
		this.aFloat48 = local9 * this.aFloat48 + local21 * local15;
		this.aFloat46 = local9 * local27 - local15 * this.aFloat50;
		this.aFloat43 = local15 * local24 + this.aFloat43 * local9;
		this.aFloat50 = local9 * this.aFloat50 + local27 * local15;
	}

	@OriginalMember(owner = "client!g", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub1_Sub27.aFloatArray35[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub1_Sub27.aFloatArray36[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub1_Sub27.aFloatArray35[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub1_Sub27.aFloatArray36[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat45 = local27 * local39 + local21 * local43;
		this.aFloat40 = local33 * local21 + local27 * local47;
		this.aFloat41 = local9 * local39;
		this.aFloat43 = local9 * local21;
		this.aFloat42 = local47 * local21 + -local27 * local33;
		this.aFloat48 = -local15;
		this.aFloat38 = local9 * local27;
		this.aFloat39 = local9 * local33;
		this.aFloat49 = local43 * local27 + local39 * -local21;
		this.aFloat37 = -(this.aFloat42 * (float) arg2) + this.aFloat40 * (float) -arg0 - this.aFloat41 * (float) arg1;
		this.aFloat46 = -((float) arg1 * this.aFloat39) + (float) -arg0 * this.aFloat49 - (float) arg2 * this.aFloat45;
		this.aFloat50 = this.aFloat38 * (float) -arg0 - (float) arg1 * this.aFloat48 - (float) arg2 * this.aFloat43;
	}

	@OriginalMember(owner = "client!g", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat43 + (float) arg1 * this.aFloat48 + this.aFloat38 * (float) arg0);
		arg3[1] = (int) ((float) arg0 * this.aFloat49 + this.aFloat39 * (float) arg1 + this.aFloat45 * (float) arg2);
		arg3[0] = (int) (this.aFloat42 * (float) arg2 + this.aFloat41 * (float) arg1 + this.aFloat40 * (float) arg0);
	}

	@OriginalMember(owner = "client!g", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat42;
		@Pc(27) float local27 = this.aFloat37;
		this.aFloat40 = this.aFloat38 * local15 + local9 * local18;
		this.aFloat41 = local9 * local21 + this.aFloat48 * local15;
		this.aFloat38 = local9 * this.aFloat38 - local15 * local18;
		this.aFloat42 = local24 * local9 + this.aFloat43 * local15;
		this.aFloat48 = local9 * this.aFloat48 - local15 * local21;
		this.aFloat37 = local27 * local9 + local15 * this.aFloat50;
		this.aFloat43 = this.aFloat43 * local9 - local15 * local24;
		this.aFloat50 = this.aFloat50 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat40 = this.aFloat39 = this.aFloat43 = 1.0F;
		this.aFloat49 = this.aFloat38 = this.aFloat41 = this.aFloat48 = this.aFloat42 = this.aFloat45 = this.aFloat37 = this.aFloat46 = this.aFloat50 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat37 += arg0;
		this.aFloat50 += arg2;
		this.aFloat46 += arg1;
	}

	@OriginalMember(owner = "client!g", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat42;
		this.aFloat40 = local9 * local18 - local15 * this.aFloat49;
		@Pc(38) float local38 = this.aFloat37;
		this.aFloat41 = local9 * local21 - this.aFloat39 * local15;
		this.aFloat49 = this.aFloat49 * local9 + local18 * local15;
		this.aFloat42 = local9 * local24 - this.aFloat45 * local15;
		this.aFloat39 = local15 * local21 + local9 * this.aFloat39;
		this.aFloat37 = local38 * local9 - this.aFloat46 * local15;
		this.aFloat45 = this.aFloat45 * local9 + local15 * local24;
		this.aFloat46 = local38 * local15 + local9 * this.aFloat46;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6103() {
		@Pc(7) Class113_Sub1 local7 = new Class113_Sub1();
		local7.aFloat48 = this.aFloat48;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat37 = this.aFloat37;
		return local7;
	}

	@OriginalMember(owner = "client!g", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat40 = this.aFloat43 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat42 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat41 = this.aFloat37 = this.aFloat49 = this.aFloat45 = this.aFloat46 = this.aFloat48 = this.aFloat50 = 0.0F;
		this.aFloat38 = -this.aFloat42;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat48 * (float) arg1 + (float) arg0 * this.aFloat38 + (float) arg2 * this.aFloat43 + this.aFloat50);
		arg3[1] = (int) (this.aFloat46 + this.aFloat45 * (float) arg2 + (float) arg1 * this.aFloat39 + this.aFloat49 * (float) arg0);
		arg3[0] = (int) (this.aFloat37 + this.aFloat42 * (float) arg2 + (float) arg1 * this.aFloat41 + this.aFloat40 * (float) arg0);
	}

	@OriginalMember(owner = "client!g", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat43 = 1.0F;
		this.aFloat40 = this.aFloat39 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat49 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat42 = this.aFloat37 = this.aFloat45 = this.aFloat46 = this.aFloat38 = this.aFloat48 = this.aFloat50 = 0.0F;
		this.aFloat41 = -this.aFloat49;
	}

	@OriginalMember(owner = "client!g", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat37;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat46;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat50;
		arg0[2] = (int) (this.aFloat43 * local28 + this.aFloat42 * local12 + this.aFloat45 * local20);
		arg0[0] = (int) (local12 * this.aFloat40 + local20 * this.aFloat49 + this.aFloat38 * local28);
		arg0[1] = (int) (this.aFloat48 * local28 + this.aFloat39 * local20 + local12 * this.aFloat41);
	}

	@OriginalMember(owner = "client!g", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat40 = 1.0F;
		this.aFloat39 = this.aFloat43 = Class1_Sub1_Sub27.aFloatArray35[arg0 & 0x3FFF];
		this.aFloat48 = Class1_Sub1_Sub27.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat48;
		this.aFloat41 = this.aFloat42 = this.aFloat37 = this.aFloat49 = this.aFloat46 = this.aFloat38 = this.aFloat50 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		this.aFloat46 = local6.aFloat46;
		this.aFloat48 = local6.aFloat48;
		this.aFloat41 = local6.aFloat41;
		this.aFloat50 = local6.aFloat50;
		this.aFloat42 = local6.aFloat42;
		this.aFloat45 = local6.aFloat45;
		this.aFloat39 = local6.aFloat39;
		this.aFloat43 = local6.aFloat43;
		this.aFloat37 = local6.aFloat37;
		this.aFloat49 = local6.aFloat49;
		this.aFloat38 = local6.aFloat38;
		this.aFloat40 = local6.aFloat40;
	}

	@OriginalMember(owner = "client!g", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat49 = this.aFloat38 = this.aFloat41 = this.aFloat48 = this.aFloat42 = this.aFloat45 = 0.0F;
		this.aFloat46 = arg1;
		this.aFloat50 = arg2;
		this.aFloat37 = arg0;
		this.aFloat40 = this.aFloat39 = this.aFloat43 = 1.0F;
	}
}
