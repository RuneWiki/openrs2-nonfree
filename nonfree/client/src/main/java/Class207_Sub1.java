import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class207_Sub1 extends Class207 {

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!lha", name = "t", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!lha", name = "x", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!lha", name = "B", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!lha", name = "C", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!lha", name = "D", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!lha", name = "L", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!lha", name = "M", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!lha", name = "Q", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!lha", name = "S", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!lha", name = "T", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class207_Sub1() {
		this.method8204();
	}

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "(I)V")
	@Override
	public void method8213(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class28.aFloatArray1[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class28.aFloatArray2[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat67;
		@Pc(24) float local24 = this.aFloat68;
		this.aFloat59 = local9 * local18 + local15 * this.aFloat58;
		@Pc(37) float local37 = this.aFloat61;
		this.aFloat67 = local15 * this.aFloat65 + local9 * local21;
		this.aFloat58 = this.aFloat58 * local9 - local15 * local18;
		this.aFloat68 = local9 * local24 + this.aFloat62 * local15;
		this.aFloat65 = local9 * this.aFloat65 - local15 * local21;
		this.aFloat62 = local9 * this.aFloat62 - local15 * local24;
		this.aFloat61 = local37 * local9 + this.aFloat66 * local15;
		this.aFloat66 = this.aFloat66 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "(I)[F")
	public float[] method4994() {
		Static311.aFloatArray15[14] = this.aFloat66;
		Static311.aFloatArray15[12] = this.aFloat61;
		Static311.aFloatArray15[9] = this.aFloat63;
		Static311.aFloatArray15[4] = this.aFloat67;
		Static311.aFloatArray15[2] = this.aFloat58;
		Static311.aFloatArray15[8] = this.aFloat68;
		Static311.aFloatArray15[13] = this.aFloat64;
		Static311.aFloatArray15[5] = this.aFloat69;
		Static311.aFloatArray15[6] = this.aFloat65;
		Static311.aFloatArray15[1] = this.aFloat60;
		Static311.aFloatArray15[10] = this.aFloat62;
		Static311.aFloatArray15[0] = this.aFloat59;
		return Static311.aFloatArray15;
	}

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "(I)V")
	public void method4996() {
		this.aFloat69 = -this.aFloat69;
		this.aFloat58 = -this.aFloat58;
		this.aFloat63 = -this.aFloat63;
		this.aFloat60 = -this.aFloat60;
		this.aFloat66 = -this.aFloat66;
		this.aFloat65 = -this.aFloat65;
		this.aFloat62 = -this.aFloat62;
		this.aFloat64 = -this.aFloat64;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8211(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub1 local6 = (Class207_Sub1) arg0;
		this.aFloat60 = local6.aFloat60;
		this.aFloat61 = local6.aFloat61;
		this.aFloat59 = local6.aFloat59;
		this.aFloat67 = local6.aFloat67;
		this.aFloat65 = local6.aFloat65;
		this.aFloat58 = local6.aFloat58;
		this.aFloat66 = local6.aFloat66;
		this.aFloat63 = local6.aFloat63;
		this.aFloat69 = local6.aFloat69;
		this.aFloat64 = local6.aFloat64;
		this.aFloat62 = local6.aFloat62;
		this.aFloat68 = local6.aFloat68;
	}

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "(I)V")
	@Override
	public void method8207(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class28.aFloatArray1[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class28.aFloatArray2[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat59;
		@Pc(21) float local21 = this.aFloat67;
		@Pc(24) float local24 = this.aFloat68;
		@Pc(27) float local27 = this.aFloat61;
		this.aFloat59 = local18 * local9 - local15 * this.aFloat60;
		this.aFloat67 = local9 * local21 - this.aFloat69 * local15;
		this.aFloat60 = local9 * this.aFloat60 + local15 * local18;
		this.aFloat69 = local15 * local21 + this.aFloat69 * local9;
		this.aFloat68 = local24 * local9 - this.aFloat63 * local15;
		this.aFloat63 = local15 * local24 + this.aFloat63 * local9;
		this.aFloat61 = local27 * local9 - local15 * this.aFloat64;
		this.aFloat64 = this.aFloat64 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class28.aFloatArray1[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class28.aFloatArray2[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class28.aFloatArray1[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class28.aFloatArray2[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class28.aFloatArray1[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class28.aFloatArray2[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat69 = local33 * local9;
		this.aFloat67 = local39 * local9;
		this.aFloat62 = local9 * local21;
		this.aFloat63 = local21 * local43 + local39 * local27;
		this.aFloat59 = local21 * local33 + local27 * local47;
		this.aFloat65 = -local15;
		this.aFloat58 = local27 * local9;
		this.aFloat68 = local33 * -local27 + local47 * local21;
		this.aFloat60 = local39 * -local21 + local43 * local27;
		this.aFloat64 = (float) -arg0 * this.aFloat60 - this.aFloat69 * (float) arg1 - (float) arg2 * this.aFloat63;
		this.aFloat61 = (float) -arg0 * this.aFloat59 - this.aFloat67 * (float) arg1 - this.aFloat68 * (float) arg2;
		this.aFloat66 = (float) -arg0 * this.aFloat58 - this.aFloat65 * (float) arg1 - this.aFloat62 * (float) arg2;
	}

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "(III[I)V")
	@Override
	public void method8210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat61);
		@Pc(17) int local17 = (int) ((float) arg2 - this.aFloat66);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat64);
		arg3[2] = (int) ((float) local24 * this.aFloat63 + (float) local6 * this.aFloat68 + (float) local17 * this.aFloat62);
		arg3[0] = (int) ((float) local24 * this.aFloat60 + (float) local6 * this.aFloat59 + (float) local17 * this.aFloat58);
		arg3[1] = (int) (this.aFloat65 * (float) local17 + (float) local6 * this.aFloat67 + (float) local24 * this.aFloat69);
	}

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "(I)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0) {
		this.aFloat62 = 1.0F;
		this.aFloat59 = this.aFloat69 = Class28.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat60 = Class28.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat67 = -this.aFloat60;
		this.aFloat68 = this.aFloat61 = this.aFloat63 = this.aFloat64 = this.aFloat58 = this.aFloat65 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
	@Override
	public void method8202(@OriginalArg(0) int arg0) {
		this.aFloat59 = 1.0F;
		this.aFloat69 = this.aFloat62 = Class28.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat65 = Class28.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat63 = -this.aFloat65;
		this.aFloat67 = this.aFloat68 = this.aFloat61 = this.aFloat60 = this.aFloat64 = this.aFloat58 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(III)V")
	@Override
	public void method8212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat64 = (float) arg1;
		this.aFloat66 = (float) arg2;
		this.aFloat60 = this.aFloat58 = this.aFloat67 = this.aFloat65 = this.aFloat68 = this.aFloat63 = 0.0F;
		this.aFloat61 = (float) arg0;
		this.aFloat59 = this.aFloat69 = this.aFloat62 = 1.0F;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "([I)V")
	@Override
	public void method8196(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat61;
		@Pc(21) float local21 = (float) arg0[1] - this.aFloat64;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat66;
		arg0[1] = (int) (local12 * this.aFloat67 + local21 * this.aFloat69 + local29 * this.aFloat65);
		arg0[2] = (int) (this.aFloat68 * local12 + this.aFloat63 * local21 + this.aFloat62 * local29);
		arg0[0] = (int) (local21 * this.aFloat60 + this.aFloat59 * local12 + local29 * this.aFloat58);
	}

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "(I)V")
	@Override
	public void method8214(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class28.aFloatArray1[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class28.aFloatArray2[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat60;
		@Pc(21) float local21 = this.aFloat69;
		@Pc(24) float local24 = this.aFloat63;
		@Pc(27) float local27 = this.aFloat64;
		this.aFloat60 = local9 * local18 - local15 * this.aFloat58;
		this.aFloat69 = local21 * local9 - local15 * this.aFloat65;
		this.aFloat58 = local15 * local18 + local9 * this.aFloat58;
		this.aFloat65 = local9 * this.aFloat65 + local15 * local21;
		this.aFloat63 = local24 * local9 - local15 * this.aFloat62;
		this.aFloat62 = local24 * local15 + this.aFloat62 * local9;
		this.aFloat64 = local27 * local9 - this.aFloat66 * local15;
		this.aFloat66 = this.aFloat66 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(III[I)V")
	@Override
	public void method8205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat62 + (float) arg1 * this.aFloat65 + this.aFloat58 * (float) arg0);
		arg3[0] = (int) ((float) arg0 * this.aFloat59 + (float) arg1 * this.aFloat67 + (float) arg2 * this.aFloat68);
		arg3[1] = (int) (this.aFloat63 * (float) arg2 + this.aFloat60 * (float) arg0 + (float) arg1 * this.aFloat69);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "()Lclient!oo;")
	@Override
	public Class207 method8199() {
		@Pc(7) Class207_Sub1 local7 = new Class207_Sub1();
		local7.aFloat60 = this.aFloat60;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat62 = this.aFloat62;
		local7.aFloat61 = this.aFloat61;
		local7.aFloat63 = this.aFloat63;
		local7.aFloat69 = this.aFloat69;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat58 = this.aFloat58;
		local7.aFloat65 = this.aFloat65;
		local7.aFloat59 = this.aFloat59;
		local7.aFloat64 = this.aFloat64;
		local7.aFloat67 = this.aFloat67;
		return local7;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "()V")
	@Override
	public void method8204() {
		this.aFloat59 = this.aFloat69 = this.aFloat62 = 1.0F;
		this.aFloat60 = this.aFloat58 = this.aFloat67 = this.aFloat65 = this.aFloat68 = this.aFloat63 = this.aFloat61 = this.aFloat64 = this.aFloat66 = 0.0F;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)[F")
	public float[] method4999() {
		Static311.aFloatArray15[1] = this.aFloat60;
		Static311.aFloatArray15[0] = this.aFloat59;
		Static311.aFloatArray15[9] = this.aFloat63;
		Static311.aFloatArray15[6] = this.aFloat65;
		Static311.aFloatArray15[12] = 0.0F;
		Static311.aFloatArray15[14] = 0.0F;
		Static311.aFloatArray15[13] = 0.0F;
		Static311.aFloatArray15[8] = this.aFloat68;
		Static311.aFloatArray15[5] = this.aFloat69;
		Static311.aFloatArray15[10] = this.aFloat62;
		Static311.aFloatArray15[4] = this.aFloat67;
		Static311.aFloatArray15[2] = this.aFloat58;
		return Static311.aFloatArray15;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat63 + (float) arg1 * this.aFloat69 + (float) arg0 * this.aFloat60 + this.aFloat64);
		arg3[2] = (int) (this.aFloat65 * (float) arg1 + this.aFloat58 * (float) arg0 + this.aFloat62 * (float) arg2 + this.aFloat66);
		arg3[0] = (int) (this.aFloat59 * (float) arg0 + this.aFloat67 * (float) arg1 + this.aFloat68 * (float) arg2 + this.aFloat61);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(III)V")
	@Override
	public void method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat66 += (float) arg2;
		this.aFloat64 += (float) arg1;
		this.aFloat61 += (float) arg0;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(FFFF[FB)V")
	public void method5002(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4) {
		@Pc(48) float local48;
		@Pc(40) float local40;
		@Pc(56) float local56;
		@Pc(32) float local32;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local32 = -arg0 / arg2;
			local40 = this.aFloat64 + this.aFloat60 * local32;
			local48 = local32 * this.aFloat59 + this.aFloat61;
			local56 = this.aFloat58 * local32 + this.aFloat66;
		} else if (arg3 > 0.00390625F || arg3 < -0.00390625F) {
			local32 = -arg0 / arg3;
			local40 = this.aFloat69 * local32 + this.aFloat64;
			local56 = local32 * this.aFloat65 + this.aFloat66;
			local48 = this.aFloat67 * local32 + this.aFloat61;
		} else {
			local32 = -arg0 / arg1;
			local40 = this.aFloat64 + local32 * this.aFloat63;
			local48 = this.aFloat68 * local32 + this.aFloat61;
			local56 = this.aFloat66 + this.aFloat62 * local32;
		}
		arg4[2] = this.aFloat58 * arg2 + this.aFloat65 * arg3 + this.aFloat62 * arg1;
		arg4[0] = this.aFloat68 * arg1 + arg2 * this.aFloat59 + this.aFloat67 * arg3;
		arg4[1] = arg1 * this.aFloat63 + arg2 * this.aFloat60 + this.aFloat69 * arg3;
		arg4[3] = -(arg4[1] * local40 + arg4[0] * local48 + local56 * arg4[2]);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!oo;Z)V")
	public void method5003(@OriginalArg(0) Class207 arg0) {
		@Pc(6) Class207_Sub1 local6 = (Class207_Sub1) arg0;
		this.aFloat68 = local6.aFloat58;
		this.aFloat59 = local6.aFloat59;
		this.aFloat67 = local6.aFloat60;
		this.aFloat69 = local6.aFloat69;
		this.aFloat58 = local6.aFloat68;
		this.aFloat60 = local6.aFloat67;
		this.aFloat63 = local6.aFloat65;
		this.aFloat62 = local6.aFloat62;
		this.aFloat61 = -(this.aFloat68 * local6.aFloat66 + local6.aFloat64 * this.aFloat67 + this.aFloat59 * local6.aFloat61);
		this.aFloat65 = local6.aFloat63;
		this.aFloat64 = -(local6.aFloat61 * this.aFloat60 + local6.aFloat64 * this.aFloat69 + this.aFloat63 * local6.aFloat66);
		this.aFloat66 = -(this.aFloat62 * local6.aFloat66 + local6.aFloat64 * this.aFloat65 + local6.aFloat61 * this.aFloat58);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0) {
		this.aFloat69 = 1.0F;
		this.aFloat59 = this.aFloat62 = Class28.aFloatArray1[arg0 & 0x3FFF];
		this.aFloat68 = Class28.aFloatArray2[arg0 & 0x3FFF];
		this.aFloat67 = this.aFloat61 = this.aFloat60 = this.aFloat63 = this.aFloat64 = this.aFloat65 = this.aFloat66 = 0.0F;
		this.aFloat58 = -this.aFloat68;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(FIIIIFF)V")
	public void method5005(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat62 = 1.0F;
			this.aFloat59 = (float) arg2;
			this.aFloat60 = this.aFloat58 = this.aFloat67 = this.aFloat65 = this.aFloat68 = this.aFloat63 = 0.0F;
			this.aFloat69 = (float) arg1;
		} else {
			@Pc(43) float local43 = Class28.aFloatArray1[arg3 & 0x3FFF];
			@Pc(49) float local49 = Class28.aFloatArray2[arg3 & 0x3FFF];
			this.aFloat59 = (float) arg2 * local43;
			this.aFloat67 = (float) arg1 * -local49;
			this.aFloat69 = local43 * (float) arg1;
			this.aFloat58 = this.aFloat65 = this.aFloat68 = this.aFloat63 = 0.0F;
			this.aFloat60 = local49 * (float) arg2;
			this.aFloat62 = 1.0F;
		}
		this.aFloat61 = arg4;
		this.aFloat64 = arg0;
		this.aFloat66 = arg5;
	}
}
