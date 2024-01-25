import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class207_Sub2 extends Class207 {

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!oda", name = "o", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!oda", name = "p", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!oda", name = "s", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!oda", name = "t", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!oda", name = "D", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!oda", name = "E", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class207_Sub2() {
		this.method8204();
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(III)V")
	@Override
	public void method8212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat111 = (float) arg1;
		this.aFloat105 = (float) arg0;
		this.aFloat107 = (float) arg2;
		this.aFloat108 = this.aFloat100 = this.aFloat104 = this.aFloat103 = this.aFloat101 = this.aFloat109 = 0.0F;
		this.aFloat106 = this.aFloat110 = this.aFloat102 = 1.0F;
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
	@Override
	public void method8207(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat106;
		@Pc(21) float local21 = this.aFloat104;
		@Pc(24) float local24 = this.aFloat101;
		this.aFloat106 = local18 * local9 - local15 * this.aFloat108;
		@Pc(38) float local38 = this.aFloat105;
		this.aFloat108 = local9 * this.aFloat108 + local18 * local15;
		this.aFloat104 = local21 * local9 - local15 * this.aFloat110;
		this.aFloat110 = local15 * local21 + this.aFloat110 * local9;
		this.aFloat101 = local9 * local24 - local15 * this.aFloat109;
		this.aFloat109 = local24 * local15 + this.aFloat109 * local9;
		this.aFloat105 = local38 * local9 - local15 * this.aFloat111;
		this.aFloat111 = this.aFloat111 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8211(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub2 local6 = (Class207_Sub2) arg0;
		this.aFloat108 = local6.aFloat108;
		this.aFloat111 = local6.aFloat111;
		this.aFloat109 = local6.aFloat109;
		this.aFloat100 = local6.aFloat100;
		this.aFloat102 = local6.aFloat102;
		this.aFloat104 = local6.aFloat104;
		this.aFloat106 = local6.aFloat106;
		this.aFloat101 = local6.aFloat101;
		this.aFloat107 = local6.aFloat107;
		this.aFloat103 = local6.aFloat103;
		this.aFloat105 = local6.aFloat105;
		this.aFloat110 = local6.aFloat110;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat102 * (float) arg2 + (float) arg0 * this.aFloat100 + (float) arg1 * this.aFloat103 + this.aFloat107);
		arg3[0] = (int) (this.aFloat105 + this.aFloat104 * (float) arg1 + this.aFloat106 * (float) arg0 + (float) arg2 * this.aFloat101);
		arg3[1] = (int) ((float) arg2 * this.aFloat109 + (float) arg0 * this.aFloat108 + (float) arg1 * this.aFloat110 + this.aFloat111);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method8199() {
		@Pc(7) Class207_Sub2 local7 = new Class207_Sub2();
		local7.aFloat106 = this.aFloat106;
		local7.aFloat105 = this.aFloat105;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat111 = this.aFloat111;
		return local7;
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0) {
		this.aFloat102 = 1.0F;
		this.aFloat106 = this.aFloat110 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat108 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat101 = this.aFloat105 = this.aFloat109 = this.aFloat111 = this.aFloat100 = this.aFloat103 = this.aFloat107 = 0.0F;
		this.aFloat104 = -this.aFloat108;
	}

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)V")
	@Override
	public void method8214(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat108;
		@Pc(21) float local21 = this.aFloat110;
		@Pc(24) float local24 = this.aFloat109;
		@Pc(27) float local27 = this.aFloat111;
		this.aFloat108 = local18 * local9 - local15 * this.aFloat100;
		this.aFloat110 = local9 * local21 - local15 * this.aFloat103;
		this.aFloat100 = local9 * this.aFloat100 + local18 * local15;
		this.aFloat109 = local9 * local24 - this.aFloat102 * local15;
		this.aFloat103 = local9 * this.aFloat103 + local15 * local21;
		this.aFloat111 = local9 * local27 - local15 * this.aFloat107;
		this.aFloat102 = local9 * this.aFloat102 + local15 * local24;
		this.aFloat107 = local9 * this.aFloat107 + local27 * local15;
	}

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)V")
	@Override
	public void method8213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat106;
		@Pc(21) float local21 = this.aFloat104;
		@Pc(24) float local24 = this.aFloat101;
		@Pc(27) float local27 = this.aFloat105;
		this.aFloat106 = local18 * local9 + this.aFloat100 * local15;
		this.aFloat100 = local9 * this.aFloat100 - local15 * local18;
		this.aFloat104 = local9 * local21 + this.aFloat103 * local15;
		this.aFloat103 = local9 * this.aFloat103 - local15 * local21;
		this.aFloat101 = local9 * local24 + this.aFloat102 * local15;
		this.aFloat102 = this.aFloat102 * local9 - local15 * local24;
		this.aFloat105 = local27 * local9 + local15 * this.aFloat107;
		this.aFloat107 = local9 * this.aFloat107 - local27 * local15;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "()V")
	@Override
	public void method8204() {
		this.aFloat108 = this.aFloat100 = this.aFloat104 = this.aFloat103 = this.aFloat101 = this.aFloat109 = this.aFloat105 = this.aFloat111 = this.aFloat107 = 0.0F;
		this.aFloat106 = this.aFloat110 = this.aFloat102 = 1.0F;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V")
	@Override
	public void method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat111 += (float) arg1;
		this.aFloat105 += (float) arg0;
		this.aFloat107 += (float) arg2;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([I)V")
	@Override
	public void method8196(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat105;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat111;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat107;
		arg0[0] = (int) (local29 * this.aFloat100 + this.aFloat106 * local11 + local20 * this.aFloat108);
		arg0[2] = (int) (local29 * this.aFloat102 + this.aFloat109 * local20 + local11 * this.aFloat101);
		arg0[1] = (int) (local29 * this.aFloat103 + local20 * this.aFloat110 + local11 * this.aFloat104);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0) {
		this.aFloat110 = 1.0F;
		this.aFloat106 = this.aFloat102 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat101 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat104 = this.aFloat105 = this.aFloat108 = this.aFloat109 = this.aFloat111 = this.aFloat103 = this.aFloat107 = 0.0F;
		this.aFloat100 = -this.aFloat101;
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat107);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat105);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat111);
		arg3[2] = (int) ((float) local24 * this.aFloat109 + this.aFloat101 * (float) local13 + this.aFloat102 * (float) local6);
		arg3[0] = (int) (this.aFloat100 * (float) local6 + (float) local24 * this.aFloat108 + this.aFloat106 * (float) local13);
		arg3[1] = (int) ((float) local24 * this.aFloat110 + (float) local13 * this.aFloat104 + this.aFloat103 * (float) local6);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat110 + this.aFloat108 * (float) arg0 + this.aFloat109 * (float) arg2);
		arg3[0] = (int) (this.aFloat104 * (float) arg1 + this.aFloat106 * (float) arg0 + (float) arg2 * this.aFloat101);
		arg3[2] = (int) ((float) arg0 * this.aFloat100 + this.aFloat103 * (float) arg1 + (float) arg2 * this.aFloat102);
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
	@Override
	public void method8202(@OriginalArg(0) int arg0) {
		this.aFloat106 = 1.0F;
		this.aFloat110 = this.aFloat102 = Class2_Sub9.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat103 = Class2_Sub9.aFloatArray57[arg0 & 0x3FFF];
		this.aFloat109 = -this.aFloat103;
		this.aFloat104 = this.aFloat101 = this.aFloat105 = this.aFloat108 = this.aFloat111 = this.aFloat100 = this.aFloat107 = 0.0F;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub9.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub9.aFloatArray57[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub9.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub9.aFloatArray57[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub9.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub9.aFloatArray57[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat110 = local9 * local33;
		this.aFloat108 = local39 * -local21 + local27 * local43;
		this.aFloat109 = local39 * local27 + local43 * local21;
		this.aFloat101 = local33 * -local27 + local21 * local47;
		this.aFloat104 = local9 * local39;
		this.aFloat106 = local47 * local27 + local21 * local33;
		this.aFloat102 = local9 * local21;
		this.aFloat103 = -local15;
		this.aFloat100 = local27 * local9;
		this.aFloat105 = -((float) arg2 * this.aFloat101) - this.aFloat104 * (float) arg1 + (float) -arg0 * this.aFloat106;
		this.aFloat107 = this.aFloat100 * (float) -arg0 - (float) arg1 * this.aFloat103 - (float) arg2 * this.aFloat102;
		this.aFloat111 = -(this.aFloat109 * (float) arg2) - this.aFloat110 * (float) arg1 + (float) -arg0 * this.aFloat108;
	}
}
