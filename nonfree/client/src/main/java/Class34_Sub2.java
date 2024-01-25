import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "F")
	public float aFloat23;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.v();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)[F")
	public float[] method1908() {
		Static152.aFloatArray6[4] = this.aFloat18;
		Static152.aFloatArray6[13] = this.aFloat20;
		Static152.aFloatArray6[12] = this.aFloat15;
		Static152.aFloatArray6[5] = this.aFloat21;
		Static152.aFloatArray6[6] = this.aFloat16;
		Static152.aFloatArray6[9] = this.aFloat25;
		Static152.aFloatArray6[14] = this.aFloat26;
		Static152.aFloatArray6[2] = this.aFloat22;
		Static152.aFloatArray6[8] = this.aFloat24;
		Static152.aFloatArray6[10] = this.aFloat19;
		Static152.aFloatArray6[0] = this.aFloat17;
		Static152.aFloatArray6[1] = this.aFloat23;
		return Static152.aFloatArray6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat15 + this.aFloat18 * (float) arg1 + (float) arg0 * this.aFloat17 + (float) arg2 * this.aFloat24);
		arg3[1] = (int) (this.aFloat20 + (float) arg2 * this.aFloat25 + (float) arg0 * this.aFloat23 + (float) arg1 * this.aFloat21);
		arg3[2] = (int) (this.aFloat16 * (float) arg1 + (float) arg0 * this.aFloat22 + (float) arg2 * this.aFloat19 + this.aFloat26);
	}

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "(III[I)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat21 + this.aFloat23 * (float) arg0 + this.aFloat25 * (float) arg2);
		arg3[0] = (int) (this.aFloat24 * (float) arg2 + (float) arg0 * this.aFloat17 + this.aFloat18 * (float) arg1);
		arg3[2] = (int) ((float) arg2 * this.aFloat19 + (float) arg1 * this.aFloat16 + (float) arg0 * this.aFloat22);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class34 method4361() {
		@Pc(7) Class34_Sub2 local7 = new Class34_Sub2();
		local7.aFloat15 = this.aFloat15;
		local7.aFloat26 = this.aFloat26;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat24 = this.aFloat24;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat22 = this.aFloat22;
		local7.aFloat25 = this.aFloat25;
		local7.aFloat23 = this.aFloat23;
		local7.aFloat19 = this.aFloat19;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat17 = this.aFloat17;
		return local7;
	}

	@OriginalMember(owner = "client!hf", name = "ca", descriptor = "(I)V")
	@Override
	public void ca(@OriginalArg(0) int arg0) {
		this.aFloat21 = 1.0F;
		this.aFloat17 = this.aFloat19 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat24 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat18 = this.aFloat15 = this.aFloat23 = this.aFloat25 = this.aFloat20 = this.aFloat16 = this.aFloat26 = 0.0F;
		this.aFloat22 = -this.aFloat24;
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aFloat17 = 1.0F;
		this.aFloat21 = this.aFloat19 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat16 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat18 = this.aFloat24 = this.aFloat15 = this.aFloat23 = this.aFloat20 = this.aFloat22 = this.aFloat26 = 0.0F;
		this.aFloat25 = -this.aFloat16;
	}

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "()V")
	@Override
	public void v() {
		this.aFloat23 = this.aFloat22 = this.aFloat18 = this.aFloat16 = this.aFloat24 = this.aFloat25 = this.aFloat15 = this.aFloat20 = this.aFloat26 = 0.0F;
		this.aFloat17 = this.aFloat21 = this.aFloat19 = 1.0F;
	}

	@OriginalMember(owner = "client!hf", name = "EA", descriptor = "(I)V")
	@Override
	public void EA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat17;
		@Pc(21) float local21 = this.aFloat18;
		@Pc(24) float local24 = this.aFloat24;
		this.aFloat17 = this.aFloat22 * local15 + local18 * local9;
		@Pc(37) float local37 = this.aFloat15;
		this.aFloat18 = this.aFloat16 * local15 + local9 * local21;
		this.aFloat22 = local9 * this.aFloat22 - local18 * local15;
		this.aFloat16 = this.aFloat16 * local9 - local15 * local21;
		this.aFloat24 = this.aFloat19 * local15 + local24 * local9;
		this.aFloat19 = this.aFloat19 * local9 - local15 * local24;
		this.aFloat15 = this.aFloat26 * local15 + local9 * local37;
		this.aFloat26 = local9 * this.aFloat26 - local37 * local15;
	}

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aFloat19 = 1.0F;
		this.aFloat17 = this.aFloat21 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg0 & 0x3FFF];
		this.aFloat23 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg0 & 0x3FFF];
		this.aFloat24 = this.aFloat15 = this.aFloat25 = this.aFloat20 = this.aFloat22 = this.aFloat16 = this.aFloat26 = 0.0F;
		this.aFloat18 = -this.aFloat23;
	}

	@OriginalMember(owner = "client!hf", name = "YA", descriptor = "(IIIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat18 = local39 * local9;
		this.aFloat21 = local9 * local33;
		this.aFloat23 = local43 * local27 + -local21 * local39;
		this.aFloat19 = local21 * local9;
		this.aFloat16 = -local15;
		this.aFloat17 = local47 * local27 + local33 * local21;
		this.aFloat24 = local21 * local47 + -local27 * local33;
		this.aFloat25 = local39 * local27 + local43 * local21;
		this.aFloat22 = local27 * local9;
		this.aFloat20 = this.aFloat23 * (float) -arg0 - (float) arg1 * this.aFloat21 - (float) arg2 * this.aFloat25;
		this.aFloat26 = (float) -arg0 * this.aFloat22 - this.aFloat16 * (float) arg1 - this.aFloat19 * (float) arg2;
		this.aFloat15 = -((float) arg2 * this.aFloat24) - this.aFloat18 * (float) arg1 + this.aFloat17 * (float) -arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)[F")
	public float[] method1911() {
		Static152.aFloatArray6[14] = 0.0F;
		Static152.aFloatArray6[6] = this.aFloat16;
		Static152.aFloatArray6[2] = this.aFloat22;
		Static152.aFloatArray6[10] = this.aFloat19;
		Static152.aFloatArray6[13] = 0.0F;
		Static152.aFloatArray6[9] = this.aFloat25;
		Static152.aFloatArray6[4] = this.aFloat18;
		Static152.aFloatArray6[5] = this.aFloat21;
		Static152.aFloatArray6[8] = this.aFloat24;
		Static152.aFloatArray6[1] = this.aFloat23;
		Static152.aFloatArray6[0] = this.aFloat17;
		Static152.aFloatArray6[12] = 0;
		return Static152.aFloatArray6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIFFIIF)V")
	public void method1912(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat21 = arg0;
			this.aFloat23 = this.aFloat22 = this.aFloat18 = this.aFloat16 = this.aFloat24 = this.aFloat25 = 0.0F;
			this.aFloat19 = 1.0F;
			this.aFloat17 = arg4;
		} else {
			@Pc(10) float local10 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg3 & 0x3FFF];
			@Pc(16) float local16 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg3 & 0x3FFF];
			this.aFloat18 = -local16 * (float) arg0;
			this.aFloat23 = (float) arg4 * local16;
			this.aFloat19 = 1.0F;
			this.aFloat21 = local10 * (float) arg0;
			this.aFloat17 = local10 * (float) arg4;
			this.aFloat22 = this.aFloat16 = this.aFloat24 = this.aFloat25 = 0.0F;
		}
		this.aFloat20 = arg1;
		this.aFloat15 = arg5;
		this.aFloat26 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "ea", descriptor = "(I)V")
	@Override
	public void ea(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class1_Sub3_Sub5_Sub1.aFloatArray18[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class1_Sub3_Sub5_Sub1.aFloatArray19[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat23;
		@Pc(21) float local21 = this.aFloat21;
		@Pc(24) float local24 = this.aFloat25;
		@Pc(27) float local27 = this.aFloat20;
		this.aFloat23 = local18 * local9 - local15 * this.aFloat22;
		this.aFloat22 = this.aFloat22 * local9 + local18 * local15;
		this.aFloat21 = local21 * local9 - this.aFloat16 * local15;
		this.aFloat16 = this.aFloat16 * local9 + local21 * local15;
		this.aFloat25 = local9 * local24 - this.aFloat19 * local15;
		this.aFloat19 = local9 * this.aFloat19 + local15 * local24;
		this.aFloat20 = local9 * local27 - local15 * this.aFloat26;
		this.aFloat26 = local15 * local27 + local9 * this.aFloat26;
	}

	@OriginalMember(owner = "client!hf", name = "ha", descriptor = "(Lclient!c;)V")
	@Override
	public void ha(@OriginalArg(0) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat20 = local6.aFloat20;
		this.aFloat26 = local6.aFloat26;
		this.aFloat24 = local6.aFloat24;
		this.aFloat15 = local6.aFloat15;
		this.aFloat25 = local6.aFloat25;
		this.aFloat18 = local6.aFloat18;
		this.aFloat16 = local6.aFloat16;
		this.aFloat19 = local6.aFloat19;
		this.aFloat23 = local6.aFloat23;
		this.aFloat17 = local6.aFloat17;
		this.aFloat21 = local6.aFloat21;
		this.aFloat22 = local6.aFloat22;
	}

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "(III)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat26 += arg2;
		this.aFloat20 += arg1;
		this.aFloat15 += arg0;
	}

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat20 = arg1;
		this.aFloat15 = arg0;
		this.aFloat17 = this.aFloat21 = this.aFloat19 = 1.0F;
		this.aFloat23 = this.aFloat22 = this.aFloat18 = this.aFloat16 = this.aFloat24 = this.aFloat25 = 0.0F;
		this.aFloat26 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "wa", descriptor = "([I)V")
	@Override
	public void wa(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat15;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat20;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat26;
		arg0[1] = (int) (this.aFloat16 * local27 + this.aFloat18 * local11 + this.aFloat21 * local19);
		arg0[0] = (int) (local19 * this.aFloat23 + this.aFloat17 * local11 + local27 * this.aFloat22);
		arg0[2] = (int) (local19 * this.aFloat25 + this.aFloat24 * local11 + this.aFloat19 * local27);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!c;)V")
	public void method1916(@OriginalArg(1) Class34 arg0) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg0;
		this.aFloat24 = local6.aFloat22;
		this.aFloat18 = local6.aFloat23;
		this.aFloat17 = local6.aFloat17;
		this.aFloat22 = local6.aFloat24;
		this.aFloat23 = local6.aFloat18;
		this.aFloat25 = local6.aFloat16;
		this.aFloat21 = local6.aFloat21;
		this.aFloat15 = -(local6.aFloat20 * this.aFloat18 + local6.aFloat15 * this.aFloat17 + this.aFloat24 * local6.aFloat26);
		this.aFloat19 = local6.aFloat19;
		this.aFloat16 = local6.aFloat25;
		this.aFloat20 = -(this.aFloat25 * local6.aFloat26 + this.aFloat21 * local6.aFloat20 + local6.aFloat15 * this.aFloat23);
		this.aFloat26 = -(this.aFloat19 * local6.aFloat26 + local6.aFloat20 * this.aFloat16 + local6.aFloat15 * this.aFloat22);
	}
}
