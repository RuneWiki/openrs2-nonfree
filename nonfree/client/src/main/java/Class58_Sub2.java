import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Lclient!hq;")
	private Class51_Sub1_Sub1 aClass51_Sub1_Sub1_3;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
	private int anInt5506 = 0;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
	private int anInt5501 = 0;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	private int anInt5510 = 0;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
	private int anInt5516 = 0;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	private int anInt5517 = 0;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_23;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!hq;")
	public final Class51_Sub1_Sub1 aClass51_Sub1_Sub1_2;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!jaa;IIZ)V")
	public Class58_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass14_Sub3_23 = arg0;
		this.aClass51_Sub1_Sub1_2 = Static113.method2000(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!jaa;IIII)V")
	public Class58_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass14_Sub3_23 = arg0;
		this.aClass51_Sub1_Sub1_2 = Static302.method4796(arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!jaa;II[III)V")
	public Class58_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass14_Sub3_23 = arg0;
		this.aClass51_Sub1_Sub1_2 = Static224.method4002(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	private void method4741() {
		this.aClass14_Sub3_23.method3917(1);
		this.aClass14_Sub3_23.method3985(null);
		this.aClass14_Sub3_23.method3976(8448, 8448);
		this.aClass14_Sub3_23.method3966(34168, 1, 768);
		this.aClass14_Sub3_23.method3918(0, 5890);
		this.aClass14_Sub3_23.method3917(0);
		this.aClass14_Sub3_23.method3966(34168, 1, 768);
	}

	@OriginalMember(owner = "client!lr", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5517 = arg0;
		this.anInt5506 = arg2;
		this.anInt5501 = arg1;
		this.anInt5510 = arg3;
		this.aBoolean386 = this.anInt5517 != 0 || this.anInt5501 != 0 || this.anInt5506 != 0 || this.anInt5510 != 0;
	}

	@OriginalMember(owner = "client!lr", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt5517 + this.aClass51_Sub1_Sub1_2.anInt4054 + this.anInt5506;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt5510 + this.anInt5501 + this.aClass51_Sub1_Sub1_2.anInt4055;
	}

	@OriginalMember(owner = "client!lr", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean386) {
			local10 = this.AA();
			local14 = this.a();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(35) float local35 = (arg4 - arg0) / local14;
			@Pc(42) float local42 = (arg5 - arg1) / local14;
			@Pc(48) float local48 = (float) this.anInt5501 * local35;
			@Pc(54) float local54 = (float) this.anInt5501 * local42;
			@Pc(60) float local60 = (float) this.anInt5517 * local21;
			@Pc(66) float local66 = (float) this.anInt5517 * local28;
			@Pc(73) float local73 = -local21 * (float) this.anInt5506;
			@Pc(80) float local80 = -local28 * (float) this.anInt5506;
			@Pc(87) float local87 = (float) this.anInt5510 * -local35;
			arg2 = local73 + arg2 + local48;
			arg3 = local80 + arg3 + local54;
			arg0 = local60 + arg0 + local48;
			arg1 = local66 + arg1 + local54;
			arg4 = arg4 + local60 + local87;
			@Pc(124) float local124 = (float) this.anInt5510 * -local42;
			arg5 = local124 + arg5 + local66;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass51_Sub1_Sub1_2.method7734(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
		this.aClass14_Sub3_23.method3937(arg8);
		this.aClass14_Sub3_23.method3925(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class86_Sub3 local6 = (Class86_Sub3) arg2;
		@Pc(9) Class51_Sub1_Sub1 local9 = local6.aClass51_Sub1_Sub1_5;
		this.aClass51_Sub1_Sub1_2.method7734(false);
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
		this.aClass14_Sub3_23.method3925(1);
		this.aClass14_Sub3_23.method3917(1);
		this.aClass14_Sub3_23.method3985(local9);
		this.aClass14_Sub3_23.method3976(7681, 8448);
		this.aClass14_Sub3_23.method3966(34168, 0, 768);
		this.aClass14_Sub3_23.method3937(1);
		@Pc(62) int local62 = arg1 + this.anInt5501;
		@Pc(67) int local67 = arg0 + this.anInt5517;
		@Pc(74) int local74 = local67 + this.aClass51_Sub1_Sub1_2.anInt4054;
		@Pc(80) int local80 = this.aClass51_Sub1_Sub1_2.anInt4055 + local62;
		@Pc(87) float local87 = local9.aFloat80 / (float) local9.anInt4054;
		@Pc(94) float local94 = local9.aFloat79 / (float) local9.anInt4055;
		@Pc(101) float local101 = (float) (local67 - arg3) * local87;
		@Pc(109) float local109 = (float) (local74 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat79 - local94 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat79 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, local62 + this.aClass51_Sub1_Sub1_2.anInt4055);
		OpenGL.glMultiTexCoord2f(33984, this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local67 + this.aClass51_Sub1_Sub1_2.anInt4054, local62 - -this.aClass51_Sub1_Sub1_2.anInt4055);
		OpenGL.glMultiTexCoord2f(33984, this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass51_Sub1_Sub1_2.anInt4054 + local67, local62);
		OpenGL.glEnd();
		this.aClass14_Sub3_23.method3966(5890, 0, 768);
		this.aClass14_Sub3_23.method3925(0);
		this.aClass14_Sub3_23.method3985(null);
		this.aClass14_Sub3_23.method3917(0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass51_Sub1_Sub1_2.anInt4055;
	}

	@OriginalMember(owner = "client!lr", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass51_Sub1_Sub1_2.method7734(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
		this.aClass14_Sub3_23.method3937(arg6);
		this.aClass14_Sub3_23.method3925(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass51_Sub1_Sub1_2.aBoolean278 && !this.aBoolean386) {
			@Pc(342) float local342 = this.aClass51_Sub1_Sub1_2.aFloat79 * (float) arg3 / (float) this.aClass51_Sub1_Sub1_2.anInt4055;
			@Pc(354) float local354 = (float) arg2 * this.aClass51_Sub1_Sub1_2.aFloat80 / (float) this.aClass51_Sub1_Sub1_2.anInt4054;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local342);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local354, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local354, local342);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5517, (float) this.anInt5501, 0.0F);
		@Pc(73) int local73 = this.AA();
		@Pc(76) int local76 = this.a();
		@Pc(83) int local83 = arg1 + this.aClass51_Sub1_Sub1_2.anInt4055;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(95) int local95;
		while (local83 <= local19) {
			local95 = this.aClass51_Sub1_Sub1_2.anInt4054 + arg0;
			@Pc(97) int local97 = arg0;
			while (local95 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
				OpenGL.glVertex2i(local95, local83);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local95, local87);
				local95 += local73;
				local97 += local73;
			}
			if (local97 < local9) {
				@Pc(163) float local163 = this.aClass51_Sub1_Sub1_2.aFloat80 * (float) (local9 - local97) / (float) this.aClass51_Sub1_Sub1_2.anInt4054;
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local9, local83);
				OpenGL.glTexCoord2f(local163, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local9, local87);
			}
			local87 += local76;
			local83 += local76;
		}
		if (local87 < local19) {
			@Pc(224) float local224 = this.aClass51_Sub1_Sub1_2.aFloat79 * (float) (local87 + this.aClass51_Sub1_Sub1_2.anInt4055 - local19) / (float) this.aClass51_Sub1_Sub1_2.anInt4055;
			@Pc(230) int local230 = this.aClass51_Sub1_Sub1_2.anInt4054 + arg0;
			local95 = arg0;
			while (local230 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local95, local19);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, local224);
				OpenGL.glVertex2i(local230, local19);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local230, local87);
				local95 += local73;
				local230 += local73;
			}
			if (local95 < local9) {
				@Pc(299) float local299 = (float) (local9 - local95) * this.aClass51_Sub1_Sub1_2.aFloat80 / (float) this.aClass51_Sub1_Sub1_2.anInt4054;
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local95, local19);
				OpenGL.glTexCoord2f(local299, local224);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local299, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2i(local9, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass51_Sub1_Sub1_3 = Static302.method4796(this.aClass14_Sub3_23, arg0, this.aClass51_Sub1_Sub1_2.anInt4054, this.aClass51_Sub1_Sub1_2.anInt4055, arg1);
		this.anInt5516 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!lr", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass51_Sub1_Sub1_2.method7734(true);
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3937(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean386) {
			@Pc(181) float local181 = (float) arg2 / (float) this.AA();
			@Pc(188) float local188 = (float) arg3 / (float) this.a();
			@Pc(197) float local197 = local181 * (float) this.anInt5517 + (float) arg0;
			@Pc(206) float local206 = (float) arg1 + (float) this.anInt5501 * local188;
			@Pc(215) float local215 = local181 * (float) this.aClass51_Sub1_Sub1_2.anInt4054 + local197;
			@Pc(224) float local224 = local188 * (float) this.aClass51_Sub1_Sub1_2.anInt4055 + local206;
			if (this.aClass51_Sub1_Sub1_3 == null) {
				this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
				this.aClass14_Sub3_23.method3925(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method4743(arg4);
				this.aClass51_Sub1_Sub1_3.method7734(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method4741();
			}
		} else if (this.aClass51_Sub1_Sub1_3 == null) {
			this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
			this.aClass14_Sub3_23.method3925(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4743(arg4);
			this.aClass51_Sub1_Sub1_3.method7734(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method4741();
		}
	}

	@OriginalMember(owner = "client!lr", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass51_Sub1_Sub1_2.anInt4054;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7660(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class86 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class51_Sub1_Sub1 local7 = ((Class86_Sub3) arg6).aClass51_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean386) {
			local14 = this.AA();
			local18 = this.a();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local36 * (float) this.anInt5501;
			@Pc(55) float local55 = local43 * (float) this.anInt5501;
			@Pc(61) float local61 = (float) this.anInt5517 * local24;
			@Pc(67) float local67 = local30 * (float) this.anInt5517;
			@Pc(74) float local74 = -local24 * (float) this.anInt5506;
			@Pc(81) float local81 = -local30 * (float) this.anInt5506;
			@Pc(88) float local88 = (float) this.anInt5510 * -local36;
			arg3 = local55 + local81 + arg3;
			arg2 = arg2 + local74 + local49;
			arg0 = local61 + arg0 + local49;
			arg4 = local61 + arg4 + local88;
			arg1 = local55 + local67 + arg1;
			@Pc(125) float local125 = (float) this.anInt5510 * -local43;
			arg5 = arg5 + local67 + local125;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass51_Sub1_Sub1_2.method7734(true);
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
		this.aClass14_Sub3_23.method3925(1);
		this.aClass14_Sub3_23.method3917(1);
		this.aClass14_Sub3_23.method3985(local7);
		this.aClass14_Sub3_23.method3976(7681, 8448);
		this.aClass14_Sub3_23.method3966(34168, 0, 768);
		this.aClass14_Sub3_23.method3937(1);
		local24 = local7.aFloat80 / (float) local7.anInt4054;
		local30 = local7.aFloat79 / (float) local7.anInt4055;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat79 - ((float) -arg8 + arg1) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat79 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat79 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat79 - local30 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass14_Sub3_23.method3966(5890, 0, 768);
		this.aClass14_Sub3_23.method3925(0);
		this.aClass14_Sub3_23.method3985(null);
		this.aClass14_Sub3_23.method3917(0);
	}

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass51_Sub1_Sub1_2.method7734(false);
		this.aClass14_Sub3_23.method3906();
		this.aClass14_Sub3_23.method3937(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt5501;
		@Pc(42) int local42 = arg0 + this.anInt5517;
		if (this.aClass51_Sub1_Sub1_3 == null) {
			this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
			this.aClass14_Sub3_23.method3925(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass51_Sub1_Sub1_2.anInt4055 + local37);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
			OpenGL.glVertex2i(this.aClass51_Sub1_Sub1_2.anInt4054 + local42, local37 - -this.aClass51_Sub1_Sub1_2.anInt4055);
			OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
			OpenGL.glVertex2i(local42 + this.aClass51_Sub1_Sub1_2.anInt4054, local37);
			OpenGL.glEnd();
			return;
		}
		this.method4743(arg2);
		this.aClass51_Sub1_Sub1_3.method7734(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glTexCoord2f(0.0F, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass51_Sub1_Sub1_2.anInt4055 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
		OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass51_Sub1_Sub1_2.anInt4054, local37 + this.aClass51_Sub1_Sub1_2.anInt4055);
		OpenGL.glMultiTexCoord2f(33985, this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glTexCoord2f(this.aClass51_Sub1_Sub1_2.aFloat80, this.aClass51_Sub1_Sub1_2.aFloat79);
		OpenGL.glVertex2i(this.aClass51_Sub1_Sub1_2.anInt4054 + local42, local37);
		OpenGL.glEnd();
		this.method4741();
	}

	@OriginalMember(owner = "client!lr", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub1_Sub1_2.method3537(arg3, arg1, arg4, arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
	private void method4743(@OriginalArg(0) int arg0) {
		this.aClass14_Sub3_23.method3917(1);
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_2);
		this.aClass14_Sub3_23.method3976(this.aClass14_Sub3_23.method3946(arg0), 7681);
		this.aClass14_Sub3_23.method3966(34167, 1, 768);
		this.aClass14_Sub3_23.method3918(0, 34168);
		this.aClass14_Sub3_23.method3917(0);
		this.aClass14_Sub3_23.method3985(this.aClass51_Sub1_Sub1_3);
		this.aClass14_Sub3_23.method3976(34479, 7681);
		this.aClass14_Sub3_23.method3966(34166, 1, 768);
		if (this.anInt5516 == 0) {
			this.aClass14_Sub3_23.method3982(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt5516 == 1) {
			this.aClass14_Sub3_23.method3982(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt5516 == 2) {
			this.aClass14_Sub3_23.method3982(0.0F, 0.5F, 0.5F, 1.0F);
			return;
		} else if (this.anInt5516 == 3) {
			this.aClass14_Sub3_23.method3982(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}
}
