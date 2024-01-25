import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class11_Sub1() {
		this.K();
	}

	@OriginalMember(owner = "client!ap", name = "N", descriptor = "(III[I)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt193 * arg0 + this.anInt196 * arg1 + this.anInt192 * arg2 >> 15;
		arg3[1] = this.anInt189 * arg0 + this.anInt194 * arg1 + this.anInt195 * arg2 >> 15;
		arg3[2] = this.anInt191 * arg0 + this.anInt188 * arg1 + this.anInt197 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ap", name = "ba", descriptor = "(I)V")
	@Override
	public void ba(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class65.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class65.anIntArray88[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt189;
		@Pc(17) int local17 = this.anInt194;
		@Pc(20) int local20 = this.anInt195;
		@Pc(23) int local23 = this.anInt186;
		this.anInt189 = local14 * local5 - this.anInt191 * local11 >> 15;
		this.anInt191 = local14 * local11 + this.anInt191 * local5 >> 15;
		this.anInt194 = local17 * local5 - this.anInt188 * local11 >> 15;
		this.anInt188 = local17 * local11 + this.anInt188 * local5 >> 15;
		this.anInt195 = local20 * local5 - this.anInt197 * local11 >> 15;
		this.anInt197 = local20 * local11 + this.anInt197 * local5 >> 15;
		this.anInt186 = local23 * local5 - this.anInt187 * local11 >> 15;
		this.anInt187 = local23 * local11 + this.anInt187 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ap", name = "M", descriptor = "([I)V")
	@Override
	public void M(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt190;
		@Pc(13) int local13 = arg0[1] - this.anInt186;
		@Pc(20) int local20 = arg0[2] - this.anInt187;
		arg0[0] = this.anInt193 * local6 + this.anInt189 * local13 + this.anInt191 * local20 >> 15;
		arg0[1] = this.anInt196 * local6 + this.anInt194 * local13 + this.anInt188 * local20 >> 15;
		arg0[2] = this.anInt192 * local6 + this.anInt195 * local13 + this.anInt197 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ap", name = "CA", descriptor = "(I)V")
	@Override
	public void CA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class65.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class65.anIntArray88[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt193;
		@Pc(17) int local17 = this.anInt196;
		@Pc(20) int local20 = this.anInt192;
		@Pc(23) int local23 = this.anInt190;
		this.anInt193 = local14 * local5 + this.anInt191 * local11 >> 15;
		this.anInt191 = this.anInt191 * local5 - local14 * local11 >> 15;
		this.anInt196 = local17 * local5 + this.anInt188 * local11 >> 15;
		this.anInt188 = this.anInt188 * local5 - local17 * local11 >> 15;
		this.anInt192 = local20 * local5 + this.anInt197 * local11 >> 15;
		this.anInt197 = this.anInt197 * local5 - local20 * local11 >> 15;
		this.anInt190 = local23 * local5 + this.anInt187 * local11 >> 15;
		this.anInt187 = this.anInt187 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ap", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt193 = 32768;
		this.anInt194 = this.anInt197 = Class65.anIntArray87[arg0 & 0x3FFF];
		this.anInt188 = Class65.anIntArray88[arg0 & 0x3FFF];
		this.anInt195 = -this.anInt188;
		this.anInt196 = this.anInt192 = this.anInt190 = this.anInt189 = this.anInt186 = this.anInt191 = this.anInt187 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "ya", descriptor = "(Lclient!n;)V")
	@Override
	public void ya(@OriginalArg(0) Class11 arg0) {
		@Pc(2) Class11_Sub1 local2 = (Class11_Sub1) arg0;
		this.anInt193 = local2.anInt193;
		this.anInt196 = local2.anInt196;
		this.anInt192 = local2.anInt192;
		this.anInt190 = local2.anInt190;
		this.anInt189 = local2.anInt189;
		this.anInt194 = local2.anInt194;
		this.anInt195 = local2.anInt195;
		this.anInt186 = local2.anInt186;
		this.anInt191 = local2.anInt191;
		this.anInt188 = local2.anInt188;
		this.anInt197 = local2.anInt197;
		this.anInt187 = local2.anInt187;
	}

	@OriginalMember(owner = "client!ap", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt190 += arg0;
		this.anInt186 += arg1;
		this.anInt187 += arg2;
	}

	@OriginalMember(owner = "client!ap", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		this.anInt197 = 32768;
		this.anInt193 = this.anInt194 = Class65.anIntArray87[arg0 & 0x3FFF];
		this.anInt189 = Class65.anIntArray88[arg0 & 0x3FFF];
		this.anInt196 = -this.anInt189;
		this.anInt192 = this.anInt190 = this.anInt195 = this.anInt186 = this.anInt191 = this.anInt188 = this.anInt187 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "IA", descriptor = "(IIIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class65.anIntArray87[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class65.anIntArray88[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class65.anIntArray87[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class65.anIntArray88[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class65.anIntArray87[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class65.anIntArray88[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt193 = local17 * local29 + local23 * local47 >> 15;
		this.anInt189 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt191 = local23 * local5 >> 15;
		this.anInt196 = local5 * local35 >> 15;
		this.anInt194 = local5 * local29 >> 15;
		this.anInt188 = -local11;
		this.anInt192 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt195 = local23 * local35 + local17 * local41 >> 15;
		this.anInt197 = local17 * local5 >> 15;
		this.anInt190 = -arg0 * this.anInt193 - arg1 * this.anInt196 - arg2 * this.anInt192 >> 15;
		this.anInt186 = -arg0 * this.anInt189 - arg1 * this.anInt194 - arg2 * this.anInt195 >> 15;
		this.anInt187 = -arg0 * this.anInt191 - arg1 * this.anInt188 - arg2 * this.anInt197 >> 15;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt190 + (this.anInt193 * arg0 + this.anInt196 * arg1 + this.anInt192 * arg2 >> 15);
		arg3[1] = this.anInt186 + (this.anInt189 * arg0 + this.anInt194 * arg1 + this.anInt195 * arg2 >> 15);
		arg3[2] = this.anInt187 + (this.anInt191 * arg0 + this.anInt188 * arg1 + this.anInt197 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ap", name = "K", descriptor = "()V")
	@Override
	public void K() {
		this.anInt189 = this.anInt191 = this.anInt196 = this.anInt188 = this.anInt192 = this.anInt195 = this.anInt190 = this.anInt186 = this.anInt187 = 0;
		this.anInt193 = this.anInt194 = this.anInt197 = 32768;
	}

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt194 = 32768;
		this.anInt193 = this.anInt197 = Class65.anIntArray87[arg0 & 0x3FFF];
		this.anInt192 = Class65.anIntArray88[arg0 & 0x3FFF];
		this.anInt191 = -this.anInt192;
		this.anInt196 = this.anInt190 = this.anInt189 = this.anInt195 = this.anInt186 = this.anInt188 = this.anInt187 = 0;
	}

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "(III)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt189 = this.anInt191 = this.anInt196 = this.anInt188 = this.anInt192 = this.anInt195 = 0;
		this.anInt193 = this.anInt194 = this.anInt197 = 32768;
		this.anInt190 = arg0;
		this.anInt186 = arg1;
		this.anInt187 = arg2;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()Lclient!n;")
	@Override
	public Class11 method2905() {
		@Pc(3) Class11_Sub1 local3 = new Class11_Sub1();
		local3.anInt193 = this.anInt193;
		local3.anInt196 = this.anInt196;
		local3.anInt192 = this.anInt192;
		local3.anInt190 = this.anInt190;
		local3.anInt189 = this.anInt189;
		local3.anInt194 = this.anInt194;
		local3.anInt195 = this.anInt195;
		local3.anInt186 = this.anInt186;
		local3.anInt191 = this.anInt191;
		local3.anInt188 = this.anInt188;
		local3.anInt197 = this.anInt197;
		local3.anInt187 = this.anInt187;
		return local3;
	}
}
