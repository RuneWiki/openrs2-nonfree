import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!en", name = "z", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class91_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!en", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat68 += arg2;
		this.aFloat61 += arg0;
		this.aFloat69 += arg1;
	}

	@OriginalMember(owner = "client!en", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class37.aFloatArray5[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class37.aFloatArray4[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class37.aFloatArray5[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class37.aFloatArray4[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class37.aFloatArray5[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class37.aFloatArray4[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat65 = local39 * local9;
		this.aFloat71 = -local15;
		this.aFloat62 = local33 * local9;
		this.aFloat64 = local21 * local33 + local27 * local47;
		this.aFloat66 = local27 * local43 + -local21 * local39;
		this.aFloat67 = local21 * local9;
		this.aFloat63 = local27 * local39 + local43 * local21;
		this.aFloat72 = local33 * -local27 + local21 * local47;
		this.aFloat70 = local9 * local27;
		this.aFloat68 = -(this.aFloat67 * (float) arg2) + this.aFloat70 * (float) -arg0 - (float) arg1 * this.aFloat71;
		this.aFloat69 = this.aFloat66 * (float) -arg0 - this.aFloat62 * (float) arg1 - (float) arg2 * this.aFloat63;
		this.aFloat61 = this.aFloat64 * (float) -arg0 - this.aFloat65 * (float) arg1 - (float) arg2 * this.aFloat72;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)[F")
	public float[] method2459() {
		Static367.aFloatArray55[13] = 0.0F;
		Static367.aFloatArray55[1] = this.aFloat66;
		Static367.aFloatArray55[12] = 0.0F;
		Static367.aFloatArray55[2] = this.aFloat70;
		Static367.aFloatArray55[6] = this.aFloat71;
		Static367.aFloatArray55[5] = this.aFloat62;
		Static367.aFloatArray55[4] = this.aFloat65;
		Static367.aFloatArray55[14] = 0.0F;
		Static367.aFloatArray55[9] = this.aFloat63;
		Static367.aFloatArray55[10] = this.aFloat67;
		Static367.aFloatArray55[0] = this.aFloat64;
		Static367.aFloatArray55[8] = this.aFloat72;
		return Static367.aFloatArray55;
	}

	@OriginalMember(owner = "client!en", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat64 = 1.0F;
		this.aFloat62 = this.aFloat67 = Class37.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat71 = Class37.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat65 = this.aFloat72 = this.aFloat61 = this.aFloat66 = this.aFloat69 = this.aFloat70 = this.aFloat68 = 0.0F;
		this.aFloat63 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IFIFIFI)V")
	public void method2460(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		if (arg2 == 0) {
			this.aFloat67 = 1.0F;
			this.aFloat64 = arg4;
			this.aFloat66 = this.aFloat70 = this.aFloat65 = this.aFloat71 = this.aFloat72 = this.aFloat63 = 0.0F;
			this.aFloat62 = arg0;
		} else {
			@Pc(51) float local51 = Class37.aFloatArray5[arg2 & 0x3FFF];
			@Pc(57) float local57 = Class37.aFloatArray4[arg2 & 0x3FFF];
			this.aFloat66 = local57 * (float) arg4;
			this.aFloat67 = 1.0F;
			this.aFloat70 = this.aFloat71 = this.aFloat72 = this.aFloat63 = 0.0F;
			this.aFloat64 = (float) arg4 * local51;
			this.aFloat62 = local51 * (float) arg0;
			this.aFloat65 = -local57 * (float) arg0;
		}
		this.aFloat69 = arg3;
		this.aFloat61 = arg1;
		this.aFloat68 = arg5;
	}

	@OriginalMember(owner = "client!en", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat61;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat69;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat68;
		arg0[2] = (int) (this.aFloat63 * local19 + local11 * this.aFloat72 + local27 * this.aFloat67);
		arg0[1] = (int) (local11 * this.aFloat65 + local19 * this.aFloat62 + local27 * this.aFloat71);
		arg0[0] = (int) (this.aFloat70 * local27 + local11 * this.aFloat64 + local19 * this.aFloat66);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class91 method7050() {
		@Pc(7) Class91_Sub1 local7 = new Class91_Sub1();
		local7.aFloat71 = this.aFloat71;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat67 = this.aFloat67;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat69 = this.aFloat69;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat62 = this.aFloat62;
		return local7;
	}

	@OriginalMember(owner = "client!en", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat62 = 1.0F;
		this.aFloat64 = this.aFloat67 = Class37.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat72 = Class37.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat70 = -this.aFloat72;
		this.aFloat65 = this.aFloat61 = this.aFloat66 = this.aFloat63 = this.aFloat69 = this.aFloat71 = this.aFloat68 = 0.0F;
	}

	@OriginalMember(owner = "client!en", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class91 arg0) {
		@Pc(6) Class91_Sub1 local6 = (Class91_Sub1) arg0;
		this.aFloat66 = local6.aFloat66;
		this.aFloat72 = local6.aFloat72;
		this.aFloat63 = local6.aFloat63;
		this.aFloat70 = local6.aFloat70;
		this.aFloat62 = local6.aFloat62;
		this.aFloat65 = local6.aFloat65;
		this.aFloat61 = local6.aFloat61;
		this.aFloat67 = local6.aFloat67;
		this.aFloat64 = local6.aFloat64;
		this.aFloat71 = local6.aFloat71;
		this.aFloat68 = local6.aFloat68;
		this.aFloat69 = local6.aFloat69;
	}

	@OriginalMember(owner = "client!en", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat67 = 1.0F;
		this.aFloat64 = this.aFloat62 = Class37.aFloatArray5[arg0 & 0x3FFF];
		this.aFloat66 = Class37.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat72 = this.aFloat61 = this.aFloat63 = this.aFloat69 = this.aFloat70 = this.aFloat71 = this.aFloat68 = 0.0F;
		this.aFloat65 = -this.aFloat66;
	}

	@OriginalMember(owner = "client!en", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class37.aFloatArray5[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class37.aFloatArray4[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat64;
		@Pc(21) float local21 = this.aFloat65;
		@Pc(24) float local24 = this.aFloat72;
		@Pc(27) float local27 = this.aFloat61;
		this.aFloat64 = local9 * local18 + local15 * this.aFloat70;
		this.aFloat65 = local9 * local21 + local15 * this.aFloat71;
		this.aFloat70 = this.aFloat70 * local9 - local15 * local18;
		this.aFloat71 = local9 * this.aFloat71 - local21 * local15;
		this.aFloat72 = this.aFloat67 * local15 + local24 * local9;
		this.aFloat67 = local9 * this.aFloat67 - local15 * local24;
		this.aFloat61 = local15 * this.aFloat68 + local27 * local9;
		this.aFloat68 = this.aFloat68 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!en", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat66 = this.aFloat70 = this.aFloat65 = this.aFloat71 = this.aFloat72 = this.aFloat63 = this.aFloat61 = this.aFloat69 = this.aFloat68 = 0.0F;
		this.aFloat64 = this.aFloat62 = this.aFloat67 = 1.0F;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!m;)V")
	public void method2464(@OriginalArg(1) Class91 arg0) {
		@Pc(6) Class91_Sub1 local6 = (Class91_Sub1) arg0;
		this.aFloat72 = local6.aFloat70;
		this.aFloat64 = local6.aFloat64;
		this.aFloat65 = local6.aFloat66;
		this.aFloat62 = local6.aFloat62;
		this.aFloat70 = local6.aFloat72;
		this.aFloat63 = local6.aFloat71;
		this.aFloat66 = local6.aFloat65;
		this.aFloat67 = local6.aFloat67;
		this.aFloat61 = -(local6.aFloat68 * this.aFloat72 + local6.aFloat61 * this.aFloat64 + this.aFloat65 * local6.aFloat69);
		this.aFloat71 = local6.aFloat63;
		this.aFloat69 = -(local6.aFloat68 * this.aFloat63 + this.aFloat66 * local6.aFloat61 + local6.aFloat69 * this.aFloat62);
		this.aFloat68 = -(local6.aFloat69 * this.aFloat71 + this.aFloat70 * local6.aFloat61 + this.aFloat67 * local6.aFloat68);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)[F")
	public float[] method2465() {
		Static367.aFloatArray55[10] = this.aFloat67;
		Static367.aFloatArray55[1] = this.aFloat66;
		Static367.aFloatArray55[12] = this.aFloat61;
		Static367.aFloatArray55[2] = this.aFloat70;
		Static367.aFloatArray55[4] = this.aFloat65;
		Static367.aFloatArray55[5] = this.aFloat62;
		Static367.aFloatArray55[0] = this.aFloat64;
		Static367.aFloatArray55[8] = this.aFloat72;
		Static367.aFloatArray55[9] = this.aFloat63;
		Static367.aFloatArray55[6] = this.aFloat71;
		Static367.aFloatArray55[14] = this.aFloat68;
		Static367.aFloatArray55[13] = this.aFloat69;
		return Static367.aFloatArray55;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat69 + this.aFloat63 * (float) arg2 + this.aFloat62 * (float) arg1 + (float) arg0 * this.aFloat66);
		arg3[2] = (int) (this.aFloat68 + (float) arg1 * this.aFloat71 + (float) arg0 * this.aFloat70 + (float) arg2 * this.aFloat67);
		arg3[0] = (int) (this.aFloat61 + (float) arg2 * this.aFloat72 + (float) arg1 * this.aFloat65 + this.aFloat64 * (float) arg0);
	}

	@OriginalMember(owner = "client!en", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat66 = this.aFloat70 = this.aFloat65 = this.aFloat71 = this.aFloat72 = this.aFloat63 = 0.0F;
		this.aFloat69 = arg1;
		this.aFloat61 = arg0;
		this.aFloat68 = arg2;
		this.aFloat64 = this.aFloat62 = this.aFloat67 = 1.0F;
	}

	@OriginalMember(owner = "client!en", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat64 * (float) arg0 + this.aFloat65 * (float) arg1 + this.aFloat72 * (float) arg2);
		arg3[2] = (int) ((float) arg2 * this.aFloat67 + this.aFloat71 * (float) arg1 + this.aFloat70 * (float) arg0);
		arg3[1] = (int) (this.aFloat66 * (float) arg0 + (float) arg1 * this.aFloat62 + (float) arg2 * this.aFloat63);
	}

	@OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class37.aFloatArray5[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class37.aFloatArray4[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat66;
		@Pc(21) float local21 = this.aFloat62;
		@Pc(24) float local24 = this.aFloat63;
		this.aFloat66 = local18 * local9 - this.aFloat70 * local15;
		@Pc(38) float local38 = this.aFloat69;
		this.aFloat62 = local9 * local21 - this.aFloat71 * local15;
		this.aFloat70 = this.aFloat70 * local9 + local15 * local18;
		this.aFloat71 = local21 * local15 + local9 * this.aFloat71;
		this.aFloat63 = local9 * local24 - local15 * this.aFloat67;
		this.aFloat69 = local9 * local38 - local15 * this.aFloat68;
		this.aFloat67 = local9 * this.aFloat67 + local24 * local15;
		this.aFloat68 = local15 * local38 + this.aFloat68 * local9;
	}
}
