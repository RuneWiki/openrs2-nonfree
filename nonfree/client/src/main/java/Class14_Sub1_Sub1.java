import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 {

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Lclient!ai;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!jl;")
	private Class106 aClass106_1;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "Lclient!ql;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Lclient!jl;")
	private Class106 aClass106_2;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "[Lclient!ai;")
	private Class8_Sub1[] aClass8_Sub1Array1;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Lclient!ai;")
	private Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Lclient!jl;")
	private Class106 aClass106_3;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "Lclient!ql;")
	private Class171 aClass171_2;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "Lclient!jl;")
	private Class106 aClass106_4;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class14_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	@Override
	public void method264(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class8_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass46_Sub2_4.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass8_Sub1Array1 == null) {
			this.aClass46_Sub2_4.method5251(arg1);
			this.aClass46_Sub2_4.method5247(this.aClass171_2);
			this.aClass171_2.method4524(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass106_3.anInt3232;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static11.aFloat4, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt242, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt242, (float) this.anInt241);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt241);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass46_Sub2_4.method5247(this.aClass171_1);
			local34 = Static159.method3097(this.anInt242);
			local39 = Static159.method3097(this.anInt241);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass171_1.method4527(0, this.aClass8_Sub1Array1[local41]);
				if (local41 == 0) {
					this.aClass46_Sub2_4.method5251(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt242, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt242, (float) this.anInt241);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt241);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass46_Sub2_4.method5251(this.aClass8_Sub1Array1[local41 - 1]);
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
			this.aClass46_Sub2_4.method5255(this.aClass171_1);
			this.aClass46_Sub2_4.method5251(this.aClass8_Sub1Array1[local41 - 1]);
			this.aClass46_Sub2_4.method5247(this.aClass171_2);
			this.aClass171_2.method4524(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass106_2.anInt3232;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static11.aFloat4, 0.0F, 0.0F);
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
		this.aClass171_2.method4524(1);
		this.aClass46_Sub2_4.method5251(this.aClass8_Sub1_2);
		local34 = this.aClass106_1.anInt3232;
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
		this.aClass171_2.method4524(0);
		this.aClass46_Sub2_4.method5251(this.aClass8_Sub1_1);
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
		this.aClass46_Sub2_4.method5255(this.aClass171_2);
		local39 = this.aClass106_4.anInt3232;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static11.aFloat6, Static11.aFloat5, 0.0F);
		this.aClass46_Sub2_4.method5225(1);
		this.aClass46_Sub2_4.method5251(this.aClass8_Sub1_2);
		this.aClass46_Sub2_4.method5225(0);
		this.aClass46_Sub2_4.method5251(arg1);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()Z")
	@Override
	public boolean method261() {
		if (!this.aClass46_Sub2_4.lb || !this.aClass46_Sub2_4.aBoolean400 || !this.aClass46_Sub2_4.aBoolean385) {
			return false;
		}
		this.aClass171_2 = new Class171(this.aClass46_Sub2_4);
		this.aClass8_Sub1_2 = new Class8_Sub1(this.aClass46_Sub2_4, 3553, 34842, 256, 256);
		this.aClass8_Sub1_2.method3370(false, false);
		this.aClass8_Sub1_1 = new Class8_Sub1(this.aClass46_Sub2_4, 3553, 34842, 256, 256);
		this.aClass8_Sub1_1.method3370(false, false);
		this.aClass46_Sub2_4.method5247(this.aClass171_2);
		this.aClass171_2.method4527(0, this.aClass8_Sub1_2);
		this.aClass171_2.method4527(1, this.aClass8_Sub1_1);
		this.aClass171_2.method4524(0);
		if (!this.aClass171_2.method4526()) {
			this.aClass46_Sub2_4.method5255(this.aClass171_2);
			return false;
		}
		this.aClass46_Sub2_4.method5255(this.aClass171_2);
		this.aClass106_3 = Static150.method2999(this.aClass46_Sub2_4, new Class98[] { Static139.method2795(this.aClass46_Sub2_4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass106_2 = Static150.method2999(this.aClass46_Sub2_4, new Class98[] { Static139.method2795(this.aClass46_Sub2_4, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass106_4 = Static150.method2999(this.aClass46_Sub2_4, new Class98[] { Static139.method2795(this.aClass46_Sub2_4, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass106_1 = Static150.method2999(this.aClass46_Sub2_4, new Class98[] { Static139.method2795(this.aClass46_Sub2_4, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass106_2 != null && this.aClass106_3 != null && this.aClass106_4 != null && this.aClass106_1 != null;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()Z")
	public boolean method269() {
		return this.aClass46_Sub2_4.lb && this.aClass46_Sub2_4.aBoolean400 && this.aClass46_Sub2_4.aBoolean385;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()V")
	@Override
	public void method263() {
		this.aClass171_1 = null;
		this.aClass8_Sub1Array1 = null;
		this.aClass171_2 = null;
		this.aClass8_Sub1_2 = null;
		this.aClass8_Sub1_1 = null;
		this.aClass106_3 = null;
		this.aClass106_2 = null;
		this.aClass106_4 = null;
		this.aClass106_1 = null;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
	@Override
	public int method265() {
		return 1;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method262(@OriginalArg(0) int arg0) {
		this.aClass46_Sub2_4.anOpengl1.glUseProgramObjectARB(0);
		this.aClass46_Sub2_4.method5225(1);
		this.aClass46_Sub2_4.method5251(null);
		this.aClass46_Sub2_4.method5225(0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	@Override
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt242 = arg0;
		this.anInt241 = arg1;
		@Pc(10) int local10 = Static159.method3097(this.anInt242);
		@Pc(15) int local15 = Static159.method3097(this.anInt241);
		if (this.anInt243 == local10 && this.anInt240 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass8_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass8_Sub1Array1.length; local28++) {
				this.aClass8_Sub1Array1[local28].method4743();
			}
			this.aClass8_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass171_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass171_1 == null) {
						this.aClass171_1 = new Class171(this.aClass46_Sub2_4);
					}
					this.aClass8_Sub1Array1 = new Class8_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass8_Sub1Array1[local55++] = new Class8_Sub1(this.aClass46_Sub2_4, 3553, 34842, local28, local53);
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
		this.anInt243 = local10;
		this.anInt240 = local15;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()Z")
	@Override
	public boolean method260() {
		return this.aClass171_2 != null;
	}
}
