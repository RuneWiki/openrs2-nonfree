import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class2_Sub34_Sub1 extends Class2_Sub34 {

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!hc;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!mg;")
	private Class128 aClass128_3;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	private int anInt4734;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "[Lclient!rj;")
	private Class124_Sub2[] aClass124_Sub2Array4;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!hc;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
	private int anInt4735;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "Lclient!hc;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "Lclient!hc;")
	private Class78 aClass78_4;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	private int anInt4736;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "Lclient!rj;")
	private Class124_Sub2 aClass124_Sub2_5;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Lclient!mg;")
	private Class128 aClass128_4;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!rj;")
	private Class124_Sub2 aClass124_Sub2_6;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
	private int anInt4737;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class2_Sub34_Sub1(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()Z")
	@Override
	public boolean method4359() {
		if (!this.aClass4_Sub1_28.aBoolean45 || !this.aClass4_Sub1_28.aBoolean34 || !this.aClass4_Sub1_28.aBoolean36) {
			return false;
		}
		this.aClass128_4 = new Class128(this.aClass4_Sub1_28);
		this.aClass124_Sub2_5 = new Class124_Sub2(this.aClass4_Sub1_28, 3553, 34842, 256, 256);
		this.aClass124_Sub2_5.method4995(false, false);
		this.aClass124_Sub2_6 = new Class124_Sub2(this.aClass4_Sub1_28, 3553, 34842, 256, 256);
		this.aClass124_Sub2_6.method4995(false, false);
		this.aClass4_Sub1_28.method597(this.aClass128_4);
		this.aClass128_4.method3561(0, this.aClass124_Sub2_5);
		this.aClass128_4.method3561(1, this.aClass124_Sub2_6);
		this.aClass128_4.method3568(0);
		if (!this.aClass128_4.method3563()) {
			this.aClass4_Sub1_28.method546(this.aClass128_4);
			return false;
		}
		this.aClass4_Sub1_28.method546(this.aClass128_4);
		this.aClass78_4 = Static115.method2475(this.aClass4_Sub1_28, new Class59[] { Static80.method1817(this.aClass4_Sub1_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass78_3 = Static115.method2475(this.aClass4_Sub1_28, new Class59[] { Static80.method1817(this.aClass4_Sub1_28, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass78_2 = Static115.method2475(this.aClass4_Sub1_28, new Class59[] { Static80.method1817(this.aClass4_Sub1_28, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass78_1 = Static115.method2475(this.aClass4_Sub1_28, new Class59[] { Static80.method1817(this.aClass4_Sub1_28, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass78_3 != null && this.aClass78_4 != null && this.aClass78_2 != null && this.aClass78_1 != null;
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "()Z")
	public boolean method4361() {
		return this.aClass4_Sub1_28.aBoolean45 && this.aClass4_Sub1_28.aBoolean34 && this.aClass4_Sub1_28.aBoolean36;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	@Override
	public void method4356(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_28.anOpengl1.glUseProgramObjectARB(0);
		this.aClass4_Sub1_28.method600(1);
		this.aClass4_Sub1_28.method602(null);
		this.aClass4_Sub1_28.method600(0);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	@Override
	public void method4357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4734 = arg0;
		this.anInt4737 = arg1;
		@Pc(10) int local10 = Static331.method2985(this.anInt4734);
		@Pc(15) int local15 = Static331.method2985(this.anInt4737);
		if (this.anInt4735 == local10 && this.anInt4736 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass124_Sub2Array4 != null) {
			for (local28 = 0; local28 < this.aClass124_Sub2Array4.length; local28++) {
				this.aClass124_Sub2Array4[local28].method5898();
			}
			this.aClass124_Sub2Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass128_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass128_3 == null) {
						this.aClass128_3 = new Class128(this.aClass4_Sub1_28);
					}
					this.aClass124_Sub2Array4 = new Class124_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass124_Sub2Array4[local55++] = new Class124_Sub2(this.aClass4_Sub1_28, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt4735 = local10;
		this.anInt4736 = local15;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
	@Override
	public int method4355() {
		return 1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!rj;Lclient!rj;)V")
	@Override
	public void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) Class124_Sub2 arg1, @OriginalArg(2) Class124_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass4_Sub1_28.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass124_Sub2Array4 == null) {
			this.aClass4_Sub1_28.method602(arg1);
			this.aClass4_Sub1_28.method597(this.aClass128_4);
			this.aClass128_4.method3568(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass78_4.anInt2555;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static246.aFloat67, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt4734, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt4734, (float) this.anInt4737);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt4737);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass4_Sub1_28.method597(this.aClass128_3);
			local34 = Static331.method2985(this.anInt4734);
			local39 = Static331.method2985(this.anInt4737);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass128_3.method3561(0, this.aClass124_Sub2Array4[local41]);
				if (local41 == 0) {
					this.aClass4_Sub1_28.method602(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt4734, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt4734, (float) this.anInt4737);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt4737);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass4_Sub1_28.method602(this.aClass124_Sub2Array4[local41 - 1]);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass4_Sub1_28.method546(this.aClass128_3);
			this.aClass4_Sub1_28.method602(this.aClass124_Sub2Array4[local41 - 1]);
			this.aClass4_Sub1_28.method597(this.aClass128_4);
			this.aClass128_4.method3568(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass78_3.anInt2555;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static246.aFloat67, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass128_4.method3568(1);
		this.aClass4_Sub1_28.method602(this.aClass124_Sub2_5);
		local34 = this.aClass78_1.anInt2555;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass128_4.method3568(0);
		this.aClass4_Sub1_28.method602(this.aClass124_Sub2_6);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		this.aClass4_Sub1_28.method546(this.aClass128_4);
		local39 = this.aClass78_2.anInt2555;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static246.aFloat65, Static246.aFloat66, 0.0F);
		this.aClass4_Sub1_28.method600(1);
		this.aClass4_Sub1_28.method602(this.aClass124_Sub2_5);
		this.aClass4_Sub1_28.method600(0);
		this.aClass4_Sub1_28.method602(arg1);
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()Z")
	@Override
	public boolean method4360() {
		return this.aClass128_4 != null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()V")
	@Override
	public void method4352() {
		this.aClass128_3 = null;
		this.aClass124_Sub2Array4 = null;
		this.aClass128_4 = null;
		this.aClass124_Sub2_5 = null;
		this.aClass124_Sub2_6 = null;
		this.aClass78_4 = null;
		this.aClass78_3 = null;
		this.aClass78_2 = null;
		this.aClass78_1 = null;
	}
}
