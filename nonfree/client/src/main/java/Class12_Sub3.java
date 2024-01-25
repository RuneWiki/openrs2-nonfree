import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Lclient!rp;")
	private Class20_Sub3_Sub1 aClass20_Sub3_Sub1_3;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	private int anInt5897 = 0;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	private int anInt5905 = 0;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	private int anInt5906 = 0;

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
	private int anInt5916 = 0;

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	private int anInt5909 = 0;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_24;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "Lclient!rp;")
	private final Class20_Sub3_Sub1 aClass20_Sub3_Sub1_2;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!te;IIII)V")
	public Class12_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass9_Sub3_24 = arg0;
		this.aClass20_Sub3_Sub1_2 = Static135.method2906(arg3, arg2, arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!te;II[III)V")
	public Class12_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass9_Sub3_24 = arg0;
		this.aClass20_Sub3_Sub1_2 = Static141.method2965(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!mr", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass20_Sub3_Sub1_2.method6237(false);
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6654(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5909;
		@Pc(42) int local42 = arg1 + this.anInt5906;
		if (this.aClass20_Sub3_Sub1_3 == null) {
			this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
			this.aClass9_Sub3_24.method6670(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass20_Sub3_Sub1_2.anInt7348 + local42);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass20_Sub3_Sub1_2.anInt7346, local42 + this.aClass20_Sub3_Sub1_2.anInt7348);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(this.aClass20_Sub3_Sub1_2.anInt7346 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5120(arg2);
		this.aClass20_Sub3_Sub1_3.method6237(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass20_Sub3_Sub1_2.anInt7348);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
		OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
		OpenGL.glVertex2i(this.aClass20_Sub3_Sub1_2.anInt7346 + local37, this.aClass20_Sub3_Sub1_2.anInt7348 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glVertex2i(local37 + this.aClass20_Sub3_Sub1_2.anInt7346, local42);
		OpenGL.glEnd();
		this.method5118();
	}

	@OriginalMember(owner = "client!mr", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt5897 + this.aClass20_Sub3_Sub1_2.anInt7346 + this.anInt5909;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class23_Sub1 local6 = (Class23_Sub1) arg2;
		@Pc(9) Class20_Sub3_Sub1 local9 = local6.aClass20_Sub3_Sub1_1;
		this.aClass20_Sub3_Sub1_2.method6237(false);
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
		this.aClass9_Sub3_24.method6670(1);
		this.aClass9_Sub3_24.method6660(1);
		this.aClass9_Sub3_24.method6701(local9);
		this.aClass9_Sub3_24.method6732(7681, 8448);
		this.aClass9_Sub3_24.method6706(34168, 0, 768);
		this.aClass9_Sub3_24.method6654(1);
		@Pc(62) int local62 = arg1 + this.anInt5906;
		@Pc(67) int local67 = arg0 + this.anInt5909;
		@Pc(73) int local73 = local67 + this.aClass20_Sub3_Sub1_2.anInt7346;
		@Pc(80) int local80 = local62 + this.aClass20_Sub3_Sub1_2.anInt7348;
		@Pc(87) float local87 = local9.aFloat146 / (float) local9.anInt7346;
		@Pc(94) float local94 = local9.aFloat147 / (float) local9.anInt7348;
		@Pc(101) float local101 = (float) (local67 - arg3) * local87;
		@Pc(108) float local108 = (float) (local73 - arg3) * local87;
		@Pc(119) float local119 = local9.aFloat147 - (float) (local62 - arg4) * local94;
		@Pc(129) float local129 = local9.aFloat147 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local129);
		OpenGL.glVertex2i(local67, local62 + this.aClass20_Sub3_Sub1_2.anInt7348);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local129);
		OpenGL.glVertex2i(local67 + this.aClass20_Sub3_Sub1_2.anInt7346, this.aClass20_Sub3_Sub1_2.anInt7348 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass20_Sub3_Sub1_2.anInt7346 + local67, local62);
		OpenGL.glEnd();
		this.aClass9_Sub3_24.method6706(5890, 0, 768);
		this.aClass9_Sub3_24.method6670(0);
		this.aClass9_Sub3_24.method6701(null);
		this.aClass9_Sub3_24.method6660(0);
	}

	@OriginalMember(owner = "client!mr", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass20_Sub3_Sub1_3 = Static135.method2906(this.aClass20_Sub3_Sub1_2.anInt7346, arg1, arg0, this.aClass20_Sub3_Sub1_2.anInt7348, this.aClass9_Sub3_24);
		this.anInt5905 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!mr", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass20_Sub3_Sub1_2.method6237(true);
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6654(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean406) {
			@Pc(42) float local42 = (float) arg2 / (float) this.EA();
			@Pc(49) float local49 = (float) arg3 / (float) this.ma();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt5909 * local42;
			@Pc(67) float local67 = (float) arg1 + (float) this.anInt5906 * local49;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass20_Sub3_Sub1_2.anInt7346;
			@Pc(85) float local85 = local49 * (float) this.aClass20_Sub3_Sub1_2.anInt7348 + local67;
			if (this.aClass20_Sub3_Sub1_3 == null) {
				this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
				this.aClass9_Sub3_24.method6670(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method5120(arg4);
				this.aClass20_Sub3_Sub1_3.method6237(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method5118();
			}
		} else if (this.aClass20_Sub3_Sub1_3 == null) {
			this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
			this.aClass9_Sub3_24.method6670(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5120(arg4);
			this.aClass20_Sub3_Sub1_3.method6237(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5118();
		}
	}

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass20_Sub3_Sub1_2.method6237(false);
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
		this.aClass9_Sub3_24.method6654(arg6);
		this.aClass9_Sub3_24.method6670(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass20_Sub3_Sub1_2.aBoolean484 && !this.aBoolean406) {
			@Pc(345) float local345 = (float) arg3 * this.aClass20_Sub3_Sub1_2.aFloat147 / (float) this.aClass20_Sub3_Sub1_2.anInt7348;
			@Pc(357) float local357 = this.aClass20_Sub3_Sub1_2.aFloat146 * (float) arg2 / (float) this.aClass20_Sub3_Sub1_2.anInt7346;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local345);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local357, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local357, local345);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5909, (float) this.anInt5906, 0.0F);
		@Pc(73) int local73 = this.EA();
		@Pc(76) int local76 = this.ma();
		@Pc(82) int local82 = arg1 + this.aClass20_Sub3_Sub1_2.anInt7348;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local14) {
			local95 = arg0 + this.aClass20_Sub3_Sub1_2.anInt7346;
			@Pc(97) int local97 = arg0;
			while (local95 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local95, local86);
				local97 += local73;
				local95 += local73;
			}
			if (local97 < local9) {
				@Pc(160) float local160 = (float) (local9 - local97) * this.aClass20_Sub3_Sub1_2.aFloat146 / (float) this.aClass20_Sub3_Sub1_2.anInt7346;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local160, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local160, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local9, local86);
			}
			local82 += local76;
			local86 += local76;
		}
		if (local86 < local14) {
			@Pc(222) float local222 = (float) (local86 + this.aClass20_Sub3_Sub1_2.anInt7348 - local14) * this.aClass20_Sub3_Sub1_2.aFloat147 / (float) this.aClass20_Sub3_Sub1_2.anInt7348;
			@Pc(229) int local229 = arg0 + this.aClass20_Sub3_Sub1_2.anInt7346;
			local95 = arg0;
			while (local229 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local222);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, local222);
				OpenGL.glVertex2i(local229, local14);
				OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local229, local86);
				local229 += local73;
				local95 += local73;
			}
			if (local95 < local9) {
				@Pc(302) float local302 = (float) (local9 - local95) * this.aClass20_Sub3_Sub1_2.aFloat146 / (float) this.aClass20_Sub3_Sub1_2.anInt7346;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local222);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(local302, local222);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local302, this.aClass20_Sub3_Sub1_2.aFloat147);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mr", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass20_Sub3_Sub1_2.anInt7348;
	}

	@OriginalMember(owner = "client!mr", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass20_Sub3_Sub1_2.method6254(arg0, arg1, arg4, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!mr", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt5916 + this.anInt5906 + this.aClass20_Sub3_Sub1_2.anInt7348;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	private void method5118() {
		this.aClass9_Sub3_24.method6660(1);
		this.aClass9_Sub3_24.method6701(null);
		this.aClass9_Sub3_24.method6732(8448, 8448);
		this.aClass9_Sub3_24.method6706(34168, 1, 768);
		this.aClass9_Sub3_24.method6656(5890, 0);
		this.aClass9_Sub3_24.method6660(0);
		this.aClass9_Sub3_24.method6706(34168, 1, 768);
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass20_Sub3_Sub1_2.anInt7346;
	}

	@OriginalMember(owner = "client!mr", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean406) {
			local10 = this.EA();
			local14 = this.ma();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = (float) this.anInt5906 * local33;
			@Pc(51) float local51 = local39 * (float) this.anInt5906;
			@Pc(57) float local57 = (float) this.anInt5909 * local20;
			@Pc(63) float local63 = (float) this.anInt5909 * local26;
			@Pc(70) float local70 = -local20 * (float) this.anInt5897;
			@Pc(77) float local77 = -local26 * (float) this.anInt5897;
			@Pc(84) float local84 = -local33 * (float) this.anInt5916;
			@Pc(91) float local91 = (float) this.anInt5916 * -local39;
			arg4 = local57 + arg4 + local84;
			arg3 = local77 + arg3 + local51;
			arg0 = local45 + local57 + arg0;
			arg2 = local45 + arg2 + local70;
			arg1 = local63 + arg1 + local51;
			arg5 = local91 + arg5 + local63;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass20_Sub3_Sub1_2.method6237(true);
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
		this.aClass9_Sub3_24.method6654(arg8);
		this.aClass9_Sub3_24.method6670(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mr", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5897 = arg2;
		this.anInt5906 = arg1;
		this.anInt5909 = arg0;
		this.anInt5916 = arg3;
		this.aBoolean406 = this.anInt5909 != 0 || this.anInt5906 != 0 || this.anInt5897 != 0 || this.anInt5916 != 0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7190(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class20_Sub3_Sub1 local7 = ((Class23_Sub1) arg6).aClass20_Sub3_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean406) {
			local14 = this.EA();
			local18 = this.ma();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt5906 * local37;
			@Pc(56) float local56 = local44 * (float) this.anInt5906;
			@Pc(62) float local62 = local24 * (float) this.anInt5909;
			@Pc(68) float local68 = (float) this.anInt5909 * local30;
			@Pc(75) float local75 = -local24 * (float) this.anInt5897;
			@Pc(82) float local82 = (float) this.anInt5897 * -local30;
			@Pc(89) float local89 = -local37 * (float) this.anInt5916;
			arg3 = local56 + local82 + arg3;
			arg0 = arg0 + local62 + local50;
			arg2 = local50 + arg2 + local75;
			@Pc(114) float local114 = -local44 * (float) this.anInt5916;
			arg4 = local89 + local62 + arg4;
			arg1 = local68 + arg1 + local56;
			arg5 = arg5 + local68 + local114;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass20_Sub3_Sub1_2.method6237(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass9_Sub3_24.method6708();
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
		this.aClass9_Sub3_24.method6670(1);
		this.aClass9_Sub3_24.method6660(1);
		this.aClass9_Sub3_24.method6701(local7);
		this.aClass9_Sub3_24.method6732(7681, 8448);
		this.aClass9_Sub3_24.method6706(34168, 0, 768);
		this.aClass9_Sub3_24.method6654(1);
		local24 = local7.aFloat146 / (float) local7.anInt7346;
		local30 = local7.aFloat147 / (float) local7.anInt7348;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat147 - local30 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat147 - local30 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub3_Sub1_2.aFloat146, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat147 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub3_Sub1_2.aFloat146, this.aClass20_Sub3_Sub1_2.aFloat147);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat147 - (arg3 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass9_Sub3_24.method6706(5890, 0, 768);
		this.aClass9_Sub3_24.method6670(0);
		this.aClass9_Sub3_24.method6701(null);
		this.aClass9_Sub3_24.method6660(0);
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(II)V")
	private void method5120(@OriginalArg(1) int arg0) {
		this.aClass9_Sub3_24.method6660(1);
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_2);
		this.aClass9_Sub3_24.method6732(this.aClass9_Sub3_24.method6688(arg0), 7681);
		this.aClass9_Sub3_24.method6706(34167, 1, 768);
		this.aClass9_Sub3_24.method6656(34168, 0);
		this.aClass9_Sub3_24.method6660(0);
		this.aClass9_Sub3_24.method6701(this.aClass20_Sub3_Sub1_3);
		this.aClass9_Sub3_24.method6732(34479, 7681);
		this.aClass9_Sub3_24.method6706(34166, 1, 768);
		if (this.anInt5905 == 0) {
			this.aClass9_Sub3_24.method6709(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt5905 == 1) {
			this.aClass9_Sub3_24.method6709(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5905 == 2) {
			this.aClass9_Sub3_24.method6709(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5905 == 3) {
			this.aClass9_Sub3_24.method6709(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}
}
