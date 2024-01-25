import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class6_Sub27_Sub1 extends Class6_Sub27 {

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
	private int anInt5796;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!og;")
	private Class227 aClass227_4;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
	private int anInt5798;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
	private int anInt5799;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "Lclient!qw;")
	private Class35_Sub3 aClass35_Sub3_2;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "Lclient!qw;")
	private Class35_Sub3 aClass35_Sub3_3;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "Lclient!og;")
	private Class227 aClass227_5;

	@OriginalMember(owner = "client!mu", name = "K", descriptor = "[Lclient!qw;")
	private Class35_Sub3[] aClass35_Sub3Array1;

	@OriginalMember(owner = "client!mu", name = "L", descriptor = "Lclient!og;")
	private Class227 aClass227_6;

	@OriginalMember(owner = "client!mu", name = "M", descriptor = "Lclient!uf;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!mu", name = "N", descriptor = "Lclient!og;")
	private Class227 aClass227_7;

	@OriginalMember(owner = "client!mu", name = "P", descriptor = "Lclient!uf;")
	private Class315 aClass315_2;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class6_Sub27_Sub1(@OriginalArg(0) Class121_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)I")
	@Override
	public int method4970() {
		return 1;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4964() {
		if (!super.aClass121_Sub3_30.aBoolean468 || !super.aClass121_Sub3_30.aBoolean481 || !super.aClass121_Sub3_30.aBoolean470) {
			return false;
		}
		this.aClass315_2 = new Class315(super.aClass121_Sub3_30);
		this.aClass35_Sub3_2 = new Class35_Sub3(super.aClass121_Sub3_30, 3553, 34842, 256, 256);
		this.aClass35_Sub3_2.method4857(false, false);
		this.aClass35_Sub3_3 = new Class35_Sub3(super.aClass121_Sub3_30, 3553, 34842, 256, 256);
		this.aClass35_Sub3_3.method4857(false, false);
		super.aClass121_Sub3_30.method5701(this.aClass315_2);
		this.aClass315_2.method7050(this.aClass35_Sub3_2, 0);
		this.aClass315_2.method7050(this.aClass35_Sub3_3, 1);
		this.aClass315_2.method7056(0);
		if (!this.aClass315_2.method7059()) {
			super.aClass121_Sub3_30.method5682(this.aClass315_2);
			return false;
		}
		super.aClass121_Sub3_30.method5682(this.aClass315_2);
		this.aClass227_7 = Static46.method647(new Class241[] { Static96.method1498(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass121_Sub3_30) }, super.aClass121_Sub3_30);
		this.aClass227_6 = Static46.method647(new Class241[] { Static96.method1498(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass121_Sub3_30) }, super.aClass121_Sub3_30);
		this.aClass227_5 = Static46.method647(new Class241[] { Static96.method1498(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass121_Sub3_30) }, super.aClass121_Sub3_30);
		this.aClass227_4 = Static46.method647(new Class241[] { Static96.method1498(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass121_Sub3_30) }, super.aClass121_Sub3_30);
		return this.aClass227_6 != null && this.aClass227_7 != null && this.aClass227_5 != null && this.aClass227_4 != null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5798 = arg0;
		this.anInt5796 = arg1;
		@Pc(20) int local20 = Static21.method292(this.anInt5796);
		@Pc(25) int local25 = Static21.method292(this.anInt5798);
		if (local20 == this.anInt5799 && local25 == this.anInt5803) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass35_Sub3Array1 != null) {
			for (local42 = 0; local42 < this.aClass35_Sub3Array1.length; local42++) {
				this.aClass35_Sub3Array1[local42].method5325();
			}
			this.aClass35_Sub3Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass315_1 = null;
		} else {
			local42 = local20;
			@Pc(78) int local78 = local25;
			@Pc(80) int local80 = 0;
			if (this.aClass315_1 == null) {
				this.aClass315_1 = new Class315(super.aClass121_Sub3_30);
			}
			label54: while (true) {
				if (local42 <= 256 && local78 <= 256) {
					local42 = local20;
					local78 = local25;
					this.aClass35_Sub3Array1 = new Class35_Sub3[local80];
					local80 = 0;
					while (true) {
						if (local42 <= 256 && local78 <= 256) {
							break label54;
						}
						this.aClass35_Sub3Array1[local80++] = new Class35_Sub3(super.aClass121_Sub3_30, 3553, 34842, local42, local78);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local78 > 256) {
							local78 >>= 0x1;
						}
					}
				}
				local80++;
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				if (local78 > 256) {
					local78 >>= 0x1;
				}
			}
		}
		this.anInt5799 = local20;
		this.anInt5803 = local25;
	}

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)Z")
	public boolean method4976() {
		return super.aClass121_Sub3_30.aBoolean468 && super.aClass121_Sub3_30.aBoolean481 && super.aClass121_Sub3_30.aBoolean470;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	@Override
	public void method4967() {
		this.aClass227_5 = null;
		this.aClass227_7 = null;
		this.aClass315_2 = null;
		this.aClass35_Sub3_2 = null;
		this.aClass227_6 = null;
		this.aClass35_Sub3_3 = null;
		this.aClass35_Sub3Array1 = null;
		this.aClass227_4 = null;
		this.aClass315_1 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!qw;Lclient!qw;II)V")
	@Override
	public void method4968(@OriginalArg(0) Class35_Sub3 arg0, @OriginalArg(1) Class35_Sub3 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass35_Sub3Array1 == null) {
			super.aClass121_Sub3_30.method5713(arg0);
			super.aClass121_Sub3_30.method5701(this.aClass315_2);
			this.aClass315_2.method7056(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass227_7.aLong166;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static337.aFloat136, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5796, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5796, (float) this.anInt5798);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5798);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass121_Sub3_30.method5701(this.aClass315_1);
			@Pc(108) int local108 = Static21.method292(this.anInt5796);
			@Pc(113) int local113 = Static21.method292(this.anInt5798);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass315_1.method7050(this.aClass35_Sub3Array1[local115], 0);
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass121_Sub3_30.method5713(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5796, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5796, (float) this.anInt5798);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5798);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass121_Sub3_30.method5713(this.aClass35_Sub3Array1[local115 - 1]);
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
				local115++;
			}
			super.aClass121_Sub3_30.method5682(this.aClass315_1);
			super.aClass121_Sub3_30.method5713(this.aClass35_Sub3Array1[local115 - 1]);
			super.aClass121_Sub3_30.method5701(this.aClass315_2);
			this.aClass315_2.method7056(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(276) long local276 = this.aClass227_6.aLong166;
			OpenGL.glUseProgramObjectARB(local276);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "params"), Static337.aFloat136, 0.0F, 0.0F);
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
		this.aClass315_2.method7056(1);
		super.aClass121_Sub3_30.method5713(this.aClass35_Sub3_2);
		local46 = this.aClass227_4.aLong166;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass315_2.method7056(0);
		super.aClass121_Sub3_30.method5713(this.aClass35_Sub3_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass121_Sub3_30.method5682(this.aClass315_2);
		@Pc(432) long local432 = this.aClass227_5.aLong166;
		OpenGL.glUseProgramObjectARB(local432);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local432, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local432, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local432, "params"), Static200.aFloat83, Static576.aFloat205, 0.0F);
		super.aClass121_Sub3_30.method5648(1);
		super.aClass121_Sub3_30.method5713(this.aClass35_Sub3_2);
		super.aClass121_Sub3_30.method5648(0);
		super.aClass121_Sub3_30.method5713(arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	@Override
	public void method4971(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass121_Sub3_30.method5648(1);
		super.aClass121_Sub3_30.method5713(null);
		super.aClass121_Sub3_30.method5648(0);
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method4973() {
		return this.aClass315_2 != null;
	}
}
