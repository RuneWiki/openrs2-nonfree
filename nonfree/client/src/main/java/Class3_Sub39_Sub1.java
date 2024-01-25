import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub39_Sub1 extends Class3_Sub39 {

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "Lclient!su;")
	private Class230 aClass230_4;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!sk;")
	private Class224 aClass224_5;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Lclient!sk;")
	private Class224 aClass224_6;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Lclient!su;")
	private Class230 aClass230_5;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
	private int anInt5922;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Lclient!wv;")
	private Class137_Sub1 aClass137_Sub1_4;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "[Lclient!wv;")
	private Class137_Sub1[] aClass137_Sub1Array4;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	private int anInt5924;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Lclient!su;")
	private Class230 aClass230_6;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!su;")
	private Class230 aClass230_7;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
	private int anInt5928;

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "Lclient!wv;")
	private Class137_Sub1 aClass137_Sub1_5;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
	private int anInt5929;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class3_Sub39_Sub1(@OriginalArg(0) Class167_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
	@Override
	public void method4917(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass167_Sub1_35.method3993(1);
		super.aClass167_Sub1_35.method4028(null);
		super.aClass167_Sub1_35.method3993(0);
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
	@Override
	public void method4924() {
		this.aClass230_5 = null;
		this.aClass224_5 = null;
		this.aClass137_Sub1_4 = null;
		this.aClass137_Sub1Array4 = null;
		this.aClass137_Sub1_5 = null;
		this.aClass230_4 = null;
		this.aClass230_7 = null;
		this.aClass230_6 = null;
		this.aClass224_6 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	@Override
	public void method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5928 = arg1;
		this.anInt5922 = arg0;
		@Pc(23) int local23 = Static146.method2292(this.anInt5928);
		@Pc(28) int local28 = Static146.method2292(this.anInt5922);
		if (local23 == this.anInt5929 && local28 == this.anInt5924) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass137_Sub1Array4 != null) {
			for (local45 = 0; local45 < this.aClass137_Sub1Array4.length; local45++) {
				this.aClass137_Sub1Array4[local45].method5779();
			}
			this.aClass137_Sub1Array4 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass224_6 = null;
		} else {
			local45 = local23;
			@Pc(77) int local77 = local28;
			@Pc(79) int local79 = 0;
			if (this.aClass224_6 == null) {
				this.aClass224_6 = new Class224(super.aClass167_Sub1_35);
			}
			label56: while (true) {
				if (local45 <= 256 && local77 <= 256) {
					local77 = local28;
					local45 = local23;
					this.aClass137_Sub1Array4 = new Class137_Sub1[local79];
					local79 = 0;
					while (true) {
						if (local45 <= 256 && local77 <= 256) {
							break label56;
						}
						this.aClass137_Sub1Array4[local79++] = new Class137_Sub1(super.aClass167_Sub1_35, 3553, 34842, local45, local77);
						if (local45 > 256) {
							local45 >>= 0x1;
						}
						if (local77 > 256) {
							local77 >>= 0x1;
						}
					}
				}
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				if (local45 > 256) {
					local45 >>= 0x1;
				}
				local79++;
			}
		}
		this.anInt5929 = local23;
		this.anInt5924 = local28;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)I")
	@Override
	public int method4927() {
		return 1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!wv;Lclient!wv;I)V")
	@Override
	public void method4918(@OriginalArg(1) Class137_Sub1 arg0, @OriginalArg(2) Class137_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(54) long local54;
		if (this.aClass137_Sub1Array4 == null) {
			super.aClass167_Sub1_35.method4028(arg0);
			super.aClass167_Sub1_35.method4024(this.aClass224_5);
			this.aClass224_5.method5228(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local54 = this.aClass230_6.aLong217;
			OpenGL.glUseProgramObjectARB(local54);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "params"), Static321.aFloat89, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5928, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5928, (float) this.anInt5922);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5922);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass167_Sub1_35.method4024(this.aClass224_6);
			@Pc(116) int local116 = Static146.method2292(this.anInt5928);
			@Pc(121) int local121 = Static146.method2292(this.anInt5922);
			@Pc(123) int local123 = 0;
			while (local116 > 256 || local121 > 256) {
				OpenGL.glViewport(0, 0, local116, local121);
				this.aClass224_6.method5225(0, this.aClass137_Sub1Array4[local123]);
				if (local116 > 256) {
					local116 >>= 0x1;
				}
				if (local121 > 256) {
					local121 >>= 0x1;
				}
				if (local123 == 0) {
					super.aClass167_Sub1_35.method4028(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5928, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5928, (float) this.anInt5922);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5922);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass167_Sub1_35.method4028(this.aClass137_Sub1Array4[local123 - 1]);
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
				local123++;
			}
			super.aClass167_Sub1_35.method4008(this.aClass224_6);
			super.aClass167_Sub1_35.method4028(this.aClass137_Sub1Array4[local123 - 1]);
			super.aClass167_Sub1_35.method4024(this.aClass224_5);
			this.aClass224_5.method5228(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(283) long local283 = this.aClass230_7.aLong217;
			OpenGL.glUseProgramObjectARB(local283);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local283, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local283, "params"), Static321.aFloat89, 0.0F, 0.0F);
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
		this.aClass224_5.method5228(1);
		super.aClass167_Sub1_35.method4028(this.aClass137_Sub1_4);
		local54 = this.aClass230_5.aLong217;
		OpenGL.glUseProgramObjectARB(local54);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local54, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass224_5.method5228(0);
		super.aClass167_Sub1_35.method4028(this.aClass137_Sub1_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local54, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass167_Sub1_35.method4008(this.aClass224_5);
		@Pc(439) long local439 = this.aClass230_4.aLong217;
		OpenGL.glUseProgramObjectARB(local439);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local439, "params"), Static298.aFloat85, Static60.aFloat17, 0.0F);
		super.aClass167_Sub1_35.method3993(1);
		super.aClass167_Sub1_35.method4028(this.aClass137_Sub1_4);
		super.aClass167_Sub1_35.method3993(0);
		super.aClass167_Sub1_35.method4028(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method4916() {
		return this.aClass224_5 != null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4915() {
		if (!super.aClass167_Sub1_35.aBoolean343 || !super.aClass167_Sub1_35.aBoolean340 || !super.aClass167_Sub1_35.aBoolean356) {
			return false;
		}
		this.aClass224_5 = new Class224(super.aClass167_Sub1_35);
		this.aClass137_Sub1_4 = new Class137_Sub1(super.aClass167_Sub1_35, 3553, 34842, 256, 256);
		this.aClass137_Sub1_4.method3346(false, false);
		this.aClass137_Sub1_5 = new Class137_Sub1(super.aClass167_Sub1_35, 3553, 34842, 256, 256);
		this.aClass137_Sub1_5.method3346(false, false);
		super.aClass167_Sub1_35.method4024(this.aClass224_5);
		this.aClass224_5.method5225(0, this.aClass137_Sub1_4);
		this.aClass224_5.method5225(1, this.aClass137_Sub1_5);
		this.aClass224_5.method5228(0);
		if (!this.aClass224_5.method5230()) {
			super.aClass167_Sub1_35.method4008(this.aClass224_5);
			return false;
		}
		super.aClass167_Sub1_35.method4008(this.aClass224_5);
		this.aClass230_6 = Static368.method5128(super.aClass167_Sub1_35, new Class184[] { Static21.method6257("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass167_Sub1_35, 35632) });
		this.aClass230_7 = Static368.method5128(super.aClass167_Sub1_35, new Class184[] { Static21.method6257("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass167_Sub1_35, 35632) });
		this.aClass230_4 = Static368.method5128(super.aClass167_Sub1_35, new Class184[] { Static21.method6257("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass167_Sub1_35, 35632) });
		this.aClass230_5 = Static368.method5128(super.aClass167_Sub1_35, new Class184[] { Static21.method6257("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass167_Sub1_35, 35632) });
		return this.aClass230_7 != null && this.aClass230_6 != null && this.aClass230_4 != null && this.aClass230_5 != null;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Z")
	public boolean method4928() {
		return super.aClass167_Sub1_35.aBoolean343 && super.aClass167_Sub1_35.aBoolean340 && super.aClass167_Sub1_35.aBoolean356;
	}
}
