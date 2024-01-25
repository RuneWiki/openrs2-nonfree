import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "Lclient!ei;")
	private Class3_Sub1_Sub1 aClass3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	private int anInt5573 = 0;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	private int anInt5580 = 0;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
	private int anInt5583 = 0;

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
	private int anInt5587 = 0;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
	private int anInt5589 = 0;

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "Z")
	private boolean aBoolean441 = false;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_25;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Lclient!ei;")
	public final Class3_Sub1_Sub1 aClass3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!uca;IIZ)V")
	public Class38_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass162_Sub3_25 = arg0;
		this.aClass3_Sub1_Sub1_2 = Static295.method4259(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!uca;IIII)V")
	public Class38_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass162_Sub3_25 = arg0;
		this.aClass3_Sub1_Sub1_2 = Static89.method1338(arg4, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!uca;II[III)V")
	public Class38_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass162_Sub3_25 = arg0;
		this.aClass3_Sub1_Sub1_2 = Static161.method5444(arg4, arg3, arg1, arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
	private void method4812(@OriginalArg(1) int arg0) {
		this.aClass162_Sub3_25.method6947(1);
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
		this.aClass162_Sub3_25.method6903(this.aClass162_Sub3_25.method6962(arg0), 7681);
		this.aClass162_Sub3_25.method6957(34167, 768, 1);
		this.aClass162_Sub3_25.method6926(34168, 0);
		this.aClass162_Sub3_25.method6947(0);
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_3);
		this.aClass162_Sub3_25.method6903(34479, 7681);
		this.aClass162_Sub3_25.method6957(34166, 768, 1);
		if (this.anInt5580 == 0) {
			this.aClass162_Sub3_25.method6952(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5580 == 1) {
			this.aClass162_Sub3_25.method6952(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5580 == 2) {
			this.aClass162_Sub3_25.method6952(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt5580 == 3) {
			this.aClass162_Sub3_25.method6952(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!mp", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt5573 + this.anInt5587 + this.aClass3_Sub1_Sub1_2.anInt2081;
	}

	@OriginalMember(owner = "client!mp", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass3_Sub1_Sub1_2.method5571(true);
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6923(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean441) {
			@Pc(188) float local188 = (float) arg2 / (float) this.A();
			@Pc(195) float local195 = (float) arg3 / (float) this.ca();
			@Pc(204) float local204 = (float) arg0 + (float) this.anInt5589 * local188;
			@Pc(213) float local213 = (float) this.anInt5587 * local195 + (float) arg1;
			@Pc(222) float local222 = (float) this.aClass3_Sub1_Sub1_2.anInt2079 * local188 + local204;
			@Pc(231) float local231 = local213 + local195 * (float) this.aClass3_Sub1_Sub1_2.anInt2081;
			if (this.aClass3_Sub1_Sub1_3 == null) {
				this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
				this.aClass162_Sub3_25.method6953(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
			} else {
				this.method4812(arg4);
				this.aClass3_Sub1_Sub1_3.method5571(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
				this.method4814();
			}
		} else if (this.aClass3_Sub1_Sub1_3 == null) {
			this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
			this.aClass162_Sub3_25.method6953(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4812(arg4);
			this.aClass3_Sub1_Sub1_3.method5571(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method4814();
		}
	}

	@OriginalMember(owner = "client!mp", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass3_Sub1_Sub1_2.anInt2079;
	}

	@OriginalMember(owner = "client!mp", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean441) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(38) float local38 = (arg5 - arg1) / local10;
			@Pc(44) float local44 = local31 * (float) this.anInt5587;
			@Pc(50) float local50 = (float) this.anInt5587 * local38;
			@Pc(56) float local56 = local17 * (float) this.anInt5589;
			@Pc(62) float local62 = (float) this.anInt5589 * local24;
			@Pc(69) float local69 = -local17 * (float) this.anInt5583;
			@Pc(76) float local76 = (float) this.anInt5583 * -local24;
			@Pc(83) float local83 = (float) this.anInt5573 * -local31;
			arg0 = arg0 + local56 + local44;
			arg1 = local62 + arg1 + local50;
			@Pc(102) float local102 = (float) this.anInt5573 * -local38;
			arg3 = local50 + local76 + arg3;
			arg4 = arg4 + local56 + local83;
			arg2 = local69 + arg2 + local44;
			arg5 = local62 + arg5 + local102;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass3_Sub1_Sub1_2.method5571(true);
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
		this.aClass162_Sub3_25.method6923(arg8);
		this.aClass162_Sub3_25.method6953(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mp", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass3_Sub1_Sub1_2.method5571(false);
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
		this.aClass162_Sub3_25.method6923(arg6);
		this.aClass162_Sub3_25.method6953(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass3_Sub1_Sub1_2.aBoolean138 && !this.aBoolean441) {
			@Pc(73) float local73 = (float) arg3 * this.aClass3_Sub1_Sub1_2.aFloat52 / (float) this.aClass3_Sub1_Sub1_2.anInt2081;
			@Pc(85) float local85 = (float) arg2 * this.aClass3_Sub1_Sub1_2.aFloat53 / (float) this.aClass3_Sub1_Sub1_2.anInt2079;
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
		OpenGL.glTranslatef((float) this.anInt5589, (float) this.anInt5587, 0.0F);
		@Pc(125) int local125 = this.A();
		@Pc(128) int local128 = this.ca();
		@Pc(135) int local135 = arg1 + this.aClass3_Sub1_Sub1_2.anInt2081;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local135 <= local14) {
			local147 = arg0 + this.aClass3_Sub1_Sub1_2.anInt2079;
			@Pc(149) int local149 = arg0;
			while (local9 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local147, local139);
				local147 += local125;
				local149 += local125;
			}
			if (local9 > local149) {
				@Pc(212) float local212 = this.aClass3_Sub1_Sub1_2.aFloat53 * (float) (local9 - local149) / (float) this.aClass3_Sub1_Sub1_2.anInt2079;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local212, 0.0F);
				OpenGL.glVertex2i(local9, local135);
				OpenGL.glTexCoord2f(local212, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local9, local139);
			}
			local135 += local128;
			local139 += local128;
		}
		if (local14 > local139) {
			@Pc(277) float local277 = this.aClass3_Sub1_Sub1_2.aFloat52 * (float) (local139 + this.aClass3_Sub1_Sub1_2.anInt2081 - local14) / (float) this.aClass3_Sub1_Sub1_2.anInt2081;
			@Pc(283) int local283 = this.aClass3_Sub1_Sub1_2.anInt2079 + arg0;
			local147 = arg0;
			while (local9 >= local283) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, local277);
				OpenGL.glVertex2i(local283, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local283, local139);
				local283 += local125;
				local147 += local125;
			}
			if (local9 > local147) {
				@Pc(348) float local348 = (float) (local9 - local147) * this.aClass3_Sub1_Sub1_2.aFloat53 / (float) this.aClass3_Sub1_Sub1_2.anInt2079;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local14);
				OpenGL.glTexCoord2f(local348, local277);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local348, this.aClass3_Sub1_Sub1_2.aFloat52);
				OpenGL.glVertex2i(local9, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mp", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass3_Sub1_Sub1_3 = Static89.method1338(this.aClass3_Sub1_Sub1_2.anInt2081, arg0, this.aClass3_Sub1_Sub1_2.anInt2079, this.aClass162_Sub3_25, arg1);
		this.anInt5580 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	private void method4814() {
		this.aClass162_Sub3_25.method6947(1);
		this.aClass162_Sub3_25.method6911(null);
		this.aClass162_Sub3_25.method6903(8448, 8448);
		this.aClass162_Sub3_25.method6957(34168, 768, 1);
		this.aClass162_Sub3_25.method6926(5890, 0);
		this.aClass162_Sub3_25.method6947(0);
		this.aClass162_Sub3_25.method6957(34168, 768, 1);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class84 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class3_Sub1_Sub1 local7 = ((Class84_Sub3) arg6).aClass3_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean441) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt5587;
			@Pc(55) float local55 = local43 * (float) this.anInt5587;
			@Pc(61) float local61 = (float) this.anInt5589 * local24;
			@Pc(67) float local67 = (float) this.anInt5589 * local30;
			@Pc(74) float local74 = -local24 * (float) this.anInt5583;
			@Pc(81) float local81 = -local30 * (float) this.anInt5583;
			@Pc(88) float local88 = -local37 * (float) this.anInt5573;
			arg4 = local88 + local61 + arg4;
			arg0 = local61 + arg0 + local49;
			arg3 = local55 + local81 + arg3;
			@Pc(113) float local113 = (float) this.anInt5573 * -local43;
			arg2 = local74 + arg2 + local49;
			arg1 = local67 + arg1 + local55;
			arg5 = local113 + arg5 + local67;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass3_Sub1_Sub1_2.method5571(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
		this.aClass162_Sub3_25.method6953(1);
		this.aClass162_Sub3_25.method6947(1);
		this.aClass162_Sub3_25.method6911(local7);
		this.aClass162_Sub3_25.method6903(7681, 8448);
		this.aClass162_Sub3_25.method6957(34168, 768, 0);
		this.aClass162_Sub3_25.method6923(1);
		local24 = local7.aFloat53 / (float) local7.anInt2079;
		local30 = local7.aFloat52 / (float) local7.anInt2081;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat52 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat52 - local30 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat52 - ((float) -arg8 + local18) * local30);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local24, local7.aFloat52 - local30 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass162_Sub3_25.method6957(5890, 768, 0);
		this.aClass162_Sub3_25.method6953(0);
		this.aClass162_Sub3_25.method6911(null);
		this.aClass162_Sub3_25.method6947(0);
	}

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5573 = arg3;
		this.anInt5589 = arg0;
		this.anInt5583 = arg2;
		this.anInt5587 = arg1;
		this.aBoolean441 = this.anInt5589 != 0 || this.anInt5587 != 0 || this.anInt5583 != 0 || this.anInt5573 != 0;
	}

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass3_Sub1_Sub1_2.anInt2081;
	}

	@OriginalMember(owner = "client!mp", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass3_Sub1_Sub1_2.method5571(false);
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6923(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5589;
		@Pc(42) int local42 = arg1 + this.anInt5587;
		if (this.aClass3_Sub1_Sub1_3 == null) {
			this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
			this.aClass162_Sub3_25.method6953(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass3_Sub1_Sub1_2.anInt2081 + local42);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass3_Sub1_Sub1_2.anInt2079, local42 - -this.aClass3_Sub1_Sub1_2.anInt2081);
			OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
			OpenGL.glVertex2i(local37 + this.aClass3_Sub1_Sub1_2.anInt2079, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4812(arg2);
		this.aClass3_Sub1_Sub1_3.method5571(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass3_Sub1_Sub1_2.anInt2081 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
		OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass3_Sub1_Sub1_2.anInt2079, this.aClass3_Sub1_Sub1_2.anInt2081 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glTexCoord2f(this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glVertex2i(this.aClass3_Sub1_Sub1_2.anInt2079 + local37, local42);
		OpenGL.glEnd();
		this.method4814();
	}

	@OriginalMember(owner = "client!mp", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass3_Sub1_Sub1_2.method1721(arg0, arg4, arg5, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!mp", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt5589 + this.aClass3_Sub1_Sub1_2.anInt2079 + this.anInt5583;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class84_Sub3 local6 = (Class84_Sub3) arg2;
		@Pc(9) Class3_Sub1_Sub1 local9 = local6.aClass3_Sub1_Sub1_1;
		this.aClass3_Sub1_Sub1_2.method5571(false);
		this.aClass162_Sub3_25.method6950();
		this.aClass162_Sub3_25.method6911(this.aClass3_Sub1_Sub1_2);
		this.aClass162_Sub3_25.method6953(1);
		this.aClass162_Sub3_25.method6947(1);
		this.aClass162_Sub3_25.method6911(local9);
		this.aClass162_Sub3_25.method6903(7681, 8448);
		this.aClass162_Sub3_25.method6957(34168, 768, 0);
		this.aClass162_Sub3_25.method6923(1);
		@Pc(62) int local62 = arg0 + this.anInt5589;
		@Pc(67) int local67 = arg1 + this.anInt5587;
		@Pc(73) int local73 = local62 + this.aClass3_Sub1_Sub1_2.anInt2079;
		@Pc(79) int local79 = this.aClass3_Sub1_Sub1_2.anInt2081 + local67;
		@Pc(86) float local86 = local9.aFloat53 / (float) local9.anInt2079;
		@Pc(93) float local93 = local9.aFloat52 / (float) local9.anInt2081;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(121) float local121 = local9.aFloat52 - local93 * (float) (local67 - arg4);
		@Pc(133) float local133 = local9.aFloat52 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local133);
		OpenGL.glVertex2i(local62, this.aClass3_Sub1_Sub1_2.anInt2081 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub1_Sub1_2.aFloat53, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local133);
		OpenGL.glVertex2i(this.aClass3_Sub1_Sub1_2.anInt2079 + local62, local67 - -this.aClass3_Sub1_Sub1_2.anInt2081);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub1_Sub1_2.aFloat53, this.aClass3_Sub1_Sub1_2.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass3_Sub1_Sub1_2.anInt2079 + local62, local67);
		OpenGL.glEnd();
		this.aClass162_Sub3_25.method6957(5890, 768, 0);
		this.aClass162_Sub3_25.method6953(0);
		this.aClass162_Sub3_25.method6911(null);
		this.aClass162_Sub3_25.method6947(0);
	}
}
