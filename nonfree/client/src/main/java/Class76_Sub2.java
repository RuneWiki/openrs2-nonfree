import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "F")
	public float aFloat169;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "F")
	public float aFloat170;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!pg", name = "V", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!pg", name = "X", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!pg", name = "db", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class76_Sub2() {
		this.method9631();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(F[FFFB)V")
	public void method7327(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[1] = this.aFloat172 * arg0 + arg2 * this.aFloat168 + arg3 * this.aFloat165;
		arg1[2] = this.aFloat175 * arg0 + arg3 * this.aFloat166 + arg2 * this.aFloat174;
		arg1[0] = this.aFloat167 * arg2 + this.aFloat173 * arg3 + this.aFloat171 * arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!dm;Z)V")
	public void method7328(@OriginalArg(0) Class76 arg0) {
		@Pc(6) Class76_Sub2 local6 = (Class76_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat167;
		@Pc(12) float local12 = this.aFloat168;
		@Pc(15) float local15 = this.aFloat173;
		@Pc(18) float local18 = this.aFloat165;
		@Pc(21) float local21 = this.aFloat171;
		@Pc(24) float local24 = this.aFloat172;
		@Pc(31) float local31 = this.aFloat176;
		this.aFloat168 = local6.aFloat172 * this.aFloat174 + local9 * local6.aFloat168 + local12 * local6.aFloat165;
		@Pc(51) float local51 = this.aFloat170;
		this.aFloat167 = local6.aFloat171 * this.aFloat174 + local6.aFloat167 * local9 + local12 * local6.aFloat173;
		this.aFloat173 = local6.aFloat173 * local18 + local15 * local6.aFloat167 + this.aFloat166 * local6.aFloat171;
		this.aFloat165 = local18 * local6.aFloat165 + local6.aFloat168 * local15 + local6.aFloat172 * this.aFloat166;
		this.aFloat174 = this.aFloat174 * local6.aFloat175 + local6.aFloat174 * local9 + local6.aFloat166 * local12;
		this.aFloat166 = local6.aFloat175 * this.aFloat166 + local15 * local6.aFloat174 + local6.aFloat166 * local18;
		this.aFloat171 = local6.aFloat171 * this.aFloat175 + local24 * local6.aFloat173 + local6.aFloat167 * local21;
		this.aFloat172 = this.aFloat175 * local6.aFloat172 + local6.aFloat165 * local24 + local21 * local6.aFloat168;
		this.aFloat175 = local6.aFloat166 * local24 + local21 * local6.aFloat174 + this.aFloat175 * local6.aFloat175;
		this.aFloat170 = local31 * local6.aFloat168 + local51 * local6.aFloat165 + this.aFloat169 * local6.aFloat172 + local6.aFloat170;
		this.aFloat176 = local6.aFloat171 * this.aFloat169 + local51 * local6.aFloat173 + local6.aFloat167 * local31 + local6.aFloat176;
		this.aFloat169 = local51 * local6.aFloat166 + local31 * local6.aFloat174 + this.aFloat169 * local6.aFloat175 + local6.aFloat169;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[F)[F")
	public float[] method7329(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat173;
		arg0[2] = this.aFloat171;
		arg0[6] = this.aFloat172;
		arg0[0] = this.aFloat167;
		arg0[4] = this.aFloat168;
		arg0[5] = this.aFloat165;
		arg0[3] = this.aFloat176;
		arg0[7] = this.aFloat170;
		return arg0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I[F)[F")
	public float[] method7330(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat174;
		arg0[2] = this.aFloat171;
		arg0[9] = this.aFloat166;
		arg0[11] = this.aFloat169;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat175;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat173;
		arg0[14] = 0.0F;
		arg0[6] = this.aFloat172;
		arg0[3] = this.aFloat176;
		arg0[7] = this.aFloat170;
		arg0[5] = this.aFloat165;
		arg0[4] = this.aFloat168;
		arg0[0] = this.aFloat167;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III[I)V")
	@Override
	public void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat176);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat169);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat170);
		arg3[2] = (int) ((float) local10 * this.aFloat171 + this.aFloat172 * (float) local24 + (float) local17 * this.aFloat175);
		arg3[0] = (int) (this.aFloat174 * (float) local17 + (float) local24 * this.aFloat168 + (float) local10 * this.aFloat167);
		arg3[1] = (int) (this.aFloat173 * (float) local10 + (float) local24 * this.aFloat165 + this.aFloat166 * (float) local17);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B[F)[F")
	public float[] method7331(@OriginalArg(1) float[] arg0) {
		arg0[10] = this.aFloat169;
		arg0[7] = 0.0F;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat167;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat165;
		arg0[2] = 0.0F;
		arg0[8] = this.aFloat176;
		arg0[1] = this.aFloat168;
		arg0[6] = 0.0F;
		arg0[9] = this.aFloat170;
		arg0[11] = 0.0F;
		arg0[14] = 0.0F;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat173;
		return arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFIF)V")
	public void method7332(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat176 += arg2;
		this.aFloat170 += arg0;
		this.aFloat169 += arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IFFF)F")
	public float method7333(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat171 + this.aFloat173 * arg0 + this.aFloat167 * arg2 + this.aFloat176;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	@Override
	public void method9640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat176 += (float) arg0;
		this.aFloat169 += (float) arg2;
		this.aFloat170 += (float) arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIFF)V")
	public void method7334(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat167 = arg0;
		this.aFloat169 = 0.0F;
		this.aFloat166 = 0.0F;
		this.aFloat168 = 0.0F;
		this.aFloat175 = arg1;
		this.aFloat172 = (float) 0;
		this.aFloat173 = 0.0F;
		this.aFloat176 = 0.0F;
		this.aFloat165 = arg2;
		this.aFloat170 = 0.0F;
		this.aFloat171 = 0.0F;
		this.aFloat174 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!dm;Lclient!dm;)V")
	public void method7335(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1) {
		@Pc(6) Class76_Sub2 local6 = (Class76_Sub2) arg0;
		@Pc(9) Class76_Sub2 local9 = (Class76_Sub2) arg1;
		this.aFloat167 = local6.aFloat167 * local9.aFloat167 + local6.aFloat173 * local9.aFloat168 + local9.aFloat174 * local6.aFloat171;
		this.aFloat168 = local9.aFloat167 * local6.aFloat168 + local9.aFloat168 * local6.aFloat165 + local6.aFloat172 * local9.aFloat174;
		this.aFloat173 = local6.aFloat171 * local9.aFloat166 + local6.aFloat173 * local9.aFloat165 + local9.aFloat173 * local6.aFloat167;
		this.aFloat174 = local6.aFloat174 * local9.aFloat167 + local9.aFloat168 * local6.aFloat166 + local9.aFloat174 * local6.aFloat175;
		this.aFloat165 = local9.aFloat173 * local6.aFloat168 + local9.aFloat165 * local6.aFloat165 + local6.aFloat172 * local9.aFloat166;
		this.aFloat166 = local6.aFloat175 * local9.aFloat166 + local9.aFloat173 * local6.aFloat174 + local9.aFloat165 * local6.aFloat166;
		this.aFloat171 = local9.aFloat175 * local6.aFloat171 + local9.aFloat171 * local6.aFloat167 + local6.aFloat173 * local9.aFloat172;
		this.aFloat172 = local9.aFloat171 * local6.aFloat168 + local9.aFloat172 * local6.aFloat165 + local9.aFloat175 * local6.aFloat172;
		this.aFloat176 = local9.aFloat169 * local6.aFloat171 + local6.aFloat167 * local9.aFloat176 + local9.aFloat170 * local6.aFloat173 + local6.aFloat176;
		this.aFloat175 = local6.aFloat166 * local9.aFloat172 + local9.aFloat171 * local6.aFloat174 + local9.aFloat175 * local6.aFloat175;
		this.aFloat170 = local9.aFloat169 * local6.aFloat172 + local9.aFloat176 * local6.aFloat168 + local6.aFloat165 * local9.aFloat170 + local6.aFloat170;
		this.aFloat169 = local6.aFloat169 + local6.aFloat175 * local9.aFloat169 + local9.aFloat176 * local6.aFloat174 + local9.aFloat170 * local6.aFloat166;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IFFF)F")
	public float method7336(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat169 + arg0 * this.aFloat175 + arg1 * this.aFloat174 + this.aFloat166 * arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!dm;)V")
	public void method7337(@OriginalArg(1) Class76 arg0) {
		@Pc(6) Class76_Sub2 local6 = (Class76_Sub2) arg0;
		this.aFloat176 = 0.0F;
		this.aFloat175 = local6.aFloat175;
		this.aFloat166 = local6.aFloat166;
		this.aFloat174 = local6.aFloat174;
		this.aFloat173 = local6.aFloat173;
		this.aFloat171 = local6.aFloat171;
		this.aFloat169 = 0.0F;
		this.aFloat170 = 0.0F;
		this.aFloat165 = local6.aFloat165;
		this.aFloat168 = local6.aFloat168;
		this.aFloat167 = local6.aFloat167;
		this.aFloat172 = local6.aFloat172;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	@Override
	public void method9634(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat173;
		@Pc(24) float local24 = this.aFloat171;
		@Pc(27) float local27 = this.aFloat176;
		this.aFloat167 = local15 * this.aFloat174 + local18 * local9;
		this.aFloat173 = local15 * this.aFloat166 + local9 * local21;
		this.aFloat174 = local9 * this.aFloat174 - local18 * local15;
		this.aFloat166 = this.aFloat166 * local9 - local15 * local21;
		this.aFloat171 = local9 * local24 + this.aFloat175 * local15;
		this.aFloat176 = local27 * local9 + local15 * this.aFloat169;
		this.aFloat175 = this.aFloat175 * local9 - local15 * local24;
		this.aFloat169 = this.aFloat169 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!dm;B)V")
	public void method7339(@OriginalArg(0) Class76 arg0) {
		@Pc(6) Class76_Sub2 local6 = (Class76_Sub2) arg0;
		this.aFloat173 = local6.aFloat168;
		this.aFloat171 = local6.aFloat174;
		this.aFloat167 = local6.aFloat167;
		this.aFloat174 = local6.aFloat171;
		this.aFloat168 = local6.aFloat173;
		this.aFloat165 = local6.aFloat165;
		this.aFloat172 = local6.aFloat166;
		this.aFloat175 = local6.aFloat175;
		this.aFloat166 = local6.aFloat172;
		this.aFloat176 = -(local6.aFloat169 * this.aFloat171 + local6.aFloat176 * this.aFloat167 + local6.aFloat170 * this.aFloat173);
		this.aFloat170 = -(local6.aFloat170 * this.aFloat165 + local6.aFloat176 * this.aFloat168 + local6.aFloat169 * this.aFloat172);
		this.aFloat169 = -(this.aFloat166 * local6.aFloat170 + local6.aFloat176 * this.aFloat174 + local6.aFloat169 * this.aFloat175);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	@Override
	public void method9631() {
		this.aFloat167 = this.aFloat165 = this.aFloat175 = 1.0F;
		this.aFloat168 = this.aFloat174 = this.aFloat173 = this.aFloat166 = this.aFloat171 = this.aFloat172 = this.aFloat176 = this.aFloat170 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	@Override
	public void method9632(@OriginalArg(0) int arg0) {
		this.aFloat175 = 1.0F;
		this.aFloat167 = this.aFloat165 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat168 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat173 = -this.aFloat168;
		this.aFloat171 = this.aFloat176 = this.aFloat172 = this.aFloat170 = this.aFloat174 = this.aFloat166 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	public void method7340() {
		this.aFloat174 = -this.aFloat174;
		this.aFloat169 = -this.aFloat169;
		this.aFloat166 = -this.aFloat166;
		this.aFloat168 = -this.aFloat168;
		this.aFloat172 = -this.aFloat172;
		this.aFloat170 = -this.aFloat170;
		this.aFloat175 = -this.aFloat175;
		this.aFloat165 = -this.aFloat165;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[I)V")
	@Override
	public void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat165 * (float) arg1 + (float) arg0 * this.aFloat168 + this.aFloat172 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat171 + (float) arg0 * this.aFloat167 + (float) arg1 * this.aFloat173);
		arg3[2] = (int) (this.aFloat175 * (float) arg2 + this.aFloat174 * (float) arg0 + this.aFloat166 * (float) arg1);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	@Override
	public void method9633(@OriginalArg(0) int arg0) {
		this.aFloat165 = 1.0F;
		this.aFloat167 = this.aFloat175 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat171 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat174 = -this.aFloat171;
		this.aFloat173 = this.aFloat176 = this.aFloat168 = this.aFloat172 = this.aFloat170 = this.aFloat166 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IFFF)F")
	public float method7341(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat170 + arg1 * this.aFloat172 + this.aFloat165 * arg2 + arg0 * this.aFloat168;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method9629(@OriginalArg(0) Class76 arg0) {
		@Pc(6) Class76_Sub2 local6 = (Class76_Sub2) arg0;
		this.aFloat175 = local6.aFloat175;
		this.aFloat174 = local6.aFloat174;
		this.aFloat171 = local6.aFloat171;
		this.aFloat167 = local6.aFloat167;
		this.aFloat169 = local6.aFloat169;
		this.aFloat173 = local6.aFloat173;
		this.aFloat165 = local6.aFloat165;
		this.aFloat168 = local6.aFloat168;
		this.aFloat166 = local6.aFloat166;
		this.aFloat170 = local6.aFloat170;
		this.aFloat176 = local6.aFloat176;
		this.aFloat172 = local6.aFloat172;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIFFIII)V")
	public void method7342(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 == 0) {
			this.aFloat169 = arg1;
			this.aFloat175 = 1.0F;
			this.aFloat170 = arg0 - (float) arg5;
			this.aFloat168 = this.aFloat174 = this.aFloat173 = this.aFloat166 = this.aFloat171 = this.aFloat172 = 0.0F;
			this.aFloat167 = (float) (arg3 * 2);
			this.aFloat176 = arg2 - (float) arg3;
			this.aFloat165 = (float) (arg5 * 2);
			return;
		}
		@Pc(16) float local16 = Class2_Sub43.aFloatArray53[arg4 & 0x3FFF];
		@Pc(22) float local22 = Class2_Sub43.aFloatArray54[arg4 & 0x3FFF];
		this.aFloat176 = (float) (arg3 * 2) * (local22 * 0.5F - local16 * 0.5F) + arg2;
		this.aFloat170 = arg0 + (float) (arg5 * 2) * (-0.5F * local22 - local16 * 0.5F);
		this.aFloat173 = (float) arg5 * local22 * -2.0F;
		this.aFloat169 = arg1;
		this.aFloat174 = this.aFloat166 = this.aFloat171 = this.aFloat172 = 0.0F;
		this.aFloat165 = (float) arg5 * local16 * 2.0F;
		this.aFloat175 = 1.0F;
		this.aFloat168 = (float) arg3 * local22 * 2.0F;
		this.aFloat167 = local16 * 2.0F * (float) arg3;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(FIFF)V")
	public void method7343(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat169 = arg1;
		this.aFloat176 = arg0;
		this.aFloat167 = this.aFloat165 = this.aFloat175 = 1.0F;
		this.aFloat168 = this.aFloat174 = this.aFloat173 = this.aFloat166 = this.aFloat171 = this.aFloat172 = 0.0F;
		this.aFloat170 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([FB)[F")
	public float[] method7344(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat165;
		arg0[10] = this.aFloat175;
		arg0[6] = this.aFloat172;
		arg0[2] = this.aFloat171;
		arg0[0] = this.aFloat167;
		arg0[11] = 0.0F;
		arg0[13] = 0.0F;
		arg0[12] = 0.0F;
		arg0[9] = this.aFloat166;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat173;
		arg0[15] = 0.0F;
		arg0[8] = this.aFloat174;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat168;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	@Override
	public void method9637(@OriginalArg(0) int arg0) {
		this.aFloat167 = 1.0F;
		this.aFloat165 = this.aFloat175 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		this.aFloat166 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		this.aFloat172 = -this.aFloat166;
		this.aFloat173 = this.aFloat171 = this.aFloat176 = this.aFloat168 = this.aFloat170 = this.aFloat174 = this.aFloat169 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void method9639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat167 = this.aFloat165 = this.aFloat175 = 1.0F;
		this.aFloat176 = (float) arg0;
		this.aFloat170 = (float) arg1;
		this.aFloat168 = this.aFloat174 = this.aFloat173 = this.aFloat166 = this.aFloat171 = this.aFloat172 = 0.0F;
		this.aFloat169 = (float) arg2;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	@Override
	public void method9630(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat168;
		@Pc(21) float local21 = this.aFloat165;
		@Pc(24) float local24 = this.aFloat172;
		@Pc(27) float local27 = this.aFloat170;
		this.aFloat168 = local9 * local18 - this.aFloat174 * local15;
		this.aFloat165 = local9 * local21 - this.aFloat166 * local15;
		this.aFloat174 = local9 * this.aFloat174 + local15 * local18;
		this.aFloat172 = local24 * local9 - local15 * this.aFloat175;
		this.aFloat166 = this.aFloat166 * local9 + local21 * local15;
		this.aFloat175 = local9 * this.aFloat175 + local24 * local15;
		this.aFloat170 = local9 * local27 - this.aFloat169 * local15;
		this.aFloat169 = local9 * this.aFloat169 + local27 * local15;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([I)V")
	@Override
	public void method9638(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat176;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat170;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat169;
		arg0[2] = (int) (local28 * this.aFloat175 + this.aFloat172 * local19 + this.aFloat171 * local11);
		arg0[1] = (int) (local11 * this.aFloat173 + local19 * this.aFloat165 + local28 * this.aFloat166);
		arg0[0] = (int) (local19 * this.aFloat168 + local11 * this.aFloat167 + local28 * this.aFloat174);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFFFFFBFFF)V")
	public void method7346(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat165 = arg2;
		this.aFloat171 = arg3;
		this.aFloat176 = 0.0F;
		this.aFloat174 = arg6;
		this.aFloat173 = arg4;
		this.aFloat169 = 0.0F;
		this.aFloat167 = arg1;
		this.aFloat168 = arg8;
		this.aFloat166 = arg5;
		this.aFloat175 = arg0;
		this.aFloat172 = arg7;
		this.aFloat170 = 0.0F;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub43.aFloatArray53[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub43.aFloatArray54[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub43.aFloatArray53[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub43.aFloatArray54[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat165 = local33 * local9;
		this.aFloat173 = local39 * local9;
		this.aFloat171 = -local27 * local33 + local47 * local21;
		this.aFloat168 = local43 * local27 + -local21 * local39;
		this.aFloat172 = local39 * local27 + local21 * local43;
		this.aFloat167 = local33 * local21 + local27 * local47;
		this.aFloat175 = local9 * local21;
		this.aFloat174 = local27 * local9;
		this.aFloat166 = -local15;
		this.aFloat169 = -(this.aFloat166 * (float) arg1) + this.aFloat174 * (float) -arg0 - this.aFloat175 * (float) arg2;
		this.aFloat176 = this.aFloat167 * (float) -arg0 - (float) arg1 * this.aFloat173 - (float) arg2 * this.aFloat171;
		this.aFloat170 = -(this.aFloat165 * (float) arg1) + (float) -arg0 * this.aFloat168 - this.aFloat172 * (float) arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([FI)[F")
	public float[] method7347(@OriginalArg(0) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat173;
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat166;
		arg0[2] = this.aFloat174;
		arg0[1] = this.aFloat168;
		arg0[13] = this.aFloat170;
		arg0[14] = this.aFloat169;
		arg0[0] = this.aFloat167;
		arg0[5] = this.aFloat165;
		arg0[9] = this.aFloat172;
		arg0[10] = this.aFloat175;
		arg0[12] = this.aFloat176;
		arg0[8] = this.aFloat171;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method9627(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub43.aFloatArray53[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub43.aFloatArray54[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat167;
		@Pc(21) float local21 = this.aFloat173;
		@Pc(24) float local24 = this.aFloat171;
		this.aFloat167 = local18 * local9 - this.aFloat168 * local15;
		@Pc(37) float local37 = this.aFloat176;
		this.aFloat168 = local9 * this.aFloat168 + local15 * local18;
		this.aFloat173 = local9 * local21 - this.aFloat165 * local15;
		this.aFloat165 = local15 * local21 + local9 * this.aFloat165;
		this.aFloat171 = local24 * local9 - this.aFloat172 * local15;
		this.aFloat172 = this.aFloat172 * local9 + local24 * local15;
		this.aFloat176 = local9 * local37 - this.aFloat170 * local15;
		this.aFloat170 = local9 * this.aFloat170 + local15 * local37;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method9643() {
		@Pc(7) Class76_Sub2 local7 = new Class76_Sub2();
		local7.aFloat169 = this.aFloat169;
		local7.aFloat165 = this.aFloat165;
		local7.aFloat171 = this.aFloat171;
		local7.aFloat166 = this.aFloat166;
		local7.aFloat167 = this.aFloat167;
		local7.aFloat168 = this.aFloat168;
		local7.aFloat174 = this.aFloat174;
		local7.aFloat176 = this.aFloat176;
		local7.aFloat175 = this.aFloat175;
		local7.aFloat170 = this.aFloat170;
		local7.aFloat172 = this.aFloat172;
		local7.aFloat173 = this.aFloat173;
		return local7;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FBFFF[F)V")
	public void method7348(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[1] = arg3 * this.aFloat172 + arg1 * this.aFloat168 + arg2 * this.aFloat165;
		arg4[0] = arg3 * this.aFloat171 + this.aFloat173 * arg2 + this.aFloat167 * arg1;
		@Pc(60) float local60;
		@Pc(76) float local76;
		@Pc(68) float local68;
		@Pc(52) float local52;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local52 = -arg0 / arg1;
			local60 = this.aFloat167 * local52 + this.aFloat176;
			local68 = this.aFloat169 + local52 * this.aFloat174;
			local76 = this.aFloat168 * local52 + this.aFloat170;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local52 = -arg0 / arg2;
			local68 = this.aFloat169 + this.aFloat166 * local52;
			local76 = this.aFloat170 + this.aFloat165 * local52;
			local60 = local52 * this.aFloat173 + this.aFloat176;
		} else {
			local52 = -arg0 / arg3;
			local68 = this.aFloat169 + local52 * this.aFloat175;
			local76 = local52 * this.aFloat172 + this.aFloat170;
			local60 = this.aFloat171 * local52 + this.aFloat176;
		}
		arg4[2] = this.aFloat175 * arg3 + this.aFloat174 * arg1 + this.aFloat166 * arg2;
		arg4[3] = -(arg4[0] * local60 + arg4[1] * local76 + arg4[2] * local68);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(FFFI)V")
	public void method7349(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat167 *= arg2;
		this.aFloat173 *= arg2;
		this.aFloat170 *= arg0;
		this.aFloat175 *= arg1;
		this.aFloat169 *= arg1;
		this.aFloat168 *= arg0;
		this.aFloat166 *= arg1;
		this.aFloat171 *= arg2;
		this.aFloat172 *= arg0;
		this.aFloat174 *= arg1;
		this.aFloat165 *= arg0;
		this.aFloat176 *= arg2;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III[I)V")
	@Override
	public void method9642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat166 + (float) arg0 * this.aFloat174 + this.aFloat175 * (float) arg2 + this.aFloat169);
		arg3[1] = (int) (this.aFloat165 * (float) arg1 + (float) arg0 * this.aFloat168 + this.aFloat172 * (float) arg2 + this.aFloat170);
		arg3[0] = (int) (this.aFloat176 + (float) arg2 * this.aFloat171 + (float) arg1 * this.aFloat173 + this.aFloat167 * (float) arg0);
	}
}
