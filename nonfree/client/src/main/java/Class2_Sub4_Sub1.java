import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[Lclient!pm;")
	private Class23_Sub1[] aClass23_Sub1Array1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!laa;")
	private Class201 aClass201_1;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!laa;")
	private Class201 aClass201_2;

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!qk;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "Lclient!laa;")
	private Class201 aClass201_3;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "Lclient!qk;")
	private Class271 aClass271_2;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Lclient!laa;")
	private Class201 aClass201_4;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Lclient!pm;")
	private Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "Lclient!pm;")
	private Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
	@Override
	public int method612() {
		return 1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	@Override
	public void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt890 = arg0;
		this.anInt887 = arg1;
		@Pc(23) int local23 = Static285.method5287(this.anInt890);
		@Pc(28) int local28 = Static285.method5287(this.anInt887);
		if (local23 == this.anInt880 && this.anInt881 == local28) {
			return;
		}
		@Pc(45) int local45;
		if (this.aClass23_Sub1Array1 != null) {
			for (local45 = 0; local45 < this.aClass23_Sub1Array1.length; local45++) {
				this.aClass23_Sub1Array1[local45].method7779();
			}
			this.aClass23_Sub1Array1 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass271_2 = null;
		} else {
			local45 = local23;
			@Pc(76) int local76 = local28;
			@Pc(78) int local78 = 0;
			label57: while (true) {
				if (local45 <= 256 && local76 <= 256) {
					if (this.aClass271_2 == null) {
						this.aClass271_2 = new Class271(super.aClass100_Sub3_6);
					}
					this.aClass23_Sub1Array1 = new Class23_Sub1[local78];
					local45 = local23;
					local76 = local28;
					local78 = 0;
					while (true) {
						if (local45 <= 256 && local76 <= 256) {
							break label57;
						}
						this.aClass23_Sub1Array1[local78++] = new Class23_Sub1(super.aClass100_Sub3_6, 3553, 34842, local45, local76);
						if (local45 > 256) {
							local45 >>= 0x1;
						}
						if (local76 > 256) {
							local76 >>= 0x1;
						}
					}
				}
				if (local45 > 256) {
					local45 >>= 0x1;
				}
				local78++;
				if (local76 > 256) {
					local76 >>= 0x1;
				}
			}
		}
		this.anInt880 = local23;
		this.anInt881 = local28;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	public void method614() {
		this.aClass23_Sub1Array1 = null;
		this.aClass201_1 = null;
		this.aClass201_2 = null;
		this.aClass23_Sub1_2 = null;
		this.aClass271_1 = null;
		this.aClass201_3 = null;
		this.aClass201_4 = null;
		this.aClass271_2 = null;
		this.aClass23_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)Z")
	public boolean method623() {
		return super.aClass100_Sub3_6.aBoolean600 && super.aClass100_Sub3_6.aBoolean588 && super.aClass100_Sub3_6.aBoolean602;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method618() {
		if (!super.aClass100_Sub3_6.aBoolean600 || !super.aClass100_Sub3_6.aBoolean588 || !super.aClass100_Sub3_6.aBoolean602) {
			return false;
		}
		this.aClass271_1 = new Class271(super.aClass100_Sub3_6);
		this.aClass23_Sub1_1 = new Class23_Sub1(super.aClass100_Sub3_6, 3553, 34842, 256, 256);
		this.aClass23_Sub1_1.method377(false, false);
		this.aClass23_Sub1_2 = new Class23_Sub1(super.aClass100_Sub3_6, 3553, 34842, 256, 256);
		this.aClass23_Sub1_2.method377(false, false);
		super.aClass100_Sub3_6.method6343(this.aClass271_1);
		this.aClass271_1.method6361(this.aClass23_Sub1_1, 0);
		this.aClass271_1.method6361(this.aClass23_Sub1_2, 1);
		this.aClass271_1.method6356(0);
		if (!this.aClass271_1.method6357()) {
			super.aClass100_Sub3_6.method6298(this.aClass271_1);
			return false;
		}
		super.aClass100_Sub3_6.method6298(this.aClass271_1);
		this.aClass201_4 = Static273.method4135(new Class10[] { Static337.method5151(super.aClass100_Sub3_6, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass100_Sub3_6);
		this.aClass201_1 = Static273.method4135(new Class10[] { Static337.method5151(super.aClass100_Sub3_6, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass100_Sub3_6);
		this.aClass201_2 = Static273.method4135(new Class10[] { Static337.method5151(super.aClass100_Sub3_6, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass100_Sub3_6);
		this.aClass201_3 = Static273.method4135(new Class10[] { Static337.method5151(super.aClass100_Sub3_6, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass100_Sub3_6);
		return this.aClass201_1 != null && this.aClass201_4 != null && this.aClass201_2 != null && this.aClass201_3 != null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	@Override
	public void method621(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass100_Sub3_6.method6344(1);
		super.aClass100_Sub3_6.method6277(null);
		super.aClass100_Sub3_6.method6344(0);
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method622() {
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!pm;ZILclient!pm;)V")
	@Override
	public void method611(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass23_Sub1Array1 == null) {
			super.aClass100_Sub3_6.method6277(arg0);
			super.aClass100_Sub3_6.method6343(this.aClass271_1);
			this.aClass271_1.method6356(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass201_4.aLong134;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static389.aFloat199, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt890, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt890, (float) this.anInt887);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt887);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass100_Sub3_6.method6343(this.aClass271_2);
			@Pc(32) int local32 = Static285.method5287(this.anInt890);
			@Pc(37) int local37 = Static285.method5287(this.anInt887);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass271_2.method6361(this.aClass23_Sub1Array1[local39], 0);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass100_Sub3_6.method6277(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt890, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt890, (float) this.anInt887);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt887);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass100_Sub3_6.method6277(this.aClass23_Sub1Array1[local39 - 1]);
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
				local39++;
			}
			super.aClass100_Sub3_6.method6298(this.aClass271_2);
			super.aClass100_Sub3_6.method6277(this.aClass23_Sub1Array1[local39 - 1]);
			super.aClass100_Sub3_6.method6343(this.aClass271_1);
			this.aClass271_1.method6356(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass201_1.aLong134;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static389.aFloat199, 0.0F, 0.0F);
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
		this.aClass271_1.method6356(1);
		super.aClass100_Sub3_6.method6277(this.aClass23_Sub1_1);
		local269 = this.aClass201_3.aLong134;
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
		this.aClass271_1.method6356(0);
		super.aClass100_Sub3_6.method6277(this.aClass23_Sub1_2);
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
		super.aClass100_Sub3_6.method6298(this.aClass271_1);
		@Pc(433) long local433 = this.aClass201_2.aLong134;
		OpenGL.glUseProgramObjectARB(local433);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local433, "params"), Static42.aFloat23, Static461.aFloat248, 0.0F);
		super.aClass100_Sub3_6.method6344(1);
		super.aClass100_Sub3_6.method6277(this.aClass23_Sub1_1);
		super.aClass100_Sub3_6.method6344(0);
		super.aClass100_Sub3_6.method6277(arg0);
	}
}
