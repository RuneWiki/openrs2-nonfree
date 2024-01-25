import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class1_Sub24_Sub1 extends Class1_Sub24 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
	private int anInt8271;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Lclient!iu;")
	private Class161 aClass161_6;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	private int anInt8274;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
	private int anInt8275;

	@OriginalMember(owner = "client!sq", name = "E", descriptor = "Lclient!dga;")
	private Class52_Sub1 aClass52_Sub1_5;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "[Lclient!dga;")
	private Class52_Sub1[] aClass52_Sub1Array4;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
	private int anInt8277;

	@OriginalMember(owner = "client!sq", name = "H", descriptor = "Lclient!iu;")
	private Class161 aClass161_7;

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "Lclient!te;")
	private Class309 aClass309_3;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "Lclient!dga;")
	private Class52_Sub1 aClass52_Sub1_6;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "Lclient!te;")
	private Class309 aClass309_4;

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "Lclient!te;")
	private Class309 aClass309_5;

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "Lclient!te;")
	private Class309 aClass309_6;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class1_Sub24_Sub1(@OriginalArg(0) Class12_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	@Override
	public void method6884(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass12_Sub1_34.method376(1);
		super.aClass12_Sub1_34.method378(null);
		super.aClass12_Sub1_34.method376(0);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)I")
	@Override
	public int method6892() {
		return 1;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6887() {
		if (!super.aClass12_Sub1_34.aBoolean34 || !super.aClass12_Sub1_34.aBoolean19 || !super.aClass12_Sub1_34.aBoolean29) {
			return false;
		}
		this.aClass161_7 = new Class161(super.aClass12_Sub1_34);
		this.aClass52_Sub1_5 = new Class52_Sub1(super.aClass12_Sub1_34, 3553, 34842, 256, 256);
		this.aClass52_Sub1_5.method1504(false, false);
		this.aClass52_Sub1_6 = new Class52_Sub1(super.aClass12_Sub1_34, 3553, 34842, 256, 256);
		this.aClass52_Sub1_6.method1504(false, false);
		super.aClass12_Sub1_34.method424(this.aClass161_7);
		this.aClass161_7.method3790(this.aClass52_Sub1_5, 0);
		this.aClass161_7.method3790(this.aClass52_Sub1_6, 1);
		this.aClass161_7.method3786(0);
		if (!this.aClass161_7.method3792()) {
			super.aClass12_Sub1_34.method372(this.aClass161_7);
			return false;
		}
		super.aClass12_Sub1_34.method372(this.aClass161_7);
		this.aClass309_4 = Static490.method6896(super.aClass12_Sub1_34, new Class344[] { Static245.method3978("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass12_Sub1_34, 35632) });
		this.aClass309_6 = Static490.method6896(super.aClass12_Sub1_34, new Class344[] { Static245.method3978("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass12_Sub1_34, 35632) });
		this.aClass309_3 = Static490.method6896(super.aClass12_Sub1_34, new Class344[] { Static245.method3978("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass12_Sub1_34, 35632) });
		this.aClass309_5 = Static490.method6896(super.aClass12_Sub1_34, new Class344[] { Static245.method3978("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass12_Sub1_34, 35632) });
		return this.aClass309_6 != null && this.aClass309_4 != null && this.aClass309_3 != null && this.aClass309_5 != null;
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)Z")
	public boolean method6893() {
		return super.aClass12_Sub1_34.aBoolean34 && super.aClass12_Sub1_34.aBoolean19 && super.aClass12_Sub1_34.aBoolean29;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method6882() {
		this.aClass52_Sub1_6 = null;
		this.aClass52_Sub1_5 = null;
		this.aClass309_4 = null;
		this.aClass309_3 = null;
		this.aClass161_6 = null;
		this.aClass309_6 = null;
		this.aClass309_5 = null;
		this.aClass161_7 = null;
		this.aClass52_Sub1Array4 = null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	@Override
	public void method6890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8277 = arg1;
		this.anInt8275 = arg0;
		@Pc(22) int local22 = Static549.method7478(this.anInt8275);
		@Pc(27) int local27 = Static549.method7478(this.anInt8277);
		if (this.anInt8271 == local22 && this.anInt8274 == local27) {
			return;
		}
		@Pc(48) int local48;
		if (this.aClass52_Sub1Array4 != null) {
			for (local48 = 0; local48 < this.aClass52_Sub1Array4.length; local48++) {
				this.aClass52_Sub1Array4[local48].method5643();
			}
			this.aClass52_Sub1Array4 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass161_6 = null;
		} else {
			local48 = local22;
			@Pc(80) int local80 = local27;
			@Pc(82) int local82 = 0;
			if (this.aClass161_6 == null) {
				this.aClass161_6 = new Class161(super.aClass12_Sub1_34);
			}
			label56: while (true) {
				if (local48 <= 256 && local80 <= 256) {
					this.aClass52_Sub1Array4 = new Class52_Sub1[local82];
					local80 = local27;
					local48 = local22;
					local82 = 0;
					while (true) {
						if (local48 <= 256 && local80 <= 256) {
							break label56;
						}
						this.aClass52_Sub1Array4[local82++] = new Class52_Sub1(super.aClass12_Sub1_34, 3553, 34842, local48, local80);
						if (local48 > 256) {
							local48 >>= 0x1;
						}
						if (local80 > 256) {
							local80 >>= 0x1;
						}
					}
				}
				if (local48 > 256) {
					local48 >>= 0x1;
				}
				if (local80 > 256) {
					local80 >>= 0x1;
				}
				local82++;
			}
		}
		this.anInt8274 = local27;
		this.anInt8271 = local22;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6885() {
		return this.aClass161_7 != null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!dga;IILclient!dga;)V")
	@Override
	public void method6883(@OriginalArg(0) Class52_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass52_Sub1Array4 == null) {
			super.aClass12_Sub1_34.method378(arg2);
			super.aClass12_Sub1_34.method424(this.aClass161_7);
			this.aClass161_7.method3786(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass309_4.aLong372;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static490.aFloat210, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8275, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8275, (float) this.anInt8277);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8277);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass12_Sub1_34.method424(this.aClass161_6);
			@Pc(34) int local34 = Static549.method7478(this.anInt8275);
			@Pc(39) int local39 = Static549.method7478(this.anInt8277);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				OpenGL.glViewport(0, 0, local34, local39);
				this.aClass161_6.method3790(this.aClass52_Sub1Array4[local41], 0);
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				if (local41 == 0) {
					super.aClass12_Sub1_34.method378(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8275, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8275, (float) this.anInt8277);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8277);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass12_Sub1_34.method378(this.aClass52_Sub1Array4[local41 - 1]);
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
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				local41++;
			}
			super.aClass12_Sub1_34.method372(this.aClass161_6);
			super.aClass12_Sub1_34.method378(this.aClass52_Sub1Array4[local41 - 1]);
			super.aClass12_Sub1_34.method424(this.aClass161_7);
			this.aClass161_7.method3786(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(199) long local199 = this.aClass309_6.aLong372;
			OpenGL.glUseProgramObjectARB(local199);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static490.aFloat210, 0.0F, 0.0F);
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
		this.aClass161_7.method3786(1);
		super.aClass12_Sub1_34.method378(this.aClass52_Sub1_5);
		local269 = this.aClass309_5.aLong372;
		OpenGL.glUseProgramObjectARB(local269);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass161_7.method3786(0);
		super.aClass12_Sub1_34.method378(this.aClass52_Sub1_6);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass12_Sub1_34.method372(this.aClass161_7);
		@Pc(443) long local443 = this.aClass309_3.aLong372;
		OpenGL.glUseProgramObjectARB(local443);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local443, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local443, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local443, "params"), Static54.aFloat31, Static168.aFloat67, 0.0F);
		super.aClass12_Sub1_34.method376(1);
		super.aClass12_Sub1_34.method378(this.aClass52_Sub1_5);
		super.aClass12_Sub1_34.method376(0);
		super.aClass12_Sub1_34.method378(arg2);
	}
}
