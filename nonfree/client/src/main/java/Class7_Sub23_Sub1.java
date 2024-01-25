import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class7_Sub23_Sub1 extends Class7_Sub23 {

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
	private int anInt4638;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
	private int anInt4640;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "Lclient!es;")
	private Class73 aClass73_4;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Lclient!ij;")
	private Class114 aClass114_3;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "Lclient!ij;")
	private Class114 aClass114_4;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "[Lclient!ud;")
	private Class59_Sub3[] aClass59_Sub3Array4;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
	private int anInt4645;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "Lclient!ij;")
	private Class114 aClass114_5;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "Lclient!ud;")
	private Class59_Sub3 aClass59_Sub3_3;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
	private int anInt4649;

	@OriginalMember(owner = "client!nr", name = "R", descriptor = "Lclient!ij;")
	private Class114 aClass114_6;

	@OriginalMember(owner = "client!nr", name = "S", descriptor = "Lclient!es;")
	private Class73 aClass73_5;

	@OriginalMember(owner = "client!nr", name = "U", descriptor = "Lclient!ud;")
	private Class59_Sub3 aClass59_Sub3_4;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class7_Sub23_Sub1(@OriginalArg(0) Class51_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
	@Override
	public void method3681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4649 = arg0;
		this.anInt4640 = arg1;
		@Pc(20) int local20 = Static154.method2310(this.anInt4640);
		@Pc(25) int local25 = Static154.method2310(this.anInt4649);
		if (this.anInt4645 == local20 && local25 == this.anInt4638) {
			return;
		}
		@Pc(42) int local42;
		if (this.aClass59_Sub3Array4 != null) {
			for (local42 = 0; local42 < this.aClass59_Sub3Array4.length; local42++) {
				this.aClass59_Sub3Array4[local42].method5763();
			}
			this.aClass59_Sub3Array4 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass73_5 = null;
		} else {
			local42 = local20;
			@Pc(80) int local80 = local25;
			@Pc(82) int local82 = 0;
			if (this.aClass73_5 == null) {
				this.aClass73_5 = new Class73(super.aClass51_Sub2_30);
			}
			label54: while (true) {
				if (local42 <= 256 && local80 <= 256) {
					this.aClass59_Sub3Array4 = new Class59_Sub3[local82];
					local42 = local20;
					local80 = local25;
					local82 = 0;
					while (true) {
						if (local42 <= 256 && local80 <= 256) {
							break label54;
						}
						this.aClass59_Sub3Array4[local82++] = new Class59_Sub3(super.aClass51_Sub2_30, 3553, 34842, local42, local80);
						if (local42 > 256) {
							local42 >>= 0x1;
						}
						if (local80 > 256) {
							local80 >>= 0x1;
						}
					}
				}
				local82++;
				if (local80 > 256) {
					local80 >>= 0x1;
				}
				if (local42 > 256) {
					local42 >>= 0x1;
				}
			}
		}
		this.anInt4638 = local25;
		this.anInt4645 = local20;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	@Override
	public void method3683(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass51_Sub2_30.method5371(1);
		super.aClass51_Sub2_30.method5364(null);
		super.aClass51_Sub2_30.method5371(0);
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)I")
	@Override
	public int method3679() {
		return 1;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V")
	@Override
	public void method3687() {
		this.aClass114_5 = null;
		this.aClass114_4 = null;
		this.aClass59_Sub3_4 = null;
		this.aClass114_6 = null;
		this.aClass59_Sub3Array4 = null;
		this.aClass59_Sub3_3 = null;
		this.aClass73_5 = null;
		this.aClass114_3 = null;
		this.aClass73_4 = null;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3678() {
		return this.aClass73_4 != null;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3686() {
		if (!super.aClass51_Sub2_30.aBoolean458 || !super.aClass51_Sub2_30.aBoolean441 || !super.aClass51_Sub2_30.aBoolean454) {
			return false;
		}
		this.aClass73_4 = new Class73(super.aClass51_Sub2_30);
		this.aClass59_Sub3_3 = new Class59_Sub3(super.aClass51_Sub2_30, 3553, 34842, 256, 256);
		this.aClass59_Sub3_3.method5770(false, false);
		this.aClass59_Sub3_4 = new Class59_Sub3(super.aClass51_Sub2_30, 3553, 34842, 256, 256);
		this.aClass59_Sub3_4.method5770(false, false);
		super.aClass51_Sub2_30.method5386(this.aClass73_4);
		this.aClass73_4.method1737(0, this.aClass59_Sub3_3);
		this.aClass73_4.method1737(1, this.aClass59_Sub3_4);
		this.aClass73_4.method1741(0);
		if (!this.aClass73_4.method1739()) {
			super.aClass51_Sub2_30.method5372(this.aClass73_4);
			return false;
		}
		super.aClass51_Sub2_30.method5372(this.aClass73_4);
		this.aClass114_3 = Static322.method4280(new Class225[] { Static237.method3236(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass51_Sub2_30) }, super.aClass51_Sub2_30);
		this.aClass114_4 = Static322.method4280(new Class225[] { Static237.method3236(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass51_Sub2_30) }, super.aClass51_Sub2_30);
		this.aClass114_5 = Static322.method4280(new Class225[] { Static237.method3236(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass51_Sub2_30) }, super.aClass51_Sub2_30);
		this.aClass114_6 = Static322.method4280(new Class225[] { Static237.method3236(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass51_Sub2_30) }, super.aClass51_Sub2_30);
		return this.aClass114_4 != null && this.aClass114_3 != null && this.aClass114_5 != null && this.aClass114_6 != null;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ud;BILclient!ud;)V")
	@Override
	public void method3680(@OriginalArg(0) Class59_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59_Sub3 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(51) long local51;
		if (this.aClass59_Sub3Array4 == null) {
			super.aClass51_Sub2_30.method5364(arg2);
			super.aClass51_Sub2_30.method5386(this.aClass73_4);
			this.aClass73_4.method1741(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local51 = this.aClass114_3.aLong97;
			OpenGL.glUseProgramObjectARB(local51);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "params"), Static42.aFloat21, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4640, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4640, (float) this.anInt4649);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4649);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass51_Sub2_30.method5386(this.aClass73_5);
			@Pc(113) int local113 = Static154.method2310(this.anInt4640);
			@Pc(118) int local118 = Static154.method2310(this.anInt4649);
			@Pc(120) int local120 = 0;
			while (local113 > 256 || local118 > 256) {
				OpenGL.glViewport(0, 0, local113, local118);
				this.aClass73_5.method1737(0, this.aClass59_Sub3Array4[local120]);
				if (local113 > 256) {
					local113 >>= 0x1;
				}
				if (local118 > 256) {
					local118 >>= 0x1;
				}
				if (local120 == 0) {
					super.aClass51_Sub2_30.method5364(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4640, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4640, (float) this.anInt4649);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4649);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass51_Sub2_30.method5364(this.aClass59_Sub3Array4[local120 - 1]);
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
				local120++;
			}
			super.aClass51_Sub2_30.method5372(this.aClass73_5);
			super.aClass51_Sub2_30.method5364(this.aClass59_Sub3Array4[local120 - 1]);
			super.aClass51_Sub2_30.method5386(this.aClass73_4);
			this.aClass73_4.method1741(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(289) long local289 = this.aClass114_4.aLong97;
			OpenGL.glUseProgramObjectARB(local289);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local289, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local289, "params"), Static42.aFloat21, 0.0F, 0.0F);
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
		this.aClass73_4.method1741(1);
		super.aClass51_Sub2_30.method5364(this.aClass59_Sub3_3);
		local51 = this.aClass114_6.aLong97;
		OpenGL.glUseProgramObjectARB(local51);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass73_4.method1741(0);
		super.aClass51_Sub2_30.method5364(this.aClass59_Sub3_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass51_Sub2_30.method5372(this.aClass73_4);
		@Pc(447) long local447 = this.aClass114_5.aLong97;
		OpenGL.glUseProgramObjectARB(local447);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local447, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local447, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local447, "params"), Static67.aFloat38, Static223.aFloat111, 0.0F);
		super.aClass51_Sub2_30.method5371(1);
		super.aClass51_Sub2_30.method5364(this.aClass59_Sub3_3);
		super.aClass51_Sub2_30.method5371(0);
		super.aClass51_Sub2_30.method5364(arg2);
	}

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(B)Z")
	public boolean method3693() {
		return super.aClass51_Sub2_30.aBoolean458 && super.aClass51_Sub2_30.aBoolean441 && super.aClass51_Sub2_30.aBoolean454;
	}
}
