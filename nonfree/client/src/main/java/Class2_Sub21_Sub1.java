import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class2_Sub21_Sub1 extends Class2_Sub21 {

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "[Lclient!tr;")
	private Class81_Sub2[] aClass81_Sub2Array3;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "Lclient!w;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "Lclient!tr;")
	private Class81_Sub2 aClass81_Sub2_4;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Lclient!w;")
	private Class242 aClass242_2;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "Lclient!w;")
	private Class242 aClass242_3;

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
	private int anInt3420;

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
	private int anInt3422;

	@OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
	private int anInt3423;

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "Lclient!js;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "Lclient!w;")
	private Class242 aClass242_4;

	@OriginalMember(owner = "client!jn", name = "E", descriptor = "Lclient!js;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!jn", name = "F", descriptor = "Lclient!tr;")
	private Class81_Sub2 aClass81_Sub2_5;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class2_Sub21_Sub1(@OriginalArg(0) Class48_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "()I")
	@Override
	public int method2934() {
		return 1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
	@Override
	public void method2929() {
		this.aClass121_2 = null;
		this.aClass81_Sub2Array3 = null;
		this.aClass121_3 = null;
		this.aClass81_Sub2_5 = null;
		this.aClass81_Sub2_4 = null;
		this.aClass242_2 = null;
		this.aClass242_1 = null;
		this.aClass242_4 = null;
		this.aClass242_3 = null;
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "()Z")
	public boolean method2939() {
		return this.aClass48_Sub2_15.aBoolean229 && this.aClass48_Sub2_15.aBoolean226 && this.aClass48_Sub2_15.aBoolean238;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	@Override
	public void method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3420 = arg0;
		this.anInt3423 = arg1;
		@Pc(10) int local10 = Static65.method1195(this.anInt3420);
		@Pc(15) int local15 = Static65.method1195(this.anInt3423);
		if (this.anInt3421 == local10 && this.anInt3422 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass81_Sub2Array3 != null) {
			for (local28 = 0; local28 < this.aClass81_Sub2Array3.length; local28++) {
				this.aClass81_Sub2Array3[local28].method4339();
			}
			this.aClass81_Sub2Array3 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass121_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass121_2 == null) {
						this.aClass121_2 = new Class121(this.aClass48_Sub2_15);
					}
					this.aClass81_Sub2Array3 = new Class81_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass81_Sub2Array3[local55++] = new Class81_Sub2(this.aClass48_Sub2_15, 3553, 34842, local28, local53);
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
		this.anInt3421 = local10;
		this.anInt3422 = local15;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	@Override
	public void method2933(@OriginalArg(0) int arg0) {
		this.aClass48_Sub2_15.anOpengl2.glUseProgramObjectARB(0);
		this.aClass48_Sub2_15.method2566(1);
		this.aClass48_Sub2_15.method2573(null);
		this.aClass48_Sub2_15.method2566(0);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "()Z")
	@Override
	public boolean method2930() {
		return this.aClass121_3 != null;
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "()Z")
	@Override
	public boolean method2935() {
		if (!this.aClass48_Sub2_15.aBoolean229 || !this.aClass48_Sub2_15.aBoolean226 || !this.aClass48_Sub2_15.aBoolean238) {
			return false;
		}
		this.aClass121_3 = new Class121(this.aClass48_Sub2_15);
		this.aClass81_Sub2_5 = new Class81_Sub2(this.aClass48_Sub2_15, 3553, 34842, 256, 256);
		this.aClass81_Sub2_5.method3640(false, false);
		this.aClass81_Sub2_4 = new Class81_Sub2(this.aClass48_Sub2_15, 3553, 34842, 256, 256);
		this.aClass81_Sub2_4.method3640(false, false);
		this.aClass48_Sub2_15.method2556(this.aClass121_3);
		this.aClass121_3.method3029(0, this.aClass81_Sub2_5);
		this.aClass121_3.method3029(1, this.aClass81_Sub2_4);
		this.aClass121_3.method3030(0);
		if (!this.aClass121_3.method3028()) {
			this.aClass48_Sub2_15.method2608(this.aClass121_3);
			return false;
		}
		this.aClass48_Sub2_15.method2608(this.aClass121_3);
		this.aClass242_2 = Static377.method5963(this.aClass48_Sub2_15, new Class101[] { Static138.method2380(this.aClass48_Sub2_15, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass242_1 = Static377.method5963(this.aClass48_Sub2_15, new Class101[] { Static138.method2380(this.aClass48_Sub2_15, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass242_4 = Static377.method5963(this.aClass48_Sub2_15, new Class101[] { Static138.method2380(this.aClass48_Sub2_15, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass242_3 = Static377.method5963(this.aClass48_Sub2_15, new Class101[] { Static138.method2380(this.aClass48_Sub2_15, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass242_1 != null && this.aClass242_2 != null && this.aClass242_4 != null && this.aClass242_3 != null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!tr;Lclient!tr;)V")
	@Override
	public void method2937(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub2 arg1, @OriginalArg(2) Class81_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass48_Sub2_15.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass81_Sub2Array3 == null) {
			this.aClass48_Sub2_15.method2573(arg1);
			this.aClass48_Sub2_15.method2556(this.aClass121_3);
			this.aClass121_3.method3030(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass242_2.anInt6903;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static166.aFloat45, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt3420, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt3420, (float) this.anInt3423);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt3423);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass48_Sub2_15.method2556(this.aClass121_2);
			local34 = Static65.method1195(this.anInt3420);
			local39 = Static65.method1195(this.anInt3423);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass121_2.method3029(0, this.aClass81_Sub2Array3[local41]);
				if (local41 == 0) {
					this.aClass48_Sub2_15.method2573(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt3420, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt3420, (float) this.anInt3423);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt3423);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass48_Sub2_15.method2573(this.aClass81_Sub2Array3[local41 - 1]);
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
			this.aClass48_Sub2_15.method2608(this.aClass121_2);
			this.aClass48_Sub2_15.method2573(this.aClass81_Sub2Array3[local41 - 1]);
			this.aClass48_Sub2_15.method2556(this.aClass121_3);
			this.aClass121_3.method3030(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass242_1.anInt6903;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static166.aFloat45, 0.0F, 0.0F);
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
		this.aClass121_3.method3030(1);
		this.aClass48_Sub2_15.method2573(this.aClass81_Sub2_5);
		local34 = this.aClass242_3.anInt6903;
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
		this.aClass121_3.method3030(0);
		this.aClass48_Sub2_15.method2573(this.aClass81_Sub2_4);
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
		this.aClass48_Sub2_15.method2608(this.aClass121_3);
		local39 = this.aClass242_4.anInt6903;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static166.aFloat44, Static166.aFloat43, 0.0F);
		this.aClass48_Sub2_15.method2566(1);
		this.aClass48_Sub2_15.method2573(this.aClass81_Sub2_5);
		this.aClass48_Sub2_15.method2566(0);
		this.aClass48_Sub2_15.method2573(arg1);
	}
}
