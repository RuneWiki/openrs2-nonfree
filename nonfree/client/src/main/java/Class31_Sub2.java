import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class31_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIFFII)V")
	public void method4799(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat94 = arg4;
			this.aFloat93 = this.aFloat86 = this.aFloat85 = this.aFloat95 = this.aFloat91 = this.aFloat89 = 0.0F;
			this.aFloat84 = arg1;
			this.aFloat88 = 1.0F;
		} else {
			@Pc(15) float local15 = Class147.aFloatArray13[arg5 & 0x3FFF];
			@Pc(21) float local21 = Class147.aFloatArray14[arg5 & 0x3FFF];
			this.aFloat88 = 1.0F;
			this.aFloat93 = (float) arg1 * local21;
			this.aFloat94 = (float) arg4 * local15;
			this.aFloat84 = (float) arg1 * local15;
			this.aFloat85 = (float) arg4 * -local21;
			this.aFloat86 = this.aFloat95 = this.aFloat91 = this.aFloat89 = 0.0F;
		}
		this.aFloat90 = arg0;
		this.aFloat87 = arg3;
		this.aFloat92 = arg2;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)[F")
	public float[] method4800() {
		Static200.aFloatArray9[13] = 0.0F;
		Static200.aFloatArray9[0] = this.aFloat84;
		Static200.aFloatArray9[14] = 0.0F;
		Static200.aFloatArray9[6] = this.aFloat95;
		Static200.aFloatArray9[5] = this.aFloat94;
		Static200.aFloatArray9[4] = this.aFloat85;
		Static200.aFloatArray9[10] = this.aFloat88;
		Static200.aFloatArray9[1] = this.aFloat93;
		Static200.aFloatArray9[12] = 0.0F;
		Static200.aFloatArray9[9] = this.aFloat89;
		Static200.aFloatArray9[8] = this.aFloat91;
		Static200.aFloatArray9[2] = this.aFloat86;
		return Static200.aFloatArray9;
	}

	@OriginalMember(owner = "client!sh", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat90;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat87;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat92;
		arg0[0] = (int) (local29 * this.aFloat86 + local12 * this.aFloat84 + this.aFloat93 * local20);
		arg0[1] = (int) (this.aFloat85 * local12 + local20 * this.aFloat94 + local29 * this.aFloat95);
		arg0[2] = (int) (this.aFloat89 * local20 + local12 * this.aFloat91 + this.aFloat88 * local29);
	}

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat88 * (float) arg2 + (float) arg0 * this.aFloat86 + (float) arg1 * this.aFloat95);
		arg3[1] = (int) (this.aFloat89 * (float) arg2 + (float) arg0 * this.aFloat93 + (float) arg1 * this.aFloat94);
		arg3[0] = (int) ((float) arg2 * this.aFloat91 + (float) arg1 * this.aFloat85 + this.aFloat84 * (float) arg0);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)[F")
	public float[] method4801() {
		Static200.aFloatArray9[5] = this.aFloat94;
		Static200.aFloatArray9[8] = this.aFloat91;
		Static200.aFloatArray9[6] = this.aFloat95;
		Static200.aFloatArray9[10] = this.aFloat88;
		Static200.aFloatArray9[13] = this.aFloat87;
		Static200.aFloatArray9[1] = this.aFloat93;
		Static200.aFloatArray9[2] = this.aFloat86;
		Static200.aFloatArray9[0] = this.aFloat84;
		Static200.aFloatArray9[9] = this.aFloat89;
		Static200.aFloatArray9[12] = this.aFloat90;
		Static200.aFloatArray9[14] = this.aFloat92;
		Static200.aFloatArray9[4] = this.aFloat85;
		return Static200.aFloatArray9;
	}

	@OriginalMember(owner = "client!sh", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class147.aFloatArray13[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class147.aFloatArray14[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat93;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat89;
		@Pc(27) float local27 = this.aFloat87;
		this.aFloat93 = local18 * local9 - local15 * this.aFloat86;
		this.aFloat94 = local9 * local21 - this.aFloat95 * local15;
		this.aFloat86 = local15 * local18 + local9 * this.aFloat86;
		this.aFloat95 = local21 * local15 + this.aFloat95 * local9;
		this.aFloat89 = local9 * local24 - this.aFloat88 * local15;
		this.aFloat87 = local9 * local27 - local15 * this.aFloat92;
		this.aFloat88 = local15 * local24 + this.aFloat88 * local9;
		this.aFloat92 = local9 * this.aFloat92 + local15 * local27;
	}

	@OriginalMember(owner = "client!sh", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat94 = 1.0F;
		this.aFloat84 = this.aFloat88 = Class147.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat91 = Class147.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat86 = -this.aFloat91;
		this.aFloat85 = this.aFloat90 = this.aFloat93 = this.aFloat89 = this.aFloat87 = this.aFloat95 = this.aFloat92 = 0.0F;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLclient!c;)V")
	public void method4804(@OriginalArg(1) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		this.aFloat85 = local6.aFloat93;
		this.aFloat91 = local6.aFloat86;
		this.aFloat84 = local6.aFloat84;
		this.aFloat93 = local6.aFloat85;
		this.aFloat89 = local6.aFloat95;
		this.aFloat94 = local6.aFloat94;
		this.aFloat86 = local6.aFloat91;
		this.aFloat90 = -(local6.aFloat92 * this.aFloat91 + this.aFloat85 * local6.aFloat87 + local6.aFloat90 * this.aFloat84);
		this.aFloat95 = local6.aFloat89;
		this.aFloat88 = local6.aFloat88;
		this.aFloat87 = -(this.aFloat93 * local6.aFloat90 + local6.aFloat87 * this.aFloat94 + local6.aFloat92 * this.aFloat89);
		this.aFloat92 = -(this.aFloat95 * local6.aFloat87 + this.aFloat86 * local6.aFloat90 + this.aFloat88 * local6.aFloat92);
	}

	@OriginalMember(owner = "client!sh", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class147.aFloatArray13[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class147.aFloatArray14[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class147.aFloatArray13[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class147.aFloatArray14[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class147.aFloatArray13[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class147.aFloatArray14[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat89 = local43 * local21 + local27 * local39;
		this.aFloat88 = local21 * local9;
		this.aFloat84 = local47 * local27 + local21 * local33;
		this.aFloat85 = local39 * local9;
		this.aFloat94 = local9 * local33;
		this.aFloat95 = -local15;
		this.aFloat93 = -local21 * local39 + local43 * local27;
		this.aFloat86 = local27 * local9;
		this.aFloat91 = local33 * -local27 + local47 * local21;
		this.aFloat87 = -(this.aFloat89 * (float) arg2) + this.aFloat93 * (float) -arg0 - this.aFloat94 * (float) arg1;
		this.aFloat92 = this.aFloat86 * (float) -arg0 - this.aFloat95 * (float) arg1 - this.aFloat88 * (float) arg2;
		this.aFloat90 = -((float) arg2 * this.aFloat91) - (float) arg1 * this.aFloat85 + (float) -arg0 * this.aFloat84;
	}

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat84 = this.aFloat94 = this.aFloat88 = 1.0F;
		this.aFloat93 = this.aFloat86 = this.aFloat85 = this.aFloat95 = this.aFloat91 = this.aFloat89 = this.aFloat90 = this.aFloat87 = this.aFloat92 = 0.0F;
	}

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat84 = 1.0F;
		this.aFloat94 = this.aFloat88 = Class147.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat95 = Class147.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat85 = this.aFloat91 = this.aFloat90 = this.aFloat93 = this.aFloat87 = this.aFloat86 = this.aFloat92 = 0.0F;
		this.aFloat89 = -this.aFloat95;
	}

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat88 = 1.0F;
		this.aFloat84 = this.aFloat94 = Class147.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat93 = Class147.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat91 = this.aFloat90 = this.aFloat89 = this.aFloat87 = this.aFloat86 = this.aFloat95 = this.aFloat92 = 0.0F;
		this.aFloat85 = -this.aFloat93;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat89 * (float) arg2 + (float) arg0 * this.aFloat93 + this.aFloat94 * (float) arg1 + this.aFloat87);
		arg3[0] = (int) (this.aFloat90 + (float) arg1 * this.aFloat85 + this.aFloat84 * (float) arg0 + (float) arg2 * this.aFloat91);
		arg3[2] = (int) (this.aFloat92 + this.aFloat95 * (float) arg1 + this.aFloat86 * (float) arg0 + (float) arg2 * this.aFloat88);
	}

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat90 += arg0;
		this.aFloat87 += arg1;
		this.aFloat92 += arg2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4797() {
		@Pc(7) Class31_Sub2 local7 = new Class31_Sub2();
		local7.aFloat91 = this.aFloat91;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat87 = this.aFloat87;
		return local7;
	}

	@OriginalMember(owner = "client!sh", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class147.aFloatArray13[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class147.aFloatArray14[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat84;
		@Pc(21) float local21 = this.aFloat85;
		@Pc(24) float local24 = this.aFloat91;
		this.aFloat84 = local15 * this.aFloat86 + local9 * local18;
		@Pc(37) float local37 = this.aFloat90;
		this.aFloat85 = local15 * this.aFloat95 + local21 * local9;
		this.aFloat86 = this.aFloat86 * local9 - local18 * local15;
		this.aFloat95 = this.aFloat95 * local9 - local15 * local21;
		this.aFloat91 = this.aFloat88 * local15 + local9 * local24;
		this.aFloat90 = local37 * local9 + this.aFloat92 * local15;
		this.aFloat88 = this.aFloat88 * local9 - local15 * local24;
		this.aFloat92 = local9 * this.aFloat92 - local37 * local15;
	}

	@OriginalMember(owner = "client!sh", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class31 arg0) {
		@Pc(6) Class31_Sub2 local6 = (Class31_Sub2) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat94 = local6.aFloat94;
		this.aFloat95 = local6.aFloat95;
		this.aFloat87 = local6.aFloat87;
		this.aFloat85 = local6.aFloat85;
		this.aFloat92 = local6.aFloat92;
		this.aFloat93 = local6.aFloat93;
		this.aFloat86 = local6.aFloat86;
		this.aFloat89 = local6.aFloat89;
		this.aFloat90 = local6.aFloat90;
		this.aFloat88 = local6.aFloat88;
		this.aFloat91 = local6.aFloat91;
	}

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat92 = arg2;
		this.aFloat90 = arg0;
		this.aFloat87 = arg1;
		this.aFloat84 = this.aFloat94 = this.aFloat88 = 1.0F;
		this.aFloat93 = this.aFloat86 = this.aFloat85 = this.aFloat95 = this.aFloat91 = this.aFloat89 = 0.0F;
	}
}
