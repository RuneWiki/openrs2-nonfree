import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "Lclient!kh;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "Lclient!ah;")
	private Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!cr", name = "M", descriptor = "Lclient!fv;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "Lclient!kh;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "Lclient!fv;")
	private Class87 aClass87_2;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!cr", name = "W", descriptor = "Lclient!kh;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!cr", name = "X", descriptor = "[Lclient!ah;")
	private Class5_Sub1[] aClass5_Sub1Array1;

	@OriginalMember(owner = "client!cr", name = "ab", descriptor = "Lclient!kh;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!cr", name = "bb", descriptor = "Lclient!ah;")
	private Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!cr", name = "cb", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class128_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method875() {
		if (!super.aClass128_Sub2_7.aBoolean363 || !super.aClass128_Sub2_7.aBoolean366 || !super.aClass128_Sub2_7.bf) {
			return false;
		}
		this.aClass87_2 = new Class87(super.aClass128_Sub2_7);
		this.aClass5_Sub1_2 = new Class5_Sub1(super.aClass128_Sub2_7, 3553, 34842, 256, 256);
		this.aClass5_Sub1_2.method5547(false, false);
		this.aClass5_Sub1_1 = new Class5_Sub1(super.aClass128_Sub2_7, 3553, 34842, 256, 256);
		this.aClass5_Sub1_1.method5547(false, false);
		super.aClass128_Sub2_7.method3628(this.aClass87_2);
		this.aClass87_2.method1774(this.aClass5_Sub1_2, 0);
		this.aClass87_2.method1774(this.aClass5_Sub1_1, 1);
		this.aClass87_2.method1767(0);
		if (!this.aClass87_2.method1773()) {
			super.aClass128_Sub2_7.method3624(this.aClass87_2);
			return false;
		}
		super.aClass128_Sub2_7.method3624(this.aClass87_2);
		this.aClass136_4 = Static50.method734(super.aClass128_Sub2_7, new Class153[] { Static379.method4853("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass128_Sub2_7, 35632) });
		this.aClass136_1 = Static50.method734(super.aClass128_Sub2_7, new Class153[] { Static379.method4853("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass128_Sub2_7, 35632) });
		this.aClass136_2 = Static50.method734(super.aClass128_Sub2_7, new Class153[] { Static379.method4853("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass128_Sub2_7, 35632) });
		this.aClass136_3 = Static50.method734(super.aClass128_Sub2_7, new Class153[] { Static379.method4853("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass128_Sub2_7, 35632) });
		return this.aClass136_1 != null && this.aClass136_4 != null && this.aClass136_2 != null && this.aClass136_3 != null;
	}

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "(I)Z")
	public boolean method882() {
		return super.aClass128_Sub2_7.aBoolean363 && super.aClass128_Sub2_7.aBoolean366 && super.aClass128_Sub2_7.bf;
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
	@Override
	public void method871() {
		this.aClass5_Sub1_2 = null;
		this.aClass5_Sub1Array1 = null;
		this.aClass5_Sub1_1 = null;
		this.aClass136_1 = null;
		this.aClass136_2 = null;
		this.aClass87_1 = null;
		this.aClass136_4 = null;
		this.aClass136_3 = null;
		this.aClass87_2 = null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BII)V")
	@Override
	public void method872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1045 = arg1;
		this.anInt1047 = arg0;
		@Pc(24) int local24 = Static320.method4122(this.anInt1045);
		@Pc(29) int local29 = Static320.method4122(this.anInt1047);
		if (this.anInt1057 == local24 && this.anInt1051 == local29) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass5_Sub1Array1 != null) {
			for (local42 = 0; local42 < this.aClass5_Sub1Array1.length; local42++) {
				this.aClass5_Sub1Array1[local42].method5538();
			}
			this.aClass5_Sub1Array1 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass87_1 = null;
		} else {
			local42 = local24;
			@Pc(78) int local78 = local29;
			@Pc(80) int local80 = 0;
			if (this.aClass87_1 == null) {
				this.aClass87_1 = new Class87(super.aClass128_Sub2_7);
			}
			label56: while (true) {
				if (local42 <= 256 && local78 <= 256) {
					local42 = local24;
					local78 = local29;
					this.aClass5_Sub1Array1 = new Class5_Sub1[local80];
					local80 = 0;
					while (true) {
						if (local42 <= 256 && local78 <= 256) {
							break label56;
						}
						this.aClass5_Sub1Array1[local80++] = new Class5_Sub1(super.aClass128_Sub2_7, 3553, 34842, local42, local78);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local78 > 256) {
							local78 >>= 0x1;
						}
					}
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
				if (local78 > 256) {
					local78 >>= 0x1;
				}
				local80++;
			}
		}
		this.anInt1051 = local29;
		this.anInt1057 = local24;
	}

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)I")
	@Override
	public int method874() {
		return 1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ah;ILclient!ah;)V")
	@Override
	public void method877(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		@Pc(271) long local271;
		if (this.aClass5_Sub1Array1 == null) {
			super.aClass128_Sub2_7.method3691(arg0);
			super.aClass128_Sub2_7.method3628(this.aClass87_2);
			this.aClass87_2.method1767(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass136_4.aLong102;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static153.aFloat36, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1045, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1045, (float) this.anInt1047);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1047);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass128_Sub2_7.method3628(this.aClass87_1);
			@Pc(108) int local108 = Static320.method4122(this.anInt1045);
			@Pc(113) int local113 = Static320.method4122(this.anInt1047);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass87_1.method1774(this.aClass5_Sub1Array1[local115], 0);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass128_Sub2_7.method3691(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1045, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1045, (float) this.anInt1047);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1047);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass128_Sub2_7.method3691(this.aClass5_Sub1Array1[local115 - 1]);
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
			super.aClass128_Sub2_7.method3624(this.aClass87_1);
			super.aClass128_Sub2_7.method3691(this.aClass5_Sub1Array1[local115 - 1]);
			super.aClass128_Sub2_7.method3628(this.aClass87_2);
			this.aClass87_2.method1767(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local271 = this.aClass136_1.aLong102;
			OpenGL.glUseProgramObjectARB(local271);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static153.aFloat36, 0.0F, 0.0F);
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
		this.aClass87_2.method1767(1);
		super.aClass128_Sub2_7.method3691(this.aClass5_Sub1_2);
		local46 = this.aClass136_3.aLong102;
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
		this.aClass87_2.method1767(0);
		super.aClass128_Sub2_7.method3691(this.aClass5_Sub1_1);
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
		super.aClass128_Sub2_7.method3624(this.aClass87_2);
		local271 = this.aClass136_2.aLong102;
		OpenGL.glUseProgramObjectARB(local271);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static78.aFloat23, Static42.aFloat95, 0.0F);
		super.aClass128_Sub2_7.method3667(1);
		super.aClass128_Sub2_7.method3691(this.aClass5_Sub1_2);
		super.aClass128_Sub2_7.method3667(0);
		super.aClass128_Sub2_7.method3691(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V")
	@Override
	public void method867(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass128_Sub2_7.method3667(1);
		super.aClass128_Sub2_7.method3691(null);
		super.aClass128_Sub2_7.method3667(0);
	}

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method879() {
		return this.aClass87_2 != null;
	}
}
