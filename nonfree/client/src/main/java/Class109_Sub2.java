import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class109_Sub2() {
		this.method4612();
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat75 * (float) arg2 + this.aFloat74 * (float) arg0 + this.aFloat83 * (float) arg1);
		arg3[0] = (int) (this.aFloat82 * (float) arg2 + (float) arg1 * this.aFloat77 + (float) arg0 * this.aFloat78);
		arg3[1] = (int) (this.aFloat79 * (float) arg0 + this.aFloat80 * (float) arg1 + this.aFloat76 * (float) arg2);
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
	@Override
	public void method4605(@OriginalArg(0) int arg0) {
		this.aFloat80 = 1.0F;
		this.aFloat78 = this.aFloat75 = Class144.aFloatArray43[arg0 & 0x3FFF];
		this.aFloat82 = Class144.aFloatArray44[arg0 & 0x3FFF];
		this.aFloat74 = -this.aFloat82;
		this.aFloat77 = this.aFloat73 = this.aFloat79 = this.aFloat76 = this.aFloat81 = this.aFloat83 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)[F")
	public float[] method3691() {
		Static205.aFloatArray42[1] = this.aFloat79;
		Static205.aFloatArray42[2] = this.aFloat74;
		Static205.aFloatArray42[4] = this.aFloat77;
		Static205.aFloatArray42[0] = this.aFloat78;
		Static205.aFloatArray42[12] = 0.0F;
		Static205.aFloatArray42[6] = this.aFloat83;
		Static205.aFloatArray42[13] = 0.0F;
		Static205.aFloatArray42[8] = this.aFloat82;
		Static205.aFloatArray42[9] = this.aFloat76;
		Static205.aFloatArray42[10] = this.aFloat75;
		Static205.aFloatArray42[5] = this.aFloat80;
		Static205.aFloatArray42[14] = 0.0F;
		return Static205.aFloatArray42;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
	@Override
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat81 += (float) arg1;
		this.aFloat73 += (float) arg0;
		this.aFloat72 += (float) arg2;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class144.aFloatArray43[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class144.aFloatArray44[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class144.aFloatArray43[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class144.aFloatArray44[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class144.aFloatArray43[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class144.aFloatArray44[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat74 = local27 * local9;
		this.aFloat75 = local9 * local21;
		this.aFloat77 = local39 * local9;
		this.aFloat83 = -local15;
		this.aFloat80 = local9 * local33;
		this.aFloat82 = -local27 * local33 + local21 * local47;
		this.aFloat78 = local47 * local27 + local21 * local33;
		this.aFloat76 = local39 * local27 + local21 * local43;
		this.aFloat79 = local39 * -local21 + local27 * local43;
		this.aFloat72 = -(this.aFloat83 * (float) arg1) + this.aFloat74 * (float) -arg0 - this.aFloat75 * (float) arg2;
		this.aFloat73 = -(this.aFloat82 * (float) arg2) - (float) arg1 * this.aFloat77 + (float) -arg0 * this.aFloat78;
		this.aFloat81 = this.aFloat79 * (float) -arg0 - (float) arg1 * this.aFloat80 - (float) arg2 * this.aFloat76;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
	@Override
	public void method4611(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class144.aFloatArray43[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class144.aFloatArray44[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat78;
		@Pc(21) float local21 = this.aFloat77;
		@Pc(24) float local24 = this.aFloat82;
		this.aFloat78 = local18 * local9 - this.aFloat79 * local15;
		@Pc(38) float local38 = this.aFloat73;
		this.aFloat79 = this.aFloat79 * local9 + local18 * local15;
		this.aFloat77 = local9 * local21 - this.aFloat80 * local15;
		this.aFloat82 = local9 * local24 - this.aFloat76 * local15;
		this.aFloat80 = local21 * local15 + this.aFloat80 * local9;
		this.aFloat73 = local38 * local9 - local15 * this.aFloat81;
		this.aFloat76 = local9 * this.aFloat76 + local15 * local24;
		this.aFloat81 = local15 * local38 + this.aFloat81 * local9;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FF[FFFI)V")
	public void method3693(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg2[0] = arg1 * this.aFloat78 + arg0 * this.aFloat77 + this.aFloat82 * arg4;
		@Pc(50) float local50;
		@Pc(58) float local58;
		@Pc(66) float local66;
		@Pc(42) float local42;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local42 = -arg3 / arg1;
			local50 = this.aFloat73 + this.aFloat78 * local42;
			local58 = this.aFloat81 + local42 * this.aFloat79;
			local66 = local42 * this.aFloat74 + this.aFloat72;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local42 = -arg3 / arg0;
			local58 = this.aFloat80 * local42 + this.aFloat81;
			local66 = this.aFloat72 + local42 * this.aFloat83;
			local50 = this.aFloat77 * local42 + this.aFloat73;
		} else {
			local42 = -arg3 / arg4;
			local66 = this.aFloat75 * local42 + this.aFloat72;
			local58 = this.aFloat76 * local42 + this.aFloat81;
			local50 = local42 * this.aFloat82 + this.aFloat73;
		}
		arg2[2] = this.aFloat75 * arg4 + this.aFloat83 * arg0 + this.aFloat74 * arg1;
		arg2[1] = this.aFloat80 * arg0 + arg1 * this.aFloat79 + arg4 * this.aFloat76;
		arg2[3] = -(local50 * arg2[0] + arg2[1] * local58 + local66 * arg2[2]);
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
	public void method3694() {
		this.aFloat81 = -this.aFloat81;
		this.aFloat75 = -this.aFloat75;
		this.aFloat76 = -this.aFloat76;
		this.aFloat74 = -this.aFloat74;
		this.aFloat80 = -this.aFloat80;
		this.aFloat83 = -this.aFloat83;
		this.aFloat72 = -this.aFloat72;
		this.aFloat79 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)[F")
	public float[] method3695() {
		Static205.aFloatArray42[6] = this.aFloat83;
		Static205.aFloatArray42[13] = this.aFloat81;
		Static205.aFloatArray42[4] = this.aFloat77;
		Static205.aFloatArray42[5] = this.aFloat80;
		Static205.aFloatArray42[12] = this.aFloat73;
		Static205.aFloatArray42[9] = this.aFloat76;
		Static205.aFloatArray42[0] = this.aFloat78;
		Static205.aFloatArray42[8] = this.aFloat82;
		Static205.aFloatArray42[1] = this.aFloat79;
		Static205.aFloatArray42[14] = this.aFloat72;
		Static205.aFloatArray42[10] = this.aFloat75;
		Static205.aFloatArray42[2] = this.aFloat74;
		return Static205.aFloatArray42;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method3696(@OriginalArg(0) Class109 arg0) {
		@Pc(15) Class109_Sub2 local15 = (Class109_Sub2) arg0;
		this.aFloat77 = local15.aFloat79;
		this.aFloat78 = local15.aFloat78;
		this.aFloat82 = local15.aFloat74;
		this.aFloat79 = local15.aFloat77;
		this.aFloat76 = local15.aFloat83;
		this.aFloat74 = local15.aFloat82;
		this.aFloat80 = local15.aFloat80;
		this.aFloat83 = local15.aFloat76;
		this.aFloat73 = -(this.aFloat82 * local15.aFloat72 + this.aFloat77 * local15.aFloat81 + this.aFloat78 * local15.aFloat73);
		this.aFloat75 = local15.aFloat75;
		this.aFloat81 = -(local15.aFloat81 * this.aFloat80 + local15.aFloat73 * this.aFloat79 + local15.aFloat72 * this.aFloat76);
		this.aFloat72 = -(local15.aFloat72 * this.aFloat75 + this.aFloat74 * local15.aFloat73 + this.aFloat83 * local15.aFloat81);
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	@Override
	public void method4598(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat78 = this.aFloat80 = Class144.aFloatArray43[arg0 & 0x3FFF];
		this.aFloat79 = Class144.aFloatArray44[arg0 & 0x3FFF];
		this.aFloat82 = this.aFloat73 = this.aFloat76 = this.aFloat81 = this.aFloat74 = this.aFloat83 = this.aFloat72 = 0.0F;
		this.aFloat77 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIFFIF)V")
	public void method3698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat75 = 1.0F;
			this.aFloat78 = (float) arg4;
			this.aFloat80 = (float) arg0;
			this.aFloat79 = this.aFloat74 = this.aFloat77 = this.aFloat83 = this.aFloat82 = this.aFloat76 = 0.0F;
		} else {
			@Pc(7) float local7 = Class144.aFloatArray43[arg1 & 0x3FFF];
			@Pc(13) float local13 = Class144.aFloatArray44[arg1 & 0x3FFF];
			this.aFloat77 = (float) arg0 * -local13;
			this.aFloat79 = local13 * (float) arg4;
			this.aFloat80 = local7 * (float) arg0;
			this.aFloat78 = local7 * (float) arg4;
			this.aFloat75 = 1.0F;
			this.aFloat74 = this.aFloat83 = this.aFloat82 = this.aFloat76 = 0.0F;
		}
		this.aFloat72 = arg3;
		this.aFloat81 = arg2;
		this.aFloat73 = arg5;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat73);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat72);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat81);
		arg3[1] = (int) (this.aFloat83 * (float) local13 + this.aFloat77 * (float) local6 + this.aFloat80 * (float) local24);
		arg3[2] = (int) (this.aFloat75 * (float) local13 + (float) local6 * this.aFloat82 + this.aFloat76 * (float) local24);
		arg3[0] = (int) (this.aFloat74 * (float) local13 + (float) local6 * this.aFloat78 + this.aFloat79 * (float) local24);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method4595(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub2 local6 = (Class109_Sub2) arg0;
		this.aFloat80 = local6.aFloat80;
		this.aFloat73 = local6.aFloat73;
		this.aFloat78 = local6.aFloat78;
		this.aFloat74 = local6.aFloat74;
		this.aFloat81 = local6.aFloat81;
		this.aFloat83 = local6.aFloat83;
		this.aFloat82 = local6.aFloat82;
		this.aFloat77 = local6.aFloat77;
		this.aFloat75 = local6.aFloat75;
		this.aFloat79 = local6.aFloat79;
		this.aFloat72 = local6.aFloat72;
		this.aFloat76 = local6.aFloat76;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
	@Override
	public void method4612() {
		this.aFloat79 = this.aFloat74 = this.aFloat77 = this.aFloat83 = this.aFloat82 = this.aFloat76 = this.aFloat73 = this.aFloat81 = this.aFloat72 = 0.0F;
		this.aFloat78 = this.aFloat80 = this.aFloat75 = 1.0F;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
	@Override
	public void method4608(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class144.aFloatArray43[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class144.aFloatArray44[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat78;
		@Pc(21) float local21 = this.aFloat77;
		@Pc(24) float local24 = this.aFloat82;
		@Pc(27) float local27 = this.aFloat73;
		this.aFloat78 = local18 * local9 + this.aFloat74 * local15;
		this.aFloat77 = local15 * this.aFloat83 + local21 * local9;
		this.aFloat74 = this.aFloat74 * local9 - local15 * local18;
		this.aFloat83 = this.aFloat83 * local9 - local21 * local15;
		this.aFloat82 = this.aFloat75 * local15 + local9 * local24;
		this.aFloat73 = this.aFloat72 * local15 + local9 * local27;
		this.aFloat75 = this.aFloat75 * local9 - local15 * local24;
		this.aFloat72 = local9 * this.aFloat72 - local15 * local27;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method4609() {
		@Pc(7) Class109_Sub2 local7 = new Class109_Sub2();
		local7.aFloat79 = this.aFloat79;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat76 = this.aFloat76;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat75 = this.aFloat75;
		return local7;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	@Override
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat73 = (float) arg0;
		this.aFloat79 = this.aFloat74 = this.aFloat77 = this.aFloat83 = this.aFloat82 = this.aFloat76 = 0.0F;
		this.aFloat72 = (float) arg2;
		this.aFloat78 = this.aFloat80 = this.aFloat75 = 1.0F;
		this.aFloat81 = (float) arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat72 + this.aFloat75 * (float) arg2 + this.aFloat74 * (float) arg0 + (float) arg1 * this.aFloat83);
		arg3[1] = (int) ((float) arg1 * this.aFloat80 + this.aFloat79 * (float) arg0 + (float) arg2 * this.aFloat76 + this.aFloat81);
		arg3[0] = (int) (this.aFloat73 + (float) arg2 * this.aFloat82 + (float) arg1 * this.aFloat77 + this.aFloat78 * (float) arg0);
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
	@Override
	public void method4602(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class144.aFloatArray43[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class144.aFloatArray44[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat79;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat76;
		this.aFloat79 = local9 * local18 - this.aFloat74 * local15;
		@Pc(38) float local38 = this.aFloat81;
		this.aFloat80 = local21 * local9 - this.aFloat83 * local15;
		this.aFloat74 = this.aFloat74 * local9 + local18 * local15;
		this.aFloat76 = local24 * local9 - local15 * this.aFloat75;
		this.aFloat83 = local9 * this.aFloat83 + local21 * local15;
		this.aFloat81 = local38 * local9 - local15 * this.aFloat72;
		this.aFloat75 = local15 * local24 + this.aFloat75 * local9;
		this.aFloat72 = local9 * this.aFloat72 + local38 * local15;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	@Override
	public void method4607(@OriginalArg(0) int arg0) {
		this.aFloat78 = 1.0F;
		this.aFloat80 = this.aFloat75 = Class144.aFloatArray43[arg0 & 0x3FFF];
		this.aFloat83 = Class144.aFloatArray44[arg0 & 0x3FFF];
		this.aFloat77 = this.aFloat82 = this.aFloat73 = this.aFloat79 = this.aFloat81 = this.aFloat74 = this.aFloat72 = 0.0F;
		this.aFloat76 = -this.aFloat83;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([I)V")
	@Override
	public void method4603(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat73;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat81;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat72;
		arg0[0] = (int) (this.aFloat74 * local28 + this.aFloat78 * local11 + this.aFloat79 * local19);
		arg0[1] = (int) (this.aFloat83 * local28 + local19 * this.aFloat80 + this.aFloat77 * local11);
		arg0[2] = (int) (local28 * this.aFloat75 + local11 * this.aFloat82 + local19 * this.aFloat76);
	}
}
