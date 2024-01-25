import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!gha", name = "Q", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!gha", name = "I", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!gha", name = "z", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!gha", name = "x", descriptor = "[Lclient!fu;")
	private Class125_Sub1[] aClass125_Sub1Array3;

	@OriginalMember(owner = "client!gha", name = "w", descriptor = "Lclient!fp;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!gha", name = "O", descriptor = "Lclient!fp;")
	private Class122 aClass122_2;

	@OriginalMember(owner = "client!gha", name = "u", descriptor = "Lclient!cb;")
	private Class52 aClass52_3;

	@OriginalMember(owner = "client!gha", name = "H", descriptor = "Lclient!cb;")
	private Class52 aClass52_4;

	@OriginalMember(owner = "client!gha", name = "A", descriptor = "Lclient!fp;")
	private Class122 aClass122_3;

	@OriginalMember(owner = "client!gha", name = "E", descriptor = "Lclient!fu;")
	private Class125_Sub1 aClass125_Sub1_4;

	@OriginalMember(owner = "client!gha", name = "K", descriptor = "I")
	private int anInt3443;

	@OriginalMember(owner = "client!gha", name = "P", descriptor = "Lclient!fp;")
	private Class122 aClass122_4;

	@OriginalMember(owner = "client!gha", name = "C", descriptor = "Lclient!fu;")
	private Class125_Sub1 aClass125_Sub1_5;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) Class22_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)V")
	@Override
	public void method3135(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass22_Sub1_15.method931(1);
		super.aClass22_Sub1_15.method955((Class125) null);
		super.aClass22_Sub1_15.method931(0);
	}

	@OriginalMember(owner = "client!gha", name = "h", descriptor = "(I)V")
	@Override
	public void method3128() {
		this.aClass125_Sub1Array3 = null;
		this.aClass125_Sub1_5 = null;
		this.aClass122_2 = null;
		this.aClass125_Sub1_4 = null;
		this.aClass52_4 = null;
		this.aClass122_4 = null;
		this.aClass122_1 = null;
		this.aClass52_3 = null;
		this.aClass122_3 = null;
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3132() {
		return this.aClass52_3 != null;
	}

	@OriginalMember(owner = "client!gha", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3138() {
		if (!super.aClass22_Sub1_15.aBoolean66 || !super.aClass22_Sub1_15.aBoolean73 || !super.aClass22_Sub1_15.aBoolean77) {
			return false;
		}
		this.aClass52_3 = new Class52(super.aClass22_Sub1_15);
		this.aClass125_Sub1_5 = new Class125_Sub1(super.aClass22_Sub1_15, 3553, 34842, 256, 256);
		this.aClass125_Sub1_5.method9224(false, false);
		this.aClass125_Sub1_4 = new Class125_Sub1(super.aClass22_Sub1_15, 3553, 34842, 256, 256);
		this.aClass125_Sub1_4.method9224(false, false);
		super.aClass22_Sub1_15.method959(this.aClass52_3);
		this.aClass52_3.method1509(0, this.aClass125_Sub1_5);
		this.aClass52_3.method1509(1, this.aClass125_Sub1_4);
		this.aClass52_3.method1518(0);
		if (!this.aClass52_3.method1510()) {
			super.aClass22_Sub1_15.method923(this.aClass52_3);
			return false;
		}
		super.aClass22_Sub1_15.method923(this.aClass52_3);
		this.aClass122_4 = Static88.method1894(new Class328[] { Static77.method1637("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass22_Sub1_15, 35632) }, super.aClass22_Sub1_15);
		this.aClass122_2 = Static88.method1894(new Class328[] { Static77.method1637("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass22_Sub1_15, 35632) }, super.aClass22_Sub1_15);
		this.aClass122_3 = Static88.method1894(new Class328[] { Static77.method1637("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass22_Sub1_15, 35632) }, super.aClass22_Sub1_15);
		this.aClass122_1 = Static88.method1894(new Class328[] { Static77.method1637("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass22_Sub1_15, 35632) }, super.aClass22_Sub1_15);
		return this.aClass122_2 != null && this.aClass122_4 != null && this.aClass122_3 != null && this.aClass122_1 != null;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)Z")
	public boolean method3141() {
		return super.aClass22_Sub1_15.aBoolean66 && super.aClass22_Sub1_15.aBoolean73 && super.aClass22_Sub1_15.aBoolean77;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
	@Override
	public void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3443 = arg0;
		this.anInt3433 = arg1;
		@Pc(25) int local25 = Static70.method3137(this.anInt3433);
		@Pc(30) int local30 = Static70.method3137(this.anInt3443);
		if (this.anInt3434 == local25 && this.anInt3435 == local30) {
			return;
		}
		@Pc(51) int local51;
		if (this.aClass125_Sub1Array3 != null) {
			for (local51 = 0; local51 < this.aClass125_Sub1Array3.length; local51++) {
				this.aClass125_Sub1Array3[local51].method9209();
			}
			this.aClass125_Sub1Array3 = null;
		}
		if (local25 <= 256 && local30 <= 256) {
			this.aClass52_4 = null;
		} else {
			local51 = local25;
			@Pc(97) int local97 = local30;
			@Pc(99) int local99 = 0;
			label56: while (true) {
				if (local51 <= 256 && local97 <= 256) {
					if (this.aClass52_4 == null) {
						this.aClass52_4 = new Class52(super.aClass22_Sub1_15);
					}
					this.aClass125_Sub1Array3 = new Class125_Sub1[local99];
					local51 = local25;
					local97 = local30;
					local99 = 0;
					while (true) {
						if (local51 <= 256 && local97 <= 256) {
							break label56;
						}
						this.aClass125_Sub1Array3[local99++] = new Class125_Sub1(super.aClass22_Sub1_15, 3553, 34842, local51, local97);
						if (local51 > 256) {
							local51 >>= 0x1;
						}
						if (local97 > 256) {
							local97 >>= 0x1;
						}
					}
				}
				if (local51 > 256) {
					local51 >>= 0x1;
				}
				local99++;
				if (local97 > 256) {
					local97 >>= 0x1;
				}
			}
		}
		this.anInt3435 = local30;
		this.anInt3434 = local25;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILclient!fu;ILclient!fu;)V")
	@Override
	public void method3133(@OriginalArg(1) Class125_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class125_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(281) long local281;
		if (this.aClass125_Sub1Array3 == null) {
			super.aClass22_Sub1_15.method955(arg2);
			super.aClass22_Sub1_15.method959(this.aClass52_3);
			this.aClass52_3.method1518(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local281 = this.aClass122_4.aLong126;
			OpenGL.glUseProgramObjectARB(local281);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local281, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "params"), Static461.aFloat121, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3433, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3433, (float) this.anInt3443);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3443);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass22_Sub1_15.method959(this.aClass52_4);
			@Pc(32) int local32 = Static70.method3137(this.anInt3433);
			@Pc(37) int local37 = Static70.method3137(this.anInt3443);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass52_4.method1509(0, this.aClass125_Sub1Array3[local39]);
				if (local39 == 0) {
					super.aClass22_Sub1_15.method955(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3433, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3433, (float) this.anInt3443);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3443);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass22_Sub1_15.method955(this.aClass125_Sub1Array3[local39 - 1]);
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
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass22_Sub1_15.method923(this.aClass52_4);
			super.aClass22_Sub1_15.method955(this.aClass125_Sub1Array3[local39 - 1]);
			super.aClass22_Sub1_15.method959(this.aClass52_3);
			this.aClass52_3.method1518(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(207) long local207 = this.aClass122_2.aLong126;
			OpenGL.glUseProgramObjectARB(local207);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local207, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local207, "params"), Static461.aFloat121, 0.0F, 0.0F);
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
		this.aClass52_3.method1518(1);
		super.aClass22_Sub1_15.method955(this.aClass125_Sub1_5);
		local281 = this.aClass122_1.aLong126;
		OpenGL.glUseProgramObjectARB(local281);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local281, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass52_3.method1518(0);
		super.aClass22_Sub1_15.method955(this.aClass125_Sub1_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass22_Sub1_15.method923(this.aClass52_3);
		@Pc(459) long local459 = this.aClass122_3.aLong126;
		OpenGL.glUseProgramObjectARB(local459);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local459, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local459, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local459, "params"), Static234.aFloat61, Static107.aFloat131, 0.0F);
		super.aClass22_Sub1_15.method931(1);
		super.aClass22_Sub1_15.method955(this.aClass125_Sub1_5);
		super.aClass22_Sub1_15.method931(0);
		super.aClass22_Sub1_15.method955(arg2);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)I")
	@Override
	public int method3131() {
		return 1;
	}
}
