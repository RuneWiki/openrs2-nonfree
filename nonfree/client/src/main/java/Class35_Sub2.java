import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!km", name = "J", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class35_Sub2() {
		this.xa();
	}

	@OriginalMember(owner = "client!km", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat43 = arg1;
		this.aFloat42 = this.aFloat34 = this.aFloat33 = 1.0F;
		this.aFloat40 = this.aFloat41 = this.aFloat37 = this.aFloat39 = this.aFloat32 = this.aFloat36 = 0.0F;
		this.aFloat38 = arg0;
		this.aFloat35 = arg2;
	}

	@OriginalMember(owner = "client!km", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat42;
		@Pc(21) float local21 = this.aFloat37;
		@Pc(24) float local24 = this.aFloat32;
		@Pc(27) float local27 = this.aFloat38;
		this.aFloat42 = local18 * local9 + this.aFloat41 * local15;
		this.aFloat37 = local15 * this.aFloat39 + local21 * local9;
		this.aFloat41 = this.aFloat41 * local9 - local15 * local18;
		this.aFloat32 = local15 * this.aFloat33 + local24 * local9;
		this.aFloat39 = this.aFloat39 * local9 - local15 * local21;
		this.aFloat38 = this.aFloat35 * local15 + local27 * local9;
		this.aFloat33 = this.aFloat33 * local9 - local15 * local24;
		this.aFloat35 = this.aFloat35 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[F")
	public float[] method2901() {
		Static263.aFloatArray13[12] = 0.0F;
		Static263.aFloatArray13[2] = this.aFloat41;
		Static263.aFloatArray13[10] = this.aFloat33;
		Static263.aFloatArray13[4] = this.aFloat37;
		Static263.aFloatArray13[6] = this.aFloat39;
		Static263.aFloatArray13[8] = this.aFloat32;
		Static263.aFloatArray13[13] = 0.0F;
		Static263.aFloatArray13[5] = this.aFloat34;
		Static263.aFloatArray13[1] = this.aFloat40;
		Static263.aFloatArray13[9] = this.aFloat36;
		Static263.aFloatArray13[0] = this.aFloat42;
		Static263.aFloatArray13[14] = 0.0F;
		return Static263.aFloatArray13;
	}

	@OriginalMember(owner = "client!km", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat38 += arg0;
		this.aFloat35 += arg2;
		this.aFloat43 += arg1;
	}

	@OriginalMember(owner = "client!km", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aFloat42 = this.aFloat34 = this.aFloat33 = 1.0F;
		this.aFloat40 = this.aFloat41 = this.aFloat37 = this.aFloat39 = this.aFloat32 = this.aFloat36 = this.aFloat38 = this.aFloat43 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat41 = local9 * local27;
		this.aFloat40 = local39 * -local21 + local43 * local27;
		this.aFloat42 = local27 * local47 + local21 * local33;
		this.aFloat33 = local9 * local21;
		this.aFloat36 = local21 * local43 + local39 * local27;
		this.aFloat32 = -local27 * local33 + local21 * local47;
		this.aFloat34 = local33 * local9;
		this.aFloat37 = local39 * local9;
		this.aFloat39 = -local15;
		this.aFloat38 = -((float) arg2 * this.aFloat32) + this.aFloat42 * (float) -arg0 - this.aFloat37 * (float) arg1;
		this.aFloat43 = -(this.aFloat36 * (float) arg2) + this.aFloat40 * (float) -arg0 - this.aFloat34 * (float) arg1;
		this.aFloat35 = -((float) arg1 * this.aFloat39) + (float) -arg0 * this.aFloat41 - (float) arg2 * this.aFloat33;
	}

	@OriginalMember(owner = "client!km", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat38;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat43;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat35;
		arg0[1] = (int) (this.aFloat34 * local20 + this.aFloat37 * local11 + this.aFloat39 * local28);
		arg0[2] = (int) (this.aFloat36 * local20 + this.aFloat32 * local11 + this.aFloat33 * local28);
		arg0[0] = (int) (local28 * this.aFloat41 + local11 * this.aFloat42 + this.aFloat40 * local20);
	}

	@OriginalMember(owner = "client!km", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat34;
		@Pc(24) float local24 = this.aFloat36;
		this.aFloat40 = local9 * local18 - local15 * this.aFloat41;
		@Pc(38) float local38 = this.aFloat43;
		this.aFloat41 = local15 * local18 + local9 * this.aFloat41;
		this.aFloat34 = local21 * local9 - local15 * this.aFloat39;
		this.aFloat36 = local24 * local9 - this.aFloat33 * local15;
		this.aFloat39 = local21 * local15 + local9 * this.aFloat39;
		this.aFloat43 = local38 * local9 - this.aFloat35 * local15;
		this.aFloat33 = local24 * local15 + local9 * this.aFloat33;
		this.aFloat35 = local38 * local15 + this.aFloat35 * local9;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BIIFIFF)V")
	public void method2902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat33 = 1.0F;
			this.aFloat40 = this.aFloat41 = this.aFloat37 = this.aFloat39 = this.aFloat32 = this.aFloat36 = 0.0F;
			this.aFloat42 = arg1;
			this.aFloat34 = arg3;
		} else {
			@Pc(49) float local49 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
			@Pc(55) float local55 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
			this.aFloat34 = local49 * (float) arg3;
			this.aFloat42 = (float) arg1 * local49;
			this.aFloat41 = this.aFloat39 = this.aFloat32 = this.aFloat36 = 0.0F;
			this.aFloat40 = (float) arg1 * local55;
			this.aFloat33 = 1.0F;
			this.aFloat37 = (float) arg3 * -local55;
		}
		this.aFloat43 = arg4;
		this.aFloat38 = arg5;
		this.aFloat35 = arg2;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat43 + (float) arg0 * this.aFloat40 + (float) arg1 * this.aFloat34 + (float) arg2 * this.aFloat36);
		arg3[2] = (int) (this.aFloat41 * (float) arg0 + this.aFloat39 * (float) arg1 + (float) arg2 * this.aFloat33 + this.aFloat35);
		arg3[0] = (int) (this.aFloat32 * (float) arg2 + (float) arg0 * this.aFloat42 + (float) arg1 * this.aFloat37 + this.aFloat38);
	}

	@OriginalMember(owner = "client!km", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class35 arg0) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg0;
		this.aFloat40 = local6.aFloat40;
		this.aFloat37 = local6.aFloat37;
		this.aFloat43 = local6.aFloat43;
		this.aFloat33 = local6.aFloat33;
		this.aFloat38 = local6.aFloat38;
		this.aFloat34 = local6.aFloat34;
		this.aFloat41 = local6.aFloat41;
		this.aFloat39 = local6.aFloat39;
		this.aFloat36 = local6.aFloat36;
		this.aFloat35 = local6.aFloat35;
		this.aFloat32 = local6.aFloat32;
		this.aFloat42 = local6.aFloat42;
	}

	@OriginalMember(owner = "client!km", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.aFloat42 = 1.0F;
		this.aFloat34 = this.aFloat33 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat39 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat36 = -this.aFloat39;
		this.aFloat37 = this.aFloat32 = this.aFloat38 = this.aFloat40 = this.aFloat43 = this.aFloat41 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat34 = 1.0F;
		this.aFloat42 = this.aFloat33 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat32 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat41 = -this.aFloat32;
		this.aFloat37 = this.aFloat38 = this.aFloat40 = this.aFloat36 = this.aFloat43 = this.aFloat39 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)[F")
	public float[] method2905() {
		Static263.aFloatArray13[12] = this.aFloat38;
		Static263.aFloatArray13[9] = this.aFloat36;
		Static263.aFloatArray13[0] = this.aFloat42;
		Static263.aFloatArray13[8] = this.aFloat32;
		Static263.aFloatArray13[2] = this.aFloat41;
		Static263.aFloatArray13[4] = this.aFloat37;
		Static263.aFloatArray13[5] = this.aFloat34;
		Static263.aFloatArray13[14] = this.aFloat35;
		Static263.aFloatArray13[13] = this.aFloat43;
		Static263.aFloatArray13[1] = this.aFloat40;
		Static263.aFloatArray13[10] = this.aFloat33;
		Static263.aFloatArray13[6] = this.aFloat39;
		return Static263.aFloatArray13;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!c;)V")
	public void method2907(@OriginalArg(1) Class35 arg0) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg0;
		this.aFloat42 = local6.aFloat42;
		this.aFloat32 = local6.aFloat41;
		this.aFloat37 = local6.aFloat40;
		this.aFloat40 = local6.aFloat37;
		this.aFloat34 = local6.aFloat34;
		this.aFloat36 = local6.aFloat39;
		this.aFloat41 = local6.aFloat32;
		this.aFloat38 = -(local6.aFloat35 * this.aFloat32 + this.aFloat37 * local6.aFloat43 + local6.aFloat38 * this.aFloat42);
		this.aFloat33 = local6.aFloat33;
		this.aFloat39 = local6.aFloat36;
		this.aFloat43 = -(this.aFloat36 * local6.aFloat35 + local6.aFloat38 * this.aFloat40 + local6.aFloat43 * this.aFloat34);
		this.aFloat35 = -(local6.aFloat43 * this.aFloat39 + local6.aFloat38 * this.aFloat41 + this.aFloat33 * local6.aFloat35);
	}

	@OriginalMember(owner = "client!km", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat39 + (float) arg0 * this.aFloat41 + (float) arg2 * this.aFloat33);
		arg3[0] = (int) ((float) arg2 * this.aFloat32 + (float) arg1 * this.aFloat37 + (float) arg0 * this.aFloat42);
		arg3[1] = (int) (this.aFloat40 * (float) arg0 + this.aFloat34 * (float) arg1 + this.aFloat36 * (float) arg2);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class35 method2897() {
		@Pc(7) Class35_Sub2 local7 = new Class35_Sub2();
		local7.aFloat35 = this.aFloat35;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat32 = this.aFloat32;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat41 = this.aFloat41;
		return local7;
	}

	@OriginalMember(owner = "client!km", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat33 = 1.0F;
		this.aFloat42 = this.aFloat34 = Class8_Sub3_Sub1_Sub2.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat40 = Class8_Sub3_Sub1_Sub2.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat32 = this.aFloat38 = this.aFloat36 = this.aFloat43 = this.aFloat41 = this.aFloat39 = this.aFloat35 = 0.0F;
		this.aFloat37 = -this.aFloat40;
	}
}
