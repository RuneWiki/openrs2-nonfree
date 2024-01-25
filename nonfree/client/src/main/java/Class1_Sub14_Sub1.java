import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!gda;")
	private Class99 aClass99_4;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	private int anInt7230;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "Lclient!gda;")
	private Class99 aClass99_5;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Lclient!ea;")
	private Class20_Sub3 aClass20_Sub3_3;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[Lclient!ea;")
	private Class20_Sub3[] aClass20_Sub3Array2;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	private int anInt7234;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "Lclient!gda;")
	private Class99 aClass99_6;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "Lclient!ea;")
	private Class20_Sub3 aClass20_Sub3_4;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "Lclient!gda;")
	private Class99 aClass99_7;

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	private int anInt7241;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "Lclient!ne;")
	private Class205 aClass205_4;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!ne;")
	private Class205 aClass205_5;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method6198() {
		if (!super.aClass9_Sub3_35.aBoolean527 || !super.aClass9_Sub3_35.aBoolean520 || !super.aClass9_Sub3_35.aBoolean534) {
			return false;
		}
		this.aClass205_5 = new Class205(super.aClass9_Sub3_35);
		this.aClass20_Sub3_3 = new Class20_Sub3(super.aClass9_Sub3_35, 3553, 34842, 256, 256);
		this.aClass20_Sub3_3.method6253(false, false);
		this.aClass20_Sub3_4 = new Class20_Sub3(super.aClass9_Sub3_35, 3553, 34842, 256, 256);
		this.aClass20_Sub3_4.method6253(false, false);
		super.aClass9_Sub3_35.method6698(this.aClass205_5);
		this.aClass205_5.method5240(this.aClass20_Sub3_3, 0);
		this.aClass205_5.method5240(this.aClass20_Sub3_4, 1);
		this.aClass205_5.method5227(0);
		if (!this.aClass205_5.method5232()) {
			super.aClass9_Sub3_35.method6707(this.aClass205_5);
			return false;
		}
		super.aClass9_Sub3_35.method6707(this.aClass205_5);
		this.aClass99_4 = Static422.method6283(super.aClass9_Sub3_35, new Class315[] { Static405.method6070(35632, super.aClass9_Sub3_35, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass99_7 = Static422.method6283(super.aClass9_Sub3_35, new Class315[] { Static405.method6070(35632, super.aClass9_Sub3_35, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass99_5 = Static422.method6283(super.aClass9_Sub3_35, new Class315[] { Static405.method6070(35632, super.aClass9_Sub3_35, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass99_6 = Static422.method6283(super.aClass9_Sub3_35, new Class315[] { Static405.method6070(35632, super.aClass9_Sub3_35, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass99_7 != null && this.aClass99_4 != null && this.aClass99_5 != null && this.aClass99_6 != null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILclient!ea;Lclient!ea;)V")
	@Override
	public void method6189(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub3 arg1, @OriginalArg(3) Class20_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass20_Sub3Array2 == null) {
			super.aClass9_Sub3_35.method6701(arg1);
			super.aClass9_Sub3_35.method6698(this.aClass205_5);
			this.aClass205_5.method5227(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass99_4.aLong90;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static46.aFloat55, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt7234, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt7234, (float) this.anInt7233);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt7233);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass9_Sub3_35.method6698(this.aClass205_4);
			@Pc(108) int local108 = Static216.method3865(this.anInt7234);
			@Pc(113) int local113 = Static216.method3865(this.anInt7233);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass205_4.method5240(this.aClass20_Sub3Array2[local115], 0);
				if (local115 == 0) {
					super.aClass9_Sub3_35.method6701(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt7234, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt7234, (float) this.anInt7233);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7233);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass9_Sub3_35.method6701(this.aClass20_Sub3Array2[local115 - 1]);
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
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				local115++;
			}
			super.aClass9_Sub3_35.method6707(this.aClass205_4);
			super.aClass9_Sub3_35.method6701(this.aClass20_Sub3Array2[local115 - 1]);
			super.aClass9_Sub3_35.method6698(this.aClass205_5);
			this.aClass205_5.method5227(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(276) long local276 = this.aClass99_7.aLong90;
			OpenGL.glUseProgramObjectARB(local276);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "params"), Static46.aFloat55, 0.0F, 0.0F);
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
		this.aClass205_5.method5227(1);
		super.aClass9_Sub3_35.method6701(this.aClass20_Sub3_3);
		local46 = this.aClass99_6.aLong90;
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
		this.aClass205_5.method5227(0);
		super.aClass9_Sub3_35.method6701(this.aClass20_Sub3_4);
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
		super.aClass9_Sub3_35.method6707(this.aClass205_5);
		@Pc(436) long local436 = this.aClass99_5.aLong90;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static115.aFloat77, Static329.aFloat119, 0.0F);
		super.aClass9_Sub3_35.method6660(1);
		super.aClass9_Sub3_35.method6701(this.aClass20_Sub3_3);
		super.aClass9_Sub3_35.method6660(0);
		super.aClass9_Sub3_35.method6701(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)Z")
	public boolean method6200() {
		return super.aClass9_Sub3_35.aBoolean527 && super.aClass9_Sub3_35.aBoolean520 && super.aClass9_Sub3_35.aBoolean534;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7234 = arg1;
		this.anInt7233 = arg0;
		@Pc(22) int local22 = Static216.method3865(this.anInt7234);
		@Pc(27) int local27 = Static216.method3865(this.anInt7233);
		if (this.anInt7241 == local22 && local27 == this.anInt7230) {
			return;
		}
		@Pc(44) int local44;
		if (this.aClass20_Sub3Array2 != null) {
			for (local44 = 0; local44 < this.aClass20_Sub3Array2.length; local44++) {
				this.aClass20_Sub3Array2[local44].method6239();
			}
			this.aClass20_Sub3Array2 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass205_4 = null;
		} else {
			local44 = local22;
			@Pc(77) int local77 = local27;
			@Pc(79) int local79 = 0;
			label57: while (true) {
				if (local44 <= 256 && local77 <= 256) {
					if (this.aClass205_4 == null) {
						this.aClass205_4 = new Class205(super.aClass9_Sub3_35);
					}
					local77 = local27;
					local44 = local22;
					this.aClass20_Sub3Array2 = new Class20_Sub3[local79];
					local79 = 0;
					while (true) {
						if (local44 <= 256 && local77 <= 256) {
							break label57;
						}
						this.aClass20_Sub3Array2[local79++] = new Class20_Sub3(super.aClass9_Sub3_35, 3553, 34842, local44, local77);
						if (local77 > 256) {
							local77 >>= 0x1;
						}
						if (local44 > 256) {
							local44 >>= 0x1;
						}
					}
				}
				local79++;
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				if (local44 > 256) {
					local44 >>= 0x1;
				}
			}
		}
		this.anInt7230 = local27;
		this.anInt7241 = local22;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6187() {
		return this.aClass205_5 != null;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I")
	@Override
	public int method6194() {
		return 1;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
	@Override
	public void method6196() {
		this.aClass205_4 = null;
		this.aClass99_5 = null;
		this.aClass20_Sub3_4 = null;
		this.aClass99_6 = null;
		this.aClass99_7 = null;
		this.aClass20_Sub3Array2 = null;
		this.aClass99_4 = null;
		this.aClass20_Sub3_3 = null;
		this.aClass205_5 = null;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
	@Override
	public void method6191(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass9_Sub3_35.method6660(1);
		super.aClass9_Sub3_35.method6701(null);
		super.aClass9_Sub3_35.method6660(0);
	}
}
