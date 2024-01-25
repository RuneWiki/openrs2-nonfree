import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!qt;")
	private Class116_Sub2_Sub1 aClass116_Sub2_Sub1_2;

	@OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
	private int anInt5087 = 0;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	private int anInt5084 = 0;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
	private int anInt5085 = 0;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
	private int anInt5082 = 0;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
	private int anInt5089 = 0;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_16;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "Lclient!qt;")
	private final Class116_Sub2_Sub1 aClass116_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pc;IIZ)V")
	public Class17_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass33_Sub3_16 = arg0;
		this.aClass116_Sub2_Sub1_3 = Static634.method8465(arg2, arg3 ? 6408 : 6407, arg1, arg0);
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pc;IIII)V")
	public Class17_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass33_Sub3_16 = arg0;
		this.aClass116_Sub2_Sub1_3 = Static491.method6678(arg2, arg4, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pc;II[III)V")
	public Class17_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub3_16 = arg0;
		this.aClass116_Sub2_Sub1_3 = Static574.method7604(arg4, arg1, arg0, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	private void method4488() {
		this.aClass33_Sub3_16.method6329(1);
		this.aClass33_Sub3_16.method6340((Class116) null);
		this.aClass33_Sub3_16.method6365(8448, 8448);
		this.aClass33_Sub3_16.method6307(34168, 1, 768);
		this.aClass33_Sub3_16.method6335(0, 5890);
		this.aClass33_Sub3_16.method6329(0);
		this.aClass33_Sub3_16.method6307(34168, 1, 768);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass116_Sub2_Sub1_3.method8346(false);
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6292(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5089;
		@Pc(42) int local42 = arg1 + this.anInt5082;
		if (this.aClass116_Sub2_Sub1_2 == null) {
			this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
			this.aClass33_Sub3_16.method6336(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass116_Sub2_Sub1_3.anInt7883);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
			OpenGL.glVertex2i(this.aClass116_Sub2_Sub1_3.anInt7879 + local37, local42 + this.aClass116_Sub2_Sub1_3.anInt7883);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(local37 + this.aClass116_Sub2_Sub1_3.anInt7879, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4491(arg2);
		this.aClass116_Sub2_Sub1_2.method8346(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass116_Sub2_Sub1_3.anInt7883);
		OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
		OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass116_Sub2_Sub1_3.anInt7879, local42 - -this.aClass116_Sub2_Sub1_3.anInt7883);
		OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glVertex2i(local37 + this.aClass116_Sub2_Sub1_3.anInt7879, local42);
		OpenGL.glEnd();
		this.method4488();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIII[III)V")
	private void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass116_Sub2_Sub1_3.method6835(arg0, arg2, arg5, arg4, arg1, arg3);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5082 = arg1;
		this.anInt5087 = arg3;
		this.anInt5089 = arg0;
		this.anInt5084 = arg2;
		this.aBoolean389 = this.anInt5089 != 0 || this.anInt5082 != 0 || this.anInt5084 != 0 || this.anInt5087 != 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)V")
	@Override
	public void method5254(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass116_Sub2_Sub1_2 = Static491.method6678(0, this.aClass116_Sub2_Sub1_3.anInt7883, this.aClass116_Sub2_Sub1_3.anInt7879, this.aClass33_Sub3_16, 0);
		this.anInt5085 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([I)V")
	@Override
	public void method5267(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt5082;
		arg0[2] = this.anInt5084;
		arg0[0] = this.anInt5089;
		arg0[3] = this.anInt5087;
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()I")
	@Override
	public int method5256() {
		return this.aClass116_Sub2_Sub1_3.anInt7879 + this.anInt5089 + this.anInt5084;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass116_Sub2_Sub1_3.method8346(true);
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6292(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean389) {
			@Pc(187) float local187 = (float) arg2 / (float) this.method5256();
			@Pc(194) float local194 = (float) arg3 / (float) this.method5251();
			@Pc(203) float local203 = (float) this.anInt5089 * local187 + (float) arg0;
			@Pc(212) float local212 = (float) this.anInt5082 * local194 + (float) arg1;
			@Pc(221) float local221 = local187 * (float) this.aClass116_Sub2_Sub1_3.anInt7879 + local203;
			@Pc(230) float local230 = (float) this.aClass116_Sub2_Sub1_3.anInt7883 * local194 + local212;
			if (this.aClass116_Sub2_Sub1_2 == null) {
				this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
				this.aClass33_Sub3_16.method6336(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2f(local203, local212);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local203, local230);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
				OpenGL.glVertex2f(local221, local230);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2f(local221, local212);
				OpenGL.glEnd();
			} else {
				this.method4491(arg4);
				this.aClass116_Sub2_Sub1_2.method8346(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2f(local203, local212);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local203, local230);
				OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
				OpenGL.glVertex2f(local221, local230);
				OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2f(local221, local212);
				OpenGL.glEnd();
				this.method4488();
			}
		} else if (this.aClass116_Sub2_Sub1_2 == null) {
			this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
			this.aClass33_Sub3_16.method6336(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method4491(arg4);
			this.aClass116_Sub2_Sub1_2.method8346(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4488();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass116_Sub2_Sub1_3.method8346(false);
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
		this.aClass33_Sub3_16.method6292(arg6);
		this.aClass33_Sub3_16.method6336(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass116_Sub2_Sub1_3.aBoolean619 && !this.aBoolean389) {
			@Pc(73) float local73 = this.aClass116_Sub2_Sub1_3.aFloat189 * (float) arg3 / (float) this.aClass116_Sub2_Sub1_3.anInt7883;
			@Pc(85) float local85 = this.aClass116_Sub2_Sub1_3.aFloat190 * (float) arg2 / (float) this.aClass116_Sub2_Sub1_3.anInt7879;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5089, (float) this.anInt5082, 0.0F);
		@Pc(125) int local125 = this.method5256();
		@Pc(128) int local128 = this.method5251();
		@Pc(135) int local135 = arg1 + this.aClass116_Sub2_Sub1_3.anInt7883;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(148) int local148;
		while (local14 >= local135) {
			local148 = arg0 + this.aClass116_Sub2_Sub1_3.anInt7879;
			@Pc(150) int local150 = arg0;
			while (local9 >= local148) {
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local150, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local150, local135);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
				OpenGL.glVertex2i(local148, local135);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local148, local139);
				local148 += local125;
				local150 += local125;
			}
			if (local9 > local150) {
				@Pc(213) float local213 = (float) (local9 - local150) * this.aClass116_Sub2_Sub1_3.aFloat190 / (float) this.aClass116_Sub2_Sub1_3.anInt7879;
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local150, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local150, local135);
				OpenGL.glTexCoord2f(local213, 0.0F);
				OpenGL.glVertex2i(local9, local135);
				OpenGL.glTexCoord2f(local213, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local9, local139);
			}
			local139 += local128;
			local135 += local128;
		}
		if (local14 > local139) {
			@Pc(274) float local274 = this.aClass116_Sub2_Sub1_3.aFloat189 * (float) (this.aClass116_Sub2_Sub1_3.anInt7883 + local139 - local14) / (float) this.aClass116_Sub2_Sub1_3.anInt7883;
			@Pc(280) int local280 = this.aClass116_Sub2_Sub1_3.anInt7879 + arg0;
			local148 = arg0;
			while (local9 >= local280) {
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local148, local139);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local148, local14);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, local274);
				OpenGL.glVertex2i(local280, local14);
				OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local280, local139);
				local148 += local125;
				local280 += local125;
			}
			if (local9 > local148) {
				@Pc(345) float local345 = (float) (local9 - local148) * this.aClass116_Sub2_Sub1_3.aFloat190 / (float) this.aClass116_Sub2_Sub1_3.anInt7879;
				OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local148, local139);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local148, local14);
				OpenGL.glTexCoord2f(local345, local274);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local345, this.aClass116_Sub2_Sub1_3.aFloat189);
				OpenGL.glVertex2i(local9, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class116_Sub2_Sub1 local9 = local6.aClass116_Sub2_Sub1_1;
		this.aClass116_Sub2_Sub1_3.method8346(false);
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
		this.aClass33_Sub3_16.method6336(1);
		this.aClass33_Sub3_16.method6329(1);
		this.aClass33_Sub3_16.method6340(local9);
		this.aClass33_Sub3_16.method6365(8448, 7681);
		this.aClass33_Sub3_16.method6307(34168, 0, 768);
		this.aClass33_Sub3_16.method6292(1);
		@Pc(62) int local62 = arg1 + this.anInt5082;
		@Pc(67) int local67 = arg0 + this.anInt5089;
		@Pc(74) int local74 = local67 + this.aClass116_Sub2_Sub1_3.anInt7879;
		@Pc(81) int local81 = local62 + this.aClass116_Sub2_Sub1_3.anInt7883;
		@Pc(88) float local88 = local9.aFloat190 / (float) local9.anInt7879;
		@Pc(95) float local95 = local9.aFloat189 / (float) local9.anInt7883;
		@Pc(102) float local102 = local88 * (float) (local67 - arg3);
		@Pc(110) float local110 = (float) (local74 - arg3) * local88;
		@Pc(120) float local120 = local9.aFloat189 - (float) (local62 - arg4) * local95;
		@Pc(131) float local131 = local9.aFloat189 - (float) (local81 - arg4) * local95;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local102, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass116_Sub2_Sub1_3.anInt7883);
		OpenGL.glMultiTexCoord2f(33984, this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local131);
		OpenGL.glVertex2i(local67 + this.aClass116_Sub2_Sub1_3.anInt7879, this.aClass116_Sub2_Sub1_3.anInt7883 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local110, local120);
		OpenGL.glVertex2i(this.aClass116_Sub2_Sub1_3.anInt7879 + local67, local62);
		OpenGL.glEnd();
		this.aClass33_Sub3_16.method6307(5890, 0, 768);
		this.aClass33_Sub3_16.method6336(0);
		this.aClass33_Sub3_16.method6340((Class116) null);
		this.aClass33_Sub3_16.method6329(0);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()I")
	@Override
	public int method5251() {
		return this.aClass116_Sub2_Sub1_3.anInt7883 + this.anInt5082 + this.anInt5087;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()I")
	@Override
	public int method5253() {
		return this.aClass116_Sub2_Sub1_3.anInt7883;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5262(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean389) {
			local6 = (float) this.method5256();
			local10 = (float) this.method5251();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = (float) this.anInt5082 * local31;
			@Pc(49) float local49 = local37 * (float) this.anInt5082;
			@Pc(55) float local55 = (float) this.anInt5089 * local17;
			@Pc(61) float local61 = local24 * (float) this.anInt5089;
			@Pc(68) float local68 = (float) this.anInt5084 * -local17;
			@Pc(75) float local75 = (float) this.anInt5084 * -local24;
			@Pc(82) float local82 = (float) this.anInt5087 * -local31;
			arg0 = arg0 + local55 + local43;
			arg2 = local68 + arg2 + local43;
			arg4 = local82 + arg4 + local55;
			@Pc(107) float local107 = -local37 * (float) this.anInt5087;
			arg3 = local49 + arg3 + local75;
			arg1 = arg1 + local61 + local49;
			arg5 = local107 + local61 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass116_Sub2_Sub1_3.method8346(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
		this.aClass33_Sub3_16.method6292(1);
		this.aClass33_Sub3_16.method6336(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZ)V")
	private void method4491(@OriginalArg(0) int arg0) {
		this.aClass33_Sub3_16.method6329(1);
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
		this.aClass33_Sub3_16.method6365(7681, this.aClass33_Sub3_16.method6341(arg0));
		this.aClass33_Sub3_16.method6307(34167, 1, 768);
		this.aClass33_Sub3_16.method6335(0, 34168);
		this.aClass33_Sub3_16.method6329(0);
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_2);
		this.aClass33_Sub3_16.method6365(7681, 34479);
		this.aClass33_Sub3_16.method6307(34166, 1, 768);
		if (this.anInt5085 == 0) {
			this.aClass33_Sub3_16.method6364(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5085 == 1) {
			this.aClass33_Sub3_16.method6364(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5085 == 2) {
			this.aClass33_Sub3_16.method6364(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt5085 == 3) {
			this.aClass33_Sub3_16.method6364(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()I")
	@Override
	public int method5268() {
		return this.aClass116_Sub2_Sub1_3.anInt7879;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass33_Sub3_16.aBoolean570) {
			this.aClass116_Sub2_Sub1_3.method6837(arg5, arg4, arg1, arg2, arg3, arg0);
			return;
		}
		@Pc(17) int[] local17 = this.aClass33_Sub3_16.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method4490(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class116_Sub2_Sub1 local7 = ((Class1_Sub1) arg6).aClass116_Sub2_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean389) {
			local14 = (float) this.method5256();
			local18 = (float) this.method5251();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt5082;
			@Pc(55) float local55 = (float) this.anInt5082 * local43;
			@Pc(61) float local61 = (float) this.anInt5089 * local24;
			@Pc(67) float local67 = (float) this.anInt5089 * local30;
			@Pc(74) float local74 = -local24 * (float) this.anInt5084;
			@Pc(81) float local81 = (float) this.anInt5084 * -local30;
			@Pc(88) float local88 = (float) this.anInt5087 * -local37;
			arg3 = local55 + local81 + arg3;
			arg4 = local61 + arg4 + local88;
			arg0 = arg0 + local61 + local49;
			@Pc(113) float local113 = (float) this.anInt5087 * -local43;
			arg1 = local55 + local67 + arg1;
			arg2 = arg2 + local74 + local49;
			arg5 = arg5 + local67 + local113;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass116_Sub2_Sub1_3.method8346(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass33_Sub3_16.method6355();
		this.aClass33_Sub3_16.method6340(this.aClass116_Sub2_Sub1_3);
		this.aClass33_Sub3_16.method6336(1);
		this.aClass33_Sub3_16.method6329(1);
		this.aClass33_Sub3_16.method6340(local7);
		this.aClass33_Sub3_16.method6365(8448, 7681);
		this.aClass33_Sub3_16.method6307(34168, 0, 768);
		this.aClass33_Sub3_16.method6292(1);
		local24 = local7.aFloat190 / (float) local7.anInt7879;
		local30 = local7.aFloat189 / (float) local7.anInt7883;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat189 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat189 - (arg5 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass116_Sub2_Sub1_3.aFloat190, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat189 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass116_Sub2_Sub1_3.aFloat190, this.aClass116_Sub2_Sub1_3.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat189 - ((float) -arg8 + arg3) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass33_Sub3_16.method6307(5890, 0, 768);
		this.aClass33_Sub3_16.method6336(0);
		this.aClass33_Sub3_16.method6340((Class116) null);
		this.aClass33_Sub3_16.method6329(0);
	}
}
