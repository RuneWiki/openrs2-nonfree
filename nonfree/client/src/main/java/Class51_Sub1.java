import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!cda", name = "p", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!cda", name = "z", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!cda", name = "B", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!cda", name = "D", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!cda", name = "I", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!cda", name = "L", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!cda", name = "M", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!cda", name = "P", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!cda", name = "Q", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
	public Class51_Sub1() {
		this.method6714();
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat38);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat44);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat36);
		arg3[0] = (int) (this.aFloat46 * (float) local24 + this.aFloat40 * (float) local6 + (float) local13 * this.aFloat39);
		arg3[2] = (int) (this.aFloat43 * (float) local6 + (float) local24 * this.aFloat37 + (float) local13 * this.aFloat42);
		arg3[1] = (int) ((float) local13 * this.aFloat45 + this.aFloat47 * (float) local24 + this.aFloat41 * (float) local6);
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)V")
	@Override
	public void method6707(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat46;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat37;
		@Pc(27) float local27 = this.aFloat36;
		this.aFloat46 = local9 * local18 - this.aFloat39 * local15;
		this.aFloat39 = local9 * this.aFloat39 + local15 * local18;
		this.aFloat47 = local9 * local21 - local15 * this.aFloat45;
		this.aFloat45 = local15 * local21 + this.aFloat45 * local9;
		this.aFloat37 = local9 * local24 - this.aFloat42 * local15;
		this.aFloat42 = local15 * local24 + this.aFloat42 * local9;
		this.aFloat36 = local9 * local27 - this.aFloat44 * local15;
		this.aFloat44 = local27 * local15 + local9 * this.aFloat44;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6704(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub1 local6 = (Class51_Sub1) arg0;
		this.aFloat45 = local6.aFloat45;
		this.aFloat42 = local6.aFloat42;
		this.aFloat47 = local6.aFloat47;
		this.aFloat38 = local6.aFloat38;
		this.aFloat44 = local6.aFloat44;
		this.aFloat43 = local6.aFloat43;
		this.aFloat37 = local6.aFloat37;
		this.aFloat41 = local6.aFloat41;
		this.aFloat40 = local6.aFloat40;
		this.aFloat36 = local6.aFloat36;
		this.aFloat39 = local6.aFloat39;
		this.aFloat46 = local6.aFloat46;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method6712() {
		@Pc(7) Class51_Sub1 local7 = new Class51_Sub1();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat40 = this.aFloat40;
		return local7;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "()V")
	@Override
	public void method6714() {
		this.aFloat40 = this.aFloat47 = this.aFloat42 = 1.0F;
		this.aFloat46 = this.aFloat39 = this.aFloat41 = this.aFloat45 = this.aFloat43 = this.aFloat37 = this.aFloat38 = this.aFloat36 = this.aFloat44 = 0.0F;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat36 = (float) arg1;
		this.aFloat46 = this.aFloat39 = this.aFloat41 = this.aFloat45 = this.aFloat43 = this.aFloat37 = 0.0F;
		this.aFloat40 = this.aFloat47 = this.aFloat42 = 1.0F;
		this.aFloat38 = (float) arg0;
		this.aFloat44 = (float) arg2;
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat37 + this.aFloat46 * (float) arg0 + this.aFloat47 * (float) arg1);
		arg3[2] = (int) (this.aFloat45 * (float) arg1 + this.aFloat39 * (float) arg0 + this.aFloat42 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat40 + this.aFloat41 * (float) arg1 + this.aFloat43 * (float) arg2);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	@Override
	public void method6703(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat43;
		@Pc(27) float local27 = this.aFloat38;
		this.aFloat40 = local9 * local18 + local15 * this.aFloat39;
		this.aFloat41 = local15 * this.aFloat45 + local9 * local21;
		this.aFloat39 = this.aFloat39 * local9 - local18 * local15;
		this.aFloat45 = local9 * this.aFloat45 - local21 * local15;
		this.aFloat43 = this.aFloat42 * local15 + local24 * local9;
		this.aFloat38 = local15 * this.aFloat44 + local27 * local9;
		this.aFloat42 = local9 * this.aFloat42 - local15 * local24;
		this.aFloat44 = local9 * this.aFloat44 - local15 * local27;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat41 + (float) arg0 * this.aFloat40 + (float) arg2 * this.aFloat43 + this.aFloat38);
		arg3[2] = (int) (this.aFloat45 * (float) arg1 + this.aFloat39 * (float) arg0 + (float) arg2 * this.aFloat42 + this.aFloat44);
		arg3[1] = (int) (this.aFloat37 * (float) arg2 + (float) arg1 * this.aFloat47 + (float) arg0 * this.aFloat46 + this.aFloat36);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class127_Sub2.aFloatArray66[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class127_Sub2.aFloatArray67[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class127_Sub2.aFloatArray66[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class127_Sub2.aFloatArray67[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat42 = local21 * local9;
		this.aFloat39 = local9 * local27;
		this.aFloat45 = -local15;
		this.aFloat46 = local39 * -local21 + local27 * local43;
		this.aFloat47 = local33 * local9;
		this.aFloat37 = local21 * local43 + local39 * local27;
		this.aFloat41 = local9 * local39;
		this.aFloat40 = local27 * local47 + local33 * local21;
		this.aFloat43 = -local27 * local33 + local47 * local21;
		this.aFloat36 = -((float) arg1 * this.aFloat47) + this.aFloat46 * (float) -arg0 - (float) arg2 * this.aFloat37;
		this.aFloat38 = (float) -arg0 * this.aFloat40 - (float) arg1 * this.aFloat41 - (float) arg2 * this.aFloat43;
		this.aFloat44 = -(this.aFloat42 * (float) arg2) - this.aFloat45 * (float) arg1 + this.aFloat39 * (float) -arg0;
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		this.aFloat40 = 1.0F;
		this.aFloat47 = this.aFloat42 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat45 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat37 = -this.aFloat45;
		this.aFloat41 = this.aFloat43 = this.aFloat38 = this.aFloat46 = this.aFloat36 = this.aFloat39 = this.aFloat44 = 0.0F;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(III)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat36 += (float) arg1;
		this.aFloat38 += (float) arg0;
		this.aFloat44 += (float) arg2;
	}

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "(I)V")
	@Override
	public void method6720(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat43;
		@Pc(27) float local27 = this.aFloat38;
		this.aFloat40 = local9 * local18 - local15 * this.aFloat46;
		this.aFloat41 = local21 * local9 - this.aFloat47 * local15;
		this.aFloat46 = local18 * local15 + this.aFloat46 * local9;
		this.aFloat47 = this.aFloat47 * local9 + local15 * local21;
		this.aFloat43 = local9 * local24 - local15 * this.aFloat37;
		this.aFloat38 = local27 * local9 - this.aFloat36 * local15;
		this.aFloat37 = local15 * local24 + local9 * this.aFloat37;
		this.aFloat36 = local9 * this.aFloat36 + local27 * local15;
	}

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)V")
	@Override
	public void method6718(@OriginalArg(0) int arg0) {
		this.aFloat42 = 1.0F;
		this.aFloat40 = this.aFloat47 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat46 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat41 = -this.aFloat46;
		this.aFloat43 = this.aFloat38 = this.aFloat37 = this.aFloat36 = this.aFloat39 = this.aFloat45 = this.aFloat44 = 0.0F;
	}

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat40 = this.aFloat42 = Class127_Sub2.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat43 = Class127_Sub2.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat39 = -this.aFloat43;
		this.aFloat41 = this.aFloat38 = this.aFloat46 = this.aFloat37 = this.aFloat36 = this.aFloat45 = this.aFloat44 = 0.0F;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "([I)V")
	@Override
	public void method6715(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat38;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat36;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat44;
		arg0[2] = (int) (this.aFloat37 * local21 + local12 * this.aFloat43 + this.aFloat42 * local30);
		arg0[0] = (int) (local30 * this.aFloat39 + this.aFloat40 * local12 + this.aFloat46 * local21);
		arg0[1] = (int) (this.aFloat45 * local30 + this.aFloat41 * local12 + this.aFloat47 * local21);
	}
}
