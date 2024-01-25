import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class109_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!g", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat60 = this.aFloat50 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat61 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat52 = -this.aFloat61;
		this.aFloat56 = this.aFloat57 = this.aFloat55 = this.aFloat53 = this.aFloat58 = this.aFloat51 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat54 = arg2;
		this.aFloat53 = this.aFloat51 = this.aFloat56 = this.aFloat61 = this.aFloat57 = this.aFloat52 = 0.0F;
		this.aFloat58 = arg1;
		this.aFloat59 = this.aFloat60 = this.aFloat50 = 1.0F;
		this.aFloat55 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat55;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat58;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat54;
		arg0[1] = (int) (this.aFloat61 * local29 + local20 * this.aFloat60 + this.aFloat56 * local12);
		arg0[2] = (int) (local12 * this.aFloat57 + local20 * this.aFloat52 + local29 * this.aFloat50);
		arg0[0] = (int) (local29 * this.aFloat51 + this.aFloat59 * local12 + local20 * this.aFloat53);
	}

	@OriginalMember(owner = "client!g", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat53;
		@Pc(21) float local21 = this.aFloat60;
		@Pc(24) float local24 = this.aFloat52;
		this.aFloat53 = local18 * local9 - this.aFloat51 * local15;
		@Pc(38) float local38 = this.aFloat58;
		this.aFloat60 = local9 * local21 - local15 * this.aFloat61;
		this.aFloat51 = local15 * local18 + local9 * this.aFloat51;
		this.aFloat61 = local9 * this.aFloat61 + local21 * local15;
		this.aFloat52 = local9 * local24 - this.aFloat50 * local15;
		this.aFloat50 = local9 * this.aFloat50 + local15 * local24;
		this.aFloat58 = local9 * local38 - this.aFloat54 * local15;
		this.aFloat54 = local38 * local15 + this.aFloat54 * local9;
	}

	@OriginalMember(owner = "client!g", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat59 = this.aFloat50 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat57 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat51 = -this.aFloat57;
		this.aFloat56 = this.aFloat55 = this.aFloat53 = this.aFloat52 = this.aFloat58 = this.aFloat61 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat50 = 1.0F;
		this.aFloat59 = this.aFloat60 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat53 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat56 = -this.aFloat53;
		this.aFloat57 = this.aFloat55 = this.aFloat52 = this.aFloat58 = this.aFloat51 = this.aFloat61 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat56;
		@Pc(24) float local24 = this.aFloat57;
		@Pc(27) float local27 = this.aFloat55;
		this.aFloat59 = local9 * local18 - local15 * this.aFloat53;
		this.aFloat53 = this.aFloat53 * local9 + local18 * local15;
		this.aFloat56 = local21 * local9 - this.aFloat60 * local15;
		this.aFloat60 = this.aFloat60 * local9 + local15 * local21;
		this.aFloat57 = local24 * local9 - this.aFloat52 * local15;
		this.aFloat52 = local15 * local24 + local9 * this.aFloat52;
		this.aFloat55 = local9 * local27 - local15 * this.aFloat58;
		this.aFloat58 = local27 * local15 + this.aFloat58 * local9;
	}

	@OriginalMember(owner = "client!g", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat50 + (float) arg1 * this.aFloat61 + this.aFloat51 * (float) arg0);
		arg3[1] = (int) ((float) arg0 * this.aFloat53 + (float) arg1 * this.aFloat60 + this.aFloat52 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat57 + (float) arg1 * this.aFloat56 + (float) arg0 * this.aFloat59);
	}

	@OriginalMember(owner = "client!g", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat54 += arg2;
		this.aFloat55 += arg0;
		this.aFloat58 += arg1;
	}

	@OriginalMember(owner = "client!g", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub1 local6 = (Class109_Sub1) arg0;
		this.aFloat50 = local6.aFloat50;
		this.aFloat52 = local6.aFloat52;
		this.aFloat53 = local6.aFloat53;
		this.aFloat55 = local6.aFloat55;
		this.aFloat61 = local6.aFloat61;
		this.aFloat58 = local6.aFloat58;
		this.aFloat51 = local6.aFloat51;
		this.aFloat54 = local6.aFloat54;
		this.aFloat60 = local6.aFloat60;
		this.aFloat56 = local6.aFloat56;
		this.aFloat57 = local6.aFloat57;
		this.aFloat59 = local6.aFloat59;
	}

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat59 = this.aFloat60 = this.aFloat50 = 1.0F;
		this.aFloat53 = this.aFloat51 = this.aFloat56 = this.aFloat61 = this.aFloat57 = this.aFloat52 = this.aFloat55 = this.aFloat58 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!g", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat56;
		@Pc(24) float local24 = this.aFloat57;
		this.aFloat59 = local9 * local18 + this.aFloat51 * local15;
		@Pc(37) float local37 = this.aFloat55;
		this.aFloat56 = local9 * local21 + local15 * this.aFloat61;
		this.aFloat51 = this.aFloat51 * local9 - local15 * local18;
		this.aFloat61 = local9 * this.aFloat61 - local21 * local15;
		this.aFloat57 = local15 * this.aFloat50 + local9 * local24;
		this.aFloat50 = this.aFloat50 * local9 - local15 * local24;
		this.aFloat55 = local9 * local37 + local15 * this.aFloat54;
		this.aFloat54 = this.aFloat54 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!g", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class57_Sub3.aFloatArray70[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class57_Sub3.aFloatArray69[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class57_Sub3.aFloatArray70[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class57_Sub3.aFloatArray69[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class57_Sub3.aFloatArray70[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class57_Sub3.aFloatArray69[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat57 = local47 * local21 + -local27 * local33;
		this.aFloat52 = local39 * local27 + local21 * local43;
		this.aFloat59 = local33 * local21 + local47 * local27;
		this.aFloat56 = local9 * local39;
		this.aFloat61 = -local15;
		this.aFloat50 = local21 * local9;
		this.aFloat51 = local27 * local9;
		this.aFloat53 = local27 * local43 + local39 * -local21;
		this.aFloat60 = local33 * local9;
		this.aFloat54 = -(this.aFloat50 * (float) arg2) + this.aFloat51 * (float) -arg0 - this.aFloat61 * (float) arg1;
		this.aFloat55 = -(this.aFloat57 * (float) arg2) + this.aFloat59 * (float) -arg0 - (float) arg1 * this.aFloat56;
		this.aFloat58 = -(this.aFloat60 * (float) arg1) + (float) -arg0 * this.aFloat53 - this.aFloat52 * (float) arg2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat54 + this.aFloat50 * (float) arg2 + this.aFloat51 * (float) arg0 + (float) arg1 * this.aFloat61);
		arg3[0] = (int) (this.aFloat55 + this.aFloat59 * (float) arg0 + this.aFloat56 * (float) arg1 + this.aFloat57 * (float) arg2);
		arg3[1] = (int) (this.aFloat53 * (float) arg0 + (float) arg1 * this.aFloat60 + (float) arg2 * this.aFloat52 + this.aFloat58);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7100() {
		@Pc(7) Class109_Sub1 local7 = new Class109_Sub1();
		local7.aFloat57 = this.aFloat57;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat54 = this.aFloat54;
		return local7;
	}
}
