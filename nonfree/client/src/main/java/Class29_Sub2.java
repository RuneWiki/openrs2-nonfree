import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public int anInt3837;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public int anInt3839;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public int anInt3840;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public int anInt3841;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	public int anInt3842;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	public int anInt3845;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
	public int anInt3846;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class29_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3836 = this.anInt3846 = this.anInt3845 = this.anInt3844 = this.anInt3842 = this.anInt3835 = 0;
		this.anInt3839 = this.anInt3837 = this.anInt3840 = 32768;
		this.anInt3841 = arg0;
		this.anInt3843 = arg1;
		this.anInt3838 = arg2;
	}

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3841 += arg0;
		this.anInt3843 += arg1;
		this.anInt3838 += arg2;
	}

	@OriginalMember(owner = "client!lc", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class30.anIntArray37[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class30.anIntArray38[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3836;
		@Pc(17) int local17 = this.anInt3837;
		@Pc(20) int local20 = this.anInt3835;
		@Pc(23) int local23 = this.anInt3843;
		this.anInt3836 = local14 * local5 - this.anInt3846 * local11 >> 15;
		this.anInt3846 = local14 * local11 + this.anInt3846 * local5 >> 15;
		this.anInt3837 = local17 * local5 - this.anInt3844 * local11 >> 15;
		this.anInt3844 = local17 * local11 + this.anInt3844 * local5 >> 15;
		this.anInt3835 = local20 * local5 - this.anInt3840 * local11 >> 15;
		this.anInt3840 = local20 * local11 + this.anInt3840 * local5 >> 15;
		this.anInt3843 = local23 * local5 - this.anInt3838 * local11 >> 15;
		this.anInt3838 = local23 * local11 + this.anInt3838 * local5 >> 15;
	}

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3839 * arg0 + this.anInt3845 * arg1 + this.anInt3842 * arg2 >> 15;
		arg3[1] = this.anInt3836 * arg0 + this.anInt3837 * arg1 + this.anInt3835 * arg2 >> 15;
		arg3[2] = this.anInt3846 * arg0 + this.anInt3844 * arg1 + this.anInt3840 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt3836 = this.anInt3846 = this.anInt3845 = this.anInt3844 = this.anInt3842 = this.anInt3835 = this.anInt3841 = this.anInt3843 = this.anInt3838 = 0;
		this.anInt3839 = this.anInt3837 = this.anInt3840 = 32768;
	}

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt3840 = 32768;
		this.anInt3839 = this.anInt3837 = Class30.anIntArray37[arg0 & 0x3FFF];
		this.anInt3836 = Class30.anIntArray38[arg0 & 0x3FFF];
		this.anInt3845 = -this.anInt3836;
		this.anInt3842 = this.anInt3841 = this.anInt3835 = this.anInt3843 = this.anInt3846 = this.anInt3844 = this.anInt3838 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class29 method4107() {
		@Pc(3) Class29_Sub2 local3 = new Class29_Sub2();
		local3.anInt3839 = this.anInt3839;
		local3.anInt3845 = this.anInt3845;
		local3.anInt3842 = this.anInt3842;
		local3.anInt3841 = this.anInt3841;
		local3.anInt3836 = this.anInt3836;
		local3.anInt3837 = this.anInt3837;
		local3.anInt3835 = this.anInt3835;
		local3.anInt3843 = this.anInt3843;
		local3.anInt3846 = this.anInt3846;
		local3.anInt3844 = this.anInt3844;
		local3.anInt3840 = this.anInt3840;
		local3.anInt3838 = this.anInt3838;
		return local3;
	}

	@OriginalMember(owner = "client!lc", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt3837 = 32768;
		this.anInt3839 = this.anInt3840 = Class30.anIntArray37[arg0 & 0x3FFF];
		this.anInt3842 = Class30.anIntArray38[arg0 & 0x3FFF];
		this.anInt3846 = -this.anInt3842;
		this.anInt3845 = this.anInt3841 = this.anInt3836 = this.anInt3835 = this.anInt3843 = this.anInt3844 = this.anInt3838 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt3841;
		@Pc(13) int local13 = arg0[1] - this.anInt3843;
		@Pc(20) int local20 = arg0[2] - this.anInt3838;
		arg0[0] = this.anInt3839 * local6 + this.anInt3836 * local13 + this.anInt3846 * local20 >> 15;
		arg0[1] = this.anInt3845 * local6 + this.anInt3837 * local13 + this.anInt3844 * local20 >> 15;
		arg0[2] = this.anInt3842 * local6 + this.anInt3835 * local13 + this.anInt3840 * local20 >> 15;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt3839 = 32768;
		this.anInt3837 = this.anInt3840 = Class30.anIntArray37[arg0 & 0x3FFF];
		this.anInt3844 = Class30.anIntArray38[arg0 & 0x3FFF];
		this.anInt3835 = -this.anInt3844;
		this.anInt3845 = this.anInt3842 = this.anInt3841 = this.anInt3836 = this.anInt3843 = this.anInt3846 = this.anInt3838 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class29 arg0) {
		@Pc(2) Class29_Sub2 local2 = (Class29_Sub2) arg0;
		this.anInt3839 = local2.anInt3839;
		this.anInt3845 = local2.anInt3845;
		this.anInt3842 = local2.anInt3842;
		this.anInt3841 = local2.anInt3841;
		this.anInt3836 = local2.anInt3836;
		this.anInt3837 = local2.anInt3837;
		this.anInt3835 = local2.anInt3835;
		this.anInt3843 = local2.anInt3843;
		this.anInt3846 = local2.anInt3846;
		this.anInt3844 = local2.anInt3844;
		this.anInt3840 = local2.anInt3840;
		this.anInt3838 = local2.anInt3838;
	}

	@OriginalMember(owner = "client!lc", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class30.anIntArray37[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class30.anIntArray38[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt3839;
		@Pc(17) int local17 = this.anInt3845;
		@Pc(20) int local20 = this.anInt3842;
		@Pc(23) int local23 = this.anInt3841;
		this.anInt3839 = local14 * local5 + this.anInt3846 * local11 >> 15;
		this.anInt3846 = this.anInt3846 * local5 - local14 * local11 >> 15;
		this.anInt3845 = local17 * local5 + this.anInt3844 * local11 >> 15;
		this.anInt3844 = this.anInt3844 * local5 - local17 * local11 >> 15;
		this.anInt3842 = local20 * local5 + this.anInt3840 * local11 >> 15;
		this.anInt3840 = this.anInt3840 * local5 - local20 * local11 >> 15;
		this.anInt3841 = local23 * local5 + this.anInt3838 * local11 >> 15;
		this.anInt3838 = this.anInt3838 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt3841 + (this.anInt3839 * arg0 + this.anInt3845 * arg1 + this.anInt3842 * arg2 >> 15);
		arg3[1] = this.anInt3843 + (this.anInt3836 * arg0 + this.anInt3837 * arg1 + this.anInt3835 * arg2 >> 15);
		arg3[2] = this.anInt3838 + (this.anInt3846 * arg0 + this.anInt3844 * arg1 + this.anInt3840 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!lc", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class30.anIntArray37[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class30.anIntArray38[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class30.anIntArray37[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class30.anIntArray38[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class30.anIntArray37[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class30.anIntArray38[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt3839 = local17 * local29 + local23 * local47 >> 15;
		this.anInt3836 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt3846 = local23 * local5 >> 15;
		this.anInt3845 = local5 * local35 >> 15;
		this.anInt3837 = local5 * local29 >> 15;
		this.anInt3844 = -local11;
		this.anInt3842 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt3835 = local23 * local35 + local17 * local41 >> 15;
		this.anInt3840 = local17 * local5 >> 15;
		this.anInt3841 = -arg0 * this.anInt3839 - arg1 * this.anInt3845 - arg2 * this.anInt3842 >> 15;
		this.anInt3843 = -arg0 * this.anInt3836 - arg1 * this.anInt3837 - arg2 * this.anInt3835 >> 15;
		this.anInt3838 = -arg0 * this.anInt3846 - arg1 * this.anInt3844 - arg2 * this.anInt3840 >> 15;
	}
}
