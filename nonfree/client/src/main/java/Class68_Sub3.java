import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class68_Sub3 extends Class68 {

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "F")
	public float aFloat235;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "F")
	public float aFloat236;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "F")
	public float aFloat237;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "F")
	public float aFloat239;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "F")
	public float aFloat240;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "F")
	public float aFloat241;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "F")
	public float aFloat242;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "F")
	public float aFloat243;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "F")
	public float aFloat244;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "F")
	public float aFloat245;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "F")
	public float aFloat246;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "F")
	public float aFloat247;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class68_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat243 * (float) arg2 + (float) arg0 * this.aFloat235 + this.aFloat236 * (float) arg1 + this.aFloat239);
		arg3[0] = (int) ((float) arg2 * this.aFloat241 + this.aFloat244 * (float) arg0 + this.aFloat237 * (float) arg1 + this.aFloat242);
		arg3[2] = (int) (this.aFloat245 + this.aFloat246 * (float) arg2 + (float) arg1 * this.aFloat247 + this.aFloat240 * (float) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat239 += arg1;
		this.aFloat242 += arg0;
		this.aFloat245 += arg2;
	}

	@OriginalMember(owner = "client!rd", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat244;
		@Pc(21) float local21 = this.aFloat237;
		@Pc(24) float local24 = this.aFloat241;
		this.aFloat244 = local9 * local18 + this.aFloat240 * local15;
		@Pc(37) float local37 = this.aFloat242;
		this.aFloat240 = local9 * this.aFloat240 - local15 * local18;
		this.aFloat237 = this.aFloat247 * local15 + local21 * local9;
		this.aFloat241 = this.aFloat246 * local15 + local9 * local24;
		this.aFloat247 = local9 * this.aFloat247 - local15 * local21;
		this.aFloat242 = local15 * this.aFloat245 + local37 * local9;
		this.aFloat246 = local9 * this.aFloat246 - local24 * local15;
		this.aFloat245 = this.aFloat245 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6462() {
		@Pc(7) Class68_Sub3 local7 = new Class68_Sub3();
		local7.aFloat244 = this.aFloat244;
		local7.aFloat243 = this.aFloat243;
		local7.aFloat237 = this.aFloat237;
		local7.aFloat245 = this.aFloat245;
		local7.aFloat236 = this.aFloat236;
		local7.aFloat239 = this.aFloat239;
		local7.aFloat242 = this.aFloat242;
		local7.aFloat240 = this.aFloat240;
		local7.aFloat247 = this.aFloat247;
		local7.aFloat241 = this.aFloat241;
		local7.aFloat235 = this.aFloat235;
		local7.aFloat246 = this.aFloat246;
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat244;
		@Pc(21) float local21 = this.aFloat237;
		@Pc(24) float local24 = this.aFloat241;
		@Pc(27) float local27 = this.aFloat242;
		this.aFloat244 = local18 * local9 - this.aFloat235 * local15;
		this.aFloat235 = local18 * local15 + local9 * this.aFloat235;
		this.aFloat237 = local9 * local21 - this.aFloat236 * local15;
		this.aFloat241 = local24 * local9 - this.aFloat243 * local15;
		this.aFloat236 = local9 * this.aFloat236 + local15 * local21;
		this.aFloat242 = local27 * local9 - local15 * this.aFloat239;
		this.aFloat243 = local15 * local24 + this.aFloat243 * local9;
		this.aFloat239 = local9 * this.aFloat239 + local15 * local27;
	}

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat235;
		@Pc(21) float local21 = this.aFloat236;
		@Pc(24) float local24 = this.aFloat243;
		@Pc(27) float local27 = this.aFloat239;
		this.aFloat235 = local18 * local9 - local15 * this.aFloat240;
		this.aFloat240 = this.aFloat240 * local9 + local15 * local18;
		this.aFloat236 = local9 * local21 - local15 * this.aFloat247;
		this.aFloat243 = local24 * local9 - this.aFloat246 * local15;
		this.aFloat247 = local15 * local21 + local9 * this.aFloat247;
		this.aFloat246 = local9 * this.aFloat246 + local15 * local24;
		this.aFloat239 = local9 * local27 - this.aFloat245 * local15;
		this.aFloat245 = local15 * local27 + local9 * this.aFloat245;
	}

	@OriginalMember(owner = "client!rd", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat244 = 1.0F;
		this.aFloat236 = this.aFloat246 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat247 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat237 = this.aFloat241 = this.aFloat242 = this.aFloat235 = this.aFloat239 = this.aFloat240 = this.aFloat245 = 0.0F;
		this.aFloat243 = -this.aFloat247;
	}

	@OriginalMember(owner = "client!rd", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat242;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat239;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat245;
		arg0[0] = (int) (local29 * this.aFloat240 + local20 * this.aFloat235 + this.aFloat244 * local11);
		arg0[2] = (int) (local29 * this.aFloat246 + local11 * this.aFloat241 + this.aFloat243 * local20);
		arg0[1] = (int) (this.aFloat236 * local20 + local11 * this.aFloat237 + this.aFloat247 * local29);
	}

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat246 = 1.0F;
		this.aFloat244 = this.aFloat236 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat235 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat237 = -this.aFloat235;
		this.aFloat241 = this.aFloat242 = this.aFloat243 = this.aFloat239 = this.aFloat240 = this.aFloat247 = this.aFloat245 = 0.0F;
	}

	@OriginalMember(owner = "client!rd", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat239 = arg1;
		this.aFloat245 = arg2;
		this.aFloat235 = this.aFloat240 = this.aFloat237 = this.aFloat247 = this.aFloat241 = this.aFloat243 = 0.0F;
		this.aFloat244 = this.aFloat236 = this.aFloat246 = 1.0F;
		this.aFloat242 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class68 arg0) {
		@Pc(6) Class68_Sub3 local6 = (Class68_Sub3) arg0;
		this.aFloat245 = local6.aFloat245;
		this.aFloat242 = local6.aFloat242;
		this.aFloat246 = local6.aFloat246;
		this.aFloat244 = local6.aFloat244;
		this.aFloat239 = local6.aFloat239;
		this.aFloat247 = local6.aFloat247;
		this.aFloat240 = local6.aFloat240;
		this.aFloat243 = local6.aFloat243;
		this.aFloat236 = local6.aFloat236;
		this.aFloat237 = local6.aFloat237;
		this.aFloat235 = local6.aFloat235;
		this.aFloat241 = local6.aFloat241;
	}

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat236 = 1.0F;
		this.aFloat244 = this.aFloat246 = Class56_Sub8.aFloatArray56[arg0 & 0x3FFF];
		this.aFloat241 = Class56_Sub8.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat237 = this.aFloat242 = this.aFloat235 = this.aFloat243 = this.aFloat239 = this.aFloat247 = this.aFloat245 = 0.0F;
		this.aFloat240 = -this.aFloat241;
	}

	@OriginalMember(owner = "client!rd", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class56_Sub8.aFloatArray56[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class56_Sub8.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class56_Sub8.aFloatArray56[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class56_Sub8.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class56_Sub8.aFloatArray56[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class56_Sub8.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat235 = local39 * -local21 + local27 * local43;
		this.aFloat236 = local9 * local33;
		this.aFloat246 = local9 * local21;
		this.aFloat247 = -local15;
		this.aFloat243 = local27 * local39 + local43 * local21;
		this.aFloat244 = local27 * local47 + local21 * local33;
		this.aFloat240 = local9 * local27;
		this.aFloat241 = -local27 * local33 + local47 * local21;
		this.aFloat237 = local39 * local9;
		this.aFloat242 = -(this.aFloat241 * (float) arg2) - this.aFloat237 * (float) arg1 + (float) -arg0 * this.aFloat244;
		this.aFloat239 = -(this.aFloat243 * (float) arg2) - (float) arg1 * this.aFloat236 + this.aFloat235 * (float) -arg0;
		this.aFloat245 = -(this.aFloat246 * (float) arg2) - this.aFloat247 * (float) arg1 + this.aFloat240 * (float) -arg0;
	}

	@OriginalMember(owner = "client!rd", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat236 * (float) arg1 + this.aFloat235 * (float) arg0 + this.aFloat243 * (float) arg2);
		arg3[2] = (int) (this.aFloat246 * (float) arg2 + this.aFloat247 * (float) arg1 + this.aFloat240 * (float) arg0);
		arg3[0] = (int) ((float) arg0 * this.aFloat244 + this.aFloat237 * (float) arg1 + this.aFloat241 * (float) arg2);
	}

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat235 = this.aFloat240 = this.aFloat237 = this.aFloat247 = this.aFloat241 = this.aFloat243 = this.aFloat242 = this.aFloat239 = this.aFloat245 = 0.0F;
		this.aFloat244 = this.aFloat236 = this.aFloat246 = 1.0F;
	}
}
