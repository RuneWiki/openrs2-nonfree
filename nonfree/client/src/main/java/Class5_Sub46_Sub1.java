import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class5_Sub46_Sub1 extends Class5_Sub46 {

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	private int anInt8789;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ju;")
	private Class186 aClass186_6;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!un;")
	private Class350 aClass350_3;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	private int anInt8790;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	private int anInt8791;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	private int anInt8795;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!ju;")
	private Class186 aClass186_7;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!un;")
	private Class350 aClass350_4;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "[Lclient!wo;")
	private Class167_Sub3[] aClass167_Sub3Array4;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!un;")
	private Class350 aClass350_5;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!wo;")
	private Class167_Sub3 aClass167_Sub3_5;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Lclient!un;")
	private Class350 aClass350_6;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "Lclient!wo;")
	private Class167_Sub3 aClass167_Sub3_6;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class5_Sub46_Sub1(@OriginalArg(0) Class133_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!wo;Lclient!wo;)V")
	@Override
	public void method7572(@OriginalArg(1) int arg0, @OriginalArg(2) Class167_Sub3 arg1, @OriginalArg(3) Class167_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass167_Sub3Array4 == null) {
			super.aClass133_Sub3_32.method7375(arg1);
			super.aClass133_Sub3_32.method7390(this.aClass186_7);
			this.aClass186_7.method4342(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass350_6.aLong247;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static88.aFloat31, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8791, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8791, (float) this.anInt8789);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8789);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass133_Sub3_32.method7390(this.aClass186_6);
			@Pc(32) int local32 = Static460.method6846(this.anInt8791);
			@Pc(37) int local37 = Static460.method6846(this.anInt8789);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass186_6.method4346(this.aClass167_Sub3Array4[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass133_Sub3_32.method7375(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8791, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8791, (float) this.anInt8789);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8789);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass133_Sub3_32.method7375(this.aClass167_Sub3Array4[local39 - 1]);
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
			super.aClass133_Sub3_32.method7363(this.aClass186_6);
			super.aClass133_Sub3_32.method7375(this.aClass167_Sub3Array4[local39 - 1]);
			super.aClass133_Sub3_32.method7390(this.aClass186_7);
			this.aClass186_7.method4342(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(200) long local200 = this.aClass350_4.aLong247;
			OpenGL.glUseProgramObjectARB(local200);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local200, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local200, "params"), Static88.aFloat31, 0.0F, 0.0F);
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
		this.aClass186_7.method4342(1);
		super.aClass133_Sub3_32.method7375(this.aClass167_Sub3_6);
		local270 = this.aClass350_3.aLong247;
		OpenGL.glUseProgramObjectARB(local270);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass186_7.method4342(0);
		super.aClass133_Sub3_32.method7375(this.aClass167_Sub3_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f((float) 1, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		super.aClass133_Sub3_32.method7363(this.aClass186_7);
		@Pc(437) long local437 = this.aClass350_5.aLong247;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static541.aFloat173, Static437.aFloat138, 0.0F);
		super.aClass133_Sub3_32.method7368(1);
		super.aClass133_Sub3_32.method7375(this.aClass167_Sub3_6);
		super.aClass133_Sub3_32.method7368(0);
		super.aClass133_Sub3_32.method7375(arg1);
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(B)V")
	@Override
	public void method7581() {
		this.aClass167_Sub3_5 = null;
		this.aClass186_6 = null;
		this.aClass350_6 = null;
		this.aClass167_Sub3Array4 = null;
		this.aClass186_7 = null;
		this.aClass350_3 = null;
		this.aClass350_4 = null;
		this.aClass167_Sub3_6 = null;
		this.aClass350_5 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Z")
	public boolean method7582() {
		return super.aClass133_Sub3_32.aBoolean615 && super.aClass133_Sub3_32.aBoolean628 && super.aClass133_Sub3_32.aBoolean621;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7578() {
		return this.aClass186_7 != null;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7573() {
		if (!super.aClass133_Sub3_32.aBoolean615 || !super.aClass133_Sub3_32.aBoolean628 || !super.aClass133_Sub3_32.aBoolean621) {
			return false;
		}
		this.aClass186_7 = new Class186(super.aClass133_Sub3_32);
		this.aClass167_Sub3_6 = new Class167_Sub3(super.aClass133_Sub3_32, 3553, 34842, 256, 256);
		this.aClass167_Sub3_6.method7524(false, false);
		this.aClass167_Sub3_5 = new Class167_Sub3(super.aClass133_Sub3_32, 3553, 34842, 256, 256);
		this.aClass167_Sub3_5.method7524(false, false);
		super.aClass133_Sub3_32.method7390(this.aClass186_7);
		this.aClass186_7.method4346(this.aClass167_Sub3_6, 0);
		this.aClass186_7.method4346(this.aClass167_Sub3_5, 1);
		this.aClass186_7.method4342(0);
		if (!this.aClass186_7.method4344()) {
			super.aClass133_Sub3_32.method7363(this.aClass186_7);
			return false;
		}
		super.aClass133_Sub3_32.method7363(this.aClass186_7);
		this.aClass350_6 = Static457.method6820(new Class369[] { Static432.method6590("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass133_Sub3_32, 35632) }, super.aClass133_Sub3_32);
		this.aClass350_4 = Static457.method6820(new Class369[] { Static432.method6590("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass133_Sub3_32, 35632) }, super.aClass133_Sub3_32);
		this.aClass350_5 = Static457.method6820(new Class369[] { Static432.method6590("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass133_Sub3_32, 35632) }, super.aClass133_Sub3_32);
		this.aClass350_3 = Static457.method6820(new Class369[] { Static432.method6590("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass133_Sub3_32, 35632) }, super.aClass133_Sub3_32);
		return this.aClass350_4 != null && this.aClass350_6 != null && this.aClass350_5 != null && this.aClass350_3 != null;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	@Override
	public void method7579(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass133_Sub3_32.method7368(1);
		super.aClass133_Sub3_32.method7375(null);
		super.aClass133_Sub3_32.method7368(0);
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(B)I")
	@Override
	public int method7580() {
		return 1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method7577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8789 = arg1;
		this.anInt8791 = arg0;
		@Pc(16) int local16 = Static460.method6846(this.anInt8791);
		@Pc(28) int local28 = Static460.method6846(this.anInt8789);
		if (local16 == this.anInt8790 && local28 == this.anInt8795) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass167_Sub3Array4 != null) {
			for (local45 = 0; local45 < this.aClass167_Sub3Array4.length; local45++) {
				this.aClass167_Sub3Array4[local45].method8011();
			}
			this.aClass167_Sub3Array4 = null;
		}
		if (local16 <= 256 && local28 <= 256) {
			this.aClass186_6 = null;
		} else {
			local45 = local16;
			@Pc(83) int local83 = local28;
			@Pc(85) int local85 = 0;
			label56: while (true) {
				if (local45 <= 256 && local83 <= 256) {
					if (this.aClass186_6 == null) {
						this.aClass186_6 = new Class186(super.aClass133_Sub3_32);
					}
					local83 = local28;
					this.aClass167_Sub3Array4 = new Class167_Sub3[local85];
					local45 = local16;
					local85 = 0;
					while (true) {
						if (local45 <= 256 && local83 <= 256) {
							break label56;
						}
						this.aClass167_Sub3Array4[local85++] = new Class167_Sub3(super.aClass133_Sub3_32, 3553, 34842, local45, local83);
						if (local83 > 256) {
							local83 >>= 0x1;
						}
						if (local45 > 256) {
							local45 >>= 0x1;
						}
					}
				}
				if (local83 > 256) {
					local83 >>= 0x1;
				}
				local85++;
				if (local45 > 256) {
					local45 >>= 0x1;
				}
			}
		}
		this.anInt8790 = local16;
		this.anInt8795 = local28;
	}
}
