import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "[I")
	public static final int[] anIntArray399 = new int[4096];

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	private int anInt4290;

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "Lclient!is;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "Lclient!cs;")
	private Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "Lclient!jaa;")
	private Class141 aClass141_5;

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "Lclient!is;")
	private Class138 aClass138_2;

	@OriginalMember(owner = "client!hr", name = "J", descriptor = "Lclient!jaa;")
	private Class141 aClass141_6;

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "Lclient!is;")
	private Class138 aClass138_3;

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "[Lclient!cs;")
	private Class11_Sub1[] aClass11_Sub1Array2;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "Lclient!is;")
	private Class138 aClass138_4;

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
	private int anInt4298;

	@OriginalMember(owner = "client!hr", name = "R", descriptor = "I")
	private int anInt4300;

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!cs;")
	private Class11_Sub1 aClass11_Sub1_4;

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
	private int anInt4304;

	static {
		for (@Pc(37) int local37 = 0; local37 < 4096; local37++) {
			anIntArray399[local37] = Static325.method5204(local37);
		}
		new Class67("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BII)V")
	@Override
	public void method3548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4300 = arg1;
		this.anInt4298 = arg0;
		@Pc(16) int local16 = Static27.method797(this.anInt4300);
		@Pc(26) int local26 = Static27.method797(this.anInt4298);
		if (local16 == this.anInt4304 && local26 == this.anInt4290) {
			return;
		}
		@Pc(39) int local39;
		if (this.aClass11_Sub1Array2 != null) {
			for (local39 = 0; local39 < this.aClass11_Sub1Array2.length; local39++) {
				this.aClass11_Sub1Array2[local39].method7306();
			}
			this.aClass11_Sub1Array2 = null;
		}
		if (local16 <= 256 && local26 <= 256) {
			this.aClass141_6 = null;
		} else {
			local39 = local16;
			@Pc(68) int local68 = local26;
			@Pc(70) int local70 = 0;
			if (this.aClass141_6 == null) {
				this.aClass141_6 = new Class141(super.aClass5_Sub1_15);
			}
			label57: while (true) {
				if (local39 <= 256 && local68 <= 256) {
					local68 = local26;
					local39 = local16;
					this.aClass11_Sub1Array2 = new Class11_Sub1[local70];
					local70 = 0;
					while (true) {
						if (local39 <= 256 && local68 <= 256) {
							break label57;
						}
						this.aClass11_Sub1Array2[local70++] = new Class11_Sub1(super.aClass5_Sub1_15, 3553, 34842, local39, local68);
						if (local39 > 256) {
							local39 >>= 0x1;
						}
						if (local68 > 256) {
							local68 >>= 0x1;
						}
					}
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local68 > 256) {
					local68 >>= 0x1;
				}
				local70++;
			}
		}
		this.anInt4290 = local26;
		this.anInt4304 = local16;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3539() {
		return this.aClass141_5 != null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method3538(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass5_Sub1_15.method397(1);
		super.aClass5_Sub1_15.method423(null);
		super.aClass5_Sub1_15.method397(0);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)I")
	@Override
	public int method3546() {
		return 1;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)Z")
	public boolean method3552() {
		return super.aClass5_Sub1_15.aBoolean43 && super.aClass5_Sub1_15.aBoolean36 && super.aClass5_Sub1_15.aBoolean35;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	@Override
	public void method3537() {
		this.aClass138_1 = null;
		this.aClass138_2 = null;
		this.aClass141_5 = null;
		this.aClass11_Sub1Array2 = null;
		this.aClass138_4 = null;
		this.aClass11_Sub1_3 = null;
		this.aClass141_6 = null;
		this.aClass138_3 = null;
		this.aClass11_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZILclient!cs;Lclient!cs;)V")
	@Override
	public void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) Class11_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(50) long local50;
		if (this.aClass11_Sub1Array2 == null) {
			super.aClass5_Sub1_15.method423(arg1);
			super.aClass5_Sub1_15.method394(this.aClass141_5);
			this.aClass141_5.method3975(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local50 = this.aClass138_2.aLong119;
			OpenGL.glUseProgramObjectARB(local50);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "params"), Static174.aFloat137, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4300, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4300, (float) this.anInt4298);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4298);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass5_Sub1_15.method394(this.aClass141_6);
			@Pc(112) int local112 = Static27.method797(this.anInt4300);
			@Pc(117) int local117 = Static27.method797(this.anInt4298);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass141_6.method3979(0, this.aClass11_Sub1Array2[local119]);
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass5_Sub1_15.method423(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4300, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4300, (float) this.anInt4298);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4298);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass5_Sub1_15.method423(this.aClass11_Sub1Array2[local119 - 1]);
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
			super.aClass5_Sub1_15.method389(this.aClass141_6);
			super.aClass5_Sub1_15.method423(this.aClass11_Sub1Array2[local119 - 1]);
			super.aClass5_Sub1_15.method394(this.aClass141_5);
			this.aClass141_5.method3975(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(286) long local286 = this.aClass138_1.aLong119;
			OpenGL.glUseProgramObjectARB(local286);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local286, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local286, "params"), Static174.aFloat137, 0.0F, 0.0F);
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
		this.aClass141_5.method3975(1);
		super.aClass5_Sub1_15.method423(this.aClass11_Sub1_3);
		local50 = this.aClass138_3.aLong119;
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
		this.aClass141_5.method3975(0);
		super.aClass5_Sub1_15.method423(this.aClass11_Sub1_4);
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
		super.aClass5_Sub1_15.method389(this.aClass141_5);
		@Pc(442) long local442 = this.aClass138_4.aLong119;
		OpenGL.glUseProgramObjectARB(local442);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local442, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local442, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local442, "params"), Static5.aFloat29, Static62.aFloat251, 0.0F);
		super.aClass5_Sub1_15.method397(1);
		super.aClass5_Sub1_15.method423(this.aClass11_Sub1_3);
		super.aClass5_Sub1_15.method397(0);
		super.aClass5_Sub1_15.method423(arg1);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3540() {
		if (!super.aClass5_Sub1_15.aBoolean43 || !super.aClass5_Sub1_15.aBoolean36 || !super.aClass5_Sub1_15.aBoolean35) {
			return false;
		}
		this.aClass141_5 = new Class141(super.aClass5_Sub1_15);
		this.aClass11_Sub1_3 = new Class11_Sub1(super.aClass5_Sub1_15, 3553, 34842, 256, 256);
		this.aClass11_Sub1_3.method605(false, false);
		this.aClass11_Sub1_4 = new Class11_Sub1(super.aClass5_Sub1_15, 3553, 34842, 256, 256);
		this.aClass11_Sub1_4.method605(false, false);
		super.aClass5_Sub1_15.method394(this.aClass141_5);
		this.aClass141_5.method3979(0, this.aClass11_Sub1_3);
		this.aClass141_5.method3979(1, this.aClass11_Sub1_4);
		this.aClass141_5.method3975(0);
		if (!this.aClass141_5.method3977()) {
			super.aClass5_Sub1_15.method389(this.aClass141_5);
			return false;
		}
		super.aClass5_Sub1_15.method389(this.aClass141_5);
		this.aClass138_2 = Static345.method5497(new Class206[] { Static403.method6129("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass5_Sub1_15, 35632) }, super.aClass5_Sub1_15);
		this.aClass138_1 = Static345.method5497(new Class206[] { Static403.method6129("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass5_Sub1_15, 35632) }, super.aClass5_Sub1_15);
		this.aClass138_4 = Static345.method5497(new Class206[] { Static403.method6129("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass5_Sub1_15, 35632) }, super.aClass5_Sub1_15);
		this.aClass138_3 = Static345.method5497(new Class206[] { Static403.method6129("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass5_Sub1_15, 35632) }, super.aClass5_Sub1_15);
		return this.aClass138_1 != null && this.aClass138_2 != null && this.aClass138_4 != null && this.aClass138_3 != null;
	}
}
