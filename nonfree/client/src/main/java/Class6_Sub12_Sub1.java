import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class6_Sub12_Sub1 extends Class6_Sub12 {

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "Lclient!vr;")
	private Class384 aClass384_4;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "Lclient!vr;")
	private Class384 aClass384_5;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "Lclient!bp;")
	private Class44_Sub1 aClass44_Sub1_5;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
	private int anInt9480;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "[Lclient!bp;")
	private Class44_Sub1[] aClass44_Sub1Array4;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "Lclient!hb;")
	private Class146 aClass146_6;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Lclient!vr;")
	private Class384 aClass384_6;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Lclient!vr;")
	private Class384 aClass384_7;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	private int anInt9485;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
	private int anInt9486;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "Lclient!bp;")
	private Class44_Sub1 aClass44_Sub1_6;

	@OriginalMember(owner = "client!tt", name = "T", descriptor = "I")
	private int anInt9490;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "Lclient!hb;")
	private Class146 aClass146_7;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class6_Sub12_Sub1(@OriginalArg(0) Class75_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8275() {
		return this.aClass146_7 != null;
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)Z")
	public boolean method8276() {
		return super.aClass75_Sub3_38.aBoolean473 && super.aClass75_Sub3_38.aBoolean494 && super.aClass75_Sub3_38.aBoolean471;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!bp;ILclient!bp;I)V")
	@Override
	public void method8271(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass44_Sub1Array4 == null) {
			super.aClass75_Sub3_38.method5774(arg2);
			super.aClass75_Sub3_38.method5769(this.aClass146_7);
			this.aClass146_7.method3885(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass384_7.aLong333;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static621.aFloat196, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9486, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9486, (float) this.anInt9485);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9485);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass75_Sub3_38.method5769(this.aClass146_6);
			@Pc(112) int local112 = Static468.method7064(this.anInt9486);
			@Pc(117) int local117 = Static468.method7064(this.anInt9485);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass146_6.method3889(this.aClass44_Sub1Array4[local119], 0);
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass75_Sub3_38.method5774(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9486, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9486, (float) this.anInt9485);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9485);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass75_Sub3_38.method5774(this.aClass44_Sub1Array4[local119 - 1]);
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
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				local119++;
			}
			super.aClass75_Sub3_38.method5791(this.aClass146_6);
			super.aClass75_Sub3_38.method5774(this.aClass44_Sub1Array4[local119 - 1]);
			super.aClass75_Sub3_38.method5769(this.aClass146_7);
			this.aClass146_7.method3885(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(285) long local285 = this.aClass384_4.aLong333;
			OpenGL.glUseProgramObjectARB(local285);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local285, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local285, "params"), Static621.aFloat196, 0.0F, 0.0F);
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
		this.aClass146_7.method3885(1);
		super.aClass75_Sub3_38.method5774(this.aClass44_Sub1_6);
		local46 = this.aClass384_6.aLong333;
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
		this.aClass146_7.method3885(0);
		super.aClass75_Sub3_38.method5774(this.aClass44_Sub1_5);
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
		super.aClass75_Sub3_38.method5791(this.aClass146_7);
		@Pc(451) long local451 = this.aClass384_5.aLong333;
		OpenGL.glUseProgramObjectARB(local451);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local451, "params"), Static62.aFloat3, Static410.aFloat136, 0.0F);
		super.aClass75_Sub3_38.method5775(1);
		super.aClass75_Sub3_38.method5774(this.aClass44_Sub1_6);
		super.aClass75_Sub3_38.method5775(0);
		super.aClass75_Sub3_38.method5774(arg2);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V")
	@Override
	public void method8266() {
		this.aClass384_5 = null;
		this.aClass146_6 = null;
		this.aClass146_7 = null;
		this.aClass44_Sub1Array4 = null;
		this.aClass384_7 = null;
		this.aClass384_6 = null;
		this.aClass44_Sub1_6 = null;
		this.aClass384_4 = null;
		this.aClass44_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	@Override
	public void method8263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9485 = arg0;
		this.anInt9486 = arg1;
		@Pc(24) int local24 = Static468.method7064(this.anInt9486);
		@Pc(29) int local29 = Static468.method7064(this.anInt9485);
		if (this.anInt9480 == local24 && this.anInt9490 == local29) {
			return;
		}
		@Pc(50) int local50;
		if (this.aClass44_Sub1Array4 != null) {
			for (local50 = 0; local50 < this.aClass44_Sub1Array4.length; local50++) {
				this.aClass44_Sub1Array4[local50].method9005();
			}
			this.aClass44_Sub1Array4 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass146_6 = null;
		} else {
			local50 = local24;
			@Pc(91) int local91 = local29;
			@Pc(93) int local93 = 0;
			if (this.aClass146_6 == null) {
				this.aClass146_6 = new Class146(super.aClass75_Sub3_38);
			}
			label55: while (true) {
				if (local50 <= 256 && local91 <= 256) {
					local91 = local29;
					local50 = local24;
					this.aClass44_Sub1Array4 = new Class44_Sub1[local93];
					local93 = 0;
					while (true) {
						if (local50 <= 256 && local91 <= 256) {
							break label55;
						}
						this.aClass44_Sub1Array4[local93++] = new Class44_Sub1(super.aClass75_Sub3_38, 3553, 34842, local50, local91);
						if (local50 > 256) {
							local50 >>= 0x1;
						}
						if (local91 > 256) {
							local91 >>= 0x1;
						}
					}
				}
				if (local91 > 256) {
					local91 >>= 0x1;
				}
				local93++;
				if (local50 > 256) {
					local50 >>= 0x1;
				}
			}
		}
		this.anInt9490 = local29;
		this.anInt9480 = local24;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass75_Sub3_38.method5775(1);
		super.aClass75_Sub3_38.method5774((Class44) null);
		super.aClass75_Sub3_38.method5775(0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8264() {
		if (!super.aClass75_Sub3_38.aBoolean473 || !super.aClass75_Sub3_38.aBoolean494 || !super.aClass75_Sub3_38.aBoolean471) {
			return false;
		}
		this.aClass146_7 = new Class146(super.aClass75_Sub3_38);
		this.aClass44_Sub1_6 = new Class44_Sub1(super.aClass75_Sub3_38, 3553, 34842, 256, 256);
		this.aClass44_Sub1_6.method3476(false, false);
		this.aClass44_Sub1_5 = new Class44_Sub1(super.aClass75_Sub3_38, 3553, 34842, 256, 256);
		this.aClass44_Sub1_5.method3476(false, false);
		super.aClass75_Sub3_38.method5769(this.aClass146_7);
		this.aClass146_7.method3889(this.aClass44_Sub1_6, 0);
		this.aClass146_7.method3889(this.aClass44_Sub1_5, 1);
		this.aClass146_7.method3885(0);
		if (!this.aClass146_7.method3884()) {
			super.aClass75_Sub3_38.method5791(this.aClass146_7);
			return false;
		}
		super.aClass75_Sub3_38.method5791(this.aClass146_7);
		this.aClass384_7 = Static420.method6421(super.aClass75_Sub3_38, new Class362[] { Static182.method3448(35632, super.aClass75_Sub3_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass384_4 = Static420.method6421(super.aClass75_Sub3_38, new Class362[] { Static182.method3448(35632, super.aClass75_Sub3_38, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass384_5 = Static420.method6421(super.aClass75_Sub3_38, new Class362[] { Static182.method3448(35632, super.aClass75_Sub3_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass384_6 = Static420.method6421(super.aClass75_Sub3_38, new Class362[] { Static182.method3448(35632, super.aClass75_Sub3_38, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass384_4 != null && this.aClass384_7 != null && this.aClass384_5 != null && this.aClass384_6 != null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I")
	@Override
	public int method8262() {
		return 1;
	}
}
