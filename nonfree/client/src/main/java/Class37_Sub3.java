import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "Lclient!ch;")
	private Class11_Sub2_Sub1 aClass11_Sub2_Sub1_5;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	private int anInt8645 = 0;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	private int anInt8654 = 0;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	private int anInt8651 = 0;

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "Z")
	private boolean aBoolean708 = false;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
	private int anInt8653 = 0;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
	private int anInt8663 = 0;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_33;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "Lclient!ch;")
	public final Class11_Sub2_Sub1 aClass11_Sub2_Sub1_4;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ji;IIZ)V")
	public Class37_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass15_Sub3_33 = arg0;
		this.aClass11_Sub2_Sub1_4 = Static490.method7467(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ji;IIII)V")
	public Class37_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass15_Sub3_33 = arg0;
		this.aClass11_Sub2_Sub1_4 = Static202.method3381(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ji;II[III)V")
	public Class37_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass15_Sub3_33 = arg0;
		this.aClass11_Sub2_Sub1_4 = Static362.method5320(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class93 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class11_Sub2_Sub1 local7 = ((Class93_Sub1) arg6).aClass11_Sub2_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean708) {
			local14 = this.AA();
			local18 = this.a();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(42) float local42 = (arg5 - arg1) / local18;
			@Pc(48) float local48 = (float) this.anInt8663 * local36;
			@Pc(54) float local54 = local42 * (float) this.anInt8663;
			@Pc(60) float local60 = local24 * (float) this.anInt8653;
			@Pc(66) float local66 = (float) this.anInt8653 * local30;
			@Pc(73) float local73 = (float) this.anInt8654 * -local24;
			@Pc(80) float local80 = -local30 * (float) this.anInt8654;
			@Pc(87) float local87 = -local36 * (float) this.anInt8651;
			arg4 = local87 + arg4 + local60;
			arg2 = arg2 + local73 + local48;
			arg0 = arg0 + local60 + local48;
			arg3 = local80 + arg3 + local54;
			@Pc(118) float local118 = (float) this.anInt8651 * -local42;
			arg1 = local54 + local66 + arg1;
			arg5 = local118 + local66 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass11_Sub2_Sub1_4.method7412(true);
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
		this.aClass15_Sub3_33.method4432(1);
		this.aClass15_Sub3_33.method4458(1);
		this.aClass15_Sub3_33.method4377(local7);
		this.aClass15_Sub3_33.method4451(8448, 7681);
		this.aClass15_Sub3_33.method4442(768, 34168, 0);
		this.aClass15_Sub3_33.method4392(1);
		local24 = local7.aFloat19 / (float) local7.anInt1697;
		local30 = local7.aFloat18 / (float) local7.anInt1695;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat18 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat18 - ((float) -arg8 + arg5) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat18 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat18 - local30 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass15_Sub3_33.method4442(768, 5890, 0);
		this.aClass15_Sub3_33.method4432(0);
		this.aClass15_Sub3_33.method4377(null);
		this.aClass15_Sub3_33.method4458(0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	private void method7086() {
		this.aClass15_Sub3_33.method4458(1);
		this.aClass15_Sub3_33.method4377(null);
		this.aClass15_Sub3_33.method4451(8448, 8448);
		this.aClass15_Sub3_33.method4442(768, 34168, 1);
		this.aClass15_Sub3_33.method4378(0, 5890);
		this.aClass15_Sub3_33.method4458(0);
		this.aClass15_Sub3_33.method4442(768, 34168, 1);
	}

	@OriginalMember(owner = "client!rq", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass11_Sub2_Sub1_5 = Static202.method3381(this.aClass11_Sub2_Sub1_4.anInt1697, this.aClass11_Sub2_Sub1_4.anInt1695, arg1, arg0, this.aClass15_Sub3_33);
		this.anInt8645 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rq", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass11_Sub2_Sub1_4.anInt1697;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class93_Sub1 local6 = (Class93_Sub1) arg2;
		@Pc(9) Class11_Sub2_Sub1 local9 = local6.aClass11_Sub2_Sub1_2;
		this.aClass11_Sub2_Sub1_4.method7412(false);
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
		this.aClass15_Sub3_33.method4432(1);
		this.aClass15_Sub3_33.method4458(1);
		this.aClass15_Sub3_33.method4377(local9);
		this.aClass15_Sub3_33.method4451(8448, 7681);
		this.aClass15_Sub3_33.method4442(768, 34168, 0);
		this.aClass15_Sub3_33.method4392(1);
		@Pc(62) int local62 = arg1 + this.anInt8663;
		@Pc(67) int local67 = arg0 + this.anInt8653;
		@Pc(73) int local73 = this.aClass11_Sub2_Sub1_4.anInt1697 + local67;
		@Pc(79) int local79 = local62 + this.aClass11_Sub2_Sub1_4.anInt1695;
		@Pc(86) float local86 = local9.aFloat19 / (float) local9.anInt1697;
		@Pc(93) float local93 = local9.aFloat18 / (float) local9.anInt1695;
		@Pc(101) float local101 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat18 - (float) (local62 - arg4) * local93;
		@Pc(130) float local130 = local9.aFloat18 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local67, local62 + this.aClass11_Sub2_Sub1_4.anInt1695);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local130);
		OpenGL.glVertex2i(this.aClass11_Sub2_Sub1_4.anInt1697 + local67, local62 - -this.aClass11_Sub2_Sub1_4.anInt1695);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(local67 + this.aClass11_Sub2_Sub1_4.anInt1697, local62);
		OpenGL.glEnd();
		this.aClass15_Sub3_33.method4442(768, 5890, 0);
		this.aClass15_Sub3_33.method4432(0);
		this.aClass15_Sub3_33.method4377(null);
		this.aClass15_Sub3_33.method4458(0);
	}

	@OriginalMember(owner = "client!rq", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8654 = arg2;
		this.anInt8651 = arg3;
		this.anInt8663 = arg1;
		this.anInt8653 = arg0;
		this.aBoolean708 = this.anInt8653 != 0 || this.anInt8663 != 0 || this.anInt8654 != 0 || this.anInt8651 != 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
	private void method7087(@OriginalArg(0) int arg0) {
		this.aClass15_Sub3_33.method4458(1);
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
		this.aClass15_Sub3_33.method4451(7681, this.aClass15_Sub3_33.method4401(arg0));
		this.aClass15_Sub3_33.method4442(768, 34167, 1);
		this.aClass15_Sub3_33.method4378(0, 34168);
		this.aClass15_Sub3_33.method4458(0);
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_5);
		this.aClass15_Sub3_33.method4451(7681, 34479);
		this.aClass15_Sub3_33.method4442(768, 34166, 1);
		if (this.anInt8645 == 0) {
			this.aClass15_Sub3_33.method4417(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt8645 == 1) {
			this.aClass15_Sub3_33.method4417(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt8645 == 2) {
			this.aClass15_Sub3_33.method4417(0.0F, 0.5F, 1.0F, 0.5F);
			return;
		} else if (this.anInt8645 == 3) {
			this.aClass15_Sub3_33.method4417(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!rq", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass11_Sub2_Sub1_4.method7412(true);
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4392(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean708) {
			@Pc(42) float local42 = (float) arg2 / (float) this.AA();
			@Pc(49) float local49 = (float) arg3 / (float) this.a();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt8653 * local42;
			@Pc(67) float local67 = (float) this.anInt8663 * local49 + (float) arg1;
			@Pc(76) float local76 = (float) this.aClass11_Sub2_Sub1_4.anInt1697 * local42 + local58;
			@Pc(85) float local85 = local49 * (float) this.aClass11_Sub2_Sub1_4.anInt1695 + local67;
			if (this.aClass11_Sub2_Sub1_5 == null) {
				this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
				this.aClass15_Sub3_33.method4432(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method7087(arg4);
				this.aClass11_Sub2_Sub1_5.method7412(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method7086();
			}
		} else if (this.aClass11_Sub2_Sub1_5 == null) {
			this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
			this.aClass15_Sub3_33.method4432(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method7087(arg4);
			this.aClass11_Sub2_Sub1_5.method7412(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method7086();
		}
	}

	@OriginalMember(owner = "client!rq", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass11_Sub2_Sub1_4.method1635(arg5, arg2, arg0, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!rq", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass11_Sub2_Sub1_4.method7412(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
		this.aClass15_Sub3_33.method4392(arg6);
		this.aClass15_Sub3_33.method4432(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass11_Sub2_Sub1_4.aBoolean121 && !this.aBoolean708) {
			@Pc(72) float local72 = this.aClass11_Sub2_Sub1_4.aFloat18 * (float) arg3 / (float) this.aClass11_Sub2_Sub1_4.anInt1695;
			@Pc(84) float local84 = this.aClass11_Sub2_Sub1_4.aFloat19 * (float) arg2 / (float) this.aClass11_Sub2_Sub1_4.anInt1697;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8653, (float) this.anInt8663, 0.0F);
		@Pc(124) int local124 = this.AA();
		@Pc(127) int local127 = this.a();
		@Pc(133) int local133 = this.aClass11_Sub2_Sub1_4.anInt1695 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local18 >= local133) {
			local145 = this.aClass11_Sub2_Sub1_4.anInt1697 + arg0;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local9 > local147) {
				@Pc(209) float local209 = (float) (local9 - local147) * this.aClass11_Sub2_Sub1_4.aFloat19 / (float) this.aClass11_Sub2_Sub1_4.anInt1697;
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local209, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local209, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local18) {
			@Pc(278) float local278 = this.aClass11_Sub2_Sub1_4.aFloat18 * (float) (this.aClass11_Sub2_Sub1_4.anInt1695 + local137 - local18) / (float) this.aClass11_Sub2_Sub1_4.anInt1695;
			@Pc(285) int local285 = arg0 + this.aClass11_Sub2_Sub1_4.anInt1697;
			local145 = arg0;
			while (local285 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local278);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, local278);
				OpenGL.glVertex2i(local285, local18);
				OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local285, local137);
				local285 += local124;
				local145 += local124;
			}
			if (local145 < local9) {
				@Pc(350) float local350 = (float) (local9 - local145) * this.aClass11_Sub2_Sub1_4.aFloat19 / (float) this.aClass11_Sub2_Sub1_4.anInt1697;
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local278);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(local350, local278);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local350, this.aClass11_Sub2_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass11_Sub2_Sub1_4.method7412(false);
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4392(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8663;
		@Pc(42) int local42 = arg0 + this.anInt8653;
		if (this.aClass11_Sub2_Sub1_5 == null) {
			this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
			this.aClass15_Sub3_33.method4432(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass11_Sub2_Sub1_4.anInt1695 + local37);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(this.aClass11_Sub2_Sub1_4.anInt1697 + local42, this.aClass11_Sub2_Sub1_4.anInt1695 + local37);
			OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
			OpenGL.glVertex2i(local42 + this.aClass11_Sub2_Sub1_4.anInt1697, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7087(arg2);
		this.aClass11_Sub2_Sub1_5.method7412(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass11_Sub2_Sub1_4.anInt1695 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
		OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass11_Sub2_Sub1_4.anInt1697, this.aClass11_Sub2_Sub1_4.anInt1695 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glVertex2i(local42 + this.aClass11_Sub2_Sub1_4.anInt1697, local37);
		OpenGL.glEnd();
		this.method7086();
	}

	@OriginalMember(owner = "client!rq", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt8654 + this.aClass11_Sub2_Sub1_4.anInt1697 + this.anInt8653;
	}

	@OriginalMember(owner = "client!rq", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean708) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = (float) this.anInt8663 * local30;
			@Pc(49) float local49 = (float) this.anInt8663 * local37;
			@Pc(55) float local55 = local17 * (float) this.anInt8653;
			@Pc(61) float local61 = (float) this.anInt8653 * local23;
			@Pc(68) float local68 = (float) this.anInt8654 * -local17;
			@Pc(75) float local75 = -local23 * (float) this.anInt8654;
			@Pc(82) float local82 = -local30 * (float) this.anInt8651;
			arg1 = arg1 + local61 + local49;
			arg4 = local82 + local55 + arg4;
			arg3 = arg3 + local75 + local49;
			arg2 = local68 + arg2 + local43;
			@Pc(113) float local113 = -local37 * (float) this.anInt8651;
			arg0 = local43 + arg0 + local55;
			arg5 = arg5 + local61 + local113;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass11_Sub2_Sub1_4.method7412(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass15_Sub3_33.method4430();
		this.aClass15_Sub3_33.method4377(this.aClass11_Sub2_Sub1_4);
		this.aClass15_Sub3_33.method4392(arg8);
		this.aClass15_Sub3_33.method4432(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass11_Sub2_Sub1_4.aFloat19, this.aClass11_Sub2_Sub1_4.aFloat18);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass11_Sub2_Sub1_4.anInt1695;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt8651 + this.aClass11_Sub2_Sub1_4.anInt1695 + this.anInt8663;
	}
}
