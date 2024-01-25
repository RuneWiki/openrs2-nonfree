import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!ud;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	private int anInt6640;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Lclient!ud;")
	private Class202 aClass202_2;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!ud;")
	private Class202 aClass202_3;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!bj;")
	private Class20_Sub1 aClass20_Sub1_6;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!ud;")
	private Class202 aClass202_4;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private int anInt6641;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "[Lclient!bj;")
	private Class20_Sub1[] aClass20_Sub1Array4;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt6642;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!ao;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!bj;")
	private Class20_Sub1 aClass20_Sub1_7;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "Lclient!ao;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	private int anInt6643;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) Class32_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	@Override
	public void method5567() {
		this.aClass11_4 = null;
		this.aClass20_Sub1Array4 = null;
		this.aClass11_3 = null;
		this.aClass20_Sub1_6 = null;
		this.aClass20_Sub1_7 = null;
		this.aClass202_3 = null;
		this.aClass202_4 = null;
		this.aClass202_2 = null;
		this.aClass202_1 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	@Override
	public void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6640 = arg0;
		this.anInt6641 = arg1;
		@Pc(10) int local10 = Static258.method4650(this.anInt6640);
		@Pc(15) int local15 = Static258.method4650(this.anInt6641);
		if (this.anInt6643 == local10 && this.anInt6642 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass20_Sub1Array4 != null) {
			for (local28 = 0; local28 < this.aClass20_Sub1Array4.length; local28++) {
				this.aClass20_Sub1Array4[local28].method5500();
			}
			this.aClass20_Sub1Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass11_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass11_4 == null) {
						this.aClass11_4 = new Class11(this.aClass32_Sub2_42);
					}
					this.aClass20_Sub1Array4 = new Class20_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass20_Sub1Array4[local55++] = new Class20_Sub1(this.aClass32_Sub2_42, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt6643 = local10;
		this.anInt6642 = local15;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()Z")
	@Override
	public boolean method5568() {
		return this.aClass11_3 != null;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "()Z")
	public boolean method5575() {
		return this.aClass32_Sub2_42.aBoolean228 && this.aClass32_Sub2_42.aBoolean241 && this.aClass32_Sub2_42.aBoolean237;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	@Override
	public int method5565() {
		return 1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!bj;Lclient!bj;)V")
	@Override
	public void method5574(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) Class20_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_42.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass20_Sub1Array4 == null) {
			this.aClass32_Sub2_42.method2287(arg1);
			this.aClass32_Sub2_42.method2316(this.aClass11_3);
			this.aClass11_3.method348(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass202_3.anInt6130;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static347.aFloat77, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt6640, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt6640, (float) this.anInt6641);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt6641);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass32_Sub2_42.method2316(this.aClass11_4);
			local34 = Static258.method4650(this.anInt6640);
			local39 = Static258.method4650(this.anInt6641);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass11_4.method342(0, this.aClass20_Sub1Array4[local41]);
				if (local41 == 0) {
					this.aClass32_Sub2_42.method2287(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt6640, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt6640, (float) this.anInt6641);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt6641);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass32_Sub2_42.method2287(this.aClass20_Sub1Array4[local41 - 1]);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass32_Sub2_42.method2302(this.aClass11_4);
			this.aClass32_Sub2_42.method2287(this.aClass20_Sub1Array4[local41 - 1]);
			this.aClass32_Sub2_42.method2316(this.aClass11_3);
			this.aClass11_3.method348(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass202_4.anInt6130;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static347.aFloat77, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass11_3.method348(1);
		this.aClass32_Sub2_42.method2287(this.aClass20_Sub1_6);
		local34 = this.aClass202_1.anInt6130;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass11_3.method348(0);
		this.aClass32_Sub2_42.method2287(this.aClass20_Sub1_7);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		this.aClass32_Sub2_42.method2302(this.aClass11_3);
		local39 = this.aClass202_2.anInt6130;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static347.aFloat76, Static347.aFloat78, 0.0F);
		this.aClass32_Sub2_42.method2314(1);
		this.aClass32_Sub2_42.method2287(this.aClass20_Sub1_6);
		this.aClass32_Sub2_42.method2314(0);
		this.aClass32_Sub2_42.method2287(arg1);
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()Z")
	@Override
	public boolean method5571() {
		if (!this.aClass32_Sub2_42.aBoolean228 || !this.aClass32_Sub2_42.aBoolean241 || !this.aClass32_Sub2_42.aBoolean237) {
			return false;
		}
		this.aClass11_3 = new Class11(this.aClass32_Sub2_42);
		this.aClass20_Sub1_6 = new Class20_Sub1(this.aClass32_Sub2_42, 3553, 34842, 256, 256);
		this.aClass20_Sub1_6.method1388(false, false);
		this.aClass20_Sub1_7 = new Class20_Sub1(this.aClass32_Sub2_42, 3553, 34842, 256, 256);
		this.aClass20_Sub1_7.method1388(false, false);
		this.aClass32_Sub2_42.method2316(this.aClass11_3);
		this.aClass11_3.method342(0, this.aClass20_Sub1_6);
		this.aClass11_3.method342(1, this.aClass20_Sub1_7);
		this.aClass11_3.method348(0);
		if (!this.aClass11_3.method346()) {
			this.aClass32_Sub2_42.method2302(this.aClass11_3);
			return false;
		}
		this.aClass32_Sub2_42.method2302(this.aClass11_3);
		this.aClass202_3 = Static317.method5215(this.aClass32_Sub2_42, new Class46[] { Static60.method1515(this.aClass32_Sub2_42, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass202_4 = Static317.method5215(this.aClass32_Sub2_42, new Class46[] { Static60.method1515(this.aClass32_Sub2_42, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass202_2 = Static317.method5215(this.aClass32_Sub2_42, new Class46[] { Static60.method1515(this.aClass32_Sub2_42, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass202_1 = Static317.method5215(this.aClass32_Sub2_42, new Class46[] { Static60.method1515(this.aClass32_Sub2_42, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass202_4 != null && this.aClass202_3 != null && this.aClass202_2 != null && this.aClass202_1 != null;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	@Override
	public void method5572(@OriginalArg(0) int arg0) {
		this.aClass32_Sub2_42.anOpengl2.glUseProgramObjectARB(0);
		this.aClass32_Sub2_42.method2314(1);
		this.aClass32_Sub2_42.method2287(null);
		this.aClass32_Sub2_42.method2314(0);
	}
}
