import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "Lclient!di;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!di;")
	private Class70 aClass70_2;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "Lclient!di;")
	private Class70 aClass70_3;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "Lclient!di;")
	private Class70 aClass70_4;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "Lclient!wt;")
	private Class364 aClass364_1;

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "Lclient!g;")
	private Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "Lclient!g;")
	private Class24_Sub1 aClass24_Sub1_2;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "[Lclient!g;")
	private Class24_Sub1[] aClass24_Sub1Array1;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "Lclient!wt;")
	private Class364 aClass364_2;

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) Class45_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method384() {
		if (!super.aClass45_Sub3_3.aBoolean704 || !super.aClass45_Sub3_3.aBoolean689 || !super.aClass45_Sub3_3.aBoolean693) {
			return false;
		}
		this.aClass364_2 = new Class364(super.aClass45_Sub3_3);
		this.aClass24_Sub1_2 = new Class24_Sub1(super.aClass45_Sub3_3, 3553, 34842, 256, 256);
		this.aClass24_Sub1_2.method824(false, false);
		this.aClass24_Sub1_1 = new Class24_Sub1(super.aClass45_Sub3_3, 3553, 34842, 256, 256);
		this.aClass24_Sub1_1.method824(false, false);
		super.aClass45_Sub3_3.method7443(this.aClass364_2);
		this.aClass364_2.method7936(0, this.aClass24_Sub1_2);
		this.aClass364_2.method7936(1, this.aClass24_Sub1_1);
		this.aClass364_2.method7925(0);
		if (!this.aClass364_2.method7934()) {
			super.aClass45_Sub3_3.method7508(this.aClass364_2);
			return false;
		}
		super.aClass45_Sub3_3.method7508(this.aClass364_2);
		this.aClass70_3 = Static403.method5837(new Class203[] { Static131.method2612(35632, super.aClass45_Sub3_3, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass45_Sub3_3);
		this.aClass70_4 = Static403.method5837(new Class203[] { Static131.method2612(35632, super.aClass45_Sub3_3, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass45_Sub3_3);
		this.aClass70_2 = Static403.method5837(new Class203[] { Static131.method2612(35632, super.aClass45_Sub3_3, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass45_Sub3_3);
		this.aClass70_1 = Static403.method5837(new Class203[] { Static131.method2612(35632, super.aClass45_Sub3_3, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass45_Sub3_3);
		return this.aClass70_4 != null && this.aClass70_3 != null && this.aClass70_2 != null && this.aClass70_1 != null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt426 = arg1;
		this.anInt427 = arg0;
		@Pc(16) int local16 = Static489.method6617(this.anInt427);
		@Pc(30) int local30 = Static489.method6617(this.anInt426);
		if (local16 == this.anInt425 && this.anInt422 == local30) {
			return;
		}
		@Pc(43) int local43;
		if (this.aClass24_Sub1Array1 != null) {
			for (local43 = 0; local43 < this.aClass24_Sub1Array1.length; local43++) {
				this.aClass24_Sub1Array1[local43].method2797();
			}
			this.aClass24_Sub1Array1 = null;
		}
		if (local16 <= 256 && local30 <= 256) {
			this.aClass364_1 = null;
		} else {
			local43 = local16;
			@Pc(83) int local83 = local30;
			@Pc(85) int local85 = 0;
			if (this.aClass364_1 == null) {
				this.aClass364_1 = new Class364(super.aClass45_Sub3_3);
			}
			label54: while (true) {
				if (local43 <= 256 && local83 <= 256) {
					local83 = local30;
					local43 = local16;
					this.aClass24_Sub1Array1 = new Class24_Sub1[local85];
					local85 = 0;
					while (true) {
						if (local43 <= 256 && local83 <= 256) {
							break label54;
						}
						this.aClass24_Sub1Array1[local85++] = new Class24_Sub1(super.aClass45_Sub3_3, 3553, 34842, local43, local83);
						if (local83 > 256) {
							local83 >>= 0x1;
						}
						if (local43 > 256) {
							local43 >>= 0x1;
						}
					}
				}
				local85++;
				if (local83 > 256) {
					local83 >>= 0x1;
				}
				if (local43 > 256) {
					local43 >>= 0x1;
				}
			}
		}
		this.anInt422 = local30;
		this.anInt425 = local16;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!g;Lclient!g;)V")
	@Override
	public void method382(@OriginalArg(0) int arg0, @OriginalArg(2) Class24_Sub1 arg1, @OriginalArg(3) Class24_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass24_Sub1Array1 == null) {
			super.aClass45_Sub3_3.method7475(arg1);
			super.aClass45_Sub3_3.method7443(this.aClass364_2);
			this.aClass364_2.method7925(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass70_3.aLong48;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static314.aFloat118, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt427, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt427, (float) this.anInt426);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt426);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass45_Sub3_3.method7443(this.aClass364_1);
			@Pc(110) int local110 = Static489.method6617(this.anInt427);
			@Pc(115) int local115 = Static489.method6617(this.anInt426);
			@Pc(117) int local117 = 0;
			while (local110 > 256 || local115 > 256) {
				OpenGL.glViewport(0, 0, local110, local115);
				this.aClass364_1.method7936(0, this.aClass24_Sub1Array1[local117]);
				if (local115 > 256) {
					local115 >>= 0x1;
				}
				if (local117 == 0) {
					super.aClass45_Sub3_3.method7475(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt427, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt427, (float) this.anInt426);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt426);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass45_Sub3_3.method7475(this.aClass24_Sub1Array1[local117 - 1]);
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
				if (local110 > 256) {
					local110 >>= 0x1;
				}
				local117++;
			}
			super.aClass45_Sub3_3.method7508(this.aClass364_1);
			super.aClass45_Sub3_3.method7475(this.aClass24_Sub1Array1[local117 - 1]);
			super.aClass45_Sub3_3.method7443(this.aClass364_2);
			this.aClass364_2.method7925(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(282) long local282 = this.aClass70_4.aLong48;
			OpenGL.glUseProgramObjectARB(local282);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local282, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local282, "params"), Static314.aFloat118, 0.0F, 0.0F);
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
		this.aClass364_2.method7925(1);
		super.aClass45_Sub3_3.method7475(this.aClass24_Sub1_2);
		local46 = this.aClass70_1.aLong48;
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
		this.aClass364_2.method7925(0);
		super.aClass45_Sub3_3.method7475(this.aClass24_Sub1_1);
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
		super.aClass45_Sub3_3.method7508(this.aClass364_2);
		@Pc(442) long local442 = this.aClass70_2.aLong48;
		OpenGL.glUseProgramObjectARB(local442);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local442, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local442, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local442, "params"), Static506.aFloat154, Static218.aFloat94, 0.0F);
		super.aClass45_Sub3_3.method7510(1);
		super.aClass45_Sub3_3.method7475(this.aClass24_Sub1_2);
		super.aClass45_Sub3_3.method7510(0);
		super.aClass45_Sub3_3.method7475(arg1);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)I")
	@Override
	public int method381() {
		return 1;
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)Z")
	public boolean method390() {
		return super.aClass45_Sub3_3.aBoolean704 && super.aClass45_Sub3_3.aBoolean689 && super.aClass45_Sub3_3.aBoolean693;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)V")
	@Override
	public void method387(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass45_Sub3_3.method7510(1);
		super.aClass45_Sub3_3.method7475(null);
		super.aClass45_Sub3_3.method7510(0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method376() {
		return this.aClass364_2 != null;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	@Override
	public void method379() {
		this.aClass24_Sub1Array1 = null;
		this.aClass70_2 = null;
		this.aClass364_2 = null;
		this.aClass70_1 = null;
		this.aClass364_1 = null;
		this.aClass70_4 = null;
		this.aClass24_Sub1_2 = null;
		this.aClass70_3 = null;
		this.aClass24_Sub1_1 = null;
	}
}
