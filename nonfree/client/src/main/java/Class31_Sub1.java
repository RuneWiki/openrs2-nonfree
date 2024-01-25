import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt2887;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt2888;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt2889;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt2890;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public int anInt2892;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class31_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.anInt2892 = 32768;
		this.anInt2888 = this.anInt2891 = Class155.anIntArray341[arg0 & 0x3FFF];
		this.anInt2893 = Class155.anIntArray342[arg0 & 0x3FFF];
		this.anInt2887 = -this.anInt2893;
		this.anInt2882 = this.anInt2889 = this.anInt2883 = this.anInt2886 = this.anInt2885 = this.anInt2884 = this.anInt2890 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4797() {
		@Pc(3) Class31_Sub1 local3 = new Class31_Sub1();
		local3.anInt2888 = this.anInt2888;
		local3.anInt2887 = this.anInt2887;
		local3.anInt2882 = this.anInt2882;
		local3.anInt2889 = this.anInt2889;
		local3.anInt2893 = this.anInt2893;
		local3.anInt2891 = this.anInt2891;
		local3.anInt2883 = this.anInt2883;
		local3.anInt2886 = this.anInt2886;
		local3.anInt2885 = this.anInt2885;
		local3.anInt2884 = this.anInt2884;
		local3.anInt2892 = this.anInt2892;
		local3.anInt2890 = this.anInt2890;
		return local3;
	}

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2888 * arg0 + this.anInt2887 * arg1 + this.anInt2882 * arg2 >> 15;
		arg3[1] = this.anInt2893 * arg0 + this.anInt2891 * arg1 + this.anInt2883 * arg2 >> 15;
		arg3[2] = this.anInt2885 * arg0 + this.anInt2884 * arg1 + this.anInt2892 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.anInt2891 = 32768;
		this.anInt2888 = this.anInt2892 = Class155.anIntArray341[arg0 & 0x3FFF];
		this.anInt2882 = Class155.anIntArray342[arg0 & 0x3FFF];
		this.anInt2885 = -this.anInt2882;
		this.anInt2887 = this.anInt2889 = this.anInt2893 = this.anInt2883 = this.anInt2886 = this.anInt2884 = this.anInt2890 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2889;
		@Pc(13) int local13 = arg0[1] - this.anInt2886;
		@Pc(20) int local20 = arg0[2] - this.anInt2890;
		arg0[0] = this.anInt2888 * local6 + this.anInt2893 * local13 + this.anInt2885 * local20 >> 15;
		arg0[1] = this.anInt2887 * local6 + this.anInt2891 * local13 + this.anInt2884 * local20 >> 15;
		arg0[2] = this.anInt2882 * local6 + this.anInt2883 * local13 + this.anInt2892 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class155.anIntArray341[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class155.anIntArray342[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2893;
		@Pc(17) int local17 = this.anInt2891;
		@Pc(20) int local20 = this.anInt2883;
		@Pc(23) int local23 = this.anInt2886;
		this.anInt2893 = local14 * local5 - this.anInt2885 * local11 >> 15;
		this.anInt2885 = local14 * local11 + this.anInt2885 * local5 >> 15;
		this.anInt2891 = local17 * local5 - this.anInt2884 * local11 >> 15;
		this.anInt2884 = local17 * local11 + this.anInt2884 * local5 >> 15;
		this.anInt2883 = local20 * local5 - this.anInt2892 * local11 >> 15;
		this.anInt2892 = local20 * local11 + this.anInt2892 * local5 >> 15;
		this.anInt2886 = local23 * local5 - this.anInt2890 * local11 >> 15;
		this.anInt2890 = local23 * local11 + this.anInt2890 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class31 arg0) {
		@Pc(2) Class31_Sub1 local2 = (Class31_Sub1) arg0;
		this.anInt2888 = local2.anInt2888;
		this.anInt2887 = local2.anInt2887;
		this.anInt2882 = local2.anInt2882;
		this.anInt2889 = local2.anInt2889;
		this.anInt2893 = local2.anInt2893;
		this.anInt2891 = local2.anInt2891;
		this.anInt2883 = local2.anInt2883;
		this.anInt2886 = local2.anInt2886;
		this.anInt2885 = local2.anInt2885;
		this.anInt2884 = local2.anInt2884;
		this.anInt2892 = local2.anInt2892;
		this.anInt2890 = local2.anInt2890;
	}

	@OriginalMember(owner = "client!ii", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class155.anIntArray341[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class155.anIntArray342[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class155.anIntArray341[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class155.anIntArray342[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class155.anIntArray341[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class155.anIntArray342[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2888 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2893 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2885 = local23 * local5 >> 15;
		this.anInt2887 = local5 * local35 >> 15;
		this.anInt2891 = local5 * local29 >> 15;
		this.anInt2884 = -local11;
		this.anInt2882 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2883 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2892 = local17 * local5 >> 15;
		this.anInt2889 = -arg0 * this.anInt2888 - arg1 * this.anInt2887 - arg2 * this.anInt2882 >> 15;
		this.anInt2886 = -arg0 * this.anInt2893 - arg1 * this.anInt2891 - arg2 * this.anInt2883 >> 15;
		this.anInt2890 = -arg0 * this.anInt2885 - arg1 * this.anInt2884 - arg2 * this.anInt2892 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2889 += arg0;
		this.anInt2886 += arg1;
		this.anInt2890 += arg2;
	}

	@OriginalMember(owner = "client!ii", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class155.anIntArray341[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class155.anIntArray342[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2888;
		@Pc(17) int local17 = this.anInt2887;
		@Pc(20) int local20 = this.anInt2882;
		@Pc(23) int local23 = this.anInt2889;
		this.anInt2888 = local14 * local5 + this.anInt2885 * local11 >> 15;
		this.anInt2885 = this.anInt2885 * local5 - local14 * local11 >> 15;
		this.anInt2887 = local17 * local5 + this.anInt2884 * local11 >> 15;
		this.anInt2884 = this.anInt2884 * local5 - local17 * local11 >> 15;
		this.anInt2882 = local20 * local5 + this.anInt2892 * local11 >> 15;
		this.anInt2892 = this.anInt2892 * local5 - local20 * local11 >> 15;
		this.anInt2889 = local23 * local5 + this.anInt2890 * local11 >> 15;
		this.anInt2890 = this.anInt2890 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.anInt2888 = 32768;
		this.anInt2891 = this.anInt2892 = Class155.anIntArray341[arg0 & 0x3FFF];
		this.anInt2884 = Class155.anIntArray342[arg0 & 0x3FFF];
		this.anInt2883 = -this.anInt2884;
		this.anInt2887 = this.anInt2882 = this.anInt2889 = this.anInt2893 = this.anInt2886 = this.anInt2885 = this.anInt2890 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.anInt2893 = this.anInt2885 = this.anInt2887 = this.anInt2884 = this.anInt2882 = this.anInt2883 = this.anInt2889 = this.anInt2886 = this.anInt2890 = 0;
		this.anInt2888 = this.anInt2891 = this.anInt2892 = 32768;
	}

	@OriginalMember(owner = "client!ii", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2893 = this.anInt2885 = this.anInt2887 = this.anInt2884 = this.anInt2882 = this.anInt2883 = 0;
		this.anInt2888 = this.anInt2891 = this.anInt2892 = 32768;
		this.anInt2889 = arg0;
		this.anInt2886 = arg1;
		this.anInt2890 = arg2;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2889 + (this.anInt2888 * arg0 + this.anInt2887 * arg1 + this.anInt2882 * arg2 >> 15);
		arg3[1] = this.anInt2886 + (this.anInt2893 * arg0 + this.anInt2891 * arg1 + this.anInt2883 * arg2 >> 15);
		arg3[2] = this.anInt2890 + (this.anInt2885 * arg0 + this.anInt2884 * arg1 + this.anInt2892 * arg2 >> 15);
	}
}
