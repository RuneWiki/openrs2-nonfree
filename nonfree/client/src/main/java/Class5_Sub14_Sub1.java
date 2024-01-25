import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class5_Sub14_Sub1 extends Class5_Sub14 {

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!nh;")
	private Class243 aClass243_3;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	private int anInt8589;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!nfa;")
	private Class241 aClass241_2;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
	private int anInt8591;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!sia;")
	private Class24_Sub4 aClass24_Sub4_3;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!nfa;")
	private Class241 aClass241_3;

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "Lclient!nfa;")
	private Class241 aClass241_4;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "Lclient!nh;")
	private Class243 aClass243_4;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "Lclient!nfa;")
	private Class241 aClass241_5;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "Lclient!sia;")
	private Class24_Sub4 aClass24_Sub4_4;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "[Lclient!sia;")
	private Class24_Sub4[] aClass24_Sub4Array3;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	private int anInt8600;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	private int anInt8602;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class5_Sub14_Sub1(@OriginalArg(0) Class126_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sia;Lclient!sia;II)V")
	@Override
	public void method7399(@OriginalArg(0) Class24_Sub4 arg0, @OriginalArg(1) Class24_Sub4 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(271) long local271;
		if (this.aClass24_Sub4Array3 == null) {
			super.aClass126_Sub3_32.method7113(arg0);
			super.aClass126_Sub3_32.method7097(this.aClass243_3);
			this.aClass243_3.method5840(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local271 = this.aClass241_4.aLong184;
			OpenGL.glUseProgramObjectARB(local271);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static243.aFloat48, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8591, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8591, (float) this.anInt8600);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8600);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass126_Sub3_32.method7097(this.aClass243_4);
			@Pc(34) int local34 = Static473.method6912(this.anInt8591);
			@Pc(39) int local39 = Static473.method6912(this.anInt8600);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				OpenGL.glViewport(0, 0, local34, local39);
				this.aClass243_4.method5834(0, this.aClass24_Sub4Array3[local41]);
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local41 == 0) {
					super.aClass126_Sub3_32.method7113(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8591, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8591, (float) this.anInt8600);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8600);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass126_Sub3_32.method7113(this.aClass24_Sub4Array3[local41 - 1]);
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
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			super.aClass126_Sub3_32.method7111(this.aClass243_4);
			super.aClass126_Sub3_32.method7113(this.aClass24_Sub4Array3[local41 - 1]);
			super.aClass126_Sub3_32.method7097(this.aClass243_3);
			this.aClass243_3.method5840(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(203) long local203 = this.aClass241_2.aLong184;
			OpenGL.glUseProgramObjectARB(local203);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local203, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local203, "params"), Static243.aFloat48, 0.0F, 0.0F);
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
		this.aClass243_3.method5840(1);
		super.aClass126_Sub3_32.method7113(this.aClass24_Sub4_4);
		local271 = this.aClass241_5.aLong184;
		OpenGL.glUseProgramObjectARB(local271);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass243_3.method5840(0);
		super.aClass126_Sub3_32.method7113(this.aClass24_Sub4_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass126_Sub3_32.method7111(this.aClass243_3);
		@Pc(441) long local441 = this.aClass241_3.aLong184;
		OpenGL.glUseProgramObjectARB(local441);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local441, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local441, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local441, "params"), Static442.aFloat151, Static375.aFloat135, 0.0F);
		super.aClass126_Sub3_32.method7104(1);
		super.aClass126_Sub3_32.method7113(this.aClass24_Sub4_4);
		super.aClass126_Sub3_32.method7104(0);
		super.aClass126_Sub3_32.method7113(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method7400() {
		return this.aClass243_3 != null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)I")
	@Override
	public int method7404() {
		return 1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7398() {
		if (!super.aClass126_Sub3_32.aBoolean666 || !super.aClass126_Sub3_32.aBoolean687 || !super.aClass126_Sub3_32.aBoolean679) {
			return false;
		}
		this.aClass243_3 = new Class243(super.aClass126_Sub3_32);
		this.aClass24_Sub4_4 = new Class24_Sub4(super.aClass126_Sub3_32, 3553, 34842, 256, 256);
		this.aClass24_Sub4_4.method6792(false, false);
		this.aClass24_Sub4_3 = new Class24_Sub4(super.aClass126_Sub3_32, 3553, 34842, 256, 256);
		this.aClass24_Sub4_3.method6792(false, false);
		super.aClass126_Sub3_32.method7097(this.aClass243_3);
		this.aClass243_3.method5834(0, this.aClass24_Sub4_4);
		this.aClass243_3.method5834(1, this.aClass24_Sub4_3);
		this.aClass243_3.method5840(0);
		if (!this.aClass243_3.method5826()) {
			super.aClass126_Sub3_32.method7111(this.aClass243_3);
			return false;
		}
		super.aClass126_Sub3_32.method7111(this.aClass243_3);
		this.aClass241_4 = Static38.method711(super.aClass126_Sub3_32, new Class46[] { Static304.method4409("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass126_Sub3_32) });
		this.aClass241_2 = Static38.method711(super.aClass126_Sub3_32, new Class46[] { Static304.method4409("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass126_Sub3_32) });
		this.aClass241_3 = Static38.method711(super.aClass126_Sub3_32, new Class46[] { Static304.method4409("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass126_Sub3_32) });
		this.aClass241_5 = Static38.method711(super.aClass126_Sub3_32, new Class46[] { Static304.method4409("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass126_Sub3_32) });
		return this.aClass241_2 != null && this.aClass241_4 != null && this.aClass241_3 != null && this.aClass241_5 != null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	@Override
	public void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8600 = arg0;
		this.anInt8591 = arg1;
		@Pc(20) int local20 = Static473.method6912(this.anInt8591);
		@Pc(27) int local27 = Static473.method6912(this.anInt8600);
		if (local20 == this.anInt8602 && local27 == this.anInt8589) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass24_Sub4Array3 != null) {
			for (local40 = 0; local40 < this.aClass24_Sub4Array3.length; local40++) {
				this.aClass24_Sub4Array3[local40].method6786();
			}
			this.aClass24_Sub4Array3 = null;
		}
		if (local20 <= 256 && local27 <= 256) {
			this.aClass243_4 = null;
		} else {
			local40 = local20;
			@Pc(71) int local71 = local27;
			@Pc(73) int local73 = 0;
			label59: while (true) {
				if (local40 <= 256 && local71 <= 256) {
					if (this.aClass243_4 == null) {
						this.aClass243_4 = new Class243(super.aClass126_Sub3_32);
					}
					local40 = local20;
					this.aClass24_Sub4Array3 = new Class24_Sub4[local73];
					local71 = local27;
					local73 = 0;
					while (true) {
						if (local40 <= 256 && local71 <= 256) {
							break label59;
						}
						this.aClass24_Sub4Array3[local73++] = new Class24_Sub4(super.aClass126_Sub3_32, 3553, 34842, local40, local71);
						if (local71 > 256) {
							local71 >>= 0x1;
						}
						if (local40 > 256) {
							local40 >>= 0x1;
						}
					}
				}
				if (local71 > 256) {
					local71 >>= 0x1;
				}
				if (local40 > 256) {
					local40 >>= 0x1;
				}
				local73++;
			}
		}
		this.anInt8589 = local27;
		this.anInt8602 = local20;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7407(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass126_Sub3_32.method7104(1);
		super.aClass126_Sub3_32.method7113((Class24) null);
		super.aClass126_Sub3_32.method7104(0);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)V")
	@Override
	public void method7403() {
		this.aClass24_Sub4_3 = null;
		this.aClass241_2 = null;
		this.aClass243_3 = null;
		this.aClass24_Sub4_4 = null;
		this.aClass241_4 = null;
		this.aClass241_3 = null;
		this.aClass243_4 = null;
		this.aClass241_5 = null;
		this.aClass24_Sub4Array3 = null;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)Z")
	public boolean method7413() {
		return super.aClass126_Sub3_32.aBoolean666 && super.aClass126_Sub3_32.aBoolean687 && super.aClass126_Sub3_32.aBoolean679;
	}
}
