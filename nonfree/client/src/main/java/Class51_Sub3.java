import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!qn", name = "U", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!qn", name = "V", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	public Class51_Sub3() {
		this.method6714();
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		this.aFloat136 = 1.0F;
		this.aFloat139 = this.aFloat134 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		this.aFloat141 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		this.aFloat142 = this.aFloat137 = this.aFloat135 = this.aFloat143 = this.aFloat138 = this.aFloat132 = this.aFloat140 = 0.0F;
		this.aFloat133 = -this.aFloat141;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FIFIIIF)V")
	public void method6722(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat143 = this.aFloat132 = this.aFloat142 = this.aFloat141 = this.aFloat137 = this.aFloat133 = 0.0F;
			this.aFloat136 = (float) arg3;
			this.aFloat134 = 1.0F;
			this.aFloat139 = (float) arg4;
		} else {
			@Pc(38) float local38 = Class33_Sub27.aFloatArray106[arg1 & 0x3FFF];
			@Pc(44) float local44 = Class33_Sub27.aFloatArray107[arg1 & 0x3FFF];
			this.aFloat142 = (float) arg4 * -local44;
			this.aFloat134 = 1.0F;
			this.aFloat139 = local38 * (float) arg4;
			this.aFloat136 = (float) arg3 * local38;
			this.aFloat143 = local44 * (float) arg3;
			this.aFloat132 = this.aFloat141 = this.aFloat137 = this.aFloat133 = 0.0F;
		}
		this.aFloat140 = arg0;
		this.aFloat135 = arg5;
		this.aFloat138 = arg2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class33_Sub27.aFloatArray106[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class33_Sub27.aFloatArray107[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class33_Sub27.aFloatArray106[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class33_Sub27.aFloatArray107[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class33_Sub27.aFloatArray106[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class33_Sub27.aFloatArray107[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat139 = local33 * local9;
		this.aFloat133 = local21 * local43 + local27 * local39;
		this.aFloat137 = local21 * local47 + local33 * -local27;
		this.aFloat143 = local39 * -local21 + local27 * local43;
		this.aFloat134 = local21 * local9;
		this.aFloat141 = -local15;
		this.aFloat142 = local39 * local9;
		this.aFloat136 = local47 * local27 + local33 * local21;
		this.aFloat132 = local9 * local27;
		this.aFloat138 = -((float) arg2 * this.aFloat133) + this.aFloat143 * (float) -arg0 - (float) arg1 * this.aFloat139;
		this.aFloat140 = -(this.aFloat134 * (float) arg2) - this.aFloat141 * (float) arg1 + this.aFloat132 * (float) -arg0;
		this.aFloat135 = -(this.aFloat137 * (float) arg2) - this.aFloat142 * (float) arg1 + this.aFloat136 * (float) -arg0;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat136 * (float) arg0 + (float) arg1 * this.aFloat142 + (float) arg2 * this.aFloat137);
		arg3[2] = (int) (this.aFloat134 * (float) arg2 + this.aFloat132 * (float) arg0 + this.aFloat141 * (float) arg1);
		arg3[1] = (int) ((float) arg0 * this.aFloat143 + (float) arg1 * this.aFloat139 + (float) arg2 * this.aFloat133);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method6703(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat136;
		@Pc(21) float local21 = this.aFloat142;
		@Pc(24) float local24 = this.aFloat137;
		@Pc(27) float local27 = this.aFloat135;
		this.aFloat136 = this.aFloat132 * local15 + local18 * local9;
		this.aFloat132 = this.aFloat132 * local9 - local15 * local18;
		this.aFloat142 = this.aFloat141 * local15 + local9 * local21;
		this.aFloat141 = local9 * this.aFloat141 - local21 * local15;
		this.aFloat137 = local24 * local9 + this.aFloat134 * local15;
		this.aFloat134 = local9 * this.aFloat134 - local15 * local24;
		this.aFloat135 = local9 * local27 + local15 * this.aFloat140;
		this.aFloat140 = this.aFloat140 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()V")
	@Override
	public void method6714() {
		this.aFloat136 = this.aFloat139 = this.aFloat134 = 1.0F;
		this.aFloat143 = this.aFloat132 = this.aFloat142 = this.aFloat141 = this.aFloat137 = this.aFloat133 = this.aFloat135 = this.aFloat138 = this.aFloat140 = 0.0F;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat136 = this.aFloat139 = this.aFloat134 = 1.0F;
		this.aFloat135 = (float) arg0;
		this.aFloat138 = (float) arg1;
		this.aFloat143 = this.aFloat132 = this.aFloat142 = this.aFloat141 = this.aFloat137 = this.aFloat133 = 0.0F;
		this.aFloat140 = (float) arg2;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)V")
	@Override
	public void method6715(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat135;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat138;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat140;
		arg0[2] = (int) (local11 * this.aFloat137 + local19 * this.aFloat133 + this.aFloat134 * local27);
		arg0[1] = (int) (this.aFloat142 * local11 + local19 * this.aFloat139 + local27 * this.aFloat141);
		arg0[0] = (int) (local19 * this.aFloat143 + this.aFloat136 * local11 + local27 * this.aFloat132);
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat139 = 1.0F;
		this.aFloat136 = this.aFloat134 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		this.aFloat137 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		this.aFloat142 = this.aFloat135 = this.aFloat143 = this.aFloat133 = this.aFloat138 = this.aFloat141 = this.aFloat140 = 0.0F;
		this.aFloat132 = -this.aFloat137;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat135);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat140);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat138);
		arg3[0] = (int) (this.aFloat132 * (float) local13 + this.aFloat143 * (float) local24 + (float) local6 * this.aFloat136);
		arg3[2] = (int) ((float) local24 * this.aFloat133 + this.aFloat137 * (float) local6 + (float) local13 * this.aFloat134);
		arg3[1] = (int) ((float) local13 * this.aFloat141 + this.aFloat142 * (float) local6 + this.aFloat139 * (float) local24);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat138 += (float) arg1;
		this.aFloat135 += (float) arg0;
		this.aFloat140 += (float) arg2;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	@Override
	public void method6707(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat143;
		@Pc(21) float local21 = this.aFloat139;
		@Pc(24) float local24 = this.aFloat133;
		@Pc(27) float local27 = this.aFloat138;
		this.aFloat143 = local18 * local9 - this.aFloat132 * local15;
		this.aFloat139 = local9 * local21 - this.aFloat141 * local15;
		this.aFloat132 = this.aFloat132 * local9 + local18 * local15;
		this.aFloat141 = local9 * this.aFloat141 + local21 * local15;
		this.aFloat133 = local9 * local24 - this.aFloat134 * local15;
		this.aFloat138 = local27 * local9 - local15 * this.aFloat140;
		this.aFloat134 = this.aFloat134 * local9 + local15 * local24;
		this.aFloat140 = local27 * local15 + local9 * this.aFloat140;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!pda;)V")
	public void method6723(@OriginalArg(1) Class51 arg0) {
		@Pc(6) Class51_Sub3 local6 = (Class51_Sub3) arg0;
		this.aFloat137 = local6.aFloat132;
		this.aFloat136 = local6.aFloat136;
		this.aFloat142 = local6.aFloat143;
		this.aFloat139 = local6.aFloat139;
		this.aFloat132 = local6.aFloat137;
		this.aFloat133 = local6.aFloat141;
		this.aFloat143 = local6.aFloat142;
		this.aFloat141 = local6.aFloat133;
		this.aFloat134 = local6.aFloat134;
		this.aFloat135 = -(this.aFloat142 * local6.aFloat138 + this.aFloat136 * local6.aFloat135 + local6.aFloat140 * this.aFloat137);
		this.aFloat138 = -(this.aFloat133 * local6.aFloat140 + local6.aFloat135 * this.aFloat143 + this.aFloat139 * local6.aFloat138);
		this.aFloat140 = -(local6.aFloat140 * this.aFloat134 + this.aFloat132 * local6.aFloat135 + local6.aFloat138 * this.aFloat141);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6704(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class51_Sub3 local6 = (Class51_Sub3) arg0;
		this.aFloat138 = local6.aFloat138;
		this.aFloat133 = local6.aFloat133;
		this.aFloat143 = local6.aFloat143;
		this.aFloat132 = local6.aFloat132;
		this.aFloat135 = local6.aFloat135;
		this.aFloat136 = local6.aFloat136;
		this.aFloat141 = local6.aFloat141;
		this.aFloat142 = local6.aFloat142;
		this.aFloat137 = local6.aFloat137;
		this.aFloat139 = local6.aFloat139;
		this.aFloat140 = local6.aFloat140;
		this.aFloat134 = local6.aFloat134;
	}

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)[F")
	public float[] method6725() {
		Static602.aFloatArray102[13] = this.aFloat138;
		Static602.aFloatArray102[8] = this.aFloat137;
		Static602.aFloatArray102[0] = this.aFloat136;
		Static602.aFloatArray102[12] = this.aFloat135;
		Static602.aFloatArray102[6] = this.aFloat141;
		Static602.aFloatArray102[9] = this.aFloat133;
		Static602.aFloatArray102[10] = this.aFloat134;
		Static602.aFloatArray102[4] = this.aFloat142;
		Static602.aFloatArray102[2] = this.aFloat132;
		Static602.aFloatArray102[14] = this.aFloat140;
		Static602.aFloatArray102[5] = this.aFloat139;
		Static602.aFloatArray102[1] = this.aFloat143;
		return Static602.aFloatArray102;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat134 + (float) arg0 * this.aFloat132 + (float) arg1 * this.aFloat141 + this.aFloat140);
		arg3[0] = (int) (this.aFloat136 * (float) arg0 + (float) arg1 * this.aFloat142 + this.aFloat137 * (float) arg2 + this.aFloat135);
		arg3[1] = (int) (this.aFloat138 + (float) arg1 * this.aFloat139 + (float) arg0 * this.aFloat143 + this.aFloat133 * (float) arg2);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(FF[FZFF)V")
	public void method6726(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(40) float local40;
		@Pc(32) float local32;
		@Pc(24) float local24;
		@Pc(16) float local16;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local16 = -arg1 / arg3;
			local24 = local16 * this.aFloat132 + this.aFloat140;
			local32 = this.aFloat138 + local16 * this.aFloat143;
			local40 = this.aFloat135 + this.aFloat136 * local16;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local16 = -arg1 / arg0;
			local24 = this.aFloat140 + local16 * this.aFloat141;
			local32 = this.aFloat138 + this.aFloat139 * local16;
			local40 = this.aFloat135 + local16 * this.aFloat142;
		} else {
			local16 = -arg1 / arg4;
			local32 = local16 * this.aFloat133 + this.aFloat138;
			local40 = local16 * this.aFloat137 + this.aFloat135;
			local24 = local16 * this.aFloat134 + this.aFloat140;
		}
		arg2[0] = this.aFloat136 * arg3 + this.aFloat142 * arg0 + this.aFloat137 * arg4;
		arg2[1] = this.aFloat143 * arg3 + arg0 * this.aFloat139 + this.aFloat133 * arg4;
		arg2[2] = arg0 * this.aFloat141 + arg3 * this.aFloat132 + arg4 * this.aFloat134;
		arg2[3] = -(arg2[2] * local24 + local40 * arg2[0] + local32 * arg2[1]);
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
	@Override
	public void method6720(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat136;
		@Pc(21) float local21 = this.aFloat142;
		@Pc(24) float local24 = this.aFloat137;
		@Pc(27) float local27 = this.aFloat135;
		this.aFloat136 = local18 * local9 - local15 * this.aFloat143;
		this.aFloat143 = local15 * local18 + local9 * this.aFloat143;
		this.aFloat142 = local9 * local21 - this.aFloat139 * local15;
		this.aFloat137 = local9 * local24 - this.aFloat133 * local15;
		this.aFloat139 = local21 * local15 + this.aFloat139 * local9;
		this.aFloat133 = this.aFloat133 * local9 + local24 * local15;
		this.aFloat135 = local27 * local9 - this.aFloat138 * local15;
		this.aFloat138 = local9 * this.aFloat138 + local15 * local27;
	}

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "(I)[F")
	public float[] method6727() {
		Static602.aFloatArray102[12] = 0.0F;
		Static602.aFloatArray102[5] = this.aFloat139;
		Static602.aFloatArray102[1] = this.aFloat143;
		Static602.aFloatArray102[8] = this.aFloat137;
		Static602.aFloatArray102[13] = 0.0F;
		Static602.aFloatArray102[0] = this.aFloat136;
		Static602.aFloatArray102[4] = this.aFloat142;
		Static602.aFloatArray102[6] = this.aFloat141;
		Static602.aFloatArray102[2] = this.aFloat132;
		Static602.aFloatArray102[10] = this.aFloat134;
		Static602.aFloatArray102[9] = this.aFloat133;
		Static602.aFloatArray102[14] = 0.0F;
		return Static602.aFloatArray102;
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	@Override
	public void method6718(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat136 = this.aFloat139 = Class33_Sub27.aFloatArray106[arg0 & 0x3FFF];
		this.aFloat143 = Class33_Sub27.aFloatArray107[arg0 & 0x3FFF];
		this.aFloat137 = this.aFloat135 = this.aFloat133 = this.aFloat138 = this.aFloat132 = this.aFloat141 = this.aFloat140 = 0.0F;
		this.aFloat142 = -this.aFloat143;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method6712() {
		@Pc(7) Class51_Sub3 local7 = new Class51_Sub3();
		local7.aFloat135 = this.aFloat135;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat138 = this.aFloat138;
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public void method6728() {
		this.aFloat140 = -this.aFloat140;
		this.aFloat141 = -this.aFloat141;
		this.aFloat133 = -this.aFloat133;
		this.aFloat134 = -this.aFloat134;
		this.aFloat143 = -this.aFloat143;
		this.aFloat132 = -this.aFloat132;
		this.aFloat139 = -this.aFloat139;
		this.aFloat138 = -this.aFloat138;
	}
}
