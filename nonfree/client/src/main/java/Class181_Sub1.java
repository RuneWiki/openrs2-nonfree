import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class181_Sub1 extends Class181 {

	@OriginalMember(owner = "client!kfa", name = "R", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!kfa", name = "D", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!kfa", name = "N", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!kfa", name = "y", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "F")
	public float aFloat103;

	@OriginalMember(owner = "client!kfa", name = "K", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!kfa", name = "O", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!kfa", name = "cb", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
	public Class181_Sub1() {
		this.method6349();
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFFFFFFFFB)V")
	public void method4914(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		this.aFloat104 = arg0;
		this.aFloat105 = arg8;
		this.aFloat101 = arg7;
		this.aFloat103 = 0.0F;
		this.aFloat102 = arg4;
		this.aFloat99 = arg1;
		this.aFloat106 = 0.0F;
		this.aFloat100 = arg5;
		this.aFloat97 = 0.0F;
		this.aFloat107 = arg3;
		this.aFloat98 = arg2;
		this.aFloat108 = arg6;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat108 = local47 * local21 + -local27 * local33;
		this.aFloat99 = local9 * local39;
		this.aFloat107 = local21 * local9;
		this.aFloat104 = local43 * local27 + local39 * -local21;
		this.aFloat100 = local27 * local47 + local33 * local21;
		this.aFloat101 = -local15;
		this.aFloat98 = local33 * local9;
		this.aFloat105 = local27 * local9;
		this.aFloat102 = local39 * local27 + local21 * local43;
		this.aFloat106 = -(this.aFloat107 * (float) arg2) - (float) arg1 * this.aFloat101 + this.aFloat105 * (float) -arg0;
		this.aFloat97 = -(this.aFloat99 * (float) arg1) + (float) -arg0 * this.aFloat100 - (float) arg2 * this.aFloat108;
		this.aFloat103 = -((float) arg1 * this.aFloat98) + (float) -arg0 * this.aFloat104 - (float) arg2 * this.aFloat102;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IFFF)V")
	public void method4915(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat103 += arg0;
		this.aFloat97 += arg2;
		this.aFloat106 += arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat106 + (float) arg2 * this.aFloat107 + (float) arg0 * this.aFloat105 + this.aFloat101 * (float) arg1);
		arg3[0] = (int) ((float) arg2 * this.aFloat108 + this.aFloat99 * (float) arg1 + (float) arg0 * this.aFloat100 + this.aFloat97);
		arg3[1] = (int) (this.aFloat103 + this.aFloat102 * (float) arg2 + (float) arg0 * this.aFloat104 + (float) arg1 * this.aFloat98);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat98 + (float) arg0 * this.aFloat104 + this.aFloat102 * (float) arg2);
		arg3[2] = (int) (this.aFloat107 * (float) arg2 + this.aFloat101 * (float) arg1 + this.aFloat105 * (float) arg0);
		arg3[0] = (int) ((float) arg2 * this.aFloat108 + (float) arg1 * this.aFloat99 + (float) arg0 * this.aFloat100);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FIFF)V")
	public void method4916(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat106 = arg2;
		this.aFloat104 = this.aFloat105 = this.aFloat99 = this.aFloat101 = this.aFloat108 = this.aFloat102 = 0.0F;
		this.aFloat103 = arg0;
		this.aFloat100 = this.aFloat98 = this.aFloat107 = 1.0F;
		this.aFloat97 = arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I[F)[F")
	public float[] method4917(@OriginalArg(1) float[] arg0) {
		arg0[2] = this.aFloat105;
		arg0[10] = this.aFloat107;
		arg0[7] = 0.0F;
		arg0[1] = this.aFloat104;
		arg0[12] = this.aFloat97;
		arg0[14] = this.aFloat106;
		arg0[5] = this.aFloat98;
		arg0[11] = 0.0F;
		arg0[6] = this.aFloat101;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat108;
		arg0[13] = this.aFloat103;
		arg0[0] = this.aFloat100;
		arg0[9] = this.aFloat102;
		arg0[3] = 0.0F;
		arg0[4] = this.aFloat99;
		return arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(FZFF)V")
	public void method4918(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat97 = 0.0F;
		this.aFloat98 = arg0;
		this.aFloat103 = 0.0F;
		this.aFloat102 = 0.0F;
		this.aFloat99 = 0.0F;
		this.aFloat100 = arg2;
		this.aFloat104 = 0.0F;
		this.aFloat101 = 0.0F;
		this.aFloat106 = 0.0F;
		this.aFloat105 = 0.0F;
		this.aFloat108 = 0.0F;
		this.aFloat107 = arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6343(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat104;
		@Pc(21) float local21 = this.aFloat98;
		@Pc(24) float local24 = this.aFloat102;
		this.aFloat104 = local9 * local18 - local15 * this.aFloat105;
		@Pc(38) float local38 = this.aFloat103;
		this.aFloat105 = local9 * this.aFloat105 + local15 * local18;
		this.aFloat98 = local9 * local21 - local15 * this.aFloat101;
		this.aFloat102 = local24 * local9 - local15 * this.aFloat107;
		this.aFloat101 = local15 * local21 + local9 * this.aFloat101;
		this.aFloat107 = local24 * local15 + this.aFloat107 * local9;
		this.aFloat103 = local38 * local9 - this.aFloat106 * local15;
		this.aFloat106 = local15 * local38 + this.aFloat106 * local9;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "([FI)[F")
	public float[] method4920(@OriginalArg(0) float[] arg0) {
		arg0[7] = this.aFloat103;
		arg0[2] = this.aFloat108;
		arg0[1] = this.aFloat99;
		arg0[11] = this.aFloat106;
		arg0[6] = this.aFloat102;
		arg0[13] = 0.0F;
		arg0[9] = this.aFloat101;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat107;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat98;
		arg0[8] = this.aFloat105;
		arg0[4] = this.aFloat104;
		arg0[0] = this.aFloat100;
		arg0[3] = this.aFloat97;
		return arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFF[FFI)V")
	public void method4921(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4) {
		arg3[2] = arg2 * this.aFloat107 + arg0 * this.aFloat105 + this.aFloat101 * arg4;
		@Pc(61) float local61;
		@Pc(53) float local53;
		@Pc(45) float local45;
		@Pc(37) float local37;
		if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local37 = -arg1 / arg0;
			local45 = this.aFloat106 + this.aFloat105 * local37;
			local53 = this.aFloat103 + local37 * this.aFloat104;
			local61 = this.aFloat100 * local37 + this.aFloat97;
		} else if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local37 = -arg1 / arg4;
			local45 = this.aFloat106 + local37 * this.aFloat101;
			local61 = this.aFloat97 + local37 * this.aFloat99;
			local53 = this.aFloat98 * local37 + this.aFloat103;
		} else {
			local37 = -arg1 / arg2;
			local61 = this.aFloat108 * local37 + this.aFloat97;
			local45 = this.aFloat106 + local37 * this.aFloat107;
			local53 = this.aFloat103 + this.aFloat102 * local37;
		}
		arg3[1] = this.aFloat104 * arg0 + this.aFloat98 * arg4 + this.aFloat102 * arg2;
		arg3[0] = this.aFloat99 * arg4 + this.aFloat100 * arg0 + arg2 * this.aFloat108;
		arg3[3] = -(local53 * arg3[1] + local61 * arg3[0] + arg3[2] * local45);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFFI)F")
	public float method4922(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat104 * arg0 + arg2 * this.aFloat98 + this.aFloat102 * arg1 + this.aFloat103;
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
	@Override
	public void method6357(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat100;
		@Pc(21) float local21 = this.aFloat99;
		@Pc(24) float local24 = this.aFloat108;
		this.aFloat100 = local9 * local18 - local15 * this.aFloat104;
		@Pc(38) float local38 = this.aFloat97;
		this.aFloat99 = local21 * local9 - this.aFloat98 * local15;
		this.aFloat104 = local15 * local18 + this.aFloat104 * local9;
		this.aFloat98 = local21 * local15 + this.aFloat98 * local9;
		this.aFloat108 = local24 * local9 - this.aFloat102 * local15;
		this.aFloat97 = local9 * local38 - local15 * this.aFloat103;
		this.aFloat102 = local9 * this.aFloat102 + local15 * local24;
		this.aFloat103 = local38 * local15 + this.aFloat103 * local9;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!iu;Lclient!iu;)V")
	public void method4923(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg0;
		@Pc(9) Class181_Sub1 local9 = (Class181_Sub1) arg1;
		this.aFloat100 = local6.aFloat100 * local9.aFloat100 + local6.aFloat99 * local9.aFloat104 + local9.aFloat105 * local6.aFloat108;
		this.aFloat104 = local9.aFloat105 * local6.aFloat102 + local6.aFloat104 * local9.aFloat100 + local6.aFloat98 * local9.aFloat104;
		this.aFloat105 = local6.aFloat105 * local9.aFloat100 + local9.aFloat104 * local6.aFloat101 + local9.aFloat105 * local6.aFloat107;
		this.aFloat99 = local9.aFloat101 * local6.aFloat108 + local9.aFloat98 * local6.aFloat99 + local9.aFloat99 * local6.aFloat100;
		this.aFloat98 = local6.aFloat102 * local9.aFloat101 + local9.aFloat99 * local6.aFloat104 + local9.aFloat98 * local6.aFloat98;
		this.aFloat108 = local6.aFloat99 * local9.aFloat102 + local9.aFloat108 * local6.aFloat100 + local6.aFloat108 * local9.aFloat107;
		this.aFloat101 = local6.aFloat105 * local9.aFloat99 + local6.aFloat101 * local9.aFloat98 + local9.aFloat101 * local6.aFloat107;
		this.aFloat102 = local9.aFloat107 * local6.aFloat102 + local6.aFloat104 * local9.aFloat108 + local9.aFloat102 * local6.aFloat98;
		this.aFloat107 = local6.aFloat105 * local9.aFloat108 + local9.aFloat102 * local6.aFloat101 + local9.aFloat107 * local6.aFloat107;
		this.aFloat97 = local6.aFloat97 + local9.aFloat97 * local6.aFloat100 + local9.aFloat103 * local6.aFloat99 + local6.aFloat108 * local9.aFloat106;
		this.aFloat103 = local6.aFloat103 + local6.aFloat102 * local9.aFloat106 + local6.aFloat104 * local9.aFloat97 + local9.aFloat103 * local6.aFloat98;
		this.aFloat106 = local6.aFloat106 + local6.aFloat107 * local9.aFloat106 + local9.aFloat97 * local6.aFloat105 + local6.aFloat101 * local9.aFloat103;
	}

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "(I)V")
	public void method4924() {
		this.aFloat101 = -this.aFloat101;
		this.aFloat103 = -this.aFloat103;
		this.aFloat104 = -this.aFloat104;
		this.aFloat105 = -this.aFloat105;
		this.aFloat98 = -this.aFloat98;
		this.aFloat107 = -this.aFloat107;
		this.aFloat106 = -this.aFloat106;
		this.aFloat102 = -this.aFloat102;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([FI)[F")
	public float[] method4925(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat99;
		arg0[4] = this.aFloat104;
		arg0[0] = this.aFloat100;
		arg0[3] = this.aFloat97;
		arg0[7] = this.aFloat103;
		arg0[2] = this.aFloat108;
		arg0[6] = this.aFloat102;
		arg0[5] = this.aFloat98;
		return arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLclient!iu;)V")
	public void method4926(@OriginalArg(1) Class181 arg0) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat100;
		@Pc(12) float local12 = this.aFloat104;
		@Pc(15) float local15 = this.aFloat99;
		@Pc(18) float local18 = this.aFloat98;
		@Pc(21) float local21 = this.aFloat108;
		@Pc(24) float local24 = this.aFloat102;
		@Pc(27) float local27 = this.aFloat97;
		this.aFloat104 = local6.aFloat102 * this.aFloat105 + local12 * local6.aFloat98 + local9 * local6.aFloat104;
		this.aFloat100 = this.aFloat105 * local6.aFloat108 + local6.aFloat100 * local9 + local6.aFloat99 * local12;
		@Pc(64) float local64 = this.aFloat103;
		this.aFloat105 = local9 * local6.aFloat105 + local12 * local6.aFloat101 + local6.aFloat107 * this.aFloat105;
		this.aFloat99 = local6.aFloat108 * this.aFloat101 + local18 * local6.aFloat99 + local6.aFloat100 * local15;
		this.aFloat98 = local6.aFloat104 * local15 + local18 * local6.aFloat98 + this.aFloat101 * local6.aFloat102;
		this.aFloat102 = local21 * local6.aFloat104 + local24 * local6.aFloat98 + this.aFloat107 * local6.aFloat102;
		this.aFloat108 = local6.aFloat108 * this.aFloat107 + local6.aFloat99 * local24 + local6.aFloat100 * local21;
		this.aFloat101 = local18 * local6.aFloat101 + local15 * local6.aFloat105 + this.aFloat101 * local6.aFloat107;
		this.aFloat103 = this.aFloat106 * local6.aFloat102 + local6.aFloat98 * local64 + local6.aFloat104 * local27 + local6.aFloat103;
		this.aFloat97 = local6.aFloat97 + this.aFloat106 * local6.aFloat108 + local64 * local6.aFloat99 + local6.aFloat100 * local27;
		this.aFloat107 = this.aFloat107 * local6.aFloat107 + local6.aFloat101 * local24 + local6.aFloat105 * local21;
		this.aFloat106 = local6.aFloat101 * local64 + local27 * local6.aFloat105 + this.aFloat106 * local6.aFloat107 + local6.aFloat106;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat97);
		@Pc(13) int local13 = (int) ((float) arg1 - this.aFloat103);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat106);
		arg3[1] = (int) (this.aFloat99 * (float) local6 + (float) local13 * this.aFloat98 + (float) local24 * this.aFloat101);
		arg3[0] = (int) ((float) local13 * this.aFloat104 + this.aFloat100 * (float) local6 + this.aFloat105 * (float) local24);
		arg3[2] = (int) (this.aFloat107 * (float) local24 + (float) local13 * this.aFloat102 + this.aFloat108 * (float) local6);
	}

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)V")
	@Override
	public void method6351(@OriginalArg(0) int arg0) {
		this.aFloat107 = 1.0F;
		this.aFloat100 = this.aFloat98 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat104 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat99 = -this.aFloat104;
		this.aFloat108 = this.aFloat97 = this.aFloat102 = this.aFloat103 = this.aFloat105 = this.aFloat101 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "([FI)[F")
	public float[] method4928(@OriginalArg(0) float[] arg0) {
		arg0[2] = this.aFloat108;
		arg0[8] = this.aFloat105;
		arg0[11] = 0.0F;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat107;
		arg0[1] = this.aFloat99;
		arg0[15] = 0.0F;
		arg0[4] = this.aFloat104;
		arg0[13] = 0.0F;
		arg0[0] = this.aFloat100;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = this.aFloat102;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat98;
		arg0[9] = this.aFloat101;
		return arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "()V")
	@Override
	public void method6349() {
		this.aFloat100 = this.aFloat98 = this.aFloat107 = 1.0F;
		this.aFloat104 = this.aFloat105 = this.aFloat99 = this.aFloat101 = this.aFloat108 = this.aFloat102 = this.aFloat97 = this.aFloat103 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)V")
	@Override
	public void method6345(@OriginalArg(0) int arg0) {
		this.aFloat100 = 1.0F;
		this.aFloat98 = this.aFloat107 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat101 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat99 = this.aFloat108 = this.aFloat97 = this.aFloat104 = this.aFloat103 = this.aFloat105 = this.aFloat106 = 0.0F;
		this.aFloat102 = -this.aFloat101;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIFFBF)V")
	public void method4930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		if (arg1 == 0) {
			this.aFloat98 = (float) (arg0 * 2);
			this.aFloat97 = (float) -arg2 + arg4;
			this.aFloat106 = arg5;
			this.aFloat103 = arg3 - (float) arg0;
			this.aFloat104 = this.aFloat105 = this.aFloat99 = this.aFloat101 = this.aFloat108 = this.aFloat102 = 0.0F;
			this.aFloat107 = 1.0F;
			this.aFloat100 = (float) (arg2 * 2);
			return;
		}
		@Pc(18) float local18 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg1 & 0x3FFF];
		@Pc(24) float local24 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg1 & 0x3FFF];
		this.aFloat100 = local18 * 2.0F * (float) arg2;
		this.aFloat99 = (float) arg0 * -2.0F * local24;
		this.aFloat105 = this.aFloat101 = this.aFloat108 = this.aFloat102 = 0.0F;
		this.aFloat107 = 1.0F;
		this.aFloat104 = (float) arg2 * 2.0F * local24;
		this.aFloat103 = (float) (arg0 * 2) * (-0.5F * local24 - local18 * 0.5F) + arg3;
		this.aFloat97 = arg4 + (local24 * 0.5F - local18 * 0.5F) * (float) (arg2 * 2);
		this.aFloat98 = (float) arg0 * local18 * 2.0F;
		this.aFloat106 = arg5;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!iu;)V")
	@Override
	public void method6355(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg0;
		this.aFloat106 = local6.aFloat106;
		this.aFloat108 = local6.aFloat108;
		this.aFloat103 = local6.aFloat103;
		this.aFloat100 = local6.aFloat100;
		this.aFloat98 = local6.aFloat98;
		this.aFloat101 = local6.aFloat101;
		this.aFloat99 = local6.aFloat99;
		this.aFloat105 = local6.aFloat105;
		this.aFloat102 = local6.aFloat102;
		this.aFloat107 = local6.aFloat107;
		this.aFloat97 = local6.aFloat97;
		this.aFloat104 = local6.aFloat104;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FBFF)F")
	public float method4931(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat97 + this.aFloat108 * arg0 + this.aFloat99 * arg1 + arg2 * this.aFloat100;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FZFF)V")
	public void method4932(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat102 *= arg0;
		this.aFloat101 *= arg1;
		this.aFloat100 *= arg2;
		this.aFloat106 *= arg1;
		this.aFloat108 *= arg2;
		this.aFloat105 *= arg1;
		this.aFloat107 *= arg1;
		this.aFloat104 *= arg0;
		this.aFloat99 *= arg2;
		this.aFloat97 *= arg2;
		this.aFloat103 *= arg0;
		this.aFloat98 *= arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "()Lclient!iu;")
	@Override
	public Class181 method6350() {
		@Pc(7) Class181_Sub1 local7 = new Class181_Sub1();
		local7.aFloat105 = this.aFloat105;
		local7.aFloat98 = this.aFloat98;
		local7.aFloat99 = this.aFloat99;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat101 = this.aFloat101;
		local7.aFloat100 = this.aFloat100;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat102 = this.aFloat102;
		local7.aFloat103 = this.aFloat103;
		local7.aFloat97 = this.aFloat97;
		local7.aFloat104 = this.aFloat104;
		local7.aFloat108 = this.aFloat108;
		return local7;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(F[FFBF)V")
	public void method4933(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = arg0 * this.aFloat102 + this.aFloat104 * arg3 + arg2 * this.aFloat98;
		arg1[0] = this.aFloat99 * arg2 + arg3 * this.aFloat100 + this.aFloat108 * arg0;
		arg1[2] = this.aFloat101 * arg2 + this.aFloat105 * arg3 + arg0 * this.aFloat107;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!iu;)V")
	public void method4934(@OriginalArg(1) Class181 arg0) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg0;
		this.aFloat100 = local6.aFloat100;
		this.aFloat99 = local6.aFloat104;
		this.aFloat108 = local6.aFloat105;
		this.aFloat98 = local6.aFloat98;
		this.aFloat102 = local6.aFloat101;
		this.aFloat105 = local6.aFloat108;
		this.aFloat104 = local6.aFloat99;
		this.aFloat97 = -(this.aFloat108 * local6.aFloat106 + this.aFloat100 * local6.aFloat97 + this.aFloat99 * local6.aFloat103);
		this.aFloat101 = local6.aFloat102;
		this.aFloat107 = local6.aFloat107;
		this.aFloat103 = -(local6.aFloat103 * this.aFloat98 + local6.aFloat97 * this.aFloat104 + this.aFloat102 * local6.aFloat106);
		this.aFloat106 = -(local6.aFloat97 * this.aFloat105 + this.aFloat101 * local6.aFloat103 + this.aFloat107 * local6.aFloat106);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III)V")
	@Override
	public void method6356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat106 = (float) arg2;
		this.aFloat104 = this.aFloat105 = this.aFloat99 = this.aFloat101 = this.aFloat108 = this.aFloat102 = 0.0F;
		this.aFloat97 = (float) arg0;
		this.aFloat100 = this.aFloat98 = this.aFloat107 = 1.0F;
		this.aFloat103 = (float) arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "(I)V")
	@Override
	public void method6344(@OriginalArg(0) int arg0) {
		this.aFloat98 = 1.0F;
		this.aFloat100 = this.aFloat107 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		this.aFloat108 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat99 = this.aFloat97 = this.aFloat104 = this.aFloat102 = this.aFloat103 = this.aFloat101 = this.aFloat106 = 0.0F;
		this.aFloat105 = -this.aFloat108;
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "([FI)[F")
	public float[] method4935(@OriginalArg(0) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat99;
		arg0[2] = 0.0F;
		arg0[0] = this.aFloat100;
		arg0[6] = 0.0F;
		arg0[1] = this.aFloat104;
		arg0[5] = this.aFloat98;
		arg0[9] = this.aFloat103;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat97;
		arg0[7] = 0.0F;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat106;
		return arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([I)V")
	@Override
	public void method6347(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat97;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat103;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat106;
		arg0[0] = (int) (local28 * this.aFloat105 + this.aFloat100 * local11 + local19 * this.aFloat104);
		arg0[1] = (int) (local28 * this.aFloat101 + this.aFloat98 * local19 + this.aFloat99 * local11);
		arg0[2] = (int) (local28 * this.aFloat107 + local11 * this.aFloat108 + this.aFloat102 * local19);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!iu;I)V")
	public void method4936(@OriginalArg(0) Class181 arg0) {
		@Pc(6) Class181_Sub1 local6 = (Class181_Sub1) arg0;
		this.aFloat97 = 0.0F;
		this.aFloat105 = local6.aFloat105;
		this.aFloat107 = local6.aFloat107;
		this.aFloat99 = local6.aFloat99;
		this.aFloat108 = local6.aFloat108;
		this.aFloat100 = local6.aFloat100;
		this.aFloat106 = (float) 0;
		this.aFloat103 = 0.0F;
		this.aFloat98 = local6.aFloat98;
		this.aFloat104 = local6.aFloat104;
		this.aFloat101 = local6.aFloat101;
		this.aFloat102 = local6.aFloat102;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
	@Override
	public void method6358(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class19_Sub1_Sub4_Sub1.aFloatArray67[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class19_Sub1_Sub4_Sub1.aFloatArray66[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat100;
		@Pc(21) float local21 = this.aFloat99;
		@Pc(24) float local24 = this.aFloat108;
		@Pc(27) float local27 = this.aFloat97;
		this.aFloat100 = local9 * local18 + local15 * this.aFloat105;
		this.aFloat105 = local9 * this.aFloat105 - local18 * local15;
		this.aFloat99 = this.aFloat101 * local15 + local9 * local21;
		this.aFloat101 = local9 * this.aFloat101 - local21 * local15;
		this.aFloat108 = local15 * this.aFloat107 + local24 * local9;
		this.aFloat107 = local9 * this.aFloat107 - local15 * local24;
		this.aFloat97 = this.aFloat106 * local15 + local9 * local27;
		this.aFloat106 = this.aFloat106 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(FBFF)F")
	public float method4937(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat106 + this.aFloat101 * arg2 + arg0 * this.aFloat105 + arg1 * this.aFloat107;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat103 += (float) arg1;
		this.aFloat97 += (float) arg0;
		this.aFloat106 += (float) arg2;
	}
}
