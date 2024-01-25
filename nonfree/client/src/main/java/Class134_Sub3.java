import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class134_Sub3 extends Class134 {

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
	public int anInt7274;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	public int anInt7275;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
	public int anInt7276;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public int anInt7277;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
	public int anInt7278;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public int anInt7279;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	public int anInt7280;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	public int anInt7281;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	public int anInt7282;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
	public int anInt7283;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
	public int anInt7284;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
	public int anInt7285;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class134_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!pt", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub11.anIntArray147[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub11.anIntArray148[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7280;
		@Pc(17) int local17 = this.anInt7276;
		@Pc(20) int local20 = this.anInt7275;
		@Pc(23) int local23 = this.anInt7277;
		this.anInt7280 = local14 * local5 - this.anInt7284 * local11 >> 14;
		this.anInt7284 = local14 * local11 + this.anInt7284 * local5 >> 14;
		this.anInt7276 = local17 * local5 - this.anInt7283 * local11 >> 14;
		this.anInt7283 = local17 * local11 + this.anInt7283 * local5 >> 14;
		this.anInt7275 = local20 * local5 - this.anInt7282 * local11 >> 14;
		this.anInt7282 = local20 * local11 + this.anInt7282 * local5 >> 14;
		this.anInt7277 = local23 * local5 - this.anInt7279 * local11 >> 14;
		this.anInt7279 = local23 * local11 + this.anInt7279 * local5 >> 14;
	}

	@OriginalMember(owner = "client!pt", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class134 arg0) {
		@Pc(2) Class134_Sub3 local2 = (Class134_Sub3) arg0;
		this.anInt7278 = local2.anInt7278;
		this.anInt7274 = local2.anInt7274;
		this.anInt7285 = local2.anInt7285;
		this.anInt7281 = local2.anInt7281;
		this.anInt7280 = local2.anInt7280;
		this.anInt7276 = local2.anInt7276;
		this.anInt7275 = local2.anInt7275;
		this.anInt7277 = local2.anInt7277;
		this.anInt7284 = local2.anInt7284;
		this.anInt7283 = local2.anInt7283;
		this.anInt7282 = local2.anInt7282;
		this.anInt7279 = local2.anInt7279;
	}

	@OriginalMember(owner = "client!pt", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7281 += arg0;
		this.anInt7277 += arg1;
		this.anInt7279 += arg2;
	}

	@OriginalMember(owner = "client!pt", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7278 * arg0 + this.anInt7274 * arg1 + this.anInt7285 * arg2 >> 14;
		arg3[1] = this.anInt7280 * arg0 + this.anInt7276 * arg1 + this.anInt7275 * arg2 >> 14;
		arg3[2] = this.anInt7284 * arg0 + this.anInt7283 * arg1 + this.anInt7282 * arg2 >> 14;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt7281 + (this.anInt7278 * arg0 + this.anInt7274 * arg1 + this.anInt7285 * arg2 >> 14);
		arg3[1] = this.anInt7277 + (this.anInt7280 * arg0 + this.anInt7276 * arg1 + this.anInt7275 * arg2 >> 14);
		arg3[2] = this.anInt7279 + (this.anInt7284 * arg0 + this.anInt7283 * arg1 + this.anInt7282 * arg2 >> 14);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.anInt7276 = 16384;
		this.anInt7278 = this.anInt7282 = Class4_Sub11.anIntArray147[arg0 & 0x3FFF];
		this.anInt7285 = Class4_Sub11.anIntArray148[arg0 & 0x3FFF];
		this.anInt7284 = -this.anInt7285;
		this.anInt7274 = this.anInt7281 = this.anInt7280 = this.anInt7275 = this.anInt7277 = this.anInt7283 = this.anInt7279 = 0;
	}

	@OriginalMember(owner = "client!pt", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.anInt7280 = this.anInt7284 = this.anInt7274 = this.anInt7283 = this.anInt7285 = this.anInt7275 = this.anInt7281 = this.anInt7277 = this.anInt7279 = 0;
		this.anInt7278 = this.anInt7276 = this.anInt7282 = 16384;
	}

	@OriginalMember(owner = "client!pt", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt7281;
		@Pc(13) int local13 = arg0[1] - this.anInt7277;
		@Pc(20) int local20 = arg0[2] - this.anInt7279;
		arg0[0] = this.anInt7278 * local6 + this.anInt7280 * local13 + this.anInt7284 * local20 >> 14;
		arg0[1] = this.anInt7274 * local6 + this.anInt7276 * local13 + this.anInt7283 * local20 >> 14;
		arg0[2] = this.anInt7285 * local6 + this.anInt7275 * local13 + this.anInt7282 * local20 >> 14;
	}

	@OriginalMember(owner = "client!pt", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7280 = this.anInt7284 = this.anInt7274 = this.anInt7283 = this.anInt7285 = this.anInt7275 = 0;
		this.anInt7278 = this.anInt7276 = this.anInt7282 = 16384;
		this.anInt7281 = arg0;
		this.anInt7277 = arg1;
		this.anInt7279 = arg2;
	}

	@OriginalMember(owner = "client!pt", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt7282 = 16384;
		this.anInt7278 = this.anInt7276 = Class4_Sub11.anIntArray147[arg0 & 0x3FFF];
		this.anInt7280 = Class4_Sub11.anIntArray148[arg0 & 0x3FFF];
		this.anInt7274 = -this.anInt7280;
		this.anInt7285 = this.anInt7281 = this.anInt7275 = this.anInt7277 = this.anInt7284 = this.anInt7283 = this.anInt7279 = 0;
	}

	@OriginalMember(owner = "client!pt", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.anInt7278 = 16384;
		this.anInt7276 = this.anInt7282 = Class4_Sub11.anIntArray147[arg0 & 0x3FFF];
		this.anInt7283 = Class4_Sub11.anIntArray148[arg0 & 0x3FFF];
		this.anInt7275 = -this.anInt7283;
		this.anInt7274 = this.anInt7285 = this.anInt7281 = this.anInt7280 = this.anInt7277 = this.anInt7284 = this.anInt7279 = 0;
	}

	@OriginalMember(owner = "client!pt", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class4_Sub11.anIntArray147[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub11.anIntArray148[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class4_Sub11.anIntArray147[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class4_Sub11.anIntArray148[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class4_Sub11.anIntArray147[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class4_Sub11.anIntArray148[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 14;
		@Pc(47) int local47 = local11 * local35 >> 14;
		this.anInt7278 = local17 * local29 + local23 * local47 >> 14;
		this.anInt7280 = -local17 * local35 + local23 * local41 >> 14;
		this.anInt7284 = local23 * local5 >> 14;
		this.anInt7274 = local5 * local35 >> 14;
		this.anInt7276 = local5 * local29 >> 14;
		this.anInt7283 = -local11;
		this.anInt7285 = -local23 * local29 + local17 * local47 >> 14;
		this.anInt7275 = local23 * local35 + local17 * local41 >> 14;
		this.anInt7282 = local17 * local5 >> 14;
		this.anInt7281 = -arg0 * this.anInt7278 - arg1 * this.anInt7274 - arg2 * this.anInt7285 >> 14;
		this.anInt7277 = -arg0 * this.anInt7280 - arg1 * this.anInt7276 - arg2 * this.anInt7275 >> 14;
		this.anInt7279 = -arg0 * this.anInt7284 - arg1 * this.anInt7283 - arg2 * this.anInt7282 >> 14;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class134 method7825() {
		@Pc(3) Class134_Sub3 local3 = new Class134_Sub3();
		local3.anInt7278 = this.anInt7278;
		local3.anInt7274 = this.anInt7274;
		local3.anInt7285 = this.anInt7285;
		local3.anInt7281 = this.anInt7281;
		local3.anInt7280 = this.anInt7280;
		local3.anInt7276 = this.anInt7276;
		local3.anInt7275 = this.anInt7275;
		local3.anInt7277 = this.anInt7277;
		local3.anInt7284 = this.anInt7284;
		local3.anInt7283 = this.anInt7283;
		local3.anInt7282 = this.anInt7282;
		local3.anInt7279 = this.anInt7279;
		return local3;
	}

	@OriginalMember(owner = "client!pt", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4_Sub11.anIntArray147[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4_Sub11.anIntArray148[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt7278;
		@Pc(17) int local17 = this.anInt7274;
		@Pc(20) int local20 = this.anInt7285;
		@Pc(23) int local23 = this.anInt7281;
		this.anInt7278 = local14 * local5 + this.anInt7284 * local11 >> 14;
		this.anInt7284 = this.anInt7284 * local5 - local14 * local11 >> 14;
		this.anInt7274 = local17 * local5 + this.anInt7283 * local11 >> 14;
		this.anInt7283 = this.anInt7283 * local5 - local17 * local11 >> 14;
		this.anInt7285 = local20 * local5 + this.anInt7282 * local11 >> 14;
		this.anInt7282 = this.anInt7282 * local5 - local20 * local11 >> 14;
		this.anInt7281 = local23 * local5 + this.anInt7279 * local11 >> 14;
		this.anInt7279 = this.anInt7279 * local5 - local23 * local11 >> 14;
	}
}
