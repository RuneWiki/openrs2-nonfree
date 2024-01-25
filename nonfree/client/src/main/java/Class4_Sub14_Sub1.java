import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class4_Sub14_Sub1 extends Class4_Sub14 {

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	private int anInt1566;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Lclient!ie;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Lclient!hf;")
	private Class52_Sub1 aClass52_Sub1_2;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!ie;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "Lclient!gg;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	private int anInt1567;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	private int anInt1568;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Lclient!ie;")
	private Class94 aClass94_3;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "[Lclient!hf;")
	private Class52_Sub1[] aClass52_Sub1Array1;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!ie;")
	private Class94 aClass94_4;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "Lclient!hf;")
	private Class52_Sub1 aClass52_Sub1_3;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
	private int anInt1569;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "Lclient!gg;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class4_Sub14_Sub1(@OriginalArg(0) Class47_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
	@Override
	public void method1256() {
		this.aClass77_2 = null;
		this.aClass52_Sub1Array1 = null;
		this.aClass77_1 = null;
		this.aClass52_Sub1_2 = null;
		this.aClass52_Sub1_3 = null;
		this.aClass94_1 = null;
		this.aClass94_4 = null;
		this.aClass94_2 = null;
		this.aClass94_3 = null;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()Z")
	public boolean method1264() {
		return this.aClass47_Sub2_7.aBoolean228 && this.aClass47_Sub2_7.aBoolean231 && this.aClass47_Sub2_7.aBoolean223;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
	@Override
	public int method1257() {
		return 1;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
	@Override
	public boolean method1262() {
		if (!this.aClass47_Sub2_7.aBoolean228 || !this.aClass47_Sub2_7.aBoolean231 || !this.aClass47_Sub2_7.aBoolean223) {
			return false;
		}
		this.aClass77_1 = new Class77(this.aClass47_Sub2_7);
		this.aClass52_Sub1_2 = new Class52_Sub1(this.aClass47_Sub2_7, 3553, 34842, 256, 256);
		this.aClass52_Sub1_2.method4734(false, false);
		this.aClass52_Sub1_3 = new Class52_Sub1(this.aClass47_Sub2_7, 3553, 34842, 256, 256);
		this.aClass52_Sub1_3.method4734(false, false);
		this.aClass47_Sub2_7.method2767(this.aClass77_1);
		this.aClass77_1.method2291(0, this.aClass52_Sub1_2);
		this.aClass77_1.method2291(1, this.aClass52_Sub1_3);
		this.aClass77_1.method2295(0);
		if (!this.aClass77_1.method2293()) {
			this.aClass47_Sub2_7.method2808(this.aClass77_1);
			return false;
		}
		this.aClass47_Sub2_7.method2808(this.aClass77_1);
		this.aClass94_1 = Static130.method2654(this.aClass47_Sub2_7, new Class17[] { Static21.method336(this.aClass47_Sub2_7, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass94_4 = Static130.method2654(this.aClass47_Sub2_7, new Class17[] { Static21.method336(this.aClass47_Sub2_7, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass94_2 = Static130.method2654(this.aClass47_Sub2_7, new Class17[] { Static21.method336(this.aClass47_Sub2_7, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass94_3 = Static130.method2654(this.aClass47_Sub2_7, new Class17[] { Static21.method336(this.aClass47_Sub2_7, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass94_4 != null && this.aClass94_1 != null && this.aClass94_2 != null && this.aClass94_3 != null;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	@Override
	public void method1260(@OriginalArg(0) int arg0) {
		this.aClass47_Sub2_7.anOpengl2.glUseProgramObjectARB(0);
		this.aClass47_Sub2_7.method2828(1);
		this.aClass47_Sub2_7.method2772(null);
		this.aClass47_Sub2_7.method2828(0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!hf;Lclient!hf;)V")
	@Override
	public void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) Class52_Sub1 arg1, @OriginalArg(2) Class52_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass47_Sub2_7.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass52_Sub1Array1 == null) {
			this.aClass47_Sub2_7.method2772(arg1);
			this.aClass47_Sub2_7.method2767(this.aClass77_1);
			this.aClass77_1.method2295(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass94_1.anInt3041;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static59.aFloat14, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt1566, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt1566, (float) this.anInt1567);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt1567);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass47_Sub2_7.method2767(this.aClass77_2);
			local34 = Static45.method916(this.anInt1566);
			local39 = Static45.method916(this.anInt1567);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass77_2.method2291(0, this.aClass52_Sub1Array1[local41]);
				if (local41 == 0) {
					this.aClass47_Sub2_7.method2772(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt1566, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt1566, (float) this.anInt1567);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt1567);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass47_Sub2_7.method2772(this.aClass52_Sub1Array1[local41 - 1]);
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
			this.aClass47_Sub2_7.method2808(this.aClass77_2);
			this.aClass47_Sub2_7.method2772(this.aClass52_Sub1Array1[local41 - 1]);
			this.aClass47_Sub2_7.method2767(this.aClass77_1);
			this.aClass77_1.method2295(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass94_4.anInt3041;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static59.aFloat14, 0.0F, 0.0F);
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
		this.aClass77_1.method2295(1);
		this.aClass47_Sub2_7.method2772(this.aClass52_Sub1_2);
		local34 = this.aClass94_3.anInt3041;
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
		this.aClass77_1.method2295(0);
		this.aClass47_Sub2_7.method2772(this.aClass52_Sub1_3);
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
		this.aClass47_Sub2_7.method2808(this.aClass77_1);
		local39 = this.aClass94_2.anInt3041;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static59.aFloat13, Static59.aFloat12, 0.0F);
		this.aClass47_Sub2_7.method2828(1);
		this.aClass47_Sub2_7.method2772(this.aClass52_Sub1_2);
		this.aClass47_Sub2_7.method2828(0);
		this.aClass47_Sub2_7.method2772(arg1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()Z")
	@Override
	public boolean method1255() {
		return this.aClass77_1 != null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	@Override
	public void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1566 = arg0;
		this.anInt1567 = arg1;
		@Pc(10) int local10 = Static45.method916(this.anInt1566);
		@Pc(15) int local15 = Static45.method916(this.anInt1567);
		if (this.anInt1569 == local10 && this.anInt1568 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass52_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass52_Sub1Array1.length; local28++) {
				this.aClass52_Sub1Array1[local28].method5612();
			}
			this.aClass52_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass77_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass77_2 == null) {
						this.aClass77_2 = new Class77(this.aClass47_Sub2_7);
					}
					this.aClass52_Sub1Array1 = new Class52_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass52_Sub1Array1[local55++] = new Class52_Sub1(this.aClass47_Sub2_7, 3553, 34842, local28, local53);
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
		this.anInt1569 = local10;
		this.anInt1568 = local15;
	}
}
