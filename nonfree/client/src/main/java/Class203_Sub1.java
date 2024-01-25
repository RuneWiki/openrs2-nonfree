import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class203_Sub1 extends Class203 {

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!kn", name = "I", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!kn", name = "Y", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!kn", name = "B", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!kn", name = "db", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "F")
	public float aFloat96;

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class203_Sub1() {
		this.method8337();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([FI)[F")
	public float[] method4831(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat87;
		arg0[0] = this.aFloat92;
		arg0[2] = this.aFloat90;
		arg0[11] = 0.0F;
		arg0[10] = this.aFloat91;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat96;
		arg0[13] = this.aFloat97;
		arg0[4] = this.aFloat94;
		arg0[12] = this.aFloat88;
		arg0[5] = this.aFloat93;
		arg0[8] = this.aFloat95;
		arg0[6] = this.aFloat98;
		arg0[14] = this.aFloat89;
		arg0[3] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FIFIIIF)V")
	public void method4832(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat96 = this.aFloat90 = this.aFloat94 = this.aFloat98 = this.aFloat95 = this.aFloat87 = 0.0F;
			this.aFloat97 = arg5 - (float) arg4;
			this.aFloat93 = (float) (arg4 * 2);
			this.aFloat89 = arg2;
			this.aFloat92 = (float) (arg1 * 2);
			this.aFloat91 = 1.0F;
			this.aFloat88 = arg0 - (float) arg1;
			return;
		}
		@Pc(60) float local60 = Class176.aFloatArray33[arg3 & 0x3FFF];
		@Pc(66) float local66 = Class176.aFloatArray32[arg3 & 0x3FFF];
		this.aFloat90 = this.aFloat98 = this.aFloat95 = this.aFloat87 = 0.0F;
		this.aFloat94 = (float) arg4 * local66 * -2.0F;
		this.aFloat88 = (float) (arg1 * 2) * (local66 * 0.5F - local60 * 0.5F) + arg0;
		this.aFloat97 = (-0.5F * local66 - local60 * 0.5F) * (float) (arg4 * 2) + arg5;
		this.aFloat92 = (float) arg1 * local60 * 2.0F;
		this.aFloat91 = 1.0F;
		this.aFloat89 = arg2;
		this.aFloat93 = local60 * 2.0F * (float) arg4;
		this.aFloat96 = local66 * 2.0F * (float) arg1;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0) {
		this.aFloat92 = 1.0F;
		this.aFloat93 = this.aFloat91 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat98 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat87 = -this.aFloat98;
		this.aFloat94 = this.aFloat95 = this.aFloat88 = this.aFloat96 = this.aFloat97 = this.aFloat90 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!qq;)V")
	public void method4833(@OriginalArg(1) Class203 arg0) {
		@Pc(6) Class203_Sub1 local6 = (Class203_Sub1) arg0;
		this.aFloat98 = local6.aFloat98;
		this.aFloat96 = local6.aFloat96;
		this.aFloat91 = local6.aFloat91;
		this.aFloat89 = 0.0F;
		this.aFloat90 = local6.aFloat90;
		this.aFloat94 = local6.aFloat94;
		this.aFloat93 = local6.aFloat93;
		this.aFloat88 = 0.0F;
		this.aFloat97 = 0.0F;
		this.aFloat87 = local6.aFloat87;
		this.aFloat92 = local6.aFloat92;
		this.aFloat95 = local6.aFloat95;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg1 * this.aFloat98 + (float) arg0 * this.aFloat90 + (float) arg2 * this.aFloat91);
		arg3[0] = (int) ((float) arg2 * this.aFloat95 + this.aFloat94 * (float) arg1 + this.aFloat92 * (float) arg0);
		arg3[1] = (int) ((float) arg0 * this.aFloat96 + this.aFloat93 * (float) arg1 + this.aFloat87 * (float) arg2);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(FIFF)V")
	public void method4834(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat96 = 0.0F;
		this.aFloat90 = 0.0F;
		this.aFloat88 = 0.0F;
		this.aFloat89 = 0.0F;
		this.aFloat94 = (float) 0;
		this.aFloat93 = arg0;
		this.aFloat92 = arg2;
		this.aFloat95 = 0.0F;
		this.aFloat91 = arg1;
		this.aFloat97 = 0.0F;
		this.aFloat98 = 0.0F;
		this.aFloat87 = 0.0F;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	@Override
	public void method8331(@OriginalArg(0) int arg0) {
		this.aFloat93 = 1.0F;
		this.aFloat92 = this.aFloat91 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat95 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat90 = -this.aFloat95;
		this.aFloat94 = this.aFloat88 = this.aFloat96 = this.aFloat87 = this.aFloat97 = this.aFloat98 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([FZ)[F")
	public float[] method4835(@OriginalArg(0) float[] arg0) {
		arg0[7] = this.aFloat97;
		arg0[2] = this.aFloat95;
		arg0[4] = this.aFloat96;
		arg0[5] = this.aFloat93;
		arg0[1] = this.aFloat94;
		arg0[6] = this.aFloat87;
		arg0[0] = this.aFloat92;
		arg0[3] = this.aFloat88;
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFB)F")
	public float method4836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat88 + arg0 * this.aFloat94 + this.aFloat92 * arg1 + arg2 * this.aFloat95;
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)V")
	@Override
	public void method8338(@OriginalArg(0) int arg0) {
		this.aFloat91 = 1.0F;
		this.aFloat92 = this.aFloat93 = Class176.aFloatArray33[arg0 & 0x3FFF];
		this.aFloat96 = Class176.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat94 = -this.aFloat96;
		this.aFloat95 = this.aFloat88 = this.aFloat87 = this.aFloat97 = this.aFloat90 = this.aFloat98 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)V")
	@Override
	public void method8326(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat96;
		@Pc(21) float local21 = this.aFloat93;
		@Pc(24) float local24 = this.aFloat87;
		this.aFloat96 = local9 * local18 - local15 * this.aFloat90;
		@Pc(38) float local38 = this.aFloat97;
		this.aFloat90 = local18 * local15 + this.aFloat90 * local9;
		this.aFloat93 = local21 * local9 - this.aFloat98 * local15;
		this.aFloat98 = this.aFloat98 * local9 + local21 * local15;
		this.aFloat87 = local24 * local9 - this.aFloat91 * local15;
		this.aFloat97 = local38 * local9 - local15 * this.aFloat89;
		this.aFloat91 = this.aFloat91 * local9 + local15 * local24;
		this.aFloat89 = this.aFloat89 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class176.aFloatArray33[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class176.aFloatArray32[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class176.aFloatArray33[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class176.aFloatArray32[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat96 = -local21 * local39 + local27 * local43;
		this.aFloat91 = local9 * local21;
		this.aFloat90 = local27 * local9;
		this.aFloat95 = -local27 * local33 + local21 * local47;
		this.aFloat93 = local33 * local9;
		this.aFloat87 = local21 * local43 + local27 * local39;
		this.aFloat92 = local27 * local47 + local33 * local21;
		this.aFloat98 = -local15;
		this.aFloat94 = local39 * local9;
		this.aFloat88 = -(this.aFloat95 * (float) arg2) + this.aFloat92 * (float) -arg0 - this.aFloat94 * (float) arg1;
		this.aFloat89 = -((float) arg2 * this.aFloat91) - (float) arg1 * this.aFloat98 + (float) -arg0 * this.aFloat90;
		this.aFloat97 = -(this.aFloat87 * (float) arg2) + this.aFloat96 * (float) -arg0 - (float) arg1 * this.aFloat93;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(ILclient!qq;)V")
	public void method4837(@OriginalArg(1) Class203 arg0) {
		@Pc(6) Class203_Sub1 local6 = (Class203_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat92;
		@Pc(12) float local12 = this.aFloat96;
		@Pc(15) float local15 = this.aFloat94;
		@Pc(18) float local18 = this.aFloat93;
		@Pc(21) float local21 = this.aFloat95;
		@Pc(24) float local24 = this.aFloat87;
		@Pc(27) float local27 = this.aFloat88;
		this.aFloat96 = local9 * local6.aFloat96 + local12 * local6.aFloat93 + local6.aFloat87 * this.aFloat90;
		@Pc(47) float local47 = this.aFloat97;
		this.aFloat92 = local12 * local6.aFloat94 + local6.aFloat92 * local9 + local6.aFloat95 * this.aFloat90;
		this.aFloat93 = local18 * local6.aFloat93 + local6.aFloat96 * local15 + this.aFloat98 * local6.aFloat87;
		this.aFloat90 = this.aFloat90 * local6.aFloat91 + local12 * local6.aFloat98 + local9 * local6.aFloat90;
		this.aFloat94 = local18 * local6.aFloat94 + local15 * local6.aFloat92 + this.aFloat98 * local6.aFloat95;
		this.aFloat95 = this.aFloat91 * local6.aFloat95 + local24 * local6.aFloat94 + local21 * local6.aFloat92;
		this.aFloat98 = this.aFloat98 * local6.aFloat91 + local6.aFloat90 * local15 + local6.aFloat98 * local18;
		this.aFloat87 = this.aFloat91 * local6.aFloat87 + local21 * local6.aFloat96 + local24 * local6.aFloat93;
		this.aFloat91 = local21 * local6.aFloat90 + local24 * local6.aFloat98 + local6.aFloat91 * this.aFloat91;
		this.aFloat97 = local6.aFloat87 * this.aFloat89 + local47 * local6.aFloat93 + local6.aFloat96 * local27 + local6.aFloat97;
		this.aFloat88 = local47 * local6.aFloat94 + local27 * local6.aFloat92 + local6.aFloat95 * this.aFloat89 + local6.aFloat88;
		this.aFloat89 = local6.aFloat89 + local6.aFloat90 * local27 + local6.aFloat98 * local47 + local6.aFloat91 * this.aFloat89;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()V")
	@Override
	public void method8337() {
		this.aFloat92 = this.aFloat93 = this.aFloat91 = 1.0F;
		this.aFloat96 = this.aFloat90 = this.aFloat94 = this.aFloat98 = this.aFloat95 = this.aFloat87 = this.aFloat88 = this.aFloat97 = this.aFloat89 = 0.0F;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!qq;I)V")
	public void method4838(@OriginalArg(0) Class203 arg0) {
		@Pc(6) Class203_Sub1 local6 = (Class203_Sub1) arg0;
		this.aFloat92 = local6.aFloat92;
		this.aFloat94 = local6.aFloat96;
		this.aFloat95 = local6.aFloat90;
		this.aFloat93 = local6.aFloat93;
		this.aFloat90 = local6.aFloat95;
		this.aFloat96 = local6.aFloat94;
		this.aFloat87 = local6.aFloat98;
		this.aFloat91 = local6.aFloat91;
		this.aFloat88 = -(this.aFloat94 * local6.aFloat97 + local6.aFloat88 * this.aFloat92 + this.aFloat95 * local6.aFloat89);
		this.aFloat98 = local6.aFloat87;
		this.aFloat97 = -(this.aFloat96 * local6.aFloat88 + this.aFloat93 * local6.aFloat97 + this.aFloat87 * local6.aFloat89);
		this.aFloat89 = -(this.aFloat91 * local6.aFloat89 + local6.aFloat97 * this.aFloat98 + this.aFloat90 * local6.aFloat88);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!qq;Lclient!qq;)V")
	public void method4839(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class203 arg1) {
		@Pc(6) Class203_Sub1 local6 = (Class203_Sub1) arg0;
		@Pc(9) Class203_Sub1 local9 = (Class203_Sub1) arg1;
		this.aFloat92 = local6.aFloat95 * local9.aFloat90 + local6.aFloat94 * local9.aFloat96 + local6.aFloat92 * local9.aFloat92;
		this.aFloat96 = local9.aFloat90 * local6.aFloat87 + local9.aFloat96 * local6.aFloat93 + local6.aFloat96 * local9.aFloat92;
		this.aFloat90 = local6.aFloat90 * local9.aFloat92 + local9.aFloat96 * local6.aFloat98 + local9.aFloat90 * local6.aFloat91;
		this.aFloat94 = local6.aFloat94 * local9.aFloat93 + local9.aFloat94 * local6.aFloat92 + local9.aFloat98 * local6.aFloat95;
		this.aFloat93 = local9.aFloat98 * local6.aFloat87 + local6.aFloat96 * local9.aFloat94 + local6.aFloat93 * local9.aFloat93;
		this.aFloat95 = local9.aFloat87 * local6.aFloat94 + local6.aFloat92 * local9.aFloat95 + local9.aFloat91 * local6.aFloat95;
		this.aFloat98 = local6.aFloat98 * local9.aFloat93 + local9.aFloat94 * local6.aFloat90 + local9.aFloat98 * local6.aFloat91;
		this.aFloat87 = local6.aFloat93 * local9.aFloat87 + local6.aFloat96 * local9.aFloat95 + local9.aFloat91 * local6.aFloat87;
		this.aFloat88 = local9.aFloat89 * local6.aFloat95 + local6.aFloat92 * local9.aFloat88 + local9.aFloat97 * local6.aFloat94 + local6.aFloat88;
		this.aFloat91 = local9.aFloat91 * local6.aFloat91 + local6.aFloat98 * local9.aFloat87 + local6.aFloat90 * local9.aFloat95;
		this.aFloat97 = local9.aFloat97 * local6.aFloat93 + local9.aFloat88 * local6.aFloat96 + local6.aFloat87 * local9.aFloat89 + local6.aFloat97;
		this.aFloat89 = local6.aFloat91 * local9.aFloat89 + local9.aFloat97 * local6.aFloat98 + local9.aFloat88 * local6.aFloat90 + local6.aFloat89;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([FFFIFF)V")
	public void method4840(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		arg0[1] = arg1 * this.aFloat87 + arg4 * this.aFloat93 + this.aFloat96 * arg2;
		@Pc(53) float local53;
		@Pc(45) float local45;
		@Pc(61) float local61;
		@Pc(37) float local37;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local37 = -arg3 / arg2;
			local45 = local37 * this.aFloat96 + this.aFloat97;
			local53 = this.aFloat88 + local37 * this.aFloat92;
			local61 = local37 * this.aFloat90 + this.aFloat89;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local37 = -arg3 / arg4;
			local53 = this.aFloat88 + local37 * this.aFloat94;
			local45 = this.aFloat93 * local37 + this.aFloat97;
			local61 = this.aFloat89 + this.aFloat98 * local37;
		} else {
			local37 = -arg3 / arg1;
			local53 = this.aFloat95 * local37 + this.aFloat88;
			local45 = this.aFloat97 + this.aFloat87 * local37;
			local61 = this.aFloat89 + local37 * this.aFloat91;
		}
		arg0[0] = arg1 * this.aFloat95 + arg4 * this.aFloat94 + this.aFloat92 * arg2;
		arg0[2] = this.aFloat91 * arg1 + arg4 * this.aFloat98 + arg2 * this.aFloat90;
		arg0[3] = -(local61 * arg0[2] + local53 * arg0[0] + arg0[1] * local45);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "([FI)[F")
	public float[] method4843(@OriginalArg(0) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[15] = 1.0F;
		arg0[3] = this.aFloat88;
		arg0[1] = this.aFloat94;
		arg0[11] = this.aFloat89;
		arg0[10] = this.aFloat91;
		arg0[8] = this.aFloat90;
		arg0[5] = this.aFloat93;
		arg0[7] = this.aFloat97;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat92;
		arg0[6] = this.aFloat87;
		arg0[9] = this.aFloat98;
		arg0[4] = this.aFloat96;
		arg0[2] = this.aFloat95;
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZFFFFFFFFF)V")
	public void method4844(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat91 = arg7;
		this.aFloat92 = arg1;
		this.aFloat96 = arg5;
		this.aFloat90 = arg8;
		this.aFloat89 = 0.0F;
		this.aFloat93 = arg6;
		this.aFloat94 = arg2;
		this.aFloat87 = arg0;
		this.aFloat98 = arg4;
		this.aFloat97 = 0.0F;
		this.aFloat88 = 0.0F;
		this.aFloat95 = arg3;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([FB)[F")
	public float[] method4845(@OriginalArg(0) float[] arg0) {
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat93;
		arg0[15] = 1.0F;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat88;
		arg0[1] = this.aFloat96;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat92;
		arg0[10] = this.aFloat89;
		arg0[11] = 0.0F;
		arg0[9] = this.aFloat97;
		arg0[6] = 0.0F;
		arg0[4] = this.aFloat94;
		arg0[2] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(FFFI)V")
	public void method4846(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat89 += arg1;
		this.aFloat97 += arg0;
		this.aFloat88 += arg2;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat96 + (float) arg1 * this.aFloat93 + this.aFloat87 * (float) arg2 + this.aFloat97);
		arg3[0] = (int) ((float) arg2 * this.aFloat95 + this.aFloat92 * (float) arg0 + (float) arg1 * this.aFloat94 + this.aFloat88);
		arg3[2] = (int) ((float) arg0 * this.aFloat90 + this.aFloat98 * (float) arg1 + this.aFloat91 * (float) arg2 + this.aFloat89);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method8336(@OriginalArg(0) Class203 arg0) {
		@Pc(6) Class203_Sub1 local6 = (Class203_Sub1) arg0;
		this.aFloat95 = local6.aFloat95;
		this.aFloat96 = local6.aFloat96;
		this.aFloat93 = local6.aFloat93;
		this.aFloat90 = local6.aFloat90;
		this.aFloat88 = local6.aFloat88;
		this.aFloat91 = local6.aFloat91;
		this.aFloat87 = local6.aFloat87;
		this.aFloat94 = local6.aFloat94;
		this.aFloat92 = local6.aFloat92;
		this.aFloat89 = local6.aFloat89;
		this.aFloat97 = local6.aFloat97;
		this.aFloat98 = local6.aFloat98;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat92;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat95;
		this.aFloat92 = local18 * local9 - this.aFloat96 * local15;
		@Pc(37) float local37 = this.aFloat88;
		this.aFloat96 = local9 * this.aFloat96 + local18 * local15;
		this.aFloat94 = local9 * local21 - this.aFloat93 * local15;
		this.aFloat93 = local21 * local15 + local9 * this.aFloat93;
		this.aFloat95 = local24 * local9 - local15 * this.aFloat87;
		this.aFloat87 = local15 * local24 + local9 * this.aFloat87;
		this.aFloat88 = local37 * local9 - this.aFloat97 * local15;
		this.aFloat97 = local37 * local15 + this.aFloat97 * local9;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFI)F")
	public float method4847(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat89 + this.aFloat98 * arg0 + this.aFloat90 * arg2 + arg1 * this.aFloat91;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg0 - this.aFloat88);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat89);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat97);
		arg3[1] = (int) ((float) local17 * this.aFloat98 + (float) local10 * this.aFloat94 + (float) local24 * this.aFloat93);
		arg3[0] = (int) (this.aFloat96 * (float) local24 + (float) local10 * this.aFloat92 + (float) local17 * this.aFloat90);
		arg3[2] = (int) (this.aFloat91 * (float) local17 + this.aFloat87 * (float) local24 + (float) local10 * this.aFloat95);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[F)[F")
	public float[] method4848(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat90;
		arg0[9] = this.aFloat98;
		arg0[4] = this.aFloat96;
		arg0[10] = this.aFloat91;
		arg0[13] = 0.0F;
		arg0[2] = this.aFloat95;
		arg0[11] = 0.0F;
		arg0[1] = this.aFloat94;
		arg0[15] = 0.0F;
		arg0[12] = 0.0F;
		arg0[14] = 0.0F;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat93;
		arg0[6] = this.aFloat87;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat92;
		return arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([FFFIF)V")
	public void method4849(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat92 * arg1 + this.aFloat94 * arg2 + arg3 * this.aFloat95;
		arg0[1] = this.aFloat87 * arg3 + this.aFloat96 * arg1 + this.aFloat93 * arg2;
		arg0[2] = arg3 * this.aFloat91 + arg1 * this.aFloat90 + this.aFloat98 * arg2;
	}

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "(I)V")
	public void method4850() {
		this.aFloat87 = -this.aFloat87;
		this.aFloat89 = -this.aFloat89;
		this.aFloat91 = -this.aFloat91;
		this.aFloat96 = -this.aFloat96;
		this.aFloat97 = -this.aFloat97;
		this.aFloat98 = -this.aFloat98;
		this.aFloat93 = -this.aFloat93;
		this.aFloat90 = -this.aFloat90;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([I)V")
	@Override
	public void method8333(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat88;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat97;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat89;
		arg0[1] = (int) (local11 * this.aFloat94 + local19 * this.aFloat93 + this.aFloat98 * local27);
		arg0[2] = (int) (this.aFloat91 * local27 + this.aFloat95 * local11 + this.aFloat87 * local19);
		arg0[0] = (int) (local19 * this.aFloat96 + this.aFloat92 * local11 + this.aFloat90 * local27);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	@Override
	public void method8332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat89 = (float) arg2;
		this.aFloat96 = this.aFloat90 = this.aFloat94 = this.aFloat98 = this.aFloat95 = this.aFloat87 = 0.0F;
		this.aFloat97 = (float) arg1;
		this.aFloat88 = (float) arg0;
		this.aFloat92 = this.aFloat93 = this.aFloat91 = 1.0F;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BFFF)V")
	public void method4851(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat92 *= arg2;
		this.aFloat93 *= arg0;
		this.aFloat98 *= arg1;
		this.aFloat91 *= arg1;
		this.aFloat96 *= arg0;
		this.aFloat89 *= arg1;
		this.aFloat87 *= arg0;
		this.aFloat95 *= arg2;
		this.aFloat88 *= arg2;
		this.aFloat94 *= arg2;
		this.aFloat97 *= arg0;
		this.aFloat90 *= arg1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FIFF)V")
	public void method4852(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat97 = arg1;
		this.aFloat92 = this.aFloat93 = this.aFloat91 = 1.0F;
		this.aFloat96 = this.aFloat90 = this.aFloat94 = this.aFloat98 = this.aFloat95 = this.aFloat87 = 0.0F;
		this.aFloat89 = arg2;
		this.aFloat88 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat97 += (float) arg1;
		this.aFloat89 += (float) arg2;
		this.aFloat88 += (float) arg0;
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V")
	@Override
	public void method8324(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class176.aFloatArray33[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class176.aFloatArray32[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat92;
		@Pc(21) float local21 = this.aFloat94;
		@Pc(24) float local24 = this.aFloat95;
		@Pc(27) float local27 = this.aFloat88;
		this.aFloat92 = local15 * this.aFloat90 + local9 * local18;
		this.aFloat94 = local15 * this.aFloat98 + local9 * local21;
		this.aFloat90 = local9 * this.aFloat90 - local15 * local18;
		this.aFloat98 = this.aFloat98 * local9 - local15 * local21;
		this.aFloat95 = this.aFloat91 * local15 + local24 * local9;
		this.aFloat91 = this.aFloat91 * local9 - local15 * local24;
		this.aFloat88 = this.aFloat89 * local15 + local9 * local27;
		this.aFloat89 = this.aFloat89 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method8323() {
		@Pc(7) Class203_Sub1 local7 = new Class203_Sub1();
		local7.aFloat94 = this.aFloat94;
		local7.aFloat90 = this.aFloat90;
		local7.aFloat95 = this.aFloat95;
		local7.aFloat96 = this.aFloat96;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat87 = this.aFloat87;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat93 = this.aFloat93;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat91 = this.aFloat91;
		local7.aFloat92 = this.aFloat92;
		return local7;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IFFF)F")
	public float method4854(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat97 + arg1 * this.aFloat87 + arg2 * this.aFloat93 + this.aFloat96 * arg0;
	}
}
