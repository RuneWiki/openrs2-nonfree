import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class14_Sub5_Sub1 extends Class14_Sub5 {

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "Lclient!lda;")
	private Class217 aClass217_4;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!sb;")
	private Class161_Sub1 aClass161_Sub1_3;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "Lclient!tw;")
	private Class356 aClass356_2;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "Lclient!tw;")
	private Class356 aClass356_3;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!sb;")
	private Class161_Sub1 aClass161_Sub1_4;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[Lclient!sb;")
	private Class161_Sub1[] aClass161_Sub1Array2;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "Lclient!tw;")
	private Class356 aClass356_4;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!lda;")
	private Class217 aClass217_5;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "I")
	private int anInt6227;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	private int anInt6231;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Lclient!tw;")
	private Class356 aClass356_5;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class14_Sub5_Sub1(@OriginalArg(0) Class144_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(I)Z")
	public boolean method5499() {
		return super.aClass144_Sub3_23.aBoolean576 && super.aClass144_Sub3_23.aBoolean578 && super.aClass144_Sub3_23.aBoolean563;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
	@Override
	public int method5494() {
		return 1;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5496() {
		if (!super.aClass144_Sub3_23.aBoolean576 || !super.aClass144_Sub3_23.aBoolean578 || !super.aClass144_Sub3_23.aBoolean563) {
			return false;
		}
		this.aClass217_4 = new Class217(super.aClass144_Sub3_23);
		this.aClass161_Sub1_4 = new Class161_Sub1(super.aClass144_Sub3_23, 3553, 34842, 256, 256);
		this.aClass161_Sub1_4.method3971(false, false);
		this.aClass161_Sub1_3 = new Class161_Sub1(super.aClass144_Sub3_23, 3553, 34842, 256, 256);
		this.aClass161_Sub1_3.method3971(false, false);
		super.aClass144_Sub3_23.method7006(this.aClass217_4);
		this.aClass217_4.method5186(0, this.aClass161_Sub1_4);
		this.aClass217_4.method5186(1, this.aClass161_Sub1_3);
		this.aClass217_4.method5180(0);
		if (!this.aClass217_4.method5184()) {
			super.aClass144_Sub3_23.method7030(this.aClass217_4);
			return false;
		}
		super.aClass144_Sub3_23.method7030(this.aClass217_4);
		this.aClass356_3 = Static264.method4385(new Class95[] { Static73.method1220("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass144_Sub3_23, 35632) }, super.aClass144_Sub3_23);
		this.aClass356_5 = Static264.method4385(new Class95[] { Static73.method1220("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass144_Sub3_23, 35632) }, super.aClass144_Sub3_23);
		this.aClass356_2 = Static264.method4385(new Class95[] { Static73.method1220("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass144_Sub3_23, 35632) }, super.aClass144_Sub3_23);
		this.aClass356_4 = Static264.method4385(new Class95[] { Static73.method1220("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass144_Sub3_23, 35632) }, super.aClass144_Sub3_23);
		return this.aClass356_5 != null && this.aClass356_3 != null && this.aClass356_2 != null && this.aClass356_4 != null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5485(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass144_Sub3_23.method7028(1);
		super.aClass144_Sub3_23.method6982((Class161) null);
		super.aClass144_Sub3_23.method7028(0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!sb;IILclient!sb;)V")
	@Override
	public void method5493(@OriginalArg(0) Class161_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class161_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(280) long local280;
		if (this.aClass161_Sub1Array2 == null) {
			super.aClass144_Sub3_23.method6982(arg2);
			super.aClass144_Sub3_23.method7006(this.aClass217_4);
			this.aClass217_4.method5180(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local280 = this.aClass356_3.aLong275;
			OpenGL.glUseProgramObjectARB(local280);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local280, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local280, "params"), Static583.aFloat188, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6234, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6234, (float) this.anInt6225);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6225);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass144_Sub3_23.method7006(this.aClass217_5);
			@Pc(32) int local32 = Static64.method1041(this.anInt6234);
			@Pc(37) int local37 = Static64.method1041(this.anInt6225);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass217_5.method5186(0, this.aClass161_Sub1Array2[local39]);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass144_Sub3_23.method6982(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6234, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6234, (float) this.anInt6225);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6225);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass144_Sub3_23.method6982(this.aClass161_Sub1Array2[local39 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass144_Sub3_23.method7030(this.aClass217_5);
			super.aClass144_Sub3_23.method6982(this.aClass161_Sub1Array2[local39 - 1]);
			super.aClass144_Sub3_23.method7006(this.aClass217_4);
			this.aClass217_4.method5180(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(208) long local208 = this.aClass356_5.aLong275;
			OpenGL.glUseProgramObjectARB(local208);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local208, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local208, "params"), Static583.aFloat188, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass217_4.method5180(1);
		super.aClass144_Sub3_23.method6982(this.aClass161_Sub1_4);
		local280 = this.aClass356_4.aLong275;
		OpenGL.glUseProgramObjectARB(local280);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local280, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local280, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass217_4.method5180(0);
		super.aClass144_Sub3_23.method6982(this.aClass161_Sub1_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local280, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		super.aClass144_Sub3_23.method7030(this.aClass217_4);
		@Pc(458) long local458 = this.aClass356_2.aLong275;
		OpenGL.glUseProgramObjectARB(local458);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local458, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local458, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local458, "params"), Static539.aFloat181, Static83.aFloat12, 0.0F);
		super.aClass144_Sub3_23.method7028(1);
		super.aClass144_Sub3_23.method6982(this.aClass161_Sub1_4);
		super.aClass144_Sub3_23.method7028(0);
		super.aClass144_Sub3_23.method6982(arg2);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	@Override
	public void method5491() {
		this.aClass161_Sub1Array2 = null;
		this.aClass356_3 = null;
		this.aClass161_Sub1_3 = null;
		this.aClass356_2 = null;
		this.aClass356_4 = null;
		this.aClass217_5 = null;
		this.aClass161_Sub1_4 = null;
		this.aClass217_4 = null;
		this.aClass356_5 = null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5490() {
		return this.aClass217_4 != null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6225 = arg0;
		this.anInt6234 = arg1;
		@Pc(16) int local16 = Static64.method1041(this.anInt6234);
		@Pc(21) int local21 = Static64.method1041(this.anInt6225);
		if (this.anInt6227 == local16 && local21 == this.anInt6231) {
			return;
		}
		@Pc(47) int local47;
		if (this.aClass161_Sub1Array2 != null) {
			for (local47 = 0; local47 < this.aClass161_Sub1Array2.length; local47++) {
				this.aClass161_Sub1Array2[local47].method9167();
			}
			this.aClass161_Sub1Array2 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass217_5 = null;
		} else {
			local47 = local16;
			@Pc(93) int local93 = local21;
			@Pc(95) int local95 = 0;
			if (this.aClass217_5 == null) {
				this.aClass217_5 = new Class217(super.aClass144_Sub3_23);
			}
			label54: while (true) {
				if (local47 <= 256 && local93 <= 256) {
					local93 = local21;
					this.aClass161_Sub1Array2 = new Class161_Sub1[local95];
					local47 = local16;
					local95 = 0;
					while (true) {
						if (local47 <= 256 && local93 <= 256) {
							break label54;
						}
						this.aClass161_Sub1Array2[local95++] = new Class161_Sub1(super.aClass144_Sub3_23, 3553, 34842, local47, local93);
						if (local47 > 256) {
							local47 >>= 0x1;
						}
						if (local93 > 256) {
							local93 >>= 0x1;
						}
					}
				}
				local95++;
				if (local47 > 256) {
					local47 >>= 0x1;
				}
				if (local93 > 256) {
					local93 >>= 0x1;
				}
			}
		}
		this.anInt6231 = local21;
		this.anInt6227 = local16;
	}
}
