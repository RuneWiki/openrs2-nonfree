import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class4_Sub31_Sub1 extends Class4_Sub31 {

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "Lclient!ec;")
	private Class87 aClass87_3;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "Lclient!qn;")
	private Class281 aClass281_3;

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "Lclient!ec;")
	private Class87 aClass87_4;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "Lclient!qn;")
	private Class281 aClass281_4;

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
	private int anInt6415;

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "Lclient!il;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
	private int anInt6418;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Lclient!qn;")
	private Class281 aClass281_5;

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "Lclient!il;")
	private Class3_Sub2 aClass3_Sub2_4;

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "[Lclient!il;")
	private Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "Lclient!qn;")
	private Class281 aClass281_6;

	@OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
	private int anInt6424;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class4_Sub31_Sub1(@OriginalArg(0) Class7_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	@Override
	public void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6415 = arg1;
		this.anInt6424 = arg0;
		@Pc(20) int local20 = Static205.method3349(this.anInt6415);
		@Pc(25) int local25 = Static205.method3349(this.anInt6424);
		if (local20 == this.anInt6418 && local25 == this.anInt6417) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass3_Sub2Array1 != null) {
			for (local42 = 0; local42 < this.aClass3_Sub2Array1.length; local42++) {
				this.aClass3_Sub2Array1[local42].method2746();
			}
			this.aClass3_Sub2Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass87_4 = null;
		} else {
			local42 = local20;
			@Pc(78) int local78 = local25;
			@Pc(80) int local80 = 0;
			if (this.aClass87_4 == null) {
				this.aClass87_4 = new Class87(super.aClass7_Sub2_28);
			}
			label54: while (true) {
				if (local42 <= 256 && local78 <= 256) {
					this.aClass3_Sub2Array1 = new Class3_Sub2[local80];
					local42 = local20;
					local78 = local25;
					local80 = 0;
					while (true) {
						if (local42 <= 256 && local78 <= 256) {
							break label54;
						}
						this.aClass3_Sub2Array1[local80++] = new Class3_Sub2(super.aClass7_Sub2_28, 3553, 34842, local42, local78);
						if (local78 > 256) {
							local78 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				local80++;
				if (local78 > 256) {
					local78 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt6418 = local20;
		this.anInt6417 = local25;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5052() {
		if (!super.aClass7_Sub2_28.aBoolean390 || !super.aClass7_Sub2_28.aBoolean401 || !super.aClass7_Sub2_28.aBoolean380) {
			return false;
		}
		this.aClass87_3 = new Class87(super.aClass7_Sub2_28);
		this.aClass3_Sub2_3 = new Class3_Sub2(super.aClass7_Sub2_28, 3553, 34842, 256, 256);
		this.aClass3_Sub2_3.method953(false, false);
		this.aClass3_Sub2_4 = new Class3_Sub2(super.aClass7_Sub2_28, 3553, 34842, 256, 256);
		this.aClass3_Sub2_4.method953(false, false);
		super.aClass7_Sub2_28.method4281(this.aClass87_3);
		this.aClass87_3.method2073(this.aClass3_Sub2_3, 0);
		this.aClass87_3.method2073(this.aClass3_Sub2_4, 1);
		this.aClass87_3.method2071(0);
		if (!this.aClass87_3.method2072()) {
			super.aClass7_Sub2_28.method4358(this.aClass87_3);
			return false;
		}
		super.aClass7_Sub2_28.method4358(this.aClass87_3);
		this.aClass281_6 = Static110.method2036(new Class11[] { Static427.method6369(super.aClass7_Sub2_28, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass7_Sub2_28);
		this.aClass281_3 = Static110.method2036(new Class11[] { Static427.method6369(super.aClass7_Sub2_28, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass7_Sub2_28);
		this.aClass281_4 = Static110.method2036(new Class11[] { Static427.method6369(super.aClass7_Sub2_28, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass7_Sub2_28);
		this.aClass281_5 = Static110.method2036(new Class11[] { Static427.method6369(super.aClass7_Sub2_28, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass7_Sub2_28);
		return this.aClass281_3 != null && this.aClass281_6 != null && this.aClass281_4 != null && this.aClass281_5 != null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!il;Lclient!il;II)V")
	@Override
	public void method5059(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(267) long local267;
		if (this.aClass3_Sub2Array1 == null) {
			super.aClass7_Sub2_28.method4313(arg0);
			super.aClass7_Sub2_28.method4281(this.aClass87_3);
			this.aClass87_3.method2071(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass281_6.aLong222;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static293.aFloat151, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6415, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6415, (float) this.anInt6424);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6424);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass7_Sub2_28.method4281(this.aClass87_4);
			@Pc(32) int local32 = Static205.method3349(this.anInt6415);
			@Pc(37) int local37 = Static205.method3349(this.anInt6424);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass87_4.method2073(this.aClass3_Sub2Array1[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass7_Sub2_28.method4313(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6415, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6415, (float) this.anInt6424);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6424);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass7_Sub2_28.method4313(this.aClass3_Sub2Array1[local39 - 1]);
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
			super.aClass7_Sub2_28.method4358(this.aClass87_4);
			super.aClass7_Sub2_28.method4313(this.aClass3_Sub2Array1[local39 - 1]);
			super.aClass7_Sub2_28.method4281(this.aClass87_3);
			this.aClass87_3.method2071(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(197) long local197 = this.aClass281_3.aLong222;
			OpenGL.glUseProgramObjectARB(local197);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local197, "params"), Static293.aFloat151, 0.0F, 0.0F);
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
		this.aClass87_3.method2071(1);
		super.aClass7_Sub2_28.method4313(this.aClass3_Sub2_3);
		local267 = this.aClass281_5.aLong222;
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
		this.aClass87_3.method2071(0);
		super.aClass7_Sub2_28.method4313(this.aClass3_Sub2_4);
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
		super.aClass7_Sub2_28.method4358(this.aClass87_3);
		@Pc(431) long local431 = this.aClass281_4.aLong222;
		OpenGL.glUseProgramObjectARB(local431);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local431, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local431, "params"), Static16.aFloat153, Static405.aFloat185, 0.0F);
		super.aClass7_Sub2_28.method4326(1);
		super.aClass7_Sub2_28.method4313(this.aClass3_Sub2_3);
		super.aClass7_Sub2_28.method4326(0);
		super.aClass7_Sub2_28.method4313(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
	@Override
	public void method5054(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass7_Sub2_28.method4326(1);
		super.aClass7_Sub2_28.method4313(null);
		super.aClass7_Sub2_28.method4326(0);
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method5061() {
		return this.aClass87_3 != null;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
	public boolean method5064() {
		return super.aClass7_Sub2_28.aBoolean390 && super.aClass7_Sub2_28.aBoolean401 && super.aClass7_Sub2_28.aBoolean380;
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
	@Override
	public void method5057() {
		this.aClass281_5 = null;
		this.aClass281_4 = null;
		this.aClass281_3 = null;
		this.aClass87_4 = null;
		this.aClass281_6 = null;
		this.aClass3_Sub2_3 = null;
		this.aClass87_3 = null;
		this.aClass3_Sub2Array1 = null;
		this.aClass3_Sub2_4 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	@Override
	public int method5056() {
		return 1;
	}
}
