import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "F")
	public float aFloat27;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "F")
	public float aFloat28;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class26_Sub1() {
		this.method6459();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	@Override
	public void method6459() {
		this.aFloat22 = this.aFloat20 = this.aFloat26 = this.aFloat28 = this.aFloat19 = this.aFloat27 = this.aFloat23 = this.aFloat18 = this.aFloat25 = 0.0F;
		this.aFloat29 = this.aFloat24 = this.aFloat21 = 1.0F;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[F)[F")
	public float[] method780(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat22;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat24;
		arg0[11] = this.aFloat25;
		arg0[2] = this.aFloat19;
		arg0[10] = this.aFloat21;
		arg0[1] = this.aFloat26;
		arg0[8] = this.aFloat20;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat29;
		arg0[9] = this.aFloat28;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat27;
		arg0[7] = this.aFloat18;
		arg0[3] = this.aFloat23;
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method6452() {
		@Pc(7) Class26_Sub1 local7 = new Class26_Sub1();
		local7.aFloat22 = this.aFloat22;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat29 = this.aFloat29;
		local7.aFloat19 = this.aFloat19;
		local7.aFloat27 = this.aFloat27;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat24 = this.aFloat24;
		local7.aFloat23 = this.aFloat23;
		local7.aFloat28 = this.aFloat28;
		local7.aFloat25 = this.aFloat25;
		return local7;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat25 + this.aFloat20 * (float) arg0 + this.aFloat28 * (float) arg1 + this.aFloat21 * (float) arg2);
		arg3[0] = (int) (this.aFloat23 + (float) arg1 * this.aFloat26 + this.aFloat29 * (float) arg0 + this.aFloat19 * (float) arg2);
		arg3[1] = (int) (this.aFloat18 + (float) arg2 * this.aFloat27 + (float) arg0 * this.aFloat22 + this.aFloat24 * (float) arg1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method6444(@OriginalArg(0) int arg0) {
		this.aFloat24 = 1.0F;
		this.aFloat29 = this.aFloat21 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat19 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat26 = this.aFloat23 = this.aFloat22 = this.aFloat27 = this.aFloat18 = this.aFloat28 = this.aFloat25 = 0.0F;
		this.aFloat20 = -this.aFloat19;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	@Override
	public void method6450(@OriginalArg(0) int arg0) {
		this.aFloat21 = 1.0F;
		this.aFloat29 = this.aFloat24 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat22 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat19 = this.aFloat23 = this.aFloat27 = this.aFloat18 = this.aFloat20 = this.aFloat28 = this.aFloat25 = 0.0F;
		this.aFloat26 = -this.aFloat22;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([I)V")
	@Override
	public void method6455(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat23;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat18;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat25;
		arg0[1] = (int) (local20 * this.aFloat24 + local12 * this.aFloat26 + local29 * this.aFloat28);
		arg0[0] = (int) (this.aFloat22 * local20 + this.aFloat29 * local12 + this.aFloat20 * local29);
		arg0[2] = (int) (local12 * this.aFloat19 + local20 * this.aFloat27 + local29 * this.aFloat21);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qja;Lclient!qja;)V")
	public void method782(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(6) Class26_Sub1 local6 = (Class26_Sub1) arg0;
		@Pc(9) Class26_Sub1 local9 = (Class26_Sub1) arg1;
		this.aFloat29 = local6.aFloat26 * local9.aFloat22 + local9.aFloat29 * local6.aFloat29 + local6.aFloat19 * local9.aFloat20;
		this.aFloat22 = local6.aFloat24 * local9.aFloat22 + local9.aFloat29 * local6.aFloat22 + local9.aFloat20 * local6.aFloat27;
		this.aFloat20 = local9.aFloat29 * local6.aFloat20 + local9.aFloat22 * local6.aFloat28 + local6.aFloat21 * local9.aFloat20;
		this.aFloat26 = local6.aFloat19 * local9.aFloat28 + local6.aFloat26 * local9.aFloat24 + local6.aFloat29 * local9.aFloat26;
		this.aFloat24 = local9.aFloat28 * local6.aFloat27 + local6.aFloat22 * local9.aFloat26 + local9.aFloat24 * local6.aFloat24;
		this.aFloat28 = local9.aFloat26 * local6.aFloat20 + local9.aFloat24 * local6.aFloat28 + local9.aFloat28 * local6.aFloat21;
		this.aFloat19 = local6.aFloat19 * local9.aFloat21 + local9.aFloat27 * local6.aFloat26 + local6.aFloat29 * local9.aFloat19;
		this.aFloat27 = local9.aFloat21 * local6.aFloat27 + local6.aFloat24 * local9.aFloat27 + local6.aFloat22 * local9.aFloat19;
		this.aFloat21 = local9.aFloat21 * local6.aFloat21 + local6.aFloat20 * local9.aFloat19 + local9.aFloat27 * local6.aFloat28;
		this.aFloat23 = local6.aFloat23 + local9.aFloat25 * local6.aFloat19 + local9.aFloat18 * local6.aFloat26 + local6.aFloat29 * local9.aFloat23;
		this.aFloat18 = local9.aFloat23 * local6.aFloat22 + local6.aFloat24 * local9.aFloat18 + local9.aFloat25 * local6.aFloat27 + local6.aFloat18;
		this.aFloat25 = local6.aFloat25 + local6.aFloat21 * local9.aFloat25 + local9.aFloat18 * local6.aFloat28 + local6.aFloat20 * local9.aFloat23;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIBIFFI)V")
	public void method783(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat24 = (float) (arg1 * 2);
			this.aFloat23 = (float) -arg5 + arg4;
			this.aFloat25 = arg0;
			this.aFloat21 = 1.0F;
			this.aFloat18 = arg3 - (float) arg1;
			this.aFloat29 = (float) (arg5 * 2);
			this.aFloat22 = this.aFloat20 = this.aFloat26 = this.aFloat28 = this.aFloat19 = this.aFloat27 = 0.0F;
			return;
		}
		@Pc(7) float local7 = Class14_Sub3_Sub13.aFloatArray51[arg2 & 0x3FFF];
		@Pc(13) float local13 = Class14_Sub3_Sub13.aFloatArray50[arg2 & 0x3FFF];
		this.aFloat24 = (float) arg1 * local7 * 2.0F;
		this.aFloat20 = this.aFloat28 = this.aFloat19 = this.aFloat27 = 0.0F;
		this.aFloat18 = arg3 + (-0.5F * local13 - local7 * 0.5F) * (float) (arg1 * 2);
		this.aFloat26 = (float) arg1 * local13 * -2.0F;
		this.aFloat22 = local13 * 2.0F * (float) arg5;
		this.aFloat29 = local7 * 2.0F * (float) arg5;
		this.aFloat25 = arg0;
		this.aFloat21 = 1.0F;
		this.aFloat23 = (local13 * 0.5F - local7 * 0.5F) * (float) (arg5 * 2) + arg4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	@Override
	public void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat25 += (float) arg2;
		this.aFloat23 += (float) arg0;
		this.aFloat18 += (float) arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFIFFFFFFF)V")
	public void method784(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat23 = 0.0F;
		this.aFloat27 = arg0;
		this.aFloat19 = arg5;
		this.aFloat29 = arg2;
		this.aFloat24 = arg7;
		this.aFloat18 = 0.0F;
		this.aFloat20 = arg1;
		this.aFloat26 = arg8;
		this.aFloat22 = arg3;
		this.aFloat28 = arg6;
		this.aFloat21 = arg4;
		this.aFloat25 = 0.0F;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([FI)[F")
	public float[] method785(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat24;
		arg0[2] = this.aFloat19;
		arg0[7] = this.aFloat18;
		arg0[0] = this.aFloat29;
		arg0[6] = this.aFloat27;
		arg0[3] = this.aFloat23;
		arg0[1] = this.aFloat26;
		arg0[4] = this.aFloat22;
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat24 * (float) arg1 + (float) arg0 * this.aFloat22 + (float) arg2 * this.aFloat27);
		arg3[0] = (int) (this.aFloat19 * (float) arg2 + (float) arg0 * this.aFloat29 + (float) arg1 * this.aFloat26);
		arg3[2] = (int) (this.aFloat28 * (float) arg1 + (float) arg0 * this.aFloat20 + (float) arg2 * this.aFloat21);
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	@Override
	public void method6460(@OriginalArg(0) int arg0) {
		this.aFloat29 = 1.0F;
		this.aFloat24 = this.aFloat21 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat28 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat27 = -this.aFloat28;
		this.aFloat26 = this.aFloat19 = this.aFloat23 = this.aFloat22 = this.aFloat18 = this.aFloat20 = this.aFloat25 = 0.0F;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!qja;)V")
	public void method786(@OriginalArg(1) Class26 arg0) {
		@Pc(6) Class26_Sub1 local6 = (Class26_Sub1) arg0;
		this.aFloat19 = local6.aFloat20;
		this.aFloat29 = local6.aFloat29;
		this.aFloat26 = local6.aFloat22;
		this.aFloat20 = local6.aFloat19;
		this.aFloat27 = local6.aFloat28;
		this.aFloat22 = local6.aFloat26;
		this.aFloat24 = local6.aFloat24;
		this.aFloat21 = local6.aFloat21;
		this.aFloat23 = -(this.aFloat19 * local6.aFloat25 + local6.aFloat23 * this.aFloat29 + local6.aFloat18 * this.aFloat26);
		this.aFloat28 = local6.aFloat27;
		this.aFloat18 = -(this.aFloat22 * local6.aFloat23 + this.aFloat24 * local6.aFloat18 + this.aFloat27 * local6.aFloat25);
		this.aFloat25 = -(this.aFloat21 * local6.aFloat25 + local6.aFloat18 * this.aFloat28 + local6.aFloat23 * this.aFloat20);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat23);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat25);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat18);
		arg3[0] = (int) (this.aFloat22 * (float) local24 + this.aFloat29 * (float) local6 + (float) local17 * this.aFloat20);
		arg3[1] = (int) ((float) local17 * this.aFloat28 + (float) local6 * this.aFloat26 + (float) local24 * this.aFloat24);
		arg3[2] = (int) (this.aFloat27 * (float) local24 + (float) local6 * this.aFloat19 + (float) local17 * this.aFloat21);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(ILclient!qja;)V")
	public void method787(@OriginalArg(1) Class26 arg0) {
		@Pc(6) Class26_Sub1 local6 = (Class26_Sub1) arg0;
		this.aFloat20 = local6.aFloat20;
		this.aFloat24 = local6.aFloat24;
		this.aFloat22 = local6.aFloat22;
		this.aFloat29 = local6.aFloat29;
		this.aFloat19 = local6.aFloat19;
		this.aFloat26 = local6.aFloat26;
		this.aFloat27 = local6.aFloat27;
		this.aFloat28 = local6.aFloat28;
		this.aFloat25 = 0.0F;
		this.aFloat18 = 0.0F;
		this.aFloat21 = local6.aFloat21;
		this.aFloat23 = 0.0F;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BFFF)F")
	public float method788(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat18 + arg2 * this.aFloat27 + arg1 * this.aFloat24 + this.aFloat22 * arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub3_Sub13.aFloatArray51[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub3_Sub13.aFloatArray50[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub3_Sub13.aFloatArray51[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub3_Sub13.aFloatArray50[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat26 = local9 * local39;
		this.aFloat22 = local27 * local43 + -local21 * local39;
		this.aFloat20 = local9 * local27;
		this.aFloat21 = local9 * local21;
		this.aFloat19 = local47 * local21 + local33 * -local27;
		this.aFloat28 = -local15;
		this.aFloat24 = local9 * local33;
		this.aFloat27 = local27 * local39 + local43 * local21;
		this.aFloat29 = local27 * local47 + local33 * local21;
		this.aFloat18 = -((float) arg1 * this.aFloat24) + (float) -arg0 * this.aFloat22 - (float) arg2 * this.aFloat27;
		this.aFloat25 = -((float) arg2 * this.aFloat21) - this.aFloat28 * (float) arg1 + (float) -arg0 * this.aFloat20;
		this.aFloat23 = -(this.aFloat19 * (float) arg2) - (float) arg1 * this.aFloat26 + this.aFloat29 * (float) -arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFFI)V")
	public void method790(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat20 = 0.0F;
		this.aFloat18 = 0.0F;
		this.aFloat27 = (float) 0;
		this.aFloat29 = arg0;
		this.aFloat19 = 0.0F;
		this.aFloat28 = 0.0F;
		this.aFloat25 = 0.0F;
		this.aFloat24 = arg1;
		this.aFloat23 = 0.0F;
		this.aFloat22 = 0.0F;
		this.aFloat21 = arg2;
		this.aFloat26 = 0.0F;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	public void method791() {
		this.aFloat24 = -this.aFloat24;
		this.aFloat20 = -this.aFloat20;
		this.aFloat28 = -this.aFloat28;
		this.aFloat22 = -this.aFloat22;
		this.aFloat27 = -this.aFloat27;
		this.aFloat21 = -this.aFloat21;
		this.aFloat18 = -this.aFloat18;
		this.aFloat25 = -this.aFloat25;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFFF)F")
	public float method792(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat23 + arg2 * this.aFloat19 + this.aFloat26 * arg1 + arg0 * this.aFloat29;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(FFFI)V")
	public void method793(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat18 = arg2;
		this.aFloat25 = arg1;
		this.aFloat23 = arg0;
		this.aFloat29 = this.aFloat24 = this.aFloat21 = 1.0F;
		this.aFloat22 = this.aFloat20 = this.aFloat26 = this.aFloat28 = this.aFloat19 = this.aFloat27 = (float) 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIFF)F")
	public float method794(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat25 + this.aFloat21 * arg1 + this.aFloat28 * arg2 + arg0 * this.aFloat20;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I[F)[F")
	public float[] method795(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat28;
		arg0[15] = 1.0F;
		arg0[2] = this.aFloat20;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat26;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat21;
		arg0[8] = this.aFloat19;
		arg0[5] = this.aFloat24;
		arg0[13] = this.aFloat18;
		arg0[9] = this.aFloat27;
		arg0[1] = this.aFloat22;
		arg0[0] = this.aFloat29;
		arg0[14] = this.aFloat25;
		arg0[12] = this.aFloat23;
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B[F)[F")
	public float[] method796(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat29;
		arg0[2] = this.aFloat19;
		arg0[9] = this.aFloat28;
		arg0[10] = this.aFloat21;
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat26;
		arg0[3] = 0.0F;
		arg0[15] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat22;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat27;
		arg0[5] = this.aFloat24;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat20;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	@Override
	public void method6449(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat29;
		@Pc(21) float local21 = this.aFloat26;
		@Pc(24) float local24 = this.aFloat19;
		@Pc(27) float local27 = this.aFloat23;
		this.aFloat29 = this.aFloat20 * local15 + local18 * local9;
		this.aFloat20 = local9 * this.aFloat20 - local15 * local18;
		this.aFloat26 = local9 * local21 + this.aFloat28 * local15;
		this.aFloat28 = local9 * this.aFloat28 - local21 * local15;
		this.aFloat19 = local24 * local9 + this.aFloat21 * local15;
		this.aFloat23 = local27 * local9 + local15 * this.aFloat25;
		this.aFloat21 = local9 * this.aFloat21 - local15 * local24;
		this.aFloat25 = this.aFloat25 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
	@Override
	public void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat23 = (float) arg0;
		this.aFloat22 = this.aFloat20 = this.aFloat26 = this.aFloat28 = this.aFloat19 = this.aFloat27 = 0.0F;
		this.aFloat29 = this.aFloat24 = this.aFloat21 = 1.0F;
		this.aFloat18 = (float) arg1;
		this.aFloat25 = (float) arg2;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IFFF)V")
	public void method797(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat18 += arg2;
		this.aFloat23 += arg0;
		this.aFloat25 += arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFBFF[F)V")
	public void method798(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg0 * this.aFloat27 + this.aFloat22 * arg3 + arg1 * this.aFloat24;
		arg4[0] = arg0 * this.aFloat19 + this.aFloat29 * arg3 + arg1 * this.aFloat26;
		@Pc(68) float local68;
		@Pc(76) float local76;
		@Pc(84) float local84;
		@Pc(60) float local60;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local60 = -arg2 / arg3;
			local68 = this.aFloat23 + this.aFloat29 * local60;
			local76 = this.aFloat22 * local60 + this.aFloat18;
			local84 = this.aFloat25 + local60 * this.aFloat20;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local60 = -arg2 / arg1;
			local68 = local60 * this.aFloat26 + this.aFloat23;
			local76 = this.aFloat18 + this.aFloat24 * local60;
			local84 = local60 * this.aFloat28 + this.aFloat25;
		} else {
			local60 = -arg2 / arg0;
			local76 = this.aFloat27 * local60 + this.aFloat18;
			local84 = this.aFloat21 * local60 + this.aFloat25;
			local68 = this.aFloat23 + this.aFloat19 * local60;
		}
		arg4[2] = arg1 * this.aFloat28 + arg3 * this.aFloat20 + this.aFloat21 * arg0;
		arg4[3] = -(local84 * arg4[2] + arg4[1] * local76 + arg4[0] * local68);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	@Override
	public void method6446(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat29;
		@Pc(21) float local21 = this.aFloat26;
		@Pc(24) float local24 = this.aFloat19;
		this.aFloat29 = local18 * local9 - this.aFloat22 * local15;
		@Pc(37) float local37 = this.aFloat23;
		this.aFloat26 = local9 * local21 - this.aFloat24 * local15;
		this.aFloat22 = local18 * local15 + this.aFloat22 * local9;
		this.aFloat24 = local9 * this.aFloat24 + local15 * local21;
		this.aFloat19 = local9 * local24 - this.aFloat27 * local15;
		this.aFloat27 = local15 * local24 + this.aFloat27 * local9;
		this.aFloat23 = local9 * local37 - this.aFloat18 * local15;
		this.aFloat18 = local15 * local37 + this.aFloat18 * local9;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FF[FFI)V")
	public void method800(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) float arg3) {
		arg2[0] = arg0 * this.aFloat19 + this.aFloat26 * arg1 + arg3 * this.aFloat29;
		arg2[1] = this.aFloat27 * arg0 + arg1 * this.aFloat24 + arg3 * this.aFloat22;
		arg2[2] = arg0 * this.aFloat21 + this.aFloat28 * arg1 + arg3 * this.aFloat20;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(ILclient!qja;)V")
	public void method801(@OriginalArg(1) Class26 arg0) {
		@Pc(6) Class26_Sub1 local6 = (Class26_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat29;
		@Pc(12) float local12 = this.aFloat22;
		@Pc(15) float local15 = this.aFloat26;
		@Pc(18) float local18 = this.aFloat24;
		@Pc(21) float local21 = this.aFloat19;
		@Pc(24) float local24 = this.aFloat27;
		@Pc(27) float local27 = this.aFloat23;
		@Pc(30) float local30 = this.aFloat18;
		this.aFloat22 = this.aFloat20 * local6.aFloat27 + local6.aFloat24 * local12 + local6.aFloat22 * local9;
		this.aFloat29 = local6.aFloat26 * local12 + local6.aFloat29 * local9 + this.aFloat20 * local6.aFloat19;
		this.aFloat26 = local6.aFloat29 * local15 + local18 * local6.aFloat26 + this.aFloat28 * local6.aFloat19;
		this.aFloat24 = local6.aFloat22 * local15 + local6.aFloat24 * local18 + local6.aFloat27 * this.aFloat28;
		this.aFloat20 = this.aFloat20 * local6.aFloat21 + local6.aFloat28 * local12 + local9 * local6.aFloat20;
		this.aFloat19 = local6.aFloat19 * this.aFloat21 + local6.aFloat26 * local24 + local6.aFloat29 * local21;
		this.aFloat27 = local21 * local6.aFloat22 + local6.aFloat24 * local24 + local6.aFloat27 * this.aFloat21;
		this.aFloat28 = this.aFloat28 * local6.aFloat21 + local18 * local6.aFloat28 + local6.aFloat20 * local15;
		this.aFloat18 = local6.aFloat18 + local6.aFloat24 * local30 + local27 * local6.aFloat22 + local6.aFloat27 * this.aFloat25;
		this.aFloat21 = local6.aFloat21 * this.aFloat21 + local6.aFloat20 * local21 + local24 * local6.aFloat28;
		this.aFloat23 = local6.aFloat23 + this.aFloat25 * local6.aFloat19 + local6.aFloat26 * local30 + local6.aFloat29 * local27;
		this.aFloat25 = this.aFloat25 * local6.aFloat21 + local6.aFloat20 * local27 + local30 * local6.aFloat28 + local6.aFloat25;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B[F)[F")
	public float[] method802(@OriginalArg(1) float[] arg0) {
		arg0[5] = this.aFloat24;
		arg0[2] = 0.0F;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat26;
		arg0[6] = 0.0F;
		arg0[12] = 0.0F;
		arg0[9] = this.aFloat18;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat23;
		arg0[15] = 1.0F;
		arg0[1] = this.aFloat22;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat25;
		arg0[0] = this.aFloat29;
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat22;
		@Pc(21) float local21 = this.aFloat24;
		@Pc(24) float local24 = this.aFloat27;
		@Pc(27) float local27 = this.aFloat18;
		this.aFloat22 = local18 * local9 - local15 * this.aFloat20;
		this.aFloat20 = local9 * this.aFloat20 + local15 * local18;
		this.aFloat24 = local9 * local21 - this.aFloat28 * local15;
		this.aFloat27 = local24 * local9 - this.aFloat21 * local15;
		this.aFloat28 = local15 * local21 + local9 * this.aFloat28;
		this.aFloat18 = local27 * local9 - local15 * this.aFloat25;
		this.aFloat21 = local9 * this.aFloat21 + local24 * local15;
		this.aFloat25 = local27 * local15 + this.aFloat25 * local9;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6447(@OriginalArg(0) Class26 arg0) {
		@Pc(6) Class26_Sub1 local6 = (Class26_Sub1) arg0;
		this.aFloat22 = local6.aFloat22;
		this.aFloat21 = local6.aFloat21;
		this.aFloat19 = local6.aFloat19;
		this.aFloat23 = local6.aFloat23;
		this.aFloat18 = local6.aFloat18;
		this.aFloat28 = local6.aFloat28;
		this.aFloat20 = local6.aFloat20;
		this.aFloat24 = local6.aFloat24;
		this.aFloat26 = local6.aFloat26;
		this.aFloat27 = local6.aFloat27;
		this.aFloat29 = local6.aFloat29;
		this.aFloat25 = local6.aFloat25;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFFB)V")
	public void method803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat21 *= arg2;
		this.aFloat22 *= arg1;
		this.aFloat20 *= arg2;
		this.aFloat23 *= arg0;
		this.aFloat18 *= arg1;
		this.aFloat25 *= arg2;
		this.aFloat19 *= arg0;
		this.aFloat24 *= arg1;
		this.aFloat27 *= arg1;
		this.aFloat26 *= arg0;
		this.aFloat29 *= arg0;
		this.aFloat28 *= arg2;
	}
}
