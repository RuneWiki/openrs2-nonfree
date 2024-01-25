import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public int anInt6060;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public int anInt6063;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public int anInt6064;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public int anInt6066;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public int anInt6067;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt6068;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	public int anInt6069;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public int anInt6070;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class23_Sub2() {
		this.method5090();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	public void method5094(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub4_Sub25.anIntArray383[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub4_Sub25.anIntArray384[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6061;
		@Pc(17) int local17 = this.anInt6069;
		@Pc(20) int local20 = this.anInt6068;
		@Pc(23) int local23 = this.anInt6071;
		this.anInt6061 = local14 * local5 - this.anInt6067 * local11 >> 15;
		this.anInt6067 = local14 * local11 + this.anInt6067 * local5 >> 15;
		this.anInt6069 = local17 * local5 - this.anInt6062 * local11 >> 15;
		this.anInt6062 = local17 * local11 + this.anInt6062 * local5 >> 15;
		this.anInt6068 = local20 * local5 - this.anInt6070 * local11 >> 15;
		this.anInt6070 = local20 * local11 + this.anInt6070 * local5 >> 15;
		this.anInt6071 = local23 * local5 - this.anInt6066 * local11 >> 15;
		this.anInt6066 = local23 * local11 + this.anInt6066 * local5 >> 15;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class4_Sub4_Sub25.anIntArray383[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub4_Sub25.anIntArray384[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class4_Sub4_Sub25.anIntArray383[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class4_Sub4_Sub25.anIntArray384[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class4_Sub4_Sub25.anIntArray383[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class4_Sub4_Sub25.anIntArray384[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt6063 = local17 * local29 + local23 * local47 >> 15;
		this.anInt6061 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt6067 = local23 * local5 >> 15;
		this.anInt6060 = local5 * local35 >> 15;
		this.anInt6069 = local5 * local29 >> 15;
		this.anInt6062 = -local11;
		this.anInt6065 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt6068 = local23 * local35 + local17 * local41 >> 15;
		this.anInt6070 = local17 * local5 >> 15;
		this.anInt6064 = -arg0 * this.anInt6063 - arg1 * this.anInt6060 - arg2 * this.anInt6065 >> 15;
		this.anInt6071 = -arg0 * this.anInt6061 - arg1 * this.anInt6069 - arg2 * this.anInt6068 >> 15;
		this.anInt6066 = -arg0 * this.anInt6067 - arg1 * this.anInt6062 - arg2 * this.anInt6070 >> 15;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	@Override
	public void method5098(@OriginalArg(0) int arg0) {
		this.anInt6070 = 32768;
		this.anInt6063 = this.anInt6069 = Class4_Sub4_Sub25.anIntArray383[arg0 & 0x3FFF];
		this.anInt6061 = Class4_Sub4_Sub25.anIntArray384[arg0 & 0x3FFF];
		this.anInt6060 = -this.anInt6061;
		this.anInt6065 = this.anInt6064 = this.anInt6068 = this.anInt6071 = this.anInt6067 = this.anInt6062 = this.anInt6066 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()Lclient!tc;")
	public Class23_Sub2 method5102() {
		@Pc(3) Class23_Sub2 local3 = new Class23_Sub2();
		local3.anInt6063 = this.anInt6063;
		local3.anInt6060 = this.anInt6060;
		local3.anInt6065 = this.anInt6065;
		local3.anInt6064 = this.anInt6064;
		local3.anInt6061 = this.anInt6061;
		local3.anInt6069 = this.anInt6069;
		local3.anInt6068 = this.anInt6068;
		local3.anInt6071 = this.anInt6071;
		local3.anInt6067 = this.anInt6067;
		local3.anInt6062 = this.anInt6062;
		local3.anInt6070 = this.anInt6070;
		local3.anInt6066 = this.anInt6066;
		return local3;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6064 + (this.anInt6063 * arg0 + this.anInt6060 * arg1 + this.anInt6065 * arg2 >> 15);
		arg3[1] = this.anInt6071 + (this.anInt6061 * arg0 + this.anInt6069 * arg1 + this.anInt6068 * arg2 >> 15);
		arg3[2] = this.anInt6066 + (this.anInt6067 * arg0 + this.anInt6062 * arg1 + this.anInt6070 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	@Override
	public void method5095(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub4_Sub25.anIntArray383[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub4_Sub25.anIntArray384[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6063;
		@Pc(17) int local17 = this.anInt6060;
		@Pc(20) int local20 = this.anInt6065;
		@Pc(23) int local23 = this.anInt6064;
		this.anInt6063 = local14 * local5 + this.anInt6067 * local11 >> 15;
		this.anInt6067 = this.anInt6067 * local5 - local14 * local11 >> 15;
		this.anInt6060 = local17 * local5 + this.anInt6062 * local11 >> 15;
		this.anInt6062 = this.anInt6062 * local5 - local17 * local11 >> 15;
		this.anInt6065 = local20 * local5 + this.anInt6070 * local11 >> 15;
		this.anInt6070 = this.anInt6070 * local5 - local20 * local11 >> 15;
		this.anInt6064 = local23 * local5 + this.anInt6066 * local11 >> 15;
		this.anInt6066 = this.anInt6066 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	@Override
	public void method5089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6064 += arg0;
		this.anInt6071 += arg1;
		this.anInt6066 += arg2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ib;)V")
	@Override
	public void method5088(@OriginalArg(0) Class23 arg0) {
		@Pc(2) Class23_Sub2 local2 = (Class23_Sub2) arg0;
		this.anInt6063 = local2.anInt6063;
		this.anInt6060 = local2.anInt6060;
		this.anInt6065 = local2.anInt6065;
		this.anInt6064 = local2.anInt6064;
		this.anInt6061 = local2.anInt6061;
		this.anInt6069 = local2.anInt6069;
		this.anInt6068 = local2.anInt6068;
		this.anInt6071 = local2.anInt6071;
		this.anInt6067 = local2.anInt6067;
		this.anInt6062 = local2.anInt6062;
		this.anInt6070 = local2.anInt6070;
		this.anInt6066 = local2.anInt6066;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	@Override
	public void method5101(@OriginalArg(0) int arg0) {
		this.anInt6063 = 32768;
		this.anInt6069 = this.anInt6070 = Class4_Sub4_Sub25.anIntArray383[arg0 & 0x3FFF];
		this.anInt6062 = Class4_Sub4_Sub25.anIntArray384[arg0 & 0x3FFF];
		this.anInt6068 = -this.anInt6062;
		this.anInt6060 = this.anInt6065 = this.anInt6064 = this.anInt6061 = this.anInt6071 = this.anInt6067 = this.anInt6066 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
	@Override
	public void method5090() {
		this.anInt6061 = this.anInt6067 = this.anInt6060 = this.anInt6062 = this.anInt6065 = this.anInt6068 = this.anInt6064 = this.anInt6071 = this.anInt6066 = 0;
		this.anInt6063 = this.anInt6069 = this.anInt6070 = 32768;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
	@Override
	public void method5097(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt6064;
		@Pc(13) int local13 = arg0[1] - this.anInt6071;
		@Pc(20) int local20 = arg0[2] - this.anInt6066;
		arg0[0] = this.anInt6063 * local6 + this.anInt6061 * local13 + this.anInt6067 * local20 >> 15;
		arg0[1] = this.anInt6060 * local6 + this.anInt6069 * local13 + this.anInt6062 * local20 >> 15;
		arg0[2] = this.anInt6065 * local6 + this.anInt6068 * local13 + this.anInt6070 * local20 >> 15;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
	@Override
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6061 = this.anInt6067 = this.anInt6060 = this.anInt6062 = this.anInt6065 = this.anInt6068 = 0;
		this.anInt6063 = this.anInt6069 = this.anInt6070 = 32768;
		this.anInt6064 = arg0;
		this.anInt6071 = arg1;
		this.anInt6066 = arg2;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	@Override
	public void method5099(@OriginalArg(0) int arg0) {
		this.anInt6069 = 32768;
		this.anInt6063 = this.anInt6070 = Class4_Sub4_Sub25.anIntArray383[arg0 & 0x3FFF];
		this.anInt6065 = Class4_Sub4_Sub25.anIntArray384[arg0 & 0x3FFF];
		this.anInt6067 = -this.anInt6065;
		this.anInt6060 = this.anInt6064 = this.anInt6061 = this.anInt6068 = this.anInt6071 = this.anInt6062 = this.anInt6066 = 0;
	}
}
