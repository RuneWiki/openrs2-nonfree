import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!kw", name = "A", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!kw", name = "J", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!kw", name = "K", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!kw", name = "N", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
	public Class11_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7214() {
		@Pc(7) Class11_Sub2 local7 = new Class11_Sub2();
		local7.aFloat104 = this.aFloat104;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat105 = this.aFloat105;
		return local7;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!q;B)V")
	public void method4270(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub2 local6 = (Class11_Sub2) arg0;
		this.aFloat114 = local6.aFloat114;
		this.aFloat104 = local6.aFloat111;
		this.aFloat108 = local6.aFloat113;
		this.aFloat113 = local6.aFloat108;
		this.aFloat107 = local6.aFloat112;
		this.aFloat111 = local6.aFloat104;
		this.aFloat109 = local6.aFloat109;
		this.aFloat112 = local6.aFloat107;
		this.aFloat105 = -(local6.aFloat105 * this.aFloat114 + local6.aFloat106 * this.aFloat108 + this.aFloat104 * local6.aFloat103);
		this.aFloat110 = local6.aFloat110;
		this.aFloat106 = -(this.aFloat113 * local6.aFloat105 + local6.aFloat106 * this.aFloat109 + local6.aFloat103 * this.aFloat107);
		this.aFloat103 = -(this.aFloat110 * local6.aFloat103 + local6.aFloat105 * this.aFloat111 + local6.aFloat106 * this.aFloat112);
	}

	@OriginalMember(owner = "client!kw", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat105;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat106;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat103;
		arg0[2] = (int) (local28 * this.aFloat110 + local20 * this.aFloat107 + this.aFloat104 * local11);
		arg0[1] = (int) (this.aFloat112 * local28 + this.aFloat109 * local20 + local11 * this.aFloat108);
		arg0[0] = (int) (this.aFloat114 * local11 + local20 * this.aFloat113 + this.aFloat111 * local28);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)[F")
	public float[] method4271() {
		Static53.aFloatArray8[13] = 0.0F;
		Static53.aFloatArray8[6] = this.aFloat112;
		Static53.aFloatArray8[9] = this.aFloat107;
		Static53.aFloatArray8[2] = this.aFloat111;
		Static53.aFloatArray8[12] = 0.0F;
		Static53.aFloatArray8[1] = this.aFloat113;
		Static53.aFloatArray8[8] = this.aFloat104;
		Static53.aFloatArray8[5] = this.aFloat109;
		Static53.aFloatArray8[0] = this.aFloat114;
		Static53.aFloatArray8[14] = 0.0F;
		Static53.aFloatArray8[10] = this.aFloat110;
		Static53.aFloatArray8[4] = this.aFloat108;
		return Static53.aFloatArray8;
	}

	@OriginalMember(owner = "client!kw", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat106 = arg1;
		this.aFloat105 = arg0;
		this.aFloat114 = this.aFloat109 = this.aFloat110 = 1.0F;
		this.aFloat113 = this.aFloat111 = this.aFloat108 = this.aFloat112 = this.aFloat104 = this.aFloat107 = 0.0F;
		this.aFloat103 = arg2;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	public void method4273() {
		this.aFloat111 = -this.aFloat111;
		this.aFloat107 = -this.aFloat107;
		this.aFloat113 = -this.aFloat113;
		this.aFloat110 = -this.aFloat110;
		this.aFloat112 = -this.aFloat112;
		this.aFloat109 = -this.aFloat109;
		this.aFloat106 = -this.aFloat106;
		this.aFloat103 = -this.aFloat103;
	}

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat113;
		@Pc(21) float local21 = this.aFloat109;
		@Pc(24) float local24 = this.aFloat107;
		@Pc(27) float local27 = this.aFloat106;
		this.aFloat113 = local9 * local18 - local15 * this.aFloat111;
		this.aFloat111 = local18 * local15 + this.aFloat111 * local9;
		this.aFloat109 = local9 * local21 - local15 * this.aFloat112;
		this.aFloat112 = this.aFloat112 * local9 + local21 * local15;
		this.aFloat107 = local24 * local9 - this.aFloat110 * local15;
		this.aFloat106 = local27 * local9 - local15 * this.aFloat103;
		this.aFloat110 = local9 * this.aFloat110 + local24 * local15;
		this.aFloat103 = local27 * local15 + this.aFloat103 * local9;
	}

	@OriginalMember(owner = "client!kw", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat104 + (float) arg0 * this.aFloat114 + this.aFloat108 * (float) arg1);
		arg3[1] = (int) (this.aFloat107 * (float) arg2 + this.aFloat113 * (float) arg0 + this.aFloat109 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat110 + (float) arg1 * this.aFloat112 + (float) arg0 * this.aFloat111);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FBIFFII)V")
	public void method4274(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == 0) {
			this.aFloat110 = 1.0F;
			this.aFloat114 = arg5;
			this.aFloat109 = arg4;
			this.aFloat113 = this.aFloat111 = this.aFloat108 = this.aFloat112 = this.aFloat104 = this.aFloat107 = 0.0F;
		} else {
			@Pc(11) float local11 = Class1.aFloatArray2[arg1 & 0x3FFF];
			@Pc(17) float local17 = Class1.aFloatArray1[arg1 & 0x3FFF];
			this.aFloat113 = local17 * (float) arg5;
			this.aFloat108 = -local17 * (float) arg4;
			this.aFloat111 = this.aFloat112 = this.aFloat104 = this.aFloat107 = 0.0F;
			this.aFloat110 = 1.0F;
			this.aFloat114 = (float) arg5 * local11;
			this.aFloat109 = local11 * (float) arg4;
		}
		this.aFloat103 = arg3;
		this.aFloat106 = arg0;
		this.aFloat105 = arg2;
	}

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat109 = 1.0F;
		this.aFloat114 = this.aFloat110 = Class1.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat104 = Class1.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat111 = -this.aFloat104;
		this.aFloat108 = this.aFloat105 = this.aFloat113 = this.aFloat107 = this.aFloat106 = this.aFloat112 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat106 + this.aFloat107 * (float) arg2 + (float) arg1 * this.aFloat109 + (float) arg0 * this.aFloat113);
		arg3[0] = (int) (this.aFloat114 * (float) arg0 + this.aFloat108 * (float) arg1 + this.aFloat104 * (float) arg2 + this.aFloat105);
		arg3[2] = (int) ((float) arg2 * this.aFloat110 + this.aFloat111 * (float) arg0 + this.aFloat112 * (float) arg1 + this.aFloat103);
	}

	@OriginalMember(owner = "client!kw", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat113 = this.aFloat111 = this.aFloat108 = this.aFloat112 = this.aFloat104 = this.aFloat107 = this.aFloat105 = this.aFloat106 = this.aFloat103 = 0.0F;
		this.aFloat114 = this.aFloat109 = this.aFloat110 = 1.0F;
	}

	@OriginalMember(owner = "client!kw", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat110 = 1.0F;
		this.aFloat114 = this.aFloat109 = Class1.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat113 = Class1.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat108 = -this.aFloat113;
		this.aFloat104 = this.aFloat105 = this.aFloat107 = this.aFloat106 = this.aFloat111 = this.aFloat112 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!kw", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat114;
		@Pc(21) float local21 = this.aFloat108;
		@Pc(24) float local24 = this.aFloat104;
		this.aFloat114 = local18 * local9 - this.aFloat113 * local15;
		@Pc(37) float local37 = this.aFloat105;
		this.aFloat113 = this.aFloat113 * local9 + local15 * local18;
		this.aFloat108 = local21 * local9 - this.aFloat109 * local15;
		this.aFloat109 = this.aFloat109 * local9 + local15 * local21;
		this.aFloat104 = local24 * local9 - this.aFloat107 * local15;
		this.aFloat105 = local9 * local37 - local15 * this.aFloat106;
		this.aFloat107 = this.aFloat107 * local9 + local15 * local24;
		this.aFloat106 = local37 * local15 + this.aFloat106 * local9;
	}

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub2 local6 = (Class11_Sub2) arg0;
		this.aFloat109 = local6.aFloat109;
		this.aFloat113 = local6.aFloat113;
		this.aFloat105 = local6.aFloat105;
		this.aFloat111 = local6.aFloat111;
		this.aFloat107 = local6.aFloat107;
		this.aFloat110 = local6.aFloat110;
		this.aFloat106 = local6.aFloat106;
		this.aFloat112 = local6.aFloat112;
		this.aFloat104 = local6.aFloat104;
		this.aFloat103 = local6.aFloat103;
		this.aFloat114 = local6.aFloat114;
		this.aFloat108 = local6.aFloat108;
	}

	@OriginalMember(owner = "client!kw", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1.aFloatArray2[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1.aFloatArray1[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat114;
		@Pc(21) float local21 = this.aFloat108;
		@Pc(24) float local24 = this.aFloat104;
		this.aFloat114 = local18 * local9 + this.aFloat111 * local15;
		@Pc(37) float local37 = this.aFloat105;
		this.aFloat111 = this.aFloat111 * local9 - local18 * local15;
		this.aFloat108 = local21 * local9 + this.aFloat112 * local15;
		this.aFloat104 = local24 * local9 + this.aFloat110 * local15;
		this.aFloat112 = local9 * this.aFloat112 - local15 * local21;
		this.aFloat110 = local9 * this.aFloat110 - local15 * local24;
		this.aFloat105 = local37 * local9 + this.aFloat103 * local15;
		this.aFloat103 = local9 * this.aFloat103 - local15 * local37;
	}

	@OriginalMember(owner = "client!kw", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1.aFloatArray2[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1.aFloatArray1[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1.aFloatArray2[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1.aFloatArray1[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1.aFloatArray2[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1.aFloatArray1[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat104 = -local27 * local33 + local47 * local21;
		this.aFloat111 = local9 * local27;
		this.aFloat114 = local27 * local47 + local21 * local33;
		this.aFloat108 = local9 * local39;
		this.aFloat113 = local39 * -local21 + local27 * local43;
		this.aFloat107 = local39 * local27 + local21 * local43;
		this.aFloat112 = -local15;
		this.aFloat110 = local9 * local21;
		this.aFloat109 = local9 * local33;
		this.aFloat103 = (float) -arg0 * this.aFloat111 - (float) arg1 * this.aFloat112 - (float) arg2 * this.aFloat110;
		this.aFloat106 = -(this.aFloat107 * (float) arg2) - this.aFloat109 * (float) arg1 + (float) -arg0 * this.aFloat113;
		this.aFloat105 = this.aFloat114 * (float) -arg0 - this.aFloat108 * (float) arg1 - (float) arg2 * this.aFloat104;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)[F")
	public float[] method4276() {
		Static53.aFloatArray8[4] = this.aFloat108;
		Static53.aFloatArray8[1] = this.aFloat113;
		Static53.aFloatArray8[5] = this.aFloat109;
		Static53.aFloatArray8[14] = this.aFloat103;
		Static53.aFloatArray8[10] = this.aFloat110;
		Static53.aFloatArray8[9] = this.aFloat107;
		Static53.aFloatArray8[8] = this.aFloat104;
		Static53.aFloatArray8[6] = this.aFloat112;
		Static53.aFloatArray8[2] = this.aFloat111;
		Static53.aFloatArray8[13] = this.aFloat106;
		Static53.aFloatArray8[12] = this.aFloat105;
		Static53.aFloatArray8[0] = this.aFloat114;
		return Static53.aFloatArray8;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(FFFI[FF)V")
	public void method4277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[2] = arg2 * this.aFloat110 + arg4 * this.aFloat112 + this.aFloat111 * arg1;
		arg3[1] = this.aFloat107 * arg2 + arg4 * this.aFloat109 + this.aFloat113 * arg1;
		arg3[0] = arg2 * this.aFloat104 + this.aFloat114 * arg1 + arg4 * this.aFloat108;
		@Pc(85) float local85;
		@Pc(93) float local93;
		@Pc(101) float local101;
		@Pc(77) float local77;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local77 = -arg0 / arg1;
			local85 = this.aFloat105 + this.aFloat114 * local77;
			local93 = this.aFloat106 + this.aFloat113 * local77;
			local101 = this.aFloat103 + local77 * this.aFloat111;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local77 = -arg0 / arg4;
			local85 = this.aFloat105 + local77 * this.aFloat108;
			local93 = this.aFloat106 + this.aFloat109 * local77;
			local101 = this.aFloat103 + local77 * this.aFloat112;
		} else {
			local77 = -arg0 / arg2;
			local85 = this.aFloat104 * local77 + this.aFloat105;
			local93 = this.aFloat107 * local77 + this.aFloat106;
			local101 = this.aFloat103 + local77 * this.aFloat110;
		}
		arg3[3] = -(local93 * arg3[1] + arg3[0] * local85 + local101 * arg3[2]);
	}

	@OriginalMember(owner = "client!kw", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat114 = 1.0F;
		this.aFloat109 = this.aFloat110 = Class1.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat112 = Class1.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat107 = -this.aFloat112;
		this.aFloat108 = this.aFloat104 = this.aFloat105 = this.aFloat113 = this.aFloat106 = this.aFloat111 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!kw", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat106 += arg1;
		this.aFloat103 += arg2;
		this.aFloat105 += arg0;
	}
}
