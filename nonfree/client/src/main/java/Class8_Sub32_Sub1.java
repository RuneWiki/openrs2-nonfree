import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class8_Sub32_Sub1 extends Class8_Sub32 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!rda;")
	private Class288 aClass288_3;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	private int anInt6041;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!rda;")
	private Class288 aClass288_4;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!rda;")
	private Class288 aClass288_5;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	private int anInt6044;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "Lclient!er;")
	private Class89 aClass89_4;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Lclient!er;")
	private Class89 aClass89_5;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "Lclient!rda;")
	private Class288 aClass288_6;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "Lclient!wn;")
	private Class20_Sub4 aClass20_Sub4_3;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	private int anInt6053;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lclient!wn;")
	private Class20_Sub4[] aClass20_Sub4Array2;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "Lclient!wn;")
	private Class20_Sub4 aClass20_Sub4_4;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class8_Sub32_Sub1(@OriginalArg(0) Class16_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method4956() {
		return this.aClass89_5 != null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!wn;IILclient!wn;)V")
	@Override
	public void method4951(@OriginalArg(0) Class20_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20_Sub4 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, (double) 1, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass20_Sub4Array2 == null) {
			super.aClass16_Sub3_25.method6020(arg0);
			super.aClass16_Sub3_25.method6014(this.aClass89_5);
			this.aClass89_5.method2926(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass288_3.aLong223;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static72.aFloat57, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6053, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6053, (float) this.anInt6047);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6047);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass16_Sub3_25.method6014(this.aClass89_4);
			@Pc(33) int local33 = Static258.method4554(this.anInt6053);
			@Pc(38) int local38 = Static258.method4554(this.anInt6047);
			@Pc(40) int local40 = 0;
			while (local33 > 256 || local38 > 256) {
				OpenGL.glViewport(0, 0, local33, local38);
				this.aClass89_4.method2930(0, this.aClass20_Sub4Array2[local40]);
				if (local33 > 256) {
					local33 >>= 0x1;
				}
				if (local40 == 0) {
					super.aClass16_Sub3_25.method6020(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6053, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6053, (float) this.anInt6047);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6047);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass16_Sub3_25.method6020(this.aClass20_Sub4Array2[local40 - 1]);
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
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				local40++;
			}
			super.aClass16_Sub3_25.method6016(this.aClass89_4);
			super.aClass16_Sub3_25.method6020(this.aClass20_Sub4Array2[local40 - 1]);
			super.aClass16_Sub3_25.method6014(this.aClass89_5);
			this.aClass89_5.method2926(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(199) long local199 = this.aClass288_4.aLong223;
			OpenGL.glUseProgramObjectARB(local199);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static72.aFloat57, 0.0F, 0.0F);
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
		this.aClass89_5.method2926(1);
		super.aClass16_Sub3_25.method6020(this.aClass20_Sub4_4);
		local269 = this.aClass288_5.aLong223;
		OpenGL.glUseProgramObjectARB(local269);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass89_5.method2926(0);
		super.aClass16_Sub3_25.method6020(this.aClass20_Sub4_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass16_Sub3_25.method6016(this.aClass89_5);
		@Pc(433) long local433 = this.aClass288_6.aLong223;
		OpenGL.glUseProgramObjectARB(local433);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local433, "params"), Static55.aFloat43, Static104.aFloat58, 0.0F);
		super.aClass16_Sub3_25.method5944(1);
		super.aClass16_Sub3_25.method6020(this.aClass20_Sub4_4);
		super.aClass16_Sub3_25.method5944(0);
		super.aClass16_Sub3_25.method6020(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method4954() {
		if (!super.aClass16_Sub3_25.aBoolean524 || !super.aClass16_Sub3_25.aBoolean523 || !super.aClass16_Sub3_25.aBoolean513) {
			return false;
		}
		this.aClass89_5 = new Class89(super.aClass16_Sub3_25);
		this.aClass20_Sub4_4 = new Class20_Sub4(super.aClass16_Sub3_25, 3553, 34842, 256, 256);
		this.aClass20_Sub4_4.method7626(false, false);
		this.aClass20_Sub4_3 = new Class20_Sub4(super.aClass16_Sub3_25, 3553, 34842, 256, 256);
		this.aClass20_Sub4_3.method7626(false, false);
		super.aClass16_Sub3_25.method6014(this.aClass89_5);
		this.aClass89_5.method2930(0, this.aClass20_Sub4_4);
		this.aClass89_5.method2930(1, this.aClass20_Sub4_3);
		this.aClass89_5.method2926(0);
		if (!this.aClass89_5.method2925()) {
			super.aClass16_Sub3_25.method6016(this.aClass89_5);
			return false;
		}
		super.aClass16_Sub3_25.method6016(this.aClass89_5);
		this.aClass288_3 = Static237.method4354(super.aClass16_Sub3_25, new Class362[] { Static384.method6163(super.aClass16_Sub3_25, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass288_4 = Static237.method4354(super.aClass16_Sub3_25, new Class362[] { Static384.method6163(super.aClass16_Sub3_25, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass288_6 = Static237.method4354(super.aClass16_Sub3_25, new Class362[] { Static384.method6163(super.aClass16_Sub3_25, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass288_5 = Static237.method4354(super.aClass16_Sub3_25, new Class362[] { Static384.method6163(super.aClass16_Sub3_25, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass288_4 != null && this.aClass288_3 != null && this.aClass288_6 != null && this.aClass288_5 != null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6053 = arg0;
		this.anInt6047 = arg1;
		@Pc(23) int local23 = Static258.method4554(this.anInt6053);
		@Pc(28) int local28 = Static258.method4554(this.anInt6047);
		if (this.anInt6041 == local23 && this.anInt6044 == local28) {
			return;
		}
		@Pc(41) int local41;
		if (this.aClass20_Sub4Array2 != null) {
			for (local41 = 0; local41 < this.aClass20_Sub4Array2.length; local41++) {
				this.aClass20_Sub4Array2[local41].method7614();
			}
			this.aClass20_Sub4Array2 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass89_4 = null;
		} else {
			local41 = local23;
			@Pc(72) int local72 = local28;
			@Pc(74) int local74 = 0;
			label59: while (true) {
				if (local41 <= 256 && local72 <= 256) {
					if (this.aClass89_4 == null) {
						this.aClass89_4 = new Class89(super.aClass16_Sub3_25);
					}
					local72 = local28;
					this.aClass20_Sub4Array2 = new Class20_Sub4[local74];
					local41 = local23;
					local74 = 0;
					while (true) {
						if (local41 <= 256 && local72 <= 256) {
							break label59;
						}
						this.aClass20_Sub4Array2[local74++] = new Class20_Sub4(super.aClass16_Sub3_25, 3553, 34842, local41, local72);
						if (local41 > 256) {
							local41 >>= 0x1;
						}
						if (local72 > 256) {
							local72 >>= 0x1;
						}
					}
				}
				if (local72 > 256) {
					local72 >>= 0x1;
				}
				if (local41 > 256) {
					local41 >>= 0x1;
				}
				local74++;
			}
		}
		this.anInt6044 = local28;
		this.anInt6041 = local23;
	}

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)Z")
	public boolean method4960() {
		return super.aClass16_Sub3_25.aBoolean524 && super.aClass16_Sub3_25.aBoolean523 && super.aClass16_Sub3_25.aBoolean513;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	@Override
	public void method4950() {
		this.aClass20_Sub4_3 = null;
		this.aClass288_4 = null;
		this.aClass89_4 = null;
		this.aClass20_Sub4_4 = null;
		this.aClass89_5 = null;
		this.aClass20_Sub4Array2 = null;
		this.aClass288_6 = null;
		this.aClass288_5 = null;
		this.aClass288_3 = null;
	}

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)I")
	@Override
	public int method4959() {
		return 1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	@Override
	public void method4947(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass16_Sub3_25.method5944(1);
		super.aClass16_Sub3_25.method6020(null);
		super.aClass16_Sub3_25.method5944(0);
	}
}
