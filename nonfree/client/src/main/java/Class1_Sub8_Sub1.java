import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "Lclient!wn;")
	private Class40_Sub3 aClass40_Sub3_1;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "Lclient!hca;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "Lclient!hca;")
	private Class132 aClass132_2;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "Lclient!faa;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "Lclient!faa;")
	private Class98 aClass98_2;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "Lclient!hca;")
	private Class132 aClass132_3;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Lclient!wn;")
	private Class40_Sub3 aClass40_Sub3_2;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "Lclient!hca;")
	private Class132 aClass132_4;

	@OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "[Lclient!wn;")
	private Class40_Sub3[] aClass40_Sub3Array1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class134_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)I")
	@Override
	public int method587() {
		return 1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	@Override
	public void method586(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass134_Sub2_2.method5197(1);
		super.aClass134_Sub2_2.method5202(null);
		super.aClass134_Sub2_2.method5197(0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method591() {
		return this.aClass98_2 != null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!wn;ILclient!wn;)V")
	@Override
	public void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class40_Sub3 arg1, @OriginalArg(3) Class40_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(48) long local48;
		if (this.aClass40_Sub3Array1 == null) {
			super.aClass134_Sub2_2.method5202(arg1);
			super.aClass134_Sub2_2.method5275(this.aClass98_2);
			this.aClass98_2.method1979(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local48 = this.aClass132_1.aLong105;
			OpenGL.glUseProgramObjectARB(local48);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "params"), Static442.aFloat179, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt652, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt652, (float) this.anInt660);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt660);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass134_Sub2_2.method5275(this.aClass98_1);
			@Pc(114) int local114 = Static558.method7589(this.anInt652);
			@Pc(119) int local119 = Static558.method7589(this.anInt660);
			@Pc(121) int local121 = 0;
			while (local114 > 256 || local119 > 256) {
				OpenGL.glViewport(0, 0, local114, local119);
				this.aClass98_1.method1981(this.aClass40_Sub3Array1[local121], 0);
				if (local119 > 256) {
					local119 >>= 0x1;
				}
				if (local121 == 0) {
					super.aClass134_Sub2_2.method5202(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt652, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt652, (float) this.anInt660);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt660);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass134_Sub2_2.method5202(this.aClass40_Sub3Array1[local121 - 1]);
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
				if (local114 > 256) {
					local114 >>= 0x1;
				}
				local121++;
			}
			super.aClass134_Sub2_2.method5262(this.aClass98_1);
			super.aClass134_Sub2_2.method5202(this.aClass40_Sub3Array1[local121 - 1]);
			super.aClass134_Sub2_2.method5275(this.aClass98_2);
			this.aClass98_2.method1979(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(288) long local288 = this.aClass132_4.aLong105;
			OpenGL.glUseProgramObjectARB(local288);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local288, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local288, "params"), Static442.aFloat179, 0.0F, 0.0F);
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
		this.aClass98_2.method1979(1);
		super.aClass134_Sub2_2.method5202(this.aClass40_Sub3_2);
		local48 = this.aClass132_3.aLong105;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass98_2.method1979(0);
		super.aClass134_Sub2_2.method5202(this.aClass40_Sub3_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass134_Sub2_2.method5262(this.aClass98_2);
		@Pc(451) long local451 = this.aClass132_2.aLong105;
		OpenGL.glUseProgramObjectARB(local451);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local451, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local451, "params"), Static588.aFloat211, Static349.aFloat131, 0.0F);
		super.aClass134_Sub2_2.method5197(1);
		super.aClass134_Sub2_2.method5202(this.aClass40_Sub3_2);
		super.aClass134_Sub2_2.method5197(0);
		super.aClass134_Sub2_2.method5202(arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
	@Override
	public void method590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt660 = arg0;
		this.anInt652 = arg1;
		@Pc(22) int local22 = Static558.method7589(this.anInt652);
		@Pc(27) int local27 = Static558.method7589(this.anInt660);
		if (local22 == this.anInt659 && this.anInt654 == local27) {
			return;
		}
		@Pc(48) int local48;
		if (this.aClass40_Sub3Array1 != null) {
			for (local48 = 0; local48 < this.aClass40_Sub3Array1.length; local48++) {
				this.aClass40_Sub3Array1[local48].method5873();
			}
			this.aClass40_Sub3Array1 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass98_1 = null;
		} else {
			local48 = local22;
			@Pc(77) int local77 = local27;
			@Pc(79) int local79 = 0;
			if (this.aClass98_1 == null) {
				this.aClass98_1 = new Class98(super.aClass134_Sub2_2);
			}
			label55: while (true) {
				if (local48 <= 256 && local77 <= 256) {
					this.aClass40_Sub3Array1 = new Class40_Sub3[local79];
					local48 = local22;
					local77 = local27;
					local79 = 0;
					while (true) {
						if (local48 <= 256 && local77 <= 256) {
							break label55;
						}
						this.aClass40_Sub3Array1[local79++] = new Class40_Sub3(super.aClass134_Sub2_2, 3553, 34842, local48, local77);
						if (local48 > 256) {
							local48 >>= 0x1;
						}
						if (local77 > 256) {
							local77 >>= 0x1;
						}
					}
				}
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				local79++;
				if (local48 > 256) {
					local48 >>= 0x1;
				}
			}
		}
		this.anInt654 = local27;
		this.anInt659 = local22;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	@Override
	public void method588() {
		this.aClass98_2 = null;
		this.aClass98_1 = null;
		this.aClass132_3 = null;
		this.aClass132_2 = null;
		this.aClass40_Sub3Array1 = null;
		this.aClass40_Sub3_1 = null;
		this.aClass132_1 = null;
		this.aClass40_Sub3_2 = null;
		this.aClass132_4 = null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method585() {
		if (!super.aClass134_Sub2_2.aBoolean518 || !super.aClass134_Sub2_2.aBoolean504 || !super.aClass134_Sub2_2.aBoolean520) {
			return false;
		}
		this.aClass98_2 = new Class98(super.aClass134_Sub2_2);
		this.aClass40_Sub3_2 = new Class40_Sub3(super.aClass134_Sub2_2, 3553, 34842, 256, 256);
		this.aClass40_Sub3_2.method5391(false, false);
		this.aClass40_Sub3_1 = new Class40_Sub3(super.aClass134_Sub2_2, 3553, 34842, 256, 256);
		this.aClass40_Sub3_1.method5391(false, false);
		super.aClass134_Sub2_2.method5275(this.aClass98_2);
		this.aClass98_2.method1981(this.aClass40_Sub3_2, 0);
		this.aClass98_2.method1981(this.aClass40_Sub3_1, 1);
		this.aClass98_2.method1979(0);
		if (!this.aClass98_2.method1975()) {
			super.aClass134_Sub2_2.method5262(this.aClass98_2);
			return false;
		}
		super.aClass134_Sub2_2.method5262(this.aClass98_2);
		this.aClass132_1 = Static269.method3841(new Class189[] { Static364.method4918(35632, super.aClass134_Sub2_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass134_Sub2_2);
		this.aClass132_4 = Static269.method3841(new Class189[] { Static364.method4918(35632, super.aClass134_Sub2_2, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass134_Sub2_2);
		this.aClass132_2 = Static269.method3841(new Class189[] { Static364.method4918(35632, super.aClass134_Sub2_2, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass134_Sub2_2);
		this.aClass132_3 = Static269.method3841(new Class189[] { Static364.method4918(35632, super.aClass134_Sub2_2, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass134_Sub2_2);
		return this.aClass132_4 != null && this.aClass132_1 != null && this.aClass132_2 != null && this.aClass132_3 != null;
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)Z")
	public boolean method598() {
		return super.aClass134_Sub2_2.aBoolean518 && super.aClass134_Sub2_2.aBoolean504 && super.aClass134_Sub2_2.aBoolean520;
	}
}
