import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class1_Sub42_Sub1 extends Class1_Sub42 {

	@OriginalMember(owner = "client!up", name = "G", descriptor = "[Lclient!jp;")
	private Class21_Sub2[] aClass21_Sub2Array4;

	@OriginalMember(owner = "client!up", name = "H", descriptor = "Lclient!bb;")
	private Class19 aClass19_6;

	@OriginalMember(owner = "client!up", name = "I", descriptor = "Lclient!v;")
	private Class249 aClass249_4;

	@OriginalMember(owner = "client!up", name = "J", descriptor = "I")
	private int anInt7227;

	@OriginalMember(owner = "client!up", name = "O", descriptor = "Lclient!v;")
	private Class249 aClass249_5;

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "Lclient!v;")
	private Class249 aClass249_6;

	@OriginalMember(owner = "client!up", name = "W", descriptor = "Lclient!bb;")
	private Class19 aClass19_7;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "I")
	private int anInt7237;

	@OriginalMember(owner = "client!up", name = "bb", descriptor = "I")
	private int anInt7239;

	@OriginalMember(owner = "client!up", name = "cb", descriptor = "I")
	private int anInt7240;

	@OriginalMember(owner = "client!up", name = "db", descriptor = "Lclient!jp;")
	private Class21_Sub2 aClass21_Sub2_6;

	@OriginalMember(owner = "client!up", name = "eb", descriptor = "Lclient!v;")
	private Class249 aClass249_7;

	@OriginalMember(owner = "client!up", name = "fb", descriptor = "Lclient!jp;")
	private Class21_Sub2 aClass21_Sub2_7;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class1_Sub42_Sub1(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	@Override
	public void method5571(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass121_Sub2_38.method4669(1);
		super.aClass121_Sub2_38.method4681(null);
		super.aClass121_Sub2_38.method4669(0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7239 = arg0;
		this.anInt7240 = arg1;
		@Pc(16) int local16 = Static81.method1178(this.anInt7239);
		@Pc(21) int local21 = Static81.method1178(this.anInt7240);
		if (local16 == this.anInt7237 && this.anInt7227 == local21) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass21_Sub2Array4 != null) {
			for (local38 = 0; local38 < this.aClass21_Sub2Array4.length; local38++) {
				this.aClass21_Sub2Array4[local38].method3752();
			}
			this.aClass21_Sub2Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass19_6 = null;
		} else {
			local38 = local16;
			@Pc(78) int local78 = local21;
			@Pc(80) int local80 = 0;
			if (this.aClass19_6 == null) {
				this.aClass19_6 = new Class19(super.aClass121_Sub2_38);
			}
			label54: while (true) {
				if (local38 <= 256 && local78 <= 256) {
					local78 = local21;
					this.aClass21_Sub2Array4 = new Class21_Sub2[local80];
					local38 = local16;
					local80 = 0;
					while (true) {
						if (local38 <= 256 && local78 <= 256) {
							break label54;
						}
						this.aClass21_Sub2Array4[local80++] = new Class21_Sub2(super.aClass121_Sub2_38, 3553, 34842, local38, local78);
						if (local38 > 256) {
							local38 >>= 0x1;
						}
						if (local78 > 256) {
							local78 >>= 0x1;
						}
					}
				}
				local80++;
				if (local78 > 256) {
					local78 >>= 0x1;
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
			}
		}
		this.anInt7237 = local16;
		this.anInt7227 = local21;
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5574() {
		if (!super.aClass121_Sub2_38.aBoolean466 || !super.aClass121_Sub2_38.aBoolean465 || !super.aClass121_Sub2_38.aBoolean469) {
			return false;
		}
		this.aClass19_7 = new Class19(super.aClass121_Sub2_38);
		this.aClass21_Sub2_6 = new Class21_Sub2(super.aClass121_Sub2_38, 3553, 34842, 256, 256);
		this.aClass21_Sub2_6.method3487(false, false);
		this.aClass21_Sub2_7 = new Class21_Sub2(super.aClass121_Sub2_38, 3553, 34842, 256, 256);
		this.aClass21_Sub2_7.method3487(false, false);
		super.aClass121_Sub2_38.method4675(this.aClass19_7);
		this.aClass19_7.method324(this.aClass21_Sub2_6, 0);
		this.aClass19_7.method324(this.aClass21_Sub2_7, 1);
		this.aClass19_7.method310(0);
		if (!this.aClass19_7.method320()) {
			super.aClass121_Sub2_38.method4699(this.aClass19_7);
			return false;
		}
		super.aClass121_Sub2_38.method4699(this.aClass19_7);
		this.aClass249_7 = Static309.method4242(super.aClass121_Sub2_38, new Class259[] { Static216.method3232(35632, super.aClass121_Sub2_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass249_6 = Static309.method4242(super.aClass121_Sub2_38, new Class259[] { Static216.method3232(35632, super.aClass121_Sub2_38, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass249_5 = Static309.method4242(super.aClass121_Sub2_38, new Class259[] { Static216.method3232(35632, super.aClass121_Sub2_38, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass249_4 = Static309.method4242(super.aClass121_Sub2_38, new Class259[] { Static216.method3232(35632, super.aClass121_Sub2_38, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass249_6 != null && this.aClass249_7 != null && this.aClass249_5 != null && this.aClass249_4 != null;
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z")
	public boolean method5581() {
		return super.aClass121_Sub2_38.aBoolean466 && super.aClass121_Sub2_38.aBoolean465 && super.aClass121_Sub2_38.aBoolean469;
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5576() {
		return this.aClass19_7 != null;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!jp;ILclient!jp;I)V")
	@Override
	public void method5575(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(267) long local267;
		if (this.aClass21_Sub2Array4 == null) {
			super.aClass121_Sub2_38.method4681(arg2);
			super.aClass121_Sub2_38.method4675(this.aClass19_7);
			this.aClass19_7.method310(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass249_7.aLong215;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static27.aFloat5, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt7239, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt7239, (float) this.anInt7240);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt7240);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass121_Sub2_38.method4675(this.aClass19_6);
			@Pc(32) int local32 = Static81.method1178(this.anInt7239);
			@Pc(37) int local37 = Static81.method1178(this.anInt7240);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass19_6.method324(this.aClass21_Sub2Array4[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass121_Sub2_38.method4681(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt7239, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt7239, (float) this.anInt7240);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7240);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass121_Sub2_38.method4681(this.aClass21_Sub2Array4[local39 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass121_Sub2_38.method4699(this.aClass19_6);
			super.aClass121_Sub2_38.method4681(this.aClass21_Sub2Array4[local39 - 1]);
			super.aClass121_Sub2_38.method4675(this.aClass19_7);
			this.aClass19_7.method310(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(197) long local197 = this.aClass249_6.aLong215;
			OpenGL.glUseProgramObjectARB(local197);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local197, "params"), Static27.aFloat5, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass19_7.method310(1);
		super.aClass121_Sub2_38.method4681(this.aClass21_Sub2_6);
		local267 = this.aClass249_4.aLong215;
		OpenGL.glUseProgramObjectARB(local267);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass19_7.method310(0);
		super.aClass121_Sub2_38.method4681(this.aClass21_Sub2_7);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		super.aClass121_Sub2_38.method4699(this.aClass19_7);
		@Pc(435) long local435 = this.aClass249_5.aLong215;
		OpenGL.glUseProgramObjectARB(local435);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local435, "params"), Static288.aFloat80, Static29.aFloat6, 0.0F);
		super.aClass121_Sub2_38.method4669(1);
		super.aClass121_Sub2_38.method4681(this.aClass21_Sub2_6);
		super.aClass121_Sub2_38.method4669(0);
		super.aClass121_Sub2_38.method4681(arg2);
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
	@Override
	public void method5579() {
		this.aClass249_6 = null;
		this.aClass21_Sub2_7 = null;
		this.aClass19_6 = null;
		this.aClass19_7 = null;
		this.aClass249_4 = null;
		this.aClass21_Sub2Array4 = null;
		this.aClass21_Sub2_6 = null;
		this.aClass249_7 = null;
		this.aClass249_5 = null;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)I")
	@Override
	public int method5572() {
		return 1;
	}
}
