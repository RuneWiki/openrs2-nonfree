import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!bca", name = "n", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!bca", name = "r", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!bca", name = "v", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!bca", name = "y", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!bca", name = "C", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!bca", name = "G", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	public Class25_Sub2() {
		this.method4291();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
	@Override
	public void method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 += (float) arg1;
		this.aFloat52 += (float) arg0;
		this.aFloat49 += (float) arg2;
	}

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V")
	@Override
	public void method4289(@OriginalArg(0) int arg0) {
		this.aFloat55 = 1.0F;
		this.aFloat60 = this.aFloat59 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat53 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat54 = -this.aFloat53;
		this.aFloat57 = this.aFloat52 = this.aFloat56 = this.aFloat51 = this.aFloat58 = this.aFloat50 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V")
	@Override
	public void method4293(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat60;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat53;
		this.aFloat60 = local18 * local9 - local15 * this.aFloat56;
		@Pc(37) float local37 = this.aFloat52;
		this.aFloat56 = local9 * this.aFloat56 + local18 * local15;
		this.aFloat57 = local9 * local21 - this.aFloat55 * local15;
		this.aFloat53 = local9 * local24 - this.aFloat51 * local15;
		this.aFloat55 = local21 * local15 + this.aFloat55 * local9;
		this.aFloat51 = local24 * local15 + local9 * this.aFloat51;
		this.aFloat52 = local37 * local9 - local15 * this.aFloat58;
		this.aFloat58 = local9 * this.aFloat58 + local15 * local37;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
	@Override
	public void method4285(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat55 = this.aFloat59 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat50 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat51 = -this.aFloat50;
		this.aFloat57 = this.aFloat53 = this.aFloat52 = this.aFloat56 = this.aFloat58 = this.aFloat54 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
	@Override
	public void method4288(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat60;
		@Pc(21) float local21 = this.aFloat57;
		@Pc(24) float local24 = this.aFloat53;
		this.aFloat60 = this.aFloat54 * local15 + local9 * local18;
		@Pc(37) float local37 = this.aFloat52;
		this.aFloat54 = local9 * this.aFloat54 - local18 * local15;
		this.aFloat57 = local21 * local9 + local15 * this.aFloat50;
		this.aFloat50 = local9 * this.aFloat50 - local15 * local21;
		this.aFloat53 = local15 * this.aFloat59 + local24 * local9;
		this.aFloat52 = local9 * local37 + this.aFloat49 * local15;
		this.aFloat59 = local9 * this.aFloat59 - local24 * local15;
		this.aFloat49 = this.aFloat49 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "(I)V")
	@Override
	public void method4298(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat60 = this.aFloat55 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat56 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat57 = -this.aFloat56;
		this.aFloat53 = this.aFloat52 = this.aFloat51 = this.aFloat58 = this.aFloat54 = this.aFloat50 = this.aFloat49 = 0.0F;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat52 = (float) arg0;
		this.aFloat58 = (float) arg1;
		this.aFloat49 = (float) arg2;
		this.aFloat60 = this.aFloat55 = this.aFloat59 = 1.0F;
		this.aFloat56 = this.aFloat54 = this.aFloat57 = this.aFloat50 = this.aFloat53 = this.aFloat51 = 0.0F;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat56 * (float) arg0 + this.aFloat55 * (float) arg1 + (float) arg2 * this.aFloat51);
		arg3[2] = (int) ((float) arg2 * this.aFloat59 + this.aFloat54 * (float) arg0 + (float) arg1 * this.aFloat50);
		arg3[0] = (int) (this.aFloat60 * (float) arg0 + (float) arg1 * this.aFloat57 + (float) arg2 * this.aFloat53);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([I)V")
	@Override
	public void method4299(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat52;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat58;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat49;
		arg0[1] = (int) (local20 * this.aFloat55 + this.aFloat57 * local12 + local28 * this.aFloat50);
		arg0[0] = (int) (local28 * this.aFloat54 + local20 * this.aFloat56 + this.aFloat60 * local12);
		arg0[2] = (int) (local20 * this.aFloat51 + local12 * this.aFloat53 + local28 * this.aFloat59);
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method4292() {
		@Pc(7) Class25_Sub2 local7 = new Class25_Sub2();
		local7.aFloat60 = this.aFloat60;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat56 = this.aFloat56;
		return local7;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class23_Sub2_Sub3.aFloatArray76[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class23_Sub2_Sub3.aFloatArray75[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class23_Sub2_Sub3.aFloatArray76[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class23_Sub2_Sub3.aFloatArray75[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat55 = local33 * local9;
		this.aFloat60 = local47 * local27 + local33 * local21;
		this.aFloat53 = -local27 * local33 + local21 * local47;
		this.aFloat51 = local27 * local39 + local43 * local21;
		this.aFloat50 = -local15;
		this.aFloat57 = local9 * local39;
		this.aFloat56 = -local21 * local39 + local27 * local43;
		this.aFloat59 = local9 * local21;
		this.aFloat54 = local27 * local9;
		this.aFloat49 = -((float) arg1 * this.aFloat50) + (float) -arg0 * this.aFloat54 - (float) arg2 * this.aFloat59;
		this.aFloat52 = -(this.aFloat53 * (float) arg2) - (float) arg1 * this.aFloat57 + this.aFloat60 * (float) -arg0;
		this.aFloat58 = -(this.aFloat55 * (float) arg1) + (float) -arg0 * this.aFloat56 - this.aFloat51 * (float) arg2;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	@Override
	public void method4284(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class23_Sub2_Sub3.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class23_Sub2_Sub3.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat55;
		@Pc(24) float local24 = this.aFloat51;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat56 = local9 * local18 - this.aFloat54 * local15;
		this.aFloat54 = this.aFloat54 * local9 + local15 * local18;
		this.aFloat55 = local9 * local21 - this.aFloat50 * local15;
		this.aFloat51 = local24 * local9 - this.aFloat59 * local15;
		this.aFloat50 = this.aFloat50 * local9 + local15 * local21;
		this.aFloat58 = local27 * local9 - this.aFloat49 * local15;
		this.aFloat59 = this.aFloat59 * local9 + local15 * local24;
		this.aFloat49 = local27 * local15 + local9 * this.aFloat49;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat51 + (float) arg0 * this.aFloat56 + (float) arg1 * this.aFloat55 + this.aFloat58);
		arg3[2] = (int) (this.aFloat49 + this.aFloat59 * (float) arg2 + this.aFloat50 * (float) arg1 + (float) arg0 * this.aFloat54);
		arg3[0] = (int) (this.aFloat57 * (float) arg1 + (float) arg0 * this.aFloat60 + (float) arg2 * this.aFloat53 + this.aFloat52);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method4297(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub2 local6 = (Class25_Sub2) arg0;
		this.aFloat51 = local6.aFloat51;
		this.aFloat60 = local6.aFloat60;
		this.aFloat53 = local6.aFloat53;
		this.aFloat59 = local6.aFloat59;
		this.aFloat52 = local6.aFloat52;
		this.aFloat49 = local6.aFloat49;
		this.aFloat55 = local6.aFloat55;
		this.aFloat58 = local6.aFloat58;
		this.aFloat54 = local6.aFloat54;
		this.aFloat56 = local6.aFloat56;
		this.aFloat50 = local6.aFloat50;
		this.aFloat57 = local6.aFloat57;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat52);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat58);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat49);
		arg3[1] = (int) (this.aFloat55 * (float) local17 + this.aFloat57 * (float) local6 + this.aFloat50 * (float) local24);
		arg3[0] = (int) (this.aFloat60 * (float) local6 + (float) local17 * this.aFloat56 + this.aFloat54 * (float) local24);
		arg3[2] = (int) (this.aFloat53 * (float) local6 + this.aFloat51 * (float) local17 + this.aFloat59 * (float) local24);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "()V")
	@Override
	public void method4291() {
		this.aFloat60 = this.aFloat55 = this.aFloat59 = 1.0F;
		this.aFloat56 = this.aFloat54 = this.aFloat57 = this.aFloat50 = this.aFloat53 = this.aFloat51 = this.aFloat52 = this.aFloat58 = this.aFloat49 = 0.0F;
	}
}
