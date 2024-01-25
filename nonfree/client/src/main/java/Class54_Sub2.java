import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class54_Sub2() {
		this.method4785();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	@Override
	public void method4782(@OriginalArg(0) int arg0) {
		this.aFloat79 = 1.0F;
		this.aFloat87 = this.aFloat77 = Class234.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat86 = Class234.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat81 = -this.aFloat86;
		this.aFloat80 = this.aFloat82 = this.aFloat83 = this.aFloat78 = this.aFloat88 = this.aFloat84 = this.aFloat85 = 0.0F;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	@Override
	public void method4779(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class234.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class234.aFloatArray28[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat83;
		@Pc(17) float local17 = this.aFloat79;
		@Pc(20) float local20 = this.aFloat78;
		@Pc(23) float local23 = this.aFloat88;
		this.aFloat83 = local14 * local5 - this.aFloat81 * local11;
		this.aFloat79 = local5 * local17 - local11 * this.aFloat84;
		this.aFloat81 = this.aFloat81 * local5 + local11 * local14;
		this.aFloat78 = local5 * local20 - local11 * this.aFloat77;
		this.aFloat84 = this.aFloat84 * local5 + local17 * local11;
		this.aFloat77 = local5 * this.aFloat77 + local20 * local11;
		this.aFloat88 = local23 * local5 - local11 * this.aFloat85;
		this.aFloat85 = this.aFloat85 * local5 + local11 * local23;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([I)V")
	@Override
	public void method4788(@OriginalArg(0) int[] arg0) {
		@Pc(7) float local7 = (float) arg0[0] - this.aFloat82;
		@Pc(16) float local16 = (float) arg0[1] - this.aFloat88;
		@Pc(24) float local24 = (float) arg0[2] - this.aFloat85;
		arg0[1] = (int) (this.aFloat79 * local16 + local7 * this.aFloat80 + local24 * this.aFloat84);
		arg0[0] = (int) (local24 * this.aFloat81 + local7 * this.aFloat87 + this.aFloat83 * local16);
		arg0[2] = (int) (local24 * this.aFloat77 + local7 * this.aFloat86 + this.aFloat78 * local16);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dr;)V")
	@Override
	public void method4781(@OriginalArg(0) Class54 arg0) {
		@Pc(2) Class54_Sub2 local2 = (Class54_Sub2) arg0;
		this.aFloat77 = local2.aFloat77;
		this.aFloat86 = local2.aFloat86;
		this.aFloat85 = local2.aFloat85;
		this.aFloat88 = local2.aFloat88;
		this.aFloat79 = local2.aFloat79;
		this.aFloat87 = local2.aFloat87;
		this.aFloat78 = local2.aFloat78;
		this.aFloat84 = local2.aFloat84;
		this.aFloat81 = local2.aFloat81;
		this.aFloat80 = local2.aFloat80;
		this.aFloat83 = local2.aFloat83;
		this.aFloat82 = local2.aFloat82;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dr;B)V")
	public void method4794(@OriginalArg(0) Class54 arg0) {
		@Pc(2) Class54_Sub2 local2 = (Class54_Sub2) arg0;
		this.aFloat87 = local2.aFloat87;
		this.aFloat86 = local2.aFloat81;
		this.aFloat80 = local2.aFloat83;
		this.aFloat81 = local2.aFloat86;
		this.aFloat78 = local2.aFloat84;
		this.aFloat83 = local2.aFloat80;
		this.aFloat79 = local2.aFloat79;
		this.aFloat77 = local2.aFloat77;
		this.aFloat84 = local2.aFloat78;
		this.aFloat82 = -(local2.aFloat82 * this.aFloat87 + local2.aFloat88 * this.aFloat80 + this.aFloat86 * local2.aFloat85);
		this.aFloat88 = -(this.aFloat78 * local2.aFloat85 + this.aFloat83 * local2.aFloat82 + this.aFloat79 * local2.aFloat88);
		this.aFloat85 = -(local2.aFloat88 * this.aFloat84 + local2.aFloat82 * this.aFloat81 + this.aFloat77 * local2.aFloat85);
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	@Override
	public void method4793(@OriginalArg(0) int arg0) {
		@Pc(5) float local5 = Class234.aFloatArray29[arg0 & 0x3FFF];
		@Pc(11) float local11 = Class234.aFloatArray28[arg0 & 0x3FFF];
		@Pc(14) float local14 = this.aFloat87;
		@Pc(17) float local17 = this.aFloat80;
		@Pc(20) float local20 = this.aFloat86;
		this.aFloat87 = local5 * local14 + local11 * this.aFloat81;
		@Pc(33) float local33 = this.aFloat82;
		this.aFloat80 = local17 * local5 + local11 * this.aFloat84;
		this.aFloat81 = this.aFloat81 * local5 - local11 * local14;
		this.aFloat86 = local5 * local20 + local11 * this.aFloat77;
		this.aFloat84 = local5 * this.aFloat84 - local17 * local11;
		this.aFloat82 = local5 * local33 + this.aFloat85 * local11;
		this.aFloat77 = this.aFloat77 * local5 - local11 * local20;
		this.aFloat85 = local5 * this.aFloat85 - local11 * local33;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	@Override
	public void method4790(@OriginalArg(0) int arg0) {
		this.aFloat87 = 1.0F;
		this.aFloat79 = this.aFloat77 = Class234.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat84 = Class234.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat78 = -this.aFloat84;
		this.aFloat80 = this.aFloat86 = this.aFloat82 = this.aFloat83 = this.aFloat88 = this.aFloat81 = this.aFloat85 = 0.0F;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	@Override
	public void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat85 += arg2;
		this.aFloat88 += arg1;
		this.aFloat82 += arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)[F")
	public float[] method4795() {
		Static308.aFloatArray26[14] = 0.0F;
		Static308.aFloatArray26[1] = this.aFloat83;
		Static308.aFloatArray26[12] = 0.0F;
		Static308.aFloatArray26[6] = this.aFloat84;
		Static308.aFloatArray26[5] = this.aFloat79;
		Static308.aFloatArray26[0] = this.aFloat87;
		Static308.aFloatArray26[10] = this.aFloat77;
		Static308.aFloatArray26[8] = this.aFloat86;
		Static308.aFloatArray26[2] = this.aFloat81;
		Static308.aFloatArray26[4] = this.aFloat80;
		Static308.aFloatArray26[9] = this.aFloat78;
		Static308.aFloatArray26[13] = 0.0F;
		return Static308.aFloatArray26;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	@Override
	public void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat88 = arg1;
		this.aFloat82 = arg0;
		this.aFloat87 = this.aFloat79 = this.aFloat77 = 1.0F;
		this.aFloat85 = arg2;
		this.aFloat83 = this.aFloat81 = this.aFloat80 = this.aFloat84 = this.aFloat86 = this.aFloat78 = 0.0F;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) float local5 = Class234.aFloatArray29[arg3 & 0x3FFF];
		@Pc(11) float local11 = Class234.aFloatArray28[arg3 & 0x3FFF];
		@Pc(17) float local17 = Class234.aFloatArray29[arg4 & 0x3FFF];
		@Pc(23) float local23 = Class234.aFloatArray28[arg4 & 0x3FFF];
		@Pc(29) float local29 = Class234.aFloatArray29[arg5 & 0x3FFF];
		@Pc(35) float local35 = Class234.aFloatArray28[arg5 & 0x3FFF];
		@Pc(39) float local39 = local11 * local29;
		@Pc(43) float local43 = local35 * local11;
		this.aFloat77 = local17 * local5;
		this.aFloat87 = local23 * local43 + local17 * local29;
		this.aFloat80 = local5 * local35;
		this.aFloat84 = -local11;
		this.aFloat79 = local5 * local29;
		this.aFloat78 = local35 * local23 + local17 * local39;
		this.aFloat83 = local23 * local39 + -local17 * local35;
		this.aFloat86 = local29 * -local23 + local17 * local43;
		this.aFloat81 = local23 * local5;
		this.aFloat82 = -(this.aFloat86 * (float) arg2) + this.aFloat87 * (float) -arg0 - (float) arg1 * this.aFloat80;
		this.aFloat85 = -(this.aFloat84 * (float) arg1) + (float) -arg0 * this.aFloat81 - this.aFloat77 * (float) arg2;
		this.aFloat88 = -((float) arg2 * this.aFloat78) + this.aFloat83 * (float) -arg0 - (float) arg1 * this.aFloat79;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	@Override
	public void method4784(@OriginalArg(0) int arg0) {
		this.aFloat77 = 1.0F;
		this.aFloat87 = this.aFloat79 = Class234.aFloatArray29[arg0 & 0x3FFF];
		this.aFloat83 = Class234.aFloatArray28[arg0 & 0x3FFF];
		this.aFloat80 = -this.aFloat83;
		this.aFloat86 = this.aFloat82 = this.aFloat78 = this.aFloat88 = this.aFloat81 = this.aFloat84 = this.aFloat85 = 0.0F;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat83 + (float) arg1 * this.aFloat79 + (float) arg2 * this.aFloat78 + this.aFloat88);
		arg3[0] = (int) (this.aFloat87 * (float) arg0 + (float) arg1 * this.aFloat80 + (float) arg2 * this.aFloat86 + this.aFloat82);
		arg3[2] = (int) (this.aFloat77 * (float) arg2 + (float) arg1 * this.aFloat84 + this.aFloat81 * (float) arg0 + this.aFloat85);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()Lclient!rh;")
	public Class54_Sub2 method4796() {
		@Pc(3) Class54_Sub2 local3 = new Class54_Sub2();
		local3.aFloat81 = this.aFloat81;
		local3.aFloat77 = this.aFloat77;
		local3.aFloat86 = this.aFloat86;
		local3.aFloat80 = this.aFloat80;
		local3.aFloat85 = this.aFloat85;
		local3.aFloat88 = this.aFloat88;
		local3.aFloat78 = this.aFloat78;
		local3.aFloat79 = this.aFloat79;
		local3.aFloat84 = this.aFloat84;
		local3.aFloat83 = this.aFloat83;
		local3.aFloat87 = this.aFloat87;
		local3.aFloat82 = this.aFloat82;
		return local3;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)[F")
	public float[] method4797() {
		Static308.aFloatArray26[14] = this.aFloat85;
		Static308.aFloatArray26[5] = this.aFloat79;
		Static308.aFloatArray26[4] = this.aFloat80;
		Static308.aFloatArray26[10] = this.aFloat77;
		Static308.aFloatArray26[2] = this.aFloat81;
		Static308.aFloatArray26[1] = this.aFloat83;
		Static308.aFloatArray26[8] = this.aFloat86;
		Static308.aFloatArray26[13] = this.aFloat88;
		Static308.aFloatArray26[9] = this.aFloat78;
		Static308.aFloatArray26[12] = this.aFloat82;
		Static308.aFloatArray26[0] = this.aFloat87;
		Static308.aFloatArray26[6] = this.aFloat84;
		return Static308.aFloatArray26;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	@Override
	public void method4785() {
		this.aFloat83 = this.aFloat81 = this.aFloat80 = this.aFloat84 = this.aFloat86 = this.aFloat78 = this.aFloat82 = this.aFloat88 = this.aFloat85 = 0.0F;
		this.aFloat87 = this.aFloat79 = this.aFloat77 = 1.0F;
	}
}
