import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class3_Sub31_Sub1 extends Class3_Sub31 {

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!oa;")
	private Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "[Lclient!oa;")
	private Class66_Sub1[] aClass66_Sub1Array1;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!jj;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Lclient!oa;")
	private Class66_Sub1 aClass66_Sub1_2;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
	private int anInt4334;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "Lclient!b;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
	private int anInt4335;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	private int anInt4336;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "Lclient!b;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "Lclient!b;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "Lclient!jj;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "Lclient!b;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class3_Sub31_Sub1(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
	@Override
	public void method3718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4335 = arg0;
		this.anInt4334 = arg1;
		@Pc(10) int local10 = Static89.method5618(this.anInt4335);
		@Pc(15) int local15 = Static89.method5618(this.anInt4334);
		if (this.anInt4336 == local10 && this.anInt4333 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass66_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass66_Sub1Array1.length; local28++) {
				this.aClass66_Sub1Array1[local28].method4050();
			}
			this.aClass66_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass109_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass109_2 == null) {
						this.aClass109_2 = new Class109(this.aClass122_Sub2_29);
					}
					this.aClass66_Sub1Array1 = new Class66_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass66_Sub1Array1[local55++] = new Class66_Sub1(this.aClass122_Sub2_29, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt4336 = local10;
		this.anInt4333 = local15;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "()Z")
	public boolean method3719() {
		return this.aClass122_Sub2_29.aBoolean355 && this.aClass122_Sub2_29.aBoolean373 && this.aClass122_Sub2_29.aBoolean356;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	@Override
	public void method3714(@OriginalArg(0) int arg0) {
		this.aClass122_Sub2_29.anOpengl2.glUseProgramObjectARB(0);
		this.aClass122_Sub2_29.method4811(1);
		this.aClass122_Sub2_29.method4864(null);
		this.aClass122_Sub2_29.method4811(0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
	@Override
	public int method3712() {
		return 1;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()Z")
	@Override
	public boolean method3716() {
		return this.aClass109_1 != null;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()Z")
	@Override
	public boolean method3713() {
		if (!this.aClass122_Sub2_29.aBoolean355 || !this.aClass122_Sub2_29.aBoolean373 || !this.aClass122_Sub2_29.aBoolean356) {
			return false;
		}
		this.aClass109_1 = new Class109(this.aClass122_Sub2_29);
		this.aClass66_Sub1_1 = new Class66_Sub1(this.aClass122_Sub2_29, 3553, 34842, 256, 256);
		this.aClass66_Sub1_1.method1516(false, false);
		this.aClass66_Sub1_2 = new Class66_Sub1(this.aClass122_Sub2_29, 3553, 34842, 256, 256);
		this.aClass66_Sub1_2.method1516(false, false);
		this.aClass122_Sub2_29.method4833(this.aClass109_1);
		this.aClass109_1.method2436(0, this.aClass66_Sub1_1);
		this.aClass109_1.method2436(1, this.aClass66_Sub1_2);
		this.aClass109_1.method2433(0);
		if (!this.aClass109_1.method2437()) {
			this.aClass122_Sub2_29.method4865(this.aClass109_1);
			return false;
		}
		this.aClass122_Sub2_29.method4865(this.aClass109_1);
		this.aClass17_5 = Static17.method400(this.aClass122_Sub2_29, new Class141[] { Static207.method3582(this.aClass122_Sub2_29, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass17_6 = Static17.method400(this.aClass122_Sub2_29, new Class141[] { Static207.method3582(this.aClass122_Sub2_29, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass17_4 = Static17.method400(this.aClass122_Sub2_29, new Class141[] { Static207.method3582(this.aClass122_Sub2_29, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass17_7 = Static17.method400(this.aClass122_Sub2_29, new Class141[] { Static207.method3582(this.aClass122_Sub2_29, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass17_6 != null && this.aClass17_5 != null && this.aClass17_4 != null && this.aClass17_7 != null;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
	@Override
	public void method3717() {
		this.aClass109_2 = null;
		this.aClass66_Sub1Array1 = null;
		this.aClass109_1 = null;
		this.aClass66_Sub1_1 = null;
		this.aClass66_Sub1_2 = null;
		this.aClass17_5 = null;
		this.aClass17_6 = null;
		this.aClass17_4 = null;
		this.aClass17_7 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!oa;Lclient!oa;)V")
	@Override
	public void method3709(@OriginalArg(0) int arg0, @OriginalArg(1) Class66_Sub1 arg1, @OriginalArg(2) Class66_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_29.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass66_Sub1Array1 == null) {
			this.aClass122_Sub2_29.method4864(arg1);
			this.aClass122_Sub2_29.method4833(this.aClass109_1);
			this.aClass109_1.method2433(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass17_5.anInt524;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static211.aFloat27, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt4335, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt4335, (float) this.anInt4334);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt4334);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass122_Sub2_29.method4833(this.aClass109_2);
			local34 = Static89.method5618(this.anInt4335);
			local39 = Static89.method5618(this.anInt4334);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass109_2.method2436(0, this.aClass66_Sub1Array1[local41]);
				if (local41 == 0) {
					this.aClass122_Sub2_29.method4864(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt4335, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt4335, (float) this.anInt4334);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt4334);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass122_Sub2_29.method4864(this.aClass66_Sub1Array1[local41 - 1]);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass122_Sub2_29.method4865(this.aClass109_2);
			this.aClass122_Sub2_29.method4864(this.aClass66_Sub1Array1[local41 - 1]);
			this.aClass122_Sub2_29.method4833(this.aClass109_1);
			this.aClass109_1.method2433(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass17_6.anInt524;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static211.aFloat27, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass109_1.method2433(1);
		this.aClass122_Sub2_29.method4864(this.aClass66_Sub1_1);
		local34 = this.aClass17_7.anInt524;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass109_1.method2433(0);
		this.aClass122_Sub2_29.method4864(this.aClass66_Sub1_2);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		this.aClass122_Sub2_29.method4865(this.aClass109_1);
		local39 = this.aClass17_4.anInt524;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static211.aFloat29, Static211.aFloat28, 0.0F);
		this.aClass122_Sub2_29.method4811(1);
		this.aClass122_Sub2_29.method4864(this.aClass66_Sub1_1);
		this.aClass122_Sub2_29.method4811(0);
		this.aClass122_Sub2_29.method4864(arg1);
	}
}
