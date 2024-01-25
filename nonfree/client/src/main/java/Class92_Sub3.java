import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class92_Sub3 extends Class92 {

	@OriginalMember(owner = "client!il", name = "o", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!il", name = "A", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!il", name = "H", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!il", name = "O", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!il", name = "R", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class92_Sub3() {
		this.method3853();
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V")
	@Override
	public void method3868(@OriginalArg(0) int arg0) {
		this.aFloat100 = 1.0F;
		this.aFloat96 = this.aFloat97 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat101 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat94 = -this.aFloat101;
		this.aFloat95 = this.aFloat91 = this.aFloat98 = this.aFloat102 = this.aFloat92 = this.aFloat93 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
	@Override
	public void method3866(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat101;
		@Pc(21) float local21 = this.aFloat97;
		@Pc(24) float local24 = this.aFloat98;
		this.aFloat101 = local18 * local9 - this.aFloat92 * local15;
		@Pc(37) float local37 = this.aFloat102;
		this.aFloat97 = local9 * local21 - this.aFloat93 * local15;
		this.aFloat92 = local15 * local18 + this.aFloat92 * local9;
		this.aFloat98 = local9 * local24 - this.aFloat100 * local15;
		this.aFloat93 = local9 * this.aFloat93 + local15 * local21;
		this.aFloat102 = local9 * local37 - this.aFloat103 * local15;
		this.aFloat100 = local24 * local15 + local9 * this.aFloat100;
		this.aFloat103 = local15 * local37 + local9 * this.aFloat103;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([I)V")
	@Override
	public void method3869(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat91;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat102;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat103;
		arg0[1] = (int) (local29 * this.aFloat93 + this.aFloat94 * local12 + local21 * this.aFloat97);
		arg0[2] = (int) (this.aFloat98 * local21 + this.aFloat95 * local12 + this.aFloat100 * local29);
		arg0[0] = (int) (local29 * this.aFloat92 + this.aFloat96 * local12 + local21 * this.aFloat101);
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
	@Override
	public void method3861(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat96;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat95;
		this.aFloat96 = local9 * local18 + local15 * this.aFloat92;
		@Pc(37) float local37 = this.aFloat91;
		this.aFloat94 = this.aFloat93 * local15 + local21 * local9;
		this.aFloat92 = local9 * this.aFloat92 - local15 * local18;
		this.aFloat95 = local24 * local9 + local15 * this.aFloat100;
		this.aFloat93 = local9 * this.aFloat93 - local21 * local15;
		this.aFloat100 = local9 * this.aFloat100 - local24 * local15;
		this.aFloat91 = local15 * this.aFloat103 + local9 * local37;
		this.aFloat103 = this.aFloat103 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	@Override
	public void method3860(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat96;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat95;
		this.aFloat96 = local18 * local9 - local15 * this.aFloat101;
		@Pc(38) float local38 = this.aFloat91;
		this.aFloat94 = local21 * local9 - local15 * this.aFloat97;
		this.aFloat101 = local18 * local15 + this.aFloat101 * local9;
		this.aFloat97 = local9 * this.aFloat97 + local15 * local21;
		this.aFloat95 = local9 * local24 - local15 * this.aFloat98;
		this.aFloat91 = local38 * local9 - local15 * this.aFloat102;
		this.aFloat98 = local24 * local15 + this.aFloat98 * local9;
		this.aFloat102 = this.aFloat102 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
	@Override
	public void method3853() {
		this.aFloat101 = this.aFloat92 = this.aFloat94 = this.aFloat93 = this.aFloat95 = this.aFloat98 = this.aFloat91 = this.aFloat102 = this.aFloat103 = 0.0F;
		this.aFloat96 = this.aFloat97 = this.aFloat100 = 1.0F;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V")
	@Override
	public void method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat102 = (float) arg1;
		this.aFloat101 = this.aFloat92 = this.aFloat94 = this.aFloat93 = this.aFloat95 = this.aFloat98 = 0.0F;
		this.aFloat91 = (float) arg0;
		this.aFloat103 = (float) arg2;
		this.aFloat96 = this.aFloat97 = this.aFloat100 = 1.0F;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	@Override
	public void method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat102 += (float) arg1;
		this.aFloat91 += (float) arg0;
		this.aFloat103 += (float) arg2;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III[I)V")
	@Override
	public void method3862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat92 * (float) arg0 + this.aFloat93 * (float) arg1 + this.aFloat100 * (float) arg2 + this.aFloat103);
		arg3[0] = (int) ((float) arg2 * this.aFloat95 + this.aFloat94 * (float) arg1 + this.aFloat96 * (float) arg0 + this.aFloat91);
		arg3[1] = (int) (this.aFloat102 + (float) arg0 * this.aFloat101 + (float) arg1 * this.aFloat97 + (float) arg2 * this.aFloat98);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class319.aFloatArray58[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class319.aFloatArray59[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class319.aFloatArray58[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class319.aFloatArray59[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class319.aFloatArray58[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class319.aFloatArray59[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat94 = local9 * local39;
		this.aFloat98 = local27 * local39 + local21 * local43;
		this.aFloat97 = local9 * local33;
		this.aFloat95 = local33 * -local27 + local47 * local21;
		this.aFloat100 = local9 * local21;
		this.aFloat96 = local47 * local27 + local33 * local21;
		this.aFloat101 = local43 * local27 + local39 * -local21;
		this.aFloat93 = -local15;
		this.aFloat92 = local27 * local9;
		this.aFloat91 = this.aFloat96 * (float) -arg0 - this.aFloat94 * (float) arg1 - this.aFloat95 * (float) arg2;
		this.aFloat102 = -(this.aFloat98 * (float) arg2) + this.aFloat101 * (float) -arg0 - this.aFloat97 * (float) arg1;
		this.aFloat103 = (float) -arg0 * this.aFloat92 - (float) arg1 * this.aFloat93 - (float) arg2 * this.aFloat100;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(III[I)V")
	@Override
	public void method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat91);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat103);
		@Pc(20) int local20 = (int) ((float) arg1 - this.aFloat102);
		arg3[0] = (int) (this.aFloat101 * (float) local20 + this.aFloat96 * (float) local6 + this.aFloat92 * (float) local13);
		arg3[1] = (int) ((float) local13 * this.aFloat93 + (float) local6 * this.aFloat94 + (float) local20 * this.aFloat97);
		arg3[2] = (int) (this.aFloat98 * (float) local20 + (float) local6 * this.aFloat95 + (float) local13 * this.aFloat100);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat93 + (float) arg0 * this.aFloat92 + this.aFloat100 * (float) arg2);
		arg3[1] = (int) (this.aFloat97 * (float) arg1 + this.aFloat101 * (float) arg0 + this.aFloat98 * (float) arg2);
		arg3[0] = (int) ((float) arg0 * this.aFloat96 + (float) arg1 * this.aFloat94 + (float) arg2 * this.aFloat95);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method3857() {
		@Pc(7) Class92_Sub3 local7 = new Class92_Sub3();
		local7.aFloat91 = this.aFloat91;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat100 = this.aFloat100;
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public void method3852(@OriginalArg(0) int arg0) {
		this.aFloat96 = 1.0F;
		this.aFloat97 = this.aFloat100 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat93 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat94 = this.aFloat95 = this.aFloat91 = this.aFloat101 = this.aFloat102 = this.aFloat92 = this.aFloat103 = 0.0F;
		this.aFloat98 = -this.aFloat93;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	@Override
	public void method3858(@OriginalArg(0) int arg0) {
		this.aFloat97 = 1.0F;
		this.aFloat96 = this.aFloat100 = Class319.aFloatArray58[arg0 & 0x3FFF];
		this.aFloat95 = Class319.aFloatArray59[arg0 & 0x3FFF];
		this.aFloat92 = -this.aFloat95;
		this.aFloat94 = this.aFloat91 = this.aFloat101 = this.aFloat98 = this.aFloat102 = this.aFloat93 = this.aFloat103 = 0.0F;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method3865(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class92_Sub3 local6 = (Class92_Sub3) arg0;
		this.aFloat102 = local6.aFloat102;
		this.aFloat97 = local6.aFloat97;
		this.aFloat98 = local6.aFloat98;
		this.aFloat92 = local6.aFloat92;
		this.aFloat93 = local6.aFloat93;
		this.aFloat103 = local6.aFloat103;
		this.aFloat96 = local6.aFloat96;
		this.aFloat101 = local6.aFloat101;
		this.aFloat94 = local6.aFloat94;
		this.aFloat95 = local6.aFloat95;
		this.aFloat91 = local6.aFloat91;
		this.aFloat100 = local6.aFloat100;
	}
}
