import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!iv", name = "H", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!iv", name = "I", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!iv", name = "J", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!iv", name = "K", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class154_Sub1() {
		this.method6564();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat91 += (float) arg1;
		this.aFloat86 += (float) arg0;
		this.aFloat89 += (float) arg2;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method6574() {
		@Pc(7) Class154_Sub1 local7 = new Class154_Sub1();
		local7.aFloat86 = this.aFloat86;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat92 = this.aFloat92;
		return local7;
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V")
	@Override
	public void method6572(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat85;
		@Pc(21) float local21 = this.aFloat84;
		@Pc(24) float local24 = this.aFloat92;
		@Pc(27) float local27 = this.aFloat86;
		this.aFloat85 = local18 * local9 - local15 * this.aFloat93;
		this.aFloat84 = local9 * local21 - this.aFloat88 * local15;
		this.aFloat93 = this.aFloat93 * local9 + local18 * local15;
		this.aFloat92 = local9 * local24 - this.aFloat90 * local15;
		this.aFloat88 = this.aFloat88 * local9 + local21 * local15;
		this.aFloat90 = local24 * local15 + local9 * this.aFloat90;
		this.aFloat86 = local27 * local9 - this.aFloat91 * local15;
		this.aFloat91 = this.aFloat91 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	@Override
	public void method6557(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat93;
		@Pc(21) float local21 = this.aFloat88;
		@Pc(24) float local24 = this.aFloat90;
		@Pc(27) float local27 = this.aFloat91;
		this.aFloat93 = local18 * local9 - this.aFloat82 * local15;
		this.aFloat88 = local21 * local9 - local15 * this.aFloat83;
		this.aFloat82 = this.aFloat82 * local9 + local18 * local15;
		this.aFloat83 = local9 * this.aFloat83 + local15 * local21;
		this.aFloat90 = local24 * local9 - this.aFloat87 * local15;
		this.aFloat91 = local9 * local27 - local15 * this.aFloat89;
		this.aFloat87 = local9 * this.aFloat87 + local24 * local15;
		this.aFloat89 = this.aFloat89 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0) {
		this.aFloat88 = 1.0F;
		this.aFloat85 = this.aFloat87 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat92 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat82 = -this.aFloat92;
		this.aFloat84 = this.aFloat86 = this.aFloat93 = this.aFloat90 = this.aFloat91 = this.aFloat83 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	@Override
	public void method6558(@OriginalArg(0) int arg0) {
		this.aFloat85 = 1.0F;
		this.aFloat88 = this.aFloat87 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat83 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat84 = this.aFloat92 = this.aFloat86 = this.aFloat93 = this.aFloat91 = this.aFloat82 = this.aFloat89 = 0.0F;
		this.aFloat90 = -this.aFloat83;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat91);
		@Pc(13) int local13 = (int) ((float) arg0 - this.aFloat86);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat89);
		arg3[0] = (int) (this.aFloat82 * (float) local24 + (float) local13 * this.aFloat85 + (float) local6 * this.aFloat93);
		arg3[1] = (int) (this.aFloat88 * (float) local6 + (float) local13 * this.aFloat84 + (float) local24 * this.aFloat83);
		arg3[2] = (int) (this.aFloat87 * (float) local24 + (float) local6 * this.aFloat90 + (float) local13 * this.aFloat92);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat89 + (float) arg0 * this.aFloat82 + this.aFloat83 * (float) arg1 + (float) arg2 * this.aFloat87);
		arg3[1] = (int) (this.aFloat88 * (float) arg1 + (float) arg0 * this.aFloat93 + (float) arg2 * this.aFloat90 + this.aFloat91);
		arg3[0] = (int) (this.aFloat86 + this.aFloat92 * (float) arg2 + this.aFloat84 * (float) arg1 + this.aFloat85 * (float) arg0);
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	@Override
	public void method6566(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat85;
		@Pc(21) float local21 = this.aFloat84;
		@Pc(24) float local24 = this.aFloat92;
		@Pc(27) float local27 = this.aFloat86;
		this.aFloat85 = this.aFloat82 * local15 + local9 * local18;
		this.aFloat84 = local15 * this.aFloat83 + local9 * local21;
		this.aFloat82 = this.aFloat82 * local9 - local18 * local15;
		this.aFloat83 = this.aFloat83 * local9 - local21 * local15;
		this.aFloat92 = this.aFloat87 * local15 + local9 * local24;
		this.aFloat86 = this.aFloat89 * local15 + local27 * local9;
		this.aFloat87 = local9 * this.aFloat87 - local15 * local24;
		this.aFloat89 = this.aFloat89 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "()V")
	@Override
	public void method6564() {
		this.aFloat85 = this.aFloat88 = this.aFloat87 = 1.0F;
		this.aFloat93 = this.aFloat82 = this.aFloat84 = this.aFloat83 = this.aFloat92 = this.aFloat90 = this.aFloat86 = this.aFloat91 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([I)V")
	@Override
	public void method6560(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat86;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat91;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat89;
		arg0[0] = (int) (this.aFloat82 * local27 + this.aFloat85 * local11 + local19 * this.aFloat93);
		arg0[1] = (int) (local27 * this.aFloat83 + local11 * this.aFloat84 + local19 * this.aFloat88);
		arg0[2] = (int) (this.aFloat87 * local27 + this.aFloat90 * local19 + local11 * this.aFloat92);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6563(@OriginalArg(0) Class154 arg0) {
		@Pc(6) Class154_Sub1 local6 = (Class154_Sub1) arg0;
		this.aFloat93 = local6.aFloat93;
		this.aFloat92 = local6.aFloat92;
		this.aFloat86 = local6.aFloat86;
		this.aFloat84 = local6.aFloat84;
		this.aFloat91 = local6.aFloat91;
		this.aFloat89 = local6.aFloat89;
		this.aFloat85 = local6.aFloat85;
		this.aFloat87 = local6.aFloat87;
		this.aFloat83 = local6.aFloat83;
		this.aFloat88 = local6.aFloat88;
		this.aFloat82 = local6.aFloat82;
		this.aFloat90 = local6.aFloat90;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III)V")
	@Override
	public void method6559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 = (float) arg2;
		this.aFloat86 = (float) arg0;
		this.aFloat93 = this.aFloat82 = this.aFloat84 = this.aFloat83 = this.aFloat92 = this.aFloat90 = 0.0F;
		this.aFloat85 = this.aFloat88 = this.aFloat87 = 1.0F;
		this.aFloat91 = (float) arg1;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class71.aFloatArray77[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class71.aFloatArray76[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class71.aFloatArray77[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class71.aFloatArray76[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class71.aFloatArray77[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class71.aFloatArray76[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat93 = local27 * local43 + -local21 * local39;
		this.aFloat83 = -local15;
		this.aFloat84 = local39 * local9;
		this.aFloat85 = local27 * local47 + local33 * local21;
		this.aFloat90 = local21 * local43 + local39 * local27;
		this.aFloat87 = local9 * local21;
		this.aFloat82 = local27 * local9;
		this.aFloat88 = local9 * local33;
		this.aFloat92 = local47 * local21 + -local27 * local33;
		this.aFloat86 = -((float) arg2 * this.aFloat92) + (float) -arg0 * this.aFloat85 - this.aFloat84 * (float) arg1;
		this.aFloat91 = -(this.aFloat90 * (float) arg2) - (float) arg1 * this.aFloat88 + this.aFloat93 * (float) -arg0;
		this.aFloat89 = -(this.aFloat87 * (float) arg2) - (float) arg1 * this.aFloat83 + this.aFloat82 * (float) -arg0;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat92 * (float) arg2 + this.aFloat85 * (float) arg0 + this.aFloat84 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat90 + this.aFloat93 * (float) arg0 + this.aFloat88 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat87 + this.aFloat83 * (float) arg1 + (float) arg0 * this.aFloat82);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	@Override
	public void method6565(@OriginalArg(0) int arg0) {
		this.aFloat87 = 1.0F;
		this.aFloat85 = this.aFloat88 = Class71.aFloatArray77[arg0 & 0x3FFF];
		this.aFloat93 = Class71.aFloatArray76[arg0 & 0x3FFF];
		this.aFloat84 = -this.aFloat93;
		this.aFloat92 = this.aFloat86 = this.aFloat90 = this.aFloat91 = this.aFloat82 = this.aFloat83 = this.aFloat89 = 0.0F;
	}
}
