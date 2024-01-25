import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class115_Sub2 extends Class115 {

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class115_Sub2() {
		this.method6281();
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	@Override
	public void method6297(@OriginalArg(0) int arg0) {
		this.aFloat116 = 1.0F;
		this.aFloat105 = this.aFloat111 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat114 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat115 = this.aFloat107 = this.aFloat113 = this.aFloat109 = this.aFloat108 = this.aFloat110 = this.aFloat106 = 0.0F;
		this.aFloat112 = -this.aFloat114;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()V")
	@Override
	public void method6281() {
		this.aFloat116 = this.aFloat105 = this.aFloat111 = 1.0F;
		this.aFloat109 = this.aFloat110 = this.aFloat115 = this.aFloat114 = this.aFloat107 = this.aFloat112 = this.aFloat113 = this.aFloat108 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat113);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat108);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat106);
		arg3[0] = (int) (this.aFloat110 * (float) local24 + (float) local6 * this.aFloat116 + this.aFloat109 * (float) local13);
		arg3[2] = (int) (this.aFloat112 * (float) local13 + this.aFloat107 * (float) local6 + (float) local24 * this.aFloat111);
		arg3[1] = (int) (this.aFloat114 * (float) local24 + this.aFloat105 * (float) local13 + this.aFloat115 * (float) local6);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	@Override
	public void method6290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat113 = (float) arg0;
		this.aFloat116 = this.aFloat105 = this.aFloat111 = 1.0F;
		this.aFloat108 = (float) arg1;
		this.aFloat106 = (float) arg2;
		this.aFloat109 = this.aFloat110 = this.aFloat115 = this.aFloat114 = this.aFloat107 = this.aFloat112 = 0.0F;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub5.aFloatArray30[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub5.aFloatArray29[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub5.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub5.aFloatArray29[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat115 = local9 * local39;
		this.aFloat109 = local39 * -local21 + local43 * local27;
		this.aFloat105 = local9 * local33;
		this.aFloat114 = -local15;
		this.aFloat112 = local21 * local43 + local39 * local27;
		this.aFloat110 = local9 * local27;
		this.aFloat116 = local27 * local47 + local33 * local21;
		this.aFloat107 = local47 * local21 + local33 * -local27;
		this.aFloat111 = local9 * local21;
		this.aFloat108 = -(this.aFloat105 * (float) arg1) + this.aFloat109 * (float) -arg0 - this.aFloat112 * (float) arg2;
		this.aFloat106 = -((float) arg1 * this.aFloat114) + (float) -arg0 * this.aFloat110 - (float) arg2 * this.aFloat111;
		this.aFloat113 = this.aFloat116 * (float) -arg0 - (float) arg1 * this.aFloat115 - (float) arg2 * this.aFloat107;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	@Override
	public void method6291(@OriginalArg(0) int arg0) {
		this.aFloat105 = 1.0F;
		this.aFloat116 = this.aFloat111 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat107 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat115 = this.aFloat113 = this.aFloat109 = this.aFloat112 = this.aFloat108 = this.aFloat114 = this.aFloat106 = 0.0F;
		this.aFloat110 = -this.aFloat107;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([I)V")
	@Override
	public void method6298(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat113;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat108;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat106;
		arg0[0] = (int) (local21 * this.aFloat109 + local12 * this.aFloat116 + local29 * this.aFloat110);
		arg0[2] = (int) (this.aFloat111 * local29 + local12 * this.aFloat107 + this.aFloat112 * local21);
		arg0[1] = (int) (this.aFloat105 * local21 + this.aFloat115 * local12 + this.aFloat114 * local29);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	@Override
	public void method6287(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat116;
		@Pc(21) float local21 = this.aFloat115;
		@Pc(24) float local24 = this.aFloat107;
		@Pc(27) float local27 = this.aFloat113;
		this.aFloat116 = local15 * this.aFloat110 + local18 * local9;
		this.aFloat115 = this.aFloat114 * local15 + local9 * local21;
		this.aFloat110 = local9 * this.aFloat110 - local15 * local18;
		this.aFloat114 = local9 * this.aFloat114 - local21 * local15;
		this.aFloat107 = local15 * this.aFloat111 + local24 * local9;
		this.aFloat111 = this.aFloat111 * local9 - local15 * local24;
		this.aFloat113 = local27 * local9 + this.aFloat106 * local15;
		this.aFloat106 = this.aFloat106 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	@Override
	public void method6294(@OriginalArg(0) int arg0) {
		this.aFloat111 = 1.0F;
		this.aFloat116 = this.aFloat105 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat109 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat107 = this.aFloat113 = this.aFloat112 = this.aFloat108 = this.aFloat110 = this.aFloat114 = this.aFloat106 = 0.0F;
		this.aFloat115 = -this.aFloat109;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!hba;)V")
	@Override
	public void method6282(@OriginalArg(0) Class115 arg0) {
		@Pc(6) Class115_Sub2 local6 = (Class115_Sub2) arg0;
		this.aFloat112 = local6.aFloat112;
		this.aFloat111 = local6.aFloat111;
		this.aFloat106 = local6.aFloat106;
		this.aFloat105 = local6.aFloat105;
		this.aFloat108 = local6.aFloat108;
		this.aFloat116 = local6.aFloat116;
		this.aFloat110 = local6.aFloat110;
		this.aFloat107 = local6.aFloat107;
		this.aFloat115 = local6.aFloat115;
		this.aFloat109 = local6.aFloat109;
		this.aFloat114 = local6.aFloat114;
		this.aFloat113 = local6.aFloat113;
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	@Override
	public void method6295(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat109;
		@Pc(21) float local21 = this.aFloat105;
		@Pc(24) float local24 = this.aFloat112;
		this.aFloat109 = local9 * local18 - local15 * this.aFloat110;
		@Pc(38) float local38 = this.aFloat108;
		this.aFloat105 = local21 * local9 - this.aFloat114 * local15;
		this.aFloat110 = local9 * this.aFloat110 + local18 * local15;
		this.aFloat114 = local21 * local15 + local9 * this.aFloat114;
		this.aFloat112 = local24 * local9 - this.aFloat111 * local15;
		this.aFloat108 = local9 * local38 - local15 * this.aFloat106;
		this.aFloat111 = local24 * local15 + local9 * this.aFloat111;
		this.aFloat106 = local9 * this.aFloat106 + local15 * local38;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "()Lclient!hba;")
	@Override
	public Class115 method6292() {
		@Pc(7) Class115_Sub2 local7 = new Class115_Sub2();
		local7.aFloat107 = this.aFloat107;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat114 = this.aFloat114;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat105 = this.aFloat105;
		return local7;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat114 * (float) arg1 + this.aFloat110 * (float) arg0 + (float) arg2 * this.aFloat111);
		arg3[1] = (int) ((float) arg2 * this.aFloat112 + this.aFloat105 * (float) arg1 + (float) arg0 * this.aFloat109);
		arg3[0] = (int) ((float) arg2 * this.aFloat107 + (float) arg0 * this.aFloat116 + this.aFloat115 * (float) arg1);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)V")
	@Override
	public void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat113 += (float) arg0;
		this.aFloat108 += (float) arg1;
		this.aFloat106 += (float) arg2;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public void method6280(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub5.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub5.aFloatArray29[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat116;
		@Pc(21) float local21 = this.aFloat115;
		@Pc(24) float local24 = this.aFloat107;
		this.aFloat116 = local18 * local9 - local15 * this.aFloat109;
		@Pc(37) float local37 = this.aFloat113;
		this.aFloat115 = local21 * local9 - this.aFloat105 * local15;
		this.aFloat109 = local15 * local18 + local9 * this.aFloat109;
		this.aFloat107 = local24 * local9 - local15 * this.aFloat112;
		this.aFloat105 = this.aFloat105 * local9 + local15 * local21;
		this.aFloat113 = local37 * local9 - this.aFloat108 * local15;
		this.aFloat112 = this.aFloat112 * local9 + local24 * local15;
		this.aFloat108 = local37 * local15 + local9 * this.aFloat108;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat106 + this.aFloat110 * (float) arg0 + this.aFloat114 * (float) arg1 + this.aFloat111 * (float) arg2);
		arg3[1] = (int) (this.aFloat108 + this.aFloat112 * (float) arg2 + this.aFloat109 * (float) arg0 + this.aFloat105 * (float) arg1);
		arg3[0] = (int) (this.aFloat113 + this.aFloat116 * (float) arg0 + (float) arg1 * this.aFloat115 + (float) arg2 * this.aFloat107);
	}
}
