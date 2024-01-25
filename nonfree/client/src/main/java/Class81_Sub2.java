import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class81_Sub2 extends Class81 {

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!ho", name = "N", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!ho", name = "O", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class81_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat85 + (float) arg0 * this.aFloat84 + this.aFloat86 * (float) arg2 + this.aFloat93);
		arg3[0] = (int) (this.aFloat95 * (float) arg1 + (float) arg0 * this.aFloat94 + this.aFloat91 * (float) arg2 + this.aFloat87);
		arg3[1] = (int) ((float) arg2 * this.aFloat90 + this.aFloat89 * (float) arg0 + (float) arg1 * this.aFloat92 + this.aFloat88);
	}

	@OriginalMember(owner = "client!ho", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat93 += arg2;
		this.aFloat87 += arg0;
		this.aFloat88 += arg1;
	}

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat86 = 1.0F;
		this.aFloat94 = this.aFloat92 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat89 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat91 = this.aFloat87 = this.aFloat90 = this.aFloat88 = this.aFloat84 = this.aFloat85 = this.aFloat93 = 0.0F;
		this.aFloat95 = -this.aFloat89;
	}

	@OriginalMember(owner = "client!ho", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat94;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat91;
		this.aFloat94 = local15 * this.aFloat84 + local18 * local9;
		@Pc(37) float local37 = this.aFloat87;
		this.aFloat84 = this.aFloat84 * local9 - local18 * local15;
		this.aFloat95 = local9 * local21 + this.aFloat85 * local15;
		this.aFloat85 = local9 * this.aFloat85 - local15 * local21;
		this.aFloat91 = local9 * local24 + local15 * this.aFloat86;
		this.aFloat86 = local9 * this.aFloat86 - local24 * local15;
		this.aFloat87 = local37 * local9 + this.aFloat93 * local15;
		this.aFloat93 = local9 * this.aFloat93 - local15 * local37;
	}

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat89;
		@Pc(21) float local21 = this.aFloat92;
		@Pc(24) float local24 = this.aFloat90;
		@Pc(27) float local27 = this.aFloat88;
		this.aFloat89 = local9 * local18 - local15 * this.aFloat84;
		this.aFloat92 = local21 * local9 - local15 * this.aFloat85;
		this.aFloat84 = this.aFloat84 * local9 + local15 * local18;
		this.aFloat85 = local21 * local15 + local9 * this.aFloat85;
		this.aFloat90 = local24 * local9 - this.aFloat86 * local15;
		this.aFloat88 = local9 * local27 - local15 * this.aFloat93;
		this.aFloat86 = local24 * local15 + local9 * this.aFloat86;
		this.aFloat93 = local27 * local15 + this.aFloat93 * local9;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIBFFF)V")
	public void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat94 = arg1;
			this.aFloat86 = 1.0F;
			this.aFloat89 = this.aFloat84 = this.aFloat95 = this.aFloat85 = this.aFloat91 = this.aFloat90 = 0.0F;
			this.aFloat92 = arg2;
		} else {
			@Pc(41) float local41 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
			@Pc(47) float local47 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
			this.aFloat92 = (float) arg2 * local41;
			this.aFloat95 = -local47 * (float) arg2;
			this.aFloat86 = 1.0F;
			this.aFloat94 = local41 * (float) arg1;
			this.aFloat89 = local47 * (float) arg1;
			this.aFloat84 = this.aFloat85 = this.aFloat91 = this.aFloat90 = 0.0F;
		}
		this.aFloat93 = arg5;
		this.aFloat87 = arg3;
		this.aFloat88 = arg4;
	}

	@OriginalMember(owner = "client!ho", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 = this.aFloat84 = this.aFloat95 = this.aFloat85 = this.aFloat91 = this.aFloat90 = 0.0F;
		this.aFloat94 = this.aFloat92 = this.aFloat86 = 1.0F;
		this.aFloat87 = arg0;
		this.aFloat88 = arg1;
		this.aFloat93 = arg2;
	}

	@OriginalMember(owner = "client!ho", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class4_Sub6_Sub16.aFloatArray61[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub6_Sub16.aFloatArray62[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class4_Sub6_Sub16.aFloatArray61[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class4_Sub6_Sub16.aFloatArray62[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class4_Sub6_Sub16.aFloatArray61[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class4_Sub6_Sub16.aFloatArray62[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat91 = local33 * -local27 + local47 * local21;
		this.aFloat95 = local9 * local39;
		this.aFloat89 = local43 * local27 + -local21 * local39;
		this.aFloat85 = -local15;
		this.aFloat90 = local27 * local39 + local21 * local43;
		this.aFloat86 = local9 * local21;
		this.aFloat84 = local9 * local27;
		this.aFloat92 = local9 * local33;
		this.aFloat94 = local47 * local27 + local33 * local21;
		this.aFloat87 = -(this.aFloat91 * (float) arg2) + this.aFloat94 * (float) -arg0 - (float) arg1 * this.aFloat95;
		this.aFloat93 = -(this.aFloat85 * (float) arg1) + this.aFloat84 * (float) -arg0 - (float) arg2 * this.aFloat86;
		this.aFloat88 = this.aFloat89 * (float) -arg0 - (float) arg1 * this.aFloat92 - this.aFloat90 * (float) arg2;
	}

	@OriginalMember(owner = "client!ho", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat85 * (float) arg1 + (float) arg0 * this.aFloat84 + this.aFloat86 * (float) arg2);
		arg3[1] = (int) ((float) arg0 * this.aFloat89 + (float) arg1 * this.aFloat92 + this.aFloat90 * (float) arg2);
		arg3[0] = (int) (this.aFloat91 * (float) arg2 + this.aFloat94 * (float) arg0 + (float) arg1 * this.aFloat95);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class81 method6585() {
		@Pc(7) Class81_Sub2 local7 = new Class81_Sub2();
		local7.aFloat95 = this.aFloat95;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat94 = this.aFloat94;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat92 = this.aFloat92;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat86 = this.aFloat86;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat90 = this.aFloat90;
		return local7;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!q;I)V")
	public void method3236(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub2 local6 = (Class81_Sub2) arg0;
		this.aFloat91 = local6.aFloat84;
		this.aFloat95 = local6.aFloat89;
		this.aFloat94 = local6.aFloat94;
		this.aFloat84 = local6.aFloat91;
		this.aFloat92 = local6.aFloat92;
		this.aFloat89 = local6.aFloat95;
		this.aFloat90 = local6.aFloat85;
		this.aFloat85 = local6.aFloat90;
		this.aFloat87 = -(local6.aFloat93 * this.aFloat91 + local6.aFloat87 * this.aFloat94 + this.aFloat95 * local6.aFloat88);
		this.aFloat86 = local6.aFloat86;
		this.aFloat88 = -(local6.aFloat87 * this.aFloat89 + local6.aFloat88 * this.aFloat92 + local6.aFloat93 * this.aFloat90);
		this.aFloat93 = -(this.aFloat84 * local6.aFloat87 + local6.aFloat88 * this.aFloat85 + local6.aFloat93 * this.aFloat86);
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)[F")
	public float[] method3237() {
		Static239.aFloatArray37[5] = this.aFloat92;
		Static239.aFloatArray37[0] = this.aFloat94;
		Static239.aFloatArray37[6] = this.aFloat85;
		Static239.aFloatArray37[12] = 0.0F;
		Static239.aFloatArray37[14] = 0.0F;
		Static239.aFloatArray37[13] = 0.0F;
		Static239.aFloatArray37[9] = this.aFloat90;
		Static239.aFloatArray37[4] = this.aFloat95;
		Static239.aFloatArray37[1] = this.aFloat89;
		Static239.aFloatArray37[2] = this.aFloat84;
		Static239.aFloatArray37[10] = this.aFloat86;
		Static239.aFloatArray37[8] = this.aFloat91;
		return Static239.aFloatArray37;
	}

	@OriginalMember(owner = "client!ho", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat94 = 1.0F;
		this.aFloat92 = this.aFloat86 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat85 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat90 = -this.aFloat85;
		this.aFloat95 = this.aFloat91 = this.aFloat87 = this.aFloat89 = this.aFloat88 = this.aFloat84 = this.aFloat93 = 0.0F;
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	public void method3238() {
		this.aFloat89 = -this.aFloat89;
		this.aFloat84 = -this.aFloat84;
		this.aFloat85 = -this.aFloat85;
		this.aFloat90 = -this.aFloat90;
		this.aFloat86 = -this.aFloat86;
		this.aFloat93 = -this.aFloat93;
		this.aFloat88 = -this.aFloat88;
		this.aFloat92 = -this.aFloat92;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([FFBFFF)V")
	public void method3239(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[0] = this.aFloat95 * arg3 + arg4 * this.aFloat94 + arg2 * this.aFloat91;
		@Pc(76) float local76;
		@Pc(68) float local68;
		@Pc(60) float local60;
		@Pc(52) float local52;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local52 = -arg1 / arg4;
			local60 = this.aFloat84 * local52 + this.aFloat93;
			local76 = this.aFloat87 + this.aFloat94 * local52;
			local68 = local52 * this.aFloat89 + this.aFloat88;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local52 = -arg1 / arg3;
			local76 = local52 * this.aFloat95 + this.aFloat87;
			local60 = local52 * this.aFloat85 + this.aFloat93;
			local68 = this.aFloat88 + local52 * this.aFloat92;
		} else {
			local52 = -arg1 / arg2;
			local60 = this.aFloat93 + this.aFloat86 * local52;
			local68 = this.aFloat88 + local52 * this.aFloat90;
			local76 = this.aFloat87 + local52 * this.aFloat91;
		}
		arg0[1] = arg2 * this.aFloat90 + arg4 * this.aFloat89 + this.aFloat92 * arg3;
		arg0[2] = this.aFloat85 * arg3 + arg4 * this.aFloat84 + arg2 * this.aFloat86;
		arg0[3] = -(local60 * arg0[2] + local68 * arg0[1] + local76 * arg0[0]);
	}

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat92 = 1.0F;
		this.aFloat94 = this.aFloat86 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat91 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat95 = this.aFloat87 = this.aFloat89 = this.aFloat90 = this.aFloat88 = this.aFloat85 = this.aFloat93 = 0.0F;
		this.aFloat84 = -this.aFloat91;
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)[F")
	public float[] method3240() {
		Static239.aFloatArray37[10] = this.aFloat86;
		Static239.aFloatArray37[13] = this.aFloat88;
		Static239.aFloatArray37[5] = this.aFloat92;
		Static239.aFloatArray37[8] = this.aFloat91;
		Static239.aFloatArray37[9] = this.aFloat90;
		Static239.aFloatArray37[12] = this.aFloat87;
		Static239.aFloatArray37[0] = this.aFloat94;
		Static239.aFloatArray37[2] = this.aFloat84;
		Static239.aFloatArray37[4] = this.aFloat95;
		Static239.aFloatArray37[6] = this.aFloat85;
		Static239.aFloatArray37[14] = this.aFloat93;
		Static239.aFloatArray37[1] = this.aFloat89;
		return Static239.aFloatArray37;
	}

	@OriginalMember(owner = "client!ho", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat94 = this.aFloat92 = this.aFloat86 = 1.0F;
		this.aFloat89 = this.aFloat84 = this.aFloat95 = this.aFloat85 = this.aFloat91 = this.aFloat90 = this.aFloat87 = this.aFloat88 = this.aFloat93 = 0.0F;
	}

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class81 arg0) {
		@Pc(6) Class81_Sub2 local6 = (Class81_Sub2) arg0;
		this.aFloat94 = local6.aFloat94;
		this.aFloat95 = local6.aFloat95;
		this.aFloat89 = local6.aFloat89;
		this.aFloat91 = local6.aFloat91;
		this.aFloat87 = local6.aFloat87;
		this.aFloat93 = local6.aFloat93;
		this.aFloat90 = local6.aFloat90;
		this.aFloat92 = local6.aFloat92;
		this.aFloat85 = local6.aFloat85;
		this.aFloat84 = local6.aFloat84;
		this.aFloat86 = local6.aFloat86;
		this.aFloat88 = local6.aFloat88;
	}

	@OriginalMember(owner = "client!ho", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat87;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat88;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat93;
		arg0[0] = (int) (this.aFloat84 * local28 + local20 * this.aFloat89 + local12 * this.aFloat94);
		arg0[2] = (int) (this.aFloat86 * local28 + local12 * this.aFloat91 + local20 * this.aFloat90);
		arg0[1] = (int) (local28 * this.aFloat85 + local12 * this.aFloat95 + local20 * this.aFloat92);
	}

	@OriginalMember(owner = "client!ho", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub6_Sub16.aFloatArray61[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub6_Sub16.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat94;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat91;
		this.aFloat94 = local9 * local18 - local15 * this.aFloat89;
		@Pc(38) float local38 = this.aFloat87;
		this.aFloat95 = local21 * local9 - local15 * this.aFloat92;
		this.aFloat89 = local9 * this.aFloat89 + local18 * local15;
		this.aFloat91 = local24 * local9 - this.aFloat90 * local15;
		this.aFloat92 = local15 * local21 + this.aFloat92 * local9;
		this.aFloat90 = local15 * local24 + this.aFloat90 * local9;
		this.aFloat87 = local9 * local38 - local15 * this.aFloat88;
		this.aFloat88 = local15 * local38 + this.aFloat88 * local9;
	}

	@OriginalMember(owner = "client!ho", name = "BA", descriptor = "(III[I)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat87);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat93);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat88);
		arg3[0] = (int) ((float) local17 * this.aFloat84 + (float) local24 * this.aFloat89 + (float) local6 * this.aFloat94);
		arg3[1] = (int) ((float) local17 * this.aFloat85 + (float) local6 * this.aFloat95 + this.aFloat92 * (float) local24);
		arg3[2] = (int) ((float) local6 * this.aFloat91 + this.aFloat90 * (float) local24 + (float) local17 * this.aFloat86);
	}
}
