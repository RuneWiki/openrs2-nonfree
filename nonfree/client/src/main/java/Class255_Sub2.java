import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class255_Sub2 extends Class255 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public int anInt9116;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	public int anInt9117;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "I")
	public int anInt9119;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	public int anInt9120;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	public int anInt9121;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	public int anInt9122;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "I")
	public int anInt9123;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	public int anInt9124;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	public int anInt9125;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	public int anInt9126;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public int anInt9127;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class255_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!su", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt9124;
		@Pc(13) int local13 = arg0[1] - this.anInt9122;
		@Pc(20) int local20 = arg0[2] - this.anInt9126;
		arg0[0] = this.anInt9117 * local6 + this.anInt9125 * local13 + this.anInt9116 * local20 >> 14;
		arg0[1] = this.anInt9121 * local6 + this.anInt9127 * local13 + this.anInt9118 * local20 >> 14;
		arg0[2] = this.anInt9123 * local6 + this.anInt9119 * local13 + this.anInt9120 * local20 >> 14;
	}

	@OriginalMember(owner = "client!su", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class2_Sub3.anIntArray621[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class2_Sub3.anIntArray620[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt9125;
		@Pc(17) int local17 = this.anInt9127;
		@Pc(20) int local20 = this.anInt9119;
		@Pc(23) int local23 = this.anInt9122;
		this.anInt9125 = local14 * local5 - this.anInt9116 * local11 >> 14;
		this.anInt9116 = local14 * local11 + this.anInt9116 * local5 >> 14;
		this.anInt9127 = local17 * local5 - this.anInt9118 * local11 >> 14;
		this.anInt9118 = local17 * local11 + this.anInt9118 * local5 >> 14;
		this.anInt9119 = local20 * local5 - this.anInt9120 * local11 >> 14;
		this.anInt9120 = local20 * local11 + this.anInt9120 * local5 >> 14;
		this.anInt9122 = local23 * local5 - this.anInt9126 * local11 >> 14;
		this.anInt9126 = local23 * local11 + this.anInt9126 * local5 >> 14;
	}

	@OriginalMember(owner = "client!su", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9124 += arg0;
		this.anInt9122 += arg1;
		this.anInt9126 += arg2;
	}

	@OriginalMember(owner = "client!su", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt9117 * arg0 + this.anInt9121 * arg1 + this.anInt9123 * arg2 >> 14;
		arg3[1] = this.anInt9125 * arg0 + this.anInt9127 * arg1 + this.anInt9119 * arg2 >> 14;
		arg3[2] = this.anInt9116 * arg0 + this.anInt9118 * arg1 + this.anInt9120 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt9127 = 16384;
		this.anInt9117 = this.anInt9120 = Class2_Sub3.anIntArray621[arg0 & 0x3FFF];
		this.anInt9123 = Class2_Sub3.anIntArray620[arg0 & 0x3FFF];
		this.anInt9116 = -this.anInt9123;
		this.anInt9121 = this.anInt9124 = this.anInt9125 = this.anInt9119 = this.anInt9122 = this.anInt9118 = this.anInt9126 = 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class255 method8170() {
		@Pc(3) Class255_Sub2 local3 = new Class255_Sub2();
		local3.anInt9117 = this.anInt9117;
		local3.anInt9121 = this.anInt9121;
		local3.anInt9123 = this.anInt9123;
		local3.anInt9124 = this.anInt9124;
		local3.anInt9125 = this.anInt9125;
		local3.anInt9127 = this.anInt9127;
		local3.anInt9119 = this.anInt9119;
		local3.anInt9122 = this.anInt9122;
		local3.anInt9116 = this.anInt9116;
		local3.anInt9118 = this.anInt9118;
		local3.anInt9120 = this.anInt9120;
		local3.anInt9126 = this.anInt9126;
		return local3;
	}

	@OriginalMember(owner = "client!su", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt9125 = this.anInt9116 = this.anInt9121 = this.anInt9118 = this.anInt9123 = this.anInt9119 = this.anInt9124 = this.anInt9122 = this.anInt9126 = 0;
		this.anInt9117 = this.anInt9127 = this.anInt9120 = 16384;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt9124 + (this.anInt9117 * arg0 + this.anInt9121 * arg1 + this.anInt9123 * arg2 >> 14);
		arg3[1] = this.anInt9122 + (this.anInt9125 * arg0 + this.anInt9127 * arg1 + this.anInt9119 * arg2 >> 14);
		arg3[2] = this.anInt9126 + (this.anInt9116 * arg0 + this.anInt9118 * arg1 + this.anInt9120 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!su", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9125 = this.anInt9116 = this.anInt9121 = this.anInt9118 = this.anInt9123 = this.anInt9119 = 0;
		this.anInt9117 = this.anInt9127 = this.anInt9120 = 16384;
		this.anInt9124 = arg0;
		this.anInt9122 = arg1;
		this.anInt9126 = arg2;
	}

	@OriginalMember(owner = "client!su", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt9120 = 16384;
		this.anInt9117 = this.anInt9127 = Class2_Sub3.anIntArray621[arg0 & 0x3FFF];
		this.anInt9125 = Class2_Sub3.anIntArray620[arg0 & 0x3FFF];
		this.anInt9121 = -this.anInt9125;
		this.anInt9123 = this.anInt9124 = this.anInt9119 = this.anInt9122 = this.anInt9116 = this.anInt9118 = this.anInt9126 = 0;
	}

	@OriginalMember(owner = "client!su", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt9117 = 16384;
		this.anInt9127 = this.anInt9120 = Class2_Sub3.anIntArray621[arg0 & 0x3FFF];
		this.anInt9118 = Class2_Sub3.anIntArray620[arg0 & 0x3FFF];
		this.anInt9119 = -this.anInt9118;
		this.anInt9121 = this.anInt9123 = this.anInt9124 = this.anInt9125 = this.anInt9122 = this.anInt9116 = this.anInt9126 = 0;
	}

	@OriginalMember(owner = "client!su", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class2_Sub3.anIntArray621[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class2_Sub3.anIntArray620[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class2_Sub3.anIntArray621[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class2_Sub3.anIntArray620[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class2_Sub3.anIntArray621[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class2_Sub3.anIntArray620[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt9117 = local17 * local29 + local23 * local47 >> 14;
		this.anInt9125 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt9116 = local23 * local5 >> 14;
		this.anInt9121 = local5 * local35 >> 14;
		this.anInt9127 = local5 * local29 >> 14;
		this.anInt9118 = -local11;
		this.anInt9123 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt9119 = local23 * local35 + local17 * local41 >> 14;
		this.anInt9120 = local17 * local5 >> 14;
		this.anInt9124 = -arg0 * this.anInt9117 - arg1 * this.anInt9121 - arg2 * this.anInt9123 >> 14;
		this.anInt9122 = -arg0 * this.anInt9125 - arg1 * this.anInt9127 - arg2 * this.anInt9119 >> 14;
		this.anInt9126 = -arg0 * this.anInt9116 - arg1 * this.anInt9118 - arg2 * this.anInt9120 >> 14;
	}

	@OriginalMember(owner = "client!su", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class2_Sub3.anIntArray621[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class2_Sub3.anIntArray620[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt9117;
		@Pc(17) int local17 = this.anInt9121;
		@Pc(20) int local20 = this.anInt9123;
		@Pc(23) int local23 = this.anInt9124;
		this.anInt9117 = local14 * local5 + this.anInt9116 * local11 >> 14;
		this.anInt9116 = this.anInt9116 * local5 - local14 * local11 >> 14;
		this.anInt9121 = local17 * local5 + this.anInt9118 * local11 >> 14;
		this.anInt9118 = this.anInt9118 * local5 - local17 * local11 >> 14;
		this.anInt9123 = local20 * local5 + this.anInt9120 * local11 >> 14;
		this.anInt9120 = this.anInt9120 * local5 - local20 * local11 >> 14;
		this.anInt9124 = local23 * local5 + this.anInt9126 * local11 >> 14;
		this.anInt9126 = this.anInt9126 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!su", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class255 arg0) {
		@Pc(2) Class255_Sub2 local2 = (Class255_Sub2) arg0;
		this.anInt9117 = local2.anInt9117;
		this.anInt9121 = local2.anInt9121;
		this.anInt9123 = local2.anInt9123;
		this.anInt9124 = local2.anInt9124;
		this.anInt9125 = local2.anInt9125;
		this.anInt9127 = local2.anInt9127;
		this.anInt9119 = local2.anInt9119;
		this.anInt9122 = local2.anInt9122;
		this.anInt9116 = local2.anInt9116;
		this.anInt9118 = local2.anInt9118;
		this.anInt9120 = local2.anInt9120;
		this.anInt9126 = local2.anInt9126;
	}
}
