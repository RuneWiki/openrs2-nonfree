import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!os", name = "q", descriptor = "I")
	private int anInt6265;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "Lclient!ku;")
	private Class73_Sub1 aClass73_Sub1_2;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "Lclient!qca;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "I")
	private int anInt6271;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "Lclient!wd;")
	private Class311 aClass311_4;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	private int anInt6272;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "Lclient!wd;")
	private Class311 aClass311_5;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "Lclient!ku;")
	private Class73_Sub1 aClass73_Sub1_3;

	@OriginalMember(owner = "client!os", name = "G", descriptor = "I")
	private int anInt6275;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "[Lclient!ku;")
	private Class73_Sub1[] aClass73_Sub1Array4;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "Lclient!qca;")
	private Class243 aClass243_3;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "Lclient!qca;")
	private Class243 aClass243_4;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "Lclient!qca;")
	private Class243 aClass243_5;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) Class122_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	@Override
	public void method5298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6272 = arg0;
		this.anInt6265 = arg1;
		@Pc(16) int local16 = Static59.method1111(this.anInt6272);
		@Pc(29) int local29 = Static59.method1111(this.anInt6265);
		if (local16 == this.anInt6275 && this.anInt6271 == local29) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass73_Sub1Array4 != null) {
			for (local42 = 0; local42 < this.aClass73_Sub1Array4.length; local42++) {
				this.aClass73_Sub1Array4[local42].method6354();
			}
			this.aClass73_Sub1Array4 = null;
		}
		if (local16 <= 256 && local29 <= 256) {
			this.aClass311_5 = null;
		} else {
			local42 = local16;
			@Pc(76) int local76 = local29;
			@Pc(78) int local78 = 0;
			if (this.aClass311_5 == null) {
				this.aClass311_5 = new Class311(super.aClass122_Sub3_27);
			}
			label56: while (true) {
				if (local42 <= 256 && local76 <= 256) {
					local42 = local16;
					this.aClass73_Sub1Array4 = new Class73_Sub1[local78];
					local76 = local29;
					local78 = 0;
					while (true) {
						if (local42 <= 256 && local76 <= 256) {
							break label56;
						}
						this.aClass73_Sub1Array4[local78++] = new Class73_Sub1(super.aClass122_Sub3_27, 3553, 34842, local42, local76);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local76 > 256) {
							local76 >>= 0x1;
						}
					}
				}
				if (local76 > 256) {
					local76 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local78++;
			}
		}
		this.anInt6275 = local16;
		this.anInt6271 = local29;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5300() {
		if (!super.aClass122_Sub3_27.aBoolean601 || !super.aClass122_Sub3_27.aBoolean589 || !super.aClass122_Sub3_27.aBoolean597) {
			return false;
		}
		this.aClass311_4 = new Class311(super.aClass122_Sub3_27);
		this.aClass73_Sub1_3 = new Class73_Sub1(super.aClass122_Sub3_27, 3553, 34842, 256, 256);
		this.aClass73_Sub1_3.method1954(false, false);
		this.aClass73_Sub1_2 = new Class73_Sub1(super.aClass122_Sub3_27, 3553, 34842, 256, 256);
		this.aClass73_Sub1_2.method1954(false, false);
		super.aClass122_Sub3_27.method6884(this.aClass311_4);
		this.aClass311_4.method7352(this.aClass73_Sub1_3, 0);
		this.aClass311_4.method7352(this.aClass73_Sub1_2, 1);
		this.aClass311_4.method7350(0);
		if (!this.aClass311_4.method7354()) {
			super.aClass122_Sub3_27.method6883(this.aClass311_4);
			return false;
		}
		super.aClass122_Sub3_27.method6883(this.aClass311_4);
		this.aClass243_5 = Static37.method843(super.aClass122_Sub3_27, new Class221[] { Static538.method7473("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass122_Sub3_27, 35632) });
		this.aClass243_3 = Static37.method843(super.aClass122_Sub3_27, new Class221[] { Static538.method7473("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass122_Sub3_27, 35632) });
		this.aClass243_4 = Static37.method843(super.aClass122_Sub3_27, new Class221[] { Static538.method7473("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass122_Sub3_27, 35632) });
		this.aClass243_2 = Static37.method843(super.aClass122_Sub3_27, new Class221[] { Static538.method7473("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass122_Sub3_27, 35632) });
		return this.aClass243_3 != null && this.aClass243_5 != null && this.aClass243_4 != null && this.aClass243_2 != null;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)I")
	@Override
	public int method5299() {
		return 1;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
	public boolean method5304() {
		return super.aClass122_Sub3_27.aBoolean601 && super.aClass122_Sub3_27.aBoolean589 && super.aClass122_Sub3_27.aBoolean597;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!ku;Lclient!ku;I)V")
	@Override
	public void method5301(@OriginalArg(1) Class73_Sub1 arg0, @OriginalArg(2) Class73_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass73_Sub1Array4 == null) {
			super.aClass122_Sub3_27.method6850(arg0);
			super.aClass122_Sub3_27.method6884(this.aClass311_4);
			this.aClass311_4.method7350(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass243_5.aLong296;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static413.aFloat143, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6272, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6272, (float) this.anInt6265);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6265);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass122_Sub3_27.method6884(this.aClass311_5);
			@Pc(108) int local108 = Static59.method1111(this.anInt6272);
			@Pc(115) int local115 = Static59.method1111(this.anInt6265);
			@Pc(117) int local117 = 0;
			while (local108 > 256 || local115 > 256) {
				OpenGL.glViewport(0, 0, local108, local115);
				this.aClass311_5.method7352(this.aClass73_Sub1Array4[local117], 0);
				if (local117 == 0) {
					super.aClass122_Sub3_27.method6850(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6272, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6272, (float) this.anInt6265);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6265);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass122_Sub3_27.method6850(this.aClass73_Sub1Array4[local117 - 1]);
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
				if (local115 > 256) {
					local115 >>= 0x1;
				}
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				local117++;
			}
			super.aClass122_Sub3_27.method6883(this.aClass311_5);
			super.aClass122_Sub3_27.method6850(this.aClass73_Sub1Array4[local117 - 1]);
			super.aClass122_Sub3_27.method6884(this.aClass311_4);
			this.aClass311_4.method7350(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(279) long local279 = this.aClass243_3.aLong296;
			OpenGL.glUseProgramObjectARB(local279);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local279, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local279, "params"), Static413.aFloat143, 0.0F, 0.0F);
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
		this.aClass311_4.method7350(1);
		super.aClass122_Sub3_27.method6850(this.aClass73_Sub1_3);
		local46 = this.aClass243_2.aLong296;
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
		this.aClass311_4.method7350(0);
		super.aClass122_Sub3_27.method6850(this.aClass73_Sub1_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f((float) 0, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		super.aClass122_Sub3_27.method6883(this.aClass311_4);
		@Pc(438) long local438 = this.aClass243_4.aLong296;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static499.aFloat161, Static295.aFloat112, 0.0F);
		super.aClass122_Sub3_27.method6932(1);
		super.aClass122_Sub3_27.method6850(this.aClass73_Sub1_3);
		super.aClass122_Sub3_27.method6932(0);
		super.aClass122_Sub3_27.method6850(arg0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5302() {
		return this.aClass311_4 != null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public void method5293() {
		this.aClass243_5 = null;
		this.aClass243_4 = null;
		this.aClass311_4 = null;
		this.aClass73_Sub1Array4 = null;
		this.aClass243_2 = null;
		this.aClass73_Sub1_3 = null;
		this.aClass311_5 = null;
		this.aClass243_3 = null;
		this.aClass73_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	@Override
	public void method5295(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass122_Sub3_27.method6932(1);
		super.aClass122_Sub3_27.method6850(null);
		super.aClass122_Sub3_27.method6932(0);
	}
}
