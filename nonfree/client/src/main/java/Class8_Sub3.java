import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class8_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!dd", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat45;
		@Pc(21) float local21 = this.aFloat46;
		@Pc(24) float local24 = this.aFloat41;
		this.aFloat45 = this.aFloat38 * local15 + local9 * local18;
		@Pc(37) float local37 = this.aFloat40;
		this.aFloat38 = local9 * this.aFloat38 - local15 * local18;
		this.aFloat46 = local15 * this.aFloat43 + local9 * local21;
		this.aFloat43 = this.aFloat43 * local9 - local15 * local21;
		this.aFloat41 = local9 * local24 + local15 * this.aFloat39;
		this.aFloat39 = local9 * this.aFloat39 - local15 * local24;
		this.aFloat40 = local37 * local9 + this.aFloat42 * local15;
		this.aFloat42 = local9 * this.aFloat42 - local37 * local15;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([FI)[F")
	public float[] method1561(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat40;
		arg0[7] = this.aFloat47;
		arg0[4] = this.aFloat44;
		arg0[2] = this.aFloat41;
		arg0[5] = this.aFloat37;
		arg0[0] = this.aFloat45;
		arg0[1] = this.aFloat46;
		arg0[6] = this.aFloat48;
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class271.aFloatArray54[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class271.aFloatArray55[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class271.aFloatArray54[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class271.aFloatArray55[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat44 = local43 * local27 + local39 * -local21;
		this.aFloat37 = local9 * local33;
		this.aFloat39 = local9 * local21;
		this.aFloat38 = local9 * local27;
		this.aFloat41 = local33 * -local27 + local47 * local21;
		this.aFloat46 = local39 * local9;
		this.aFloat43 = -local15;
		this.aFloat45 = local27 * local47 + local21 * local33;
		this.aFloat48 = local43 * local21 + local27 * local39;
		this.aFloat40 = -((float) arg1 * this.aFloat46) + (float) -arg0 * this.aFloat45 - (float) arg2 * this.aFloat41;
		this.aFloat42 = -(this.aFloat39 * (float) arg2) + this.aFloat38 * (float) -arg0 - this.aFloat43 * (float) arg1;
		this.aFloat47 = -(this.aFloat37 * (float) arg1) + (float) -arg0 * this.aFloat44 - this.aFloat48 * (float) arg2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public void method1563() {
		this.aFloat47 = -this.aFloat47;
		this.aFloat48 = -this.aFloat48;
		this.aFloat37 = -this.aFloat37;
		this.aFloat39 = -this.aFloat39;
		this.aFloat38 = -this.aFloat38;
		this.aFloat43 = -this.aFloat43;
		this.aFloat42 = -this.aFloat42;
		this.aFloat44 = -this.aFloat44;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BFFF)V")
	public void method1564(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat43 = 0.0F;
		this.aFloat39 = arg1;
		this.aFloat46 = 0.0F;
		this.aFloat45 = arg2;
		this.aFloat47 = 0.0F;
		this.aFloat48 = 0.0F;
		this.aFloat42 = 0.0F;
		this.aFloat38 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat44 = 0.0F;
		this.aFloat40 = 0.0F;
		this.aFloat37 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method1565(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		@Pc(9) Class8_Sub3 local9 = (Class8_Sub3) arg1;
		this.aFloat45 = local9.aFloat38 * local6.aFloat41 + local9.aFloat45 * local6.aFloat45 + local6.aFloat46 * local9.aFloat44;
		this.aFloat44 = local9.aFloat45 * local6.aFloat44 + local9.aFloat44 * local6.aFloat37 + local9.aFloat38 * local6.aFloat48;
		this.aFloat38 = local9.aFloat44 * local6.aFloat43 + local9.aFloat45 * local6.aFloat38 + local6.aFloat39 * local9.aFloat38;
		this.aFloat46 = local6.aFloat46 * local9.aFloat37 + local6.aFloat45 * local9.aFloat46 + local6.aFloat41 * local9.aFloat43;
		this.aFloat37 = local9.aFloat37 * local6.aFloat37 + local6.aFloat44 * local9.aFloat46 + local6.aFloat48 * local9.aFloat43;
		this.aFloat41 = local9.aFloat39 * local6.aFloat41 + local6.aFloat46 * local9.aFloat48 + local9.aFloat41 * local6.aFloat45;
		this.aFloat43 = local9.aFloat37 * local6.aFloat43 + local9.aFloat46 * local6.aFloat38 + local9.aFloat43 * local6.aFloat39;
		this.aFloat48 = local9.aFloat39 * local6.aFloat48 + local9.aFloat41 * local6.aFloat44 + local6.aFloat37 * local9.aFloat48;
		this.aFloat40 = local9.aFloat42 * local6.aFloat41 + local9.aFloat47 * local6.aFloat46 + local6.aFloat45 * local9.aFloat40 + local6.aFloat40;
		this.aFloat39 = local6.aFloat39 * local9.aFloat39 + local9.aFloat48 * local6.aFloat43 + local9.aFloat41 * local6.aFloat38;
		this.aFloat47 = local6.aFloat47 + local9.aFloat42 * local6.aFloat48 + local6.aFloat37 * local9.aFloat47 + local9.aFloat40 * local6.aFloat44;
		this.aFloat42 = local6.aFloat38 * local9.aFloat40 + local6.aFloat43 * local9.aFloat47 + local6.aFloat39 * local9.aFloat42 + local6.aFloat42;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFBF)V")
	public void method1566(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat42 = arg1;
		this.aFloat44 = this.aFloat38 = this.aFloat46 = this.aFloat43 = this.aFloat41 = this.aFloat48 = 0.0F;
		this.aFloat47 = arg2;
		this.aFloat45 = this.aFloat37 = this.aFloat39 = 1.0F;
		this.aFloat40 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z[F)[F")
	public float[] method1567(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat46;
		arg0[6] = 0.0F;
		arg0[11] = 0.0F;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat42;
		arg0[2] = 0.0F;
		arg0[0] = this.aFloat45;
		arg0[5] = this.aFloat37;
		arg0[8] = this.aFloat40;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[14] = 0.0F;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat47;
		arg0[1] = this.aFloat44;
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat42 += arg2;
		this.aFloat47 += arg1;
		this.aFloat40 += arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFI[FFF)V")
	public void method1568(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[0] = this.aFloat45 * arg4 + arg1 * this.aFloat46 + arg0 * this.aFloat41;
		@Pc(67) float local67;
		@Pc(51) float local51;
		@Pc(59) float local59;
		@Pc(43) float local43;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local43 = -arg3 / arg4;
			local51 = this.aFloat47 + local43 * this.aFloat44;
			local67 = this.aFloat40 + local43 * this.aFloat45;
			local59 = this.aFloat38 * local43 + this.aFloat42;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local43 = -arg3 / arg1;
			local51 = local43 * this.aFloat37 + this.aFloat47;
			local59 = this.aFloat43 * local43 + this.aFloat42;
			local67 = this.aFloat40 + local43 * this.aFloat46;
		} else {
			local43 = -arg3 / arg0;
			local67 = this.aFloat40 + local43 * this.aFloat41;
			local51 = this.aFloat47 + local43 * this.aFloat48;
			local59 = local43 * this.aFloat39 + this.aFloat42;
		}
		arg2[1] = this.aFloat48 * arg0 + this.aFloat44 * arg4 + arg1 * this.aFloat37;
		arg2[2] = this.aFloat39 * arg0 + arg1 * this.aFloat43 + arg4 * this.aFloat38;
		arg2[3] = -(arg2[1] * local51 + arg2[0] * local67 + arg2[2] * local59);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!q;B)V")
	public void method1569(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat45;
		@Pc(12) float local12 = this.aFloat44;
		@Pc(15) float local15 = this.aFloat46;
		@Pc(18) float local18 = this.aFloat37;
		@Pc(21) float local21 = this.aFloat41;
		@Pc(24) float local24 = this.aFloat48;
		@Pc(27) float local27 = this.aFloat40;
		@Pc(30) float local30 = this.aFloat47;
		this.aFloat45 = local6.aFloat41 * this.aFloat38 + local6.aFloat45 * local9 + local12 * local6.aFloat46;
		this.aFloat44 = this.aFloat38 * local6.aFloat48 + local9 * local6.aFloat44 + local6.aFloat37 * local12;
		this.aFloat38 = local6.aFloat43 * local12 + local6.aFloat38 * local9 + this.aFloat38 * local6.aFloat39;
		this.aFloat46 = local18 * local6.aFloat46 + local15 * local6.aFloat45 + local6.aFloat41 * this.aFloat43;
		this.aFloat37 = local6.aFloat44 * local15 + local6.aFloat37 * local18 + this.aFloat43 * local6.aFloat48;
		this.aFloat43 = this.aFloat43 * local6.aFloat39 + local18 * local6.aFloat43 + local6.aFloat38 * local15;
		this.aFloat48 = local24 * local6.aFloat37 + local21 * local6.aFloat44 + local6.aFloat48 * this.aFloat39;
		this.aFloat41 = this.aFloat39 * local6.aFloat41 + local6.aFloat46 * local24 + local21 * local6.aFloat45;
		this.aFloat40 = local6.aFloat40 + local6.aFloat46 * local30 + local6.aFloat45 * local27 + local6.aFloat41 * this.aFloat42;
		this.aFloat47 = local6.aFloat47 + local6.aFloat48 * this.aFloat42 + local30 * local6.aFloat37 + local6.aFloat44 * local27;
		this.aFloat39 = local6.aFloat39 * this.aFloat39 + local6.aFloat38 * local21 + local24 * local6.aFloat43;
		this.aFloat42 = local6.aFloat42 + local27 * local6.aFloat38 + local30 * local6.aFloat43 + this.aFloat42 * local6.aFloat39;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZFFF)F")
	public float method1570(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * this.aFloat39 + this.aFloat43 * arg2 + this.aFloat38 * arg1 + this.aFloat42;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFFFFFIFFF)V")
	public void method1571(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat39 = arg5;
		this.aFloat45 = arg6;
		this.aFloat44 = arg3;
		this.aFloat48 = arg0;
		this.aFloat46 = arg8;
		this.aFloat38 = arg1;
		this.aFloat41 = arg7;
		this.aFloat47 = 0.0F;
		this.aFloat40 = 0.0F;
		this.aFloat43 = arg2;
		this.aFloat42 = 0.0F;
		this.aFloat37 = arg4;
	}

	@OriginalMember(owner = "client!dd", name = "DA", descriptor = "(III[I)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat40);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat47);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat42);
		arg3[0] = (int) (this.aFloat38 * (float) local24 + this.aFloat44 * (float) local17 + (float) local6 * this.aFloat45);
		arg3[2] = (int) ((float) local17 * this.aFloat48 + (float) local6 * this.aFloat41 + (float) local24 * this.aFloat39);
		arg3[1] = (int) (this.aFloat43 * (float) local24 + (float) local6 * this.aFloat46 + this.aFloat37 * (float) local17);
	}

	@OriginalMember(owner = "client!dd", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat45;
		@Pc(21) float local21 = this.aFloat46;
		@Pc(24) float local24 = this.aFloat41;
		@Pc(27) float local27 = this.aFloat40;
		this.aFloat45 = local9 * local18 - this.aFloat44 * local15;
		this.aFloat46 = local21 * local9 - local15 * this.aFloat37;
		this.aFloat44 = local9 * this.aFloat44 + local15 * local18;
		this.aFloat37 = local21 * local15 + local9 * this.aFloat37;
		this.aFloat41 = local24 * local9 - this.aFloat48 * local15;
		this.aFloat40 = local9 * local27 - this.aFloat47 * local15;
		this.aFloat48 = this.aFloat48 * local9 + local24 * local15;
		this.aFloat47 = local15 * local27 + this.aFloat47 * local9;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(FFBF)F")
	public float method1572(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat48 * arg1 + this.aFloat44 * arg0 + arg2 * this.aFloat37 + this.aFloat47;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[F)[F")
	public float[] method1573(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat44;
		arg0[3] = this.aFloat40;
		arg0[0] = this.aFloat45;
		arg0[7] = this.aFloat47;
		arg0[12] = 0.0F;
		arg0[15] = 1.0F;
		arg0[6] = this.aFloat48;
		arg0[11] = this.aFloat42;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat39;
		arg0[2] = this.aFloat41;
		arg0[9] = this.aFloat43;
		arg0[8] = this.aFloat38;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat37;
		arg0[1] = this.aFloat46;
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat37 + this.aFloat44 * (float) arg0 + this.aFloat48 * (float) arg2 + this.aFloat47);
		arg3[2] = (int) (this.aFloat42 + (float) arg2 * this.aFloat39 + this.aFloat43 * (float) arg1 + this.aFloat38 * (float) arg0);
		arg3[0] = (int) (this.aFloat40 + (float) arg2 * this.aFloat41 + (float) arg1 * this.aFloat46 + this.aFloat45 * (float) arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IFF[FF)V")
	public void method1574(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[2] = this.aFloat39 * arg0 + this.aFloat38 * arg3 + arg1 * this.aFloat43;
		arg2[0] = this.aFloat46 * arg1 + arg3 * this.aFloat45 + arg0 * this.aFloat41;
		arg2[1] = arg3 * this.aFloat44 + this.aFloat37 * arg1 + this.aFloat48 * arg0;
	}

	@OriginalMember(owner = "client!dd", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat45 = 1.0F;
		this.aFloat37 = this.aFloat39 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat43 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat46 = this.aFloat41 = this.aFloat40 = this.aFloat44 = this.aFloat47 = this.aFloat38 = this.aFloat42 = 0.0F;
		this.aFloat48 = -this.aFloat43;
	}

	@OriginalMember(owner = "client!dd", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat45 = this.aFloat37 = this.aFloat39 = 1.0F;
		this.aFloat47 = arg1;
		this.aFloat40 = arg0;
		this.aFloat42 = arg2;
		this.aFloat44 = this.aFloat38 = this.aFloat46 = this.aFloat43 = this.aFloat41 = this.aFloat48 = 0.0F;
	}

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat37 = 1.0F;
		this.aFloat45 = this.aFloat39 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat41 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat38 = -this.aFloat41;
		this.aFloat46 = this.aFloat40 = this.aFloat44 = this.aFloat48 = this.aFloat47 = this.aFloat43 = this.aFloat42 = 0.0F;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(BFFF)V")
	public void method1576(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat40 += arg1;
		this.aFloat47 += arg2;
		this.aFloat42 += arg0;
	}

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat45 = this.aFloat37 = this.aFloat39 = 1.0F;
		this.aFloat44 = this.aFloat38 = this.aFloat46 = this.aFloat43 = this.aFloat41 = this.aFloat48 = this.aFloat40 = this.aFloat47 = this.aFloat42 = 0.0F;
	}

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat43 = local6.aFloat43;
		this.aFloat46 = local6.aFloat46;
		this.aFloat38 = local6.aFloat38;
		this.aFloat44 = local6.aFloat44;
		this.aFloat47 = local6.aFloat47;
		this.aFloat40 = local6.aFloat40;
		this.aFloat48 = local6.aFloat48;
		this.aFloat45 = local6.aFloat45;
		this.aFloat37 = local6.aFloat37;
		this.aFloat39 = local6.aFloat39;
		this.aFloat41 = local6.aFloat41;
		this.aFloat42 = local6.aFloat42;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!q;I)V")
	public void method1577(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat41 = local6.aFloat38;
		this.aFloat46 = local6.aFloat44;
		this.aFloat45 = local6.aFloat45;
		this.aFloat38 = local6.aFloat41;
		this.aFloat37 = local6.aFloat37;
		this.aFloat44 = local6.aFloat46;
		this.aFloat48 = local6.aFloat43;
		this.aFloat40 = -(this.aFloat41 * local6.aFloat42 + local6.aFloat47 * this.aFloat46 + this.aFloat45 * local6.aFloat40);
		this.aFloat39 = local6.aFloat39;
		this.aFloat43 = local6.aFloat48;
		this.aFloat47 = -(this.aFloat37 * local6.aFloat47 + this.aFloat44 * local6.aFloat40 + local6.aFloat42 * this.aFloat48);
		this.aFloat42 = -(local6.aFloat42 * this.aFloat39 + local6.aFloat40 * this.aFloat38 + local6.aFloat47 * this.aFloat43);
	}

	@OriginalMember(owner = "client!dd", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat46 * (float) arg1 + (float) arg0 * this.aFloat45 + this.aFloat41 * (float) arg2);
		arg3[2] = (int) ((float) arg0 * this.aFloat38 + (float) arg1 * this.aFloat43 + this.aFloat39 * (float) arg2);
		arg3[1] = (int) (this.aFloat37 * (float) arg1 + this.aFloat44 * (float) arg0 + this.aFloat48 * (float) arg2);
	}

	@OriginalMember(owner = "client!dd", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat40;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat47;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat42;
		arg0[0] = (int) (local28 * this.aFloat38 + local20 * this.aFloat44 + this.aFloat45 * local11);
		arg0[2] = (int) (local28 * this.aFloat39 + this.aFloat41 * local11 + this.aFloat48 * local20);
		arg0[1] = (int) (this.aFloat43 * local28 + local20 * this.aFloat37 + local11 * this.aFloat46);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z[F)[F")
	public float[] method1578(@OriginalArg(1) float[] arg0) {
		arg0[9] = this.aFloat43;
		arg0[6] = this.aFloat48;
		arg0[1] = this.aFloat46;
		arg0[7] = 0.0F;
		arg0[4] = this.aFloat44;
		arg0[3] = 0.0F;
		arg0[15] = 0.0F;
		arg0[13] = 0.0F;
		arg0[2] = this.aFloat41;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat38;
		arg0[0] = this.aFloat45;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat39;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat37;
		return arg0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lclient!q;B)V")
	public void method1579(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) arg0;
		this.aFloat42 = 0.0F;
		this.aFloat48 = local6.aFloat48;
		this.aFloat46 = local6.aFloat46;
		this.aFloat41 = local6.aFloat41;
		this.aFloat40 = 0.0F;
		this.aFloat45 = local6.aFloat45;
		this.aFloat37 = local6.aFloat37;
		this.aFloat47 = 0.0F;
		this.aFloat44 = local6.aFloat44;
		this.aFloat43 = local6.aFloat43;
		this.aFloat38 = local6.aFloat38;
		this.aFloat39 = local6.aFloat39;
	}

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat45 = this.aFloat37 = Class271.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat44 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat46 = -this.aFloat44;
		this.aFloat41 = this.aFloat40 = this.aFloat48 = this.aFloat47 = this.aFloat38 = this.aFloat43 = this.aFloat42 = 0.0F;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IFBFIFI)V")
	public void method1581(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat39 = 1.0F;
			this.aFloat44 = this.aFloat38 = this.aFloat46 = this.aFloat43 = this.aFloat41 = this.aFloat48 = 0.0F;
			this.aFloat37 = arg5 * 2;
			this.aFloat47 = arg1 - (float) arg5;
			this.aFloat42 = arg2;
			this.aFloat45 = arg3 * 2;
			this.aFloat40 = (float) -arg3 + arg4;
			return;
		}
		@Pc(61) float local61 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(67) float local67 = Class271.aFloatArray55[arg0 & 0x3FFF];
		this.aFloat42 = arg2;
		this.aFloat47 = arg1 + (float) (arg5 * 2) * (-0.5F * local67 - local61 * 0.5F);
		this.aFloat37 = (float) arg5 * local61 * 2.0F;
		this.aFloat44 = local67 * 2.0F * (float) arg3;
		this.aFloat39 = 1.0F;
		this.aFloat40 = (local67 * 0.5F - local61 * 0.5F) * (float) (arg3 * 2) + arg4;
		this.aFloat38 = this.aFloat43 = this.aFloat41 = this.aFloat48 = 0.0F;
		this.aFloat46 = (float) arg5 * -2.0F * local67;
		this.aFloat45 = (float) arg3 * local61 * 2.0F;
	}

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class271.aFloatArray54[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class271.aFloatArray55[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat44;
		@Pc(21) float local21 = this.aFloat37;
		@Pc(24) float local24 = this.aFloat48;
		this.aFloat44 = local9 * local18 - this.aFloat38 * local15;
		@Pc(37) float local37 = this.aFloat47;
		this.aFloat37 = local9 * local21 - local15 * this.aFloat43;
		this.aFloat38 = this.aFloat38 * local9 + local18 * local15;
		this.aFloat43 = local15 * local21 + this.aFloat43 * local9;
		this.aFloat48 = local9 * local24 - this.aFloat39 * local15;
		this.aFloat47 = local9 * local37 - local15 * this.aFloat42;
		this.aFloat39 = local15 * local24 + this.aFloat39 * local9;
		this.aFloat42 = local37 * local15 + this.aFloat42 * local9;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FBFF)V")
	public void method1582(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat46 *= arg1;
		this.aFloat39 *= arg0;
		this.aFloat47 *= arg2;
		this.aFloat48 *= arg2;
		this.aFloat37 *= arg2;
		this.aFloat41 *= arg1;
		this.aFloat42 *= arg0;
		this.aFloat44 *= arg2;
		this.aFloat43 *= arg0;
		this.aFloat38 *= arg0;
		this.aFloat40 *= arg1;
		this.aFloat45 *= arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFFB)F")
	public float method1583(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat40 + this.aFloat45 * arg2 + this.aFloat46 * arg0 + this.aFloat41 * arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method6812() {
		@Pc(7) Class8_Sub3 local7 = new Class8_Sub3();
		local7.aFloat39 = this.aFloat39;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat47 = this.aFloat47;
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I[F)[F")
	public float[] method1584(@OriginalArg(1) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat46;
		arg0[13] = this.aFloat47;
		arg0[8] = this.aFloat41;
		arg0[10] = this.aFloat39;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat44;
		arg0[5] = this.aFloat37;
		arg0[12] = this.aFloat40;
		arg0[9] = this.aFloat48;
		arg0[2] = this.aFloat38;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat45;
		arg0[15] = 1.0F;
		arg0[6] = this.aFloat43;
		arg0[14] = this.aFloat42;
		return arg0;
	}
}
