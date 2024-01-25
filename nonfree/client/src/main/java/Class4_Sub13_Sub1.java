import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!ej;")
	private Class63 aClass63_4;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
	private int anInt6150;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Lclient!nn;")
	private Class172 aClass172_5;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Lclient!uk;")
	private Class62_Sub2 aClass62_Sub2_4;

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "Lclient!ej;")
	private Class63 aClass63_5;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "Lclient!ej;")
	private Class63 aClass63_6;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "[Lclient!uk;")
	private Class62_Sub2[] aClass62_Sub2Array4;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	private int anInt6157;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
	private int anInt6158;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
	private int anInt6161;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lclient!nn;")
	private Class172 aClass172_6;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "Lclient!uk;")
	private Class62_Sub2 aClass62_Sub2_5;

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "Lclient!ej;")
	private Class63 aClass63_7;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	@Override
	public void method5066(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass30_Sub1_37.method726(1);
		super.aClass30_Sub1_37.method730(null);
		super.aClass30_Sub1_37.method726(0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	@Override
	public void method5067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6157 = arg0;
		this.anInt6158 = arg1;
		@Pc(23) int local23 = Static284.method4425(this.anInt6158);
		@Pc(28) int local28 = Static284.method4425(this.anInt6157);
		if (local23 == this.anInt6161 && this.anInt6150 == local28) {
			return;
		}
		@Pc(41) int local41;
		if (this.aClass62_Sub2Array4 != null) {
			for (local41 = 0; local41 < this.aClass62_Sub2Array4.length; local41++) {
				this.aClass62_Sub2Array4[local41].method5353();
			}
			this.aClass62_Sub2Array4 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass172_6 = null;
		} else {
			local41 = local23;
			@Pc(70) int local70 = local28;
			@Pc(72) int local72 = 0;
			if (this.aClass172_6 == null) {
				this.aClass172_6 = new Class172(super.aClass30_Sub1_37);
			}
			label57: while (true) {
				if (local41 <= 256 && local70 <= 256) {
					this.aClass62_Sub2Array4 = new Class62_Sub2[local72];
					local41 = local23;
					local70 = local28;
					local72 = 0;
					while (true) {
						if (local41 <= 256 && local70 <= 256) {
							break label57;
						}
						this.aClass62_Sub2Array4[local72++] = new Class62_Sub2(super.aClass30_Sub1_37, 3553, 34842, local41, local70);
						if (local70 > 256) {
							local70 >>= 0x1;
						}
						if (local41 > 256) {
							local41 >>= 0x1;
						}
					}
				}
				if (local70 > 256) {
					local70 >>= 0x1;
				}
				if (local41 > 256) {
					local41 >>= 0x1;
				}
				local72++;
			}
		}
		this.anInt6161 = local23;
		this.anInt6150 = local28;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5077() {
		if (!super.aClass30_Sub1_37.aBoolean60 || !super.aClass30_Sub1_37.aBoolean37 || !super.aClass30_Sub1_37.aBoolean59) {
			return false;
		}
		this.aClass172_5 = new Class172(super.aClass30_Sub1_37);
		this.aClass62_Sub2_5 = new Class62_Sub2(super.aClass30_Sub1_37, 3553, 34842, 256, 256);
		this.aClass62_Sub2_5.method2681(false, false);
		this.aClass62_Sub2_4 = new Class62_Sub2(super.aClass30_Sub1_37, 3553, 34842, 256, 256);
		this.aClass62_Sub2_4.method2681(false, false);
		super.aClass30_Sub1_37.method734(this.aClass172_5);
		this.aClass172_5.method4332(0, this.aClass62_Sub2_5);
		this.aClass172_5.method4332(1, this.aClass62_Sub2_4);
		this.aClass172_5.method4328(0);
		if (!this.aClass172_5.method4326()) {
			super.aClass30_Sub1_37.method728(this.aClass172_5);
			return false;
		}
		super.aClass30_Sub1_37.method728(this.aClass172_5);
		this.aClass63_4 = Static325.method4858(super.aClass30_Sub1_37, new Class27[] { Static15.method256(super.aClass30_Sub1_37, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) });
		this.aClass63_5 = Static325.method4858(super.aClass30_Sub1_37, new Class27[] { Static15.method256(super.aClass30_Sub1_37, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) });
		this.aClass63_6 = Static325.method4858(super.aClass30_Sub1_37, new Class27[] { Static15.method256(super.aClass30_Sub1_37, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) });
		this.aClass63_7 = Static325.method4858(super.aClass30_Sub1_37, new Class27[] { Static15.method256(super.aClass30_Sub1_37, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) });
		return this.aClass63_5 != null && this.aClass63_4 != null && this.aClass63_6 != null && this.aClass63_7 != null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Z")
	public boolean method5082() {
		return super.aClass30_Sub1_37.aBoolean60 && super.aClass30_Sub1_37.aBoolean37 && super.aClass30_Sub1_37.aBoolean59;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
	@Override
	public int method5074() {
		return 1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
	@Override
	public void method5078() {
		this.aClass62_Sub2_5 = null;
		this.aClass62_Sub2Array4 = null;
		this.aClass172_5 = null;
		this.aClass63_5 = null;
		this.aClass172_6 = null;
		this.aClass62_Sub2_4 = null;
		this.aClass63_6 = null;
		this.aClass63_7 = null;
		this.aClass63_4 = null;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5076() {
		return this.aClass172_5 != null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!uk;Lclient!uk;Z)V")
	@Override
	public void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub2 arg1, @OriginalArg(2) Class62_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(267) long local267;
		if (this.aClass62_Sub2Array4 == null) {
			super.aClass30_Sub1_37.method730(arg2);
			super.aClass30_Sub1_37.method734(this.aClass172_5);
			this.aClass172_5.method4328(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass63_4.aLong62;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static373.aFloat89, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6158, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6158, (float) this.anInt6157);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6157);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass30_Sub1_37.method734(this.aClass172_6);
			@Pc(32) int local32 = Static284.method4425(this.anInt6158);
			@Pc(37) int local37 = Static284.method4425(this.anInt6157);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass172_6.method4332(0, this.aClass62_Sub2Array4[local39]);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass30_Sub1_37.method730(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6158, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6158, (float) this.anInt6157);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6157);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass30_Sub1_37.method730(this.aClass62_Sub2Array4[local39 - 1]);
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
				local39++;
			}
			super.aClass30_Sub1_37.method728(this.aClass172_6);
			super.aClass30_Sub1_37.method730(this.aClass62_Sub2Array4[local39 - 1]);
			super.aClass30_Sub1_37.method734(this.aClass172_5);
			this.aClass172_5.method4328(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(199) long local199 = this.aClass63_5.aLong62;
			OpenGL.glUseProgramObjectARB(local199);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static373.aFloat89, 0.0F, 0.0F);
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
		this.aClass172_5.method4328(1);
		super.aClass30_Sub1_37.method730(this.aClass62_Sub2_5);
		local267 = this.aClass63_7.aLong62;
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
		this.aClass172_5.method4328(0);
		super.aClass30_Sub1_37.method730(this.aClass62_Sub2_4);
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
		super.aClass30_Sub1_37.method728(this.aClass172_5);
		@Pc(431) long local431 = this.aClass63_6.aLong62;
		OpenGL.glUseProgramObjectARB(local431);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local431, "params"), Static115.aFloat57, Static76.aFloat35, 0.0F);
		super.aClass30_Sub1_37.method726(1);
		super.aClass30_Sub1_37.method730(this.aClass62_Sub2_5);
		super.aClass30_Sub1_37.method726(0);
		super.aClass30_Sub1_37.method730(arg2);
	}
}
