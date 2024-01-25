import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class66_Sub2() {
		this.method5812();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!ve;)V")
	public void method5829(@OriginalArg(1) Class66 arg0) {
		@Pc(2) Class66_Sub2 local2 = (Class66_Sub2) arg0;
		this.aFloat77 = local2.aFloat66;
		this.aFloat71 = local2.aFloat71;
		this.aFloat69 = local2.aFloat70;
		this.aFloat75 = local2.aFloat75;
		this.aFloat70 = local2.aFloat69;
		this.aFloat67 = local2.aFloat74;
		this.aFloat66 = local2.aFloat77;
		this.aFloat68 = -(this.aFloat69 * local2.aFloat76 + local2.aFloat68 * this.aFloat71 + local2.aFloat73 * this.aFloat77);
		this.aFloat72 = local2.aFloat72;
		this.aFloat74 = local2.aFloat67;
		this.aFloat76 = -(this.aFloat70 * local2.aFloat68 + this.aFloat75 * local2.aFloat76 + this.aFloat67 * local2.aFloat73);
		this.aFloat73 = -(this.aFloat72 * local2.aFloat73 + this.aFloat66 * local2.aFloat68 + local2.aFloat76 * this.aFloat74);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ve;)V")
	@Override
	public void method5827(@OriginalArg(0) Class66 arg0) {
		@Pc(2) Class66_Sub2 local2 = (Class66_Sub2) arg0;
		this.aFloat74 = local2.aFloat74;
		this.aFloat73 = local2.aFloat73;
		this.aFloat77 = local2.aFloat77;
		this.aFloat70 = local2.aFloat70;
		this.aFloat75 = local2.aFloat75;
		this.aFloat66 = local2.aFloat66;
		this.aFloat68 = local2.aFloat68;
		this.aFloat67 = local2.aFloat67;
		this.aFloat76 = local2.aFloat76;
		this.aFloat69 = local2.aFloat69;
		this.aFloat71 = local2.aFloat71;
		this.aFloat72 = local2.aFloat72;
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)[F")
	public float[] method5830() {
		Static337.aFloatArray29[1] = this.aFloat70;
		Static337.aFloatArray29[0] = this.aFloat71;
		Static337.aFloatArray29[12] = 0.0F;
		Static337.aFloatArray29[8] = this.aFloat77;
		Static337.aFloatArray29[6] = this.aFloat74;
		Static337.aFloatArray29[10] = this.aFloat72;
		Static337.aFloatArray29[13] = 0.0F;
		Static337.aFloatArray29[2] = this.aFloat66;
		Static337.aFloatArray29[4] = this.aFloat69;
		Static337.aFloatArray29[9] = this.aFloat67;
		Static337.aFloatArray29[5] = this.aFloat75;
		Static337.aFloatArray29[14] = 0.0F;
		return Static337.aFloatArray29;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V")
	@Override
	public void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat73 += arg2;
		this.aFloat76 += arg1;
		this.aFloat68 += arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0) {
		this.aFloat71 = 1.0F;
		this.aFloat75 = this.aFloat72 = Class49.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat74 = Class49.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat67 = -this.aFloat74;
		this.aFloat69 = this.aFloat77 = this.aFloat68 = this.aFloat70 = this.aFloat76 = this.aFloat66 = this.aFloat73 = 0.0F;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class49.aFloatArray1[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class49.aFloatArray2[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class49.aFloatArray1[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class49.aFloatArray2[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class49.aFloatArray1[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class49.aFloatArray2[arg5 & 0x3FFF];
		@Pc(39) float local39 = local29 * local11;
		@Pc(43) float local43 = local11 * local35;
		this.aFloat66 = local23 * local5;
		this.aFloat67 = local35 * local23 + local39 * local17;
		this.aFloat75 = local5 * local29;
		this.aFloat71 = local43 * local23 + local17 * local29;
		this.aFloat74 = -local11;
		this.aFloat69 = local5 * local35;
		this.aFloat72 = local17 * local5;
		this.aFloat77 = local17 * local43 + local29 * -local23;
		this.aFloat70 = -local17 * local35 + local39 * local23;
		this.aFloat76 = -((float) arg2 * this.aFloat67) - this.aFloat75 * (float) arg1 + (float) -arg0 * this.aFloat70;
		this.aFloat73 = -(this.aFloat72 * (float) arg2) + this.aFloat66 * (float) -arg0 - this.aFloat74 * (float) arg1;
		this.aFloat68 = -(this.aFloat77 * (float) arg2) - this.aFloat69 * (float) arg1 + (float) -arg0 * this.aFloat71;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[F")
	public float[] method5831() {
		Static337.aFloatArray29[0] = this.aFloat71;
		Static337.aFloatArray29[14] = this.aFloat73;
		Static337.aFloatArray29[1] = this.aFloat70;
		Static337.aFloatArray29[10] = this.aFloat72;
		Static337.aFloatArray29[12] = this.aFloat68;
		Static337.aFloatArray29[5] = this.aFloat75;
		Static337.aFloatArray29[13] = this.aFloat76;
		Static337.aFloatArray29[9] = this.aFloat67;
		Static337.aFloatArray29[6] = this.aFloat74;
		Static337.aFloatArray29[4] = this.aFloat69;
		Static337.aFloatArray29[2] = this.aFloat66;
		Static337.aFloatArray29[8] = this.aFloat77;
		return Static337.aFloatArray29;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	@Override
	public void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat71 = this.aFloat75 = this.aFloat72 = 1.0F;
		this.aFloat68 = arg0;
		this.aFloat73 = arg2;
		this.aFloat70 = this.aFloat66 = this.aFloat69 = this.aFloat74 = this.aFloat77 = this.aFloat67 = 0.0F;
		this.aFloat76 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	@Override
	public void method5826(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat71 = this.aFloat72 = Class49.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat77 = Class49.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat66 = -this.aFloat77;
		this.aFloat69 = this.aFloat68 = this.aFloat70 = this.aFloat67 = this.aFloat76 = this.aFloat74 = this.aFloat73 = 0.0F;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) {
		this.aFloat72 = 1.0F;
		this.aFloat71 = this.aFloat75 = Class49.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat70 = Class49.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat77 = this.aFloat68 = this.aFloat67 = this.aFloat76 = this.aFloat66 = this.aFloat74 = this.aFloat73 = 0.0F;
		this.aFloat69 = -this.aFloat70;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
	@Override
	public void method5821(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class49.aFloatArray1[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class49.aFloatArray2[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat71;
		@Pc(17) float local17 = this.aFloat69;
		@Pc(20) float local20 = this.aFloat77;
		this.aFloat71 = this.aFloat66 * local11 + local5 * local14;
		@Pc(33) float local33 = this.aFloat68;
		this.aFloat66 = this.aFloat66 * local5 - local14 * local11;
		this.aFloat69 = local5 * local17 + local11 * this.aFloat74;
		this.aFloat74 = this.aFloat74 * local5 - local17 * local11;
		this.aFloat77 = local20 * local5 + local11 * this.aFloat72;
		this.aFloat72 = local5 * this.aFloat72 - local11 * local20;
		this.aFloat68 = local5 * local33 + this.aFloat73 * local11;
		this.aFloat73 = local5 * this.aFloat73 - local11 * local33;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	@Override
	public void method5812() {
		this.aFloat70 = this.aFloat66 = this.aFloat69 = this.aFloat74 = this.aFloat77 = this.aFloat67 = this.aFloat68 = this.aFloat76 = this.aFloat73 = 0.0F;
		this.aFloat71 = this.aFloat75 = this.aFloat72 = 1.0F;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	@Override
	public void method5815(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class49.aFloatArray1[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class49.aFloatArray2[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat70;
		@Pc(17) float local17 = this.aFloat75;
		@Pc(20) float local20 = this.aFloat67;
		@Pc(23) float local23 = this.aFloat76;
		this.aFloat70 = local5 * local14 - this.aFloat66 * local11;
		this.aFloat75 = local5 * local17 - this.aFloat74 * local11;
		this.aFloat66 = this.aFloat66 * local5 + local14 * local11;
		this.aFloat74 = local5 * this.aFloat74 + local11 * local17;
		this.aFloat67 = local20 * local5 - local11 * this.aFloat72;
		this.aFloat76 = local23 * local5 - this.aFloat73 * local11;
		this.aFloat72 = local5 * this.aFloat72 + local11 * local20;
		this.aFloat73 = local11 * local23 + this.aFloat73 * local5;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()Lclient!vh;")
	public Class66_Sub2 method5832() {
		@Pc(3) Class66_Sub2 local3 = new Class66_Sub2();
		local3.aFloat73 = this.aFloat73;
		local3.aFloat70 = this.aFloat70;
		local3.aFloat71 = this.aFloat71;
		local3.aFloat66 = this.aFloat66;
		local3.aFloat76 = this.aFloat76;
		local3.aFloat72 = this.aFloat72;
		local3.aFloat75 = this.aFloat75;
		local3.aFloat67 = this.aFloat67;
		local3.aFloat68 = this.aFloat68;
		local3.aFloat74 = this.aFloat74;
		local3.aFloat77 = this.aFloat77;
		local3.aFloat69 = this.aFloat69;
		return local3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat68 + (float) arg2 * this.aFloat77 + (float) arg0 * this.aFloat71 + this.aFloat69 * (float) arg1);
		arg3[2] = (int) (this.aFloat73 + this.aFloat72 * (float) arg2 + (float) arg1 * this.aFloat74 + this.aFloat66 * (float) arg0);
		arg3[1] = (int) (this.aFloat67 * (float) arg2 + (float) arg1 * this.aFloat75 + this.aFloat70 * (float) arg0 + this.aFloat76);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([I)V")
	@Override
	public void method5813(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat68;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat76;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat73;
		arg0[2] = (int) (local16 * this.aFloat67 + this.aFloat77 * local7 + local24 * this.aFloat72);
		arg0[0] = (int) (this.aFloat71 * local7 + local16 * this.aFloat70 + this.aFloat66 * local24);
		arg0[1] = (int) (this.aFloat74 * local24 + this.aFloat75 * local16 + this.aFloat69 * local7);
	}
}
