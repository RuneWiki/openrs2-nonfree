import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!da", name = "p", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!da", name = "E", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class22_Sub2() {
		this.ha();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)[F")
	public float[] method1960() {
		Static55.aFloatArray24[12] = this.aFloat67;
		Static55.aFloatArray24[2] = this.aFloat62;
		Static55.aFloatArray24[0] = this.aFloat71;
		Static55.aFloatArray24[9] = this.aFloat66;
		Static55.aFloatArray24[5] = this.aFloat65;
		Static55.aFloatArray24[6] = this.aFloat70;
		Static55.aFloatArray24[8] = this.aFloat63;
		Static55.aFloatArray24[14] = this.aFloat61;
		Static55.aFloatArray24[1] = this.aFloat68;
		Static55.aFloatArray24[4] = this.aFloat64;
		Static55.aFloatArray24[10] = this.aFloat69;
		Static55.aFloatArray24[13] = this.aFloat60;
		return Static55.aFloatArray24;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class22 method5945() {
		@Pc(7) Class22_Sub2 local7 = new Class22_Sub2();
		local7.aFloat69 = this.aFloat69;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat67 = this.aFloat67;
		return local7;
	}

	@OriginalMember(owner = "client!da", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat68 = this.aFloat62 = this.aFloat64 = this.aFloat70 = this.aFloat63 = this.aFloat66 = this.aFloat67 = this.aFloat60 = this.aFloat61 = 0.0F;
		this.aFloat71 = this.aFloat65 = this.aFloat69 = 1.0F;
	}

	@OriginalMember(owner = "client!da", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class22 arg0) {
		@Pc(6) Class22_Sub2 local6 = (Class22_Sub2) arg0;
		this.aFloat66 = local6.aFloat66;
		this.aFloat69 = local6.aFloat69;
		this.aFloat60 = local6.aFloat60;
		this.aFloat63 = local6.aFloat63;
		this.aFloat70 = local6.aFloat70;
		this.aFloat68 = local6.aFloat68;
		this.aFloat64 = local6.aFloat64;
		this.aFloat65 = local6.aFloat65;
		this.aFloat61 = local6.aFloat61;
		this.aFloat71 = local6.aFloat71;
		this.aFloat62 = local6.aFloat62;
		this.aFloat67 = local6.aFloat67;
	}

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat60 += arg1;
		this.aFloat67 += arg0;
		this.aFloat61 += arg2;
	}

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class47_Sub5.aFloatArray71[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class47_Sub5.aFloatArray70[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class47_Sub5.aFloatArray71[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class47_Sub5.aFloatArray70[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class47_Sub5.aFloatArray71[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class47_Sub5.aFloatArray70[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat70 = -local15;
		this.aFloat65 = local9 * local33;
		this.aFloat66 = local27 * local39 + local21 * local43;
		this.aFloat71 = local33 * local21 + local27 * local47;
		this.aFloat69 = local9 * local21;
		this.aFloat64 = local9 * local39;
		this.aFloat62 = local27 * local9;
		this.aFloat63 = local21 * local47 + local33 * -local27;
		this.aFloat68 = -local21 * local39 + local27 * local43;
		this.aFloat61 = -(this.aFloat69 * (float) arg2) - (float) arg1 * this.aFloat70 + (float) -arg0 * this.aFloat62;
		this.aFloat60 = -(this.aFloat66 * (float) arg2) + this.aFloat68 * (float) -arg0 - (float) arg1 * this.aFloat65;
		this.aFloat67 = -((float) arg1 * this.aFloat64) + this.aFloat71 * (float) -arg0 - this.aFloat63 * (float) arg2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1961(@OriginalArg(0) Class22 arg0) {
		@Pc(6) Class22_Sub2 local6 = (Class22_Sub2) arg0;
		this.aFloat64 = local6.aFloat68;
		this.aFloat63 = local6.aFloat62;
		this.aFloat71 = local6.aFloat71;
		this.aFloat66 = local6.aFloat70;
		this.aFloat62 = local6.aFloat63;
		this.aFloat68 = local6.aFloat64;
		this.aFloat65 = local6.aFloat65;
		this.aFloat70 = local6.aFloat66;
		this.aFloat69 = local6.aFloat69;
		this.aFloat67 = -(this.aFloat64 * local6.aFloat60 + local6.aFloat67 * this.aFloat71 + local6.aFloat61 * this.aFloat63);
		this.aFloat60 = -(local6.aFloat60 * this.aFloat65 + local6.aFloat67 * this.aFloat68 + local6.aFloat61 * this.aFloat66);
		this.aFloat61 = -(local6.aFloat67 * this.aFloat62 + local6.aFloat60 * this.aFloat70 + local6.aFloat61 * this.aFloat69);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat69 * (float) arg2 + this.aFloat70 * (float) arg1 + (float) arg0 * this.aFloat62 + this.aFloat61);
		arg3[0] = (int) (this.aFloat67 + this.aFloat63 * (float) arg2 + this.aFloat64 * (float) arg1 + this.aFloat71 * (float) arg0);
		arg3[1] = (int) (this.aFloat60 + this.aFloat68 * (float) arg0 + this.aFloat65 * (float) arg1 + this.aFloat66 * (float) arg2);
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class47_Sub5.aFloatArray71[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class47_Sub5.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat65;
		@Pc(24) float local24 = this.aFloat66;
		@Pc(27) float local27 = this.aFloat60;
		this.aFloat68 = local18 * local9 - local15 * this.aFloat62;
		this.aFloat65 = local21 * local9 - local15 * this.aFloat70;
		this.aFloat62 = local9 * this.aFloat62 + local15 * local18;
		this.aFloat66 = local9 * local24 - local15 * this.aFloat69;
		this.aFloat70 = local15 * local21 + local9 * this.aFloat70;
		this.aFloat69 = local24 * local15 + local9 * this.aFloat69;
		this.aFloat60 = local27 * local9 - local15 * this.aFloat61;
		this.aFloat61 = this.aFloat61 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!da", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat65 * (float) arg1 + this.aFloat68 * (float) arg0 + this.aFloat66 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat71 + this.aFloat64 * (float) arg1 + this.aFloat63 * (float) arg2);
		arg3[2] = (int) (this.aFloat62 * (float) arg0 + this.aFloat70 * (float) arg1 + this.aFloat69 * (float) arg2);
	}

	@OriginalMember(owner = "client!da", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat65 = 1.0F;
		this.aFloat71 = this.aFloat69 = Class47_Sub5.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat63 = Class47_Sub5.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat62 = -this.aFloat63;
		this.aFloat64 = this.aFloat67 = this.aFloat68 = this.aFloat66 = this.aFloat60 = this.aFloat70 = this.aFloat61 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat69 = 1.0F;
		this.aFloat71 = this.aFloat65 = Class47_Sub5.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat68 = Class47_Sub5.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat64 = -this.aFloat68;
		this.aFloat63 = this.aFloat67 = this.aFloat66 = this.aFloat60 = this.aFloat62 = this.aFloat70 = this.aFloat61 = 0.0F;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)[F")
	public float[] method1962() {
		Static55.aFloatArray24[12] = 0.0F;
		Static55.aFloatArray24[4] = this.aFloat64;
		Static55.aFloatArray24[5] = this.aFloat65;
		Static55.aFloatArray24[0] = this.aFloat71;
		Static55.aFloatArray24[14] = 0.0F;
		Static55.aFloatArray24[6] = this.aFloat70;
		Static55.aFloatArray24[1] = this.aFloat68;
		Static55.aFloatArray24[13] = 0.0F;
		Static55.aFloatArray24[2] = this.aFloat62;
		Static55.aFloatArray24[9] = this.aFloat66;
		Static55.aFloatArray24[8] = this.aFloat63;
		Static55.aFloatArray24[10] = this.aFloat69;
		return Static55.aFloatArray24;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(FZFIIIF)V")
	public void method1964(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat68 = this.aFloat62 = this.aFloat64 = this.aFloat70 = this.aFloat63 = this.aFloat66 = 0.0F;
			this.aFloat65 = arg3;
			this.aFloat69 = 1.0F;
			this.aFloat71 = arg2;
		} else {
			@Pc(10) float local10 = Class47_Sub5.aFloatArray71[arg4 & 0x3FFF];
			@Pc(16) float local16 = Class47_Sub5.aFloatArray70[arg4 & 0x3FFF];
			this.aFloat68 = (float) arg2 * local16;
			this.aFloat62 = this.aFloat70 = this.aFloat63 = this.aFloat66 = 0.0F;
			this.aFloat71 = (float) arg2 * local10;
			this.aFloat69 = 1.0F;
			this.aFloat64 = -local16 * (float) arg3;
			this.aFloat65 = (float) arg3 * local10;
		}
		this.aFloat61 = arg1;
		this.aFloat67 = arg0;
		this.aFloat60 = arg5;
	}

	@OriginalMember(owner = "client!da", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat67;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat60;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat61;
		arg0[1] = (int) (local28 * this.aFloat70 + this.aFloat65 * local19 + this.aFloat64 * local11);
		arg0[2] = (int) (this.aFloat63 * local11 + this.aFloat66 * local19 + this.aFloat69 * local28);
		arg0[0] = (int) (this.aFloat71 * local11 + this.aFloat68 * local19 + local28 * this.aFloat62);
	}

	@OriginalMember(owner = "client!da", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class47_Sub5.aFloatArray71[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class47_Sub5.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat71;
		@Pc(21) float local21 = this.aFloat64;
		@Pc(24) float local24 = this.aFloat63;
		this.aFloat71 = local9 * local18 + local15 * this.aFloat62;
		@Pc(37) float local37 = this.aFloat67;
		this.aFloat62 = local9 * this.aFloat62 - local18 * local15;
		this.aFloat64 = local9 * local21 + this.aFloat70 * local15;
		this.aFloat70 = this.aFloat70 * local9 - local15 * local21;
		this.aFloat63 = local9 * local24 + this.aFloat69 * local15;
		this.aFloat69 = local9 * this.aFloat69 - local15 * local24;
		this.aFloat67 = local15 * this.aFloat61 + local37 * local9;
		this.aFloat61 = local9 * this.aFloat61 - local15 * local37;
	}

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat68 = this.aFloat62 = this.aFloat64 = this.aFloat70 = this.aFloat63 = this.aFloat66 = 0.0F;
		this.aFloat67 = arg0;
		this.aFloat61 = arg2;
		this.aFloat71 = this.aFloat65 = this.aFloat69 = 1.0F;
		this.aFloat60 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat71 = 1.0F;
		this.aFloat65 = this.aFloat69 = Class47_Sub5.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat70 = Class47_Sub5.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat64 = this.aFloat63 = this.aFloat67 = this.aFloat68 = this.aFloat60 = this.aFloat62 = this.aFloat61 = 0.0F;
		this.aFloat66 = -this.aFloat70;
	}
}
