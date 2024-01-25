import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class1_Sub21_Sub1 extends Class1_Sub21 {

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Lclient!km;")
	private Class10_Sub1 aClass10_Sub1_2;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "Lclient!mq;")
	private Class158 aClass158_1;

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "Lclient!mq;")
	private Class158 aClass158_2;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "Lclient!uq;")
	private Class246 aClass246_2;

	@OriginalMember(owner = "client!hg", name = "N", descriptor = "Lclient!uq;")
	private Class246 aClass246_3;

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
	private int anInt2562;

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
	private int anInt2564;

	@OriginalMember(owner = "client!hg", name = "T", descriptor = "Lclient!km;")
	private Class10_Sub1 aClass10_Sub1_3;

	@OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
	private int anInt2567;

	@OriginalMember(owner = "client!hg", name = "W", descriptor = "Lclient!uq;")
	private Class246 aClass246_4;

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "[Lclient!km;")
	private Class10_Sub1[] aClass10_Sub1Array1;

	@OriginalMember(owner = "client!hg", name = "Y", descriptor = "Lclient!uq;")
	private Class246 aClass246_5;

	static {
		new Class119("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		new Class119(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class1_Sub21_Sub1(@OriginalArg(0) Class34_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method2213(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass34_Sub2_18.method5507(1);
		super.aClass34_Sub2_18.method5493(null);
		super.aClass34_Sub2_18.method5507(0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!km;Lclient!km;I)V")
	@Override
	public void method2215(@OriginalArg(1) Class10_Sub1 arg0, @OriginalArg(2) Class10_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass10_Sub1Array1 == null) {
			super.aClass34_Sub2_18.method5493(arg0);
			super.aClass34_Sub2_18.method5521(this.aClass158_2);
			this.aClass158_2.method3666(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass246_5.aLong214;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static37.aFloat9, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2564, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2564, (float) this.anInt2557);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2557);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass34_Sub2_18.method5521(this.aClass158_1);
			@Pc(32) int local32 = Static322.method4327(this.anInt2564);
			@Pc(37) int local37 = Static322.method4327(this.anInt2557);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass158_1.method3663(0, this.aClass10_Sub1Array1[local39]);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass34_Sub2_18.method5493(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2564, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2564, (float) this.anInt2557);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2557);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass34_Sub2_18.method5493(this.aClass10_Sub1Array1[local39 - 1]);
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
				local39++;
			}
			super.aClass34_Sub2_18.method5528(this.aClass158_1);
			super.aClass34_Sub2_18.method5493(this.aClass10_Sub1Array1[local39 - 1]);
			super.aClass34_Sub2_18.method5521(this.aClass158_2);
			this.aClass158_2.method3666(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(202) long local202 = this.aClass246_2.aLong214;
			OpenGL.glUseProgramObjectARB(local202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local202, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local202, "params"), Static37.aFloat9, 0.0F, 0.0F);
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
		this.aClass158_2.method3666(1);
		super.aClass34_Sub2_18.method5493(this.aClass10_Sub1_2);
		local270 = this.aClass246_4.aLong214;
		OpenGL.glUseProgramObjectARB(local270);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass158_2.method3666(0);
		super.aClass34_Sub2_18.method5493(this.aClass10_Sub1_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass34_Sub2_18.method5528(this.aClass158_2);
		@Pc(441) long local441 = this.aClass246_3.aLong214;
		OpenGL.glUseProgramObjectARB(local441);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local441, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local441, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local441, "params"), Static96.aFloat42, Static136.aFloat79, 0.0F);
		super.aClass34_Sub2_18.method5507(1);
		super.aClass34_Sub2_18.method5493(this.aClass10_Sub1_2);
		super.aClass34_Sub2_18.method5507(0);
		super.aClass34_Sub2_18.method5493(arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2557 = arg1;
		this.anInt2564 = arg0;
		@Pc(22) int local22 = Static322.method4327(this.anInt2564);
		@Pc(27) int local27 = Static322.method4327(this.anInt2557);
		if (this.anInt2567 == local22 && this.anInt2562 == local27) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass10_Sub1Array1 != null) {
			for (local40 = 0; local40 < this.aClass10_Sub1Array1.length; local40++) {
				this.aClass10_Sub1Array1[local40].method5926();
			}
			this.aClass10_Sub1Array1 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass158_1 = null;
		} else {
			local40 = local22;
			@Pc(71) int local71 = local27;
			@Pc(73) int local73 = 0;
			if (this.aClass158_1 == null) {
				this.aClass158_1 = new Class158(super.aClass34_Sub2_18);
			}
			label57: while (true) {
				if (local40 <= 256 && local71 <= 256) {
					this.aClass10_Sub1Array1 = new Class10_Sub1[local73];
					local71 = local27;
					local40 = local22;
					local73 = 0;
					while (true) {
						if (local40 <= 256 && local71 <= 256) {
							break label57;
						}
						this.aClass10_Sub1Array1[local73++] = new Class10_Sub1(super.aClass34_Sub2_18, 3553, 34842, local40, local71);
						if (local71 > 256) {
							local71 >>= 0x1;
						}
						if (local40 > 256) {
							local40 >>= 0x1;
						}
					}
				}
				if (local71 > 256) {
					local71 >>= 0x1;
				}
				if (local40 > 256) {
					local40 >>= 0x1;
				}
				local73++;
			}
		}
		this.anInt2562 = local27;
		this.anInt2567 = local22;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method2210() {
		if (!super.aClass34_Sub2_18.aBoolean774 || !super.aClass34_Sub2_18.aBoolean760 || !super.aClass34_Sub2_18.aBoolean770) {
			return false;
		}
		this.aClass158_2 = new Class158(super.aClass34_Sub2_18);
		this.aClass10_Sub1_2 = new Class10_Sub1(super.aClass34_Sub2_18, 3553, 34842, 256, 256);
		this.aClass10_Sub1_2.method201(false, false);
		this.aClass10_Sub1_3 = new Class10_Sub1(super.aClass34_Sub2_18, 3553, 34842, 256, 256);
		this.aClass10_Sub1_3.method201(false, false);
		super.aClass34_Sub2_18.method5521(this.aClass158_2);
		this.aClass158_2.method3663(0, this.aClass10_Sub1_2);
		this.aClass158_2.method3663(1, this.aClass10_Sub1_3);
		this.aClass158_2.method3666(0);
		if (!this.aClass158_2.method3667()) {
			super.aClass34_Sub2_18.method5528(this.aClass158_2);
			return false;
		}
		super.aClass34_Sub2_18.method5528(this.aClass158_2);
		this.aClass246_5 = Static321.method4318(new Class188[] { Static416.method5407("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass34_Sub2_18) }, super.aClass34_Sub2_18);
		this.aClass246_2 = Static321.method4318(new Class188[] { Static416.method5407("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass34_Sub2_18) }, super.aClass34_Sub2_18);
		this.aClass246_3 = Static321.method4318(new Class188[] { Static416.method5407("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass34_Sub2_18) }, super.aClass34_Sub2_18);
		this.aClass246_4 = Static321.method4318(new Class188[] { Static416.method5407("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass34_Sub2_18) }, super.aClass34_Sub2_18);
		return this.aClass246_2 != null && this.aClass246_5 != null && this.aClass246_3 != null && this.aClass246_4 != null;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)Z")
	public boolean method2220() {
		return super.aClass34_Sub2_18.aBoolean774 && super.aClass34_Sub2_18.aBoolean760 && super.aClass34_Sub2_18.aBoolean770;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2204() {
		return this.aClass158_2 != null;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
	@Override
	public void method2217() {
		this.aClass10_Sub1_2 = null;
		this.aClass246_3 = null;
		this.aClass158_2 = null;
		this.aClass246_2 = null;
		this.aClass10_Sub1Array1 = null;
		this.aClass246_4 = null;
		this.aClass10_Sub1_3 = null;
		this.aClass246_5 = null;
		this.aClass158_1 = null;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)I")
	@Override
	public int method2209() {
		return 1;
	}
}
