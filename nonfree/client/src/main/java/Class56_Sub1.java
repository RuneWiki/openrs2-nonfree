import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class56_Sub1() {
		this.method8400();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat24 * (float) arg2 + (float) arg0 * this.aFloat18 + (float) arg1 * this.aFloat26);
		arg3[1] = (int) ((float) arg1 * this.aFloat17 + (float) arg0 * this.aFloat21 + this.aFloat23 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat25 + this.aFloat15 * (float) arg1 + (float) arg2 * this.aFloat19);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat22);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat16);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat20);
		arg3[1] = (int) (this.aFloat26 * (float) local24 + (float) local10 * this.aFloat17 + this.aFloat15 * (float) local17);
		arg3[2] = (int) (this.aFloat23 * (float) local10 + this.aFloat19 * (float) local17 + this.aFloat24 * (float) local24);
		arg3[0] = (int) ((float) local24 * this.aFloat18 + (float) local17 * this.aFloat25 + this.aFloat21 * (float) local10);
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	@Override
	public void method8386(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat25;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat19;
		this.aFloat25 = local9 * local18 + local15 * this.aFloat18;
		@Pc(37) float local37 = this.aFloat16;
		this.aFloat18 = local9 * this.aFloat18 - local15 * local18;
		this.aFloat15 = local21 * local9 + local15 * this.aFloat26;
		this.aFloat19 = local9 * local24 + local15 * this.aFloat24;
		this.aFloat26 = this.aFloat26 * local9 - local21 * local15;
		this.aFloat24 = this.aFloat24 * local9 - local24 * local15;
		this.aFloat16 = local15 * this.aFloat20 + local9 * local37;
		this.aFloat20 = local9 * this.aFloat20 - local37 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	@Override
	public void method8391(@OriginalArg(0) int arg0) {
		this.aFloat17 = 1.0F;
		this.aFloat25 = this.aFloat24 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat19 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat16 = this.aFloat21 = this.aFloat23 = this.aFloat22 = this.aFloat26 = this.aFloat20 = 0.0F;
		this.aFloat18 = -this.aFloat19;
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
	@Override
	public void method8401(@OriginalArg(0) int arg0) {
		this.aFloat24 = 1.0F;
		this.aFloat25 = this.aFloat17 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat21 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat15 = -this.aFloat21;
		this.aFloat19 = this.aFloat16 = this.aFloat23 = this.aFloat22 = this.aFloat18 = this.aFloat26 = this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method8390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat20 += (float) arg2;
		this.aFloat22 += (float) arg1;
		this.aFloat16 += (float) arg0;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	@Override
	public void method8392(@OriginalArg(0) int arg0) {
		this.aFloat25 = 1.0F;
		this.aFloat17 = this.aFloat24 = Class104.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat26 = Class104.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat23 = -this.aFloat26;
		this.aFloat15 = this.aFloat19 = this.aFloat16 = this.aFloat21 = this.aFloat22 = this.aFloat18 = this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
	@Override
	public void method8383(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat16;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat22;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat20;
		arg0[0] = (int) (local20 * this.aFloat21 + this.aFloat25 * local12 + local28 * this.aFloat18);
		arg0[1] = (int) (local12 * this.aFloat15 + this.aFloat17 * local20 + this.aFloat26 * local28);
		arg0[2] = (int) (local12 * this.aFloat19 + local20 * this.aFloat23 + this.aFloat24 * local28);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
	@Override
	public void method8400() {
		this.aFloat25 = this.aFloat17 = this.aFloat24 = 1.0F;
		this.aFloat21 = this.aFloat18 = this.aFloat15 = this.aFloat26 = this.aFloat19 = this.aFloat23 = this.aFloat16 = this.aFloat22 = this.aFloat20 = 0.0F;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	@Override
	public void method8385(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat25;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat19;
		@Pc(27) float local27 = this.aFloat16;
		this.aFloat25 = local18 * local9 - local15 * this.aFloat21;
		this.aFloat21 = local15 * local18 + local9 * this.aFloat21;
		this.aFloat15 = local21 * local9 - this.aFloat17 * local15;
		this.aFloat17 = this.aFloat17 * local9 + local15 * local21;
		this.aFloat19 = local9 * local24 - this.aFloat23 * local15;
		this.aFloat16 = local27 * local9 - this.aFloat22 * local15;
		this.aFloat23 = this.aFloat23 * local9 + local15 * local24;
		this.aFloat22 = this.aFloat22 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lclient!eh;")
	@Override
	public Class56 method8394() {
		@Pc(7) Class56_Sub1 local7 = new Class56_Sub1();
		local7.aFloat15 = this.aFloat15;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat22 = this.aFloat22;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat25 = this.aFloat25;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat23 = this.aFloat23;
		local7.aFloat24 = this.aFloat24;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat19 = this.aFloat19;
		return local7;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat21;
		@Pc(21) float local21 = this.aFloat17;
		@Pc(24) float local24 = this.aFloat23;
		this.aFloat21 = local18 * local9 - this.aFloat18 * local15;
		@Pc(37) float local37 = this.aFloat22;
		this.aFloat18 = local18 * local15 + this.aFloat18 * local9;
		this.aFloat17 = local21 * local9 - this.aFloat26 * local15;
		this.aFloat26 = local15 * local21 + local9 * this.aFloat26;
		this.aFloat23 = local9 * local24 - this.aFloat24 * local15;
		this.aFloat24 = local24 * local15 + this.aFloat24 * local9;
		this.aFloat22 = local37 * local9 - local15 * this.aFloat20;
		this.aFloat20 = local9 * this.aFloat20 + local37 * local15;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat24 * (float) arg2 + this.aFloat18 * (float) arg0 + (float) arg1 * this.aFloat26 + this.aFloat20);
		arg3[0] = (int) (this.aFloat16 + (float) arg0 * this.aFloat25 + this.aFloat15 * (float) arg1 + this.aFloat19 * (float) arg2);
		arg3[1] = (int) (this.aFloat21 * (float) arg0 + this.aFloat17 * (float) arg1 + (float) arg2 * this.aFloat23 + this.aFloat22);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method8393(@OriginalArg(0) Class56 arg0) {
		@Pc(6) Class56_Sub1 local6 = (Class56_Sub1) arg0;
		this.aFloat16 = local6.aFloat16;
		this.aFloat17 = local6.aFloat17;
		this.aFloat23 = local6.aFloat23;
		this.aFloat21 = local6.aFloat21;
		this.aFloat24 = local6.aFloat24;
		this.aFloat15 = local6.aFloat15;
		this.aFloat26 = local6.aFloat26;
		this.aFloat25 = local6.aFloat25;
		this.aFloat18 = local6.aFloat18;
		this.aFloat20 = local6.aFloat20;
		this.aFloat19 = local6.aFloat19;
		this.aFloat22 = local6.aFloat22;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)V")
	@Override
	public void method8395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat22 = (float) arg1;
		this.aFloat16 = (float) arg0;
		this.aFloat20 = (float) arg2;
		this.aFloat21 = this.aFloat18 = this.aFloat15 = this.aFloat26 = this.aFloat19 = this.aFloat23 = 0.0F;
		this.aFloat25 = this.aFloat17 = this.aFloat24 = 1.0F;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class104.aFloatArray7[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class104.aFloatArray8[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class104.aFloatArray7[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class104.aFloatArray8[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class104.aFloatArray7[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class104.aFloatArray8[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat23 = local39 * local27 + local21 * local43;
		this.aFloat26 = -local15;
		this.aFloat15 = local9 * local39;
		this.aFloat24 = local21 * local9;
		this.aFloat19 = -local27 * local33 + local47 * local21;
		this.aFloat18 = local9 * local27;
		this.aFloat21 = local39 * -local21 + local43 * local27;
		this.aFloat17 = local33 * local9;
		this.aFloat25 = local27 * local47 + local21 * local33;
		this.aFloat20 = -((float) arg2 * this.aFloat24) + (float) -arg0 * this.aFloat18 - (float) arg1 * this.aFloat26;
		this.aFloat16 = -((float) arg2 * this.aFloat19) + (float) -arg0 * this.aFloat25 - (float) arg1 * this.aFloat15;
		this.aFloat22 = -(this.aFloat23 * (float) arg2) + this.aFloat21 * (float) -arg0 - (float) arg1 * this.aFloat17;
	}
}
