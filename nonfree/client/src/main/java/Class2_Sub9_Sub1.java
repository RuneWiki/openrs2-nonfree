import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "Lclient!ie;")
	private Class113 aClass113_1;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "Lclient!ie;")
	private Class113 aClass113_2;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "Lclient!bd;")
	private Class20_Sub1 aClass20_Sub1_2;

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "Lclient!eb;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "Lclient!eb;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!cq", name = "J", descriptor = "Lclient!ie;")
	private Class113 aClass113_3;

	@OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
	private int anInt1099;

	@OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
	private int anInt1100;

	@OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
	private int anInt1101;

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "[Lclient!bd;")
	private Class20_Sub1[] aClass20_Sub1Array1;

	@OriginalMember(owner = "client!cq", name = "R", descriptor = "Lclient!ie;")
	private Class113 aClass113_4;

	@OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
	private int anInt1104;

	@OriginalMember(owner = "client!cq", name = "T", descriptor = "Lclient!bd;")
	private Class20_Sub1 aClass20_Sub1_3;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) Class163_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
	@Override
	public void method875() {
		this.aClass113_2 = null;
		this.aClass61_1 = null;
		this.aClass61_2 = null;
		this.aClass113_4 = null;
		this.aClass20_Sub1_3 = null;
		this.aClass113_3 = null;
		this.aClass20_Sub1Array1 = null;
		this.aClass20_Sub1_2 = null;
		this.aClass113_1 = null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1100 = arg0;
		this.anInt1104 = arg1;
		@Pc(16) int local16 = Static295.method3927(this.anInt1100);
		@Pc(21) int local21 = Static295.method3927(this.anInt1104);
		if (this.anInt1099 == local16 && local21 == this.anInt1101) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass20_Sub1Array1 != null) {
			for (local38 = 0; local38 < this.aClass20_Sub1Array1.length; local38++) {
				this.aClass20_Sub1Array1[local38].method3108();
			}
			this.aClass20_Sub1Array1 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass61_2 = null;
		} else {
			local38 = local16;
			@Pc(73) int local73 = local21;
			@Pc(75) int local75 = 0;
			label57: while (true) {
				if (local38 <= 256 && local73 <= 256) {
					if (this.aClass61_2 == null) {
						this.aClass61_2 = new Class61(super.aClass163_Sub2_10);
					}
					local38 = local16;
					this.aClass20_Sub1Array1 = new Class20_Sub1[local75];
					local73 = local21;
					local75 = 0;
					while (true) {
						if (local38 <= 256 && local73 <= 256) {
							break label57;
						}
						this.aClass20_Sub1Array1[local75++] = new Class20_Sub1(super.aClass163_Sub2_10, 3553, 34842, local38, local73);
						if (local73 > 256) {
							local73 >>= 0x1;
						}
						if (local38 > 256) {
							local38 >>= 0x1;
						}
					}
				}
				local75++;
				if (local73 > 256) {
					local73 >>= 0x1;
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
			}
		}
		this.anInt1099 = local16;
		this.anInt1101 = local21;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!bd;ILclient!bd;)V")
	@Override
	public void method870(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(3) Class20_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass20_Sub1Array1 == null) {
			super.aClass163_Sub2_10.method4118(arg1);
			super.aClass163_Sub2_10.method4142(this.aClass61_1);
			this.aClass61_1.method1402(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass113_2.aLong104;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static359.aFloat82, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1100, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1100, (float) this.anInt1104);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1104);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass163_Sub2_10.method4142(this.aClass61_2);
			@Pc(32) int local32 = Static295.method3927(this.anInt1100);
			@Pc(37) int local37 = Static295.method3927(this.anInt1104);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass61_2.method1413(0, this.aClass20_Sub1Array1[local39]);
				if (local39 == 0) {
					super.aClass163_Sub2_10.method4118(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1100, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1100, (float) this.anInt1104);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1104);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass163_Sub2_10.method4118(this.aClass20_Sub1Array1[local39 - 1]);
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
			super.aClass163_Sub2_10.method4111(this.aClass61_2);
			super.aClass163_Sub2_10.method4118(this.aClass20_Sub1Array1[local39 - 1]);
			super.aClass163_Sub2_10.method4142(this.aClass61_1);
			this.aClass61_1.method1402(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(202) long local202 = this.aClass113_3.aLong104;
			OpenGL.glUseProgramObjectARB(local202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local202, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local202, "params"), Static359.aFloat82, 0.0F, 0.0F);
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
		this.aClass61_1.method1402(1);
		super.aClass163_Sub2_10.method4118(this.aClass20_Sub1_2);
		local270 = this.aClass113_4.aLong104;
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
		this.aClass61_1.method1402(0);
		super.aClass163_Sub2_10.method4118(this.aClass20_Sub1_3);
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
		super.aClass163_Sub2_10.method4111(this.aClass61_1);
		@Pc(434) long local434 = this.aClass113_1.aLong104;
		OpenGL.glUseProgramObjectARB(local434);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local434, "params"), Static74.aFloat16, Static138.aFloat23, 0.0F);
		super.aClass163_Sub2_10.method4131(1);
		super.aClass163_Sub2_10.method4118(this.aClass20_Sub1_2);
		super.aClass163_Sub2_10.method4131(0);
		super.aClass163_Sub2_10.method4118(arg1);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V")
	@Override
	public void method867(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass163_Sub2_10.method4131(1);
		super.aClass163_Sub2_10.method4118(null);
		super.aClass163_Sub2_10.method4131(0);
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I")
	@Override
	public int method869() {
		return 1;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method868() {
		return this.aClass61_1 != null;
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(B)Z")
	public boolean method884() {
		return super.aClass163_Sub2_10.aBoolean368 && super.aClass163_Sub2_10.aBoolean362 && super.aClass163_Sub2_10.aBoolean363;
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method878() {
		if (!super.aClass163_Sub2_10.aBoolean368 || !super.aClass163_Sub2_10.aBoolean362 || !super.aClass163_Sub2_10.aBoolean363) {
			return false;
		}
		this.aClass61_1 = new Class61(super.aClass163_Sub2_10);
		this.aClass20_Sub1_2 = new Class20_Sub1(super.aClass163_Sub2_10, 3553, 34842, 256, 256);
		this.aClass20_Sub1_2.method2040(false, false);
		this.aClass20_Sub1_3 = new Class20_Sub1(super.aClass163_Sub2_10, 3553, 34842, 256, 256);
		this.aClass20_Sub1_3.method2040(false, false);
		super.aClass163_Sub2_10.method4142(this.aClass61_1);
		this.aClass61_1.method1413(0, this.aClass20_Sub1_2);
		this.aClass61_1.method1413(1, this.aClass20_Sub1_3);
		this.aClass61_1.method1402(0);
		if (!this.aClass61_1.method1410()) {
			super.aClass163_Sub2_10.method4111(this.aClass61_1);
			return false;
		}
		super.aClass163_Sub2_10.method4111(this.aClass61_1);
		this.aClass113_2 = Static125.method1834(new Class19[] { Static22.method267(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass163_Sub2_10) }, super.aClass163_Sub2_10);
		this.aClass113_3 = Static125.method1834(new Class19[] { Static22.method267(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass163_Sub2_10) }, super.aClass163_Sub2_10);
		this.aClass113_1 = Static125.method1834(new Class19[] { Static22.method267(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass163_Sub2_10) }, super.aClass163_Sub2_10);
		this.aClass113_4 = Static125.method1834(new Class19[] { Static22.method267(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass163_Sub2_10) }, super.aClass163_Sub2_10);
		return this.aClass113_3 != null && this.aClass113_2 != null && this.aClass113_1 != null && this.aClass113_4 != null;
	}
}
