import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class91_Sub3 extends Class91 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public int anInt8565;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public int anInt8566;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public int anInt8568;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public int anInt8570;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public int anInt8571;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public int anInt8572;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public int anInt8573;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
	public int anInt8574;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public int anInt8575;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class91_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!tg", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8567 = this.anInt8573 = this.anInt8571 = this.anInt8575 = this.anInt8574 = this.anInt8565 = 0;
		this.anInt8572 = this.anInt8564 = this.anInt8568 = 32768;
		this.anInt8570 = arg0;
		this.anInt8569 = arg1;
		this.anInt8566 = arg2;
	}

	@OriginalMember(owner = "client!tg", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.anInt8568 = 32768;
		this.anInt8572 = this.anInt8564 = Class12_Sub1_Sub36.anIntArray668[arg0 & 0x3FFF];
		this.anInt8567 = Class12_Sub1_Sub36.anIntArray667[arg0 & 0x3FFF];
		this.anInt8571 = -this.anInt8567;
		this.anInt8574 = this.anInt8570 = this.anInt8565 = this.anInt8569 = this.anInt8573 = this.anInt8575 = this.anInt8566 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt8570 + (this.anInt8572 * arg0 + this.anInt8571 * arg1 + this.anInt8574 * arg2 >> 15);
		arg3[1] = this.anInt8569 + (this.anInt8567 * arg0 + this.anInt8564 * arg1 + this.anInt8565 * arg2 >> 15);
		arg3[2] = this.anInt8566 + (this.anInt8573 * arg0 + this.anInt8575 * arg1 + this.anInt8568 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!tg", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class12_Sub1_Sub36.anIntArray668[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class12_Sub1_Sub36.anIntArray667[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt8572;
		@Pc(17) int local17 = this.anInt8571;
		@Pc(20) int local20 = this.anInt8574;
		@Pc(23) int local23 = this.anInt8570;
		this.anInt8572 = local14 * local5 + this.anInt8573 * local11 >> 15;
		this.anInt8573 = this.anInt8573 * local5 - local14 * local11 >> 15;
		this.anInt8571 = local17 * local5 + this.anInt8575 * local11 >> 15;
		this.anInt8575 = this.anInt8575 * local5 - local17 * local11 >> 15;
		this.anInt8574 = local20 * local5 + this.anInt8568 * local11 >> 15;
		this.anInt8568 = this.anInt8568 * local5 - local20 * local11 >> 15;
		this.anInt8570 = local23 * local5 + this.anInt8566 * local11 >> 15;
		this.anInt8566 = this.anInt8566 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class91 method7050() {
		@Pc(3) Class91_Sub3 local3 = new Class91_Sub3();
		local3.anInt8572 = this.anInt8572;
		local3.anInt8571 = this.anInt8571;
		local3.anInt8574 = this.anInt8574;
		local3.anInt8570 = this.anInt8570;
		local3.anInt8567 = this.anInt8567;
		local3.anInt8564 = this.anInt8564;
		local3.anInt8565 = this.anInt8565;
		local3.anInt8569 = this.anInt8569;
		local3.anInt8573 = this.anInt8573;
		local3.anInt8575 = this.anInt8575;
		local3.anInt8568 = this.anInt8568;
		local3.anInt8566 = this.anInt8566;
		return local3;
	}

	@OriginalMember(owner = "client!tg", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt8570;
		@Pc(13) int local13 = arg0[1] - this.anInt8569;
		@Pc(20) int local20 = arg0[2] - this.anInt8566;
		arg0[0] = this.anInt8572 * local6 + this.anInt8567 * local13 + this.anInt8573 * local20 >> 15;
		arg0[1] = this.anInt8571 * local6 + this.anInt8564 * local13 + this.anInt8575 * local20 >> 15;
		arg0[2] = this.anInt8574 * local6 + this.anInt8565 * local13 + this.anInt8568 * local20 >> 15;
	}

	@OriginalMember(owner = "client!tg", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8570 += arg0;
		this.anInt8569 += arg1;
		this.anInt8566 += arg2;
	}

	@OriginalMember(owner = "client!tg", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt8564 = 32768;
		this.anInt8572 = this.anInt8568 = Class12_Sub1_Sub36.anIntArray668[arg0 & 0x3FFF];
		this.anInt8574 = Class12_Sub1_Sub36.anIntArray667[arg0 & 0x3FFF];
		this.anInt8573 = -this.anInt8574;
		this.anInt8571 = this.anInt8570 = this.anInt8567 = this.anInt8565 = this.anInt8569 = this.anInt8575 = this.anInt8566 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt8572 * arg0 + this.anInt8571 * arg1 + this.anInt8574 * arg2 >> 15;
		arg3[1] = this.anInt8567 * arg0 + this.anInt8564 * arg1 + this.anInt8565 * arg2 >> 15;
		arg3[2] = this.anInt8573 * arg0 + this.anInt8575 * arg1 + this.anInt8568 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!tg", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.anInt8572 = 32768;
		this.anInt8564 = this.anInt8568 = Class12_Sub1_Sub36.anIntArray668[arg0 & 0x3FFF];
		this.anInt8575 = Class12_Sub1_Sub36.anIntArray667[arg0 & 0x3FFF];
		this.anInt8565 = -this.anInt8575;
		this.anInt8571 = this.anInt8574 = this.anInt8570 = this.anInt8567 = this.anInt8569 = this.anInt8573 = this.anInt8566 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class12_Sub1_Sub36.anIntArray668[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class12_Sub1_Sub36.anIntArray667[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt8567;
		@Pc(17) int local17 = this.anInt8564;
		@Pc(20) int local20 = this.anInt8565;
		@Pc(23) int local23 = this.anInt8569;
		this.anInt8567 = local14 * local5 - this.anInt8573 * local11 >> 15;
		this.anInt8573 = local14 * local11 + this.anInt8573 * local5 >> 15;
		this.anInt8564 = local17 * local5 - this.anInt8575 * local11 >> 15;
		this.anInt8575 = local17 * local11 + this.anInt8575 * local5 >> 15;
		this.anInt8565 = local20 * local5 - this.anInt8568 * local11 >> 15;
		this.anInt8568 = local20 * local11 + this.anInt8568 * local5 >> 15;
		this.anInt8569 = local23 * local5 - this.anInt8566 * local11 >> 15;
		this.anInt8566 = local23 * local11 + this.anInt8566 * local5 >> 15;
	}

	@OriginalMember(owner = "client!tg", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class91 arg0) {
		@Pc(2) Class91_Sub3 local2 = (Class91_Sub3) arg0;
		this.anInt8572 = local2.anInt8572;
		this.anInt8571 = local2.anInt8571;
		this.anInt8574 = local2.anInt8574;
		this.anInt8570 = local2.anInt8570;
		this.anInt8567 = local2.anInt8567;
		this.anInt8564 = local2.anInt8564;
		this.anInt8565 = local2.anInt8565;
		this.anInt8569 = local2.anInt8569;
		this.anInt8573 = local2.anInt8573;
		this.anInt8575 = local2.anInt8575;
		this.anInt8568 = local2.anInt8568;
		this.anInt8566 = local2.anInt8566;
	}

	@OriginalMember(owner = "client!tg", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.anInt8567 = this.anInt8573 = this.anInt8571 = this.anInt8575 = this.anInt8574 = this.anInt8565 = this.anInt8570 = this.anInt8569 = this.anInt8566 = 0;
		this.anInt8572 = this.anInt8564 = this.anInt8568 = 32768;
	}

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class12_Sub1_Sub36.anIntArray668[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class12_Sub1_Sub36.anIntArray667[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class12_Sub1_Sub36.anIntArray668[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class12_Sub1_Sub36.anIntArray667[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class12_Sub1_Sub36.anIntArray668[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class12_Sub1_Sub36.anIntArray667[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt8572 = local17 * local29 + local23 * local47 >> 15;
		this.anInt8567 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt8573 = local23 * local5 >> 15;
		this.anInt8571 = local5 * local35 >> 15;
		this.anInt8564 = local5 * local29 >> 15;
		this.anInt8575 = -local11;
		this.anInt8574 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt8565 = local23 * local35 + local17 * local41 >> 15;
		this.anInt8568 = local17 * local5 >> 15;
		this.anInt8570 = -arg0 * this.anInt8572 - arg1 * this.anInt8571 - arg2 * this.anInt8574 >> 15;
		this.anInt8569 = -arg0 * this.anInt8567 - arg1 * this.anInt8564 - arg2 * this.anInt8565 >> 15;
		this.anInt8566 = -arg0 * this.anInt8573 - arg1 * this.anInt8575 - arg2 * this.anInt8568 >> 15;
	}
}
