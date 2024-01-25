import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "[Lclient!sr;")
	private Class42_Sub1[] aClass42_Sub1Array2;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
	private int anInt6273;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "Lclient!sr;")
	private Class42_Sub1 aClass42_Sub1_5;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "Lclient!sr;")
	private Class42_Sub1 aClass42_Sub1_6;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "Lclient!ss;")
	private Class213 aClass213_4;

	@OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
	private int anInt6276;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!ss;")
	private Class213 aClass213_5;

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "Lclient!jh;")
	private Class122 aClass122_6;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "Lclient!ss;")
	private Class213 aClass213_6;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "Lclient!ss;")
	private Class213 aClass213_7;

	@OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
	private int anInt6284;

	@OriginalMember(owner = "client!rj", name = "db", descriptor = "Lclient!jh;")
	private Class122 aClass122_7;

	@OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
	private int anInt6285;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) Class75_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
	@Override
	public void method4937() {
		this.aClass42_Sub1_6 = null;
		this.aClass213_6 = null;
		this.aClass213_5 = null;
		this.aClass122_7 = null;
		this.aClass42_Sub1_5 = null;
		this.aClass213_7 = null;
		this.aClass213_4 = null;
		this.aClass122_6 = null;
		this.aClass42_Sub1Array2 = null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!sr;Lclient!sr;II)V")
	@Override
	public void method4933(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class42_Sub1 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(269) long local269;
		if (this.aClass42_Sub1Array2 == null) {
			super.aClass75_Sub2_38.method2456(arg1);
			super.aClass75_Sub2_38.method2432(this.aClass122_6);
			this.aClass122_6.method3164(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local269 = this.aClass213_7.aLong194;
			OpenGL.glUseProgramObjectARB(local269);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local269, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local269, "params"), Static371.aFloat89, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt6284, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt6284, (float) this.anInt6285);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt6285);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass75_Sub2_38.method2432(this.aClass122_7);
			@Pc(32) int local32 = Static78.method1396(this.anInt6284);
			@Pc(37) int local37 = Static78.method1396(this.anInt6285);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass122_7.method3168(this.aClass42_Sub1Array2[local39], 0);
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass75_Sub2_38.method2456(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt6284, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt6284, (float) this.anInt6285);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6285);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass75_Sub2_38.method2456(this.aClass42_Sub1Array2[local39 - 1]);
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
			super.aClass75_Sub2_38.method2455(this.aClass122_7);
			super.aClass75_Sub2_38.method2456(this.aClass42_Sub1Array2[local39 - 1]);
			super.aClass75_Sub2_38.method2432(this.aClass122_6);
			this.aClass122_6.method3164(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass213_4.aLong194;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static371.aFloat89, 0.0F, 0.0F);
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
		this.aClass122_6.method3164(1);
		super.aClass75_Sub2_38.method2456(this.aClass42_Sub1_6);
		local269 = this.aClass213_5.aLong194;
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
		this.aClass122_6.method3164(0);
		super.aClass75_Sub2_38.method2456(this.aClass42_Sub1_5);
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
		super.aClass75_Sub2_38.method2455(this.aClass122_6);
		@Pc(437) long local437 = this.aClass213_6.aLong194;
		OpenGL.glUseProgramObjectARB(local437);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local437, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local437, "params"), Static265.aFloat65, Static359.aFloat75, 0.0F);
		super.aClass75_Sub2_38.method2426(1);
		super.aClass75_Sub2_38.method2456(this.aClass42_Sub1_6);
		super.aClass75_Sub2_38.method2426(0);
		super.aClass75_Sub2_38.method2456(arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6285 = arg0;
		this.anInt6284 = arg1;
		@Pc(20) int local20 = Static78.method1396(this.anInt6284);
		@Pc(25) int local25 = Static78.method1396(this.anInt6285);
		if (local20 == this.anInt6276 && this.anInt6273 == local25) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass42_Sub1Array2 != null) {
			for (local46 = 0; local46 < this.aClass42_Sub1Array2.length; local46++) {
				this.aClass42_Sub1Array2[local46].method4919();
			}
			this.aClass42_Sub1Array2 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass122_7 = null;
		} else {
			local46 = local20;
			@Pc(84) int local84 = local25;
			@Pc(86) int local86 = 0;
			label56: while (true) {
				if (local46 <= 256 && local84 <= 256) {
					if (this.aClass122_7 == null) {
						this.aClass122_7 = new Class122(super.aClass75_Sub2_38);
					}
					this.aClass42_Sub1Array2 = new Class42_Sub1[local86];
					local46 = local20;
					local84 = local25;
					local86 = 0;
					while (true) {
						if (local46 <= 256 && local84 <= 256) {
							break label56;
						}
						this.aClass42_Sub1Array2[local86++] = new Class42_Sub1(super.aClass75_Sub2_38, 3553, 34842, local46, local84);
						if (local46 > 256) {
							local46 >>= 0x1;
						}
						if (local84 > 256) {
							local84 >>= 0x1;
						}
					}
				}
				local86++;
				if (local84 > 256) {
					local84 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
			}
		}
		this.anInt6276 = local20;
		this.anInt6273 = local25;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	@Override
	public void method4939(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass75_Sub2_38.method2426(1);
		super.aClass75_Sub2_38.method2456(null);
		super.aClass75_Sub2_38.method2426(0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4936() {
		if (!super.aClass75_Sub2_38.aBoolean220 || !super.aClass75_Sub2_38.aBoolean219 || !super.aClass75_Sub2_38.aBoolean235) {
			return false;
		}
		this.aClass122_6 = new Class122(super.aClass75_Sub2_38);
		this.aClass42_Sub1_6 = new Class42_Sub1(super.aClass75_Sub2_38, 3553, 34842, 256, 256);
		this.aClass42_Sub1_6.method1269(false, false);
		this.aClass42_Sub1_5 = new Class42_Sub1(super.aClass75_Sub2_38, 3553, 34842, 256, 256);
		this.aClass42_Sub1_5.method1269(false, false);
		super.aClass75_Sub2_38.method2432(this.aClass122_6);
		this.aClass122_6.method3168(this.aClass42_Sub1_6, 0);
		this.aClass122_6.method3168(this.aClass42_Sub1_5, 1);
		this.aClass122_6.method3164(0);
		if (!this.aClass122_6.method3174()) {
			super.aClass75_Sub2_38.method2455(this.aClass122_6);
			return false;
		}
		super.aClass75_Sub2_38.method2455(this.aClass122_6);
		this.aClass213_7 = Static426.method5667(super.aClass75_Sub2_38, new Class86[] { Static207.method3388(super.aClass75_Sub2_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass213_4 = Static426.method5667(super.aClass75_Sub2_38, new Class86[] { Static207.method3388(super.aClass75_Sub2_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass213_6 = Static426.method5667(super.aClass75_Sub2_38, new Class86[] { Static207.method3388(super.aClass75_Sub2_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass213_5 = Static426.method5667(super.aClass75_Sub2_38, new Class86[] { Static207.method3388(super.aClass75_Sub2_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass213_4 != null && this.aClass213_7 != null && this.aClass213_6 != null && this.aClass213_5 != null;
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4943() {
		return this.aClass122_6 != null;
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)Z")
	public boolean method4953() {
		return super.aClass75_Sub2_38.aBoolean220 && super.aClass75_Sub2_38.aBoolean219 && super.aClass75_Sub2_38.aBoolean235;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
	@Override
	public int method4940() {
		return 1;
	}
}
