import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class4_Sub46_Sub1 extends Class4_Sub46 {

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Lclient!ci;")
	private Class51 aClass51_6;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
	private int anInt9262;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "Lclient!saa;")
	private Class77_Sub1 aClass77_Sub1_5;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "[Lclient!saa;")
	private Class77_Sub1[] aClass77_Sub1Array2;

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "Lclient!fr;")
	private Class107 aClass107_4;

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "Lclient!fr;")
	private Class107 aClass107_5;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "Lclient!fr;")
	private Class107 aClass107_6;

	@OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
	private int anInt9266;

	@OriginalMember(owner = "client!ts", name = "F", descriptor = "Lclient!saa;")
	private Class77_Sub1 aClass77_Sub1_6;

	@OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
	private int anInt9267;

	@OriginalMember(owner = "client!ts", name = "I", descriptor = "Lclient!ci;")
	private Class51 aClass51_7;

	@OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
	private int anInt9270;

	@OriginalMember(owner = "client!ts", name = "O", descriptor = "Lclient!fr;")
	private Class107 aClass107_7;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class4_Sub46_Sub1(@OriginalArg(0) Class44_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9267 = arg0;
		this.anInt9270 = arg1;
		@Pc(20) int local20 = Static563.method8072(this.anInt9270);
		@Pc(25) int local25 = Static563.method8072(this.anInt9267);
		if (this.anInt9266 == local20 && this.anInt9262 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass77_Sub1Array2 != null) {
			for (local42 = 0; local42 < this.aClass77_Sub1Array2.length; local42++) {
				this.aClass77_Sub1Array2[local42].method7069();
			}
			this.aClass77_Sub1Array2 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass51_6 = null;
		} else {
			local42 = local20;
			@Pc(80) int local80 = local25;
			@Pc(82) int local82 = 0;
			label56: while (true) {
				if (local42 <= 256 && local80 <= 256) {
					if (this.aClass51_6 == null) {
						this.aClass51_6 = new Class51(super.aClass44_Sub3_41);
					}
					local80 = local25;
					this.aClass77_Sub1Array2 = new Class77_Sub1[local82];
					local42 = local20;
					local82 = 0;
					while (true) {
						if (local42 <= 256 && local80 <= 256) {
							break label56;
						}
						this.aClass77_Sub1Array2[local82++] = new Class77_Sub1(super.aClass44_Sub3_41, 3553, 34842, local42, local80);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local80 > 256) {
							local80 >>= 0x1;
						}
					}
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local82++;
				if (local80 > 256) {
					local80 >>= 0x1;
				}
			}
		}
		this.anInt9266 = local20;
		this.anInt9262 = local25;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	@Override
	public void method7552(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass44_Sub3_41.method4648(1);
		super.aClass44_Sub3_41.method4605(null);
		super.aClass44_Sub3_41.method4648(0);
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(B)Z")
	public boolean method7561() {
		return super.aClass44_Sub3_41.aBoolean412 && super.aClass44_Sub3_41.aBoolean407 && super.aClass44_Sub3_41.aBoolean406;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7554() {
		return this.aClass51_7 != null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!saa;ILclient!saa;B)V")
	@Override
	public void method7559(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(266) long local266;
		if (this.aClass77_Sub1Array2 == null) {
			super.aClass44_Sub3_41.method4605(arg2);
			super.aClass44_Sub3_41.method4626(this.aClass51_7);
			this.aClass51_7.method1103(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local266 = this.aClass107_7.aLong74;
			OpenGL.glUseProgramObjectARB(local266);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "params"), Static389.aFloat204, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9270, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9270, (float) this.anInt9267);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9267);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass44_Sub3_41.method4626(this.aClass51_6);
			@Pc(32) int local32 = Static563.method8072(this.anInt9270);
			@Pc(37) int local37 = Static563.method8072(this.anInt9267);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass51_6.method1093(this.aClass77_Sub1Array2[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass44_Sub3_41.method4605(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9270, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9270, (float) this.anInt9267);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9267);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass44_Sub3_41.method4605(this.aClass77_Sub1Array2[local39 - 1]);
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
			super.aClass44_Sub3_41.method4627(this.aClass51_6);
			super.aClass44_Sub3_41.method4605(this.aClass77_Sub1Array2[local39 - 1]);
			super.aClass44_Sub3_41.method4626(this.aClass51_7);
			this.aClass51_7.method1103(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(198) long local198 = this.aClass107_6.aLong74;
			OpenGL.glUseProgramObjectARB(local198);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static389.aFloat204, 0.0F, 0.0F);
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
		this.aClass51_7.method1103(1);
		super.aClass44_Sub3_41.method4605(this.aClass77_Sub1_6);
		local266 = this.aClass107_5.aLong74;
		OpenGL.glUseProgramObjectARB(local266);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass51_7.method1103(0);
		super.aClass44_Sub3_41.method4605(this.aClass77_Sub1_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass44_Sub3_41.method4627(this.aClass51_7);
		@Pc(434) long local434 = this.aClass107_4.aLong74;
		OpenGL.glUseProgramObjectARB(local434);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local434, "params"), Static150.aFloat110, Static51.aFloat19, 0.0F);
		super.aClass44_Sub3_41.method4648(1);
		super.aClass44_Sub3_41.method4605(this.aClass77_Sub1_6);
		super.aClass44_Sub3_41.method4648(0);
		super.aClass44_Sub3_41.method4605(arg2);
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)I")
	@Override
	public int method7556() {
		return 1;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	@Override
	public void method7560() {
		this.aClass51_6 = null;
		this.aClass77_Sub1_5 = null;
		this.aClass107_4 = null;
		this.aClass107_6 = null;
		this.aClass107_7 = null;
		this.aClass107_5 = null;
		this.aClass77_Sub1_6 = null;
		this.aClass51_7 = null;
		this.aClass77_Sub1Array2 = null;
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7557() {
		if (!super.aClass44_Sub3_41.aBoolean412 || !super.aClass44_Sub3_41.aBoolean407 || !super.aClass44_Sub3_41.aBoolean406) {
			return false;
		}
		this.aClass51_7 = new Class51(super.aClass44_Sub3_41);
		this.aClass77_Sub1_6 = new Class77_Sub1(super.aClass44_Sub3_41, 3553, 34842, 256, 256);
		this.aClass77_Sub1_6.method2266(false, false);
		this.aClass77_Sub1_5 = new Class77_Sub1(super.aClass44_Sub3_41, 3553, 34842, 256, 256);
		this.aClass77_Sub1_5.method2266(false, false);
		super.aClass44_Sub3_41.method4626(this.aClass51_7);
		this.aClass51_7.method1093(this.aClass77_Sub1_6, 0);
		this.aClass51_7.method1093(this.aClass77_Sub1_5, 1);
		this.aClass51_7.method1103(0);
		if (!this.aClass51_7.method1102()) {
			super.aClass44_Sub3_41.method4627(this.aClass51_7);
			return false;
		}
		super.aClass44_Sub3_41.method4627(this.aClass51_7);
		this.aClass107_7 = Static391.method6206(new Class27[] { Static487.method7237(super.aClass44_Sub3_41, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass44_Sub3_41);
		this.aClass107_6 = Static391.method6206(new Class27[] { Static487.method7237(super.aClass44_Sub3_41, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass44_Sub3_41);
		this.aClass107_4 = Static391.method6206(new Class27[] { Static487.method7237(super.aClass44_Sub3_41, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) }, super.aClass44_Sub3_41);
		this.aClass107_5 = Static391.method6206(new Class27[] { Static487.method7237(super.aClass44_Sub3_41, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) }, super.aClass44_Sub3_41);
		return this.aClass107_6 != null && this.aClass107_7 != null && this.aClass107_4 != null && this.aClass107_5 != null;
	}
}
