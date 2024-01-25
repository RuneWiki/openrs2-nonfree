import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class109_Sub3() {
		this.method4612();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IFFIIFI)V")
	public void method4340(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat90 = this.aFloat86 = this.aFloat94 = this.aFloat96 = this.aFloat92 = this.aFloat85 = 0.0F;
			this.aFloat87 = arg2 - (float) arg0;
			this.aFloat88 = 1.0F;
			this.aFloat89 = (float) -arg3 + arg1;
			this.aFloat93 = (float) (arg0 * 2);
			this.aFloat95 = (float) (arg3 * 2);
			this.aFloat91 = arg4;
			return;
		}
		@Pc(10) float local10 = Class141_Sub1.aFloatArray72[arg5 & 0x3FFF];
		@Pc(16) float local16 = Class141_Sub1.aFloatArray71[arg5 & 0x3FFF];
		this.aFloat95 = local10 * 2.0F * (float) arg3;
		this.aFloat89 = (local16 * -0.5F - local10 * 0.5F) * (float) (arg3 * 2) + arg1;
		this.aFloat93 = local10 * 2.0F * (float) arg0;
		this.aFloat91 = arg4;
		this.aFloat94 = (float) arg3 * local16 * -2.0F;
		this.aFloat87 = (local16 * 0.5F - local10 * 0.5F) * (float) (arg0 * 2) + arg2;
		this.aFloat88 = 1.0F;
		this.aFloat86 = this.aFloat96 = this.aFloat92 = this.aFloat85 = 0.0F;
		this.aFloat90 = local16 * 2.0F * (float) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(FIFF)V")
	public void method4341(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat87 += arg1;
		this.aFloat89 += arg2;
		this.aFloat91 += arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFI)V")
	public void method4342(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat90 = this.aFloat86 = this.aFloat94 = this.aFloat96 = this.aFloat92 = this.aFloat85 = 0.0F;
		this.aFloat89 = arg1;
		this.aFloat87 = arg0;
		this.aFloat93 = this.aFloat95 = this.aFloat88 = (float) 1;
		this.aFloat91 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat88 * (float) arg2 + this.aFloat96 * (float) arg1 + this.aFloat86 * (float) arg0 + this.aFloat91);
		arg3[1] = (int) ((float) arg1 * this.aFloat95 + this.aFloat90 * (float) arg0 + this.aFloat85 * (float) arg2 + this.aFloat89);
		arg3[0] = (int) (this.aFloat93 * (float) arg0 + this.aFloat94 * (float) arg1 + (float) arg2 * this.aFloat92 + this.aFloat87);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method4343(@OriginalArg(0) Class109 arg0) {
		@Pc(14) Class109_Sub3 local14 = (Class109_Sub3) arg0;
		this.aFloat90 = local14.aFloat90;
		this.aFloat95 = local14.aFloat95;
		this.aFloat91 = 0.0F;
		this.aFloat96 = local14.aFloat96;
		this.aFloat85 = local14.aFloat85;
		this.aFloat88 = local14.aFloat88;
		this.aFloat87 = 0.0F;
		this.aFloat89 = 0.0F;
		this.aFloat92 = local14.aFloat92;
		this.aFloat94 = local14.aFloat94;
		this.aFloat93 = local14.aFloat93;
		this.aFloat86 = local14.aFloat86;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([FZ)[F")
	public float[] method4345(@OriginalArg(0) float[] arg0) {
		arg0[12] = this.aFloat87;
		arg0[4] = this.aFloat94;
		arg0[2] = this.aFloat86;
		arg0[13] = this.aFloat89;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat90;
		arg0[0] = this.aFloat93;
		arg0[14] = this.aFloat91;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat88;
		arg0[11] = 0.0F;
		arg0[6] = this.aFloat96;
		arg0[9] = this.aFloat85;
		arg0[5] = this.aFloat95;
		arg0[8] = this.aFloat92;
		arg0[7] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FF[FBF)V")
	public void method4346(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[1] = arg1 * this.aFloat85 + arg3 * this.aFloat95 + this.aFloat90 * arg0;
		arg2[0] = arg3 * this.aFloat94 + arg0 * this.aFloat93 + this.aFloat92 * arg1;
		arg2[2] = this.aFloat96 * arg3 + arg0 * this.aFloat86 + arg1 * this.aFloat88;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[F)[F")
	public float[] method4347(@OriginalArg(1) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat94;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat91;
		arg0[2] = 0.0F;
		arg0[0] = this.aFloat93;
		arg0[15] = 1.0F;
		arg0[6] = 0.0F;
		arg0[9] = this.aFloat89;
		arg0[11] = 0.0F;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat87;
		arg0[1] = this.aFloat90;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat95;
		arg0[3] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZF[FFFF)V")
	public void method4348(@OriginalArg(1) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg1[2] = arg3 * this.aFloat96 + this.aFloat86 * arg4 + this.aFloat88 * arg0;
		arg1[1] = this.aFloat95 * arg3 + arg4 * this.aFloat90 + this.aFloat85 * arg0;
		@Pc(78) float local78;
		@Pc(62) float local62;
		@Pc(70) float local70;
		@Pc(54) float local54;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local54 = -arg2 / arg4;
			local62 = this.aFloat89 + this.aFloat90 * local54;
			local70 = local54 * this.aFloat86 + this.aFloat91;
			local78 = this.aFloat87 + local54 * this.aFloat93;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local54 = -arg2 / arg3;
			local62 = this.aFloat89 + this.aFloat95 * local54;
			local78 = local54 * this.aFloat94 + this.aFloat87;
			local70 = this.aFloat91 + local54 * this.aFloat96;
		} else {
			local54 = -arg2 / arg0;
			local78 = local54 * this.aFloat92 + this.aFloat87;
			local62 = this.aFloat89 + local54 * this.aFloat85;
			local70 = this.aFloat91 + this.aFloat88 * local54;
		}
		arg1[0] = this.aFloat93 * arg4 + arg3 * this.aFloat94 + arg0 * this.aFloat92;
		arg1[3] = -(arg1[0] * local78 + local62 * arg1[1] + local70 * arg1[2]);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "()V")
	@Override
	public void method4612() {
		this.aFloat93 = this.aFloat95 = this.aFloat88 = 1.0F;
		this.aFloat90 = this.aFloat86 = this.aFloat94 = this.aFloat96 = this.aFloat92 = this.aFloat85 = this.aFloat87 = this.aFloat89 = this.aFloat91 = 0.0F;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!qa;Lclient!qa;)V")
	public void method4349(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		@Pc(9) Class109_Sub3 local9 = (Class109_Sub3) arg1;
		this.aFloat93 = local9.aFloat93 * local6.aFloat93 + local9.aFloat90 * local6.aFloat94 + local9.aFloat86 * local6.aFloat92;
		this.aFloat90 = local6.aFloat90 * local9.aFloat93 + local6.aFloat95 * local9.aFloat90 + local9.aFloat86 * local6.aFloat85;
		this.aFloat94 = local6.aFloat92 * local9.aFloat96 + local9.aFloat95 * local6.aFloat94 + local6.aFloat93 * local9.aFloat94;
		this.aFloat86 = local9.aFloat93 * local6.aFloat86 + local9.aFloat90 * local6.aFloat96 + local9.aFloat86 * local6.aFloat88;
		this.aFloat95 = local9.aFloat96 * local6.aFloat85 + local9.aFloat95 * local6.aFloat95 + local9.aFloat94 * local6.aFloat90;
		this.aFloat92 = local6.aFloat92 * local9.aFloat88 + local6.aFloat94 * local9.aFloat85 + local6.aFloat93 * local9.aFloat92;
		this.aFloat96 = local6.aFloat96 * local9.aFloat95 + local6.aFloat86 * local9.aFloat94 + local6.aFloat88 * local9.aFloat96;
		this.aFloat85 = local9.aFloat88 * local6.aFloat85 + local6.aFloat90 * local9.aFloat92 + local6.aFloat95 * local9.aFloat85;
		this.aFloat87 = local6.aFloat87 + local6.aFloat94 * local9.aFloat89 + local6.aFloat93 * local9.aFloat87 + local6.aFloat92 * local9.aFloat91;
		this.aFloat88 = local6.aFloat96 * local9.aFloat85 + local6.aFloat86 * local9.aFloat92 + local9.aFloat88 * local6.aFloat88;
		this.aFloat89 = local9.aFloat91 * local6.aFloat85 + local9.aFloat87 * local6.aFloat90 + local6.aFloat95 * local9.aFloat89 + local6.aFloat89;
		this.aFloat91 = local6.aFloat91 + local6.aFloat88 * local9.aFloat91 + local6.aFloat96 * local9.aFloat89 + local6.aFloat86 * local9.aFloat87;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([I)V")
	@Override
	public void method4603(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat87;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat89;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat91;
		arg0[1] = (int) (local29 * this.aFloat96 + this.aFloat95 * local20 + local11 * this.aFloat94);
		arg0[2] = (int) (this.aFloat85 * local20 + this.aFloat92 * local11 + this.aFloat88 * local29);
		arg0[0] = (int) (local11 * this.aFloat93 + local20 * this.aFloat90 + local29 * this.aFloat86);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!qa;)V")
	public void method4350(@OriginalArg(1) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		this.aFloat94 = local6.aFloat90;
		this.aFloat93 = local6.aFloat93;
		this.aFloat92 = local6.aFloat86;
		this.aFloat86 = local6.aFloat92;
		this.aFloat85 = local6.aFloat96;
		this.aFloat95 = local6.aFloat95;
		this.aFloat90 = local6.aFloat94;
		this.aFloat87 = -(local6.aFloat87 * this.aFloat93 + local6.aFloat89 * this.aFloat94 + local6.aFloat91 * this.aFloat92);
		this.aFloat96 = local6.aFloat85;
		this.aFloat88 = local6.aFloat88;
		this.aFloat89 = -(local6.aFloat91 * this.aFloat85 + local6.aFloat87 * this.aFloat90 + local6.aFloat89 * this.aFloat95);
		this.aFloat91 = -(local6.aFloat89 * this.aFloat96 + this.aFloat86 * local6.aFloat87 + local6.aFloat91 * this.aFloat88);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(FFFI)F")
	public float method4351(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat94 * arg1 + arg0 * this.aFloat93 + arg2 * this.aFloat92 + this.aFloat87;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III[I)V")
	@Override
	public void method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat92 * (float) arg2 + (float) arg1 * this.aFloat94 + (float) arg0 * this.aFloat93);
		arg3[1] = (int) ((float) arg0 * this.aFloat90 + this.aFloat95 * (float) arg1 + this.aFloat85 * (float) arg2);
		arg3[2] = (int) (this.aFloat86 * (float) arg0 + this.aFloat96 * (float) arg1 + (float) arg2 * this.aFloat88);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(FIFF)F")
	public float method4352(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat89 + arg2 * this.aFloat85 + arg0 * this.aFloat95 + this.aFloat90 * arg1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	@Override
	public void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 += (float) arg1;
		this.aFloat87 += (float) arg0;
		this.aFloat91 += (float) arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFB)F")
	public float method4353(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat91 + this.aFloat86 * arg1 + this.aFloat96 * arg2 + arg0 * this.aFloat88;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()Lclient!qa;")
	@Override
	public Class109 method4609() {
		@Pc(7) Class109_Sub3 local7 = new Class109_Sub3();
		local7.aFloat86 = this.aFloat86;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat87 = this.aFloat87;
		return local7;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
	@Override
	public void method4598(@OriginalArg(0) int arg0) {
		this.aFloat88 = 1.0F;
		this.aFloat93 = this.aFloat95 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat90 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat94 = -this.aFloat90;
		this.aFloat92 = this.aFloat87 = this.aFloat85 = this.aFloat89 = this.aFloat86 = this.aFloat96 = this.aFloat91 = 0.0F;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FIFF)V")
	public void method4354(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat85 *= arg2;
		this.aFloat89 *= arg2;
		this.aFloat94 *= arg1;
		this.aFloat87 *= arg1;
		this.aFloat96 *= arg0;
		this.aFloat91 *= arg0;
		this.aFloat90 *= arg2;
		this.aFloat93 *= arg1;
		this.aFloat95 *= arg2;
		this.aFloat86 *= arg0;
		this.aFloat92 *= arg1;
		this.aFloat88 *= arg0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(FIFF)V")
	public void method4355(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat94 = 0.0F;
		this.aFloat88 = arg1;
		this.aFloat93 = arg2;
		this.aFloat86 = 0.0F;
		this.aFloat96 = 0.0F;
		this.aFloat95 = arg0;
		this.aFloat90 = 0.0F;
		this.aFloat87 = 0.0F;
		this.aFloat92 = 0.0F;
		this.aFloat85 = 0.0F;
		this.aFloat91 = 0.0F;
		this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "([FI)[F")
	public float[] method4356(@OriginalArg(0) float[] arg0) {
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat92;
		arg0[3] = 0.0F;
		arg0[6] = this.aFloat85;
		arg0[1] = this.aFloat94;
		arg0[9] = this.aFloat96;
		arg0[14] = 0.0F;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat88;
		arg0[15] = 0.0F;
		arg0[0] = this.aFloat93;
		arg0[8] = this.aFloat86;
		arg0[5] = this.aFloat95;
		arg0[4] = this.aFloat90;
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "([FI)[F")
	public float[] method4357(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[11] = this.aFloat91;
		arg0[8] = this.aFloat86;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[7] = this.aFloat89;
		arg0[6] = this.aFloat85;
		arg0[9] = this.aFloat96;
		arg0[3] = this.aFloat87;
		arg0[2] = this.aFloat92;
		arg0[4] = this.aFloat90;
		arg0[5] = this.aFloat95;
		arg0[1] = this.aFloat94;
		arg0[0] = this.aFloat93;
		arg0[10] = this.aFloat88;
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	@Override
	public void method4611(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat93;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat92;
		this.aFloat93 = local9 * local18 - local15 * this.aFloat90;
		@Pc(37) float local37 = this.aFloat87;
		this.aFloat90 = local15 * local18 + local9 * this.aFloat90;
		this.aFloat94 = local9 * local21 - local15 * this.aFloat95;
		this.aFloat95 = local15 * local21 + this.aFloat95 * local9;
		this.aFloat92 = local24 * local9 - local15 * this.aFloat85;
		this.aFloat87 = local9 * local37 - local15 * this.aFloat89;
		this.aFloat85 = this.aFloat85 * local9 + local24 * local15;
		this.aFloat89 = local37 * local15 + local9 * this.aFloat89;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public void method4607(@OriginalArg(0) int arg0) {
		this.aFloat93 = 1.0F;
		this.aFloat95 = this.aFloat88 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat96 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat94 = this.aFloat92 = this.aFloat87 = this.aFloat90 = this.aFloat89 = this.aFloat86 = this.aFloat91 = 0.0F;
		this.aFloat85 = -this.aFloat96;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III[I)V")
	@Override
	public void method4610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat89);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat87);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat91);
		arg3[1] = (int) ((float) local17 * this.aFloat94 + (float) local10 * this.aFloat95 + (float) local24 * this.aFloat96);
		arg3[0] = (int) ((float) local24 * this.aFloat86 + this.aFloat93 * (float) local17 + this.aFloat90 * (float) local10);
		arg3[2] = (int) ((float) local24 * this.aFloat88 + this.aFloat92 * (float) local17 + this.aFloat85 * (float) local10);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method4595(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		this.aFloat91 = local6.aFloat91;
		this.aFloat92 = local6.aFloat92;
		this.aFloat94 = local6.aFloat94;
		this.aFloat89 = local6.aFloat89;
		this.aFloat95 = local6.aFloat95;
		this.aFloat87 = local6.aFloat87;
		this.aFloat86 = local6.aFloat86;
		this.aFloat96 = local6.aFloat96;
		this.aFloat93 = local6.aFloat93;
		this.aFloat85 = local6.aFloat85;
		this.aFloat88 = local6.aFloat88;
		this.aFloat90 = local6.aFloat90;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V")
	public void method4358() {
		this.aFloat96 = -this.aFloat96;
		this.aFloat90 = -this.aFloat90;
		this.aFloat86 = -this.aFloat86;
		this.aFloat95 = -this.aFloat95;
		this.aFloat88 = -this.aFloat88;
		this.aFloat89 = -this.aFloat89;
		this.aFloat85 = -this.aFloat85;
		this.aFloat91 = -this.aFloat91;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!qa;I)V")
	public void method4359(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class109_Sub3 local6 = (Class109_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat93;
		@Pc(12) float local12 = this.aFloat90;
		@Pc(22) float local22 = this.aFloat94;
		@Pc(25) float local25 = this.aFloat95;
		@Pc(28) float local28 = this.aFloat92;
		@Pc(31) float local31 = this.aFloat85;
		@Pc(34) float local34 = this.aFloat87;
		this.aFloat90 = local6.aFloat85 * this.aFloat86 + local9 * local6.aFloat90 + local12 * local6.aFloat95;
		this.aFloat93 = local6.aFloat92 * this.aFloat86 + local12 * local6.aFloat94 + local6.aFloat93 * local9;
		@Pc(71) float local71 = this.aFloat89;
		this.aFloat86 = this.aFloat86 * local6.aFloat88 + local6.aFloat86 * local9 + local12 * local6.aFloat96;
		this.aFloat94 = local22 * local6.aFloat93 + local6.aFloat94 * local25 + local6.aFloat92 * this.aFloat96;
		this.aFloat95 = local6.aFloat90 * local22 + local6.aFloat95 * local25 + local6.aFloat85 * this.aFloat96;
		this.aFloat92 = local6.aFloat92 * this.aFloat88 + local6.aFloat94 * local31 + local28 * local6.aFloat93;
		this.aFloat96 = local6.aFloat88 * this.aFloat96 + local25 * local6.aFloat96 + local22 * local6.aFloat86;
		this.aFloat85 = local6.aFloat95 * local31 + local28 * local6.aFloat90 + local6.aFloat85 * this.aFloat88;
		this.aFloat88 = local6.aFloat86 * local28 + local6.aFloat96 * local31 + local6.aFloat88 * this.aFloat88;
		this.aFloat87 = local6.aFloat87 + local6.aFloat94 * local71 + local6.aFloat93 * local34 + local6.aFloat92 * this.aFloat91;
		this.aFloat89 = local6.aFloat89 + local6.aFloat85 * this.aFloat91 + local6.aFloat90 * local34 + local6.aFloat95 * local71;
		this.aFloat91 = local71 * local6.aFloat96 + local34 * local6.aFloat86 + local6.aFloat88 * this.aFloat91 + local6.aFloat91;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([FI)[F")
	public float[] method4360(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat93;
		arg0[1] = this.aFloat94;
		arg0[4] = this.aFloat90;
		arg0[5] = this.aFloat95;
		arg0[2] = this.aFloat92;
		arg0[6] = this.aFloat85;
		arg0[3] = this.aFloat87;
		arg0[7] = this.aFloat89;
		return arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class141_Sub1.aFloatArray72[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class141_Sub1.aFloatArray71[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class141_Sub1.aFloatArray72[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class141_Sub1.aFloatArray71[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat93 = local27 * local47 + local21 * local33;
		this.aFloat94 = local9 * local39;
		this.aFloat96 = -local15;
		this.aFloat92 = local47 * local21 + -local27 * local33;
		this.aFloat90 = -local21 * local39 + local43 * local27;
		this.aFloat95 = local33 * local9;
		this.aFloat88 = local9 * local21;
		this.aFloat85 = local43 * local21 + local39 * local27;
		this.aFloat86 = local9 * local27;
		this.aFloat89 = (float) -arg0 * this.aFloat90 - (float) arg1 * this.aFloat95 - this.aFloat85 * (float) arg2;
		this.aFloat87 = -((float) arg1 * this.aFloat94) + (float) -arg0 * this.aFloat93 - this.aFloat92 * (float) arg2;
		this.aFloat91 = -((float) arg2 * this.aFloat88) - this.aFloat96 * (float) arg1 + this.aFloat86 * (float) -arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFIFFFFFF)V")
	public void method4361(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat92 = arg2;
		this.aFloat91 = 0.0F;
		this.aFloat88 = arg5;
		this.aFloat94 = arg8;
		this.aFloat93 = arg1;
		this.aFloat89 = 0.0F;
		this.aFloat90 = arg0;
		this.aFloat87 = 0.0F;
		this.aFloat86 = arg4;
		this.aFloat95 = arg6;
		this.aFloat85 = arg7;
		this.aFloat96 = arg3;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	@Override
	public void method4605(@OriginalArg(0) int arg0) {
		this.aFloat95 = 1.0F;
		this.aFloat93 = this.aFloat88 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		this.aFloat92 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		this.aFloat94 = this.aFloat87 = this.aFloat90 = this.aFloat85 = this.aFloat89 = this.aFloat96 = this.aFloat91 = 0.0F;
		this.aFloat86 = -this.aFloat92;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
	@Override
	public void method4602(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat90;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat85;
		@Pc(27) float local27 = this.aFloat89;
		this.aFloat90 = local18 * local9 - local15 * this.aFloat86;
		this.aFloat86 = local15 * local18 + local9 * this.aFloat86;
		this.aFloat95 = local9 * local21 - this.aFloat96 * local15;
		this.aFloat96 = local9 * this.aFloat96 + local21 * local15;
		this.aFloat85 = local9 * local24 - this.aFloat88 * local15;
		this.aFloat89 = local27 * local9 - local15 * this.aFloat91;
		this.aFloat88 = this.aFloat88 * local9 + local24 * local15;
		this.aFloat91 = local9 * this.aFloat91 + local27 * local15;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	@Override
	public void method4608(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class141_Sub1.aFloatArray72[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class141_Sub1.aFloatArray71[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat93;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat92;
		@Pc(27) float local27 = this.aFloat87;
		this.aFloat93 = this.aFloat86 * local15 + local18 * local9;
		this.aFloat94 = local15 * this.aFloat96 + local21 * local9;
		this.aFloat86 = this.aFloat86 * local9 - local18 * local15;
		this.aFloat96 = this.aFloat96 * local9 - local15 * local21;
		this.aFloat92 = local24 * local9 + this.aFloat88 * local15;
		this.aFloat87 = local15 * this.aFloat91 + local9 * local27;
		this.aFloat88 = this.aFloat88 * local9 - local15 * local24;
		this.aFloat91 = local9 * this.aFloat91 - local15 * local27;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 = (float) arg1;
		this.aFloat90 = this.aFloat86 = this.aFloat94 = this.aFloat96 = this.aFloat92 = this.aFloat85 = 0.0F;
		this.aFloat93 = this.aFloat95 = this.aFloat88 = 1.0F;
		this.aFloat91 = (float) arg2;
		this.aFloat87 = (float) arg0;
	}
}
