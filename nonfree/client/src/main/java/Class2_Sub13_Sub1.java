import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	private int anInt1427;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "[Lclient!uo;")
	private Class20_Sub4[] aClass20_Sub4Array1;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "Lclient!in;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Lclient!in;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Lclient!in;")
	private Class109 aClass109_3;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "Lclient!in;")
	private Class109 aClass109_4;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "Lclient!uo;")
	private Class20_Sub4 aClass20_Sub4_1;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Lclient!hm;")
	private Class99 aClass99_1;

	@OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
	private int anInt1428;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "Lclient!hm;")
	private Class99 aClass99_2;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	private int anInt1430;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!uo;")
	private Class20_Sub4 aClass20_Sub4_2;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) Class63_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
	@Override
	public int method1192() {
		return 1;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()V")
	@Override
	public void method1188() {
		this.aClass99_2 = null;
		this.aClass20_Sub4Array1 = null;
		this.aClass99_1 = null;
		this.aClass20_Sub4_2 = null;
		this.aClass20_Sub4_1 = null;
		this.aClass109_4 = null;
		this.aClass109_1 = null;
		this.aClass109_3 = null;
		this.aClass109_2 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	@Override
	public void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1429 = arg0;
		this.anInt1428 = arg1;
		@Pc(10) int local10 = Static259.method4011(this.anInt1429);
		@Pc(15) int local15 = Static259.method4011(this.anInt1428);
		if (this.anInt1427 == local10 && this.anInt1430 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass20_Sub4Array1 != null) {
			for (local28 = 0; local28 < this.aClass20_Sub4Array1.length; local28++) {
				this.aClass20_Sub4Array1[local28].method5505();
			}
			this.aClass20_Sub4Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass99_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass99_2 == null) {
						this.aClass99_2 = new Class99(this.aClass63_Sub2_12);
					}
					this.aClass20_Sub4Array1 = new Class20_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass20_Sub4Array1[local55++] = new Class20_Sub4(this.aClass63_Sub2_12, 3553, 34842, local28, local53);
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
		this.anInt1427 = local10;
		this.anInt1430 = local15;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()Z")
	@Override
	public boolean method1185() {
		return this.aClass99_1 != null;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	@Override
	public void method1189(@OriginalArg(0) int arg0) {
		this.aClass63_Sub2_12.anOpengl2.glUseProgramObjectARB(0);
		this.aClass63_Sub2_12.method2115(1);
		this.aClass63_Sub2_12.method2068(null);
		this.aClass63_Sub2_12.method2115(0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!uo;Lclient!uo;)V")
	@Override
	public void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) Class20_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass63_Sub2_12.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass20_Sub4Array1 == null) {
			this.aClass63_Sub2_12.method2068(arg1);
			this.aClass63_Sub2_12.method2077(this.aClass99_1);
			this.aClass99_1.method2538(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass109_4.anInt2921;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static73.aFloat3, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt1429, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt1429, (float) this.anInt1428);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt1428);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass63_Sub2_12.method2077(this.aClass99_2);
			local34 = Static259.method4011(this.anInt1429);
			local39 = Static259.method4011(this.anInt1428);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass99_2.method2535(0, this.aClass20_Sub4Array1[local41]);
				if (local41 == 0) {
					this.aClass63_Sub2_12.method2068(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt1429, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt1429, (float) this.anInt1428);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt1428);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass63_Sub2_12.method2068(this.aClass20_Sub4Array1[local41 - 1]);
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
			this.aClass63_Sub2_12.method2119(this.aClass99_2);
			this.aClass63_Sub2_12.method2068(this.aClass20_Sub4Array1[local41 - 1]);
			this.aClass63_Sub2_12.method2077(this.aClass99_1);
			this.aClass99_1.method2538(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass109_1.anInt2921;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static73.aFloat3, 0.0F, 0.0F);
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
		this.aClass99_1.method2538(1);
		this.aClass63_Sub2_12.method2068(this.aClass20_Sub4_2);
		local34 = this.aClass109_2.anInt2921;
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
		this.aClass99_1.method2538(0);
		this.aClass63_Sub2_12.method2068(this.aClass20_Sub4_1);
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
		this.aClass63_Sub2_12.method2119(this.aClass99_1);
		local39 = this.aClass109_3.anInt2921;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static73.aFloat5, Static73.aFloat4, 0.0F);
		this.aClass63_Sub2_12.method2115(1);
		this.aClass63_Sub2_12.method2068(this.aClass20_Sub4_2);
		this.aClass63_Sub2_12.method2115(0);
		this.aClass63_Sub2_12.method2068(arg1);
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "()Z")
	public boolean method1193() {
		return this.aClass63_Sub2_12.aBoolean167 && this.aClass63_Sub2_12.aBoolean162 && this.aClass63_Sub2_12.aBoolean161;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()Z")
	@Override
	public boolean method1184() {
		if (!this.aClass63_Sub2_12.aBoolean167 || !this.aClass63_Sub2_12.aBoolean162 || !this.aClass63_Sub2_12.aBoolean161) {
			return false;
		}
		this.aClass99_1 = new Class99(this.aClass63_Sub2_12);
		this.aClass20_Sub4_2 = new Class20_Sub4(this.aClass63_Sub2_12, 3553, 34842, 256, 256);
		this.aClass20_Sub4_2.method5511(false, false);
		this.aClass20_Sub4_1 = new Class20_Sub4(this.aClass63_Sub2_12, 3553, 34842, 256, 256);
		this.aClass20_Sub4_1.method5511(false, false);
		this.aClass63_Sub2_12.method2077(this.aClass99_1);
		this.aClass99_1.method2535(0, this.aClass20_Sub4_2);
		this.aClass99_1.method2535(1, this.aClass20_Sub4_1);
		this.aClass99_1.method2538(0);
		if (!this.aClass99_1.method2537()) {
			this.aClass63_Sub2_12.method2119(this.aClass99_1);
			return false;
		}
		this.aClass63_Sub2_12.method2119(this.aClass99_1);
		this.aClass109_4 = Static147.method2755(this.aClass63_Sub2_12, new Class76[] { Static99.method1944(this.aClass63_Sub2_12, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass109_1 = Static147.method2755(this.aClass63_Sub2_12, new Class76[] { Static99.method1944(this.aClass63_Sub2_12, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass109_3 = Static147.method2755(this.aClass63_Sub2_12, new Class76[] { Static99.method1944(this.aClass63_Sub2_12, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass109_2 = Static147.method2755(this.aClass63_Sub2_12, new Class76[] { Static99.method1944(this.aClass63_Sub2_12, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass109_1 != null && this.aClass109_4 != null && this.aClass109_3 != null && this.aClass109_2 != null;
	}
}
