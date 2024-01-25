import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "F")
	public float aFloat31;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "F")
	public float aFloat32;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V")
	public Class86_Sub2() {
		this.method7024();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "([FB)[F")
	public float[] method2714(@OriginalArg(0) float[] arg0) {
		arg0[11] = this.aFloat38;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[2] = this.aFloat32;
		arg0[3] = this.aFloat31;
		arg0[10] = this.aFloat37;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat30;
		arg0[7] = this.aFloat41;
		arg0[0] = this.aFloat33;
		arg0[6] = this.aFloat35;
		arg0[5] = this.aFloat34;
		arg0[1] = this.aFloat36;
		arg0[9] = this.aFloat39;
		arg0[4] = this.aFloat40;
		return arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BFFF)F")
	public float method2715(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat38 + this.aFloat37 * arg0 + this.aFloat39 * arg1 + arg2 * this.aFloat30;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "([FI)[F")
	public float[] method2716(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat34;
		arg0[4] = this.aFloat40;
		arg0[1] = this.aFloat36;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat30;
		arg0[10] = this.aFloat37;
		arg0[0] = this.aFloat33;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[15] = 0.0F;
		arg0[9] = this.aFloat39;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat35;
		arg0[2] = this.aFloat32;
		return arg0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(III)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat40 = this.aFloat30 = this.aFloat36 = this.aFloat39 = this.aFloat32 = this.aFloat35 = 0.0F;
		this.aFloat41 = (float) arg1;
		this.aFloat31 = (float) arg0;
		this.aFloat33 = this.aFloat34 = this.aFloat37 = 1.0F;
		this.aFloat38 = (float) arg2;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(BFFF)V")
	public void method2717(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat30 *= arg0;
		this.aFloat36 *= arg2;
		this.aFloat34 *= arg1;
		this.aFloat37 *= arg0;
		this.aFloat38 *= arg0;
		this.aFloat31 *= arg2;
		this.aFloat32 *= arg2;
		this.aFloat33 *= arg2;
		this.aFloat41 *= arg1;
		this.aFloat35 *= arg1;
		this.aFloat40 *= arg1;
		this.aFloat39 *= arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([I)V")
	@Override
	public void method7030(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat31;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat41;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat38;
		arg0[2] = (int) (local28 * this.aFloat37 + this.aFloat35 * local19 + local11 * this.aFloat32);
		arg0[1] = (int) (local28 * this.aFloat39 + this.aFloat36 * local11 + local19 * this.aFloat34);
		arg0[0] = (int) (local28 * this.aFloat30 + local19 * this.aFloat40 + local11 * this.aFloat33);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FZFF)V")
	public void method2718(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat33 = arg1;
		this.aFloat39 = 0.0F;
		this.aFloat34 = arg0;
		this.aFloat32 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat40 = 0.0F;
		this.aFloat38 = 0.0F;
		this.aFloat30 = 0.0F;
		this.aFloat35 = 0.0F;
		this.aFloat37 = arg2;
		this.aFloat36 = 0.0F;
		this.aFloat31 = 0.0F;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B[FFFF)V")
	public void method2719(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat32 * arg3 + this.aFloat33 * arg1 + this.aFloat36 * arg2;
		arg0[2] = this.aFloat37 * arg3 + this.aFloat39 * arg2 + arg1 * this.aFloat30;
		arg0[1] = this.aFloat35 * arg3 + this.aFloat40 * arg1 + this.aFloat34 * arg2;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat37 + (float) arg0 * this.aFloat30 + this.aFloat39 * (float) arg1 + this.aFloat38);
		arg3[0] = (int) (this.aFloat31 + this.aFloat32 * (float) arg2 + this.aFloat33 * (float) arg0 + this.aFloat36 * (float) arg1);
		arg3[1] = (int) (this.aFloat41 + (float) arg2 * this.aFloat35 + (float) arg0 * this.aFloat40 + this.aFloat34 * (float) arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method7032(@OriginalArg(0) Class86 arg0) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg0;
		this.aFloat38 = local6.aFloat38;
		this.aFloat36 = local6.aFloat36;
		this.aFloat30 = local6.aFloat30;
		this.aFloat41 = local6.aFloat41;
		this.aFloat33 = local6.aFloat33;
		this.aFloat37 = local6.aFloat37;
		this.aFloat40 = local6.aFloat40;
		this.aFloat39 = local6.aFloat39;
		this.aFloat35 = local6.aFloat35;
		this.aFloat34 = local6.aFloat34;
		this.aFloat31 = local6.aFloat31;
		this.aFloat32 = local6.aFloat32;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	@Override
	public void method7022(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat33;
		@Pc(21) float local21 = this.aFloat36;
		@Pc(24) float local24 = this.aFloat32;
		this.aFloat33 = local18 * local9 - local15 * this.aFloat40;
		@Pc(37) float local37 = this.aFloat31;
		this.aFloat36 = local21 * local9 - this.aFloat34 * local15;
		this.aFloat40 = local18 * local15 + local9 * this.aFloat40;
		this.aFloat32 = local24 * local9 - local15 * this.aFloat35;
		this.aFloat34 = this.aFloat34 * local9 + local15 * local21;
		this.aFloat31 = local9 * local37 - local15 * this.aFloat41;
		this.aFloat35 = local24 * local15 + local9 * this.aFloat35;
		this.aFloat41 = local37 * local15 + this.aFloat41 * local9;
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V")
	@Override
	public void method7034(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat33;
		@Pc(21) float local21 = this.aFloat36;
		@Pc(24) float local24 = this.aFloat32;
		this.aFloat33 = local9 * local18 + local15 * this.aFloat30;
		@Pc(37) float local37 = this.aFloat31;
		this.aFloat30 = local9 * this.aFloat30 - local15 * local18;
		this.aFloat36 = this.aFloat39 * local15 + local9 * local21;
		this.aFloat39 = this.aFloat39 * local9 - local21 * local15;
		this.aFloat32 = local15 * this.aFloat37 + local24 * local9;
		this.aFloat31 = local15 * this.aFloat38 + local37 * local9;
		this.aFloat37 = local9 * this.aFloat37 - local15 * local24;
		this.aFloat38 = local9 * this.aFloat38 - local37 * local15;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(FFIF)V")
	public void method2720(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat31 += arg2;
		this.aFloat41 += arg1;
		this.aFloat38 += arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFI[FFF)V")
	public void method2722(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[1] = this.aFloat35 * arg0 + this.aFloat40 * arg1 + this.aFloat34 * arg3;
		@Pc(53) float local53;
		@Pc(45) float local45;
		@Pc(61) float local61;
		@Pc(37) float local37;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local37 = -arg4 / arg1;
			local45 = this.aFloat41 + this.aFloat40 * local37;
			local53 = this.aFloat31 + this.aFloat33 * local37;
			local61 = this.aFloat38 + local37 * this.aFloat30;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local37 = -arg4 / arg3;
			local61 = this.aFloat38 + this.aFloat39 * local37;
			local53 = local37 * this.aFloat36 + this.aFloat31;
			local45 = this.aFloat41 + this.aFloat34 * local37;
		} else {
			local37 = -arg4 / arg0;
			local61 = this.aFloat38 + this.aFloat37 * local37;
			local53 = this.aFloat31 + local37 * this.aFloat32;
			local45 = local37 * this.aFloat35 + this.aFloat41;
		}
		arg2[0] = this.aFloat36 * arg3 + this.aFloat33 * arg1 + arg0 * this.aFloat32;
		arg2[2] = arg3 * this.aFloat39 + arg1 * this.aFloat30 + this.aFloat37 * arg0;
		arg2[3] = -(arg2[1] * local45 + local53 * arg2[0] + arg2[2] * local61);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IFFF)V")
	public void method2724(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat41 = arg2;
		this.aFloat31 = arg1;
		this.aFloat40 = this.aFloat30 = this.aFloat36 = this.aFloat39 = this.aFloat32 = this.aFloat35 = 0.0F;
		this.aFloat38 = arg0;
		this.aFloat33 = this.aFloat34 = this.aFloat37 = 1.0F;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([FI)[F")
	public float[] method2725(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat33;
		arg0[3] = this.aFloat31;
		arg0[5] = this.aFloat34;
		arg0[7] = this.aFloat41;
		arg0[6] = this.aFloat35;
		arg0[4] = this.aFloat40;
		arg0[1] = this.aFloat36;
		arg0[2] = this.aFloat32;
		return arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gw;B)V")
	public void method2726(@OriginalArg(0) Class86 arg0) {
		@Pc(14) Class86_Sub2 local14 = (Class86_Sub2) arg0;
		this.aFloat32 = local14.aFloat32;
		this.aFloat35 = local14.aFloat35;
		this.aFloat40 = local14.aFloat40;
		this.aFloat30 = local14.aFloat30;
		this.aFloat37 = local14.aFloat37;
		this.aFloat36 = local14.aFloat36;
		this.aFloat34 = local14.aFloat34;
		this.aFloat31 = 0.0F;
		this.aFloat38 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat39 = local14.aFloat39;
		this.aFloat33 = local14.aFloat33;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	@Override
	public void method7027(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat34;
		@Pc(24) float local24 = this.aFloat35;
		@Pc(27) float local27 = this.aFloat41;
		this.aFloat40 = local18 * local9 - local15 * this.aFloat30;
		this.aFloat34 = local9 * local21 - local15 * this.aFloat39;
		this.aFloat30 = this.aFloat30 * local9 + local18 * local15;
		this.aFloat39 = this.aFloat39 * local9 + local15 * local21;
		this.aFloat35 = local24 * local9 - local15 * this.aFloat37;
		this.aFloat37 = local24 * local15 + this.aFloat37 * local9;
		this.aFloat41 = local9 * local27 - local15 * this.aFloat38;
		this.aFloat38 = local27 * local15 + this.aFloat38 * local9;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	public void method2727() {
		this.aFloat38 = -this.aFloat38;
		this.aFloat34 = -this.aFloat34;
		this.aFloat39 = -this.aFloat39;
		this.aFloat40 = -this.aFloat40;
		this.aFloat30 = -this.aFloat30;
		this.aFloat41 = -this.aFloat41;
		this.aFloat35 = -this.aFloat35;
		this.aFloat37 = -this.aFloat37;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method7023(@OriginalArg(0) int arg0) {
		this.aFloat34 = 1.0F;
		this.aFloat33 = this.aFloat37 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat32 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat30 = -this.aFloat32;
		this.aFloat36 = this.aFloat31 = this.aFloat40 = this.aFloat35 = this.aFloat41 = this.aFloat39 = this.aFloat38 = 0.0F;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub39.aFloatArray50[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub39.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub39.aFloatArray50[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub39.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub39.aFloatArray50[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub39.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat40 = -local21 * local39 + local27 * local43;
		this.aFloat34 = local9 * local33;
		this.aFloat35 = local39 * local27 + local43 * local21;
		this.aFloat39 = -local15;
		this.aFloat30 = local9 * local27;
		this.aFloat37 = local9 * local21;
		this.aFloat32 = local21 * local47 + local33 * -local27;
		this.aFloat33 = local47 * local27 + local21 * local33;
		this.aFloat36 = local9 * local39;
		this.aFloat38 = -(this.aFloat37 * (float) arg2) - (float) arg1 * this.aFloat39 + (float) -arg0 * this.aFloat30;
		this.aFloat31 = (float) -arg0 * this.aFloat33 - (float) arg1 * this.aFloat36 - (float) arg2 * this.aFloat32;
		this.aFloat41 = (float) -arg0 * this.aFloat40 - this.aFloat34 * (float) arg1 - this.aFloat35 * (float) arg2;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFIF)F")
	public float method2728(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat41 + this.aFloat35 * arg2 + arg1 * this.aFloat40 + this.aFloat34 * arg0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	@Override
	public void method7029(@OriginalArg(0) int arg0) {
		this.aFloat37 = 1.0F;
		this.aFloat33 = this.aFloat34 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat40 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat32 = this.aFloat31 = this.aFloat35 = this.aFloat41 = this.aFloat30 = this.aFloat39 = this.aFloat38 = 0.0F;
		this.aFloat36 = -this.aFloat40;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!gw;)V")
	public void method2730(@OriginalArg(1) Class86 arg0) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat33;
		@Pc(12) float local12 = this.aFloat40;
		@Pc(15) float local15 = this.aFloat36;
		@Pc(18) float local18 = this.aFloat34;
		@Pc(21) float local21 = this.aFloat32;
		@Pc(24) float local24 = this.aFloat35;
		@Pc(27) float local27 = this.aFloat31;
		this.aFloat40 = local12 * local6.aFloat34 + local9 * local6.aFloat40 + this.aFloat30 * local6.aFloat35;
		@Pc(47) float local47 = this.aFloat41;
		this.aFloat33 = this.aFloat30 * local6.aFloat32 + local6.aFloat33 * local9 + local12 * local6.aFloat36;
		this.aFloat34 = local18 * local6.aFloat34 + local15 * local6.aFloat40 + this.aFloat39 * local6.aFloat35;
		this.aFloat30 = this.aFloat30 * local6.aFloat37 + local9 * local6.aFloat30 + local6.aFloat39 * local12;
		this.aFloat36 = this.aFloat39 * local6.aFloat32 + local6.aFloat33 * local15 + local6.aFloat36 * local18;
		this.aFloat35 = local6.aFloat35 * this.aFloat37 + local24 * local6.aFloat34 + local6.aFloat40 * local21;
		this.aFloat39 = local6.aFloat37 * this.aFloat39 + local6.aFloat30 * local15 + local18 * local6.aFloat39;
		this.aFloat32 = local24 * local6.aFloat36 + local6.aFloat33 * local21 + this.aFloat37 * local6.aFloat32;
		this.aFloat41 = local6.aFloat41 + local6.aFloat34 * local47 + local6.aFloat40 * local27 + this.aFloat38 * local6.aFloat35;
		this.aFloat31 = local6.aFloat31 + local6.aFloat32 * this.aFloat38 + local47 * local6.aFloat36 + local6.aFloat33 * local27;
		this.aFloat37 = local6.aFloat37 * this.aFloat37 + local6.aFloat30 * local21 + local6.aFloat39 * local24;
		this.aFloat38 = local6.aFloat37 * this.aFloat38 + local6.aFloat39 * local47 + local27 * local6.aFloat30 + local6.aFloat38;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gw;Lclient!gw;)V")
	public void method2731(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg0;
		@Pc(9) Class86_Sub2 local9 = (Class86_Sub2) arg1;
		this.aFloat33 = local6.aFloat32 * local9.aFloat30 + local6.aFloat36 * local9.aFloat40 + local6.aFloat33 * local9.aFloat33;
		this.aFloat40 = local9.aFloat30 * local6.aFloat35 + local9.aFloat33 * local6.aFloat40 + local9.aFloat40 * local6.aFloat34;
		this.aFloat30 = local6.aFloat30 * local9.aFloat33 + local9.aFloat40 * local6.aFloat39 + local6.aFloat37 * local9.aFloat30;
		this.aFloat36 = local6.aFloat33 * local9.aFloat36 + local6.aFloat36 * local9.aFloat34 + local6.aFloat32 * local9.aFloat39;
		this.aFloat34 = local9.aFloat39 * local6.aFloat35 + local6.aFloat40 * local9.aFloat36 + local6.aFloat34 * local9.aFloat34;
		this.aFloat39 = local9.aFloat36 * local6.aFloat30 + local9.aFloat34 * local6.aFloat39 + local6.aFloat37 * local9.aFloat39;
		this.aFloat32 = local9.aFloat37 * local6.aFloat32 + local9.aFloat32 * local6.aFloat33 + local6.aFloat36 * local9.aFloat35;
		this.aFloat35 = local9.aFloat35 * local6.aFloat34 + local6.aFloat40 * local9.aFloat32 + local6.aFloat35 * local9.aFloat37;
		this.aFloat37 = local9.aFloat37 * local6.aFloat37 + local6.aFloat39 * local9.aFloat35 + local9.aFloat32 * local6.aFloat30;
		this.aFloat31 = local9.aFloat31 * local6.aFloat33 + local6.aFloat36 * local9.aFloat41 + local9.aFloat38 * local6.aFloat32 + local6.aFloat31;
		this.aFloat41 = local6.aFloat35 * local9.aFloat38 + local6.aFloat34 * local9.aFloat41 + local6.aFloat40 * local9.aFloat31 + local6.aFloat41;
		this.aFloat38 = local6.aFloat38 + local9.aFloat41 * local6.aFloat39 + local6.aFloat30 * local9.aFloat31 + local9.aFloat38 * local6.aFloat37;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat37 + (float) arg1 * this.aFloat39 + (float) arg0 * this.aFloat30);
		arg3[1] = (int) (this.aFloat35 * (float) arg2 + (float) arg0 * this.aFloat40 + (float) arg1 * this.aFloat34);
		arg3[0] = (int) ((float) arg2 * this.aFloat32 + (float) arg1 * this.aFloat36 + (float) arg0 * this.aFloat33);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gw;Z)V")
	public void method2732(@OriginalArg(0) Class86 arg0) {
		@Pc(6) Class86_Sub2 local6 = (Class86_Sub2) arg0;
		this.aFloat36 = local6.aFloat40;
		this.aFloat32 = local6.aFloat30;
		this.aFloat33 = local6.aFloat33;
		this.aFloat40 = local6.aFloat36;
		this.aFloat34 = local6.aFloat34;
		this.aFloat35 = local6.aFloat39;
		this.aFloat30 = local6.aFloat32;
		this.aFloat37 = local6.aFloat37;
		this.aFloat31 = -(local6.aFloat38 * this.aFloat32 + local6.aFloat41 * this.aFloat36 + this.aFloat33 * local6.aFloat31);
		this.aFloat39 = local6.aFloat35;
		this.aFloat41 = -(this.aFloat40 * local6.aFloat31 + local6.aFloat41 * this.aFloat34 + this.aFloat35 * local6.aFloat38);
		this.aFloat38 = -(local6.aFloat38 * this.aFloat37 + local6.aFloat31 * this.aFloat30 + this.aFloat39 * local6.aFloat41);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([FB)[F")
	public float[] method2733(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[4] = this.aFloat36;
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat33;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		arg0[8] = this.aFloat31;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat34;
		arg0[2] = 0.0F;
		arg0[9] = this.aFloat41;
		arg0[1] = this.aFloat40;
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat38;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "()Lclient!gw;")
	@Override
	public Class86 method7018() {
		@Pc(7) Class86_Sub2 local7 = new Class86_Sub2();
		local7.aFloat41 = this.aFloat41;
		local7.aFloat30 = this.aFloat30;
		local7.aFloat35 = this.aFloat35;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat32 = this.aFloat32;
		local7.aFloat31 = this.aFloat31;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat39 = this.aFloat39;
		return local7;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFIIFII)V")
	public void method2734(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		if (arg3 == 0) {
			this.aFloat40 = this.aFloat30 = this.aFloat36 = this.aFloat39 = this.aFloat32 = this.aFloat35 = 0.0F;
			this.aFloat41 = (float) -arg5 + arg0;
			this.aFloat38 = arg1;
			this.aFloat37 = 1.0F;
			this.aFloat33 = (float) (arg2 * 2);
			this.aFloat34 = (float) (arg5 * 2);
			this.aFloat31 = arg4 - (float) arg2;
			return;
		}
		@Pc(22) float local22 = Class2_Sub39.aFloatArray50[arg3 & 0x3FFF];
		@Pc(28) float local28 = Class2_Sub39.aFloatArray49[arg3 & 0x3FFF];
		this.aFloat36 = (float) arg5 * local28 * -2.0F;
		this.aFloat31 = arg4 + (float) (arg2 * 2) * (local28 * 0.5F - local22 * 0.5F);
		this.aFloat41 = arg0 + (float) (arg5 * 2) * (-0.5F * local28 - local22 * 0.5F);
		this.aFloat30 = this.aFloat39 = this.aFloat32 = this.aFloat35 = 0.0F;
		this.aFloat33 = (float) arg2 * 2.0F * local22;
		this.aFloat40 = (float) arg2 * local28 * 2.0F;
		this.aFloat34 = local22 * 2.0F * (float) arg5;
		this.aFloat37 = 1.0F;
		this.aFloat38 = arg1;
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V")
	@Override
	public void method7025(@OriginalArg(0) int arg0) {
		this.aFloat33 = 1.0F;
		this.aFloat34 = this.aFloat37 = Class2_Sub39.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat39 = Class2_Sub39.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat36 = this.aFloat32 = this.aFloat31 = this.aFloat40 = this.aFloat41 = this.aFloat30 = this.aFloat38 = 0.0F;
		this.aFloat35 = -this.aFloat39;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFFFIFFFFF)V")
	public void method2735(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat35 = arg0;
		this.aFloat36 = arg1;
		this.aFloat37 = arg2;
		this.aFloat32 = arg5;
		this.aFloat33 = arg7;
		this.aFloat38 = 0.0F;
		this.aFloat40 = arg3;
		this.aFloat34 = arg8;
		this.aFloat30 = arg6;
		this.aFloat39 = arg4;
		this.aFloat41 = 0.0F;
		this.aFloat31 = 0.0F;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FBFF)F")
	public float method2736(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat32 * arg2 + this.aFloat36 * arg0 + this.aFloat33 * arg1 + this.aFloat31;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "()V")
	@Override
	public void method7024() {
		this.aFloat33 = this.aFloat34 = this.aFloat37 = 1.0F;
		this.aFloat40 = this.aFloat30 = this.aFloat36 = this.aFloat39 = this.aFloat32 = this.aFloat35 = this.aFloat31 = this.aFloat41 = this.aFloat38 = 0.0F;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	@Override
	public void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat38 += (float) arg2;
		this.aFloat41 += (float) arg1;
		this.aFloat31 += (float) arg0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "([FB)[F")
	public float[] method2737(@OriginalArg(0) float[] arg0) {
		arg0[14] = this.aFloat38;
		arg0[6] = this.aFloat39;
		arg0[11] = 0.0F;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat32;
		arg0[0] = this.aFloat33;
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat31;
		arg0[4] = this.aFloat36;
		arg0[5] = this.aFloat34;
		arg0[10] = this.aFloat37;
		arg0[2] = this.aFloat30;
		arg0[13] = this.aFloat41;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat40;
		arg0[9] = this.aFloat35;
		return arg0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat41);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat38);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat31);
		arg3[1] = (int) ((float) local10 * this.aFloat34 + (float) local24 * this.aFloat36 + (float) local17 * this.aFloat39);
		arg3[0] = (int) (this.aFloat40 * (float) local10 + (float) local24 * this.aFloat33 + (float) local17 * this.aFloat30);
		arg3[2] = (int) ((float) local17 * this.aFloat37 + (float) local10 * this.aFloat35 + this.aFloat32 * (float) local24);
	}
}
