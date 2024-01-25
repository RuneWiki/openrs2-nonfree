import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class1_Sub34_Sub1 extends Class1_Sub34 {

	@OriginalMember(owner = "client!lv", name = "y", descriptor = "Lclient!rr;")
	private Class164_Sub3 aClass164_Sub3_3;

	@OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
	private int anInt5481;

	@OriginalMember(owner = "client!lv", name = "C", descriptor = "Lclient!er;")
	private Class89 aClass89_4;

	@OriginalMember(owner = "client!lv", name = "D", descriptor = "[Lclient!rr;")
	private Class164_Sub3[] aClass164_Sub3Array2;

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "Lclient!rr;")
	private Class164_Sub3 aClass164_Sub3_4;

	@OriginalMember(owner = "client!lv", name = "F", descriptor = "I")
	private int anInt5482;

	@OriginalMember(owner = "client!lv", name = "G", descriptor = "Lclient!pi;")
	private Class227 aClass227_3;

	@OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!lv", name = "L", descriptor = "Lclient!pi;")
	private Class227 aClass227_4;

	@OriginalMember(owner = "client!lv", name = "N", descriptor = "Lclient!pi;")
	private Class227 aClass227_5;

	@OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
	private int anInt5490;

	@OriginalMember(owner = "client!lv", name = "U", descriptor = "Lclient!pi;")
	private Class227 aClass227_6;

	@OriginalMember(owner = "client!lv", name = "V", descriptor = "Lclient!er;")
	private Class89 aClass89_5;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class1_Sub34_Sub1(@OriginalArg(0) Class4_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5022() {
		return this.aClass89_5 != null;
	}

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)I")
	@Override
	public int method5030() {
		return 1;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(III)V")
	@Override
	public void method5028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5481 = arg0;
		this.anInt5482 = arg1;
		@Pc(23) int local23 = Static513.method7859(this.anInt5482);
		@Pc(28) int local28 = Static513.method7859(this.anInt5481);
		if (local23 == this.anInt5490 && local28 == this.anInt5485) {
			return;
		}
		@Pc(41) int local41;
		if (this.aClass164_Sub3Array2 != null) {
			for (local41 = 0; local41 < this.aClass164_Sub3Array2.length; local41++) {
				this.aClass164_Sub3Array2[local41].method8148();
			}
			this.aClass164_Sub3Array2 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass89_4 = null;
		} else {
			local41 = local23;
			@Pc(75) int local75 = local28;
			@Pc(77) int local77 = 0;
			if (this.aClass89_4 == null) {
				this.aClass89_4 = new Class89(super.aClass4_Sub3_28);
			}
			label54: while (true) {
				if (local41 <= 256 && local75 <= 256) {
					local41 = local23;
					this.aClass164_Sub3Array2 = new Class164_Sub3[local77];
					local75 = local28;
					local77 = 0;
					while (true) {
						if (local41 <= 256 && local75 <= 256) {
							break label54;
						}
						this.aClass164_Sub3Array2[local77++] = new Class164_Sub3(super.aClass4_Sub3_28, 3553, 34842, local41, local75);
						if (local41 > 256) {
							local41 >>= 0x1;
						}
						if (local75 > 256) {
							local75 >>= 0x1;
						}
					}
				}
				local77++;
				if (local41 > 256) {
					local41 >>= 0x1;
				}
				if (local75 > 256) {
					local75 >>= 0x1;
				}
			}
		}
		this.anInt5490 = local23;
		this.anInt5485 = local28;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V")
	@Override
	public void method5021() {
		this.aClass227_5 = null;
		this.aClass227_6 = null;
		this.aClass227_3 = null;
		this.aClass89_4 = null;
		this.aClass227_4 = null;
		this.aClass164_Sub3_3 = null;
		this.aClass164_Sub3Array2 = null;
		this.aClass89_5 = null;
		this.aClass164_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5018() {
		if (!super.aClass4_Sub3_28.aBoolean448 || !super.aClass4_Sub3_28.aBoolean424 || !super.aClass4_Sub3_28.aBoolean426) {
			return false;
		}
		this.aClass89_5 = new Class89(super.aClass4_Sub3_28);
		this.aClass164_Sub3_4 = new Class164_Sub3(super.aClass4_Sub3_28, 3553, 34842, 256, 256);
		this.aClass164_Sub3_4.method8159(false, false);
		this.aClass164_Sub3_3 = new Class164_Sub3(super.aClass4_Sub3_28, 3553, 34842, 256, 256);
		this.aClass164_Sub3_3.method8159(false, false);
		super.aClass4_Sub3_28.method5263(this.aClass89_5);
		this.aClass89_5.method2262(0, this.aClass164_Sub3_4);
		this.aClass89_5.method2262(1, this.aClass164_Sub3_3);
		this.aClass89_5.method2258(0);
		if (!this.aClass89_5.method2261()) {
			super.aClass4_Sub3_28.method5276(this.aClass89_5);
			return false;
		}
		super.aClass4_Sub3_28.method5276(this.aClass89_5);
		this.aClass227_4 = Static136.method5800(new Class205[] { Static60.method1520(super.aClass4_Sub3_28, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass4_Sub3_28);
		this.aClass227_3 = Static136.method5800(new Class205[] { Static60.method1520(super.aClass4_Sub3_28, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass4_Sub3_28);
		this.aClass227_6 = Static136.method5800(new Class205[] { Static60.method1520(super.aClass4_Sub3_28, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass4_Sub3_28);
		this.aClass227_5 = Static136.method5800(new Class205[] { Static60.method1520(super.aClass4_Sub3_28, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass4_Sub3_28);
		return this.aClass227_3 != null && this.aClass227_4 != null && this.aClass227_6 != null && this.aClass227_5 != null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)V")
	@Override
	public void method5023(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass4_Sub3_28.method5245(1);
		super.aClass4_Sub3_28.method5250(null);
		super.aClass4_Sub3_28.method5245(0);
	}

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "(I)Z")
	public boolean method5035() {
		return super.aClass4_Sub3_28.aBoolean448 && super.aClass4_Sub3_28.aBoolean424 && super.aClass4_Sub3_28.aBoolean426;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLclient!rr;ILclient!rr;)V")
	@Override
	public void method5029(@OriginalArg(1) Class164_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class164_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass164_Sub3Array2 == null) {
			super.aClass4_Sub3_28.method5250(arg2);
			super.aClass4_Sub3_28.method5263(this.aClass89_5);
			this.aClass89_5.method2258(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass227_4.aLong185;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static478.aFloat182, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5482, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5482, (float) this.anInt5481);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5481);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass4_Sub3_28.method5263(this.aClass89_4);
			@Pc(108) int local108 = Static513.method7859(this.anInt5482);
			@Pc(113) int local113 = Static513.method7859(this.anInt5481);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass89_4.method2262(0, this.aClass164_Sub3Array2[local115]);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass4_Sub3_28.method5250(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5482, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5482, (float) this.anInt5481);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5481);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass4_Sub3_28.method5250(this.aClass164_Sub3Array2[local115 - 1]);
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
				local115++;
			}
			super.aClass4_Sub3_28.method5276(this.aClass89_4);
			super.aClass4_Sub3_28.method5250(this.aClass164_Sub3Array2[local115 - 1]);
			super.aClass4_Sub3_28.method5263(this.aClass89_5);
			this.aClass89_5.method2258(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(276) long local276 = this.aClass227_3.aLong185;
			OpenGL.glUseProgramObjectARB(local276);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local276, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local276, "params"), Static478.aFloat182, 0.0F, 0.0F);
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
		this.aClass89_5.method2258(1);
		super.aClass4_Sub3_28.method5250(this.aClass164_Sub3_4);
		local46 = this.aClass227_5.aLong185;
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
		this.aClass89_5.method2258(0);
		super.aClass4_Sub3_28.method5250(this.aClass164_Sub3_3);
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
		super.aClass4_Sub3_28.method5276(this.aClass89_5);
		@Pc(439) long local439 = this.aClass227_6.aLong185;
		OpenGL.glUseProgramObjectARB(local439);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local439, "params"), Static349.aFloat135, Static361.aFloat141, 0.0F);
		super.aClass4_Sub3_28.method5245(1);
		super.aClass4_Sub3_28.method5250(this.aClass164_Sub3_4);
		super.aClass4_Sub3_28.method5245(0);
		super.aClass4_Sub3_28.method5250(arg2);
	}
}
