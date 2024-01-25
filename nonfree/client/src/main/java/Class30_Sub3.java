import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "F")
	public float aFloat137;

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "F")
	public float aFloat138;

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "F")
	public float aFloat139;

	@OriginalMember(owner = "client!iaa", name = "w", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!iaa", name = "E", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!iaa", name = "F", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!iaa", name = "H", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!iaa", name = "Q", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!iaa", name = "T", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "()V")
	public Class30_Sub3() {
		this.method4665();
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)V")
	@Override
	public void method4657(@OriginalArg(0) int arg0) {
		this.aFloat146 = 1.0F;
		this.aFloat143 = this.aFloat142 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat140 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		this.aFloat145 = this.aFloat135 = this.aFloat141 = this.aFloat144 = this.aFloat139 = this.aFloat138 = this.aFloat137 = 0.0F;
		this.aFloat136 = -this.aFloat140;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZFFFF[F)V")
	public void method4390(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		@Pc(26) float local26;
		@Pc(42) float local42;
		@Pc(34) float local34;
		@Pc(18) float local18;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local18 = -arg3 / arg0;
			local26 = local18 * this.aFloat143 + this.aFloat135;
			local34 = this.aFloat137 + this.aFloat139 * local18;
			local42 = this.aFloat144 + local18 * this.aFloat140;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local18 = -arg3 / arg2;
			local42 = this.aFloat142 * local18 + this.aFloat144;
			local26 = this.aFloat136 * local18 + this.aFloat135;
			local34 = this.aFloat138 * local18 + this.aFloat137;
		} else {
			local18 = -arg3 / arg1;
			local26 = local18 * this.aFloat145 + this.aFloat135;
			local42 = this.aFloat141 * local18 + this.aFloat144;
			local34 = this.aFloat137 + local18 * this.aFloat146;
		}
		arg4[0] = arg1 * this.aFloat145 + arg0 * this.aFloat143 + arg2 * this.aFloat136;
		arg4[2] = arg1 * this.aFloat146 + this.aFloat139 * arg0 + this.aFloat138 * arg2;
		arg4[1] = this.aFloat142 * arg2 + this.aFloat140 * arg0 + this.aFloat141 * arg1;
		arg4[3] = -(arg4[0] * local26 + local42 * arg4[1] + local34 * arg4[2]);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V")
	@Override
	public void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat137 += arg2;
		this.aFloat144 += arg1;
		this.aFloat135 += arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)V")
	@Override
	public void method4655(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat140;
		@Pc(21) float local21 = this.aFloat142;
		@Pc(24) float local24 = this.aFloat141;
		this.aFloat140 = local9 * local18 - this.aFloat139 * local15;
		@Pc(37) float local37 = this.aFloat144;
		this.aFloat139 = this.aFloat139 * local9 + local15 * local18;
		this.aFloat142 = local21 * local9 - local15 * this.aFloat138;
		this.aFloat141 = local9 * local24 - this.aFloat146 * local15;
		this.aFloat138 = local21 * local15 + local9 * this.aFloat138;
		this.aFloat146 = local24 * local15 + local9 * this.aFloat146;
		this.aFloat144 = local9 * local37 - local15 * this.aFloat137;
		this.aFloat137 = local9 * this.aFloat137 + local37 * local15;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FIFIIIF)V")
	public void method4392(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat140 = this.aFloat139 = this.aFloat136 = this.aFloat138 = this.aFloat145 = this.aFloat141 = 0.0F;
			this.aFloat143 = arg1;
			this.aFloat146 = 1.0F;
			this.aFloat142 = arg3;
		} else {
			@Pc(41) float local41 = Class2_Sub5.aFloatArray84[arg4 & 0x3FFF];
			@Pc(47) float local47 = Class2_Sub5.aFloatArray83[arg4 & 0x3FFF];
			this.aFloat140 = (float) arg1 * local47;
			this.aFloat142 = (float) arg3 * local41;
			this.aFloat139 = this.aFloat138 = this.aFloat145 = this.aFloat141 = 0.0F;
			this.aFloat146 = 1.0F;
			this.aFloat136 = -local47 * (float) arg3;
			this.aFloat143 = (float) arg1 * local41;
		}
		this.aFloat135 = arg2;
		this.aFloat144 = arg5;
		this.aFloat137 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat145 + (float) arg0 * this.aFloat143 + (float) arg1 * this.aFloat136 + this.aFloat135);
		arg3[2] = (int) ((float) arg1 * this.aFloat138 + this.aFloat139 * (float) arg0 + this.aFloat146 * (float) arg2 + this.aFloat137);
		arg3[1] = (int) (this.aFloat144 + (float) arg2 * this.aFloat141 + (float) arg0 * this.aFloat140 + (float) arg1 * this.aFloat142);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III)V")
	@Override
	public void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat137 = arg2;
		this.aFloat135 = arg0;
		this.aFloat140 = this.aFloat139 = this.aFloat136 = this.aFloat138 = this.aFloat145 = this.aFloat141 = 0.0F;
		this.aFloat144 = arg1;
		this.aFloat143 = this.aFloat142 = this.aFloat146 = 1.0F;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([I)V")
	@Override
	public void method4645(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat135;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat144;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat137;
		arg0[1] = (int) (this.aFloat142 * local20 + local11 * this.aFloat136 + this.aFloat138 * local29);
		arg0[2] = (int) (this.aFloat146 * local29 + local20 * this.aFloat141 + this.aFloat145 * local11);
		arg0[0] = (int) (this.aFloat143 * local11 + this.aFloat140 * local20 + local29 * this.aFloat139);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub5.aFloatArray84[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub5.aFloatArray83[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub5.aFloatArray84[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub5.aFloatArray83[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub5.aFloatArray84[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub5.aFloatArray83[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat141 = local43 * local21 + local27 * local39;
		this.aFloat139 = local9 * local27;
		this.aFloat143 = local27 * local47 + local21 * local33;
		this.aFloat142 = local33 * local9;
		this.aFloat138 = -local15;
		this.aFloat136 = local39 * local9;
		this.aFloat146 = local9 * local21;
		this.aFloat145 = local33 * -local27 + local21 * local47;
		this.aFloat140 = local43 * local27 + -local21 * local39;
		this.aFloat137 = this.aFloat139 * (float) -arg0 - this.aFloat138 * (float) arg1 - (float) arg2 * this.aFloat146;
		this.aFloat135 = -(this.aFloat136 * (float) arg1) + this.aFloat143 * (float) -arg0 - this.aFloat145 * (float) arg2;
		this.aFloat144 = -((float) arg2 * this.aFloat141) + this.aFloat140 * (float) -arg0 - this.aFloat142 * (float) arg1;
	}

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "(I)V")
	@Override
	public void method4663(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat143;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat145;
		this.aFloat143 = local9 * local18 - this.aFloat140 * local15;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat140 = this.aFloat140 * local9 + local18 * local15;
		this.aFloat136 = local21 * local9 - this.aFloat142 * local15;
		this.aFloat145 = local24 * local9 - local15 * this.aFloat141;
		this.aFloat142 = local9 * this.aFloat142 + local15 * local21;
		this.aFloat141 = this.aFloat141 * local9 + local24 * local15;
		this.aFloat135 = local9 * local37 - local15 * this.aFloat144;
		this.aFloat144 = this.aFloat144 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "(I)[F")
	public float[] method4393() {
		Static625.aFloatArray86[0] = this.aFloat143;
		Static625.aFloatArray86[9] = this.aFloat141;
		Static625.aFloatArray86[12] = this.aFloat135;
		Static625.aFloatArray86[1] = this.aFloat140;
		Static625.aFloatArray86[6] = this.aFloat138;
		Static625.aFloatArray86[4] = this.aFloat136;
		Static625.aFloatArray86[10] = this.aFloat146;
		Static625.aFloatArray86[8] = this.aFloat145;
		Static625.aFloatArray86[14] = this.aFloat137;
		Static625.aFloatArray86[13] = this.aFloat144;
		Static625.aFloatArray86[2] = this.aFloat139;
		Static625.aFloatArray86[5] = this.aFloat142;
		return Static625.aFloatArray86;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method4662() {
		@Pc(7) Class30_Sub3 local7 = new Class30_Sub3();
		local7.aFloat135 = this.aFloat135;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat139 = this.aFloat139;
		local7.aFloat140 = this.aFloat140;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat138 = this.aFloat138;
		return local7;
	}

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "(I)V")
	public void method4395() {
		this.aFloat138 = -this.aFloat138;
		this.aFloat140 = -this.aFloat140;
		this.aFloat142 = -this.aFloat142;
		this.aFloat139 = -this.aFloat139;
		this.aFloat146 = -this.aFloat146;
		this.aFloat141 = -this.aFloat141;
		this.aFloat144 = -this.aFloat144;
		this.aFloat137 = -this.aFloat137;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat144);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat137);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat135);
		arg3[0] = (int) (this.aFloat139 * (float) local17 + (float) local24 * this.aFloat143 + (float) local6 * this.aFloat140);
		arg3[2] = (int) (this.aFloat145 * (float) local24 + (float) local6 * this.aFloat141 + this.aFloat146 * (float) local17);
		arg3[1] = (int) ((float) local17 * this.aFloat138 + this.aFloat136 * (float) local24 + (float) local6 * this.aFloat142);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method4653(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class30_Sub3 local6 = (Class30_Sub3) arg0;
		this.aFloat137 = local6.aFloat137;
		this.aFloat142 = local6.aFloat142;
		this.aFloat143 = local6.aFloat143;
		this.aFloat145 = local6.aFloat145;
		this.aFloat135 = local6.aFloat135;
		this.aFloat138 = local6.aFloat138;
		this.aFloat140 = local6.aFloat140;
		this.aFloat144 = local6.aFloat144;
		this.aFloat146 = local6.aFloat146;
		this.aFloat141 = local6.aFloat141;
		this.aFloat139 = local6.aFloat139;
		this.aFloat136 = local6.aFloat136;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	@Override
	public void method4650(@OriginalArg(0) int arg0) {
		this.aFloat142 = 1.0F;
		this.aFloat143 = this.aFloat146 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat145 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		this.aFloat139 = -this.aFloat145;
		this.aFloat136 = this.aFloat135 = this.aFloat140 = this.aFloat141 = this.aFloat144 = this.aFloat138 = this.aFloat137 = 0.0F;
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V")
	@Override
	public void method4654(@OriginalArg(0) int arg0) {
		this.aFloat143 = 1.0F;
		this.aFloat142 = this.aFloat146 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat138 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		this.aFloat141 = -this.aFloat138;
		this.aFloat136 = this.aFloat145 = this.aFloat135 = this.aFloat140 = this.aFloat144 = this.aFloat139 = this.aFloat137 = 0.0F;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "()V")
	@Override
	public void method4665() {
		this.aFloat143 = this.aFloat142 = this.aFloat146 = 1.0F;
		this.aFloat140 = this.aFloat139 = this.aFloat136 = this.aFloat138 = this.aFloat145 = this.aFloat141 = this.aFloat135 = this.aFloat144 = this.aFloat137 = 0.0F;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	@Override
	public void method4651(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub5.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub5.aFloatArray83[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat143;
		@Pc(21) float local21 = this.aFloat136;
		@Pc(24) float local24 = this.aFloat145;
		this.aFloat143 = local18 * local9 + this.aFloat139 * local15;
		@Pc(37) float local37 = this.aFloat135;
		this.aFloat139 = local9 * this.aFloat139 - local15 * local18;
		this.aFloat136 = local9 * local21 + local15 * this.aFloat138;
		this.aFloat138 = this.aFloat138 * local9 - local21 * local15;
		this.aFloat145 = local9 * local24 + this.aFloat146 * local15;
		this.aFloat146 = local9 * this.aFloat146 - local24 * local15;
		this.aFloat135 = this.aFloat137 * local15 + local9 * local37;
		this.aFloat137 = this.aFloat137 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)[F")
	public float[] method4398() {
		Static625.aFloatArray86[14] = 0.0F;
		Static625.aFloatArray86[0] = this.aFloat143;
		Static625.aFloatArray86[13] = 0.0F;
		Static625.aFloatArray86[1] = this.aFloat140;
		Static625.aFloatArray86[12] = 0.0F;
		Static625.aFloatArray86[10] = this.aFloat146;
		Static625.aFloatArray86[5] = this.aFloat142;
		Static625.aFloatArray86[6] = this.aFloat138;
		Static625.aFloatArray86[9] = this.aFloat141;
		Static625.aFloatArray86[2] = this.aFloat139;
		Static625.aFloatArray86[4] = this.aFloat136;
		Static625.aFloatArray86[8] = this.aFloat145;
		return Static625.aFloatArray86;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!bca;I)V")
	public void method4399(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class30_Sub3 local6 = (Class30_Sub3) arg0;
		this.aFloat145 = local6.aFloat139;
		this.aFloat136 = local6.aFloat140;
		this.aFloat143 = local6.aFloat143;
		this.aFloat139 = local6.aFloat145;
		this.aFloat141 = local6.aFloat138;
		this.aFloat140 = local6.aFloat136;
		this.aFloat142 = local6.aFloat142;
		this.aFloat135 = -(local6.aFloat144 * this.aFloat136 + local6.aFloat135 * this.aFloat143 + local6.aFloat137 * this.aFloat145);
		this.aFloat138 = local6.aFloat141;
		this.aFloat146 = local6.aFloat146;
		this.aFloat144 = -(local6.aFloat144 * this.aFloat142 + local6.aFloat135 * this.aFloat140 + local6.aFloat137 * this.aFloat141);
		this.aFloat137 = -(this.aFloat139 * local6.aFloat135 + this.aFloat138 * local6.aFloat144 + local6.aFloat137 * this.aFloat146);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat141 + (float) arg1 * this.aFloat142 + this.aFloat140 * (float) arg0);
		arg3[2] = (int) (this.aFloat138 * (float) arg1 + this.aFloat139 * (float) arg0 + (float) arg2 * this.aFloat146);
		arg3[0] = (int) (this.aFloat136 * (float) arg1 + this.aFloat143 * (float) arg0 + this.aFloat145 * (float) arg2);
	}
}
