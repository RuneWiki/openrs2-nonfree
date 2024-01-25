import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!bt", name = "z", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!bt", name = "A", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!bt", name = "B", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!bt", name = "L", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!bt", name = "W", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!bt", name = "db", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class39_Sub1() {
		this.method7246();
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0) {
		this.aFloat54 = 1.0F;
		this.aFloat57 = this.aFloat60 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat51 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat50 = this.aFloat58 = this.aFloat56 = this.aFloat52 = this.aFloat59 = this.aFloat61 = this.aFloat55 = 0.0F;
		this.aFloat53 = -this.aFloat51;
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)V")
	@Override
	public void method7247(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat57;
		@Pc(21) float local21 = this.aFloat50;
		@Pc(24) float local24 = this.aFloat51;
		@Pc(27) float local27 = this.aFloat58;
		this.aFloat57 = this.aFloat53 * local15 + local9 * local18;
		this.aFloat50 = this.aFloat61 * local15 + local21 * local9;
		this.aFloat53 = local9 * this.aFloat53 - local15 * local18;
		this.aFloat51 = local9 * local24 + local15 * this.aFloat60;
		this.aFloat61 = local9 * this.aFloat61 - local21 * local15;
		this.aFloat58 = this.aFloat55 * local15 + local9 * local27;
		this.aFloat60 = local9 * this.aFloat60 - local24 * local15;
		this.aFloat55 = this.aFloat55 * local9 - local15 * local27;
	}

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
	@Override
	public void method7252(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat57;
		@Pc(21) float local21 = this.aFloat50;
		@Pc(24) float local24 = this.aFloat51;
		this.aFloat57 = local18 * local9 - this.aFloat56 * local15;
		@Pc(38) float local38 = this.aFloat58;
		this.aFloat50 = local21 * local9 - this.aFloat54 * local15;
		this.aFloat56 = local9 * this.aFloat56 + local18 * local15;
		this.aFloat54 = local21 * local15 + local9 * this.aFloat54;
		this.aFloat51 = local9 * local24 - local15 * this.aFloat52;
		this.aFloat58 = local9 * local38 - local15 * this.aFloat59;
		this.aFloat52 = local24 * local15 + this.aFloat52 * local9;
		this.aFloat59 = this.aFloat59 * local9 + local15 * local38;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFFI)F")
	public float method1545(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat61 * arg2 + arg0 * this.aFloat53 + arg1 * this.aFloat60 + this.aFloat55;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	@Override
	public void method7237(@OriginalArg(0) int arg0) {
		this.aFloat57 = 1.0F;
		this.aFloat54 = this.aFloat60 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat61 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat50 = this.aFloat51 = this.aFloat58 = this.aFloat56 = this.aFloat59 = this.aFloat53 = this.aFloat55 = 0.0F;
		this.aFloat52 = -this.aFloat61;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFFFFFIFFF)V")
	public void method1547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat60 = arg0;
		this.aFloat59 = 0.0F;
		this.aFloat58 = 0.0F;
		this.aFloat54 = arg2;
		this.aFloat61 = arg8;
		this.aFloat53 = arg4;
		this.aFloat55 = 0.0F;
		this.aFloat52 = arg5;
		this.aFloat57 = arg7;
		this.aFloat50 = arg1;
		this.aFloat51 = arg6;
		this.aFloat56 = arg3;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V")
	public void method1548() {
		this.aFloat60 = -this.aFloat60;
		this.aFloat61 = -this.aFloat61;
		this.aFloat55 = -this.aFloat55;
		this.aFloat59 = -this.aFloat59;
		this.aFloat54 = -this.aFloat54;
		this.aFloat56 = -this.aFloat56;
		this.aFloat52 = -this.aFloat52;
		this.aFloat53 = -this.aFloat53;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg1 - this.aFloat59);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat55);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat58);
		arg3[1] = (int) ((float) local10 * this.aFloat54 + this.aFloat50 * (float) local24 + this.aFloat61 * (float) local17);
		arg3[2] = (int) ((float) local17 * this.aFloat60 + this.aFloat52 * (float) local10 + (float) local24 * this.aFloat51);
		arg3[0] = (int) (this.aFloat53 * (float) local17 + (float) local10 * this.aFloat56 + this.aFloat57 * (float) local24);
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat60 * (float) arg2 + (float) arg1 * this.aFloat61 + (float) arg0 * this.aFloat53 + this.aFloat55);
		arg3[0] = (int) (this.aFloat51 * (float) arg2 + (float) arg0 * this.aFloat57 + (float) arg1 * this.aFloat50 + this.aFloat58);
		arg3[1] = (int) (this.aFloat59 + (float) arg2 * this.aFloat52 + this.aFloat54 * (float) arg1 + (float) arg0 * this.aFloat56);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FBFF)V")
	public void method1550(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat55 = arg0;
		this.aFloat58 = arg1;
		this.aFloat56 = this.aFloat53 = this.aFloat50 = this.aFloat61 = this.aFloat51 = this.aFloat52 = 0.0F;
		this.aFloat59 = arg2;
		this.aFloat57 = this.aFloat54 = this.aFloat60 = 1.0F;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFIF)V")
	public void method1551(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat60 = arg1;
		this.aFloat56 = 0.0F;
		this.aFloat55 = 0.0F;
		this.aFloat61 = 0.0F;
		this.aFloat50 = 0.0F;
		this.aFloat58 = 0.0F;
		this.aFloat59 = 0.0F;
		this.aFloat57 = arg2;
		this.aFloat53 = 0.0F;
		this.aFloat52 = 0.0F;
		this.aFloat54 = arg0;
		this.aFloat51 = 0.0F;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V")
	@Override
	public void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat59 = arg1;
		this.aFloat58 = arg0;
		this.aFloat57 = this.aFloat54 = this.aFloat60 = 1.0F;
		this.aFloat56 = this.aFloat53 = this.aFloat50 = this.aFloat61 = this.aFloat51 = this.aFloat52 = 0.0F;
		this.aFloat55 = arg2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class10_Sub3.aFloatArray78[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class10_Sub3.aFloatArray79[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class10_Sub3.aFloatArray78[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class10_Sub3.aFloatArray79[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat52 = local43 * local21 + local27 * local39;
		this.aFloat60 = local9 * local21;
		this.aFloat61 = -local15;
		this.aFloat57 = local47 * local27 + local33 * local21;
		this.aFloat56 = local27 * local43 + local39 * -local21;
		this.aFloat51 = local47 * local21 + local33 * -local27;
		this.aFloat53 = local27 * local9;
		this.aFloat50 = local39 * local9;
		this.aFloat54 = local33 * local9;
		this.aFloat55 = -((float) arg2 * this.aFloat60) - (float) arg1 * this.aFloat61 + this.aFloat53 * (float) -arg0;
		this.aFloat59 = this.aFloat56 * (float) -arg0 - (float) arg1 * this.aFloat54 - this.aFloat52 * (float) arg2;
		this.aFloat58 = -(this.aFloat51 * (float) arg2) + (float) -arg0 * this.aFloat57 - (float) arg1 * this.aFloat50;
	}

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V")
	@Override
	public void method7255(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat54;
		@Pc(24) float local24 = this.aFloat52;
		this.aFloat56 = local18 * local9 - this.aFloat53 * local15;
		@Pc(38) float local38 = this.aFloat59;
		this.aFloat54 = local9 * local21 - this.aFloat61 * local15;
		this.aFloat53 = local15 * local18 + local9 * this.aFloat53;
		this.aFloat61 = this.aFloat61 * local9 + local15 * local21;
		this.aFloat52 = local24 * local9 - this.aFloat60 * local15;
		this.aFloat59 = local9 * local38 - local15 * this.aFloat55;
		this.aFloat60 = local24 * local15 + local9 * this.aFloat60;
		this.aFloat55 = local15 * local38 + local9 * this.aFloat55;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFFZ)F")
	public float method1552(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat58 + this.aFloat50 * arg2 + arg0 * this.aFloat57 + this.aFloat51 * arg1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(F[FFFZF)V")
	public void method1553(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4) {
		arg1[2] = arg0 * this.aFloat61 + this.aFloat53 * arg4 + arg2 * this.aFloat60;
		@Pc(73) float local73;
		@Pc(65) float local65;
		@Pc(57) float local57;
		@Pc(49) float local49;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local49 = -arg3 / arg4;
			local65 = local49 * this.aFloat56 + this.aFloat59;
			local73 = this.aFloat57 * local49 + this.aFloat58;
			local57 = this.aFloat53 * local49 + this.aFloat55;
		} else if (arg0 > 0.00390625F || arg0 < -0.00390625F) {
			local49 = -arg3 / arg0;
			local57 = this.aFloat61 * local49 + this.aFloat55;
			local65 = local49 * this.aFloat54 + this.aFloat59;
			local73 = this.aFloat58 + local49 * this.aFloat50;
		} else {
			local49 = -arg3 / arg2;
			local65 = this.aFloat59 + local49 * this.aFloat52;
			local57 = this.aFloat55 + this.aFloat60 * local49;
			local73 = this.aFloat58 + local49 * this.aFloat51;
		}
		arg1[1] = this.aFloat56 * arg4 + this.aFloat54 * arg0 + arg2 * this.aFloat52;
		arg1[0] = this.aFloat50 * arg0 + this.aFloat57 * arg4 + this.aFloat51 * arg2;
		arg1[3] = -(local57 * arg1[2] + local65 * arg1[1] + local73 * arg1[0]);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[F)[F")
	public float[] method1554(@OriginalArg(1) float[] arg0) {
		arg0[2] = 0.0F;
		arg0[10] = this.aFloat55;
		arg0[3] = 0.0F;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[0] = this.aFloat57;
		arg0[8] = this.aFloat58;
		arg0[5] = this.aFloat54;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat56;
		arg0[4] = this.aFloat50;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat59;
		return arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BFFF)F")
	public float method1555(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * this.aFloat54 + this.aFloat56 * arg2 + this.aFloat52 * arg0 + this.aFloat59;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([FZ)[F")
	public float[] method1556(@OriginalArg(0) float[] arg0) {
		arg0[2] = this.aFloat53;
		arg0[12] = this.aFloat58;
		arg0[1] = this.aFloat56;
		arg0[4] = this.aFloat50;
		arg0[0] = this.aFloat57;
		arg0[5] = this.aFloat54;
		arg0[7] = 0.0F;
		arg0[6] = this.aFloat61;
		arg0[15] = 1.0F;
		arg0[13] = this.aFloat59;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat51;
		arg0[10] = this.aFloat60;
		arg0[3] = 0.0F;
		arg0[14] = this.aFloat55;
		arg0[9] = this.aFloat52;
		return arg0;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I[F)[F")
	public float[] method1557(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat57;
		arg0[8] = this.aFloat53;
		arg0[3] = 0.0F;
		arg0[1] = this.aFloat50;
		arg0[14] = 0.0F;
		arg0[15] = 0.0F;
		arg0[6] = this.aFloat52;
		arg0[7] = 0.0F;
		arg0[12] = 0.0F;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat54;
		arg0[9] = this.aFloat61;
		arg0[10] = this.aFloat60;
		arg0[2] = this.aFloat51;
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat56;
		return arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!sk;)V")
	public void method1558(@OriginalArg(1) Class39 arg0) {
		@Pc(12) Class39_Sub1 local12 = (Class39_Sub1) arg0;
		@Pc(15) float local15 = this.aFloat57;
		@Pc(18) float local18 = this.aFloat56;
		@Pc(21) float local21 = this.aFloat50;
		@Pc(24) float local24 = this.aFloat54;
		@Pc(27) float local27 = this.aFloat51;
		@Pc(30) float local30 = this.aFloat52;
		@Pc(33) float local33 = this.aFloat58;
		this.aFloat56 = local15 * local12.aFloat56 + local18 * local12.aFloat54 + local12.aFloat52 * this.aFloat53;
		this.aFloat57 = this.aFloat53 * local12.aFloat51 + local18 * local12.aFloat50 + local12.aFloat57 * local15;
		@Pc(70) float local70 = this.aFloat59;
		this.aFloat53 = local18 * local12.aFloat61 + local15 * local12.aFloat53 + this.aFloat53 * local12.aFloat60;
		this.aFloat54 = local12.aFloat54 * local24 + local12.aFloat56 * local21 + local12.aFloat52 * this.aFloat61;
		this.aFloat50 = local12.aFloat50 * local24 + local21 * local12.aFloat57 + this.aFloat61 * local12.aFloat51;
		this.aFloat52 = local27 * local12.aFloat56 + local30 * local12.aFloat54 + local12.aFloat52 * this.aFloat60;
		this.aFloat61 = local21 * local12.aFloat53 + local12.aFloat61 * local24 + local12.aFloat60 * this.aFloat61;
		this.aFloat51 = local27 * local12.aFloat57 + local12.aFloat50 * local30 + local12.aFloat51 * this.aFloat60;
		this.aFloat59 = local12.aFloat54 * local70 + local12.aFloat56 * local33 + local12.aFloat52 * this.aFloat55 + local12.aFloat59;
		this.aFloat58 = local12.aFloat58 + local12.aFloat51 * this.aFloat55 + local12.aFloat50 * local70 + local33 * local12.aFloat57;
		this.aFloat60 = local27 * local12.aFloat53 + local30 * local12.aFloat61 + this.aFloat60 * local12.aFloat60;
		this.aFloat55 = local12.aFloat55 + local12.aFloat60 * this.aFloat55 + local33 * local12.aFloat53 + local70 * local12.aFloat61;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)V")
	@Override
	public void method7253(@OriginalArg(0) int arg0) {
		this.aFloat60 = 1.0F;
		this.aFloat57 = this.aFloat54 = Class10_Sub3.aFloatArray78[arg0 & 0x3FFF];
		this.aFloat56 = Class10_Sub3.aFloatArray79[arg0 & 0x3FFF];
		this.aFloat51 = this.aFloat58 = this.aFloat52 = this.aFloat59 = this.aFloat53 = this.aFloat61 = this.aFloat55 = 0.0F;
		this.aFloat50 = -this.aFloat56;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I[F)[F")
	public float[] method1559(@OriginalArg(1) float[] arg0) {
		arg0[13] = 0.0F;
		arg0[4] = this.aFloat56;
		arg0[2] = this.aFloat51;
		arg0[5] = this.aFloat54;
		arg0[7] = this.aFloat59;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat61;
		arg0[0] = this.aFloat57;
		arg0[3] = this.aFloat58;
		arg0[10] = this.aFloat60;
		arg0[11] = this.aFloat55;
		arg0[8] = this.aFloat53;
		arg0[1] = this.aFloat50;
		arg0[6] = this.aFloat52;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!sk;I)V")
	public void method1560(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub1 local6 = (Class39_Sub1) arg0;
		this.aFloat57 = local6.aFloat57;
		this.aFloat51 = local6.aFloat53;
		this.aFloat50 = local6.aFloat56;
		this.aFloat52 = local6.aFloat61;
		this.aFloat54 = local6.aFloat54;
		this.aFloat53 = local6.aFloat51;
		this.aFloat56 = local6.aFloat50;
		this.aFloat61 = local6.aFloat52;
		this.aFloat58 = -(this.aFloat51 * local6.aFloat55 + this.aFloat57 * local6.aFloat58 + this.aFloat50 * local6.aFloat59);
		this.aFloat60 = local6.aFloat60;
		this.aFloat59 = -(this.aFloat54 * local6.aFloat59 + local6.aFloat58 * this.aFloat56 + this.aFloat52 * local6.aFloat55);
		this.aFloat55 = -(this.aFloat53 * local6.aFloat58 + local6.aFloat59 * this.aFloat61 + local6.aFloat55 * this.aFloat60);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(F[FFBF)V")
	public void method1561(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		arg1[1] = this.aFloat52 * arg3 + arg2 * this.aFloat54 + arg0 * this.aFloat56;
		arg1[0] = arg3 * this.aFloat51 + arg2 * this.aFloat50 + this.aFloat57 * arg0;
		arg1[2] = this.aFloat60 * arg3 + this.aFloat53 * arg0 + this.aFloat61 * arg2;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
	@Override
	public void method7244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat58 += arg0;
		this.aFloat59 += arg1;
		this.aFloat55 += arg2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "()V")
	@Override
	public void method7246() {
		this.aFloat56 = this.aFloat53 = this.aFloat50 = this.aFloat61 = this.aFloat51 = this.aFloat52 = this.aFloat58 = this.aFloat59 = this.aFloat55 = 0.0F;
		this.aFloat57 = this.aFloat54 = this.aFloat60 = 1.0F;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7248() {
		@Pc(7) Class39_Sub1 local7 = new Class39_Sub1();
		local7.aFloat56 = this.aFloat56;
		local7.aFloat57 = this.aFloat57;
		local7.aFloat52 = this.aFloat52;
		local7.aFloat60 = this.aFloat60;
		local7.aFloat50 = this.aFloat50;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat53 = this.aFloat53;
		local7.aFloat55 = this.aFloat55;
		local7.aFloat51 = this.aFloat51;
		local7.aFloat54 = this.aFloat54;
		local7.aFloat61 = this.aFloat61;
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!sk;Lclient!sk;)V")
	public void method1562(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(6) Class39_Sub1 local6 = (Class39_Sub1) arg0;
		@Pc(9) Class39_Sub1 local9 = (Class39_Sub1) arg1;
		this.aFloat57 = local6.aFloat50 * local9.aFloat56 + local6.aFloat57 * local9.aFloat57 + local9.aFloat53 * local6.aFloat51;
		this.aFloat56 = local9.aFloat53 * local6.aFloat52 + local9.aFloat57 * local6.aFloat56 + local6.aFloat54 * local9.aFloat56;
		this.aFloat53 = local9.aFloat57 * local6.aFloat53 + local6.aFloat61 * local9.aFloat56 + local9.aFloat53 * local6.aFloat60;
		this.aFloat50 = local9.aFloat50 * local6.aFloat57 + local9.aFloat54 * local6.aFloat50 + local6.aFloat51 * local9.aFloat61;
		this.aFloat54 = local6.aFloat56 * local9.aFloat50 + local9.aFloat54 * local6.aFloat54 + local9.aFloat61 * local6.aFloat52;
		this.aFloat61 = local6.aFloat60 * local9.aFloat61 + local9.aFloat50 * local6.aFloat53 + local6.aFloat61 * local9.aFloat54;
		this.aFloat51 = local6.aFloat57 * local9.aFloat51 + local6.aFloat50 * local9.aFloat52 + local9.aFloat60 * local6.aFloat51;
		this.aFloat52 = local6.aFloat56 * local9.aFloat51 + local9.aFloat52 * local6.aFloat54 + local9.aFloat60 * local6.aFloat52;
		this.aFloat58 = local6.aFloat58 + local6.aFloat51 * local9.aFloat55 + local9.aFloat59 * local6.aFloat50 + local9.aFloat58 * local6.aFloat57;
		this.aFloat60 = local9.aFloat52 * local6.aFloat61 + local9.aFloat51 * local6.aFloat53 + local6.aFloat60 * local9.aFloat60;
		this.aFloat59 = local6.aFloat59 + local9.aFloat59 * local6.aFloat54 + local6.aFloat56 * local9.aFloat58 + local6.aFloat52 * local9.aFloat55;
		this.aFloat55 = local9.aFloat59 * local6.aFloat61 + local9.aFloat58 * local6.aFloat53 + local9.aFloat55 * local6.aFloat60 + local6.aFloat55;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([FB)[F")
	public float[] method1563(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat54;
		arg0[3] = this.aFloat58;
		arg0[6] = this.aFloat52;
		arg0[4] = this.aFloat56;
		arg0[2] = this.aFloat51;
		arg0[7] = this.aFloat59;
		arg0[0] = this.aFloat57;
		arg0[1] = this.aFloat50;
		return arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFZIIFI)V")
	public void method1564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat59 = arg0 - (float) arg3;
			this.aFloat55 = arg4;
			this.aFloat54 = arg3 * 2;
			this.aFloat60 = 1.0F;
			this.aFloat58 = (float) -arg5 + arg1;
			this.aFloat57 = arg5 * 2;
			this.aFloat56 = this.aFloat53 = this.aFloat50 = this.aFloat61 = this.aFloat51 = this.aFloat52 = 0.0F;
			return;
		}
		@Pc(14) float local14 = Class10_Sub3.aFloatArray78[arg2 & 0x3FFF];
		@Pc(20) float local20 = Class10_Sub3.aFloatArray79[arg2 & 0x3FFF];
		this.aFloat55 = arg4;
		this.aFloat53 = this.aFloat61 = this.aFloat51 = this.aFloat52 = 0.0F;
		this.aFloat56 = (float) arg5 * local20 * 2.0F;
		this.aFloat58 = arg1 + (float) (arg5 * 2) * (local20 * 0.5F - local14 * 0.5F);
		this.aFloat54 = local14 * 2.0F * (float) arg3;
		this.aFloat59 = (float) (arg3 * 2) * (-0.5F * local20 - local14 * 0.5F) + arg0;
		this.aFloat50 = (float) arg3 * local20 * -2.0F;
		this.aFloat57 = local14 * 2.0F * (float) arg5;
		this.aFloat60 = 1.0F;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lclient!sk;I)V")
	public void method1565(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub1 local6 = (Class39_Sub1) arg0;
		this.aFloat56 = local6.aFloat56;
		this.aFloat51 = local6.aFloat51;
		this.aFloat61 = local6.aFloat61;
		this.aFloat58 = 0.0F;
		this.aFloat52 = local6.aFloat52;
		this.aFloat54 = local6.aFloat54;
		this.aFloat59 = 0.0F;
		this.aFloat50 = local6.aFloat50;
		this.aFloat53 = local6.aFloat53;
		this.aFloat60 = local6.aFloat60;
		this.aFloat57 = local6.aFloat57;
		this.aFloat55 = 0.0F;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat54 * (float) arg1 + (float) arg0 * this.aFloat56 + this.aFloat52 * (float) arg2);
		arg3[0] = (int) (this.aFloat51 * (float) arg2 + this.aFloat50 * (float) arg1 + (float) arg0 * this.aFloat57);
		arg3[2] = (int) (this.aFloat53 * (float) arg0 + this.aFloat61 * (float) arg1 + (float) arg2 * this.aFloat60);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(BFFF)V")
	public void method1566(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat50 *= arg0;
		this.aFloat53 *= arg1;
		this.aFloat61 *= arg1;
		this.aFloat51 *= arg0;
		this.aFloat60 *= arg1;
		this.aFloat54 *= arg2;
		this.aFloat59 *= arg2;
		this.aFloat57 *= arg0;
		this.aFloat58 *= arg0;
		this.aFloat55 *= arg1;
		this.aFloat52 *= arg2;
		this.aFloat56 *= arg2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([I)V")
	@Override
	public void method7241(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat58;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat59;
		@Pc(30) float local30 = (float) arg0[2] - this.aFloat55;
		arg0[1] = (int) (this.aFloat50 * local12 + this.aFloat54 * local21 + local30 * this.aFloat61);
		arg0[0] = (int) (this.aFloat57 * local12 + local21 * this.aFloat56 + local30 * this.aFloat53);
		arg0[2] = (int) (local30 * this.aFloat60 + local12 * this.aFloat51 + this.aFloat52 * local21);
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(FFFI)V")
	public void method1567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat59 += arg1;
		this.aFloat55 += arg2;
		this.aFloat58 += arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method7236(@OriginalArg(0) Class39 arg0) {
		@Pc(6) Class39_Sub1 local6 = (Class39_Sub1) arg0;
		this.aFloat55 = local6.aFloat55;
		this.aFloat57 = local6.aFloat57;
		this.aFloat59 = local6.aFloat59;
		this.aFloat60 = local6.aFloat60;
		this.aFloat56 = local6.aFloat56;
		this.aFloat61 = local6.aFloat61;
		this.aFloat50 = local6.aFloat50;
		this.aFloat58 = local6.aFloat58;
		this.aFloat52 = local6.aFloat52;
		this.aFloat51 = local6.aFloat51;
		this.aFloat53 = local6.aFloat53;
		this.aFloat54 = local6.aFloat54;
	}
}
