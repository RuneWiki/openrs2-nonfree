import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class14_Sub16_Sub1 extends Class14_Sub16 {

	@OriginalMember(owner = "client!dka", name = "y", descriptor = "Lclient!hw;")
	private Class152 aClass152_2;

	@OriginalMember(owner = "client!dka", name = "E", descriptor = "Lclient!km;")
	private Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!dka", name = "G", descriptor = "Lclient!hw;")
	private Class152 aClass152_3;

	@OriginalMember(owner = "client!dka", name = "H", descriptor = "Lclient!gja;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!dka", name = "J", descriptor = "[Lclient!km;")
	private Class66_Sub1[] aClass66_Sub1Array1;

	@OriginalMember(owner = "client!dka", name = "K", descriptor = "Lclient!hw;")
	private Class152 aClass152_4;

	@OriginalMember(owner = "client!dka", name = "M", descriptor = "I")
	private int anInt2231;

	@OriginalMember(owner = "client!dka", name = "N", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!dka", name = "R", descriptor = "Lclient!km;")
	private Class66_Sub1 aClass66_Sub1_2;

	@OriginalMember(owner = "client!dka", name = "T", descriptor = "Lclient!hw;")
	private Class152 aClass152_5;

	@OriginalMember(owner = "client!dka", name = "U", descriptor = "I")
	private int anInt2237;

	@OriginalMember(owner = "client!dka", name = "V", descriptor = "Lclient!gja;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!dka", name = "W", descriptor = "I")
	private int anInt2238;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class14_Sub16_Sub1(@OriginalArg(0) Class137_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(II)V")
	@Override
	public void method1886(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass137_Sub3_9.method7095(1);
		super.aClass137_Sub3_9.method7090((Class66) null);
		super.aClass137_Sub3_9.method7095(0);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1884() {
		return this.aClass125_2 != null;
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)I")
	@Override
	public int method1885() {
		return 1;
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V")
	@Override
	public void method1887() {
		this.aClass152_2 = null;
		this.aClass125_2 = null;
		this.aClass152_4 = null;
		this.aClass66_Sub1Array1 = null;
		this.aClass125_1 = null;
		this.aClass66_Sub1_2 = null;
		this.aClass152_3 = null;
		this.aClass152_5 = null;
		this.aClass66_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1890() {
		if (!super.aClass137_Sub3_9.aBoolean608 || !super.aClass137_Sub3_9.aBoolean599 || !super.aClass137_Sub3_9.aBoolean607) {
			return false;
		}
		this.aClass125_2 = new Class125(super.aClass137_Sub3_9);
		this.aClass66_Sub1_2 = new Class66_Sub1(super.aClass137_Sub3_9, 3553, 34842, 256, 256);
		this.aClass66_Sub1_2.method1669(false, false);
		this.aClass66_Sub1_1 = new Class66_Sub1(super.aClass137_Sub3_9, 3553, 34842, 256, 256);
		this.aClass66_Sub1_1.method1669(false, false);
		super.aClass137_Sub3_9.method7058(this.aClass125_2);
		this.aClass125_2.method2973(this.aClass66_Sub1_2, 0);
		this.aClass125_2.method2973(this.aClass66_Sub1_1, 1);
		this.aClass125_2.method2969(0);
		if (!this.aClass125_2.method2968()) {
			super.aClass137_Sub3_9.method7037(this.aClass125_2);
			return false;
		}
		super.aClass137_Sub3_9.method7037(this.aClass125_2);
		this.aClass152_3 = Static174.method9031(new Class237[] { Static489.method7252(35632, super.aClass137_Sub3_9, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass137_Sub3_9);
		this.aClass152_2 = Static174.method9031(new Class237[] { Static489.method7252(35632, super.aClass137_Sub3_9, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass137_Sub3_9);
		this.aClass152_4 = Static174.method9031(new Class237[] { Static489.method7252(35632, super.aClass137_Sub3_9, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass137_Sub3_9);
		this.aClass152_5 = Static174.method9031(new Class237[] { Static489.method7252(35632, super.aClass137_Sub3_9, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass137_Sub3_9);
		return this.aClass152_2 != null && this.aClass152_3 != null && this.aClass152_4 != null && this.aClass152_5 != null;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(III)V")
	@Override
	public void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2238 = arg0;
		this.anInt2237 = arg1;
		@Pc(20) int local20 = Static133.method2141(this.anInt2237);
		@Pc(25) int local25 = Static133.method2141(this.anInt2238);
		if (this.anInt2231 == local20 && local25 == this.anInt2232) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass66_Sub1Array1 != null) {
			for (local42 = 0; local42 < this.aClass66_Sub1Array1.length; local42++) {
				this.aClass66_Sub1Array1[local42].method6846();
			}
			this.aClass66_Sub1Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass125_1 = null;
		} else {
			local42 = local20;
			@Pc(80) int local80 = local25;
			@Pc(82) int local82 = 0;
			label56: while (true) {
				if (local42 <= 256 && local80 <= 256) {
					if (this.aClass125_1 == null) {
						this.aClass125_1 = new Class125(super.aClass137_Sub3_9);
					}
					this.aClass66_Sub1Array1 = new Class66_Sub1[local82];
					local80 = local25;
					local42 = local20;
					local82 = 0;
					while (true) {
						if (local42 <= 256 && local80 <= 256) {
							break label56;
						}
						this.aClass66_Sub1Array1[local82++] = new Class66_Sub1(super.aClass137_Sub3_9, 3553, 34842, local42, local80);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local80 > 256) {
							local80 >>= 0x1;
						}
					}
				}
				local82++;
				if (local80 > 256) {
					local80 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt2231 = local20;
		this.anInt2232 = local25;
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "(B)Z")
	public boolean method1895() {
		return super.aClass137_Sub3_9.aBoolean608 && super.aClass137_Sub3_9.aBoolean599 && super.aClass137_Sub3_9.aBoolean607;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZILclient!km;Lclient!km;)V")
	@Override
	public void method1882(@OriginalArg(1) int arg0, @OriginalArg(2) Class66_Sub1 arg1, @OriginalArg(3) Class66_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(261) long local261;
		if (this.aClass66_Sub1Array1 == null) {
			super.aClass137_Sub3_9.method7090(arg2);
			super.aClass137_Sub3_9.method7058(this.aClass125_2);
			this.aClass125_2.method2969(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local261 = this.aClass152_3.aLong121;
			OpenGL.glUseProgramObjectARB(local261);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local261, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local261, "params"), Static592.aFloat50, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2237, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2237, (float) this.anInt2238);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2238);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass137_Sub3_9.method7058(this.aClass125_1);
			@Pc(32) int local32 = Static133.method2141(this.anInt2237);
			@Pc(37) int local37 = Static133.method2141(this.anInt2238);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass125_1.method2973(this.aClass66_Sub1Array1[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass137_Sub3_9.method7090(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2237, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2237, (float) this.anInt2238);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2238);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass137_Sub3_9.method7090(this.aClass66_Sub1Array1[local39 - 1]);
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
			super.aClass137_Sub3_9.method7037(this.aClass125_1);
			super.aClass137_Sub3_9.method7090(this.aClass66_Sub1Array1[local39 - 1]);
			super.aClass137_Sub3_9.method7058(this.aClass125_2);
			this.aClass125_2.method2969(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(193) long local193 = this.aClass152_2.aLong121;
			OpenGL.glUseProgramObjectARB(local193);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local193, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local193, "params"), Static592.aFloat50, 0.0F, 0.0F);
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
		this.aClass125_2.method2969(1);
		super.aClass137_Sub3_9.method7090(this.aClass66_Sub1_2);
		local261 = this.aClass152_5.aLong121;
		OpenGL.glUseProgramObjectARB(local261);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local261, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local261, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass125_2.method2969(0);
		super.aClass137_Sub3_9.method7090(this.aClass66_Sub1_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local261, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass137_Sub3_9.method7037(this.aClass125_2);
		@Pc(429) long local429 = this.aClass152_4.aLong121;
		OpenGL.glUseProgramObjectARB(local429);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local429, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local429, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local429, "params"), Static668.aFloat270, Static462.aFloat187, 0.0F);
		super.aClass137_Sub3_9.method7095(1);
		super.aClass137_Sub3_9.method7090(this.aClass66_Sub1_2);
		super.aClass137_Sub3_9.method7095(0);
		super.aClass137_Sub3_9.method7090(arg2);
	}
}
