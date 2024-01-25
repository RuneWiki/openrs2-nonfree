import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class3_Sub20_Sub1 extends Class3_Sub20 {

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!tg;")
	private Class320 aClass320_6;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "Lclient!tg;")
	private Class320 aClass320_7;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	private int anInt8900;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	private int anInt8901;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
	private int anInt8902;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "Lclient!dc;")
	private Class65 aClass65_2;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "Lclient!ol;")
	private Class76_Sub3 aClass76_Sub3_4;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "Lclient!dc;")
	private Class65 aClass65_3;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "[Lclient!ol;")
	private Class76_Sub3[] aClass76_Sub3Array4;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "Lclient!dc;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Lclient!ol;")
	private Class76_Sub3 aClass76_Sub3_5;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "Lclient!dc;")
	private Class65 aClass65_5;

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
	private int anInt8908;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class3_Sub20_Sub1(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)Z")
	public boolean method7684() {
		return super.aClass5_Sub2_33.aBoolean374 && super.aClass5_Sub2_33.aBoolean389 && super.aClass5_Sub2_33.aBoolean398;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ol;Lclient!ol;I)V")
	@Override
	public void method7675(@OriginalArg(0) int arg0, @OriginalArg(1) Class76_Sub3 arg1, @OriginalArg(2) Class76_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho((double) 0, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(274) long local274;
		if (this.aClass76_Sub3Array4 == null) {
			super.aClass5_Sub2_33.method4997(arg1);
			super.aClass5_Sub2_33.method5028(this.aClass320_6);
			this.aClass320_6.method7963(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local274 = this.aClass65_3.aLong42;
			OpenGL.glUseProgramObjectARB(local274);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local274, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local274, "params"), Static623.aFloat211, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8908, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8908, (float) this.anInt8901);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8901);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass5_Sub2_33.method5028(this.aClass320_7);
			@Pc(35) int local35 = Static274.method4478(this.anInt8908);
			@Pc(40) int local40 = Static274.method4478(this.anInt8901);
			@Pc(42) int local42 = 0;
			while (local35 > 256 || local40 > 256) {
				OpenGL.glViewport(0, 0, local35, local40);
				this.aClass320_7.method7969(0, this.aClass76_Sub3Array4[local42]);
				if (local40 > 256) {
					local40 >>= 0x1;
				}
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local42 == 0) {
					super.aClass5_Sub2_33.method4997(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8908, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8908, (float) this.anInt8901);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8901);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass5_Sub2_33.method4997(this.aClass76_Sub3Array4[local42 - 1]);
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
				local42++;
			}
			super.aClass5_Sub2_33.method5026(this.aClass320_7);
			super.aClass5_Sub2_33.method4997(this.aClass76_Sub3Array4[local42 - 1]);
			super.aClass5_Sub2_33.method5028(this.aClass320_6);
			this.aClass320_6.method7963(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(204) long local204 = this.aClass65_2.aLong42;
			OpenGL.glUseProgramObjectARB(local204);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local204, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local204, "params"), Static623.aFloat211, 0.0F, 0.0F);
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
		this.aClass320_6.method7963(1);
		super.aClass5_Sub2_33.method4997(this.aClass76_Sub3_4);
		local274 = this.aClass65_5.aLong42;
		OpenGL.glUseProgramObjectARB(local274);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local274, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local274, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass320_6.method7963(0);
		super.aClass5_Sub2_33.method4997(this.aClass76_Sub3_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local274, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass5_Sub2_33.method5026(this.aClass320_6);
		@Pc(440) long local440 = this.aClass65_4.aLong42;
		OpenGL.glUseProgramObjectARB(local440);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local440, "params"), Static574.aFloat203, Static5.aFloat84, 0.0F);
		super.aClass5_Sub2_33.method5004(1);
		super.aClass5_Sub2_33.method4997(this.aClass76_Sub3_4);
		super.aClass5_Sub2_33.method5004(0);
		super.aClass5_Sub2_33.method4997(arg1);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7670() {
		if (!super.aClass5_Sub2_33.aBoolean374 || !super.aClass5_Sub2_33.aBoolean389 || !super.aClass5_Sub2_33.aBoolean398) {
			return false;
		}
		this.aClass320_6 = new Class320(super.aClass5_Sub2_33);
		this.aClass76_Sub3_4 = new Class76_Sub3(super.aClass5_Sub2_33, 3553, 34842, 256, 256);
		this.aClass76_Sub3_4.method6412(false, false);
		this.aClass76_Sub3_5 = new Class76_Sub3(super.aClass5_Sub2_33, 3553, 34842, 256, 256);
		this.aClass76_Sub3_5.method6412(false, false);
		super.aClass5_Sub2_33.method5028(this.aClass320_6);
		this.aClass320_6.method7969(0, this.aClass76_Sub3_4);
		this.aClass320_6.method7969(1, this.aClass76_Sub3_5);
		this.aClass320_6.method7963(0);
		if (!this.aClass320_6.method7964()) {
			super.aClass5_Sub2_33.method5026(this.aClass320_6);
			return false;
		}
		super.aClass5_Sub2_33.method5026(this.aClass320_6);
		this.aClass65_3 = Static116.method2392(super.aClass5_Sub2_33, new Class324[] { Static483.method7199(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass5_Sub2_33) });
		this.aClass65_2 = Static116.method2392(super.aClass5_Sub2_33, new Class324[] { Static483.method7199(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass5_Sub2_33) });
		this.aClass65_4 = Static116.method2392(super.aClass5_Sub2_33, new Class324[] { Static483.method7199(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass5_Sub2_33) });
		this.aClass65_5 = Static116.method2392(super.aClass5_Sub2_33, new Class324[] { Static483.method7199(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass5_Sub2_33) });
		return this.aClass65_2 != null && this.aClass65_3 != null && this.aClass65_4 != null && this.aClass65_5 != null;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)I")
	@Override
	public int method7680() {
		return 1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	@Override
	public void method7677() {
		this.aClass76_Sub3_4 = null;
		this.aClass320_7 = null;
		this.aClass65_3 = null;
		this.aClass65_5 = null;
		this.aClass76_Sub3Array4 = null;
		this.aClass76_Sub3_5 = null;
		this.aClass65_2 = null;
		this.aClass65_4 = null;
		this.aClass320_6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7678() {
		return this.aClass320_6 != null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	@Override
	public void method7681(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass5_Sub2_33.method5004(1);
		super.aClass5_Sub2_33.method4997(null);
		super.aClass5_Sub2_33.method5004(0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8901 = arg0;
		this.anInt8908 = arg1;
		@Pc(16) int local16 = Static274.method4478(this.anInt8908);
		@Pc(21) int local21 = Static274.method4478(this.anInt8901);
		if (this.anInt8900 == local16 && local21 == this.anInt8902) {
			return;
		}
		@Pc(39) int local39;
		if (this.aClass76_Sub3Array4 != null) {
			for (local39 = 0; local39 < this.aClass76_Sub3Array4.length; local39++) {
				this.aClass76_Sub3Array4[local39].method7926();
			}
			this.aClass76_Sub3Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass320_7 = null;
		} else {
			local39 = local16;
			@Pc(68) int local68 = local21;
			@Pc(70) int local70 = 0;
			if (this.aClass320_7 == null) {
				this.aClass320_7 = new Class320(super.aClass5_Sub2_33);
			}
			label55: while (true) {
				if (local39 <= 256 && local68 <= 256) {
					local68 = local21;
					this.aClass76_Sub3Array4 = new Class76_Sub3[local70];
					local39 = local16;
					local70 = 0;
					while (true) {
						if (local39 <= 256 && local68 <= 256) {
							break label55;
						}
						this.aClass76_Sub3Array4[local70++] = new Class76_Sub3(super.aClass5_Sub2_33, 3553, 34842, local39, local68);
						if (local39 > 256) {
							local39 >>= 0x1;
						}
						if (local68 > 256) {
							local68 >>= 0x1;
						}
					}
				}
				local70++;
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local68 > 256) {
					local68 >>= 0x1;
				}
			}
		}
		this.anInt8900 = local16;
		this.anInt8902 = local21;
	}
}
