import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!hba", name = "u", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!hba", name = "E", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!hba", name = "M", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
	public Class118_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!hba", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat36 * (float) arg1 + this.aFloat42 * (float) arg0 + (float) arg2 * this.aFloat46);
		arg3[2] = (int) (this.aFloat35 * (float) arg2 + (float) arg0 * this.aFloat38 + this.aFloat41 * (float) arg1);
		arg3[1] = (int) ((float) arg1 * this.aFloat39 + this.aFloat45 * (float) arg0 + this.aFloat40 * (float) arg2);
	}

	@OriginalMember(owner = "client!hba", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat37;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat43;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat44;
		arg0[1] = (int) (local19 * this.aFloat39 + local11 * this.aFloat36 + local28 * this.aFloat41);
		arg0[2] = (int) (this.aFloat40 * local19 + this.aFloat46 * local11 + local28 * this.aFloat35);
		arg0[0] = (int) (this.aFloat38 * local28 + this.aFloat42 * local11 + local19 * this.aFloat45);
	}

	@OriginalMember(owner = "client!hba", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat45 = this.aFloat38 = this.aFloat36 = this.aFloat41 = this.aFloat46 = this.aFloat40 = this.aFloat37 = this.aFloat43 = this.aFloat44 = 0.0F;
		this.aFloat42 = this.aFloat39 = this.aFloat35 = 1.0F;
	}

	@OriginalMember(owner = "client!hba", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class118 arg0) {
		@Pc(6) Class118_Sub1 local6 = (Class118_Sub1) arg0;
		this.aFloat43 = local6.aFloat43;
		this.aFloat45 = local6.aFloat45;
		this.aFloat38 = local6.aFloat38;
		this.aFloat35 = local6.aFloat35;
		this.aFloat37 = local6.aFloat37;
		this.aFloat46 = local6.aFloat46;
		this.aFloat39 = local6.aFloat39;
		this.aFloat40 = local6.aFloat40;
		this.aFloat36 = local6.aFloat36;
		this.aFloat44 = local6.aFloat44;
		this.aFloat41 = local6.aFloat41;
		this.aFloat42 = local6.aFloat42;
	}

	@OriginalMember(owner = "client!hba", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat44 += arg2;
		this.aFloat43 += arg1;
		this.aFloat37 += arg0;
	}

	@OriginalMember(owner = "client!hba", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub37.aFloatArray59[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub37.aFloatArray58[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat42;
		@Pc(21) float local21 = this.aFloat36;
		@Pc(24) float local24 = this.aFloat46;
		@Pc(27) float local27 = this.aFloat37;
		this.aFloat42 = local15 * this.aFloat38 + local9 * local18;
		this.aFloat36 = local15 * this.aFloat41 + local21 * local9;
		this.aFloat38 = local9 * this.aFloat38 - local18 * local15;
		this.aFloat46 = this.aFloat35 * local15 + local24 * local9;
		this.aFloat41 = local9 * this.aFloat41 - local15 * local21;
		this.aFloat35 = this.aFloat35 * local9 - local24 * local15;
		this.aFloat37 = local15 * this.aFloat44 + local27 * local9;
		this.aFloat44 = this.aFloat44 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class118 method6964() {
		@Pc(7) Class118_Sub1 local7 = new Class118_Sub1();
		local7.aFloat38 = this.aFloat38;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat35 = this.aFloat35;
		local7.aFloat46 = this.aFloat46;
		return local7;
	}

	@OriginalMember(owner = "client!hba", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat35 = 1.0F;
		this.aFloat42 = this.aFloat39 = Class1_Sub3_Sub37.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat45 = Class1_Sub3_Sub37.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat46 = this.aFloat37 = this.aFloat40 = this.aFloat43 = this.aFloat38 = this.aFloat41 = this.aFloat44 = 0.0F;
		this.aFloat36 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!hba", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat42 = this.aFloat35 = Class1_Sub3_Sub37.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat46 = Class1_Sub3_Sub37.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat38 = -this.aFloat46;
		this.aFloat36 = this.aFloat37 = this.aFloat45 = this.aFloat40 = this.aFloat43 = this.aFloat41 = this.aFloat44 = 0.0F;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IFIIFBF)V")
	public void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat42 = arg2;
			this.aFloat35 = 1.0F;
			this.aFloat39 = arg0;
			this.aFloat45 = this.aFloat38 = this.aFloat36 = this.aFloat41 = this.aFloat46 = this.aFloat40 = 0.0F;
		} else {
			@Pc(26) float local26 = Class1_Sub3_Sub37.aFloatArray59[arg3 & 0x3FFF];
			@Pc(32) float local32 = Class1_Sub3_Sub37.aFloatArray58[arg3 & 0x3FFF];
			this.aFloat39 = local26 * (float) arg0;
			this.aFloat45 = (float) arg2 * local32;
			this.aFloat38 = this.aFloat41 = this.aFloat46 = this.aFloat40 = 0.0F;
			this.aFloat36 = -local32 * (float) arg0;
			this.aFloat42 = local26 * (float) arg2;
			this.aFloat35 = 1.0F;
		}
		this.aFloat43 = arg5;
		this.aFloat44 = arg4;
		this.aFloat37 = arg1;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat41 * (float) arg1 + this.aFloat38 * (float) arg0 + (float) arg2 * this.aFloat35 + this.aFloat44);
		arg3[1] = (int) (this.aFloat43 + (float) arg0 * this.aFloat45 + this.aFloat39 * (float) arg1 + this.aFloat40 * (float) arg2);
		arg3[0] = (int) (this.aFloat42 * (float) arg0 + (float) arg1 * this.aFloat36 + (float) arg2 * this.aFloat46 + this.aFloat37);
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)[F")
	public float[] method2637() {
		Static434.aFloatArray56[8] = this.aFloat46;
		Static434.aFloatArray56[1] = this.aFloat45;
		Static434.aFloatArray56[5] = this.aFloat39;
		Static434.aFloatArray56[2] = this.aFloat38;
		Static434.aFloatArray56[10] = this.aFloat35;
		Static434.aFloatArray56[14] = this.aFloat44;
		Static434.aFloatArray56[13] = this.aFloat43;
		Static434.aFloatArray56[0] = this.aFloat42;
		Static434.aFloatArray56[12] = this.aFloat37;
		Static434.aFloatArray56[9] = this.aFloat40;
		Static434.aFloatArray56[6] = this.aFloat41;
		Static434.aFloatArray56[4] = this.aFloat36;
		return Static434.aFloatArray56;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLclient!m;)V")
	public void method2638(@OriginalArg(1) Class118 arg0) {
		@Pc(14) Class118_Sub1 local14 = (Class118_Sub1) arg0;
		this.aFloat36 = local14.aFloat45;
		this.aFloat46 = local14.aFloat38;
		this.aFloat42 = local14.aFloat42;
		this.aFloat40 = local14.aFloat41;
		this.aFloat45 = local14.aFloat36;
		this.aFloat39 = local14.aFloat39;
		this.aFloat38 = local14.aFloat46;
		this.aFloat37 = -(local14.aFloat43 * this.aFloat36 + this.aFloat42 * local14.aFloat37 + local14.aFloat44 * this.aFloat46);
		this.aFloat35 = local14.aFloat35;
		this.aFloat41 = local14.aFloat40;
		this.aFloat43 = -(local14.aFloat44 * this.aFloat40 + local14.aFloat43 * this.aFloat39 + local14.aFloat37 * this.aFloat45);
		this.aFloat44 = -(this.aFloat38 * local14.aFloat37 + this.aFloat41 * local14.aFloat43 + this.aFloat35 * local14.aFloat44);
	}

	@OriginalMember(owner = "client!hba", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat42 = 1.0F;
		this.aFloat39 = this.aFloat35 = Class1_Sub3_Sub37.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat41 = Class1_Sub3_Sub37.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat36 = this.aFloat46 = this.aFloat37 = this.aFloat45 = this.aFloat43 = this.aFloat38 = this.aFloat44 = 0.0F;
		this.aFloat40 = -this.aFloat41;
	}

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub37.aFloatArray59[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub37.aFloatArray58[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat45;
		@Pc(21) float local21 = this.aFloat39;
		@Pc(24) float local24 = this.aFloat40;
		this.aFloat45 = local9 * local18 - this.aFloat38 * local15;
		@Pc(37) float local37 = this.aFloat43;
		this.aFloat38 = local9 * this.aFloat38 + local15 * local18;
		this.aFloat39 = local21 * local9 - local15 * this.aFloat41;
		this.aFloat41 = local21 * local15 + local9 * this.aFloat41;
		this.aFloat40 = local9 * local24 - local15 * this.aFloat35;
		this.aFloat43 = local9 * local37 - this.aFloat44 * local15;
		this.aFloat35 = this.aFloat35 * local9 + local15 * local24;
		this.aFloat44 = this.aFloat44 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)[F")
	public float[] method2639() {
		Static434.aFloatArray56[4] = this.aFloat36;
		Static434.aFloatArray56[8] = this.aFloat46;
		Static434.aFloatArray56[1] = this.aFloat45;
		Static434.aFloatArray56[2] = this.aFloat38;
		Static434.aFloatArray56[5] = this.aFloat39;
		Static434.aFloatArray56[0] = this.aFloat42;
		Static434.aFloatArray56[13] = 0.0F;
		Static434.aFloatArray56[14] = 0.0F;
		Static434.aFloatArray56[10] = this.aFloat35;
		Static434.aFloatArray56[9] = this.aFloat40;
		Static434.aFloatArray56[12] = 0.0F;
		Static434.aFloatArray56[6] = this.aFloat41;
		return Static434.aFloatArray56;
	}

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub3_Sub37.aFloatArray59[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub37.aFloatArray58[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub3_Sub37.aFloatArray59[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub3_Sub37.aFloatArray58[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub3_Sub37.aFloatArray59[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub3_Sub37.aFloatArray58[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat40 = local21 * local43 + local27 * local39;
		this.aFloat35 = local21 * local9;
		this.aFloat38 = local9 * local27;
		this.aFloat45 = local43 * local27 + local39 * -local21;
		this.aFloat41 = -local15;
		this.aFloat36 = local9 * local39;
		this.aFloat46 = local47 * local21 + local33 * -local27;
		this.aFloat42 = local21 * local33 + local47 * local27;
		this.aFloat39 = local33 * local9;
		this.aFloat44 = -((float) arg2 * this.aFloat35) + (float) -arg0 * this.aFloat38 - this.aFloat41 * (float) arg1;
		this.aFloat43 = this.aFloat45 * (float) -arg0 - (float) arg1 * this.aFloat39 - (float) arg2 * this.aFloat40;
		this.aFloat37 = -(this.aFloat46 * (float) arg2) + (float) -arg0 * this.aFloat42 - (float) arg1 * this.aFloat36;
	}

	@OriginalMember(owner = "client!hba", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat45 = this.aFloat38 = this.aFloat36 = this.aFloat41 = this.aFloat46 = this.aFloat40 = 0.0F;
		this.aFloat42 = this.aFloat39 = this.aFloat35 = 1.0F;
		this.aFloat37 = arg0;
		this.aFloat43 = arg1;
		this.aFloat44 = arg2;
	}
}
