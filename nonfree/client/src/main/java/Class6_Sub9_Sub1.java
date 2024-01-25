import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class6_Sub9_Sub1 extends Class6_Sub9 {

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!uj;")
	private Class342 aClass342_2;

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
	private int anInt1858;

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "Lclient!rr;")
	private Class297 aClass297_3;

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!bw", name = "B", descriptor = "Lclient!aaa;")
	private Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
	private int anInt1863;

	@OriginalMember(owner = "client!bw", name = "H", descriptor = "I")
	private int anInt1864;

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "Lclient!aaa;")
	private Class2_Sub1 aClass2_Sub1_3;

	@OriginalMember(owner = "client!bw", name = "M", descriptor = "Lclient!rr;")
	private Class297 aClass297_4;

	@OriginalMember(owner = "client!bw", name = "N", descriptor = "Lclient!uj;")
	private Class342 aClass342_3;

	@OriginalMember(owner = "client!bw", name = "S", descriptor = "[Lclient!aaa;")
	private Class2_Sub1[] aClass2_Sub1Array1;

	@OriginalMember(owner = "client!bw", name = "T", descriptor = "Lclient!uj;")
	private Class342 aClass342_4;

	@OriginalMember(owner = "client!bw", name = "U", descriptor = "Lclient!uj;")
	private Class342 aClass342_5;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class6_Sub9_Sub1(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method1696() {
		if (!super.aClass5_Sub1_9.aBoolean40 || !super.aClass5_Sub1_9.aBoolean34 || !super.aClass5_Sub1_9.aBoolean21) {
			return false;
		}
		this.aClass297_3 = new Class297(super.aClass5_Sub1_9);
		this.aClass2_Sub1_2 = new Class2_Sub1(super.aClass5_Sub1_9, 3553, 34842, 256, 256);
		this.aClass2_Sub1_2.method4205(false, false);
		this.aClass2_Sub1_3 = new Class2_Sub1(super.aClass5_Sub1_9, 3553, 34842, 256, 256);
		this.aClass2_Sub1_3.method4205(false, false);
		super.aClass5_Sub1_9.method387(this.aClass297_3);
		this.aClass297_3.method7257(0, this.aClass2_Sub1_2);
		this.aClass297_3.method7257(1, this.aClass2_Sub1_3);
		this.aClass297_3.method7266(0);
		if (!this.aClass297_3.method7265()) {
			super.aClass5_Sub1_9.method396(this.aClass297_3);
			return false;
		}
		super.aClass5_Sub1_9.method396(this.aClass297_3);
		this.aClass342_4 = Static333.method5541(super.aClass5_Sub1_9, new Class349[] { Static327.method5481(35632, super.aClass5_Sub1_9, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass342_3 = Static333.method5541(super.aClass5_Sub1_9, new Class349[] { Static327.method5481(35632, super.aClass5_Sub1_9, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass342_5 = Static333.method5541(super.aClass5_Sub1_9, new Class349[] { Static327.method5481(35632, super.aClass5_Sub1_9, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass342_2 = Static333.method5541(super.aClass5_Sub1_9, new Class349[] { Static327.method5481(35632, super.aClass5_Sub1_9, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass342_3 != null && this.aClass342_4 != null && this.aClass342_5 != null && this.aClass342_2 != null;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)V")
	@Override
	public void method1699(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass5_Sub1_9.method334(1);
		super.aClass5_Sub1_9.method352((Class2) null);
		super.aClass5_Sub1_9.method334(0);
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(B)V")
	@Override
	public void method1706() {
		this.aClass342_4 = null;
		this.aClass2_Sub1Array1 = null;
		this.aClass297_3 = null;
		this.aClass2_Sub1_3 = null;
		this.aClass342_2 = null;
		this.aClass342_3 = null;
		this.aClass342_5 = null;
		this.aClass297_4 = null;
		this.aClass2_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "(B)Z")
	public boolean method1711() {
		return super.aClass5_Sub1_9.aBoolean40 && super.aClass5_Sub1_9.aBoolean34 && super.aClass5_Sub1_9.aBoolean21;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method1700() {
		return this.aClass297_3 != null;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
	@Override
	public int method1701() {
		return 1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1863 = arg0;
		this.anInt1858 = arg1;
		@Pc(16) int local16 = Static48.method1561(this.anInt1858);
		@Pc(21) int local21 = Static48.method1561(this.anInt1863);
		if (this.anInt1864 == local16 && this.anInt1859 == local21) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass2_Sub1Array1 != null) {
			for (local42 = 0; local42 < this.aClass2_Sub1Array1.length; local42++) {
				this.aClass2_Sub1Array1[local42].method6979();
			}
			this.aClass2_Sub1Array1 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass297_4 = null;
		} else {
			local42 = local16;
			@Pc(80) int local80 = local21;
			@Pc(82) int local82 = 0;
			label58: while (true) {
				if (local42 <= 256 && local80 <= 256) {
					if (this.aClass297_4 == null) {
						this.aClass297_4 = new Class297(super.aClass5_Sub1_9);
					}
					this.aClass2_Sub1Array1 = new Class2_Sub1[local82];
					local42 = local16;
					local80 = local21;
					local82 = 0;
					while (true) {
						if (local42 <= 256 && local80 <= 256) {
							break label58;
						}
						this.aClass2_Sub1Array1[local82++] = new Class2_Sub1(super.aClass5_Sub1_9, 3553, 34842, local42, local80);
						if (local80 > 256) {
							local80 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				if (local80 > 256) {
					local80 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local82++;
			}
		}
		this.anInt1864 = local16;
		this.anInt1859 = local21;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!aaa;IBLclient!aaa;)V")
	@Override
	public void method1704(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(55) long local55;
		if (this.aClass2_Sub1Array1 == null) {
			super.aClass5_Sub1_9.method352(arg2);
			super.aClass5_Sub1_9.method387(this.aClass297_3);
			this.aClass297_3.method7266(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local55 = this.aClass342_4.aLong257;
			OpenGL.glUseProgramObjectARB(local55);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local55, "params"), Static555.aFloat181, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1858, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1858, (float) this.anInt1863);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1863);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass5_Sub1_9.method387(this.aClass297_4);
			@Pc(117) int local117 = Static48.method1561(this.anInt1858);
			@Pc(122) int local122 = Static48.method1561(this.anInt1863);
			@Pc(124) int local124 = 0;
			while (local117 > 256 || local122 > 256) {
				OpenGL.glViewport(0, 0, local117, local122);
				this.aClass297_4.method7257(0, this.aClass2_Sub1Array1[local124]);
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				if (local122 > 256) {
					local122 >>= 0x1;
				}
				if (local124 == 0) {
					super.aClass5_Sub1_9.method352(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1858, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1858, (float) this.anInt1863);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1863);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass5_Sub1_9.method352(this.aClass2_Sub1Array1[local124 - 1]);
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
				local124++;
			}
			super.aClass5_Sub1_9.method396(this.aClass297_4);
			super.aClass5_Sub1_9.method352(this.aClass2_Sub1Array1[local124 - 1]);
			super.aClass5_Sub1_9.method387(this.aClass297_3);
			this.aClass297_3.method7266(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(287) long local287 = this.aClass342_3.aLong257;
			OpenGL.glUseProgramObjectARB(local287);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local287, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local287, "params"), Static555.aFloat181, 0.0F, 0.0F);
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
		this.aClass297_3.method7266(1);
		super.aClass5_Sub1_9.method352(this.aClass2_Sub1_2);
		local55 = this.aClass342_2.aLong257;
		OpenGL.glUseProgramObjectARB(local55);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local55, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass297_3.method7266(0);
		super.aClass5_Sub1_9.method352(this.aClass2_Sub1_3);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local55, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass5_Sub1_9.method396(this.aClass297_3);
		@Pc(449) long local449 = this.aClass342_5.aLong257;
		OpenGL.glUseProgramObjectARB(local449);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local449, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local449, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local449, "params"), Static543.aFloat180, Static333.aFloat131, 0.0F);
		super.aClass5_Sub1_9.method334(1);
		super.aClass5_Sub1_9.method352(this.aClass2_Sub1_2);
		super.aClass5_Sub1_9.method334(0);
		super.aClass5_Sub1_9.method352(arg2);
	}
}
