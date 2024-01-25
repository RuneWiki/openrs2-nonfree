import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "F")
	public float aFloat280;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "F")
	public float aFloat281;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "F")
	public float aFloat282;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "F")
	public float aFloat283;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "F")
	public float aFloat284;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "F")
	public float aFloat285;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "F")
	public float aFloat286;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "F")
	public float aFloat287;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "F")
	public float aFloat288;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "F")
	public float aFloat289;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "F")
	public float aFloat290;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "F")
	public float aFloat291;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class78_Sub3() {
		this.ha();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!m;)V")
	public void method5515(@OriginalArg(1) Class78 arg0) {
		@Pc(6) Class78_Sub3 local6 = (Class78_Sub3) arg0;
		this.aFloat286 = local6.aFloat286;
		this.aFloat290 = local6.aFloat282;
		this.aFloat291 = local6.aFloat288;
		this.aFloat282 = local6.aFloat290;
		this.aFloat288 = local6.aFloat291;
		this.aFloat281 = local6.aFloat289;
		this.aFloat283 = local6.aFloat283;
		this.aFloat289 = local6.aFloat281;
		this.aFloat287 = local6.aFloat287;
		this.aFloat285 = -(local6.aFloat285 * this.aFloat286 + local6.aFloat280 * this.aFloat290 + local6.aFloat284 * this.aFloat291);
		this.aFloat280 = -(this.aFloat282 * local6.aFloat285 + local6.aFloat280 * this.aFloat283 + local6.aFloat284 * this.aFloat281);
		this.aFloat284 = -(local6.aFloat285 * this.aFloat288 + local6.aFloat280 * this.aFloat289 + local6.aFloat284 * this.aFloat287);
	}

	@OriginalMember(owner = "client!ol", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat286 = 1.0F;
		this.aFloat283 = this.aFloat287 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat289 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat290 = this.aFloat291 = this.aFloat285 = this.aFloat282 = this.aFloat280 = this.aFloat288 = this.aFloat284 = 0.0F;
		this.aFloat281 = -this.aFloat289;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)[F")
	public float[] method5517() {
		Static219.aFloatArray29[9] = this.aFloat281;
		Static219.aFloatArray29[12] = this.aFloat285;
		Static219.aFloatArray29[2] = this.aFloat288;
		Static219.aFloatArray29[1] = this.aFloat282;
		Static219.aFloatArray29[8] = this.aFloat291;
		Static219.aFloatArray29[14] = this.aFloat284;
		Static219.aFloatArray29[6] = this.aFloat289;
		Static219.aFloatArray29[10] = this.aFloat287;
		Static219.aFloatArray29[5] = this.aFloat283;
		Static219.aFloatArray29[4] = this.aFloat290;
		Static219.aFloatArray29[0] = this.aFloat286;
		Static219.aFloatArray29[13] = this.aFloat280;
		return Static219.aFloatArray29;
	}

	@OriginalMember(owner = "client!ol", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class78 arg0) {
		@Pc(6) Class78_Sub3 local6 = (Class78_Sub3) arg0;
		this.aFloat280 = local6.aFloat280;
		this.aFloat289 = local6.aFloat289;
		this.aFloat290 = local6.aFloat290;
		this.aFloat282 = local6.aFloat282;
		this.aFloat291 = local6.aFloat291;
		this.aFloat287 = local6.aFloat287;
		this.aFloat283 = local6.aFloat283;
		this.aFloat288 = local6.aFloat288;
		this.aFloat285 = local6.aFloat285;
		this.aFloat286 = local6.aFloat286;
		this.aFloat281 = local6.aFloat281;
		this.aFloat284 = local6.aFloat284;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method5707() {
		@Pc(7) Class78_Sub3 local7 = new Class78_Sub3();
		local7.aFloat283 = this.aFloat283;
		local7.aFloat280 = this.aFloat280;
		local7.aFloat282 = this.aFloat282;
		local7.aFloat286 = this.aFloat286;
		local7.aFloat289 = this.aFloat289;
		local7.aFloat291 = this.aFloat291;
		local7.aFloat287 = this.aFloat287;
		local7.aFloat281 = this.aFloat281;
		local7.aFloat285 = this.aFloat285;
		local7.aFloat290 = this.aFloat290;
		local7.aFloat284 = this.aFloat284;
		local7.aFloat288 = this.aFloat288;
		return local7;
	}

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat282;
		@Pc(21) float local21 = this.aFloat283;
		@Pc(24) float local24 = this.aFloat281;
		this.aFloat282 = local9 * local18 - local15 * this.aFloat288;
		@Pc(37) float local37 = this.aFloat280;
		this.aFloat288 = local18 * local15 + this.aFloat288 * local9;
		this.aFloat283 = local21 * local9 - this.aFloat289 * local15;
		this.aFloat289 = local15 * local21 + local9 * this.aFloat289;
		this.aFloat281 = local24 * local9 - this.aFloat287 * local15;
		this.aFloat287 = this.aFloat287 * local9 + local24 * local15;
		this.aFloat280 = local37 * local9 - this.aFloat284 * local15;
		this.aFloat284 = local9 * this.aFloat284 + local15 * local37;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg0 * this.aFloat282 + this.aFloat283 * (float) arg1 + this.aFloat281 * (float) arg2 + this.aFloat280);
		arg3[2] = (int) ((float) arg0 * this.aFloat288 + this.aFloat289 * (float) arg1 + (float) arg2 * this.aFloat287 + this.aFloat284);
		arg3[0] = (int) (this.aFloat285 + this.aFloat291 * (float) arg2 + this.aFloat286 * (float) arg0 + this.aFloat290 * (float) arg1);
	}

	@OriginalMember(owner = "client!ol", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat285 += arg0;
		this.aFloat284 += arg2;
		this.aFloat280 += arg1;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)[F")
	public float[] method5518() {
		Static219.aFloatArray29[1] = this.aFloat282;
		Static219.aFloatArray29[9] = this.aFloat281;
		Static219.aFloatArray29[8] = this.aFloat291;
		Static219.aFloatArray29[12] = 0.0F;
		Static219.aFloatArray29[6] = this.aFloat289;
		Static219.aFloatArray29[5] = this.aFloat283;
		Static219.aFloatArray29[2] = this.aFloat288;
		Static219.aFloatArray29[13] = 0.0F;
		Static219.aFloatArray29[0] = this.aFloat286;
		Static219.aFloatArray29[14] = 0.0F;
		Static219.aFloatArray29[4] = this.aFloat290;
		Static219.aFloatArray29[10] = this.aFloat287;
		return Static219.aFloatArray29;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIFFF)V")
	public void method5519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg0 == 0) {
			this.aFloat287 = 1.0F;
			this.aFloat286 = arg2;
			this.aFloat282 = this.aFloat288 = this.aFloat290 = this.aFloat289 = this.aFloat291 = this.aFloat281 = 0.0F;
			this.aFloat283 = arg1;
		} else {
			@Pc(42) float local42 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
			@Pc(48) float local48 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
			this.aFloat286 = (float) arg2 * local42;
			this.aFloat288 = this.aFloat289 = this.aFloat291 = this.aFloat281 = 0.0F;
			this.aFloat282 = local48 * (float) arg2;
			this.aFloat287 = 1.0F;
			this.aFloat290 = -local48 * (float) arg1;
			this.aFloat283 = (float) arg1 * local42;
		}
		this.aFloat284 = arg5;
		this.aFloat280 = arg4;
		this.aFloat285 = arg3;
	}

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class5_Sub1_Sub34.aFloatArray66[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub34.aFloatArray65[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class5_Sub1_Sub34.aFloatArray66[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class5_Sub1_Sub34.aFloatArray65[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class5_Sub1_Sub34.aFloatArray66[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class5_Sub1_Sub34.aFloatArray65[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat283 = local33 * local9;
		this.aFloat291 = local33 * -local27 + local21 * local47;
		this.aFloat282 = -local21 * local39 + local27 * local43;
		this.aFloat290 = local9 * local39;
		this.aFloat286 = local33 * local21 + local47 * local27;
		this.aFloat288 = local27 * local9;
		this.aFloat289 = -local15;
		this.aFloat281 = local39 * local27 + local43 * local21;
		this.aFloat287 = local21 * local9;
		this.aFloat285 = -((float) arg2 * this.aFloat291) - this.aFloat290 * (float) arg1 + (float) -arg0 * this.aFloat286;
		this.aFloat280 = -((float) arg2 * this.aFloat281) + (float) -arg0 * this.aFloat282 - (float) arg1 * this.aFloat283;
		this.aFloat284 = -(this.aFloat289 * (float) arg1) + (float) -arg0 * this.aFloat288 - this.aFloat287 * (float) arg2;
	}

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat287 * (float) arg2 + this.aFloat289 * (float) arg1 + this.aFloat288 * (float) arg0);
		arg3[1] = (int) (this.aFloat282 * (float) arg0 + this.aFloat283 * (float) arg1 + (float) arg2 * this.aFloat281);
		arg3[0] = (int) ((float) arg2 * this.aFloat291 + this.aFloat286 * (float) arg0 + this.aFloat290 * (float) arg1);
	}

	@OriginalMember(owner = "client!ol", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat286;
		@Pc(21) float local21 = this.aFloat290;
		@Pc(24) float local24 = this.aFloat291;
		this.aFloat286 = local18 * local9 + local15 * this.aFloat288;
		@Pc(37) float local37 = this.aFloat285;
		this.aFloat290 = this.aFloat289 * local15 + local21 * local9;
		this.aFloat288 = this.aFloat288 * local9 - local18 * local15;
		this.aFloat289 = local9 * this.aFloat289 - local21 * local15;
		this.aFloat291 = local24 * local9 + this.aFloat287 * local15;
		this.aFloat287 = this.aFloat287 * local9 - local15 * local24;
		this.aFloat285 = this.aFloat284 * local15 + local37 * local9;
		this.aFloat284 = this.aFloat284 * local9 - local15 * local37;
	}

	@OriginalMember(owner = "client!ol", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat282 = this.aFloat288 = this.aFloat290 = this.aFloat289 = this.aFloat291 = this.aFloat281 = this.aFloat285 = this.aFloat280 = this.aFloat284 = 0.0F;
		this.aFloat286 = this.aFloat283 = this.aFloat287 = 1.0F;
	}

	@OriginalMember(owner = "client!ol", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat285;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat280;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat284;
		arg0[0] = (int) (this.aFloat288 * local28 + local12 * this.aFloat286 + this.aFloat282 * local20);
		arg0[1] = (int) (local12 * this.aFloat290 + local20 * this.aFloat283 + local28 * this.aFloat289);
		arg0[2] = (int) (local28 * this.aFloat287 + local20 * this.aFloat281 + this.aFloat291 * local12);
	}

	@OriginalMember(owner = "client!ol", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat286 = this.aFloat283 = this.aFloat287 = 1.0F;
		this.aFloat280 = arg1;
		this.aFloat282 = this.aFloat288 = this.aFloat290 = this.aFloat289 = this.aFloat291 = this.aFloat281 = 0.0F;
		this.aFloat285 = arg0;
		this.aFloat284 = arg2;
	}

	@OriginalMember(owner = "client!ol", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat287 = 1.0F;
		this.aFloat286 = this.aFloat283 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat282 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat291 = this.aFloat285 = this.aFloat281 = this.aFloat280 = this.aFloat288 = this.aFloat289 = this.aFloat284 = 0.0F;
		this.aFloat290 = -this.aFloat282;
	}

	@OriginalMember(owner = "client!ol", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat283 = 1.0F;
		this.aFloat286 = this.aFloat287 = Class5_Sub1_Sub34.aFloatArray66[arg0 & 0x3FFF];
		this.aFloat291 = Class5_Sub1_Sub34.aFloatArray65[arg0 & 0x3FFF];
		this.aFloat288 = -this.aFloat291;
		this.aFloat290 = this.aFloat285 = this.aFloat282 = this.aFloat281 = this.aFloat280 = this.aFloat289 = this.aFloat284 = 0.0F;
	}
}
