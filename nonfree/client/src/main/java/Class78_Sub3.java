import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!eb;")
	private Class77_Sub1_Sub1 aClass77_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
	private boolean aBoolean453 = false;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt6234 = 0;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	private int anInt6233 = 0;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt6232 = 0;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private int anInt6245 = 0;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt6240 = 0;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_22;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!eb;")
	public final Class77_Sub1_Sub1 aClass77_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!kga;IIZ)V")
	public Class78_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass44_Sub3_22 = arg0;
		this.aClass77_Sub1_Sub1_2 = Static338.method8131(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!kga;IIII)V")
	public Class78_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass44_Sub3_22 = arg0;
		this.aClass77_Sub1_Sub1_2 = Static538.method7150(arg1, arg4, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!kga;II[III)V")
	public Class78_Sub3(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass44_Sub3_22 = arg0;
		this.aClass77_Sub1_Sub1_2 = Static249.method4008(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass77_Sub1_Sub1_2.method7076(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
		this.aClass44_Sub3_22.method4669(arg6);
		this.aClass44_Sub3_22.method4658(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass77_Sub1_Sub1_2.aBoolean170 && !this.aBoolean453) {
			@Pc(353) float local353 = this.aClass77_Sub1_Sub1_2.aFloat89 * (float) arg3 / (float) this.aClass77_Sub1_Sub1_2.anInt2403;
			@Pc(365) float local365 = this.aClass77_Sub1_Sub1_2.aFloat88 * (float) arg2 / (float) this.aClass77_Sub1_Sub1_2.anInt2401;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local353);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local365, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local365, local353);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6240, (float) this.anInt6232, 0.0F);
		@Pc(74) int local74 = this.A();
		@Pc(77) int local77 = this.ca();
		@Pc(83) int local83 = this.aClass77_Sub1_Sub1_2.anInt2403 + arg1;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(96) int local96;
		while (local20 >= local83) {
			local96 = arg0 + this.aClass77_Sub1_Sub1_2.anInt2401;
			@Pc(98) int local98 = arg0;
			while (local96 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
				OpenGL.glVertex2i(local96, local83);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local96, local87);
				local96 += local74;
				local98 += local74;
			}
			if (local10 > local98) {
				@Pc(161) float local161 = (float) (local10 - local98) * this.aClass77_Sub1_Sub1_2.aFloat88 / (float) this.aClass77_Sub1_Sub1_2.anInt2401;
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(local161, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local161, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local10, local87);
			}
			local87 += local77;
			local83 += local77;
		}
		if (local87 < local20) {
			@Pc(231) float local231 = this.aClass77_Sub1_Sub1_2.aFloat89 * (float) (this.aClass77_Sub1_Sub1_2.anInt2403 + local87 - local20) / (float) this.aClass77_Sub1_Sub1_2.anInt2403;
			@Pc(237) int local237 = arg0 + this.aClass77_Sub1_Sub1_2.anInt2401;
			local96 = arg0;
			while (local237 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local96, local20);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, local231);
				OpenGL.glVertex2i(local237, local20);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local237, local87);
				local237 += local74;
				local96 += local74;
			}
			if (local10 > local96) {
				@Pc(310) float local310 = (float) (local10 - local96) * this.aClass77_Sub1_Sub1_2.aFloat88 / (float) this.aClass77_Sub1_Sub1_2.anInt2401;
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local96, local20);
				OpenGL.glTexCoord2f(local310, local231);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local310, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt6240 + this.aClass77_Sub1_Sub1_2.anInt2401 + this.anInt6245;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method8186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class6_Sub3 local6 = (Class6_Sub3) arg2;
		@Pc(9) Class77_Sub1_Sub1 local9 = local6.aClass77_Sub1_Sub1_4;
		this.aClass77_Sub1_Sub1_2.method7076(false);
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
		this.aClass44_Sub3_22.method4658(1);
		this.aClass44_Sub3_22.method4648(1);
		this.aClass44_Sub3_22.method4605(local9);
		this.aClass44_Sub3_22.method4621(7681, 8448);
		this.aClass44_Sub3_22.method4641(768, 0, 34168);
		this.aClass44_Sub3_22.method4669(1);
		@Pc(62) int local62 = arg0 + this.anInt6240;
		@Pc(67) int local67 = arg1 + this.anInt6232;
		@Pc(74) int local74 = local62 + this.aClass77_Sub1_Sub1_2.anInt2401;
		@Pc(80) int local80 = local67 + this.aClass77_Sub1_Sub1_2.anInt2403;
		@Pc(87) float local87 = local9.aFloat88 / (float) local9.anInt2401;
		@Pc(94) float local94 = local9.aFloat89 / (float) local9.anInt2403;
		@Pc(101) float local101 = local87 * (float) (local62 - arg3);
		@Pc(109) float local109 = (float) (local74 - arg3) * local87;
		@Pc(120) float local120 = local9.aFloat89 - (float) (local67 - arg4) * local94;
		@Pc(131) float local131 = local9.aFloat89 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass77_Sub1_Sub1_2.anInt2403);
		OpenGL.glMultiTexCoord2f(33984, this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass77_Sub1_Sub1_2.anInt2401, local67 - -this.aClass77_Sub1_Sub1_2.anInt2403);
		OpenGL.glMultiTexCoord2f(33984, this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local62 + this.aClass77_Sub1_Sub1_2.anInt2401, local67);
		OpenGL.glEnd();
		this.aClass44_Sub3_22.method4641(768, 0, 5890);
		this.aClass44_Sub3_22.method4658(0);
		this.aClass44_Sub3_22.method4605(null);
		this.aClass44_Sub3_22.method4648(0);
	}

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass77_Sub1_Sub1_2.method7076(false);
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4669(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6232;
		@Pc(42) int local42 = arg0 + this.anInt6240;
		if (this.aClass77_Sub1_Sub1_3 == null) {
			this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
			this.aClass44_Sub3_22.method4658(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass77_Sub1_Sub1_2.anInt2403);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass77_Sub1_Sub1_2.anInt2401, this.aClass77_Sub1_Sub1_2.anInt2403 + local37);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(this.aClass77_Sub1_Sub1_2.anInt2401 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5315(arg2);
		this.aClass77_Sub1_Sub1_3.method7076(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass77_Sub1_Sub1_2.anInt2403);
		OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
		OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
		OpenGL.glVertex2i(this.aClass77_Sub1_Sub1_2.anInt2401 + local42, local37 - -this.aClass77_Sub1_Sub1_2.anInt2403);
		OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glVertex2i(local42 + this.aClass77_Sub1_Sub1_2.anInt2401, local37);
		OpenGL.glEnd();
		this.method5314();
	}

	@OriginalMember(owner = "client!mb", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass77_Sub1_Sub1_2.method2272(arg3, arg1, arg2, arg0, arg4, arg5);
	}

	@OriginalMember(owner = "client!mb", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass77_Sub1_Sub1_2.method7076(true);
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4669(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean453) {
			@Pc(191) float local191 = (float) arg2 / (float) this.A();
			@Pc(198) float local198 = (float) arg3 / (float) this.ca();
			@Pc(207) float local207 = (float) this.anInt6240 * local191 + (float) arg0;
			@Pc(216) float local216 = local198 * (float) this.anInt6232 + (float) arg1;
			@Pc(225) float local225 = local191 * (float) this.aClass77_Sub1_Sub1_2.anInt2401 + local207;
			@Pc(234) float local234 = local216 + local198 * (float) this.aClass77_Sub1_Sub1_2.anInt2403;
			if (this.aClass77_Sub1_Sub1_3 == null) {
				this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
				this.aClass44_Sub3_22.method4658(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
			} else {
				this.method5315(arg4);
				this.aClass77_Sub1_Sub1_3.method7076(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
				this.method5314();
			}
		} else if (this.aClass77_Sub1_Sub1_3 == null) {
			this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
			this.aClass44_Sub3_22.method4658(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5315(arg4);
			this.aClass77_Sub1_Sub1_3.method7076(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5314();
		}
	}

	@OriginalMember(owner = "client!mb", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass77_Sub1_Sub1_3 = Static538.method7150(arg0, this.aClass77_Sub1_Sub1_2.anInt2403, arg1, this.aClass77_Sub1_Sub1_2.anInt2401, this.aClass44_Sub3_22);
		this.anInt6234 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!mb", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean453) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt6232;
			@Pc(48) float local48 = local36 * (float) this.anInt6232;
			@Pc(54) float local54 = local17 * (float) this.anInt6240;
			@Pc(60) float local60 = (float) this.anInt6240 * local23;
			@Pc(67) float local67 = -local17 * (float) this.anInt6245;
			@Pc(74) float local74 = -local23 * (float) this.anInt6245;
			@Pc(81) float local81 = -local29 * (float) this.anInt6233;
			arg4 = arg4 + local54 + local81;
			arg1 = local60 + arg1 + local48;
			arg2 = local67 + arg2 + local42;
			@Pc(106) float local106 = (float) this.anInt6233 * -local36;
			arg0 = local42 + local54 + arg0;
			arg3 = local48 + arg3 + local74;
			arg5 = local106 + arg5 + local60;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass77_Sub1_Sub1_2.method7076(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
		this.aClass44_Sub3_22.method4669(arg8);
		this.aClass44_Sub3_22.method4658(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	private void method5314() {
		this.aClass44_Sub3_22.method4648(1);
		this.aClass44_Sub3_22.method4605(null);
		this.aClass44_Sub3_22.method4621(8448, 8448);
		this.aClass44_Sub3_22.method4641(768, 1, 34168);
		this.aClass44_Sub3_22.method4611(5890, 0);
		this.aClass44_Sub3_22.method4648(0);
		this.aClass44_Sub3_22.method4641(768, 1, 34168);
	}

	@OriginalMember(owner = "client!mb", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.aClass77_Sub1_Sub1_2.anInt2403 + this.anInt6232 + this.anInt6233;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method8195(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class6 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class77_Sub1_Sub1 local7 = ((Class6_Sub3) arg6).aClass77_Sub1_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean453) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt6232;
			@Pc(56) float local56 = (float) this.anInt6232 * local44;
			@Pc(62) float local62 = (float) this.anInt6240 * local24;
			@Pc(68) float local68 = (float) this.anInt6240 * local31;
			@Pc(75) float local75 = (float) this.anInt6245 * -local24;
			@Pc(82) float local82 = (float) this.anInt6245 * -local31;
			@Pc(89) float local89 = -local37 * (float) this.anInt6233;
			arg3 = local82 + arg3 + local56;
			arg4 = local62 + arg4 + local89;
			arg0 = local50 + arg0 + local62;
			@Pc(114) float local114 = -local44 * (float) this.anInt6233;
			arg1 = arg1 + local68 + local56;
			arg2 = arg2 + local75 + local50;
			arg5 = local114 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass77_Sub1_Sub1_2.method7076(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass44_Sub3_22.method4606();
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
		this.aClass44_Sub3_22.method4658(1);
		this.aClass44_Sub3_22.method4648(1);
		this.aClass44_Sub3_22.method4605(local7);
		this.aClass44_Sub3_22.method4621(7681, 8448);
		this.aClass44_Sub3_22.method4641(768, 0, 34168);
		this.aClass44_Sub3_22.method4669(1);
		local24 = local7.aFloat88 / (float) local7.anInt2401;
		local31 = local7.aFloat89 / (float) local7.anInt2403;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat89 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat89 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass77_Sub1_Sub1_2.aFloat88, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat89 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass77_Sub1_Sub1_2.aFloat88, this.aClass77_Sub1_Sub1_2.aFloat89);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat89 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass44_Sub3_22.method4641(768, 0, 5890);
		this.aClass44_Sub3_22.method4658(0);
		this.aClass44_Sub3_22.method4605(null);
		this.aClass44_Sub3_22.method4648(0);
	}

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass77_Sub1_Sub1_2.anInt2403;
	}

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6232 = arg1;
		this.anInt6240 = arg0;
		this.anInt6245 = arg2;
		this.anInt6233 = arg3;
		this.aBoolean453 = this.anInt6240 != 0 || this.anInt6232 != 0 || this.anInt6245 != 0 || this.anInt6233 != 0;
	}

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass77_Sub1_Sub1_2.anInt2401;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	private void method5315(@OriginalArg(1) int arg0) {
		this.aClass44_Sub3_22.method4648(1);
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_2);
		this.aClass44_Sub3_22.method4621(this.aClass44_Sub3_22.method4638(arg0), 7681);
		this.aClass44_Sub3_22.method4641(768, 1, 34167);
		this.aClass44_Sub3_22.method4611(34168, 0);
		this.aClass44_Sub3_22.method4648(0);
		this.aClass44_Sub3_22.method4605(this.aClass77_Sub1_Sub1_3);
		this.aClass44_Sub3_22.method4621(34479, 7681);
		this.aClass44_Sub3_22.method4641(768, 1, 34166);
		if (this.anInt6234 == 0) {
			this.aClass44_Sub3_22.method4656(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt6234 == 1) {
			this.aClass44_Sub3_22.method4656(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt6234 == 2) {
			this.aClass44_Sub3_22.method4656(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt6234 == 3) {
			this.aClass44_Sub3_22.method4656(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}
}
