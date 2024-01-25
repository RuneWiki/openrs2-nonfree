import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Lclient!vr;")
	private Class214 aClass214_1;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!ta;")
	private Class194 aClass194_1;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Lclient!ta;")
	private Class194 aClass194_2;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!vr;")
	private Class214 aClass214_2;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!ta;")
	private Class194 aClass194_3;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "[Lclient!jo;")
	private Class70_Sub4[] aClass70_Sub4Array1;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "Lclient!jo;")
	private Class70_Sub4 aClass70_Sub4_1;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!ta;")
	private Class194 aClass194_4;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Lclient!jo;")
	private Class70_Sub4 aClass70_Sub4_2;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class4_Sub3_Sub1(@OriginalArg(0) Class92_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!jo;Lclient!jo;)V")
	@Override
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) Class70_Sub4 arg1, @OriginalArg(2) Class70_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_2.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass70_Sub4Array1 == null) {
			this.aClass92_Sub2_2.method4548(arg1);
			this.aClass92_Sub2_2.method4615(this.aClass214_1);
			this.aClass214_1.method5566(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass194_2.anInt6038;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static24.aFloat2, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt430, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt430, (float) this.anInt431);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt431);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass92_Sub2_2.method4615(this.aClass214_2);
			local34 = Static90.method1611(this.anInt430);
			local39 = Static90.method1611(this.anInt431);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass214_2.method5570(0, this.aClass70_Sub4Array1[local41]);
				if (local41 == 0) {
					this.aClass92_Sub2_2.method4548(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt430, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt430, (float) this.anInt431);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt431);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass92_Sub2_2.method4548(this.aClass70_Sub4Array1[local41 - 1]);
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
			this.aClass92_Sub2_2.method4613(this.aClass214_2);
			this.aClass92_Sub2_2.method4548(this.aClass70_Sub4Array1[local41 - 1]);
			this.aClass92_Sub2_2.method4615(this.aClass214_1);
			this.aClass214_1.method5566(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass194_3.anInt6038;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static24.aFloat2, 0.0F, 0.0F);
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
		this.aClass214_1.method5566(1);
		this.aClass92_Sub2_2.method4548(this.aClass70_Sub4_2);
		local34 = this.aClass194_4.anInt6038;
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
		this.aClass214_1.method5566(0);
		this.aClass92_Sub2_2.method4548(this.aClass70_Sub4_1);
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
		this.aClass92_Sub2_2.method4613(this.aClass214_1);
		local39 = this.aClass194_1.anInt6038;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static24.aFloat1, Static24.aFloat3, 0.0F);
		this.aClass92_Sub2_2.method4568(1);
		this.aClass92_Sub2_2.method4548(this.aClass70_Sub4_2);
		this.aClass92_Sub2_2.method4568(0);
		this.aClass92_Sub2_2.method4548(arg1);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
	@Override
	public int method431() {
		return 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()Z")
	@Override
	public boolean method427() {
		if (!this.aClass92_Sub2_2.aBoolean464 || !this.aClass92_Sub2_2.aBoolean460 || !this.aClass92_Sub2_2.aBoolean462) {
			return false;
		}
		this.aClass214_1 = new Class214(this.aClass92_Sub2_2);
		this.aClass70_Sub4_2 = new Class70_Sub4(this.aClass92_Sub2_2, 3553, 34842, 256, 256);
		this.aClass70_Sub4_2.method1991(false, false);
		this.aClass70_Sub4_1 = new Class70_Sub4(this.aClass92_Sub2_2, 3553, 34842, 256, 256);
		this.aClass70_Sub4_1.method1991(false, false);
		this.aClass92_Sub2_2.method4615(this.aClass214_1);
		this.aClass214_1.method5570(0, this.aClass70_Sub4_2);
		this.aClass214_1.method5570(1, this.aClass70_Sub4_1);
		this.aClass214_1.method5566(0);
		if (!this.aClass214_1.method5565()) {
			this.aClass92_Sub2_2.method4613(this.aClass214_1);
			return false;
		}
		this.aClass92_Sub2_2.method4613(this.aClass214_1);
		this.aClass194_2 = Static299.method5071(this.aClass92_Sub2_2, new Class146[] { Static227.method3906(this.aClass92_Sub2_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass194_3 = Static299.method5071(this.aClass92_Sub2_2, new Class146[] { Static227.method3906(this.aClass92_Sub2_2, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass194_1 = Static299.method5071(this.aClass92_Sub2_2, new Class146[] { Static227.method3906(this.aClass92_Sub2_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass194_4 = Static299.method5071(this.aClass92_Sub2_2, new Class146[] { Static227.method3906(this.aClass92_Sub2_2, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass194_3 != null && this.aClass194_2 != null && this.aClass194_1 != null && this.aClass194_4 != null;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	@Override
	public void method430(@OriginalArg(0) int arg0) {
		this.aClass92_Sub2_2.anOpengl2.glUseProgramObjectARB(0);
		this.aClass92_Sub2_2.method4568(1);
		this.aClass92_Sub2_2.method4548(null);
		this.aClass92_Sub2_2.method4568(0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()Z")
	@Override
	public boolean method428() {
		return this.aClass214_1 != null;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
	public boolean method432() {
		return this.aClass92_Sub2_2.aBoolean464 && this.aClass92_Sub2_2.aBoolean460 && this.aClass92_Sub2_2.aBoolean462;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	@Override
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt430 = arg0;
		this.anInt431 = arg1;
		@Pc(10) int local10 = Static90.method1611(this.anInt430);
		@Pc(15) int local15 = Static90.method1611(this.anInt431);
		if (this.anInt432 == local10 && this.anInt433 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass70_Sub4Array1 != null) {
			for (local28 = 0; local28 < this.aClass70_Sub4Array1.length; local28++) {
				this.aClass70_Sub4Array1[local28].method1981();
			}
			this.aClass70_Sub4Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass214_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass214_2 == null) {
						this.aClass214_2 = new Class214(this.aClass92_Sub2_2);
					}
					this.aClass70_Sub4Array1 = new Class70_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass70_Sub4Array1[local55++] = new Class70_Sub4(this.aClass92_Sub2_2, 3553, 34842, local28, local53);
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
		this.anInt432 = local10;
		this.anInt433 = local15;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
	@Override
	public void method429() {
		this.aClass214_2 = null;
		this.aClass70_Sub4Array1 = null;
		this.aClass214_1 = null;
		this.aClass70_Sub4_2 = null;
		this.aClass70_Sub4_1 = null;
		this.aClass194_2 = null;
		this.aClass194_3 = null;
		this.aClass194_1 = null;
		this.aClass194_4 = null;
	}
}
