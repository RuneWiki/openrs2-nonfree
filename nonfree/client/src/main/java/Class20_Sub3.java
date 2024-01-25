import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!m;")
	private Class88_Sub2_Sub1 aClass88_Sub2_Sub1_1;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	private int anInt5497 = 0;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	private int anInt5500 = 0;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	private int anInt5504 = 0;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	private int anInt5507 = 0;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
	private int anInt5499 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_16;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!m;")
	private final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_2;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!oea;IIZ)V")
	public Class20_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass87_Sub2_16 = arg0;
		this.aClass88_Sub2_Sub1_2 = Static34.method771(arg0, arg3 ? 6408 : 6407, arg2, arg1);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!oea;IIII)V")
	public Class20_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass87_Sub2_16 = arg0;
		this.aClass88_Sub2_Sub1_2 = Static377.method5684(arg0, arg2, arg4, arg1, arg3);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!oea;II[III)V")
	public Class20_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass87_Sub2_16 = arg0;
		this.aClass88_Sub2_Sub1_2 = Static605.method8282(arg2, arg3, arg4, arg1, arg5, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	@Override
	public void method4585(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass88_Sub2_Sub1_1 = Static377.method5684(this.aClass87_Sub2_16, 0, this.aClass88_Sub2_Sub1_2.anInt6223, 0, this.aClass88_Sub2_Sub1_2.anInt6219);
		this.anInt5507 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()I")
	@Override
	public int method4588() {
		return this.aClass88_Sub2_Sub1_2.anInt6219 + this.anInt5499 + this.anInt5497;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	@Override
	public int method4576() {
		return this.anInt5504 + this.aClass88_Sub2_Sub1_2.anInt6223 + this.anInt5500;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	private void method4598() {
		this.aClass87_Sub2_16.method6155(1);
		this.aClass87_Sub2_16.method6167(null);
		this.aClass87_Sub2_16.method6227(8448, 8448);
		this.aClass87_Sub2_16.method6206(1, 768, 34168);
		this.aClass87_Sub2_16.method6195(5890, 0);
		this.aClass87_Sub2_16.method6155(0);
		this.aClass87_Sub2_16.method6206(1, 768, 34168);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass88_Sub2_Sub1_2.method6981(true);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6196(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean420) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method4588();
			@Pc(55) float local55 = (float) arg3 / (float) this.method4576();
			@Pc(64) float local64 = (float) arg0 + local48 * (float) this.anInt5499;
			@Pc(73) float local73 = local55 * (float) this.anInt5500 + (float) arg1;
			@Pc(82) float local82 = local64 + local48 * (float) this.aClass88_Sub2_Sub1_2.anInt6219;
			@Pc(91) float local91 = local73 + local55 * (float) this.aClass88_Sub2_Sub1_2.anInt6223;
			if (this.aClass88_Sub2_Sub1_1 == null) {
				this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
				this.aClass87_Sub2_16.method6159(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method4599(arg4);
				this.aClass88_Sub2_Sub1_1.method6981(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method4598();
			}
		} else if (this.aClass88_Sub2_Sub1_1 == null) {
			this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
			this.aClass87_Sub2_16.method6159(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4599(arg4);
			this.aClass88_Sub2_Sub1_1.method6981(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4598();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass88_Sub2_Sub1_2.method6981(false);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6196(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5499;
		@Pc(42) int local42 = arg1 + this.anInt5500;
		if (this.aClass88_Sub2_Sub1_1 == null) {
			this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
			this.aClass87_Sub2_16.method6159(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass88_Sub2_Sub1_2.anInt6223);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
			OpenGL.glVertex2i(this.aClass88_Sub2_Sub1_2.anInt6219 + local37, local42 + this.aClass88_Sub2_Sub1_2.anInt6223);
			OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
			OpenGL.glVertex2i(local37 + this.aClass88_Sub2_Sub1_2.anInt6219, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4599(arg2);
		this.aClass88_Sub2_Sub1_1.method6981(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass88_Sub2_Sub1_2.anInt6223 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass88_Sub2_Sub1_2.anInt6219, this.aClass88_Sub2_Sub1_2.anInt6223 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glVertex2i(this.aClass88_Sub2_Sub1_2.anInt6219 + local37, local42);
		OpenGL.glEnd();
		this.method4598();
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5497 = arg2;
		this.anInt5499 = arg0;
		this.anInt5504 = arg3;
		this.anInt5500 = arg1;
		this.aBoolean420 = this.anInt5499 != 0 || this.anInt5500 != 0 || this.anInt5497 != 0 || this.anInt5504 != 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass88_Sub2_Sub1_2.method5205(arg2, arg5, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V")
	private void method4599(@OriginalArg(1) int arg0) {
		this.aClass87_Sub2_16.method6155(1);
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
		this.aClass87_Sub2_16.method6227(this.aClass87_Sub2_16.method6192(arg0), 7681);
		this.aClass87_Sub2_16.method6206(1, 768, 34167);
		this.aClass87_Sub2_16.method6195(34168, 0);
		this.aClass87_Sub2_16.method6155(0);
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_1);
		this.aClass87_Sub2_16.method6227(34479, 7681);
		this.aClass87_Sub2_16.method6206(1, 768, 34166);
		if (this.anInt5507 == 0) {
			this.aClass87_Sub2_16.method6185(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5507 == 1) {
			this.aClass87_Sub2_16.method6185(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5507 == 2) {
			this.aClass87_Sub2_16.method6185(0.5F, 1.0F, 0.0F, 0.5F);
			return;
		} else if (this.anInt5507 == 3) {
			this.aClass87_Sub2_16.method6185(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class88_Sub2_Sub1 local9 = local6.aClass88_Sub2_Sub1_3;
		this.aClass88_Sub2_Sub1_2.method6981(false);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
		this.aClass87_Sub2_16.method6159(1);
		this.aClass87_Sub2_16.method6155(1);
		this.aClass87_Sub2_16.method6167(local9);
		this.aClass87_Sub2_16.method6227(7681, 8448);
		this.aClass87_Sub2_16.method6206(0, 768, 34168);
		this.aClass87_Sub2_16.method6196(1);
		@Pc(62) int local62 = arg1 + this.anInt5500;
		@Pc(67) int local67 = arg0 + this.anInt5499;
		@Pc(73) int local73 = local67 + this.aClass88_Sub2_Sub1_2.anInt6219;
		@Pc(79) int local79 = local62 + this.aClass88_Sub2_Sub1_2.anInt6223;
		@Pc(86) float local86 = local9.aFloat153 / (float) local9.anInt6219;
		@Pc(93) float local93 = local9.aFloat152 / (float) local9.anInt6223;
		@Pc(101) float local101 = (float) (local67 - arg3) * local86;
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat152 - local93 * (float) (local62 - arg4);
		@Pc(130) float local130 = local9.aFloat152 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local67, local62 + this.aClass88_Sub2_Sub1_2.anInt6223);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local130);
		OpenGL.glVertex2i(local67 + this.aClass88_Sub2_Sub1_2.anInt6219, local62 - -this.aClass88_Sub2_Sub1_2.anInt6223);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(this.aClass88_Sub2_Sub1_2.anInt6219 + local67, local62);
		OpenGL.glEnd();
		this.aClass87_Sub2_16.method6206(0, 768, 5890);
		this.aClass87_Sub2_16.method6159(0);
		this.aClass87_Sub2_16.method6167(null);
		this.aClass87_Sub2_16.method6155(0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass88_Sub2_Sub1_2.method6981(false);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
		this.aClass87_Sub2_16.method6196(arg6);
		this.aClass87_Sub2_16.method6159(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass88_Sub2_Sub1_2.aBoolean473 && !this.aBoolean420) {
			@Pc(346) float local346 = this.aClass88_Sub2_Sub1_2.aFloat152 * (float) arg3 / (float) this.aClass88_Sub2_Sub1_2.anInt6223;
			@Pc(358) float local358 = (float) arg2 * this.aClass88_Sub2_Sub1_2.aFloat153 / (float) this.aClass88_Sub2_Sub1_2.anInt6219;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local346);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local358, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local358, local346);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5499, (float) this.anInt5500, 0.0F);
		@Pc(72) int local72 = this.method4588();
		@Pc(75) int local75 = this.method4576();
		@Pc(81) int local81 = this.aClass88_Sub2_Sub1_2.anInt6223 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local81 <= local13) {
			local93 = arg0 + this.aClass88_Sub2_Sub1_2.anInt6219;
			@Pc(95) int local95 = arg0;
			while (local93 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local95 < local9) {
				@Pc(162) float local162 = (float) (local9 - local95) * this.aClass88_Sub2_Sub1_2.aFloat153 / (float) this.aClass88_Sub2_Sub1_2.anInt6219;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local162, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local162, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local13) {
			@Pc(228) float local228 = this.aClass88_Sub2_Sub1_2.aFloat152 * (float) (local85 + this.aClass88_Sub2_Sub1_2.anInt6223 - local13) / (float) this.aClass88_Sub2_Sub1_2.anInt6223;
			@Pc(234) int local234 = arg0 + this.aClass88_Sub2_Sub1_2.anInt6219;
			local93 = arg0;
			while (local234 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local93, local13);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, local228);
				OpenGL.glVertex2i(local234, local13);
				OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local234, local85);
				local234 += local72;
				local93 += local72;
			}
			if (local9 > local93) {
				@Pc(303) float local303 = (float) (local9 - local93) * this.aClass88_Sub2_Sub1_2.aFloat153 / (float) this.aClass88_Sub2_Sub1_2.anInt6219;
				OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local93, local13);
				OpenGL.glTexCoord2f(local303, local228);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local303, this.aClass88_Sub2_Sub1_2.aFloat152);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method4589(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class88_Sub2_Sub1 local7 = ((Class1_Sub3) arg6).aClass88_Sub2_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean420) {
			local14 = this.method4588();
			local18 = this.method4576();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local36 * (float) this.anInt5500;
			@Pc(55) float local55 = (float) this.anInt5500 * local43;
			@Pc(61) float local61 = (float) this.anInt5499 * local24;
			@Pc(67) float local67 = (float) this.anInt5499 * local30;
			@Pc(74) float local74 = (float) this.anInt5497 * -local24;
			@Pc(81) float local81 = -local30 * (float) this.anInt5497;
			@Pc(88) float local88 = -local36 * (float) this.anInt5504;
			@Pc(95) float local95 = (float) this.anInt5504 * -local43;
			arg1 = local67 + arg1 + local55;
			arg3 = local55 + arg3 + local81;
			arg2 = local49 + arg2 + local74;
			arg0 = local61 + arg0 + local49;
			arg4 = local88 + arg4 + local61;
			arg5 = local95 + arg5 + local67;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass88_Sub2_Sub1_2.method6981(true);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
		this.aClass87_Sub2_16.method6159(1);
		this.aClass87_Sub2_16.method6155(1);
		this.aClass87_Sub2_16.method6167(local7);
		this.aClass87_Sub2_16.method6227(7681, 8448);
		this.aClass87_Sub2_16.method6206(0, 768, 34168);
		this.aClass87_Sub2_16.method6196(1);
		local24 = local7.aFloat153 / (float) local7.anInt6219;
		local30 = local7.aFloat152 / (float) local7.anInt6223;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat152 - local30 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat152 - local30 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat152 - (local18 - (float) arg8) * local30);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat152 - local30 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass87_Sub2_16.method6206(0, 768, 5890);
		this.aClass87_Sub2_16.method6159(0);
		this.aClass87_Sub2_16.method6167(null);
		this.aClass87_Sub2_16.method6155(0);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()I")
	@Override
	public int method4579() {
		return this.aClass88_Sub2_Sub1_2.anInt6219;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
	@Override
	public int method4595() {
		return this.aClass88_Sub2_Sub1_2.anInt6223;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method4590(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean420) {
			local10 = this.method4588();
			local14 = this.method4576();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local32 * (float) this.anInt5500;
			@Pc(51) float local51 = local39 * (float) this.anInt5500;
			@Pc(57) float local57 = (float) this.anInt5499 * local20;
			@Pc(63) float local63 = local26 * (float) this.anInt5499;
			@Pc(70) float local70 = -local20 * (float) this.anInt5497;
			@Pc(77) float local77 = -local26 * (float) this.anInt5497;
			@Pc(84) float local84 = (float) this.anInt5504 * -local32;
			arg0 = local57 + arg0 + local45;
			arg2 = local45 + arg2 + local70;
			arg3 = local51 + local77 + arg3;
			@Pc(109) float local109 = (float) this.anInt5504 * -local39;
			arg1 = local63 + arg1 + local51;
			arg4 = local57 + arg4 + local84;
			arg5 = arg5 + local63 + local109;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass88_Sub2_Sub1_2.method6981(true);
		this.aClass87_Sub2_16.method6197();
		this.aClass87_Sub2_16.method6167(this.aClass88_Sub2_Sub1_2);
		this.aClass87_Sub2_16.method6196(1);
		this.aClass87_Sub2_16.method6159(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass88_Sub2_Sub1_2.aFloat153, this.aClass88_Sub2_Sub1_2.aFloat152);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}
}
