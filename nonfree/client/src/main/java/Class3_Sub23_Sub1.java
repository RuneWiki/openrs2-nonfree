import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class3_Sub23_Sub1 extends Class3_Sub23 {

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "Lclient!wh;")
	private Class50_Sub1 aClass50_Sub1_5;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "Lclient!caa;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
	private int anInt8204;

	@OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
	private int anInt8205;

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
	private int anInt8209;

	@OriginalMember(owner = "client!ru", name = "K", descriptor = "[Lclient!wh;")
	private Class50_Sub1[] aClass50_Sub1Array4;

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
	private int anInt8212;

	@OriginalMember(owner = "client!ru", name = "N", descriptor = "Lclient!wh;")
	private Class50_Sub1 aClass50_Sub1_6;

	@OriginalMember(owner = "client!ru", name = "P", descriptor = "Lclient!caa;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!ru", name = "Q", descriptor = "Lclient!caa;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!ru", name = "R", descriptor = "Lclient!nb;")
	private Class219 aClass219_6;

	@OriginalMember(owner = "client!ru", name = "W", descriptor = "Lclient!caa;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!ru", name = "X", descriptor = "Lclient!nb;")
	private Class219 aClass219_7;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class3_Sub23_Sub1(@OriginalArg(0) Class31_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(Z)I")
	@Override
	public int method6444() {
		return 1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6434() {
		return this.aClass219_7 != null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6437() {
		if (!super.aClass31_Sub2_38.aBoolean229 || !super.aClass31_Sub2_38.aBoolean221 || !super.aClass31_Sub2_38.aBoolean209) {
			return false;
		}
		this.aClass219_7 = new Class219(super.aClass31_Sub2_38);
		this.aClass50_Sub1_6 = new Class50_Sub1(super.aClass31_Sub2_38, 3553, 34842, 256, 256);
		this.aClass50_Sub1_6.method1507(false, false);
		this.aClass50_Sub1_5 = new Class50_Sub1(super.aClass31_Sub2_38, 3553, 34842, 256, 256);
		this.aClass50_Sub1_5.method1507(false, false);
		super.aClass31_Sub2_38.method2560(this.aClass219_7);
		this.aClass219_7.method5044(0, this.aClass50_Sub1_6);
		this.aClass219_7.method5044(1, this.aClass50_Sub1_5);
		this.aClass219_7.method5043(0);
		if (!this.aClass219_7.method5046()) {
			super.aClass31_Sub2_38.method2507(this.aClass219_7);
			return false;
		}
		super.aClass31_Sub2_38.method2507(this.aClass219_7);
		this.aClass45_4 = Static467.method6394(super.aClass31_Sub2_38, new Class157[] { Static524.method7238(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass31_Sub2_38) });
		this.aClass45_5 = Static467.method6394(super.aClass31_Sub2_38, new Class157[] { Static524.method7238(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass31_Sub2_38) });
		this.aClass45_6 = Static467.method6394(super.aClass31_Sub2_38, new Class157[] { Static524.method7238(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass31_Sub2_38) });
		this.aClass45_3 = Static467.method6394(super.aClass31_Sub2_38, new Class157[] { Static524.method7238(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass31_Sub2_38) });
		return this.aClass45_5 != null && this.aClass45_4 != null && this.aClass45_6 != null && this.aClass45_3 != null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
	@Override
	public void method6440(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass31_Sub2_38.method2513(1);
		super.aClass31_Sub2_38.method2535(null);
		super.aClass31_Sub2_38.method2513(0);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
	@Override
	public void method6441() {
		this.aClass50_Sub1Array4 = null;
		this.aClass45_6 = null;
		this.aClass45_3 = null;
		this.aClass45_4 = null;
		this.aClass50_Sub1_6 = null;
		this.aClass219_6 = null;
		this.aClass219_7 = null;
		this.aClass50_Sub1_5 = null;
		this.aClass45_5 = null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
	@Override
	public void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8209 = arg1;
		this.anInt8205 = arg0;
		@Pc(22) int local22 = Static49.method1209(this.anInt8209);
		@Pc(27) int local27 = Static49.method1209(this.anInt8205);
		if (local22 == this.anInt8204 && local27 == this.anInt8212) {
			return;
		}
		@Pc(44) int local44;
		if (this.aClass50_Sub1Array4 != null) {
			for (local44 = 0; local44 < this.aClass50_Sub1Array4.length; local44++) {
				this.aClass50_Sub1Array4[local44].method6157();
			}
			this.aClass50_Sub1Array4 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass219_6 = null;
		} else {
			local44 = local22;
			@Pc(77) int local77 = local27;
			@Pc(79) int local79 = 0;
			if (this.aClass219_6 == null) {
				this.aClass219_6 = new Class219(super.aClass31_Sub2_38);
			}
			label57: while (true) {
				if (local44 <= 256 && local77 <= 256) {
					local77 = local27;
					this.aClass50_Sub1Array4 = new Class50_Sub1[local79];
					local44 = local22;
					local79 = 0;
					while (true) {
						if (local44 <= 256 && local77 <= 256) {
							break label57;
						}
						this.aClass50_Sub1Array4[local79++] = new Class50_Sub1(super.aClass31_Sub2_38, 3553, 34842, local44, local77);
						if (local77 > 256) {
							local77 >>= 0x1;
						}
						if (local44 > 256) {
							local44 >>= 0x1;
						}
					}
				}
				if (local44 > 256) {
					local44 >>= 0x1;
				}
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				local79++;
			}
		}
		this.anInt8212 = local27;
		this.anInt8204 = local22;
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)Z")
	public boolean method6447() {
		return super.aClass31_Sub2_38.aBoolean229 && super.aClass31_Sub2_38.aBoolean221 && super.aClass31_Sub2_38.aBoolean209;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!wh;Lclient!wh;I)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) Class50_Sub1 arg1, @OriginalArg(2) Class50_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) 1, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass50_Sub1Array4 == null) {
			super.aClass31_Sub2_38.method2535(arg1);
			super.aClass31_Sub2_38.method2560(this.aClass219_7);
			this.aClass219_7.method5043(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass45_4.aLong21;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static76.aFloat119, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8209, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8209, (float) this.anInt8205);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8205);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass31_Sub2_38.method2560(this.aClass219_6);
			@Pc(33) int local33 = Static49.method1209(this.anInt8209);
			@Pc(38) int local38 = Static49.method1209(this.anInt8205);
			@Pc(40) int local40 = 0;
			while (local33 > 256 || local38 > 256) {
				OpenGL.glViewport(0, 0, local33, local38);
				this.aClass219_6.method5044(0, this.aClass50_Sub1Array4[local40]);
				if (local40 == 0) {
					super.aClass31_Sub2_38.method2535(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8209, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8209, (float) this.anInt8205);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8205);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass31_Sub2_38.method2535(this.aClass50_Sub1Array4[local40 - 1]);
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
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local33 > 256) {
					local33 >>= 0x1;
				}
				local40++;
			}
			super.aClass31_Sub2_38.method2507(this.aClass219_6);
			super.aClass31_Sub2_38.method2535(this.aClass50_Sub1Array4[local40 - 1]);
			super.aClass31_Sub2_38.method2560(this.aClass219_7);
			this.aClass219_7.method5043(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass45_5.aLong21;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static76.aFloat119, 0.0F, 0.0F);
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
		this.aClass219_7.method5043(1);
		super.aClass31_Sub2_38.method2535(this.aClass50_Sub1_6);
		local269 = this.aClass45_3.aLong21;
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
		this.aClass219_7.method5043(0);
		super.aClass31_Sub2_38.method2535(this.aClass50_Sub1_5);
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
		super.aClass31_Sub2_38.method2507(this.aClass219_7);
		@Pc(433) long local433 = this.aClass45_6.aLong21;
		OpenGL.glUseProgramObjectARB(local433);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local433, "params"), Static270.aFloat122, Static400.aFloat155, 0.0F);
		super.aClass31_Sub2_38.method2513(1);
		super.aClass31_Sub2_38.method2535(this.aClass50_Sub1_6);
		super.aClass31_Sub2_38.method2513(0);
		super.aClass31_Sub2_38.method2535(arg1);
	}
}
