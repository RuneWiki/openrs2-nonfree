import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class102_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class212.aFloatArray28[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class212.aFloatArray29[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class212.aFloatArray28[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class212.aFloatArray29[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class212.aFloatArray28[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class212.aFloatArray29[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat106 = local9 * local33;
		this.aFloat109 = local33 * local21 + local27 * local47;
		this.aFloat105 = local43 * local21 + local27 * local39;
		this.aFloat110 = local9 * local39;
		this.aFloat113 = local9 * local27;
		this.aFloat108 = -local15;
		this.aFloat112 = local47 * local21 + local33 * -local27;
		this.aFloat103 = local21 * local9;
		this.aFloat107 = local43 * local27 + -local21 * local39;
		this.aFloat111 = -(this.aFloat108 * (float) arg1) + (float) -arg0 * this.aFloat113 - (float) arg2 * this.aFloat103;
		this.aFloat114 = (float) -arg0 * this.aFloat107 - this.aFloat106 * (float) arg1 - this.aFloat105 * (float) arg2;
		this.aFloat104 = -(this.aFloat110 * (float) arg1) + (float) -arg0 * this.aFloat109 - (float) arg2 * this.aFloat112;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat111 + (float) arg0 * this.aFloat113 + this.aFloat108 * (float) arg1 + this.aFloat103 * (float) arg2);
		arg3[1] = (int) (this.aFloat114 + this.aFloat106 * (float) arg1 + this.aFloat107 * (float) arg0 + this.aFloat105 * (float) arg2);
		arg3[0] = (int) (this.aFloat104 + this.aFloat112 * (float) arg2 + (float) arg1 * this.aFloat110 + this.aFloat109 * (float) arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method4931() {
		@Pc(7) Class102_Sub2 local7 = new Class102_Sub2();
		local7.aFloat113 = this.aFloat113;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat105 = this.aFloat105;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat109 = this.aFloat109;
		return local7;
	}

	@OriginalMember(owner = "client!ik", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.aFloat109 = this.aFloat106 = this.aFloat103 = 1.0F;
		this.aFloat107 = this.aFloat113 = this.aFloat110 = this.aFloat108 = this.aFloat112 = this.aFloat105 = this.aFloat104 = this.aFloat114 = this.aFloat111 = 0.0F;
	}

	@OriginalMember(owner = "client!ik", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat103 = 1.0F;
		this.aFloat109 = this.aFloat106 = Class212.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat107 = Class212.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat112 = this.aFloat104 = this.aFloat105 = this.aFloat114 = this.aFloat113 = this.aFloat108 = this.aFloat111 = 0.0F;
		this.aFloat110 = -this.aFloat107;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)[F")
	public float[] method2654() {
		Static228.aFloatArray15[6] = this.aFloat108;
		Static228.aFloatArray15[12] = 0.0F;
		Static228.aFloatArray15[9] = this.aFloat105;
		Static228.aFloatArray15[5] = this.aFloat106;
		Static228.aFloatArray15[14] = 0.0F;
		Static228.aFloatArray15[2] = this.aFloat113;
		Static228.aFloatArray15[4] = this.aFloat110;
		Static228.aFloatArray15[13] = 0.0F;
		Static228.aFloatArray15[0] = this.aFloat109;
		Static228.aFloatArray15[1] = this.aFloat107;
		Static228.aFloatArray15[10] = this.aFloat103;
		Static228.aFloatArray15[8] = this.aFloat112;
		return Static228.aFloatArray15;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ia;)V")
	public void method2655(@OriginalArg(1) Class102 arg0) {
		@Pc(6) Class102_Sub2 local6 = (Class102_Sub2) arg0;
		this.aFloat110 = local6.aFloat107;
		this.aFloat112 = local6.aFloat113;
		this.aFloat109 = local6.aFloat109;
		this.aFloat113 = local6.aFloat112;
		this.aFloat106 = local6.aFloat106;
		this.aFloat105 = local6.aFloat108;
		this.aFloat107 = local6.aFloat110;
		this.aFloat104 = -(this.aFloat112 * local6.aFloat111 + this.aFloat109 * local6.aFloat104 + this.aFloat110 * local6.aFloat114);
		this.aFloat108 = local6.aFloat105;
		this.aFloat103 = local6.aFloat103;
		this.aFloat114 = -(local6.aFloat104 * this.aFloat107 + local6.aFloat114 * this.aFloat106 + this.aFloat105 * local6.aFloat111);
		this.aFloat111 = -(local6.aFloat111 * this.aFloat103 + this.aFloat108 * local6.aFloat114 + this.aFloat113 * local6.aFloat104);
	}

	@OriginalMember(owner = "client!ik", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat104;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat114;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat111;
		arg0[2] = (int) (local21 * this.aFloat105 + this.aFloat112 * local12 + this.aFloat103 * local30);
		arg0[0] = (int) (local12 * this.aFloat109 + local21 * this.aFloat107 + this.aFloat113 * local30);
		arg0[1] = (int) (local30 * this.aFloat108 + local21 * this.aFloat106 + this.aFloat110 * local12);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class212.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class212.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat109;
		@Pc(21) float local21 = this.aFloat110;
		@Pc(24) float local24 = this.aFloat112;
		this.aFloat109 = local18 * local9 + this.aFloat113 * local15;
		@Pc(37) float local37 = this.aFloat104;
		this.aFloat110 = this.aFloat108 * local15 + local9 * local21;
		this.aFloat113 = local9 * this.aFloat113 - local15 * local18;
		this.aFloat108 = this.aFloat108 * local9 - local15 * local21;
		this.aFloat112 = local24 * local9 + this.aFloat103 * local15;
		this.aFloat104 = local37 * local9 + this.aFloat111 * local15;
		this.aFloat103 = this.aFloat103 * local9 - local15 * local24;
		this.aFloat111 = this.aFloat111 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!ik", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class102 arg0) {
		@Pc(6) Class102_Sub2 local6 = (Class102_Sub2) arg0;
		this.aFloat103 = local6.aFloat103;
		this.aFloat111 = local6.aFloat111;
		this.aFloat105 = local6.aFloat105;
		this.aFloat109 = local6.aFloat109;
		this.aFloat104 = local6.aFloat104;
		this.aFloat106 = local6.aFloat106;
		this.aFloat107 = local6.aFloat107;
		this.aFloat113 = local6.aFloat113;
		this.aFloat110 = local6.aFloat110;
		this.aFloat114 = local6.aFloat114;
		this.aFloat108 = local6.aFloat108;
		this.aFloat112 = local6.aFloat112;
	}

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat103 + (float) arg1 * this.aFloat108 + this.aFloat113 * (float) arg0);
		arg3[1] = (int) ((float) arg1 * this.aFloat106 + this.aFloat107 * (float) arg0 + this.aFloat105 * (float) arg2);
		arg3[0] = (int) ((float) arg1 * this.aFloat110 + (float) arg0 * this.aFloat109 + this.aFloat112 * (float) arg2);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZFIIFF)V")
	public void method2656(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat107 = this.aFloat113 = this.aFloat110 = this.aFloat108 = this.aFloat112 = this.aFloat105 = 0.0F;
			this.aFloat103 = 1.0F;
			this.aFloat109 = arg3;
			this.aFloat106 = arg2;
		} else {
			@Pc(42) float local42 = Class212.aFloatArray28[arg0 & 0x3FFF];
			@Pc(48) float local48 = Class212.aFloatArray29[arg0 & 0x3FFF];
			this.aFloat106 = local42 * (float) arg2;
			this.aFloat109 = (float) arg3 * local42;
			this.aFloat113 = this.aFloat108 = this.aFloat112 = this.aFloat105 = 0.0F;
			this.aFloat110 = -local48 * (float) arg2;
			this.aFloat103 = 1.0F;
			this.aFloat107 = (float) arg3 * local48;
		}
		this.aFloat111 = arg4;
		this.aFloat104 = arg5;
		this.aFloat114 = arg1;
	}

	@OriginalMember(owner = "client!ik", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class212.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class212.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat107;
		@Pc(21) float local21 = this.aFloat106;
		@Pc(24) float local24 = this.aFloat105;
		@Pc(27) float local27 = this.aFloat114;
		this.aFloat107 = local18 * local9 - this.aFloat113 * local15;
		this.aFloat106 = local21 * local9 - local15 * this.aFloat108;
		this.aFloat113 = local15 * local18 + this.aFloat113 * local9;
		this.aFloat105 = local24 * local9 - local15 * this.aFloat103;
		this.aFloat108 = this.aFloat108 * local9 + local15 * local21;
		this.aFloat103 = local15 * local24 + this.aFloat103 * local9;
		this.aFloat114 = local27 * local9 - this.aFloat111 * local15;
		this.aFloat111 = local15 * local27 + this.aFloat111 * local9;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)[F")
	public float[] method2657() {
		Static228.aFloatArray15[5] = this.aFloat106;
		Static228.aFloatArray15[13] = this.aFloat114;
		Static228.aFloatArray15[12] = this.aFloat104;
		Static228.aFloatArray15[8] = this.aFloat112;
		Static228.aFloatArray15[0] = this.aFloat109;
		Static228.aFloatArray15[10] = this.aFloat103;
		Static228.aFloatArray15[1] = this.aFloat107;
		Static228.aFloatArray15[14] = this.aFloat111;
		Static228.aFloatArray15[4] = this.aFloat110;
		Static228.aFloatArray15[2] = this.aFloat113;
		Static228.aFloatArray15[6] = this.aFloat108;
		Static228.aFloatArray15[9] = this.aFloat105;
		return Static228.aFloatArray15;
	}

	@OriginalMember(owner = "client!ik", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.aFloat109 = 1.0F;
		this.aFloat106 = this.aFloat103 = Class212.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat108 = Class212.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat110 = this.aFloat112 = this.aFloat104 = this.aFloat107 = this.aFloat114 = this.aFloat113 = this.aFloat111 = 0.0F;
		this.aFloat105 = -this.aFloat108;
	}

	@OriginalMember(owner = "client!ik", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat111 += arg2;
		this.aFloat114 += arg1;
		this.aFloat104 += arg0;
	}

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat106 = 1.0F;
		this.aFloat109 = this.aFloat103 = Class212.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat112 = Class212.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat110 = this.aFloat104 = this.aFloat107 = this.aFloat105 = this.aFloat114 = this.aFloat108 = this.aFloat111 = 0.0F;
		this.aFloat113 = -this.aFloat112;
	}

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat109 = this.aFloat106 = this.aFloat103 = 1.0F;
		this.aFloat111 = arg2;
		this.aFloat104 = arg0;
		this.aFloat114 = arg1;
		this.aFloat107 = this.aFloat113 = this.aFloat110 = this.aFloat108 = this.aFloat112 = this.aFloat105 = 0.0F;
	}
}
