import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!qb;")
	private Class19_Sub3 aClass19_Sub3_5;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Lclient!wg;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	private int anInt6053;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!wg;")
	private Class219 aClass219_2;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!wg;")
	private Class219 aClass219_3;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!tj;")
	private Class197 aClass197_3;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!wg;")
	private Class219 aClass219_4;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	private int anInt6054;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Lclient!qb;")
	private Class19_Sub3 aClass19_Sub3_6;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "I")
	private int anInt6055;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "[Lclient!qb;")
	private Class19_Sub3[] aClass19_Sub3Array4;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	private int anInt6056;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Lclient!tj;")
	private Class197 aClass197_4;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) Class63_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	@Override
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6056 = arg0;
		this.anInt6054 = arg1;
		@Pc(10) int local10 = Static294.method5142(this.anInt6056);
		@Pc(15) int local15 = Static294.method5142(this.anInt6054);
		if (this.anInt6053 == local10 && this.anInt6055 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass19_Sub3Array4 != null) {
			for (local28 = 0; local28 < this.aClass19_Sub3Array4.length; local28++) {
				this.aClass19_Sub3Array4[local28].method4234();
			}
			this.aClass19_Sub3Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass197_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass197_3 == null) {
						this.aClass197_3 = new Class197(this.aClass63_Sub1_40);
					}
					this.aClass19_Sub3Array4 = new Class19_Sub3[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass19_Sub3Array4[local55++] = new Class19_Sub3(this.aClass63_Sub1_40, 3553, 34842, local28, local53);
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
		this.anInt6053 = local10;
		this.anInt6055 = local15;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()Z")
	@Override
	public boolean method5460() {
		if (!this.aClass63_Sub1_40.aBoolean254 || !this.aClass63_Sub1_40.aBoolean256 || !this.aClass63_Sub1_40.aBoolean266) {
			return false;
		}
		this.aClass197_4 = new Class197(this.aClass63_Sub1_40);
		this.aClass19_Sub3_5 = new Class19_Sub3(this.aClass63_Sub1_40, 3553, 34842, 256, 256);
		this.aClass19_Sub3_5.method3681(false, false);
		this.aClass19_Sub3_6 = new Class19_Sub3(this.aClass63_Sub1_40, 3553, 34842, 256, 256);
		this.aClass19_Sub3_6.method3681(false, false);
		this.aClass63_Sub1_40.method3329(this.aClass197_4);
		this.aClass197_4.method5360(0, this.aClass19_Sub3_5);
		this.aClass197_4.method5360(1, this.aClass19_Sub3_6);
		this.aClass197_4.method5357(0);
		if (!this.aClass197_4.method5356()) {
			this.aClass63_Sub1_40.method3377(this.aClass197_4);
			return false;
		}
		this.aClass63_Sub1_40.method3377(this.aClass197_4);
		this.aClass219_2 = Static358.method5932(this.aClass63_Sub1_40, new Class170[] { Static256.method4774(this.aClass63_Sub1_40, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass219_4 = Static358.method5932(this.aClass63_Sub1_40, new Class170[] { Static256.method4774(this.aClass63_Sub1_40, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass219_3 = Static358.method5932(this.aClass63_Sub1_40, new Class170[] { Static256.method4774(this.aClass63_Sub1_40, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass219_1 = Static358.method5932(this.aClass63_Sub1_40, new Class170[] { Static256.method4774(this.aClass63_Sub1_40, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass219_4 != null && this.aClass219_2 != null && this.aClass219_3 != null && this.aClass219_1 != null;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		this.aClass63_Sub1_40.anOpengl1.glUseProgramObjectARB(0);
		this.aClass63_Sub1_40.method3345(1);
		this.aClass63_Sub1_40.method3355(null);
		this.aClass63_Sub1_40.method3345(0);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()Z")
	public boolean method5461() {
		return this.aClass63_Sub1_40.aBoolean254 && this.aClass63_Sub1_40.aBoolean256 && this.aClass63_Sub1_40.aBoolean266;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	@Override
	public int method5454() {
		return 1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qb;Lclient!qb;)V")
	@Override
	public void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub3 arg1, @OriginalArg(2) Class19_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass63_Sub1_40.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass19_Sub3Array4 == null) {
			this.aClass63_Sub1_40.method3355(arg1);
			this.aClass63_Sub1_40.method3329(this.aClass197_4);
			this.aClass197_4.method5357(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass219_2.anInt6855;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static316.aFloat59, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt6056, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt6056, (float) this.anInt6054);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt6054);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass63_Sub1_40.method3329(this.aClass197_3);
			local34 = Static294.method5142(this.anInt6056);
			local39 = Static294.method5142(this.anInt6054);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass197_3.method5360(0, this.aClass19_Sub3Array4[local41]);
				if (local41 == 0) {
					this.aClass63_Sub1_40.method3355(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt6056, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt6056, (float) this.anInt6054);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt6054);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass63_Sub1_40.method3355(this.aClass19_Sub3Array4[local41 - 1]);
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
			this.aClass63_Sub1_40.method3377(this.aClass197_3);
			this.aClass63_Sub1_40.method3355(this.aClass19_Sub3Array4[local41 - 1]);
			this.aClass63_Sub1_40.method3329(this.aClass197_4);
			this.aClass197_4.method5357(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass219_4.anInt6855;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static316.aFloat59, 0.0F, 0.0F);
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
		this.aClass197_4.method5357(1);
		this.aClass63_Sub1_40.method3355(this.aClass19_Sub3_5);
		local34 = this.aClass219_1.anInt6855;
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
		this.aClass197_4.method5357(0);
		this.aClass63_Sub1_40.method3355(this.aClass19_Sub3_6);
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
		this.aClass63_Sub1_40.method3377(this.aClass197_4);
		local39 = this.aClass219_3.anInt6855;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static316.aFloat61, Static316.aFloat60, 0.0F);
		this.aClass63_Sub1_40.method3345(1);
		this.aClass63_Sub1_40.method3355(this.aClass19_Sub3_5);
		this.aClass63_Sub1_40.method3345(0);
		this.aClass63_Sub1_40.method3355(arg1);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()Z")
	@Override
	public boolean method5455() {
		return this.aClass197_4 != null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	@Override
	public void method5452() {
		this.aClass197_3 = null;
		this.aClass19_Sub3Array4 = null;
		this.aClass197_4 = null;
		this.aClass19_Sub3_5 = null;
		this.aClass19_Sub3_6 = null;
		this.aClass219_2 = null;
		this.aClass219_4 = null;
		this.aClass219_3 = null;
		this.aClass219_1 = null;
	}
}
