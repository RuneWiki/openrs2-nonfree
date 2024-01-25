import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "F")
	public float aFloat141;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "F")
	public float aFloat142;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "F")
	public float aFloat143;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "F")
	public float aFloat144;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "F")
	public float aFloat145;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "F")
	public float aFloat147;

	@OriginalMember(owner = "client!po", name = "E", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "F")
	public float aFloat149;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "F")
	public float aFloat150;

	@OriginalMember(owner = "client!po", name = "P", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class17_Sub3() {
		this.method6239();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FI[FFFF)V")
	public void method6244(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(34) float local34;
		@Pc(42) float local42;
		@Pc(50) float local50;
		@Pc(26) float local26;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local26 = -arg3 / arg0;
			local42 = this.aFloat144 + this.aFloat141 * local26;
			local50 = this.aFloat148 * local26 + this.aFloat150;
			local34 = this.aFloat145 * local26 + this.aFloat147;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local26 = -arg3 / arg4;
			local34 = this.aFloat147 + local26 * this.aFloat146;
			local50 = this.aFloat150 + local26 * this.aFloat151;
			local42 = this.aFloat144 + local26 * this.aFloat140;
		} else {
			local26 = -arg3 / arg2;
			local34 = local26 * this.aFloat143 + this.aFloat147;
			local42 = local26 * this.aFloat142 + this.aFloat144;
			local50 = this.aFloat150 + this.aFloat149 * local26;
		}
		arg1[1] = this.aFloat140 * arg4 + arg0 * this.aFloat141 + arg2 * this.aFloat142;
		arg1[2] = arg4 * this.aFloat151 + arg0 * this.aFloat148 + arg2 * this.aFloat149;
		arg1[0] = arg2 * this.aFloat143 + this.aFloat146 * arg4 + this.aFloat145 * arg0;
		arg1[3] = -(local34 * arg1[0] + local42 * arg1[1] + local50 * arg1[2]);
	}

	@OriginalMember(owner = "client!po", name = "h", descriptor = "(I)[F")
	public float[] method6245() {
		Static494.aFloatArray43[1] = this.aFloat141;
		Static494.aFloatArray43[2] = this.aFloat148;
		Static494.aFloatArray43[13] = this.aFloat144;
		Static494.aFloatArray43[10] = this.aFloat149;
		Static494.aFloatArray43[12] = this.aFloat147;
		Static494.aFloatArray43[4] = this.aFloat146;
		Static494.aFloatArray43[0] = this.aFloat145;
		Static494.aFloatArray43[6] = this.aFloat151;
		Static494.aFloatArray43[14] = this.aFloat150;
		Static494.aFloatArray43[9] = this.aFloat142;
		Static494.aFloatArray43[8] = this.aFloat143;
		Static494.aFloatArray43[5] = this.aFloat140;
		return Static494.aFloatArray43;
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0) {
		this.aFloat145 = 1.0F;
		this.aFloat140 = this.aFloat149 = Class336.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat151 = Class336.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat146 = this.aFloat143 = this.aFloat147 = this.aFloat141 = this.aFloat144 = this.aFloat148 = this.aFloat150 = 0.0F;
		this.aFloat142 = -this.aFloat151;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat145 = this.aFloat140 = this.aFloat149 = 1.0F;
		this.aFloat144 = (float) arg1;
		this.aFloat150 = (float) arg2;
		this.aFloat141 = this.aFloat148 = this.aFloat146 = this.aFloat151 = this.aFloat143 = this.aFloat142 = 0.0F;
		this.aFloat147 = (float) arg0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class336.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class336.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class336.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class336.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class336.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class336.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat148 = local27 * local9;
		this.aFloat151 = -local15;
		this.aFloat140 = local9 * local33;
		this.aFloat145 = local27 * local47 + local21 * local33;
		this.aFloat146 = local39 * local9;
		this.aFloat142 = local21 * local43 + local39 * local27;
		this.aFloat143 = local47 * local21 + -local27 * local33;
		this.aFloat149 = local9 * local21;
		this.aFloat141 = local27 * local43 + local39 * -local21;
		this.aFloat144 = -((float) arg1 * this.aFloat140) + this.aFloat141 * (float) -arg0 - (float) arg2 * this.aFloat142;
		this.aFloat150 = -((float) arg1 * this.aFloat151) + (float) -arg0 * this.aFloat148 - this.aFloat149 * (float) arg2;
		this.aFloat147 = -((float) arg2 * this.aFloat143) + this.aFloat145 * (float) -arg0 - this.aFloat146 * (float) arg1;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	@Override
	public void method6234(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class336.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class336.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat145;
		@Pc(21) float local21 = this.aFloat146;
		@Pc(24) float local24 = this.aFloat143;
		this.aFloat145 = local9 * local18 + local15 * this.aFloat148;
		@Pc(37) float local37 = this.aFloat147;
		this.aFloat148 = this.aFloat148 * local9 - local15 * local18;
		this.aFloat146 = this.aFloat151 * local15 + local21 * local9;
		this.aFloat151 = local9 * this.aFloat151 - local21 * local15;
		this.aFloat143 = local24 * local9 + this.aFloat149 * local15;
		this.aFloat147 = local15 * this.aFloat150 + local9 * local37;
		this.aFloat149 = this.aFloat149 * local9 - local15 * local24;
		this.aFloat150 = this.aFloat150 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat149 * (float) arg2 + this.aFloat151 * (float) arg1 + (float) arg0 * this.aFloat148 + this.aFloat150);
		arg3[0] = (int) ((float) arg1 * this.aFloat146 + this.aFloat145 * (float) arg0 + (float) arg2 * this.aFloat143 + this.aFloat147);
		arg3[1] = (int) ((float) arg0 * this.aFloat141 + this.aFloat140 * (float) arg1 + this.aFloat142 * (float) arg2 + this.aFloat144);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method6230() {
		@Pc(7) Class17_Sub3 local7 = new Class17_Sub3();
		local7.aFloat140 = this.aFloat140;
		local7.aFloat142 = this.aFloat142;
		local7.aFloat150 = this.aFloat150;
		local7.aFloat141 = this.aFloat141;
		local7.aFloat148 = this.aFloat148;
		local7.aFloat144 = this.aFloat144;
		local7.aFloat151 = this.aFloat151;
		local7.aFloat147 = this.aFloat147;
		local7.aFloat146 = this.aFloat146;
		local7.aFloat145 = this.aFloat145;
		local7.aFloat149 = this.aFloat149;
		local7.aFloat143 = this.aFloat143;
		return local7;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	@Override
	public void method6227(@OriginalArg(0) int arg0) {
		this.aFloat140 = 1.0F;
		this.aFloat145 = this.aFloat149 = Class336.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat143 = Class336.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat148 = -this.aFloat143;
		this.aFloat146 = this.aFloat147 = this.aFloat141 = this.aFloat142 = this.aFloat144 = this.aFloat151 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat145 * (float) arg0 + this.aFloat146 * (float) arg1 + this.aFloat143 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat149 + (float) arg1 * this.aFloat151 + (float) arg0 * this.aFloat148);
		arg3[1] = (int) (this.aFloat141 * (float) arg0 + this.aFloat140 * (float) arg1 + (float) arg2 * this.aFloat142);
	}

	@OriginalMember(owner = "client!po", name = "k", descriptor = "(I)V")
	public void method6248() {
		this.aFloat149 = -this.aFloat149;
		this.aFloat140 = -this.aFloat140;
		this.aFloat142 = -this.aFloat142;
		this.aFloat141 = -this.aFloat141;
		this.aFloat151 = -this.aFloat151;
		this.aFloat150 = -this.aFloat150;
		this.aFloat144 = -this.aFloat144;
		this.aFloat148 = -this.aFloat148;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat150);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat144);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat147);
		arg3[2] = (int) ((float) local6 * this.aFloat149 + (float) local17 * this.aFloat142 + this.aFloat143 * (float) local24);
		arg3[1] = (int) (this.aFloat151 * (float) local6 + this.aFloat140 * (float) local17 + (float) local24 * this.aFloat146);
		arg3[0] = (int) ((float) local24 * this.aFloat145 + this.aFloat141 * (float) local17 + (float) local6 * this.aFloat148);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method6233(@OriginalArg(0) Class17 arg0) {
		@Pc(6) Class17_Sub3 local6 = (Class17_Sub3) arg0;
		this.aFloat148 = local6.aFloat148;
		this.aFloat145 = local6.aFloat145;
		this.aFloat140 = local6.aFloat140;
		this.aFloat141 = local6.aFloat141;
		this.aFloat151 = local6.aFloat151;
		this.aFloat150 = local6.aFloat150;
		this.aFloat147 = local6.aFloat147;
		this.aFloat143 = local6.aFloat143;
		this.aFloat144 = local6.aFloat144;
		this.aFloat142 = local6.aFloat142;
		this.aFloat149 = local6.aFloat149;
		this.aFloat146 = local6.aFloat146;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBFFIFI)V")
	public void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat140 = (float) arg3;
			this.aFloat145 = (float) arg5;
			this.aFloat149 = 1.0F;
			this.aFloat141 = this.aFloat148 = this.aFloat146 = this.aFloat151 = this.aFloat143 = this.aFloat142 = 0.0F;
		} else {
			@Pc(7) float local7 = Class336.aFloatArray56[arg0 & 0x3FFF];
			@Pc(13) float local13 = Class336.aFloatArray57[arg0 & 0x3FFF];
			this.aFloat149 = 1.0F;
			this.aFloat145 = local7 * (float) arg5;
			this.aFloat141 = local13 * (float) arg5;
			this.aFloat148 = this.aFloat151 = this.aFloat143 = this.aFloat142 = 0.0F;
			this.aFloat146 = (float) arg3 * -local13;
			this.aFloat140 = (float) arg3 * local7;
		}
		this.aFloat150 = arg2;
		this.aFloat144 = arg1;
		this.aFloat147 = arg4;
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class336.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class336.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat145;
		@Pc(21) float local21 = this.aFloat146;
		@Pc(24) float local24 = this.aFloat143;
		@Pc(27) float local27 = this.aFloat147;
		this.aFloat145 = local18 * local9 - local15 * this.aFloat141;
		this.aFloat141 = this.aFloat141 * local9 + local15 * local18;
		this.aFloat146 = local21 * local9 - this.aFloat140 * local15;
		this.aFloat140 = local9 * this.aFloat140 + local21 * local15;
		this.aFloat143 = local9 * local24 - local15 * this.aFloat142;
		this.aFloat142 = local15 * local24 + this.aFloat142 * local9;
		this.aFloat147 = local27 * local9 - local15 * this.aFloat144;
		this.aFloat144 = this.aFloat144 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
	@Override
	public void method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat144 += (float) arg1;
		this.aFloat147 += (float) arg0;
		this.aFloat150 += (float) arg2;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([I)V")
	@Override
	public void method6226(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat147;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat144;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat150;
		arg0[2] = (int) (this.aFloat149 * local28 + local20 * this.aFloat142 + this.aFloat143 * local11);
		arg0[0] = (int) (local28 * this.aFloat148 + this.aFloat141 * local20 + this.aFloat145 * local11);
		arg0[1] = (int) (this.aFloat146 * local11 + this.aFloat140 * local20 + local28 * this.aFloat151);
	}

	@OriginalMember(owner = "client!po", name = "l", descriptor = "(I)[F")
	public float[] method6250() {
		Static494.aFloatArray43[0] = this.aFloat145;
		Static494.aFloatArray43[6] = this.aFloat151;
		Static494.aFloatArray43[13] = 0.0F;
		Static494.aFloatArray43[12] = 0.0F;
		Static494.aFloatArray43[1] = this.aFloat141;
		Static494.aFloatArray43[5] = this.aFloat140;
		Static494.aFloatArray43[4] = this.aFloat146;
		Static494.aFloatArray43[14] = 0.0F;
		Static494.aFloatArray43[9] = this.aFloat142;
		Static494.aFloatArray43[2] = this.aFloat148;
		Static494.aFloatArray43[10] = this.aFloat149;
		Static494.aFloatArray43[8] = this.aFloat143;
		return Static494.aFloatArray43;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	@Override
	public void method6228(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class336.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class336.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat141;
		@Pc(21) float local21 = this.aFloat140;
		@Pc(24) float local24 = this.aFloat142;
		@Pc(27) float local27 = this.aFloat144;
		this.aFloat141 = local18 * local9 - local15 * this.aFloat148;
		this.aFloat140 = local9 * local21 - this.aFloat151 * local15;
		this.aFloat148 = local15 * local18 + this.aFloat148 * local9;
		this.aFloat151 = local9 * this.aFloat151 + local21 * local15;
		this.aFloat142 = local24 * local9 - local15 * this.aFloat149;
		this.aFloat144 = local9 * local27 - local15 * this.aFloat150;
		this.aFloat149 = local24 * local15 + local9 * this.aFloat149;
		this.aFloat150 = local27 * local15 + local9 * this.aFloat150;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!al;B)V")
	public void method6251(@OriginalArg(0) Class17 arg0) {
		@Pc(10) Class17_Sub3 local10 = (Class17_Sub3) arg0;
		this.aFloat146 = local10.aFloat141;
		this.aFloat143 = local10.aFloat148;
		this.aFloat145 = local10.aFloat145;
		this.aFloat140 = local10.aFloat140;
		this.aFloat148 = local10.aFloat143;
		this.aFloat141 = local10.aFloat146;
		this.aFloat142 = local10.aFloat151;
		this.aFloat149 = local10.aFloat149;
		this.aFloat147 = -(local10.aFloat150 * this.aFloat143 + local10.aFloat147 * this.aFloat145 + this.aFloat146 * local10.aFloat144);
		this.aFloat151 = local10.aFloat142;
		this.aFloat144 = -(this.aFloat142 * local10.aFloat150 + this.aFloat140 * local10.aFloat144 + local10.aFloat147 * this.aFloat141);
		this.aFloat150 = -(local10.aFloat147 * this.aFloat148 + this.aFloat151 * local10.aFloat144 + local10.aFloat150 * this.aFloat149);
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	@Override
	public void method6238(@OriginalArg(0) int arg0) {
		this.aFloat149 = 1.0F;
		this.aFloat145 = this.aFloat140 = Class336.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat141 = Class336.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat146 = -this.aFloat141;
		this.aFloat143 = this.aFloat147 = this.aFloat142 = this.aFloat144 = this.aFloat148 = this.aFloat151 = this.aFloat150 = 0.0F;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()V")
	@Override
	public void method6239() {
		this.aFloat145 = this.aFloat140 = this.aFloat149 = 1.0F;
		this.aFloat141 = this.aFloat148 = this.aFloat146 = this.aFloat151 = this.aFloat143 = this.aFloat142 = this.aFloat147 = this.aFloat144 = this.aFloat150 = 0.0F;
	}
}
