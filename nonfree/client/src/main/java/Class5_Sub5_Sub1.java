import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!am", name = "r", descriptor = "Lclient!rj;")
	private Class178 aClass178_1;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "Lclient!rj;")
	private Class178 aClass178_2;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "Lclient!qd;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!am", name = "A", descriptor = "Lclient!hn;")
	private Class60_Sub4 aClass60_Sub4_1;

	@OriginalMember(owner = "client!am", name = "B", descriptor = "Lclient!rj;")
	private Class178 aClass178_3;

	@OriginalMember(owner = "client!am", name = "C", descriptor = "Lclient!hn;")
	private Class60_Sub4 aClass60_Sub4_2;

	@OriginalMember(owner = "client!am", name = "D", descriptor = "Lclient!rj;")
	private Class178 aClass178_4;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "Lclient!qd;")
	private Class167 aClass167_2;

	@OriginalMember(owner = "client!am", name = "F", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!am", name = "G", descriptor = "[Lclient!hn;")
	private Class60_Sub4[] aClass60_Sub4Array1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) Class55_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()Z")
	@Override
	public boolean method232() {
		if (!this.aClass55_Sub1_2.aBoolean309 || !this.aClass55_Sub1_2.aBoolean313 || !this.aClass55_Sub1_2.aBoolean328) {
			return false;
		}
		this.aClass167_2 = new Class167(this.aClass55_Sub1_2);
		this.aClass60_Sub4_2 = new Class60_Sub4(this.aClass55_Sub1_2, 3553, 34842, 256, 256);
		this.aClass60_Sub4_2.method5849(false, false);
		this.aClass60_Sub4_1 = new Class60_Sub4(this.aClass55_Sub1_2, 3553, 34842, 256, 256);
		this.aClass60_Sub4_1.method5849(false, false);
		this.aClass55_Sub1_2.method3685(this.aClass167_2);
		this.aClass167_2.method4542(0, this.aClass60_Sub4_2);
		this.aClass167_2.method4542(1, this.aClass60_Sub4_1);
		this.aClass167_2.method4543(0);
		if (!this.aClass167_2.method4546()) {
			this.aClass55_Sub1_2.method3688(this.aClass167_2);
			return false;
		}
		this.aClass55_Sub1_2.method3688(this.aClass167_2);
		this.aClass178_1 = Static279.method4861(this.aClass55_Sub1_2, new Class169[] { Static266.method4693(this.aClass55_Sub1_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass178_4 = Static279.method4861(this.aClass55_Sub1_2, new Class169[] { Static266.method4693(this.aClass55_Sub1_2, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass178_2 = Static279.method4861(this.aClass55_Sub1_2, new Class169[] { Static266.method4693(this.aClass55_Sub1_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass178_3 = Static279.method4861(this.aClass55_Sub1_2, new Class169[] { Static266.method4693(this.aClass55_Sub1_2, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass178_4 != null && this.aClass178_1 != null && this.aClass178_2 != null && this.aClass178_3 != null;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()I")
	@Override
	public int method239() {
		return 1;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()Z")
	@Override
	public boolean method234() {
		return this.aClass167_2 != null;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "()Z")
	public boolean method240() {
		return this.aClass55_Sub1_2.aBoolean309 && this.aClass55_Sub1_2.aBoolean313 && this.aClass55_Sub1_2.aBoolean328;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	@Override
	public void method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt253 = arg0;
		this.anInt251 = arg1;
		@Pc(10) int local10 = Static74.method1366(this.anInt253);
		@Pc(15) int local15 = Static74.method1366(this.anInt251);
		if (this.anInt254 == local10 && this.anInt252 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass60_Sub4Array1 != null) {
			for (local28 = 0; local28 < this.aClass60_Sub4Array1.length; local28++) {
				this.aClass60_Sub4Array1[local28].method5845();
			}
			this.aClass60_Sub4Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass167_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass167_1 == null) {
						this.aClass167_1 = new Class167(this.aClass55_Sub1_2);
					}
					this.aClass60_Sub4Array1 = new Class60_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass60_Sub4Array1[local55++] = new Class60_Sub4(this.aClass55_Sub1_2, 3553, 34842, local28, local53);
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
		this.anInt254 = local10;
		this.anInt252 = local15;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!hn;Lclient!hn;)V")
	@Override
	public void method237(@OriginalArg(0) int arg0, @OriginalArg(1) Class60_Sub4 arg1, @OriginalArg(2) Class60_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass55_Sub1_2.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass60_Sub4Array1 == null) {
			this.aClass55_Sub1_2.method3677(arg1);
			this.aClass55_Sub1_2.method3685(this.aClass167_2);
			this.aClass167_2.method4543(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass178_1.anInt5496;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static13.aFloat3, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt253, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt253, (float) this.anInt251);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt251);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass55_Sub1_2.method3685(this.aClass167_1);
			local34 = Static74.method1366(this.anInt253);
			local39 = Static74.method1366(this.anInt251);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass167_1.method4542(0, this.aClass60_Sub4Array1[local41]);
				if (local41 == 0) {
					this.aClass55_Sub1_2.method3677(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt253, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt253, (float) this.anInt251);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt251);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass55_Sub1_2.method3677(this.aClass60_Sub4Array1[local41 - 1]);
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
			this.aClass55_Sub1_2.method3688(this.aClass167_1);
			this.aClass55_Sub1_2.method3677(this.aClass60_Sub4Array1[local41 - 1]);
			this.aClass55_Sub1_2.method3685(this.aClass167_2);
			this.aClass167_2.method4543(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass178_4.anInt5496;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static13.aFloat3, 0.0F, 0.0F);
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
		this.aClass167_2.method4543(1);
		this.aClass55_Sub1_2.method3677(this.aClass60_Sub4_2);
		local34 = this.aClass178_3.anInt5496;
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
		this.aClass167_2.method4543(0);
		this.aClass55_Sub1_2.method3677(this.aClass60_Sub4_1);
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
		this.aClass55_Sub1_2.method3688(this.aClass167_2);
		local39 = this.aClass178_2.anInt5496;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static13.aFloat4, Static13.aFloat5, 0.0F);
		this.aClass55_Sub1_2.method3693(1);
		this.aClass55_Sub1_2.method3677(this.aClass60_Sub4_2);
		this.aClass55_Sub1_2.method3693(0);
		this.aClass55_Sub1_2.method3677(arg1);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()V")
	@Override
	public void method235() {
		this.aClass167_1 = null;
		this.aClass60_Sub4Array1 = null;
		this.aClass167_2 = null;
		this.aClass60_Sub4_2 = null;
		this.aClass60_Sub4_1 = null;
		this.aClass178_1 = null;
		this.aClass178_4 = null;
		this.aClass178_2 = null;
		this.aClass178_3 = null;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V")
	@Override
	public void method231(@OriginalArg(0) int arg0) {
		this.aClass55_Sub1_2.anOpengl1.glUseProgramObjectARB(0);
		this.aClass55_Sub1_2.method3693(1);
		this.aClass55_Sub1_2.method3677(null);
		this.aClass55_Sub1_2.method3693(0);
	}
}
