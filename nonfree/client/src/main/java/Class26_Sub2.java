import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!hda", name = "v", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!hda", name = "x", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!hda", name = "A", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!hda", name = "B", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class26_Sub2() {
		this.method6459();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III)V")
	@Override
	public void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat86 += (float) arg1;
		this.aFloat89 += (float) arg2;
		this.aFloat93 += (float) arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class14_Sub3_Sub13.aFloatArray51[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class14_Sub3_Sub13.aFloatArray50[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class14_Sub3_Sub13.aFloatArray51[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class14_Sub3_Sub13.aFloatArray50[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat85 = local9 * local27;
		this.aFloat88 = local27 * local39 + local43 * local21;
		this.aFloat91 = local27 * local47 + local33 * local21;
		this.aFloat84 = local21 * local47 + -local27 * local33;
		this.aFloat87 = local39 * -local21 + local27 * local43;
		this.aFloat82 = -local15;
		this.aFloat90 = local9 * local39;
		this.aFloat92 = local33 * local9;
		this.aFloat83 = local21 * local9;
		this.aFloat93 = (float) -arg0 * this.aFloat91 - this.aFloat90 * (float) arg1 - this.aFloat84 * (float) arg2;
		this.aFloat86 = -(this.aFloat88 * (float) arg2) - this.aFloat92 * (float) arg1 + (float) -arg0 * this.aFloat87;
		this.aFloat89 = -(this.aFloat82 * (float) arg1) + this.aFloat85 * (float) -arg0 - this.aFloat83 * (float) arg2;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method6452() {
		@Pc(7) Class26_Sub2 local7 = new Class26_Sub2();
		local7.aFloat84 = this.aFloat84;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat88 = this.aFloat88;
		return local7;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat85 + this.aFloat82 * (float) arg1 + this.aFloat83 * (float) arg2);
		arg3[0] = (int) (this.aFloat84 * (float) arg2 + this.aFloat91 * (float) arg0 + this.aFloat90 * (float) arg1);
		arg3[1] = (int) (this.aFloat88 * (float) arg2 + (float) arg0 * this.aFloat87 + this.aFloat92 * (float) arg1);
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat87;
		@Pc(21) float local21 = this.aFloat92;
		@Pc(24) float local24 = this.aFloat88;
		@Pc(27) float local27 = this.aFloat86;
		this.aFloat87 = local9 * local18 - this.aFloat85 * local15;
		this.aFloat92 = local9 * local21 - this.aFloat82 * local15;
		this.aFloat85 = local15 * local18 + local9 * this.aFloat85;
		this.aFloat88 = local9 * local24 - local15 * this.aFloat83;
		this.aFloat82 = local9 * this.aFloat82 + local21 * local15;
		this.aFloat86 = local9 * local27 - local15 * this.aFloat89;
		this.aFloat83 = local24 * local15 + local9 * this.aFloat83;
		this.aFloat89 = local9 * this.aFloat89 + local15 * local27;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
	@Override
	public void method6446(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat91;
		@Pc(21) float local21 = this.aFloat90;
		@Pc(24) float local24 = this.aFloat84;
		this.aFloat91 = local18 * local9 - this.aFloat87 * local15;
		@Pc(38) float local38 = this.aFloat93;
		this.aFloat87 = local15 * local18 + this.aFloat87 * local9;
		this.aFloat90 = local21 * local9 - local15 * this.aFloat92;
		this.aFloat84 = local24 * local9 - local15 * this.aFloat88;
		this.aFloat92 = local9 * this.aFloat92 + local15 * local21;
		this.aFloat93 = local9 * local38 - this.aFloat86 * local15;
		this.aFloat88 = local9 * this.aFloat88 + local24 * local15;
		this.aFloat86 = this.aFloat86 * local9 + local38 * local15;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat89);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat86);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat93);
		arg3[0] = (int) ((float) local10 * this.aFloat85 + this.aFloat87 * (float) local17 + (float) local24 * this.aFloat91);
		arg3[1] = (int) (this.aFloat90 * (float) local24 + (float) local17 * this.aFloat92 + (float) local10 * this.aFloat82);
		arg3[2] = (int) ((float) local17 * this.aFloat88 + this.aFloat84 * (float) local24 + this.aFloat83 * (float) local10);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(III)V")
	@Override
	public void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat93 = (float) arg0;
		this.aFloat86 = (float) arg1;
		this.aFloat89 = (float) arg2;
		this.aFloat87 = this.aFloat85 = this.aFloat90 = this.aFloat82 = this.aFloat84 = this.aFloat88 = 0.0F;
		this.aFloat91 = this.aFloat92 = this.aFloat83 = 1.0F;
	}

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)V")
	@Override
	public void method6460(@OriginalArg(0) int arg0) {
		this.aFloat91 = 1.0F;
		this.aFloat92 = this.aFloat83 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat82 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat90 = this.aFloat84 = this.aFloat93 = this.aFloat87 = this.aFloat86 = this.aFloat85 = this.aFloat89 = 0.0F;
		this.aFloat88 = -this.aFloat82;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	@Override
	public void method6444(@OriginalArg(0) int arg0) {
		this.aFloat92 = 1.0F;
		this.aFloat91 = this.aFloat83 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat84 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat85 = -this.aFloat84;
		this.aFloat90 = this.aFloat93 = this.aFloat87 = this.aFloat88 = this.aFloat86 = this.aFloat82 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
	@Override
	public void method6450(@OriginalArg(0) int arg0) {
		this.aFloat83 = 1.0F;
		this.aFloat91 = this.aFloat92 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		this.aFloat87 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		this.aFloat90 = -this.aFloat87;
		this.aFloat84 = this.aFloat93 = this.aFloat88 = this.aFloat86 = this.aFloat85 = this.aFloat82 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
	@Override
	public void method6459() {
		this.aFloat91 = this.aFloat92 = this.aFloat83 = 1.0F;
		this.aFloat87 = this.aFloat85 = this.aFloat90 = this.aFloat82 = this.aFloat84 = this.aFloat88 = this.aFloat93 = this.aFloat86 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat88 + this.aFloat87 * (float) arg0 + (float) arg1 * this.aFloat92 + this.aFloat86);
		arg3[2] = (int) (this.aFloat89 + this.aFloat85 * (float) arg0 + this.aFloat82 * (float) arg1 + this.aFloat83 * (float) arg2);
		arg3[0] = (int) (this.aFloat93 + (float) arg0 * this.aFloat91 + this.aFloat90 * (float) arg1 + (float) arg2 * this.aFloat84);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6447(@OriginalArg(0) Class26 arg0) {
		@Pc(6) Class26_Sub2 local6 = (Class26_Sub2) arg0;
		this.aFloat84 = local6.aFloat84;
		this.aFloat91 = local6.aFloat91;
		this.aFloat82 = local6.aFloat82;
		this.aFloat86 = local6.aFloat86;
		this.aFloat89 = local6.aFloat89;
		this.aFloat87 = local6.aFloat87;
		this.aFloat92 = local6.aFloat92;
		this.aFloat83 = local6.aFloat83;
		this.aFloat90 = local6.aFloat90;
		this.aFloat85 = local6.aFloat85;
		this.aFloat93 = local6.aFloat93;
		this.aFloat88 = local6.aFloat88;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	@Override
	public void method6449(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class14_Sub3_Sub13.aFloatArray51[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class14_Sub3_Sub13.aFloatArray50[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat91;
		@Pc(21) float local21 = this.aFloat90;
		@Pc(24) float local24 = this.aFloat84;
		this.aFloat91 = local18 * local9 + this.aFloat85 * local15;
		@Pc(37) float local37 = this.aFloat93;
		this.aFloat85 = this.aFloat85 * local9 - local18 * local15;
		this.aFloat90 = local15 * this.aFloat82 + local9 * local21;
		this.aFloat84 = local15 * this.aFloat83 + local9 * local24;
		this.aFloat82 = local9 * this.aFloat82 - local15 * local21;
		this.aFloat93 = local15 * this.aFloat89 + local9 * local37;
		this.aFloat83 = this.aFloat83 * local9 - local24 * local15;
		this.aFloat89 = this.aFloat89 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([I)V")
	@Override
	public void method6455(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat93;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat86;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat89;
		arg0[0] = (int) (this.aFloat85 * local28 + local12 * this.aFloat91 + this.aFloat87 * local20);
		arg0[1] = (int) (local28 * this.aFloat82 + this.aFloat92 * local20 + local12 * this.aFloat90);
		arg0[2] = (int) (this.aFloat83 * local28 + local12 * this.aFloat84 + local20 * this.aFloat88);
	}
}
