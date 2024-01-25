import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub10_Sub1 extends Class1_Sub10 {

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[Lclient!qv;")
	private Class13_Sub1[] aClass13_Sub1Array4;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Lclient!ed;")
	private Class65 aClass65_2;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!ed;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!qv;")
	private Class13_Sub1 aClass13_Sub1_2;

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Lclient!lr;")
	private Class150 aClass150_4;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!ed;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!qv;")
	private Class13_Sub1 aClass13_Sub1_3;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!ed;")
	private Class65 aClass65_5;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!lr;")
	private Class150 aClass150_5;

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	private int anInt2515;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
	private int anInt2517;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
	private int anInt2520;

	static {
		new Class84("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class1_Sub10_Sub1(@OriginalArg(0) Class109_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
	public boolean method2217() {
		return super.aClass109_Sub1_18.aBoolean153 && super.aClass109_Sub1_18.aBoolean160 && super.aClass109_Sub1_18.aBoolean177;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I")
	@Override
	public int method2212() {
		return 1;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLclient!qv;Lclient!qv;)V")
	@Override
	public void method2214(@OriginalArg(0) int arg0, @OriginalArg(2) Class13_Sub1 arg1, @OriginalArg(3) Class13_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		@Pc(269) long local269;
		if (this.aClass13_Sub1Array4 == null) {
			super.aClass109_Sub1_18.method2578(arg1);
			super.aClass109_Sub1_18.method2600(this.aClass150_4);
			this.aClass150_4.method3529(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass65_5.aLong47;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static204.aFloat67, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2517, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2517, (float) this.anInt2519);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2519);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass109_Sub1_18.method2600(this.aClass150_5);
			@Pc(108) int local108 = Static296.method2396(this.anInt2517);
			@Pc(113) int local113 = Static296.method2396(this.anInt2519);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass150_5.method3527(this.aClass13_Sub1Array4[local115], 0);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass109_Sub1_18.method2578(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2517, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2517, (float) this.anInt2519);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2519);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass109_Sub1_18.method2578(this.aClass13_Sub1Array4[local115 - 1]);
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
			super.aClass109_Sub1_18.method2591(this.aClass150_5);
			super.aClass109_Sub1_18.method2578(this.aClass13_Sub1Array4[local115 - 1]);
			super.aClass109_Sub1_18.method2600(this.aClass150_4);
			this.aClass150_4.method3529(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass65_4.aLong47;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static204.aFloat67, 0.0F, 0.0F);
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
		this.aClass150_4.method3529(1);
		super.aClass109_Sub1_18.method2578(this.aClass13_Sub1_3);
		local46 = this.aClass65_2.aLong47;
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
		this.aClass150_4.method3529(0);
		super.aClass109_Sub1_18.method2578(this.aClass13_Sub1_2);
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
		super.aClass109_Sub1_18.method2591(this.aClass150_4);
		local269 = this.aClass65_3.aLong47;
		OpenGL.glUseProgramObjectARB(local269);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static231.aFloat76, Static283.aFloat79, 0.0F);
		super.aClass109_Sub1_18.method2564(1);
		super.aClass109_Sub1_18.method2578(this.aClass13_Sub1_3);
		super.aClass109_Sub1_18.method2564(0);
		super.aClass109_Sub1_18.method2578(arg1);
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method2213() {
		if (!super.aClass109_Sub1_18.aBoolean153 || !super.aClass109_Sub1_18.aBoolean160 || !super.aClass109_Sub1_18.aBoolean177) {
			return false;
		}
		this.aClass150_4 = new Class150(super.aClass109_Sub1_18);
		this.aClass13_Sub1_3 = new Class13_Sub1(super.aClass109_Sub1_18, 3553, 34842, 256, 256);
		this.aClass13_Sub1_3.method1055(false, false);
		this.aClass13_Sub1_2 = new Class13_Sub1(super.aClass109_Sub1_18, 3553, 34842, 256, 256);
		this.aClass13_Sub1_2.method1055(false, false);
		super.aClass109_Sub1_18.method2600(this.aClass150_4);
		this.aClass150_4.method3527(this.aClass13_Sub1_3, 0);
		this.aClass150_4.method3527(this.aClass13_Sub1_2, 1);
		this.aClass150_4.method3529(0);
		if (!this.aClass150_4.method3526()) {
			super.aClass109_Sub1_18.method2591(this.aClass150_4);
			return false;
		}
		super.aClass109_Sub1_18.method2591(this.aClass150_4);
		this.aClass65_5 = Static292.method3804(super.aClass109_Sub1_18, new Class149[] { Static325.method4587("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass109_Sub1_18, 35632) });
		this.aClass65_4 = Static292.method3804(super.aClass109_Sub1_18, new Class149[] { Static325.method4587("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass109_Sub1_18, 35632) });
		this.aClass65_3 = Static292.method3804(super.aClass109_Sub1_18, new Class149[] { Static325.method4587("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass109_Sub1_18, 35632) });
		this.aClass65_2 = Static292.method3804(super.aClass109_Sub1_18, new Class149[] { Static325.method4587("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass109_Sub1_18, 35632) });
		return this.aClass65_4 != null && this.aClass65_5 != null && this.aClass65_3 != null && this.aClass65_2 != null;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method2211() {
		return this.aClass150_4 != null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	@Override
	public void method2207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2517 = arg0;
		this.anInt2519 = arg1;
		@Pc(16) int local16 = Static296.method2396(this.anInt2517);
		@Pc(21) int local21 = Static296.method2396(this.anInt2519);
		if (local16 == this.anInt2515 && local21 == this.anInt2520) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass13_Sub1Array4 != null) {
			for (local38 = 0; local38 < this.aClass13_Sub1Array4.length; local38++) {
				this.aClass13_Sub1Array4[local38].method2744();
			}
			this.aClass13_Sub1Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass150_5 = null;
		} else {
			local38 = local16;
			@Pc(76) int local76 = local21;
			@Pc(78) int local78 = 0;
			if (this.aClass150_5 == null) {
				this.aClass150_5 = new Class150(super.aClass109_Sub1_18);
			}
			label56: while (true) {
				if (local38 <= 256 && local76 <= 256) {
					this.aClass13_Sub1Array4 = new Class13_Sub1[local78];
					local76 = local21;
					local38 = local16;
					local78 = 0;
					while (true) {
						if (local38 <= 256 && local76 <= 256) {
							break label56;
						}
						this.aClass13_Sub1Array4[local78++] = new Class13_Sub1(super.aClass109_Sub1_18, 3553, 34842, local38, local76);
						if (local76 > 256) {
							local76 >>= 0x1;
						}
						if (local38 > 256) {
							local38 >>= 0x1;
						}
					}
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local76 > 256) {
					local76 >>= 0x1;
				}
				local78++;
			}
		}
		this.anInt2520 = local21;
		this.anInt2515 = local16;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
	@Override
	public void method2215() {
		this.aClass13_Sub1_2 = null;
		this.aClass65_5 = null;
		this.aClass13_Sub1_3 = null;
		this.aClass13_Sub1Array4 = null;
		this.aClass150_4 = null;
		this.aClass65_4 = null;
		this.aClass65_3 = null;
		this.aClass150_5 = null;
		this.aClass65_2 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	@Override
	public void method2208(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass109_Sub1_18.method2564(1);
		super.aClass109_Sub1_18.method2578(null);
		super.aClass109_Sub1_18.method2564(0);
	}
}
