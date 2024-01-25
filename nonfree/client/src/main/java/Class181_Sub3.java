import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class181_Sub3 extends Class181 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "F")
	public float aFloat152;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "F")
	public float aFloat153;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class181_Sub3() {
		this.method6349();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
	@Override
	public void method6349() {
		this.aFloat144 = this.aFloat147 = this.aFloat143 = this.aFloat154 = this.aFloat153 = this.aFloat151 = this.aFloat150 = this.aFloat146 = this.aFloat148 = 0.0F;
		this.aFloat145 = this.aFloat149 = this.aFloat152 = 1.0F;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method6355(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub3 local6 = (Class181_Sub3) arg0;
		this.aFloat153 = local6.aFloat153;
		this.aFloat152 = local6.aFloat152;
		this.aFloat146 = local6.aFloat146;
		this.aFloat154 = local6.aFloat154;
		this.aFloat144 = local6.aFloat144;
		this.aFloat149 = local6.aFloat149;
		this.aFloat151 = local6.aFloat151;
		this.aFloat145 = local6.aFloat145;
		this.aFloat147 = local6.aFloat147;
		this.aFloat150 = local6.aFloat150;
		this.aFloat148 = local6.aFloat148;
		this.aFloat143 = local6.aFloat143;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	@Override
	public void method6351(@OriginalArg(0) int arg0) {
		this.aFloat152 = 1.0F;
		this.aFloat145 = this.aFloat149 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat144 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat143 = -this.aFloat144;
		this.aFloat153 = this.aFloat150 = this.aFloat151 = this.aFloat146 = this.aFloat147 = this.aFloat154 = this.aFloat148 = 0.0F;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	@Override
	public void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat146 += (float) arg1;
		this.aFloat148 += (float) arg2;
		this.aFloat150 += (float) arg0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat145;
		@Pc(21) float local21 = this.aFloat143;
		@Pc(24) float local24 = this.aFloat153;
		this.aFloat145 = local9 * local18 + local15 * this.aFloat147;
		@Pc(37) float local37 = this.aFloat150;
		this.aFloat147 = local9 * this.aFloat147 - local15 * local18;
		this.aFloat143 = local21 * local9 + this.aFloat154 * local15;
		this.aFloat153 = this.aFloat152 * local15 + local9 * local24;
		this.aFloat154 = local9 * this.aFloat154 - local21 * local15;
		this.aFloat150 = local37 * local9 + local15 * this.aFloat148;
		this.aFloat152 = local9 * this.aFloat152 - local15 * local24;
		this.aFloat148 = this.aFloat148 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public void method6343(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat144;
		@Pc(21) float local21 = this.aFloat149;
		@Pc(24) float local24 = this.aFloat151;
		@Pc(27) float local27 = this.aFloat146;
		this.aFloat144 = local9 * local18 - this.aFloat147 * local15;
		this.aFloat147 = local15 * local18 + this.aFloat147 * local9;
		this.aFloat149 = local9 * local21 - this.aFloat154 * local15;
		this.aFloat151 = local24 * local9 - local15 * this.aFloat152;
		this.aFloat154 = local9 * this.aFloat154 + local15 * local21;
		this.aFloat152 = local15 * local24 + this.aFloat152 * local9;
		this.aFloat146 = local9 * local27 - local15 * this.aFloat148;
		this.aFloat148 = local15 * local27 + this.aFloat148 * local9;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat144 = local27 * local43 + local39 * -local21;
		this.aFloat151 = local43 * local21 + local27 * local39;
		this.aFloat145 = local27 * local47 + local21 * local33;
		this.aFloat143 = local9 * local39;
		this.aFloat154 = -local15;
		this.aFloat153 = local21 * local47 + local33 * -local27;
		this.aFloat147 = local9 * local27;
		this.aFloat149 = local9 * local33;
		this.aFloat152 = local21 * local9;
		this.aFloat146 = (float) -arg0 * this.aFloat144 - this.aFloat149 * (float) arg1 - (float) arg2 * this.aFloat151;
		this.aFloat148 = -((float) arg2 * this.aFloat152) + (float) -arg0 * this.aFloat147 - this.aFloat154 * (float) arg1;
		this.aFloat150 = -(this.aFloat153 * (float) arg2) - (float) arg1 * this.aFloat143 + this.aFloat145 * (float) -arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([I)V")
	@Override
	public void method6347(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat150;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat146;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat148;
		arg0[0] = (int) (this.aFloat145 * local11 + this.aFloat144 * local20 + local28 * this.aFloat147);
		arg0[2] = (int) (local28 * this.aFloat152 + local11 * this.aFloat153 + this.aFloat151 * local20);
		arg0[1] = (int) (this.aFloat154 * local28 + local20 * this.aFloat149 + this.aFloat143 * local11);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat152 * (float) arg2 + (float) arg1 * this.aFloat154 + this.aFloat147 * (float) arg0);
		arg3[0] = (int) ((float) arg1 * this.aFloat143 + this.aFloat145 * (float) arg0 + this.aFloat153 * (float) arg2);
		arg3[1] = (int) (this.aFloat144 * (float) arg0 + (float) arg1 * this.aFloat149 + this.aFloat151 * (float) arg2);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat148);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat150);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat146);
		arg3[0] = (int) ((float) local24 * this.aFloat144 + this.aFloat145 * (float) local17 + this.aFloat147 * (float) local10);
		arg3[1] = (int) (this.aFloat149 * (float) local24 + (float) local17 * this.aFloat143 + (float) local10 * this.aFloat154);
		arg3[2] = (int) (this.aFloat152 * (float) local10 + (float) local24 * this.aFloat151 + (float) local17 * this.aFloat153);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat151 * (float) arg2 + (float) arg1 * this.aFloat149 + this.aFloat144 * (float) arg0 + this.aFloat146);
		arg3[0] = (int) ((float) arg0 * this.aFloat145 + this.aFloat143 * (float) arg1 + this.aFloat153 * (float) arg2 + this.aFloat150);
		arg3[2] = (int) (this.aFloat148 + this.aFloat152 * (float) arg2 + this.aFloat147 * (float) arg0 + this.aFloat154 * (float) arg1);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	@Override
	public void method6345(@OriginalArg(0) int arg0) {
		this.aFloat145 = 1.0F;
		this.aFloat149 = this.aFloat152 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat154 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat151 = -this.aFloat154;
		this.aFloat143 = this.aFloat153 = this.aFloat150 = this.aFloat144 = this.aFloat146 = this.aFloat147 = this.aFloat148 = 0.0F;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
	@Override
	public void method6356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat146 = (float) arg1;
		this.aFloat145 = this.aFloat149 = this.aFloat152 = 1.0F;
		this.aFloat148 = (float) arg2;
		this.aFloat150 = (float) arg0;
		this.aFloat144 = this.aFloat147 = this.aFloat143 = this.aFloat154 = this.aFloat153 = this.aFloat151 = 0.0F;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method6350() {
		@Pc(7) Class181_Sub3 local7 = new Class181_Sub3();
		local7.aFloat152 = this.aFloat152;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat147 = this.aFloat147;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat154 = this.aFloat154;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat149 = this.aFloat149;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat143 = this.aFloat143;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat153 = this.aFloat153;
		return local7;
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
	@Override
	public void method6344(@OriginalArg(0) int arg0) {
		this.aFloat149 = 1.0F;
		this.aFloat145 = this.aFloat152 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat153 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat143 = this.aFloat150 = this.aFloat144 = this.aFloat151 = this.aFloat146 = this.aFloat154 = this.aFloat148 = 0.0F;
		this.aFloat147 = -this.aFloat153;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	@Override
	public void method6357(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat145;
		@Pc(21) float local21 = this.aFloat143;
		@Pc(24) float local24 = this.aFloat153;
		this.aFloat145 = local9 * local18 - this.aFloat144 * local15;
		@Pc(37) float local37 = this.aFloat150;
		this.aFloat144 = local15 * local18 + this.aFloat144 * local9;
		this.aFloat143 = local9 * local21 - local15 * this.aFloat149;
		this.aFloat149 = local21 * local15 + local9 * this.aFloat149;
		this.aFloat153 = local24 * local9 - local15 * this.aFloat151;
		this.aFloat151 = local15 * local24 + this.aFloat151 * local9;
		this.aFloat150 = local9 * local37 - this.aFloat146 * local15;
		this.aFloat146 = local37 * local15 + this.aFloat146 * local9;
	}
}
