import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!mv;")
	private Class177 aClass177_1;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lclient!sa;")
	private Class64_Sub4[] aClass64_Sub4Array1;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!mv;")
	private Class177 aClass177_2;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!sa;")
	private Class64_Sub4 aClass64_Sub4_1;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "Lclient!sa;")
	private Class64_Sub4 aClass64_Sub4_2;

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "Lclient!dg;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "Lclient!mv;")
	private Class177 aClass177_3;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "Lclient!mv;")
	private Class177 aClass177_4;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "Lclient!dg;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt712 = arg0;
		this.anInt710 = arg1;
		@Pc(20) int local20 = Static14.method326(this.anInt712);
		@Pc(25) int local25 = Static14.method326(this.anInt710);
		if (local20 == this.anInt711 && local25 == this.anInt708) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass64_Sub4Array1 != null) {
			for (local42 = 0; local42 < this.aClass64_Sub4Array1.length; local42++) {
				this.aClass64_Sub4Array1[local42].method3518();
			}
			this.aClass64_Sub4Array1 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass51_2 = null;
		} else {
			local42 = local20;
			@Pc(71) int local71 = local25;
			@Pc(73) int local73 = 0;
			if (this.aClass51_2 == null) {
				this.aClass51_2 = new Class51(super.aClass75_Sub2_3);
			}
			label55: while (true) {
				if (local42 <= 256 && local71 <= 256) {
					local42 = local20;
					this.aClass64_Sub4Array1 = new Class64_Sub4[local73];
					local71 = local25;
					local73 = 0;
					while (true) {
						if (local42 <= 256 && local71 <= 256) {
							break label55;
						}
						this.aClass64_Sub4Array1[local73++] = new Class64_Sub4(super.aClass75_Sub2_3, 3553, 34842, local42, local71);
						if (local71 > 256) {
							local71 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				local73++;
				if (local71 > 256) {
					local71 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt708 = local25;
		this.anInt711 = local20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method689() {
		return this.aClass51_1 != null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
	@Override
	public void method696(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass75_Sub2_3.method3811(1);
		super.aClass75_Sub2_3.method3844(null);
		super.aClass75_Sub2_3.method3811(0);
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
	public boolean method698() {
		return super.aClass75_Sub2_3.aBoolean339 && super.aClass75_Sub2_3.aBoolean344 && super.aClass75_Sub2_3.aBoolean351;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	@Override
	public void method683() {
		this.aClass64_Sub4_2 = null;
		this.aClass177_1 = null;
		this.aClass177_2 = null;
		this.aClass51_1 = null;
		this.aClass177_3 = null;
		this.aClass177_4 = null;
		this.aClass64_Sub4Array1 = null;
		this.aClass51_2 = null;
		this.aClass64_Sub4_1 = null;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method691() {
		if (!super.aClass75_Sub2_3.aBoolean339 || !super.aClass75_Sub2_3.aBoolean344 || !super.aClass75_Sub2_3.aBoolean351) {
			return false;
		}
		this.aClass51_1 = new Class51(super.aClass75_Sub2_3);
		this.aClass64_Sub4_2 = new Class64_Sub4(super.aClass75_Sub2_3, 3553, 34842, 256, 256);
		this.aClass64_Sub4_2.method3530(false, false);
		this.aClass64_Sub4_1 = new Class64_Sub4(super.aClass75_Sub2_3, 3553, 34842, 256, 256);
		this.aClass64_Sub4_1.method3530(false, false);
		super.aClass75_Sub2_3.method3826(this.aClass51_1);
		this.aClass51_1.method1080(this.aClass64_Sub4_2, 0);
		this.aClass51_1.method1080(this.aClass64_Sub4_1, 1);
		this.aClass51_1.method1078(0);
		if (!this.aClass51_1.method1089()) {
			super.aClass75_Sub2_3.method3807(this.aClass51_1);
			return false;
		}
		super.aClass75_Sub2_3.method3807(this.aClass51_1);
		this.aClass177_4 = Static148.method2249(super.aClass75_Sub2_3, new Class124[] { Static373.method5186(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass75_Sub2_3) });
		this.aClass177_3 = Static148.method2249(super.aClass75_Sub2_3, new Class124[] { Static373.method5186(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass75_Sub2_3) });
		this.aClass177_1 = Static148.method2249(super.aClass75_Sub2_3, new Class124[] { Static373.method5186(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass75_Sub2_3) });
		this.aClass177_2 = Static148.method2249(super.aClass75_Sub2_3, new Class124[] { Static373.method5186(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass75_Sub2_3) });
		return this.aClass177_3 != null && this.aClass177_4 != null && this.aClass177_1 != null && this.aClass177_2 != null;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)I")
	@Override
	public int method695() {
		return 1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!sa;ZLclient!sa;)V")
	@Override
	public void method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class64_Sub4 arg1, @OriginalArg(3) Class64_Sub4 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(273) long local273;
		if (this.aClass64_Sub4Array1 == null) {
			super.aClass75_Sub2_3.method3844(arg1);
			super.aClass75_Sub2_3.method3826(this.aClass51_1);
			this.aClass51_1.method1078(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local273 = this.aClass177_4.aLong221;
			OpenGL.glUseProgramObjectARB(local273);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local273, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local273, "params"), Static439.aFloat95, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt712, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt712, (float) this.anInt710);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt710);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass75_Sub2_3.method3826(this.aClass51_2);
			@Pc(39) int local39 = Static14.method326(this.anInt712);
			@Pc(44) int local44 = Static14.method326(this.anInt710);
			@Pc(46) int local46 = 0;
			while (local39 > 256 || local44 > 256) {
				OpenGL.glViewport(0, 0, local39, local44);
				this.aClass51_2.method1080(this.aClass64_Sub4Array1[local46], 0);
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local44 > 256) {
					local44 >>= 0x1;
				}
				if (local46 == 0) {
					super.aClass75_Sub2_3.method3844(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt712, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt712, (float) this.anInt710);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt710);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass75_Sub2_3.method3844(this.aClass64_Sub4Array1[local46 - 1]);
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
				local46++;
			}
			super.aClass75_Sub2_3.method3807(this.aClass51_2);
			super.aClass75_Sub2_3.method3844(this.aClass64_Sub4Array1[local46 - 1]);
			super.aClass75_Sub2_3.method3826(this.aClass51_1);
			this.aClass51_1.method1078(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(205) long local205 = this.aClass177_3.aLong221;
			OpenGL.glUseProgramObjectARB(local205);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local205, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local205, "params"), Static439.aFloat95, 0.0F, 0.0F);
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
		this.aClass51_1.method1078(1);
		super.aClass75_Sub2_3.method3844(this.aClass64_Sub4_2);
		local273 = this.aClass177_2.aLong221;
		OpenGL.glUseProgramObjectARB(local273);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local273, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local273, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass51_1.method1078(0);
		super.aClass75_Sub2_3.method3844(this.aClass64_Sub4_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local273, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass75_Sub2_3.method3807(this.aClass51_1);
		@Pc(437) long local437 = this.aClass177_1.aLong221;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static105.aFloat14, Static162.aFloat21, 0.0F);
		super.aClass75_Sub2_3.method3811(1);
		super.aClass75_Sub2_3.method3844(this.aClass64_Sub4_2);
		super.aClass75_Sub2_3.method3811(0);
		super.aClass75_Sub2_3.method3844(arg1);
	}
}
