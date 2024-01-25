import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class113_Sub1() {
		this.method8460();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	@Override
	public void method8454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat47 += arg2;
		this.aFloat36 += arg1;
		this.aFloat37 += arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8456(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		this.aFloat44 = local6.aFloat44;
		this.aFloat39 = local6.aFloat39;
		this.aFloat42 = local6.aFloat42;
		this.aFloat47 = local6.aFloat47;
		this.aFloat37 = local6.aFloat37;
		this.aFloat36 = local6.aFloat36;
		this.aFloat40 = local6.aFloat40;
		this.aFloat38 = local6.aFloat38;
		this.aFloat43 = local6.aFloat43;
		this.aFloat46 = local6.aFloat46;
		this.aFloat41 = local6.aFloat41;
		this.aFloat45 = local6.aFloat45;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method8450(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat39;
		@Pc(21) float local21 = this.aFloat46;
		@Pc(24) float local24 = this.aFloat38;
		@Pc(27) float local27 = this.aFloat37;
		this.aFloat39 = local9 * local18 - this.aFloat40 * local15;
		this.aFloat46 = local21 * local9 - this.aFloat44 * local15;
		this.aFloat40 = local9 * this.aFloat40 + local15 * local18;
		this.aFloat44 = local15 * local21 + this.aFloat44 * local9;
		this.aFloat38 = local24 * local9 - this.aFloat41 * local15;
		this.aFloat37 = local9 * local27 - local15 * this.aFloat36;
		this.aFloat41 = local24 * local15 + this.aFloat41 * local9;
		this.aFloat36 = this.aFloat36 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[F)[F")
	public float[] method2455(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat47;
		arg0[14] = 0.0F;
		arg0[8] = this.aFloat37;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat46;
		arg0[5] = this.aFloat44;
		arg0[2] = 0.0F;
		arg0[9] = this.aFloat36;
		arg0[0] = this.aFloat39;
		arg0[1] = this.aFloat40;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFZF)V")
	public void method2456(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat39 = arg2;
		this.aFloat43 = 0.0F;
		this.aFloat36 = 0.0F;
		this.aFloat47 = 0.0F;
		this.aFloat41 = 0.0F;
		this.aFloat44 = arg0;
		this.aFloat40 = 0.0F;
		this.aFloat42 = 0.0F;
		this.aFloat45 = arg1;
		this.aFloat37 = 0.0F;
		this.aFloat46 = 0.0F;
		this.aFloat38 = 0.0F;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()Lclient!tc;")
	@Override
	public Class113 method8446() {
		@Pc(7) Class113_Sub1 local7 = new Class113_Sub1();
		local7.aFloat40 = this.aFloat40;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat46 = this.aFloat46;
		local7.aFloat41 = this.aFloat41;
		local7.aFloat39 = this.aFloat39;
		local7.aFloat36 = this.aFloat36;
		local7.aFloat38 = this.aFloat38;
		local7.aFloat42 = this.aFloat42;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat43 = this.aFloat43;
		local7.aFloat37 = this.aFloat37;
		local7.aFloat47 = this.aFloat47;
		return local7;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIFF)V")
	public void method2458(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat36 = arg1;
		this.aFloat37 = arg0;
		this.aFloat47 = arg2;
		this.aFloat40 = this.aFloat43 = this.aFloat46 = this.aFloat42 = this.aFloat38 = this.aFloat41 = 0.0F;
		this.aFloat39 = this.aFloat44 = this.aFloat45 = 1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFBF)F")
	public float method2459(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat37 + arg2 * this.aFloat39 + arg1 * this.aFloat46 + arg0 * this.aFloat38;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	@Override
	public void method8457(@OriginalArg(0) int arg0) {
		this.aFloat39 = 1.0F;
		this.aFloat44 = this.aFloat45 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat42 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat41 = -this.aFloat42;
		this.aFloat46 = this.aFloat38 = this.aFloat37 = this.aFloat40 = this.aFloat36 = this.aFloat43 = this.aFloat47 = 0.0F;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FBFF[F)V")
	public void method2460(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = this.aFloat42 * arg1 + this.aFloat43 * arg2 + arg0 * this.aFloat45;
		arg3[1] = this.aFloat41 * arg0 + this.aFloat44 * arg1 + this.aFloat40 * arg2;
		arg3[0] = this.aFloat46 * arg1 + this.aFloat39 * arg2 + this.aFloat38 * arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFIF)F")
	public float method2462(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat36 + this.aFloat41 * arg2 + this.aFloat40 * arg1 + this.aFloat44 * arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!tc;I)V")
	public void method2463(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		this.aFloat39 = local6.aFloat39;
		this.aFloat46 = local6.aFloat40;
		this.aFloat38 = local6.aFloat43;
		this.aFloat44 = local6.aFloat44;
		this.aFloat40 = local6.aFloat46;
		this.aFloat43 = local6.aFloat38;
		this.aFloat41 = local6.aFloat42;
		this.aFloat45 = local6.aFloat45;
		this.aFloat37 = -(this.aFloat38 * local6.aFloat47 + this.aFloat46 * local6.aFloat36 + local6.aFloat37 * this.aFloat39);
		this.aFloat42 = local6.aFloat41;
		this.aFloat36 = -(this.aFloat40 * local6.aFloat37 + local6.aFloat36 * this.aFloat44 + local6.aFloat47 * this.aFloat41);
		this.aFloat47 = -(local6.aFloat47 * this.aFloat45 + local6.aFloat37 * this.aFloat43 + this.aFloat42 * local6.aFloat36);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub5_Sub10.aFloatArray24[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub5_Sub10.aFloatArray25[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub5_Sub10.aFloatArray24[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub5_Sub10.aFloatArray25[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat41 = local39 * local27 + local21 * local43;
		this.aFloat42 = -local15;
		this.aFloat46 = local9 * local39;
		this.aFloat39 = local21 * local33 + local47 * local27;
		this.aFloat44 = local33 * local9;
		this.aFloat45 = local9 * local21;
		this.aFloat43 = local27 * local9;
		this.aFloat40 = local39 * -local21 + local27 * local43;
		this.aFloat38 = local33 * -local27 + local21 * local47;
		this.aFloat37 = (float) -arg0 * this.aFloat39 - this.aFloat46 * (float) arg1 - this.aFloat38 * (float) arg2;
		this.aFloat47 = -(this.aFloat42 * (float) arg1) + (float) -arg0 * this.aFloat43 - (float) arg2 * this.aFloat45;
		this.aFloat36 = -(this.aFloat41 * (float) arg2) - (float) arg1 * this.aFloat44 + (float) -arg0 * this.aFloat40;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([I)V")
	@Override
	public void method8449(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat37;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat36;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat47;
		arg0[2] = (int) (this.aFloat41 * local19 + local11 * this.aFloat38 + this.aFloat45 * local28);
		arg0[0] = (int) (this.aFloat43 * local28 + local11 * this.aFloat39 + local19 * this.aFloat40);
		arg0[1] = (int) (local28 * this.aFloat42 + local19 * this.aFloat44 + local11 * this.aFloat46);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat37);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat36);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat47);
		arg3[2] = (int) (this.aFloat45 * (float) local24 + this.aFloat41 * (float) local13 + (float) local6 * this.aFloat38);
		arg3[1] = (int) (this.aFloat44 * (float) local13 + (float) local6 * this.aFloat46 + this.aFloat42 * (float) local24);
		arg3[0] = (int) ((float) local24 * this.aFloat43 + this.aFloat39 * (float) local6 + (float) local13 * this.aFloat40);
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
	public void method2464() {
		this.aFloat41 = -this.aFloat41;
		this.aFloat42 = -this.aFloat42;
		this.aFloat44 = -this.aFloat44;
		this.aFloat36 = -this.aFloat36;
		this.aFloat40 = -this.aFloat40;
		this.aFloat43 = -this.aFloat43;
		this.aFloat47 = -this.aFloat47;
		this.aFloat45 = -this.aFloat45;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	@Override
	public void method8453(@OriginalArg(0) int arg0) {
		this.aFloat45 = 1.0F;
		this.aFloat39 = this.aFloat44 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat40 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat38 = this.aFloat37 = this.aFloat41 = this.aFloat36 = this.aFloat43 = this.aFloat42 = this.aFloat47 = 0.0F;
		this.aFloat46 = -this.aFloat40;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!tc;)V")
	public void method2465(@OriginalArg(1) Class113 arg0) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		this.aFloat45 = local6.aFloat45;
		this.aFloat42 = local6.aFloat42;
		this.aFloat46 = local6.aFloat46;
		this.aFloat41 = local6.aFloat41;
		this.aFloat44 = local6.aFloat44;
		this.aFloat43 = local6.aFloat43;
		this.aFloat38 = local6.aFloat38;
		this.aFloat37 = 0.0F;
		this.aFloat47 = 0.0F;
		this.aFloat39 = local6.aFloat39;
		this.aFloat40 = local6.aFloat40;
		this.aFloat36 = 0.0F;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIFIFII)V")
	public void method2466(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5) {
		if (arg1 == 0) {
			this.aFloat37 = (float) -arg5 + arg4;
			this.aFloat39 = arg5 * 2;
			this.aFloat40 = this.aFloat43 = this.aFloat46 = this.aFloat42 = this.aFloat38 = this.aFloat41 = 0.0F;
			this.aFloat45 = 1.0F;
			this.aFloat44 = arg3 * 2;
			this.aFloat47 = arg0;
			this.aFloat36 = (float) -arg3 + arg2;
			return;
		}
		@Pc(59) float local59 = Class5_Sub5_Sub10.aFloatArray24[arg1 & 0x3FFF];
		@Pc(65) float local65 = Class5_Sub5_Sub10.aFloatArray25[arg1 & 0x3FFF];
		this.aFloat45 = 1.0F;
		this.aFloat43 = this.aFloat42 = this.aFloat38 = this.aFloat41 = 0.0F;
		this.aFloat47 = arg0;
		this.aFloat40 = local65 * 2.0F * (float) arg5;
		this.aFloat44 = (float) arg3 * local59 * 2.0F;
		this.aFloat39 = (float) arg5 * local59 * 2.0F;
		this.aFloat37 = (float) (arg5 * 2) * (local65 * 0.5F - local59 * 0.5F) + arg4;
		this.aFloat46 = (float) arg3 * local65 * -2.0F;
		this.aFloat36 = (-0.5F * local65 - local59 * 0.5F) * (float) (arg3 * 2) + arg2;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BFFF)V")
	public void method2467(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat37 += arg2;
		this.aFloat36 += arg0;
		this.aFloat47 += arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([FB)[F")
	public float[] method2468(@OriginalArg(0) float[] arg0) {
		arg0[8] = this.aFloat43;
		arg0[10] = this.aFloat45;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat41;
		arg0[0] = this.aFloat39;
		arg0[2] = this.aFloat38;
		arg0[9] = this.aFloat42;
		arg0[11] = 0.0F;
		arg0[15] = 0.0F;
		arg0[4] = this.aFloat40;
		arg0[1] = this.aFloat46;
		arg0[5] = this.aFloat44;
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	@Override
	public void method8461(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat39;
		@Pc(21) float local21 = this.aFloat46;
		@Pc(24) float local24 = this.aFloat38;
		@Pc(27) float local27 = this.aFloat37;
		this.aFloat39 = local15 * this.aFloat43 + local18 * local9;
		this.aFloat46 = local9 * local21 + local15 * this.aFloat42;
		this.aFloat43 = this.aFloat43 * local9 - local18 * local15;
		this.aFloat38 = local9 * local24 + local15 * this.aFloat45;
		this.aFloat42 = local9 * this.aFloat42 - local21 * local15;
		this.aFloat45 = this.aFloat45 * local9 - local15 * local24;
		this.aFloat37 = this.aFloat47 * local15 + local27 * local9;
		this.aFloat47 = local9 * this.aFloat47 - local27 * local15;
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	@Override
	public void method8459(@OriginalArg(0) int arg0) {
		this.aFloat44 = 1.0F;
		this.aFloat39 = this.aFloat45 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		this.aFloat38 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		this.aFloat43 = -this.aFloat38;
		this.aFloat46 = this.aFloat37 = this.aFloat40 = this.aFloat41 = this.aFloat36 = this.aFloat42 = this.aFloat47 = 0.0F;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(FIFF)F")
	public float method2469(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat45 + arg2 * this.aFloat43 + this.aFloat42 * arg0 + this.aFloat47;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!tc;B)V")
	public void method2470(@OriginalArg(0) Class113 arg0) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat39;
		@Pc(12) float local12 = this.aFloat40;
		@Pc(15) float local15 = this.aFloat46;
		@Pc(18) float local18 = this.aFloat44;
		@Pc(21) float local21 = this.aFloat38;
		@Pc(24) float local24 = this.aFloat41;
		@Pc(27) float local27 = this.aFloat37;
		@Pc(30) float local30 = this.aFloat36;
		this.aFloat39 = local6.aFloat46 * local12 + local9 * local6.aFloat39 + local6.aFloat38 * this.aFloat43;
		this.aFloat40 = this.aFloat43 * local6.aFloat41 + local12 * local6.aFloat44 + local6.aFloat40 * local9;
		this.aFloat46 = this.aFloat42 * local6.aFloat38 + local6.aFloat46 * local18 + local6.aFloat39 * local15;
		this.aFloat43 = local6.aFloat45 * this.aFloat43 + local6.aFloat42 * local12 + local6.aFloat43 * local9;
		this.aFloat44 = local6.aFloat41 * this.aFloat42 + local6.aFloat40 * local15 + local6.aFloat44 * local18;
		this.aFloat38 = local6.aFloat38 * this.aFloat45 + local24 * local6.aFloat46 + local21 * local6.aFloat39;
		this.aFloat42 = this.aFloat42 * local6.aFloat45 + local6.aFloat43 * local15 + local18 * local6.aFloat42;
		this.aFloat41 = this.aFloat45 * local6.aFloat41 + local6.aFloat40 * local21 + local6.aFloat44 * local24;
		this.aFloat36 = local6.aFloat36 + local6.aFloat44 * local30 + local27 * local6.aFloat40 + this.aFloat47 * local6.aFloat41;
		this.aFloat37 = local6.aFloat37 + local6.aFloat39 * local27 + local30 * local6.aFloat46 + local6.aFloat38 * this.aFloat47;
		this.aFloat45 = local6.aFloat45 * this.aFloat45 + local6.aFloat43 * local21 + local24 * local6.aFloat42;
		this.aFloat47 = local6.aFloat42 * local30 + local6.aFloat43 * local27 + local6.aFloat45 * this.aFloat47 + local6.aFloat47;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B[F)[F")
	public float[] method2471(@OriginalArg(1) float[] arg0) {
		arg0[4] = this.aFloat46;
		arg0[0] = this.aFloat39;
		arg0[9] = this.aFloat41;
		arg0[12] = this.aFloat37;
		arg0[5] = this.aFloat44;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat45;
		arg0[8] = this.aFloat38;
		arg0[2] = this.aFloat43;
		arg0[13] = this.aFloat36;
		arg0[14] = this.aFloat47;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat40;
		arg0[6] = this.aFloat42;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	@Override
	public void method8455(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub5_Sub10.aFloatArray24[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub5_Sub10.aFloatArray25[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat40;
		@Pc(21) float local21 = this.aFloat44;
		@Pc(24) float local24 = this.aFloat41;
		@Pc(27) float local27 = this.aFloat36;
		this.aFloat40 = local18 * local9 - this.aFloat43 * local15;
		this.aFloat43 = local15 * local18 + this.aFloat43 * local9;
		this.aFloat44 = local21 * local9 - local15 * this.aFloat42;
		this.aFloat41 = local9 * local24 - this.aFloat45 * local15;
		this.aFloat42 = local15 * local21 + local9 * this.aFloat42;
		this.aFloat45 = this.aFloat45 * local9 + local15 * local24;
		this.aFloat36 = local9 * local27 - this.aFloat47 * local15;
		this.aFloat47 = this.aFloat47 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat39 = this.aFloat44 = this.aFloat45 = 1.0F;
		this.aFloat40 = this.aFloat43 = this.aFloat46 = this.aFloat42 = this.aFloat38 = this.aFloat41 = 0.0F;
		this.aFloat36 = arg1;
		this.aFloat47 = arg2;
		this.aFloat37 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!tc;Lclient!tc;)V")
	public void method2472(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1) {
		@Pc(6) Class113_Sub1 local6 = (Class113_Sub1) arg0;
		@Pc(9) Class113_Sub1 local9 = (Class113_Sub1) arg1;
		this.aFloat39 = local9.aFloat40 * local6.aFloat46 + local6.aFloat39 * local9.aFloat39 + local6.aFloat38 * local9.aFloat43;
		this.aFloat40 = local6.aFloat44 * local9.aFloat40 + local6.aFloat40 * local9.aFloat39 + local6.aFloat41 * local9.aFloat43;
		this.aFloat46 = local9.aFloat46 * local6.aFloat39 + local9.aFloat44 * local6.aFloat46 + local6.aFloat38 * local9.aFloat42;
		this.aFloat43 = local9.aFloat39 * local6.aFloat43 + local9.aFloat40 * local6.aFloat42 + local6.aFloat45 * local9.aFloat43;
		this.aFloat44 = local6.aFloat41 * local9.aFloat42 + local6.aFloat44 * local9.aFloat44 + local9.aFloat46 * local6.aFloat40;
		this.aFloat42 = local6.aFloat45 * local9.aFloat42 + local9.aFloat46 * local6.aFloat43 + local6.aFloat42 * local9.aFloat44;
		this.aFloat38 = local9.aFloat38 * local6.aFloat39 + local9.aFloat41 * local6.aFloat46 + local9.aFloat45 * local6.aFloat38;
		this.aFloat41 = local6.aFloat40 * local9.aFloat38 + local9.aFloat41 * local6.aFloat44 + local6.aFloat41 * local9.aFloat45;
		this.aFloat37 = local9.aFloat37 * local6.aFloat39 + local6.aFloat46 * local9.aFloat36 + local6.aFloat38 * local9.aFloat47 + local6.aFloat37;
		this.aFloat45 = local6.aFloat45 * local9.aFloat45 + local9.aFloat38 * local6.aFloat43 + local9.aFloat41 * local6.aFloat42;
		this.aFloat36 = local6.aFloat36 + local6.aFloat40 * local9.aFloat37 + local9.aFloat36 * local6.aFloat44 + local9.aFloat47 * local6.aFloat41;
		this.aFloat47 = local6.aFloat47 + local9.aFloat47 * local6.aFloat45 + local6.aFloat43 * local9.aFloat37 + local9.aFloat36 * local6.aFloat42;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[F)[F")
	public float[] method2473(@OriginalArg(1) float[] arg0) {
		arg0[11] = this.aFloat47;
		arg0[0] = this.aFloat39;
		arg0[15] = 1.0F;
		arg0[9] = this.aFloat42;
		arg0[2] = this.aFloat38;
		arg0[6] = this.aFloat41;
		arg0[5] = this.aFloat44;
		arg0[7] = this.aFloat36;
		arg0[14] = 0.0F;
		arg0[3] = this.aFloat37;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat40;
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat46;
		arg0[10] = this.aFloat45;
		arg0[8] = this.aFloat43;
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
	@Override
	public void method8460() {
		this.aFloat40 = this.aFloat43 = this.aFloat46 = this.aFloat42 = this.aFloat38 = this.aFloat41 = this.aFloat37 = this.aFloat36 = this.aFloat47 = 0.0F;
		this.aFloat39 = this.aFloat44 = this.aFloat45 = 1.0F;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFFI)V")
	public void method2474(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat43 *= arg2;
		this.aFloat37 *= arg1;
		this.aFloat40 *= arg0;
		this.aFloat46 *= arg1;
		this.aFloat36 *= arg0;
		this.aFloat47 *= arg2;
		this.aFloat42 *= arg2;
		this.aFloat45 *= arg2;
		this.aFloat39 *= arg1;
		this.aFloat44 *= arg0;
		this.aFloat38 *= arg1;
		this.aFloat41 *= arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFFFFFFFZF)V")
	public void method2476(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat46 = arg6;
		this.aFloat44 = arg7;
		this.aFloat43 = arg8;
		this.aFloat39 = arg2;
		this.aFloat47 = 0.0F;
		this.aFloat42 = arg3;
		this.aFloat36 = 0.0F;
		this.aFloat45 = arg5;
		this.aFloat38 = arg4;
		this.aFloat40 = arg0;
		this.aFloat37 = 0.0F;
		this.aFloat41 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(FFIFF[F)V")
	public void method2477(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[0] = arg0 * this.aFloat39 + this.aFloat46 * arg3 + arg2 * this.aFloat38;
		arg4[2] = arg0 * this.aFloat43 + this.aFloat42 * arg3 + this.aFloat45 * arg2;
		@Pc(80) float local80;
		@Pc(64) float local64;
		@Pc(72) float local72;
		@Pc(56) float local56;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local56 = -arg1 / arg0;
			local64 = this.aFloat36 + this.aFloat40 * local56;
			local72 = this.aFloat43 * local56 + this.aFloat47;
			local80 = this.aFloat39 * local56 + this.aFloat37;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local56 = -arg1 / arg3;
			local64 = local56 * this.aFloat44 + this.aFloat36;
			local72 = this.aFloat47 + this.aFloat42 * local56;
			local80 = this.aFloat46 * local56 + this.aFloat37;
		} else {
			local56 = -arg1 / arg2;
			local72 = this.aFloat47 + this.aFloat45 * local56;
			local80 = local56 * this.aFloat38 + this.aFloat37;
			local64 = this.aFloat41 * local56 + this.aFloat36;
		}
		arg4[1] = arg2 * this.aFloat41 + arg3 * this.aFloat44 + arg0 * this.aFloat40;
		arg4[3] = -(local80 * arg4[0] + local64 * arg4[1] + local72 * arg4[2]);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "([FB)[F")
	public float[] method2478(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat46;
		arg0[5] = this.aFloat44;
		arg0[2] = this.aFloat38;
		arg0[3] = this.aFloat37;
		arg0[7] = this.aFloat36;
		arg0[0] = this.aFloat39;
		arg0[6] = this.aFloat41;
		arg0[4] = this.aFloat40;
		return arg0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat36 + (float) arg2 * this.aFloat41 + (float) arg1 * this.aFloat44 + (float) arg0 * this.aFloat40);
		arg3[0] = (int) (this.aFloat37 + (float) arg2 * this.aFloat38 + (float) arg0 * this.aFloat39 + this.aFloat46 * (float) arg1);
		arg3[2] = (int) (this.aFloat47 + this.aFloat45 * (float) arg2 + (float) arg0 * this.aFloat43 + this.aFloat42 * (float) arg1);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat44 * (float) arg1 + this.aFloat40 * (float) arg0 + (float) arg2 * this.aFloat41);
		arg3[2] = (int) ((float) arg2 * this.aFloat45 + this.aFloat43 * (float) arg0 + this.aFloat42 * (float) arg1);
		arg3[0] = (int) ((float) arg1 * this.aFloat46 + (float) arg0 * this.aFloat39 + (float) arg2 * this.aFloat38);
	}
}
