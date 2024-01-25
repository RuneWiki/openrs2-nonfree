import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class30_Sub1() {
		this.method4665();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
	@Override
	public void method4665() {
		this.aFloat111 = this.aFloat113 = this.aFloat108 = 1.0F;
		this.aFloat106 = this.aFloat107 = this.aFloat112 = this.aFloat114 = this.aFloat110 = this.aFloat109 = this.aFloat117 = this.aFloat116 = this.aFloat115 = 0.0F;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)V")
	@Override
	public void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat116 = arg1;
		this.aFloat106 = this.aFloat107 = this.aFloat112 = this.aFloat114 = this.aFloat110 = this.aFloat109 = 0.0F;
		this.aFloat111 = this.aFloat113 = this.aFloat108 = 1.0F;
		this.aFloat117 = arg0;
		this.aFloat115 = arg2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub12.aFloatArray53[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub12.aFloatArray52[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub12.aFloatArray53[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub12.aFloatArray52[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat109 = local39 * local27 + local21 * local43;
		this.aFloat110 = local33 * -local27 + local47 * local21;
		this.aFloat114 = -local15;
		this.aFloat113 = local9 * local33;
		this.aFloat108 = local21 * local9;
		this.aFloat107 = local9 * local27;
		this.aFloat106 = local43 * local27 + -local21 * local39;
		this.aFloat112 = local9 * local39;
		this.aFloat111 = local47 * local27 + local33 * local21;
		this.aFloat115 = -((float) arg2 * this.aFloat108) - (float) arg1 * this.aFloat114 + (float) -arg0 * this.aFloat107;
		this.aFloat117 = this.aFloat111 * (float) -arg0 - (float) arg1 * this.aFloat112 - this.aFloat110 * (float) arg2;
		this.aFloat116 = -(this.aFloat109 * (float) arg2) + this.aFloat106 * (float) -arg0 - (float) arg1 * this.aFloat113;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method4653(@OriginalArg(0) Class30 arg0) {
		@Pc(6) Class30_Sub1 local6 = (Class30_Sub1) arg0;
		this.aFloat110 = local6.aFloat110;
		this.aFloat115 = local6.aFloat115;
		this.aFloat106 = local6.aFloat106;
		this.aFloat108 = local6.aFloat108;
		this.aFloat109 = local6.aFloat109;
		this.aFloat113 = local6.aFloat113;
		this.aFloat114 = local6.aFloat114;
		this.aFloat111 = local6.aFloat111;
		this.aFloat107 = local6.aFloat107;
		this.aFloat117 = local6.aFloat117;
		this.aFloat112 = local6.aFloat112;
		this.aFloat116 = local6.aFloat116;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat110 + this.aFloat112 * (float) arg1 + this.aFloat111 * (float) arg0);
		arg3[1] = (int) (this.aFloat106 * (float) arg0 + (float) arg1 * this.aFloat113 + this.aFloat109 * (float) arg2);
		arg3[2] = (int) (this.aFloat108 * (float) arg2 + (float) arg0 * this.aFloat107 + (float) arg1 * this.aFloat114);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	@Override
	public void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat116 += arg1;
		this.aFloat115 += arg2;
		this.aFloat117 += arg0;
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	@Override
	public void method4663(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat111;
		@Pc(21) float local21 = this.aFloat112;
		@Pc(24) float local24 = this.aFloat110;
		this.aFloat111 = local9 * local18 - local15 * this.aFloat106;
		@Pc(38) float local38 = this.aFloat117;
		this.aFloat112 = local21 * local9 - this.aFloat113 * local15;
		this.aFloat106 = local9 * this.aFloat106 + local18 * local15;
		this.aFloat110 = local9 * local24 - this.aFloat109 * local15;
		this.aFloat113 = local9 * this.aFloat113 + local15 * local21;
		this.aFloat109 = local15 * local24 + local9 * this.aFloat109;
		this.aFloat117 = local38 * local9 - local15 * this.aFloat116;
		this.aFloat116 = local9 * this.aFloat116 + local15 * local38;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
	@Override
	public void method4655(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat106;
		@Pc(21) float local21 = this.aFloat113;
		@Pc(24) float local24 = this.aFloat109;
		this.aFloat106 = local18 * local9 - this.aFloat107 * local15;
		@Pc(37) float local37 = this.aFloat116;
		this.aFloat107 = local15 * local18 + this.aFloat107 * local9;
		this.aFloat113 = local9 * local21 - this.aFloat114 * local15;
		this.aFloat109 = local9 * local24 - local15 * this.aFloat108;
		this.aFloat114 = this.aFloat114 * local9 + local15 * local21;
		this.aFloat116 = local9 * local37 - local15 * this.aFloat115;
		this.aFloat108 = local9 * this.aFloat108 + local24 * local15;
		this.aFloat115 = local37 * local15 + local9 * this.aFloat115;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat115);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat116);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat117);
		arg3[0] = (int) (this.aFloat107 * (float) local6 + this.aFloat106 * (float) local17 + this.aFloat111 * (float) local24);
		arg3[1] = (int) ((float) local17 * this.aFloat113 + this.aFloat112 * (float) local24 + (float) local6 * this.aFloat114);
		arg3[2] = (int) ((float) local6 * this.aFloat108 + (float) local17 * this.aFloat109 + (float) local24 * this.aFloat110);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	@Override
	public void method4654(@OriginalArg(0) int arg0) {
		this.aFloat111 = 1.0F;
		this.aFloat113 = this.aFloat108 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat114 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat109 = -this.aFloat114;
		this.aFloat112 = this.aFloat110 = this.aFloat117 = this.aFloat106 = this.aFloat116 = this.aFloat107 = this.aFloat115 = 0.0F;
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	@Override
	public void method4657(@OriginalArg(0) int arg0) {
		this.aFloat108 = 1.0F;
		this.aFloat111 = this.aFloat113 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat106 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat110 = this.aFloat117 = this.aFloat109 = this.aFloat116 = this.aFloat107 = this.aFloat114 = this.aFloat115 = 0.0F;
		this.aFloat112 = -this.aFloat106;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method4662() {
		@Pc(7) Class30_Sub1 local7 = new Class30_Sub1();
		local7.aFloat108 = this.aFloat108;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat117 = this.aFloat117;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat114 = this.aFloat114;
		return local7;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method4650(@OriginalArg(0) int arg0) {
		this.aFloat113 = 1.0F;
		this.aFloat111 = this.aFloat108 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat110 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		this.aFloat112 = this.aFloat117 = this.aFloat106 = this.aFloat109 = this.aFloat116 = this.aFloat114 = this.aFloat115 = 0.0F;
		this.aFloat107 = -this.aFloat110;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	@Override
	public void method4651(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub12.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub12.aFloatArray52[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat111;
		@Pc(21) float local21 = this.aFloat112;
		@Pc(24) float local24 = this.aFloat110;
		this.aFloat111 = local18 * local9 + local15 * this.aFloat107;
		@Pc(37) float local37 = this.aFloat117;
		this.aFloat112 = local9 * local21 + local15 * this.aFloat114;
		this.aFloat107 = this.aFloat107 * local9 - local15 * local18;
		this.aFloat110 = local9 * local24 + local15 * this.aFloat108;
		this.aFloat114 = local9 * this.aFloat114 - local15 * local21;
		this.aFloat108 = local9 * this.aFloat108 - local15 * local24;
		this.aFloat117 = local37 * local9 + local15 * this.aFloat115;
		this.aFloat115 = local9 * this.aFloat115 - local15 * local37;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([I)V")
	@Override
	public void method4645(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat117;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat116;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat115;
		arg0[2] = (int) (this.aFloat110 * local12 + local20 * this.aFloat109 + this.aFloat108 * local28);
		arg0[1] = (int) (this.aFloat112 * local12 + local20 * this.aFloat113 + local28 * this.aFloat114);
		arg0[0] = (int) (this.aFloat107 * local28 + local12 * this.aFloat111 + this.aFloat106 * local20);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat106 + this.aFloat113 * (float) arg1 + (float) arg2 * this.aFloat109 + this.aFloat116);
		arg3[0] = (int) ((float) arg2 * this.aFloat110 + this.aFloat112 * (float) arg1 + (float) arg0 * this.aFloat111 + this.aFloat117);
		arg3[2] = (int) (this.aFloat115 + this.aFloat114 * (float) arg1 + (float) arg0 * this.aFloat107 + (float) arg2 * this.aFloat108);
	}
}
