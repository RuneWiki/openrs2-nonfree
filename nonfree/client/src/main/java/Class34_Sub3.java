import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!mba", name = "r", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!mba", name = "v", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!mba", name = "z", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!mba", name = "C", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!mba", name = "G", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class34_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!mba", name = "B", descriptor = "(III[I)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat164);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat162);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat165);
		arg3[1] = (int) ((float) local24 * this.aFloat161 + this.aFloat158 * (float) local6 + (float) local13 * this.aFloat166);
		arg3[2] = (int) (this.aFloat160 * (float) local13 + (float) local6 * this.aFloat168 + this.aFloat163 * (float) local24);
		arg3[0] = (int) (this.aFloat169 * (float) local24 + (float) local13 * this.aFloat167 + this.aFloat159 * (float) local6);
	}

	@OriginalMember(owner = "client!mba", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class209_Sub2_Sub1.aFloatArray90[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class209_Sub2_Sub1.aFloatArray89[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class209_Sub2_Sub1.aFloatArray90[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class209_Sub2_Sub1.aFloatArray89[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat158 = local39 * local9;
		this.aFloat163 = local21 * local9;
		this.aFloat161 = -local15;
		this.aFloat160 = local21 * local43 + local39 * local27;
		this.aFloat166 = local33 * local9;
		this.aFloat167 = local39 * -local21 + local43 * local27;
		this.aFloat168 = local47 * local21 + local33 * -local27;
		this.aFloat159 = local27 * local47 + local33 * local21;
		this.aFloat169 = local9 * local27;
		this.aFloat164 = -(this.aFloat168 * (float) arg2) + (float) -arg0 * this.aFloat159 - (float) arg1 * this.aFloat158;
		this.aFloat165 = -((float) arg1 * this.aFloat161) + this.aFloat169 * (float) -arg0 - (float) arg2 * this.aFloat163;
		this.aFloat162 = (float) -arg0 * this.aFloat167 - (float) arg1 * this.aFloat166 - (float) arg2 * this.aFloat160;
	}

	@OriginalMember(owner = "client!mba", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat166;
		@Pc(24) float local24 = this.aFloat160;
		this.aFloat167 = local18 * local9 - local15 * this.aFloat169;
		@Pc(37) float local37 = this.aFloat162;
		this.aFloat166 = local9 * local21 - this.aFloat161 * local15;
		this.aFloat169 = local15 * local18 + this.aFloat169 * local9;
		this.aFloat161 = local9 * this.aFloat161 + local21 * local15;
		this.aFloat160 = local24 * local9 - local15 * this.aFloat163;
		this.aFloat163 = local9 * this.aFloat163 + local15 * local24;
		this.aFloat162 = local9 * local37 - local15 * this.aFloat165;
		this.aFloat165 = this.aFloat165 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!mba", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat164;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat162;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat165;
		arg0[0] = (int) (local21 * this.aFloat167 + this.aFloat159 * local12 + this.aFloat169 * local30);
		arg0[1] = (int) (local12 * this.aFloat158 + this.aFloat166 * local21 + local30 * this.aFloat161);
		arg0[2] = (int) (local30 * this.aFloat163 + local12 * this.aFloat168 + this.aFloat160 * local21);
	}

	@OriginalMember(owner = "client!mba", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat159 = this.aFloat163 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat168 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat158 = this.aFloat164 = this.aFloat167 = this.aFloat160 = this.aFloat162 = this.aFloat161 = this.aFloat165 = 0.0F;
		this.aFloat169 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!mba", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat163 * (float) arg2 + (float) arg1 * this.aFloat161 + this.aFloat169 * (float) arg0);
		arg3[0] = (int) (this.aFloat159 * (float) arg0 + this.aFloat158 * (float) arg1 + this.aFloat168 * (float) arg2);
		arg3[1] = (int) ((float) arg0 * this.aFloat167 + (float) arg1 * this.aFloat166 + this.aFloat160 * (float) arg2);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6215() {
		@Pc(7) Class34_Sub3 local7 = new Class34_Sub3();
		local7.aFloat163 = this.aFloat163;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat162 = this.aFloat162;
		return local7;
	}

	@OriginalMember(owner = "client!mba", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat164 += arg0;
		this.aFloat162 += arg1;
		this.aFloat165 += arg2;
	}

	@OriginalMember(owner = "client!mba", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub3 local6 = (Class34_Sub3) arg0;
		this.aFloat158 = local6.aFloat158;
		this.aFloat168 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
		this.aFloat162 = local6.aFloat162;
		this.aFloat166 = local6.aFloat166;
		this.aFloat161 = local6.aFloat161;
		this.aFloat163 = local6.aFloat163;
		this.aFloat164 = local6.aFloat164;
		this.aFloat160 = local6.aFloat160;
		this.aFloat165 = local6.aFloat165;
		this.aFloat169 = local6.aFloat169;
		this.aFloat159 = local6.aFloat159;
	}

	@OriginalMember(owner = "client!mba", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat167 = this.aFloat169 = this.aFloat158 = this.aFloat161 = this.aFloat168 = this.aFloat160 = this.aFloat164 = this.aFloat162 = this.aFloat165 = 0.0F;
		this.aFloat159 = this.aFloat166 = this.aFloat163 = 1.0F;
	}

	@OriginalMember(owner = "client!mba", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat159 = this.aFloat166 = this.aFloat163 = 1.0F;
		this.aFloat167 = this.aFloat169 = this.aFloat158 = this.aFloat161 = this.aFloat168 = this.aFloat160 = 0.0F;
		this.aFloat165 = arg2;
		this.aFloat164 = arg0;
		this.aFloat162 = arg1;
	}

	@OriginalMember(owner = "client!mba", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat159;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat168;
		this.aFloat159 = this.aFloat169 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat164;
		this.aFloat169 = this.aFloat169 * local9 - local15 * local18;
		this.aFloat158 = this.aFloat161 * local15 + local21 * local9;
		this.aFloat168 = local24 * local9 + this.aFloat163 * local15;
		this.aFloat161 = this.aFloat161 * local9 - local21 * local15;
		this.aFloat164 = local37 * local9 + this.aFloat165 * local15;
		this.aFloat163 = this.aFloat163 * local9 - local15 * local24;
		this.aFloat165 = local9 * this.aFloat165 - local37 * local15;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat158 * (float) arg1 + this.aFloat159 * (float) arg0 + this.aFloat168 * (float) arg2 + this.aFloat164);
		arg3[2] = (int) (this.aFloat165 + (float) arg2 * this.aFloat163 + (float) arg0 * this.aFloat169 + (float) arg1 * this.aFloat161);
		arg3[1] = (int) (this.aFloat162 + (float) arg2 * this.aFloat160 + this.aFloat166 * (float) arg1 + (float) arg0 * this.aFloat167);
	}

	@OriginalMember(owner = "client!mba", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat163 = 1.0F;
		this.aFloat159 = this.aFloat166 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat167 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat158 = -this.aFloat167;
		this.aFloat168 = this.aFloat164 = this.aFloat160 = this.aFloat162 = this.aFloat169 = this.aFloat161 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!mba", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat159 = 1.0F;
		this.aFloat166 = this.aFloat163 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		this.aFloat161 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		this.aFloat160 = -this.aFloat161;
		this.aFloat158 = this.aFloat168 = this.aFloat164 = this.aFloat167 = this.aFloat162 = this.aFloat169 = this.aFloat165 = 0.0F;
	}

	@OriginalMember(owner = "client!mba", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class209_Sub2_Sub1.aFloatArray90[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class209_Sub2_Sub1.aFloatArray89[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat159;
		@Pc(21) float local21 = this.aFloat158;
		@Pc(24) float local24 = this.aFloat168;
		@Pc(27) float local27 = this.aFloat164;
		this.aFloat159 = local18 * local9 - local15 * this.aFloat167;
		this.aFloat158 = local21 * local9 - local15 * this.aFloat166;
		this.aFloat167 = this.aFloat167 * local9 + local18 * local15;
		this.aFloat166 = this.aFloat166 * local9 + local15 * local21;
		this.aFloat168 = local24 * local9 - local15 * this.aFloat160;
		this.aFloat160 = local9 * this.aFloat160 + local15 * local24;
		this.aFloat164 = local9 * local27 - this.aFloat162 * local15;
		this.aFloat162 = local9 * this.aFloat162 + local27 * local15;
	}
}
