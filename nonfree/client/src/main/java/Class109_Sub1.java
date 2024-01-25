import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class109_Sub1() {
		this.method4612();
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat57);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat58);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat62);
		arg3[1] = (int) (this.aFloat61 * (float) local6 + this.aFloat56 * (float) local13 + (float) local24 * this.aFloat65);
		arg3[0] = (int) ((float) local24 * this.aFloat59 + this.aFloat54 * (float) local13 + (float) local6 * this.aFloat63);
		arg3[2] = (int) ((float) local13 * this.aFloat55 + this.aFloat60 * (float) local24 + (float) local6 * this.aFloat64);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method4609() {
		@Pc(7) Class109_Sub1 local7 = new Class109_Sub1();
		local7.aFloat56 = this.aFloat56;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat61 = this.aFloat61;
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	@Override
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat57 = (float) arg2;
		this.aFloat59 = this.aFloat63 = this.aFloat56 = this.aFloat61 = this.aFloat55 = this.aFloat60 = 0.0F;
		this.aFloat62 = (float) arg1;
		this.aFloat58 = (float) arg0;
		this.aFloat54 = this.aFloat65 = this.aFloat64 = 1.0F;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class141_Sub1.aFloatArray72[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class141_Sub1.aFloatArray71[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class141_Sub1.aFloatArray72[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class141_Sub1.aFloatArray71[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat64 = local9 * local21;
		this.aFloat54 = local33 * local21 + local27 * local47;
		this.aFloat61 = -local15;
		this.aFloat65 = local33 * local9;
		this.aFloat56 = local9 * local39;
		this.aFloat60 = local43 * local21 + local27 * local39;
		this.aFloat59 = local27 * local43 + -local21 * local39;
		this.aFloat55 = local33 * -local27 + local21 * local47;
		this.aFloat63 = local27 * local9;
		this.aFloat57 = (float) -arg0 * this.aFloat63 - this.aFloat61 * (float) arg1 - (float) arg2 * this.aFloat64;
		this.aFloat62 = -((float) arg2 * this.aFloat60) - this.aFloat65 * (float) arg1 + (float) -arg0 * this.aFloat59;
		this.aFloat58 = -((float) arg2 * this.aFloat55) - (float) arg1 * this.aFloat56 + (float) -arg0 * this.aFloat54;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	@Override
	public void method4608(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat54;
		@Pc(21) float local21 = this.aFloat56;
		@Pc(24) float local24 = this.aFloat55;
		this.aFloat54 = local9 * local18 + this.aFloat63 * local15;
		@Pc(37) float local37 = this.aFloat58;
		this.aFloat56 = local15 * this.aFloat61 + local21 * local9;
		this.aFloat63 = local9 * this.aFloat63 - local15 * local18;
		this.aFloat61 = this.aFloat61 * local9 - local15 * local21;
		this.aFloat55 = local15 * this.aFloat64 + local24 * local9;
		this.aFloat64 = local9 * this.aFloat64 - local24 * local15;
		this.aFloat58 = local9 * local37 + this.aFloat57 * local15;
		this.aFloat57 = this.aFloat57 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	@Override
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 += (float) arg0;
		this.aFloat62 += (float) arg1;
		this.aFloat57 += (float) arg2;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat55 + (float) arg0 * this.aFloat54 + this.aFloat56 * (float) arg1);
		arg3[2] = (int) (this.aFloat64 * (float) arg2 + (float) arg0 * this.aFloat63 + this.aFloat61 * (float) arg1);
		arg3[1] = (int) (this.aFloat59 * (float) arg0 + this.aFloat65 * (float) arg1 + this.aFloat60 * (float) arg2);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	@Override
	public void method4598(@OriginalArg(0) int arg0) {
		this.aFloat64 = 1.0F;
		this.aFloat54 = this.aFloat65 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat59 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat56 = -this.aFloat59;
		this.aFloat55 = this.aFloat58 = this.aFloat60 = this.aFloat62 = this.aFloat63 = this.aFloat61 = this.aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	@Override
	public void method4605(@OriginalArg(0) int arg0) {
		this.aFloat65 = 1.0F;
		this.aFloat54 = this.aFloat64 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat55 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat63 = -this.aFloat55;
		this.aFloat56 = this.aFloat58 = this.aFloat59 = this.aFloat60 = this.aFloat62 = this.aFloat61 = this.aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method4595(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub1 local6 = (Class109_Sub1) arg0;
		this.aFloat61 = local6.aFloat61;
		this.aFloat54 = local6.aFloat54;
		this.aFloat62 = local6.aFloat62;
		this.aFloat58 = local6.aFloat58;
		this.aFloat57 = local6.aFloat57;
		this.aFloat65 = local6.aFloat65;
		this.aFloat56 = local6.aFloat56;
		this.aFloat63 = local6.aFloat63;
		this.aFloat55 = local6.aFloat55;
		this.aFloat60 = local6.aFloat60;
		this.aFloat59 = local6.aFloat59;
		this.aFloat64 = local6.aFloat64;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat58 + (float) arg2 * this.aFloat55 + this.aFloat54 * (float) arg0 + this.aFloat56 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat64 + (float) arg0 * this.aFloat63 + this.aFloat61 * (float) arg1 + this.aFloat57);
		arg3[1] = (int) (this.aFloat60 * (float) arg2 + (float) arg1 * this.aFloat65 + (float) arg0 * this.aFloat59 + this.aFloat62);
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	@Override
	public void method4602(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat65;
		@Pc(24) float local24 = this.aFloat60;
		@Pc(27) float local27 = this.aFloat62;
		this.aFloat59 = local18 * local9 - local15 * this.aFloat63;
		this.aFloat63 = local9 * this.aFloat63 + local15 * local18;
		this.aFloat65 = local9 * local21 - this.aFloat61 * local15;
		this.aFloat60 = local9 * local24 - this.aFloat64 * local15;
		this.aFloat61 = this.aFloat61 * local9 + local21 * local15;
		this.aFloat62 = local27 * local9 - local15 * this.aFloat57;
		this.aFloat64 = local9 * this.aFloat64 + local24 * local15;
		this.aFloat57 = local27 * local15 + this.aFloat57 * local9;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	@Override
	public void method4611(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat54;
		@Pc(21) float local21 = this.aFloat56;
		@Pc(24) float local24 = this.aFloat55;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat54 = local18 * local9 - this.aFloat59 * local15;
		this.aFloat59 = local15 * local18 + this.aFloat59 * local9;
		this.aFloat56 = local21 * local9 - this.aFloat65 * local15;
		this.aFloat65 = local9 * this.aFloat65 + local15 * local21;
		this.aFloat55 = local24 * local9 - this.aFloat60 * local15;
		this.aFloat60 = local24 * local15 + local9 * this.aFloat60;
		this.aFloat58 = local9 * local27 - local15 * this.aFloat62;
		this.aFloat62 = this.aFloat62 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([I)V")
	@Override
	public void method4603(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat58;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat62;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat57;
		arg0[1] = (int) (this.aFloat61 * local27 + local11 * this.aFloat56 + this.aFloat65 * local19);
		arg0[0] = (int) (this.aFloat63 * local27 + this.aFloat54 * local11 + local19 * this.aFloat59);
		arg0[2] = (int) (local27 * this.aFloat64 + local11 * this.aFloat55 + local19 * this.aFloat60);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()V")
	@Override
	public void method4612() {
		this.aFloat54 = this.aFloat65 = this.aFloat64 = 1.0F;
		this.aFloat59 = this.aFloat63 = this.aFloat56 = this.aFloat61 = this.aFloat55 = this.aFloat60 = this.aFloat58 = this.aFloat62 = this.aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	@Override
	public void method4607(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat65 = this.aFloat64 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat61 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat60 = -this.aFloat61;
		this.aFloat56 = this.aFloat55 = this.aFloat58 = this.aFloat59 = this.aFloat62 = this.aFloat63 = this.aFloat57 = 0.0F;
	}
}
