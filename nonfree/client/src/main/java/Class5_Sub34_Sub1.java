import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class5_Sub34_Sub1 extends Class5_Sub34 {

	@OriginalMember(owner = "client!js", name = "x", descriptor = "I")
	private int anInt5725;

	@OriginalMember(owner = "client!js", name = "B", descriptor = "Lclient!vd;")
	private Class363 aClass363_3;

	@OriginalMember(owner = "client!js", name = "C", descriptor = "I")
	private int anInt5729;

	@OriginalMember(owner = "client!js", name = "D", descriptor = "Lclient!fm;")
	private Class123 aClass123_2;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "I")
	private int anInt5730;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "Lclient!gha;")
	private Class80_Sub2 aClass80_Sub2_3;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "Lclient!fm;")
	private Class123 aClass123_3;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "Lclient!fm;")
	private Class123 aClass123_4;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "Lclient!fm;")
	private Class123 aClass123_5;

	@OriginalMember(owner = "client!js", name = "N", descriptor = "Lclient!gha;")
	private Class80_Sub2 aClass80_Sub2_4;

	@OriginalMember(owner = "client!js", name = "R", descriptor = "[Lclient!gha;")
	private Class80_Sub2[] aClass80_Sub2Array1;

	@OriginalMember(owner = "client!js", name = "S", descriptor = "Lclient!vd;")
	private Class363 aClass363_4;

	@OriginalMember(owner = "client!js", name = "T", descriptor = "I")
	private int anInt5736;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class5_Sub34_Sub1(@OriginalArg(0) Class65_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I")
	@Override
	public int method4741() {
		return 1;
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4743() {
		if (!super.aClass65_Sub1_14.aBoolean100 || !super.aClass65_Sub1_14.aBoolean101 || !super.aClass65_Sub1_14.aBoolean102) {
			return false;
		}
		this.aClass363_3 = new Class363(super.aClass65_Sub1_14);
		this.aClass80_Sub2_4 = new Class80_Sub2(super.aClass65_Sub1_14, 3553, 34842, 256, 256);
		this.aClass80_Sub2_4.method7150(false, false);
		this.aClass80_Sub2_3 = new Class80_Sub2(super.aClass65_Sub1_14, 3553, 34842, 256, 256);
		this.aClass80_Sub2_3.method7150(false, false);
		super.aClass65_Sub1_14.method1299(this.aClass363_3);
		this.aClass363_3.method8449(this.aClass80_Sub2_4, 0);
		this.aClass363_3.method8449(this.aClass80_Sub2_3, 1);
		this.aClass363_3.method8447(0);
		if (!this.aClass363_3.method8445()) {
			super.aClass65_Sub1_14.method1229(this.aClass363_3);
			return false;
		}
		super.aClass65_Sub1_14.method1229(this.aClass363_3);
		this.aClass123_4 = Static425.method6297(new Class206[] { Static577.method7970(35632, super.aClass65_Sub1_14, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass65_Sub1_14);
		this.aClass123_3 = Static425.method6297(new Class206[] { Static577.method7970(35632, super.aClass65_Sub1_14, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass65_Sub1_14);
		this.aClass123_5 = Static425.method6297(new Class206[] { Static577.method7970(35632, super.aClass65_Sub1_14, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass65_Sub1_14);
		this.aClass123_2 = Static425.method6297(new Class206[] { Static577.method7970(35632, super.aClass65_Sub1_14, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass65_Sub1_14);
		return this.aClass123_3 != null && this.aClass123_4 != null && this.aClass123_5 != null && this.aClass123_2 != null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
	@Override
	public void method4738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5736 = arg1;
		this.anInt5730 = arg0;
		@Pc(16) int local16 = Static180.method2993(this.anInt5730);
		@Pc(21) int local21 = Static180.method2993(this.anInt5736);
		if (this.anInt5729 == local16 && local21 == this.anInt5725) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass80_Sub2Array1 != null) {
			for (local46 = 0; local46 < this.aClass80_Sub2Array1.length; local46++) {
				this.aClass80_Sub2Array1[local46].method7136();
			}
			this.aClass80_Sub2Array1 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass363_4 = null;
		} else {
			local46 = local16;
			@Pc(84) int local84 = local21;
			@Pc(86) int local86 = 0;
			if (this.aClass363_4 == null) {
				this.aClass363_4 = new Class363(super.aClass65_Sub1_14);
			}
			label56: while (true) {
				if (local46 <= 256 && local84 <= 256) {
					local84 = local21;
					local46 = local16;
					this.aClass80_Sub2Array1 = new Class80_Sub2[local86];
					local86 = 0;
					while (true) {
						if (local46 <= 256 && local84 <= 256) {
							break label56;
						}
						this.aClass80_Sub2Array1[local86++] = new Class80_Sub2(super.aClass65_Sub1_14, 3553, 34842, local46, local84);
						if (local84 > 256) {
							local84 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				if (local84 > 256) {
					local84 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
				local86++;
			}
		}
		this.anInt5725 = local21;
		this.anInt5729 = local16;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!gha;ZLclient!gha;)V")
	@Override
	public void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub2 arg1, @OriginalArg(3) Class80_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(265) long local265;
		if (this.aClass80_Sub2Array1 == null) {
			super.aClass65_Sub1_14.method1286(arg2);
			super.aClass65_Sub1_14.method1299(this.aClass363_3);
			this.aClass363_3.method8447(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local265 = this.aClass123_4.aLong68;
			OpenGL.glUseProgramObjectARB(local265);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local265, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local265, "params"), Static439.aFloat159, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5730, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5730, (float) this.anInt5736);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5736);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass65_Sub1_14.method1299(this.aClass363_4);
			@Pc(30) int local30 = Static180.method2993(this.anInt5730);
			@Pc(35) int local35 = Static180.method2993(this.anInt5736);
			@Pc(37) int local37 = 0;
			while (local30 > 256 || local35 > 256) {
				OpenGL.glViewport(0, 0, local30, local35);
				this.aClass363_4.method8449(this.aClass80_Sub2Array1[local37], 0);
				if (local30 > 256) {
					local30 >>= 0x1;
				}
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 == 0) {
					super.aClass65_Sub1_14.method1286(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5730, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5730, (float) this.anInt5736);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5736);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass65_Sub1_14.method1286(this.aClass80_Sub2Array1[local37 - 1]);
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
				local37++;
			}
			super.aClass65_Sub1_14.method1229(this.aClass363_4);
			super.aClass65_Sub1_14.method1286(this.aClass80_Sub2Array1[local37 - 1]);
			super.aClass65_Sub1_14.method1299(this.aClass363_3);
			this.aClass363_3.method8447(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(198) long local198 = this.aClass123_3.aLong68;
			OpenGL.glUseProgramObjectARB(local198);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static439.aFloat159, 0.0F, 0.0F);
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
		this.aClass363_3.method8447(1);
		super.aClass65_Sub1_14.method1286(this.aClass80_Sub2_4);
		local265 = this.aClass123_2.aLong68;
		OpenGL.glUseProgramObjectARB(local265);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local265, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local265, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass363_3.method8447(0);
		super.aClass65_Sub1_14.method1286(this.aClass80_Sub2_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local265, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass65_Sub1_14.method1229(this.aClass363_3);
		@Pc(429) long local429 = this.aClass123_5.aLong68;
		OpenGL.glUseProgramObjectARB(local429);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local429, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local429, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local429, "params"), Static385.aFloat128, Static77.aFloat10, 0.0F);
		super.aClass65_Sub1_14.method1256(1);
		super.aClass65_Sub1_14.method1286(this.aClass80_Sub2_4);
		super.aClass65_Sub1_14.method1256(0);
		super.aClass65_Sub1_14.method1286(arg2);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V")
	@Override
	public void method4739(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass65_Sub1_14.method1256(1);
		super.aClass65_Sub1_14.method1286((Class80) null);
		super.aClass65_Sub1_14.method1256(0);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4737() {
		return this.aClass363_3 != null;
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(I)Z")
	public boolean method4750() {
		return super.aClass65_Sub1_14.aBoolean100 && super.aClass65_Sub1_14.aBoolean101 && super.aClass65_Sub1_14.aBoolean102;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
	@Override
	public void method4740() {
		this.aClass80_Sub2Array1 = null;
		this.aClass363_4 = null;
		this.aClass80_Sub2_3 = null;
		this.aClass123_3 = null;
		this.aClass123_2 = null;
		this.aClass363_3 = null;
		this.aClass80_Sub2_4 = null;
		this.aClass123_5 = null;
		this.aClass123_4 = null;
	}
}
