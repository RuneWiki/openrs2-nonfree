import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class43_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!cj", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt784 = 32768;
		this.anInt781 = this.anInt782 = Class262.anIntArray576[arg0 & 0x3FFF];
		this.anInt790 = Class262.anIntArray575[arg0 & 0x3FFF];
		this.anInt785 = -this.anInt790;
		this.anInt787 = this.anInt788 = this.anInt791 = this.anInt789 = this.anInt783 = this.anInt786 = this.anInt792 = 0;
	}

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt781 = 32768;
		this.anInt784 = this.anInt782 = Class262.anIntArray576[arg0 & 0x3FFF];
		this.anInt788 = Class262.anIntArray575[arg0 & 0x3FFF];
		this.anInt786 = -this.anInt788;
		this.anInt787 = this.anInt791 = this.anInt789 = this.anInt785 = this.anInt783 = this.anInt790 = this.anInt792 = 0;
	}

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class262.anIntArray576[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class262.anIntArray575[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class262.anIntArray576[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class262.anIntArray575[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class262.anIntArray576[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class262.anIntArray575[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt784 = local17 * local29 + local23 * local47 >> 15;
		this.anInt789 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt786 = local23 * local5 >> 15;
		this.anInt787 = local5 * local35 >> 15;
		this.anInt781 = local5 * local29 >> 15;
		this.anInt790 = -local11;
		this.anInt788 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt785 = local23 * local35 + local17 * local41 >> 15;
		this.anInt782 = local17 * local5 >> 15;
		this.anInt791 = -arg0 * this.anInt784 - arg1 * this.anInt787 - arg2 * this.anInt788 >> 15;
		this.anInt783 = -arg0 * this.anInt789 - arg1 * this.anInt781 - arg2 * this.anInt785 >> 15;
		this.anInt792 = -arg0 * this.anInt786 - arg1 * this.anInt790 - arg2 * this.anInt782 >> 15;
	}

	@OriginalMember(owner = "client!cj", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class43 arg0) {
		@Pc(2) Class43_Sub1 local2 = (Class43_Sub1) arg0;
		this.anInt784 = local2.anInt784;
		this.anInt787 = local2.anInt787;
		this.anInt788 = local2.anInt788;
		this.anInt791 = local2.anInt791;
		this.anInt789 = local2.anInt789;
		this.anInt781 = local2.anInt781;
		this.anInt785 = local2.anInt785;
		this.anInt783 = local2.anInt783;
		this.anInt786 = local2.anInt786;
		this.anInt790 = local2.anInt790;
		this.anInt782 = local2.anInt782;
		this.anInt792 = local2.anInt792;
	}

	@OriginalMember(owner = "client!cj", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt791 += arg0;
		this.anInt783 += arg1;
		this.anInt792 += arg2;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class43 method5107() {
		@Pc(3) Class43_Sub1 local3 = new Class43_Sub1();
		local3.anInt784 = this.anInt784;
		local3.anInt787 = this.anInt787;
		local3.anInt788 = this.anInt788;
		local3.anInt791 = this.anInt791;
		local3.anInt789 = this.anInt789;
		local3.anInt781 = this.anInt781;
		local3.anInt785 = this.anInt785;
		local3.anInt783 = this.anInt783;
		local3.anInt786 = this.anInt786;
		local3.anInt790 = this.anInt790;
		local3.anInt782 = this.anInt782;
		local3.anInt792 = this.anInt792;
		return local3;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class262.anIntArray576[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class262.anIntArray575[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt784;
		@Pc(17) int local17 = this.anInt787;
		@Pc(20) int local20 = this.anInt788;
		@Pc(23) int local23 = this.anInt791;
		this.anInt784 = local14 * local5 + this.anInt786 * local11 >> 15;
		this.anInt786 = this.anInt786 * local5 - local14 * local11 >> 15;
		this.anInt787 = local17 * local5 + this.anInt790 * local11 >> 15;
		this.anInt790 = this.anInt790 * local5 - local17 * local11 >> 15;
		this.anInt788 = local20 * local5 + this.anInt782 * local11 >> 15;
		this.anInt782 = this.anInt782 * local5 - local20 * local11 >> 15;
		this.anInt791 = local23 * local5 + this.anInt792 * local11 >> 15;
		this.anInt792 = this.anInt792 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!cj", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class262.anIntArray576[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class262.anIntArray575[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt789;
		@Pc(17) int local17 = this.anInt781;
		@Pc(20) int local20 = this.anInt785;
		@Pc(23) int local23 = this.anInt783;
		this.anInt789 = local14 * local5 - this.anInt786 * local11 >> 15;
		this.anInt786 = local14 * local11 + this.anInt786 * local5 >> 15;
		this.anInt781 = local17 * local5 - this.anInt790 * local11 >> 15;
		this.anInt790 = local17 * local11 + this.anInt790 * local5 >> 15;
		this.anInt785 = local20 * local5 - this.anInt782 * local11 >> 15;
		this.anInt782 = local20 * local11 + this.anInt782 * local5 >> 15;
		this.anInt783 = local23 * local5 - this.anInt792 * local11 >> 15;
		this.anInt792 = local23 * local11 + this.anInt792 * local5 >> 15;
	}

	@OriginalMember(owner = "client!cj", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt789 = this.anInt786 = this.anInt787 = this.anInt790 = this.anInt788 = this.anInt785 = this.anInt791 = this.anInt783 = this.anInt792 = 0;
		this.anInt784 = this.anInt781 = this.anInt782 = 32768;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt791 + (this.anInt784 * arg0 + this.anInt787 * arg1 + this.anInt788 * arg2 >> 15);
		arg3[1] = this.anInt783 + (this.anInt789 * arg0 + this.anInt781 * arg1 + this.anInt785 * arg2 >> 15);
		arg3[2] = this.anInt792 + (this.anInt786 * arg0 + this.anInt790 * arg1 + this.anInt782 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt784 * arg0 + this.anInt787 * arg1 + this.anInt788 * arg2 >> 15;
		arg3[1] = this.anInt789 * arg0 + this.anInt781 * arg1 + this.anInt785 * arg2 >> 15;
		arg3[2] = this.anInt786 * arg0 + this.anInt790 * arg1 + this.anInt782 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt791;
		@Pc(13) int local13 = arg0[1] - this.anInt783;
		@Pc(20) int local20 = arg0[2] - this.anInt792;
		arg0[0] = this.anInt784 * local6 + this.anInt789 * local13 + this.anInt786 * local20 >> 15;
		arg0[1] = this.anInt787 * local6 + this.anInt781 * local13 + this.anInt790 * local20 >> 15;
		arg0[2] = this.anInt788 * local6 + this.anInt785 * local13 + this.anInt782 * local20 >> 15;
	}

	@OriginalMember(owner = "client!cj", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt782 = 32768;
		this.anInt784 = this.anInt781 = Class262.anIntArray576[arg0 & 0x3FFF];
		this.anInt789 = Class262.anIntArray575[arg0 & 0x3FFF];
		this.anInt787 = -this.anInt789;
		this.anInt788 = this.anInt791 = this.anInt785 = this.anInt783 = this.anInt786 = this.anInt790 = this.anInt792 = 0;
	}

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt789 = this.anInt786 = this.anInt787 = this.anInt790 = this.anInt788 = this.anInt785 = 0;
		this.anInt784 = this.anInt781 = this.anInt782 = 32768;
		this.anInt791 = arg0;
		this.anInt783 = arg1;
		this.anInt792 = arg2;
	}
}
