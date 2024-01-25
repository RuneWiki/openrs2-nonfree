import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	public int anInt2896;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	public int anInt2906;

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class54_Sub1() {
		this.method4785();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class104.anIntArray706[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class104.anIntArray705[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class104.anIntArray706[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class104.anIntArray705[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class104.anIntArray706[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class104.anIntArray705[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2898 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2904 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2897 = local23 * local5 >> 15;
		this.anInt2906 = local5 * local35 >> 15;
		this.anInt2907 = local5 * local29 >> 15;
		this.anInt2902 = -local11;
		this.anInt2905 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2899 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2900 = local17 * local5 >> 15;
		this.anInt2896 = -arg0 * this.anInt2898 - arg1 * this.anInt2906 - arg2 * this.anInt2905 >> 15;
		this.anInt2903 = -arg0 * this.anInt2904 - arg1 * this.anInt2907 - arg2 * this.anInt2899 >> 15;
		this.anInt2901 = -arg0 * this.anInt2897 - arg1 * this.anInt2902 - arg2 * this.anInt2900 >> 15;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()Lclient!it;")
	public Class54_Sub1 method2665() {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		local3.anInt2898 = this.anInt2898;
		local3.anInt2906 = this.anInt2906;
		local3.anInt2905 = this.anInt2905;
		local3.anInt2896 = this.anInt2896;
		local3.anInt2904 = this.anInt2904;
		local3.anInt2907 = this.anInt2907;
		local3.anInt2899 = this.anInt2899;
		local3.anInt2903 = this.anInt2903;
		local3.anInt2897 = this.anInt2897;
		local3.anInt2902 = this.anInt2902;
		local3.anInt2900 = this.anInt2900;
		local3.anInt2901 = this.anInt2901;
		return local3;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(III)V")
	@Override
	public void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2904 = this.anInt2897 = this.anInt2906 = this.anInt2902 = this.anInt2905 = this.anInt2899 = 0;
		this.anInt2898 = this.anInt2907 = this.anInt2900 = 32768;
		this.anInt2896 = arg0;
		this.anInt2903 = arg1;
		this.anInt2901 = arg2;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	@Override
	public void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2896 += arg0;
		this.anInt2903 += arg1;
		this.anInt2901 += arg2;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!dr;)V")
	@Override
	public void method4781(@OriginalArg(0) Class54 arg0) {
		@Pc(2) Class54_Sub1 local2 = (Class54_Sub1) arg0;
		this.anInt2898 = local2.anInt2898;
		this.anInt2906 = local2.anInt2906;
		this.anInt2905 = local2.anInt2905;
		this.anInt2896 = local2.anInt2896;
		this.anInt2904 = local2.anInt2904;
		this.anInt2907 = local2.anInt2907;
		this.anInt2899 = local2.anInt2899;
		this.anInt2903 = local2.anInt2903;
		this.anInt2897 = local2.anInt2897;
		this.anInt2902 = local2.anInt2902;
		this.anInt2900 = local2.anInt2900;
		this.anInt2901 = local2.anInt2901;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2896 + (this.anInt2898 * arg0 + this.anInt2906 * arg1 + this.anInt2905 * arg2 >> 15);
		arg3[1] = this.anInt2903 + (this.anInt2904 * arg0 + this.anInt2907 * arg1 + this.anInt2899 * arg2 >> 15);
		arg3[2] = this.anInt2901 + (this.anInt2897 * arg0 + this.anInt2902 * arg1 + this.anInt2900 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([I)V")
	@Override
	public void method4788(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2896;
		@Pc(13) int local13 = arg0[1] - this.anInt2903;
		@Pc(20) int local20 = arg0[2] - this.anInt2901;
		arg0[0] = this.anInt2898 * local6 + this.anInt2904 * local13 + this.anInt2897 * local20 >> 15;
		arg0[1] = this.anInt2906 * local6 + this.anInt2907 * local13 + this.anInt2902 * local20 >> 15;
		arg0[2] = this.anInt2905 * local6 + this.anInt2899 * local13 + this.anInt2900 * local20 >> 15;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
	@Override
	public void method4790(@OriginalArg(0) int arg0) {
		this.anInt2898 = 32768;
		this.anInt2907 = this.anInt2900 = Class104.anIntArray706[arg0 & 0x3FFF];
		this.anInt2902 = Class104.anIntArray705[arg0 & 0x3FFF];
		this.anInt2899 = -this.anInt2902;
		this.anInt2906 = this.anInt2905 = this.anInt2896 = this.anInt2904 = this.anInt2903 = this.anInt2897 = this.anInt2901 = 0;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class104.anIntArray706[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class104.anIntArray705[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2898;
		@Pc(17) int local17 = this.anInt2906;
		@Pc(20) int local20 = this.anInt2905;
		@Pc(23) int local23 = this.anInt2896;
		this.anInt2898 = local14 * local5 + this.anInt2897 * local11 >> 15;
		this.anInt2897 = this.anInt2897 * local5 - local14 * local11 >> 15;
		this.anInt2906 = local17 * local5 + this.anInt2902 * local11 >> 15;
		this.anInt2902 = this.anInt2902 * local5 - local17 * local11 >> 15;
		this.anInt2905 = local20 * local5 + this.anInt2900 * local11 >> 15;
		this.anInt2900 = this.anInt2900 * local5 - local20 * local11 >> 15;
		this.anInt2896 = local23 * local5 + this.anInt2901 * local11 >> 15;
		this.anInt2901 = this.anInt2901 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	@Override
	public void method4784(@OriginalArg(0) int arg0) {
		this.anInt2900 = 32768;
		this.anInt2898 = this.anInt2907 = Class104.anIntArray706[arg0 & 0x3FFF];
		this.anInt2904 = Class104.anIntArray705[arg0 & 0x3FFF];
		this.anInt2906 = -this.anInt2904;
		this.anInt2905 = this.anInt2896 = this.anInt2899 = this.anInt2903 = this.anInt2897 = this.anInt2902 = this.anInt2901 = 0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
	@Override
	public void method4785() {
		this.anInt2904 = this.anInt2897 = this.anInt2906 = this.anInt2902 = this.anInt2905 = this.anInt2899 = this.anInt2896 = this.anInt2903 = this.anInt2901 = 0;
		this.anInt2898 = this.anInt2907 = this.anInt2900 = 32768;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	@Override
	public void method4779(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class104.anIntArray706[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class104.anIntArray705[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2904;
		@Pc(17) int local17 = this.anInt2907;
		@Pc(20) int local20 = this.anInt2899;
		@Pc(23) int local23 = this.anInt2903;
		this.anInt2904 = local14 * local5 - this.anInt2897 * local11 >> 15;
		this.anInt2897 = local14 * local11 + this.anInt2897 * local5 >> 15;
		this.anInt2907 = local17 * local5 - this.anInt2902 * local11 >> 15;
		this.anInt2902 = local17 * local11 + this.anInt2902 * local5 >> 15;
		this.anInt2899 = local20 * local5 - this.anInt2900 * local11 >> 15;
		this.anInt2900 = local20 * local11 + this.anInt2900 * local5 >> 15;
		this.anInt2903 = local23 * local5 - this.anInt2901 * local11 >> 15;
		this.anInt2901 = local23 * local11 + this.anInt2901 * local5 >> 15;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	@Override
	public void method4782(@OriginalArg(0) int arg0) {
		this.anInt2907 = 32768;
		this.anInt2898 = this.anInt2900 = Class104.anIntArray706[arg0 & 0x3FFF];
		this.anInt2905 = Class104.anIntArray705[arg0 & 0x3FFF];
		this.anInt2897 = -this.anInt2905;
		this.anInt2906 = this.anInt2896 = this.anInt2904 = this.anInt2899 = this.anInt2903 = this.anInt2902 = this.anInt2901 = 0;
	}
}
