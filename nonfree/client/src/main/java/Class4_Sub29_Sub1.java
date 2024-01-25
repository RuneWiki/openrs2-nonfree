import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class4_Sub29_Sub1 extends Class4_Sub29 {

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!gaa;")
	private Class114_Sub1 aClass114_Sub1_1;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "Lclient!vca;")
	private Class344 aClass344_4;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Lclient!vga;")
	private Class347 aClass347_1;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Lclient!vca;")
	private Class344 aClass344_5;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	private int anInt5736;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Lclient!vca;")
	private Class344 aClass344_6;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Lclient!gaa;")
	private Class114_Sub1 aClass114_Sub1_2;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	private int anInt5743;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	private int anInt5745;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "Lclient!vca;")
	private Class344 aClass344_7;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "[Lclient!gaa;")
	private Class114_Sub1[] aClass114_Sub1Array3;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "Lclient!vga;")
	private Class347 aClass347_2;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	private int anInt5746;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class4_Sub29_Sub1(@OriginalArg(0) Class66_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)Z")
	public boolean method4876() {
		return super.aClass66_Sub3_25.aBoolean482 && super.aClass66_Sub3_25.aBoolean469 && super.aClass66_Sub3_25.aBoolean486;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!gaa;Lclient!gaa;BI)V")
	@Override
	public void method4868(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(1) Class114_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass114_Sub1Array3 == null) {
			super.aClass66_Sub3_25.method5382(arg0);
			super.aClass66_Sub3_25.method5391(this.aClass347_2);
			this.aClass347_2.method7691(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass344_5.aLong283;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static501.aFloat185, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5743, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5743, (float) this.anInt5736);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5736);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass66_Sub3_25.method5391(this.aClass347_1);
			@Pc(32) int local32 = Static337.method5028(this.anInt5743);
			@Pc(37) int local37 = Static337.method5028(this.anInt5736);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass347_1.method7687(this.aClass114_Sub1Array3[local39], 0);
				if (local39 == 0) {
					super.aClass66_Sub3_25.method5382(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5743, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5743, (float) this.anInt5736);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5736);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass66_Sub3_25.method5382(this.aClass114_Sub1Array3[local39 - 1]);
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
			super.aClass66_Sub3_25.method5410(this.aClass347_1);
			super.aClass66_Sub3_25.method5382(this.aClass114_Sub1Array3[local39 - 1]);
			super.aClass66_Sub3_25.method5391(this.aClass347_2);
			this.aClass347_2.method7691(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(202) long local202 = this.aClass344_6.aLong283;
			OpenGL.glUseProgramObjectARB(local202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local202, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local202, "params"), Static501.aFloat185, 0.0F, 0.0F);
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
		this.aClass347_2.method7691(1);
		super.aClass66_Sub3_25.method5382(this.aClass114_Sub1_2);
		local270 = this.aClass344_4.aLong283;
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
		this.aClass347_2.method7691(0);
		super.aClass66_Sub3_25.method5382(this.aClass114_Sub1_1);
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
		super.aClass66_Sub3_25.method5410(this.aClass347_2);
		@Pc(438) long local438 = this.aClass344_7.aLong283;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static564.aFloat189, Static459.aFloat156, 0.0F);
		super.aClass66_Sub3_25.method5381(1);
		super.aClass66_Sub3_25.method5382(this.aClass114_Sub1_2);
		super.aClass66_Sub3_25.method5381(0);
		super.aClass66_Sub3_25.method5382(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	@Override
	public void method4869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5736 = arg0;
		this.anInt5743 = arg1;
		@Pc(24) int local24 = Static337.method5028(this.anInt5743);
		@Pc(29) int local29 = Static337.method5028(this.anInt5736);
		if (local24 == this.anInt5746 && local29 == this.anInt5745) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass114_Sub1Array3 != null) {
			for (local42 = 0; local42 < this.aClass114_Sub1Array3.length; local42++) {
				this.aClass114_Sub1Array3[local42].method5006();
			}
			this.aClass114_Sub1Array3 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass347_1 = null;
		} else {
			local42 = local24;
			@Pc(75) int local75 = local29;
			@Pc(77) int local77 = 0;
			label57: while (true) {
				if (local42 <= 256 && local75 <= 256) {
					if (this.aClass347_1 == null) {
						this.aClass347_1 = new Class347(super.aClass66_Sub3_25);
					}
					local75 = local29;
					this.aClass114_Sub1Array3 = new Class114_Sub1[local77];
					local42 = local24;
					local77 = 0;
					while (true) {
						if (local42 <= 256 && local75 <= 256) {
							break label57;
						}
						this.aClass114_Sub1Array3[local77++] = new Class114_Sub1(super.aClass66_Sub3_25, 3553, 34842, local42, local75);
						if (local75 > 256) {
							local75 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				if (local75 > 256) {
					local75 >>= 0x1;
				}
				local77++;
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt5746 = local24;
		this.anInt5745 = local29;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4865() {
		if (!super.aClass66_Sub3_25.aBoolean482 || !super.aClass66_Sub3_25.aBoolean469 || !super.aClass66_Sub3_25.aBoolean486) {
			return false;
		}
		this.aClass347_2 = new Class347(super.aClass66_Sub3_25);
		this.aClass114_Sub1_2 = new Class114_Sub1(super.aClass66_Sub3_25, 3553, 34842, 256, 256);
		this.aClass114_Sub1_2.method5008(false, false);
		this.aClass114_Sub1_1 = new Class114_Sub1(super.aClass66_Sub3_25, 3553, 34842, 256, 256);
		this.aClass114_Sub1_1.method5008(false, false);
		super.aClass66_Sub3_25.method5391(this.aClass347_2);
		this.aClass347_2.method7687(this.aClass114_Sub1_2, 0);
		this.aClass347_2.method7687(this.aClass114_Sub1_1, 1);
		this.aClass347_2.method7691(0);
		if (!this.aClass347_2.method7689()) {
			super.aClass66_Sub3_25.method5410(this.aClass347_2);
			return false;
		}
		super.aClass66_Sub3_25.method5410(this.aClass347_2);
		this.aClass344_5 = Static80.method1405(new Class312[] { Static527.method7358(super.aClass66_Sub3_25, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass66_Sub3_25);
		this.aClass344_6 = Static80.method1405(new Class312[] { Static527.method7358(super.aClass66_Sub3_25, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass66_Sub3_25);
		this.aClass344_7 = Static80.method1405(new Class312[] { Static527.method7358(super.aClass66_Sub3_25, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) }, super.aClass66_Sub3_25);
		this.aClass344_4 = Static80.method1405(new Class312[] { Static527.method7358(super.aClass66_Sub3_25, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) }, super.aClass66_Sub3_25);
		return this.aClass344_6 != null && this.aClass344_5 != null && this.aClass344_7 != null && this.aClass344_4 != null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4864() {
		return this.aClass347_2 != null;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V")
	@Override
	public void method4875() {
		this.aClass114_Sub1_1 = null;
		this.aClass114_Sub1_2 = null;
		this.aClass344_6 = null;
		this.aClass114_Sub1Array3 = null;
		this.aClass344_7 = null;
		this.aClass344_5 = null;
		this.aClass347_1 = null;
		this.aClass344_4 = null;
		this.aClass347_2 = null;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I")
	@Override
	public int method4871() {
		return 1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	@Override
	public void method4873(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass66_Sub3_25.method5381(1);
		super.aClass66_Sub3_25.method5382(null);
		super.aClass66_Sub3_25.method5381(0);
	}
}
