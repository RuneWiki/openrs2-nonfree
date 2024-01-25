import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "Lclient!ot;")
	private Class19_Sub2 aClass19_Sub2_1;

	@OriginalMember(owner = "client!aaa", name = "A", descriptor = "Lclient!vb;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "Lclient!dca;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!aaa", name = "J", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!aaa", name = "M", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!aaa", name = "O", descriptor = "Lclient!dca;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!aaa", name = "Q", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!aaa", name = "R", descriptor = "Lclient!dca;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!aaa", name = "S", descriptor = "Lclient!dca;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!aaa", name = "V", descriptor = "Lclient!vb;")
	private Class293 aClass293_2;

	@OriginalMember(owner = "client!aaa", name = "W", descriptor = "Lclient!ot;")
	private Class19_Sub2 aClass19_Sub2_2;

	@OriginalMember(owner = "client!aaa", name = "Y", descriptor = "[Lclient!ot;")
	private Class19_Sub2[] aClass19_Sub2Array1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class39_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method245() {
		return this.aClass293_1 != null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!ot;Lclient!ot;I)V")
	@Override
	public void method247(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub2 arg1, @OriginalArg(2) Class19_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass19_Sub2Array1 == null) {
			super.aClass39_Sub3_2.method5719(arg2);
			super.aClass39_Sub3_2.method5697(this.aClass293_1);
			this.aClass293_1.method7361(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass51_2.aLong41;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static41.aFloat18, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt105, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt105, (float) this.anInt102);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt102);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass39_Sub3_2.method5697(this.aClass293_2);
			@Pc(38) int local38 = Static266.method4292(this.anInt105);
			@Pc(43) int local43 = Static266.method4292(this.anInt102);
			@Pc(45) int local45 = 0;
			while (local38 > 256 || local43 > 256) {
				OpenGL.glViewport(0, 0, local38, local43);
				this.aClass293_2.method7372(this.aClass19_Sub2Array1[local45], 0);
				if (local43 > 256) {
					local43 >>= 0x1;
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local45 == 0) {
					super.aClass39_Sub3_2.method5719(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt105, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt105, (float) this.anInt102);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt102);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass39_Sub3_2.method5719(this.aClass19_Sub2Array1[local45 - 1]);
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
				local45++;
			}
			super.aClass39_Sub3_2.method5696(this.aClass293_2);
			super.aClass39_Sub3_2.method5719(this.aClass19_Sub2Array1[local45 - 1]);
			super.aClass39_Sub3_2.method5697(this.aClass293_1);
			this.aClass293_1.method7361(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass51_4.aLong41;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static41.aFloat18, 0.0F, 0.0F);
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
		this.aClass293_1.method7361(1);
		super.aClass39_Sub3_2.method5719(this.aClass19_Sub2_1);
		local269 = this.aClass51_3.aLong41;
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
		this.aClass293_1.method7361(0);
		super.aClass39_Sub3_2.method5719(this.aClass19_Sub2_2);
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
		super.aClass39_Sub3_2.method5696(this.aClass293_1);
		@Pc(433) long local433 = this.aClass51_1.aLong41;
		OpenGL.glUseProgramObjectARB(local433);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local433, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local433, "params"), Static423.aFloat208, Static75.aFloat26, 0.0F);
		super.aClass39_Sub3_2.method5750(1);
		super.aClass39_Sub3_2.method5719(this.aClass19_Sub2_1);
		super.aClass39_Sub3_2.method5750(0);
		super.aClass39_Sub3_2.method5719(arg2);
	}

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method258() {
		if (!super.aClass39_Sub3_2.aBoolean484 || !super.aClass39_Sub3_2.aBoolean500 || !super.aClass39_Sub3_2.aBoolean495) {
			return false;
		}
		this.aClass293_1 = new Class293(super.aClass39_Sub3_2);
		this.aClass19_Sub2_1 = new Class19_Sub2(super.aClass39_Sub3_2, 3553, 34842, 256, 256);
		this.aClass19_Sub2_1.method2691(false, false);
		this.aClass19_Sub2_2 = new Class19_Sub2(super.aClass39_Sub3_2, 3553, 34842, 256, 256);
		this.aClass19_Sub2_2.method2691(false, false);
		super.aClass39_Sub3_2.method5697(this.aClass293_1);
		this.aClass293_1.method7372(this.aClass19_Sub2_1, 0);
		this.aClass293_1.method7372(this.aClass19_Sub2_2, 1);
		this.aClass293_1.method7361(0);
		if (!this.aClass293_1.method7368()) {
			super.aClass39_Sub3_2.method5696(this.aClass293_1);
			return false;
		}
		super.aClass39_Sub3_2.method5696(this.aClass293_1);
		this.aClass51_2 = Static426.method6568(new Class305[] { Static515.method3365("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass39_Sub3_2, 35632) }, super.aClass39_Sub3_2);
		this.aClass51_4 = Static426.method6568(new Class305[] { Static515.method3365("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass39_Sub3_2, 35632) }, super.aClass39_Sub3_2);
		this.aClass51_1 = Static426.method6568(new Class305[] { Static515.method3365("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass39_Sub3_2, 35632) }, super.aClass39_Sub3_2);
		this.aClass51_3 = Static426.method6568(new Class305[] { Static515.method3365("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass39_Sub3_2, 35632) }, super.aClass39_Sub3_2);
		return this.aClass51_4 != null && this.aClass51_2 != null && this.aClass51_1 != null && this.aClass51_3 != null;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
	@Override
	public int method246() {
		return 1;
	}

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "(I)Z")
	public boolean method264() {
		return super.aClass39_Sub3_2.aBoolean484 && super.aClass39_Sub3_2.aBoolean500 && super.aClass39_Sub3_2.aBoolean495;
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
	@Override
	public void method256() {
		this.aClass293_2 = null;
		this.aClass293_1 = null;
		this.aClass51_3 = null;
		this.aClass51_2 = null;
		this.aClass51_4 = null;
		this.aClass51_1 = null;
		this.aClass19_Sub2Array1 = null;
		this.aClass19_Sub2_2 = null;
		this.aClass19_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
	@Override
	public void method252(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass39_Sub3_2.method5750(1);
		super.aClass39_Sub3_2.method5719(null);
		super.aClass39_Sub3_2.method5750(0);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V")
	@Override
	public void method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt105 = arg1;
		this.anInt102 = arg0;
		@Pc(22) int local22 = Static266.method4292(this.anInt105);
		@Pc(27) int local27 = Static266.method4292(this.anInt102);
		if (local22 == this.anInt108 && local27 == this.anInt99) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass19_Sub2Array1 != null) {
			for (local40 = 0; local40 < this.aClass19_Sub2Array1.length; local40++) {
				this.aClass19_Sub2Array1[local40].method4800();
			}
			this.aClass19_Sub2Array1 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass293_2 = null;
		} else {
			local40 = local22;
			@Pc(78) int local78 = local27;
			@Pc(80) int local80 = 0;
			if (this.aClass293_2 == null) {
				this.aClass293_2 = new Class293(super.aClass39_Sub3_2);
			}
			label54: while (true) {
				if (local40 <= 256 && local78 <= 256) {
					local78 = local27;
					local40 = local22;
					this.aClass19_Sub2Array1 = new Class19_Sub2[local80];
					local80 = 0;
					while (true) {
						if (local40 <= 256 && local78 <= 256) {
							break label54;
						}
						this.aClass19_Sub2Array1[local80++] = new Class19_Sub2(super.aClass39_Sub3_2, 3553, 34842, local40, local78);
						if (local40 > 256) {
							local40 >>= 0x1;
						}
						if (local78 > 256) {
							local78 >>= 0x1;
						}
					}
				}
				if (local78 > 256) {
					local78 >>= 0x1;
				}
				local80++;
				if (local40 > 256) {
					local40 >>= 0x1;
				}
			}
		}
		this.anInt108 = local22;
		this.anInt99 = local27;
	}
}
