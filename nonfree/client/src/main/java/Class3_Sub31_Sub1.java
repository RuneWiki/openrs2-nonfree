import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class3_Sub31_Sub1 extends Class3_Sub31 {

	@OriginalMember(owner = "client!kia", name = "x", descriptor = "[Lclient!kf;")
	private Class39_Sub4[] aClass39_Sub4Array1;

	@OriginalMember(owner = "client!kia", name = "z", descriptor = "Lclient!ag;")
	private Class12 aClass12_3;

	@OriginalMember(owner = "client!kia", name = "A", descriptor = "Lclient!et;")
	private Class109 aClass109_3;

	@OriginalMember(owner = "client!kia", name = "C", descriptor = "Lclient!ag;")
	private Class12 aClass12_4;

	@OriginalMember(owner = "client!kia", name = "D", descriptor = "Lclient!ag;")
	private Class12 aClass12_5;

	@OriginalMember(owner = "client!kia", name = "E", descriptor = "Lclient!kf;")
	private Class39_Sub4 aClass39_Sub4_4;

	@OriginalMember(owner = "client!kia", name = "H", descriptor = "Lclient!kf;")
	private Class39_Sub4 aClass39_Sub4_5;

	@OriginalMember(owner = "client!kia", name = "I", descriptor = "I")
	private int anInt5728;

	@OriginalMember(owner = "client!kia", name = "L", descriptor = "I")
	private int anInt5729;

	@OriginalMember(owner = "client!kia", name = "O", descriptor = "I")
	private int anInt5732;

	@OriginalMember(owner = "client!kia", name = "S", descriptor = "Lclient!ag;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!kia", name = "U", descriptor = "I")
	private int anInt5736;

	@OriginalMember(owner = "client!kia", name = "W", descriptor = "Lclient!et;")
	private Class109 aClass109_4;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class3_Sub31_Sub1(@OriginalArg(0) Class16_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!kf;IILclient!kf;)V")
	@Override
	public void method4781(@OriginalArg(0) Class39_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39_Sub4 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) 1);
		@Pc(47) long local47;
		if (this.aClass39_Sub4Array1 == null) {
			super.aClass16_Sub2_31.method3620(arg0);
			super.aClass16_Sub2_31.method3615(this.aClass109_3);
			this.aClass109_3.method2556(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local47 = this.aClass12_4.aLong4;
			OpenGL.glUseProgramObjectARB(local47);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "params"), Static269.aFloat119, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5728, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5728, (float) this.anInt5732);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5732);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass16_Sub2_31.method3615(this.aClass109_4);
			@Pc(111) int local111 = Static675.method8723(this.anInt5728);
			@Pc(116) int local116 = Static675.method8723(this.anInt5732);
			@Pc(118) int local118 = 0;
			while (local111 > 256 || local116 > 256) {
				OpenGL.glViewport(0, 0, local111, local116);
				this.aClass109_4.method2554(0, this.aClass39_Sub4Array1[local118]);
				if (local116 > 256) {
					local116 >>= 0x1;
				}
				if (local118 == 0) {
					super.aClass16_Sub2_31.method3620(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5728, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5728, (float) this.anInt5732);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5732);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass16_Sub2_31.method3620(this.aClass39_Sub4Array1[local118 - 1]);
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
				if (local111 > 256) {
					local111 >>= 0x1;
				}
				local118++;
			}
			super.aClass16_Sub2_31.method3635(this.aClass109_4);
			super.aClass16_Sub2_31.method3620(this.aClass39_Sub4Array1[local118 - 1]);
			super.aClass16_Sub2_31.method3615(this.aClass109_3);
			this.aClass109_3.method2556(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(283) long local283 = this.aClass12_3.aLong4;
			OpenGL.glUseProgramObjectARB(local283);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local283, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local283, "params"), Static269.aFloat119, 0.0F, 0.0F);
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
		this.aClass109_3.method2556(1);
		super.aClass16_Sub2_31.method3620(this.aClass39_Sub4_5);
		local47 = this.aClass12_5.aLong4;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass109_3.method2556(0);
		super.aClass16_Sub2_31.method3620(this.aClass39_Sub4_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass16_Sub2_31.method3635(this.aClass109_3);
		@Pc(439) long local439 = this.aClass12_6.aLong4;
		OpenGL.glUseProgramObjectARB(local439);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local439, "params"), Static260.aFloat111, Static78.aFloat67, 0.0F);
		super.aClass16_Sub2_31.method3683(1);
		super.aClass16_Sub2_31.method3620(this.aClass39_Sub4_5);
		super.aClass16_Sub2_31.method3683(0);
		super.aClass16_Sub2_31.method3620(arg0);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5728 = arg1;
		this.anInt5732 = arg0;
		@Pc(23) int local23 = Static675.method8723(this.anInt5728);
		@Pc(30) int local30 = Static675.method8723(this.anInt5732);
		if (this.anInt5729 == local23 && this.anInt5736 == local30) {
			return;
		}
		@Pc(51) int local51;
		if (this.aClass39_Sub4Array1 != null) {
			for (local51 = 0; local51 < this.aClass39_Sub4Array1.length; local51++) {
				this.aClass39_Sub4Array1[local51].method8467();
			}
			this.aClass39_Sub4Array1 = null;
		}
		if (local23 <= 256 && local30 <= 256) {
			this.aClass109_4 = null;
		} else {
			local51 = local23;
			@Pc(87) int local87 = local30;
			@Pc(89) int local89 = 0;
			if (this.aClass109_4 == null) {
				this.aClass109_4 = new Class109(super.aClass16_Sub2_31);
			}
			label54: while (true) {
				if (local51 <= 256 && local87 <= 256) {
					local87 = local30;
					local51 = local23;
					this.aClass39_Sub4Array1 = new Class39_Sub4[local89];
					local89 = 0;
					while (true) {
						if (local51 <= 256 && local87 <= 256) {
							break label54;
						}
						this.aClass39_Sub4Array1[local89++] = new Class39_Sub4(super.aClass16_Sub2_31, 3553, 34842, local51, local87);
						if (local87 > 256) {
							local87 >>= 0x1;
						}
						if (local51 > 256) {
							local51 >>= 0x1;
						}
					}
				}
				if (local87 > 256) {
					local87 >>= 0x1;
				}
				local89++;
				if (local51 > 256) {
					local51 >>= 0x1;
				}
			}
		}
		this.anInt5729 = local23;
		this.anInt5736 = local30;
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(B)Z")
	public boolean method4785() {
		return super.aClass16_Sub2_31.aBoolean331 && super.aClass16_Sub2_31.aBoolean339 && super.aClass16_Sub2_31.aBoolean329;
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
	@Override
	public void method4773() {
		this.aClass12_3 = null;
		this.aClass12_6 = null;
		this.aClass12_4 = null;
		this.aClass39_Sub4_4 = null;
		this.aClass39_Sub4Array1 = null;
		this.aClass109_3 = null;
		this.aClass109_4 = null;
		this.aClass39_Sub4_5 = null;
		this.aClass12_5 = null;
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4775() {
		if (!super.aClass16_Sub2_31.aBoolean331 || !super.aClass16_Sub2_31.aBoolean339 || !super.aClass16_Sub2_31.aBoolean329) {
			return false;
		}
		this.aClass109_3 = new Class109(super.aClass16_Sub2_31);
		this.aClass39_Sub4_5 = new Class39_Sub4(super.aClass16_Sub2_31, 3553, 34842, 256, 256);
		this.aClass39_Sub4_5.method8469(false, false);
		this.aClass39_Sub4_4 = new Class39_Sub4(super.aClass16_Sub2_31, 3553, 34842, 256, 256);
		this.aClass39_Sub4_4.method8469(false, false);
		super.aClass16_Sub2_31.method3615(this.aClass109_3);
		this.aClass109_3.method2554(0, this.aClass39_Sub4_5);
		this.aClass109_3.method2554(1, this.aClass39_Sub4_4);
		this.aClass109_3.method2556(0);
		if (!this.aClass109_3.method2549()) {
			super.aClass16_Sub2_31.method3635(this.aClass109_3);
			return false;
		}
		super.aClass16_Sub2_31.method3635(this.aClass109_3);
		this.aClass12_4 = Static551.method7571(super.aClass16_Sub2_31, new Class166[] { Static245.method3919("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass16_Sub2_31) });
		this.aClass12_3 = Static551.method7571(super.aClass16_Sub2_31, new Class166[] { Static245.method3919("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass16_Sub2_31) });
		this.aClass12_6 = Static551.method7571(super.aClass16_Sub2_31, new Class166[] { Static245.method3919("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass16_Sub2_31) });
		this.aClass12_5 = Static551.method7571(super.aClass16_Sub2_31, new Class166[] { Static245.method3919("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass16_Sub2_31) });
		return this.aClass12_3 != null && this.aClass12_4 != null && this.aClass12_6 != null && this.aClass12_5 != null;
	}

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "(I)I")
	@Override
	public int method4780() {
		return 1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4778() {
		return this.aClass109_3 != null;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V")
	@Override
	public void method4777(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass16_Sub2_31.method3683(1);
		super.aClass16_Sub2_31.method3620((Class39) null);
		super.aClass16_Sub2_31.method3683(0);
	}
}
