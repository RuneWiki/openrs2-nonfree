import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!eba", name = "Z", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!eba", name = "db", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!eba", name = "D", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!eba", name = "H", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!eba", name = "M", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!eba", name = "jb", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!eba", name = "W", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	public Class10_Sub2() {
		this.method4224();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FFIF)F")
	public float method1689(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat53 + arg0 * this.aFloat52 + this.aFloat48 * arg1 + this.aFloat44 * arg2;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B[F)[F")
	public float[] method1690(@OriginalArg(1) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[1] = this.aFloat45;
		arg0[10] = this.aFloat52;
		arg0[13] = 0.0F;
		arg0[3] = this.aFloat49;
		arg0[4] = this.aFloat51;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat54;
		arg0[6] = this.aFloat46;
		arg0[7] = this.aFloat55;
		arg0[9] = this.aFloat44;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat48;
		arg0[11] = this.aFloat53;
		arg0[5] = this.aFloat47;
		arg0[2] = this.aFloat50;
		return arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FBFF)V")
	public void method1691(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat51 = this.aFloat48 = this.aFloat45 = this.aFloat44 = this.aFloat50 = this.aFloat46 = 0.0F;
		this.aFloat53 = arg0;
		this.aFloat55 = arg1;
		this.aFloat49 = arg2;
		this.aFloat54 = this.aFloat47 = this.aFloat52 = 1.0F;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([I)V")
	@Override
	public void method4211(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat49;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat55;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat53;
		arg0[0] = (int) (local12 * this.aFloat54 + this.aFloat51 * local21 + local29 * this.aFloat48);
		arg0[1] = (int) (local29 * this.aFloat44 + this.aFloat45 * local12 + this.aFloat47 * local21);
		arg0[2] = (int) (this.aFloat52 * local29 + this.aFloat50 * local12 + local21 * this.aFloat46);
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
	@Override
	public void method4213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat51;
		@Pc(21) float local21 = this.aFloat47;
		@Pc(24) float local24 = this.aFloat46;
		@Pc(27) float local27 = this.aFloat55;
		this.aFloat51 = local18 * local9 - this.aFloat48 * local15;
		this.aFloat47 = local9 * local21 - local15 * this.aFloat44;
		this.aFloat48 = local9 * this.aFloat48 + local15 * local18;
		this.aFloat44 = local9 * this.aFloat44 + local21 * local15;
		this.aFloat46 = local9 * local24 - local15 * this.aFloat52;
		this.aFloat55 = local9 * local27 - local15 * this.aFloat53;
		this.aFloat52 = local24 * local15 + local9 * this.aFloat52;
		this.aFloat53 = local27 * local15 + local9 * this.aFloat53;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	@Override
	public void method4218(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat47 = this.aFloat52 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat44 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat46 = -this.aFloat44;
		this.aFloat45 = this.aFloat50 = this.aFloat49 = this.aFloat51 = this.aFloat55 = this.aFloat48 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "(I)V")
	@Override
	public void method4210(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat54;
		@Pc(21) float local21 = this.aFloat45;
		@Pc(24) float local24 = this.aFloat50;
		@Pc(27) float local27 = this.aFloat49;
		this.aFloat54 = local9 * local18 - this.aFloat51 * local15;
		this.aFloat45 = local9 * local21 - this.aFloat47 * local15;
		this.aFloat51 = local9 * this.aFloat51 + local15 * local18;
		this.aFloat50 = local9 * local24 - local15 * this.aFloat46;
		this.aFloat47 = local15 * local21 + local9 * this.aFloat47;
		this.aFloat49 = local27 * local9 - this.aFloat55 * local15;
		this.aFloat46 = local24 * local15 + local9 * this.aFloat46;
		this.aFloat55 = this.aFloat55 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BFFF)V")
	public void method1695(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat53 += arg0;
		this.aFloat49 += arg2;
		this.aFloat55 += arg1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method4212(@OriginalArg(0) Class10 arg0) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg0;
		this.aFloat49 = local6.aFloat49;
		this.aFloat44 = local6.aFloat44;
		this.aFloat50 = local6.aFloat50;
		this.aFloat45 = local6.aFloat45;
		this.aFloat52 = local6.aFloat52;
		this.aFloat48 = local6.aFloat48;
		this.aFloat54 = local6.aFloat54;
		this.aFloat46 = local6.aFloat46;
		this.aFloat47 = local6.aFloat47;
		this.aFloat55 = local6.aFloat55;
		this.aFloat53 = local6.aFloat53;
		this.aFloat51 = local6.aFloat51;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(ILclient!sj;)V")
	public void method1696(@OriginalArg(1) Class10 arg0) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat54;
		@Pc(12) float local12 = this.aFloat51;
		@Pc(15) float local15 = this.aFloat45;
		@Pc(18) float local18 = this.aFloat47;
		@Pc(26) float local26 = this.aFloat50;
		@Pc(29) float local29 = this.aFloat46;
		@Pc(32) float local32 = this.aFloat49;
		@Pc(35) float local35 = this.aFloat55;
		this.aFloat54 = local12 * local6.aFloat45 + local9 * local6.aFloat54 + local6.aFloat50 * this.aFloat48;
		this.aFloat51 = local6.aFloat46 * this.aFloat48 + local6.aFloat47 * local12 + local6.aFloat51 * local9;
		this.aFloat45 = local6.aFloat50 * this.aFloat44 + local15 * local6.aFloat54 + local18 * local6.aFloat45;
		this.aFloat47 = local6.aFloat51 * local15 + local18 * local6.aFloat47 + this.aFloat44 * local6.aFloat46;
		this.aFloat48 = this.aFloat48 * local6.aFloat52 + local9 * local6.aFloat48 + local6.aFloat44 * local12;
		this.aFloat50 = this.aFloat52 * local6.aFloat50 + local26 * local6.aFloat54 + local6.aFloat45 * local29;
		this.aFloat44 = local6.aFloat44 * local18 + local15 * local6.aFloat48 + local6.aFloat52 * this.aFloat44;
		this.aFloat46 = local26 * local6.aFloat51 + local6.aFloat47 * local29 + local6.aFloat46 * this.aFloat52;
		this.aFloat49 = local6.aFloat45 * local35 + local6.aFloat54 * local32 + this.aFloat53 * local6.aFloat50 + local6.aFloat49;
		this.aFloat55 = local35 * local6.aFloat47 + local6.aFloat51 * local32 + local6.aFloat46 * this.aFloat53 + local6.aFloat55;
		this.aFloat52 = local6.aFloat52 * this.aFloat52 + local6.aFloat44 * local29 + local26 * local6.aFloat48;
		this.aFloat53 = local32 * local6.aFloat48 + local35 * local6.aFloat44 + local6.aFloat52 * this.aFloat53 + local6.aFloat53;
	}

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "(I)V")
	public void method1698() {
		this.aFloat53 = -this.aFloat53;
		this.aFloat51 = -this.aFloat51;
		this.aFloat55 = -this.aFloat55;
		this.aFloat46 = -this.aFloat46;
		this.aFloat48 = -this.aFloat48;
		this.aFloat52 = -this.aFloat52;
		this.aFloat44 = -this.aFloat44;
		this.aFloat47 = -this.aFloat47;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat49 + this.aFloat50 * (float) arg2 + (float) arg0 * this.aFloat54 + this.aFloat45 * (float) arg1);
		arg3[1] = (int) ((float) arg0 * this.aFloat51 + (float) arg1 * this.aFloat47 + (float) arg2 * this.aFloat46 + this.aFloat55);
		arg3[2] = (int) ((float) arg1 * this.aFloat44 + this.aFloat48 * (float) arg0 + (float) arg2 * this.aFloat52 + this.aFloat53);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat55);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat53);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat49);
		arg3[0] = (int) (this.aFloat48 * (float) local17 + this.aFloat51 * (float) local6 + this.aFloat54 * (float) local24);
		arg3[2] = (int) ((float) local6 * this.aFloat46 + (float) local24 * this.aFloat50 + this.aFloat52 * (float) local17);
		arg3[1] = (int) ((float) local17 * this.aFloat44 + (float) local6 * this.aFloat47 + (float) local24 * this.aFloat45);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([FI)[F")
	public float[] method1699(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat55;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat53;
		arg0[4] = this.aFloat45;
		arg0[1] = this.aFloat51;
		arg0[6] = 0.0F;
		arg0[8] = this.aFloat49;
		arg0[11] = 0.0F;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat54;
		arg0[7] = 0.0F;
		arg0[2] = 0.0F;
		arg0[5] = this.aFloat47;
		arg0[3] = 0.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(FBFF)V")
	public void method1701(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat52 *= arg2;
		this.aFloat50 *= arg1;
		this.aFloat44 *= arg2;
		this.aFloat54 *= arg1;
		this.aFloat55 *= arg0;
		this.aFloat47 *= arg0;
		this.aFloat49 *= arg1;
		this.aFloat45 *= arg1;
		this.aFloat51 *= arg0;
		this.aFloat46 *= arg0;
		this.aFloat53 *= arg2;
		this.aFloat48 *= arg2;
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat52 + this.aFloat48 * (float) arg0 + (float) arg1 * this.aFloat44);
		arg3[1] = (int) (this.aFloat51 * (float) arg0 + (float) arg1 * this.aFloat47 + (float) arg2 * this.aFloat46);
		arg3[0] = (int) (this.aFloat45 * (float) arg1 + (float) arg0 * this.aFloat54 + (float) arg2 * this.aFloat50);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IFFF)F")
	public float method1702(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat45 + this.aFloat54 * arg2 + this.aFloat50 * arg0 + this.aFloat49;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I[F)[F")
	public float[] method1703(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat50;
		arg0[5] = this.aFloat47;
		arg0[7] = this.aFloat55;
		arg0[3] = this.aFloat49;
		arg0[6] = this.aFloat46;
		arg0[1] = this.aFloat45;
		arg0[4] = this.aFloat51;
		arg0[0] = this.aFloat54;
		return arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!sj;)V")
	public void method1704(@OriginalArg(1) Class10 arg0) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg0;
		this.aFloat45 = local6.aFloat51;
		this.aFloat50 = local6.aFloat48;
		this.aFloat54 = local6.aFloat54;
		this.aFloat47 = local6.aFloat47;
		this.aFloat51 = local6.aFloat45;
		this.aFloat48 = local6.aFloat50;
		this.aFloat46 = local6.aFloat44;
		this.aFloat52 = local6.aFloat52;
		this.aFloat44 = local6.aFloat46;
		this.aFloat49 = -(this.aFloat45 * local6.aFloat55 + this.aFloat54 * local6.aFloat49 + this.aFloat50 * local6.aFloat53);
		this.aFloat55 = -(this.aFloat51 * local6.aFloat49 + local6.aFloat55 * this.aFloat47 + this.aFloat46 * local6.aFloat53);
		this.aFloat53 = -(this.aFloat48 * local6.aFloat49 + local6.aFloat55 * this.aFloat44 + local6.aFloat53 * this.aFloat52);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
	@Override
	public void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat54 = this.aFloat47 = this.aFloat52 = 1.0F;
		this.aFloat49 = (float) arg0;
		this.aFloat55 = (float) arg1;
		this.aFloat53 = (float) arg2;
		this.aFloat51 = this.aFloat48 = this.aFloat45 = this.aFloat44 = this.aFloat50 = this.aFloat46 = 0.0F;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FFIFFFFFFF)V")
	public void method1705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat52 = arg2;
		this.aFloat48 = arg7;
		this.aFloat49 = 0.0F;
		this.aFloat55 = 0.0F;
		this.aFloat51 = arg8;
		this.aFloat45 = arg6;
		this.aFloat47 = arg4;
		this.aFloat46 = arg0;
		this.aFloat50 = arg3;
		this.aFloat54 = arg1;
		this.aFloat53 = 0.0F;
		this.aFloat44 = arg5;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	@Override
	public void method4221(@OriginalArg(0) int arg0) {
		this.aFloat52 = 1.0F;
		this.aFloat54 = this.aFloat47 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat51 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat50 = this.aFloat49 = this.aFloat46 = this.aFloat55 = this.aFloat48 = this.aFloat44 = this.aFloat53 = 0.0F;
		this.aFloat45 = -this.aFloat51;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(III)V")
	@Override
	public void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat53 += (float) arg2;
		this.aFloat55 += (float) arg1;
		this.aFloat49 += (float) arg0;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(IFFF)V")
	public void method1706(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat53 = 0.0F;
		this.aFloat55 = 0.0F;
		this.aFloat48 = 0.0F;
		this.aFloat44 = 0.0F;
		this.aFloat45 = 0.0F;
		this.aFloat46 = 0.0F;
		this.aFloat49 = 0.0F;
		this.aFloat50 = 0.0F;
		this.aFloat51 = 0.0F;
		this.aFloat52 = arg2;
		this.aFloat47 = arg0;
		this.aFloat54 = arg1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FFIFF[F)V")
	public void method1707(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg0 * this.aFloat51 + this.aFloat47 * arg2 + arg3 * this.aFloat46;
		arg4[2] = this.aFloat52 * arg3 + this.aFloat48 * arg0 + arg2 * this.aFloat44;
		@Pc(90) float local90;
		@Pc(74) float local74;
		@Pc(82) float local82;
		@Pc(66) float local66;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local66 = -arg1 / arg0;
			local82 = this.aFloat48 * local66 + this.aFloat53;
			local90 = this.aFloat49 + local66 * this.aFloat54;
			local74 = this.aFloat55 + this.aFloat51 * local66;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local66 = -arg1 / arg2;
			local74 = local66 * this.aFloat47 + this.aFloat55;
			local82 = local66 * this.aFloat44 + this.aFloat53;
			local90 = this.aFloat49 + this.aFloat45 * local66;
		} else {
			local66 = -arg1 / arg3;
			local82 = this.aFloat53 + local66 * this.aFloat52;
			local90 = this.aFloat49 + this.aFloat50 * local66;
			local74 = this.aFloat46 * local66 + this.aFloat55;
		}
		arg4[0] = arg3 * this.aFloat50 + this.aFloat54 * arg0 + this.aFloat45 * arg2;
		arg4[3] = -(local74 * arg4[1] + arg4[0] * local90 + local82 * arg4[2]);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BIFFIIF)V")
	public void method1708(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat52 = 1.0F;
			this.aFloat53 = arg1;
			this.aFloat47 = (float) (arg0 * 2);
			this.aFloat49 = (float) -arg4 + arg5;
			this.aFloat55 = arg2 - (float) arg0;
			this.aFloat51 = this.aFloat48 = this.aFloat45 = this.aFloat44 = this.aFloat50 = this.aFloat46 = 0.0F;
			this.aFloat54 = (float) (arg4 * 2);
			return;
		}
		@Pc(19) float local19 = Class5_Sub33.aFloatArray48[arg3 & 0x3FFF];
		@Pc(25) float local25 = Class5_Sub33.aFloatArray49[arg3 & 0x3FFF];
		this.aFloat55 = arg2 + (float) (arg0 * 2) * (local25 * -0.5F - local19 * 0.5F);
		this.aFloat51 = (float) arg4 * local25 * 2.0F;
		this.aFloat49 = (float) (arg4 * 2) * (local25 * 0.5F - local19 * 0.5F) + arg5;
		this.aFloat45 = (float) arg0 * -2.0F * local25;
		this.aFloat48 = this.aFloat44 = this.aFloat50 = this.aFloat46 = 0.0F;
		this.aFloat54 = (float) arg4 * local19 * 2.0F;
		this.aFloat53 = arg1;
		this.aFloat52 = 1.0F;
		this.aFloat47 = (float) arg0 * local19 * 2.0F;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!sj;B)V")
	public void method1709(@OriginalArg(0) Class10 arg0) {
		@Pc(11) Class10_Sub2 local11 = (Class10_Sub2) arg0;
		this.aFloat50 = local11.aFloat50;
		this.aFloat55 = 0.0F;
		this.aFloat46 = local11.aFloat46;
		this.aFloat51 = local11.aFloat51;
		this.aFloat48 = local11.aFloat48;
		this.aFloat53 = 0.0F;
		this.aFloat49 = 0.0F;
		this.aFloat45 = local11.aFloat45;
		this.aFloat44 = local11.aFloat44;
		this.aFloat54 = local11.aFloat54;
		this.aFloat47 = local11.aFloat47;
		this.aFloat52 = local11.aFloat52;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "([FI)[F")
	public float[] method1710(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat47;
		arg0[14] = (float) 0;
		arg0[8] = this.aFloat48;
		arg0[1] = this.aFloat45;
		arg0[4] = this.aFloat51;
		arg0[15] = 0.0F;
		arg0[6] = this.aFloat46;
		arg0[10] = this.aFloat52;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[9] = this.aFloat44;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat54;
		arg0[3] = 0.0F;
		arg0[2] = this.aFloat50;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
	@Override
	public void method4217(@OriginalArg(0) int arg0) {
		this.aFloat47 = 1.0F;
		this.aFloat54 = this.aFloat52 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat50 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat45 = this.aFloat49 = this.aFloat51 = this.aFloat46 = this.aFloat55 = this.aFloat44 = this.aFloat53 = 0.0F;
		this.aFloat48 = -this.aFloat50;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(FFIF)F")
	public float method1712(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat55 + this.aFloat51 * arg2 + arg0 * this.aFloat47 + arg1 * this.aFloat46;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "()Lclient!sj;")
	@Override
	public Class10 method4222() {
		@Pc(7) Class10_Sub2 local7 = new Class10_Sub2();
		local7.aFloat46 = this.aFloat46;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat45 = this.aFloat45;
		local7.aFloat49 = this.aFloat49;
		local7.aFloat47 = this.aFloat47;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat44 = this.aFloat44;
		local7.aFloat48 = this.aFloat48;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat52 = this.aFloat52;
		return local7;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "()V")
	@Override
	public void method4224() {
		this.aFloat54 = this.aFloat47 = this.aFloat52 = 1.0F;
		this.aFloat51 = this.aFloat48 = this.aFloat45 = this.aFloat44 = this.aFloat50 = this.aFloat46 = this.aFloat49 = this.aFloat55 = this.aFloat53 = 0.0F;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "([FFIFF)V")
	public void method1714(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[2] = this.aFloat44 * arg1 + this.aFloat48 * arg2 + this.aFloat52 * arg3;
		arg0[0] = this.aFloat50 * arg3 + arg2 * this.aFloat54 + this.aFloat45 * arg1;
		arg0[1] = this.aFloat46 * arg3 + arg1 * this.aFloat47 + arg2 * this.aFloat51;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[F)[F")
	public float[] method1715(@OriginalArg(1) float[] arg0) {
		arg0[6] = this.aFloat44;
		arg0[2] = this.aFloat48;
		arg0[0] = this.aFloat54;
		arg0[9] = this.aFloat46;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat55;
		arg0[1] = this.aFloat51;
		arg0[14] = this.aFloat53;
		arg0[10] = this.aFloat52;
		arg0[8] = this.aFloat50;
		arg0[4] = this.aFloat45;
		arg0[5] = this.aFloat47;
		arg0[15] = 1.0F;
		arg0[12] = this.aFloat49;
		return arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!sj;Lclient!sj;)V")
	public void method1716(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		@Pc(6) Class10_Sub2 local6 = (Class10_Sub2) arg0;
		@Pc(9) Class10_Sub2 local9 = (Class10_Sub2) arg1;
		this.aFloat54 = local6.aFloat50 * local9.aFloat48 + local6.aFloat54 * local9.aFloat54 + local6.aFloat45 * local9.aFloat51;
		this.aFloat51 = local6.aFloat51 * local9.aFloat54 + local6.aFloat47 * local9.aFloat51 + local9.aFloat48 * local6.aFloat46;
		this.aFloat48 = local9.aFloat48 * local6.aFloat52 + local6.aFloat44 * local9.aFloat51 + local9.aFloat54 * local6.aFloat48;
		this.aFloat45 = local6.aFloat54 * local9.aFloat45 + local6.aFloat45 * local9.aFloat47 + local6.aFloat50 * local9.aFloat44;
		this.aFloat47 = local9.aFloat44 * local6.aFloat46 + local9.aFloat47 * local6.aFloat47 + local6.aFloat51 * local9.aFloat45;
		this.aFloat44 = local9.aFloat45 * local6.aFloat48 + local9.aFloat47 * local6.aFloat44 + local9.aFloat44 * local6.aFloat52;
		this.aFloat50 = local6.aFloat45 * local9.aFloat46 + local9.aFloat50 * local6.aFloat54 + local9.aFloat52 * local6.aFloat50;
		this.aFloat46 = local6.aFloat47 * local9.aFloat46 + local6.aFloat51 * local9.aFloat50 + local6.aFloat46 * local9.aFloat52;
		this.aFloat52 = local9.aFloat52 * local6.aFloat52 + local6.aFloat48 * local9.aFloat50 + local9.aFloat46 * local6.aFloat44;
		this.aFloat49 = local6.aFloat49 + local9.aFloat49 * local6.aFloat54 + local9.aFloat55 * local6.aFloat45 + local9.aFloat53 * local6.aFloat50;
		this.aFloat55 = local9.aFloat55 * local6.aFloat47 + local6.aFloat51 * local9.aFloat49 + local9.aFloat53 * local6.aFloat46 + local6.aFloat55;
		this.aFloat53 = local6.aFloat53 + local9.aFloat53 * local6.aFloat52 + local9.aFloat49 * local6.aFloat48 + local6.aFloat44 * local9.aFloat55;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub33.aFloatArray48[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub33.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub33.aFloatArray48[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub33.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat51 = local39 * -local21 + local43 * local27;
		this.aFloat44 = -local15;
		this.aFloat45 = local9 * local39;
		this.aFloat48 = local27 * local9;
		this.aFloat50 = local21 * local47 + local33 * -local27;
		this.aFloat47 = local33 * local9;
		this.aFloat54 = local27 * local47 + local21 * local33;
		this.aFloat46 = local43 * local21 + local39 * local27;
		this.aFloat52 = local9 * local21;
		this.aFloat53 = -((float) arg1 * this.aFloat44) + (float) -arg0 * this.aFloat48 - this.aFloat52 * (float) arg2;
		this.aFloat55 = -(this.aFloat47 * (float) arg1) + (float) -arg0 * this.aFloat51 - (float) arg2 * this.aFloat46;
		this.aFloat49 = (float) -arg0 * this.aFloat54 - this.aFloat45 * (float) arg1 - this.aFloat50 * (float) arg2;
	}

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "(I)V")
	@Override
	public void method4215(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub33.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub33.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat54;
		@Pc(21) float local21 = this.aFloat45;
		@Pc(24) float local24 = this.aFloat50;
		this.aFloat54 = local15 * this.aFloat48 + local18 * local9;
		@Pc(37) float local37 = this.aFloat49;
		this.aFloat45 = local9 * local21 + this.aFloat44 * local15;
		this.aFloat48 = local9 * this.aFloat48 - local15 * local18;
		this.aFloat50 = local9 * local24 + local15 * this.aFloat52;
		this.aFloat44 = local9 * this.aFloat44 - local21 * local15;
		this.aFloat52 = local9 * this.aFloat52 - local24 * local15;
		this.aFloat49 = this.aFloat53 * local15 + local37 * local9;
		this.aFloat53 = local9 * this.aFloat53 - local15 * local37;
	}
}
