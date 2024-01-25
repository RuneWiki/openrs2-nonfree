import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class209_Sub3 extends Class209 {

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!ofa", name = "B", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!ofa", name = "H", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!ofa", name = "I", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!ofa", name = "J", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!ofa", name = "K", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!ofa", name = "N", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
	public Class209_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!ofa", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class209 arg0) {
		@Pc(6) Class209_Sub3 local6 = (Class209_Sub3) arg0;
		this.aFloat161 = local6.aFloat161;
		this.aFloat166 = local6.aFloat166;
		this.aFloat164 = local6.aFloat164;
		this.aFloat162 = local6.aFloat162;
		this.aFloat172 = local6.aFloat172;
		this.aFloat167 = local6.aFloat167;
		this.aFloat165 = local6.aFloat165;
		this.aFloat169 = local6.aFloat169;
		this.aFloat168 = local6.aFloat168;
		this.aFloat163 = local6.aFloat163;
		this.aFloat170 = local6.aFloat170;
		this.aFloat171 = local6.aFloat171;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6362() {
		@Pc(7) Class209_Sub3 local7 = new Class209_Sub3();
		local7.aFloat163 = this.aFloat163;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat162 = this.aFloat162;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat168 = this.aFloat168;
		return local7;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
	public void method5484() {
		this.aFloat172 = -this.aFloat172;
		this.aFloat170 = -this.aFloat170;
		this.aFloat166 = -this.aFloat166;
		this.aFloat169 = -this.aFloat169;
		this.aFloat165 = -this.aFloat165;
		this.aFloat171 = -this.aFloat171;
		this.aFloat161 = -this.aFloat161;
		this.aFloat168 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!ofa", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class341.aFloatArray71[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class341.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat164;
		@Pc(21) float local21 = this.aFloat163;
		@Pc(24) float local24 = this.aFloat167;
		@Pc(27) float local27 = this.aFloat162;
		this.aFloat164 = local18 * local9 - this.aFloat165 * local15;
		this.aFloat163 = local21 * local9 - local15 * this.aFloat161;
		this.aFloat165 = this.aFloat165 * local9 + local18 * local15;
		this.aFloat161 = local9 * this.aFloat161 + local15 * local21;
		this.aFloat167 = local24 * local9 - local15 * this.aFloat168;
		this.aFloat162 = local9 * local27 - local15 * this.aFloat171;
		this.aFloat168 = local24 * local15 + this.aFloat168 * local9;
		this.aFloat171 = this.aFloat171 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!ofa", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class341.aFloatArray71[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class341.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat164;
		@Pc(21) float local21 = this.aFloat163;
		@Pc(24) float local24 = this.aFloat167;
		this.aFloat164 = local15 * this.aFloat169 + local18 * local9;
		@Pc(37) float local37 = this.aFloat162;
		this.aFloat163 = local21 * local9 + this.aFloat166 * local15;
		this.aFloat169 = local9 * this.aFloat169 - local18 * local15;
		this.aFloat167 = local24 * local9 + this.aFloat172 * local15;
		this.aFloat166 = this.aFloat166 * local9 - local15 * local21;
		this.aFloat172 = this.aFloat172 * local9 - local15 * local24;
		this.aFloat162 = local37 * local9 + local15 * this.aFloat170;
		this.aFloat170 = local9 * this.aFloat170 - local37 * local15;
	}

	@OriginalMember(owner = "client!ofa", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class341.aFloatArray71[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class341.aFloatArray70[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class341.aFloatArray71[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class341.aFloatArray70[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class341.aFloatArray71[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class341.aFloatArray70[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat164 = local21 * local33 + local47 * local27;
		this.aFloat165 = local43 * local27 + local39 * -local21;
		this.aFloat166 = -local15;
		this.aFloat168 = local27 * local39 + local43 * local21;
		this.aFloat167 = local21 * local47 + -local27 * local33;
		this.aFloat169 = local9 * local27;
		this.aFloat163 = local9 * local39;
		this.aFloat172 = local21 * local9;
		this.aFloat161 = local9 * local33;
		this.aFloat170 = (float) -arg0 * this.aFloat169 - this.aFloat166 * (float) arg1 - (float) arg2 * this.aFloat172;
		this.aFloat162 = -(this.aFloat163 * (float) arg1) + this.aFloat164 * (float) -arg0 - this.aFloat167 * (float) arg2;
		this.aFloat171 = -((float) arg2 * this.aFloat168) + this.aFloat165 * (float) -arg0 - (float) arg1 * this.aFloat161;
	}

	@OriginalMember(owner = "client!ofa", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat164 = this.aFloat161 = this.aFloat172 = 1.0F;
		this.aFloat165 = this.aFloat169 = this.aFloat163 = this.aFloat166 = this.aFloat167 = this.aFloat168 = this.aFloat162 = this.aFloat171 = this.aFloat170 = 0.0F;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!q;)V")
	public void method5487(@OriginalArg(1) Class209 arg0) {
		@Pc(12) Class209_Sub3 local12 = (Class209_Sub3) arg0;
		this.aFloat167 = local12.aFloat169;
		this.aFloat163 = local12.aFloat165;
		this.aFloat164 = local12.aFloat164;
		this.aFloat161 = local12.aFloat161;
		this.aFloat169 = local12.aFloat167;
		this.aFloat168 = local12.aFloat166;
		this.aFloat165 = local12.aFloat163;
		this.aFloat172 = local12.aFloat172;
		this.aFloat166 = local12.aFloat168;
		this.aFloat162 = -(this.aFloat164 * local12.aFloat162 + this.aFloat163 * local12.aFloat171 + this.aFloat167 * local12.aFloat170);
		this.aFloat171 = -(this.aFloat165 * local12.aFloat162 + this.aFloat161 * local12.aFloat171 + local12.aFloat170 * this.aFloat168);
		this.aFloat170 = -(local12.aFloat171 * this.aFloat166 + local12.aFloat162 * this.aFloat169 + this.aFloat172 * local12.aFloat170);
	}

	@OriginalMember(owner = "client!ofa", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat172 = 1.0F;
		this.aFloat164 = this.aFloat161 = Class341.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat165 = Class341.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat163 = -this.aFloat165;
		this.aFloat167 = this.aFloat162 = this.aFloat168 = this.aFloat171 = this.aFloat169 = this.aFloat166 = this.aFloat170 = 0.0F;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(FFIFIII)V")
	public void method5488(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == 0) {
			this.aFloat165 = this.aFloat169 = this.aFloat163 = this.aFloat166 = this.aFloat167 = this.aFloat168 = 0.0F;
			this.aFloat161 = arg5;
			this.aFloat164 = arg4;
			this.aFloat172 = 1.0F;
		} else {
			@Pc(42) float local42 = Class341.aFloatArray71[arg2 & 0x3FFF];
			@Pc(48) float local48 = Class341.aFloatArray70[arg2 & 0x3FFF];
			this.aFloat161 = (float) arg5 * local42;
			this.aFloat169 = this.aFloat166 = this.aFloat167 = this.aFloat168 = 0.0F;
			this.aFloat172 = 1.0F;
			this.aFloat165 = local48 * (float) arg4;
			this.aFloat163 = (float) arg5 * -local48;
			this.aFloat164 = (float) arg4 * local42;
		}
		this.aFloat162 = arg3;
		this.aFloat170 = arg1;
		this.aFloat171 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat170 += arg2;
		this.aFloat162 += arg0;
		this.aFloat171 += arg1;
	}

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat161 = 1.0F;
		this.aFloat164 = this.aFloat172 = Class341.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat167 = Class341.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat169 = -this.aFloat167;
		this.aFloat163 = this.aFloat162 = this.aFloat165 = this.aFloat168 = this.aFloat171 = this.aFloat166 = this.aFloat170 = 0.0F;
	}

	@OriginalMember(owner = "client!ofa", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg2 * this.aFloat167 + (float) arg1 * this.aFloat163 + this.aFloat164 * (float) arg0);
		arg3[2] = (int) (this.aFloat172 * (float) arg2 + (float) arg1 * this.aFloat166 + (float) arg0 * this.aFloat169);
		arg3[1] = (int) ((float) arg2 * this.aFloat168 + this.aFloat161 * (float) arg1 + (float) arg0 * this.aFloat165);
	}

	@OriginalMember(owner = "client!ofa", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat164 = this.aFloat161 = this.aFloat172 = 1.0F;
		this.aFloat165 = this.aFloat169 = this.aFloat163 = this.aFloat166 = this.aFloat167 = this.aFloat168 = 0.0F;
		this.aFloat171 = arg1;
		this.aFloat162 = arg0;
		this.aFloat170 = arg2;
	}

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)[F")
	public float[] method5489() {
		Static166.aFloatArray14[5] = this.aFloat161;
		Static166.aFloatArray14[0] = this.aFloat164;
		Static166.aFloatArray14[6] = this.aFloat166;
		Static166.aFloatArray14[2] = this.aFloat169;
		Static166.aFloatArray14[12] = this.aFloat162;
		Static166.aFloatArray14[10] = this.aFloat172;
		Static166.aFloatArray14[1] = this.aFloat165;
		Static166.aFloatArray14[14] = this.aFloat170;
		Static166.aFloatArray14[4] = this.aFloat163;
		Static166.aFloatArray14[8] = this.aFloat167;
		Static166.aFloatArray14[13] = this.aFloat171;
		Static166.aFloatArray14[9] = this.aFloat168;
		return Static166.aFloatArray14;
	}

	@OriginalMember(owner = "client!ofa", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat164 = 1.0F;
		this.aFloat161 = this.aFloat172 = Class341.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat166 = Class341.aFloatArray70[arg0 & 0x3FFF];
		this.aFloat163 = this.aFloat167 = this.aFloat162 = this.aFloat165 = this.aFloat171 = this.aFloat169 = this.aFloat170 = 0.0F;
		this.aFloat168 = -this.aFloat166;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(FFZFF[F)V")
	public void method5490(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = this.aFloat172 * arg2 + arg3 * this.aFloat169 + arg0 * this.aFloat166;
		@Pc(63) float local63;
		@Pc(55) float local55;
		@Pc(47) float local47;
		@Pc(39) float local39;
		if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local39 = -arg1 / arg3;
			local47 = this.aFloat169 * local39 + this.aFloat170;
			local55 = this.aFloat171 + local39 * this.aFloat165;
			local63 = this.aFloat162 + local39 * this.aFloat164;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local39 = -arg1 / arg0;
			local55 = local39 * this.aFloat161 + this.aFloat171;
			local63 = this.aFloat162 + local39 * this.aFloat163;
			local47 = local39 * this.aFloat166 + this.aFloat170;
		} else {
			local39 = -arg1 / arg2;
			local55 = local39 * this.aFloat168 + this.aFloat171;
			local63 = this.aFloat162 + this.aFloat167 * local39;
			local47 = this.aFloat170 + this.aFloat172 * local39;
		}
		arg4[0] = arg2 * this.aFloat167 + arg3 * this.aFloat164 + this.aFloat163 * arg0;
		arg4[1] = this.aFloat161 * arg0 + this.aFloat165 * arg3 + arg2 * this.aFloat168;
		arg4[3] = -(local47 * arg4[2] + local55 * arg4[1] + arg4[0] * local63);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat171 + this.aFloat161 * (float) arg1 + (float) arg0 * this.aFloat165 + (float) arg2 * this.aFloat168);
		arg3[2] = (int) (this.aFloat172 * (float) arg2 + (float) arg1 * this.aFloat166 + (float) arg0 * this.aFloat169 + this.aFloat170);
		arg3[0] = (int) (this.aFloat164 * (float) arg0 + this.aFloat163 * (float) arg1 + (float) arg2 * this.aFloat167 + this.aFloat162);
	}

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class341.aFloatArray71[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class341.aFloatArray70[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat165;
		@Pc(21) float local21 = this.aFloat161;
		@Pc(24) float local24 = this.aFloat168;
		@Pc(27) float local27 = this.aFloat171;
		this.aFloat165 = local9 * local18 - this.aFloat169 * local15;
		this.aFloat169 = this.aFloat169 * local9 + local15 * local18;
		this.aFloat161 = local21 * local9 - this.aFloat166 * local15;
		this.aFloat166 = local9 * this.aFloat166 + local15 * local21;
		this.aFloat168 = local24 * local9 - local15 * this.aFloat172;
		this.aFloat172 = local9 * this.aFloat172 + local15 * local24;
		this.aFloat171 = local27 * local9 - this.aFloat170 * local15;
		this.aFloat170 = local9 * this.aFloat170 + local15 * local27;
	}

	@OriginalMember(owner = "client!ofa", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat162;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat171;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat170;
		arg0[2] = (int) (this.aFloat172 * local28 + this.aFloat167 * local12 + this.aFloat168 * local20);
		arg0[1] = (int) (local28 * this.aFloat166 + this.aFloat161 * local20 + this.aFloat163 * local12);
		arg0[0] = (int) (local20 * this.aFloat165 + this.aFloat164 * local12 + this.aFloat169 * local28);
	}

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)[F")
	public float[] method5491() {
		Static166.aFloatArray14[9] = this.aFloat168;
		Static166.aFloatArray14[8] = this.aFloat167;
		Static166.aFloatArray14[5] = this.aFloat161;
		Static166.aFloatArray14[12] = 0.0F;
		Static166.aFloatArray14[10] = this.aFloat172;
		Static166.aFloatArray14[4] = this.aFloat163;
		Static166.aFloatArray14[14] = 0.0F;
		Static166.aFloatArray14[13] = 0.0F;
		Static166.aFloatArray14[1] = this.aFloat165;
		Static166.aFloatArray14[6] = this.aFloat166;
		Static166.aFloatArray14[2] = this.aFloat169;
		Static166.aFloatArray14[0] = this.aFloat164;
		return Static166.aFloatArray14;
	}
}
