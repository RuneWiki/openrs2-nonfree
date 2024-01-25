import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class4_Sub10_Sub1 extends Class4_Sub10 {

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!ru;")
	private Class210 aClass210_4;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "[Lclient!af;")
	private Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "Lclient!ru;")
	private Class210 aClass210_5;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "Lclient!af;")
	private Class6_Sub1 aClass6_Sub1_4;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "Lclient!af;")
	private Class6_Sub1 aClass6_Sub1_5;

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	private int anInt2356;

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "Lclient!ru;")
	private Class210 aClass210_6;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "Lclient!ru;")
	private Class210 aClass210_7;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "Lclient!ml;")
	private Class150 aClass150_3;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lclient!ml;")
	private Class150 aClass150_4;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub10_Sub1(@OriginalArg(0) Class19_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLclient!af;Lclient!af;)V")
	@Override
	public void method2000(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1, @OriginalArg(3) Class6_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(198) long local198;
		if (this.aClass6_Sub1Array1 == null) {
			super.aClass19_Sub2_16.method1905(arg1);
			super.aClass19_Sub2_16.method1922(this.aClass150_4);
			this.aClass150_4.method3610(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(266) long local266 = this.aClass210_6.aLong202;
			OpenGL.glUseProgramObjectARB(local266);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "params"), Static15.aFloat7, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2349, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2349, (float) this.anInt2354);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2354);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass19_Sub2_16.method1922(this.aClass150_3);
			@Pc(32) int local32 = Static159.method2696(this.anInt2349);
			@Pc(37) int local37 = Static159.method2696(this.anInt2354);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass150_3.method3621(this.aClass6_Sub1Array1[local39], 0);
				if (local39 == 0) {
					super.aClass19_Sub2_16.method1905(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2349, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2349, (float) this.anInt2354);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2354);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass19_Sub2_16.method1905(this.aClass6_Sub1Array1[local39 - 1]);
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
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				local39++;
			}
			super.aClass19_Sub2_16.method1971(this.aClass150_3);
			super.aClass19_Sub2_16.method1905(this.aClass6_Sub1Array1[local39 - 1]);
			super.aClass19_Sub2_16.method1922(this.aClass150_4);
			this.aClass150_4.method3610(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local198 = this.aClass210_7.aLong202;
			OpenGL.glUseProgramObjectARB(local198);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static15.aFloat7, 0.0F, 0.0F);
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
		this.aClass150_4.method3610(1);
		super.aClass19_Sub2_16.method1905(this.aClass6_Sub1_5);
		@Pc(338) long local338 = this.aClass210_4.aLong202;
		OpenGL.glUseProgramObjectARB(local338);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local338, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local338, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass150_4.method3610(0);
		super.aClass19_Sub2_16.method1905(this.aClass6_Sub1_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local338, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass19_Sub2_16.method1971(this.aClass150_4);
		local198 = this.aClass210_5.aLong202;
		OpenGL.glUseProgramObjectARB(local198);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static421.aFloat215, Static159.aFloat108, 0.0F);
		super.aClass19_Sub2_16.method1936(1);
		super.aClass19_Sub2_16.method1905(this.aClass6_Sub1_5);
		super.aClass19_Sub2_16.method1936(0);
		super.aClass19_Sub2_16.method1905(arg1);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)Z")
	public boolean method2008() {
		return super.aClass19_Sub2_16.aBoolean191 && super.aClass19_Sub2_16.aBoolean214 && super.aClass19_Sub2_16.aBoolean193;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	@Override
	public void method1996(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass19_Sub2_16.method1936(1);
		super.aClass19_Sub2_16.method1905(null);
		super.aClass19_Sub2_16.method1936(0);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2005() {
		if (!super.aClass19_Sub2_16.aBoolean191 || !super.aClass19_Sub2_16.aBoolean214 || !super.aClass19_Sub2_16.aBoolean193) {
			return false;
		}
		this.aClass150_4 = new Class150(super.aClass19_Sub2_16);
		this.aClass6_Sub1_5 = new Class6_Sub1(super.aClass19_Sub2_16, 3553, 34842, 256, 256);
		this.aClass6_Sub1_5.method4196(false, false);
		this.aClass6_Sub1_4 = new Class6_Sub1(super.aClass19_Sub2_16, 3553, 34842, 256, 256);
		this.aClass6_Sub1_4.method4196(false, false);
		super.aClass19_Sub2_16.method1922(this.aClass150_4);
		this.aClass150_4.method3621(this.aClass6_Sub1_5, 0);
		this.aClass150_4.method3621(this.aClass6_Sub1_4, 1);
		this.aClass150_4.method3610(0);
		if (!this.aClass150_4.method3616()) {
			super.aClass19_Sub2_16.method1971(this.aClass150_4);
			return false;
		}
		super.aClass19_Sub2_16.method1971(this.aClass150_4);
		this.aClass210_6 = Static256.method3694(new Class267[] { Static325.method4397(super.aClass19_Sub2_16, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass19_Sub2_16);
		this.aClass210_7 = Static256.method3694(new Class267[] { Static325.method4397(super.aClass19_Sub2_16, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass19_Sub2_16);
		this.aClass210_5 = Static256.method3694(new Class267[] { Static325.method4397(super.aClass19_Sub2_16, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass19_Sub2_16);
		this.aClass210_4 = Static256.method3694(new Class267[] { Static325.method4397(super.aClass19_Sub2_16, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass19_Sub2_16);
		return this.aClass210_7 != null && this.aClass210_6 != null && this.aClass210_5 != null && this.aClass210_4 != null;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2004() {
		return this.aClass150_4 != null;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)I")
	@Override
	public int method1999() {
		return 1;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	@Override
	public void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2349 = arg1;
		this.anInt2354 = arg0;
		@Pc(20) int local20 = Static159.method2696(this.anInt2349);
		@Pc(25) int local25 = Static159.method2696(this.anInt2354);
		if (local20 == this.anInt2356 && this.anInt2358 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass6_Sub1Array1 != null) {
			for (local42 = 0; local42 < this.aClass6_Sub1Array1.length; local42++) {
				this.aClass6_Sub1Array1[local42].method4183();
			}
			this.aClass6_Sub1Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass150_3 = null;
		} else {
			local42 = local20;
			@Pc(82) int local82 = local25;
			@Pc(84) int local84 = 0;
			if (this.aClass150_3 == null) {
				this.aClass150_3 = new Class150(super.aClass19_Sub2_16);
			}
			label56: while (true) {
				if (local42 <= 256 && local82 <= 256) {
					local42 = local20;
					this.aClass6_Sub1Array1 = new Class6_Sub1[local84];
					local82 = local25;
					local84 = 0;
					while (true) {
						if (local42 <= 256 && local82 <= 256) {
							break label56;
						}
						this.aClass6_Sub1Array1[local84++] = new Class6_Sub1(super.aClass19_Sub2_16, 3553, 34842, local42, local82);
						if (local82 > 256) {
							local82 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				if (local82 > 256) {
					local82 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local84++;
			}
		}
		this.anInt2356 = local20;
		this.anInt2358 = local25;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)V")
	@Override
	public void method2006() {
		this.aClass210_6 = null;
		this.aClass6_Sub1_5 = null;
		this.aClass6_Sub1Array1 = null;
		this.aClass150_4 = null;
		this.aClass150_3 = null;
		this.aClass210_4 = null;
		this.aClass210_7 = null;
		this.aClass210_5 = null;
		this.aClass6_Sub1_4 = null;
	}
}
