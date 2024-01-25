import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class6_Sub14_Sub1 extends Class6_Sub14 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!lb;")
	private Class28_Sub3 aClass28_Sub3_5;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!ie;")
	private Class100 aClass100_1;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	private int anInt1867;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!ie;")
	private Class100 aClass100_2;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!ie;")
	private Class100 aClass100_3;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!ie;")
	private Class100 aClass100_4;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "Lclient!jd;")
	private Class105 aClass105_3;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Lclient!lb;")
	private Class28_Sub3 aClass28_Sub3_6;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "[Lclient!lb;")
	private Class28_Sub3[] aClass28_Sub3Array2;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "Lclient!jd;")
	private Class105 aClass105_4;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class6_Sub14_Sub1(@OriginalArg(0) Class81_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
	@Override
	public void method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1867 = arg0;
		this.anInt1868 = arg1;
		@Pc(10) int local10 = Static62.method1001(this.anInt1867);
		@Pc(15) int local15 = Static62.method1001(this.anInt1868);
		if (this.anInt1869 == local10 && this.anInt1870 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass28_Sub3Array2 != null) {
			for (local28 = 0; local28 < this.aClass28_Sub3Array2.length; local28++) {
				this.aClass28_Sub3Array2[local28].method4117();
			}
			this.aClass28_Sub3Array2 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass105_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass105_4 == null) {
						this.aClass105_4 = new Class105(this.aClass81_Sub1_19);
					}
					this.aClass28_Sub3Array2 = new Class28_Sub3[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass28_Sub3Array2[local55++] = new Class28_Sub3(this.aClass81_Sub1_19, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt1869 = local10;
		this.anInt1870 = local15;
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "()Z")
	public boolean method2060() {
		return this.aClass81_Sub1_19.aBoolean132 && this.aClass81_Sub1_19.aBoolean135 && this.aClass81_Sub1_19.aBoolean141;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()Z")
	@Override
	public boolean method2050() {
		return this.aClass105_3 != null;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()Z")
	@Override
	public boolean method2053() {
		if (!this.aClass81_Sub1_19.aBoolean132 || !this.aClass81_Sub1_19.aBoolean135 || !this.aClass81_Sub1_19.aBoolean141) {
			return false;
		}
		this.aClass105_3 = new Class105(this.aClass81_Sub1_19);
		this.aClass28_Sub3_5 = new Class28_Sub3(this.aClass81_Sub1_19, 3553, 34842, 256, 256);
		this.aClass28_Sub3_5.method1257(false, false);
		this.aClass28_Sub3_6 = new Class28_Sub3(this.aClass81_Sub1_19, 3553, 34842, 256, 256);
		this.aClass28_Sub3_6.method1257(false, false);
		this.aClass81_Sub1_19.method1997(this.aClass105_3);
		this.aClass105_3.method2752(0, this.aClass28_Sub3_5);
		this.aClass105_3.method2752(1, this.aClass28_Sub3_6);
		this.aClass105_3.method2749(0);
		if (!this.aClass105_3.method2750()) {
			this.aClass81_Sub1_19.method1964(this.aClass105_3);
			return false;
		}
		this.aClass81_Sub1_19.method1964(this.aClass105_3);
		this.aClass100_3 = Static130.method2534(this.aClass81_Sub1_19, new Class89[] { Static112.method2264(this.aClass81_Sub1_19, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_1 = Static130.method2534(this.aClass81_Sub1_19, new Class89[] { Static112.method2264(this.aClass81_Sub1_19, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_4 = Static130.method2534(this.aClass81_Sub1_19, new Class89[] { Static112.method2264(this.aClass81_Sub1_19, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass100_2 = Static130.method2534(this.aClass81_Sub1_19, new Class89[] { Static112.method2264(this.aClass81_Sub1_19, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_1 != null && this.aClass100_3 != null && this.aClass100_4 != null && this.aClass100_2 != null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!lb;Lclient!lb;)V")
	@Override
	public void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub3 arg1, @OriginalArg(2) Class28_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_19.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass28_Sub3Array2 == null) {
			this.aClass81_Sub1_19.method2022(arg1);
			this.aClass81_Sub1_19.method1997(this.aClass105_3);
			this.aClass105_3.method2749(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass100_3.anInt2385;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static100.aFloat55, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt1867, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt1867, (float) this.anInt1868);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt1868);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass81_Sub1_19.method1997(this.aClass105_4);
			local34 = Static62.method1001(this.anInt1867);
			local39 = Static62.method1001(this.anInt1868);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass105_4.method2752(0, this.aClass28_Sub3Array2[local41]);
				if (local41 == 0) {
					this.aClass81_Sub1_19.method2022(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt1867, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt1867, (float) this.anInt1868);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt1868);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass81_Sub1_19.method2022(this.aClass28_Sub3Array2[local41 - 1]);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass81_Sub1_19.method1964(this.aClass105_4);
			this.aClass81_Sub1_19.method2022(this.aClass28_Sub3Array2[local41 - 1]);
			this.aClass81_Sub1_19.method1997(this.aClass105_3);
			this.aClass105_3.method2749(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass100_1.anInt2385;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static100.aFloat55, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass105_3.method2749(1);
		this.aClass81_Sub1_19.method2022(this.aClass28_Sub3_5);
		local34 = this.aClass100_2.anInt2385;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass105_3.method2749(0);
		this.aClass81_Sub1_19.method2022(this.aClass28_Sub3_6);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		this.aClass81_Sub1_19.method1964(this.aClass105_3);
		local39 = this.aClass100_4.anInt2385;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static100.aFloat57, Static100.aFloat56, 0.0F);
		this.aClass81_Sub1_19.method1953(1);
		this.aClass81_Sub1_19.method2022(this.aClass28_Sub3_5);
		this.aClass81_Sub1_19.method1953(0);
		this.aClass81_Sub1_19.method2022(arg1);
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
	@Override
	public int method2057() {
		return 1;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
	@Override
	public void method2055() {
		this.aClass105_4 = null;
		this.aClass28_Sub3Array2 = null;
		this.aClass105_3 = null;
		this.aClass28_Sub3_5 = null;
		this.aClass28_Sub3_6 = null;
		this.aClass100_3 = null;
		this.aClass100_1 = null;
		this.aClass100_4 = null;
		this.aClass100_2 = null;
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	@Override
	public void method2054(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_19.anOpengl1.glUseProgramObjectARB(0);
		this.aClass81_Sub1_19.method1953(1);
		this.aClass81_Sub1_19.method2022(null);
		this.aClass81_Sub1_19.method1953(0);
	}
}
