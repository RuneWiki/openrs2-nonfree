import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "F")
	public float aFloat2;

	@OriginalMember(owner = "client!afa", name = "t", descriptor = "F")
	public float aFloat3;

	@OriginalMember(owner = "client!afa", name = "A", descriptor = "F")
	public float aFloat4;

	@OriginalMember(owner = "client!afa", name = "C", descriptor = "F")
	public float aFloat5;

	@OriginalMember(owner = "client!afa", name = "F", descriptor = "F")
	public float aFloat6;

	@OriginalMember(owner = "client!afa", name = "G", descriptor = "F")
	public float aFloat7;

	@OriginalMember(owner = "client!afa", name = "K", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!afa", name = "O", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!afa", name = "S", descriptor = "F")
	public float aFloat10;

	@OriginalMember(owner = "client!afa", name = "T", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!afa", name = "ab", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!afa", name = "eb", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "()V")
	public Class11_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!afa", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat7 = 1.0F;
		this.aFloat3 = this.aFloat5 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat8 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat9 = this.aFloat10 = this.aFloat11 = this.aFloat12 = this.aFloat6 = this.aFloat13 = this.aFloat2 = 0.0F;
		this.aFloat4 = -this.aFloat8;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!q;I)V")
	public void method164(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub1 local6 = (Class11_Sub1) arg0;
		this.aFloat11 = local6.aFloat11;
		this.aFloat13 = local6.aFloat13;
		this.aFloat4 = local6.aFloat4;
		this.aFloat7 = local6.aFloat7;
		this.aFloat5 = local6.aFloat5;
		this.aFloat3 = local6.aFloat3;
		this.aFloat12 = 0.0F;
		this.aFloat10 = 0.0F;
		this.aFloat8 = local6.aFloat8;
		this.aFloat9 = local6.aFloat9;
		this.aFloat6 = local6.aFloat6;
		this.aFloat2 = 0.0F;
	}

	@OriginalMember(owner = "client!afa", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat3;
		@Pc(21) float local21 = this.aFloat4;
		@Pc(24) float local24 = this.aFloat9;
		@Pc(27) float local27 = this.aFloat10;
		this.aFloat3 = local9 * local18 - this.aFloat8 * local15;
		this.aFloat8 = local15 * local18 + local9 * this.aFloat8;
		this.aFloat4 = local9 * local21 - this.aFloat5 * local15;
		this.aFloat9 = local24 * local9 - local15 * this.aFloat11;
		this.aFloat5 = local21 * local15 + this.aFloat5 * local9;
		this.aFloat10 = local9 * local27 - local15 * this.aFloat12;
		this.aFloat11 = local9 * this.aFloat11 + local15 * local24;
		this.aFloat12 = this.aFloat12 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FIFF)F")
	public float method165(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat12 + this.aFloat8 * arg2 + this.aFloat5 * arg1 + this.aFloat11 * arg0;
	}

	@OriginalMember(owner = "client!afa", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat8 = this.aFloat6 = this.aFloat4 = this.aFloat13 = this.aFloat9 = this.aFloat11 = this.aFloat10 = this.aFloat12 = this.aFloat2 = 0.0F;
		this.aFloat3 = this.aFloat5 = this.aFloat7 = 1.0F;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7214() {
		@Pc(7) Class11_Sub1 local7 = new Class11_Sub1();
		local7.aFloat9 = this.aFloat9;
		local7.aFloat6 = this.aFloat6;
		local7.aFloat5 = this.aFloat5;
		local7.aFloat4 = this.aFloat4;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat7 = this.aFloat7;
		local7.aFloat8 = this.aFloat8;
		local7.aFloat11 = this.aFloat11;
		local7.aFloat3 = this.aFloat3;
		local7.aFloat2 = this.aFloat2;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat10 = this.aFloat10;
		return local7;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(FIFF)V")
	public void method166(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat11 *= arg2;
		this.aFloat3 *= arg0;
		this.aFloat13 *= arg1;
		this.aFloat4 *= arg0;
		this.aFloat7 *= arg1;
		this.aFloat5 *= arg2;
		this.aFloat8 *= arg2;
		this.aFloat10 *= arg0;
		this.aFloat6 *= arg1;
		this.aFloat2 *= arg1;
		this.aFloat12 *= arg2;
		this.aFloat9 *= arg0;
	}

	@OriginalMember(owner = "client!afa", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat3;
		@Pc(21) float local21 = this.aFloat4;
		@Pc(24) float local24 = this.aFloat9;
		this.aFloat3 = local15 * this.aFloat6 + local18 * local9;
		@Pc(37) float local37 = this.aFloat10;
		this.aFloat4 = local21 * local9 + this.aFloat13 * local15;
		this.aFloat6 = this.aFloat6 * local9 - local18 * local15;
		this.aFloat9 = local9 * local24 + local15 * this.aFloat7;
		this.aFloat13 = local9 * this.aFloat13 - local21 * local15;
		this.aFloat7 = this.aFloat7 * local9 - local15 * local24;
		this.aFloat10 = local9 * local37 + local15 * this.aFloat2;
		this.aFloat2 = this.aFloat2 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!afa", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat3 = 1.0F;
		this.aFloat5 = this.aFloat7 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat13 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat11 = -this.aFloat13;
		this.aFloat4 = this.aFloat9 = this.aFloat10 = this.aFloat8 = this.aFloat12 = this.aFloat6 = this.aFloat2 = 0.0F;
	}

	@OriginalMember(owner = "client!afa", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat2 += arg2;
		this.aFloat12 += arg1;
		this.aFloat10 += arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFIF)F")
	public float method168(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat4 + arg0 * this.aFloat3 + this.aFloat9 * arg1 + this.aFloat10;
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(FIFF)V")
	public void method169(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat8 = this.aFloat6 = this.aFloat4 = this.aFloat13 = this.aFloat9 = this.aFloat11 = 0.0F;
		this.aFloat10 = arg0;
		this.aFloat2 = arg1;
		this.aFloat12 = arg2;
		this.aFloat3 = this.aFloat5 = this.aFloat7 = 1.0F;
	}

	@OriginalMember(owner = "client!afa", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat9 * (float) arg2 + (float) arg1 * this.aFloat4 + (float) arg0 * this.aFloat3);
		arg3[1] = (int) (this.aFloat11 * (float) arg2 + this.aFloat5 * (float) arg1 + this.aFloat8 * (float) arg0);
		arg3[2] = (int) (this.aFloat7 * (float) arg2 + this.aFloat13 * (float) arg1 + this.aFloat6 * (float) arg0);
	}

	@OriginalMember(owner = "client!afa", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub1 local6 = (Class11_Sub1) arg0;
		this.aFloat11 = local6.aFloat11;
		this.aFloat2 = local6.aFloat2;
		this.aFloat7 = local6.aFloat7;
		this.aFloat5 = local6.aFloat5;
		this.aFloat8 = local6.aFloat8;
		this.aFloat10 = local6.aFloat10;
		this.aFloat4 = local6.aFloat4;
		this.aFloat9 = local6.aFloat9;
		this.aFloat12 = local6.aFloat12;
		this.aFloat3 = local6.aFloat3;
		this.aFloat6 = local6.aFloat6;
		this.aFloat13 = local6.aFloat13;
	}

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat5 = 1.0F;
		this.aFloat3 = this.aFloat7 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat9 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat6 = -this.aFloat9;
		this.aFloat4 = this.aFloat10 = this.aFloat8 = this.aFloat11 = this.aFloat12 = this.aFloat13 = this.aFloat2 = 0.0F;
	}

	@OriginalMember(owner = "client!afa", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class295.aFloatArray84[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class295.aFloatArray85[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class295.aFloatArray84[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class295.aFloatArray85[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat8 = local43 * local27 + -local21 * local39;
		this.aFloat5 = local9 * local33;
		this.aFloat4 = local39 * local9;
		this.aFloat9 = -local27 * local33 + local21 * local47;
		this.aFloat6 = local9 * local27;
		this.aFloat3 = local21 * local33 + local47 * local27;
		this.aFloat13 = -local15;
		this.aFloat7 = local21 * local9;
		this.aFloat11 = local39 * local27 + local21 * local43;
		this.aFloat12 = -(this.aFloat11 * (float) arg2) + (float) -arg0 * this.aFloat8 - (float) arg1 * this.aFloat5;
		this.aFloat10 = -(this.aFloat9 * (float) arg2) + this.aFloat3 * (float) -arg0 - (float) arg1 * this.aFloat4;
		this.aFloat2 = -(this.aFloat7 * (float) arg2) - this.aFloat13 * (float) arg1 + this.aFloat6 * (float) -arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "([FB)[F")
	public float[] method170(@OriginalArg(0) float[] arg0) {
		arg0[4] = this.aFloat4;
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat5;
		arg0[10] = this.aFloat7;
		arg0[0] = this.aFloat3;
		arg0[1] = this.aFloat8;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat6;
		arg0[6] = this.aFloat13;
		arg0[14] = this.aFloat2;
		arg0[15] = 1.0F;
		arg0[9] = this.aFloat11;
		arg0[12] = this.aFloat10;
		arg0[13] = this.aFloat12;
		arg0[8] = this.aFloat9;
		return arg0;
	}

	@OriginalMember(owner = "client!afa", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat10;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat12;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat2;
		arg0[0] = (int) (this.aFloat6 * local28 + local11 * this.aFloat3 + this.aFloat8 * local19);
		arg0[1] = (int) (this.aFloat13 * local28 + this.aFloat5 * local19 + this.aFloat4 * local11);
		arg0[2] = (int) (this.aFloat9 * local11 + this.aFloat11 * local19 + this.aFloat7 * local28);
	}

	@OriginalMember(owner = "client!afa", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat8;
		@Pc(21) float local21 = this.aFloat5;
		@Pc(24) float local24 = this.aFloat11;
		@Pc(27) float local27 = this.aFloat12;
		this.aFloat8 = local9 * local18 - local15 * this.aFloat6;
		this.aFloat5 = local21 * local9 - this.aFloat13 * local15;
		this.aFloat6 = local18 * local15 + local9 * this.aFloat6;
		this.aFloat11 = local24 * local9 - this.aFloat7 * local15;
		this.aFloat13 = local15 * local21 + local9 * this.aFloat13;
		this.aFloat7 = this.aFloat7 * local9 + local15 * local24;
		this.aFloat12 = local27 * local9 - this.aFloat2 * local15;
		this.aFloat2 = local27 * local15 + this.aFloat2 * local9;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFBF)V")
	public void method171(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat2 += arg1;
		this.aFloat10 += arg0;
		this.aFloat12 += arg2;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFF[FFI)V")
	public void method172(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4) {
		arg3[1] = arg0 * this.aFloat11 + this.aFloat5 * arg1 + arg2 * this.aFloat8;
		arg3[0] = arg2 * this.aFloat3 + arg1 * this.aFloat4 + this.aFloat9 * arg0;
		arg3[2] = this.aFloat13 * arg1 + arg2 * this.aFloat6 + this.aFloat7 * arg0;
		@Pc(99) float local99;
		@Pc(107) float local107;
		@Pc(91) float local91;
		@Pc(83) float local83;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local83 = -arg4 / arg2;
			local107 = this.aFloat12 + this.aFloat8 * local83;
			local91 = this.aFloat2 + local83 * this.aFloat6;
			local99 = this.aFloat3 * local83 + this.aFloat10;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local83 = -arg4 / arg1;
			local91 = this.aFloat13 * local83 + this.aFloat2;
			local99 = this.aFloat4 * local83 + this.aFloat10;
			local107 = local83 * this.aFloat5 + this.aFloat12;
		} else {
			local83 = -arg4 / arg0;
			local99 = this.aFloat10 + this.aFloat9 * local83;
			local107 = this.aFloat12 + local83 * this.aFloat11;
			local91 = this.aFloat2 + local83 * this.aFloat7;
		}
		arg3[3] = -(arg3[2] * local91 + local99 * arg3[0] + arg3[1] * local107);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "([FFFIF)V")
	public void method173(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat3 * arg2 + this.aFloat4 * arg3 + this.aFloat9 * arg1;
		arg0[1] = arg3 * this.aFloat5 + this.aFloat8 * arg2 + arg1 * this.aFloat11;
		arg0[2] = arg1 * this.aFloat7 + this.aFloat6 * arg2 + this.aFloat13 * arg3;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B[F)[F")
	public float[] method174(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[7] = this.aFloat12;
		arg0[5] = this.aFloat5;
		arg0[0] = this.aFloat3;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat9;
		arg0[6] = this.aFloat11;
		arg0[11] = this.aFloat2;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat8;
		arg0[3] = this.aFloat10;
		arg0[10] = this.aFloat7;
		arg0[8] = this.aFloat6;
		arg0[1] = this.aFloat4;
		arg0[9] = this.aFloat13;
		return arg0;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(B[F)[F")
	public float[] method175(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat9;
		arg0[9] = this.aFloat13;
		arg0[10] = this.aFloat7;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat5;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat6;
		arg0[4] = this.aFloat8;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat4;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat11;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat3;
		arg0[14] = 0.0F;
		arg0[15] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFFFFIFFFF)V")
	public void method176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat12 = 0.0F;
		this.aFloat7 = arg8;
		this.aFloat2 = 0.0F;
		this.aFloat8 = arg2;
		this.aFloat11 = arg4;
		this.aFloat9 = arg0;
		this.aFloat3 = arg5;
		this.aFloat6 = arg6;
		this.aFloat5 = arg7;
		this.aFloat13 = arg3;
		this.aFloat10 = 0.0F;
		this.aFloat4 = arg1;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIFIFF)V")
	public void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat3 = arg3 * 2;
			this.aFloat5 = arg1 * 2;
			this.aFloat10 = (float) -arg3 + arg5;
			this.aFloat12 = (float) -arg1 + arg4;
			this.aFloat2 = arg2;
			this.aFloat7 = 1.0F;
			this.aFloat8 = this.aFloat6 = this.aFloat4 = this.aFloat13 = this.aFloat9 = this.aFloat11 = 0.0F;
			return;
		}
		@Pc(59) float local59 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(65) float local65 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat6 = this.aFloat13 = this.aFloat9 = this.aFloat11 = 0.0F;
		this.aFloat10 = arg5 + (float) (arg3 * 2) * (local65 * 0.5F - local59 * 0.5F);
		this.aFloat12 = arg4 + (float) (arg1 * 2) * (local65 * -0.5F - local59 * 0.5F);
		this.aFloat8 = (float) arg3 * 2.0F * local65;
		this.aFloat4 = local65 * -2.0F * (float) arg1;
		this.aFloat3 = (float) arg3 * local59 * 2.0F;
		this.aFloat2 = arg2;
		this.aFloat7 = 1.0F;
		this.aFloat5 = (float) arg1 * local59 * 2.0F;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z[F)[F")
	public float[] method178(@OriginalArg(1) float[] arg0) {
		arg0[3] = this.aFloat10;
		arg0[4] = this.aFloat8;
		arg0[0] = this.aFloat3;
		arg0[5] = this.aFloat5;
		arg0[1] = this.aFloat4;
		arg0[2] = this.aFloat9;
		arg0[7] = this.aFloat12;
		arg0[6] = this.aFloat11;
		return arg0;
	}

	@OriginalMember(owner = "client!afa", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat10 = arg0;
		this.aFloat8 = this.aFloat6 = this.aFloat4 = this.aFloat13 = this.aFloat9 = this.aFloat11 = 0.0F;
		this.aFloat2 = arg2;
		this.aFloat12 = arg1;
		this.aFloat3 = this.aFloat5 = this.aFloat7 = 1.0F;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "([FB)[F")
	public float[] method179(@OriginalArg(0) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[0] = this.aFloat3;
		arg0[6] = 0.0F;
		arg0[1] = this.aFloat8;
		arg0[8] = this.aFloat10;
		arg0[10] = this.aFloat2;
		arg0[9] = this.aFloat12;
		arg0[5] = this.aFloat5;
		arg0[14] = 0.0F;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat4;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[2] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat10 + (float) arg2 * this.aFloat9 + this.aFloat4 * (float) arg1 + this.aFloat3 * (float) arg0);
		arg3[1] = (int) (this.aFloat12 + this.aFloat8 * (float) arg0 + (float) arg1 * this.aFloat5 + (float) arg2 * this.aFloat11);
		arg3[2] = (int) (this.aFloat2 + (float) arg0 * this.aFloat6 + (float) arg1 * this.aFloat13 + this.aFloat7 * (float) arg2);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!q;)V")
	public void method180(@OriginalArg(1) Class11 arg0) {
		@Pc(9) Class11_Sub1 local9 = (Class11_Sub1) arg0;
		this.aFloat9 = local9.aFloat6;
		this.aFloat3 = local9.aFloat3;
		this.aFloat4 = local9.aFloat8;
		this.aFloat11 = local9.aFloat13;
		this.aFloat6 = local9.aFloat9;
		this.aFloat8 = local9.aFloat4;
		this.aFloat5 = local9.aFloat5;
		this.aFloat10 = -(this.aFloat4 * local9.aFloat12 + this.aFloat3 * local9.aFloat10 + this.aFloat9 * local9.aFloat2);
		this.aFloat7 = local9.aFloat7;
		this.aFloat13 = local9.aFloat11;
		this.aFloat12 = -(local9.aFloat10 * this.aFloat8 + this.aFloat5 * local9.aFloat12 + local9.aFloat2 * this.aFloat11);
		this.aFloat2 = -(local9.aFloat2 * this.aFloat7 + this.aFloat6 * local9.aFloat10 + this.aFloat13 * local9.aFloat12);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	public void method181() {
		this.aFloat13 = -this.aFloat13;
		this.aFloat11 = -this.aFloat11;
		this.aFloat5 = -this.aFloat5;
		this.aFloat12 = -this.aFloat12;
		this.aFloat7 = -this.aFloat7;
		this.aFloat8 = -this.aFloat8;
		this.aFloat2 = -this.aFloat2;
		this.aFloat6 = -this.aFloat6;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method182(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(6) Class11_Sub1 local6 = (Class11_Sub1) arg0;
		@Pc(9) Class11_Sub1 local9 = (Class11_Sub1) arg1;
		this.aFloat3 = local9.aFloat3 * local6.aFloat3 + local6.aFloat4 * local9.aFloat8 + local9.aFloat6 * local6.aFloat9;
		this.aFloat8 = local6.aFloat5 * local9.aFloat8 + local9.aFloat3 * local6.aFloat8 + local6.aFloat11 * local9.aFloat6;
		this.aFloat4 = local6.aFloat3 * local9.aFloat4 + local6.aFloat4 * local9.aFloat5 + local6.aFloat9 * local9.aFloat13;
		this.aFloat6 = local9.aFloat6 * local6.aFloat7 + local6.aFloat13 * local9.aFloat8 + local9.aFloat3 * local6.aFloat6;
		this.aFloat5 = local9.aFloat13 * local6.aFloat11 + local9.aFloat5 * local6.aFloat5 + local9.aFloat4 * local6.aFloat8;
		this.aFloat9 = local9.aFloat7 * local6.aFloat9 + local6.aFloat3 * local9.aFloat9 + local9.aFloat11 * local6.aFloat4;
		this.aFloat13 = local6.aFloat13 * local9.aFloat5 + local9.aFloat4 * local6.aFloat6 + local9.aFloat13 * local6.aFloat7;
		this.aFloat11 = local6.aFloat8 * local9.aFloat9 + local6.aFloat5 * local9.aFloat11 + local6.aFloat11 * local9.aFloat7;
		this.aFloat7 = local9.aFloat7 * local6.aFloat7 + local6.aFloat6 * local9.aFloat9 + local6.aFloat13 * local9.aFloat11;
		this.aFloat10 = local9.aFloat2 * local6.aFloat9 + local9.aFloat10 * local6.aFloat3 + local9.aFloat12 * local6.aFloat4 + local6.aFloat10;
		this.aFloat12 = local6.aFloat12 + local6.aFloat11 * local9.aFloat2 + local6.aFloat8 * local9.aFloat10 + local9.aFloat12 * local6.aFloat5;
		this.aFloat2 = local9.aFloat2 * local6.aFloat7 + local9.aFloat10 * local6.aFloat6 + local9.aFloat12 * local6.aFloat13 + local6.aFloat2;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(Lclient!q;I)V")
	public void method183(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub1 local6 = (Class11_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat3;
		@Pc(18) float local18 = this.aFloat8;
		@Pc(21) float local21 = this.aFloat4;
		@Pc(24) float local24 = this.aFloat5;
		@Pc(27) float local27 = this.aFloat9;
		@Pc(30) float local30 = this.aFloat11;
		@Pc(33) float local33 = this.aFloat10;
		@Pc(36) float local36 = this.aFloat12;
		this.aFloat8 = local6.aFloat11 * this.aFloat6 + local18 * local6.aFloat5 + local9 * local6.aFloat8;
		this.aFloat3 = local6.aFloat9 * this.aFloat6 + local6.aFloat4 * local18 + local6.aFloat3 * local9;
		this.aFloat6 = local9 * local6.aFloat6 + local18 * local6.aFloat13 + local6.aFloat7 * this.aFloat6;
		this.aFloat4 = local6.aFloat4 * local24 + local6.aFloat3 * local21 + local6.aFloat9 * this.aFloat13;
		this.aFloat5 = this.aFloat13 * local6.aFloat11 + local24 * local6.aFloat5 + local6.aFloat8 * local21;
		this.aFloat9 = local30 * local6.aFloat4 + local27 * local6.aFloat3 + this.aFloat7 * local6.aFloat9;
		this.aFloat13 = local6.aFloat6 * local21 + local6.aFloat13 * local24 + this.aFloat13 * local6.aFloat7;
		this.aFloat11 = local6.aFloat11 * this.aFloat7 + local30 * local6.aFloat5 + local6.aFloat8 * local27;
		this.aFloat12 = local6.aFloat12 + this.aFloat2 * local6.aFloat11 + local6.aFloat5 * local36 + local6.aFloat8 * local33;
		this.aFloat10 = local6.aFloat3 * local33 + local36 * local6.aFloat4 + local6.aFloat9 * this.aFloat2 + local6.aFloat10;
		this.aFloat7 = local6.aFloat7 * this.aFloat7 + local30 * local6.aFloat13 + local27 * local6.aFloat6;
		this.aFloat2 = local6.aFloat7 * this.aFloat2 + local6.aFloat6 * local33 + local36 * local6.aFloat13 + local6.aFloat2;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FBFF)V")
	public void method184(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat2 = 0.0F;
		this.aFloat4 = 0.0F;
		this.aFloat5 = arg1;
		this.aFloat7 = arg2;
		this.aFloat9 = 0.0F;
		this.aFloat11 = 0.0F;
		this.aFloat3 = arg0;
		this.aFloat10 = 0.0F;
		this.aFloat6 = 0.0F;
		this.aFloat12 = 0.0F;
		this.aFloat13 = 0.0F;
		this.aFloat8 = 0.0F;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IFFF)F")
	public float method185(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat13 + arg0 * this.aFloat6 + this.aFloat7 * arg1 + this.aFloat2;
	}
}
