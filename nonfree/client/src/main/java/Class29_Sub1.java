import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!gl", name = "Q", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class29_Sub1() {
		this.v();
	}

	@OriginalMember(owner = "client!gl", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat52;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat50;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat54;
		arg0[1] = (int) (local12 * this.aFloat58 + local21 * this.aFloat59 + local30 * this.aFloat53);
		arg0[0] = (int) (this.aFloat51 * local30 + local12 * this.aFloat57 + local21 * this.aFloat56);
		arg0[2] = (int) (local30 * this.aFloat60 + local12 * this.aFloat55 + local21 * this.aFloat49);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)[F")
	public float[] method1958() {
		Static290.aFloatArray12[2] = this.aFloat51;
		Static290.aFloatArray12[9] = this.aFloat49;
		Static290.aFloatArray12[6] = this.aFloat53;
		Static290.aFloatArray12[5] = this.aFloat59;
		Static290.aFloatArray12[4] = this.aFloat58;
		Static290.aFloatArray12[10] = this.aFloat60;
		Static290.aFloatArray12[8] = this.aFloat55;
		Static290.aFloatArray12[0] = this.aFloat57;
		Static290.aFloatArray12[1] = this.aFloat56;
		Static290.aFloatArray12[12] = 0.0F;
		Static290.aFloatArray12[13] = 0.0F;
		Static290.aFloatArray12[14] = 0.0F;
		return Static290.aFloatArray12;
	}

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 += arg1;
		this.aFloat52 += arg0;
		this.aFloat54 += arg2;
	}

	@OriginalMember(owner = "client!gl", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class29 arg0) {
		@Pc(6) Class29_Sub1 local6 = (Class29_Sub1) arg0;
		this.aFloat55 = local6.aFloat55;
		this.aFloat60 = local6.aFloat60;
		this.aFloat59 = local6.aFloat59;
		this.aFloat56 = local6.aFloat56;
		this.aFloat49 = local6.aFloat49;
		this.aFloat50 = local6.aFloat50;
		this.aFloat54 = local6.aFloat54;
		this.aFloat53 = local6.aFloat53;
		this.aFloat52 = local6.aFloat52;
		this.aFloat57 = local6.aFloat57;
		this.aFloat58 = local6.aFloat58;
		this.aFloat51 = local6.aFloat51;
	}

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat56 = this.aFloat51 = this.aFloat58 = this.aFloat53 = this.aFloat55 = this.aFloat49 = this.aFloat52 = this.aFloat50 = this.aFloat54 = 0.0F;
		this.aFloat57 = this.aFloat59 = this.aFloat60 = 1.0F;
	}

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat51 + this.aFloat53 * (float) arg1 + (float) arg2 * this.aFloat60);
		arg3[1] = (int) ((float) arg1 * this.aFloat59 + (float) arg0 * this.aFloat56 + (float) arg2 * this.aFloat49);
		arg3[0] = (int) (this.aFloat58 * (float) arg1 + this.aFloat57 * (float) arg0 + this.aFloat55 * (float) arg2);
	}

	@OriginalMember(owner = "client!gl", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub2_Sub3.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub2_Sub3.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat57;
		@Pc(21) float local21 = this.aFloat58;
		@Pc(24) float local24 = this.aFloat55;
		this.aFloat57 = this.aFloat51 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat52;
		this.aFloat58 = this.aFloat53 * local15 + local21 * local9;
		this.aFloat51 = this.aFloat51 * local9 - local18 * local15;
		this.aFloat53 = local9 * this.aFloat53 - local21 * local15;
		this.aFloat55 = this.aFloat60 * local15 + local9 * local24;
		this.aFloat60 = this.aFloat60 * local9 - local15 * local24;
		this.aFloat52 = local9 * local37 + local15 * this.aFloat54;
		this.aFloat54 = this.aFloat54 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class29 method4107() {
		@Pc(7) Class29_Sub1 local7 = new Class29_Sub1();
		local7.aFloat53 = this.aFloat53;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat52 = this.aFloat52;
		return local7;
	}

	@OriginalMember(owner = "client!gl", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat50 = arg1;
		this.aFloat56 = this.aFloat51 = this.aFloat58 = this.aFloat53 = this.aFloat55 = this.aFloat49 = 0.0F;
		this.aFloat54 = arg2;
		this.aFloat57 = this.aFloat59 = this.aFloat60 = 1.0F;
		this.aFloat52 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat57 = this.aFloat60 = Class2_Sub2_Sub3.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat55 = Class2_Sub2_Sub3.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat51 = -this.aFloat55;
		this.aFloat58 = this.aFloat52 = this.aFloat56 = this.aFloat49 = this.aFloat50 = this.aFloat53 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIBFIIF)V")
	public void method1960(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat57 = arg3;
			this.aFloat56 = this.aFloat51 = this.aFloat58 = this.aFloat53 = this.aFloat55 = this.aFloat49 = 0.0F;
			this.aFloat59 = arg1;
			this.aFloat60 = 1.0F;
		} else {
			@Pc(38) float local38 = Class2_Sub2_Sub3.aFloatArray11[arg4 & 0x3FFF];
			@Pc(44) float local44 = Class2_Sub2_Sub3.aFloatArray10[arg4 & 0x3FFF];
			this.aFloat56 = local44 * (float) arg3;
			this.aFloat59 = (float) arg1 * local38;
			this.aFloat60 = 1.0F;
			this.aFloat51 = this.aFloat53 = this.aFloat55 = this.aFloat49 = 0.0F;
			this.aFloat58 = (float) arg1 * -local44;
			this.aFloat57 = (float) arg3 * local38;
		}
		this.aFloat50 = arg2;
		this.aFloat54 = arg5;
		this.aFloat52 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub2_Sub3.aFloatArray11[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub2_Sub3.aFloatArray10[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub2_Sub3.aFloatArray11[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub2_Sub3.aFloatArray10[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub2_Sub3.aFloatArray11[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub2_Sub3.aFloatArray10[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat60 = local9 * local21;
		this.aFloat53 = -local15;
		this.aFloat57 = local33 * local21 + local27 * local47;
		this.aFloat51 = local9 * local27;
		this.aFloat55 = local21 * local47 + local33 * -local27;
		this.aFloat49 = local27 * local39 + local21 * local43;
		this.aFloat59 = local9 * local33;
		this.aFloat56 = local43 * local27 + local39 * -local21;
		this.aFloat58 = local9 * local39;
		this.aFloat54 = -(this.aFloat60 * (float) arg2) + (float) -arg0 * this.aFloat51 - (float) arg1 * this.aFloat53;
		this.aFloat52 = this.aFloat57 * (float) -arg0 - (float) arg1 * this.aFloat58 - (float) arg2 * this.aFloat55;
		this.aFloat50 = -((float) arg2 * this.aFloat49) - (float) arg1 * this.aFloat59 + this.aFloat56 * (float) -arg0;
	}

	@OriginalMember(owner = "client!gl", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub2_Sub3.aFloatArray11[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub2_Sub3.aFloatArray10[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat59;
		@Pc(24) float local24 = this.aFloat49;
		this.aFloat56 = local9 * local18 - this.aFloat51 * local15;
		@Pc(37) float local37 = this.aFloat50;
		this.aFloat51 = local15 * local18 + this.aFloat51 * local9;
		this.aFloat59 = local9 * local21 - local15 * this.aFloat53;
		this.aFloat49 = local24 * local9 - local15 * this.aFloat60;
		this.aFloat53 = local9 * this.aFloat53 + local21 * local15;
		this.aFloat60 = local9 * this.aFloat60 + local24 * local15;
		this.aFloat50 = local37 * local9 - local15 * this.aFloat54;
		this.aFloat54 = local9 * this.aFloat54 + local37 * local15;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!c;)V")
	public void method1962(@OriginalArg(1) Class29 arg0) {
		@Pc(6) Class29_Sub1 local6 = (Class29_Sub1) arg0;
		this.aFloat57 = local6.aFloat57;
		this.aFloat55 = local6.aFloat51;
		this.aFloat58 = local6.aFloat56;
		this.aFloat59 = local6.aFloat59;
		this.aFloat49 = local6.aFloat53;
		this.aFloat51 = local6.aFloat55;
		this.aFloat56 = local6.aFloat58;
		this.aFloat52 = -(local6.aFloat52 * this.aFloat57 + local6.aFloat50 * this.aFloat58 + local6.aFloat54 * this.aFloat55);
		this.aFloat60 = local6.aFloat60;
		this.aFloat53 = local6.aFloat49;
		this.aFloat50 = -(this.aFloat49 * local6.aFloat54 + this.aFloat59 * local6.aFloat50 + local6.aFloat52 * this.aFloat56);
		this.aFloat54 = -(this.aFloat60 * local6.aFloat54 + local6.aFloat52 * this.aFloat51 + this.aFloat53 * local6.aFloat50);
	}

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat57 = this.aFloat59 = Class2_Sub2_Sub3.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat56 = Class2_Sub2_Sub3.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat55 = this.aFloat52 = this.aFloat49 = this.aFloat50 = this.aFloat51 = this.aFloat53 = this.aFloat54 = 0.0F;
		this.aFloat58 = -this.aFloat56;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)[F")
	public float[] method1963() {
		Static290.aFloatArray12[5] = this.aFloat59;
		Static290.aFloatArray12[1] = this.aFloat56;
		Static290.aFloatArray12[0] = this.aFloat57;
		Static290.aFloatArray12[9] = this.aFloat49;
		Static290.aFloatArray12[14] = this.aFloat54;
		Static290.aFloatArray12[2] = this.aFloat51;
		Static290.aFloatArray12[8] = this.aFloat55;
		Static290.aFloatArray12[12] = this.aFloat52;
		Static290.aFloatArray12[6] = this.aFloat53;
		Static290.aFloatArray12[13] = this.aFloat50;
		Static290.aFloatArray12[4] = this.aFloat58;
		Static290.aFloatArray12[10] = this.aFloat60;
		return Static290.aFloatArray12;
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat57 = 1.0F;
		this.aFloat59 = this.aFloat60 = Class2_Sub2_Sub3.aFloatArray11[arg0 & 0x3FFF];
		this.aFloat53 = Class2_Sub2_Sub3.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat49 = -this.aFloat53;
		this.aFloat58 = this.aFloat55 = this.aFloat52 = this.aFloat56 = this.aFloat50 = this.aFloat51 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat52 + (float) arg2 * this.aFloat55 + this.aFloat57 * (float) arg0 + (float) arg1 * this.aFloat58);
		arg3[1] = (int) (this.aFloat50 + (float) arg2 * this.aFloat49 + this.aFloat59 * (float) arg1 + (float) arg0 * this.aFloat56);
		arg3[2] = (int) (this.aFloat54 + this.aFloat60 * (float) arg2 + this.aFloat53 * (float) arg1 + this.aFloat51 * (float) arg0);
	}
}
