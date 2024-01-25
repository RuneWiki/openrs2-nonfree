import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class2_Sub32_Sub1 extends Class2_Sub32 {

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
	private int anInt7488;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "Lclient!eu;")
	private Class74 aClass74_4;

	@OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
	private int anInt7492;

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "Lclient!qh;")
	private Class200 aClass200_6;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "Lclient!eu;")
	private Class74 aClass74_5;

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
	private int anInt7493;

	@OriginalMember(owner = "client!vr", name = "H", descriptor = "Lclient!eu;")
	private Class74 aClass74_6;

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "Lclient!wr;")
	private Class65_Sub3 aClass65_Sub3_6;

	@OriginalMember(owner = "client!vr", name = "M", descriptor = "[Lclient!wr;")
	private Class65_Sub3[] aClass65_Sub3Array4;

	@OriginalMember(owner = "client!vr", name = "N", descriptor = "Lclient!qh;")
	private Class200 aClass200_7;

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "Lclient!eu;")
	private Class74 aClass74_7;

	@OriginalMember(owner = "client!vr", name = "Q", descriptor = "Lclient!wr;")
	private Class65_Sub3 aClass65_Sub3_7;

	@OriginalMember(owner = "client!vr", name = "T", descriptor = "I")
	private int anInt7499;

	static {
		new Class256("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class2_Sub32_Sub1(@OriginalArg(0) Class26_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)I")
	@Override
	public int method5812() {
		return 1;
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5809() {
		return this.aClass200_6 != null;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!wr;Lclient!wr;I)V")
	@Override
	public void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) Class65_Sub3 arg1, @OriginalArg(2) Class65_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(273) long local273;
		if (this.aClass65_Sub3Array4 == null) {
			super.aClass26_Sub1_40.method673(arg2);
			super.aClass26_Sub1_40.method631(this.aClass200_6);
			this.aClass200_6.method4538(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(46) long local46 = this.aClass74_4.aLong60;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static358.aFloat192, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt7492, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt7492, (float) this.anInt7493);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt7493);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass26_Sub1_40.method631(this.aClass200_7);
			@Pc(108) int local108 = Static288.method4219(this.anInt7492);
			@Pc(113) int local113 = Static288.method4219(this.anInt7493);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass200_7.method4549(0, this.aClass65_Sub3Array4[local115]);
				if (local115 == 0) {
					super.aClass26_Sub1_40.method673(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt7492, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt7492, (float) this.anInt7493);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7493);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass26_Sub1_40.method673(this.aClass65_Sub3Array4[local115 - 1]);
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
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				local115++;
			}
			super.aClass26_Sub1_40.method635(this.aClass200_7);
			super.aClass26_Sub1_40.method673(this.aClass65_Sub3Array4[local115 - 1]);
			super.aClass26_Sub1_40.method631(this.aClass200_6);
			this.aClass200_6.method4538(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local273 = this.aClass74_5.aLong60;
			OpenGL.glUseProgramObjectARB(local273);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local273, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local273, "params"), Static358.aFloat192, 0.0F, 0.0F);
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
		this.aClass200_6.method4538(1);
		super.aClass26_Sub1_40.method673(this.aClass65_Sub3_6);
		@Pc(337) long local337 = this.aClass74_6.aLong60;
		OpenGL.glUseProgramObjectARB(local337);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local337, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local337, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass200_6.method4538(0);
		super.aClass26_Sub1_40.method673(this.aClass65_Sub3_7);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local337, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass26_Sub1_40.method635(this.aClass200_6);
		local273 = this.aClass74_7.aLong60;
		OpenGL.glUseProgramObjectARB(local273);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local273, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local273, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local273, "params"), Static171.aFloat102, Static173.aFloat116, 0.0F);
		super.aClass26_Sub1_40.method696(1);
		super.aClass26_Sub1_40.method673(this.aClass65_Sub3_6);
		super.aClass26_Sub1_40.method696(0);
		super.aClass26_Sub1_40.method673(arg2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7493 = arg0;
		this.anInt7492 = arg1;
		@Pc(16) int local16 = Static288.method4219(this.anInt7492);
		@Pc(21) int local21 = Static288.method4219(this.anInt7493);
		if (local16 == this.anInt7488 && local21 == this.anInt7499) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass65_Sub3Array4 != null) {
			for (local46 = 0; local46 < this.aClass65_Sub3Array4.length; local46++) {
				this.aClass65_Sub3Array4[local46].method4258();
			}
			this.aClass65_Sub3Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass200_7 = null;
		} else {
			local46 = local16;
			@Pc(82) int local82 = local21;
			@Pc(84) int local84 = 0;
			if (this.aClass200_7 == null) {
				this.aClass200_7 = new Class200(super.aClass26_Sub1_40);
			}
			label56: while (true) {
				if (local46 <= 256 && local82 <= 256) {
					local46 = local16;
					local82 = local21;
					this.aClass65_Sub3Array4 = new Class65_Sub3[local84];
					local84 = 0;
					while (true) {
						if (local46 <= 256 && local82 <= 256) {
							break label56;
						}
						this.aClass65_Sub3Array4[local84++] = new Class65_Sub3(super.aClass26_Sub1_40, 3553, 34842, local46, local82);
						if (local46 > 256) {
							local46 >>= 0x1;
						}
						if (local82 > 256) {
							local82 >>= 0x1;
						}
					}
				}
				if (local82 > 256) {
					local82 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
				local84++;
			}
		}
		this.anInt7499 = local21;
		this.anInt7488 = local16;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass26_Sub1_40.method696(1);
		super.aClass26_Sub1_40.method673(null);
		super.aClass26_Sub1_40.method696(0);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5801() {
		if (!super.aClass26_Sub1_40.aBoolean80 || !super.aClass26_Sub1_40.aBoolean62 || !super.aClass26_Sub1_40.aBoolean85) {
			return false;
		}
		this.aClass200_6 = new Class200(super.aClass26_Sub1_40);
		this.aClass65_Sub3_6 = new Class65_Sub3(super.aClass26_Sub1_40, 3553, 34842, 256, 256);
		this.aClass65_Sub3_6.method1962(false, false);
		this.aClass65_Sub3_7 = new Class65_Sub3(super.aClass26_Sub1_40, 3553, 34842, 256, 256);
		this.aClass65_Sub3_7.method1962(false, false);
		super.aClass26_Sub1_40.method631(this.aClass200_6);
		this.aClass200_6.method4549(0, this.aClass65_Sub3_6);
		this.aClass200_6.method4549(1, this.aClass65_Sub3_7);
		this.aClass200_6.method4538(0);
		if (!this.aClass200_6.method4552()) {
			super.aClass26_Sub1_40.method635(this.aClass200_6);
			return false;
		}
		super.aClass26_Sub1_40.method635(this.aClass200_6);
		this.aClass74_4 = Static436.method5907(super.aClass26_Sub1_40, new Class235[] { Static102.method1620("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass26_Sub1_40, 35632) });
		this.aClass74_5 = Static436.method5907(super.aClass26_Sub1_40, new Class235[] { Static102.method1620("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass26_Sub1_40, 35632) });
		this.aClass74_7 = Static436.method5907(super.aClass26_Sub1_40, new Class235[] { Static102.method1620("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass26_Sub1_40, 35632) });
		this.aClass74_6 = Static436.method5907(super.aClass26_Sub1_40, new Class235[] { Static102.method1620("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass26_Sub1_40, 35632) });
		return this.aClass74_5 != null && this.aClass74_4 != null && this.aClass74_7 != null && this.aClass74_6 != null;
	}

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)Z")
	public boolean method5814() {
		return super.aClass26_Sub1_40.aBoolean80 && super.aClass26_Sub1_40.aBoolean62 && super.aClass26_Sub1_40.aBoolean85;
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
	@Override
	public void method5806() {
		this.aClass65_Sub3_6 = null;
		this.aClass74_5 = null;
		this.aClass74_6 = null;
		this.aClass74_4 = null;
		this.aClass200_6 = null;
		this.aClass74_7 = null;
		this.aClass200_7 = null;
		this.aClass65_Sub3_7 = null;
		this.aClass65_Sub3Array4 = null;
	}
}
