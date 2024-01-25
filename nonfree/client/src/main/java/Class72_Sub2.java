import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class72_Sub2() {
		this.K();
	}

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "()V")
	@Override
	public void K() {
		this.aFloat53 = this.aFloat52 = this.aFloat55 = this.aFloat51 = this.aFloat50 = this.aFloat49 = this.aFloat48 = this.aFloat46 = this.aFloat54 = 0.0F;
		this.aFloat56 = this.aFloat47 = this.aFloat45 = 1.0F;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)[F")
	public float[] method2190() {
		Static381.aFloatArray38[9] = this.aFloat49;
		Static381.aFloatArray38[0] = this.aFloat56;
		Static381.aFloatArray38[2] = this.aFloat52;
		Static381.aFloatArray38[14] = 0.0F;
		Static381.aFloatArray38[8] = this.aFloat50;
		Static381.aFloatArray38[6] = this.aFloat51;
		Static381.aFloatArray38[10] = this.aFloat45;
		Static381.aFloatArray38[13] = 0.0F;
		Static381.aFloatArray38[12] = 0.0F;
		Static381.aFloatArray38[5] = this.aFloat47;
		Static381.aFloatArray38[1] = this.aFloat53;
		Static381.aFloatArray38[4] = this.aFloat55;
		return Static381.aFloatArray38;
	}

	@OriginalMember(owner = "client!fl", name = "ya", descriptor = "(Lclient!n;)V")
	@Override
	public void ya(@OriginalArg(0) Class72 arg0) {
		@Pc(6) Class72_Sub2 local6 = (Class72_Sub2) arg0;
		this.aFloat52 = local6.aFloat52;
		this.aFloat55 = local6.aFloat55;
		this.aFloat48 = local6.aFloat48;
		this.aFloat47 = local6.aFloat47;
		this.aFloat46 = local6.aFloat46;
		this.aFloat49 = local6.aFloat49;
		this.aFloat45 = local6.aFloat45;
		this.aFloat51 = local6.aFloat51;
		this.aFloat50 = local6.aFloat50;
		this.aFloat54 = local6.aFloat54;
		this.aFloat53 = local6.aFloat53;
		this.aFloat56 = local6.aFloat56;
	}

	@OriginalMember(owner = "client!fl", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.aFloat56 = 1.0F;
		this.aFloat47 = this.aFloat45 = Class4_Sub45.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat51 = Class4_Sub45.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat49 = -this.aFloat51;
		this.aFloat55 = this.aFloat50 = this.aFloat48 = this.aFloat53 = this.aFloat46 = this.aFloat52 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!fl", name = "IA", descriptor = "(IIIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class4_Sub45.aFloatArray40[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub45.aFloatArray39[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class4_Sub45.aFloatArray40[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class4_Sub45.aFloatArray39[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class4_Sub45.aFloatArray40[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class4_Sub45.aFloatArray39[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat50 = local21 * local47 + local33 * -local27;
		this.aFloat56 = local33 * local21 + local27 * local47;
		this.aFloat51 = -local15;
		this.aFloat45 = local9 * local21;
		this.aFloat53 = local39 * -local21 + local43 * local27;
		this.aFloat49 = local21 * local43 + local39 * local27;
		this.aFloat52 = local27 * local9;
		this.aFloat55 = local39 * local9;
		this.aFloat47 = local9 * local33;
		this.aFloat48 = -((float) arg2 * this.aFloat50) - this.aFloat55 * (float) arg1 + this.aFloat56 * (float) -arg0;
		this.aFloat54 = -((float) arg2 * this.aFloat45) + this.aFloat52 * (float) -arg0 - this.aFloat51 * (float) arg1;
		this.aFloat46 = -((float) arg2 * this.aFloat49) + this.aFloat53 * (float) -arg0 - this.aFloat47 * (float) arg1;
	}

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "(III)V")
	@Override
	public void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 = this.aFloat52 = this.aFloat55 = this.aFloat51 = this.aFloat50 = this.aFloat49 = 0.0F;
		this.aFloat46 = arg1;
		this.aFloat54 = arg2;
		this.aFloat56 = this.aFloat47 = this.aFloat45 = 1.0F;
		this.aFloat48 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat54 + (float) arg2 * this.aFloat45 + this.aFloat52 * (float) arg0 + (float) arg1 * this.aFloat51);
		arg3[1] = (int) (this.aFloat46 + this.aFloat53 * (float) arg0 + this.aFloat47 * (float) arg1 + (float) arg2 * this.aFloat49);
		arg3[0] = (int) (this.aFloat48 + this.aFloat50 * (float) arg2 + (float) arg1 * this.aFloat55 + this.aFloat56 * (float) arg0);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IFFIIIF)V")
	public void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat45 = 1.0F;
			this.aFloat56 = arg3;
			this.aFloat47 = arg0;
			this.aFloat53 = this.aFloat52 = this.aFloat55 = this.aFloat51 = this.aFloat50 = this.aFloat49 = 0.0F;
		} else {
			@Pc(12) float local12 = Class4_Sub45.aFloatArray40[arg4 & 0x3FFF];
			@Pc(18) float local18 = Class4_Sub45.aFloatArray39[arg4 & 0x3FFF];
			this.aFloat45 = 1.0F;
			this.aFloat53 = (float) arg3 * local18;
			this.aFloat47 = local12 * (float) arg0;
			this.aFloat56 = local12 * (float) arg3;
			this.aFloat55 = (float) arg0 * -local18;
			this.aFloat52 = this.aFloat51 = this.aFloat50 = this.aFloat49 = 0.0F;
		}
		this.aFloat48 = arg1;
		this.aFloat54 = arg2;
		this.aFloat46 = arg5;
	}

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "([I)V")
	@Override
	public void M(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat48;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat46;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat54;
		arg0[2] = (int) (local20 * this.aFloat49 + this.aFloat50 * local11 + local28 * this.aFloat45);
		arg0[0] = (int) (this.aFloat56 * local11 + local20 * this.aFloat53 + this.aFloat52 * local28);
		arg0[1] = (int) (this.aFloat55 * local11 + local20 * this.aFloat47 + local28 * this.aFloat51);
	}

	@OriginalMember(owner = "client!fl", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		this.aFloat45 = 1.0F;
		this.aFloat56 = this.aFloat47 = Class4_Sub45.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat53 = Class4_Sub45.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat55 = -this.aFloat53;
		this.aFloat50 = this.aFloat48 = this.aFloat49 = this.aFloat46 = this.aFloat52 = this.aFloat51 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "(III[I)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat49 * (float) arg2 + this.aFloat47 * (float) arg1 + (float) arg0 * this.aFloat53);
		arg3[0] = (int) (this.aFloat50 * (float) arg2 + this.aFloat55 * (float) arg1 + this.aFloat56 * (float) arg0);
		arg3[2] = (int) ((float) arg0 * this.aFloat52 + this.aFloat51 * (float) arg1 + (float) arg2 * this.aFloat45);
	}

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat46 += arg1;
		this.aFloat48 += arg0;
		this.aFloat54 += arg2;
	}

	@OriginalMember(owner = "client!fl", name = "CA", descriptor = "(I)V")
	@Override
	public void CA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub45.aFloatArray40[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub45.aFloatArray39[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat55;
		@Pc(24) float local24 = this.aFloat50;
		@Pc(27) float local27 = this.aFloat48;
		this.aFloat56 = this.aFloat52 * local15 + local18 * local9;
		this.aFloat55 = this.aFloat51 * local15 + local9 * local21;
		this.aFloat52 = local9 * this.aFloat52 - local15 * local18;
		this.aFloat50 = local15 * this.aFloat45 + local9 * local24;
		this.aFloat51 = this.aFloat51 * local9 - local15 * local21;
		this.aFloat45 = local9 * this.aFloat45 - local24 * local15;
		this.aFloat48 = local27 * local9 + local15 * this.aFloat54;
		this.aFloat54 = local9 * this.aFloat54 - local15 * local27;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)[F")
	public float[] method2193() {
		Static381.aFloatArray38[2] = this.aFloat52;
		Static381.aFloatArray38[12] = this.aFloat48;
		Static381.aFloatArray38[14] = this.aFloat54;
		Static381.aFloatArray38[10] = this.aFloat45;
		Static381.aFloatArray38[0] = this.aFloat56;
		Static381.aFloatArray38[4] = this.aFloat55;
		Static381.aFloatArray38[1] = this.aFloat53;
		Static381.aFloatArray38[9] = this.aFloat49;
		Static381.aFloatArray38[6] = this.aFloat51;
		Static381.aFloatArray38[5] = this.aFloat47;
		Static381.aFloatArray38[13] = this.aFloat46;
		Static381.aFloatArray38[8] = this.aFloat50;
		return Static381.aFloatArray38;
	}

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat56 = this.aFloat45 = Class4_Sub45.aFloatArray40[arg0 & 0x3FFF];
		this.aFloat50 = Class4_Sub45.aFloatArray39[arg0 & 0x3FFF];
		this.aFloat52 = -this.aFloat50;
		this.aFloat55 = this.aFloat48 = this.aFloat53 = this.aFloat49 = this.aFloat46 = this.aFloat51 = this.aFloat54 = 0.0F;
	}

	@OriginalMember(owner = "client!fl", name = "ba", descriptor = "(I)V")
	@Override
	public void ba(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub45.aFloatArray40[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub45.aFloatArray39[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat53;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat49;
		this.aFloat53 = local9 * local18 - local15 * this.aFloat52;
		@Pc(38) float local38 = this.aFloat46;
		this.aFloat52 = local18 * local15 + local9 * this.aFloat52;
		this.aFloat47 = local9 * local21 - this.aFloat51 * local15;
		this.aFloat49 = local9 * local24 - local15 * this.aFloat45;
		this.aFloat51 = this.aFloat51 * local9 + local15 * local21;
		this.aFloat46 = local38 * local9 - this.aFloat54 * local15;
		this.aFloat45 = local15 * local24 + this.aFloat45 * local9;
		this.aFloat54 = local9 * this.aFloat54 + local38 * local15;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()Lclient!n;")
	@Override
	public Class72 method3307() {
		@Pc(7) Class72_Sub2 local7 = new Class72_Sub2();
		local7.aFloat47 = this.aFloat47;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat56 = this.aFloat56;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat55 = this.aFloat55;
		return local7;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!n;I)V")
	public void method2195(@OriginalArg(0) Class72 arg0) {
		@Pc(6) Class72_Sub2 local6 = (Class72_Sub2) arg0;
		this.aFloat56 = local6.aFloat56;
		this.aFloat50 = local6.aFloat52;
		this.aFloat55 = local6.aFloat53;
		this.aFloat52 = local6.aFloat50;
		this.aFloat49 = local6.aFloat51;
		this.aFloat53 = local6.aFloat55;
		this.aFloat47 = local6.aFloat47;
		this.aFloat45 = local6.aFloat45;
		this.aFloat48 = -(local6.aFloat54 * this.aFloat50 + local6.aFloat46 * this.aFloat55 + this.aFloat56 * local6.aFloat48);
		this.aFloat51 = local6.aFloat49;
		this.aFloat46 = -(local6.aFloat54 * this.aFloat49 + local6.aFloat48 * this.aFloat53 + this.aFloat47 * local6.aFloat46);
		this.aFloat54 = -(this.aFloat51 * local6.aFloat46 + this.aFloat52 * local6.aFloat48 + local6.aFloat54 * this.aFloat45);
	}
}
