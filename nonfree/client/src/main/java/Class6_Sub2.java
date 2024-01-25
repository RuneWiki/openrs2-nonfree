import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class6_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!nf", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat67 = 1.0F;
		this.aFloat63 = this.aFloat65 = Class46.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat62 = Class46.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat64 = -this.aFloat62;
		this.aFloat61 = this.aFloat60 = this.aFloat66 = this.aFloat70 = this.aFloat68 = this.aFloat69 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)[F")
	public float[] method3919() {
		Static413.aFloatArray30[2] = this.aFloat64;
		Static413.aFloatArray30[8] = this.aFloat62;
		Static413.aFloatArray30[12] = 0.0F;
		Static413.aFloatArray30[5] = this.aFloat67;
		Static413.aFloatArray30[10] = this.aFloat65;
		Static413.aFloatArray30[14] = 0.0F;
		Static413.aFloatArray30[13] = 0.0F;
		Static413.aFloatArray30[6] = this.aFloat69;
		Static413.aFloatArray30[0] = this.aFloat63;
		Static413.aFloatArray30[9] = this.aFloat70;
		Static413.aFloatArray30[4] = this.aFloat61;
		Static413.aFloatArray30[1] = this.aFloat66;
		return Static413.aFloatArray30;
	}

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat68 += arg1;
		this.aFloat59 += arg2;
		this.aFloat60 += arg0;
	}

	@OriginalMember(owner = "client!nf", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class46.aFloatArray17[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class46.aFloatArray18[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class46.aFloatArray17[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class46.aFloatArray18[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class46.aFloatArray17[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class46.aFloatArray18[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat70 = local21 * local43 + local39 * local27;
		this.aFloat63 = local47 * local27 + local33 * local21;
		this.aFloat61 = local9 * local39;
		this.aFloat65 = local21 * local9;
		this.aFloat69 = -local15;
		this.aFloat62 = local33 * -local27 + local47 * local21;
		this.aFloat64 = local9 * local27;
		this.aFloat66 = local27 * local43 + -local21 * local39;
		this.aFloat67 = local9 * local33;
		this.aFloat60 = -(this.aFloat61 * (float) arg1) + (float) -arg0 * this.aFloat63 - (float) arg2 * this.aFloat62;
		this.aFloat59 = -(this.aFloat65 * (float) arg2) - (float) arg1 * this.aFloat69 + this.aFloat64 * (float) -arg0;
		this.aFloat68 = (float) -arg0 * this.aFloat66 - this.aFloat67 * (float) arg1 - this.aFloat70 * (float) arg2;
	}

	@OriginalMember(owner = "client!nf", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg0;
		this.aFloat63 = local6.aFloat63;
		this.aFloat70 = local6.aFloat70;
		this.aFloat62 = local6.aFloat62;
		this.aFloat67 = local6.aFloat67;
		this.aFloat59 = local6.aFloat59;
		this.aFloat69 = local6.aFloat69;
		this.aFloat61 = local6.aFloat61;
		this.aFloat66 = local6.aFloat66;
		this.aFloat60 = local6.aFloat60;
		this.aFloat65 = local6.aFloat65;
		this.aFloat68 = local6.aFloat68;
		this.aFloat64 = local6.aFloat64;
	}

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat65 = 1.0F;
		this.aFloat63 = this.aFloat67 = Class46.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat66 = Class46.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat61 = -this.aFloat66;
		this.aFloat62 = this.aFloat60 = this.aFloat70 = this.aFloat68 = this.aFloat64 = this.aFloat69 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!nf", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class46.aFloatArray17[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class46.aFloatArray18[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat63;
		@Pc(21) float local21 = this.aFloat61;
		@Pc(24) float local24 = this.aFloat62;
		@Pc(27) float local27 = this.aFloat60;
		this.aFloat63 = local9 * local18 + local15 * this.aFloat64;
		this.aFloat64 = local9 * this.aFloat64 - local18 * local15;
		this.aFloat61 = this.aFloat69 * local15 + local9 * local21;
		this.aFloat62 = this.aFloat65 * local15 + local9 * local24;
		this.aFloat69 = this.aFloat69 * local9 - local21 * local15;
		this.aFloat60 = local9 * local27 + this.aFloat59 * local15;
		this.aFloat65 = local9 * this.aFloat65 - local15 * local24;
		this.aFloat59 = local9 * this.aFloat59 - local27 * local15;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!c;I)V")
	public void method3921(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg0;
		this.aFloat61 = local6.aFloat66;
		this.aFloat63 = local6.aFloat63;
		this.aFloat62 = local6.aFloat64;
		this.aFloat70 = local6.aFloat69;
		this.aFloat66 = local6.aFloat61;
		this.aFloat67 = local6.aFloat67;
		this.aFloat64 = local6.aFloat62;
		this.aFloat65 = local6.aFloat65;
		this.aFloat60 = -(local6.aFloat60 * this.aFloat63 + local6.aFloat68 * this.aFloat61 + this.aFloat62 * local6.aFloat59);
		this.aFloat69 = local6.aFloat70;
		this.aFloat68 = -(this.aFloat67 * local6.aFloat68 + local6.aFloat60 * this.aFloat66 + this.aFloat70 * local6.aFloat59);
		this.aFloat59 = -(this.aFloat64 * local6.aFloat60 + local6.aFloat68 * this.aFloat69 + this.aFloat65 * local6.aFloat59);
	}

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat63 + this.aFloat61 * (float) arg1 + (float) arg2 * this.aFloat62);
		arg3[1] = (int) (this.aFloat67 * (float) arg1 + this.aFloat66 * (float) arg0 + (float) arg2 * this.aFloat70);
		arg3[2] = (int) ((float) arg2 * this.aFloat65 + this.aFloat64 * (float) arg0 + this.aFloat69 * (float) arg1);
	}

	@OriginalMember(owner = "client!nf", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat60;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat68;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat59;
		arg0[0] = (int) (this.aFloat63 * local12 + this.aFloat66 * local20 + local28 * this.aFloat64);
		arg0[1] = (int) (this.aFloat61 * local12 + local20 * this.aFloat67 + this.aFloat69 * local28);
		arg0[2] = (int) (local28 * this.aFloat65 + this.aFloat62 * local12 + local20 * this.aFloat70);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)[F")
	public float[] method3922() {
		Static413.aFloatArray30[4] = this.aFloat61;
		Static413.aFloatArray30[12] = this.aFloat60;
		Static413.aFloatArray30[8] = this.aFloat62;
		Static413.aFloatArray30[13] = this.aFloat68;
		Static413.aFloatArray30[5] = this.aFloat67;
		Static413.aFloatArray30[2] = this.aFloat64;
		Static413.aFloatArray30[6] = this.aFloat69;
		Static413.aFloatArray30[0] = this.aFloat63;
		Static413.aFloatArray30[10] = this.aFloat65;
		Static413.aFloatArray30[14] = this.aFloat59;
		Static413.aFloatArray30[9] = this.aFloat70;
		Static413.aFloatArray30[1] = this.aFloat66;
		return Static413.aFloatArray30;
	}

	@OriginalMember(owner = "client!nf", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class46.aFloatArray17[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class46.aFloatArray18[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat66;
		@Pc(21) float local21 = this.aFloat67;
		@Pc(24) float local24 = this.aFloat70;
		this.aFloat66 = local9 * local18 - local15 * this.aFloat64;
		@Pc(37) float local37 = this.aFloat68;
		this.aFloat67 = local9 * local21 - local15 * this.aFloat69;
		this.aFloat64 = local9 * this.aFloat64 + local18 * local15;
		this.aFloat69 = local15 * local21 + this.aFloat69 * local9;
		this.aFloat70 = local9 * local24 - this.aFloat65 * local15;
		this.aFloat65 = local9 * this.aFloat65 + local15 * local24;
		this.aFloat68 = local37 * local9 - local15 * this.aFloat59;
		this.aFloat59 = local9 * this.aFloat59 + local37 * local15;
	}

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat63 = this.aFloat67 = this.aFloat65 = 1.0F;
		this.aFloat66 = this.aFloat64 = this.aFloat61 = this.aFloat69 = this.aFloat62 = this.aFloat70 = this.aFloat60 = this.aFloat68 = this.aFloat59 = 0.0F;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat62 + (float) arg1 * this.aFloat61 + this.aFloat63 * (float) arg0 + this.aFloat60);
		arg3[1] = (int) (this.aFloat68 + (float) arg0 * this.aFloat66 + this.aFloat67 * (float) arg1 + (float) arg2 * this.aFloat70);
		arg3[2] = (int) (this.aFloat59 + (float) arg2 * this.aFloat65 + this.aFloat69 * (float) arg1 + (float) arg0 * this.aFloat64);
	}

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat63 = this.aFloat67 = this.aFloat65 = 1.0F;
		this.aFloat60 = arg0;
		this.aFloat66 = this.aFloat64 = this.aFloat61 = this.aFloat69 = this.aFloat62 = this.aFloat70 = 0.0F;
		this.aFloat59 = arg2;
		this.aFloat68 = arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FIIFIFB)V")
	public void method3925(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		if (arg1 == 0) {
			this.aFloat65 = 1.0F;
			this.aFloat66 = this.aFloat64 = this.aFloat61 = this.aFloat69 = this.aFloat62 = this.aFloat70 = 0.0F;
			this.aFloat67 = arg4;
			this.aFloat63 = arg2;
		} else {
			@Pc(42) float local42 = Class46.aFloatArray17[arg1 & 0x3FFF];
			@Pc(48) float local48 = Class46.aFloatArray18[arg1 & 0x3FFF];
			this.aFloat65 = 1.0F;
			this.aFloat67 = (float) arg4 * local42;
			this.aFloat64 = this.aFloat69 = this.aFloat62 = this.aFloat70 = 0.0F;
			this.aFloat63 = local42 * (float) arg2;
			this.aFloat61 = (float) arg4 * -local48;
			this.aFloat66 = (float) arg2 * local48;
		}
		this.aFloat60 = arg5;
		this.aFloat68 = arg3;
		this.aFloat59 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class6 method4655() {
		@Pc(7) Class6_Sub2 local7 = new Class6_Sub2();
		local7.aFloat64 = this.aFloat64;
		local7.aFloat69 = this.aFloat69;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat67 = this.aFloat67;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat68 = this.aFloat68;
		return local7;
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat63 = 1.0F;
		this.aFloat67 = this.aFloat65 = Class46.aFloatArray17[arg0 & 0x3FFF];
		this.aFloat69 = Class46.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat70 = -this.aFloat69;
		this.aFloat61 = this.aFloat62 = this.aFloat60 = this.aFloat66 = this.aFloat68 = this.aFloat64 = this.aFloat59 = 0.0F;
	}
}
