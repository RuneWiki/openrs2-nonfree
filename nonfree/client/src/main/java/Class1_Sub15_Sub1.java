import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 {

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!ir;")
	private Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!ng;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!ng;")
	private Class144 aClass144_2;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!ir;")
	private Class44_Sub1 aClass44_Sub1_3;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!ej;")
	private Class57 aClass57_1;

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!ng;")
	private Class144 aClass144_3;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!ej;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	private int anInt1811;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "[Lclient!ir;")
	private Class44_Sub1[] aClass44_Sub1Array1;

	@OriginalMember(owner = "client!g", name = "z", descriptor = "Lclient!ng;")
	private Class144 aClass144_4;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	private int anInt1813;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) Class105_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "()Z")
	public boolean method1513() {
		return this.aClass105_Sub1_15.aBoolean326 && this.aClass105_Sub1_15.aBoolean334 && this.aClass105_Sub1_15.aBoolean327;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	@Override
	public void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1812 = arg0;
		this.anInt1811 = arg1;
		@Pc(10) int local10 = Static351.method3411(this.anInt1812);
		@Pc(15) int local15 = Static351.method3411(this.anInt1811);
		if (this.anInt1813 == local10 && this.anInt1810 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass44_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass44_Sub1Array1.length; local28++) {
				this.aClass44_Sub1Array1[local28].method5577();
			}
			this.aClass44_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass57_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass57_1 == null) {
						this.aClass57_1 = new Class57(this.aClass105_Sub1_15);
					}
					this.aClass44_Sub1Array1 = new Class44_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass44_Sub1Array1[local55++] = new Class44_Sub1(this.aClass105_Sub1_15, 3553, 34842, local28, local53);
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
		this.anInt1813 = local10;
		this.anInt1810 = local15;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()Z")
	@Override
	public boolean method1505() {
		if (!this.aClass105_Sub1_15.aBoolean326 || !this.aClass105_Sub1_15.aBoolean334 || !this.aClass105_Sub1_15.aBoolean327) {
			return false;
		}
		this.aClass57_2 = new Class57(this.aClass105_Sub1_15);
		this.aClass44_Sub1_2 = new Class44_Sub1(this.aClass105_Sub1_15, 3553, 34842, 256, 256);
		this.aClass44_Sub1_2.method1072(false, false);
		this.aClass44_Sub1_3 = new Class44_Sub1(this.aClass105_Sub1_15, 3553, 34842, 256, 256);
		this.aClass44_Sub1_3.method1072(false, false);
		this.aClass105_Sub1_15.method3614(this.aClass57_2);
		this.aClass57_2.method1241(0, this.aClass44_Sub1_2);
		this.aClass57_2.method1241(1, this.aClass44_Sub1_3);
		this.aClass57_2.method1236(0);
		if (!this.aClass57_2.method1235()) {
			this.aClass105_Sub1_15.method3629(this.aClass57_2);
			return false;
		}
		this.aClass105_Sub1_15.method3629(this.aClass57_2);
		this.aClass144_3 = Static199.method3638(this.aClass105_Sub1_15, new Class21[] { Static23.method399(this.aClass105_Sub1_15, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass144_1 = Static199.method3638(this.aClass105_Sub1_15, new Class21[] { Static23.method399(this.aClass105_Sub1_15, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass144_2 = Static199.method3638(this.aClass105_Sub1_15, new Class21[] { Static23.method399(this.aClass105_Sub1_15, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass144_4 = Static199.method3638(this.aClass105_Sub1_15, new Class21[] { Static23.method399(this.aClass105_Sub1_15, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass144_1 != null && this.aClass144_3 != null && this.aClass144_2 != null && this.aClass144_4 != null;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "()V")
	@Override
	public void method1507() {
		this.aClass57_1 = null;
		this.aClass44_Sub1Array1 = null;
		this.aClass57_2 = null;
		this.aClass44_Sub1_2 = null;
		this.aClass44_Sub1_3 = null;
		this.aClass144_3 = null;
		this.aClass144_1 = null;
		this.aClass144_2 = null;
		this.aClass144_4 = null;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	@Override
	public void method1508(@OriginalArg(0) int arg0) {
		this.aClass105_Sub1_15.anOpengl1.glUseProgramObjectARB(0);
		this.aClass105_Sub1_15.method3634(1);
		this.aClass105_Sub1_15.method3591(null);
		this.aClass105_Sub1_15.method3634(0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ir;Lclient!ir;)V")
	@Override
	public void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub1 arg1, @OriginalArg(2) Class44_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass105_Sub1_15.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass44_Sub1Array1 == null) {
			this.aClass105_Sub1_15.method3591(arg1);
			this.aClass105_Sub1_15.method3614(this.aClass57_2);
			this.aClass57_2.method1236(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass144_3.anInt4211;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static95.aFloat10, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt1812, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt1812, (float) this.anInt1811);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt1811);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass105_Sub1_15.method3614(this.aClass57_1);
			local34 = Static351.method3411(this.anInt1812);
			local39 = Static351.method3411(this.anInt1811);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass57_1.method1241(0, this.aClass44_Sub1Array1[local41]);
				if (local41 == 0) {
					this.aClass105_Sub1_15.method3591(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt1812, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt1812, (float) this.anInt1811);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt1811);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass105_Sub1_15.method3591(this.aClass44_Sub1Array1[local41 - 1]);
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
			this.aClass105_Sub1_15.method3629(this.aClass57_1);
			this.aClass105_Sub1_15.method3591(this.aClass44_Sub1Array1[local41 - 1]);
			this.aClass105_Sub1_15.method3614(this.aClass57_2);
			this.aClass57_2.method1236(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass144_1.anInt4211;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static95.aFloat10, 0.0F, 0.0F);
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
		this.aClass57_2.method1236(1);
		this.aClass105_Sub1_15.method3591(this.aClass44_Sub1_2);
		local34 = this.aClass144_4.anInt4211;
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
		this.aClass57_2.method1236(0);
		this.aClass105_Sub1_15.method3591(this.aClass44_Sub1_3);
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
		this.aClass105_Sub1_15.method3629(this.aClass57_2);
		local39 = this.aClass144_2.anInt4211;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static95.aFloat11, Static95.aFloat12, 0.0F);
		this.aClass105_Sub1_15.method3634(1);
		this.aClass105_Sub1_15.method3591(this.aClass44_Sub1_2);
		this.aClass105_Sub1_15.method3634(0);
		this.aClass105_Sub1_15.method3591(arg1);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
	@Override
	public int method1506() {
		return 1;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "()Z")
	@Override
	public boolean method1511() {
		return this.aClass57_2 != null;
	}
}
