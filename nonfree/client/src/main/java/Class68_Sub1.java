import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!db", name = "j", descriptor = "F")
	public float aFloat33;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class68_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!db", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat43;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat39;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat35;
		arg0[2] = (int) (this.aFloat44 * local28 + local12 * this.aFloat40 + this.aFloat34 * local20);
		arg0[0] = (int) (this.aFloat38 * local28 + this.aFloat41 * local12 + local20 * this.aFloat37);
		arg0[1] = (int) (this.aFloat33 * local28 + this.aFloat42 * local12 + this.aFloat36 * local20);
	}

	@OriginalMember(owner = "client!db", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat44 = 1.0F;
		this.aFloat41 = this.aFloat36 = Class74.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat37 = Class74.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat40 = this.aFloat43 = this.aFloat34 = this.aFloat39 = this.aFloat38 = this.aFloat33 = this.aFloat35 = 0.0F;
		this.aFloat42 = -this.aFloat37;
	}

	@OriginalMember(owner = "client!db", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat39 += arg1;
		this.aFloat43 += arg0;
		this.aFloat35 += arg2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BFFF[FF)V")
	public void method1264(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		arg3[2] = this.aFloat44 * arg2 + arg1 * this.aFloat38 + this.aFloat33 * arg0;
		arg3[0] = this.aFloat41 * arg1 + arg0 * this.aFloat42 + this.aFloat40 * arg2;
		@Pc(76) float local76;
		@Pc(68) float local68;
		@Pc(84) float local84;
		@Pc(60) float local60;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local60 = -arg4 / arg1;
			local68 = this.aFloat39 + local60 * this.aFloat37;
			local76 = local60 * this.aFloat41 + this.aFloat43;
			local84 = this.aFloat35 + this.aFloat38 * local60;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local60 = -arg4 / arg0;
			local76 = this.aFloat43 + this.aFloat42 * local60;
			local68 = local60 * this.aFloat36 + this.aFloat39;
			local84 = this.aFloat33 * local60 + this.aFloat35;
		} else {
			local60 = -arg4 / arg2;
			local68 = this.aFloat39 + local60 * this.aFloat34;
			local76 = this.aFloat43 + local60 * this.aFloat40;
			local84 = this.aFloat44 * local60 + this.aFloat35;
		}
		arg3[1] = this.aFloat36 * arg0 + arg1 * this.aFloat37 + this.aFloat34 * arg2;
		arg3[3] = -(arg3[1] * local68 + local76 * arg3[0] + arg3[2] * local84);
	}

	@OriginalMember(owner = "client!db", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat34 * (float) arg2 + (float) arg0 * this.aFloat37 + (float) arg1 * this.aFloat36);
		arg3[2] = (int) ((float) arg1 * this.aFloat33 + this.aFloat38 * (float) arg0 + (float) arg2 * this.aFloat44);
		arg3[0] = (int) (this.aFloat41 * (float) arg0 + this.aFloat42 * (float) arg1 + (float) arg2 * this.aFloat40);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat34 * (float) arg2 + this.aFloat37 * (float) arg0 + (float) arg1 * this.aFloat36 + this.aFloat39);
		arg3[0] = (int) (this.aFloat42 * (float) arg1 + this.aFloat41 * (float) arg0 + (float) arg2 * this.aFloat40 + this.aFloat43);
		arg3[2] = (int) (this.aFloat35 + (float) arg0 * this.aFloat38 + this.aFloat33 * (float) arg1 + (float) arg2 * this.aFloat44);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6462() {
		@Pc(7) Class68_Sub1 local7 = new Class68_Sub1();
		local7.aFloat41 = this.aFloat41;
		local7.aFloat33 = this.aFloat33;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat34 = this.aFloat34;
		local7.aFloat35 = this.aFloat35;
		local7.aFloat40 = this.aFloat40;
		return local7;
	}

	@OriginalMember(owner = "client!db", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat36 = 1.0F;
		this.aFloat41 = this.aFloat44 = Class74.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat40 = Class74.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat38 = -this.aFloat40;
		this.aFloat42 = this.aFloat43 = this.aFloat37 = this.aFloat34 = this.aFloat39 = this.aFloat33 = this.aFloat35 = 0.0F;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)[F")
	public float[] method1265() {
		Static461.aFloatArray64[2] = this.aFloat38;
		Static461.aFloatArray64[9] = this.aFloat34;
		Static461.aFloatArray64[14] = this.aFloat35;
		Static461.aFloatArray64[12] = this.aFloat43;
		Static461.aFloatArray64[0] = this.aFloat41;
		Static461.aFloatArray64[10] = this.aFloat44;
		Static461.aFloatArray64[8] = this.aFloat40;
		Static461.aFloatArray64[6] = this.aFloat33;
		Static461.aFloatArray64[1] = this.aFloat37;
		Static461.aFloatArray64[5] = this.aFloat36;
		Static461.aFloatArray64[4] = this.aFloat42;
		Static461.aFloatArray64[13] = this.aFloat39;
		return Static461.aFloatArray64;
	}

	@OriginalMember(owner = "client!db", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class74.aFloatArray4[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class74.aFloatArray3[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat41;
		@Pc(21) float local21 = this.aFloat42;
		@Pc(24) float local24 = this.aFloat40;
		this.aFloat41 = local15 * this.aFloat38 + local9 * local18;
		@Pc(37) float local37 = this.aFloat43;
		this.aFloat38 = this.aFloat38 * local9 - local15 * local18;
		this.aFloat42 = local15 * this.aFloat33 + local9 * local21;
		this.aFloat33 = local9 * this.aFloat33 - local15 * local21;
		this.aFloat40 = local9 * local24 + this.aFloat44 * local15;
		this.aFloat44 = this.aFloat44 * local9 - local24 * local15;
		this.aFloat43 = local9 * local37 + this.aFloat35 * local15;
		this.aFloat35 = this.aFloat35 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!db", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat41 = 1.0F;
		this.aFloat36 = this.aFloat44 = Class74.aFloatArray4[arg0 & 0x3FFF];
		this.aFloat33 = Class74.aFloatArray3[arg0 & 0x3FFF];
		this.aFloat42 = this.aFloat40 = this.aFloat43 = this.aFloat37 = this.aFloat39 = this.aFloat38 = this.aFloat35 = 0.0F;
		this.aFloat34 = -this.aFloat33;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public void method1267() {
		this.aFloat36 = -this.aFloat36;
		this.aFloat39 = -this.aFloat39;
		this.aFloat34 = -this.aFloat34;
		this.aFloat35 = -this.aFloat35;
		this.aFloat33 = -this.aFloat33;
		this.aFloat38 = -this.aFloat38;
		this.aFloat37 = -this.aFloat37;
		this.aFloat44 = -this.aFloat44;
	}

	@OriginalMember(owner = "client!db", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat35 = arg2;
		this.aFloat37 = this.aFloat38 = this.aFloat42 = this.aFloat33 = this.aFloat40 = this.aFloat34 = 0.0F;
		this.aFloat41 = this.aFloat36 = this.aFloat44 = 1.0F;
		this.aFloat39 = arg1;
		this.aFloat43 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)[F")
	public float[] method1269() {
		Static461.aFloatArray64[4] = this.aFloat42;
		Static461.aFloatArray64[9] = this.aFloat34;
		Static461.aFloatArray64[12] = 0.0F;
		Static461.aFloatArray64[14] = 0.0F;
		Static461.aFloatArray64[10] = this.aFloat44;
		Static461.aFloatArray64[1] = this.aFloat37;
		Static461.aFloatArray64[6] = this.aFloat33;
		Static461.aFloatArray64[5] = this.aFloat36;
		Static461.aFloatArray64[2] = this.aFloat38;
		Static461.aFloatArray64[13] = 0.0F;
		Static461.aFloatArray64[0] = this.aFloat41;
		Static461.aFloatArray64[8] = this.aFloat40;
		return Static461.aFloatArray64;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBFIFFI)V")
	public void method1270(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat37 = this.aFloat38 = this.aFloat42 = this.aFloat33 = this.aFloat40 = this.aFloat34 = 0.0F;
			this.aFloat36 = arg5;
			this.aFloat41 = arg0;
			this.aFloat44 = 1.0F;
		} else {
			@Pc(10) float local10 = Class74.aFloatArray4[arg2 & 0x3FFF];
			@Pc(16) float local16 = Class74.aFloatArray3[arg2 & 0x3FFF];
			this.aFloat41 = (float) arg0 * local10;
			this.aFloat42 = (float) arg5 * -local16;
			this.aFloat44 = 1.0F;
			this.aFloat36 = local10 * (float) arg5;
			this.aFloat37 = local16 * (float) arg0;
			this.aFloat38 = this.aFloat33 = this.aFloat40 = this.aFloat34 = 0.0F;
		}
		this.aFloat39 = arg3;
		this.aFloat35 = arg4;
		this.aFloat43 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat37 = this.aFloat38 = this.aFloat42 = this.aFloat33 = this.aFloat40 = this.aFloat34 = this.aFloat43 = this.aFloat39 = this.aFloat35 = 0.0F;
		this.aFloat41 = this.aFloat36 = this.aFloat44 = 1.0F;
	}

	@OriginalMember(owner = "client!db", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class68 arg0) {
		@Pc(6) Class68_Sub1 local6 = (Class68_Sub1) arg0;
		this.aFloat41 = local6.aFloat41;
		this.aFloat38 = local6.aFloat38;
		this.aFloat37 = local6.aFloat37;
		this.aFloat40 = local6.aFloat40;
		this.aFloat33 = local6.aFloat33;
		this.aFloat44 = local6.aFloat44;
		this.aFloat43 = local6.aFloat43;
		this.aFloat42 = local6.aFloat42;
		this.aFloat36 = local6.aFloat36;
		this.aFloat34 = local6.aFloat34;
		this.aFloat39 = local6.aFloat39;
		this.aFloat35 = local6.aFloat35;
	}

	@OriginalMember(owner = "client!db", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class74.aFloatArray4[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class74.aFloatArray3[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class74.aFloatArray4[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class74.aFloatArray3[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class74.aFloatArray4[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class74.aFloatArray3[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat34 = local39 * local27 + local21 * local43;
		this.aFloat38 = local27 * local9;
		this.aFloat37 = local39 * -local21 + local27 * local43;
		this.aFloat33 = -local15;
		this.aFloat40 = -local27 * local33 + local21 * local47;
		this.aFloat36 = local33 * local9;
		this.aFloat42 = local39 * local9;
		this.aFloat41 = local47 * local27 + local33 * local21;
		this.aFloat44 = local21 * local9;
		this.aFloat43 = -(this.aFloat40 * (float) arg2) - this.aFloat42 * (float) arg1 + (float) -arg0 * this.aFloat41;
		this.aFloat35 = (float) -arg0 * this.aFloat38 - (float) arg1 * this.aFloat33 - this.aFloat44 * (float) arg2;
		this.aFloat39 = -((float) arg2 * this.aFloat34) + this.aFloat37 * (float) -arg0 - (float) arg1 * this.aFloat36;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!q;B)V")
	public void method1271(@OriginalArg(0) Class68 arg0) {
		@Pc(6) Class68_Sub1 local6 = (Class68_Sub1) arg0;
		this.aFloat41 = local6.aFloat41;
		this.aFloat42 = local6.aFloat37;
		this.aFloat40 = local6.aFloat38;
		this.aFloat36 = local6.aFloat36;
		this.aFloat37 = local6.aFloat42;
		this.aFloat34 = local6.aFloat33;
		this.aFloat38 = local6.aFloat40;
		this.aFloat44 = local6.aFloat44;
		this.aFloat33 = local6.aFloat34;
		this.aFloat43 = -(local6.aFloat43 * this.aFloat41 + this.aFloat42 * local6.aFloat39 + this.aFloat40 * local6.aFloat35);
		this.aFloat39 = -(local6.aFloat43 * this.aFloat37 + this.aFloat36 * local6.aFloat39 + this.aFloat34 * local6.aFloat35);
		this.aFloat35 = -(local6.aFloat35 * this.aFloat44 + local6.aFloat43 * this.aFloat38 + local6.aFloat39 * this.aFloat33);
	}

	@OriginalMember(owner = "client!db", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class74.aFloatArray4[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class74.aFloatArray3[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat37;
		@Pc(21) float local21 = this.aFloat36;
		@Pc(24) float local24 = this.aFloat34;
		this.aFloat37 = local9 * local18 - this.aFloat38 * local15;
		@Pc(38) float local38 = this.aFloat39;
		this.aFloat36 = local21 * local9 - local15 * this.aFloat33;
		this.aFloat38 = local9 * this.aFloat38 + local15 * local18;
		this.aFloat34 = local24 * local9 - this.aFloat44 * local15;
		this.aFloat33 = this.aFloat33 * local9 + local21 * local15;
		this.aFloat44 = local9 * this.aFloat44 + local15 * local24;
		this.aFloat39 = local38 * local9 - local15 * this.aFloat35;
		this.aFloat35 = local38 * local15 + this.aFloat35 * local9;
	}

	@OriginalMember(owner = "client!db", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class74.aFloatArray4[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class74.aFloatArray3[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat41;
		@Pc(21) float local21 = this.aFloat42;
		@Pc(24) float local24 = this.aFloat40;
		@Pc(27) float local27 = this.aFloat43;
		this.aFloat41 = local9 * local18 - this.aFloat37 * local15;
		this.aFloat42 = local21 * local9 - this.aFloat36 * local15;
		this.aFloat37 = local18 * local15 + this.aFloat37 * local9;
		this.aFloat40 = local9 * local24 - this.aFloat34 * local15;
		this.aFloat36 = local9 * this.aFloat36 + local21 * local15;
		this.aFloat43 = local9 * local27 - this.aFloat39 * local15;
		this.aFloat34 = local15 * local24 + local9 * this.aFloat34;
		this.aFloat39 = this.aFloat39 * local9 + local15 * local27;
	}
}
