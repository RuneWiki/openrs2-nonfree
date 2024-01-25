import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class134_Sub2 extends Class134 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "F")
	public float aFloat80;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!hda", name = "D", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!hda", name = "J", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!hda", name = "K", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!hda", name = "N", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
	public Class134_Sub2() {
		this.Y();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)[F")
	public float[] method3449() {
		Static271.aFloatArray36[0] = this.aFloat85;
		Static271.aFloatArray36[9] = this.aFloat81;
		Static271.aFloatArray36[14] = this.aFloat83;
		Static271.aFloatArray36[10] = this.aFloat87;
		Static271.aFloatArray36[4] = this.aFloat86;
		Static271.aFloatArray36[1] = this.aFloat89;
		Static271.aFloatArray36[12] = this.aFloat84;
		Static271.aFloatArray36[2] = this.aFloat78;
		Static271.aFloatArray36[5] = this.aFloat88;
		Static271.aFloatArray36[8] = this.aFloat80;
		Static271.aFloatArray36[13] = this.aFloat82;
		Static271.aFloatArray36[6] = this.aFloat79;
		return Static271.aFloatArray36;
	}

	@OriginalMember(owner = "client!hda", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class134 arg0) {
		@Pc(6) Class134_Sub2 local6 = (Class134_Sub2) arg0;
		this.aFloat82 = local6.aFloat82;
		this.aFloat84 = local6.aFloat84;
		this.aFloat87 = local6.aFloat87;
		this.aFloat78 = local6.aFloat78;
		this.aFloat80 = local6.aFloat80;
		this.aFloat85 = local6.aFloat85;
		this.aFloat86 = local6.aFloat86;
		this.aFloat88 = local6.aFloat88;
		this.aFloat89 = local6.aFloat89;
		this.aFloat79 = local6.aFloat79;
		this.aFloat81 = local6.aFloat81;
		this.aFloat83 = local6.aFloat83;
	}

	@OriginalMember(owner = "client!hda", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class310.aFloatArray61[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class310.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat89;
		@Pc(21) float local21 = this.aFloat88;
		@Pc(24) float local24 = this.aFloat81;
		@Pc(27) float local27 = this.aFloat82;
		this.aFloat89 = local9 * local18 - this.aFloat78 * local15;
		this.aFloat88 = local9 * local21 - this.aFloat79 * local15;
		this.aFloat78 = local9 * this.aFloat78 + local18 * local15;
		this.aFloat81 = local9 * local24 - this.aFloat87 * local15;
		this.aFloat79 = local15 * local21 + this.aFloat79 * local9;
		this.aFloat82 = local27 * local9 - this.aFloat83 * local15;
		this.aFloat87 = local9 * this.aFloat87 + local15 * local24;
		this.aFloat83 = this.aFloat83 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!hda", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat84;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat82;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat83;
		arg0[0] = (int) (this.aFloat78 * local29 + this.aFloat89 * local20 + local12 * this.aFloat85);
		arg0[2] = (int) (this.aFloat87 * local29 + local20 * this.aFloat81 + this.aFloat80 * local12);
		arg0[1] = (int) (this.aFloat88 * local20 + local12 * this.aFloat86 + this.aFloat79 * local29);
	}

	@OriginalMember(owner = "client!hda", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat85 = 1.0F;
		this.aFloat88 = this.aFloat87 = Class310.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat79 = Class310.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat86 = this.aFloat80 = this.aFloat84 = this.aFloat89 = this.aFloat82 = this.aFloat78 = this.aFloat83 = 0.0F;
		this.aFloat81 = -this.aFloat79;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIFFFI)V")
	public void method3450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 0) {
			this.aFloat87 = 1.0F;
			this.aFloat88 = arg0;
			this.aFloat89 = this.aFloat78 = this.aFloat86 = this.aFloat79 = this.aFloat80 = this.aFloat81 = 0.0F;
			this.aFloat85 = arg1;
		} else {
			@Pc(14) float local14 = Class310.aFloatArray61[arg5 & 0x3FFF];
			@Pc(20) float local20 = Class310.aFloatArray62[arg5 & 0x3FFF];
			this.aFloat89 = local20 * (float) arg1;
			this.aFloat87 = 1.0F;
			this.aFloat85 = (float) arg1 * local14;
			this.aFloat78 = this.aFloat79 = this.aFloat80 = this.aFloat81 = 0.0F;
			this.aFloat86 = (float) arg0 * -local20;
			this.aFloat88 = local14 * (float) arg0;
		}
		this.aFloat82 = arg4;
		this.aFloat83 = arg2;
		this.aFloat84 = arg3;
	}

	@OriginalMember(owner = "client!hda", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat89 = this.aFloat78 = this.aFloat86 = this.aFloat79 = this.aFloat80 = this.aFloat81 = this.aFloat84 = this.aFloat82 = this.aFloat83 = 0.0F;
		this.aFloat85 = this.aFloat88 = this.aFloat87 = 1.0F;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat81 + (float) arg1 * this.aFloat88 + this.aFloat89 * (float) arg0 + this.aFloat82);
		arg3[2] = (int) (this.aFloat78 * (float) arg0 + (float) arg1 * this.aFloat79 + this.aFloat87 * (float) arg2 + this.aFloat83);
		arg3[0] = (int) (this.aFloat84 + (float) arg0 * this.aFloat85 + this.aFloat86 * (float) arg1 + (float) arg2 * this.aFloat80);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)[F")
	public float[] method3451() {
		Static271.aFloatArray36[5] = this.aFloat88;
		Static271.aFloatArray36[4] = this.aFloat86;
		Static271.aFloatArray36[6] = this.aFloat79;
		Static271.aFloatArray36[8] = this.aFloat80;
		Static271.aFloatArray36[10] = this.aFloat87;
		Static271.aFloatArray36[14] = 0.0F;
		Static271.aFloatArray36[2] = this.aFloat78;
		Static271.aFloatArray36[0] = this.aFloat85;
		Static271.aFloatArray36[1] = this.aFloat89;
		Static271.aFloatArray36[9] = this.aFloat81;
		Static271.aFloatArray36[12] = 0.0F;
		Static271.aFloatArray36[13] = 0.0F;
		return Static271.aFloatArray36;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat88 = 1.0F;
		this.aFloat85 = this.aFloat87 = Class310.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat80 = Class310.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat86 = this.aFloat84 = this.aFloat89 = this.aFloat81 = this.aFloat82 = this.aFloat79 = this.aFloat83 = 0.0F;
		this.aFloat78 = -this.aFloat80;
	}

	@OriginalMember(owner = "client!hda", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) ((float) arg2 * this.aFloat87 + this.aFloat78 * (float) arg0 + (float) arg1 * this.aFloat79);
		arg3[0] = (int) (this.aFloat80 * (float) arg2 + (float) arg1 * this.aFloat86 + (float) arg0 * this.aFloat85);
		arg3[1] = (int) ((float) arg2 * this.aFloat81 + (float) arg0 * this.aFloat89 + this.aFloat88 * (float) arg1);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!q;I)V")
	public void method3452(@OriginalArg(0) Class134 arg0) {
		@Pc(6) Class134_Sub2 local6 = (Class134_Sub2) arg0;
		this.aFloat85 = local6.aFloat85;
		this.aFloat86 = local6.aFloat89;
		this.aFloat80 = local6.aFloat78;
		this.aFloat89 = local6.aFloat86;
		this.aFloat81 = local6.aFloat79;
		this.aFloat78 = local6.aFloat80;
		this.aFloat88 = local6.aFloat88;
		this.aFloat79 = local6.aFloat81;
		this.aFloat84 = -(local6.aFloat83 * this.aFloat80 + this.aFloat86 * local6.aFloat82 + this.aFloat85 * local6.aFloat84);
		this.aFloat87 = local6.aFloat87;
		this.aFloat82 = -(local6.aFloat82 * this.aFloat88 + this.aFloat89 * local6.aFloat84 + local6.aFloat83 * this.aFloat81);
		this.aFloat83 = -(local6.aFloat83 * this.aFloat87 + local6.aFloat84 * this.aFloat78 + local6.aFloat82 * this.aFloat79);
	}

	@OriginalMember(owner = "client!hda", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat87 = 1.0F;
		this.aFloat85 = this.aFloat88 = Class310.aFloatArray61[arg0 & 0x3FFF];
		this.aFloat89 = Class310.aFloatArray62[arg0 & 0x3FFF];
		this.aFloat80 = this.aFloat84 = this.aFloat81 = this.aFloat82 = this.aFloat78 = this.aFloat79 = this.aFloat83 = 0.0F;
		this.aFloat86 = -this.aFloat89;
	}

	@OriginalMember(owner = "client!hda", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class310.aFloatArray61[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class310.aFloatArray62[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat85;
		@Pc(21) float local21 = this.aFloat86;
		@Pc(24) float local24 = this.aFloat80;
		this.aFloat85 = local18 * local9 + local15 * this.aFloat78;
		@Pc(37) float local37 = this.aFloat84;
		this.aFloat86 = local21 * local9 + this.aFloat79 * local15;
		this.aFloat78 = local9 * this.aFloat78 - local15 * local18;
		this.aFloat79 = this.aFloat79 * local9 - local21 * local15;
		this.aFloat80 = local9 * local24 + this.aFloat87 * local15;
		this.aFloat87 = this.aFloat87 * local9 - local15 * local24;
		this.aFloat84 = this.aFloat83 * local15 + local9 * local37;
		this.aFloat83 = this.aFloat83 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!hda", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class310.aFloatArray61[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class310.aFloatArray62[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class310.aFloatArray61[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class310.aFloatArray62[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class310.aFloatArray61[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class310.aFloatArray62[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat89 = local27 * local43 + -local21 * local39;
		this.aFloat78 = local9 * local27;
		this.aFloat80 = local33 * -local27 + local47 * local21;
		this.aFloat88 = local33 * local9;
		this.aFloat81 = local21 * local43 + local39 * local27;
		this.aFloat87 = local9 * local21;
		this.aFloat86 = local39 * local9;
		this.aFloat85 = local27 * local47 + local21 * local33;
		this.aFloat79 = -local15;
		this.aFloat83 = -(this.aFloat87 * (float) arg2) - (float) arg1 * this.aFloat79 + (float) -arg0 * this.aFloat78;
		this.aFloat84 = -((float) arg1 * this.aFloat86) + this.aFloat85 * (float) -arg0 - (float) arg2 * this.aFloat80;
		this.aFloat82 = -(this.aFloat88 * (float) arg1) + this.aFloat89 * (float) -arg0 - this.aFloat81 * (float) arg2;
	}

	@OriginalMember(owner = "client!hda", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat82 += arg1;
		this.aFloat83 += arg2;
		this.aFloat84 += arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class134 method7825() {
		@Pc(7) Class134_Sub2 local7 = new Class134_Sub2();
		local7.aFloat86 = this.aFloat86;
		local7.aFloat83 = this.aFloat83;
		local7.aFloat82 = this.aFloat82;
		local7.aFloat85 = this.aFloat85;
		local7.aFloat79 = this.aFloat79;
		local7.aFloat80 = this.aFloat80;
		local7.aFloat78 = this.aFloat78;
		local7.aFloat81 = this.aFloat81;
		local7.aFloat89 = this.aFloat89;
		local7.aFloat88 = this.aFloat88;
		local7.aFloat84 = this.aFloat84;
		local7.aFloat87 = this.aFloat87;
		return local7;
	}

	@OriginalMember(owner = "client!hda", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat82 = arg1;
		this.aFloat83 = arg2;
		this.aFloat89 = this.aFloat78 = this.aFloat86 = this.aFloat79 = this.aFloat80 = this.aFloat81 = 0.0F;
		this.aFloat84 = arg0;
		this.aFloat85 = this.aFloat88 = this.aFloat87 = 1.0F;
	}
}
