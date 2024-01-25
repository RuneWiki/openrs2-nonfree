import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class3_Sub44_Sub1 extends Class3_Sub44 {

	@OriginalMember(owner = "client!taa", name = "t", descriptor = "I")
	private int anInt9004;

	@OriginalMember(owner = "client!taa", name = "u", descriptor = "Lclient!cba;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!taa", name = "v", descriptor = "Lclient!cba;")
	private Class42 aClass42_5;

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "Lclient!eba;")
	private Class85 aClass85_3;

	@OriginalMember(owner = "client!taa", name = "y", descriptor = "Lclient!cba;")
	private Class42 aClass42_6;

	@OriginalMember(owner = "client!taa", name = "z", descriptor = "Lclient!fba;")
	private Class94_Sub2 aClass94_Sub2_4;

	@OriginalMember(owner = "client!taa", name = "C", descriptor = "Lclient!cba;")
	private Class42 aClass42_7;

	@OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
	private int anInt9008;

	@OriginalMember(owner = "client!taa", name = "E", descriptor = "Lclient!eba;")
	private Class85 aClass85_4;

	@OriginalMember(owner = "client!taa", name = "I", descriptor = "[Lclient!fba;")
	private Class94_Sub2[] aClass94_Sub2Array3;

	@OriginalMember(owner = "client!taa", name = "J", descriptor = "I")
	private int anInt9011;

	@OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
	private int anInt9012;

	@OriginalMember(owner = "client!taa", name = "N", descriptor = "Lclient!fba;")
	private Class94_Sub2 aClass94_Sub2_5;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class3_Sub44_Sub1(@OriginalArg(0) Class82_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7733() {
		if (!super.aClass82_Sub1_39.aBoolean185 || !super.aClass82_Sub1_39.aBoolean177 || !super.aClass82_Sub1_39.aBoolean195) {
			return false;
		}
		this.aClass85_3 = new Class85(super.aClass82_Sub1_39);
		this.aClass94_Sub2_4 = new Class94_Sub2(super.aClass82_Sub1_39, 3553, 34842, 256, 256);
		this.aClass94_Sub2_4.method3120(false, false);
		this.aClass94_Sub2_5 = new Class94_Sub2(super.aClass82_Sub1_39, 3553, 34842, 256, 256);
		this.aClass94_Sub2_5.method3120(false, false);
		super.aClass82_Sub1_39.method2043(this.aClass85_3);
		this.aClass85_3.method2153(0, this.aClass94_Sub2_4);
		this.aClass85_3.method2153(1, this.aClass94_Sub2_5);
		this.aClass85_3.method2149(0);
		if (!this.aClass85_3.method2143()) {
			super.aClass82_Sub1_39.method2042(this.aClass85_3);
			return false;
		}
		super.aClass82_Sub1_39.method2042(this.aClass85_3);
		this.aClass42_6 = Static516.method7517(new Class158[] { Static519.method7555(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass82_Sub1_39) }, super.aClass82_Sub1_39);
		this.aClass42_5 = Static516.method7517(new Class158[] { Static519.method7555(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass82_Sub1_39) }, super.aClass82_Sub1_39);
		this.aClass42_7 = Static516.method7517(new Class158[] { Static519.method7555(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass82_Sub1_39) }, super.aClass82_Sub1_39);
		this.aClass42_4 = Static516.method7517(new Class158[] { Static519.method7555(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass82_Sub1_39) }, super.aClass82_Sub1_39);
		return this.aClass42_5 != null && this.aClass42_6 != null && this.aClass42_7 != null && this.aClass42_4 != null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
	@Override
	public void method7739(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass82_Sub1_39.method2086(1);
		super.aClass82_Sub1_39.method2029((Class94) null);
		super.aClass82_Sub1_39.method2086(0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V")
	@Override
	public void method7736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9004 = arg1;
		this.anInt9012 = arg0;
		@Pc(20) int local20 = Static107.method1798(this.anInt9012);
		@Pc(25) int local25 = Static107.method1798(this.anInt9004);
		if (local20 == this.anInt9008 && this.anInt9011 == local25) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass94_Sub2Array3 != null) {
			for (local38 = 0; local38 < this.aClass94_Sub2Array3.length; local38++) {
				this.aClass94_Sub2Array3[local38].method4008();
			}
			this.aClass94_Sub2Array3 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass85_4 = null;
		} else {
			local38 = local20;
			@Pc(65) int local65 = local25;
			@Pc(67) int local67 = 0;
			if (this.aClass85_4 == null) {
				this.aClass85_4 = new Class85(super.aClass82_Sub1_39);
			}
			label55: while (true) {
				if (local38 <= 256 && local65 <= 256) {
					this.aClass94_Sub2Array3 = new Class94_Sub2[local67];
					local38 = local20;
					local65 = local25;
					local67 = 0;
					while (true) {
						if (local38 <= 256 && local65 <= 256) {
							break label55;
						}
						this.aClass94_Sub2Array3[local67++] = new Class94_Sub2(super.aClass82_Sub1_39, 3553, 34842, local38, local65);
						if (local65 > 256) {
							local65 >>= 0x1;
						}
						if (local38 > 256) {
							local38 >>= 0x1;
						}
					}
				}
				if (local65 > 256) {
					local65 >>= 0x1;
				}
				local67++;
				if (local38 > 256) {
					local38 >>= 0x1;
				}
			}
		}
		this.anInt9008 = local20;
		this.anInt9011 = local25;
	}

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "(Z)I")
	@Override
	public int method7737() {
		return 1;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	@Override
	public void method7734() {
		this.aClass94_Sub2Array3 = null;
		this.aClass42_4 = null;
		this.aClass42_6 = null;
		this.aClass94_Sub2_4 = null;
		this.aClass42_7 = null;
		this.aClass42_5 = null;
		this.aClass94_Sub2_5 = null;
		this.aClass85_4 = null;
		this.aClass85_3 = null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!fba;ILclient!fba;I)V")
	@Override
	public void method7741(@OriginalArg(0) Class94_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class94_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(48) long local48;
		if (this.aClass94_Sub2Array3 == null) {
			super.aClass82_Sub1_39.method2029(arg0);
			super.aClass82_Sub1_39.method2043(this.aClass85_3);
			this.aClass85_3.method2149(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local48 = this.aClass42_6.aLong45;
			OpenGL.glUseProgramObjectARB(local48);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "params"), Static76.aFloat25, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9012, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9012, (float) this.anInt9004);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9004);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass82_Sub1_39.method2043(this.aClass85_4);
			@Pc(110) int local110 = Static107.method1798(this.anInt9012);
			@Pc(115) int local115 = Static107.method1798(this.anInt9004);
			@Pc(117) int local117 = 0;
			while (local110 > 256 || local115 > 256) {
				OpenGL.glViewport(0, 0, local110, local115);
				this.aClass85_4.method2153(0, this.aClass94_Sub2Array3[local117]);
				if (local110 > 256) {
					local110 >>= 0x1;
				}
				if (local115 > 256) {
					local115 >>= 0x1;
				}
				if (local117 == 0) {
					super.aClass82_Sub1_39.method2029(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9012, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9012, (float) this.anInt9004);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9004);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass82_Sub1_39.method2029(this.aClass94_Sub2Array3[local117 - 1]);
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
				local117++;
			}
			super.aClass82_Sub1_39.method2042(this.aClass85_4);
			super.aClass82_Sub1_39.method2029(this.aClass94_Sub2Array3[local117 - 1]);
			super.aClass82_Sub1_39.method2043(this.aClass85_3);
			this.aClass85_3.method2149(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(280) long local280 = this.aClass42_5.aLong45;
			OpenGL.glUseProgramObjectARB(local280);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local280, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local280, "params"), Static76.aFloat25, 0.0F, 0.0F);
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
		this.aClass85_3.method2149(1);
		super.aClass82_Sub1_39.method2029(this.aClass94_Sub2_4);
		local48 = this.aClass42_4.aLong45;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass85_3.method2149(0);
		super.aClass82_Sub1_39.method2029(this.aClass94_Sub2_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass82_Sub1_39.method2042(this.aClass85_3);
		@Pc(440) long local440 = this.aClass42_7.aLong45;
		OpenGL.glUseProgramObjectARB(local440);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local440, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local440, "params"), Static488.aFloat155, Static27.aFloat7, 0.0F);
		super.aClass82_Sub1_39.method2086(1);
		super.aClass82_Sub1_39.method2029(this.aClass94_Sub2_4);
		super.aClass82_Sub1_39.method2086(0);
		super.aClass82_Sub1_39.method2029(arg0);
	}

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7740() {
		return this.aClass85_3 != null;
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)Z")
	public boolean method7745() {
		return super.aClass82_Sub1_39.aBoolean185 && super.aClass82_Sub1_39.aBoolean177 && super.aClass82_Sub1_39.aBoolean195;
	}
}
