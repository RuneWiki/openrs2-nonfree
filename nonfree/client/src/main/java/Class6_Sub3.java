import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!qha", name = "j", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!qha", name = "m", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!qha", name = "v", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!qha", name = "w", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!qha", name = "z", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!qha", name = "D", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!qha", name = "J", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!qha", name = "L", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	public Class6_Sub3() {
		this.method6706();
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0) {
		this.aFloat200 = 1.0F;
		this.aFloat199 = this.aFloat198 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat208 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat202 = -this.aFloat208;
		this.aFloat201 = this.aFloat197 = this.aFloat206 = this.aFloat207 = this.aFloat205 = this.aFloat203 = this.aFloat204 = 0.0F;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method6709() {
		@Pc(7) Class6_Sub3 local7 = new Class6_Sub3();
		local7.aFloat202 = this.aFloat202;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat208 = this.aFloat208;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat205 = this.aFloat205;
		local7.aFloat201 = this.aFloat201;
		local7.aFloat207 = this.aFloat207;
		local7.aFloat204 = this.aFloat204;
		local7.aFloat203 = this.aFloat203;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat200 = this.aFloat200;
		return local7;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
	@Override
	public void method6692(@OriginalArg(0) int arg0) {
		this.aFloat199 = 1.0F;
		this.aFloat200 = this.aFloat198 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat197 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat201 = this.aFloat206 = this.aFloat207 = this.aFloat202 = this.aFloat205 = this.aFloat208 = this.aFloat204 = 0.0F;
		this.aFloat203 = -this.aFloat197;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method6695(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class6_Sub3 local6 = (Class6_Sub3) arg0;
		this.aFloat206 = local6.aFloat206;
		this.aFloat199 = local6.aFloat199;
		this.aFloat204 = local6.aFloat204;
		this.aFloat197 = local6.aFloat197;
		this.aFloat208 = local6.aFloat208;
		this.aFloat207 = local6.aFloat207;
		this.aFloat198 = local6.aFloat198;
		this.aFloat202 = local6.aFloat202;
		this.aFloat203 = local6.aFloat203;
		this.aFloat201 = local6.aFloat201;
		this.aFloat205 = local6.aFloat205;
		this.aFloat200 = local6.aFloat200;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat204 + this.aFloat198 * (float) arg2 + (float) arg1 * this.aFloat208 + this.aFloat203 * (float) arg0);
		arg3[1] = (int) (this.aFloat202 * (float) arg2 + this.aFloat199 * (float) arg1 + this.aFloat207 * (float) arg0 + this.aFloat205);
		arg3[0] = (int) (this.aFloat206 + (float) arg2 * this.aFloat197 + (float) arg0 * this.aFloat200 + (float) arg1 * this.aFloat201);
	}

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "(I)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat200;
		@Pc(21) float local21 = this.aFloat201;
		@Pc(24) float local24 = this.aFloat197;
		this.aFloat200 = local18 * local9 - this.aFloat207 * local15;
		@Pc(37) float local37 = this.aFloat206;
		this.aFloat201 = local21 * local9 - this.aFloat199 * local15;
		this.aFloat207 = local18 * local15 + this.aFloat207 * local9;
		this.aFloat197 = local24 * local9 - this.aFloat202 * local15;
		this.aFloat199 = local21 * local15 + local9 * this.aFloat199;
		this.aFloat202 = local15 * local24 + local9 * this.aFloat202;
		this.aFloat206 = local9 * local37 - local15 * this.aFloat205;
		this.aFloat205 = local37 * local15 + local9 * this.aFloat205;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "()V")
	@Override
	public void method6706() {
		this.aFloat207 = this.aFloat203 = this.aFloat201 = this.aFloat208 = this.aFloat197 = this.aFloat202 = this.aFloat206 = this.aFloat205 = this.aFloat204 = 0.0F;
		this.aFloat200 = this.aFloat199 = this.aFloat198 = 1.0F;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub18.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub18.aFloatArray13[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub18.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub18.aFloatArray13[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat201 = local9 * local39;
		this.aFloat198 = local9 * local21;
		this.aFloat208 = -local15;
		this.aFloat202 = local27 * local39 + local21 * local43;
		this.aFloat199 = local9 * local33;
		this.aFloat197 = local33 * -local27 + local21 * local47;
		this.aFloat207 = -local21 * local39 + local43 * local27;
		this.aFloat203 = local27 * local9;
		this.aFloat200 = local47 * local27 + local33 * local21;
		this.aFloat206 = this.aFloat200 * (float) -arg0 - (float) arg1 * this.aFloat201 - (float) arg2 * this.aFloat197;
		this.aFloat205 = (float) -arg0 * this.aFloat207 - (float) arg1 * this.aFloat199 - this.aFloat202 * (float) arg2;
		this.aFloat204 = -(this.aFloat198 * (float) arg2) - (float) arg1 * this.aFloat208 + (float) -arg0 * this.aFloat203;
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat206);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat205);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat204);
		arg3[0] = (int) ((float) local20 * this.aFloat203 + this.aFloat207 * (float) local13 + (float) local6 * this.aFloat200);
		arg3[2] = (int) ((float) local20 * this.aFloat198 + (float) local13 * this.aFloat202 + this.aFloat197 * (float) local6);
		arg3[1] = (int) (this.aFloat201 * (float) local6 + this.aFloat199 * (float) local13 + (float) local20 * this.aFloat208);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([I)V")
	@Override
	public void method6712(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat206;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat205;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat204;
		arg0[1] = (int) (local20 * this.aFloat199 + local11 * this.aFloat201 + this.aFloat208 * local28);
		arg0[0] = (int) (local20 * this.aFloat207 + this.aFloat200 * local11 + this.aFloat203 * local28);
		arg0[2] = (int) (local11 * this.aFloat197 + this.aFloat202 * local20 + this.aFloat198 * local28);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat202 + this.aFloat207 * (float) arg0 + this.aFloat199 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat197 + this.aFloat200 * (float) arg0 + (float) arg1 * this.aFloat201);
		arg3[2] = (int) ((float) arg0 * this.aFloat203 + this.aFloat208 * (float) arg1 + this.aFloat198 * (float) arg2);
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat200;
		@Pc(21) float local21 = this.aFloat201;
		@Pc(24) float local24 = this.aFloat197;
		@Pc(27) float local27 = this.aFloat206;
		this.aFloat200 = this.aFloat203 * local15 + local9 * local18;
		this.aFloat203 = local9 * this.aFloat203 - local18 * local15;
		this.aFloat201 = this.aFloat208 * local15 + local21 * local9;
		this.aFloat208 = local9 * this.aFloat208 - local15 * local21;
		this.aFloat197 = local24 * local9 + this.aFloat198 * local15;
		this.aFloat206 = local27 * local9 + local15 * this.aFloat204;
		this.aFloat198 = local9 * this.aFloat198 - local24 * local15;
		this.aFloat204 = this.aFloat204 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat207;
		@Pc(21) float local21 = this.aFloat199;
		@Pc(24) float local24 = this.aFloat202;
		this.aFloat207 = local9 * local18 - this.aFloat203 * local15;
		@Pc(37) float local37 = this.aFloat205;
		this.aFloat203 = local18 * local15 + local9 * this.aFloat203;
		this.aFloat199 = local9 * local21 - this.aFloat208 * local15;
		this.aFloat208 = local15 * local21 + this.aFloat208 * local9;
		this.aFloat202 = local9 * local24 - local15 * this.aFloat198;
		this.aFloat198 = local24 * local15 + local9 * this.aFloat198;
		this.aFloat205 = local9 * local37 - local15 * this.aFloat204;
		this.aFloat204 = this.aFloat204 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat204 += arg2;
		this.aFloat205 += arg1;
		this.aFloat206 += arg0;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(III)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat207 = this.aFloat203 = this.aFloat201 = this.aFloat208 = this.aFloat197 = this.aFloat202 = 0.0F;
		this.aFloat204 = arg2;
		this.aFloat206 = arg0;
		this.aFloat205 = arg1;
		this.aFloat200 = this.aFloat199 = this.aFloat198 = 1.0F;
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat198 = 1.0F;
		this.aFloat200 = this.aFloat199 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat207 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat197 = this.aFloat206 = this.aFloat202 = this.aFloat205 = this.aFloat203 = this.aFloat208 = this.aFloat204 = 0.0F;
		this.aFloat201 = -this.aFloat207;
	}
}
