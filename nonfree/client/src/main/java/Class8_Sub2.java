import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!pb", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat158 = this.aFloat161 = this.aFloat163 = this.aFloat168 = this.aFloat165 = this.aFloat167 = 0.0F;
		this.aFloat160 = arg2;
		this.aFloat164 = arg0;
		this.aFloat166 = this.aFloat159 = this.aFloat169 = 1.0F;
		this.aFloat162 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat166 * (float) arg0 + this.aFloat163 * (float) arg1 + (float) arg2 * this.aFloat165 + this.aFloat164);
		arg3[1] = (int) (this.aFloat159 * (float) arg1 + this.aFloat158 * (float) arg0 + (float) arg2 * this.aFloat167 + this.aFloat162);
		arg3[2] = (int) (this.aFloat169 * (float) arg2 + (float) arg1 * this.aFloat168 + (float) arg0 * this.aFloat161 + this.aFloat160);
	}

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat159 * (float) arg1 + (float) arg0 * this.aFloat158 + this.aFloat167 * (float) arg2);
		arg3[2] = (int) ((float) arg1 * this.aFloat168 + this.aFloat161 * (float) arg0 + (float) arg2 * this.aFloat169);
		arg3[0] = (int) ((float) arg2 * this.aFloat165 + (float) arg0 * this.aFloat166 + (float) arg1 * this.aFloat163);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class8 method8175() {
		@Pc(7) Class8_Sub2 local7 = new Class8_Sub2();
		local7.aFloat168 = this.aFloat168;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat163 = this.aFloat163;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat159 = this.aFloat159;
		local7.aFloat158 = this.aFloat158;
		local7.aFloat162 = this.aFloat162;
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat164;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat162;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat160;
		arg0[2] = (int) (local28 * this.aFloat169 + this.aFloat165 * local12 + this.aFloat167 * local20);
		arg0[1] = (int) (this.aFloat168 * local28 + local20 * this.aFloat159 + this.aFloat163 * local12);
		arg0[0] = (int) (this.aFloat158 * local20 + this.aFloat166 * local12 + local28 * this.aFloat161);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)[F")
	public float[] method6053() {
		Static569.aFloatArray68[1] = this.aFloat158;
		Static569.aFloatArray68[2] = this.aFloat161;
		Static569.aFloatArray68[0] = this.aFloat166;
		Static569.aFloatArray68[6] = this.aFloat168;
		Static569.aFloatArray68[12] = this.aFloat164;
		Static569.aFloatArray68[10] = this.aFloat169;
		Static569.aFloatArray68[14] = this.aFloat160;
		Static569.aFloatArray68[8] = this.aFloat165;
		Static569.aFloatArray68[4] = this.aFloat163;
		Static569.aFloatArray68[5] = this.aFloat159;
		Static569.aFloatArray68[9] = this.aFloat167;
		Static569.aFloatArray68[13] = this.aFloat162;
		return Static569.aFloatArray68;
	}

	@OriginalMember(owner = "client!pb", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) arg0;
		this.aFloat158 = local6.aFloat158;
		this.aFloat163 = local6.aFloat163;
		this.aFloat168 = local6.aFloat168;
		this.aFloat161 = local6.aFloat161;
		this.aFloat160 = local6.aFloat160;
		this.aFloat169 = local6.aFloat169;
		this.aFloat167 = local6.aFloat167;
		this.aFloat159 = local6.aFloat159;
		this.aFloat164 = local6.aFloat164;
		this.aFloat162 = local6.aFloat162;
		this.aFloat165 = local6.aFloat165;
		this.aFloat166 = local6.aFloat166;
	}

	@OriginalMember(owner = "client!pb", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat159 = this.aFloat169 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat168 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat163 = this.aFloat165 = this.aFloat164 = this.aFloat158 = this.aFloat162 = this.aFloat161 = this.aFloat160 = 0.0F;
		this.aFloat167 = -this.aFloat168;
	}

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat158;
		@Pc(21) float local21 = this.aFloat159;
		@Pc(24) float local24 = this.aFloat167;
		@Pc(27) float local27 = this.aFloat162;
		this.aFloat158 = local9 * local18 - this.aFloat161 * local15;
		this.aFloat161 = local9 * this.aFloat161 + local15 * local18;
		this.aFloat159 = local21 * local9 - this.aFloat168 * local15;
		this.aFloat167 = local24 * local9 - local15 * this.aFloat169;
		this.aFloat168 = local21 * local15 + this.aFloat168 * local9;
		this.aFloat169 = local15 * local24 + this.aFloat169 * local9;
		this.aFloat162 = local27 * local9 - this.aFloat160 * local15;
		this.aFloat160 = local15 * local27 + this.aFloat160 * local9;
	}

	@OriginalMember(owner = "client!pb", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat169 = 1.0F;
		this.aFloat166 = this.aFloat159 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat158 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat163 = -this.aFloat158;
		this.aFloat165 = this.aFloat164 = this.aFloat167 = this.aFloat162 = this.aFloat161 = this.aFloat168 = this.aFloat160 = 0.0F;
	}

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat166 = this.aFloat159 = this.aFloat169 = 1.0F;
		this.aFloat158 = this.aFloat161 = this.aFloat163 = this.aFloat168 = this.aFloat165 = this.aFloat167 = this.aFloat164 = this.aFloat162 = this.aFloat160 = 0.0F;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!q;B)V")
	public void method6054(@OriginalArg(0) Class8 arg0) {
		@Pc(6) Class8_Sub2 local6 = (Class8_Sub2) arg0;
		this.aFloat163 = local6.aFloat158;
		this.aFloat166 = local6.aFloat166;
		this.aFloat165 = local6.aFloat161;
		this.aFloat159 = local6.aFloat159;
		this.aFloat167 = local6.aFloat168;
		this.aFloat161 = local6.aFloat165;
		this.aFloat158 = local6.aFloat163;
		this.aFloat164 = -(this.aFloat163 * local6.aFloat162 + local6.aFloat164 * this.aFloat166 + local6.aFloat160 * this.aFloat165);
		this.aFloat169 = local6.aFloat169;
		this.aFloat168 = local6.aFloat167;
		this.aFloat162 = -(this.aFloat167 * local6.aFloat160 + local6.aFloat164 * this.aFloat158 + this.aFloat159 * local6.aFloat162);
		this.aFloat160 = -(local6.aFloat160 * this.aFloat169 + local6.aFloat162 * this.aFloat168 + this.aFloat161 * local6.aFloat164);
	}

	@OriginalMember(owner = "client!pb", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub44.aFloatArray62[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub44.aFloatArray63[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub44.aFloatArray62[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub44.aFloatArray63[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub44.aFloatArray62[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub44.aFloatArray63[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat168 = -local15;
		this.aFloat161 = local27 * local9;
		this.aFloat165 = local21 * local47 + -local27 * local33;
		this.aFloat163 = local9 * local39;
		this.aFloat169 = local9 * local21;
		this.aFloat158 = -local21 * local39 + local27 * local43;
		this.aFloat159 = local9 * local33;
		this.aFloat167 = local27 * local39 + local21 * local43;
		this.aFloat166 = local27 * local47 + local21 * local33;
		this.aFloat160 = -(this.aFloat168 * (float) arg1) + this.aFloat161 * (float) -arg0 - (float) arg2 * this.aFloat169;
		this.aFloat164 = -((float) arg1 * this.aFloat163) + this.aFloat166 * (float) -arg0 - (float) arg2 * this.aFloat165;
		this.aFloat162 = this.aFloat158 * (float) -arg0 - this.aFloat159 * (float) arg1 - this.aFloat167 * (float) arg2;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat159 = 1.0F;
		this.aFloat166 = this.aFloat169 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat165 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat163 = this.aFloat164 = this.aFloat158 = this.aFloat167 = this.aFloat162 = this.aFloat168 = this.aFloat160 = 0.0F;
		this.aFloat161 = -this.aFloat165;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)[F")
	public float[] method6058() {
		Static569.aFloatArray68[4] = this.aFloat163;
		Static569.aFloatArray68[5] = this.aFloat159;
		Static569.aFloatArray68[13] = 0.0F;
		Static569.aFloatArray68[12] = 0.0F;
		Static569.aFloatArray68[8] = this.aFloat165;
		Static569.aFloatArray68[2] = this.aFloat161;
		Static569.aFloatArray68[9] = this.aFloat167;
		Static569.aFloatArray68[14] = 0;
		Static569.aFloatArray68[10] = this.aFloat169;
		Static569.aFloatArray68[6] = this.aFloat168;
		Static569.aFloatArray68[1] = this.aFloat158;
		Static569.aFloatArray68[0] = this.aFloat166;
		return Static569.aFloatArray68;
	}

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat160 += arg2;
		this.aFloat162 += arg1;
		this.aFloat164 += arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIFFFZI)V")
	public void method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			this.aFloat169 = 1.0F;
			this.aFloat158 = this.aFloat161 = this.aFloat163 = this.aFloat168 = this.aFloat165 = this.aFloat167 = 0.0F;
			this.aFloat159 = arg1;
			this.aFloat166 = arg5;
		} else {
			@Pc(38) float local38 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
			@Pc(44) float local44 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
			this.aFloat169 = 1.0F;
			this.aFloat166 = local38 * (float) arg5;
			this.aFloat158 = (float) arg5 * local44;
			this.aFloat159 = local38 * (float) arg1;
			this.aFloat161 = this.aFloat168 = this.aFloat165 = this.aFloat167 = 0.0F;
			this.aFloat163 = (float) arg1 * -local44;
		}
		this.aFloat164 = arg3;
		this.aFloat162 = arg4;
		this.aFloat160 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub44.aFloatArray62[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub44.aFloatArray63[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat166;
		@Pc(21) float local21 = this.aFloat163;
		@Pc(24) float local24 = this.aFloat165;
		@Pc(27) float local27 = this.aFloat164;
		this.aFloat166 = local18 * local9 + this.aFloat161 * local15;
		this.aFloat161 = local9 * this.aFloat161 - local18 * local15;
		this.aFloat163 = local9 * local21 + this.aFloat168 * local15;
		this.aFloat165 = local15 * this.aFloat169 + local9 * local24;
		this.aFloat168 = local9 * this.aFloat168 - local15 * local21;
		this.aFloat164 = this.aFloat160 * local15 + local9 * local27;
		this.aFloat169 = this.aFloat169 * local9 - local15 * local24;
		this.aFloat160 = local9 * this.aFloat160 - local27 * local15;
	}
}
