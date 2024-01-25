import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class3_Sub18_Sub1 extends Class3_Sub18 {

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "Lclient!db;")
	private Class34_Sub2 aClass34_Sub2_3;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
	private int anInt6707;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "Lclient!taa;")
	private Class315 aClass315_2;

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
	private int anInt6708;

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "[Lclient!db;")
	private Class34_Sub2[] aClass34_Sub2Array2;

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "Lclient!taa;")
	private Class315 aClass315_3;

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "Lclient!taa;")
	private Class315 aClass315_4;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "Lclient!db;")
	private Class34_Sub2 aClass34_Sub2_4;

	@OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
	private int anInt6712;

	@OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
	private int anInt6713;

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "Lclient!rq;")
	private Class293 aClass293_4;

	@OriginalMember(owner = "client!ou", name = "L", descriptor = "Lclient!taa;")
	private Class315 aClass315_5;

	@OriginalMember(owner = "client!ou", name = "O", descriptor = "Lclient!rq;")
	private Class293 aClass293_5;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class3_Sub18_Sub1(@OriginalArg(0) Class43_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)V")
	@Override
	public void method5741(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass43_Sub3_29.method7277(1);
		super.aClass43_Sub3_29.method7220(null);
		super.aClass43_Sub3_29.method7277(0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6708 = arg1;
		this.anInt6707 = arg0;
		@Pc(16) int local16 = Static247.method4032(this.anInt6708);
		@Pc(25) int local25 = Static247.method4032(this.anInt6707);
		if (local16 == this.anInt6713 && this.anInt6712 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass34_Sub2Array2 != null) {
			for (local42 = 0; local42 < this.aClass34_Sub2Array2.length; local42++) {
				this.aClass34_Sub2Array2[local42].method4973();
			}
			this.aClass34_Sub2Array2 = null;
		}
		if (local16 <= 256 && local25 <= 256) {
			this.aClass293_5 = null;
		} else {
			local42 = local16;
			@Pc(69) int local69 = local25;
			@Pc(71) int local71 = 0;
			label57: while (true) {
				if (local42 <= 256 && local69 <= 256) {
					if (this.aClass293_5 == null) {
						this.aClass293_5 = new Class293(super.aClass43_Sub3_29);
					}
					this.aClass34_Sub2Array2 = new Class34_Sub2[local71];
					local42 = local16;
					local69 = local25;
					local71 = 0;
					while (true) {
						if (local42 <= 256 && local69 <= 256) {
							break label57;
						}
						this.aClass34_Sub2Array2[local71++] = new Class34_Sub2(super.aClass43_Sub3_29, 3553, 34842, local42, local69);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local69 > 256) {
							local69 >>= 0x1;
						}
					}
				}
				local71++;
				if (local69 > 256) {
					local69 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt6712 = local25;
		this.anInt6713 = local16;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Z)Z")
	public boolean method5747() {
		return super.aClass43_Sub3_29.aBoolean676 && super.aClass43_Sub3_29.aBoolean691 && super.aClass43_Sub3_29.aBoolean679;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)V")
	@Override
	public void method5743() {
		this.aClass315_4 = null;
		this.aClass315_3 = null;
		this.aClass315_5 = null;
		this.aClass34_Sub2_3 = null;
		this.aClass315_2 = null;
		this.aClass293_5 = null;
		this.aClass293_4 = null;
		this.aClass34_Sub2_4 = null;
		this.aClass34_Sub2Array2 = null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5733() {
		if (!super.aClass43_Sub3_29.aBoolean676 || !super.aClass43_Sub3_29.aBoolean691 || !super.aClass43_Sub3_29.aBoolean679) {
			return false;
		}
		this.aClass293_4 = new Class293(super.aClass43_Sub3_29);
		this.aClass34_Sub2_3 = new Class34_Sub2(super.aClass43_Sub3_29, 3553, 34842, 256, 256);
		this.aClass34_Sub2_3.method1964(false, false);
		this.aClass34_Sub2_4 = new Class34_Sub2(super.aClass43_Sub3_29, 3553, 34842, 256, 256);
		this.aClass34_Sub2_4.method1964(false, false);
		super.aClass43_Sub3_29.method7247(this.aClass293_4);
		this.aClass293_4.method6421(this.aClass34_Sub2_3, 0);
		this.aClass293_4.method6421(this.aClass34_Sub2_4, 1);
		this.aClass293_4.method6412(0);
		if (!this.aClass293_4.method6416()) {
			super.aClass43_Sub3_29.method7286(this.aClass293_4);
			return false;
		}
		super.aClass43_Sub3_29.method7286(this.aClass293_4);
		this.aClass315_5 = Static280.method4448(new Class165[] { Static556.method7402(35632, super.aClass43_Sub3_29, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass43_Sub3_29);
		this.aClass315_3 = Static280.method4448(new Class165[] { Static556.method7402(35632, super.aClass43_Sub3_29, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass43_Sub3_29);
		this.aClass315_2 = Static280.method4448(new Class165[] { Static556.method7402(35632, super.aClass43_Sub3_29, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass43_Sub3_29);
		this.aClass315_4 = Static280.method4448(new Class165[] { Static556.method7402(35632, super.aClass43_Sub3_29, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass43_Sub3_29);
		return this.aClass315_3 != null && this.aClass315_5 != null && this.aClass315_2 != null && this.aClass315_4 != null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	@Override
	public int method5734() {
		return 1;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5745() {
		return this.aClass293_4 != null;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!db;IILclient!db;)V")
	@Override
	public void method5744(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(197) long local197;
		if (this.aClass34_Sub2Array2 == null) {
			super.aClass43_Sub3_29.method7220(arg0);
			super.aClass43_Sub3_29.method7247(this.aClass293_4);
			this.aClass293_4.method6412(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(265) long local265 = this.aClass315_5.aLong230;
			OpenGL.glUseProgramObjectARB(local265);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local265, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local265, "params"), Static260.aFloat107, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6708, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6708, (float) this.anInt6707);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6707);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass43_Sub3_29.method7247(this.aClass293_5);
			@Pc(32) int local32 = Static247.method4032(this.anInt6708);
			@Pc(37) int local37 = Static247.method4032(this.anInt6707);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass293_5.method6421(this.aClass34_Sub2Array2[local39], 0);
				if (local39 == 0) {
					super.aClass43_Sub3_29.method7220(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6708, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6708, (float) this.anInt6707);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6707);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass43_Sub3_29.method7220(this.aClass34_Sub2Array2[local39 - 1]);
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
			super.aClass43_Sub3_29.method7286(this.aClass293_5);
			super.aClass43_Sub3_29.method7220(this.aClass34_Sub2Array2[local39 - 1]);
			super.aClass43_Sub3_29.method7247(this.aClass293_4);
			this.aClass293_4.method6412(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local197 = this.aClass315_3.aLong230;
			OpenGL.glUseProgramObjectARB(local197);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local197, "params"), Static260.aFloat107, 0.0F, 0.0F);
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
		this.aClass293_4.method6412(1);
		super.aClass43_Sub3_29.method7220(this.aClass34_Sub2_3);
		@Pc(337) long local337 = this.aClass315_4.aLong230;
		OpenGL.glUseProgramObjectARB(local337);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local337, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local337, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass293_4.method6412(0);
		super.aClass43_Sub3_29.method7220(this.aClass34_Sub2_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local337, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass43_Sub3_29.method7286(this.aClass293_4);
		local197 = this.aClass315_2.aLong230;
		OpenGL.glUseProgramObjectARB(local197);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local197, "params"), Static532.aFloat184, Static360.aFloat129, 0.0F);
		super.aClass43_Sub3_29.method7277(1);
		super.aClass43_Sub3_29.method7220(this.aClass34_Sub2_3);
		super.aClass43_Sub3_29.method7277(0);
		super.aClass43_Sub3_29.method7220(arg0);
	}
}
