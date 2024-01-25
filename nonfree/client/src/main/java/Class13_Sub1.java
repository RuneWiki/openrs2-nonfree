import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!gq;")
	private Class20_Sub1_Sub1 aClass20_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	private int anInt202 = 0;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	private int anInt204 = 0;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	private int anInt213 = 0;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	private int anInt210 = 0;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	private int anInt208 = 0;

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_2;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "Lclient!gq;")
	private final Class20_Sub1_Sub1 aClass20_Sub1_Sub1_2;

	static {
		new Class134("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!pg;IIII)V")
	public Class13_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass163_Sub2_2 = arg0;
		this.aClass20_Sub1_Sub1_2 = Static214.method2830(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!pg;II[III)V")
	public Class13_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass163_Sub2_2 = arg0;
		this.aClass20_Sub1_Sub1_2 = Static228.method2984(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ap", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass20_Sub1_Sub1_2.anInt2476;
	}

	@OriginalMember(owner = "client!ap", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass20_Sub1_Sub1_1 = Static214.method2830(this.aClass20_Sub1_Sub1_2.anInt2477, this.aClass20_Sub1_Sub1_2.anInt2476, arg1, arg0, this.aClass163_Sub2_2);
		this.anInt213 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ap", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass20_Sub1_Sub1_2.method2043(arg3, arg2, arg4, arg5, arg1, arg0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class35_Sub2 local6 = (Class35_Sub2) arg2;
		@Pc(9) Class20_Sub1_Sub1 local9 = local6.aClass20_Sub1_Sub1_5;
		this.aClass20_Sub1_Sub1_2.method3113(false);
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
		this.aClass163_Sub2_2.method4107(1);
		this.aClass163_Sub2_2.method4131(1);
		this.aClass163_Sub2_2.method4118(local9);
		this.aClass163_Sub2_2.method4164(7681, 8448);
		this.aClass163_Sub2_2.method4181(0, 768, 34168);
		this.aClass163_Sub2_2.method4174(1);
		@Pc(62) int local62 = arg0 + this.anInt208;
		@Pc(67) int local67 = arg1 + this.anInt202;
		@Pc(74) int local74 = local62 + this.aClass20_Sub1_Sub1_2.anInt2477;
		@Pc(80) int local80 = this.aClass20_Sub1_Sub1_2.anInt2476 + local67;
		@Pc(87) float local87 = local9.aFloat26 / (float) local9.anInt2477;
		@Pc(94) float local94 = local9.aFloat25 / (float) local9.anInt2476;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat25 - (float) (local67 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat25 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local62, this.aClass20_Sub1_Sub1_2.anInt2476 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local62 + this.aClass20_Sub1_Sub1_2.anInt2477, local67 - -this.aClass20_Sub1_Sub1_2.anInt2476);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(this.aClass20_Sub1_Sub1_2.anInt2477 + local62, local67);
		OpenGL.glEnd();
		this.aClass163_Sub2_2.method4181(0, 768, 5890);
		this.aClass163_Sub2_2.method4107(0);
		this.aClass163_Sub2_2.method4118(null);
		this.aClass163_Sub2_2.method4131(0);
	}

	@OriginalMember(owner = "client!ap", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.aClass20_Sub1_Sub1_2.anInt2477 + this.anInt208 + this.anInt210;
	}

	@OriginalMember(owner = "client!ap", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass20_Sub1_Sub1_2.anInt2477;
	}

	@OriginalMember(owner = "client!ap", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass20_Sub1_Sub1_2.method3113(true);
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4174(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean18) {
			@Pc(183) float local183 = (float) arg2 / (float) this.RA();
			@Pc(190) float local190 = (float) arg3 / (float) this.Q();
			@Pc(199) float local199 = (float) arg0 + (float) this.anInt208 * local183;
			@Pc(208) float local208 = local190 * (float) this.anInt202 + (float) arg1;
			@Pc(217) float local217 = local183 * (float) this.aClass20_Sub1_Sub1_2.anInt2477 + local199;
			@Pc(226) float local226 = local208 + local190 * (float) this.aClass20_Sub1_Sub1_2.anInt2476;
			if (this.aClass20_Sub1_Sub1_1 == null) {
				this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
				this.aClass163_Sub2_2.method4107(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
			} else {
				this.method206(arg4);
				this.aClass20_Sub1_Sub1_1.method3113(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
				this.method204();
			}
		} else if (this.aClass20_Sub1_Sub1_1 == null) {
			this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
			this.aClass163_Sub2_2.method4107(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method206(arg4);
			this.aClass20_Sub1_Sub1_1.method3113(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method204();
		}
	}

	@OriginalMember(owner = "client!ap", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.anInt202 + this.aClass20_Sub1_Sub1_2.anInt2476 + this.anInt204;
	}

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean18) {
			local10 = this.RA();
			local14 = this.Q();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(35) float local35 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = local35 * (float) this.anInt202;
			@Pc(53) float local53 = (float) this.anInt202 * local41;
			@Pc(59) float local59 = (float) this.anInt208 * local21;
			@Pc(65) float local65 = (float) this.anInt208 * local28;
			@Pc(72) float local72 = -local21 * (float) this.anInt210;
			@Pc(79) float local79 = -local28 * (float) this.anInt210;
			@Pc(86) float local86 = -local35 * (float) this.anInt204;
			arg0 = local59 + arg0 + local47;
			arg2 = local47 + local72 + arg2;
			arg1 = local53 + local65 + arg1;
			arg3 = local53 + local79 + arg3;
			arg4 = local86 + local59 + arg4;
			@Pc(123) float local123 = -local41 * (float) this.anInt204;
			arg5 = local65 + arg5 + local123;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass20_Sub1_Sub1_2.method3113(true);
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
		this.aClass163_Sub2_2.method4174(arg8);
		this.aClass163_Sub2_2.method4107(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ap", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt204 = arg3;
		this.anInt208 = arg0;
		this.anInt210 = arg2;
		this.anInt202 = arg1;
		this.aBoolean18 = this.anInt208 != 0 || this.anInt202 != 0 || this.anInt210 != 0 || this.anInt204 != 0;
	}

	@OriginalMember(owner = "client!ap", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass20_Sub1_Sub1_2.method3113(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
		this.aClass163_Sub2_2.method4174(arg6);
		this.aClass163_Sub2_2.method4107(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass20_Sub1_Sub1_2.aBoolean164 && !this.aBoolean18) {
			@Pc(333) float local333 = this.aClass20_Sub1_Sub1_2.aFloat25 * (float) arg3 / (float) this.aClass20_Sub1_Sub1_2.anInt2476;
			@Pc(345) float local345 = (float) arg2 * this.aClass20_Sub1_Sub1_2.aFloat26 / (float) this.aClass20_Sub1_Sub1_2.anInt2477;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local333);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local345, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local345, local333);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt208, (float) this.anInt202, 0.0F);
		@Pc(72) int local72 = this.RA();
		@Pc(75) int local75 = this.Q();
		@Pc(81) int local81 = this.aClass20_Sub1_Sub1_2.anInt2476 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local81 <= local18) {
			local93 = this.aClass20_Sub1_Sub1_2.anInt2477 + arg0;
			@Pc(95) int local95 = arg0;
			while (local93 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local95 < local9) {
				@Pc(158) float local158 = this.aClass20_Sub1_Sub1_2.aFloat26 * (float) (local9 - local95) / (float) this.aClass20_Sub1_Sub1_2.anInt2477;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local158, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local158, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local18) {
			@Pc(219) float local219 = this.aClass20_Sub1_Sub1_2.aFloat25 * (float) (local85 + this.aClass20_Sub1_Sub1_2.anInt2476 - local18) / (float) this.aClass20_Sub1_Sub1_2.anInt2476;
			@Pc(225) int local225 = arg0 + this.aClass20_Sub1_Sub1_2.anInt2477;
			local93 = arg0;
			while (local225 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local219);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, local219);
				OpenGL.glVertex2i(local225, local18);
				OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local225, local85);
				local93 += local72;
				local225 += local72;
			}
			if (local9 > local93) {
				@Pc(290) float local290 = (float) (local9 - local93) * this.aClass20_Sub1_Sub1_2.aFloat26 / (float) this.aClass20_Sub1_Sub1_2.anInt2477;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local219);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local290, local219);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local290, this.aClass20_Sub1_Sub1_2.aFloat25);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ap", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass20_Sub1_Sub1_2.method3113(false);
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4174(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt202;
		@Pc(42) int local42 = arg0 + this.anInt208;
		if (this.aClass20_Sub1_Sub1_1 == null) {
			this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
			this.aClass163_Sub2_2.method4107(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass20_Sub1_Sub1_2.anInt2476);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
			OpenGL.glVertex2i(this.aClass20_Sub1_Sub1_2.anInt2477 + local42, local37 + this.aClass20_Sub1_Sub1_2.anInt2476);
			OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
			OpenGL.glVertex2i(local42 + this.aClass20_Sub1_Sub1_2.anInt2477, local37);
			OpenGL.glEnd();
			return;
		}
		this.method206(arg2);
		this.aClass20_Sub1_Sub1_1.method3113(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass20_Sub1_Sub1_2.anInt2476);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
		OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass20_Sub1_Sub1_2.anInt2477, local37 - -this.aClass20_Sub1_Sub1_2.anInt2476);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glVertex2i(local42 + this.aClass20_Sub1_Sub1_2.anInt2477, local37);
		OpenGL.glEnd();
		this.method204();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5663(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class35 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class20_Sub1_Sub1 local7 = ((Class35_Sub2) arg6).aClass20_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean18) {
			local14 = this.RA();
			local18 = this.Q();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local36 * (float) this.anInt202;
			@Pc(55) float local55 = (float) this.anInt202 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt208;
			@Pc(67) float local67 = (float) this.anInt208 * local30;
			@Pc(74) float local74 = (float) this.anInt210 * -local24;
			@Pc(81) float local81 = (float) this.anInt210 * -local30;
			@Pc(88) float local88 = (float) this.anInt204 * -local36;
			arg2 = arg2 + local74 + local49;
			arg3 = arg3 + local81 + local55;
			@Pc(107) float local107 = (float) this.anInt204 * -local43;
			arg4 = local88 + local61 + arg4;
			arg1 = local55 + local67 + arg1;
			arg0 = local49 + local61 + arg0;
			arg5 = local67 + arg5 + local107;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass20_Sub1_Sub1_2.method3113(true);
		this.aClass163_Sub2_2.method4173();
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
		this.aClass163_Sub2_2.method4107(1);
		this.aClass163_Sub2_2.method4131(1);
		this.aClass163_Sub2_2.method4118(local7);
		this.aClass163_Sub2_2.method4164(7681, 8448);
		this.aClass163_Sub2_2.method4181(0, 768, 34168);
		this.aClass163_Sub2_2.method4174(1);
		local24 = local7.aFloat26 / (float) local7.anInt2477;
		local30 = local7.aFloat25 / (float) local7.anInt2476;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat25 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat25 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat26, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat25 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat26, this.aClass20_Sub1_Sub1_2.aFloat25);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat25 - local30 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass163_Sub2_2.method4181(0, 768, 5890);
		this.aClass163_Sub2_2.method4107(0);
		this.aClass163_Sub2_2.method4118(null);
		this.aClass163_Sub2_2.method4131(0);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	private void method204() {
		this.aClass163_Sub2_2.method4131(1);
		this.aClass163_Sub2_2.method4118(null);
		this.aClass163_Sub2_2.method4164(8448, 8448);
		this.aClass163_Sub2_2.method4181(1, 768, 34168);
		this.aClass163_Sub2_2.method4135(0, 5890);
		this.aClass163_Sub2_2.method4131(0);
		this.aClass163_Sub2_2.method4181(1, 768, 34168);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI)V")
	private void method206(@OriginalArg(1) int arg0) {
		this.aClass163_Sub2_2.method4131(1);
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_2);
		this.aClass163_Sub2_2.method4164(this.aClass163_Sub2_2.method4180(arg0), 7681);
		this.aClass163_Sub2_2.method4181(1, 768, 34167);
		this.aClass163_Sub2_2.method4135(0, 34168);
		this.aClass163_Sub2_2.method4131(0);
		this.aClass163_Sub2_2.method4118(this.aClass20_Sub1_Sub1_1);
		this.aClass163_Sub2_2.method4164(34479, 7681);
		this.aClass163_Sub2_2.method4181(1, 768, 34166);
		if (this.anInt213 == 0) {
			this.aClass163_Sub2_2.method4148(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt213 == 1) {
			this.aClass163_Sub2_2.method4148(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt213 == 2) {
			this.aClass163_Sub2_2.method4148(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt213 == 3) {
			this.aClass163_Sub2_2.method4148(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}
}
