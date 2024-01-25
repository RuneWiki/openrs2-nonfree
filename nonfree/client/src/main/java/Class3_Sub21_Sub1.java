import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub21_Sub1 extends Class3_Sub21 {

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "Lclient!wf;")
	private Class265 aClass265_4;

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
	private int anInt5785;

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
	private int anInt5786;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "Lclient!mf;")
	private Class112_Sub2 aClass112_Sub2_2;

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!mf;")
	private Class112_Sub2 aClass112_Sub2_3;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "Lclient!vh;")
	private Class259 aClass259_1;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Lclient!vh;")
	private Class259 aClass259_2;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!wf;")
	private Class265 aClass265_5;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!wf;")
	private Class265 aClass265_6;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!wf;")
	private Class265 aClass265_7;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int anInt5799;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "[Lclient!mf;")
	private Class112_Sub2[] aClass112_Sub2Array3;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class3_Sub21_Sub1(@OriginalArg(0) Class172_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	@Override
	public void method4528() {
		this.aClass259_2 = null;
		this.aClass112_Sub2_3 = null;
		this.aClass259_1 = null;
		this.aClass265_5 = null;
		this.aClass265_4 = null;
		this.aClass112_Sub2Array3 = null;
		this.aClass265_7 = null;
		this.aClass112_Sub2_2 = null;
		this.aClass265_6 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!mf;Lclient!mf;I)V")
	@Override
	public void method4530(@OriginalArg(1) Class112_Sub2 arg0, @OriginalArg(2) Class112_Sub2 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass112_Sub2Array3 == null) {
			super.aClass172_Sub2_28.method5630(arg1);
			super.aClass172_Sub2_28.method5585(this.aClass259_1);
			this.aClass259_1.method5452(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass265_6.aLong224;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static62.aFloat9, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5799, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5799, (float) this.anInt5786);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5786);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass172_Sub2_28.method5585(this.aClass259_2);
			@Pc(32) int local32 = Static102.method1790(this.anInt5799);
			@Pc(37) int local37 = Static102.method1790(this.anInt5786);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass259_2.method5451(0, this.aClass112_Sub2Array3[local39]);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass172_Sub2_28.method5630(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5799, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5799, (float) this.anInt5786);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5786);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass172_Sub2_28.method5630(this.aClass112_Sub2Array3[local39 - 1]);
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
				local39++;
			}
			super.aClass172_Sub2_28.method5556(this.aClass259_2);
			super.aClass172_Sub2_28.method5630(this.aClass112_Sub2Array3[local39 - 1]);
			super.aClass172_Sub2_28.method5585(this.aClass259_1);
			this.aClass259_1.method5452(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(202) long local202 = this.aClass265_4.aLong224;
			OpenGL.glUseProgramObjectARB(local202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local202, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local202, "params"), Static62.aFloat9, 0.0F, 0.0F);
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
		this.aClass259_1.method5452(1);
		super.aClass172_Sub2_28.method5630(this.aClass112_Sub2_2);
		local270 = this.aClass265_5.aLong224;
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
		this.aClass259_1.method5452(0);
		super.aClass172_Sub2_28.method5630(this.aClass112_Sub2_3);
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
		super.aClass172_Sub2_28.method5556(this.aClass259_1);
		@Pc(438) long local438 = this.aClass265_7.aLong224;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static39.aFloat4, Static104.aFloat15, 0.0F);
		super.aClass172_Sub2_28.method5569(1);
		super.aClass172_Sub2_28.method5630(this.aClass112_Sub2_2);
		super.aClass172_Sub2_28.method5569(0);
		super.aClass172_Sub2_28.method5630(arg1);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)I")
	@Override
	public int method4521() {
		return 1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	@Override
	public void method4527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5799 = arg1;
		this.anInt5786 = arg0;
		@Pc(20) int local20 = Static102.method1790(this.anInt5799);
		@Pc(25) int local25 = Static102.method1790(this.anInt5786);
		if (this.anInt5797 == local20 && local25 == this.anInt5785) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass112_Sub2Array3 != null) {
			for (local46 = 0; local46 < this.aClass112_Sub2Array3.length; local46++) {
				this.aClass112_Sub2Array3[local46].method4553();
			}
			this.aClass112_Sub2Array3 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass259_2 = null;
		} else {
			local46 = local20;
			@Pc(82) int local82 = local25;
			@Pc(84) int local84 = 0;
			if (this.aClass259_2 == null) {
				this.aClass259_2 = new Class259(super.aClass172_Sub2_28);
			}
			label54: while (true) {
				if (local46 <= 256 && local82 <= 256) {
					this.aClass112_Sub2Array3 = new Class112_Sub2[local84];
					local46 = local20;
					local82 = local25;
					local84 = 0;
					while (true) {
						if (local46 <= 256 && local82 <= 256) {
							break label54;
						}
						this.aClass112_Sub2Array3[local84++] = new Class112_Sub2(super.aClass172_Sub2_28, 3553, 34842, local46, local82);
						if (local82 > 256) {
							local82 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				local84++;
				if (local82 > 256) {
					local82 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
			}
		}
		this.anInt5785 = local25;
		this.anInt5797 = local20;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4520() {
		if (!super.aClass172_Sub2_28.aBoolean605 || !super.aClass172_Sub2_28.aBoolean623 || !super.aClass172_Sub2_28.aBoolean617) {
			return false;
		}
		this.aClass259_1 = new Class259(super.aClass172_Sub2_28);
		this.aClass112_Sub2_2 = new Class112_Sub2(super.aClass172_Sub2_28, 3553, 34842, 256, 256);
		this.aClass112_Sub2_2.method3727(false, false);
		this.aClass112_Sub2_3 = new Class112_Sub2(super.aClass172_Sub2_28, 3553, 34842, 256, 256);
		this.aClass112_Sub2_3.method3727(false, false);
		super.aClass172_Sub2_28.method5585(this.aClass259_1);
		this.aClass259_1.method5451(0, this.aClass112_Sub2_2);
		this.aClass259_1.method5451(1, this.aClass112_Sub2_3);
		this.aClass259_1.method5452(0);
		if (!this.aClass259_1.method5444()) {
			super.aClass172_Sub2_28.method5556(this.aClass259_1);
			return false;
		}
		super.aClass172_Sub2_28.method5556(this.aClass259_1);
		this.aClass265_6 = Static64.method1304(new Class104[] { Static444.method5856(35632, super.aClass172_Sub2_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass172_Sub2_28);
		this.aClass265_4 = Static64.method1304(new Class104[] { Static444.method5856(35632, super.aClass172_Sub2_28, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass172_Sub2_28);
		this.aClass265_7 = Static64.method1304(new Class104[] { Static444.method5856(35632, super.aClass172_Sub2_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass172_Sub2_28);
		this.aClass265_5 = Static64.method1304(new Class104[] { Static444.method5856(35632, super.aClass172_Sub2_28, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass172_Sub2_28);
		return this.aClass265_4 != null && this.aClass265_6 != null && this.aClass265_7 != null && this.aClass265_5 != null;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)Z")
	public boolean method4533() {
		return super.aClass172_Sub2_28.aBoolean605 && super.aClass172_Sub2_28.aBoolean623 && super.aClass172_Sub2_28.aBoolean617;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4523() {
		return this.aClass259_1 != null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	@Override
	public void method4524(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass172_Sub2_28.method5569(1);
		super.aClass172_Sub2_28.method5630(null);
		super.aClass172_Sub2_28.method5569(0);
	}
}
