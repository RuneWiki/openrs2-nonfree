import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "[B")
	public static final byte[] aByteArray55;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "F")
	public float aFloat49;

	static {
		@Pc(3) int local3 = 0;
		aByteArray55 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray55[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class5_Sub2() {
		this.method3842();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)[F")
	public float[] method3849() {
		Static193.aFloatArray9[13] = 0.0F;
		Static193.aFloatArray9[1] = this.aFloat43;
		Static193.aFloatArray9[10] = this.aFloat48;
		Static193.aFloatArray9[5] = this.aFloat46;
		Static193.aFloatArray9[0] = this.aFloat38;
		Static193.aFloatArray9[8] = this.aFloat39;
		Static193.aFloatArray9[4] = this.aFloat44;
		Static193.aFloatArray9[14] = 0.0F;
		Static193.aFloatArray9[6] = this.aFloat42;
		Static193.aFloatArray9[12] = 0.0F;
		Static193.aFloatArray9[2] = this.aFloat49;
		Static193.aFloatArray9[9] = this.aFloat45;
		return Static193.aFloatArray9;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	@Override
	public void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat47 = arg0;
		this.aFloat41 = arg1;
		this.aFloat40 = arg2;
		this.aFloat38 = this.aFloat46 = this.aFloat48 = 1.0F;
		this.aFloat43 = this.aFloat49 = this.aFloat44 = this.aFloat42 = this.aFloat39 = this.aFloat45 = 0.0F;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!gs;I)V")
	public void method3850(@OriginalArg(0) Class5 arg0) {
		@Pc(6) Class5_Sub2 local6 = (Class5_Sub2) arg0;
		this.aFloat39 = local6.aFloat49;
		this.aFloat44 = local6.aFloat43;
		this.aFloat38 = local6.aFloat38;
		this.aFloat49 = local6.aFloat39;
		this.aFloat43 = local6.aFloat44;
		this.aFloat45 = local6.aFloat42;
		this.aFloat46 = local6.aFloat46;
		this.aFloat48 = local6.aFloat48;
		this.aFloat47 = -(local6.aFloat47 * this.aFloat38 + local6.aFloat41 * this.aFloat44 + local6.aFloat40 * this.aFloat39);
		this.aFloat42 = local6.aFloat45;
		this.aFloat41 = -(this.aFloat45 * local6.aFloat40 + local6.aFloat41 * this.aFloat46 + this.aFloat43 * local6.aFloat47);
		this.aFloat40 = -(local6.aFloat40 * this.aFloat48 + local6.aFloat41 * this.aFloat42 + local6.aFloat47 * this.aFloat49);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!gs;)V")
	@Override
	public void method3834(@OriginalArg(0) Class5 arg0) {
		@Pc(6) Class5_Sub2 local6 = (Class5_Sub2) arg0;
		this.aFloat40 = local6.aFloat40;
		this.aFloat46 = local6.aFloat46;
		this.aFloat44 = local6.aFloat44;
		this.aFloat43 = local6.aFloat43;
		this.aFloat38 = local6.aFloat38;
		this.aFloat45 = local6.aFloat45;
		this.aFloat49 = local6.aFloat49;
		this.aFloat42 = local6.aFloat42;
		this.aFloat39 = local6.aFloat39;
		this.aFloat41 = local6.aFloat41;
		this.aFloat48 = local6.aFloat48;
		this.aFloat47 = local6.aFloat47;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()Lclient!gs;")
	public Class5 method3851() {
		@Pc(7) Class5_Sub2 local7 = new Class5_Sub2();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat40 = this.aFloat40;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat48 = this.aFloat48;
		return local7;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat41 + this.aFloat45 * (float) arg2 + (float) arg0 * this.aFloat43 + (float) arg1 * this.aFloat46);
		arg3[2] = (int) (this.aFloat40 + this.aFloat48 * (float) arg2 + (float) arg1 * this.aFloat42 + this.aFloat49 * (float) arg0);
		arg3[0] = (int) ((float) arg2 * this.aFloat39 + this.aFloat38 * (float) arg0 + this.aFloat44 * (float) arg1 + this.aFloat47);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)[F")
	public float[] method3852() {
		Static193.aFloatArray9[4] = this.aFloat44;
		Static193.aFloatArray9[8] = this.aFloat39;
		Static193.aFloatArray9[10] = this.aFloat48;
		Static193.aFloatArray9[6] = this.aFloat42;
		Static193.aFloatArray9[1] = this.aFloat43;
		Static193.aFloatArray9[5] = this.aFloat46;
		Static193.aFloatArray9[9] = this.aFloat45;
		Static193.aFloatArray9[13] = this.aFloat41;
		Static193.aFloatArray9[14] = this.aFloat40;
		Static193.aFloatArray9[0] = this.aFloat38;
		Static193.aFloatArray9[2] = this.aFloat49;
		Static193.aFloatArray9[12] = this.aFloat47;
		return Static193.aFloatArray9;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method3835(@OriginalArg(0) int arg0) {
		this.aFloat38 = 1.0F;
		this.aFloat46 = this.aFloat48 = Class251.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat42 = Class251.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat45 = -this.aFloat42;
		this.aFloat44 = this.aFloat39 = this.aFloat47 = this.aFloat43 = this.aFloat41 = this.aFloat49 = this.aFloat40 = 0.0F;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	@Override
	public void method3844(@OriginalArg(0) int arg0) {
		this.aFloat46 = 1.0F;
		this.aFloat38 = this.aFloat48 = Class251.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat39 = Class251.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat44 = this.aFloat47 = this.aFloat43 = this.aFloat45 = this.aFloat41 = this.aFloat42 = this.aFloat40 = 0.0F;
		this.aFloat49 = -this.aFloat39;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	@Override
	public void method3836(@OriginalArg(0) int arg0) {
		this.aFloat48 = 1.0F;
		this.aFloat38 = this.aFloat46 = Class251.aFloatArray30[arg0 & 0x3FFF];
		this.aFloat43 = Class251.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat39 = this.aFloat47 = this.aFloat45 = this.aFloat41 = this.aFloat49 = this.aFloat42 = this.aFloat40 = 0.0F;
		this.aFloat44 = -this.aFloat43;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class251.aFloatArray30[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class251.aFloatArray31[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class251.aFloatArray30[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class251.aFloatArray31[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class251.aFloatArray30[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class251.aFloatArray31[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat42 = -local15;
		this.aFloat39 = local33 * -local27 + local47 * local21;
		this.aFloat44 = local39 * local9;
		this.aFloat49 = local27 * local9;
		this.aFloat43 = local43 * local27 + local39 * -local21;
		this.aFloat38 = local21 * local33 + local27 * local47;
		this.aFloat46 = local9 * local33;
		this.aFloat45 = local21 * local43 + local27 * local39;
		this.aFloat48 = local21 * local9;
		this.aFloat40 = (float) -arg0 * this.aFloat49 - (float) arg1 * this.aFloat42 - (float) arg2 * this.aFloat48;
		this.aFloat41 = -((float) arg2 * this.aFloat45) + this.aFloat43 * (float) -arg0 - (float) arg1 * this.aFloat46;
		this.aFloat47 = -((float) arg1 * this.aFloat44) + this.aFloat38 * (float) -arg0 - (float) arg2 * this.aFloat39;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
	@Override
	public void method3842() {
		this.aFloat43 = this.aFloat49 = this.aFloat44 = this.aFloat42 = this.aFloat39 = this.aFloat45 = this.aFloat47 = this.aFloat41 = this.aFloat40 = 0.0F;
		this.aFloat38 = this.aFloat46 = this.aFloat48 = 1.0F;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class251.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class251.aFloatArray31[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat43;
		@Pc(21) float local21 = this.aFloat46;
		@Pc(24) float local24 = this.aFloat45;
		this.aFloat43 = local9 * local18 - local15 * this.aFloat49;
		@Pc(37) float local37 = this.aFloat41;
		this.aFloat49 = local9 * this.aFloat49 + local15 * local18;
		this.aFloat46 = local9 * local21 - local15 * this.aFloat42;
		this.aFloat42 = local15 * local21 + this.aFloat42 * local9;
		this.aFloat45 = local9 * local24 - local15 * this.aFloat48;
		this.aFloat48 = local15 * local24 + this.aFloat48 * local9;
		this.aFloat41 = local9 * local37 - local15 * this.aFloat40;
		this.aFloat40 = this.aFloat40 * local9 + local15 * local37;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat39 + this.aFloat38 * (float) arg0 + (float) arg1 * this.aFloat44);
		arg3[2] = (int) ((float) arg2 * this.aFloat48 + (float) arg0 * this.aFloat49 + (float) arg1 * this.aFloat42);
		arg3[1] = (int) ((float) arg2 * this.aFloat45 + this.aFloat43 * (float) arg0 + (float) arg1 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFFIIII)V")
	public void method3855(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			this.aFloat43 = this.aFloat49 = this.aFloat44 = this.aFloat42 = this.aFloat39 = this.aFloat45 = 0.0F;
			this.aFloat46 = arg4;
			this.aFloat48 = 1.0F;
			this.aFloat38 = arg3;
		} else {
			@Pc(52) float local52 = Class251.aFloatArray30[arg5 & 0x3FFF];
			@Pc(58) float local58 = Class251.aFloatArray31[arg5 & 0x3FFF];
			this.aFloat46 = local52 * (float) arg4;
			this.aFloat43 = local58 * (float) arg3;
			this.aFloat38 = (float) arg3 * local52;
			this.aFloat44 = -local58 * (float) arg4;
			this.aFloat48 = 1.0F;
			this.aFloat49 = this.aFloat42 = this.aFloat39 = this.aFloat45 = 0.0F;
		}
		this.aFloat40 = arg2;
		this.aFloat47 = arg0;
		this.aFloat41 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([I)V")
	@Override
	public void method3840(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat47;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat41;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat40;
		arg0[1] = (int) (local29 * this.aFloat42 + this.aFloat44 * local12 + this.aFloat46 * local20);
		arg0[0] = (int) (local29 * this.aFloat49 + this.aFloat38 * local12 + local20 * this.aFloat43);
		arg0[2] = (int) (local20 * this.aFloat45 + local12 * this.aFloat39 + this.aFloat48 * local29);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
	@Override
	public void method3847(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class251.aFloatArray30[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class251.aFloatArray31[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat38;
		@Pc(21) float local21 = this.aFloat44;
		@Pc(24) float local24 = this.aFloat39;
		this.aFloat38 = this.aFloat49 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat47;
		this.aFloat49 = this.aFloat49 * local9 - local15 * local18;
		this.aFloat44 = local15 * this.aFloat42 + local9 * local21;
		this.aFloat42 = local9 * this.aFloat42 - local21 * local15;
		this.aFloat39 = local24 * local9 + this.aFloat48 * local15;
		this.aFloat48 = local9 * this.aFloat48 - local15 * local24;
		this.aFloat47 = local9 * local37 + this.aFloat40 * local15;
		this.aFloat40 = this.aFloat40 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat41 += arg1;
		this.aFloat40 += arg2;
		this.aFloat47 += arg0;
	}
}
