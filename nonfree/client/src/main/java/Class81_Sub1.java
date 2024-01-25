import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!ds", name = "J", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!ds", name = "N", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!ds", name = "bb", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class81_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat63;
		@Pc(21) float local21 = this.aFloat55;
		@Pc(24) float local24 = this.aFloat61;
		@Pc(27) float local27 = this.aFloat64;
		this.aFloat63 = local18 * local9 - local15 * this.aFloat54;
		this.aFloat54 = local15 * local18 + this.aFloat54 * local9;
		this.aFloat55 = local21 * local9 - local15 * this.aFloat58;
		this.aFloat61 = local24 * local9 - local15 * this.aFloat65;
		this.aFloat58 = local21 * local15 + this.aFloat58 * local9;
		this.aFloat64 = local9 * local27 - this.aFloat56 * local15;
		this.aFloat65 = local15 * local24 + local9 * this.aFloat65;
		this.aFloat56 = this.aFloat56 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!ds", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class354.aFloatArray68[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class354.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class354.aFloatArray68[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class354.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat55 = local9 * local33;
		this.aFloat54 = local9 * local27;
		this.aFloat62 = local33 * -local27 + local47 * local21;
		this.aFloat63 = -local21 * local39 + local27 * local43;
		this.aFloat57 = local9 * local39;
		this.aFloat61 = local27 * local39 + local43 * local21;
		this.aFloat65 = local21 * local9;
		this.aFloat59 = local47 * local27 + local33 * local21;
		this.aFloat58 = -local15;
		this.aFloat56 = (float) -arg0 * this.aFloat54 - this.aFloat58 * (float) arg1 - this.aFloat65 * (float) arg2;
		this.aFloat64 = -(this.aFloat61 * (float) arg2) + this.aFloat63 * (float) -arg0 - this.aFloat55 * (float) arg1;
		this.aFloat60 = -((float) arg2 * this.aFloat62) - (float) arg1 * this.aFloat57 + this.aFloat59 * (float) -arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([FI)[F")
	public float[] method1955(@OriginalArg(0) float[] arg0) {
		arg0[11] = this.aFloat56;
		arg0[9] = this.aFloat58;
		arg0[2] = this.aFloat62;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat61;
		arg0[10] = this.aFloat65;
		arg0[12] = 0.0F;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat63;
		arg0[5] = this.aFloat55;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat54;
		arg0[7] = this.aFloat64;
		arg0[3] = this.aFloat60;
		arg0[1] = this.aFloat57;
		arg0[0] = this.aFloat59;
		return arg0;
	}

	@OriginalMember(owner = "client!ds", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat60;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat64;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat56;
		arg0[0] = (int) (local28 * this.aFloat54 + local12 * this.aFloat59 + local20 * this.aFloat63);
		arg0[1] = (int) (this.aFloat57 * local12 + local20 * this.aFloat55 + local28 * this.aFloat58);
		arg0[2] = (int) (local12 * this.aFloat62 + local20 * this.aFloat61 + local28 * this.aFloat65);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[F)[F")
	public float[] method1957(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat57;
		arg0[0] = this.aFloat59;
		arg0[6] = this.aFloat61;
		arg0[2] = this.aFloat62;
		arg0[3] = this.aFloat60;
		arg0[4] = this.aFloat63;
		arg0[5] = this.aFloat55;
		arg0[7] = this.aFloat64;
		return arg0;
	}

	@OriginalMember(owner = "client!ds", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat64 += arg1;
		this.aFloat56 += arg2;
		this.aFloat60 += arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method1958(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg0;
		this.aFloat54 = local6.aFloat54;
		this.aFloat61 = local6.aFloat61;
		this.aFloat59 = local6.aFloat59;
		this.aFloat57 = local6.aFloat57;
		this.aFloat60 = 0.0F;
		this.aFloat65 = local6.aFloat65;
		this.aFloat62 = local6.aFloat62;
		this.aFloat63 = local6.aFloat63;
		this.aFloat55 = local6.aFloat55;
		this.aFloat64 = 0.0F;
		this.aFloat58 = local6.aFloat58;
		this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FIFF)F")
	public float method1959(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat54 + arg1 * this.aFloat58 + this.aFloat65 * arg0 + this.aFloat56;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFZ)V")
	public void method1960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat58 *= arg0;
		this.aFloat55 *= arg2;
		this.aFloat65 *= arg0;
		this.aFloat57 *= arg1;
		this.aFloat56 *= arg0;
		this.aFloat54 *= arg0;
		this.aFloat63 *= arg2;
		this.aFloat60 *= arg1;
		this.aFloat64 *= arg2;
		this.aFloat59 *= arg1;
		this.aFloat62 *= arg1;
		this.aFloat61 *= arg2;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(F[FFFB)V")
	public void method1961(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[0] = this.aFloat62 * arg3 + this.aFloat57 * arg0 + this.aFloat59 * arg2;
		arg1[2] = this.aFloat54 * arg2 + this.aFloat58 * arg0 + this.aFloat65 * arg3;
		arg1[1] = this.aFloat61 * arg3 + this.aFloat63 * arg2 + this.aFloat55 * arg0;
	}

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg0;
		this.aFloat65 = local6.aFloat65;
		this.aFloat57 = local6.aFloat57;
		this.aFloat60 = local6.aFloat60;
		this.aFloat62 = local6.aFloat62;
		this.aFloat56 = local6.aFloat56;
		this.aFloat59 = local6.aFloat59;
		this.aFloat58 = local6.aFloat58;
		this.aFloat64 = local6.aFloat64;
		this.aFloat61 = local6.aFloat61;
		this.aFloat63 = local6.aFloat63;
		this.aFloat55 = local6.aFloat55;
		this.aFloat54 = local6.aFloat54;
	}

	@OriginalMember(owner = "client!ds", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat65 = 1.0F;
		this.aFloat59 = this.aFloat55 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat63 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat62 = this.aFloat60 = this.aFloat61 = this.aFloat64 = this.aFloat54 = this.aFloat58 = this.aFloat56 = 0.0F;
		this.aFloat57 = -this.aFloat63;
	}

	@OriginalMember(owner = "client!ds", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat55 = this.aFloat65 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat58 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat61 = -this.aFloat58;
		this.aFloat57 = this.aFloat62 = this.aFloat60 = this.aFloat63 = this.aFloat64 = this.aFloat54 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!ds", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat64 = arg1;
		this.aFloat56 = arg2;
		this.aFloat59 = this.aFloat55 = this.aFloat65 = 1.0F;
		this.aFloat63 = this.aFloat54 = this.aFloat57 = this.aFloat58 = this.aFloat62 = this.aFloat61 = 0.0F;
		this.aFloat60 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat59 = this.aFloat55 = this.aFloat65 = 1.0F;
		this.aFloat63 = this.aFloat54 = this.aFloat57 = this.aFloat58 = this.aFloat62 = this.aFloat61 = this.aFloat60 = this.aFloat64 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I[F)[F")
	public float[] method1962(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[6] = 0.0F;
		arg0[10] = this.aFloat56;
		arg0[4] = this.aFloat57;
		arg0[0] = this.aFloat59;
		arg0[9] = this.aFloat64;
		arg0[5] = this.aFloat55;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat60;
		arg0[1] = this.aFloat63;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat55 * (float) arg1 + this.aFloat63 * (float) arg0 + this.aFloat61 * (float) arg2 + this.aFloat64);
		arg3[0] = (int) ((float) arg2 * this.aFloat62 + this.aFloat59 * (float) arg0 + (float) arg1 * this.aFloat57 + this.aFloat60);
		arg3[2] = (int) (this.aFloat56 + this.aFloat65 * (float) arg2 + (float) arg1 * this.aFloat58 + (float) arg0 * this.aFloat54);
	}

	@OriginalMember(owner = "client!ds", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat62;
		this.aFloat59 = local9 * local18 + local15 * this.aFloat54;
		@Pc(37) float local37 = this.aFloat60;
		this.aFloat54 = this.aFloat54 * local9 - local18 * local15;
		this.aFloat57 = local21 * local9 + this.aFloat58 * local15;
		this.aFloat62 = local24 * local9 + this.aFloat65 * local15;
		this.aFloat58 = this.aFloat58 * local9 - local15 * local21;
		this.aFloat60 = this.aFloat56 * local15 + local37 * local9;
		this.aFloat65 = local9 * this.aFloat65 - local15 * local24;
		this.aFloat56 = local9 * this.aFloat56 - local37 * local15;
	}

	@OriginalMember(owner = "client!ds", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class354.aFloatArray68[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class354.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat62;
		@Pc(27) float local27 = this.aFloat60;
		this.aFloat59 = local18 * local9 - local15 * this.aFloat63;
		this.aFloat63 = this.aFloat63 * local9 + local15 * local18;
		this.aFloat57 = local21 * local9 - this.aFloat55 * local15;
		this.aFloat55 = this.aFloat55 * local9 + local21 * local15;
		this.aFloat62 = local9 * local24 - this.aFloat61 * local15;
		this.aFloat60 = local9 * local27 - local15 * this.aFloat64;
		this.aFloat61 = this.aFloat61 * local9 + local24 * local15;
		this.aFloat64 = local9 * this.aFloat64 + local27 * local15;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I[F)[F")
	public float[] method1963(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat59;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat61;
		arg0[10] = this.aFloat65;
		arg0[1] = this.aFloat57;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat55;
		arg0[14] = 0.0F;
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat54;
		arg0[2] = this.aFloat62;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat63;
		arg0[9] = this.aFloat58;
		arg0[15] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
	public void method1964() {
		this.aFloat65 = -this.aFloat65;
		this.aFloat54 = -this.aFloat54;
		this.aFloat63 = -this.aFloat63;
		this.aFloat55 = -this.aFloat55;
		this.aFloat61 = -this.aFloat61;
		this.aFloat56 = -this.aFloat56;
		this.aFloat58 = -this.aFloat58;
		this.aFloat64 = -this.aFloat64;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZFFF)F")
	public float method1965(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat64 + this.aFloat63 * arg1 + arg0 * this.aFloat55 + this.aFloat61 * arg2;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FBFF)V")
	public void method1966(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat56 = arg1;
		this.aFloat60 = arg0;
		this.aFloat64 = arg2;
		this.aFloat59 = this.aFloat55 = this.aFloat65 = 1.0F;
		this.aFloat63 = this.aFloat54 = this.aFloat57 = this.aFloat58 = this.aFloat62 = this.aFloat61 = 0.0F;
	}

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat55 = 1.0F;
		this.aFloat59 = this.aFloat65 = Class354.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat62 = Class354.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat54 = -this.aFloat62;
		this.aFloat57 = this.aFloat60 = this.aFloat63 = this.aFloat61 = this.aFloat64 = this.aFloat58 = this.aFloat56 = 0.0F;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method1967(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg0;
		@Pc(9) Class81_Sub1 local9 = (Class81_Sub1) arg1;
		this.aFloat59 = local9.aFloat59 * local6.aFloat59 + local6.aFloat57 * local9.aFloat63 + local9.aFloat54 * local6.aFloat62;
		this.aFloat63 = local6.aFloat55 * local9.aFloat63 + local9.aFloat59 * local6.aFloat63 + local9.aFloat54 * local6.aFloat61;
		this.aFloat57 = local6.aFloat62 * local9.aFloat58 + local9.aFloat55 * local6.aFloat57 + local9.aFloat57 * local6.aFloat59;
		this.aFloat54 = local6.aFloat65 * local9.aFloat54 + local6.aFloat58 * local9.aFloat63 + local9.aFloat59 * local6.aFloat54;
		this.aFloat55 = local9.aFloat58 * local6.aFloat61 + local6.aFloat55 * local9.aFloat55 + local6.aFloat63 * local9.aFloat57;
		this.aFloat58 = local9.aFloat58 * local6.aFloat65 + local6.aFloat54 * local9.aFloat57 + local9.aFloat55 * local6.aFloat58;
		this.aFloat62 = local9.aFloat61 * local6.aFloat57 + local9.aFloat62 * local6.aFloat59 + local9.aFloat65 * local6.aFloat62;
		this.aFloat61 = local6.aFloat61 * local9.aFloat65 + local6.aFloat63 * local9.aFloat62 + local9.aFloat61 * local6.aFloat55;
		this.aFloat60 = local6.aFloat57 * local9.aFloat64 + local6.aFloat59 * local9.aFloat60 + local6.aFloat62 * local9.aFloat56 + local6.aFloat60;
		this.aFloat65 = local9.aFloat65 * local6.aFloat65 + local9.aFloat61 * local6.aFloat58 + local6.aFloat54 * local9.aFloat62;
		this.aFloat64 = local9.aFloat56 * local6.aFloat61 + local9.aFloat64 * local6.aFloat55 + local9.aFloat60 * local6.aFloat63 + local6.aFloat64;
		this.aFloat56 = local6.aFloat56 + local9.aFloat56 * local6.aFloat65 + local6.aFloat58 * local9.aFloat64 + local6.aFloat54 * local9.aFloat60;
	}

	@OriginalMember(owner = "client!ds", name = "BA", descriptor = "(III[I)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat60);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat64);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat56);
		arg3[0] = (int) ((float) local17 * this.aFloat63 + (float) local10 * this.aFloat59 + (float) local24 * this.aFloat54);
		arg3[1] = (int) ((float) local10 * this.aFloat57 + this.aFloat55 * (float) local17 + (float) local24 * this.aFloat58);
		arg3[2] = (int) ((float) local24 * this.aFloat65 + this.aFloat61 * (float) local17 + (float) local10 * this.aFloat62);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class81 method6585() {
		@Pc(7) Class81_Sub1 local7 = new Class81_Sub1();
		local7.aFloat59 = this.aFloat59;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat64 = this.aFloat64;
		return local7;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "([FI)[F")
	public float[] method1969(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat58;
		arg0[8] = this.aFloat62;
		arg0[10] = this.aFloat65;
		arg0[14] = this.aFloat56;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat54;
		arg0[5] = this.aFloat55;
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat60;
		arg0[15] = 1.0F;
		arg0[4] = this.aFloat57;
		arg0[1] = this.aFloat63;
		arg0[9] = this.aFloat61;
		arg0[13] = this.aFloat64;
		arg0[0] = this.aFloat59;
		return arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFBF)V")
	public void method1970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat56 += arg2;
		this.aFloat64 += arg1;
		this.aFloat60 += arg0;
	}

	@OriginalMember(owner = "client!ds", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat65 * (float) arg2 + this.aFloat58 * (float) arg1 + this.aFloat54 * (float) arg0);
		arg3[0] = (int) ((float) arg1 * this.aFloat57 + this.aFloat59 * (float) arg0 + (float) arg2 * this.aFloat62);
		arg3[1] = (int) ((float) arg2 * this.aFloat61 + (float) arg0 * this.aFloat63 + this.aFloat55 * (float) arg1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!q;I)V")
	public void method1971(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg0;
		this.aFloat62 = local6.aFloat54;
		this.aFloat57 = local6.aFloat63;
		this.aFloat59 = local6.aFloat59;
		this.aFloat63 = local6.aFloat57;
		this.aFloat61 = local6.aFloat58;
		this.aFloat54 = local6.aFloat62;
		this.aFloat55 = local6.aFloat55;
		this.aFloat60 = -(this.aFloat62 * local6.aFloat56 + local6.aFloat60 * this.aFloat59 + local6.aFloat64 * this.aFloat57);
		this.aFloat65 = local6.aFloat65;
		this.aFloat58 = local6.aFloat61;
		this.aFloat64 = -(local6.aFloat60 * this.aFloat63 + local6.aFloat64 * this.aFloat55 + this.aFloat61 * local6.aFloat56);
		this.aFloat56 = -(local6.aFloat56 * this.aFloat65 + this.aFloat58 * local6.aFloat64 + local6.aFloat60 * this.aFloat54);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([FFFFBF)V")
	public void method1972(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4) {
		arg0[1] = arg2 * this.aFloat63 + this.aFloat55 * arg1 + arg3 * this.aFloat61;
		@Pc(59) float local59;
		@Pc(75) float local75;
		@Pc(67) float local67;
		@Pc(51) float local51;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local51 = -arg4 / arg2;
			local75 = this.aFloat63 * local51 + this.aFloat64;
			local59 = this.aFloat60 + this.aFloat59 * local51;
			local67 = this.aFloat54 * local51 + this.aFloat56;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local51 = -arg4 / arg1;
			local59 = this.aFloat60 + local51 * this.aFloat57;
			local67 = local51 * this.aFloat58 + this.aFloat56;
			local75 = this.aFloat64 + this.aFloat55 * local51;
		} else {
			local51 = -arg4 / arg3;
			local59 = this.aFloat60 + this.aFloat62 * local51;
			local67 = local51 * this.aFloat65 + this.aFloat56;
			local75 = this.aFloat64 + local51 * this.aFloat61;
		}
		arg0[0] = arg3 * this.aFloat62 + this.aFloat59 * arg2 + arg1 * this.aFloat57;
		arg0[2] = arg3 * this.aFloat65 + this.aFloat58 * arg1 + this.aFloat54 * arg2;
		arg0[3] = -(local67 * arg0[2] + arg0[0] * local59 + arg0[1] * local75);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFFBFF)V")
	public void method1973(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat57 = arg0;
		this.aFloat65 = arg4;
		this.aFloat55 = arg7;
		this.aFloat59 = arg5;
		this.aFloat62 = arg8;
		this.aFloat58 = arg6;
		this.aFloat60 = 0.0F;
		this.aFloat64 = 0.0F;
		this.aFloat56 = 0.0F;
		this.aFloat54 = arg2;
		this.aFloat63 = arg3;
		this.aFloat61 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IFIIBFF)V")
	public void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg2 == 0) {
			this.aFloat56 = arg4;
			this.aFloat64 = arg1 - (float) arg0;
			this.aFloat63 = this.aFloat54 = this.aFloat57 = this.aFloat58 = this.aFloat62 = this.aFloat61 = 0.0F;
			this.aFloat60 = arg5 - (float) arg3;
			this.aFloat59 = arg3 * 2;
			this.aFloat55 = arg0 * 2;
			this.aFloat65 = 1.0F;
			return;
		}
		@Pc(67) float local67 = Class354.aFloatArray68[arg2 & 0x3FFF];
		@Pc(73) float local73 = Class354.aFloatArray69[arg2 & 0x3FFF];
		this.aFloat57 = local73 * -2.0F * (float) arg0;
		this.aFloat59 = (float) arg3 * 2.0F * local67;
		this.aFloat60 = (float) (arg3 * 2) * (local73 * 0.5F - local67 * 0.5F) + arg5;
		this.aFloat64 = (local73 * -0.5F - local67 * 0.5F) * (float) (arg0 * 2) + arg1;
		this.aFloat55 = (float) arg0 * local67 * 2.0F;
		this.aFloat54 = this.aFloat58 = this.aFloat62 = this.aFloat61 = 0.0F;
		this.aFloat63 = (float) arg3 * local73 * 2.0F;
		this.aFloat56 = arg4;
		this.aFloat65 = 1.0F;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IFFF)F")
	public float method1975(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat60 + arg1 * this.aFloat62 + this.aFloat57 * arg2 + this.aFloat59 * arg0;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(IFFF)V")
	public void method1977(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat61 = 0.0F;
		this.aFloat58 = 0.0F;
		this.aFloat63 = 0.0F;
		this.aFloat54 = 0.0F;
		this.aFloat60 = 0.0F;
		this.aFloat65 = arg0;
		this.aFloat57 = 0.0F;
		this.aFloat55 = arg2;
		this.aFloat56 = 0.0F;
		this.aFloat62 = 0.0F;
		this.aFloat64 = 0.0F;
		this.aFloat59 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Lclient!q;I)V")
	public void method1978(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat59;
		@Pc(12) float local12 = this.aFloat63;
		@Pc(15) float local15 = this.aFloat57;
		@Pc(18) float local18 = this.aFloat55;
		@Pc(21) float local21 = this.aFloat62;
		@Pc(24) float local24 = this.aFloat61;
		@Pc(33) float local33 = this.aFloat60;
		this.aFloat59 = local6.aFloat59 * local9 + local6.aFloat57 * local12 + this.aFloat54 * local6.aFloat62;
		@Pc(53) float local53 = this.aFloat64;
		this.aFloat63 = local6.aFloat61 * this.aFloat54 + local12 * local6.aFloat55 + local6.aFloat63 * local9;
		this.aFloat55 = local18 * local6.aFloat55 + local15 * local6.aFloat63 + this.aFloat58 * local6.aFloat61;
		this.aFloat57 = this.aFloat58 * local6.aFloat62 + local6.aFloat59 * local15 + local18 * local6.aFloat57;
		this.aFloat54 = local6.aFloat54 * local9 + local12 * local6.aFloat58 + local6.aFloat65 * this.aFloat54;
		this.aFloat62 = local24 * local6.aFloat57 + local21 * local6.aFloat59 + this.aFloat65 * local6.aFloat62;
		this.aFloat61 = local6.aFloat61 * this.aFloat65 + local6.aFloat55 * local24 + local21 * local6.aFloat63;
		this.aFloat58 = local18 * local6.aFloat58 + local6.aFloat54 * local15 + local6.aFloat65 * this.aFloat58;
		this.aFloat64 = local6.aFloat64 + local6.aFloat61 * this.aFloat56 + local53 * local6.aFloat55 + local6.aFloat63 * local33;
		this.aFloat65 = local24 * local6.aFloat58 + local6.aFloat54 * local21 + this.aFloat65 * local6.aFloat65;
		this.aFloat60 = local6.aFloat60 + local6.aFloat57 * local53 + local33 * local6.aFloat59 + local6.aFloat62 * this.aFloat56;
		this.aFloat56 = local6.aFloat56 + local53 * local6.aFloat58 + local33 * local6.aFloat54 + this.aFloat56 * local6.aFloat65;
	}
}
