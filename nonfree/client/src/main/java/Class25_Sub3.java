import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class25_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!nd", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class113.aFloatArray10[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class113.aFloatArray9[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class113.aFloatArray10[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class113.aFloatArray9[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat166 = local33 * local21 + local27 * local47;
		this.aFloat174 = local9 * local21;
		this.aFloat165 = local9 * local27;
		this.aFloat168 = local47 * local21 + -local27 * local33;
		this.aFloat171 = local39 * local9;
		this.aFloat167 = -local15;
		this.aFloat164 = -local21 * local39 + local43 * local27;
		this.aFloat170 = local43 * local21 + local27 * local39;
		this.aFloat173 = local33 * local9;
		this.aFloat163 = -(this.aFloat170 * (float) arg2) + (float) -arg0 * this.aFloat164 - this.aFloat173 * (float) arg1;
		this.aFloat169 = (float) -arg0 * this.aFloat165 - this.aFloat167 * (float) arg1 - (float) arg2 * this.aFloat174;
		this.aFloat172 = -((float) arg2 * this.aFloat168) + (float) -arg0 * this.aFloat166 - (float) arg1 * this.aFloat171;
	}

	@OriginalMember(owner = "client!nd", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat166;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat168;
		@Pc(27) float local27 = this.aFloat172;
		this.aFloat166 = local9 * local18 - local15 * this.aFloat164;
		this.aFloat171 = local9 * local21 - this.aFloat173 * local15;
		this.aFloat164 = local9 * this.aFloat164 + local15 * local18;
		this.aFloat168 = local9 * local24 - local15 * this.aFloat170;
		this.aFloat173 = this.aFloat173 * local9 + local15 * local21;
		this.aFloat172 = local27 * local9 - local15 * this.aFloat163;
		this.aFloat170 = local24 * local15 + this.aFloat170 * local9;
		this.aFloat163 = local15 * local27 + local9 * this.aFloat163;
	}

	@OriginalMember(owner = "client!nd", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat170 * (float) arg2 + (float) arg1 * this.aFloat173 + (float) arg0 * this.aFloat164);
		arg3[2] = (int) (this.aFloat167 * (float) arg1 + this.aFloat165 * (float) arg0 + this.aFloat174 * (float) arg2);
		arg3[0] = (int) (this.aFloat168 * (float) arg2 + (float) arg0 * this.aFloat166 + this.aFloat171 * (float) arg1);
	}

	@OriginalMember(owner = "client!nd", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat166;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat168;
		this.aFloat166 = local9 * local18 + this.aFloat165 * local15;
		@Pc(37) float local37 = this.aFloat172;
		this.aFloat171 = local15 * this.aFloat167 + local9 * local21;
		this.aFloat165 = local9 * this.aFloat165 - local15 * local18;
		this.aFloat167 = local9 * this.aFloat167 - local21 * local15;
		this.aFloat168 = local24 * local9 + this.aFloat174 * local15;
		this.aFloat174 = local9 * this.aFloat174 - local24 * local15;
		this.aFloat172 = local9 * local37 + this.aFloat169 * local15;
		this.aFloat169 = local9 * this.aFloat169 - local37 * local15;
	}

	@OriginalMember(owner = "client!nd", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat172;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat163;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat169;
		arg0[2] = (int) (this.aFloat174 * local29 + this.aFloat170 * local20 + local12 * this.aFloat168);
		arg0[0] = (int) (local12 * this.aFloat166 + local20 * this.aFloat164 + this.aFloat165 * local29);
		arg0[1] = (int) (local29 * this.aFloat167 + local12 * this.aFloat171 + this.aFloat173 * local20);
	}

	@OriginalMember(owner = "client!nd", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat166 = this.aFloat173 = this.aFloat174 = 1.0F;
		this.aFloat169 = arg2;
		this.aFloat163 = arg1;
		this.aFloat172 = arg0;
		this.aFloat164 = this.aFloat165 = this.aFloat171 = this.aFloat167 = this.aFloat168 = this.aFloat170 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class113.aFloatArray10[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class113.aFloatArray9[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat164;
		@Pc(21) float local21 = this.aFloat173;
		@Pc(24) float local24 = this.aFloat170;
		this.aFloat164 = local9 * local18 - this.aFloat165 * local15;
		@Pc(38) float local38 = this.aFloat163;
		this.aFloat165 = local18 * local15 + local9 * this.aFloat165;
		this.aFloat173 = local9 * local21 - local15 * this.aFloat167;
		this.aFloat170 = local24 * local9 - local15 * this.aFloat174;
		this.aFloat167 = this.aFloat167 * local9 + local15 * local21;
		this.aFloat174 = this.aFloat174 * local9 + local24 * local15;
		this.aFloat163 = local9 * local38 - this.aFloat169 * local15;
		this.aFloat169 = local38 * local15 + local9 * this.aFloat169;
	}

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "(III[I)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat169);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat172);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat163);
		arg3[1] = (int) ((float) local6 * this.aFloat167 + (float) local24 * this.aFloat173 + (float) local17 * this.aFloat171);
		arg3[2] = (int) ((float) local17 * this.aFloat168 + this.aFloat170 * (float) local24 + (float) local6 * this.aFloat174);
		arg3[0] = (int) (this.aFloat166 * (float) local17 + (float) local24 * this.aFloat164 + (float) local6 * this.aFloat165);
	}

	@OriginalMember(owner = "client!nd", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat166 = 1.0F;
		this.aFloat173 = this.aFloat174 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat167 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat171 = this.aFloat168 = this.aFloat172 = this.aFloat164 = this.aFloat163 = this.aFloat165 = this.aFloat169 = 0.0F;
		this.aFloat170 = -this.aFloat167;
	}

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub3 local6 = (Class25_Sub3) arg0;
		this.aFloat163 = local6.aFloat163;
		this.aFloat167 = local6.aFloat167;
		this.aFloat169 = local6.aFloat169;
		this.aFloat170 = local6.aFloat170;
		this.aFloat168 = local6.aFloat168;
		this.aFloat166 = local6.aFloat166;
		this.aFloat165 = local6.aFloat165;
		this.aFloat174 = local6.aFloat174;
		this.aFloat173 = local6.aFloat173;
		this.aFloat164 = local6.aFloat164;
		this.aFloat171 = local6.aFloat171;
		this.aFloat172 = local6.aFloat172;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class25 method5883() {
		@Pc(7) Class25_Sub3 local7 = new Class25_Sub3();
		local7.aFloat165 = this.aFloat165;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat173 = this.aFloat173;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat163 = this.aFloat163;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat168 = this.aFloat168;
		return local7;
	}

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat173 = 1.0F;
		this.aFloat166 = this.aFloat174 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat168 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat165 = -this.aFloat168;
		this.aFloat171 = this.aFloat172 = this.aFloat164 = this.aFloat170 = this.aFloat163 = this.aFloat167 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat164 = this.aFloat165 = this.aFloat171 = this.aFloat167 = this.aFloat168 = this.aFloat170 = this.aFloat172 = this.aFloat163 = this.aFloat169 = 0.0F;
		this.aFloat166 = this.aFloat173 = this.aFloat174 = 1.0F;
	}

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat174 = 1.0F;
		this.aFloat166 = this.aFloat173 = Class113.aFloatArray10[arg0 & 0x3FFF];
		this.aFloat164 = Class113.aFloatArray9[arg0 & 0x3FFF];
		this.aFloat171 = -this.aFloat164;
		this.aFloat168 = this.aFloat172 = this.aFloat170 = this.aFloat163 = this.aFloat165 = this.aFloat167 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat172 + (float) arg0 * this.aFloat166 + (float) arg1 * this.aFloat171 + (float) arg2 * this.aFloat168);
		arg3[1] = (int) (this.aFloat163 + this.aFloat173 * (float) arg1 + this.aFloat164 * (float) arg0 + (float) arg2 * this.aFloat170);
		arg3[2] = (int) ((float) arg1 * this.aFloat167 + (float) arg0 * this.aFloat165 + this.aFloat174 * (float) arg2 + this.aFloat169);
	}

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat163 += arg1;
		this.aFloat169 += arg2;
		this.aFloat172 += arg0;
	}
}
