import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!fj;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!fc;")
	private Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!ib;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!fj;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!fc;")
	private Class11_Sub1[] aClass11_Sub1Array1;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!fc;")
	private Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!fj;")
	private Class67 aClass67_3;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!fj;")
	private Class67 aClass67_4;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "Lclient!ib;")
	private Class87 aClass87_2;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) Class59_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method821(@OriginalArg(0) int arg0) {
		this.aClass59_Sub1_10.anOpengl2.glUseProgramObjectARB(0);
		this.aClass59_Sub1_10.method4273(1);
		this.aClass59_Sub1_10.method4296(null);
		this.aClass59_Sub1_10.method4273(0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
	@Override
	public boolean method819() {
		if (!this.aClass59_Sub1_10.aBoolean367 || !this.aClass59_Sub1_10.aBoolean361 || !this.aClass59_Sub1_10.aBoolean365) {
			return false;
		}
		this.aClass87_2 = new Class87(this.aClass59_Sub1_10);
		this.aClass11_Sub1_2 = new Class11_Sub1(this.aClass59_Sub1_10, 3553, 34842, 256, 256);
		this.aClass11_Sub1_2.method387(false, false);
		this.aClass11_Sub1_1 = new Class11_Sub1(this.aClass59_Sub1_10, 3553, 34842, 256, 256);
		this.aClass11_Sub1_1.method387(false, false);
		this.aClass59_Sub1_10.method4289(this.aClass87_2);
		this.aClass87_2.method2458(0, this.aClass11_Sub1_2);
		this.aClass87_2.method2458(1, this.aClass11_Sub1_1);
		this.aClass87_2.method2462(0);
		if (!this.aClass87_2.method2464()) {
			this.aClass59_Sub1_10.method4315(this.aClass87_2);
			return false;
		}
		this.aClass59_Sub1_10.method4315(this.aClass87_2);
		this.aClass67_4 = Static87.method1945(this.aClass59_Sub1_10, new Class16[] { Static14.method493(this.aClass59_Sub1_10, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass67_1 = Static87.method1945(this.aClass59_Sub1_10, new Class16[] { Static14.method493(this.aClass59_Sub1_10, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass67_3 = Static87.method1945(this.aClass59_Sub1_10, new Class16[] { Static14.method493(this.aClass59_Sub1_10, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass67_2 = Static87.method1945(this.aClass59_Sub1_10, new Class16[] { Static14.method493(this.aClass59_Sub1_10, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass67_1 != null && this.aClass67_4 != null && this.aClass67_3 != null && this.aClass67_2 != null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!fc;Lclient!fc;)V")
	@Override
	public void method824(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1, @OriginalArg(2) Class11_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_10.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass11_Sub1Array1 == null) {
			this.aClass59_Sub1_10.method4296(arg1);
			this.aClass59_Sub1_10.method4289(this.aClass87_2);
			this.aClass87_2.method2462(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass67_4.anInt2115;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static33.aFloat17, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt881, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt881, (float) this.anInt883);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt883);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass59_Sub1_10.method4289(this.aClass87_1);
			local34 = Static7.method234(this.anInt881);
			local39 = Static7.method234(this.anInt883);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass87_1.method2458(0, this.aClass11_Sub1Array1[local41]);
				if (local41 == 0) {
					this.aClass59_Sub1_10.method4296(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt881, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt881, (float) this.anInt883);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt883);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass59_Sub1_10.method4296(this.aClass11_Sub1Array1[local41 - 1]);
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
			this.aClass59_Sub1_10.method4315(this.aClass87_1);
			this.aClass59_Sub1_10.method4296(this.aClass11_Sub1Array1[local41 - 1]);
			this.aClass59_Sub1_10.method4289(this.aClass87_2);
			this.aClass87_2.method2462(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass67_1.anInt2115;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static33.aFloat17, 0.0F, 0.0F);
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
		this.aClass87_2.method2462(1);
		this.aClass59_Sub1_10.method4296(this.aClass11_Sub1_2);
		local34 = this.aClass67_2.anInt2115;
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
		this.aClass87_2.method2462(0);
		this.aClass59_Sub1_10.method4296(this.aClass11_Sub1_1);
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
		this.aClass59_Sub1_10.method4315(this.aClass87_2);
		local39 = this.aClass67_3.anInt2115;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static33.aFloat16, Static33.aFloat15, 0.0F);
		this.aClass59_Sub1_10.method4273(1);
		this.aClass59_Sub1_10.method4296(this.aClass11_Sub1_2);
		this.aClass59_Sub1_10.method4273(0);
		this.aClass59_Sub1_10.method4296(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	@Override
	public void method822() {
		this.aClass87_1 = null;
		this.aClass11_Sub1Array1 = null;
		this.aClass87_2 = null;
		this.aClass11_Sub1_2 = null;
		this.aClass11_Sub1_1 = null;
		this.aClass67_4 = null;
		this.aClass67_1 = null;
		this.aClass67_3 = null;
		this.aClass67_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z")
	public boolean method829() {
		return this.aClass59_Sub1_10.aBoolean367 && this.aClass59_Sub1_10.aBoolean361 && this.aClass59_Sub1_10.aBoolean365;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z")
	@Override
	public boolean method826() {
		return this.aClass87_2 != null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	@Override
	public void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt881 = arg0;
		this.anInt883 = arg1;
		@Pc(10) int local10 = Static7.method234(this.anInt881);
		@Pc(15) int local15 = Static7.method234(this.anInt883);
		if (this.anInt882 == local10 && this.anInt884 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass11_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass11_Sub1Array1.length; local28++) {
				this.aClass11_Sub1Array1[local28].method3573();
			}
			this.aClass11_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass87_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass87_1 == null) {
						this.aClass87_1 = new Class87(this.aClass59_Sub1_10);
					}
					this.aClass11_Sub1Array1 = new Class11_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass11_Sub1Array1[local55++] = new Class11_Sub1(this.aClass59_Sub1_10, 3553, 34842, local28, local53);
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
		this.anInt882 = local10;
		this.anInt884 = local15;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	@Override
	public int method823() {
		return 1;
	}
}
