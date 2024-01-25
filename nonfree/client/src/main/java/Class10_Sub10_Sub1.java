import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class10_Sub10_Sub1 extends Class10_Sub10 {

	@OriginalMember(owner = "client!ci", name = "lb", descriptor = "[[I")
	public static int[][] lb;

	@OriginalMember(owner = "client!ci", name = "kb", descriptor = "[Lclient!ru;")
	private static final Class216[] aClass216Array1 = new Class216[32];

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!vo;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!sq;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "Lclient!vo;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "Lclient!vo;")
	private Class261 aClass261_4;

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "Lclient!vn;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "[Lclient!sq;")
	private Class4_Sub1[] aClass4_Sub1Array3;

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "Lclient!sq;")
	private Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!ci", name = "O", descriptor = "Lclient!vn;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ci", name = "X", descriptor = "Lclient!vo;")
	private Class261 aClass261_5;

	static {
		@Pc(86) Class216[] local86 = Static360.method4850();
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			aClass216Array1[local86[local88].anInt6089] = local86[local88];
		}
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class10_Sub10_Sub1(@OriginalArg(0) Class50_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)V")
	@Override
	public void method910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt966 = arg1;
		this.anInt956 = arg0;
		@Pc(24) int local24 = Static68.method1346(this.anInt956);
		@Pc(29) int local29 = Static68.method1346(this.anInt966);
		if (this.anInt958 == local24 && this.anInt953 == local29) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass4_Sub1Array3 != null) {
			for (local46 = 0; local46 < this.aClass4_Sub1Array3.length; local46++) {
				this.aClass4_Sub1Array3[local46].method4575();
			}
			this.aClass4_Sub1Array3 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass260_2 = null;
		} else {
			local46 = local24;
			@Pc(77) int local77 = local29;
			@Pc(79) int local79 = 0;
			label57: while (true) {
				if (local46 <= 256 && local77 <= 256) {
					if (this.aClass260_2 == null) {
						this.aClass260_2 = new Class260(super.aClass50_Sub1_11);
					}
					local46 = local24;
					this.aClass4_Sub1Array3 = new Class4_Sub1[local79];
					local77 = local29;
					local79 = 0;
					while (true) {
						if (local46 <= 256 && local77 <= 256) {
							break label57;
						}
						this.aClass4_Sub1Array3[local79++] = new Class4_Sub1(super.aClass50_Sub1_11, 3553, 34842, local46, local77);
						if (local46 > 256) {
							local46 >>= 0x1;
						}
						if (local77 > 256) {
							local77 >>= 0x1;
						}
					}
				}
				local79++;
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
			}
		}
		this.anInt953 = local29;
		this.anInt958 = local24;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method899() {
		return this.aClass260_1 != null;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method903() {
		if (!super.aClass50_Sub1_11.aBoolean98 || !super.aClass50_Sub1_11.aBoolean89 || !super.aClass50_Sub1_11.aBoolean84) {
			return false;
		}
		this.aClass260_1 = new Class260(super.aClass50_Sub1_11);
		this.aClass4_Sub1_1 = new Class4_Sub1(super.aClass50_Sub1_11, 3553, 34842, 256, 256);
		this.aClass4_Sub1_1.method154(false, false);
		this.aClass4_Sub1_2 = new Class4_Sub1(super.aClass50_Sub1_11, 3553, 34842, 256, 256);
		this.aClass4_Sub1_2.method154(false, false);
		super.aClass50_Sub1_11.method1320(this.aClass260_1);
		this.aClass260_1.method5729(0, this.aClass4_Sub1_1);
		this.aClass260_1.method5729(1, this.aClass4_Sub1_2);
		this.aClass260_1.method5731(0);
		if (!this.aClass260_1.method5736()) {
			super.aClass50_Sub1_11.method1284(this.aClass260_1);
			return false;
		}
		super.aClass50_Sub1_11.method1284(this.aClass260_1);
		this.aClass261_5 = Static91.method1694(super.aClass50_Sub1_11, new Class214[] { Static223.method3364(35632, super.aClass50_Sub1_11, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass261_2 = Static91.method1694(super.aClass50_Sub1_11, new Class214[] { Static223.method3364(35632, super.aClass50_Sub1_11, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass261_3 = Static91.method1694(super.aClass50_Sub1_11, new Class214[] { Static223.method3364(35632, super.aClass50_Sub1_11, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass261_4 = Static91.method1694(super.aClass50_Sub1_11, new Class214[] { Static223.method3364(35632, super.aClass50_Sub1_11, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass261_2 != null && this.aClass261_5 != null && this.aClass261_3 != null && this.aClass261_4 != null;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)Z")
	public boolean method913() {
		return super.aClass50_Sub1_11.aBoolean98 && super.aClass50_Sub1_11.aBoolean89 && super.aClass50_Sub1_11.aBoolean84;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
	@Override
	public void method907() {
		this.aClass4_Sub1_1 = null;
		this.aClass261_4 = null;
		this.aClass261_3 = null;
		this.aClass260_2 = null;
		this.aClass4_Sub1_2 = null;
		this.aClass260_1 = null;
		this.aClass4_Sub1Array3 = null;
		this.aClass261_2 = null;
		this.aClass261_5 = null;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I")
	@Override
	public int method902() {
		return 1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	@Override
	public void method906(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass50_Sub1_11.method1300(1);
		super.aClass50_Sub1_11.method1295(null);
		super.aClass50_Sub1_11.method1300(0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!sq;Lclient!sq;IB)V")
	@Override
	public void method901(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(199) long local199;
		@Pc(267) long local267;
		if (this.aClass4_Sub1Array3 == null) {
			super.aClass50_Sub1_11.method1295(arg1);
			super.aClass50_Sub1_11.method1320(this.aClass260_1);
			this.aClass260_1.method5731(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass261_5.aLong248;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static405.aFloat114, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt956, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt956, (float) this.anInt966);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt966);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass50_Sub1_11.method1320(this.aClass260_2);
			@Pc(32) int local32 = Static68.method1346(this.anInt956);
			@Pc(37) int local37 = Static68.method1346(this.anInt966);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass260_2.method5729(0, this.aClass4_Sub1Array3[local39]);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass50_Sub1_11.method1295(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt956, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt956, (float) this.anInt966);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt966);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass50_Sub1_11.method1295(this.aClass4_Sub1Array3[local39 - 1]);
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
				local39++;
			}
			super.aClass50_Sub1_11.method1284(this.aClass260_2);
			super.aClass50_Sub1_11.method1295(this.aClass4_Sub1Array3[local39 - 1]);
			super.aClass50_Sub1_11.method1320(this.aClass260_1);
			this.aClass260_1.method5731(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local199 = this.aClass261_2.aLong248;
			OpenGL.glUseProgramObjectARB(local199);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static405.aFloat114, 0.0F, 0.0F);
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
		this.aClass260_1.method5731(1);
		super.aClass50_Sub1_11.method1295(this.aClass4_Sub1_1);
		local267 = this.aClass261_4.aLong248;
		OpenGL.glUseProgramObjectARB(local267);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass260_1.method5731(0);
		super.aClass50_Sub1_11.method1295(this.aClass4_Sub1_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass50_Sub1_11.method1284(this.aClass260_1);
		local199 = this.aClass261_3.aLong248;
		OpenGL.glUseProgramObjectARB(local199);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local199, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local199, "params"), Static90.aFloat40, Static137.aFloat51, 0.0F);
		super.aClass50_Sub1_11.method1300(1);
		super.aClass50_Sub1_11.method1295(this.aClass4_Sub1_1);
		super.aClass50_Sub1_11.method1300(0);
		super.aClass50_Sub1_11.method1295(arg1);
	}
}
