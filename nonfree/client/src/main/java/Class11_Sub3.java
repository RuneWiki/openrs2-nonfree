import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "F")
	public float aFloat163;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!uv", name = "G", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!uv", name = "H", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	public Class11_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!uv", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class11 arg0) {
		@Pc(6) Class11_Sub3 local6 = (Class11_Sub3) arg0;
		this.aFloat165 = local6.aFloat165;
		this.aFloat171 = local6.aFloat171;
		this.aFloat161 = local6.aFloat161;
		this.aFloat160 = local6.aFloat160;
		this.aFloat169 = local6.aFloat169;
		this.aFloat164 = local6.aFloat164;
		this.aFloat170 = local6.aFloat170;
		this.aFloat162 = local6.aFloat162;
		this.aFloat166 = local6.aFloat166;
		this.aFloat163 = local6.aFloat163;
		this.aFloat168 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
	}

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat161 = 1.0F;
		this.aFloat167 = this.aFloat160 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat165 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat169 = this.aFloat162 = this.aFloat170 = this.aFloat166 = this.aFloat168 = this.aFloat164 = this.aFloat171 = 0.0F;
		this.aFloat163 = -this.aFloat165;
	}

	@OriginalMember(owner = "client!uv", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat160 = 1.0F;
		this.aFloat167 = this.aFloat161 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat170 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat165 = this.aFloat162 = this.aFloat166 = this.aFloat168 = this.aFloat163 = this.aFloat164 = this.aFloat171 = 0.0F;
		this.aFloat169 = -this.aFloat170;
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat170;
		@Pc(21) float local21 = this.aFloat161;
		@Pc(24) float local24 = this.aFloat166;
		@Pc(27) float local27 = this.aFloat168;
		this.aFloat170 = local18 * local9 - this.aFloat163 * local15;
		this.aFloat161 = local21 * local9 - local15 * this.aFloat164;
		this.aFloat163 = this.aFloat163 * local9 + local18 * local15;
		this.aFloat164 = local9 * this.aFloat164 + local15 * local21;
		this.aFloat166 = local9 * local24 - this.aFloat160 * local15;
		this.aFloat168 = local27 * local9 - this.aFloat171 * local15;
		this.aFloat160 = this.aFloat160 * local9 + local24 * local15;
		this.aFloat171 = local15 * local27 + this.aFloat171 * local9;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat165 * (float) arg2 + (float) arg0 * this.aFloat167 + (float) arg1 * this.aFloat169 + this.aFloat162);
		arg3[1] = (int) (this.aFloat168 + this.aFloat170 * (float) arg0 + this.aFloat161 * (float) arg1 + this.aFloat166 * (float) arg2);
		arg3[2] = (int) (this.aFloat171 + (float) arg1 * this.aFloat164 + (float) arg0 * this.aFloat163 + this.aFloat160 * (float) arg2);
	}

	@OriginalMember(owner = "client!uv", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat161 = this.aFloat160 = Class295.aFloatArray84[arg0 & 0x3FFF];
		this.aFloat164 = Class295.aFloatArray85[arg0 & 0x3FFF];
		this.aFloat169 = this.aFloat165 = this.aFloat162 = this.aFloat170 = this.aFloat168 = this.aFloat163 = this.aFloat171 = 0.0F;
		this.aFloat166 = -this.aFloat164;
	}

	@OriginalMember(owner = "client!uv", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat162;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat168;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat171;
		arg0[2] = (int) (this.aFloat166 * local20 + this.aFloat165 * local11 + this.aFloat160 * local29);
		arg0[0] = (int) (this.aFloat170 * local20 + local11 * this.aFloat167 + this.aFloat163 * local29);
		arg0[1] = (int) (this.aFloat164 * local29 + local11 * this.aFloat169 + local20 * this.aFloat161);
	}

	@OriginalMember(owner = "client!uv", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat170 = this.aFloat163 = this.aFloat169 = this.aFloat164 = this.aFloat165 = this.aFloat166 = this.aFloat162 = this.aFloat168 = this.aFloat171 = 0.0F;
		this.aFloat167 = this.aFloat161 = this.aFloat160 = 1.0F;
	}

	@OriginalMember(owner = "client!uv", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat167 = this.aFloat161 = this.aFloat160 = 1.0F;
		this.aFloat170 = this.aFloat163 = this.aFloat169 = this.aFloat164 = this.aFloat165 = this.aFloat166 = 0.0F;
		this.aFloat171 = arg2;
		this.aFloat168 = arg1;
		this.aFloat162 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat169;
		@Pc(24) float local24 = this.aFloat165;
		this.aFloat167 = local18 * local9 + local15 * this.aFloat163;
		@Pc(37) float local37 = this.aFloat162;
		this.aFloat169 = local9 * local21 + local15 * this.aFloat164;
		this.aFloat163 = this.aFloat163 * local9 - local15 * local18;
		this.aFloat164 = local9 * this.aFloat164 - local15 * local21;
		this.aFloat165 = local9 * local24 + this.aFloat160 * local15;
		this.aFloat162 = local15 * this.aFloat171 + local9 * local37;
		this.aFloat160 = this.aFloat160 * local9 - local24 * local15;
		this.aFloat171 = local9 * this.aFloat171 - local15 * local37;
	}

	@OriginalMember(owner = "client!uv", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class295.aFloatArray84[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class295.aFloatArray85[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class295.aFloatArray84[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class295.aFloatArray85[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat167 = local33 * local21 + local47 * local27;
		this.aFloat160 = local9 * local21;
		this.aFloat165 = local47 * local21 + local33 * -local27;
		this.aFloat164 = -local15;
		this.aFloat166 = local43 * local21 + local27 * local39;
		this.aFloat163 = local9 * local27;
		this.aFloat169 = local39 * local9;
		this.aFloat161 = local9 * local33;
		this.aFloat170 = local43 * local27 + local39 * -local21;
		this.aFloat171 = (float) -arg0 * this.aFloat163 - (float) arg1 * this.aFloat164 - this.aFloat160 * (float) arg2;
		this.aFloat168 = -((float) arg2 * this.aFloat166) - (float) arg1 * this.aFloat161 + (float) -arg0 * this.aFloat170;
		this.aFloat162 = -(this.aFloat165 * (float) arg2) - (float) arg1 * this.aFloat169 + (float) -arg0 * this.aFloat167;
	}

	@OriginalMember(owner = "client!uv", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class295.aFloatArray84[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class295.aFloatArray85[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat169;
		@Pc(24) float local24 = this.aFloat165;
		@Pc(27) float local27 = this.aFloat162;
		this.aFloat167 = local18 * local9 - local15 * this.aFloat170;
		this.aFloat170 = local15 * local18 + local9 * this.aFloat170;
		this.aFloat169 = local9 * local21 - this.aFloat161 * local15;
		this.aFloat161 = this.aFloat161 * local9 + local15 * local21;
		this.aFloat165 = local9 * local24 - this.aFloat166 * local15;
		this.aFloat166 = local15 * local24 + local9 * this.aFloat166;
		this.aFloat162 = local27 * local9 - local15 * this.aFloat168;
		this.aFloat168 = this.aFloat168 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7214() {
		@Pc(7) Class11_Sub3 local7 = new Class11_Sub3();
		local7.aFloat162 = this.aFloat162;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat164 = this.aFloat164;
		local7.aFloat163 = this.aFloat163;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat169 = this.aFloat169;
		local7.aFloat161 = this.aFloat161;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat160 = this.aFloat160;
		local7.aFloat171 = this.aFloat171;
		return local7;
	}

	@OriginalMember(owner = "client!uv", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat166 + this.aFloat170 * (float) arg0 + this.aFloat161 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat165 + this.aFloat167 * (float) arg0 + this.aFloat169 * (float) arg1);
		arg3[2] = (int) (this.aFloat164 * (float) arg1 + (float) arg0 * this.aFloat163 + (float) arg2 * this.aFloat160);
	}

	@OriginalMember(owner = "client!uv", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat168 += arg1;
		this.aFloat162 += arg0;
		this.aFloat171 += arg2;
	}
}
