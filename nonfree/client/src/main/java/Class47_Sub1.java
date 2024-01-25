import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!cl", name = "R", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class47_Sub1() {
		this.method7878();
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	@Override
	public void method7871(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat60;
		@Pc(21) float local21 = this.aFloat59;
		@Pc(24) float local24 = this.aFloat56;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat60 = local18 * local9 + local15 * this.aFloat66;
		this.aFloat59 = local21 * local9 + this.aFloat65 * local15;
		this.aFloat66 = this.aFloat66 * local9 - local18 * local15;
		this.aFloat65 = local9 * this.aFloat65 - local21 * local15;
		this.aFloat56 = this.aFloat64 * local15 + local9 * local24;
		this.aFloat58 = local15 * this.aFloat61 + local27 * local9;
		this.aFloat64 = local9 * this.aFloat64 - local24 * local15;
		this.aFloat61 = this.aFloat61 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method7877(@OriginalArg(0) Class47 arg0) {
		@Pc(6) Class47_Sub1 local6 = (Class47_Sub1) arg0;
		this.aFloat66 = local6.aFloat66;
		this.aFloat62 = local6.aFloat62;
		this.aFloat60 = local6.aFloat60;
		this.aFloat63 = local6.aFloat63;
		this.aFloat58 = local6.aFloat58;
		this.aFloat57 = local6.aFloat57;
		this.aFloat61 = local6.aFloat61;
		this.aFloat64 = local6.aFloat64;
		this.aFloat65 = local6.aFloat65;
		this.aFloat56 = local6.aFloat56;
		this.aFloat67 = local6.aFloat67;
		this.aFloat59 = local6.aFloat59;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	@Override
	public void method7878() {
		this.aFloat60 = this.aFloat57 = this.aFloat64 = 1.0F;
		this.aFloat62 = this.aFloat66 = this.aFloat59 = this.aFloat65 = this.aFloat56 = this.aFloat63 = this.aFloat58 = this.aFloat67 = this.aFloat61 = 0.0F;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	@Override
	public void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat62 = this.aFloat66 = this.aFloat59 = this.aFloat65 = this.aFloat56 = this.aFloat63 = 0.0F;
		this.aFloat61 = arg2;
		this.aFloat67 = arg1;
		this.aFloat58 = arg0;
		this.aFloat60 = this.aFloat57 = this.aFloat64 = 1.0F;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat57 = this.aFloat64 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat65 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat56 = this.aFloat58 = this.aFloat62 = this.aFloat67 = this.aFloat66 = this.aFloat61 = 0.0F;
		this.aFloat63 = -this.aFloat65;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()Lclient!wc;")
	@Override
	public Class47 method7867() {
		@Pc(7) Class47_Sub1 local7 = new Class47_Sub1();
		local7.aFloat67 = this.aFloat67;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat58 = this.aFloat58;
		return local7;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class23_Sub14.aFloatArray49[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class23_Sub14.aFloatArray48[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class23_Sub14.aFloatArray49[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class23_Sub14.aFloatArray48[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat66 = local27 * local9;
		this.aFloat59 = local39 * local9;
		this.aFloat56 = local47 * local21 + local33 * -local27;
		this.aFloat60 = local47 * local27 + local33 * local21;
		this.aFloat57 = local9 * local33;
		this.aFloat62 = local43 * local27 + local39 * -local21;
		this.aFloat63 = local21 * local43 + local27 * local39;
		this.aFloat64 = local9 * local21;
		this.aFloat65 = -local15;
		this.aFloat67 = this.aFloat62 * (float) -arg0 - this.aFloat57 * (float) arg1 - this.aFloat63 * (float) arg2;
		this.aFloat58 = -((float) arg1 * this.aFloat59) + (float) -arg0 * this.aFloat60 - this.aFloat56 * (float) arg2;
		this.aFloat61 = -(this.aFloat64 * (float) arg2) + this.aFloat66 * (float) -arg0 - this.aFloat65 * (float) arg1;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat64 = 1.0F;
		this.aFloat60 = this.aFloat57 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat62 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat56 = this.aFloat58 = this.aFloat63 = this.aFloat67 = this.aFloat66 = this.aFloat65 = this.aFloat61 = 0.0F;
		this.aFloat59 = -this.aFloat62;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([I)V")
	@Override
	public void method7874(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat58;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat67;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat61;
		arg0[2] = (int) (this.aFloat63 * local20 + local11 * this.aFloat56 + this.aFloat64 * local28);
		arg0[1] = (int) (this.aFloat65 * local28 + this.aFloat57 * local20 + this.aFloat59 * local11);
		arg0[0] = (int) (local28 * this.aFloat66 + this.aFloat60 * local11 + this.aFloat62 * local20);
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat63 * (float) arg2 + this.aFloat62 * (float) arg0 + this.aFloat57 * (float) arg1 + this.aFloat67);
		arg3[0] = (int) (this.aFloat58 + (float) arg2 * this.aFloat56 + this.aFloat59 * (float) arg1 + (float) arg0 * this.aFloat60);
		arg3[2] = (int) ((float) arg0 * this.aFloat66 + (float) arg1 * this.aFloat65 + (float) arg2 * this.aFloat64 + this.aFloat61);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	@Override
	public void method7861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat60;
		@Pc(21) float local21 = this.aFloat59;
		@Pc(24) float local24 = this.aFloat56;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat60 = local9 * local18 - local15 * this.aFloat62;
		this.aFloat62 = local18 * local15 + local9 * this.aFloat62;
		this.aFloat59 = local9 * local21 - local15 * this.aFloat57;
		this.aFloat57 = this.aFloat57 * local9 + local15 * local21;
		this.aFloat56 = local9 * local24 - local15 * this.aFloat63;
		this.aFloat58 = local27 * local9 - this.aFloat67 * local15;
		this.aFloat63 = local24 * local15 + this.aFloat63 * local9;
		this.aFloat67 = this.aFloat67 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat67 += arg1;
		this.aFloat61 += arg2;
		this.aFloat58 += arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat67);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat58);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat61);
		arg3[0] = (int) ((float) local17 * this.aFloat60 + this.aFloat62 * (float) local6 + this.aFloat66 * (float) local24);
		arg3[1] = (int) ((float) local24 * this.aFloat65 + this.aFloat57 * (float) local6 + (float) local17 * this.aFloat59);
		arg3[2] = (int) ((float) local24 * this.aFloat64 + this.aFloat63 * (float) local6 + (float) local17 * this.aFloat56);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	@Override
	public void method7858(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat62;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat63;
		this.aFloat62 = local18 * local9 - this.aFloat66 * local15;
		@Pc(38) float local38 = this.aFloat67;
		this.aFloat66 = local9 * this.aFloat66 + local15 * local18;
		this.aFloat57 = local9 * local21 - this.aFloat65 * local15;
		this.aFloat63 = local24 * local9 - local15 * this.aFloat64;
		this.aFloat65 = local21 * local15 + local9 * this.aFloat65;
		this.aFloat67 = local38 * local9 - this.aFloat61 * local15;
		this.aFloat64 = this.aFloat64 * local9 + local15 * local24;
		this.aFloat61 = local15 * local38 + this.aFloat61 * local9;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		this.aFloat57 = 1.0F;
		this.aFloat60 = this.aFloat64 = Class23_Sub14.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat56 = Class23_Sub14.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat59 = this.aFloat58 = this.aFloat62 = this.aFloat63 = this.aFloat67 = this.aFloat65 = this.aFloat61 = 0.0F;
		this.aFloat66 = -this.aFloat56;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat60 + this.aFloat59 * (float) arg1 + (float) arg2 * this.aFloat56);
		arg3[2] = (int) (this.aFloat65 * (float) arg1 + (float) arg0 * this.aFloat66 + this.aFloat64 * (float) arg2);
		arg3[1] = (int) (this.aFloat62 * (float) arg0 + this.aFloat57 * (float) arg1 + (float) arg2 * this.aFloat63);
	}
}
