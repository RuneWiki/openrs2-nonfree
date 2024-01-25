import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public int anInt2259;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	public int anInt2261;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public int anInt2262;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
	public int anInt2264;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
	public int anInt2270;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class72_Sub1() {
		this.K();
	}

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "()V")
	@Override
	public void K() {
		this.anInt2267 = this.anInt2266 = this.anInt2260 = this.anInt2259 = this.anInt2265 = this.anInt2262 = this.anInt2270 = this.anInt2264 = this.anInt2261 = 0;
		this.anInt2269 = this.anInt2268 = this.anInt2263 = 32768;
	}

	@OriginalMember(owner = "client!ff", name = "IA", descriptor = "(IIIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class4_Sub13.anIntArray496[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub13.anIntArray497[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class4_Sub13.anIntArray496[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class4_Sub13.anIntArray497[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class4_Sub13.anIntArray496[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class4_Sub13.anIntArray497[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2269 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2267 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2266 = local23 * local5 >> 15;
		this.anInt2260 = local5 * local35 >> 15;
		this.anInt2268 = local5 * local29 >> 15;
		this.anInt2259 = -local11;
		this.anInt2265 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2262 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2263 = local17 * local5 >> 15;
		this.anInt2270 = -arg0 * this.anInt2269 - arg1 * this.anInt2260 - arg2 * this.anInt2265 >> 15;
		this.anInt2264 = -arg0 * this.anInt2267 - arg1 * this.anInt2268 - arg2 * this.anInt2262 >> 15;
		this.anInt2261 = -arg0 * this.anInt2266 - arg1 * this.anInt2259 - arg2 * this.anInt2263 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "CA", descriptor = "(I)V")
	@Override
	public void CA(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub13.anIntArray496[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub13.anIntArray497[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2269;
		@Pc(17) int local17 = this.anInt2260;
		@Pc(20) int local20 = this.anInt2265;
		@Pc(23) int local23 = this.anInt2270;
		this.anInt2269 = local14 * local5 + this.anInt2266 * local11 >> 15;
		this.anInt2266 = this.anInt2266 * local5 - local14 * local11 >> 15;
		this.anInt2260 = local17 * local5 + this.anInt2259 * local11 >> 15;
		this.anInt2259 = this.anInt2259 * local5 - local17 * local11 >> 15;
		this.anInt2265 = local20 * local5 + this.anInt2263 * local11 >> 15;
		this.anInt2263 = this.anInt2263 * local5 - local20 * local11 >> 15;
		this.anInt2270 = local23 * local5 + this.anInt2261 * local11 >> 15;
		this.anInt2261 = this.anInt2261 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2270 += arg0;
		this.anInt2264 += arg1;
		this.anInt2261 += arg2;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()Lclient!n;")
	@Override
	public Class72 method3307() {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		local3.anInt2269 = this.anInt2269;
		local3.anInt2260 = this.anInt2260;
		local3.anInt2265 = this.anInt2265;
		local3.anInt2270 = this.anInt2270;
		local3.anInt2267 = this.anInt2267;
		local3.anInt2268 = this.anInt2268;
		local3.anInt2262 = this.anInt2262;
		local3.anInt2264 = this.anInt2264;
		local3.anInt2266 = this.anInt2266;
		local3.anInt2259 = this.anInt2259;
		local3.anInt2263 = this.anInt2263;
		local3.anInt2261 = this.anInt2261;
		return local3;
	}

	@OriginalMember(owner = "client!ff", name = "ba", descriptor = "(I)V")
	@Override
	public void ba(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub13.anIntArray496[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub13.anIntArray497[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2267;
		@Pc(17) int local17 = this.anInt2268;
		@Pc(20) int local20 = this.anInt2262;
		@Pc(23) int local23 = this.anInt2264;
		this.anInt2267 = local14 * local5 - this.anInt2266 * local11 >> 15;
		this.anInt2266 = local14 * local11 + this.anInt2266 * local5 >> 15;
		this.anInt2268 = local17 * local5 - this.anInt2259 * local11 >> 15;
		this.anInt2259 = local17 * local11 + this.anInt2259 * local5 >> 15;
		this.anInt2262 = local20 * local5 - this.anInt2263 * local11 >> 15;
		this.anInt2263 = local20 * local11 + this.anInt2263 * local5 >> 15;
		this.anInt2264 = local23 * local5 - this.anInt2261 * local11 >> 15;
		this.anInt2261 = local23 * local11 + this.anInt2261 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "([I)V")
	@Override
	public void M(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2270;
		@Pc(13) int local13 = arg0[1] - this.anInt2264;
		@Pc(20) int local20 = arg0[2] - this.anInt2261;
		arg0[0] = this.anInt2269 * local6 + this.anInt2267 * local13 + this.anInt2266 * local20 >> 15;
		arg0[1] = this.anInt2260 * local6 + this.anInt2268 * local13 + this.anInt2259 * local20 >> 15;
		arg0[2] = this.anInt2265 * local6 + this.anInt2262 * local13 + this.anInt2263 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt2268 = 32768;
		this.anInt2269 = this.anInt2263 = Class4_Sub13.anIntArray496[arg0 & 0x3FFF];
		this.anInt2265 = Class4_Sub13.anIntArray497[arg0 & 0x3FFF];
		this.anInt2266 = -this.anInt2265;
		this.anInt2260 = this.anInt2270 = this.anInt2267 = this.anInt2262 = this.anInt2264 = this.anInt2259 = this.anInt2261 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "(III[I)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2269 * arg0 + this.anInt2260 * arg1 + this.anInt2265 * arg2 >> 15;
		arg3[1] = this.anInt2267 * arg0 + this.anInt2268 * arg1 + this.anInt2262 * arg2 >> 15;
		arg3[2] = this.anInt2266 * arg0 + this.anInt2259 * arg1 + this.anInt2263 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2270 + (this.anInt2269 * arg0 + this.anInt2260 * arg1 + this.anInt2265 * arg2 >> 15);
		arg3[1] = this.anInt2264 + (this.anInt2267 * arg0 + this.anInt2268 * arg1 + this.anInt2262 * arg2 >> 15);
		arg3[2] = this.anInt2261 + (this.anInt2266 * arg0 + this.anInt2259 * arg1 + this.anInt2263 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ff", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt2269 = 32768;
		this.anInt2268 = this.anInt2263 = Class4_Sub13.anIntArray496[arg0 & 0x3FFF];
		this.anInt2259 = Class4_Sub13.anIntArray497[arg0 & 0x3FFF];
		this.anInt2262 = -this.anInt2259;
		this.anInt2260 = this.anInt2265 = this.anInt2270 = this.anInt2267 = this.anInt2264 = this.anInt2266 = this.anInt2261 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "ya", descriptor = "(Lclient!n;)V")
	@Override
	public void ya(@OriginalArg(0) Class72 arg0) {
		@Pc(2) Class72_Sub1 local2 = (Class72_Sub1) arg0;
		this.anInt2269 = local2.anInt2269;
		this.anInt2260 = local2.anInt2260;
		this.anInt2265 = local2.anInt2265;
		this.anInt2270 = local2.anInt2270;
		this.anInt2267 = local2.anInt2267;
		this.anInt2268 = local2.anInt2268;
		this.anInt2262 = local2.anInt2262;
		this.anInt2264 = local2.anInt2264;
		this.anInt2266 = local2.anInt2266;
		this.anInt2259 = local2.anInt2259;
		this.anInt2263 = local2.anInt2263;
		this.anInt2261 = local2.anInt2261;
	}

	@OriginalMember(owner = "client!ff", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		this.anInt2263 = 32768;
		this.anInt2269 = this.anInt2268 = Class4_Sub13.anIntArray496[arg0 & 0x3FFF];
		this.anInt2267 = Class4_Sub13.anIntArray497[arg0 & 0x3FFF];
		this.anInt2260 = -this.anInt2267;
		this.anInt2265 = this.anInt2270 = this.anInt2262 = this.anInt2264 = this.anInt2266 = this.anInt2259 = this.anInt2261 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "(III)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2267 = this.anInt2266 = this.anInt2260 = this.anInt2259 = this.anInt2265 = this.anInt2262 = 0;
		this.anInt2269 = this.anInt2268 = this.anInt2263 = 32768;
		this.anInt2270 = arg0;
		this.anInt2264 = arg1;
		this.anInt2261 = arg2;
	}
}
