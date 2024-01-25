import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class12_Sub43_Sub1 extends Class12_Sub43 {

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
	private int anInt8807;

	@OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
	private int anInt8809;

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
	private int anInt8810;

	@OriginalMember(owner = "client!uaa", name = "D", descriptor = "Lclient!ob;")
	private Class79_Sub2 aClass79_Sub2_4;

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "Lclient!iu;")
	private Class150 aClass150_4;

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "Lclient!iu;")
	private Class150 aClass150_5;

	@OriginalMember(owner = "client!uaa", name = "I", descriptor = "Lclient!aea;")
	private Class9 aClass9_5;

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
	private int anInt8814;

	@OriginalMember(owner = "client!uaa", name = "K", descriptor = "Lclient!iu;")
	private Class150 aClass150_6;

	@OriginalMember(owner = "client!uaa", name = "L", descriptor = "Lclient!iu;")
	private Class150 aClass150_7;

	@OriginalMember(owner = "client!uaa", name = "M", descriptor = "Lclient!ob;")
	private Class79_Sub2 aClass79_Sub2_5;

	@OriginalMember(owner = "client!uaa", name = "T", descriptor = "[Lclient!ob;")
	private Class79_Sub2[] aClass79_Sub2Array4;

	@OriginalMember(owner = "client!uaa", name = "W", descriptor = "Lclient!aea;")
	private Class9 aClass9_6;

	static {
		new Class88("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class12_Sub43_Sub1(@OriginalArg(0) Class42_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!ob;IILclient!ob;)V")
	@Override
	public void method7235(@OriginalArg(0) Class79_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class79_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(50) long local50;
		if (this.aClass79_Sub2Array4 == null) {
			super.aClass42_Sub3_37.method3219(arg0);
			super.aClass42_Sub3_37.method3211(this.aClass9_6);
			this.aClass9_6.method288(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local50 = this.aClass150_4.aLong125;
			OpenGL.glUseProgramObjectARB(local50);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "params"), Static45.aFloat9, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8810, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8810, (float) this.anInt8814);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8814);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass42_Sub3_37.method3211(this.aClass9_5);
			@Pc(112) int local112 = Static472.method7121(this.anInt8810);
			@Pc(117) int local117 = Static472.method7121(this.anInt8814);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass9_5.method275(this.aClass79_Sub2Array4[local119], 0);
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass42_Sub3_37.method3219(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8810, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8810, (float) this.anInt8814);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8814);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass42_Sub3_37.method3219(this.aClass79_Sub2Array4[local119 - 1]);
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
				local119++;
			}
			super.aClass42_Sub3_37.method3256(this.aClass9_5);
			super.aClass42_Sub3_37.method3219(this.aClass79_Sub2Array4[local119 - 1]);
			super.aClass42_Sub3_37.method3211(this.aClass9_6);
			this.aClass9_6.method288(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(281) long local281 = this.aClass150_6.aLong125;
			OpenGL.glUseProgramObjectARB(local281);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local281, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "params"), Static45.aFloat9, 0.0F, 0.0F);
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
		this.aClass9_6.method288(1);
		super.aClass42_Sub3_37.method3219(this.aClass79_Sub2_4);
		local50 = this.aClass150_5.aLong125;
		OpenGL.glUseProgramObjectARB(local50);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local50, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass9_6.method288(0);
		super.aClass42_Sub3_37.method3219(this.aClass79_Sub2_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local50, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass42_Sub3_37.method3256(this.aClass9_6);
		@Pc(451) long local451 = this.aClass150_7.aLong125;
		OpenGL.glUseProgramObjectARB(local451);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local451, "params"), Static530.aFloat194, Static109.aFloat58, 0.0F);
		super.aClass42_Sub3_37.method3259(1);
		super.aClass42_Sub3_37.method3219(this.aClass79_Sub2_4);
		super.aClass42_Sub3_37.method3259(0);
		super.aClass42_Sub3_37.method3219(arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
	@Override
	public int method7231() {
		return 1;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	@Override
	public void method7226() {
		this.aClass150_4 = null;
		this.aClass79_Sub2_4 = null;
		this.aClass150_5 = null;
		this.aClass9_5 = null;
		this.aClass150_7 = null;
		this.aClass9_6 = null;
		this.aClass79_Sub2Array4 = null;
		this.aClass150_6 = null;
		this.aClass79_Sub2_5 = null;
	}

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "(I)Z")
	public boolean method7237() {
		return super.aClass42_Sub3_37.aBoolean305 && super.aClass42_Sub3_37.aBoolean302 && super.aClass42_Sub3_37.aBoolean298;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB((long) 0);
		super.aClass42_Sub3_37.method3259(1);
		super.aClass42_Sub3_37.method3219(null);
		super.aClass42_Sub3_37.method3259(0);
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7234() {
		if (!super.aClass42_Sub3_37.aBoolean305 || !super.aClass42_Sub3_37.aBoolean302 || !super.aClass42_Sub3_37.aBoolean298) {
			return false;
		}
		this.aClass9_6 = new Class9(super.aClass42_Sub3_37);
		this.aClass79_Sub2_4 = new Class79_Sub2(super.aClass42_Sub3_37, 3553, 34842, 256, 256);
		this.aClass79_Sub2_4.method2529(false, false);
		this.aClass79_Sub2_5 = new Class79_Sub2(super.aClass42_Sub3_37, 3553, 34842, 256, 256);
		this.aClass79_Sub2_5.method2529(false, false);
		super.aClass42_Sub3_37.method3211(this.aClass9_6);
		this.aClass9_6.method275(this.aClass79_Sub2_4, 0);
		this.aClass9_6.method275(this.aClass79_Sub2_5, 1);
		this.aClass9_6.method288(0);
		if (!this.aClass9_6.method284()) {
			super.aClass42_Sub3_37.method3256(this.aClass9_6);
			return false;
		}
		super.aClass42_Sub3_37.method3256(this.aClass9_6);
		this.aClass150_4 = Static152.method3025(new Class272[] { Static67.method1543(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass42_Sub3_37) }, super.aClass42_Sub3_37);
		this.aClass150_6 = Static152.method3025(new Class272[] { Static67.method1543(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass42_Sub3_37) }, super.aClass42_Sub3_37);
		this.aClass150_7 = Static152.method3025(new Class272[] { Static67.method1543(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass42_Sub3_37) }, super.aClass42_Sub3_37);
		this.aClass150_5 = Static152.method3025(new Class272[] { Static67.method1543(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass42_Sub3_37) }, super.aClass42_Sub3_37);
		return this.aClass150_6 != null && this.aClass150_4 != null && this.aClass150_7 != null && this.aClass150_5 != null;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(III)V")
	@Override
	public void method7228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8810 = arg0;
		this.anInt8814 = arg1;
		@Pc(20) int local20 = Static472.method7121(this.anInt8810);
		@Pc(25) int local25 = Static472.method7121(this.anInt8814);
		if (this.anInt8809 == local20 && this.anInt8807 == local25) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass79_Sub2Array4 != null) {
			for (local38 = 0; local38 < this.aClass79_Sub2Array4.length; local38++) {
				this.aClass79_Sub2Array4[local38].method5271();
			}
			this.aClass79_Sub2Array4 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass9_5 = null;
		} else {
			local38 = local20;
			@Pc(78) int local78 = local25;
			@Pc(80) int local80 = 0;
			if (this.aClass9_5 == null) {
				this.aClass9_5 = new Class9(super.aClass42_Sub3_37);
			}
			label54: while (true) {
				if (local38 <= 256 && local78 <= 256) {
					local38 = local20;
					local78 = local25;
					this.aClass79_Sub2Array4 = new Class79_Sub2[local80];
					local80 = 0;
					while (true) {
						if (local38 <= 256 && local78 <= 256) {
							break label54;
						}
						this.aClass79_Sub2Array4[local80++] = new Class79_Sub2(super.aClass42_Sub3_37, 3553, 34842, local38, local78);
						if (local78 > 256) {
							local78 >>= 0x1;
						}
						if (local38 > 256) {
							local38 >>= 0x1;
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
		this.anInt8807 = local25;
		this.anInt8809 = local20;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7230() {
		return this.aClass9_6 != null;
	}
}
