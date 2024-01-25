import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class40_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)[F")
	public float[] method1129() {
		Static296.aFloatArray24[8] = this.aFloat18;
		Static296.aFloatArray24[6] = this.aFloat19;
		Static296.aFloatArray24[10] = this.aFloat12;
		Static296.aFloatArray24[1] = this.aFloat15;
		Static296.aFloatArray24[14] = this.aFloat14;
		Static296.aFloatArray24[4] = this.aFloat10;
		Static296.aFloatArray24[2] = this.aFloat9;
		Static296.aFloatArray24[9] = this.aFloat11;
		Static296.aFloatArray24[13] = this.aFloat17;
		Static296.aFloatArray24[5] = this.aFloat20;
		Static296.aFloatArray24[12] = this.aFloat13;
		Static296.aFloatArray24[0] = this.aFloat16;
		return Static296.aFloatArray24;
	}

	@OriginalMember(owner = "client!dj", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat13 += arg0;
		this.aFloat17 += arg1;
		this.aFloat14 += arg2;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class240.aFloatArray29[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class240.aFloatArray30[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat16;
		@Pc(21) float local21 = this.aFloat10;
		@Pc(24) float local24 = this.aFloat18;
		this.aFloat16 = local15 * this.aFloat9 + local18 * local9;
		@Pc(37) float local37 = this.aFloat13;
		this.aFloat9 = local9 * this.aFloat9 - local18 * local15;
		this.aFloat10 = local9 * local21 + local15 * this.aFloat19;
		this.aFloat19 = local9 * this.aFloat19 - local21 * local15;
		this.aFloat18 = local24 * local9 + local15 * this.aFloat12;
		this.aFloat13 = local9 * local37 + this.aFloat14 * local15;
		this.aFloat12 = local9 * this.aFloat12 - local15 * local24;
		this.aFloat14 = this.aFloat14 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)[F")
	public float[] method1130() {
		Static296.aFloatArray24[9] = this.aFloat11;
		Static296.aFloatArray24[5] = this.aFloat20;
		Static296.aFloatArray24[6] = this.aFloat19;
		Static296.aFloatArray24[2] = this.aFloat9;
		Static296.aFloatArray24[13] = 0.0F;
		Static296.aFloatArray24[8] = this.aFloat18;
		Static296.aFloatArray24[0] = this.aFloat16;
		Static296.aFloatArray24[4] = this.aFloat10;
		Static296.aFloatArray24[12] = 0.0F;
		Static296.aFloatArray24[1] = this.aFloat15;
		Static296.aFloatArray24[10] = this.aFloat12;
		Static296.aFloatArray24[14] = 0;
		return Static296.aFloatArray24;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method4635() {
		@Pc(7) Class40_Sub2 local7 = new Class40_Sub2();
		local7.aFloat20 = this.aFloat20;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat15 = this.aFloat15;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat19 = this.aFloat19;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat10 = this.aFloat10;
		local7.aFloat9 = this.aFloat9;
		local7.aFloat12 = this.aFloat12;
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat16 = 1.0F;
		this.aFloat20 = this.aFloat12 = Class240.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat19 = Class240.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat10 = this.aFloat18 = this.aFloat13 = this.aFloat15 = this.aFloat17 = this.aFloat9 = this.aFloat14 = 0.0F;
		this.aFloat11 = -this.aFloat19;
	}

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat16 + (float) arg1 * this.aFloat10 + (float) arg2 * this.aFloat18);
		arg3[1] = (int) ((float) arg2 * this.aFloat11 + (float) arg1 * this.aFloat20 + this.aFloat15 * (float) arg0);
		arg3[2] = (int) ((float) arg2 * this.aFloat12 + this.aFloat19 * (float) arg1 + this.aFloat9 * (float) arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat17 + (float) arg2 * this.aFloat11 + this.aFloat15 * (float) arg0 + this.aFloat20 * (float) arg1);
		arg3[2] = (int) (this.aFloat14 + (float) arg1 * this.aFloat19 + (float) arg0 * this.aFloat9 + (float) arg2 * this.aFloat12);
		arg3[0] = (int) ((float) arg0 * this.aFloat16 + this.aFloat10 * (float) arg1 + this.aFloat18 * (float) arg2 + this.aFloat13);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!ia;)V")
	public void method1132(@OriginalArg(1) Class40 arg0) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg0;
		this.aFloat16 = local6.aFloat16;
		this.aFloat10 = local6.aFloat15;
		this.aFloat18 = local6.aFloat9;
		this.aFloat9 = local6.aFloat18;
		this.aFloat20 = local6.aFloat20;
		this.aFloat15 = local6.aFloat10;
		this.aFloat11 = local6.aFloat19;
		this.aFloat19 = local6.aFloat11;
		this.aFloat13 = -(this.aFloat10 * local6.aFloat17 + this.aFloat16 * local6.aFloat13 + this.aFloat18 * local6.aFloat14);
		this.aFloat12 = local6.aFloat12;
		this.aFloat17 = -(this.aFloat15 * local6.aFloat13 + local6.aFloat17 * this.aFloat20 + this.aFloat11 * local6.aFloat14);
		this.aFloat14 = -(local6.aFloat14 * this.aFloat12 + local6.aFloat13 * this.aFloat9 + local6.aFloat17 * this.aFloat19);
	}

	@OriginalMember(owner = "client!dj", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat15 = this.aFloat9 = this.aFloat10 = this.aFloat19 = this.aFloat18 = this.aFloat11 = this.aFloat13 = this.aFloat17 = this.aFloat14 = 0.0F;
		this.aFloat16 = this.aFloat20 = this.aFloat12 = 1.0F;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFFIIFI)V")
	public void method1133(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		if (arg4 == 0) {
			this.aFloat15 = this.aFloat9 = this.aFloat10 = this.aFloat19 = this.aFloat18 = this.aFloat11 = 0.0F;
			this.aFloat20 = arg0;
			this.aFloat12 = 1.0F;
			this.aFloat16 = arg3;
		} else {
			@Pc(12) float local12 = Class240.aFloatArray29[arg4 & 0x3FFF];
			@Pc(18) float local18 = Class240.aFloatArray30[arg4 & 0x3FFF];
			this.aFloat15 = local18 * (float) arg3;
			this.aFloat10 = -local18 * (float) arg0;
			this.aFloat16 = (float) arg3 * local12;
			this.aFloat9 = this.aFloat19 = this.aFloat18 = this.aFloat11 = 0.0F;
			this.aFloat12 = 1.0F;
			this.aFloat20 = (float) arg0 * local12;
		}
		this.aFloat14 = arg1;
		this.aFloat17 = arg5;
		this.aFloat13 = arg2;
	}

	@OriginalMember(owner = "client!dj", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat12 = 1.0F;
		this.aFloat16 = this.aFloat20 = Class240.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat15 = Class240.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat10 = -this.aFloat15;
		this.aFloat18 = this.aFloat13 = this.aFloat11 = this.aFloat17 = this.aFloat9 = this.aFloat19 = this.aFloat14 = 0.0F;
	}

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class240.aFloatArray29[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class240.aFloatArray30[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class240.aFloatArray29[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class240.aFloatArray30[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class240.aFloatArray29[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class240.aFloatArray30[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat10 = local39 * local9;
		this.aFloat12 = local21 * local9;
		this.aFloat11 = local39 * local27 + local43 * local21;
		this.aFloat19 = -local15;
		this.aFloat16 = local27 * local47 + local21 * local33;
		this.aFloat18 = local47 * local21 + -local27 * local33;
		this.aFloat20 = local9 * local33;
		this.aFloat9 = local27 * local9;
		this.aFloat15 = local43 * local27 + -local21 * local39;
		this.aFloat14 = -(this.aFloat19 * (float) arg1) + (float) -arg0 * this.aFloat9 - this.aFloat12 * (float) arg2;
		this.aFloat13 = (float) -arg0 * this.aFloat16 - this.aFloat10 * (float) arg1 - (float) arg2 * this.aFloat18;
		this.aFloat17 = (float) -arg0 * this.aFloat15 - this.aFloat20 * (float) arg1 - (float) arg2 * this.aFloat11;
	}

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat20 = 1.0F;
		this.aFloat16 = this.aFloat12 = Class240.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat18 = Class240.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat9 = -this.aFloat18;
		this.aFloat10 = this.aFloat13 = this.aFloat15 = this.aFloat11 = this.aFloat17 = this.aFloat19 = this.aFloat14 = 0.0F;
	}

	@OriginalMember(owner = "client!dj", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class40 arg0) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg0;
		this.aFloat19 = local6.aFloat19;
		this.aFloat10 = local6.aFloat10;
		this.aFloat16 = local6.aFloat16;
		this.aFloat20 = local6.aFloat20;
		this.aFloat12 = local6.aFloat12;
		this.aFloat14 = local6.aFloat14;
		this.aFloat15 = local6.aFloat15;
		this.aFloat18 = local6.aFloat18;
		this.aFloat9 = local6.aFloat9;
		this.aFloat17 = local6.aFloat17;
		this.aFloat13 = local6.aFloat13;
		this.aFloat11 = local6.aFloat11;
	}

	@OriginalMember(owner = "client!dj", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat13;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat17;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat14;
		arg0[0] = (int) (this.aFloat16 * local11 + local19 * this.aFloat15 + local27 * this.aFloat9);
		arg0[2] = (int) (local27 * this.aFloat12 + local19 * this.aFloat11 + local11 * this.aFloat18);
		arg0[1] = (int) (this.aFloat19 * local27 + local11 * this.aFloat10 + local19 * this.aFloat20);
	}

	@OriginalMember(owner = "client!dj", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat14 = arg2;
		this.aFloat13 = arg0;
		this.aFloat17 = arg1;
		this.aFloat16 = this.aFloat20 = this.aFloat12 = 1.0F;
		this.aFloat15 = this.aFloat9 = this.aFloat10 = this.aFloat19 = this.aFloat18 = this.aFloat11 = 0.0F;
	}

	@OriginalMember(owner = "client!dj", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class240.aFloatArray29[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class240.aFloatArray30[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat15;
		@Pc(21) float local21 = this.aFloat20;
		@Pc(24) float local24 = this.aFloat11;
		@Pc(27) float local27 = this.aFloat17;
		this.aFloat15 = local18 * local9 - local15 * this.aFloat9;
		this.aFloat20 = local21 * local9 - this.aFloat19 * local15;
		this.aFloat9 = local9 * this.aFloat9 + local18 * local15;
		this.aFloat11 = local9 * local24 - this.aFloat12 * local15;
		this.aFloat19 = this.aFloat19 * local9 + local15 * local21;
		this.aFloat12 = local15 * local24 + this.aFloat12 * local9;
		this.aFloat17 = local27 * local9 - local15 * this.aFloat14;
		this.aFloat14 = this.aFloat14 * local9 + local15 * local27;
	}
}
