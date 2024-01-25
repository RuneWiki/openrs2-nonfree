import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class3_Sub36_Sub1 extends Class3_Sub36 {

	@OriginalMember(owner = "client!nia", name = "u", descriptor = "Lclient!gea;")
	private Class127 aClass127_6;

	@OriginalMember(owner = "client!nia", name = "v", descriptor = "I")
	private int anInt6627;

	@OriginalMember(owner = "client!nia", name = "w", descriptor = "Lclient!rba;")
	private Class10_Sub2 aClass10_Sub2_3;

	@OriginalMember(owner = "client!nia", name = "A", descriptor = "Lclient!gw;")
	private Class142 aClass142_4;

	@OriginalMember(owner = "client!nia", name = "E", descriptor = "I")
	private int anInt6634;

	@OriginalMember(owner = "client!nia", name = "G", descriptor = "Lclient!gea;")
	private Class127 aClass127_7;

	@OriginalMember(owner = "client!nia", name = "H", descriptor = "Lclient!gw;")
	private Class142 aClass142_5;

	@OriginalMember(owner = "client!nia", name = "J", descriptor = "Lclient!rba;")
	private Class10_Sub2 aClass10_Sub2_4;

	@OriginalMember(owner = "client!nia", name = "K", descriptor = "Lclient!gw;")
	private Class142 aClass142_6;

	@OriginalMember(owner = "client!nia", name = "M", descriptor = "Lclient!gw;")
	private Class142 aClass142_7;

	@OriginalMember(owner = "client!nia", name = "N", descriptor = "I")
	private int anInt6637;

	@OriginalMember(owner = "client!nia", name = "O", descriptor = "[Lclient!rba;")
	private Class10_Sub2[] aClass10_Sub2Array2;

	@OriginalMember(owner = "client!nia", name = "P", descriptor = "I")
	private int anInt6638;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class3_Sub36_Sub1(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)I")
	@Override
	public int method5561() {
		return 1;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5570() {
		return this.aClass127_6 != null;
	}

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "(I)Z")
	public boolean method5572() {
		return super.aClass95_Sub3_26.aBoolean392 && super.aClass95_Sub3_26.aBoolean378 && super.aClass95_Sub3_26.aBoolean381;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6638 = arg0;
		this.anInt6627 = arg1;
		@Pc(16) int local16 = Static324.method4617(this.anInt6638);
		@Pc(25) int local25 = Static324.method4617(this.anInt6627);
		if (local16 == this.anInt6634 && this.anInt6637 == local25) {
			return;
		}
		@Pc(38) int local38;
		if (this.aClass10_Sub2Array2 != null) {
			for (local38 = 0; local38 < this.aClass10_Sub2Array2.length; local38++) {
				this.aClass10_Sub2Array2[local38].method6094();
			}
			this.aClass10_Sub2Array2 = null;
		}
		if (local16 <= 256 && local25 <= 256) {
			this.aClass127_7 = null;
		} else {
			local38 = local16;
			@Pc(67) int local67 = local25;
			@Pc(69) int local69 = 0;
			if (this.aClass127_7 == null) {
				this.aClass127_7 = new Class127(super.aClass95_Sub3_26);
			}
			label57: while (true) {
				if (local38 <= 256 && local67 <= 256) {
					local67 = local25;
					local38 = local16;
					this.aClass10_Sub2Array2 = new Class10_Sub2[local69];
					local69 = 0;
					while (true) {
						if (local38 <= 256 && local67 <= 256) {
							break label57;
						}
						this.aClass10_Sub2Array2[local69++] = new Class10_Sub2(super.aClass95_Sub3_26, 3553, 34842, local38, local67);
						if (local67 > 256) {
							local67 >>= 0x1;
						}
						if (local38 > 256) {
							local38 >>= 0x1;
						}
					}
				}
				if (local67 > 256) {
					local67 >>= 0x1;
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				local69++;
			}
		}
		this.anInt6637 = local25;
		this.anInt6634 = local16;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V")
	@Override
	public void method5569(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB((long) 0);
		super.aClass95_Sub3_26.method4900(1);
		super.aClass95_Sub3_26.method4864((Class10) null);
		super.aClass95_Sub3_26.method4900(0);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!rba;Lclient!rba;II)V")
	@Override
	public void method5560(@OriginalArg(0) Class10_Sub2 arg0, @OriginalArg(1) Class10_Sub2 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass10_Sub2Array2 == null) {
			super.aClass95_Sub3_26.method4864(arg0);
			super.aClass95_Sub3_26.method4863(this.aClass127_6);
			this.aClass127_6.method2987(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass142_7.aLong98;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static500.aFloat155, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6638, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6638, (float) this.anInt6627);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6627);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass95_Sub3_26.method4863(this.aClass127_7);
			@Pc(108) int local108 = Static324.method4617(this.anInt6638);
			@Pc(113) int local113 = Static324.method4617(this.anInt6627);
			@Pc(115) int local115 = 0;
			while (local108 > 256 || local113 > 256) {
				OpenGL.glViewport(0, 0, local108, local113);
				this.aClass127_7.method2978(0, this.aClass10_Sub2Array2[local115]);
				if (local108 > 256) {
					local108 >>= 0x1;
				}
				if (local115 == 0) {
					super.aClass95_Sub3_26.method4864(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6638, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6638, (float) this.anInt6627);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6627);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass95_Sub3_26.method4864(this.aClass10_Sub2Array2[local115 - 1]);
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
			super.aClass95_Sub3_26.method4836(this.aClass127_7);
			super.aClass95_Sub3_26.method4864(this.aClass10_Sub2Array2[local115 - 1]);
			super.aClass95_Sub3_26.method4863(this.aClass127_6);
			this.aClass127_6.method2987(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(278) long local278 = this.aClass142_6.aLong98;
			OpenGL.glUseProgramObjectARB(local278);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local278, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local278, "params"), Static500.aFloat155, 0.0F, 0.0F);
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
		this.aClass127_6.method2987(1);
		super.aClass95_Sub3_26.method4864(this.aClass10_Sub2_3);
		local46 = this.aClass142_5.aLong98;
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
		this.aClass127_6.method2987(0);
		super.aClass95_Sub3_26.method4864(this.aClass10_Sub2_4);
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
		super.aClass95_Sub3_26.method4836(this.aClass127_6);
		@Pc(438) long local438 = this.aClass142_4.aLong98;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static143.aFloat45, Static479.aFloat187, 0.0F);
		super.aClass95_Sub3_26.method4900(1);
		super.aClass95_Sub3_26.method4864(this.aClass10_Sub2_3);
		super.aClass95_Sub3_26.method4900(0);
		super.aClass95_Sub3_26.method4864(arg0);
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5564() {
		if (!super.aClass95_Sub3_26.aBoolean392 || !super.aClass95_Sub3_26.aBoolean378 || !super.aClass95_Sub3_26.aBoolean381) {
			return false;
		}
		this.aClass127_6 = new Class127(super.aClass95_Sub3_26);
		this.aClass10_Sub2_3 = new Class10_Sub2(super.aClass95_Sub3_26, 3553, 34842, 256, 256);
		this.aClass10_Sub2_3.method2859(false, false);
		this.aClass10_Sub2_4 = new Class10_Sub2(super.aClass95_Sub3_26, 3553, 34842, 256, 256);
		this.aClass10_Sub2_4.method2859(false, false);
		super.aClass95_Sub3_26.method4863(this.aClass127_6);
		this.aClass127_6.method2978(0, this.aClass10_Sub2_3);
		this.aClass127_6.method2978(1, this.aClass10_Sub2_4);
		this.aClass127_6.method2987(0);
		if (!this.aClass127_6.method2988()) {
			super.aClass95_Sub3_26.method4836(this.aClass127_6);
			return false;
		}
		super.aClass95_Sub3_26.method4836(this.aClass127_6);
		this.aClass142_7 = Static45.method801(new Class232[] { Static406.method5599(super.aClass95_Sub3_26, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass95_Sub3_26);
		this.aClass142_6 = Static45.method801(new Class232[] { Static406.method5599(super.aClass95_Sub3_26, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }, super.aClass95_Sub3_26);
		this.aClass142_4 = Static45.method801(new Class232[] { Static406.method5599(super.aClass95_Sub3_26, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }, super.aClass95_Sub3_26);
		this.aClass142_5 = Static45.method801(new Class232[] { Static406.method5599(super.aClass95_Sub3_26, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }, super.aClass95_Sub3_26);
		return this.aClass142_6 != null && this.aClass142_7 != null && this.aClass142_4 != null && this.aClass142_5 != null;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V")
	@Override
	public void method5562() {
		this.aClass10_Sub2_4 = null;
		this.aClass142_7 = null;
		this.aClass127_7 = null;
		this.aClass142_5 = null;
		this.aClass10_Sub2Array2 = null;
		this.aClass10_Sub2_3 = null;
		this.aClass142_6 = null;
		this.aClass142_4 = null;
		this.aClass127_6 = null;
	}
}
