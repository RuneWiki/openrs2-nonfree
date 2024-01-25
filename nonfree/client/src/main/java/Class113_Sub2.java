import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class113_Sub2 extends Class113 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class113_Sub2() {
		this.method8460();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(FIIFIIF)V")
	public void method5672(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat103 = arg4;
			this.aFloat104 = arg1;
			this.aFloat102 = 1.0F;
			this.aFloat111 = this.aFloat108 = this.aFloat107 = this.aFloat109 = this.aFloat101 = this.aFloat112 = 0.0F;
		} else {
			@Pc(14) float local14 = Class374.aFloatArray81[arg3 & 0x3FFF];
			@Pc(20) float local20 = Class374.aFloatArray80[arg3 & 0x3FFF];
			this.aFloat108 = this.aFloat109 = this.aFloat101 = this.aFloat112 = 0.0F;
			this.aFloat107 = (float) arg1 * -local20;
			this.aFloat103 = (float) arg4 * local14;
			this.aFloat102 = 1.0F;
			this.aFloat104 = (float) arg1 * local14;
			this.aFloat111 = local20 * (float) arg4;
		}
		this.aFloat106 = arg2;
		this.aFloat110 = arg5;
		this.aFloat105 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	@Override
	public void method8454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat110 += arg1;
		this.aFloat106 += arg0;
		this.aFloat105 += arg2;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat108 + this.aFloat109 * (float) arg1 + this.aFloat102 * (float) arg2 + this.aFloat105);
		arg3[1] = (int) (this.aFloat111 * (float) arg0 + this.aFloat104 * (float) arg1 + this.aFloat112 * (float) arg2 + this.aFloat110);
		arg3[0] = (int) ((float) arg2 * this.aFloat101 + (float) arg1 * this.aFloat107 + (float) arg0 * this.aFloat103 + this.aFloat106);
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	@Override
	public void method8461(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class374.aFloatArray81[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class374.aFloatArray80[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat103;
		@Pc(21) float local21 = this.aFloat107;
		@Pc(24) float local24 = this.aFloat101;
		this.aFloat103 = local9 * local18 + this.aFloat108 * local15;
		@Pc(37) float local37 = this.aFloat106;
		this.aFloat108 = local9 * this.aFloat108 - local18 * local15;
		this.aFloat107 = this.aFloat109 * local15 + local21 * local9;
		this.aFloat101 = local9 * local24 + this.aFloat102 * local15;
		this.aFloat109 = this.aFloat109 * local9 - local15 * local21;
		this.aFloat106 = local15 * this.aFloat105 + local37 * local9;
		this.aFloat102 = local9 * this.aFloat102 - local24 * local15;
		this.aFloat105 = this.aFloat105 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	@Override
	public void method8453(@OriginalArg(0) int arg0) {
		this.aFloat102 = 1.0F;
		this.aFloat103 = this.aFloat104 = Class374.aFloatArray81[arg0 & 0x3FFF];
		this.aFloat111 = Class374.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat101 = this.aFloat106 = this.aFloat112 = this.aFloat110 = this.aFloat108 = this.aFloat109 = this.aFloat105 = 0.0F;
		this.aFloat107 = -this.aFloat111;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
	@Override
	public void method8460() {
		this.aFloat103 = this.aFloat104 = this.aFloat102 = 1.0F;
		this.aFloat111 = this.aFloat108 = this.aFloat107 = this.aFloat109 = this.aFloat101 = this.aFloat112 = this.aFloat106 = this.aFloat110 = this.aFloat105 = 0.0F;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method8446() {
		@Pc(7) Class113_Sub2 local7 = new Class113_Sub2();
		local7.aFloat106 = this.aFloat106;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat105 = this.aFloat105;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat103 = this.aFloat103;
		return local7;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	@Override
	public void method8455(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class374.aFloatArray81[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class374.aFloatArray80[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat111;
		@Pc(21) float local21 = this.aFloat104;
		@Pc(24) float local24 = this.aFloat112;
		this.aFloat111 = local18 * local9 - local15 * this.aFloat108;
		@Pc(38) float local38 = this.aFloat110;
		this.aFloat108 = this.aFloat108 * local9 + local15 * local18;
		this.aFloat104 = local9 * local21 - this.aFloat109 * local15;
		this.aFloat109 = local15 * local21 + this.aFloat109 * local9;
		this.aFloat112 = local24 * local9 - local15 * this.aFloat102;
		this.aFloat110 = local9 * local38 - local15 * this.aFloat105;
		this.aFloat102 = local15 * local24 + local9 * this.aFloat102;
		this.aFloat105 = local38 * local15 + this.aFloat105 * local9;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class374.aFloatArray81[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class374.aFloatArray80[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat103;
		@Pc(21) float local21 = this.aFloat107;
		@Pc(24) float local24 = this.aFloat101;
		this.aFloat103 = local9 * local18 - this.aFloat111 * local15;
		@Pc(37) float local37 = this.aFloat106;
		this.aFloat107 = local21 * local9 - this.aFloat104 * local15;
		this.aFloat111 = this.aFloat111 * local9 + local15 * local18;
		this.aFloat101 = local24 * local9 - local15 * this.aFloat112;
		this.aFloat104 = local21 * local15 + local9 * this.aFloat104;
		this.aFloat106 = local37 * local9 - local15 * this.aFloat110;
		this.aFloat112 = local24 * local15 + local9 * this.aFloat112;
		this.aFloat110 = local9 * this.aFloat110 + local37 * local15;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([I)V")
	@Override
	public void method8449(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat106;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat110;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat105;
		arg0[1] = (int) (this.aFloat104 * local20 + this.aFloat107 * local11 + local28 * this.aFloat109);
		arg0[0] = (int) (this.aFloat108 * local28 + this.aFloat103 * local11 + this.aFloat111 * local20);
		arg0[2] = (int) (this.aFloat102 * local28 + this.aFloat112 * local20 + this.aFloat101 * local11);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat102 + (float) arg0 * this.aFloat108 + (float) arg1 * this.aFloat109);
		arg3[0] = (int) ((float) arg1 * this.aFloat107 + (float) arg0 * this.aFloat103 + (float) arg2 * this.aFloat101);
		arg3[1] = (int) ((float) arg1 * this.aFloat104 + this.aFloat111 * (float) arg0 + this.aFloat112 * (float) arg2);
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)[F")
	public float[] method5673() {
		Static498.aFloatArray70[9] = this.aFloat112;
		Static498.aFloatArray70[1] = this.aFloat111;
		Static498.aFloatArray70[0] = this.aFloat103;
		Static498.aFloatArray70[2] = this.aFloat108;
		Static498.aFloatArray70[14] = this.aFloat105;
		Static498.aFloatArray70[4] = this.aFloat107;
		Static498.aFloatArray70[5] = this.aFloat104;
		Static498.aFloatArray70[13] = this.aFloat110;
		Static498.aFloatArray70[12] = this.aFloat106;
		Static498.aFloatArray70[8] = this.aFloat101;
		Static498.aFloatArray70[6] = this.aFloat109;
		Static498.aFloatArray70[10] = this.aFloat102;
		return Static498.aFloatArray70;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	@Override
	public void method8457(@OriginalArg(0) int arg0) {
		this.aFloat103 = 1.0F;
		this.aFloat104 = this.aFloat102 = Class374.aFloatArray81[arg0 & 0x3FFF];
		this.aFloat109 = Class374.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat107 = this.aFloat101 = this.aFloat106 = this.aFloat111 = this.aFloat110 = this.aFloat108 = this.aFloat105 = 0.0F;
		this.aFloat112 = -this.aFloat109;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class374.aFloatArray81[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class374.aFloatArray80[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class374.aFloatArray81[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class374.aFloatArray80[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class374.aFloatArray81[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class374.aFloatArray80[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat107 = local9 * local39;
		this.aFloat112 = local39 * local27 + local21 * local43;
		this.aFloat111 = local43 * local27 + -local21 * local39;
		this.aFloat101 = -local27 * local33 + local21 * local47;
		this.aFloat103 = local21 * local33 + local47 * local27;
		this.aFloat104 = local33 * local9;
		this.aFloat108 = local9 * local27;
		this.aFloat102 = local9 * local21;
		this.aFloat109 = -local15;
		this.aFloat105 = (float) -arg0 * this.aFloat108 - this.aFloat109 * (float) arg1 - this.aFloat102 * (float) arg2;
		this.aFloat110 = -((float) arg2 * this.aFloat112) + (float) -arg0 * this.aFloat111 - this.aFloat104 * (float) arg1;
		this.aFloat106 = -((float) arg1 * this.aFloat107) + (float) -arg0 * this.aFloat103 - this.aFloat101 * (float) arg2;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)[F")
	public float[] method5675() {
		Static498.aFloatArray70[13] = 0.0F;
		Static498.aFloatArray70[4] = this.aFloat107;
		Static498.aFloatArray70[12] = 0.0F;
		Static498.aFloatArray70[6] = this.aFloat109;
		Static498.aFloatArray70[14] = 0.0F;
		Static498.aFloatArray70[10] = this.aFloat102;
		Static498.aFloatArray70[0] = this.aFloat103;
		Static498.aFloatArray70[5] = this.aFloat104;
		Static498.aFloatArray70[2] = this.aFloat108;
		Static498.aFloatArray70[9] = this.aFloat112;
		Static498.aFloatArray70[1] = this.aFloat111;
		Static498.aFloatArray70[8] = this.aFloat101;
		return Static498.aFloatArray70;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat110);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat105);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat106);
		arg3[1] = (int) (this.aFloat104 * (float) local6 + this.aFloat107 * (float) local24 + (float) local17 * this.aFloat109);
		arg3[0] = (int) (this.aFloat103 * (float) local24 + (float) local6 * this.aFloat111 + (float) local17 * this.aFloat108);
		arg3[2] = (int) ((float) local6 * this.aFloat112 + this.aFloat101 * (float) local24 + (float) local17 * this.aFloat102);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat103 = this.aFloat104 = this.aFloat102 = 1.0F;
		this.aFloat110 = arg1;
		this.aFloat111 = this.aFloat108 = this.aFloat107 = this.aFloat109 = this.aFloat101 = this.aFloat112 = 0.0F;
		this.aFloat105 = arg2;
		this.aFloat106 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	@Override
	public void method8459(@OriginalArg(0) int arg0) {
		this.aFloat104 = 1.0F;
		this.aFloat103 = this.aFloat102 = Class374.aFloatArray81[arg0 & 0x3FFF];
		this.aFloat101 = Class374.aFloatArray80[arg0 & 0x3FFF];
		this.aFloat107 = this.aFloat106 = this.aFloat111 = this.aFloat112 = this.aFloat110 = this.aFloat109 = this.aFloat105 = 0.0F;
		this.aFloat108 = -this.aFloat101;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	public void method5676() {
		this.aFloat104 = -this.aFloat104;
		this.aFloat109 = -this.aFloat109;
		this.aFloat110 = -this.aFloat110;
		this.aFloat112 = -this.aFloat112;
		this.aFloat102 = -this.aFloat102;
		this.aFloat108 = -this.aFloat108;
		this.aFloat105 = -this.aFloat105;
		this.aFloat111 = -this.aFloat111;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLclient!tc;)V")
	public void method5677(@OriginalArg(1) Class113 arg0) {
		@Pc(6) Class113_Sub2 local6 = (Class113_Sub2) arg0;
		this.aFloat107 = local6.aFloat111;
		this.aFloat101 = local6.aFloat108;
		this.aFloat103 = local6.aFloat103;
		this.aFloat111 = local6.aFloat107;
		this.aFloat104 = local6.aFloat104;
		this.aFloat112 = local6.aFloat109;
		this.aFloat108 = local6.aFloat101;
		this.aFloat102 = local6.aFloat102;
		this.aFloat106 = -(local6.aFloat105 * this.aFloat101 + this.aFloat107 * local6.aFloat110 + this.aFloat103 * local6.aFloat106);
		this.aFloat109 = local6.aFloat112;
		this.aFloat110 = -(local6.aFloat105 * this.aFloat112 + local6.aFloat110 * this.aFloat104 + local6.aFloat106 * this.aFloat111);
		this.aFloat105 = -(this.aFloat102 * local6.aFloat105 + local6.aFloat110 * this.aFloat109 + this.aFloat108 * local6.aFloat106);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(FF[FBFF)V")
	public void method5678(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[1] = this.aFloat104 * arg3 + this.aFloat111 * arg1 + arg0 * this.aFloat112;
		arg2[2] = arg3 * this.aFloat109 + this.aFloat108 * arg1 + arg0 * this.aFloat102;
		arg2[0] = arg0 * this.aFloat101 + this.aFloat103 * arg1 + arg3 * this.aFloat107;
		@Pc(85) float local85;
		@Pc(93) float local93;
		@Pc(101) float local101;
		@Pc(77) float local77;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local77 = -arg4 / arg1;
			local93 = this.aFloat110 + this.aFloat111 * local77;
			local101 = this.aFloat105 + this.aFloat108 * local77;
			local85 = this.aFloat106 + this.aFloat103 * local77;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local77 = -arg4 / arg3;
			local101 = local77 * this.aFloat109 + this.aFloat105;
			local85 = this.aFloat107 * local77 + this.aFloat106;
			local93 = this.aFloat110 + this.aFloat104 * local77;
		} else {
			local77 = -arg4 / arg0;
			local85 = this.aFloat101 * local77 + this.aFloat106;
			local93 = this.aFloat110 + this.aFloat112 * local77;
			local101 = this.aFloat105 + local77 * this.aFloat102;
		}
		arg2[3] = -(arg2[0] * local85 + local93 * arg2[1] + arg2[2] * local101);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8456(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub2 local6 = (Class113_Sub2) arg0;
		this.aFloat105 = local6.aFloat105;
		this.aFloat103 = local6.aFloat103;
		this.aFloat102 = local6.aFloat102;
		this.aFloat104 = local6.aFloat104;
		this.aFloat107 = local6.aFloat107;
		this.aFloat106 = local6.aFloat106;
		this.aFloat110 = local6.aFloat110;
		this.aFloat101 = local6.aFloat101;
		this.aFloat112 = local6.aFloat112;
		this.aFloat108 = local6.aFloat108;
		this.aFloat109 = local6.aFloat109;
		this.aFloat111 = local6.aFloat111;
	}
}
