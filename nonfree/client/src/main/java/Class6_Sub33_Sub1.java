import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class6_Sub33_Sub1 extends Class6_Sub33 {

	@OriginalMember(owner = "client!rw", name = "A", descriptor = "Lclient!kba;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
	private int anInt8098;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "Lclient!waa;")
	private Class16_Sub1 aClass16_Sub1_3;

	@OriginalMember(owner = "client!rw", name = "H", descriptor = "Lclient!ufa;")
	private Class319 aClass319_2;

	@OriginalMember(owner = "client!rw", name = "K", descriptor = "I")
	private int anInt8102;

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "Lclient!waa;")
	private Class16_Sub1 aClass16_Sub1_4;

	@OriginalMember(owner = "client!rw", name = "N", descriptor = "Lclient!kba;")
	private Class164 aClass164_4;

	@OriginalMember(owner = "client!rw", name = "P", descriptor = "I")
	private int anInt8104;

	@OriginalMember(owner = "client!rw", name = "R", descriptor = "[Lclient!waa;")
	private Class16_Sub1[] aClass16_Sub1Array3;

	@OriginalMember(owner = "client!rw", name = "S", descriptor = "Lclient!kba;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!rw", name = "W", descriptor = "Lclient!kba;")
	private Class164 aClass164_6;

	@OriginalMember(owner = "client!rw", name = "Y", descriptor = "I")
	private int anInt8110;

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "Lclient!ufa;")
	private Class319 aClass319_3;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class6_Sub33_Sub1(@OriginalArg(0) Class90_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)I")
	@Override
	public int method6434() {
		return 1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IB)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass90_Sub1_36.method2069(1);
		super.aClass90_Sub1_36.method2126(null);
		super.aClass90_Sub1_36.method2069(0);
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)Z")
	public boolean method6442() {
		return super.aClass90_Sub1_36.aBoolean153 && super.aClass90_Sub1_36.aBoolean162 && super.aClass90_Sub1_36.aBoolean152;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6426() {
		return this.aClass319_3 != null;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	@Override
	public void method6432() {
		this.aClass164_4 = null;
		this.aClass16_Sub1_4 = null;
		this.aClass16_Sub1Array3 = null;
		this.aClass319_2 = null;
		this.aClass164_5 = null;
		this.aClass16_Sub1_3 = null;
		this.aClass319_3 = null;
		this.aClass164_6 = null;
		this.aClass164_3 = null;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8098 = arg0;
		this.anInt8110 = arg1;
		@Pc(23) int local23 = Static118.method7958(this.anInt8110);
		@Pc(28) int local28 = Static118.method7958(this.anInt8098);
		if (local23 == this.anInt8104 && this.anInt8102 == local28) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass16_Sub1Array3 != null) {
			for (local45 = 0; local45 < this.aClass16_Sub1Array3.length; local45++) {
				this.aClass16_Sub1Array3[local45].method7847();
			}
			this.aClass16_Sub1Array3 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass319_2 = null;
		} else {
			local45 = local23;
			@Pc(72) int local72 = local28;
			@Pc(74) int local74 = 0;
			if (this.aClass319_2 == null) {
				this.aClass319_2 = new Class319(super.aClass90_Sub1_36);
			}
			label55: while (true) {
				if (local45 <= 256 && local72 <= 256) {
					local72 = local28;
					this.aClass16_Sub1Array3 = new Class16_Sub1[local74];
					local45 = local23;
					local74 = 0;
					while (true) {
						if (local45 <= 256 && local72 <= 256) {
							break label55;
						}
						this.aClass16_Sub1Array3[local74++] = new Class16_Sub1(super.aClass90_Sub1_36, 3553, 34842, local45, local72);
						if (local45 > 256) {
							local45 >>= 0x1;
						}
						if (local72 > 256) {
							local72 >>= 0x1;
						}
					}
				}
				local74++;
				if (local45 > 256) {
					local45 >>= 0x1;
				}
				if (local72 > 256) {
					local72 >>= 0x1;
				}
			}
		}
		this.anInt8102 = local28;
		this.anInt8104 = local23;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		if (!super.aClass90_Sub1_36.aBoolean153 || !super.aClass90_Sub1_36.aBoolean162 || !super.aClass90_Sub1_36.aBoolean152) {
			return false;
		}
		this.aClass319_3 = new Class319(super.aClass90_Sub1_36);
		this.aClass16_Sub1_4 = new Class16_Sub1(super.aClass90_Sub1_36, 3553, 34842, 256, 256);
		this.aClass16_Sub1_4.method303(false, false);
		this.aClass16_Sub1_3 = new Class16_Sub1(super.aClass90_Sub1_36, 3553, 34842, 256, 256);
		this.aClass16_Sub1_3.method303(false, false);
		super.aClass90_Sub1_36.method2139(this.aClass319_3);
		this.aClass319_3.method7198(this.aClass16_Sub1_4, 0);
		this.aClass319_3.method7198(this.aClass16_Sub1_3, 1);
		this.aClass319_3.method7201(0);
		if (!this.aClass319_3.method7196()) {
			super.aClass90_Sub1_36.method2107(this.aClass319_3);
			return false;
		}
		super.aClass90_Sub1_36.method2107(this.aClass319_3);
		this.aClass164_6 = Static499.method7167(new Class123[] { Static194.method3296(35632, super.aClass90_Sub1_36, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass90_Sub1_36);
		this.aClass164_3 = Static499.method7167(new Class123[] { Static194.method3296(35632, super.aClass90_Sub1_36, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass90_Sub1_36);
		this.aClass164_5 = Static499.method7167(new Class123[] { Static194.method3296(35632, super.aClass90_Sub1_36, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass90_Sub1_36);
		this.aClass164_4 = Static499.method7167(new Class123[] { Static194.method3296(35632, super.aClass90_Sub1_36, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass90_Sub1_36);
		return this.aClass164_3 != null && this.aClass164_6 != null && this.aClass164_5 != null && this.aClass164_4 != null;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!waa;BLclient!waa;I)V")
	@Override
	public void method6435(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(276) long local276;
		if (this.aClass16_Sub1Array3 == null) {
			super.aClass90_Sub1_36.method2126(arg1);
			super.aClass90_Sub1_36.method2139(this.aClass319_3);
			this.aClass319_3.method7201(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local276 = this.aClass164_6.aLong99;
			OpenGL.glUseProgramObjectARB(local276);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "params"), Static580.aFloat212, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8110, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8110, (float) this.anInt8098);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8098);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass90_Sub1_36.method2139(this.aClass319_2);
			@Pc(36) int local36 = Static118.method7958(this.anInt8110);
			@Pc(41) int local41 = Static118.method7958(this.anInt8098);
			@Pc(43) int local43 = 0;
			while (local36 > 256 || local41 > 256) {
				OpenGL.glViewport(0, 0, local36, local41);
				this.aClass319_2.method7198(this.aClass16_Sub1Array3[local43], 0);
				if (local41 > 256) {
					local41 >>= 0x1;
				}
				if (local36 > 256) {
					local36 >>= 0x1;
				}
				if (local43 == 0) {
					super.aClass90_Sub1_36.method2126(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8110, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8110, (float) this.anInt8098);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8098);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass90_Sub1_36.method2126(this.aClass16_Sub1Array3[local43 - 1]);
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
				local43++;
			}
			super.aClass90_Sub1_36.method2107(this.aClass319_2);
			super.aClass90_Sub1_36.method2126(this.aClass16_Sub1Array3[local43 - 1]);
			super.aClass90_Sub1_36.method2139(this.aClass319_3);
			this.aClass319_3.method7201(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(208) long local208 = this.aClass164_3.aLong99;
			OpenGL.glUseProgramObjectARB(local208);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local208, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local208, "params"), Static580.aFloat212, 0.0F, 0.0F);
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
		this.aClass319_3.method7201(1);
		super.aClass90_Sub1_36.method2126(this.aClass16_Sub1_4);
		local276 = this.aClass164_4.aLong99;
		OpenGL.glUseProgramObjectARB(local276);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass319_3.method7201(0);
		super.aClass90_Sub1_36.method2126(this.aClass16_Sub1_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass90_Sub1_36.method2107(this.aClass319_3);
		@Pc(440) long local440 = this.aClass164_5.aLong99;
		OpenGL.glUseProgramObjectARB(local440);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local440, "params"), Static488.aFloat210, Static514.aFloat182, 0.0F);
		super.aClass90_Sub1_36.method2069(1);
		super.aClass90_Sub1_36.method2126(this.aClass16_Sub1_4);
		super.aClass90_Sub1_36.method2069(0);
		super.aClass90_Sub1_36.method2126(arg1);
	}
}
