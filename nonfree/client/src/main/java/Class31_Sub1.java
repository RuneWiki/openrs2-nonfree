import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class31_Sub1() {
		this.method3182();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	@Override
	public void method3182() {
		this.anInt642 = this.anInt641 = this.anInt634 = this.anInt644 = this.anInt643 = this.anInt640 = this.anInt638 = this.anInt635 = this.anInt639 = 0;
		this.anInt645 = this.anInt637 = this.anInt636 = 32768;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()Lclient!c;")
	public Class31_Sub1 method591() {
		@Pc(3) Class31_Sub1 local3 = new Class31_Sub1();
		local3.anInt645 = this.anInt645;
		local3.anInt634 = this.anInt634;
		local3.anInt643 = this.anInt643;
		local3.anInt638 = this.anInt638;
		local3.anInt642 = this.anInt642;
		local3.anInt637 = this.anInt637;
		local3.anInt640 = this.anInt640;
		local3.anInt635 = this.anInt635;
		local3.anInt641 = this.anInt641;
		local3.anInt644 = this.anInt644;
		local3.anInt636 = this.anInt636;
		local3.anInt639 = this.anInt639;
		return local3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	@Override
	public void method3172(@OriginalArg(0) int arg0) {
		this.anInt645 = 32768;
		this.anInt637 = this.anInt636 = Class1_Sub5_Sub15.anIntArray333[arg0 & 0x3FFF];
		this.anInt644 = Class1_Sub5_Sub15.anIntArray335[arg0 & 0x3FFF];
		this.anInt640 = -this.anInt644;
		this.anInt634 = this.anInt643 = this.anInt638 = this.anInt642 = this.anInt635 = this.anInt641 = this.anInt639 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt638 + (this.anInt645 * arg0 + this.anInt634 * arg1 + this.anInt643 * arg2 >> 15);
		arg3[1] = this.anInt635 + (this.anInt642 * arg0 + this.anInt637 * arg1 + this.anInt640 * arg2 >> 15);
		arg3[2] = this.anInt639 + (this.anInt641 * arg0 + this.anInt644 * arg1 + this.anInt636 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub5_Sub15.anIntArray333[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub5_Sub15.anIntArray335[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt645;
		@Pc(17) int local17 = this.anInt634;
		@Pc(20) int local20 = this.anInt643;
		@Pc(23) int local23 = this.anInt638;
		this.anInt645 = local14 * local5 + this.anInt641 * local11 >> 15;
		this.anInt641 = this.anInt641 * local5 - local14 * local11 >> 15;
		this.anInt634 = local17 * local5 + this.anInt644 * local11 >> 15;
		this.anInt644 = this.anInt644 * local5 - local17 * local11 >> 15;
		this.anInt643 = local20 * local5 + this.anInt636 * local11 >> 15;
		this.anInt636 = this.anInt636 * local5 - local20 * local11 >> 15;
		this.anInt638 = local23 * local5 + this.anInt639 * local11 >> 15;
		this.anInt639 = this.anInt639 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	@Override
	public void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt638 += arg0;
		this.anInt635 += arg1;
		this.anInt639 += arg2;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	@Override
	public void method3186(@OriginalArg(0) int arg0) {
		this.anInt636 = 32768;
		this.anInt645 = this.anInt637 = Class1_Sub5_Sub15.anIntArray333[arg0 & 0x3FFF];
		this.anInt642 = Class1_Sub5_Sub15.anIntArray335[arg0 & 0x3FFF];
		this.anInt634 = -this.anInt642;
		this.anInt643 = this.anInt638 = this.anInt640 = this.anInt635 = this.anInt641 = this.anInt644 = this.anInt639 = 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class1_Sub5_Sub15.anIntArray333[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub5_Sub15.anIntArray335[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class1_Sub5_Sub15.anIntArray333[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class1_Sub5_Sub15.anIntArray335[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class1_Sub5_Sub15.anIntArray333[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class1_Sub5_Sub15.anIntArray335[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt645 = local17 * local29 + local23 * local47 >> 15;
		this.anInt642 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt641 = local23 * local5 >> 15;
		this.anInt634 = local5 * local35 >> 15;
		this.anInt637 = local5 * local29 >> 15;
		this.anInt644 = -local11;
		this.anInt643 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt640 = local23 * local35 + local17 * local41 >> 15;
		this.anInt636 = local17 * local5 >> 15;
		this.anInt638 = -arg0 * this.anInt645 - arg1 * this.anInt634 - arg2 * this.anInt643 >> 15;
		this.anInt635 = -arg0 * this.anInt642 - arg1 * this.anInt637 - arg2 * this.anInt640 >> 15;
		this.anInt639 = -arg0 * this.anInt641 - arg1 * this.anInt644 - arg2 * this.anInt636 >> 15;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	@Override
	public void method3179(@OriginalArg(0) int arg0) {
		this.anInt637 = 32768;
		this.anInt645 = this.anInt636 = Class1_Sub5_Sub15.anIntArray333[arg0 & 0x3FFF];
		this.anInt643 = Class1_Sub5_Sub15.anIntArray335[arg0 & 0x3FFF];
		this.anInt641 = -this.anInt643;
		this.anInt634 = this.anInt638 = this.anInt642 = this.anInt640 = this.anInt635 = this.anInt644 = this.anInt639 = 0;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
	@Override
	public void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt642 = this.anInt641 = this.anInt634 = this.anInt644 = this.anInt643 = this.anInt640 = 0;
		this.anInt645 = this.anInt637 = this.anInt636 = 32768;
		this.anInt638 = arg0;
		this.anInt635 = arg1;
		this.anInt639 = arg2;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vj;)V")
	@Override
	public void method3181(@OriginalArg(0) Class31 arg0) {
		@Pc(2) Class31_Sub1 local2 = (Class31_Sub1) arg0;
		this.anInt645 = local2.anInt645;
		this.anInt634 = local2.anInt634;
		this.anInt643 = local2.anInt643;
		this.anInt638 = local2.anInt638;
		this.anInt642 = local2.anInt642;
		this.anInt637 = local2.anInt637;
		this.anInt640 = local2.anInt640;
		this.anInt635 = local2.anInt635;
		this.anInt641 = local2.anInt641;
		this.anInt644 = local2.anInt644;
		this.anInt636 = local2.anInt636;
		this.anInt639 = local2.anInt639;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V")
	@Override
	public void method3177(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt638;
		@Pc(13) int local13 = arg0[1] - this.anInt635;
		@Pc(20) int local20 = arg0[2] - this.anInt639;
		arg0[0] = this.anInt645 * local6 + this.anInt642 * local13 + this.anInt641 * local20 >> 15;
		arg0[1] = this.anInt634 * local6 + this.anInt637 * local13 + this.anInt644 * local20 >> 15;
		arg0[2] = this.anInt643 * local6 + this.anInt640 * local13 + this.anInt636 * local20 >> 15;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	@Override
	public void method3178(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class1_Sub5_Sub15.anIntArray333[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class1_Sub5_Sub15.anIntArray335[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt642;
		@Pc(17) int local17 = this.anInt637;
		@Pc(20) int local20 = this.anInt640;
		@Pc(23) int local23 = this.anInt635;
		this.anInt642 = local14 * local5 - this.anInt641 * local11 >> 15;
		this.anInt641 = local14 * local11 + this.anInt641 * local5 >> 15;
		this.anInt637 = local17 * local5 - this.anInt644 * local11 >> 15;
		this.anInt644 = local17 * local11 + this.anInt644 * local5 >> 15;
		this.anInt640 = local20 * local5 - this.anInt636 * local11 >> 15;
		this.anInt636 = local20 * local11 + this.anInt636 * local5 >> 15;
		this.anInt635 = local23 * local5 - this.anInt639 * local11 >> 15;
		this.anInt639 = local23 * local11 + this.anInt639 * local5 >> 15;
	}
}
