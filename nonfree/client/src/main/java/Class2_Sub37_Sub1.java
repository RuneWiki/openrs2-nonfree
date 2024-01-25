import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class2_Sub37_Sub1 extends Class2_Sub37 {

	@OriginalMember(owner = "client!qaa", name = "s", descriptor = "Lclient!mj;")
	private Class227 aClass227_6;

	@OriginalMember(owner = "client!qaa", name = "t", descriptor = "I")
	private int anInt7410;

	@OriginalMember(owner = "client!qaa", name = "w", descriptor = "Lclient!it;")
	private Class167 aClass167_4;

	@OriginalMember(owner = "client!qaa", name = "z", descriptor = "Lclient!bq;")
	private Class10_Sub2 aClass10_Sub2_4;

	@OriginalMember(owner = "client!qaa", name = "A", descriptor = "I")
	private int anInt7415;

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "[Lclient!bq;")
	private Class10_Sub2[] aClass10_Sub2Array4;

	@OriginalMember(owner = "client!qaa", name = "G", descriptor = "Lclient!bq;")
	private Class10_Sub2 aClass10_Sub2_5;

	@OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
	private int anInt7420;

	@OriginalMember(owner = "client!qaa", name = "L", descriptor = "Lclient!mj;")
	private Class227 aClass227_7;

	@OriginalMember(owner = "client!qaa", name = "M", descriptor = "I")
	private int anInt7422;

	@OriginalMember(owner = "client!qaa", name = "N", descriptor = "Lclient!it;")
	private Class167 aClass167_5;

	@OriginalMember(owner = "client!qaa", name = "O", descriptor = "Lclient!it;")
	private Class167 aClass167_6;

	@OriginalMember(owner = "client!qaa", name = "P", descriptor = "Lclient!it;")
	private Class167 aClass167_7;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class2_Sub37_Sub1(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6461() {
		if (!super.aClass13_Sub2_34.aBoolean91 || !super.aClass13_Sub2_34.aBoolean97 || !super.aClass13_Sub2_34.aBoolean101) {
			return false;
		}
		this.aClass227_7 = new Class227(super.aClass13_Sub2_34);
		this.aClass10_Sub2_5 = new Class10_Sub2(super.aClass13_Sub2_34, 3553, 34842, 256, 256);
		this.aClass10_Sub2_5.method720(false, false);
		this.aClass10_Sub2_4 = new Class10_Sub2(super.aClass13_Sub2_34, 3553, 34842, 256, 256);
		this.aClass10_Sub2_4.method720(false, false);
		super.aClass13_Sub2_34.method1061(this.aClass227_7);
		this.aClass227_7.method5349(0, this.aClass10_Sub2_5);
		this.aClass227_7.method5349(1, this.aClass10_Sub2_4);
		this.aClass227_7.method5343(0);
		if (!this.aClass227_7.method5351()) {
			super.aClass13_Sub2_34.method1097(this.aClass227_7);
			return false;
		}
		super.aClass13_Sub2_34.method1097(this.aClass227_7);
		this.aClass167_5 = Static254.method4243(super.aClass13_Sub2_34, new Class268[] { Static179.method3071(super.aClass13_Sub2_34, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass167_4 = Static254.method4243(super.aClass13_Sub2_34, new Class268[] { Static179.method3071(super.aClass13_Sub2_34, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass167_6 = Static254.method4243(super.aClass13_Sub2_34, new Class268[] { Static179.method3071(super.aClass13_Sub2_34, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass167_7 = Static254.method4243(super.aClass13_Sub2_34, new Class268[] { Static179.method3071(super.aClass13_Sub2_34, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass167_4 != null && this.aClass167_5 != null && this.aClass167_6 != null && this.aClass167_7 != null;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!bq;ILclient!bq;)V")
	@Override
	public void method6463(@OriginalArg(1) Class10_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass10_Sub2Array4 == null) {
			super.aClass13_Sub2_34.method1096(arg2);
			super.aClass13_Sub2_34.method1061(this.aClass227_7);
			this.aClass227_7.method5343(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass167_5.aLong112;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static626.aFloat206, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt7410, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt7410, (float) this.anInt7415);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt7415);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass13_Sub2_34.method1061(this.aClass227_6);
			@Pc(108) int local108 = Static276.method7580(this.anInt7410);
			@Pc(113) int local113 = Static276.method7580(this.anInt7415);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass227_6.method5349(0, this.aClass10_Sub2Array4[local115]);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass13_Sub2_34.method1096(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt7410, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt7410, (float) this.anInt7415);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7415);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass13_Sub2_34.method1096(this.aClass10_Sub2Array4[local115 - 1]);
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
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				local115++;
			}
			super.aClass13_Sub2_34.method1097(this.aClass227_6);
			super.aClass13_Sub2_34.method1096(this.aClass10_Sub2Array4[local115 - 1]);
			super.aClass13_Sub2_34.method1061(this.aClass227_7);
			this.aClass227_7.method5343(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(276) long local276 = this.aClass167_4.aLong112;
			OpenGL.glUseProgramObjectARB(local276);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "params"), Static626.aFloat206, 0.0F, 0.0F);
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
		this.aClass227_7.method5343(1);
		super.aClass13_Sub2_34.method1096(this.aClass10_Sub2_5);
		local46 = this.aClass167_7.aLong112;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass227_7.method5343(0);
		super.aClass13_Sub2_34.method1096(this.aClass10_Sub2_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass13_Sub2_34.method1097(this.aClass227_7);
		@Pc(436) long local436 = this.aClass167_6.aLong112;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static542.aFloat166, Static141.aFloat60, 0.0F);
		super.aClass13_Sub2_34.method1093(1);
		super.aClass13_Sub2_34.method1096(this.aClass10_Sub2_5);
		super.aClass13_Sub2_34.method1093(0);
		super.aClass13_Sub2_34.method1096(arg2);
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6462() {
		return this.aClass227_7 != null;
	}

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Z")
	public boolean method6471() {
		return super.aClass13_Sub2_34.aBoolean91 && super.aClass13_Sub2_34.aBoolean97 && super.aClass13_Sub2_34.aBoolean101;
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)V")
	@Override
	public void method6467() {
		this.aClass10_Sub2_5 = null;
		this.aClass167_5 = null;
		this.aClass227_6 = null;
		this.aClass167_4 = null;
		this.aClass227_7 = null;
		this.aClass167_6 = null;
		this.aClass10_Sub2Array4 = null;
		this.aClass167_7 = null;
		this.aClass10_Sub2_4 = null;
	}

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(B)I")
	@Override
	public int method6468() {
		return 1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)V")
	@Override
	public void method6469(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass13_Sub2_34.method1093(1);
		super.aClass13_Sub2_34.method1096((Class10) null);
		super.aClass13_Sub2_34.method1093(0);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(III)V")
	@Override
	public void method6464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7410 = arg1;
		this.anInt7415 = arg0;
		@Pc(20) int local20 = Static276.method7580(this.anInt7410);
		@Pc(27) int local27 = Static276.method7580(this.anInt7415);
		if (local20 == this.anInt7420 && local27 == this.anInt7422) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass10_Sub2Array4 != null) {
			for (local40 = 0; local40 < this.aClass10_Sub2Array4.length; local40++) {
				this.aClass10_Sub2Array4[local40].method7257();
			}
			this.aClass10_Sub2Array4 = null;
		}
		if (local20 <= 256 && local27 <= 256) {
			this.aClass227_6 = null;
		} else {
			local40 = local20;
			@Pc(78) int local78 = local27;
			@Pc(80) int local80 = 0;
			if (this.aClass227_6 == null) {
				this.aClass227_6 = new Class227(super.aClass13_Sub2_34);
			}
			label56: while (true) {
				if (local40 <= 256 && local78 <= 256) {
					local78 = local27;
					this.aClass10_Sub2Array4 = new Class10_Sub2[local80];
					local40 = local20;
					local80 = 0;
					while (true) {
						if (local40 <= 256 && local78 <= 256) {
							break label56;
						}
						this.aClass10_Sub2Array4[local80++] = new Class10_Sub2(super.aClass13_Sub2_34, 3553, 34842, local40, local78);
						if (local78 > 256) {
							local78 >>= 0x1;
						}
						if (local40 > 256) {
							local40 >>= 0x1;
						}
					}
				}
				if (local40 > 256) {
					local40 >>= 0x1;
				}
				if (local78 > 256) {
					local78 >>= 0x1;
				}
				local80++;
			}
		}
		this.anInt7422 = local27;
		this.anInt7420 = local20;
	}
}
