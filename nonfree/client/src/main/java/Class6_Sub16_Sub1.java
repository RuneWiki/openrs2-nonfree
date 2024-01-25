import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class6_Sub16_Sub1 extends Class6_Sub16 {

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "[Lclient!ud;")
	private Class19_Sub4[] aClass19_Sub4Array4;

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "Lclient!jh;")
	private Class129 aClass129_2;

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "Lclient!ud;")
	private Class19_Sub4 aClass19_Sub4_3;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "Lclient!jh;")
	private Class129 aClass129_3;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "Lclient!jh;")
	private Class129 aClass129_4;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "Lclient!jh;")
	private Class129 aClass129_5;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "Lclient!pr;")
	private Class200 aClass200_4;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
	private int anInt5665;

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "Lclient!pr;")
	private Class200 aClass200_5;

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
	private int anInt5667;

	@OriginalMember(owner = "client!qq", name = "X", descriptor = "Lclient!ud;")
	private Class19_Sub4 aClass19_Sub4_4;

	@OriginalMember(owner = "client!qq", name = "Y", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class6_Sub16_Sub1(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4750() {
		return this.aClass200_5 != null;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4742() {
		if (!super.aClass66_Sub2_32.aBoolean372 || !super.aClass66_Sub2_32.aBoolean375 || !super.aClass66_Sub2_32.aBoolean374) {
			return false;
		}
		this.aClass200_5 = new Class200(super.aClass66_Sub2_32);
		this.aClass19_Sub4_4 = new Class19_Sub4(super.aClass66_Sub2_32, 3553, 34842, 256, 256);
		this.aClass19_Sub4_4.method4257(false, false);
		this.aClass19_Sub4_3 = new Class19_Sub4(super.aClass66_Sub2_32, 3553, 34842, 256, 256);
		this.aClass19_Sub4_3.method4257(false, false);
		super.aClass66_Sub2_32.method5098(this.aClass200_5);
		this.aClass200_5.method4542(this.aClass19_Sub4_4, 0);
		this.aClass200_5.method4542(this.aClass19_Sub4_3, 1);
		this.aClass200_5.method4549(0);
		if (!this.aClass200_5.method4546()) {
			super.aClass66_Sub2_32.method5153(this.aClass200_5);
			return false;
		}
		super.aClass66_Sub2_32.method5153(this.aClass200_5);
		this.aClass129_3 = Static143.method2455(super.aClass66_Sub2_32, new Class168[] { Static227.method3401(super.aClass66_Sub2_32, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass129_4 = Static143.method2455(super.aClass66_Sub2_32, new Class168[] { Static227.method3401(super.aClass66_Sub2_32, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass129_2 = Static143.method2455(super.aClass66_Sub2_32, new Class168[] { Static227.method3401(super.aClass66_Sub2_32, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass129_5 = Static143.method2455(super.aClass66_Sub2_32, new Class168[] { Static227.method3401(super.aClass66_Sub2_32, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass129_4 != null && this.aClass129_3 != null && this.aClass129_2 != null && this.aClass129_5 != null;
	}

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)I")
	@Override
	public int method4749() {
		return 1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	@Override
	public void method4740(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass66_Sub2_32.method5075(1);
		super.aClass66_Sub2_32.method5109(null);
		super.aClass66_Sub2_32.method5075(0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5667 = arg0;
		this.anInt5669 = arg1;
		@Pc(20) int local20 = Static31.method761(this.anInt5669);
		@Pc(29) int local29 = Static31.method761(this.anInt5667);
		if (this.anInt5659 == local20 && local29 == this.anInt5665) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass19_Sub4Array4 != null) {
			for (local46 = 0; local46 < this.aClass19_Sub4Array4.length; local46++) {
				this.aClass19_Sub4Array4[local46].method4252();
			}
			this.aClass19_Sub4Array4 = null;
		}
		if (local20 <= 256 && local29 <= 256) {
			this.aClass200_4 = null;
		} else {
			local46 = local20;
			@Pc(79) int local79 = local29;
			@Pc(81) int local81 = 0;
			if (this.aClass200_4 == null) {
				this.aClass200_4 = new Class200(super.aClass66_Sub2_32);
			}
			label55: while (true) {
				if (local46 <= 256 && local79 <= 256) {
					local79 = local29;
					local46 = local20;
					this.aClass19_Sub4Array4 = new Class19_Sub4[local81];
					local81 = 0;
					while (true) {
						if (local46 <= 256 && local79 <= 256) {
							break label55;
						}
						this.aClass19_Sub4Array4[local81++] = new Class19_Sub4(super.aClass66_Sub2_32, 3553, 34842, local46, local79);
						if (local79 > 256) {
							local79 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				if (local79 > 256) {
					local79 >>= 0x1;
				}
				local81++;
				if (local46 > 256) {
					local46 >>= 0x1;
				}
			}
		}
		this.anInt5665 = local29;
		this.anInt5659 = local20;
	}

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)Z")
	public boolean method4755() {
		return super.aClass66_Sub2_32.aBoolean372 && super.aClass66_Sub2_32.aBoolean375 && super.aClass66_Sub2_32.aBoolean374;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
	@Override
	public void method4745() {
		this.aClass19_Sub4_4 = null;
		this.aClass129_2 = null;
		this.aClass200_4 = null;
		this.aClass129_3 = null;
		this.aClass19_Sub4_3 = null;
		this.aClass129_4 = null;
		this.aClass200_5 = null;
		this.aClass129_5 = null;
		this.aClass19_Sub4Array4 = null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ud;ILclient!ud;)V")
	@Override
	public void method4746(@OriginalArg(1) Class19_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19_Sub4 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(268) long local268;
		if (this.aClass19_Sub4Array4 == null) {
			super.aClass66_Sub2_32.method5109(arg2);
			super.aClass66_Sub2_32.method5098(this.aClass200_5);
			this.aClass200_5.method4549(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local268 = this.aClass129_3.aLong103;
			OpenGL.glUseProgramObjectARB(local268);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "params"), Static183.aFloat50, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5669, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5669, (float) this.anInt5667);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5667);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass66_Sub2_32.method5098(this.aClass200_4);
			@Pc(32) int local32 = Static31.method761(this.anInt5669);
			@Pc(37) int local37 = Static31.method761(this.anInt5667);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass200_4.method4542(this.aClass19_Sub4Array4[local39], 0);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass66_Sub2_32.method5109(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5669, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5669, (float) this.anInt5667);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5667);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass66_Sub2_32.method5109(this.aClass19_Sub4Array4[local39 - 1]);
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
			super.aClass66_Sub2_32.method5153(this.aClass200_4);
			super.aClass66_Sub2_32.method5109(this.aClass19_Sub4Array4[local39 - 1]);
			super.aClass66_Sub2_32.method5098(this.aClass200_5);
			this.aClass200_5.method4549(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(200) long local200 = this.aClass129_4.aLong103;
			OpenGL.glUseProgramObjectARB(local200);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local200, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local200, "params"), Static183.aFloat50, 0.0F, 0.0F);
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
		this.aClass200_5.method4549(1);
		super.aClass66_Sub2_32.method5109(this.aClass19_Sub4_4);
		local268 = this.aClass129_5.aLong103;
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
		this.aClass200_5.method4549(0);
		super.aClass66_Sub2_32.method5109(this.aClass19_Sub4_3);
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
		super.aClass66_Sub2_32.method5153(this.aClass200_5);
		@Pc(438) long local438 = this.aClass129_2.aLong103;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static274.aFloat53, Static115.aFloat22, 0.0F);
		super.aClass66_Sub2_32.method5075(1);
		super.aClass66_Sub2_32.method5109(this.aClass19_Sub4_4);
		super.aClass66_Sub2_32.method5075(0);
		super.aClass66_Sub2_32.method5109(arg2);
	}
}
