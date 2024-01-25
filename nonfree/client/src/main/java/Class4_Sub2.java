import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!iaa;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	private int anInt7549 = 0;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private int anInt7559 = 0;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
	private int anInt7563 = 0;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	private int anInt7562 = 0;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
	private int anInt7568 = 0;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_29;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!iaa;")
	private final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!ac;IIZ)V")
	public Class4_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass5_Sub1_29 = arg0;
		this.aClass2_Sub1_Sub1_5 = Static153.method3056(arg2, arg0, arg1, arg3 ? 6408 : 6407);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!ac;IIII)V")
	public Class4_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub1_29 = arg0;
		this.aClass2_Sub1_Sub1_5 = Static226.method4127(arg4, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!ac;II[III)V")
	public Class4_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub1_29 = arg0;
		this.aClass2_Sub1_Sub1_5 = Static454.method6881(arg0, arg3, arg1, arg5, arg4, arg2);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass2_Sub1_Sub1_5.method6976(false);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
		this.aClass5_Sub1_29.method359(arg6);
		this.aClass5_Sub1_29.method385(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass2_Sub1_Sub1_5.aBoolean412 && !this.aBoolean590) {
			@Pc(349) float local349 = (float) arg3 * this.aClass2_Sub1_Sub1_5.aFloat119 / (float) this.aClass2_Sub1_Sub1_5.anInt5127;
			@Pc(361) float local361 = this.aClass2_Sub1_Sub1_5.aFloat118 * (float) arg2 / (float) this.aClass2_Sub1_Sub1_5.anInt5128;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local349);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local361, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local361, local349);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt7562, (float) this.anInt7563, 0.0F);
		@Pc(73) int local73 = this.method7700();
		@Pc(76) int local76 = this.method7712();
		@Pc(82) int local82 = arg1 + this.aClass2_Sub1_Sub1_5.anInt5127;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local82 <= local14) {
			local94 = this.aClass2_Sub1_Sub1_5.anInt5128 + arg0;
			@Pc(96) int local96 = arg0;
			while (local94 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local94, local86);
				local96 += local73;
				local94 += local73;
			}
			if (local96 < local9) {
				@Pc(162) float local162 = (float) (local9 - local96) * this.aClass2_Sub1_Sub1_5.aFloat118 / (float) this.aClass2_Sub1_Sub1_5.anInt5128;
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local162, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local162, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local9, local86);
			}
			local82 += local76;
			local86 += local76;
		}
		if (local14 > local86) {
			@Pc(231) float local231 = (float) (this.aClass2_Sub1_Sub1_5.anInt5127 + local86 - local14) * this.aClass2_Sub1_Sub1_5.aFloat119 / (float) this.aClass2_Sub1_Sub1_5.anInt5127;
			@Pc(237) int local237 = this.aClass2_Sub1_Sub1_5.anInt5128 + arg0;
			local94 = arg0;
			while (local237 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local94, local14);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, local231);
				OpenGL.glVertex2i(local237, local14);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local237, local86);
				local237 += local73;
				local94 += local73;
			}
			if (local94 < local9) {
				@Pc(306) float local306 = (float) (local9 - local94) * this.aClass2_Sub1_Sub1_5.aFloat118 / (float) this.aClass2_Sub1_Sub1_5.anInt5128;
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local94, local14);
				OpenGL.glTexCoord2f(local306, local231);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local306, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	private void method6399(@OriginalArg(1) int arg0) {
		this.aClass5_Sub1_29.method334(1);
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
		this.aClass5_Sub1_29.method388(7681, this.aClass5_Sub1_29.method381(arg0));
		this.aClass5_Sub1_29.method329(1, 768, 34167);
		this.aClass5_Sub1_29.method375(0, 34168);
		this.aClass5_Sub1_29.method334(0);
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_4);
		this.aClass5_Sub1_29.method388(7681, 34479);
		this.aClass5_Sub1_29.method329(1, 768, 34166);
		if (this.anInt7568 == 0) {
			this.aClass5_Sub1_29.method347(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt7568 == 1) {
			this.aClass5_Sub1_29.method347(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt7568 == 2) {
			this.aClass5_Sub1_29.method347(0.5F, 1.0F, 0.5F, 0.0F);
			return;
		} else if (this.anInt7568 == 3) {
			this.aClass5_Sub1_29.method347(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass2_Sub1_Sub1_5.method6976(false);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method359(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt7563;
		@Pc(42) int local42 = arg0 + this.anInt7562;
		if (this.aClass2_Sub1_Sub1_4 == null) {
			this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
			this.aClass5_Sub1_29.method385(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass2_Sub1_Sub1_5.anInt5127 + local37);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
			OpenGL.glVertex2i(this.aClass2_Sub1_Sub1_5.anInt5128 + local42, this.aClass2_Sub1_Sub1_5.anInt5127 + local37);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(this.aClass2_Sub1_Sub1_5.anInt5128 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method6399(arg2);
		this.aClass2_Sub1_Sub1_4.method6976(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass2_Sub1_Sub1_5.anInt5127);
		OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
		OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
		OpenGL.glVertex2i(this.aClass2_Sub1_Sub1_5.anInt5128 + local42, local37 + this.aClass2_Sub1_Sub1_5.anInt5127);
		OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glVertex2i(this.aClass2_Sub1_Sub1_5.anInt5128 + local42, local37);
		OpenGL.glEnd();
		this.method6401();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()I")
	@Override
	public int method7694() {
		return this.aClass2_Sub1_Sub1_5.anInt5127;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass2_Sub1_Sub1_5.method6976(true);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method359(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean590) {
			@Pc(187) float local187 = (float) arg2 / (float) this.method7700();
			@Pc(194) float local194 = (float) arg3 / (float) this.method7712();
			@Pc(203) float local203 = local187 * (float) this.anInt7562 + (float) arg0;
			@Pc(212) float local212 = (float) this.anInt7563 * local194 + (float) arg1;
			@Pc(221) float local221 = local203 + (float) this.aClass2_Sub1_Sub1_5.anInt5128 * local187;
			@Pc(230) float local230 = local212 + local194 * (float) this.aClass2_Sub1_Sub1_5.anInt5127;
			if (this.aClass2_Sub1_Sub1_4 == null) {
				this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
				this.aClass5_Sub1_29.method385(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2f(local203, local212);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local203, local230);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
				OpenGL.glVertex2f(local221, local230);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2f(local221, local212);
				OpenGL.glEnd();
			} else {
				this.method6399(arg4);
				this.aClass2_Sub1_Sub1_4.method6976(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2f(local203, local212);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local203, local230);
				OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
				OpenGL.glVertex2f(local221, local230);
				OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
				OpenGL.glVertex2f(local221, local212);
				OpenGL.glEnd();
				this.method6401();
			}
		} else if (this.aClass2_Sub1_Sub1_4 == null) {
			this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
			this.aClass5_Sub1_29.method385(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method6399(arg4);
			this.aClass2_Sub1_Sub1_4.method6976(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method6401();
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(IIII)V")
	@Override
	public void method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7562 = arg0;
		this.anInt7563 = arg1;
		this.anInt7559 = arg2;
		this.anInt7549 = arg3;
		this.aBoolean590 = this.anInt7562 != 0 || this.anInt7563 != 0 || this.anInt7559 != 0 || this.anInt7549 != 0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "()I")
	@Override
	public int method7700() {
		return this.aClass2_Sub1_Sub1_5.anInt5128 + this.anInt7562 + this.anInt7559;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	private void method6401() {
		this.aClass5_Sub1_29.method334(1);
		this.aClass5_Sub1_29.method352((Class2) null);
		this.aClass5_Sub1_29.method388(8448, 8448);
		this.aClass5_Sub1_29.method329(1, 768, 34168);
		this.aClass5_Sub1_29.method375(0, 5890);
		this.aClass5_Sub1_29.method334(0);
		this.aClass5_Sub1_29.method329(1, 768, 34168);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method7705(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass2_Sub1_Sub1_4 = Static226.method4127(this.aClass2_Sub1_Sub1_5.anInt5127, this.aClass5_Sub1_29, this.aClass2_Sub1_Sub1_5.anInt5128, 0, 0);
		this.anInt7568 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "()I")
	@Override
	public int method7712() {
		return this.anInt7563 + this.aClass2_Sub1_Sub1_5.anInt5127 + this.anInt7549;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7696(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean590) {
			local10 = (float) this.method7700();
			local14 = (float) this.method7712();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = local34 * (float) this.anInt7563;
			@Pc(53) float local53 = local41 * (float) this.anInt7563;
			@Pc(59) float local59 = (float) this.anInt7562 * local21;
			@Pc(65) float local65 = (float) this.anInt7562 * local27;
			@Pc(72) float local72 = -local21 * (float) this.anInt7559;
			@Pc(79) float local79 = (float) this.anInt7559 * -local27;
			@Pc(86) float local86 = (float) this.anInt7549 * -local34;
			@Pc(93) float local93 = -local41 * (float) this.anInt7549;
			arg1 = local65 + arg1 + local53;
			arg3 = local53 + arg3 + local79;
			arg0 = local59 + arg0 + local47;
			arg4 = local86 + arg4 + local59;
			arg2 = local47 + local72 + arg2;
			arg5 = local93 + local65 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass2_Sub1_Sub1_5.method6976(true);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
		this.aClass5_Sub1_29.method359(1);
		this.aClass5_Sub1_29.method385(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7710(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub1_Sub1 local7 = ((Class1_Sub3) arg6).aClass2_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean590) {
			local14 = (float) this.method7700();
			local18 = (float) this.method7712();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt7563 * local37;
			@Pc(56) float local56 = (float) this.anInt7563 * local44;
			@Pc(62) float local62 = local24 * (float) this.anInt7562;
			@Pc(68) float local68 = (float) this.anInt7562 * local31;
			@Pc(75) float local75 = (float) this.anInt7559 * -local24;
			@Pc(82) float local82 = (float) this.anInt7559 * -local31;
			@Pc(89) float local89 = -local37 * (float) this.anInt7549;
			@Pc(96) float local96 = (float) this.anInt7549 * -local44;
			arg0 = arg0 + local62 + local50;
			arg3 = local82 + arg3 + local56;
			arg4 = local62 + arg4 + local89;
			arg2 = arg2 + local75 + local50;
			arg1 = local56 + local68 + arg1;
			arg5 = local96 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass2_Sub1_Sub1_5.method6976(true);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
		this.aClass5_Sub1_29.method385(1);
		this.aClass5_Sub1_29.method334(1);
		this.aClass5_Sub1_29.method352(local7);
		this.aClass5_Sub1_29.method388(8448, 7681);
		this.aClass5_Sub1_29.method329(0, 768, 34168);
		this.aClass5_Sub1_29.method359(1);
		local24 = local7.aFloat118 / (float) local7.anInt5128;
		local31 = local7.aFloat119 / (float) local7.anInt5127;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat119 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat119 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat119 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat119 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass5_Sub1_29.method329(0, 768, 5890);
		this.aClass5_Sub1_29.method385(0);
		this.aClass5_Sub1_29.method352((Class2) null);
		this.aClass5_Sub1_29.method334(0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([I)V")
	@Override
	public void method7704(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7562;
		arg0[3] = this.anInt7549;
		arg0[1] = this.anInt7563;
		arg0[2] = this.anInt7559;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class2_Sub1_Sub1 local9 = local6.aClass2_Sub1_Sub1_3;
		this.aClass2_Sub1_Sub1_5.method6976(false);
		this.aClass5_Sub1_29.method318();
		this.aClass5_Sub1_29.method352(this.aClass2_Sub1_Sub1_5);
		this.aClass5_Sub1_29.method385(1);
		this.aClass5_Sub1_29.method334(1);
		this.aClass5_Sub1_29.method352(local9);
		this.aClass5_Sub1_29.method388(8448, 7681);
		this.aClass5_Sub1_29.method329(0, 768, 34168);
		this.aClass5_Sub1_29.method359(1);
		@Pc(62) int local62 = arg0 + this.anInt7562;
		@Pc(67) int local67 = arg1 + this.anInt7563;
		@Pc(74) int local74 = local62 + this.aClass2_Sub1_Sub1_5.anInt5128;
		@Pc(81) int local81 = local67 + this.aClass2_Sub1_Sub1_5.anInt5127;
		@Pc(88) float local88 = local9.aFloat118 / (float) local9.anInt5128;
		@Pc(95) float local95 = local9.aFloat119 / (float) local9.anInt5127;
		@Pc(103) float local103 = (float) (local62 - arg3) * local88;
		@Pc(111) float local111 = (float) (local74 - arg3) * local88;
		@Pc(123) float local123 = local9.aFloat119 - (float) (local67 - arg4) * local95;
		@Pc(134) float local134 = local9.aFloat119 - local95 * (float) (local81 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glMultiTexCoord2f(33985, local103, local123);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local103, local134);
		OpenGL.glVertex2i(local62, this.aClass2_Sub1_Sub1_5.anInt5127 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass2_Sub1_Sub1_5.aFloat118, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local111, local134);
		OpenGL.glVertex2i(this.aClass2_Sub1_Sub1_5.anInt5128 + local62, this.aClass2_Sub1_Sub1_5.anInt5127 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass2_Sub1_Sub1_5.aFloat118, this.aClass2_Sub1_Sub1_5.aFloat119);
		OpenGL.glMultiTexCoord2f(33985, local111, local123);
		OpenGL.glVertex2i(local62 + this.aClass2_Sub1_Sub1_5.anInt5128, local67);
		OpenGL.glEnd();
		this.aClass5_Sub1_29.method329(0, 768, 5890);
		this.aClass5_Sub1_29.method385(0);
		this.aClass5_Sub1_29.method352((Class2) null);
		this.aClass5_Sub1_29.method334(0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass5_Sub1_29.aBoolean17) {
			this.aClass2_Sub1_Sub1_5.method4202(arg2, arg0, arg1, arg5, arg4, arg3);
			return;
		}
		@Pc(13) int[] local13 = this.aClass5_Sub1_29.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6403(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[III)V")
	private void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub1_Sub1_5.method4201(arg3, arg4, arg1, arg5, arg2, arg0);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()I")
	@Override
	public int method7697() {
		return this.aClass2_Sub1_Sub1_5.anInt5128;
	}
}
