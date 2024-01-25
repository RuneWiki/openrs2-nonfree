import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!tc", name = "P", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "F")
	public float aFloat99;

	static {
		new Class209("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class35_Sub2() {
		this.xa();
	}

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat91 += arg2;
		this.aFloat98 += arg1;
		this.aFloat92 += arg0;
	}

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat92;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat98;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat91;
		arg0[2] = (int) (this.aFloat96 * local20 + local12 * this.aFloat97 + this.aFloat94 * local28);
		arg0[0] = (int) (this.aFloat89 * local20 + this.aFloat90 * local12 + local28 * this.aFloat93);
		arg0[1] = (int) (local12 * this.aFloat88 + this.aFloat95 * local20 + local28 * this.aFloat99);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FIIFIIF)V")
	public void method5048(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat94 = 1.0F;
			this.aFloat89 = this.aFloat93 = this.aFloat88 = this.aFloat99 = this.aFloat97 = this.aFloat96 = 0.0F;
			this.aFloat95 = arg4;
			this.aFloat90 = arg3;
		} else {
			@Pc(42) float local42 = Class169.aFloatArray33[arg1 & 0x3FFF];
			@Pc(48) float local48 = Class169.aFloatArray32[arg1 & 0x3FFF];
			this.aFloat90 = local42 * (float) arg3;
			this.aFloat89 = (float) arg3 * local48;
			this.aFloat94 = 1.0F;
			this.aFloat93 = this.aFloat99 = this.aFloat97 = this.aFloat96 = 0.0F;
			this.aFloat95 = (float) arg4 * local42;
			this.aFloat88 = (float) arg4 * -local48;
		}
		this.aFloat92 = arg2;
		this.aFloat98 = arg5;
		this.aFloat91 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat99 + (float) arg0 * this.aFloat93 + (float) arg2 * this.aFloat94);
		arg3[1] = (int) (this.aFloat96 * (float) arg2 + (float) arg0 * this.aFloat89 + (float) arg1 * this.aFloat95);
		arg3[0] = (int) ((float) arg2 * this.aFloat97 + (float) arg0 * this.aFloat90 + (float) arg1 * this.aFloat88);
	}

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.aFloat90 = 1.0F;
		this.aFloat95 = this.aFloat94 = Class169.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat99 = Class169.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat88 = this.aFloat97 = this.aFloat92 = this.aFloat89 = this.aFloat98 = this.aFloat93 = this.aFloat91 = 0.0F;
		this.aFloat96 = -this.aFloat99;
	}

	@OriginalMember(owner = "client!tc", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aFloat90 = this.aFloat95 = this.aFloat94 = 1.0F;
		this.aFloat89 = this.aFloat93 = this.aFloat88 = this.aFloat99 = this.aFloat97 = this.aFloat96 = this.aFloat92 = this.aFloat98 = this.aFloat91 = 0.0F;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat91 + this.aFloat93 * (float) arg0 + this.aFloat99 * (float) arg1 + (float) arg2 * this.aFloat94);
		arg3[0] = (int) (this.aFloat90 * (float) arg0 + this.aFloat88 * (float) arg1 + this.aFloat97 * (float) arg2 + this.aFloat92);
		arg3[1] = (int) ((float) arg1 * this.aFloat95 + (float) arg0 * this.aFloat89 + (float) arg2 * this.aFloat96 + this.aFloat98);
	}

	@OriginalMember(owner = "client!tc", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class35 arg0) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg0;
		this.aFloat93 = local6.aFloat93;
		this.aFloat91 = local6.aFloat91;
		this.aFloat96 = local6.aFloat96;
		this.aFloat97 = local6.aFloat97;
		this.aFloat95 = local6.aFloat95;
		this.aFloat94 = local6.aFloat94;
		this.aFloat98 = local6.aFloat98;
		this.aFloat90 = local6.aFloat90;
		this.aFloat92 = local6.aFloat92;
		this.aFloat89 = local6.aFloat89;
		this.aFloat99 = local6.aFloat99;
		this.aFloat88 = local6.aFloat88;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)[F")
	public float[] method5049() {
		Static23.aFloatArray4[10] = this.aFloat94;
		Static23.aFloatArray4[4] = this.aFloat88;
		Static23.aFloatArray4[2] = this.aFloat93;
		Static23.aFloatArray4[6] = this.aFloat99;
		Static23.aFloatArray4[13] = this.aFloat98;
		Static23.aFloatArray4[9] = this.aFloat96;
		Static23.aFloatArray4[0] = this.aFloat90;
		Static23.aFloatArray4[14] = this.aFloat91;
		Static23.aFloatArray4[5] = this.aFloat95;
		Static23.aFloatArray4[12] = this.aFloat92;
		Static23.aFloatArray4[1] = this.aFloat89;
		Static23.aFloatArray4[8] = this.aFloat97;
		return Static23.aFloatArray4;
	}

	@OriginalMember(owner = "client!tc", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.aFloat94 = 1.0F;
		this.aFloat90 = this.aFloat95 = Class169.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat89 = Class169.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat97 = this.aFloat92 = this.aFloat96 = this.aFloat98 = this.aFloat93 = this.aFloat99 = this.aFloat91 = 0.0F;
		this.aFloat88 = -this.aFloat89;
	}

	@OriginalMember(owner = "client!tc", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class169.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class169.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat89;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat96;
		this.aFloat89 = local9 * local18 - this.aFloat93 * local15;
		@Pc(37) float local37 = this.aFloat98;
		this.aFloat95 = local9 * local21 - this.aFloat99 * local15;
		this.aFloat93 = this.aFloat93 * local9 + local18 * local15;
		this.aFloat96 = local24 * local9 - local15 * this.aFloat94;
		this.aFloat99 = local21 * local15 + local9 * this.aFloat99;
		this.aFloat94 = this.aFloat94 * local9 + local15 * local24;
		this.aFloat98 = local37 * local9 - this.aFloat91 * local15;
		this.aFloat91 = this.aFloat91 * local9 + local37 * local15;
	}

	@OriginalMember(owner = "client!tc", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class169.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class169.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat90;
		@Pc(21) float local21 = this.aFloat88;
		@Pc(24) float local24 = this.aFloat97;
		@Pc(27) float local27 = this.aFloat92;
		this.aFloat90 = local9 * local18 + this.aFloat93 * local15;
		this.aFloat93 = this.aFloat93 * local9 - local15 * local18;
		this.aFloat88 = local21 * local9 + this.aFloat99 * local15;
		this.aFloat99 = this.aFloat99 * local9 - local15 * local21;
		this.aFloat97 = local24 * local9 + this.aFloat94 * local15;
		this.aFloat92 = this.aFloat91 * local15 + local27 * local9;
		this.aFloat94 = local9 * this.aFloat94 - local15 * local24;
		this.aFloat91 = this.aFloat91 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class169.aFloatArray33[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class169.aFloatArray32[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class169.aFloatArray33[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class169.aFloatArray32[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class169.aFloatArray33[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class169.aFloatArray32[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat90 = local33 * local21 + local27 * local47;
		this.aFloat95 = local9 * local33;
		this.aFloat94 = local9 * local21;
		this.aFloat96 = local43 * local21 + local27 * local39;
		this.aFloat93 = local27 * local9;
		this.aFloat89 = local39 * -local21 + local27 * local43;
		this.aFloat97 = local33 * -local27 + local21 * local47;
		this.aFloat99 = -local15;
		this.aFloat88 = local9 * local39;
		this.aFloat92 = -(this.aFloat97 * (float) arg2) - this.aFloat88 * (float) arg1 + (float) -arg0 * this.aFloat90;
		this.aFloat91 = (float) -arg0 * this.aFloat93 - this.aFloat99 * (float) arg1 - this.aFloat94 * (float) arg2;
		this.aFloat98 = -(this.aFloat96 * (float) arg2) - (float) arg1 * this.aFloat95 + (float) -arg0 * this.aFloat89;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!c;)V")
	public void method5052(@OriginalArg(1) Class35 arg0) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg0;
		this.aFloat90 = local6.aFloat90;
		this.aFloat97 = local6.aFloat93;
		this.aFloat88 = local6.aFloat89;
		this.aFloat93 = local6.aFloat97;
		this.aFloat96 = local6.aFloat99;
		this.aFloat89 = local6.aFloat88;
		this.aFloat95 = local6.aFloat95;
		this.aFloat92 = -(local6.aFloat92 * this.aFloat90 + this.aFloat88 * local6.aFloat98 + this.aFloat97 * local6.aFloat91);
		this.aFloat94 = local6.aFloat94;
		this.aFloat99 = local6.aFloat96;
		this.aFloat98 = -(this.aFloat96 * local6.aFloat91 + this.aFloat95 * local6.aFloat98 + local6.aFloat92 * this.aFloat89);
		this.aFloat91 = -(local6.aFloat91 * this.aFloat94 + this.aFloat93 * local6.aFloat92 + local6.aFloat98 * this.aFloat99);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)[F")
	public float[] method5053() {
		Static23.aFloatArray4[9] = this.aFloat96;
		Static23.aFloatArray4[4] = this.aFloat88;
		Static23.aFloatArray4[5] = this.aFloat95;
		Static23.aFloatArray4[12] = 0.0F;
		Static23.aFloatArray4[1] = this.aFloat89;
		Static23.aFloatArray4[0] = this.aFloat90;
		Static23.aFloatArray4[2] = this.aFloat93;
		Static23.aFloatArray4[10] = this.aFloat94;
		Static23.aFloatArray4[14] = 0.0F;
		Static23.aFloatArray4[6] = this.aFloat99;
		Static23.aFloatArray4[8] = this.aFloat97;
		Static23.aFloatArray4[13] = 0.0F;
		return Static23.aFloatArray4;
	}

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat91 = arg2;
		this.aFloat90 = this.aFloat95 = this.aFloat94 = 1.0F;
		this.aFloat98 = arg1;
		this.aFloat89 = this.aFloat93 = this.aFloat88 = this.aFloat99 = this.aFloat97 = this.aFloat96 = 0.0F;
		this.aFloat92 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat95 = 1.0F;
		this.aFloat90 = this.aFloat94 = Class169.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat97 = Class169.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat93 = -this.aFloat97;
		this.aFloat88 = this.aFloat92 = this.aFloat89 = this.aFloat96 = this.aFloat98 = this.aFloat99 = this.aFloat91 = 0.0F;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5043() {
		@Pc(7) Class35_Sub2 local7 = new Class35_Sub2();
		local7.aFloat88 = this.aFloat88;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat98 = this.aFloat98;
		return local7;
	}
}
