import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!sh;")
	private Class305 aClass305_2;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	private int anInt2891;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "Lclient!sh;")
	private Class305 aClass305_3;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "Lclient!ds;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "[Lclient!co;")
	private Class51_Sub1[] aClass51_Sub1Array3;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Lclient!sh;")
	private Class305 aClass305_4;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "Lclient!ds;")
	private Class74 aClass74_2;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "Lclient!co;")
	private Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
	private int anInt2898;

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
	private int anInt2899;

	@OriginalMember(owner = "client!eu", name = "K", descriptor = "Lclient!sh;")
	private Class305 aClass305_5;

	@OriginalMember(owner = "client!eu", name = "L", descriptor = "Lclient!co;")
	private Class51_Sub1 aClass51_Sub1_2;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class6_Sub6_Sub1(@OriginalArg(0) Class14_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "(I)Z")
	public boolean method2540() {
		return super.aClass14_Sub3_14.aBoolean302 && super.aClass14_Sub3_14.aBoolean320 && super.aClass14_Sub3_14.aBoolean314;
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)V")
	@Override
	public void method2538() {
		this.aClass51_Sub1_1 = null;
		this.aClass305_3 = null;
		this.aClass74_1 = null;
		this.aClass74_2 = null;
		this.aClass305_4 = null;
		this.aClass51_Sub1_2 = null;
		this.aClass305_5 = null;
		this.aClass51_Sub1Array3 = null;
		this.aClass305_2 = null;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
	@Override
	public void method2535(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass14_Sub3_14.method3917(1);
		super.aClass14_Sub3_14.method3985(null);
		super.aClass14_Sub3_14.method3917(0);
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method2536() {
		return this.aClass74_2 != null;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZLclient!co;ILclient!co;)V")
	@Override
	public void method2533(@OriginalArg(1) Class51_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass51_Sub1Array3 == null) {
			super.aClass14_Sub3_14.method3985(arg2);
			super.aClass14_Sub3_14.method3910(this.aClass74_2);
			this.aClass74_2.method1767(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass305_5.aLong218;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static449.aFloat163, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2899, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2899, (float) this.anInt2891);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2891);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass14_Sub3_14.method3910(this.aClass74_1);
			@Pc(108) int local108 = Static505.method6819(this.anInt2899);
			@Pc(113) int local113 = Static505.method6819(this.anInt2891);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass74_1.method1769(0, this.aClass51_Sub1Array3[local115]);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass14_Sub3_14.method3985(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2899, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2899, (float) this.anInt2891);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2891);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass14_Sub3_14.method3985(this.aClass51_Sub1Array3[local115 - 1]);
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
			super.aClass14_Sub3_14.method3955(this.aClass74_1);
			super.aClass14_Sub3_14.method3985(this.aClass51_Sub1Array3[local115 - 1]);
			super.aClass14_Sub3_14.method3910(this.aClass74_2);
			this.aClass74_2.method1767(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(278) long local278 = this.aClass305_2.aLong218;
			OpenGL.glUseProgramObjectARB(local278);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local278, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local278, "params"), Static449.aFloat163, 0.0F, 0.0F);
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
		this.aClass74_2.method1767(1);
		super.aClass14_Sub3_14.method3985(this.aClass51_Sub1_2);
		local46 = this.aClass305_3.aLong218;
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
		this.aClass74_2.method1767(0);
		super.aClass14_Sub3_14.method3985(this.aClass51_Sub1_1);
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
		super.aClass14_Sub3_14.method3955(this.aClass74_2);
		@Pc(438) long local438 = this.aClass305_4.aLong218;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static268.aFloat164, Static425.aFloat159, 0.0F);
		super.aClass14_Sub3_14.method3917(1);
		super.aClass14_Sub3_14.method3985(this.aClass51_Sub1_2);
		super.aClass14_Sub3_14.method3917(0);
		super.aClass14_Sub3_14.method3985(arg2);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
	@Override
	public void method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2899 = arg0;
		this.anInt2891 = arg1;
		@Pc(16) int local16 = Static505.method6819(this.anInt2899);
		@Pc(21) int local21 = Static505.method6819(this.anInt2891);
		if (this.anInt2898 == local16 && local21 == this.anInt2888) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass51_Sub1Array3 != null) {
			for (local40 = 0; local40 < this.aClass51_Sub1Array3.length; local40++) {
				this.aClass51_Sub1Array3[local40].method7730();
			}
			this.aClass51_Sub1Array3 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass74_1 = null;
		} else {
			local40 = local16;
			@Pc(76) int local76 = local21;
			@Pc(78) int local78 = 0;
			label56: while (true) {
				if (local40 <= 256 && local76 <= 256) {
					if (this.aClass74_1 == null) {
						this.aClass74_1 = new Class74(super.aClass14_Sub3_14);
					}
					local76 = local21;
					local40 = local16;
					this.aClass51_Sub1Array3 = new Class51_Sub1[local78];
					local78 = 0;
					while (true) {
						if (local40 <= 256 && local76 <= 256) {
							break label56;
						}
						this.aClass51_Sub1Array3[local78++] = new Class51_Sub1(super.aClass14_Sub3_14, 3553, 34842, local40, local76);
						if (local40 > 256) {
							local40 >>= 0x1;
						}
						if (local76 > 256) {
							local76 >>= 0x1;
						}
					}
				}
				local78++;
				if (local76 > 256) {
					local76 >>= 0x1;
				}
				if (local40 > 256) {
					local40 >>= 0x1;
				}
			}
		}
		this.anInt2888 = local21;
		this.anInt2898 = local16;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)I")
	@Override
	public int method2529() {
		return 1;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2531() {
		if (!super.aClass14_Sub3_14.aBoolean302 || !super.aClass14_Sub3_14.aBoolean320 || !super.aClass14_Sub3_14.aBoolean314) {
			return false;
		}
		this.aClass74_2 = new Class74(super.aClass14_Sub3_14);
		this.aClass51_Sub1_2 = new Class51_Sub1(super.aClass14_Sub3_14, 3553, 34842, 256, 256);
		this.aClass51_Sub1_2.method3535(false, false);
		this.aClass51_Sub1_1 = new Class51_Sub1(super.aClass14_Sub3_14, 3553, 34842, 256, 256);
		this.aClass51_Sub1_1.method3535(false, false);
		super.aClass14_Sub3_14.method3910(this.aClass74_2);
		this.aClass74_2.method1769(0, this.aClass51_Sub1_2);
		this.aClass74_2.method1769(1, this.aClass51_Sub1_1);
		this.aClass74_2.method1767(0);
		if (!this.aClass74_2.method1766()) {
			super.aClass14_Sub3_14.method3955(this.aClass74_2);
			return false;
		}
		super.aClass14_Sub3_14.method3955(this.aClass74_2);
		this.aClass305_5 = Static154.method2915(new Class137[] { Static482.method6640("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass14_Sub3_14, 35632) }, super.aClass14_Sub3_14);
		this.aClass305_2 = Static154.method2915(new Class137[] { Static482.method6640("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass14_Sub3_14, 35632) }, super.aClass14_Sub3_14);
		this.aClass305_4 = Static154.method2915(new Class137[] { Static482.method6640("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass14_Sub3_14, 35632) }, super.aClass14_Sub3_14);
		this.aClass305_3 = Static154.method2915(new Class137[] { Static482.method6640("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass14_Sub3_14, 35632) }, super.aClass14_Sub3_14);
		return this.aClass305_2 != null && this.aClass305_5 != null && this.aClass305_4 != null && this.aClass305_3 != null;
	}
}
