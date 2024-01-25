import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class2_Sub28_Sub1 extends Class2_Sub28 {

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!ct;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	private int anInt4454;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	private int anInt4455;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
	private int anInt4456;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "Lclient!nn;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "Lclient!nn;")
	private Class163 aClass163_2;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "Lclient!nn;")
	private Class163 aClass163_3;

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "[Lclient!ai;")
	private Class7_Sub1[] aClass7_Sub1Array3;

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "Lclient!nn;")
	private Class163 aClass163_4;

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "Lclient!ct;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!nt", name = "G", descriptor = "I")
	private int anInt4457;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class2_Sub28_Sub1(@OriginalArg(0) Class82_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
	@Override
	public void method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4454 = arg0;
		this.anInt4456 = arg1;
		@Pc(10) int local10 = Static321.method4947(this.anInt4454);
		@Pc(15) int local15 = Static321.method4947(this.anInt4456);
		if (this.anInt4455 == local10 && this.anInt4457 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass7_Sub1Array3 != null) {
			for (local28 = 0; local28 < this.aClass7_Sub1Array3.length; local28++) {
				this.aClass7_Sub1Array3[local28].method4732();
			}
			this.aClass7_Sub1Array3 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass42_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass42_1 == null) {
						this.aClass42_1 = new Class42(this.aClass82_Sub2_30);
					}
					this.aClass7_Sub1Array3 = new Class7_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass7_Sub1Array3[local55++] = new Class7_Sub1(this.aClass82_Sub2_30, 3553, 34842, local28, local53);
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
		this.anInt4455 = local10;
		this.anInt4457 = local15;
	}

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "()Z")
	public boolean method3960() {
		return this.aClass82_Sub2_30.aBoolean406 && this.aClass82_Sub2_30.aBoolean397 && this.aClass82_Sub2_30.aBoolean405;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "()I")
	@Override
	public int method3953() {
		return 1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "()Z")
	@Override
	public boolean method3950() {
		if (!this.aClass82_Sub2_30.aBoolean406 || !this.aClass82_Sub2_30.aBoolean397 || !this.aClass82_Sub2_30.aBoolean405) {
			return false;
		}
		this.aClass42_2 = new Class42(this.aClass82_Sub2_30);
		this.aClass7_Sub1_2 = new Class7_Sub1(this.aClass82_Sub2_30, 3553, 34842, 256, 256);
		this.aClass7_Sub1_2.method4749(false, false);
		this.aClass7_Sub1_3 = new Class7_Sub1(this.aClass82_Sub2_30, 3553, 34842, 256, 256);
		this.aClass7_Sub1_3.method4749(false, false);
		this.aClass82_Sub2_30.method4602(this.aClass42_2);
		this.aClass42_2.method929(0, this.aClass7_Sub1_2);
		this.aClass42_2.method929(1, this.aClass7_Sub1_3);
		this.aClass42_2.method928(0);
		if (!this.aClass42_2.method933()) {
			this.aClass82_Sub2_30.method4579(this.aClass42_2);
			return false;
		}
		this.aClass82_Sub2_30.method4579(this.aClass42_2);
		this.aClass163_4 = Static241.method3891(this.aClass82_Sub2_30, new Class73[] { Static95.method1619(this.aClass82_Sub2_30, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass163_2 = Static241.method3891(this.aClass82_Sub2_30, new Class73[] { Static95.method1619(this.aClass82_Sub2_30, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass163_3 = Static241.method3891(this.aClass82_Sub2_30, new Class73[] { Static95.method1619(this.aClass82_Sub2_30, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass163_1 = Static241.method3891(this.aClass82_Sub2_30, new Class73[] { Static95.method1619(this.aClass82_Sub2_30, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass163_2 != null && this.aClass163_4 != null && this.aClass163_3 != null && this.aClass163_1 != null;
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
	@Override
	public void method3958(@OriginalArg(0) int arg0) {
		this.aClass82_Sub2_30.anOpengl2.glUseProgramObjectARB(0);
		this.aClass82_Sub2_30.method4582(1);
		this.aClass82_Sub2_30.method4614(null);
		this.aClass82_Sub2_30.method4582(0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1, @OriginalArg(2) Class7_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass82_Sub2_30.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass7_Sub1Array3 == null) {
			this.aClass82_Sub2_30.method4614(arg1);
			this.aClass82_Sub2_30.method4602(this.aClass42_2);
			this.aClass42_2.method928(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass163_4.anInt4379;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static247.aFloat47, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt4454, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt4454, (float) this.anInt4456);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt4456);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass82_Sub2_30.method4602(this.aClass42_1);
			local34 = Static321.method4947(this.anInt4454);
			local39 = Static321.method4947(this.anInt4456);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass42_1.method929(0, this.aClass7_Sub1Array3[local41]);
				if (local41 == 0) {
					this.aClass82_Sub2_30.method4614(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt4454, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt4454, (float) this.anInt4456);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt4456);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass82_Sub2_30.method4614(this.aClass7_Sub1Array3[local41 - 1]);
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
			this.aClass82_Sub2_30.method4579(this.aClass42_1);
			this.aClass82_Sub2_30.method4614(this.aClass7_Sub1Array3[local41 - 1]);
			this.aClass82_Sub2_30.method4602(this.aClass42_2);
			this.aClass42_2.method928(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass163_2.anInt4379;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static247.aFloat47, 0.0F, 0.0F);
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
		this.aClass42_2.method928(1);
		this.aClass82_Sub2_30.method4614(this.aClass7_Sub1_2);
		local34 = this.aClass163_1.anInt4379;
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
		this.aClass42_2.method928(0);
		this.aClass82_Sub2_30.method4614(this.aClass7_Sub1_3);
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
		this.aClass82_Sub2_30.method4579(this.aClass42_2);
		local39 = this.aClass163_3.anInt4379;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static247.aFloat48, Static247.aFloat46, 0.0F);
		this.aClass82_Sub2_30.method4582(1);
		this.aClass82_Sub2_30.method4614(this.aClass7_Sub1_2);
		this.aClass82_Sub2_30.method4582(0);
		this.aClass82_Sub2_30.method4614(arg1);
	}

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "()V")
	@Override
	public void method3955() {
		this.aClass42_1 = null;
		this.aClass7_Sub1Array3 = null;
		this.aClass42_2 = null;
		this.aClass7_Sub1_2 = null;
		this.aClass7_Sub1_3 = null;
		this.aClass163_4 = null;
		this.aClass163_2 = null;
		this.aClass163_3 = null;
		this.aClass163_1 = null;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "()Z")
	@Override
	public boolean method3952() {
		return this.aClass42_2 != null;
	}
}
