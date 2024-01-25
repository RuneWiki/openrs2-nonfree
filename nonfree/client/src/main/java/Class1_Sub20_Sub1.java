import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!hi;")
	private Class15_Sub2 aClass15_Sub2_1;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!hi;")
	private Class15_Sub2 aClass15_Sub2_2;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
	private int anInt3030;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!gg;")
	private Class90 aClass90_1;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!du;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!du;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!du;")
	private Class61 aClass61_3;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	private int anInt3031;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	private int anInt3032;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!du;")
	private Class61 aClass61_4;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "[Lclient!hi;")
	private Class15_Sub2[] aClass15_Sub2Array1;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Lclient!gg;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) Class164_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()Z")
	@Override
	public boolean method2494() {
		if (!this.aClass164_Sub1_19.aBoolean420 || !this.aClass164_Sub1_19.aBoolean416 || !this.aClass164_Sub1_19.aBoolean403) {
			return false;
		}
		this.aClass90_1 = new Class90(this.aClass164_Sub1_19);
		this.aClass15_Sub2_1 = new Class15_Sub2(this.aClass164_Sub1_19, 3553, 34842, 256, 256);
		this.aClass15_Sub2_1.method5042(false, false);
		this.aClass15_Sub2_2 = new Class15_Sub2(this.aClass164_Sub1_19, 3553, 34842, 256, 256);
		this.aClass15_Sub2_2.method5042(false, false);
		this.aClass164_Sub1_19.method3562(this.aClass90_1);
		this.aClass90_1.method1707(0, this.aClass15_Sub2_1);
		this.aClass90_1.method1707(1, this.aClass15_Sub2_2);
		this.aClass90_1.method1706(0);
		if (!this.aClass90_1.method1713()) {
			this.aClass164_Sub1_19.method3609(this.aClass90_1);
			return false;
		}
		this.aClass164_Sub1_19.method3609(this.aClass90_1);
		this.aClass61_2 = Static74.method1171(this.aClass164_Sub1_19, new Class167[] { Static244.method3670(this.aClass164_Sub1_19, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass61_1 = Static74.method1171(this.aClass164_Sub1_19, new Class167[] { Static244.method3670(this.aClass164_Sub1_19, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass61_4 = Static74.method1171(this.aClass164_Sub1_19, new Class167[] { Static244.method3670(this.aClass164_Sub1_19, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass61_3 = Static74.method1171(this.aClass164_Sub1_19, new Class167[] { Static244.method3670(this.aClass164_Sub1_19, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass61_1 != null && this.aClass61_2 != null && this.aClass61_4 != null && this.aClass61_3 != null;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
	@Override
	public int method2498() {
		return 1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
	@Override
	public void method2491() {
		this.aClass90_2 = null;
		this.aClass15_Sub2Array1 = null;
		this.aClass90_1 = null;
		this.aClass15_Sub2_1 = null;
		this.aClass15_Sub2_2 = null;
		this.aClass61_2 = null;
		this.aClass61_1 = null;
		this.aClass61_4 = null;
		this.aClass61_3 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	@Override
	public void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3031 = arg0;
		this.anInt3030 = arg1;
		@Pc(10) int local10 = Static257.method3933(this.anInt3031);
		@Pc(15) int local15 = Static257.method3933(this.anInt3030);
		if (this.anInt3032 == local10 && this.anInt3033 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass15_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass15_Sub2Array1.length; local28++) {
				this.aClass15_Sub2Array1[local28].method5550();
			}
			this.aClass15_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass90_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass90_2 == null) {
						this.aClass90_2 = new Class90(this.aClass164_Sub1_19);
					}
					this.aClass15_Sub2Array1 = new Class15_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass15_Sub2Array1[local55++] = new Class15_Sub2(this.aClass164_Sub1_19, 3553, 34842, local28, local53);
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
		this.anInt3032 = local10;
		this.anInt3033 = local15;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
	@Override
	public void method2490(@OriginalArg(0) int arg0) {
		this.aClass164_Sub1_19.anOpengl1.glUseProgramObjectARB(0);
		this.aClass164_Sub1_19.method3584(1);
		this.aClass164_Sub1_19.method3603(null);
		this.aClass164_Sub1_19.method3584(0);
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "()Z")
	public boolean method2500() {
		return this.aClass164_Sub1_19.aBoolean420 && this.aClass164_Sub1_19.aBoolean416 && this.aClass164_Sub1_19.aBoolean403;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!hi;Lclient!hi;)V")
	@Override
	public void method2499(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2 arg1, @OriginalArg(2) Class15_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass164_Sub1_19.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass15_Sub2Array1 == null) {
			this.aClass164_Sub1_19.method3603(arg1);
			this.aClass164_Sub1_19.method3562(this.aClass90_1);
			this.aClass90_1.method1706(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass61_2.anInt1455;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static169.aFloat18, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt3031, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt3031, (float) this.anInt3030);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt3030);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass164_Sub1_19.method3562(this.aClass90_2);
			local34 = Static257.method3933(this.anInt3031);
			local39 = Static257.method3933(this.anInt3030);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass90_2.method1707(0, this.aClass15_Sub2Array1[local41]);
				if (local41 == 0) {
					this.aClass164_Sub1_19.method3603(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt3031, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt3031, (float) this.anInt3030);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt3030);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass164_Sub1_19.method3603(this.aClass15_Sub2Array1[local41 - 1]);
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
			this.aClass164_Sub1_19.method3609(this.aClass90_2);
			this.aClass164_Sub1_19.method3603(this.aClass15_Sub2Array1[local41 - 1]);
			this.aClass164_Sub1_19.method3562(this.aClass90_1);
			this.aClass90_1.method1706(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass61_1.anInt1455;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static169.aFloat18, 0.0F, 0.0F);
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
		this.aClass90_1.method1706(1);
		this.aClass164_Sub1_19.method3603(this.aClass15_Sub2_1);
		local34 = this.aClass61_3.anInt1455;
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
		this.aClass90_1.method1706(0);
		this.aClass164_Sub1_19.method3603(this.aClass15_Sub2_2);
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
		this.aClass164_Sub1_19.method3609(this.aClass90_1);
		local39 = this.aClass61_4.anInt1455;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static169.aFloat17, Static169.aFloat19, 0.0F);
		this.aClass164_Sub1_19.method3584(1);
		this.aClass164_Sub1_19.method3603(this.aClass15_Sub2_1);
		this.aClass164_Sub1_19.method3584(0);
		this.aClass164_Sub1_19.method3603(arg1);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()Z")
	@Override
	public boolean method2497() {
		return this.aClass90_1 != null;
	}
}
