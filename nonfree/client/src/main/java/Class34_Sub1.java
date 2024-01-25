import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
	public int anInt765;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt756 * arg0 + this.anInt764 * arg1 + this.anInt757 * arg2 >> 14;
		arg3[1] = this.anInt760 * arg0 + this.anInt767 * arg1 + this.anInt759 * arg2 >> 14;
		arg3[2] = this.anInt765 * arg0 + this.anInt758 * arg1 + this.anInt761 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!bt", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class34 arg0) {
		@Pc(2) Class34_Sub1 local2 = (Class34_Sub1) arg0;
		this.anInt756 = local2.anInt756;
		this.anInt764 = local2.anInt764;
		this.anInt757 = local2.anInt757;
		this.anInt766 = local2.anInt766;
		this.anInt760 = local2.anInt760;
		this.anInt767 = local2.anInt767;
		this.anInt759 = local2.anInt759;
		this.anInt762 = local2.anInt762;
		this.anInt765 = local2.anInt765;
		this.anInt758 = local2.anInt758;
		this.anInt761 = local2.anInt761;
		this.anInt763 = local2.anInt763;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class34 method7612() {
		@Pc(3) Class34_Sub1 local3 = new Class34_Sub1();
		local3.anInt756 = this.anInt756;
		local3.anInt764 = this.anInt764;
		local3.anInt757 = this.anInt757;
		local3.anInt766 = this.anInt766;
		local3.anInt760 = this.anInt760;
		local3.anInt767 = this.anInt767;
		local3.anInt759 = this.anInt759;
		local3.anInt762 = this.anInt762;
		local3.anInt765 = this.anInt765;
		local3.anInt758 = this.anInt758;
		local3.anInt761 = this.anInt761;
		local3.anInt763 = this.anInt763;
		return local3;
	}

	@OriginalMember(owner = "client!bt", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt756 = 16384;
		this.anInt767 = this.anInt761 = Class138.anIntArray393[arg0 & 0x3FFF];
		this.anInt758 = Class138.anIntArray392[arg0 & 0x3FFF];
		this.anInt759 = -this.anInt758;
		this.anInt764 = this.anInt757 = this.anInt766 = this.anInt760 = this.anInt762 = this.anInt765 = this.anInt763 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt760 = this.anInt765 = this.anInt764 = this.anInt758 = this.anInt757 = this.anInt759 = 0;
		this.anInt756 = this.anInt767 = this.anInt761 = 16384;
		this.anInt766 = arg0;
		this.anInt762 = arg1;
		this.anInt763 = arg2;
	}

	@OriginalMember(owner = "client!bt", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class138.anIntArray393[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class138.anIntArray392[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class138.anIntArray393[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class138.anIntArray392[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class138.anIntArray393[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class138.anIntArray392[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt756 = local17 * local29 + local23 * local47 >> 14;
		this.anInt760 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt765 = local23 * local5 >> 14;
		this.anInt764 = local5 * local35 >> 14;
		this.anInt767 = local5 * local29 >> 14;
		this.anInt758 = -local11;
		this.anInt757 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt759 = local23 * local35 + local17 * local41 >> 14;
		this.anInt761 = local17 * local5 >> 14;
		this.anInt766 = -arg0 * this.anInt756 - arg1 * this.anInt764 - arg2 * this.anInt757 >> 14;
		this.anInt762 = -arg0 * this.anInt760 - arg1 * this.anInt767 - arg2 * this.anInt759 >> 14;
		this.anInt763 = -arg0 * this.anInt765 - arg1 * this.anInt758 - arg2 * this.anInt761 >> 14;
	}

	@OriginalMember(owner = "client!bt", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class138.anIntArray393[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class138.anIntArray392[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt756;
		@Pc(17) int local17 = this.anInt764;
		@Pc(20) int local20 = this.anInt757;
		@Pc(23) int local23 = this.anInt766;
		this.anInt756 = local14 * local5 + this.anInt765 * local11 >> 14;
		this.anInt765 = this.anInt765 * local5 - local14 * local11 >> 14;
		this.anInt764 = local17 * local5 + this.anInt758 * local11 >> 14;
		this.anInt758 = this.anInt758 * local5 - local17 * local11 >> 14;
		this.anInt757 = local20 * local5 + this.anInt761 * local11 >> 14;
		this.anInt761 = this.anInt761 * local5 - local20 * local11 >> 14;
		this.anInt766 = local23 * local5 + this.anInt763 * local11 >> 14;
		this.anInt763 = this.anInt763 * local5 - local23 * local11 >> 14;
	}

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt766;
		@Pc(13) int local13 = arg0[1] - this.anInt762;
		@Pc(20) int local20 = arg0[2] - this.anInt763;
		arg0[0] = this.anInt756 * local6 + this.anInt760 * local13 + this.anInt765 * local20 >> 14;
		arg0[1] = this.anInt764 * local6 + this.anInt767 * local13 + this.anInt758 * local20 >> 14;
		arg0[2] = this.anInt757 * local6 + this.anInt759 * local13 + this.anInt761 * local20 >> 14;
	}

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class138.anIntArray393[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class138.anIntArray392[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt760;
		@Pc(17) int local17 = this.anInt767;
		@Pc(20) int local20 = this.anInt759;
		@Pc(23) int local23 = this.anInt762;
		this.anInt760 = local14 * local5 - this.anInt765 * local11 >> 14;
		this.anInt765 = local14 * local11 + this.anInt765 * local5 >> 14;
		this.anInt767 = local17 * local5 - this.anInt758 * local11 >> 14;
		this.anInt758 = local17 * local11 + this.anInt758 * local5 >> 14;
		this.anInt759 = local20 * local5 - this.anInt761 * local11 >> 14;
		this.anInt761 = local20 * local11 + this.anInt761 * local5 >> 14;
		this.anInt762 = local23 * local5 - this.anInt763 * local11 >> 14;
		this.anInt763 = local23 * local11 + this.anInt763 * local5 >> 14;
	}

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt766 += arg0;
		this.anInt762 += arg1;
		this.anInt763 += arg2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt766 + (this.anInt756 * arg0 + this.anInt764 * arg1 + this.anInt757 * arg2 >> 14);
		arg3[1] = this.anInt762 + (this.anInt760 * arg0 + this.anInt767 * arg1 + this.anInt759 * arg2 >> 14);
		arg3[2] = this.anInt763 + (this.anInt765 * arg0 + this.anInt758 * arg1 + this.anInt761 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt767 = 16384;
		this.anInt756 = this.anInt761 = Class138.anIntArray393[arg0 & 0x3FFF];
		this.anInt757 = Class138.anIntArray392[arg0 & 0x3FFF];
		this.anInt765 = -this.anInt757;
		this.anInt764 = this.anInt766 = this.anInt760 = this.anInt759 = this.anInt762 = this.anInt758 = this.anInt763 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt761 = 16384;
		this.anInt756 = this.anInt767 = Class138.anIntArray393[arg0 & 0x3FFF];
		this.anInt760 = Class138.anIntArray392[arg0 & 0x3FFF];
		this.anInt764 = -this.anInt760;
		this.anInt757 = this.anInt766 = this.anInt759 = this.anInt762 = this.anInt765 = this.anInt758 = this.anInt763 = 0;
	}

	@OriginalMember(owner = "client!bt", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt760 = this.anInt765 = this.anInt764 = this.anInt758 = this.anInt757 = this.anInt759 = this.anInt766 = this.anInt762 = this.anInt763 = 0;
		this.anInt756 = this.anInt767 = this.anInt761 = 16384;
	}
}
