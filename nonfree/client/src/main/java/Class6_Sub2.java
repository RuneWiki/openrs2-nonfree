import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!fba", name = "lb", descriptor = "Lclient!kd;")
	public static Class6 lb;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!fba", name = "y", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!fba", name = "M", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!fba", name = "P", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!fba", name = "Q", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!fba", name = "V", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!fba", name = "cb", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!fba", name = "jb", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class6_Sub2() {
		this.method6706();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat75 += arg1;
		this.aFloat78 += arg0;
		this.aFloat72 += arg2;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	@Override
	public void method6692(@OriginalArg(0) int arg0) {
		this.aFloat82 = 1.0F;
		this.aFloat81 = this.aFloat76 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat71 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat77 = -this.aFloat71;
		this.aFloat80 = this.aFloat78 = this.aFloat73 = this.aFloat79 = this.aFloat75 = this.aFloat74 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(10) int local10 = (int) ((float) arg2 - this.aFloat72);
		@Pc(17) int local17 = (int) ((float) arg1 - this.aFloat75);
		@Pc(24) int local24 = (int) ((float) arg0 - this.aFloat78);
		arg3[1] = (int) (this.aFloat80 * (float) local24 + this.aFloat82 * (float) local17 + this.aFloat74 * (float) local10);
		arg3[2] = (int) ((float) local10 * this.aFloat76 + (float) local24 * this.aFloat71 + (float) local17 * this.aFloat79);
		arg3[0] = (int) (this.aFloat77 * (float) local10 + this.aFloat81 * (float) local24 + this.aFloat73 * (float) local17);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!kd;Lclient!kd;)V")
	public void method2698(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg0;
		@Pc(9) Class6_Sub2 local9 = (Class6_Sub2) arg1;
		this.aFloat81 = local6.aFloat71 * local9.aFloat77 + local9.aFloat73 * local6.aFloat80 + local9.aFloat81 * local6.aFloat81;
		this.aFloat73 = local9.aFloat77 * local6.aFloat79 + local9.aFloat81 * local6.aFloat73 + local9.aFloat73 * local6.aFloat82;
		this.aFloat80 = local6.aFloat71 * local9.aFloat74 + local6.aFloat81 * local9.aFloat80 + local6.aFloat80 * local9.aFloat82;
		this.aFloat77 = local9.aFloat77 * local6.aFloat76 + local9.aFloat81 * local6.aFloat77 + local6.aFloat74 * local9.aFloat73;
		this.aFloat82 = local6.aFloat79 * local9.aFloat74 + local6.aFloat73 * local9.aFloat80 + local9.aFloat82 * local6.aFloat82;
		this.aFloat74 = local9.aFloat82 * local6.aFloat74 + local9.aFloat80 * local6.aFloat77 + local6.aFloat76 * local9.aFloat74;
		this.aFloat71 = local9.aFloat79 * local6.aFloat80 + local6.aFloat81 * local9.aFloat71 + local9.aFloat76 * local6.aFloat71;
		this.aFloat79 = local6.aFloat79 * local9.aFloat76 + local6.aFloat73 * local9.aFloat71 + local6.aFloat82 * local9.aFloat79;
		this.aFloat78 = local6.aFloat78 + local9.aFloat78 * local6.aFloat81 + local6.aFloat80 * local9.aFloat75 + local9.aFloat72 * local6.aFloat71;
		this.aFloat76 = local6.aFloat77 * local9.aFloat71 + local6.aFloat74 * local9.aFloat79 + local9.aFloat76 * local6.aFloat76;
		this.aFloat75 = local6.aFloat79 * local9.aFloat72 + local6.aFloat82 * local9.aFloat75 + local6.aFloat73 * local9.aFloat78 + local6.aFloat75;
		this.aFloat72 = local9.aFloat78 * local6.aFloat77 + local6.aFloat74 * local9.aFloat75 + local9.aFloat72 * local6.aFloat76 + local6.aFloat72;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat76 * (float) arg2 + (float) arg0 * this.aFloat77 + (float) arg1 * this.aFloat74 + this.aFloat72);
		arg3[1] = (int) (this.aFloat75 + (float) arg2 * this.aFloat79 + this.aFloat82 * (float) arg1 + (float) arg0 * this.aFloat73);
		arg3[0] = (int) (this.aFloat71 * (float) arg2 + this.aFloat80 * (float) arg1 + (float) arg0 * this.aFloat81 + this.aFloat78);
	}

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V")
	@Override
	public void method6711(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat71;
		this.aFloat81 = local9 * local18 - local15 * this.aFloat73;
		@Pc(38) float local38 = this.aFloat78;
		this.aFloat80 = local21 * local9 - this.aFloat82 * local15;
		this.aFloat73 = local9 * this.aFloat73 + local15 * local18;
		this.aFloat71 = local24 * local9 - local15 * this.aFloat79;
		this.aFloat82 = local15 * local21 + local9 * this.aFloat82;
		this.aFloat78 = local38 * local9 - local15 * this.aFloat75;
		this.aFloat79 = local15 * local24 + local9 * this.aFloat79;
		this.aFloat75 = this.aFloat75 * local9 + local38 * local15;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)V")
	@Override
	public void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat73 = this.aFloat77 = this.aFloat80 = this.aFloat74 = this.aFloat71 = this.aFloat79 = 0.0F;
		this.aFloat75 = arg1;
		this.aFloat78 = arg0;
		this.aFloat72 = arg2;
		this.aFloat81 = this.aFloat82 = this.aFloat76 = 1.0F;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "([FI)[F")
	public float[] method2701(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat74;
		arg0[11] = this.aFloat72;
		arg0[10] = this.aFloat76;
		arg0[3] = this.aFloat78;
		arg0[14] = 0.0F;
		arg0[2] = this.aFloat71;
		arg0[4] = this.aFloat73;
		arg0[6] = this.aFloat79;
		arg0[1] = this.aFloat80;
		arg0[13] = 0.0F;
		arg0[7] = this.aFloat75;
		arg0[12] = 0.0F;
		arg0[0] = this.aFloat81;
		arg0[8] = this.aFloat77;
		arg0[5] = this.aFloat82;
		arg0[15] = 1;
		return arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFFB)F")
	public float method2702(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat71 * arg0 + this.aFloat81 * arg1 + this.aFloat80 * arg2 + this.aFloat78;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method6695(@OriginalArg(0) Class6 arg0) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg0;
		this.aFloat79 = local6.aFloat79;
		this.aFloat77 = local6.aFloat77;
		this.aFloat72 = local6.aFloat72;
		this.aFloat74 = local6.aFloat74;
		this.aFloat81 = local6.aFloat81;
		this.aFloat76 = local6.aFloat76;
		this.aFloat82 = local6.aFloat82;
		this.aFloat73 = local6.aFloat73;
		this.aFloat75 = local6.aFloat75;
		this.aFloat78 = local6.aFloat78;
		this.aFloat80 = local6.aFloat80;
		this.aFloat71 = local6.aFloat71;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFF[FBF)V")
	public void method2703(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) float arg4) {
		@Pc(60) float local60;
		@Pc(44) float local44;
		@Pc(52) float local52;
		@Pc(36) float local36;
		if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local36 = -arg4 / arg1;
			local52 = this.aFloat72 + local36 * this.aFloat77;
			local44 = local36 * this.aFloat73 + this.aFloat75;
			local60 = this.aFloat78 + local36 * this.aFloat81;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local36 = -arg4 / arg2;
			local44 = this.aFloat75 + local36 * this.aFloat82;
			local52 = this.aFloat74 * local36 + this.aFloat72;
			local60 = local36 * this.aFloat80 + this.aFloat78;
		} else {
			local36 = -arg4 / arg0;
			local44 = this.aFloat79 * local36 + this.aFloat75;
			local52 = local36 * this.aFloat76 + this.aFloat72;
			local60 = this.aFloat71 * local36 + this.aFloat78;
		}
		arg3[0] = arg2 * this.aFloat80 + this.aFloat81 * arg1 + this.aFloat71 * arg0;
		arg3[1] = this.aFloat82 * arg2 + arg1 * this.aFloat73 + this.aFloat79 * arg0;
		arg3[2] = this.aFloat74 * arg2 + arg1 * this.aFloat77 + this.aFloat76 * arg0;
		arg3[3] = -(local52 * arg3[2] + arg3[1] * local44 + arg3[0] * local60);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat71 * (float) arg2 + this.aFloat81 * (float) arg0 + this.aFloat80 * (float) arg1);
		arg3[1] = (int) (this.aFloat79 * (float) arg2 + this.aFloat82 * (float) arg1 + this.aFloat73 * (float) arg0);
		arg3[2] = (int) (this.aFloat74 * (float) arg1 + (float) arg0 * this.aFloat77 + this.aFloat76 * (float) arg2);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z[F)[F")
	public float[] method2704(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat77;
		arg0[15] = 0.0F;
		arg0[5] = this.aFloat82;
		arg0[11] = 0.0F;
		arg0[0] = this.aFloat81;
		arg0[6] = this.aFloat79;
		arg0[1] = this.aFloat80;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat76;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat74;
		arg0[12] = 0.0F;
		arg0[4] = this.aFloat73;
		arg0[7] = 0.0F;
		arg0[2] = this.aFloat71;
		return arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZLclient!kd;)V")
	public void method2705(@OriginalArg(1) Class6 arg0) {
		@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat81;
		@Pc(12) float local12 = this.aFloat73;
		@Pc(19) float local19 = this.aFloat80;
		@Pc(22) float local22 = this.aFloat82;
		@Pc(25) float local25 = this.aFloat71;
		@Pc(28) float local28 = this.aFloat79;
		@Pc(31) float local31 = this.aFloat78;
		@Pc(34) float local34 = this.aFloat75;
		this.aFloat81 = local6.aFloat71 * this.aFloat77 + local12 * local6.aFloat80 + local6.aFloat81 * local9;
		this.aFloat73 = this.aFloat77 * local6.aFloat79 + local6.aFloat73 * local9 + local6.aFloat82 * local12;
		this.aFloat77 = local6.aFloat76 * this.aFloat77 + local12 * local6.aFloat74 + local6.aFloat77 * local9;
		this.aFloat80 = local19 * local6.aFloat81 + local6.aFloat80 * local22 + local6.aFloat71 * this.aFloat74;
		this.aFloat82 = local6.aFloat82 * local22 + local19 * local6.aFloat73 + this.aFloat74 * local6.aFloat79;
		this.aFloat74 = this.aFloat74 * local6.aFloat76 + local19 * local6.aFloat77 + local22 * local6.aFloat74;
		this.aFloat71 = this.aFloat76 * local6.aFloat71 + local6.aFloat81 * local25 + local28 * local6.aFloat80;
		this.aFloat79 = local6.aFloat73 * local25 + local28 * local6.aFloat82 + this.aFloat76 * local6.aFloat79;
		this.aFloat75 = local6.aFloat75 + local6.aFloat79 * this.aFloat72 + local6.aFloat73 * local31 + local34 * local6.aFloat82;
		this.aFloat78 = local6.aFloat78 + local6.aFloat81 * local31 + local34 * local6.aFloat80 + this.aFloat72 * local6.aFloat71;
		this.aFloat76 = local6.aFloat76 * this.aFloat76 + local28 * local6.aFloat74 + local6.aFloat77 * local25;
		this.aFloat72 = local6.aFloat72 + local31 * local6.aFloat77 + local34 * local6.aFloat74 + this.aFloat72 * local6.aFloat76;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFBFFFFFFF)V")
	public void method2708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat78 = 0.0F;
		this.aFloat81 = arg3;
		this.aFloat82 = arg1;
		this.aFloat76 = arg5;
		this.aFloat73 = arg7;
		this.aFloat74 = arg6;
		this.aFloat72 = 0.0F;
		this.aFloat77 = arg0;
		this.aFloat79 = arg8;
		this.aFloat80 = arg2;
		this.aFloat71 = arg4;
		this.aFloat75 = 0.0F;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub18.aFloatArray14[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub18.aFloatArray13[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub18.aFloatArray14[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub18.aFloatArray13[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat79 = local21 * local43 + local27 * local39;
		this.aFloat73 = local39 * -local21 + local43 * local27;
		this.aFloat81 = local47 * local27 + local33 * local21;
		this.aFloat76 = local21 * local9;
		this.aFloat74 = -local15;
		this.aFloat71 = local33 * -local27 + local47 * local21;
		this.aFloat82 = local9 * local33;
		this.aFloat80 = local39 * local9;
		this.aFloat77 = local27 * local9;
		this.aFloat72 = -(this.aFloat76 * (float) arg2) + (float) -arg0 * this.aFloat77 - (float) arg1 * this.aFloat74;
		this.aFloat75 = this.aFloat73 * (float) -arg0 - (float) arg1 * this.aFloat82 - this.aFloat79 * (float) arg2;
		this.aFloat78 = (float) -arg0 * this.aFloat81 - (float) arg1 * this.aFloat80 - this.aFloat71 * (float) arg2;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IFFIIIF)V")
	public void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat78 = (float) -arg4 + arg5;
			this.aFloat81 = arg4 * 2;
			this.aFloat82 = arg3 * 2;
			this.aFloat75 = (float) -arg3 + arg2;
			this.aFloat72 = arg1;
			this.aFloat76 = 1.0F;
			this.aFloat73 = this.aFloat77 = this.aFloat80 = this.aFloat74 = this.aFloat71 = this.aFloat79 = 0.0F;
			return;
		}
		@Pc(68) float local68 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(74) float local74 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat77 = this.aFloat74 = this.aFloat71 = this.aFloat79 = 0.0F;
		this.aFloat78 = arg5 + (local74 * 0.5F - local68 * 0.5F) * (float) (arg4 * 2);
		this.aFloat73 = (float) arg4 * 2.0F * local74;
		this.aFloat82 = (float) arg3 * 2.0F * local68;
		this.aFloat75 = (local74 * -0.5F - local68 * 0.5F) * (float) (arg3 * 2) + arg2;
		this.aFloat80 = (float) arg3 * -2.0F * local74;
		this.aFloat76 = 1.0F;
		this.aFloat81 = (float) arg4 * local68 * 2.0F;
		this.aFloat72 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FBFF)V")
	public void method2710(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat72 += arg2;
		this.aFloat75 += arg0;
		this.aFloat78 += arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFFI[F)V")
	public void method2711(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3) {
		arg3[2] = arg2 * this.aFloat77 + arg0 * this.aFloat74 + arg1 * this.aFloat76;
		arg3[1] = arg1 * this.aFloat79 + arg2 * this.aFloat73 + this.aFloat82 * arg0;
		arg3[0] = this.aFloat81 * arg2 + arg0 * this.aFloat80 + this.aFloat71 * arg1;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0) {
		this.aFloat81 = 1.0F;
		this.aFloat82 = this.aFloat76 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat74 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat80 = this.aFloat71 = this.aFloat78 = this.aFloat73 = this.aFloat75 = this.aFloat77 = this.aFloat72 = 0.0F;
		this.aFloat79 = -this.aFloat74;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method2712(@OriginalArg(0) Class6 arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) arg0;
		this.aFloat77 = local10.aFloat77;
		this.aFloat80 = local10.aFloat80;
		this.aFloat74 = local10.aFloat74;
		this.aFloat75 = 0.0F;
		this.aFloat79 = local10.aFloat79;
		this.aFloat71 = local10.aFloat71;
		this.aFloat76 = local10.aFloat76;
		this.aFloat82 = local10.aFloat82;
		this.aFloat73 = local10.aFloat73;
		this.aFloat81 = local10.aFloat81;
		this.aFloat78 = 0.0F;
		this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "()Lclient!kd;")
	@Override
	public Class6 method6709() {
		@Pc(7) Class6_Sub2 local7 = new Class6_Sub2();
		local7.aFloat76 = this.aFloat76;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat79 = this.aFloat79;
		return local7;
	}

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "(I)V")
	public void method2713() {
		this.aFloat74 = -this.aFloat74;
		this.aFloat82 = -this.aFloat82;
		this.aFloat73 = -this.aFloat73;
		this.aFloat75 = -this.aFloat75;
		this.aFloat79 = -this.aFloat79;
		this.aFloat77 = -this.aFloat77;
		this.aFloat72 = -this.aFloat72;
		this.aFloat76 = -this.aFloat76;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!kd;B)V")
	public void method2714(@OriginalArg(0) Class6 arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) arg0;
		this.aFloat80 = local10.aFloat73;
		this.aFloat71 = local10.aFloat77;
		this.aFloat81 = local10.aFloat81;
		this.aFloat79 = local10.aFloat74;
		this.aFloat82 = local10.aFloat82;
		this.aFloat77 = local10.aFloat71;
		this.aFloat73 = local10.aFloat80;
		this.aFloat74 = local10.aFloat79;
		this.aFloat78 = -(local10.aFloat72 * this.aFloat71 + local10.aFloat78 * this.aFloat81 + local10.aFloat75 * this.aFloat80);
		this.aFloat76 = local10.aFloat76;
		this.aFloat75 = -(local10.aFloat75 * this.aFloat82 + local10.aFloat78 * this.aFloat73 + local10.aFloat72 * this.aFloat79);
		this.aFloat72 = -(local10.aFloat75 * this.aFloat74 + this.aFloat77 * local10.aFloat78 + this.aFloat76 * local10.aFloat72);
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "([FI)[F")
	public float[] method2715(@OriginalArg(0) float[] arg0) {
		arg0[14] = this.aFloat72;
		arg0[0] = this.aFloat81;
		arg0[12] = this.aFloat78;
		arg0[10] = this.aFloat76;
		arg0[3] = 0.0F;
		arg0[9] = this.aFloat79;
		arg0[6] = this.aFloat74;
		arg0[4] = this.aFloat80;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[2] = this.aFloat77;
		arg0[1] = this.aFloat73;
		arg0[13] = this.aFloat75;
		arg0[5] = this.aFloat82;
		arg0[8] = this.aFloat71;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(FFFB)V")
	public void method2716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat77 *= arg2;
		this.aFloat75 *= arg1;
		this.aFloat82 *= arg1;
		this.aFloat71 *= arg0;
		this.aFloat76 *= arg2;
		this.aFloat81 *= arg0;
		this.aFloat74 *= arg2;
		this.aFloat72 *= arg2;
		this.aFloat80 *= arg0;
		this.aFloat78 *= arg0;
		this.aFloat79 *= arg1;
		this.aFloat73 *= arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFZF)V")
	public void method2717(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat77 = 0.0F;
		this.aFloat74 = 0.0F;
		this.aFloat78 = 0.0F;
		this.aFloat80 = 0.0F;
		this.aFloat72 = 0.0F;
		this.aFloat82 = arg2;
		this.aFloat75 = 0.0F;
		this.aFloat73 = 0.0F;
		this.aFloat76 = arg0;
		this.aFloat79 = 0.0F;
		this.aFloat71 = 0.0F;
		this.aFloat81 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IFFF)V")
	public void method2718(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat78 = arg0;
		this.aFloat72 = arg1;
		this.aFloat73 = this.aFloat77 = this.aFloat80 = this.aFloat74 = this.aFloat71 = this.aFloat79 = 0.0F;
		this.aFloat81 = this.aFloat82 = this.aFloat76 = 1.0F;
		this.aFloat75 = arg2;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "()V")
	@Override
	public void method6706() {
		this.aFloat81 = this.aFloat82 = this.aFloat76 = 1.0F;
		this.aFloat73 = this.aFloat77 = this.aFloat80 = this.aFloat74 = this.aFloat71 = this.aFloat79 = this.aFloat78 = this.aFloat75 = this.aFloat72 = 0.0F;
	}

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)V")
	@Override
	public void method6708(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat81;
		@Pc(21) float local21 = this.aFloat80;
		@Pc(24) float local24 = this.aFloat71;
		this.aFloat81 = local9 * local18 + local15 * this.aFloat77;
		@Pc(37) float local37 = this.aFloat78;
		this.aFloat77 = local9 * this.aFloat77 - local18 * local15;
		this.aFloat80 = this.aFloat74 * local15 + local9 * local21;
		this.aFloat74 = this.aFloat74 * local9 - local15 * local21;
		this.aFloat71 = local9 * local24 + local15 * this.aFloat76;
		this.aFloat76 = this.aFloat76 * local9 - local24 * local15;
		this.aFloat78 = this.aFloat72 * local15 + local37 * local9;
		this.aFloat72 = this.aFloat72 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "([FI)[F")
	public float[] method2720(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat75;
		arg0[12] = 0.0F;
		arg0[5] = this.aFloat82;
		arg0[13] = 0.0F;
		arg0[10] = this.aFloat72;
		arg0[0] = this.aFloat81;
		arg0[14] = 0.0F;
		arg0[4] = this.aFloat80;
		arg0[1] = this.aFloat73;
		arg0[7] = 0.0F;
		arg0[3] = 0.0F;
		arg0[2] = 0.0F;
		arg0[11] = 0.0F;
		arg0[6] = 0.0F;
		arg0[15] = 1.0F;
		arg0[8] = this.aFloat78;
		return arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FFIF)F")
	public float method2721(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat79 * arg1 + arg2 * this.aFloat82 + arg0 * this.aFloat73 + this.aFloat75;
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "([FI)[F")
	public float[] method2722(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat81;
		arg0[2] = this.aFloat71;
		arg0[7] = this.aFloat75;
		arg0[5] = this.aFloat82;
		arg0[6] = this.aFloat79;
		arg0[1] = this.aFloat80;
		arg0[4] = this.aFloat73;
		arg0[3] = this.aFloat78;
		return arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "([I)V")
	@Override
	public void method6712(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat78;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat75;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat72;
		arg0[2] = (int) (this.aFloat71 * local11 + local20 * this.aFloat79 + local28 * this.aFloat76);
		arg0[1] = (int) (this.aFloat80 * local11 + this.aFloat82 * local20 + this.aFloat74 * local28);
		arg0[0] = (int) (local28 * this.aFloat77 + this.aFloat73 * local20 + local11 * this.aFloat81);
	}

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V")
	@Override
	public void method6705(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat73;
		@Pc(21) float local21 = this.aFloat82;
		@Pc(24) float local24 = this.aFloat79;
		this.aFloat73 = local9 * local18 - local15 * this.aFloat77;
		@Pc(38) float local38 = this.aFloat75;
		this.aFloat77 = local15 * local18 + local9 * this.aFloat77;
		this.aFloat82 = local9 * local21 - local15 * this.aFloat74;
		this.aFloat74 = local9 * this.aFloat74 + local15 * local21;
		this.aFloat79 = local9 * local24 - this.aFloat76 * local15;
		this.aFloat76 = this.aFloat76 * local9 + local24 * local15;
		this.aFloat75 = local9 * local38 - local15 * this.aFloat72;
		this.aFloat72 = local38 * local15 + this.aFloat72 * local9;
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(FFIF)F")
	public float method2723(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat76 * arg1 + this.aFloat74 * arg2 + this.aFloat77 * arg0 + this.aFloat72;
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	@Override
	public void method6710(@OriginalArg(0) int arg0) {
		this.aFloat76 = 1.0F;
		this.aFloat81 = this.aFloat82 = Class2_Sub18.aFloatArray14[arg0 & 0x3FFF];
		this.aFloat73 = Class2_Sub18.aFloatArray13[arg0 & 0x3FFF];
		this.aFloat80 = -this.aFloat73;
		this.aFloat71 = this.aFloat78 = this.aFloat79 = this.aFloat75 = this.aFloat77 = this.aFloat74 = this.aFloat72 = 0.0F;
	}
}
