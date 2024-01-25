import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class10_Sub3() {
		this.method4224();
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class119.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class119.aFloatArray27[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat108;
		@Pc(21) float local21 = this.aFloat106;
		@Pc(24) float local24 = this.aFloat103;
		@Pc(27) float local27 = this.aFloat102;
		this.aFloat108 = local9 * local18 - this.aFloat99 * local15;
		this.aFloat99 = this.aFloat99 * local9 + local18 * local15;
		this.aFloat106 = local21 * local9 - this.aFloat109 * local15;
		this.aFloat103 = local24 * local9 - this.aFloat107 * local15;
		this.aFloat109 = local21 * local15 + this.aFloat109 * local9;
		this.aFloat107 = local15 * local24 + this.aFloat107 * local9;
		this.aFloat102 = local27 * local9 - this.aFloat101 * local15;
		this.aFloat101 = this.aFloat101 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat101);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat105);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat102);
		arg3[1] = (int) ((float) local24 * this.aFloat106 + (float) local6 * this.aFloat109 + (float) local17 * this.aFloat110);
		arg3[0] = (int) (this.aFloat100 * (float) local17 + (float) local24 * this.aFloat108 + this.aFloat99 * (float) local6);
		arg3[2] = (int) ((float) local6 * this.aFloat107 + (float) local24 * this.aFloat103 + this.aFloat104 * (float) local17);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method4222() {
		@Pc(7) Class10_Sub3 local7 = new Class10_Sub3();
		local7.aFloat102 = this.aFloat102;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat105 = this.aFloat105;
		return local7;
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(I)[F")
	public float[] method2814() {
		Static181.aFloatArray29[0] = this.aFloat108;
		Static181.aFloatArray29[4] = this.aFloat106;
		Static181.aFloatArray29[8] = this.aFloat103;
		Static181.aFloatArray29[12] = 0.0F;
		Static181.aFloatArray29[14] = 0.0F;
		Static181.aFloatArray29[13] = 0.0F;
		Static181.aFloatArray29[2] = this.aFloat100;
		Static181.aFloatArray29[6] = this.aFloat110;
		Static181.aFloatArray29[1] = this.aFloat99;
		Static181.aFloatArray29[5] = this.aFloat109;
		Static181.aFloatArray29[10] = this.aFloat104;
		Static181.aFloatArray29[9] = this.aFloat107;
		return Static181.aFloatArray29;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat100 * (float) arg0 + (float) arg1 * this.aFloat110 + this.aFloat104 * (float) arg2);
		arg3[0] = (int) (this.aFloat103 * (float) arg2 + (float) arg0 * this.aFloat108 + (float) arg1 * this.aFloat106);
		arg3[1] = (int) ((float) arg0 * this.aFloat99 + (float) arg1 * this.aFloat109 + (float) arg2 * this.aFloat107);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0) {
		this.aFloat109 = 1.0F;
		this.aFloat108 = this.aFloat104 = Class119.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat103 = Class119.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat100 = -this.aFloat103;
		this.aFloat106 = this.aFloat102 = this.aFloat99 = this.aFloat107 = this.aFloat101 = this.aFloat110 = this.aFloat105 = 0.0F;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat101 + this.aFloat107 * (float) arg2 + (float) arg0 * this.aFloat99 + (float) arg1 * this.aFloat109);
		arg3[0] = (int) ((float) arg2 * this.aFloat103 + (float) arg0 * this.aFloat108 + this.aFloat106 * (float) arg1 + this.aFloat102);
		arg3[2] = (int) (this.aFloat104 * (float) arg2 + (float) arg1 * this.aFloat110 + this.aFloat100 * (float) arg0 + this.aFloat105);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
	@Override
	public void method4224() {
		this.aFloat99 = this.aFloat100 = this.aFloat106 = this.aFloat110 = this.aFloat103 = this.aFloat107 = this.aFloat102 = this.aFloat101 = this.aFloat105 = 0.0F;
		this.aFloat108 = this.aFloat109 = this.aFloat104 = 1.0F;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!sj;)V")
	public void method2815(@OriginalArg(1) Class10 arg0) {
		@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) arg0;
		this.aFloat106 = local6.aFloat99;
		this.aFloat108 = local6.aFloat108;
		this.aFloat103 = local6.aFloat100;
		this.aFloat109 = local6.aFloat109;
		this.aFloat107 = local6.aFloat110;
		this.aFloat100 = local6.aFloat103;
		this.aFloat99 = local6.aFloat106;
		this.aFloat102 = -(this.aFloat108 * local6.aFloat102 + this.aFloat106 * local6.aFloat101 + this.aFloat103 * local6.aFloat105);
		this.aFloat110 = local6.aFloat107;
		this.aFloat104 = local6.aFloat104;
		this.aFloat101 = -(local6.aFloat101 * this.aFloat109 + local6.aFloat102 * this.aFloat99 + this.aFloat107 * local6.aFloat105);
		this.aFloat105 = -(local6.aFloat101 * this.aFloat110 + local6.aFloat102 * this.aFloat100 + local6.aFloat105 * this.aFloat104);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	@Override
	public void method4218(@OriginalArg(0) int arg0) {
		this.aFloat108 = 1.0F;
		this.aFloat109 = this.aFloat104 = Class119.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat110 = Class119.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat106 = this.aFloat103 = this.aFloat102 = this.aFloat99 = this.aFloat101 = this.aFloat100 = this.aFloat105 = 0.0F;
		this.aFloat107 = -this.aFloat110;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class119.aFloatArray28[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class119.aFloatArray27[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class119.aFloatArray28[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class119.aFloatArray27[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class119.aFloatArray28[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class119.aFloatArray27[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat109 = local9 * local33;
		this.aFloat103 = local33 * -local27 + local47 * local21;
		this.aFloat106 = local39 * local9;
		this.aFloat107 = local43 * local21 + local27 * local39;
		this.aFloat104 = local9 * local21;
		this.aFloat99 = local43 * local27 + -local21 * local39;
		this.aFloat100 = local9 * local27;
		this.aFloat108 = local47 * local27 + local21 * local33;
		this.aFloat110 = -local15;
		this.aFloat101 = -((float) arg1 * this.aFloat109) + this.aFloat99 * (float) -arg0 - (float) arg2 * this.aFloat107;
		this.aFloat105 = -((float) arg2 * this.aFloat104) - (float) arg1 * this.aFloat110 + (float) -arg0 * this.aFloat100;
		this.aFloat102 = -((float) arg2 * this.aFloat103) - (float) arg1 * this.aFloat106 + this.aFloat108 * (float) -arg0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	@Override
	public void method4221(@OriginalArg(0) int arg0) {
		this.aFloat104 = 1.0F;
		this.aFloat108 = this.aFloat109 = Class119.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat99 = Class119.aFloatArray27[arg0 & 0x3FFF];
		this.aFloat103 = this.aFloat102 = this.aFloat107 = this.aFloat101 = this.aFloat100 = this.aFloat110 = this.aFloat105 = 0.0F;
		this.aFloat106 = -this.aFloat99;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	@Override
	public void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat101 += (float) arg1;
		this.aFloat102 += (float) arg0;
		this.aFloat105 += (float) arg2;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	@Override
	public void method4215(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class119.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class119.aFloatArray27[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat108;
		@Pc(21) float local21 = this.aFloat106;
		@Pc(24) float local24 = this.aFloat103;
		@Pc(27) float local27 = this.aFloat102;
		this.aFloat108 = this.aFloat100 * local15 + local9 * local18;
		this.aFloat106 = this.aFloat110 * local15 + local21 * local9;
		this.aFloat100 = local9 * this.aFloat100 - local18 * local15;
		this.aFloat103 = this.aFloat104 * local15 + local9 * local24;
		this.aFloat110 = local9 * this.aFloat110 - local15 * local21;
		this.aFloat102 = local15 * this.aFloat105 + local27 * local9;
		this.aFloat104 = this.aFloat104 * local9 - local24 * local15;
		this.aFloat105 = this.aFloat105 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FIF[FFF)V")
	public void method2817(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg2[0] = arg4 * this.aFloat103 + arg0 * this.aFloat106 + arg3 * this.aFloat108;
		arg2[1] = arg0 * this.aFloat109 + arg3 * this.aFloat99 + arg4 * this.aFloat107;
		@Pc(78) float local78;
		@Pc(62) float local62;
		@Pc(70) float local70;
		@Pc(54) float local54;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local54 = -arg1 / arg3;
			local62 = local54 * this.aFloat99 + this.aFloat101;
			local70 = this.aFloat105 + local54 * this.aFloat100;
			local78 = this.aFloat102 + local54 * this.aFloat108;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local54 = -arg1 / arg0;
			local62 = local54 * this.aFloat109 + this.aFloat101;
			local78 = this.aFloat102 + local54 * this.aFloat106;
			local70 = this.aFloat105 + this.aFloat110 * local54;
		} else {
			local54 = -arg1 / arg4;
			local70 = local54 * this.aFloat104 + this.aFloat105;
			local78 = this.aFloat103 * local54 + this.aFloat102;
			local62 = this.aFloat101 + local54 * this.aFloat107;
		}
		arg2[2] = this.aFloat110 * arg0 + arg3 * this.aFloat100 + arg4 * this.aFloat104;
		arg2[3] = -(arg2[1] * local62 + arg2[0] * local78 + local70 * arg2[2]);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIFFIFI)V")
	public void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat104 = 1.0F;
			this.aFloat108 = (float) arg1;
			this.aFloat109 = (float) arg0;
			this.aFloat99 = this.aFloat100 = this.aFloat106 = this.aFloat110 = this.aFloat103 = this.aFloat107 = 0.0F;
		} else {
			@Pc(11) float local11 = Class119.aFloatArray28[arg5 & 0x3FFF];
			@Pc(17) float local17 = Class119.aFloatArray27[arg5 & 0x3FFF];
			this.aFloat108 = (float) arg1 * local11;
			this.aFloat109 = (float) arg0 * local11;
			this.aFloat99 = (float) arg1 * local17;
			this.aFloat106 = -local17 * (float) arg0;
			this.aFloat104 = 1.0F;
			this.aFloat100 = this.aFloat110 = this.aFloat103 = this.aFloat107 = 0.0F;
		}
		this.aFloat102 = arg2;
		this.aFloat101 = arg3;
		this.aFloat105 = arg4;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)[F")
	public float[] method2819() {
		Static181.aFloatArray29[0] = this.aFloat108;
		Static181.aFloatArray29[14] = this.aFloat105;
		Static181.aFloatArray29[5] = this.aFloat109;
		Static181.aFloatArray29[4] = this.aFloat106;
		Static181.aFloatArray29[8] = this.aFloat103;
		Static181.aFloatArray29[1] = this.aFloat99;
		Static181.aFloatArray29[9] = this.aFloat107;
		Static181.aFloatArray29[12] = this.aFloat102;
		Static181.aFloatArray29[13] = this.aFloat101;
		Static181.aFloatArray29[6] = this.aFloat110;
		Static181.aFloatArray29[10] = this.aFloat104;
		Static181.aFloatArray29[2] = this.aFloat100;
		return Static181.aFloatArray29;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	@Override
	public void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat108 = this.aFloat109 = this.aFloat104 = 1.0F;
		this.aFloat99 = this.aFloat100 = this.aFloat106 = this.aFloat110 = this.aFloat103 = this.aFloat107 = 0.0F;
		this.aFloat105 = (float) arg2;
		this.aFloat102 = (float) arg0;
		this.aFloat101 = (float) arg1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method4212(@OriginalArg(0) Class10 arg0) {
		@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) arg0;
		this.aFloat105 = local6.aFloat105;
		this.aFloat110 = local6.aFloat110;
		this.aFloat101 = local6.aFloat101;
		this.aFloat100 = local6.aFloat100;
		this.aFloat102 = local6.aFloat102;
		this.aFloat99 = local6.aFloat99;
		this.aFloat109 = local6.aFloat109;
		this.aFloat106 = local6.aFloat106;
		this.aFloat108 = local6.aFloat108;
		this.aFloat103 = local6.aFloat103;
		this.aFloat104 = local6.aFloat104;
		this.aFloat107 = local6.aFloat107;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([I)V")
	@Override
	public void method4211(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat102;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat101;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat105;
		arg0[2] = (int) (local21 * this.aFloat107 + this.aFloat103 * local12 + local29 * this.aFloat104);
		arg0[0] = (int) (this.aFloat108 * local12 + local21 * this.aFloat99 + this.aFloat100 * local29);
		arg0[1] = (int) (this.aFloat109 * local21 + this.aFloat106 * local12 + this.aFloat110 * local29);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public void method4213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class119.aFloatArray28[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class119.aFloatArray27[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat99;
		@Pc(21) float local21 = this.aFloat109;
		@Pc(24) float local24 = this.aFloat107;
		this.aFloat99 = local9 * local18 - this.aFloat100 * local15;
		@Pc(37) float local37 = this.aFloat101;
		this.aFloat100 = local18 * local15 + this.aFloat100 * local9;
		this.aFloat109 = local9 * local21 - local15 * this.aFloat110;
		this.aFloat110 = this.aFloat110 * local9 + local21 * local15;
		this.aFloat107 = local24 * local9 - this.aFloat104 * local15;
		this.aFloat104 = local9 * this.aFloat104 + local15 * local24;
		this.aFloat101 = local9 * local37 - local15 * this.aFloat105;
		this.aFloat105 = local15 * local37 + this.aFloat105 * local9;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
	public void method2822() {
		this.aFloat99 = -this.aFloat99;
		this.aFloat107 = -this.aFloat107;
		this.aFloat101 = -this.aFloat101;
		this.aFloat105 = -this.aFloat105;
		this.aFloat100 = -this.aFloat100;
		this.aFloat110 = -this.aFloat110;
		this.aFloat104 = -this.aFloat104;
		this.aFloat109 = -this.aFloat109;
	}
}
