import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class1_Sub24_Sub1 extends Class1_Sub24 {

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!eq;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Lclient!eq;")
	private Class77 aClass77_3;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "Lclient!eq;")
	private Class77 aClass77_4;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "Lclient!jk;")
	private Class131 aClass131_5;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	private int anInt4656;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[Lclient!ah;")
	private Class8_Sub1[] aClass8_Sub1Array4;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "Lclient!jk;")
	private Class131 aClass131_6;

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
	private int anInt4662;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
	private int anInt4663;

	@OriginalMember(owner = "client!lm", name = "U", descriptor = "Lclient!ah;")
	private Class8_Sub1 aClass8_Sub1_4;

	@OriginalMember(owner = "client!lm", name = "V", descriptor = "Lclient!eq;")
	private Class77 aClass77_5;

	@OriginalMember(owner = "client!lm", name = "W", descriptor = "Lclient!ah;")
	private Class8_Sub1 aClass8_Sub1_5;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub24_Sub1(@OriginalArg(0) Class106_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	@Override
	public void method3585(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass106_Sub2_31.method2881(1);
		super.aClass106_Sub2_31.method2912(null);
		super.aClass106_Sub2_31.method2881(0);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3576() {
		if (!super.aClass106_Sub2_31.aBoolean233 || !super.aClass106_Sub2_31.aBoolean232 || !super.aClass106_Sub2_31.aBoolean213) {
			return false;
		}
		this.aClass131_6 = new Class131(super.aClass106_Sub2_31);
		this.aClass8_Sub1_5 = new Class8_Sub1(super.aClass106_Sub2_31, 3553, 34842, 256, 256);
		this.aClass8_Sub1_5.method2252(false, false);
		this.aClass8_Sub1_4 = new Class8_Sub1(super.aClass106_Sub2_31, 3553, 34842, 256, 256);
		this.aClass8_Sub1_4.method2252(false, false);
		super.aClass106_Sub2_31.method2870(this.aClass131_6);
		this.aClass131_6.method3145(0, this.aClass8_Sub1_5);
		this.aClass131_6.method3145(1, this.aClass8_Sub1_4);
		this.aClass131_6.method3139(0);
		if (!this.aClass131_6.method3154()) {
			super.aClass106_Sub2_31.method2857(this.aClass131_6);
			return false;
		}
		super.aClass106_Sub2_31.method2857(this.aClass131_6);
		this.aClass77_5 = Static86.method1530(new Class10[] { Static403.method5533(35632, super.aClass106_Sub2_31, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass106_Sub2_31);
		this.aClass77_3 = Static86.method1530(new Class10[] { Static403.method5533(35632, super.aClass106_Sub2_31, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass106_Sub2_31);
		this.aClass77_2 = Static86.method1530(new Class10[] { Static403.method5533(35632, super.aClass106_Sub2_31, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass106_Sub2_31);
		this.aClass77_4 = Static86.method1530(new Class10[] { Static403.method5533(35632, super.aClass106_Sub2_31, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass106_Sub2_31);
		return this.aClass77_3 != null && this.aClass77_5 != null && this.aClass77_2 != null && this.aClass77_4 != null;
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)Z")
	public boolean method3588() {
		return super.aClass106_Sub2_31.aBoolean233 && super.aClass106_Sub2_31.aBoolean232 && super.aClass106_Sub2_31.aBoolean213;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4663 = arg1;
		this.anInt4655 = arg0;
		@Pc(16) int local16 = Static417.method5678(this.anInt4663);
		@Pc(21) int local21 = Static417.method5678(this.anInt4655);
		if (local16 == this.anInt4656 && this.anInt4662 == local21) {
			return;
		}
		@Pc(47) int local47;
		if (this.aClass8_Sub1Array4 != null) {
			for (local47 = 0; local47 < this.aClass8_Sub1Array4.length; local47++) {
				this.aClass8_Sub1Array4[local47].method3074();
			}
			this.aClass8_Sub1Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass131_5 = null;
		} else {
			local47 = local16;
			@Pc(76) int local76 = local21;
			@Pc(78) int local78 = 0;
			if (this.aClass131_5 == null) {
				this.aClass131_5 = new Class131(super.aClass106_Sub2_31);
			}
			label55: while (true) {
				if (local47 <= 256 && local76 <= 256) {
					this.aClass8_Sub1Array4 = new Class8_Sub1[local78];
					local76 = local21;
					local47 = local16;
					local78 = 0;
					while (true) {
						if (local47 <= 256 && local76 <= 256) {
							break label55;
						}
						this.aClass8_Sub1Array4[local78++] = new Class8_Sub1(super.aClass106_Sub2_31, 3553, 34842, local47, local76);
						if (local76 > 256) {
							local76 >>= 0x1;
						}
						if (local47 > 256) {
							local47 >>= 0x1;
						}
					}
				}
				if (local76 > 256) {
					local76 >>= 0x1;
				}
				local78++;
				if (local47 > 256) {
					local47 >>= 0x1;
				}
			}
		}
		this.anInt4662 = local21;
		this.anInt4656 = local16;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	@Override
	public int method3575() {
		return 1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ah;ZLclient!ah;I)V")
	@Override
	public void method3579(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(2) Class8_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass8_Sub1Array4 == null) {
			super.aClass106_Sub2_31.method2912(arg1);
			super.aClass106_Sub2_31.method2870(this.aClass131_6);
			this.aClass131_6.method3139(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass77_5.aLong69;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static98.aFloat13, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4663, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4663, (float) this.anInt4655);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4655);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass106_Sub2_31.method2870(this.aClass131_5);
			@Pc(108) int local108 = Static417.method5678(this.anInt4663);
			@Pc(113) int local113 = Static417.method5678(this.anInt4655);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass131_5.method3145(0, this.aClass8_Sub1Array4[local115]);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass106_Sub2_31.method2912(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4663, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4663, (float) this.anInt4655);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4655);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass106_Sub2_31.method2912(this.aClass8_Sub1Array4[local115 - 1]);
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
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				local115++;
			}
			super.aClass106_Sub2_31.method2857(this.aClass131_5);
			super.aClass106_Sub2_31.method2912(this.aClass8_Sub1Array4[local115 - 1]);
			super.aClass106_Sub2_31.method2870(this.aClass131_6);
			this.aClass131_6.method3139(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(275) long local275 = this.aClass77_3.aLong69;
			OpenGL.glUseProgramObjectARB(local275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "params"), Static98.aFloat13, 0.0F, 0.0F);
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
		this.aClass131_6.method3139(1);
		super.aClass106_Sub2_31.method2912(this.aClass8_Sub1_5);
		local46 = this.aClass77_4.aLong69;
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
		this.aClass131_6.method3139(0);
		super.aClass106_Sub2_31.method2912(this.aClass8_Sub1_4);
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
		super.aClass106_Sub2_31.method2857(this.aClass131_6);
		@Pc(440) long local440 = this.aClass77_2.aLong69;
		OpenGL.glUseProgramObjectARB(local440);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local440, "params"), Static130.aFloat21, Static74.aFloat11, 0.0F);
		super.aClass106_Sub2_31.method2881(1);
		super.aClass106_Sub2_31.method2912(this.aClass8_Sub1_5);
		super.aClass106_Sub2_31.method2881(0);
		super.aClass106_Sub2_31.method2912(arg1);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3581() {
		return this.aClass131_6 != null;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	@Override
	public void method3580() {
		this.aClass77_5 = null;
		this.aClass8_Sub1_4 = null;
		this.aClass77_2 = null;
		this.aClass77_4 = null;
		this.aClass77_3 = null;
		this.aClass8_Sub1_5 = null;
		this.aClass8_Sub1Array4 = null;
		this.aClass131_6 = null;
		this.aClass131_5 = null;
	}
}
