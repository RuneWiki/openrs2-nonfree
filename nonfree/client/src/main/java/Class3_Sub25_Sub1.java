import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class3_Sub25_Sub1 extends Class3_Sub25 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!kh;")
	private Class30_Sub3 aClass30_Sub3_6;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!cd;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	private int anInt5336;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!cd;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	private int anInt5337;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!cd;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!cd;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[Lclient!kh;")
	private Class30_Sub3[] aClass30_Sub3Array4;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!kh;")
	private Class30_Sub3 aClass30_Sub3_7;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Lclient!la;")
	private Class141 aClass141_3;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "Lclient!la;")
	private Class141 aClass141_4;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
	private int anInt5338;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	private int anInt5339;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class3_Sub25_Sub1(@OriginalArg(0) Class155_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
	@Override
	public void method4752() {
		this.aClass141_4 = null;
		this.aClass30_Sub3Array4 = null;
		this.aClass141_3 = null;
		this.aClass30_Sub3_6 = null;
		this.aClass30_Sub3_7 = null;
		this.aClass37_3 = null;
		this.aClass37_2 = null;
		this.aClass37_1 = null;
		this.aClass37_4 = null;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()I")
	@Override
	public int method4759() {
		return 1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	@Override
	public void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5336 = arg0;
		this.anInt5338 = arg1;
		@Pc(10) int local10 = Static338.method5141(this.anInt5336);
		@Pc(15) int local15 = Static338.method5141(this.anInt5338);
		if (this.anInt5339 == local10 && this.anInt5337 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass30_Sub3Array4 != null) {
			for (local28 = 0; local28 < this.aClass30_Sub3Array4.length; local28++) {
				this.aClass30_Sub3Array4[local28].method4609();
			}
			this.aClass30_Sub3Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass141_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass141_4 == null) {
						this.aClass141_4 = new Class141(this.aClass155_Sub1_38);
					}
					this.aClass30_Sub3Array4 = new Class30_Sub3[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass30_Sub3Array4[local55++] = new Class30_Sub3(this.aClass155_Sub1_38, 3553, 34842, local28, local53);
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
		this.anInt5339 = local10;
		this.anInt5337 = local15;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "()Z")
	@Override
	public boolean method4755() {
		return this.aClass141_3 != null;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "()Z")
	@Override
	public boolean method4757() {
		if (!this.aClass155_Sub1_38.aBoolean314 || !this.aClass155_Sub1_38.aBoolean294 || !this.aClass155_Sub1_38.aBoolean293) {
			return false;
		}
		this.aClass141_3 = new Class141(this.aClass155_Sub1_38);
		this.aClass30_Sub3_6 = new Class30_Sub3(this.aClass155_Sub1_38, 3553, 34842, 256, 256);
		this.aClass30_Sub3_6.method4613(false, false);
		this.aClass30_Sub3_7 = new Class30_Sub3(this.aClass155_Sub1_38, 3553, 34842, 256, 256);
		this.aClass30_Sub3_7.method4613(false, false);
		this.aClass155_Sub1_38.method3587(this.aClass141_3);
		this.aClass141_3.method3088(0, this.aClass30_Sub3_6);
		this.aClass141_3.method3088(1, this.aClass30_Sub3_7);
		this.aClass141_3.method3089(0);
		if (!this.aClass141_3.method3093()) {
			this.aClass155_Sub1_38.method3627(this.aClass141_3);
			return false;
		}
		this.aClass155_Sub1_38.method3627(this.aClass141_3);
		this.aClass37_3 = Static40.method645(this.aClass155_Sub1_38, new Class247[] { Static386.method5691(this.aClass155_Sub1_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass37_2 = Static40.method645(this.aClass155_Sub1_38, new Class247[] { Static386.method5691(this.aClass155_Sub1_38, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass37_1 = Static40.method645(this.aClass155_Sub1_38, new Class247[] { Static386.method5691(this.aClass155_Sub1_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass37_4 = Static40.method645(this.aClass155_Sub1_38, new Class247[] { Static386.method5691(this.aClass155_Sub1_38, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass37_2 != null && this.aClass37_3 != null && this.aClass37_1 != null && this.aClass37_4 != null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)V")
	@Override
	public void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub3 arg1, @OriginalArg(2) Class30_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_38.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass30_Sub3Array4 == null) {
			this.aClass155_Sub1_38.method3585(arg1);
			this.aClass155_Sub1_38.method3587(this.aClass141_3);
			this.aClass141_3.method3089(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass37_3.anInt731;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static309.aFloat64, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt5336, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt5336, (float) this.anInt5338);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt5338);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass155_Sub1_38.method3587(this.aClass141_4);
			local34 = Static338.method5141(this.anInt5336);
			local39 = Static338.method5141(this.anInt5338);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass141_4.method3088(0, this.aClass30_Sub3Array4[local41]);
				if (local41 == 0) {
					this.aClass155_Sub1_38.method3585(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt5336, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt5336, (float) this.anInt5338);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt5338);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass155_Sub1_38.method3585(this.aClass30_Sub3Array4[local41 - 1]);
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
			this.aClass155_Sub1_38.method3627(this.aClass141_4);
			this.aClass155_Sub1_38.method3585(this.aClass30_Sub3Array4[local41 - 1]);
			this.aClass155_Sub1_38.method3587(this.aClass141_3);
			this.aClass141_3.method3089(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass37_2.anInt731;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static309.aFloat64, 0.0F, 0.0F);
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
		this.aClass141_3.method3089(1);
		this.aClass155_Sub1_38.method3585(this.aClass30_Sub3_6);
		local34 = this.aClass37_4.anInt731;
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
		this.aClass141_3.method3089(0);
		this.aClass155_Sub1_38.method3585(this.aClass30_Sub3_7);
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
		this.aClass155_Sub1_38.method3627(this.aClass141_3);
		local39 = this.aClass37_1.anInt731;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static309.aFloat62, Static309.aFloat63, 0.0F);
		this.aClass155_Sub1_38.method3590(1);
		this.aClass155_Sub1_38.method3585(this.aClass30_Sub3_6);
		this.aClass155_Sub1_38.method3590(0);
		this.aClass155_Sub1_38.method3585(arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	@Override
	public void method4753(@OriginalArg(0) int arg0) {
		this.aClass155_Sub1_38.anOpengl1.glUseProgramObjectARB(0);
		this.aClass155_Sub1_38.method3590(1);
		this.aClass155_Sub1_38.method3585(null);
		this.aClass155_Sub1_38.method3590(0);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "()Z")
	public boolean method4761() {
		return this.aClass155_Sub1_38.aBoolean314 && this.aClass155_Sub1_38.aBoolean294 && this.aClass155_Sub1_38.aBoolean293;
	}
}
