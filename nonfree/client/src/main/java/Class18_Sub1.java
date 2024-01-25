import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class18_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!aw", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat5 = 1.0F;
		this.aFloat13 = this.aFloat11 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat7 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat14 = -this.aFloat7;
		this.aFloat15 = this.aFloat10 = this.aFloat4 = this.aFloat12 = this.aFloat6 = this.aFloat9 = this.aFloat8 = 0.0F;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)[F")
	public float[] method425() {
		Static372.aFloatArray40[14] = this.aFloat8;
		Static372.aFloatArray40[8] = this.aFloat10;
		Static372.aFloatArray40[5] = this.aFloat13;
		Static372.aFloatArray40[2] = this.aFloat9;
		Static372.aFloatArray40[1] = this.aFloat12;
		Static372.aFloatArray40[4] = this.aFloat15;
		Static372.aFloatArray40[6] = this.aFloat7;
		Static372.aFloatArray40[9] = this.aFloat14;
		Static372.aFloatArray40[0] = this.aFloat5;
		Static372.aFloatArray40[12] = this.aFloat4;
		Static372.aFloatArray40[10] = this.aFloat11;
		Static372.aFloatArray40[13] = this.aFloat6;
		return Static372.aFloatArray40;
	}

	@OriginalMember(owner = "client!aw", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat4;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat6;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat8;
		arg0[1] = (int) (this.aFloat15 * local11 + local19 * this.aFloat13 + this.aFloat7 * local27);
		arg0[0] = (int) (this.aFloat9 * local27 + local11 * this.aFloat5 + local19 * this.aFloat12);
		arg0[2] = (int) (this.aFloat14 * local19 + local11 * this.aFloat10 + local27 * this.aFloat11);
	}

	@OriginalMember(owner = "client!aw", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat12 = this.aFloat9 = this.aFloat15 = this.aFloat7 = this.aFloat10 = this.aFloat14 = this.aFloat4 = this.aFloat6 = this.aFloat8 = 0.0F;
		this.aFloat5 = this.aFloat13 = this.aFloat11 = 1.0F;
	}

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat9 * (float) arg0 + this.aFloat7 * (float) arg1 + (float) arg2 * this.aFloat11);
		arg3[1] = (int) (this.aFloat13 * (float) arg1 + (float) arg0 * this.aFloat12 + (float) arg2 * this.aFloat14);
		arg3[0] = (int) (this.aFloat10 * (float) arg2 + this.aFloat15 * (float) arg1 + (float) arg0 * this.aFloat5);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method427(@OriginalArg(0) Class18 arg0) {
		@Pc(6) Class18_Sub1 local6 = (Class18_Sub1) arg0;
		this.aFloat10 = local6.aFloat9;
		this.aFloat15 = local6.aFloat12;
		this.aFloat5 = local6.aFloat5;
		this.aFloat13 = local6.aFloat13;
		this.aFloat12 = local6.aFloat15;
		this.aFloat14 = local6.aFloat7;
		this.aFloat9 = local6.aFloat10;
		this.aFloat4 = -(this.aFloat10 * local6.aFloat8 + this.aFloat5 * local6.aFloat4 + local6.aFloat6 * this.aFloat15);
		this.aFloat7 = local6.aFloat14;
		this.aFloat11 = local6.aFloat11;
		this.aFloat6 = -(local6.aFloat8 * this.aFloat14 + local6.aFloat6 * this.aFloat13 + this.aFloat12 * local6.aFloat4);
		this.aFloat8 = -(this.aFloat7 * local6.aFloat6 + local6.aFloat4 * this.aFloat9 + local6.aFloat8 * this.aFloat11);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat6 + this.aFloat13 * (float) arg1 + this.aFloat12 * (float) arg0 + this.aFloat14 * (float) arg2);
		arg3[2] = (int) (this.aFloat8 + this.aFloat7 * (float) arg1 + this.aFloat9 * (float) arg0 + (float) arg2 * this.aFloat11);
		arg3[0] = (int) ((float) arg2 * this.aFloat10 + this.aFloat5 * (float) arg0 + (float) arg1 * this.aFloat15 + this.aFloat4);
	}

	@OriginalMember(owner = "client!aw", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat6 += arg1;
		this.aFloat4 += arg0;
		this.aFloat8 += arg2;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat5;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat10;
		@Pc(27) float local27 = this.aFloat4;
		this.aFloat5 = local15 * this.aFloat9 + local18 * local9;
		this.aFloat15 = local15 * this.aFloat7 + local9 * local21;
		this.aFloat9 = local9 * this.aFloat9 - local18 * local15;
		this.aFloat10 = this.aFloat11 * local15 + local24 * local9;
		this.aFloat7 = this.aFloat7 * local9 - local15 * local21;
		this.aFloat11 = local9 * this.aFloat11 - local24 * local15;
		this.aFloat4 = local27 * local9 + local15 * this.aFloat8;
		this.aFloat8 = local9 * this.aFloat8 - local27 * local15;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BFFIIFI)V")
	public void method430(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat5 = arg5;
			this.aFloat12 = this.aFloat9 = this.aFloat15 = this.aFloat7 = this.aFloat10 = this.aFloat14 = 0.0F;
			this.aFloat11 = 1.0F;
			this.aFloat13 = arg3;
		} else {
			@Pc(42) float local42 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg2 & 0x3FFF];
			@Pc(48) float local48 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg2 & 0x3FFF];
			this.aFloat11 = 1.0F;
			this.aFloat5 = (float) arg5 * local42;
			this.aFloat15 = (float) arg3 * -local48;
			this.aFloat12 = local48 * (float) arg5;
			this.aFloat9 = this.aFloat7 = this.aFloat10 = this.aFloat14 = 0.0F;
			this.aFloat13 = local42 * (float) arg3;
		}
		this.aFloat4 = arg4;
		this.aFloat8 = arg1;
		this.aFloat6 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat5 = this.aFloat13 = this.aFloat11 = 1.0F;
		this.aFloat12 = this.aFloat9 = this.aFloat15 = this.aFloat7 = this.aFloat10 = this.aFloat14 = 0.0F;
		this.aFloat4 = arg0;
		this.aFloat8 = arg2;
		this.aFloat6 = arg1;
	}

	@OriginalMember(owner = "client!aw", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat12 = -local21 * local39 + local43 * local27;
		this.aFloat9 = local27 * local9;
		this.aFloat7 = -local15;
		this.aFloat10 = -local27 * local33 + local21 * local47;
		this.aFloat14 = local21 * local43 + local27 * local39;
		this.aFloat5 = local27 * local47 + local33 * local21;
		this.aFloat15 = local39 * local9;
		this.aFloat11 = local21 * local9;
		this.aFloat13 = local33 * local9;
		this.aFloat6 = (float) -arg0 * this.aFloat12 - (float) arg1 * this.aFloat13 - (float) arg2 * this.aFloat14;
		this.aFloat4 = this.aFloat5 * (float) -arg0 - (float) arg1 * this.aFloat15 - (float) arg2 * this.aFloat10;
		this.aFloat8 = -(this.aFloat11 * (float) arg2) - (float) arg1 * this.aFloat7 + (float) -arg0 * this.aFloat9;
	}

	@OriginalMember(owner = "client!aw", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class18 arg0) {
		@Pc(6) Class18_Sub1 local6 = (Class18_Sub1) arg0;
		this.aFloat7 = local6.aFloat7;
		this.aFloat13 = local6.aFloat13;
		this.aFloat12 = local6.aFloat12;
		this.aFloat15 = local6.aFloat15;
		this.aFloat9 = local6.aFloat9;
		this.aFloat5 = local6.aFloat5;
		this.aFloat11 = local6.aFloat11;
		this.aFloat14 = local6.aFloat14;
		this.aFloat6 = local6.aFloat6;
		this.aFloat4 = local6.aFloat4;
		this.aFloat10 = local6.aFloat10;
		this.aFloat8 = local6.aFloat8;
	}

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat13 = 1.0F;
		this.aFloat5 = this.aFloat11 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat10 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat4 = this.aFloat12 = this.aFloat14 = this.aFloat6 = this.aFloat7 = this.aFloat8 = 0.0F;
		this.aFloat9 = -this.aFloat10;
	}

	@OriginalMember(owner = "client!aw", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat12;
		@Pc(21) float local21 = this.aFloat13;
		@Pc(24) float local24 = this.aFloat14;
		this.aFloat12 = local18 * local9 - this.aFloat9 * local15;
		@Pc(38) float local38 = this.aFloat6;
		this.aFloat9 = local18 * local15 + local9 * this.aFloat9;
		this.aFloat13 = local21 * local9 - local15 * this.aFloat7;
		this.aFloat14 = local9 * local24 - local15 * this.aFloat11;
		this.aFloat7 = local9 * this.aFloat7 + local21 * local15;
		this.aFloat11 = local15 * local24 + local9 * this.aFloat11;
		this.aFloat6 = local9 * local38 - local15 * this.aFloat8;
		this.aFloat8 = this.aFloat8 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4939() {
		@Pc(7) Class18_Sub1 local7 = new Class18_Sub1();
		local7.aFloat5 = this.aFloat5;
		local7.aFloat4 = this.aFloat4;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat15 = this.aFloat15;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat6 = this.aFloat6;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat10 = this.aFloat10;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat7 = this.aFloat7;
		return local7;
	}

	@OriginalMember(owner = "client!aw", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat11 = 1.0F;
		this.aFloat5 = this.aFloat13 = Class26_Sub2_Sub2_Sub2.aFloatArray36[arg0 & 0x3FFF];
		this.aFloat12 = Class26_Sub2_Sub2_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat10 = this.aFloat4 = this.aFloat14 = this.aFloat6 = this.aFloat9 = this.aFloat7 = this.aFloat8 = 0.0F;
		this.aFloat15 = -this.aFloat12;
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)[F")
	public float[] method434() {
		Static372.aFloatArray40[1] = this.aFloat12;
		Static372.aFloatArray40[6] = this.aFloat7;
		Static372.aFloatArray40[12] = 0.0F;
		Static372.aFloatArray40[9] = this.aFloat14;
		Static372.aFloatArray40[4] = this.aFloat15;
		Static372.aFloatArray40[5] = this.aFloat13;
		Static372.aFloatArray40[14] = 0.0F;
		Static372.aFloatArray40[2] = this.aFloat9;
		Static372.aFloatArray40[10] = this.aFloat11;
		Static372.aFloatArray40[0] = this.aFloat5;
		Static372.aFloatArray40[8] = this.aFloat10;
		Static372.aFloatArray40[13] = 0.0F;
		return Static372.aFloatArray40;
	}
}
