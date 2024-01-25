import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class205_Sub3 extends Class205 {

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "F")
	public float aFloat270;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "F")
	public float aFloat271;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "F")
	public float aFloat272;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "F")
	public float aFloat273;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "F")
	public float aFloat274;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "F")
	public float aFloat275;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "F")
	public float aFloat276;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "F")
	public float aFloat277;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "F")
	public float aFloat278;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "F")
	public float aFloat279;

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "F")
	public float aFloat280;

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "F")
	public float aFloat281;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class205_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!ws", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub4_Sub2.aFloatArray38[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub4_Sub2.aFloatArray37[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat273;
		@Pc(21) float local21 = this.aFloat274;
		@Pc(24) float local24 = this.aFloat281;
		this.aFloat273 = local9 * local18 + this.aFloat278 * local15;
		@Pc(37) float local37 = this.aFloat279;
		this.aFloat278 = this.aFloat278 * local9 - local15 * local18;
		this.aFloat274 = this.aFloat275 * local15 + local9 * local21;
		this.aFloat281 = local15 * this.aFloat276 + local9 * local24;
		this.aFloat275 = this.aFloat275 * local9 - local15 * local21;
		this.aFloat276 = local9 * this.aFloat276 - local24 * local15;
		this.aFloat279 = local15 * this.aFloat272 + local37 * local9;
		this.aFloat272 = local9 * this.aFloat272 - local15 * local37;
	}

	@OriginalMember(owner = "client!ws", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat277 * (float) arg2 + (float) arg0 * this.aFloat270 + (float) arg1 * this.aFloat280);
		arg3[0] = (int) ((float) arg1 * this.aFloat274 + (float) arg0 * this.aFloat273 + this.aFloat281 * (float) arg2);
		arg3[2] = (int) ((float) arg1 * this.aFloat275 + (float) arg0 * this.aFloat278 + this.aFloat276 * (float) arg2);
	}

	@OriginalMember(owner = "client!ws", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class205 arg0) {
		@Pc(6) Class205_Sub3 local6 = (Class205_Sub3) arg0;
		this.aFloat280 = local6.aFloat280;
		this.aFloat274 = local6.aFloat274;
		this.aFloat273 = local6.aFloat273;
		this.aFloat277 = local6.aFloat277;
		this.aFloat279 = local6.aFloat279;
		this.aFloat281 = local6.aFloat281;
		this.aFloat270 = local6.aFloat270;
		this.aFloat271 = local6.aFloat271;
		this.aFloat276 = local6.aFloat276;
		this.aFloat278 = local6.aFloat278;
		this.aFloat275 = local6.aFloat275;
		this.aFloat272 = local6.aFloat272;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!q;)V")
	public void method7805(@OriginalArg(1) Class205 arg0) {
		@Pc(6) Class205_Sub3 local6 = (Class205_Sub3) arg0;
		this.aFloat273 = local6.aFloat273;
		this.aFloat281 = local6.aFloat278;
		this.aFloat274 = local6.aFloat270;
		this.aFloat278 = local6.aFloat281;
		this.aFloat270 = local6.aFloat274;
		this.aFloat277 = local6.aFloat275;
		this.aFloat280 = local6.aFloat280;
		this.aFloat276 = local6.aFloat276;
		this.aFloat279 = -(local6.aFloat272 * this.aFloat281 + local6.aFloat279 * this.aFloat273 + this.aFloat274 * local6.aFloat271);
		this.aFloat275 = local6.aFloat277;
		this.aFloat271 = -(local6.aFloat272 * this.aFloat277 + this.aFloat280 * local6.aFloat271 + this.aFloat270 * local6.aFloat279);
		this.aFloat272 = -(this.aFloat276 * local6.aFloat272 + this.aFloat278 * local6.aFloat279 + local6.aFloat271 * this.aFloat275);
	}

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat272 += arg2;
		this.aFloat271 += arg1;
		this.aFloat279 += arg0;
	}

	@OriginalMember(owner = "client!ws", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class6_Sub4_Sub2.aFloatArray38[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub4_Sub2.aFloatArray37[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat270;
		@Pc(21) float local21 = this.aFloat280;
		@Pc(24) float local24 = this.aFloat277;
		this.aFloat270 = local18 * local9 - local15 * this.aFloat278;
		@Pc(37) float local37 = this.aFloat271;
		this.aFloat280 = local9 * local21 - this.aFloat275 * local15;
		this.aFloat278 = local15 * local18 + this.aFloat278 * local9;
		this.aFloat275 = local15 * local21 + this.aFloat275 * local9;
		this.aFloat277 = local24 * local9 - local15 * this.aFloat276;
		this.aFloat276 = local24 * local15 + local9 * this.aFloat276;
		this.aFloat271 = local37 * local9 - local15 * this.aFloat272;
		this.aFloat272 = local15 * local37 + local9 * this.aFloat272;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(FFIBIFI)V")
	public void method7806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			this.aFloat270 = this.aFloat278 = this.aFloat274 = this.aFloat275 = this.aFloat281 = this.aFloat277 = 0.0F;
			this.aFloat276 = 1.0F;
			this.aFloat273 = arg3;
			this.aFloat280 = arg5;
		} else {
			@Pc(45) float local45 = Class6_Sub4_Sub2.aFloatArray38[arg2 & 0x3FFF];
			@Pc(51) float local51 = Class6_Sub4_Sub2.aFloatArray37[arg2 & 0x3FFF];
			this.aFloat276 = 1.0F;
			this.aFloat280 = (float) arg5 * local45;
			this.aFloat278 = this.aFloat275 = this.aFloat281 = this.aFloat277 = 0.0F;
			this.aFloat274 = (float) arg5 * -local51;
			this.aFloat270 = local51 * (float) arg3;
			this.aFloat273 = local45 * (float) arg3;
		}
		this.aFloat272 = arg4;
		this.aFloat279 = arg0;
		this.aFloat271 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)[F")
	public float[] method7807() {
		Static473.aFloatArray67[8] = this.aFloat281;
		Static473.aFloatArray67[0] = this.aFloat273;
		Static473.aFloatArray67[6] = this.aFloat275;
		Static473.aFloatArray67[12] = 0.0F;
		Static473.aFloatArray67[2] = this.aFloat278;
		Static473.aFloatArray67[13] = 0;
		Static473.aFloatArray67[10] = this.aFloat276;
		Static473.aFloatArray67[4] = this.aFloat274;
		Static473.aFloatArray67[1] = this.aFloat270;
		Static473.aFloatArray67[5] = this.aFloat280;
		Static473.aFloatArray67[9] = this.aFloat277;
		Static473.aFloatArray67[14] = 0.0F;
		return Static473.aFloatArray67;
	}

	@OriginalMember(owner = "client!ws", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat276 = 1.0F;
		this.aFloat273 = this.aFloat280 = Class6_Sub4_Sub2.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat270 = Class6_Sub4_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat274 = -this.aFloat270;
		this.aFloat281 = this.aFloat279 = this.aFloat277 = this.aFloat271 = this.aFloat278 = this.aFloat275 = this.aFloat272 = 0.0F;
	}

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)[F")
	public float[] method7810() {
		Static473.aFloatArray67[13] = this.aFloat271;
		Static473.aFloatArray67[0] = this.aFloat273;
		Static473.aFloatArray67[14] = this.aFloat272;
		Static473.aFloatArray67[6] = this.aFloat275;
		Static473.aFloatArray67[9] = this.aFloat277;
		Static473.aFloatArray67[8] = this.aFloat281;
		Static473.aFloatArray67[1] = this.aFloat270;
		Static473.aFloatArray67[4] = this.aFloat274;
		Static473.aFloatArray67[5] = this.aFloat280;
		Static473.aFloatArray67[10] = this.aFloat276;
		Static473.aFloatArray67[12] = this.aFloat279;
		Static473.aFloatArray67[2] = this.aFloat278;
		return Static473.aFloatArray67;
	}

	@OriginalMember(owner = "client!ws", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat270 = this.aFloat278 = this.aFloat274 = this.aFloat275 = this.aFloat281 = this.aFloat277 = 0.0F;
		this.aFloat272 = arg2;
		this.aFloat279 = arg0;
		this.aFloat271 = arg1;
		this.aFloat273 = this.aFloat280 = this.aFloat276 = 1.0F;
	}

	@OriginalMember(owner = "client!ws", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat279;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat271;
		@Pc(27) float local27 = (float) arg0[2] - this.aFloat272;
		arg0[1] = (int) (this.aFloat280 * local19 + this.aFloat274 * local11 + local27 * this.aFloat275);
		arg0[2] = (int) (this.aFloat281 * local11 + this.aFloat277 * local19 + local27 * this.aFloat276);
		arg0[0] = (int) (local19 * this.aFloat270 + local11 * this.aFloat273 + local27 * this.aFloat278);
	}

	@OriginalMember(owner = "client!ws", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat273 = 1.0F;
		this.aFloat280 = this.aFloat276 = Class6_Sub4_Sub2.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat275 = Class6_Sub4_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat277 = -this.aFloat275;
		this.aFloat274 = this.aFloat281 = this.aFloat279 = this.aFloat270 = this.aFloat271 = this.aFloat278 = this.aFloat272 = 0.0F;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat279 + this.aFloat281 * (float) arg2 + (float) arg1 * this.aFloat274 + (float) arg0 * this.aFloat273);
		arg3[2] = (int) ((float) arg1 * this.aFloat275 + this.aFloat278 * (float) arg0 + this.aFloat276 * (float) arg2 + this.aFloat272);
		arg3[1] = (int) (this.aFloat270 * (float) arg0 + this.aFloat280 * (float) arg1 + this.aFloat277 * (float) arg2 + this.aFloat271);
	}

	@OriginalMember(owner = "client!ws", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class6_Sub4_Sub2.aFloatArray38[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class6_Sub4_Sub2.aFloatArray37[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class6_Sub4_Sub2.aFloatArray38[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class6_Sub4_Sub2.aFloatArray37[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class6_Sub4_Sub2.aFloatArray38[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class6_Sub4_Sub2.aFloatArray37[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat276 = local21 * local9;
		this.aFloat270 = local39 * -local21 + local43 * local27;
		this.aFloat281 = local33 * -local27 + local47 * local21;
		this.aFloat278 = local27 * local9;
		this.aFloat275 = -local15;
		this.aFloat280 = local33 * local9;
		this.aFloat274 = local39 * local9;
		this.aFloat273 = local21 * local33 + local27 * local47;
		this.aFloat277 = local21 * local43 + local39 * local27;
		this.aFloat272 = (float) -arg0 * this.aFloat278 - (float) arg1 * this.aFloat275 - this.aFloat276 * (float) arg2;
		this.aFloat271 = -((float) arg2 * this.aFloat277) + (float) -arg0 * this.aFloat270 - (float) arg1 * this.aFloat280;
		this.aFloat279 = -((float) arg1 * this.aFloat274) + this.aFloat273 * (float) -arg0 - (float) arg2 * this.aFloat281;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class205 method7801() {
		@Pc(7) Class205_Sub3 local7 = new Class205_Sub3();
		local7.aFloat279 = this.aFloat279;
		local7.aFloat274 = this.aFloat274;
		local7.aFloat270 = this.aFloat270;
		local7.aFloat280 = this.aFloat280;
		local7.aFloat275 = this.aFloat275;
		local7.aFloat281 = this.aFloat281;
		local7.aFloat277 = this.aFloat277;
		local7.aFloat276 = this.aFloat276;
		local7.aFloat278 = this.aFloat278;
		local7.aFloat273 = this.aFloat273;
		local7.aFloat272 = this.aFloat272;
		local7.aFloat271 = this.aFloat271;
		return local7;
	}

	@OriginalMember(owner = "client!ws", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat273 = this.aFloat280 = this.aFloat276 = 1.0F;
		this.aFloat270 = this.aFloat278 = this.aFloat274 = this.aFloat275 = this.aFloat281 = this.aFloat277 = this.aFloat279 = this.aFloat271 = this.aFloat272 = 0.0F;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat280 = 1.0F;
		this.aFloat273 = this.aFloat276 = Class6_Sub4_Sub2.aFloatArray38[arg0 & 0x3FFF];
		this.aFloat281 = Class6_Sub4_Sub2.aFloatArray37[arg0 & 0x3FFF];
		this.aFloat278 = -this.aFloat281;
		this.aFloat274 = this.aFloat279 = this.aFloat270 = this.aFloat277 = this.aFloat271 = this.aFloat275 = this.aFloat272 = 0.0F;
	}
}
