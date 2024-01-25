import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	private int anInt2318;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "Lclient!ks;")
	private Class142 aClass142_6;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!ks;")
	private Class142 aClass142_7;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!rs;")
	private Class210 aClass210_2;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Lclient!rs;")
	private Class210 aClass210_3;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "[Lclient!wg;")
	private Class1_Sub3[] aClass1_Sub3Array2;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "Lclient!rs;")
	private Class210 aClass210_4;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lclient!wg;")
	private Class1_Sub3 aClass1_Sub3_5;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "Lclient!wg;")
	private Class1_Sub3 aClass1_Sub3_6;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!rs;")
	private Class210 aClass210_5;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class4_Sub12_Sub1(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wg;Lclient!wg;II)V")
	@Override
	public void method1734(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(53) long local53;
		if (this.aClass1_Sub3Array2 == null) {
			super.aClass30_Sub1_16.method916(arg0);
			super.aClass30_Sub1_16.method972(this.aClass142_6);
			this.aClass142_6.method3096(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local53 = this.aClass210_5.aLong180;
			OpenGL.glUseProgramObjectARB(local53);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "params"), Static407.aFloat201, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2318, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2318, (float) this.anInt2326);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2326);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass30_Sub1_16.method972(this.aClass142_7);
			@Pc(115) int local115 = Static79.method1390(this.anInt2318);
			@Pc(120) int local120 = Static79.method1390(this.anInt2326);
			@Pc(122) int local122 = 0;
			while (local115 > 256 || local120 > 256) {
				OpenGL.glViewport(0, 0, local115, local120);
				this.aClass142_7.method3088(0, this.aClass1_Sub3Array2[local122]);
				if (local115 > 256) {
					local115 >>= 0x1;
				}
				if (local120 > 256) {
					local120 >>= 0x1;
				}
				if (local122 == 0) {
					super.aClass30_Sub1_16.method916(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2318, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2318, (float) this.anInt2326);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2326);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass30_Sub1_16.method916(this.aClass1_Sub3Array2[local122 - 1]);
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
				local122++;
			}
			super.aClass30_Sub1_16.method908(this.aClass142_7);
			super.aClass30_Sub1_16.method916(this.aClass1_Sub3Array2[local122 - 1]);
			super.aClass30_Sub1_16.method972(this.aClass142_6);
			this.aClass142_6.method3096(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(282) long local282 = this.aClass210_3.aLong180;
			OpenGL.glUseProgramObjectARB(local282);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local282, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local282, "params"), Static407.aFloat201, 0.0F, 0.0F);
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
		this.aClass142_6.method3096(1);
		super.aClass30_Sub1_16.method916(this.aClass1_Sub3_6);
		local53 = this.aClass210_2.aLong180;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass142_6.method3096(0);
		super.aClass30_Sub1_16.method916(this.aClass1_Sub3_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass30_Sub1_16.method908(this.aClass142_6);
		@Pc(438) long local438 = this.aClass210_4.aLong180;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static139.aFloat80, Static267.aFloat135, 0.0F);
		super.aClass30_Sub1_16.method948(1);
		super.aClass30_Sub1_16.method916(this.aClass1_Sub3_6);
		super.aClass30_Sub1_16.method948(0);
		super.aClass30_Sub1_16.method916(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	@Override
	public void method1738() {
		this.aClass1_Sub3_5 = null;
		this.aClass142_7 = null;
		this.aClass1_Sub3Array2 = null;
		this.aClass210_3 = null;
		this.aClass210_4 = null;
		this.aClass1_Sub3_6 = null;
		this.aClass210_5 = null;
		this.aClass210_2 = null;
		this.aClass142_6 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V")
	@Override
	public void method1737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2326 = arg0;
		this.anInt2318 = arg1;
		@Pc(22) int local22 = Static79.method1390(this.anInt2318);
		@Pc(27) int local27 = Static79.method1390(this.anInt2326);
		if (local22 == this.anInt2328 && this.anInt2329 == local27) {
			return;
		}
		@Pc(44) int local44;
		if (this.aClass1_Sub3Array2 != null) {
			for (local44 = 0; local44 < this.aClass1_Sub3Array2.length; local44++) {
				this.aClass1_Sub3Array2[local44].method4271();
			}
			this.aClass1_Sub3Array2 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass142_7 = null;
		} else {
			local44 = local22;
			@Pc(77) int local77 = local27;
			@Pc(79) int local79 = 0;
			if (this.aClass142_7 == null) {
				this.aClass142_7 = new Class142(super.aClass30_Sub1_16);
			}
			label55: while (true) {
				if (local44 <= 256 && local77 <= 256) {
					this.aClass1_Sub3Array2 = new Class1_Sub3[local79];
					local44 = local22;
					local77 = local27;
					local79 = 0;
					while (true) {
						if (local44 <= 256 && local77 <= 256) {
							break label55;
						}
						this.aClass1_Sub3Array2[local79++] = new Class1_Sub3(super.aClass30_Sub1_16, 3553, 34842, local44, local77);
						if (local44 > 256) {
							local44 >>= 0x1;
						}
						if (local77 > 256) {
							local77 >>= 0x1;
						}
					}
				}
				if (local44 > 256) {
					local44 >>= 0x1;
				}
				local79++;
				if (local77 > 256) {
					local77 >>= 0x1;
				}
			}
		}
		this.anInt2328 = local22;
		this.anInt2329 = local27;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
	public boolean method1742() {
		return super.aClass30_Sub1_16.aBoolean69 && super.aClass30_Sub1_16.aBoolean65 && super.aClass30_Sub1_16.aBoolean64;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1735() {
		if (!super.aClass30_Sub1_16.aBoolean69 || !super.aClass30_Sub1_16.aBoolean65 || !super.aClass30_Sub1_16.aBoolean64) {
			return false;
		}
		this.aClass142_6 = new Class142(super.aClass30_Sub1_16);
		this.aClass1_Sub3_6 = new Class1_Sub3(super.aClass30_Sub1_16, 3553, 34842, 256, 256);
		this.aClass1_Sub3_6.method3964(false, false);
		this.aClass1_Sub3_5 = new Class1_Sub3(super.aClass30_Sub1_16, 3553, 34842, 256, 256);
		this.aClass1_Sub3_5.method3964(false, false);
		super.aClass30_Sub1_16.method972(this.aClass142_6);
		this.aClass142_6.method3088(0, this.aClass1_Sub3_6);
		this.aClass142_6.method3088(1, this.aClass1_Sub3_5);
		this.aClass142_6.method3096(0);
		if (!this.aClass142_6.method3094()) {
			super.aClass30_Sub1_16.method908(this.aClass142_6);
			return false;
		}
		super.aClass30_Sub1_16.method908(this.aClass142_6);
		this.aClass210_5 = Static94.method1545(new Class79[] { Static47.method994(super.aClass30_Sub1_16, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass30_Sub1_16);
		this.aClass210_3 = Static94.method1545(new Class79[] { Static47.method994(super.aClass30_Sub1_16, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632) }, super.aClass30_Sub1_16);
		this.aClass210_4 = Static94.method1545(new Class79[] { Static47.method994(super.aClass30_Sub1_16, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632) }, super.aClass30_Sub1_16);
		this.aClass210_2 = Static94.method1545(new Class79[] { Static47.method994(super.aClass30_Sub1_16, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632) }, super.aClass30_Sub1_16);
		return this.aClass210_3 != null && this.aClass210_5 != null && this.aClass210_4 != null && this.aClass210_2 != null;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method1730() {
		return this.aClass142_6 != null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	@Override
	public void method1732(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass30_Sub1_16.method948(1);
		super.aClass30_Sub1_16.method916(null);
		super.aClass30_Sub1_16.method948(0);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	@Override
	public int method1729() {
		return 1;
	}
}
