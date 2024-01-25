import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 {

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "Lclient!wba;")
	private Class355 aClass355_1;

	@OriginalMember(owner = "client!cs", name = "E", descriptor = "Lclient!wba;")
	private Class355 aClass355_2;

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
	private int anInt1402;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "Lclient!vca;")
	private Class343 aClass343_1;

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "Lclient!wba;")
	private Class355 aClass355_3;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "Lclient!cw;")
	private Class46_Sub2 aClass46_Sub2_1;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!cs", name = "M", descriptor = "Lclient!wba;")
	private Class355 aClass355_4;

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "Lclient!vca;")
	private Class343 aClass343_2;

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
	private int anInt1406;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!cs", name = "S", descriptor = "[Lclient!cw;")
	private Class46_Sub2[] aClass46_Sub2Array1;

	@OriginalMember(owner = "client!cs", name = "V", descriptor = "Lclient!cw;")
	private Class46_Sub2 aClass46_Sub2_2;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) Class78_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!cw;IILclient!cw;)V")
	@Override
	public void method1212(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(266) long local266;
		if (this.aClass46_Sub2Array1 == null) {
			super.aClass78_Sub3_4.method4535(arg2);
			super.aClass78_Sub3_4.method4529(this.aClass343_2);
			this.aClass343_2.method7464(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local266 = this.aClass355_2.aLong264;
			OpenGL.glUseProgramObjectARB(local266);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "params"), Static380.aFloat181, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1407, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1407, (float) this.anInt1402);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1402);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass78_Sub3_4.method4529(this.aClass343_1);
			@Pc(34) int local34 = Static505.method7085(this.anInt1407);
			@Pc(39) int local39 = Static505.method7085(this.anInt1402);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				OpenGL.glViewport(0, 0, local34, local39);
				this.aClass343_1.method7472(this.aClass46_Sub2Array1[local41], 0);
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local41 == 0) {
					super.aClass78_Sub3_4.method4535(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1407, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1407, (float) this.anInt1402);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1402);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass78_Sub3_4.method4535(this.aClass46_Sub2Array1[local41 - 1]);
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
				local41++;
			}
			super.aClass78_Sub3_4.method4495(this.aClass343_1);
			super.aClass78_Sub3_4.method4535(this.aClass46_Sub2Array1[local41 - 1]);
			super.aClass78_Sub3_4.method4529(this.aClass343_2);
			this.aClass343_2.method7464(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(198) long local198 = this.aClass355_4.aLong264;
			OpenGL.glUseProgramObjectARB(local198);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static380.aFloat181, 0.0F, 0.0F);
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
		this.aClass343_2.method7464(1);
		super.aClass78_Sub3_4.method4535(this.aClass46_Sub2_2);
		local266 = this.aClass355_1.aLong264;
		OpenGL.glUseProgramObjectARB(local266);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass343_2.method7464(0);
		super.aClass78_Sub3_4.method4535(this.aClass46_Sub2_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass78_Sub3_4.method4495(this.aClass343_2);
		@Pc(430) long local430 = this.aClass355_3.aLong264;
		OpenGL.glUseProgramObjectARB(local430);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local430, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local430, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local430, "params"), Static471.aFloat202, Static42.aFloat12, 0.0F);
		super.aClass78_Sub3_4.method4549(1);
		super.aClass78_Sub3_4.method4535(this.aClass46_Sub2_2);
		super.aClass78_Sub3_4.method4549(0);
		super.aClass78_Sub3_4.method4535(arg2);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	@Override
	public void method1219(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass78_Sub3_4.method4549(1);
		super.aClass78_Sub3_4.method4535(null);
		super.aClass78_Sub3_4.method4549(0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	@Override
	public void method1203() {
		this.aClass343_2 = null;
		this.aClass355_3 = null;
		this.aClass46_Sub2_2 = null;
		this.aClass46_Sub2Array1 = null;
		this.aClass355_2 = null;
		this.aClass355_1 = null;
		this.aClass343_1 = null;
		this.aClass46_Sub2_1 = null;
		this.aClass355_4 = null;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
	@Override
	public int method1211() {
		return 1;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method1207() {
		if (!super.aClass78_Sub3_4.aBoolean428 || !super.aClass78_Sub3_4.aBoolean418 || !super.aClass78_Sub3_4.aBoolean431) {
			return false;
		}
		this.aClass343_2 = new Class343(super.aClass78_Sub3_4);
		this.aClass46_Sub2_2 = new Class46_Sub2(super.aClass78_Sub3_4, 3553, 34842, 256, 256);
		this.aClass46_Sub2_2.method5150(false, false);
		this.aClass46_Sub2_1 = new Class46_Sub2(super.aClass78_Sub3_4, 3553, 34842, 256, 256);
		this.aClass46_Sub2_1.method5150(false, false);
		super.aClass78_Sub3_4.method4529(this.aClass343_2);
		this.aClass343_2.method7472(this.aClass46_Sub2_2, 0);
		this.aClass343_2.method7472(this.aClass46_Sub2_1, 1);
		this.aClass343_2.method7464(0);
		if (!this.aClass343_2.method7469()) {
			super.aClass78_Sub3_4.method4495(this.aClass343_2);
			return false;
		}
		super.aClass78_Sub3_4.method4495(this.aClass343_2);
		this.aClass355_2 = Static211.method3208(super.aClass78_Sub3_4, new Class230[] { Static226.method3357(super.aClass78_Sub3_4, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass355_4 = Static211.method3208(super.aClass78_Sub3_4, new Class230[] { Static226.method3357(super.aClass78_Sub3_4, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass355_3 = Static211.method3208(super.aClass78_Sub3_4, new Class230[] { Static226.method3357(super.aClass78_Sub3_4, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass355_1 = Static211.method3208(super.aClass78_Sub3_4, new Class230[] { Static226.method3357(super.aClass78_Sub3_4, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass355_4 != null && this.aClass355_2 != null && this.aClass355_3 != null && this.aClass355_1 != null;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	@Override
	public void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1402 = arg0;
		this.anInt1407 = arg1;
		@Pc(20) int local20 = Static505.method7085(this.anInt1407);
		@Pc(25) int local25 = Static505.method7085(this.anInt1402);
		if (this.anInt1406 == local20 && this.anInt1405 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass46_Sub2Array1 != null) {
			for (local42 = 0; local42 < this.aClass46_Sub2Array1.length; local42++) {
				this.aClass46_Sub2Array1[local42].method5139();
			}
			this.aClass46_Sub2Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass343_1 = null;
		} else {
			local42 = local20;
			@Pc(69) int local69 = local25;
			@Pc(71) int local71 = 0;
			label59: while (true) {
				if (local42 <= 256 && local69 <= 256) {
					if (this.aClass343_1 == null) {
						this.aClass343_1 = new Class343(super.aClass78_Sub3_4);
					}
					local42 = local20;
					local69 = local25;
					this.aClass46_Sub2Array1 = new Class46_Sub2[local71];
					local71 = 0;
					while (true) {
						if (local42 <= 256 && local69 <= 256) {
							break label59;
						}
						this.aClass46_Sub2Array1[local71++] = new Class46_Sub2(super.aClass78_Sub3_4, 3553, 34842, local42, local69);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local69 > 256) {
							local69 >>= 0x1;
						}
					}
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				if (local69 > 256) {
					local69 >>= 0x1;
				}
				local71++;
			}
		}
		this.anInt1405 = local25;
		this.anInt1406 = local20;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1216() {
		return this.aClass343_2 != null;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Z")
	public boolean method1222() {
		return super.aClass78_Sub3_4.aBoolean428 && super.aClass78_Sub3_4.aBoolean418 && super.aClass78_Sub3_4.aBoolean431;
	}
}
