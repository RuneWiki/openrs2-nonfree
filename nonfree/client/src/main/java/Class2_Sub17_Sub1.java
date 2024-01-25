import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "Lclient!dw;")
	private Class81 aClass81_3;

	@OriginalMember(owner = "client!rda", name = "C", descriptor = "Lclient!dw;")
	private Class81 aClass81_4;

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "Lclient!rg;")
	private Class295 aClass295_6;

	@OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
	private int anInt8962;

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "Lclient!tp;")
	private Class85_Sub1 aClass85_Sub1_4;

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
	private int anInt8967;

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "Lclient!tp;")
	private Class85_Sub1 aClass85_Sub1_5;

	@OriginalMember(owner = "client!rda", name = "O", descriptor = "Lclient!dw;")
	private Class81 aClass81_5;

	@OriginalMember(owner = "client!rda", name = "Q", descriptor = "[Lclient!tp;")
	private Class85_Sub1[] aClass85_Sub1Array4;

	@OriginalMember(owner = "client!rda", name = "R", descriptor = "I")
	private int anInt8969;

	@OriginalMember(owner = "client!rda", name = "U", descriptor = "I")
	private int anInt8972;

	@OriginalMember(owner = "client!rda", name = "V", descriptor = "Lclient!dw;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!rda", name = "X", descriptor = "Lclient!rg;")
	private Class295 aClass295_7;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) Class20_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)V")
	@Override
	public void method7505(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass20_Sub3_33.method7325(1);
		super.aClass20_Sub3_33.method7358(null);
		super.aClass20_Sub3_33.method7325(0);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!tp;Lclient!tp;IB)V")
	@Override
	public void method7499(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(1) Class85_Sub1 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass85_Sub1Array4 == null) {
			super.aClass20_Sub3_33.method7358(arg1);
			super.aClass20_Sub3_33.method7360(this.aClass295_6);
			this.aClass295_6.method7565(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass81_6.aLong70;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static6.aFloat7, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt8972, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt8972, (float) this.anInt8967);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt8967);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass20_Sub3_33.method7360(this.aClass295_7);
			@Pc(32) int local32 = Static14.method293(this.anInt8972);
			@Pc(37) int local37 = Static14.method293(this.anInt8967);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass295_7.method7571(this.aClass85_Sub1Array4[local39], 0);
				if (local39 == 0) {
					super.aClass20_Sub3_33.method7358(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt8972, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt8972, (float) this.anInt8967);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8967);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass20_Sub3_33.method7358(this.aClass85_Sub1Array4[local39 - 1]);
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
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass20_Sub3_33.method7357(this.aClass295_7);
			super.aClass20_Sub3_33.method7358(this.aClass85_Sub1Array4[local39 - 1]);
			super.aClass20_Sub3_33.method7360(this.aClass295_6);
			this.aClass295_6.method7565(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass81_4.aLong70;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static6.aFloat7, 0.0F, 0.0F);
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
		this.aClass295_6.method7565(1);
		super.aClass20_Sub3_33.method7358(this.aClass85_Sub1_5);
		local269 = this.aClass81_3.aLong70;
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
		this.aClass295_6.method7565(0);
		super.aClass20_Sub3_33.method7358(this.aClass85_Sub1_4);
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
		super.aClass20_Sub3_33.method7357(this.aClass295_6);
		@Pc(439) long local439 = this.aClass81_5.aLong70;
		OpenGL.glUseProgramObjectARB(local439);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local439, "params"), Static399.aFloat165, Static145.aFloat104, 0.0F);
		super.aClass20_Sub3_33.method7325(1);
		super.aClass20_Sub3_33.method7358(this.aClass85_Sub1_5);
		super.aClass20_Sub3_33.method7325(0);
		super.aClass20_Sub3_33.method7358(arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8967 = arg0;
		this.anInt8972 = arg1;
		@Pc(20) int local20 = Static14.method293(this.anInt8972);
		@Pc(25) int local25 = Static14.method293(this.anInt8967);
		if (local20 == this.anInt8962 && this.anInt8969 == local25) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass85_Sub1Array4 != null) {
			for (local42 = 0; local42 < this.aClass85_Sub1Array4.length; local42++) {
				this.aClass85_Sub1Array4[local42].method9097();
			}
			this.aClass85_Sub1Array4 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass295_7 = null;
		} else {
			local42 = local20;
			@Pc(75) int local75 = local25;
			@Pc(77) int local77 = 0;
			label59: while (true) {
				if (local42 <= 256 && local75 <= 256) {
					if (this.aClass295_7 == null) {
						this.aClass295_7 = new Class295(super.aClass20_Sub3_33);
					}
					local42 = local20;
					this.aClass85_Sub1Array4 = new Class85_Sub1[local77];
					local75 = local25;
					local77 = 0;
					while (true) {
						if (local42 <= 256 && local75 <= 256) {
							break label59;
						}
						this.aClass85_Sub1Array4[local77++] = new Class85_Sub1(super.aClass20_Sub3_33, 3553, 34842, local42, local75);
						if (local75 > 256) {
							local75 >>= 0x1;
						}
						if (local42 > 256) {
							local42 >>= 0x1;
						}
					}
				}
				if (local75 > 256) {
					local75 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				local77++;
			}
		}
		this.anInt8962 = local20;
		this.anInt8969 = local25;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V")
	@Override
	public void method7512() {
		this.aClass81_3 = null;
		this.aClass85_Sub1_5 = null;
		this.aClass295_7 = null;
		this.aClass295_6 = null;
		this.aClass81_6 = null;
		this.aClass85_Sub1Array4 = null;
		this.aClass81_4 = null;
		this.aClass81_5 = null;
		this.aClass85_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7500() {
		return this.aClass295_6 != null;
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)Z")
	public boolean method7516() {
		return super.aClass20_Sub3_33.aBoolean626 && super.aClass20_Sub3_33.aBoolean617 && super.aClass20_Sub3_33.aBoolean625;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)I")
	@Override
	public int method7510() {
		return 1;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7507() {
		if (!super.aClass20_Sub3_33.aBoolean626 || !super.aClass20_Sub3_33.aBoolean617 || !super.aClass20_Sub3_33.aBoolean625) {
			return false;
		}
		this.aClass295_6 = new Class295(super.aClass20_Sub3_33);
		this.aClass85_Sub1_5 = new Class85_Sub1(super.aClass20_Sub3_33, 3553, 34842, 256, 256);
		this.aClass85_Sub1_5.method2893(false, false);
		this.aClass85_Sub1_4 = new Class85_Sub1(super.aClass20_Sub3_33, 3553, 34842, 256, 256);
		this.aClass85_Sub1_4.method2893(false, false);
		super.aClass20_Sub3_33.method7360(this.aClass295_6);
		this.aClass295_6.method7571(this.aClass85_Sub1_5, 0);
		this.aClass295_6.method7571(this.aClass85_Sub1_4, 1);
		this.aClass295_6.method7565(0);
		if (!this.aClass295_6.method7569()) {
			super.aClass20_Sub3_33.method7357(this.aClass295_6);
			return false;
		}
		super.aClass20_Sub3_33.method7357(this.aClass295_6);
		this.aClass81_6 = Static442.method7011(super.aClass20_Sub3_33, new Class324[] { Static137.method3091(35632, super.aClass20_Sub3_33, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass81_4 = Static442.method7011(super.aClass20_Sub3_33, new Class324[] { Static137.method3091(35632, super.aClass20_Sub3_33, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass81_5 = Static442.method7011(super.aClass20_Sub3_33, new Class324[] { Static137.method3091(35632, super.aClass20_Sub3_33, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass81_3 = Static442.method7011(super.aClass20_Sub3_33, new Class324[] { Static137.method3091(35632, super.aClass20_Sub3_33, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass81_4 != null && this.aClass81_6 != null && this.aClass81_5 != null && this.aClass81_3 != null;
	}
}
