import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class3_Sub21_Sub1 extends Class3_Sub21 {

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!hga;")
	private Class121_Sub2 aClass121_Sub2_2;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!tt;")
	private Class324 aClass324_3;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Lclient!hga;")
	private Class121_Sub2 aClass121_Sub2_3;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	private int anInt3913;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Lclient!ua;")
	private Class326 aClass326_2;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	private int anInt3915;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "Lclient!ua;")
	private Class326 aClass326_3;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "Lclient!ua;")
	private Class326 aClass326_4;

	@OriginalMember(owner = "client!fr", name = "H", descriptor = "Lclient!tt;")
	private Class324 aClass324_4;

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "Lclient!ua;")
	private Class326 aClass326_5;

	@OriginalMember(owner = "client!fr", name = "M", descriptor = "[Lclient!hga;")
	private Class121_Sub2[] aClass121_Sub2Array3;

	@OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
	private int anInt3924;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class3_Sub21_Sub1(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	@Override
	public int method3426() {
		return 1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)V")
	@Override
	public void method3424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3913 = arg0;
		this.anInt3915 = arg1;
		@Pc(16) int local16 = Static51.method1165(this.anInt3913);
		@Pc(21) int local21 = Static51.method1165(this.anInt3915);
		if (local16 == this.anInt3914 && local21 == this.anInt3924) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass121_Sub2Array3 != null) {
			for (local45 = 0; local45 < this.aClass121_Sub2Array3.length; local45++) {
				this.aClass121_Sub2Array3[local45].method7322();
			}
			this.aClass121_Sub2Array3 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass324_3 = null;
		} else {
			local45 = local16;
			@Pc(85) int local85 = local21;
			@Pc(87) int local87 = 0;
			label56: while (true) {
				if (local45 <= 256 && local85 <= 256) {
					if (this.aClass324_3 == null) {
						this.aClass324_3 = new Class324(super.aClass33_Sub3_13);
					}
					local85 = local21;
					local45 = local16;
					this.aClass121_Sub2Array3 = new Class121_Sub2[local87];
					local87 = 0;
					while (true) {
						if (local45 <= 256 && local85 <= 256) {
							break label56;
						}
						this.aClass121_Sub2Array3[local87++] = new Class121_Sub2(super.aClass33_Sub3_13, 3553, 34842, local45, local85);
						if (local45 > 256) {
							local45 >>= 0x1;
						}
						if (local85 > 256) {
							local85 >>= 0x1;
						}
					}
				}
				if (local85 > 256) {
					local85 >>= 0x1;
				}
				local87++;
				if (local45 > 256) {
					local45 >>= 0x1;
				}
			}
		}
		this.anInt3914 = local16;
		this.anInt3924 = local21;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	@Override
	public void method3428() {
		this.aClass121_Sub2Array3 = null;
		this.aClass121_Sub2_2 = null;
		this.aClass324_4 = null;
		this.aClass121_Sub2_3 = null;
		this.aClass326_3 = null;
		this.aClass326_2 = null;
		this.aClass324_3 = null;
		this.aClass326_4 = null;
		this.aClass326_5 = null;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3429() {
		if (!super.aClass33_Sub3_13.aBoolean273 || !super.aClass33_Sub3_13.aBoolean272 || !super.aClass33_Sub3_13.aBoolean263) {
			return false;
		}
		this.aClass324_4 = new Class324(super.aClass33_Sub3_13);
		this.aClass121_Sub2_3 = new Class121_Sub2(super.aClass33_Sub3_13, 3553, 34842, 256, 256);
		this.aClass121_Sub2_3.method5567(false, false);
		this.aClass121_Sub2_2 = new Class121_Sub2(super.aClass33_Sub3_13, 3553, 34842, 256, 256);
		this.aClass121_Sub2_2.method5567(false, false);
		super.aClass33_Sub3_13.method3050(this.aClass324_4);
		this.aClass324_4.method7853(0, this.aClass121_Sub2_3);
		this.aClass324_4.method7853(1, this.aClass121_Sub2_2);
		this.aClass324_4.method7842(0);
		if (!this.aClass324_4.method7847()) {
			super.aClass33_Sub3_13.method3034(this.aClass324_4);
			return false;
		}
		super.aClass33_Sub3_13.method3034(this.aClass324_4);
		this.aClass326_3 = Static143.method3168(new Class45[] { Static335.method5570(super.aClass33_Sub3_13, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass33_Sub3_13);
		this.aClass326_5 = Static143.method3168(new Class45[] { Static335.method5570(super.aClass33_Sub3_13, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass33_Sub3_13);
		this.aClass326_4 = Static143.method3168(new Class45[] { Static335.method5570(super.aClass33_Sub3_13, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass33_Sub3_13);
		this.aClass326_2 = Static143.method3168(new Class45[] { Static335.method5570(super.aClass33_Sub3_13, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass33_Sub3_13);
		return this.aClass326_5 != null && this.aClass326_3 != null && this.aClass326_4 != null && this.aClass326_2 != null;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3427() {
		return this.aClass324_4 != null;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Z")
	public boolean method3435() {
		return super.aClass33_Sub3_13.aBoolean273 && super.aClass33_Sub3_13.aBoolean272 && super.aClass33_Sub3_13.aBoolean263;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	@Override
	public void method3423(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass33_Sub3_13.method3027(1);
		super.aClass33_Sub3_13.method3012(null);
		super.aClass33_Sub3_13.method3027(0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!hga;ILclient!hga;B)V")
	@Override
	public void method3431(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(50) long local50;
		if (this.aClass121_Sub2Array3 == null) {
			super.aClass33_Sub3_13.method3012(arg0);
			super.aClass33_Sub3_13.method3050(this.aClass324_4);
			this.aClass324_4.method7842(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local50 = this.aClass326_3.aLong247;
			OpenGL.glUseProgramObjectARB(local50);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "params"), Static613.aFloat279, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3913, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3913, (float) this.anInt3915);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3915);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass33_Sub3_13.method3050(this.aClass324_3);
			@Pc(112) int local112 = Static51.method1165(this.anInt3913);
			@Pc(117) int local117 = Static51.method1165(this.anInt3915);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass324_3.method7853(0, this.aClass121_Sub2Array3[local119]);
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass33_Sub3_13.method3012(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3913, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3913, (float) this.anInt3915);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3915);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass33_Sub3_13.method3012(this.aClass121_Sub2Array3[local119 - 1]);
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
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				local119++;
			}
			super.aClass33_Sub3_13.method3034(this.aClass324_3);
			super.aClass33_Sub3_13.method3012(this.aClass121_Sub2Array3[local119 - 1]);
			super.aClass33_Sub3_13.method3050(this.aClass324_4);
			this.aClass324_4.method7842(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(275) long local275 = this.aClass326_5.aLong247;
			OpenGL.glUseProgramObjectARB(local275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "params"), Static613.aFloat279, 0.0F, 0.0F);
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
		this.aClass324_4.method7842(1);
		super.aClass33_Sub3_13.method3012(this.aClass121_Sub2_3);
		local50 = this.aClass326_2.aLong247;
		OpenGL.glUseProgramObjectARB(local50);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass324_4.method7842(0);
		super.aClass33_Sub3_13.method3012(this.aClass121_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass33_Sub3_13.method3034(this.aClass324_4);
		@Pc(431) long local431 = this.aClass326_4.aLong247;
		OpenGL.glUseProgramObjectARB(local431);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local431, "params"), Static146.aFloat127, Static331.aFloat184, 0.0F);
		super.aClass33_Sub3_13.method3027(1);
		super.aClass33_Sub3_13.method3012(this.aClass121_Sub2_3);
		super.aClass33_Sub3_13.method3027(0);
		super.aClass33_Sub3_13.method3012(arg0);
	}
}
