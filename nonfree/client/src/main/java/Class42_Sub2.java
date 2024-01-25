import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!mda", name = "r", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!mda", name = "s", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!mda", name = "N", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class42_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!mda", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class350.aFloatArray70[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class350.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class350.aFloatArray70[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class350.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat139 = local27 * local39 + local21 * local43;
		this.aFloat136 = -local21 * local39 + local27 * local43;
		this.aFloat137 = local21 * local47 + local33 * -local27;
		this.aFloat145 = -local15;
		this.aFloat138 = local9 * local33;
		this.aFloat141 = local9 * local39;
		this.aFloat140 = local27 * local9;
		this.aFloat144 = local33 * local21 + local47 * local27;
		this.aFloat142 = local9 * local21;
		this.aFloat134 = (float) -arg0 * this.aFloat136 - (float) arg1 * this.aFloat138 - this.aFloat139 * (float) arg2;
		this.aFloat143 = -((float) arg2 * this.aFloat142) + this.aFloat140 * (float) -arg0 - (float) arg1 * this.aFloat145;
		this.aFloat135 = -(this.aFloat137 * (float) arg2) - (float) arg1 * this.aFloat141 + this.aFloat144 * (float) -arg0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class42 method7519() {
		@Pc(7) Class42_Sub2 local7 = new Class42_Sub2();
		local7.aFloat135 = this.aFloat135;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat138 = this.aFloat138;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat134 = this.aFloat134;
		return local7;
	}

	@OriginalMember(owner = "client!mda", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat144 = this.aFloat138 = this.aFloat142 = 1.0F;
		this.aFloat135 = arg0;
		this.aFloat143 = arg2;
		this.aFloat136 = this.aFloat140 = this.aFloat141 = this.aFloat145 = this.aFloat137 = this.aFloat139 = 0.0F;
		this.aFloat134 = arg1;
	}

	@OriginalMember(owner = "client!mda", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat136 = this.aFloat140 = this.aFloat141 = this.aFloat145 = this.aFloat137 = this.aFloat139 = this.aFloat135 = this.aFloat134 = this.aFloat143 = 0.0F;
		this.aFloat144 = this.aFloat138 = this.aFloat142 = 1.0F;
	}

	@OriginalMember(owner = "client!mda", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat143 += arg2;
		this.aFloat135 += arg0;
		this.aFloat134 += arg1;
	}

	@OriginalMember(owner = "client!mda", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat144 = 1.0F;
		this.aFloat138 = this.aFloat142 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat145 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat139 = -this.aFloat145;
		this.aFloat141 = this.aFloat137 = this.aFloat135 = this.aFloat136 = this.aFloat134 = this.aFloat140 = this.aFloat143 = 0.0F;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg1 * this.aFloat141 + this.aFloat144 * (float) arg0 + this.aFloat137 * (float) arg2 + this.aFloat135);
		arg3[1] = (int) (this.aFloat134 + this.aFloat139 * (float) arg2 + (float) arg1 * this.aFloat138 + this.aFloat136 * (float) arg0);
		arg3[2] = (int) (this.aFloat142 * (float) arg2 + (float) arg1 * this.aFloat145 + this.aFloat140 * (float) arg0 + this.aFloat143);
	}

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class42 arg0) {
		@Pc(6) Class42_Sub2 local6 = (Class42_Sub2) arg0;
		this.aFloat142 = local6.aFloat142;
		this.aFloat134 = local6.aFloat134;
		this.aFloat143 = local6.aFloat143;
		this.aFloat135 = local6.aFloat135;
		this.aFloat141 = local6.aFloat141;
		this.aFloat136 = local6.aFloat136;
		this.aFloat138 = local6.aFloat138;
		this.aFloat137 = local6.aFloat137;
		this.aFloat139 = local6.aFloat139;
		this.aFloat144 = local6.aFloat144;
		this.aFloat140 = local6.aFloat140;
		this.aFloat145 = local6.aFloat145;
	}

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat135);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat134);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat143);
		arg3[2] = (int) (this.aFloat142 * (float) local24 + this.aFloat139 * (float) local17 + (float) local10 * this.aFloat137);
		arg3[1] = (int) (this.aFloat145 * (float) local24 + (float) local10 * this.aFloat141 + this.aFloat138 * (float) local17);
		arg3[0] = (int) ((float) local24 * this.aFloat140 + this.aFloat144 * (float) local10 + (float) local17 * this.aFloat136);
	}

	@OriginalMember(owner = "client!mda", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat135;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat134;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat143;
		arg0[1] = (int) (this.aFloat138 * local21 + this.aFloat141 * local12 + local29 * this.aFloat145);
		arg0[2] = (int) (local29 * this.aFloat142 + this.aFloat139 * local21 + local12 * this.aFloat137);
		arg0[0] = (int) (this.aFloat140 * local29 + local12 * this.aFloat144 + this.aFloat136 * local21);
	}

	@OriginalMember(owner = "client!mda", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat145 * (float) arg1 + this.aFloat140 * (float) arg0 + this.aFloat142 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat137 + (float) arg0 * this.aFloat144 + (float) arg1 * this.aFloat141);
		arg3[1] = (int) ((float) arg2 * this.aFloat139 + this.aFloat138 * (float) arg1 + (float) arg0 * this.aFloat136);
	}

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat136;
		@Pc(21) float local21 = this.aFloat138;
		@Pc(24) float local24 = this.aFloat139;
		@Pc(27) float local27 = this.aFloat134;
		this.aFloat136 = local9 * local18 - this.aFloat140 * local15;
		this.aFloat138 = local21 * local9 - this.aFloat145 * local15;
		this.aFloat140 = local15 * local18 + this.aFloat140 * local9;
		this.aFloat145 = local15 * local21 + local9 * this.aFloat145;
		this.aFloat139 = local9 * local24 - this.aFloat142 * local15;
		this.aFloat134 = local27 * local9 - local15 * this.aFloat143;
		this.aFloat142 = this.aFloat142 * local9 + local24 * local15;
		this.aFloat143 = local15 * local27 + this.aFloat143 * local9;
	}

	@OriginalMember(owner = "client!mda", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat144;
		@Pc(21) float local21 = this.aFloat141;
		@Pc(24) float local24 = this.aFloat137;
		this.aFloat144 = this.aFloat140 * local15 + local9 * local18;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat141 = local21 * local9 + local15 * this.aFloat145;
		this.aFloat140 = local9 * this.aFloat140 - local18 * local15;
		this.aFloat145 = local9 * this.aFloat145 - local21 * local15;
		this.aFloat137 = this.aFloat142 * local15 + local24 * local9;
		this.aFloat142 = local9 * this.aFloat142 - local15 * local24;
		this.aFloat135 = local37 * local9 + this.aFloat143 * local15;
		this.aFloat143 = local9 * this.aFloat143 - local37 * local15;
	}

	@OriginalMember(owner = "client!mda", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class350.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class350.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat144;
		@Pc(21) float local21 = this.aFloat141;
		@Pc(24) float local24 = this.aFloat137;
		this.aFloat144 = local18 * local9 - this.aFloat136 * local15;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat141 = local21 * local9 - local15 * this.aFloat138;
		this.aFloat136 = local18 * local15 + this.aFloat136 * local9;
		this.aFloat137 = local9 * local24 - this.aFloat139 * local15;
		this.aFloat138 = local9 * this.aFloat138 + local21 * local15;
		this.aFloat139 = local15 * local24 + local9 * this.aFloat139;
		this.aFloat135 = local37 * local9 - local15 * this.aFloat134;
		this.aFloat134 = local9 * this.aFloat134 + local37 * local15;
	}

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat142 = 1.0F;
		this.aFloat144 = this.aFloat138 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat136 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat137 = this.aFloat135 = this.aFloat139 = this.aFloat134 = this.aFloat140 = this.aFloat145 = this.aFloat143 = 0.0F;
		this.aFloat141 = -this.aFloat136;
	}

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat138 = 1.0F;
		this.aFloat144 = this.aFloat142 = Class350.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat137 = Class350.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat140 = -this.aFloat137;
		this.aFloat141 = this.aFloat135 = this.aFloat136 = this.aFloat139 = this.aFloat134 = this.aFloat145 = this.aFloat143 = 0.0F;
	}
}
