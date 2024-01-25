import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class1_Sub32_Sub1 extends Class1_Sub32 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "Lclient!rq;")
	private Class18_Sub1 aClass18_Sub1_5;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "Lclient!vi;")
	private Class211 aClass211_3;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
	private int anInt6388;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "Lclient!q;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!q;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!vp", name = "u", descriptor = "Lclient!rq;")
	private Class18_Sub1 aClass18_Sub1_6;

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "[Lclient!rq;")
	private Class18_Sub1[] aClass18_Sub1Array4;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "Lclient!q;")
	private Class159 aClass159_3;

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
	private int anInt6389;

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
	private int anInt6390;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "Lclient!q;")
	private Class159 aClass159_4;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "Lclient!vi;")
	private Class211 aClass211_4;

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
	private int anInt6391;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class1_Sub32_Sub1(@OriginalArg(0) Class2_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!rq;Lclient!rq;)V")
	@Override
	public void method5590(@OriginalArg(0) int arg0, @OriginalArg(1) Class18_Sub1 arg1, @OriginalArg(2) Class18_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_39.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass18_Sub1Array4 == null) {
			this.aClass2_Sub1_39.method2376(arg1);
			this.aClass2_Sub1_39.method2339(this.aClass211_3);
			this.aClass211_3.method5536(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass159_4.anInt4790;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static336.aFloat118, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt6388, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt6388, (float) this.anInt6389);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt6389);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass2_Sub1_39.method2339(this.aClass211_4);
			local34 = Static244.method4321(this.anInt6388);
			local39 = Static244.method4321(this.anInt6389);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass211_4.method5531(0, this.aClass18_Sub1Array4[local41]);
				if (local41 == 0) {
					this.aClass2_Sub1_39.method2376(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt6388, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt6388, (float) this.anInt6389);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt6389);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass2_Sub1_39.method2376(this.aClass18_Sub1Array4[local41 - 1]);
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
			this.aClass2_Sub1_39.method2381(this.aClass211_4);
			this.aClass2_Sub1_39.method2376(this.aClass18_Sub1Array4[local41 - 1]);
			this.aClass2_Sub1_39.method2339(this.aClass211_3);
			this.aClass211_3.method5536(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass159_1.anInt4790;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static336.aFloat118, 0.0F, 0.0F);
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
		this.aClass211_3.method5536(1);
		this.aClass2_Sub1_39.method2376(this.aClass18_Sub1_5);
		local34 = this.aClass159_3.anInt4790;
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
		this.aClass211_3.method5536(0);
		this.aClass2_Sub1_39.method2376(this.aClass18_Sub1_6);
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
		this.aClass2_Sub1_39.method2381(this.aClass211_3);
		local39 = this.aClass159_2.anInt4790;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static336.aFloat117, Static336.aFloat119, 0.0F);
		this.aClass2_Sub1_39.method2373(1);
		this.aClass2_Sub1_39.method2376(this.aClass18_Sub1_5);
		this.aClass2_Sub1_39.method2373(0);
		this.aClass2_Sub1_39.method2376(arg1);
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "()I")
	@Override
	public int method5593() {
		return 1;
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
	@Override
	public void method5595(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_39.anOpengl1.glUseProgramObjectARB(0);
		this.aClass2_Sub1_39.method2373(1);
		this.aClass2_Sub1_39.method2376(null);
		this.aClass2_Sub1_39.method2373(0);
	}

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "()Z")
	public boolean method5596() {
		return this.aClass2_Sub1_39.aBoolean217 && this.aClass2_Sub1_39.aBoolean209 && this.aClass2_Sub1_39.aBoolean218;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	@Override
	public void method5591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6388 = arg0;
		this.anInt6389 = arg1;
		@Pc(10) int local10 = Static244.method4321(this.anInt6388);
		@Pc(15) int local15 = Static244.method4321(this.anInt6389);
		if (this.anInt6390 == local10 && this.anInt6391 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass18_Sub1Array4 != null) {
			for (local28 = 0; local28 < this.aClass18_Sub1Array4.length; local28++) {
				this.aClass18_Sub1Array4[local28].method4843();
			}
			this.aClass18_Sub1Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass211_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass211_4 == null) {
						this.aClass211_4 = new Class211(this.aClass2_Sub1_39);
					}
					this.aClass18_Sub1Array4 = new Class18_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass18_Sub1Array4[local55++] = new Class18_Sub1(this.aClass2_Sub1_39, 3553, 34842, local28, local53);
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
		this.anInt6390 = local10;
		this.anInt6391 = local15;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
	@Override
	public void method5587() {
		this.aClass211_4 = null;
		this.aClass18_Sub1Array4 = null;
		this.aClass211_3 = null;
		this.aClass18_Sub1_5 = null;
		this.aClass18_Sub1_6 = null;
		this.aClass159_4 = null;
		this.aClass159_1 = null;
		this.aClass159_2 = null;
		this.aClass159_3 = null;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "()Z")
	@Override
	public boolean method5592() {
		return this.aClass211_3 != null;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "()Z")
	@Override
	public boolean method5588() {
		if (!this.aClass2_Sub1_39.aBoolean217 || !this.aClass2_Sub1_39.aBoolean209 || !this.aClass2_Sub1_39.aBoolean218) {
			return false;
		}
		this.aClass211_3 = new Class211(this.aClass2_Sub1_39);
		this.aClass18_Sub1_5 = new Class18_Sub1(this.aClass2_Sub1_39, 3553, 34842, 256, 256);
		this.aClass18_Sub1_5.method500(false, false);
		this.aClass18_Sub1_6 = new Class18_Sub1(this.aClass2_Sub1_39, 3553, 34842, 256, 256);
		this.aClass18_Sub1_6.method500(false, false);
		this.aClass2_Sub1_39.method2339(this.aClass211_3);
		this.aClass211_3.method5531(0, this.aClass18_Sub1_5);
		this.aClass211_3.method5531(1, this.aClass18_Sub1_6);
		this.aClass211_3.method5536(0);
		if (!this.aClass211_3.method5530()) {
			this.aClass2_Sub1_39.method2381(this.aClass211_3);
			return false;
		}
		this.aClass2_Sub1_39.method2381(this.aClass211_3);
		this.aClass159_4 = Static246.method4358(this.aClass2_Sub1_39, new Class40[] { Static64.method1326(this.aClass2_Sub1_39, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass159_1 = Static246.method4358(this.aClass2_Sub1_39, new Class40[] { Static64.method1326(this.aClass2_Sub1_39, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass159_2 = Static246.method4358(this.aClass2_Sub1_39, new Class40[] { Static64.method1326(this.aClass2_Sub1_39, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass159_3 = Static246.method4358(this.aClass2_Sub1_39, new Class40[] { Static64.method1326(this.aClass2_Sub1_39, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass159_1 != null && this.aClass159_4 != null && this.aClass159_2 != null && this.aClass159_3 != null;
	}
}
