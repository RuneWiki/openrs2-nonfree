import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class4_Sub40_Sub1 extends Class4_Sub40 {

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!ns;")
	private Class183 aClass183_4;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "Lclient!me;")
	private Class168 aClass168_4;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "Lclient!me;")
	private Class168 aClass168_5;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "Lclient!ml;")
	private Class65_Sub2 aClass65_Sub2_3;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "[Lclient!ml;")
	private Class65_Sub2[] aClass65_Sub2Array4;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
	private int anInt6415;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	private int anInt6416;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Lclient!me;")
	private Class168 aClass168_6;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "Lclient!me;")
	private Class168 aClass168_7;

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "Lclient!ml;")
	private Class65_Sub2 aClass65_Sub2_4;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
	private int anInt6422;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "Lclient!ns;")
	private Class183 aClass183_5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class4_Sub40_Sub1(@OriginalArg(0) Class135_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ml;IILclient!ml;)V")
	@Override
	public void method5193(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class65_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(268) long local268;
		if (this.aClass65_Sub2Array4 == null) {
			super.aClass135_Sub2_38.method5458(arg2);
			super.aClass135_Sub2_38.method5439(this.aClass183_4);
			this.aClass183_4.method3607(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local268 = this.aClass168_7.aLong114;
			OpenGL.glUseProgramObjectARB(local268);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "params"), Static112.aFloat24, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6415, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6415, (float) this.anInt6422);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6422);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass135_Sub2_38.method5439(this.aClass183_5);
			@Pc(32) int local32 = Static359.method4736(this.anInt6415);
			@Pc(37) int local37 = Static359.method4736(this.anInt6422);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass183_5.method3610(this.aClass65_Sub2Array4[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass135_Sub2_38.method5458(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6415, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6415, (float) this.anInt6422);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6422);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass135_Sub2_38.method5458(this.aClass65_Sub2Array4[local39 - 1]);
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
				local39++;
			}
			super.aClass135_Sub2_38.method5419(this.aClass183_5);
			super.aClass135_Sub2_38.method5458(this.aClass65_Sub2Array4[local39 - 1]);
			super.aClass135_Sub2_38.method5439(this.aClass183_4);
			this.aClass183_4.method3607(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(200) long local200 = this.aClass168_6.aLong114;
			OpenGL.glUseProgramObjectARB(local200);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local200, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local200, "params"), Static112.aFloat24, 0.0F, 0.0F);
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
		this.aClass183_4.method3607(1);
		super.aClass135_Sub2_38.method5458(this.aClass65_Sub2_4);
		local268 = this.aClass168_5.aLong114;
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
		this.aClass183_4.method3607(0);
		super.aClass135_Sub2_38.method5458(this.aClass65_Sub2_3);
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
		super.aClass135_Sub2_38.method5419(this.aClass183_4);
		@Pc(436) long local436 = this.aClass168_4.aLong114;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static296.aFloat56, Static198.aFloat58, 0.0F);
		super.aClass135_Sub2_38.method5457(1);
		super.aClass135_Sub2_38.method5458(this.aClass65_Sub2_4);
		super.aClass135_Sub2_38.method5457(0);
		super.aClass135_Sub2_38.method5458(arg2);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5188() {
		return this.aClass183_4 != null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	@Override
	public void method5192(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass135_Sub2_38.method5457(1);
		super.aClass135_Sub2_38.method5458(null);
		super.aClass135_Sub2_38.method5457(0);
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(I)Z")
	public boolean method5199() {
		return super.aClass135_Sub2_38.aBoolean458 && super.aClass135_Sub2_38.aBoolean459 && super.aClass135_Sub2_38.aBoolean460;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5186() {
		if (!super.aClass135_Sub2_38.aBoolean458 || !super.aClass135_Sub2_38.aBoolean459 || !super.aClass135_Sub2_38.aBoolean460) {
			return false;
		}
		this.aClass183_4 = new Class183(super.aClass135_Sub2_38);
		this.aClass65_Sub2_4 = new Class65_Sub2(super.aClass135_Sub2_38, 3553, 34842, 256, 256);
		this.aClass65_Sub2_4.method3589(false, false);
		this.aClass65_Sub2_3 = new Class65_Sub2(super.aClass135_Sub2_38, 3553, 34842, 256, 256);
		this.aClass65_Sub2_3.method3589(false, false);
		super.aClass135_Sub2_38.method5439(this.aClass183_4);
		this.aClass183_4.method3610(this.aClass65_Sub2_4, 0);
		this.aClass183_4.method3610(this.aClass65_Sub2_3, 1);
		this.aClass183_4.method3607(0);
		if (!this.aClass183_4.method3616()) {
			super.aClass135_Sub2_38.method5419(this.aClass183_4);
			return false;
		}
		super.aClass135_Sub2_38.method5419(this.aClass183_4);
		this.aClass168_7 = Static400.method5265(super.aClass135_Sub2_38, new Class228[] { Static103.method1539("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass135_Sub2_38) });
		this.aClass168_6 = Static400.method5265(super.aClass135_Sub2_38, new Class228[] { Static103.method1539("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass135_Sub2_38) });
		this.aClass168_4 = Static400.method5265(super.aClass135_Sub2_38, new Class228[] { Static103.method1539("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass135_Sub2_38) });
		this.aClass168_5 = Static400.method5265(super.aClass135_Sub2_38, new Class228[] { Static103.method1539("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass135_Sub2_38) });
		return this.aClass168_6 != null && this.aClass168_7 != null && this.aClass168_4 != null && this.aClass168_5 != null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
	@Override
	public void method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6415 = arg1;
		this.anInt6422 = arg0;
		@Pc(16) int local16 = Static359.method4736(this.anInt6415);
		@Pc(21) int local21 = Static359.method4736(this.anInt6422);
		if (this.anInt6416 == local16 && this.anInt6417 == local21) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass65_Sub2Array4 != null) {
			for (local42 = 0; local42 < this.aClass65_Sub2Array4.length; local42++) {
				this.aClass65_Sub2Array4[local42].method4770();
			}
			this.aClass65_Sub2Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass183_5 = null;
		} else {
			local42 = local16;
			@Pc(75) int local75 = local21;
			@Pc(77) int local77 = 0;
			label59: while (true) {
				if (local42 <= 256 && local75 <= 256) {
					if (this.aClass183_5 == null) {
						this.aClass183_5 = new Class183(super.aClass135_Sub2_38);
					}
					local42 = local16;
					this.aClass65_Sub2Array4 = new Class65_Sub2[local77];
					local75 = local21;
					local77 = 0;
					while (true) {
						if (local42 <= 256 && local75 <= 256) {
							break label59;
						}
						this.aClass65_Sub2Array4[local77++] = new Class65_Sub2(super.aClass135_Sub2_38, 3553, 34842, local42, local75);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local75 > 256) {
							local75 >>= 0x1;
						}
					}
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				if (local75 > 256) {
					local75 >>= 0x1;
				}
				local77++;
			}
		}
		this.anInt6417 = local21;
		this.anInt6416 = local16;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	@Override
	public int method5195() {
		return 1;
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V")
	@Override
	public void method5187() {
		this.aClass65_Sub2_4 = null;
		this.aClass183_4 = null;
		this.aClass65_Sub2Array4 = null;
		this.aClass183_5 = null;
		this.aClass168_5 = null;
		this.aClass168_7 = null;
		this.aClass168_6 = null;
		this.aClass168_4 = null;
		this.aClass65_Sub2_3 = null;
	}
}
