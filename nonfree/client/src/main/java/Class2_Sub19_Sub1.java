import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class2_Sub19_Sub1 extends Class2_Sub19 {

	@OriginalMember(owner = "client!it", name = "u", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "[Lclient!ml;")
	private Class55_Sub3[] aClass55_Sub3Array1;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Lclient!ml;")
	private Class55_Sub3 aClass55_Sub3_4;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "Lclient!bt;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!it", name = "z", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "Lclient!ml;")
	private Class55_Sub3 aClass55_Sub3_5;

	@OriginalMember(owner = "client!it", name = "B", descriptor = "Lclient!bt;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!it", name = "C", descriptor = "Lclient!bt;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!it", name = "D", descriptor = "Lclient!je;")
	private Class127 aClass127_3;

	@OriginalMember(owner = "client!it", name = "K", descriptor = "I")
	private int anInt3392;

	@OriginalMember(owner = "client!it", name = "Q", descriptor = "Lclient!je;")
	private Class127 aClass127_4;

	@OriginalMember(owner = "client!it", name = "R", descriptor = "I")
	private int anInt3397;

	@OriginalMember(owner = "client!it", name = "S", descriptor = "Lclient!bt;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) Class49_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	@Override
	public void method2772() {
		this.aClass55_Sub3_4 = null;
		this.aClass55_Sub3_5 = null;
		this.aClass127_3 = null;
		this.aClass32_3 = null;
		this.aClass55_Sub3Array1 = null;
		this.aClass32_1 = null;
		this.aClass127_4 = null;
		this.aClass32_4 = null;
		this.aClass32_2 = null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)V")
	@Override
	public void method2775(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass49_Sub2_17.method1600(1);
		super.aClass49_Sub2_17.method1646(null);
		super.aClass49_Sub2_17.method1600(0);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!ml;ILclient!ml;)V")
	@Override
	public void method2779(@OriginalArg(0) int arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(3) Class55_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(48) long local48;
		if (this.aClass55_Sub3Array1 == null) {
			super.aClass49_Sub2_17.method1646(arg2);
			super.aClass49_Sub2_17.method1589(this.aClass127_3);
			this.aClass127_3.method2873(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local48 = this.aClass32_4.aLong35;
			OpenGL.glUseProgramObjectARB(local48);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "params"), Static85.aFloat44, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3386, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3386, (float) this.anInt3392);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3392);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass49_Sub2_17.method1589(this.aClass127_4);
			@Pc(110) int local110 = Static202.method3245(this.anInt3386);
			@Pc(115) int local115 = Static202.method3245(this.anInt3392);
			@Pc(117) int local117 = 0;
			while (local110 > 256 || local115 > 256) {
				OpenGL.glViewport(0, 0, local110, local115);
				this.aClass127_4.method2883(0, this.aClass55_Sub3Array1[local117]);
				if (local117 == 0) {
					super.aClass49_Sub2_17.method1646(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3386, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3386, (float) this.anInt3392);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3392);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass49_Sub2_17.method1646(this.aClass55_Sub3Array1[local117 - 1]);
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
				if (local115 > 256) {
					local115 >>= 0x1;
				}
				if (local110 > 256) {
					local110 >>= 0x1;
				}
				local117++;
			}
			super.aClass49_Sub2_17.method1659(this.aClass127_4);
			super.aClass49_Sub2_17.method1646(this.aClass55_Sub3Array1[local117 - 1]);
			super.aClass49_Sub2_17.method1589(this.aClass127_3);
			this.aClass127_3.method2873(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(278) long local278 = this.aClass32_1.aLong35;
			OpenGL.glUseProgramObjectARB(local278);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local278, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local278, "params"), Static85.aFloat44, 0.0F, 0.0F);
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
		this.aClass127_3.method2873(1);
		super.aClass49_Sub2_17.method1646(this.aClass55_Sub3_4);
		local48 = this.aClass32_2.aLong35;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) 0, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass127_3.method2873(0);
		super.aClass49_Sub2_17.method1646(this.aClass55_Sub3_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass49_Sub2_17.method1659(this.aClass127_3);
		@Pc(437) long local437 = this.aClass32_3.aLong35;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static25.aFloat12, Static49.aFloat16, 0.0F);
		super.aClass49_Sub2_17.method1600(1);
		super.aClass49_Sub2_17.method1646(this.aClass55_Sub3_4);
		super.aClass49_Sub2_17.method1600(0);
		super.aClass49_Sub2_17.method1646(arg2);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z")
	public boolean method2782() {
		return super.aClass49_Sub2_17.aBoolean117 && super.aClass49_Sub2_17.aBoolean112 && super.aClass49_Sub2_17.aBoolean114;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2767() {
		if (!super.aClass49_Sub2_17.aBoolean117 || !super.aClass49_Sub2_17.aBoolean112 || !super.aClass49_Sub2_17.aBoolean114) {
			return false;
		}
		this.aClass127_3 = new Class127(super.aClass49_Sub2_17);
		this.aClass55_Sub3_4 = new Class55_Sub3(super.aClass49_Sub2_17, 3553, 34842, 256, 256);
		this.aClass55_Sub3_4.method5116(false, false);
		this.aClass55_Sub3_5 = new Class55_Sub3(super.aClass49_Sub2_17, 3553, 34842, 256, 256);
		this.aClass55_Sub3_5.method5116(false, false);
		super.aClass49_Sub2_17.method1589(this.aClass127_3);
		this.aClass127_3.method2883(0, this.aClass55_Sub3_4);
		this.aClass127_3.method2883(1, this.aClass55_Sub3_5);
		this.aClass127_3.method2873(0);
		if (!this.aClass127_3.method2871()) {
			super.aClass49_Sub2_17.method1659(this.aClass127_3);
			return false;
		}
		super.aClass49_Sub2_17.method1659(this.aClass127_3);
		this.aClass32_4 = Static91.method1767(new Class130[] { Static178.method5745(super.aClass49_Sub2_17, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass49_Sub2_17);
		this.aClass32_1 = Static91.method1767(new Class130[] { Static178.method5745(super.aClass49_Sub2_17, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass49_Sub2_17);
		this.aClass32_3 = Static91.method1767(new Class130[] { Static178.method5745(super.aClass49_Sub2_17, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass49_Sub2_17);
		this.aClass32_2 = Static91.method1767(new Class130[] { Static178.method5745(super.aClass49_Sub2_17, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass49_Sub2_17);
		return this.aClass32_1 != null && this.aClass32_4 != null && this.aClass32_3 != null && this.aClass32_2 != null;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2773() {
		return this.aClass127_3 != null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	@Override
	public void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3392 = arg0;
		this.anInt3386 = arg1;
		@Pc(23) int local23 = Static202.method3245(this.anInt3386);
		@Pc(28) int local28 = Static202.method3245(this.anInt3392);
		if (local23 == this.anInt3385 && local28 == this.anInt3397) {
			return;
		}
		@Pc(49) int local49;
		if (this.aClass55_Sub3Array1 != null) {
			for (local49 = 0; local49 < this.aClass55_Sub3Array1.length; local49++) {
				this.aClass55_Sub3Array1[local49].method5559();
			}
			this.aClass55_Sub3Array1 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass127_4 = null;
		} else {
			local49 = local23;
			@Pc(85) int local85 = local28;
			@Pc(87) int local87 = 0;
			if (this.aClass127_4 == null) {
				this.aClass127_4 = new Class127(super.aClass49_Sub2_17);
			}
			label56: while (true) {
				if (local49 <= 256 && local85 <= 256) {
					this.aClass55_Sub3Array1 = new Class55_Sub3[local87];
					local85 = local28;
					local49 = local23;
					local87 = 0;
					while (true) {
						if (local49 <= 256 && local85 <= 256) {
							break label56;
						}
						this.aClass55_Sub3Array1[local87++] = new Class55_Sub3(super.aClass49_Sub2_17, 3553, 34842, local49, local85);
						if (local85 > 256) {
							local85 >>= 0x1;
						}
						if (local49 > 256) {
							local49 >>= 0x1;
						}
					}
				}
				if (local49 > 256) {
					local49 >>= 0x1;
				}
				if (local85 > 256) {
					local85 >>= 0x1;
				}
				local87++;
			}
		}
		this.anInt3397 = local28;
		this.anInt3385 = local23;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(B)I")
	@Override
	public int method2774() {
		return 1;
	}
}
