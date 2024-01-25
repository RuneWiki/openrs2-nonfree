import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "F")
	public float aFloat106;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "F")
	public float aFloat107;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "F")
	public float aFloat108;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "F")
	public float aFloat109;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "F")
	public float aFloat110;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "F")
	public float aFloat111;

	@OriginalMember(owner = "client!je", name = "K", descriptor = "F")
	public float aFloat112;

	@OriginalMember(owner = "client!je", name = "O", descriptor = "F")
	public float aFloat113;

	@OriginalMember(owner = "client!je", name = "P", descriptor = "F")
	public float aFloat114;

	@OriginalMember(owner = "client!je", name = "R", descriptor = "F")
	public float aFloat115;

	@OriginalMember(owner = "client!je", name = "T", descriptor = "F")
	public float aFloat116;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "F")
	public float aFloat117;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class93_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FFFI)F")
	public float method3755(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 * this.aFloat107 + arg0 * this.aFloat115 + arg1 * this.aFloat111 + this.aFloat113;
	}

	@OriginalMember(owner = "client!je", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat112 = this.aFloat115 = this.aFloat114 = 1.0F;
		this.aFloat113 = arg1;
		this.aFloat106 = arg2;
		this.aFloat111 = this.aFloat116 = this.aFloat108 = this.aFloat117 = this.aFloat109 = this.aFloat107 = 0.0F;
		this.aFloat110 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B[F)[F")
	public float[] method3756(@OriginalArg(1) float[] arg0) {
		arg0[15] = 1.0F;
		arg0[6] = this.aFloat107;
		arg0[8] = this.aFloat116;
		arg0[9] = this.aFloat117;
		arg0[10] = this.aFloat114;
		arg0[11] = this.aFloat106;
		arg0[7] = this.aFloat113;
		arg0[5] = this.aFloat115;
		arg0[4] = this.aFloat111;
		arg0[13] = 0.0F;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat112;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat109;
		arg0[1] = this.aFloat108;
		arg0[3] = this.aFloat110;
		return arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FFFFFFIFFF)V")
	public void method3757(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat110 = 0.0F;
		this.aFloat111 = arg5;
		this.aFloat109 = arg4;
		this.aFloat106 = 0.0F;
		this.aFloat108 = arg8;
		this.aFloat114 = arg6;
		this.aFloat116 = arg2;
		this.aFloat112 = arg1;
		this.aFloat117 = arg7;
		this.aFloat113 = 0.0F;
		this.aFloat115 = arg0;
		this.aFloat107 = arg3;
	}

	@OriginalMember(owner = "client!je", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat112 * (float) arg0 + (float) arg1 * this.aFloat108 + this.aFloat109 * (float) arg2);
		arg3[1] = (int) (this.aFloat107 * (float) arg2 + this.aFloat111 * (float) arg0 + (float) arg1 * this.aFloat115);
		arg3[2] = (int) ((float) arg0 * this.aFloat116 + this.aFloat117 * (float) arg1 + this.aFloat114 * (float) arg2);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([FI)[F")
	public float[] method3758(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat111;
		arg0[7] = 0.0F;
		arg0[9] = this.aFloat107;
		arg0[10] = this.aFloat114;
		arg0[5] = this.aFloat115;
		arg0[0] = this.aFloat112;
		arg0[4] = this.aFloat108;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat109;
		arg0[6] = this.aFloat117;
		arg0[14] = this.aFloat106;
		arg0[15] = 1.0F;
		arg0[12] = this.aFloat110;
		arg0[2] = this.aFloat116;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat113;
		return arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!q;)V")
	public void method3759(@OriginalArg(1) Class93 arg0) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat112;
		@Pc(12) float local12 = this.aFloat111;
		@Pc(15) float local15 = this.aFloat108;
		@Pc(18) float local18 = this.aFloat115;
		@Pc(21) float local21 = this.aFloat109;
		@Pc(24) float local24 = this.aFloat107;
		@Pc(27) float local27 = this.aFloat110;
		this.aFloat112 = local12 * local6.aFloat108 + local9 * local6.aFloat112 + local6.aFloat109 * this.aFloat116;
		@Pc(47) float local47 = this.aFloat113;
		this.aFloat111 = this.aFloat116 * local6.aFloat107 + local12 * local6.aFloat115 + local9 * local6.aFloat111;
		this.aFloat108 = local18 * local6.aFloat108 + local15 * local6.aFloat112 + local6.aFloat109 * this.aFloat117;
		this.aFloat115 = local6.aFloat115 * local18 + local15 * local6.aFloat111 + local6.aFloat107 * this.aFloat117;
		this.aFloat116 = local9 * local6.aFloat116 + local6.aFloat117 * local12 + local6.aFloat114 * this.aFloat116;
		this.aFloat107 = local6.aFloat107 * this.aFloat114 + local6.aFloat111 * local21 + local6.aFloat115 * local24;
		this.aFloat117 = local6.aFloat117 * local18 + local6.aFloat116 * local15 + local6.aFloat114 * this.aFloat117;
		this.aFloat109 = local6.aFloat108 * local24 + local21 * local6.aFloat112 + this.aFloat114 * local6.aFloat109;
		this.aFloat110 = local6.aFloat109 * this.aFloat106 + local47 * local6.aFloat108 + local27 * local6.aFloat112 + local6.aFloat110;
		this.aFloat113 = local47 * local6.aFloat115 + local27 * local6.aFloat111 + local6.aFloat107 * this.aFloat106 + local6.aFloat113;
		this.aFloat114 = local6.aFloat116 * local21 + local6.aFloat117 * local24 + local6.aFloat114 * this.aFloat114;
		this.aFloat106 = this.aFloat106 * local6.aFloat114 + local47 * local6.aFloat117 + local6.aFloat116 * local27 + local6.aFloat106;
	}

	@OriginalMember(owner = "client!je", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class93 arg0) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg0;
		this.aFloat112 = local6.aFloat112;
		this.aFloat108 = local6.aFloat108;
		this.aFloat115 = local6.aFloat115;
		this.aFloat114 = local6.aFloat114;
		this.aFloat110 = local6.aFloat110;
		this.aFloat107 = local6.aFloat107;
		this.aFloat109 = local6.aFloat109;
		this.aFloat111 = local6.aFloat111;
		this.aFloat117 = local6.aFloat117;
		this.aFloat113 = local6.aFloat113;
		this.aFloat116 = local6.aFloat116;
		this.aFloat106 = local6.aFloat106;
	}

	@OriginalMember(owner = "client!je", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class274.aFloatArray64[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class274.aFloatArray65[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat112;
		@Pc(21) float local21 = this.aFloat108;
		@Pc(24) float local24 = this.aFloat109;
		@Pc(27) float local27 = this.aFloat110;
		this.aFloat112 = local15 * this.aFloat116 + local9 * local18;
		this.aFloat108 = local21 * local9 + this.aFloat117 * local15;
		this.aFloat116 = local9 * this.aFloat116 - local15 * local18;
		this.aFloat109 = local24 * local9 + local15 * this.aFloat114;
		this.aFloat117 = this.aFloat117 * local9 - local21 * local15;
		this.aFloat114 = this.aFloat114 * local9 - local24 * local15;
		this.aFloat110 = local27 * local9 + this.aFloat106 * local15;
		this.aFloat106 = local9 * this.aFloat106 - local27 * local15;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[FFFF)V")
	public void method3760(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[1] = this.aFloat115 * arg2 + this.aFloat111 * arg3 + arg1 * this.aFloat107;
		arg0[2] = this.aFloat114 * arg1 + this.aFloat117 * arg2 + arg3 * this.aFloat116;
		arg0[0] = this.aFloat109 * arg1 + this.aFloat112 * arg3 + arg2 * this.aFloat108;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method3761(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg0;
		@Pc(9) Class93_Sub3 local9 = (Class93_Sub3) arg1;
		this.aFloat112 = local9.aFloat116 * local6.aFloat109 + local9.aFloat112 * local6.aFloat112 + local9.aFloat111 * local6.aFloat108;
		this.aFloat111 = local6.aFloat107 * local9.aFloat116 + local6.aFloat111 * local9.aFloat112 + local6.aFloat115 * local9.aFloat111;
		this.aFloat108 = local6.aFloat112 * local9.aFloat108 + local9.aFloat115 * local6.aFloat108 + local9.aFloat117 * local6.aFloat109;
		this.aFloat116 = local9.aFloat112 * local6.aFloat116 + local9.aFloat111 * local6.aFloat117 + local6.aFloat114 * local9.aFloat116;
		this.aFloat115 = local9.aFloat117 * local6.aFloat107 + local6.aFloat115 * local9.aFloat115 + local9.aFloat108 * local6.aFloat111;
		this.aFloat117 = local9.aFloat117 * local6.aFloat114 + local9.aFloat115 * local6.aFloat117 + local6.aFloat116 * local9.aFloat108;
		this.aFloat109 = local9.aFloat109 * local6.aFloat112 + local6.aFloat108 * local9.aFloat107 + local6.aFloat109 * local9.aFloat114;
		this.aFloat107 = local6.aFloat107 * local9.aFloat114 + local9.aFloat109 * local6.aFloat111 + local6.aFloat115 * local9.aFloat107;
		this.aFloat114 = local9.aFloat109 * local6.aFloat116 + local9.aFloat107 * local6.aFloat117 + local6.aFloat114 * local9.aFloat114;
		this.aFloat110 = local6.aFloat109 * local9.aFloat106 + local6.aFloat108 * local9.aFloat113 + local6.aFloat112 * local9.aFloat110 + local6.aFloat110;
		this.aFloat113 = local9.aFloat106 * local6.aFloat107 + local9.aFloat113 * local6.aFloat115 + local9.aFloat110 * local6.aFloat111 + local6.aFloat113;
		this.aFloat106 = local6.aFloat106 + local9.aFloat106 * local6.aFloat114 + local6.aFloat117 * local9.aFloat113 + local6.aFloat116 * local9.aFloat110;
	}

	@OriginalMember(owner = "client!je", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat110;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat113;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat106;
		arg0[0] = (int) (local19 * this.aFloat111 + this.aFloat112 * local11 + this.aFloat116 * local27);
		arg0[2] = (int) (this.aFloat107 * local19 + local11 * this.aFloat109 + local27 * this.aFloat114);
		arg0[1] = (int) (this.aFloat117 * local27 + local11 * this.aFloat108 + this.aFloat115 * local19);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IFFF)V")
	public void method3762(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat113 += arg1;
		this.aFloat106 += arg0;
		this.aFloat110 += arg2;
	}

	@OriginalMember(owner = "client!je", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat112 = this.aFloat115 = this.aFloat114 = 1.0F;
		this.aFloat111 = this.aFloat116 = this.aFloat108 = this.aFloat117 = this.aFloat109 = this.aFloat107 = this.aFloat110 = this.aFloat113 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(F[FFFFB)V")
	public void method3764(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(6) float local6 = -arg4;
		@Pc(16) float local16 = arg2 * local6;
		@Pc(20) float local20 = local6 * arg0;
		@Pc(24) float local24 = local6 * arg3;
		@Pc(42) float local42 = this.aFloat110 + this.aFloat112 * local16 + this.aFloat108 * local20 + this.aFloat109 * local24;
		@Pc(60) float local60 = local24 * this.aFloat107 + this.aFloat115 * local20 + local16 * this.aFloat111 + this.aFloat113;
		@Pc(78) float local78 = this.aFloat106 + local16 * this.aFloat116 + this.aFloat117 * local20 + local24 * this.aFloat114;
		arg1[2] = arg3 * this.aFloat114 + this.aFloat116 * arg2 + this.aFloat117 * arg0;
		arg1[1] = this.aFloat111 * arg2 + arg0 * this.aFloat115 + this.aFloat107 * arg3;
		arg1[0] = arg3 * this.aFloat109 + arg0 * this.aFloat108 + arg2 * this.aFloat112;
		arg1[3] = -(arg1[0] * local42 + arg1[1] * local60 + local78 * arg1[2]);
	}

	@OriginalMember(owner = "client!je", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat114 = 1.0F;
		this.aFloat112 = this.aFloat115 = Class274.aFloatArray64[arg0 & 0x3FFF];
		this.aFloat111 = Class274.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat108 = -this.aFloat111;
		this.aFloat109 = this.aFloat110 = this.aFloat107 = this.aFloat113 = this.aFloat116 = this.aFloat117 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat112 = 1.0F;
		this.aFloat115 = this.aFloat114 = Class274.aFloatArray64[arg0 & 0x3FFF];
		this.aFloat117 = Class274.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat108 = this.aFloat109 = this.aFloat110 = this.aFloat111 = this.aFloat113 = this.aFloat116 = this.aFloat106 = 0.0F;
		this.aFloat107 = -this.aFloat117;
	}

	@OriginalMember(owner = "client!je", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat113 += arg1;
		this.aFloat110 += arg0;
		this.aFloat106 += arg2;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IFIFZIF)V")
	public void method3767(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat111 = this.aFloat116 = this.aFloat108 = this.aFloat117 = this.aFloat109 = this.aFloat107 = 0.0F;
			this.aFloat114 = 1.0F;
			this.aFloat112 = arg2 * 2;
			this.aFloat113 = arg1 - (float) arg4;
			this.aFloat106 = arg5;
			this.aFloat110 = (float) -arg2 + arg3;
			this.aFloat115 = arg4 * 2;
			return;
		}
		@Pc(10) float local10 = Class274.aFloatArray64[arg0 & 0x3FFF];
		@Pc(16) float local16 = Class274.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat112 = (float) arg2 * 2.0F * local10;
		this.aFloat106 = arg5;
		this.aFloat114 = 1.0F;
		this.aFloat113 = arg1 + (float) (arg4 * 2) * (-0.5F * local16 - local10 * 0.5F);
		this.aFloat115 = (float) arg4 * 2.0F * local10;
		this.aFloat108 = (float) arg4 * -2.0F * local16;
		this.aFloat111 = local16 * 2.0F * (float) arg2;
		this.aFloat116 = this.aFloat117 = this.aFloat109 = this.aFloat107 = 0.0F;
		this.aFloat110 = (local16 * 0.5F - local10 * 0.5F) * (float) (arg2 * 2) + arg3;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class93 method7795() {
		@Pc(7) Class93_Sub3 local7 = new Class93_Sub3();
		local7.aFloat111 = this.aFloat111;
		local7.aFloat112 = this.aFloat112;
		local7.aFloat109 = this.aFloat109;
		local7.aFloat110 = this.aFloat110;
		local7.aFloat107 = this.aFloat107;
		local7.aFloat113 = this.aFloat113;
		local7.aFloat106 = this.aFloat106;
		local7.aFloat116 = this.aFloat116;
		local7.aFloat115 = this.aFloat115;
		local7.aFloat117 = this.aFloat117;
		local7.aFloat108 = this.aFloat108;
		local7.aFloat114 = this.aFloat114;
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FBFF)V")
	public void method3768(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat110 = 0.0F;
		this.aFloat108 = 0.0F;
		this.aFloat112 = arg0;
		this.aFloat107 = 0.0F;
		this.aFloat116 = 0.0F;
		this.aFloat113 = 0.0F;
		this.aFloat117 = 0.0F;
		this.aFloat115 = arg2;
		this.aFloat106 = 0.0F;
		this.aFloat111 = 0.0F;
		this.aFloat109 = 0.0F;
		this.aFloat114 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "([FI)[F")
	public float[] method3769(@OriginalArg(0) float[] arg0) {
		arg0[3] = this.aFloat110;
		arg0[0] = this.aFloat112;
		arg0[7] = this.aFloat113;
		arg0[5] = this.aFloat115;
		arg0[4] = this.aFloat111;
		arg0[2] = this.aFloat109;
		arg0[6] = this.aFloat107;
		arg0[1] = this.aFloat108;
		return arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat110 + (float) arg2 * this.aFloat109 + this.aFloat108 * (float) arg1 + (float) arg0 * this.aFloat112);
		arg3[2] = (int) ((float) arg1 * this.aFloat117 + this.aFloat116 * (float) arg0 + this.aFloat114 * (float) arg2 + this.aFloat106);
		arg3[1] = (int) (this.aFloat115 * (float) arg1 + (float) arg0 * this.aFloat111 + this.aFloat107 * (float) arg2 + this.aFloat113);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!q;)V")
	public void method3770(@OriginalArg(1) Class93 arg0) {
		@Pc(6) Class93_Sub3 local6 = (Class93_Sub3) arg0;
		this.aFloat109 = local6.aFloat116;
		this.aFloat112 = local6.aFloat112;
		this.aFloat108 = local6.aFloat111;
		this.aFloat111 = local6.aFloat108;
		this.aFloat107 = local6.aFloat117;
		this.aFloat116 = local6.aFloat109;
		this.aFloat115 = local6.aFloat115;
		this.aFloat114 = local6.aFloat114;
		this.aFloat117 = local6.aFloat107;
		this.aFloat110 = -(this.aFloat112 * local6.aFloat110 + local6.aFloat113 * this.aFloat108 + local6.aFloat106 * this.aFloat109);
		this.aFloat113 = -(this.aFloat111 * local6.aFloat110 + this.aFloat115 * local6.aFloat113 + this.aFloat107 * local6.aFloat106);
		this.aFloat106 = -(this.aFloat117 * local6.aFloat113 + local6.aFloat110 * this.aFloat116 + local6.aFloat106 * this.aFloat114);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FIFF)V")
	public void method3771(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat113 *= arg2;
		this.aFloat108 *= arg0;
		this.aFloat109 *= arg0;
		this.aFloat114 *= arg1;
		this.aFloat112 *= arg0;
		this.aFloat111 *= arg2;
		this.aFloat117 *= arg1;
		this.aFloat107 *= arg2;
		this.aFloat110 *= arg0;
		this.aFloat116 *= arg1;
		this.aFloat115 *= arg2;
		this.aFloat106 *= arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat115 = 1.0F;
		this.aFloat112 = this.aFloat114 = Class274.aFloatArray64[arg0 & 0x3FFF];
		this.aFloat109 = Class274.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat116 = -this.aFloat109;
		this.aFloat108 = this.aFloat110 = this.aFloat111 = this.aFloat107 = this.aFloat113 = this.aFloat117 = this.aFloat106 = 0.0F;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[F)[F")
	public float[] method3772(@OriginalArg(1) float[] arg0) {
		arg0[0] = this.aFloat112;
		arg0[8] = this.aFloat110;
		arg0[9] = this.aFloat113;
		arg0[13] = 0.0F;
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat115;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat108;
		arg0[1] = this.aFloat111;
		arg0[10] = this.aFloat106;
		arg0[2] = 0.0F;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[12] = 0.0F;
		arg0[6] = 0.0F;
		arg0[3] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!je", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class274.aFloatArray64[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class274.aFloatArray65[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat111;
		@Pc(21) float local21 = this.aFloat115;
		@Pc(24) float local24 = this.aFloat107;
		this.aFloat111 = local18 * local9 - local15 * this.aFloat116;
		@Pc(38) float local38 = this.aFloat113;
		this.aFloat115 = local9 * local21 - this.aFloat117 * local15;
		this.aFloat116 = local15 * local18 + local9 * this.aFloat116;
		this.aFloat117 = local15 * local21 + local9 * this.aFloat117;
		this.aFloat107 = local9 * local24 - local15 * this.aFloat114;
		this.aFloat113 = local9 * local38 - local15 * this.aFloat106;
		this.aFloat114 = this.aFloat114 * local9 + local15 * local24;
		this.aFloat106 = local38 * local15 + this.aFloat106 * local9;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public void method3773() {
		this.aFloat113 = -this.aFloat113;
		this.aFloat107 = -this.aFloat107;
		this.aFloat116 = -this.aFloat116;
		this.aFloat114 = -this.aFloat114;
		this.aFloat117 = -this.aFloat117;
		this.aFloat106 = -this.aFloat106;
		this.aFloat115 = -this.aFloat115;
		this.aFloat111 = -this.aFloat111;
	}

	@OriginalMember(owner = "client!je", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class274.aFloatArray64[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class274.aFloatArray65[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class274.aFloatArray64[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class274.aFloatArray65[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class274.aFloatArray64[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class274.aFloatArray65[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat116 = local9 * local27;
		this.aFloat115 = local9 * local33;
		this.aFloat111 = -local21 * local39 + local43 * local27;
		this.aFloat114 = local9 * local21;
		this.aFloat107 = local39 * local27 + local21 * local43;
		this.aFloat109 = local47 * local21 + local33 * -local27;
		this.aFloat108 = local39 * local9;
		this.aFloat112 = local21 * local33 + local47 * local27;
		this.aFloat117 = -local15;
		this.aFloat113 = -(this.aFloat115 * (float) arg1) + (float) -arg0 * this.aFloat111 - (float) arg2 * this.aFloat107;
		this.aFloat106 = -(this.aFloat114 * (float) arg2) + (float) -arg0 * this.aFloat116 - this.aFloat117 * (float) arg1;
		this.aFloat110 = -(this.aFloat109 * (float) arg2) + this.aFloat112 * (float) -arg0 - this.aFloat108 * (float) arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FFBF)F")
	public float method3774(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat106 + this.aFloat114 * arg2 + this.aFloat116 * arg0 + arg1 * this.aFloat117;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!q;B)V")
	public void method3775(@OriginalArg(0) Class93 arg0) {
		@Pc(11) Class93_Sub3 local11 = (Class93_Sub3) arg0;
		this.aFloat116 = local11.aFloat116;
		this.aFloat114 = local11.aFloat114;
		this.aFloat109 = local11.aFloat109;
		this.aFloat113 = 0.0F;
		this.aFloat108 = local11.aFloat108;
		this.aFloat110 = 0.0F;
		this.aFloat117 = local11.aFloat117;
		this.aFloat111 = local11.aFloat111;
		this.aFloat115 = local11.aFloat115;
		this.aFloat107 = local11.aFloat107;
		this.aFloat106 = 0.0F;
		this.aFloat112 = local11.aFloat112;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FFFB)V")
	public void method3776(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat111 = this.aFloat116 = this.aFloat108 = this.aFloat117 = this.aFloat109 = this.aFloat107 = 0.0F;
		this.aFloat106 = arg2;
		this.aFloat112 = this.aFloat115 = this.aFloat114 = 1.0F;
		this.aFloat113 = arg1;
		this.aFloat110 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(FBFF)F")
	public float method3777(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat109 * arg1 + this.aFloat108 * arg0 + arg2 * this.aFloat112 + this.aFloat110;
	}
}
