import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class2_Sub48_Sub1 extends Class2_Sub48 {

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Lclient!me;")
	private Class88_Sub2 aClass88_Sub2_5;

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "Lclient!ij;")
	private Class161 aClass161_6;

	@OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
	private int anInt9292;

	@OriginalMember(owner = "client!uba", name = "w", descriptor = "[Lclient!me;")
	private Class88_Sub2[] aClass88_Sub2Array4;

	@OriginalMember(owner = "client!uba", name = "x", descriptor = "Lclient!ij;")
	private Class161 aClass161_7;

	@OriginalMember(owner = "client!uba", name = "C", descriptor = "Lclient!as;")
	private Class23 aClass23_4;

	@OriginalMember(owner = "client!uba", name = "E", descriptor = "Lclient!as;")
	private Class23 aClass23_5;

	@OriginalMember(owner = "client!uba", name = "H", descriptor = "Lclient!as;")
	private Class23 aClass23_6;

	@OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
	private int anInt9297;

	@OriginalMember(owner = "client!uba", name = "K", descriptor = "I")
	private int anInt9298;

	@OriginalMember(owner = "client!uba", name = "N", descriptor = "I")
	private int anInt9301;

	@OriginalMember(owner = "client!uba", name = "O", descriptor = "Lclient!me;")
	private Class88_Sub2 aClass88_Sub2_6;

	@OriginalMember(owner = "client!uba", name = "P", descriptor = "Lclient!as;")
	private Class23 aClass23_7;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class2_Sub48_Sub1(@OriginalArg(0) Class87_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7783() {
		if (!super.aClass87_Sub2_38.aBoolean546 || !super.aClass87_Sub2_38.aBoolean560 || !super.aClass87_Sub2_38.aBoolean540) {
			return false;
		}
		this.aClass161_6 = new Class161(super.aClass87_Sub2_38);
		this.aClass88_Sub2_6 = new Class88_Sub2(super.aClass87_Sub2_38, 3553, 34842, 256, 256);
		this.aClass88_Sub2_6.method5202(false, false);
		this.aClass88_Sub2_5 = new Class88_Sub2(super.aClass87_Sub2_38, 3553, 34842, 256, 256);
		this.aClass88_Sub2_5.method5202(false, false);
		super.aClass87_Sub2_38.method6188(this.aClass161_6);
		this.aClass161_6.method3959(this.aClass88_Sub2_6, 0);
		this.aClass161_6.method3959(this.aClass88_Sub2_5, 1);
		this.aClass161_6.method3968(0);
		if (!this.aClass161_6.method3960()) {
			super.aClass87_Sub2_38.method6184(this.aClass161_6);
			return false;
		}
		super.aClass87_Sub2_38.method6184(this.aClass161_6);
		this.aClass23_5 = Static85.method1550(new Class134[] { Static532.method7450(35632, super.aClass87_Sub2_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass87_Sub2_38);
		this.aClass23_6 = Static85.method1550(new Class134[] { Static532.method7450(35632, super.aClass87_Sub2_38, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass87_Sub2_38);
		this.aClass23_4 = Static85.method1550(new Class134[] { Static532.method7450(35632, super.aClass87_Sub2_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass87_Sub2_38);
		this.aClass23_7 = Static85.method1550(new Class134[] { Static532.method7450(35632, super.aClass87_Sub2_38, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass87_Sub2_38);
		return this.aClass23_6 != null && this.aClass23_5 != null && this.aClass23_4 != null && this.aClass23_7 != null;
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)Z")
	public boolean method7784() {
		return super.aClass87_Sub2_38.aBoolean546 && super.aClass87_Sub2_38.aBoolean560 && super.aClass87_Sub2_38.aBoolean540;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)V")
	@Override
	public void method7774(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass87_Sub2_38.method6155(1);
		super.aClass87_Sub2_38.method6167(null);
		super.aClass87_Sub2_38.method6155(0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BII)V")
	@Override
	public void method7777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9297 = arg1;
		this.anInt9292 = arg0;
		@Pc(24) int local24 = Static291.method4549(this.anInt9292);
		@Pc(29) int local29 = Static291.method4549(this.anInt9297);
		if (this.anInt9301 == local24 && local29 == this.anInt9298) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass88_Sub2Array4 != null) {
			for (local46 = 0; local46 < this.aClass88_Sub2Array4.length; local46++) {
				this.aClass88_Sub2Array4[local46].method6984();
			}
			this.aClass88_Sub2Array4 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass161_7 = null;
		} else {
			local46 = local24;
			@Pc(81) int local81 = local29;
			@Pc(83) int local83 = 0;
			if (this.aClass161_7 == null) {
				this.aClass161_7 = new Class161(super.aClass87_Sub2_38);
			}
			label55: while (true) {
				if (local46 <= 256 && local81 <= 256) {
					local81 = local29;
					this.aClass88_Sub2Array4 = new Class88_Sub2[local83];
					local46 = local24;
					local83 = 0;
					while (true) {
						if (local46 <= 256 && local81 <= 256) {
							break label55;
						}
						this.aClass88_Sub2Array4[local83++] = new Class88_Sub2(super.aClass87_Sub2_38, 3553, 34842, local46, local81);
						if (local81 > 256) {
							local81 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
				local83++;
				if (local81 > 256) {
					local81 >>= 0x1;
				}
			}
		}
		this.anInt9298 = local29;
		this.anInt9301 = local24;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7780() {
		return this.aClass161_6 != null;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I")
	@Override
	public int method7782() {
		return 1;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	@Override
	public void method7781() {
		this.aClass23_5 = null;
		this.aClass23_4 = null;
		this.aClass161_6 = null;
		this.aClass23_6 = null;
		this.aClass23_7 = null;
		this.aClass88_Sub2Array4 = null;
		this.aClass161_7 = null;
		this.aClass88_Sub2_6 = null;
		this.aClass88_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BILclient!me;Lclient!me;)V")
	@Override
	public void method7776(@OriginalArg(1) int arg0, @OriginalArg(2) Class88_Sub2 arg1, @OriginalArg(3) Class88_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(263) long local263;
		if (this.aClass88_Sub2Array4 == null) {
			super.aClass87_Sub2_38.method6167(arg2);
			super.aClass87_Sub2_38.method6188(this.aClass161_6);
			this.aClass161_6.method3968(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local263 = this.aClass23_5.aLong24;
			OpenGL.glUseProgramObjectARB(local263);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local263, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local263, "params"), Static638.aFloat195, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9292, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9292, (float) this.anInt9297);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9297);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass87_Sub2_38.method6188(this.aClass161_7);
			@Pc(32) int local32 = Static291.method4549(this.anInt9292);
			@Pc(37) int local37 = Static291.method4549(this.anInt9297);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass161_7.method3959(this.aClass88_Sub2Array4[local39], 0);
				if (local39 == 0) {
					super.aClass87_Sub2_38.method6167(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9292, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9292, (float) this.anInt9297);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9297);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass87_Sub2_38.method6167(this.aClass88_Sub2Array4[local39 - 1]);
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
			super.aClass87_Sub2_38.method6184(this.aClass161_7);
			super.aClass87_Sub2_38.method6167(this.aClass88_Sub2Array4[local39 - 1]);
			super.aClass87_Sub2_38.method6188(this.aClass161_6);
			this.aClass161_6.method3968(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(195) long local195 = this.aClass23_6.aLong24;
			OpenGL.glUseProgramObjectARB(local195);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local195, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local195, "params"), Static638.aFloat195, 0.0F, 0.0F);
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
		this.aClass161_6.method3968(1);
		super.aClass87_Sub2_38.method6167(this.aClass88_Sub2_6);
		local263 = this.aClass23_7.aLong24;
		OpenGL.glUseProgramObjectARB(local263);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local263, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local263, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass161_6.method3968(0);
		super.aClass87_Sub2_38.method6167(this.aClass88_Sub2_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local263, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass87_Sub2_38.method6184(this.aClass161_6);
		@Pc(427) long local427 = this.aClass23_4.aLong24;
		OpenGL.glUseProgramObjectARB(local427);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local427, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local427, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local427, "params"), Static311.aFloat132, Static181.aFloat108, 0.0F);
		super.aClass87_Sub2_38.method6155(1);
		super.aClass87_Sub2_38.method6167(this.aClass88_Sub2_6);
		super.aClass87_Sub2_38.method6155(0);
		super.aClass87_Sub2_38.method6167(arg2);
	}
}
