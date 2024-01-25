import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!aaa;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!aaa;")
	private Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "Lclient!ffa;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	private int anInt4812;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	private int anInt4814;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "[Lclient!aaa;")
	private Class3_Sub1[] aClass3_Sub1Array3;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "Lclient!nba;")
	private Class233 aClass233_3;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "Lclient!ffa;")
	private Class105 aClass105_2;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	private int anInt4817;

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "Lclient!nba;")
	private Class233 aClass233_4;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "Lclient!nba;")
	private Class233 aClass233_5;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "Lclient!nba;")
	private Class233 aClass233_6;

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
	private int anInt4821;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class2_Sub15_Sub1(@OriginalArg(0) Class162_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII)V")
	@Override
	public void method4032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4817 = arg0;
		this.anInt4821 = arg1;
		@Pc(23) int local23 = Static511.method7273(this.anInt4817);
		@Pc(28) int local28 = Static511.method7273(this.anInt4821);
		if (this.anInt4814 == local23 && local28 == this.anInt4812) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass3_Sub1Array3 != null) {
			for (local45 = 0; local45 < this.aClass3_Sub1Array3.length; local45++) {
				this.aClass3_Sub1Array3[local45].method5569();
			}
			this.aClass3_Sub1Array3 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass105_1 = null;
		} else {
			local45 = local23;
			@Pc(79) int local79 = local28;
			@Pc(81) int local81 = 0;
			label56: while (true) {
				if (local45 <= 256 && local79 <= 256) {
					if (this.aClass105_1 == null) {
						this.aClass105_1 = new Class105(super.aClass162_Sub3_23);
					}
					local45 = local23;
					local79 = local28;
					this.aClass3_Sub1Array3 = new Class3_Sub1[local81];
					local81 = 0;
					while (true) {
						if (local45 <= 256 && local79 <= 256) {
							break label56;
						}
						this.aClass3_Sub1Array3[local81++] = new Class3_Sub1(super.aClass162_Sub3_23, 3553, 34842, local45, local79);
						if (local79 > 256) {
							local79 >>= 0x1;
						}
						if (local45 > 256) {
							local45 >>= 0x1;
						}
					}
				}
				if (local79 > 256) {
					local79 >>= 0x1;
				}
				local81++;
				if (local45 > 256) {
					local45 >>= 0x1;
				}
			}
		}
		this.anInt4812 = local28;
		this.anInt4814 = local23;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	@Override
	public void method4038() {
		this.aClass105_2 = null;
		this.aClass233_3 = null;
		this.aClass233_4 = null;
		this.aClass3_Sub1_2 = null;
		this.aClass233_6 = null;
		this.aClass3_Sub1Array3 = null;
		this.aClass3_Sub1_1 = null;
		this.aClass233_5 = null;
		this.aClass105_1 = null;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method4036() {
		if (!super.aClass162_Sub3_23.aBoolean721 || !super.aClass162_Sub3_23.aBoolean728 || !super.aClass162_Sub3_23.aBoolean730) {
			return false;
		}
		this.aClass105_2 = new Class105(super.aClass162_Sub3_23);
		this.aClass3_Sub1_1 = new Class3_Sub1(super.aClass162_Sub3_23, 3553, 34842, 256, 256);
		this.aClass3_Sub1_1.method1720(false, false);
		this.aClass3_Sub1_2 = new Class3_Sub1(super.aClass162_Sub3_23, 3553, 34842, 256, 256);
		this.aClass3_Sub1_2.method1720(false, false);
		super.aClass162_Sub3_23.method6942(this.aClass105_2);
		this.aClass105_2.method1940(this.aClass3_Sub1_1, 0);
		this.aClass105_2.method1940(this.aClass3_Sub1_2, 1);
		this.aClass105_2.method1950(0);
		if (!this.aClass105_2.method1943()) {
			super.aClass162_Sub3_23.method6897(this.aClass105_2);
			return false;
		}
		super.aClass162_Sub3_23.method6897(this.aClass105_2);
		this.aClass233_5 = Static9.method178(new Class118[] { Static61.method1063("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass162_Sub3_23, 35632) }, super.aClass162_Sub3_23);
		this.aClass233_6 = Static9.method178(new Class118[] { Static61.method1063("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass162_Sub3_23, 35632) }, super.aClass162_Sub3_23);
		this.aClass233_4 = Static9.method178(new Class118[] { Static61.method1063("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass162_Sub3_23, 35632) }, super.aClass162_Sub3_23);
		this.aClass233_3 = Static9.method178(new Class118[] { Static61.method1063("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass162_Sub3_23, 35632) }, super.aClass162_Sub3_23);
		return this.aClass233_6 != null && this.aClass233_5 != null && this.aClass233_4 != null && this.aClass233_3 != null;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4029() {
		return this.aClass105_2 != null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!aaa;Lclient!aaa;II)V")
	@Override
	public void method4039(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass3_Sub1Array3 == null) {
			super.aClass162_Sub3_23.method6911(arg1);
			super.aClass162_Sub3_23.method6942(this.aClass105_2);
			this.aClass105_2.method1950(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass233_5.aLong160;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static267.aFloat241, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4817, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4817, (float) this.anInt4821);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4821);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass162_Sub3_23.method6942(this.aClass105_1);
			@Pc(38) int local38 = Static511.method7273(this.anInt4817);
			@Pc(43) int local43 = Static511.method7273(this.anInt4821);
			@Pc(45) int local45 = 0;
			while (local38 > 256 || local43 > 256) {
				OpenGL.glViewport(0, 0, local38, local43);
				this.aClass105_1.method1940(this.aClass3_Sub1Array3[local45], 0);
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local45 == 0) {
					super.aClass162_Sub3_23.method6911(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4817, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4817, (float) this.anInt4821);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4821);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass162_Sub3_23.method6911(this.aClass3_Sub1Array3[local45 - 1]);
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
				if (local43 > 256) {
					local43 >>= 0x1;
				}
				local45++;
			}
			super.aClass162_Sub3_23.method6897(this.aClass105_1);
			super.aClass162_Sub3_23.method6911(this.aClass3_Sub1Array3[local45 - 1]);
			super.aClass162_Sub3_23.method6942(this.aClass105_2);
			this.aClass105_2.method1950(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass233_6.aLong160;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static267.aFloat241, 0.0F, 0.0F);
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
		this.aClass105_2.method1950(1);
		super.aClass162_Sub3_23.method6911(this.aClass3_Sub1_1);
		local269 = this.aClass233_3.aLong160;
		OpenGL.glUseProgramObjectARB(local269);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass105_2.method1950(0);
		super.aClass162_Sub3_23.method6911(this.aClass3_Sub1_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass162_Sub3_23.method6897(this.aClass105_2);
		@Pc(437) long local437 = this.aClass233_4.aLong160;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static349.aFloat187, Static218.aFloat70, 0.0F);
		super.aClass162_Sub3_23.method6947(1);
		super.aClass162_Sub3_23.method6911(this.aClass3_Sub1_1);
		super.aClass162_Sub3_23.method6947(0);
		super.aClass162_Sub3_23.method6911(arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)V")
	@Override
	public void method4031(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass162_Sub3_23.method6947(1);
		super.aClass162_Sub3_23.method6911(null);
		super.aClass162_Sub3_23.method6947(0);
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I")
	@Override
	public int method4035() {
		return 1;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z")
	public boolean method4044() {
		return super.aClass162_Sub3_23.aBoolean721 && super.aClass162_Sub3_23.aBoolean728 && super.aClass162_Sub3_23.aBoolean730;
	}
}
