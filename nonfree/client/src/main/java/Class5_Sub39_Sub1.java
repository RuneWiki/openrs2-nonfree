import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class5_Sub39_Sub1 extends Class5_Sub39 {

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Lclient!ak;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	private int anInt6508;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "Lclient!ak;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
	private int anInt6512;

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "Lclient!cd;")
	private Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt6514;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "Lclient!br;")
	private Class26 aClass26_4;

	@OriginalMember(owner = "client!ts", name = "I", descriptor = "Lclient!br;")
	private Class26 aClass26_5;

	@OriginalMember(owner = "client!ts", name = "K", descriptor = "Lclient!br;")
	private Class26 aClass26_6;

	@OriginalMember(owner = "client!ts", name = "L", descriptor = "Lclient!br;")
	private Class26 aClass26_7;

	@OriginalMember(owner = "client!ts", name = "M", descriptor = "Lclient!cd;")
	private Class31_Sub1 aClass31_Sub1_2;

	@OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
	private int anInt6518;

	@OriginalMember(owner = "client!ts", name = "Q", descriptor = "[Lclient!cd;")
	private Class31_Sub1[] aClass31_Sub1Array3;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class5_Sub39_Sub1(@OriginalArg(0) Class200_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "(I)V")
	@Override
	public void method5190() {
		this.aClass26_6 = null;
		this.aClass11_2 = null;
		this.aClass31_Sub1Array3 = null;
		this.aClass26_5 = null;
		this.aClass26_7 = null;
		this.aClass11_1 = null;
		this.aClass31_Sub1_2 = null;
		this.aClass31_Sub1_1 = null;
		this.aClass26_4 = null;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	@Override
	public int method5183() {
		return 1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cd;Lclient!cd;I)V")
	@Override
	public void method5180(@OriginalArg(1) Class31_Sub1 arg0, @OriginalArg(2) Class31_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(267) long local267;
		if (this.aClass31_Sub1Array3 == null) {
			super.aClass200_Sub2_37.method5312(arg0);
			super.aClass200_Sub2_37.method5328(this.aClass11_1);
			this.aClass11_1.method191(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass26_4.aLong37;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static127.aFloat44, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6514, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6514, (float) this.anInt6508);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6508);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass200_Sub2_37.method5328(this.aClass11_2);
			@Pc(32) int local32 = Static313.method4879(this.anInt6514);
			@Pc(37) int local37 = Static313.method4879(this.anInt6508);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass11_2.method200(this.aClass31_Sub1Array3[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass200_Sub2_37.method5312(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6514, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6514, (float) this.anInt6508);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6508);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass200_Sub2_37.method5312(this.aClass31_Sub1Array3[local39 - 1]);
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
			super.aClass200_Sub2_37.method5345(this.aClass11_2);
			super.aClass200_Sub2_37.method5312(this.aClass31_Sub1Array3[local39 - 1]);
			super.aClass200_Sub2_37.method5328(this.aClass11_1);
			this.aClass11_1.method191(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(199) long local199 = this.aClass26_7.aLong37;
			OpenGL.glUseProgramObjectARB(local199);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static127.aFloat44, 0.0F, 0.0F);
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
		this.aClass11_1.method191(1);
		super.aClass200_Sub2_37.method5312(this.aClass31_Sub1_1);
		local267 = this.aClass26_6.aLong37;
		OpenGL.glUseProgramObjectARB(local267);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass11_1.method191(0);
		super.aClass200_Sub2_37.method5312(this.aClass31_Sub1_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass200_Sub2_37.method5345(this.aClass11_1);
		@Pc(435) long local435 = this.aClass26_5.aLong37;
		OpenGL.glUseProgramObjectARB(local435);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local435, "params"), Static277.aFloat109, Static463.aFloat149, 0.0F);
		super.aClass200_Sub2_37.method5319(1);
		super.aClass200_Sub2_37.method5312(this.aClass31_Sub1_1);
		super.aClass200_Sub2_37.method5319(0);
		super.aClass200_Sub2_37.method5312(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5185() {
		return this.aClass11_1 != null;
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5186() {
		if (!super.aClass200_Sub2_37.aBoolean435 || !super.aClass200_Sub2_37.aBoolean441 || !super.aClass200_Sub2_37.aBoolean440) {
			return false;
		}
		this.aClass11_1 = new Class11(super.aClass200_Sub2_37);
		this.aClass31_Sub1_1 = new Class31_Sub1(super.aClass200_Sub2_37, 3553, 34842, 256, 256);
		this.aClass31_Sub1_1.method1520(false, false);
		this.aClass31_Sub1_2 = new Class31_Sub1(super.aClass200_Sub2_37, 3553, 34842, 256, 256);
		this.aClass31_Sub1_2.method1520(false, false);
		super.aClass200_Sub2_37.method5328(this.aClass11_1);
		this.aClass11_1.method200(this.aClass31_Sub1_1, 0);
		this.aClass11_1.method200(this.aClass31_Sub1_2, 1);
		this.aClass11_1.method191(0);
		if (!this.aClass11_1.method195()) {
			super.aClass200_Sub2_37.method5345(this.aClass11_1);
			return false;
		}
		super.aClass200_Sub2_37.method5345(this.aClass11_1);
		this.aClass26_4 = Static148.method2145(new Class54[] { Static4.method41("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass200_Sub2_37) }, super.aClass200_Sub2_37);
		this.aClass26_7 = Static148.method2145(new Class54[] { Static4.method41("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass200_Sub2_37) }, super.aClass200_Sub2_37);
		this.aClass26_5 = Static148.method2145(new Class54[] { Static4.method41("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass200_Sub2_37) }, super.aClass200_Sub2_37);
		this.aClass26_6 = Static148.method2145(new Class54[] { Static4.method41("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass200_Sub2_37) }, super.aClass200_Sub2_37);
		return this.aClass26_7 != null && this.aClass26_4 != null && this.aClass26_5 != null && this.aClass26_6 != null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	@Override
	public void method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6508 = arg0;
		this.anInt6514 = arg1;
		@Pc(22) int local22 = Static313.method4879(this.anInt6514);
		@Pc(27) int local27 = Static313.method4879(this.anInt6508);
		if (local22 == this.anInt6512 && this.anInt6518 == local27) {
			return;
		}
		@Pc(44) int local44;
		if (this.aClass31_Sub1Array3 != null) {
			for (local44 = 0; local44 < this.aClass31_Sub1Array3.length; local44++) {
				this.aClass31_Sub1Array3[local44].method4582();
			}
			this.aClass31_Sub1Array3 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass11_2 = null;
		} else {
			local44 = local22;
			@Pc(80) int local80 = local27;
			@Pc(82) int local82 = 0;
			if (this.aClass11_2 == null) {
				this.aClass11_2 = new Class11(super.aClass200_Sub2_37);
			}
			label54: while (true) {
				if (local44 <= 256 && local80 <= 256) {
					this.aClass31_Sub1Array3 = new Class31_Sub1[local82];
					local80 = local27;
					local44 = local22;
					local82 = 0;
					while (true) {
						if (local44 <= 256 && local80 <= 256) {
							break label54;
						}
						this.aClass31_Sub1Array3[local82++] = new Class31_Sub1(super.aClass200_Sub2_37, 3553, 34842, local44, local80);
						if (local44 > 256) {
							local44 >>= 0x1;
						}
						if (local80 > 256) {
							local80 >>= 0x1;
						}
					}
				}
				if (local80 > 256) {
					local80 >>= 0x1;
				}
				local82++;
				if (local44 > 256) {
					local44 >>= 0x1;
				}
			}
		}
		this.anInt6518 = local27;
		this.anInt6512 = local22;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5184(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass200_Sub2_37.method5319(1);
		super.aClass200_Sub2_37.method5312(null);
		super.aClass200_Sub2_37.method5319(0);
	}

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "(I)Z")
	public boolean method5192() {
		return super.aClass200_Sub2_37.aBoolean435 && super.aClass200_Sub2_37.aBoolean441 && super.aClass200_Sub2_37.aBoolean440;
	}
}
