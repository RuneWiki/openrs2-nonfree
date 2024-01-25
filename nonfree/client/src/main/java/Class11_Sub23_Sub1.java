import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class11_Sub23_Sub1 extends Class11_Sub23 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!tf;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Lclient!wq;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!im;")
	private Class56_Sub4 aClass56_Sub4_3;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!wq;")
	private Class217 aClass217_3;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Lclient!tf;")
	private Class188 aClass188_2;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	private int anInt2674;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	private int anInt2675;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!im;")
	private Class56_Sub4 aClass56_Sub4_4;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	private int anInt2676;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!tf;")
	private Class188 aClass188_3;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Lclient!tf;")
	private Class188 aClass188_4;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "[Lclient!im;")
	private Class56_Sub4[] aClass56_Sub4Array2;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class11_Sub23_Sub1(@OriginalArg(0) Class129_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!im;Lclient!im;)V")
	@Override
	public void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub4 arg1, @OriginalArg(2) Class56_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass129_Sub2_23.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass56_Sub4Array2 == null) {
			this.aClass129_Sub2_23.method5084(arg1);
			this.aClass129_Sub2_23.method5039(this.aClass217_3);
			this.aClass217_3.method5727(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass188_3.anInt5970;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static146.aFloat19, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt2677, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt2677, (float) this.anInt2676);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt2676);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass129_Sub2_23.method5039(this.aClass217_2);
			local34 = Static39.method577(this.anInt2677);
			local39 = Static39.method577(this.anInt2676);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass217_2.method5729(0, this.aClass56_Sub4Array2[local41]);
				if (local41 == 0) {
					this.aClass129_Sub2_23.method5084(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt2677, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt2677, (float) this.anInt2676);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt2676);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass129_Sub2_23.method5084(this.aClass56_Sub4Array2[local41 - 1]);
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
			this.aClass129_Sub2_23.method5082(this.aClass217_2);
			this.aClass129_Sub2_23.method5084(this.aClass56_Sub4Array2[local41 - 1]);
			this.aClass129_Sub2_23.method5039(this.aClass217_3);
			this.aClass217_3.method5727(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass188_2.anInt5970;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static146.aFloat19, 0.0F, 0.0F);
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
		this.aClass217_3.method5727(1);
		this.aClass129_Sub2_23.method5084(this.aClass56_Sub4_4);
		local34 = this.aClass188_1.anInt5970;
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
		this.aClass217_3.method5727(0);
		this.aClass129_Sub2_23.method5084(this.aClass56_Sub4_3);
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
		this.aClass129_Sub2_23.method5082(this.aClass217_3);
		local39 = this.aClass188_4.anInt5970;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static146.aFloat18, Static146.aFloat17, 0.0F);
		this.aClass129_Sub2_23.method5091(1);
		this.aClass129_Sub2_23.method5084(this.aClass56_Sub4_4);
		this.aClass129_Sub2_23.method5091(0);
		this.aClass129_Sub2_23.method5084(arg1);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z")
	@Override
	public boolean method2239() {
		if (!this.aClass129_Sub2_23.aBoolean396 || !this.aClass129_Sub2_23.aBoolean374 || !this.aClass129_Sub2_23.aBoolean388) {
			return false;
		}
		this.aClass217_3 = new Class217(this.aClass129_Sub2_23);
		this.aClass56_Sub4_4 = new Class56_Sub4(this.aClass129_Sub2_23, 3553, 34842, 256, 256);
		this.aClass56_Sub4_4.method2553(false, false);
		this.aClass56_Sub4_3 = new Class56_Sub4(this.aClass129_Sub2_23, 3553, 34842, 256, 256);
		this.aClass56_Sub4_3.method2553(false, false);
		this.aClass129_Sub2_23.method5039(this.aClass217_3);
		this.aClass217_3.method5729(0, this.aClass56_Sub4_4);
		this.aClass217_3.method5729(1, this.aClass56_Sub4_3);
		this.aClass217_3.method5727(0);
		if (!this.aClass217_3.method5732()) {
			this.aClass129_Sub2_23.method5082(this.aClass217_3);
			return false;
		}
		this.aClass129_Sub2_23.method5082(this.aClass217_3);
		this.aClass188_3 = Static302.method5135(this.aClass129_Sub2_23, new Class99[] { Static123.method1901(this.aClass129_Sub2_23, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass188_2 = Static302.method5135(this.aClass129_Sub2_23, new Class99[] { Static123.method1901(this.aClass129_Sub2_23, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass188_4 = Static302.method5135(this.aClass129_Sub2_23, new Class99[] { Static123.method1901(this.aClass129_Sub2_23, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass188_1 = Static302.method5135(this.aClass129_Sub2_23, new Class99[] { Static123.method1901(this.aClass129_Sub2_23, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass188_2 != null && this.aClass188_3 != null && this.aClass188_4 != null && this.aClass188_1 != null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()I")
	@Override
	public int method2234() {
		return 1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	@Override
	public void method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2677 = arg0;
		this.anInt2676 = arg1;
		@Pc(10) int local10 = Static39.method577(this.anInt2677);
		@Pc(15) int local15 = Static39.method577(this.anInt2676);
		if (this.anInt2675 == local10 && this.anInt2674 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass56_Sub4Array2 != null) {
			for (local28 = 0; local28 < this.aClass56_Sub4Array2.length; local28++) {
				this.aClass56_Sub4Array2[local28].method2545();
			}
			this.aClass56_Sub4Array2 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass217_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass217_2 == null) {
						this.aClass217_2 = new Class217(this.aClass129_Sub2_23);
					}
					this.aClass56_Sub4Array2 = new Class56_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass56_Sub4Array2[local55++] = new Class56_Sub4(this.aClass129_Sub2_23, 3553, 34842, local28, local53);
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
		this.anInt2675 = local10;
		this.anInt2674 = local15;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()Z")
	@Override
	public boolean method2235() {
		return this.aClass217_3 != null;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public void method2237(@OriginalArg(0) int arg0) {
		this.aClass129_Sub2_23.anOpengl2.glUseProgramObjectARB(0);
		this.aClass129_Sub2_23.method5091(1);
		this.aClass129_Sub2_23.method5084(null);
		this.aClass129_Sub2_23.method5091(0);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()V")
	@Override
	public void method2236() {
		this.aClass217_2 = null;
		this.aClass56_Sub4Array2 = null;
		this.aClass217_3 = null;
		this.aClass56_Sub4_4 = null;
		this.aClass56_Sub4_3 = null;
		this.aClass188_3 = null;
		this.aClass188_2 = null;
		this.aClass188_4 = null;
		this.aClass188_1 = null;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "()Z")
	public boolean method2242() {
		return this.aClass129_Sub2_23.aBoolean396 && this.aClass129_Sub2_23.aBoolean374 && this.aClass129_Sub2_23.aBoolean388;
	}
}
