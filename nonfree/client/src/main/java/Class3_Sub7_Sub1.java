import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!oca;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!oca;")
	private Class249 aClass249_2;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!tca;")
	private Class85_Sub3 aClass85_Sub3_1;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!oca;")
	private Class249 aClass249_3;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "[Lclient!tca;")
	private Class85_Sub3[] aClass85_Sub3Array1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Lclient!mj;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "Lclient!mj;")
	private Class221 aClass221_2;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!oca;")
	private Class249 aClass249_4;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!tca;")
	private Class85_Sub3 aClass85_Sub3_2;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!tca;ILclient!tca;)V")
	@Override
	public void method775(@OriginalArg(1) Class85_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class85_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(268) long local268;
		if (this.aClass85_Sub3Array1 == null) {
			super.aClass13_Sub2_3.method2024(arg2);
			super.aClass13_Sub2_3.method2009(this.aClass221_2);
			this.aClass221_2.method5436(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local268 = this.aClass249_4.aLong213;
			OpenGL.glUseProgramObjectARB(local268);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "params"), Static135.aFloat135, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt653, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt653, (float) this.anInt648);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt648);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass13_Sub2_3.method2009(this.aClass221_1);
			@Pc(32) int local32 = Static677.method9371(this.anInt653);
			@Pc(37) int local37 = Static677.method9371(this.anInt648);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass221_1.method5430(0, this.aClass85_Sub3Array1[local39]);
				if (local39 == 0) {
					super.aClass13_Sub2_3.method2024(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt653, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt653, (float) this.anInt648);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt648);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass13_Sub2_3.method2024(this.aClass85_Sub3Array1[local39 - 1]);
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
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass13_Sub2_3.method1992(this.aClass221_1);
			super.aClass13_Sub2_3.method2024(this.aClass85_Sub3Array1[local39 - 1]);
			super.aClass13_Sub2_3.method2009(this.aClass221_2);
			this.aClass221_2.method5436(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(200) long local200 = this.aClass249_1.aLong213;
			OpenGL.glUseProgramObjectARB(local200);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local200, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local200, "params"), Static135.aFloat135, 0.0F, 0.0F);
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
		this.aClass221_2.method5436(1);
		super.aClass13_Sub2_3.method2024(this.aClass85_Sub3_2);
		local268 = this.aClass249_2.aLong213;
		OpenGL.glUseProgramObjectARB(local268);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass221_2.method5436(0);
		super.aClass13_Sub2_3.method2024(this.aClass85_Sub3_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass13_Sub2_3.method1992(this.aClass221_2);
		@Pc(436) long local436 = this.aClass249_3.aLong213;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static103.aFloat45, Static368.aFloat120, 0.0F);
		super.aClass13_Sub2_3.method2008(1);
		super.aClass13_Sub2_3.method2024(this.aClass85_Sub3_2);
		super.aClass13_Sub2_3.method2008(0);
		super.aClass13_Sub2_3.method2024(arg2);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	@Override
	public void method780(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass13_Sub2_3.method2008(1);
		super.aClass13_Sub2_3.method2024((Class85) null);
		super.aClass13_Sub2_3.method2008(0);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method776() {
		if (!super.aClass13_Sub2_3.aBoolean172 || !super.aClass13_Sub2_3.aBoolean173 || !super.aClass13_Sub2_3.aBoolean164) {
			return false;
		}
		this.aClass221_2 = new Class221(super.aClass13_Sub2_3);
		this.aClass85_Sub3_2 = new Class85_Sub3(super.aClass13_Sub2_3, 3553, 34842, 256, 256);
		this.aClass85_Sub3_2.method5365(false, false);
		this.aClass85_Sub3_1 = new Class85_Sub3(super.aClass13_Sub2_3, 3553, 34842, 256, 256);
		this.aClass85_Sub3_1.method5365(false, false);
		super.aClass13_Sub2_3.method2009(this.aClass221_2);
		this.aClass221_2.method5430(0, this.aClass85_Sub3_2);
		this.aClass221_2.method5430(1, this.aClass85_Sub3_1);
		this.aClass221_2.method5436(0);
		if (!this.aClass221_2.method5428()) {
			super.aClass13_Sub2_3.method1992(this.aClass221_2);
			return false;
		}
		super.aClass13_Sub2_3.method1992(this.aClass221_2);
		this.aClass249_4 = Static69.method1361(new Class184[] { Static189.method5096(35632, super.aClass13_Sub2_3, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass13_Sub2_3);
		this.aClass249_1 = Static69.method1361(new Class184[] { Static189.method5096(35632, super.aClass13_Sub2_3, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass13_Sub2_3);
		this.aClass249_3 = Static69.method1361(new Class184[] { Static189.method5096(35632, super.aClass13_Sub2_3, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass13_Sub2_3);
		this.aClass249_2 = Static69.method1361(new Class184[] { Static189.method5096(35632, super.aClass13_Sub2_3, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass13_Sub2_3);
		return this.aClass249_1 != null && this.aClass249_4 != null && this.aClass249_3 != null && this.aClass249_2 != null;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)I")
	@Override
	public int method778() {
		return 1;
	}

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)Z")
	public boolean method785() {
		return super.aClass13_Sub2_3.aBoolean172 && super.aClass13_Sub2_3.aBoolean173 && super.aClass13_Sub2_3.aBoolean164;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
	@Override
	public void method783() {
		this.aClass249_2 = null;
		this.aClass249_3 = null;
		this.aClass85_Sub3_2 = null;
		this.aClass221_2 = null;
		this.aClass221_1 = null;
		this.aClass249_1 = null;
		this.aClass85_Sub3Array1 = null;
		this.aClass249_4 = null;
		this.aClass85_Sub3_1 = null;
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method784() {
		return this.aClass221_2 != null;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V")
	@Override
	public void method777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt648 = arg0;
		this.anInt653 = arg1;
		@Pc(20) int local20 = Static677.method9371(this.anInt653);
		@Pc(25) int local25 = Static677.method9371(this.anInt648);
		if (local20 == this.anInt644 && this.anInt647 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass85_Sub3Array1 != null) {
			for (local42 = 0; local42 < this.aClass85_Sub3Array1.length; local42++) {
				this.aClass85_Sub3Array1[local42].method7870();
			}
			this.aClass85_Sub3Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass221_1 = null;
		} else {
			local42 = local20;
			@Pc(74) int local74 = local25;
			@Pc(76) int local76 = 0;
			if (this.aClass221_1 == null) {
				this.aClass221_1 = new Class221(super.aClass13_Sub2_3);
			}
			label56: while (true) {
				if (local42 <= 256 && local74 <= 256) {
					local42 = local20;
					local74 = local25;
					this.aClass85_Sub3Array1 = new Class85_Sub3[local76];
					local76 = 0;
					while (true) {
						if (local42 <= 256 && local74 <= 256) {
							break label56;
						}
						this.aClass85_Sub3Array1[local76++] = new Class85_Sub3(super.aClass13_Sub2_3, 3553, 34842, local42, local74);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local74 > 256) {
							local74 >>= 0x1;
						}
					}
				}
				if (local74 > 256) {
					local74 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local76++;
			}
		}
		this.anInt647 = local25;
		this.anInt644 = local20;
	}
}
