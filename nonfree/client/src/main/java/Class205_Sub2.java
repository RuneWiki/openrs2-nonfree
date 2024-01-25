import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class205_Sub2 extends Class205 {

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public int anInt8998;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	public int anInt8999;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public int anInt9000;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public int anInt9001;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public int anInt9002;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt9003;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public int anInt9004;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
	public int anInt9005;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
	public int anInt9006;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	public int anInt9007;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "I")
	public int anInt9008;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public int anInt9009;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class205_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5.anIntArray760[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5.anIntArray761[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt8998;
		@Pc(17) int local17 = this.anInt9009;
		@Pc(20) int local20 = this.anInt9006;
		@Pc(23) int local23 = this.anInt9000;
		this.anInt8998 = local14 * local5 + this.anInt9004 * local11 >> 14;
		this.anInt9004 = this.anInt9004 * local5 - local14 * local11 >> 14;
		this.anInt9009 = local17 * local5 + this.anInt9003 * local11 >> 14;
		this.anInt9003 = this.anInt9003 * local5 - local17 * local11 >> 14;
		this.anInt9006 = local20 * local5 + this.anInt9008 * local11 >> 14;
		this.anInt9008 = this.anInt9008 * local5 - local20 * local11 >> 14;
		this.anInt9000 = local23 * local5 + this.anInt9005 * local11 >> 14;
		this.anInt9005 = this.anInt9005 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt9000;
		@Pc(13) int local13 = arg0[1] - this.anInt8999;
		@Pc(20) int local20 = arg0[2] - this.anInt9005;
		arg0[0] = this.anInt8998 * local6 + this.anInt9001 * local13 + this.anInt9004 * local20 >> 14;
		arg0[1] = this.anInt9009 * local6 + this.anInt9007 * local13 + this.anInt9003 * local20 >> 14;
		arg0[2] = this.anInt9006 * local6 + this.anInt9002 * local13 + this.anInt9008 * local20 >> 14;
	}

	@OriginalMember(owner = "client!vm", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class5.anIntArray760[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class5.anIntArray761[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class5.anIntArray760[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class5.anIntArray761[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class5.anIntArray760[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class5.anIntArray761[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt8998 = local17 * local29 + local23 * local47 >> 14;
		this.anInt9001 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt9004 = local23 * local5 >> 14;
		this.anInt9009 = local5 * local35 >> 14;
		this.anInt9007 = local5 * local29 >> 14;
		this.anInt9003 = -local11;
		this.anInt9006 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt9002 = local23 * local35 + local17 * local41 >> 14;
		this.anInt9008 = local17 * local5 >> 14;
		this.anInt9000 = -arg0 * this.anInt8998 - arg1 * this.anInt9009 - arg2 * this.anInt9006 >> 14;
		this.anInt8999 = -arg0 * this.anInt9001 - arg1 * this.anInt9007 - arg2 * this.anInt9002 >> 14;
		this.anInt9005 = -arg0 * this.anInt9004 - arg1 * this.anInt9003 - arg2 * this.anInt9008 >> 14;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt9007 = 16384;
		this.anInt8998 = this.anInt9008 = Class5.anIntArray760[arg0 & 0x3FFF];
		this.anInt9006 = Class5.anIntArray761[arg0 & 0x3FFF];
		this.anInt9004 = -this.anInt9006;
		this.anInt9009 = this.anInt9000 = this.anInt9001 = this.anInt9002 = this.anInt8999 = this.anInt9003 = this.anInt9005 = 0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7801() {
		@Pc(3) Class205_Sub2 local3 = new Class205_Sub2();
		local3.anInt8998 = this.anInt8998;
		local3.anInt9009 = this.anInt9009;
		local3.anInt9006 = this.anInt9006;
		local3.anInt9000 = this.anInt9000;
		local3.anInt9001 = this.anInt9001;
		local3.anInt9007 = this.anInt9007;
		local3.anInt9002 = this.anInt9002;
		local3.anInt8999 = this.anInt8999;
		local3.anInt9004 = this.anInt9004;
		local3.anInt9003 = this.anInt9003;
		local3.anInt9008 = this.anInt9008;
		local3.anInt9005 = this.anInt9005;
		return local3;
	}

	@OriginalMember(owner = "client!vm", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class205 arg0) {
		@Pc(2) Class205_Sub2 local2 = (Class205_Sub2) arg0;
		this.anInt8998 = local2.anInt8998;
		this.anInt9009 = local2.anInt9009;
		this.anInt9006 = local2.anInt9006;
		this.anInt9000 = local2.anInt9000;
		this.anInt9001 = local2.anInt9001;
		this.anInt9007 = local2.anInt9007;
		this.anInt9002 = local2.anInt9002;
		this.anInt8999 = local2.anInt8999;
		this.anInt9004 = local2.anInt9004;
		this.anInt9003 = local2.anInt9003;
		this.anInt9008 = local2.anInt9008;
		this.anInt9005 = local2.anInt9005;
	}

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class5.anIntArray760[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class5.anIntArray761[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt9001;
		@Pc(17) int local17 = this.anInt9007;
		@Pc(20) int local20 = this.anInt9002;
		@Pc(23) int local23 = this.anInt8999;
		this.anInt9001 = local14 * local5 - this.anInt9004 * local11 >> 14;
		this.anInt9004 = local14 * local11 + this.anInt9004 * local5 >> 14;
		this.anInt9007 = local17 * local5 - this.anInt9003 * local11 >> 14;
		this.anInt9003 = local17 * local11 + this.anInt9003 * local5 >> 14;
		this.anInt9002 = local20 * local5 - this.anInt9008 * local11 >> 14;
		this.anInt9008 = local20 * local11 + this.anInt9008 * local5 >> 14;
		this.anInt8999 = local23 * local5 - this.anInt9005 * local11 >> 14;
		this.anInt9005 = local23 * local11 + this.anInt9005 * local5 >> 14;
	}

	@OriginalMember(owner = "client!vm", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt8998 * arg0 + this.anInt9009 * arg1 + this.anInt9006 * arg2 >> 14;
		arg3[1] = this.anInt9001 * arg0 + this.anInt9007 * arg1 + this.anInt9002 * arg2 >> 14;
		arg3[2] = this.anInt9004 * arg0 + this.anInt9003 * arg1 + this.anInt9008 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!vm", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9001 = this.anInt9004 = this.anInt9009 = this.anInt9003 = this.anInt9006 = this.anInt9002 = 0;
		this.anInt8998 = this.anInt9007 = this.anInt9008 = 16384;
		this.anInt9000 = arg0;
		this.anInt8999 = arg1;
		this.anInt9005 = arg2;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt9000 + (this.anInt8998 * arg0 + this.anInt9009 * arg1 + this.anInt9006 * arg2 >> 14);
		arg3[1] = this.anInt8999 + (this.anInt9001 * arg0 + this.anInt9007 * arg1 + this.anInt9002 * arg2 >> 14);
		arg3[2] = this.anInt9005 + (this.anInt9004 * arg0 + this.anInt9003 * arg1 + this.anInt9008 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!vm", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt9008 = 16384;
		this.anInt8998 = this.anInt9007 = Class5.anIntArray760[arg0 & 0x3FFF];
		this.anInt9001 = Class5.anIntArray761[arg0 & 0x3FFF];
		this.anInt9009 = -this.anInt9001;
		this.anInt9006 = this.anInt9000 = this.anInt9002 = this.anInt8999 = this.anInt9004 = this.anInt9003 = this.anInt9005 = 0;
	}

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9000 += arg0;
		this.anInt8999 += arg1;
		this.anInt9005 += arg2;
	}

	@OriginalMember(owner = "client!vm", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt8998 = 16384;
		this.anInt9007 = this.anInt9008 = Class5.anIntArray760[arg0 & 0x3FFF];
		this.anInt9003 = Class5.anIntArray761[arg0 & 0x3FFF];
		this.anInt9002 = -this.anInt9003;
		this.anInt9009 = this.anInt9006 = this.anInt9000 = this.anInt9001 = this.anInt8999 = this.anInt9004 = this.anInt9005 = 0;
	}

	@OriginalMember(owner = "client!vm", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt9001 = this.anInt9004 = this.anInt9009 = this.anInt9003 = this.anInt9006 = this.anInt9002 = this.anInt9000 = this.anInt8999 = this.anInt9005 = 0;
		this.anInt8998 = this.anInt9007 = this.anInt9008 = 16384;
	}
}
