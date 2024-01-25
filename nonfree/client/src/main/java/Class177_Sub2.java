import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class177_Sub2 extends Class177 {

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!mda", name = "s", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!mda", name = "u", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!mda", name = "v", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class177_Sub2() {
		this.method7876();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat102 + (float) arg0 * this.aFloat112 + (float) arg1 * this.aFloat106 + this.aFloat109 * (float) arg2);
		arg3[1] = (int) (this.aFloat108 + this.aFloat107 * (float) arg0 + (float) arg1 * this.aFloat104 + this.aFloat110 * (float) arg2);
		arg3[2] = (int) (this.aFloat103 + this.aFloat111 * (float) arg2 + this.aFloat105 * (float) arg0 + this.aFloat101 * (float) arg1);
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat112;
		@Pc(21) float local21 = this.aFloat106;
		@Pc(24) float local24 = this.aFloat109;
		this.aFloat112 = local18 * local9 - local15 * this.aFloat107;
		@Pc(38) float local38 = this.aFloat102;
		this.aFloat107 = local18 * local15 + this.aFloat107 * local9;
		this.aFloat106 = local9 * local21 - local15 * this.aFloat104;
		this.aFloat104 = this.aFloat104 * local9 + local15 * local21;
		this.aFloat109 = local9 * local24 - this.aFloat110 * local15;
		this.aFloat110 = local24 * local15 + this.aFloat110 * local9;
		this.aFloat102 = local38 * local9 - this.aFloat108 * local15;
		this.aFloat108 = local38 * local15 + local9 * this.aFloat108;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat111 = 1.0F;
		this.aFloat112 = this.aFloat104 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat107 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat109 = this.aFloat102 = this.aFloat110 = this.aFloat108 = this.aFloat105 = this.aFloat101 = this.aFloat103 = 0.0F;
		this.aFloat106 = -this.aFloat107;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "()V")
	@Override
	public void method7876() {
		this.aFloat107 = this.aFloat105 = this.aFloat106 = this.aFloat101 = this.aFloat109 = this.aFloat110 = this.aFloat102 = this.aFloat108 = this.aFloat103 = 0.0F;
		this.aFloat112 = this.aFloat104 = this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat109 + this.aFloat106 * (float) arg1 + (float) arg0 * this.aFloat112);
		arg3[2] = (int) (this.aFloat111 * (float) arg2 + this.aFloat101 * (float) arg1 + this.aFloat105 * (float) arg0);
		arg3[1] = (int) (this.aFloat110 * (float) arg2 + (float) arg1 * this.aFloat104 + (float) arg0 * this.aFloat107);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class314.aFloatArray76[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class314.aFloatArray75[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class314.aFloatArray76[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class314.aFloatArray75[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat105 = local27 * local9;
		this.aFloat107 = local39 * -local21 + local43 * local27;
		this.aFloat112 = local21 * local33 + local47 * local27;
		this.aFloat106 = local39 * local9;
		this.aFloat101 = -local15;
		this.aFloat111 = local21 * local9;
		this.aFloat104 = local9 * local33;
		this.aFloat109 = local21 * local47 + -local27 * local33;
		this.aFloat110 = local21 * local43 + local27 * local39;
		this.aFloat103 = this.aFloat105 * (float) -arg0 - this.aFloat101 * (float) arg1 - this.aFloat111 * (float) arg2;
		this.aFloat102 = (float) -arg0 * this.aFloat112 - this.aFloat106 * (float) arg1 - this.aFloat109 * (float) arg2;
		this.aFloat108 = -(this.aFloat104 * (float) arg1) + (float) -arg0 * this.aFloat107 - this.aFloat110 * (float) arg2;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat102);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat108);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat103);
		arg3[2] = (int) ((float) local24 * this.aFloat111 + (float) local6 * this.aFloat109 + this.aFloat110 * (float) local17);
		arg3[0] = (int) (this.aFloat105 * (float) local24 + this.aFloat112 * (float) local6 + this.aFloat107 * (float) local17);
		arg3[1] = (int) (this.aFloat101 * (float) local24 + this.aFloat106 * (float) local6 + (float) local17 * this.aFloat104);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method7868() {
		@Pc(7) Class177_Sub2 local7 = new Class177_Sub2();
		local7.aFloat105 = this.aFloat105;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat111 = this.aFloat111;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat110 = this.aFloat110;
		return local7;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(III)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat108 += arg1;
		this.aFloat102 += arg0;
		this.aFloat103 += arg2;
	}

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "(I)V")
	@Override
	public void method7880(@OriginalArg(0) int arg0) {
		this.aFloat112 = 1.0F;
		this.aFloat104 = this.aFloat111 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat101 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat110 = -this.aFloat101;
		this.aFloat106 = this.aFloat109 = this.aFloat102 = this.aFloat107 = this.aFloat108 = this.aFloat105 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method7879(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub2 local6 = (Class177_Sub2) arg0;
		this.aFloat109 = local6.aFloat109;
		this.aFloat111 = local6.aFloat111;
		this.aFloat112 = local6.aFloat112;
		this.aFloat107 = local6.aFloat107;
		this.aFloat102 = local6.aFloat102;
		this.aFloat101 = local6.aFloat101;
		this.aFloat104 = local6.aFloat104;
		this.aFloat105 = local6.aFloat105;
		this.aFloat108 = local6.aFloat108;
		this.aFloat103 = local6.aFloat103;
		this.aFloat110 = local6.aFloat110;
		this.aFloat106 = local6.aFloat106;
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	@Override
	public void method7877(@OriginalArg(0) int arg0) {
		this.aFloat104 = 1.0F;
		this.aFloat112 = this.aFloat111 = Class314.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat109 = Class314.aFloatArray75[arg0 & 0x3FFF];
		this.aFloat105 = -this.aFloat109;
		this.aFloat106 = this.aFloat102 = this.aFloat107 = this.aFloat110 = this.aFloat108 = this.aFloat101 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([I)V")
	@Override
	public void method7878(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat102;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat108;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat103;
		arg0[0] = (int) (local29 * this.aFloat105 + local21 * this.aFloat107 + local12 * this.aFloat112);
		arg0[1] = (int) (this.aFloat101 * local29 + this.aFloat106 * local12 + local21 * this.aFloat104);
		arg0[2] = (int) (this.aFloat111 * local29 + this.aFloat109 * local12 + local21 * this.aFloat110);
	}

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "(I)V")
	@Override
	public void method7883(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat107;
		@Pc(21) float local21 = this.aFloat104;
		@Pc(24) float local24 = this.aFloat110;
		this.aFloat107 = local18 * local9 - this.aFloat105 * local15;
		@Pc(38) float local38 = this.aFloat108;
		this.aFloat104 = local9 * local21 - this.aFloat101 * local15;
		this.aFloat105 = this.aFloat105 * local9 + local15 * local18;
		this.aFloat101 = local21 * local15 + this.aFloat101 * local9;
		this.aFloat110 = local24 * local9 - local15 * this.aFloat111;
		this.aFloat111 = local15 * local24 + this.aFloat111 * local9;
		this.aFloat108 = local9 * local38 - local15 * this.aFloat103;
		this.aFloat103 = local15 * local38 + this.aFloat103 * local9;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
	@Override
	public void method7874(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class314.aFloatArray76[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class314.aFloatArray75[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat112;
		@Pc(21) float local21 = this.aFloat106;
		@Pc(24) float local24 = this.aFloat109;
		this.aFloat112 = this.aFloat105 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat102;
		this.aFloat106 = this.aFloat101 * local15 + local9 * local21;
		this.aFloat105 = local9 * this.aFloat105 - local15 * local18;
		this.aFloat101 = this.aFloat101 * local9 - local15 * local21;
		this.aFloat109 = local15 * this.aFloat111 + local9 * local24;
		this.aFloat102 = local15 * this.aFloat103 + local37 * local9;
		this.aFloat111 = this.aFloat111 * local9 - local24 * local15;
		this.aFloat103 = local9 * this.aFloat103 - local15 * local37;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat103 = arg2;
		this.aFloat102 = arg0;
		this.aFloat107 = this.aFloat105 = this.aFloat106 = this.aFloat101 = this.aFloat109 = this.aFloat110 = 0.0F;
		this.aFloat108 = arg1;
		this.aFloat112 = this.aFloat104 = this.aFloat111 = 1.0F;
	}
}
