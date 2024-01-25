import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class6_Sub21_Sub1 extends Class6_Sub21 {

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "[Lclient!sg;")
	private Class40_Sub3[] aClass40_Sub3Array1;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Lclient!sj;")
	private Class230 aClass230_3;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
	private int anInt3863;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
	private int anInt3865;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "Lclient!sj;")
	private Class230 aClass230_4;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
	private int anInt3868;

	@OriginalMember(owner = "client!lk", name = "H", descriptor = "Lclient!sg;")
	private Class40_Sub3 aClass40_Sub3_5;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "Lclient!sg;")
	private Class40_Sub3 aClass40_Sub3_6;

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "Lclient!sj;")
	private Class230 aClass230_5;

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "Lclient!mg;")
	private Class166 aClass166_3;

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "Lclient!sj;")
	private Class230 aClass230_6;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
	private int anInt3873;

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "Lclient!mg;")
	private Class166 aClass166_4;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class6_Sub21_Sub1(@OriginalArg(0) Class28_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)Z")
	public boolean method3455() {
		return super.aClass28_Sub1_25.aBoolean60 && super.aClass28_Sub1_25.aBoolean44 && super.aClass28_Sub1_25.aBoolean64;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!sg;ILclient!sg;)V")
	@Override
	public void method3442(@OriginalArg(1) Class40_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(272) long local272;
		if (this.aClass40_Sub3Array1 == null) {
			super.aClass28_Sub1_25.method654(arg0);
			super.aClass28_Sub1_25.method680(this.aClass166_3);
			this.aClass166_3.method3754(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local272 = this.aClass230_5.aLong180;
			OpenGL.glUseProgramObjectARB(local272);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local272, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local272, "params"), Static171.aFloat40, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3873, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3873, (float) this.anInt3863);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3863);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass28_Sub1_25.method680(this.aClass166_4);
			@Pc(34) int local34 = Static191.method2948(this.anInt3873);
			@Pc(39) int local39 = Static191.method2948(this.anInt3863);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				OpenGL.glViewport(0, 0, local34, local39);
				this.aClass166_4.method3761(0, this.aClass40_Sub3Array1[local41]);
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local41 == 0) {
					super.aClass28_Sub1_25.method654(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3873, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3873, (float) this.anInt3863);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3863);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass28_Sub1_25.method654(this.aClass40_Sub3Array1[local41 - 1]);
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
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				local41++;
			}
			super.aClass28_Sub1_25.method659(this.aClass166_4);
			super.aClass28_Sub1_25.method654(this.aClass40_Sub3Array1[local41 - 1]);
			super.aClass28_Sub1_25.method680(this.aClass166_3);
			this.aClass166_3.method3754(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(204) long local204 = this.aClass230_6.aLong180;
			OpenGL.glUseProgramObjectARB(local204);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local204, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local204, "params"), Static171.aFloat40, 0.0F, 0.0F);
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
		this.aClass166_3.method3754(1);
		super.aClass28_Sub1_25.method654(this.aClass40_Sub3_5);
		local272 = this.aClass230_3.aLong180;
		OpenGL.glUseProgramObjectARB(local272);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local272, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local272, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass166_3.method3754(0);
		super.aClass28_Sub1_25.method654(this.aClass40_Sub3_6);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local272, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass28_Sub1_25.method659(this.aClass166_3);
		@Pc(444) long local444 = this.aClass230_4.aLong180;
		OpenGL.glUseProgramObjectARB(local444);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local444, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local444, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local444, "params"), Static191.aFloat60, Static387.aFloat98, 0.0F);
		super.aClass28_Sub1_25.method650(1);
		super.aClass28_Sub1_25.method654(this.aClass40_Sub3_5);
		super.aClass28_Sub1_25.method650(0);
		super.aClass28_Sub1_25.method654(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method3452() {
		return this.aClass166_3 != null;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V")
	@Override
	public void method3453(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass28_Sub1_25.method650(1);
		super.aClass28_Sub1_25.method654(null);
		super.aClass28_Sub1_25.method650(0);
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	@Override
	public void method3444() {
		this.aClass230_6 = null;
		this.aClass230_3 = null;
		this.aClass40_Sub3_5 = null;
		this.aClass230_5 = null;
		this.aClass230_4 = null;
		this.aClass40_Sub3Array1 = null;
		this.aClass40_Sub3_6 = null;
		this.aClass166_4 = null;
		this.aClass166_3 = null;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
	@Override
	public void method3450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3863 = arg1;
		this.anInt3873 = arg0;
		@Pc(22) int local22 = Static191.method2948(this.anInt3873);
		@Pc(27) int local27 = Static191.method2948(this.anInt3863);
		if (local22 == this.anInt3868 && this.anInt3865 == local27) {
			return;
		}
		@Pc(44) int local44;
		if (this.aClass40_Sub3Array1 != null) {
			for (local44 = 0; local44 < this.aClass40_Sub3Array1.length; local44++) {
				this.aClass40_Sub3Array1[local44].method5154();
			}
			this.aClass40_Sub3Array1 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass166_4 = null;
		} else {
			local44 = local22;
			@Pc(71) int local71 = local27;
			@Pc(73) int local73 = 0;
			label59: while (true) {
				if (local44 <= 256 && local71 <= 256) {
					if (this.aClass166_4 == null) {
						this.aClass166_4 = new Class166(super.aClass28_Sub1_25);
					}
					this.aClass40_Sub3Array1 = new Class40_Sub3[local73];
					local71 = local27;
					local44 = local22;
					local73 = 0;
					while (true) {
						if (local44 <= 256 && local71 <= 256) {
							break label59;
						}
						this.aClass40_Sub3Array1[local73++] = new Class40_Sub3(super.aClass28_Sub1_25, 3553, 34842, local44, local71);
						if (local44 > 256) {
							local44 >>= 0x1;
						}
						if (local71 > 256) {
							local71 >>= 0x1;
						}
					}
				}
				if (local44 > 256) {
					local44 >>= 0x1;
				}
				if (local71 > 256) {
					local71 >>= 0x1;
				}
				local73++;
			}
		}
		this.anInt3868 = local22;
		this.anInt3865 = local27;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3451() {
		if (!super.aClass28_Sub1_25.aBoolean60 || !super.aClass28_Sub1_25.aBoolean44 || !super.aClass28_Sub1_25.aBoolean64) {
			return false;
		}
		this.aClass166_3 = new Class166(super.aClass28_Sub1_25);
		this.aClass40_Sub3_5 = new Class40_Sub3(super.aClass28_Sub1_25, 3553, 34842, 256, 256);
		this.aClass40_Sub3_5.method3021(false, false);
		this.aClass40_Sub3_6 = new Class40_Sub3(super.aClass28_Sub1_25, 3553, 34842, 256, 256);
		this.aClass40_Sub3_6.method3021(false, false);
		super.aClass28_Sub1_25.method680(this.aClass166_3);
		this.aClass166_3.method3761(0, this.aClass40_Sub3_5);
		this.aClass166_3.method3761(1, this.aClass40_Sub3_6);
		this.aClass166_3.method3754(0);
		if (!this.aClass166_3.method3758()) {
			super.aClass28_Sub1_25.method659(this.aClass166_3);
			return false;
		}
		super.aClass28_Sub1_25.method659(this.aClass166_3);
		this.aClass230_5 = Static313.method4477(super.aClass28_Sub1_25, new Class243[] { Static239.method3725(35632, super.aClass28_Sub1_25, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass230_6 = Static313.method4477(super.aClass28_Sub1_25, new Class243[] { Static239.method3725(35632, super.aClass28_Sub1_25, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass230_4 = Static313.method4477(super.aClass28_Sub1_25, new Class243[] { Static239.method3725(35632, super.aClass28_Sub1_25, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass230_3 = Static313.method4477(super.aClass28_Sub1_25, new Class243[] { Static239.method3725(35632, super.aClass28_Sub1_25, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass230_6 != null && this.aClass230_5 != null && this.aClass230_4 != null && this.aClass230_3 != null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	@Override
	public int method3443() {
		return 1;
	}
}
