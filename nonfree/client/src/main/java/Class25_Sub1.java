import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "[Lclient!qf;")
	private static final Class283[] aClass283Array1 = new Class283[32];

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "F")
	public float aFloat11;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "F")
	public float aFloat12;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "F")
	public float aFloat13;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "F")
	public float aFloat14;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "F")
	public float aFloat15;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "F")
	public float aFloat16;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "F")
	public float aFloat17;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "F")
	public float aFloat18;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "F")
	public float aFloat21;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "F")
	public float aFloat22;

	static {
		@Pc(91) Class283[] local91 = Static263.method3677();
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			aClass283Array1[local91[local93].anInt6971] = local91[local93];
		}
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class25_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		this.aFloat20 = 1.0F;
		this.aFloat12 = this.aFloat19 = Class284.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat17 = Class284.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat15 = this.aFloat11 = this.aFloat14 = this.aFloat21 = this.aFloat16 = this.aFloat18 = this.aFloat22 = 0.0F;
		this.aFloat13 = -this.aFloat17;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class25 method5883() {
		@Pc(7) Class25_Sub1 local7 = new Class25_Sub1();
		local7.aFloat22 = this.aFloat22;
		local7.aFloat15 = this.aFloat15;
		local7.aFloat17 = this.aFloat17;
		local7.aFloat12 = this.aFloat12;
		local7.aFloat14 = this.aFloat14;
		local7.aFloat19 = this.aFloat19;
		local7.aFloat20 = this.aFloat20;
		local7.aFloat21 = this.aFloat21;
		local7.aFloat13 = this.aFloat13;
		local7.aFloat18 = this.aFloat18;
		local7.aFloat16 = this.aFloat16;
		local7.aFloat11 = this.aFloat11;
		return local7;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)[F")
	public float[] method376() {
		Static292.aFloatArray46[6] = this.aFloat18;
		Static292.aFloatArray46[13] = 0.0F;
		Static292.aFloatArray46[2] = this.aFloat13;
		Static292.aFloatArray46[14] = 0.0F;
		Static292.aFloatArray46[1] = this.aFloat14;
		Static292.aFloatArray46[9] = this.aFloat21;
		Static292.aFloatArray46[10] = this.aFloat19;
		Static292.aFloatArray46[0] = this.aFloat12;
		Static292.aFloatArray46[5] = this.aFloat20;
		Static292.aFloatArray46[8] = this.aFloat17;
		Static292.aFloatArray46[12] = 0.0F;
		Static292.aFloatArray46[4] = this.aFloat15;
		return Static292.aFloatArray46;
	}

	@OriginalMember(owner = "client!bb", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class284.aFloatArray63[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class284.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat12;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat17;
		this.aFloat12 = local18 * local9 + this.aFloat13 * local15;
		@Pc(37) float local37 = this.aFloat11;
		this.aFloat15 = local21 * local9 + local15 * this.aFloat18;
		this.aFloat13 = this.aFloat13 * local9 - local18 * local15;
		this.aFloat18 = this.aFloat18 * local9 - local21 * local15;
		this.aFloat17 = local15 * this.aFloat19 + local24 * local9;
		this.aFloat11 = local15 * this.aFloat22 + local9 * local37;
		this.aFloat19 = this.aFloat19 * local9 - local24 * local15;
		this.aFloat22 = local9 * this.aFloat22 - local37 * local15;
	}

	@OriginalMember(owner = "client!bb", name = "na", descriptor = "(IIIIII)V")
	@Override
	public void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class284.aFloatArray63[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class284.aFloatArray62[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class284.aFloatArray63[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class284.aFloatArray62[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class284.aFloatArray63[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class284.aFloatArray62[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat15 = local39 * local9;
		this.aFloat19 = local21 * local9;
		this.aFloat21 = local21 * local43 + local27 * local39;
		this.aFloat14 = local27 * local43 + -local21 * local39;
		this.aFloat20 = local33 * local9;
		this.aFloat17 = local47 * local21 + local33 * -local27;
		this.aFloat18 = -local15;
		this.aFloat13 = local27 * local9;
		this.aFloat12 = local27 * local47 + local21 * local33;
		this.aFloat16 = -((float) arg1 * this.aFloat20) + this.aFloat14 * (float) -arg0 - (float) arg2 * this.aFloat21;
		this.aFloat22 = -(this.aFloat19 * (float) arg2) + (float) -arg0 * this.aFloat13 - this.aFloat18 * (float) arg1;
		this.aFloat11 = -((float) arg2 * this.aFloat17) + (float) -arg0 * this.aFloat12 - (float) arg1 * this.aFloat15;
	}

	@OriginalMember(owner = "client!bb", name = "NA", descriptor = "(III)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat16 = arg1;
		this.aFloat11 = arg0;
		this.aFloat22 = arg2;
		this.aFloat12 = this.aFloat20 = this.aFloat19 = 1.0F;
		this.aFloat14 = this.aFloat13 = this.aFloat15 = this.aFloat18 = this.aFloat17 = this.aFloat21 = 0.0F;
	}

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "(III)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat16 += arg1;
		this.aFloat22 += arg2;
		this.aFloat11 += arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIIFFIF)V")
	public void method377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg4 == 0) {
			this.aFloat12 = arg0;
			this.aFloat20 = arg1;
			this.aFloat19 = 1.0F;
			this.aFloat14 = this.aFloat13 = this.aFloat15 = this.aFloat18 = this.aFloat17 = this.aFloat21 = 0.0F;
		} else {
			@Pc(19) float local19 = Class284.aFloatArray63[arg4 & 0x3FFF];
			@Pc(25) float local25 = Class284.aFloatArray62[arg4 & 0x3FFF];
			this.aFloat12 = local19 * (float) arg0;
			this.aFloat15 = -local25 * (float) arg1;
			this.aFloat13 = this.aFloat18 = this.aFloat17 = this.aFloat21 = 0.0F;
			this.aFloat20 = (float) arg1 * local19;
			this.aFloat14 = (float) arg0 * local25;
			this.aFloat19 = 1.0F;
		}
		this.aFloat11 = arg2;
		this.aFloat16 = arg5;
		this.aFloat22 = arg3;
	}

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat12 = this.aFloat20 = this.aFloat19 = 1.0F;
		this.aFloat14 = this.aFloat13 = this.aFloat15 = this.aFloat18 = this.aFloat17 = this.aFloat21 = this.aFloat11 = this.aFloat16 = this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "(I)V")
	@Override
	public void w(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class284.aFloatArray63[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class284.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat14;
		@Pc(21) float local21 = this.aFloat20;
		@Pc(24) float local24 = this.aFloat21;
		@Pc(27) float local27 = this.aFloat16;
		this.aFloat14 = local9 * local18 - local15 * this.aFloat13;
		this.aFloat20 = local9 * local21 - local15 * this.aFloat18;
		this.aFloat13 = this.aFloat13 * local9 + local18 * local15;
		this.aFloat18 = local21 * local15 + local9 * this.aFloat18;
		this.aFloat21 = local9 * local24 - local15 * this.aFloat19;
		this.aFloat19 = this.aFloat19 * local9 + local15 * local24;
		this.aFloat16 = local9 * local27 - local15 * this.aFloat22;
		this.aFloat22 = local15 * local27 + this.aFloat22 * local9;
	}

	@OriginalMember(owner = "client!bb", name = "YA", descriptor = "([I)V")
	@Override
	public void YA(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat11;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat16;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat22;
		arg0[2] = (int) (this.aFloat19 * local27 + local11 * this.aFloat17 + this.aFloat21 * local19);
		arg0[0] = (int) (local27 * this.aFloat13 + this.aFloat14 * local19 + local11 * this.aFloat12);
		arg0[1] = (int) (local27 * this.aFloat18 + this.aFloat20 * local19 + local11 * this.aFloat15);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public void method378() {
		this.aFloat14 = -this.aFloat14;
		this.aFloat20 = -this.aFloat20;
		this.aFloat16 = -this.aFloat16;
		this.aFloat19 = -this.aFloat19;
		this.aFloat21 = -this.aFloat21;
		this.aFloat18 = -this.aFloat18;
		this.aFloat22 = -this.aFloat22;
		this.aFloat13 = -this.aFloat13;
	}

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "(I)V")
	@Override
	public void J(@OriginalArg(0) int arg0) {
		this.aFloat19 = 1.0F;
		this.aFloat12 = this.aFloat20 = Class284.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat14 = Class284.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat17 = this.aFloat11 = this.aFloat21 = this.aFloat16 = this.aFloat13 = this.aFloat18 = this.aFloat22 = 0.0F;
		this.aFloat15 = -this.aFloat14;
	}

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "(Lclient!q;)V")
	@Override
	public void M(@OriginalArg(0) Class25 arg0) {
		@Pc(6) Class25_Sub1 local6 = (Class25_Sub1) arg0;
		this.aFloat17 = local6.aFloat17;
		this.aFloat11 = local6.aFloat11;
		this.aFloat20 = local6.aFloat20;
		this.aFloat16 = local6.aFloat16;
		this.aFloat19 = local6.aFloat19;
		this.aFloat18 = local6.aFloat18;
		this.aFloat14 = local6.aFloat14;
		this.aFloat22 = local6.aFloat22;
		this.aFloat15 = local6.aFloat15;
		this.aFloat13 = local6.aFloat13;
		this.aFloat12 = local6.aFloat12;
		this.aFloat21 = local6.aFloat21;
	}

	@OriginalMember(owner = "client!bb", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class284.aFloatArray63[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class284.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat12;
		@Pc(21) float local21 = this.aFloat15;
		@Pc(24) float local24 = this.aFloat17;
		@Pc(27) float local27 = this.aFloat11;
		this.aFloat12 = local18 * local9 - local15 * this.aFloat14;
		this.aFloat14 = this.aFloat14 * local9 + local18 * local15;
		this.aFloat15 = local21 * local9 - local15 * this.aFloat20;
		this.aFloat17 = local9 * local24 - this.aFloat21 * local15;
		this.aFloat20 = local21 * local15 + local9 * this.aFloat20;
		this.aFloat21 = local9 * this.aFloat21 + local15 * local24;
		this.aFloat11 = local27 * local9 - local15 * this.aFloat16;
		this.aFloat16 = local9 * this.aFloat16 + local15 * local27;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!q;I)V")
	public void method381(@OriginalArg(0) Class25 arg0) {
		@Pc(14) Class25_Sub1 local14 = (Class25_Sub1) arg0;
		this.aFloat15 = local14.aFloat14;
		this.aFloat17 = local14.aFloat13;
		this.aFloat12 = local14.aFloat12;
		this.aFloat14 = local14.aFloat15;
		this.aFloat20 = local14.aFloat20;
		this.aFloat13 = local14.aFloat17;
		this.aFloat21 = local14.aFloat18;
		this.aFloat11 = -(local14.aFloat16 * this.aFloat15 + local14.aFloat11 * this.aFloat12 + this.aFloat17 * local14.aFloat22);
		this.aFloat19 = local14.aFloat19;
		this.aFloat18 = local14.aFloat21;
		this.aFloat16 = -(this.aFloat21 * local14.aFloat22 + local14.aFloat11 * this.aFloat14 + this.aFloat20 * local14.aFloat16);
		this.aFloat22 = -(this.aFloat19 * local14.aFloat22 + local14.aFloat16 * this.aFloat18 + local14.aFloat11 * this.aFloat13);
	}

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "(III[I)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg1 - this.aFloat16);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat11);
		@Pc(24) int local24 = (int) ((float) arg2 - this.aFloat22);
		arg3[0] = (int) ((float) local6 * this.aFloat14 + (float) local17 * this.aFloat12 + (float) local24 * this.aFloat13);
		arg3[1] = (int) (this.aFloat18 * (float) local24 + (float) local6 * this.aFloat20 + (float) local17 * this.aFloat15);
		arg3[2] = (int) (this.aFloat21 * (float) local6 + (float) local17 * this.aFloat17 + (float) local24 * this.aFloat19);
	}

	@OriginalMember(owner = "client!bb", name = "wa", descriptor = "(III[I)V")
	@Override
	public void wa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg0 * this.aFloat13 + (float) arg1 * this.aFloat18 + this.aFloat19 * (float) arg2);
		arg3[0] = (int) (this.aFloat15 * (float) arg1 + (float) arg0 * this.aFloat12 + this.aFloat17 * (float) arg2);
		arg3[1] = (int) (this.aFloat14 * (float) arg0 + this.aFloat20 * (float) arg1 + (float) arg2 * this.aFloat21);
	}

	@OriginalMember(owner = "client!bb", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aFloat12 = 1.0F;
		this.aFloat20 = this.aFloat19 = Class284.aFloatArray63[arg0 & 0x3FFF];
		this.aFloat18 = Class284.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat21 = -this.aFloat18;
		this.aFloat15 = this.aFloat17 = this.aFloat11 = this.aFloat14 = this.aFloat16 = this.aFloat13 = this.aFloat22 = 0.0F;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat19 * (float) arg2 + (float) arg0 * this.aFloat13 + this.aFloat18 * (float) arg1 + this.aFloat22);
		arg3[0] = (int) (this.aFloat11 + this.aFloat12 * (float) arg0 + (float) arg1 * this.aFloat15 + (float) arg2 * this.aFloat17);
		arg3[1] = (int) (this.aFloat16 + (float) arg0 * this.aFloat14 + (float) arg1 * this.aFloat20 + (float) arg2 * this.aFloat21);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)[F")
	public float[] method383() {
		Static292.aFloatArray46[13] = this.aFloat16;
		Static292.aFloatArray46[14] = this.aFloat22;
		Static292.aFloatArray46[2] = this.aFloat13;
		Static292.aFloatArray46[6] = this.aFloat18;
		Static292.aFloatArray46[0] = this.aFloat12;
		Static292.aFloatArray46[8] = this.aFloat17;
		Static292.aFloatArray46[5] = this.aFloat20;
		Static292.aFloatArray46[10] = this.aFloat19;
		Static292.aFloatArray46[4] = this.aFloat15;
		Static292.aFloatArray46[1] = this.aFloat14;
		Static292.aFloatArray46[12] = this.aFloat11;
		Static292.aFloatArray46[9] = this.aFloat21;
		return Static292.aFloatArray46;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(FFF[FFB)V")
	public void method384(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4) {
		arg3[0] = this.aFloat17 * arg1 + this.aFloat15 * arg2 + arg4 * this.aFloat12;
		arg3[2] = this.aFloat13 * arg4 + this.aFloat18 * arg2 + this.aFloat19 * arg1;
		@Pc(80) float local80;
		@Pc(88) float local88;
		@Pc(96) float local96;
		@Pc(72) float local72;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local72 = -arg0 / arg4;
			local96 = this.aFloat13 * local72 + this.aFloat22;
			local88 = this.aFloat16 + local72 * this.aFloat14;
			local80 = this.aFloat11 + this.aFloat12 * local72;
		} else if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local72 = -arg0 / arg2;
			local88 = this.aFloat16 + this.aFloat20 * local72;
			local80 = local72 * this.aFloat15 + this.aFloat11;
			local96 = local72 * this.aFloat18 + this.aFloat22;
		} else {
			local72 = -arg0 / arg1;
			local80 = this.aFloat11 + local72 * this.aFloat17;
			local88 = this.aFloat21 * local72 + this.aFloat16;
			local96 = local72 * this.aFloat19 + this.aFloat22;
		}
		arg3[1] = arg4 * this.aFloat14 + arg2 * this.aFloat20 + this.aFloat21 * arg1;
		arg3[3] = -(arg3[1] * local88 + arg3[0] * local80 + arg3[2] * local96);
	}
}
