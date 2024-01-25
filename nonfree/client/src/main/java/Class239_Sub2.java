import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class239_Sub2 extends Class239 {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class239_Sub2() {
		this.method9249();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lclient!uu;")
	@Override
	public Class239 method9235() {
		@Pc(7) Class239_Sub2 local7 = new Class239_Sub2();
		local7.aFloat167 = this.aFloat167;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat162 = this.aFloat162;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat163 = this.aFloat163;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat171 = this.aFloat171;
		return local7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BFFFIII)V")
	public void method7193(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat162 = this.aFloat160 = this.aFloat165 = this.aFloat169 = this.aFloat168 = this.aFloat170 = 0.0F;
			this.aFloat163 = (float) arg3;
			this.aFloat166 = 1.0F;
			this.aFloat161 = (float) arg4;
		} else {
			@Pc(38) float local38 = Class3_Sub11_Sub13.aFloatArray42[arg5 & 0x3FFF];
			@Pc(44) float local44 = Class3_Sub11_Sub13.aFloatArray41[arg5 & 0x3FFF];
			this.aFloat162 = (float) arg3 * local44;
			this.aFloat165 = (float) arg4 * -local44;
			this.aFloat166 = 1.0F;
			this.aFloat163 = (float) arg3 * local38;
			this.aFloat160 = this.aFloat169 = this.aFloat168 = this.aFloat170 = 0.0F;
			this.aFloat161 = (float) arg4 * local38;
		}
		this.aFloat164 = arg2;
		this.aFloat171 = arg0;
		this.aFloat167 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!uu;)V")
	public void method7194(@OriginalArg(1) Class239 arg0) {
		@Pc(14) Class239_Sub2 local14 = (Class239_Sub2) arg0;
		this.aFloat165 = local14.aFloat162;
		this.aFloat163 = local14.aFloat163;
		this.aFloat168 = local14.aFloat160;
		this.aFloat170 = local14.aFloat169;
		this.aFloat162 = local14.aFloat165;
		this.aFloat160 = local14.aFloat168;
		this.aFloat161 = local14.aFloat161;
		this.aFloat164 = -(local14.aFloat171 * this.aFloat165 + this.aFloat163 * local14.aFloat164 + this.aFloat168 * local14.aFloat167);
		this.aFloat169 = local14.aFloat170;
		this.aFloat166 = local14.aFloat166;
		this.aFloat171 = -(this.aFloat161 * local14.aFloat171 + local14.aFloat164 * this.aFloat162 + this.aFloat170 * local14.aFloat167);
		this.aFloat167 = -(local14.aFloat164 * this.aFloat160 + this.aFloat169 * local14.aFloat171 + this.aFloat166 * local14.aFloat167);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
	@Override
	public void method9249() {
		this.aFloat163 = this.aFloat161 = this.aFloat166 = 1.0F;
		this.aFloat162 = this.aFloat160 = this.aFloat165 = this.aFloat169 = this.aFloat168 = this.aFloat170 = this.aFloat164 = this.aFloat171 = this.aFloat167 = 0.0F;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	@Override
	public void method9246(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat163;
		@Pc(21) float local21 = this.aFloat165;
		@Pc(24) float local24 = this.aFloat168;
		@Pc(27) float local27 = this.aFloat164;
		this.aFloat163 = local9 * local18 - this.aFloat162 * local15;
		this.aFloat162 = this.aFloat162 * local9 + local18 * local15;
		this.aFloat165 = local21 * local9 - this.aFloat161 * local15;
		this.aFloat168 = local24 * local9 - local15 * this.aFloat170;
		this.aFloat161 = local9 * this.aFloat161 + local21 * local15;
		this.aFloat170 = local15 * local24 + local9 * this.aFloat170;
		this.aFloat164 = local9 * local27 - this.aFloat171 * local15;
		this.aFloat171 = local15 * local27 + this.aFloat171 * local9;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	@Override
	public void method9243(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat163;
		@Pc(21) float local21 = this.aFloat165;
		@Pc(24) float local24 = this.aFloat168;
		@Pc(27) float local27 = this.aFloat164;
		this.aFloat163 = local15 * this.aFloat160 + local9 * local18;
		this.aFloat165 = local9 * local21 + local15 * this.aFloat169;
		this.aFloat160 = this.aFloat160 * local9 - local18 * local15;
		this.aFloat169 = local9 * this.aFloat169 - local21 * local15;
		this.aFloat168 = this.aFloat166 * local15 + local24 * local9;
		this.aFloat166 = local9 * this.aFloat166 - local24 * local15;
		this.aFloat164 = local15 * this.aFloat167 + local9 * local27;
		this.aFloat167 = this.aFloat167 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
	@Override
	public void method9244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat164 += (float) arg0;
		this.aFloat167 += (float) arg2;
		this.aFloat171 += (float) arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[FFFFF)V")
	public void method7195(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[2] = arg3 * this.aFloat166 + this.aFloat160 * arg2 + this.aFloat169 * arg1;
		@Pc(65) float local65;
		@Pc(49) float local49;
		@Pc(57) float local57;
		@Pc(41) float local41;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local41 = -arg4 / arg2;
			local49 = this.aFloat162 * local41 + this.aFloat171;
			local57 = this.aFloat167 + this.aFloat160 * local41;
			local65 = this.aFloat164 + local41 * this.aFloat163;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local41 = -arg4 / arg1;
			local65 = local41 * this.aFloat165 + this.aFloat164;
			local49 = this.aFloat171 + this.aFloat161 * local41;
			local57 = this.aFloat167 + this.aFloat169 * local41;
		} else {
			local41 = -arg4 / arg3;
			local65 = local41 * this.aFloat168 + this.aFloat164;
			local57 = this.aFloat167 + local41 * this.aFloat166;
			local49 = this.aFloat171 + local41 * this.aFloat170;
		}
		arg0[1] = this.aFloat161 * arg1 + this.aFloat162 * arg2 + arg3 * this.aFloat170;
		arg0[0] = this.aFloat163 * arg2 + this.aFloat165 * arg1 + this.aFloat168 * arg3;
		arg0[3] = -(arg0[1] * local49 + local65 * arg0[0] + arg0[2] * local57);
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	@Override
	public void method9250(@OriginalArg(0) int arg0) {
		this.aFloat163 = 1.0F;
		this.aFloat161 = this.aFloat166 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		this.aFloat169 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		this.aFloat170 = -this.aFloat169;
		this.aFloat165 = this.aFloat168 = this.aFloat164 = this.aFloat162 = this.aFloat171 = this.aFloat160 = this.aFloat167 = 0.0F;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat161 + (float) arg0 * this.aFloat162 + (float) arg2 * this.aFloat170);
		arg3[2] = (int) ((float) arg2 * this.aFloat166 + this.aFloat169 * (float) arg1 + (float) arg0 * this.aFloat160);
		arg3[0] = (int) (this.aFloat163 * (float) arg0 + this.aFloat165 * (float) arg1 + (float) arg2 * this.aFloat168);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat164 + (float) arg1 * this.aFloat165 + this.aFloat163 * (float) arg0 + this.aFloat168 * (float) arg2);
		arg3[1] = (int) ((float) arg2 * this.aFloat170 + (float) arg1 * this.aFloat161 + this.aFloat162 * (float) arg0 + this.aFloat171);
		arg3[2] = (int) (this.aFloat169 * (float) arg1 + (float) arg0 * this.aFloat160 + (float) arg2 * this.aFloat166 + this.aFloat167);
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	@Override
	public void method9248(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat163 = this.aFloat161 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		this.aFloat162 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		this.aFloat165 = -this.aFloat162;
		this.aFloat168 = this.aFloat164 = this.aFloat170 = this.aFloat171 = this.aFloat160 = this.aFloat169 = this.aFloat167 = 0.0F;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)[F")
	public float[] method7197() {
		Static1.aFloatArray40[12] = 0.0F;
		Static1.aFloatArray40[1] = this.aFloat162;
		Static1.aFloatArray40[2] = this.aFloat160;
		Static1.aFloatArray40[10] = this.aFloat166;
		Static1.aFloatArray40[6] = this.aFloat169;
		Static1.aFloatArray40[5] = this.aFloat161;
		Static1.aFloatArray40[14] = 0.0F;
		Static1.aFloatArray40[0] = this.aFloat163;
		Static1.aFloatArray40[8] = this.aFloat168;
		Static1.aFloatArray40[4] = this.aFloat165;
		Static1.aFloatArray40[13] = 0.0F;
		Static1.aFloatArray40[9] = this.aFloat170;
		return Static1.aFloatArray40;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	@Override
	public void method9242(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat162;
		@Pc(21) float local21 = this.aFloat161;
		@Pc(24) float local24 = this.aFloat170;
		this.aFloat162 = local18 * local9 - local15 * this.aFloat160;
		@Pc(38) float local38 = this.aFloat171;
		this.aFloat160 = local18 * local15 + this.aFloat160 * local9;
		this.aFloat161 = local9 * local21 - local15 * this.aFloat169;
		this.aFloat169 = this.aFloat169 * local9 + local15 * local21;
		this.aFloat170 = local24 * local9 - local15 * this.aFloat166;
		this.aFloat166 = local9 * this.aFloat166 + local15 * local24;
		this.aFloat171 = local38 * local9 - this.aFloat167 * local15;
		this.aFloat167 = local15 * local38 + this.aFloat167 * local9;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat171);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat164);
		@Pc(20) int local20 = (int) ((float) arg2 - this.aFloat167);
		arg3[1] = (int) (this.aFloat169 * (float) local20 + (float) local6 * this.aFloat161 + this.aFloat165 * (float) local13);
		arg3[0] = (int) (this.aFloat160 * (float) local20 + (float) local13 * this.aFloat163 + (float) local6 * this.aFloat162);
		arg3[2] = (int) (this.aFloat166 * (float) local20 + (float) local6 * this.aFloat170 + this.aFloat168 * (float) local13);
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)V")
	public void method7198() {
		this.aFloat166 = -this.aFloat166;
		this.aFloat171 = -this.aFloat171;
		this.aFloat169 = -this.aFloat169;
		this.aFloat161 = -this.aFloat161;
		this.aFloat167 = -this.aFloat167;
		this.aFloat160 = -this.aFloat160;
		this.aFloat170 = -this.aFloat170;
		this.aFloat162 = -this.aFloat162;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	@Override
	public void method9234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat171 = (float) arg1;
		this.aFloat163 = this.aFloat161 = this.aFloat166 = 1.0F;
		this.aFloat167 = (float) arg2;
		this.aFloat162 = this.aFloat160 = this.aFloat165 = this.aFloat169 = this.aFloat168 = this.aFloat170 = 0.0F;
		this.aFloat164 = (float) arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([I)V")
	@Override
	public void method9241(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat164;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat171;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat167;
		arg0[1] = (int) (local20 * this.aFloat161 + local12 * this.aFloat165 + this.aFloat169 * local29);
		arg0[0] = (int) (local12 * this.aFloat163 + local20 * this.aFloat162 + local29 * this.aFloat160);
		arg0[2] = (int) (this.aFloat166 * local29 + this.aFloat168 * local12 + local20 * this.aFloat170);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)[F")
	public float[] method7199() {
		Static1.aFloatArray40[13] = this.aFloat171;
		Static1.aFloatArray40[6] = this.aFloat169;
		Static1.aFloatArray40[8] = this.aFloat168;
		Static1.aFloatArray40[0] = this.aFloat163;
		Static1.aFloatArray40[4] = this.aFloat165;
		Static1.aFloatArray40[12] = this.aFloat164;
		Static1.aFloatArray40[2] = this.aFloat160;
		Static1.aFloatArray40[10] = this.aFloat166;
		Static1.aFloatArray40[9] = this.aFloat170;
		Static1.aFloatArray40[14] = this.aFloat167;
		Static1.aFloatArray40[5] = this.aFloat161;
		Static1.aFloatArray40[1] = this.aFloat162;
		return Static1.aFloatArray40;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class3_Sub11_Sub13.aFloatArray42[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class3_Sub11_Sub13.aFloatArray41[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class3_Sub11_Sub13.aFloatArray42[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class3_Sub11_Sub13.aFloatArray41[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class3_Sub11_Sub13.aFloatArray42[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class3_Sub11_Sub13.aFloatArray41[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat169 = -local15;
		this.aFloat170 = local27 * local39 + local21 * local43;
		this.aFloat168 = local33 * -local27 + local47 * local21;
		this.aFloat166 = local21 * local9;
		this.aFloat160 = local27 * local9;
		this.aFloat161 = local9 * local33;
		this.aFloat162 = local43 * local27 + local39 * -local21;
		this.aFloat163 = local33 * local21 + local47 * local27;
		this.aFloat165 = local39 * local9;
		this.aFloat164 = this.aFloat163 * (float) -arg0 - this.aFloat165 * (float) arg1 - (float) arg2 * this.aFloat168;
		this.aFloat171 = -((float) arg1 * this.aFloat161) + this.aFloat162 * (float) -arg0 - this.aFloat170 * (float) arg2;
		this.aFloat167 = -((float) arg2 * this.aFloat166) + this.aFloat160 * (float) -arg0 - (float) arg1 * this.aFloat169;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	@Override
	public void method9233(@OriginalArg(0) int arg0) {
		this.aFloat161 = 1.0F;
		this.aFloat163 = this.aFloat166 = Class3_Sub11_Sub13.aFloatArray42[arg0 & 0x3FFF];
		this.aFloat168 = Class3_Sub11_Sub13.aFloatArray41[arg0 & 0x3FFF];
		this.aFloat165 = this.aFloat164 = this.aFloat162 = this.aFloat170 = this.aFloat171 = this.aFloat169 = this.aFloat167 = 0.0F;
		this.aFloat160 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method9247(@OriginalArg(0) Class239 arg0) {
		@Pc(6) Class239_Sub2 local6 = (Class239_Sub2) arg0;
		this.aFloat165 = local6.aFloat165;
		this.aFloat167 = local6.aFloat167;
		this.aFloat164 = local6.aFloat164;
		this.aFloat161 = local6.aFloat161;
		this.aFloat166 = local6.aFloat166;
		this.aFloat171 = local6.aFloat171;
		this.aFloat162 = local6.aFloat162;
		this.aFloat169 = local6.aFloat169;
		this.aFloat168 = local6.aFloat168;
		this.aFloat160 = local6.aFloat160;
		this.aFloat163 = local6.aFloat163;
		this.aFloat170 = local6.aFloat170;
	}
}
