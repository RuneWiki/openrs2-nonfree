import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class6_Sub11_Sub1 extends Class6_Sub11 {

	@OriginalMember(owner = "client!cga", name = "u", descriptor = "I")
	private int anInt1402;

	@OriginalMember(owner = "client!cga", name = "x", descriptor = "Lclient!hha;")
	private Class143 aClass143_1;

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
	private int anInt1406;

	@OriginalMember(owner = "client!cga", name = "C", descriptor = "Lclient!on;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "[Lclient!rq;")
	private Class53_Sub2[] aClass53_Sub2Array1;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "Lclient!hha;")
	private Class143 aClass143_2;

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "Lclient!on;")
	private Class260 aClass260_3;

	@OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
	private int anInt1411;

	@OriginalMember(owner = "client!cga", name = "L", descriptor = "Lclient!on;")
	private Class260 aClass260_4;

	@OriginalMember(owner = "client!cga", name = "N", descriptor = "Lclient!rq;")
	private Class53_Sub2 aClass53_Sub2_1;

	@OriginalMember(owner = "client!cga", name = "O", descriptor = "Lclient!on;")
	private Class260 aClass260_5;

	@OriginalMember(owner = "client!cga", name = "P", descriptor = "Lclient!rq;")
	private Class53_Sub2 aClass53_Sub2_2;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class6_Sub11_Sub1(@OriginalArg(0) Class132_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V")
	@Override
	public void method1290() {
		this.aClass143_2 = null;
		this.aClass260_4 = null;
		this.aClass260_3 = null;
		this.aClass260_2 = null;
		this.aClass53_Sub2_2 = null;
		this.aClass53_Sub2Array1 = null;
		this.aClass53_Sub2_1 = null;
		this.aClass260_5 = null;
		this.aClass143_1 = null;
	}

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)Z")
	public boolean method1300() {
		return super.aClass132_Sub3_8.aBoolean529 && super.aClass132_Sub3_8.aBoolean543 && super.aClass132_Sub3_8.aBoolean520;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZII)V")
	@Override
	public void method1294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1411 = arg0;
		this.anInt1402 = arg1;
		@Pc(23) int local23 = Static199.method2911(this.anInt1411);
		@Pc(28) int local28 = Static199.method2911(this.anInt1402);
		if (local23 == this.anInt1406 && this.anInt1405 == local28) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass53_Sub2Array1 != null) {
			for (local45 = 0; local45 < this.aClass53_Sub2Array1.length; local45++) {
				this.aClass53_Sub2Array1[local45].method8292();
			}
			this.aClass53_Sub2Array1 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass143_2 = null;
		} else {
			local45 = local23;
			@Pc(74) int local74 = local28;
			@Pc(76) int local76 = 0;
			if (this.aClass143_2 == null) {
				this.aClass143_2 = new Class143(super.aClass132_Sub3_8);
			}
			label57: while (true) {
				if (local45 <= 256 && local74 <= 256) {
					this.aClass53_Sub2Array1 = new Class53_Sub2[local76];
					local45 = local23;
					local74 = local28;
					local76 = 0;
					while (true) {
						if (local45 <= 256 && local74 <= 256) {
							break label57;
						}
						this.aClass53_Sub2Array1[local76++] = new Class53_Sub2(super.aClass132_Sub3_8, 3553, 34842, local45, local74);
						if (local45 > 256) {
							local45 >>= 0x1;
						}
						if (local74 > 256) {
							local74 >>= 0x1;
						}
					}
				}
				if (local45 > 256) {
					local45 >>= 0x1;
				}
				if (local74 > 256) {
					local74 >>= 0x1;
				}
				local76++;
			}
		}
		this.anInt1405 = local28;
		this.anInt1406 = local23;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)I")
	@Override
	public int method1288() {
		return 1;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)V")
	@Override
	public void method1289(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass132_Sub3_8.method6802(1);
		super.aClass132_Sub3_8.method6759((Class53) null);
		super.aClass132_Sub3_8.method6802(0);
	}

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method1297() {
		if (!super.aClass132_Sub3_8.aBoolean529 || !super.aClass132_Sub3_8.aBoolean543 || !super.aClass132_Sub3_8.aBoolean520) {
			return false;
		}
		this.aClass143_1 = new Class143(super.aClass132_Sub3_8);
		this.aClass53_Sub2_1 = new Class53_Sub2(super.aClass132_Sub3_8, 3553, 34842, 256, 256);
		this.aClass53_Sub2_1.method3730(false, false);
		this.aClass53_Sub2_2 = new Class53_Sub2(super.aClass132_Sub3_8, 3553, 34842, 256, 256);
		this.aClass53_Sub2_2.method3730(false, false);
		super.aClass132_Sub3_8.method6814(this.aClass143_1);
		this.aClass143_1.method3130(this.aClass53_Sub2_1, 0);
		this.aClass143_1.method3130(this.aClass53_Sub2_2, 1);
		this.aClass143_1.method3129(0);
		if (!this.aClass143_1.method3136()) {
			super.aClass132_Sub3_8.method6799(this.aClass143_1);
			return false;
		}
		super.aClass132_Sub3_8.method6799(this.aClass143_1);
		this.aClass260_2 = Static677.method9169(new Class142[] { Static639.method8744(35632, super.aClass132_Sub3_8, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass132_Sub3_8);
		this.aClass260_5 = Static677.method9169(new Class142[] { Static639.method8744(35632, super.aClass132_Sub3_8, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass132_Sub3_8);
		this.aClass260_3 = Static677.method9169(new Class142[] { Static639.method8744(35632, super.aClass132_Sub3_8, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass132_Sub3_8);
		this.aClass260_4 = Static677.method9169(new Class142[] { Static639.method8744(35632, super.aClass132_Sub3_8, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass132_Sub3_8);
		return this.aClass260_5 != null && this.aClass260_2 != null && this.aClass260_3 != null && this.aClass260_4 != null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method1291() {
		return this.aClass143_1 != null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!rq;Lclient!rq;BI)V")
	@Override
	public void method1299(@OriginalArg(0) Class53_Sub2 arg0, @OriginalArg(1) Class53_Sub2 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(48) long local48;
		if (this.aClass53_Sub2Array1 == null) {
			super.aClass132_Sub3_8.method6759(arg1);
			super.aClass132_Sub3_8.method6814(this.aClass143_1);
			this.aClass143_1.method3129(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local48 = this.aClass260_2.aLong213;
			OpenGL.glUseProgramObjectARB(local48);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "params"), Static589.aFloat181, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1411, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1411, (float) this.anInt1402);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1402);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass132_Sub3_8.method6814(this.aClass143_2);
			@Pc(110) int local110 = Static199.method2911(this.anInt1411);
			@Pc(117) int local117 = Static199.method2911(this.anInt1402);
			@Pc(119) int local119 = 0;
			while (local110 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local110, local117);
				this.aClass143_2.method3130(this.aClass53_Sub2Array1[local119], 0);
				if (local110 > 256) {
					local110 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass132_Sub3_8.method6759(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1411, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1411, (float) this.anInt1402);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1402);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass132_Sub3_8.method6759(this.aClass53_Sub2Array1[local119 - 1]);
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
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				local119++;
			}
			super.aClass132_Sub3_8.method6799(this.aClass143_2);
			super.aClass132_Sub3_8.method6759(this.aClass53_Sub2Array1[local119 - 1]);
			super.aClass132_Sub3_8.method6814(this.aClass143_1);
			this.aClass143_1.method3129(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(275) long local275 = this.aClass260_5.aLong213;
			OpenGL.glUseProgramObjectARB(local275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "params"), Static589.aFloat181, 0.0F, 0.0F);
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
		this.aClass143_1.method3129(1);
		super.aClass132_Sub3_8.method6759(this.aClass53_Sub2_1);
		local48 = this.aClass260_4.aLong213;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass143_1.method3129(0);
		super.aClass132_Sub3_8.method6759(this.aClass53_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass132_Sub3_8.method6799(this.aClass143_1);
		@Pc(437) long local437 = this.aClass260_3.aLong213;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static294.aFloat198, Static515.aFloat161, 0.0F);
		super.aClass132_Sub3_8.method6802(1);
		super.aClass132_Sub3_8.method6759(this.aClass53_Sub2_1);
		super.aClass132_Sub3_8.method6802(0);
		super.aClass132_Sub3_8.method6759(arg1);
	}
}
