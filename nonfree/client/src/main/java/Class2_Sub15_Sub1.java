import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub15_Sub1 extends Class2_Sub15 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	private int anInt9279;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!waa;")
	private Class369 aClass369_4;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!waa;")
	private Class369 aClass369_5;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Lclient!fq;")
	private Class65_Sub1 aClass65_Sub1_5;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "Lclient!tea;")
	private Class333 aClass333_6;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!waa;")
	private Class369 aClass369_6;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	private int anInt9286;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "Lclient!waa;")
	private Class369 aClass369_7;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private int anInt9288;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "[Lclient!fq;")
	private Class65_Sub1[] aClass65_Sub1Array4;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!tea;")
	private Class333 aClass333_7;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	private int anInt9290;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Lclient!fq;")
	private Class65_Sub1 aClass65_Sub1_6;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class2_Sub15_Sub1(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	@Override
	public int method7778() {
		return 1;
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7786() {
		return this.aClass333_6 != null;
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(I)Z")
	public boolean method7794() {
		return super.aClass95_Sub1_41.aBoolean184 && super.aClass95_Sub1_41.aBoolean179 && super.aClass95_Sub1_41.aBoolean185;
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
	@Override
	public void method7788() {
		this.aClass65_Sub1_5 = null;
		this.aClass369_5 = null;
		this.aClass369_4 = null;
		this.aClass333_6 = null;
		this.aClass369_7 = null;
		this.aClass65_Sub1Array4 = null;
		this.aClass333_7 = null;
		this.aClass65_Sub1_6 = null;
		this.aClass369_6 = null;
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7789() {
		if (!super.aClass95_Sub1_41.aBoolean184 || !super.aClass95_Sub1_41.aBoolean179 || !super.aClass95_Sub1_41.aBoolean185) {
			return false;
		}
		this.aClass333_6 = new Class333(super.aClass95_Sub1_41);
		this.aClass65_Sub1_6 = new Class65_Sub1(super.aClass95_Sub1_41, 3553, 34842, 256, 256);
		this.aClass65_Sub1_6.method1424(false, false);
		this.aClass65_Sub1_5 = new Class65_Sub1(super.aClass95_Sub1_41, 3553, 34842, 256, 256);
		this.aClass65_Sub1_5.method1424(false, false);
		super.aClass95_Sub1_41.method2090(this.aClass333_6);
		this.aClass333_6.method7483(this.aClass65_Sub1_6, 0);
		this.aClass333_6.method7483(this.aClass65_Sub1_5, 1);
		this.aClass333_6.method7488(0);
		if (!this.aClass333_6.method7490()) {
			super.aClass95_Sub1_41.method2070(this.aClass333_6);
			return false;
		}
		super.aClass95_Sub1_41.method2070(this.aClass333_6);
		this.aClass369_4 = Static238.method3336(super.aClass95_Sub1_41, new Class83[] { Static547.method7553("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass95_Sub1_41, 35632) });
		this.aClass369_6 = Static238.method3336(super.aClass95_Sub1_41, new Class83[] { Static547.method7553("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass95_Sub1_41, 35632) });
		this.aClass369_7 = Static238.method3336(super.aClass95_Sub1_41, new Class83[] { Static547.method7553("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass95_Sub1_41, 35632) });
		this.aClass369_5 = Static238.method3336(super.aClass95_Sub1_41, new Class83[] { Static547.method7553("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass95_Sub1_41, 35632) });
		return this.aClass369_6 != null && this.aClass369_4 != null && this.aClass369_7 != null && this.aClass369_5 != null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9279 = arg0;
		this.anInt9290 = arg1;
		@Pc(16) int local16 = Static285.method3974(this.anInt9290);
		@Pc(21) int local21 = Static285.method3974(this.anInt9279);
		if (this.anInt9288 == local16 && this.anInt9286 == local21) {
			return;
		}
		@Pc(48) int local48;
		if (this.aClass65_Sub1Array4 != null) {
			for (local48 = 0; local48 < this.aClass65_Sub1Array4.length; local48++) {
				this.aClass65_Sub1Array4[local48].method6828();
			}
			this.aClass65_Sub1Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass333_7 = null;
		} else {
			local48 = local16;
			@Pc(86) int local86 = local21;
			@Pc(88) int local88 = 0;
			if (this.aClass333_7 == null) {
				this.aClass333_7 = new Class333(super.aClass95_Sub1_41);
			}
			label54: while (true) {
				if (local48 <= 256 && local86 <= 256) {
					local86 = local21;
					this.aClass65_Sub1Array4 = new Class65_Sub1[local88];
					local48 = local16;
					local88 = 0;
					while (true) {
						if (local48 <= 256 && local86 <= 256) {
							break label54;
						}
						this.aClass65_Sub1Array4[local88++] = new Class65_Sub1(super.aClass95_Sub1_41, 3553, 34842, local48, local86);
						if (local48 > 256) {
							local48 >>= 0x1;
						}
						if (local86 > 256) {
							local86 >>= 0x1;
						}
					}
				}
				local88++;
				if (local86 > 256) {
					local86 >>= 0x1;
				}
				if (local48 > 256) {
					local48 >>= 0x1;
				}
			}
		}
		this.anInt9286 = local21;
		this.anInt9288 = local16;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7779(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass95_Sub1_41.method2098(1);
		super.aClass95_Sub1_41.method2077(null);
		super.aClass95_Sub1_41.method2098(0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!fq;ILclient!fq;B)V")
	@Override
	public void method7790(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		@Pc(271) long local271;
		if (this.aClass65_Sub1Array4 == null) {
			super.aClass95_Sub1_41.method2077(arg2);
			super.aClass95_Sub1_41.method2090(this.aClass333_6);
			this.aClass333_6.method7488(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass369_4.aLong271;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static185.aFloat51, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9290, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9290, (float) this.anInt9279);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9279);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass95_Sub1_41.method2090(this.aClass333_7);
			@Pc(108) int local108 = Static285.method3974(this.anInt9290);
			@Pc(113) int local113 = Static285.method3974(this.anInt9279);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass333_7.method7483(this.aClass65_Sub1Array4[local115], 0);
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass95_Sub1_41.method2077(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9290, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9290, (float) this.anInt9279);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9279);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass95_Sub1_41.method2077(this.aClass65_Sub1Array4[local115 - 1]);
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
				local115++;
			}
			super.aClass95_Sub1_41.method2070(this.aClass333_7);
			super.aClass95_Sub1_41.method2077(this.aClass65_Sub1Array4[local115 - 1]);
			super.aClass95_Sub1_41.method2090(this.aClass333_6);
			this.aClass333_6.method7488(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local271 = this.aClass369_6.aLong271;
			OpenGL.glUseProgramObjectARB(local271);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static185.aFloat51, 0.0F, 0.0F);
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
		this.aClass333_6.method7488(1);
		super.aClass95_Sub1_41.method2077(this.aClass65_Sub1_6);
		local46 = this.aClass369_5.aLong271;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass333_6.method7488(0);
		super.aClass95_Sub1_41.method2077(this.aClass65_Sub1_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass95_Sub1_41.method2070(this.aClass333_6);
		local271 = this.aClass369_7.aLong271;
		OpenGL.glUseProgramObjectARB(local271);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static42.aFloat113, Static436.aFloat142, 0.0F);
		super.aClass95_Sub1_41.method2098(1);
		super.aClass95_Sub1_41.method2077(this.aClass65_Sub1_6);
		super.aClass95_Sub1_41.method2098(0);
		super.aClass95_Sub1_41.method2077(arg2);
	}
}
