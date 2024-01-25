import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub23_Sub1 extends Class1_Sub23 {

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
	private int anInt3453;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "Lclient!gb;")
	private Class90 aClass90_5;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!re;")
	private Class218 aClass218_3;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	private int anInt3457;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "Lclient!re;")
	private Class218 aClass218_4;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!gb;")
	private Class90 aClass90_6;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!re;")
	private Class218 aClass218_5;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "Lclient!gu;")
	private Class23_Sub3 aClass23_Sub3_4;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[Lclient!gu;")
	private Class23_Sub3[] aClass23_Sub3Array2;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!gu;")
	private Class23_Sub3 aClass23_Sub3_5;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "Lclient!re;")
	private Class218 aClass218_6;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	private int anInt3465;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub23_Sub1(@OriginalArg(0) Class117_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	@Override
	public void method2725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3453 = arg0;
		this.anInt3457 = arg1;
		@Pc(16) int local16 = Static235.method3355(this.anInt3453);
		@Pc(26) int local26 = Static235.method3355(this.anInt3457);
		if (local16 == this.anInt3465 && local26 == this.anInt3458) {
			return;
		}
		@Pc(43) int local43;
		if (this.aClass23_Sub3Array2 != null) {
			for (local43 = 0; local43 < this.aClass23_Sub3Array2.length; local43++) {
				this.aClass23_Sub3Array2[local43].method5800();
			}
			this.aClass23_Sub3Array2 = null;
		}
		if (local16 <= 256 && local26 <= 256) {
			this.aClass90_5 = null;
		} else {
			local43 = local16;
			@Pc(81) int local81 = local26;
			@Pc(83) int local83 = 0;
			if (this.aClass90_5 == null) {
				this.aClass90_5 = new Class90(super.aClass117_Sub1_19);
			}
			label54: while (true) {
				if (local43 <= 256 && local81 <= 256) {
					local81 = local26;
					this.aClass23_Sub3Array2 = new Class23_Sub3[local83];
					local43 = local16;
					local83 = 0;
					while (true) {
						if (local43 <= 256 && local81 <= 256) {
							break label54;
						}
						this.aClass23_Sub3Array2[local83++] = new Class23_Sub3(super.aClass117_Sub1_19, 3553, 34842, local43, local81);
						if (local43 > 256) {
							local43 >>= 0x1;
						}
						if (local81 > 256) {
							local81 >>= 0x1;
						}
					}
				}
				local83++;
				if (local81 > 256) {
					local81 >>= 0x1;
				}
				if (local43 > 256) {
					local43 >>= 0x1;
				}
			}
		}
		this.anInt3465 = local16;
		this.anInt3458 = local26;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	@Override
	public void method2729() {
		this.aClass23_Sub3_5 = null;
		this.aClass90_5 = null;
		this.aClass23_Sub3Array2 = null;
		this.aClass218_5 = null;
		this.aClass218_4 = null;
		this.aClass218_6 = null;
		this.aClass218_3 = null;
		this.aClass90_6 = null;
		this.aClass23_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)Z")
	public boolean method2732() {
		return super.aClass117_Sub1_19.aBoolean310 && super.aClass117_Sub1_19.bf && super.aClass117_Sub1_19.aBoolean288;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2724() {
		return this.aClass90_6 != null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!gu;ILclient!gu;I)V")
	@Override
	public void method2731(@OriginalArg(0) Class23_Sub3 arg0, @OriginalArg(2) Class23_Sub3 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(275) long local275;
		if (this.aClass23_Sub3Array2 == null) {
			super.aClass117_Sub1_19.method2504(arg1);
			super.aClass117_Sub1_19.method2464(this.aClass90_6);
			this.aClass90_6.method1658(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local275 = this.aClass218_3.aLong188;
			OpenGL.glUseProgramObjectARB(local275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "params"), Static461.aFloat92, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3453, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3453, (float) this.anInt3457);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3457);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass117_Sub1_19.method2464(this.aClass90_5);
			@Pc(32) int local32 = Static235.method3355(this.anInt3453);
			@Pc(37) int local37 = Static235.method3355(this.anInt3457);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass90_5.method1650(this.aClass23_Sub3Array2[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass117_Sub1_19.method2504(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3453, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3453, (float) this.anInt3457);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3457);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass117_Sub1_19.method2504(this.aClass23_Sub3Array2[local39 - 1]);
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
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass117_Sub1_19.method2467(this.aClass90_5);
			super.aClass117_Sub1_19.method2504(this.aClass23_Sub3Array2[local39 - 1]);
			super.aClass117_Sub1_19.method2464(this.aClass90_6);
			this.aClass90_6.method1658(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(205) long local205 = this.aClass218_5.aLong188;
			OpenGL.glUseProgramObjectARB(local205);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local205, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local205, "params"), Static461.aFloat92, 0.0F, 0.0F);
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
		this.aClass90_6.method1658(1);
		super.aClass117_Sub1_19.method2504(this.aClass23_Sub3_4);
		local275 = this.aClass218_6.aLong188;
		OpenGL.glUseProgramObjectARB(local275);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local275, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass90_6.method1658(0);
		super.aClass117_Sub1_19.method2504(this.aClass23_Sub3_5);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local275, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass117_Sub1_19.method2467(this.aClass90_6);
		@Pc(443) long local443 = this.aClass218_4.aLong188;
		OpenGL.glUseProgramObjectARB(local443);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local443, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local443, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local443, "params"), Static297.aFloat70, Static17.aFloat56, 0.0F);
		super.aClass117_Sub1_19.method2476(1);
		super.aClass117_Sub1_19.method2504(this.aClass23_Sub3_4);
		super.aClass117_Sub1_19.method2476(0);
		super.aClass117_Sub1_19.method2504(arg1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2722() {
		if (!super.aClass117_Sub1_19.aBoolean310 || !super.aClass117_Sub1_19.bf || !super.aClass117_Sub1_19.aBoolean288) {
			return false;
		}
		this.aClass90_6 = new Class90(super.aClass117_Sub1_19);
		this.aClass23_Sub3_4 = new Class23_Sub3(super.aClass117_Sub1_19, 3553, 34842, 256, 256);
		this.aClass23_Sub3_4.method5808(false, false);
		this.aClass23_Sub3_5 = new Class23_Sub3(super.aClass117_Sub1_19, 3553, 34842, 256, 256);
		this.aClass23_Sub3_5.method5808(false, false);
		super.aClass117_Sub1_19.method2464(this.aClass90_6);
		this.aClass90_6.method1650(this.aClass23_Sub3_4, 0);
		this.aClass90_6.method1650(this.aClass23_Sub3_5, 1);
		this.aClass90_6.method1658(0);
		if (!this.aClass90_6.method1659()) {
			super.aClass117_Sub1_19.method2467(this.aClass90_6);
			return false;
		}
		super.aClass117_Sub1_19.method2467(this.aClass90_6);
		this.aClass218_3 = Static343.method4474(super.aClass117_Sub1_19, new Class143[] { Static410.method5251("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass117_Sub1_19, 35632) });
		this.aClass218_5 = Static343.method4474(super.aClass117_Sub1_19, new Class143[] { Static410.method5251("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass117_Sub1_19, 35632) });
		this.aClass218_4 = Static343.method4474(super.aClass117_Sub1_19, new Class143[] { Static410.method5251("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass117_Sub1_19, 35632) });
		this.aClass218_6 = Static343.method4474(super.aClass117_Sub1_19, new Class143[] { Static410.method5251("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass117_Sub1_19, 35632) });
		return this.aClass218_5 != null && this.aClass218_3 != null && this.aClass218_4 != null && this.aClass218_6 != null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
	@Override
	public void method2720(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass117_Sub1_19.method2476(1);
		super.aClass117_Sub1_19.method2504(null);
		super.aClass117_Sub1_19.method2476(0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	@Override
	public int method2728() {
		return 1;
	}
}
