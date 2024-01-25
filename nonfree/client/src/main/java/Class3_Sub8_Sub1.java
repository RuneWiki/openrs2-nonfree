import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
	private int anInt1563;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!vga;")
	private Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "Lclient!hq;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Lclient!hq;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	private int anInt1571;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "Lclient!qf;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "[Lclient!vga;")
	private Class11_Sub2[] aClass11_Sub2Array1;

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "Lclient!qf;")
	private Class269 aClass269_2;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "Lclient!hq;")
	private Class147 aClass147_3;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	private int anInt1572;

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
	private int anInt1576;

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "Lclient!hq;")
	private Class147 aClass147_4;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "Lclient!vga;")
	private Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) Class15_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method1551() {
		return this.aClass269_2 != null;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	@Override
	public void method1548() {
		this.aClass147_4 = null;
		this.aClass11_Sub2Array1 = null;
		this.aClass11_Sub2_1 = null;
		this.aClass147_2 = null;
		this.aClass269_2 = null;
		this.aClass147_3 = null;
		this.aClass147_1 = null;
		this.aClass269_1 = null;
		this.aClass11_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1554() {
		if (!super.aClass15_Sub3_5.aBoolean444 || !super.aClass15_Sub3_5.aBoolean437 || !super.aClass15_Sub3_5.aBoolean458) {
			return false;
		}
		this.aClass269_2 = new Class269(super.aClass15_Sub3_5);
		this.aClass11_Sub2_1 = new Class11_Sub2(super.aClass15_Sub3_5, 3553, 34842, 256, 256);
		this.aClass11_Sub2_1.method1633(false, false);
		this.aClass11_Sub2_2 = new Class11_Sub2(super.aClass15_Sub3_5, 3553, 34842, 256, 256);
		this.aClass11_Sub2_2.method1633(false, false);
		super.aClass15_Sub3_5.method4384(this.aClass269_2);
		this.aClass269_2.method6781(this.aClass11_Sub2_1, 0);
		this.aClass269_2.method6781(this.aClass11_Sub2_2, 1);
		this.aClass269_2.method6780(0);
		if (!this.aClass269_2.method6773()) {
			super.aClass15_Sub3_5.method4379(this.aClass269_2);
			return false;
		}
		super.aClass15_Sub3_5.method4379(this.aClass269_2);
		this.aClass147_1 = Static596.method8419(new Class185[] { Static56.method1328(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass15_Sub3_5) }, super.aClass15_Sub3_5);
		this.aClass147_3 = Static596.method8419(new Class185[] { Static56.method1328(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass15_Sub3_5) }, super.aClass15_Sub3_5);
		this.aClass147_2 = Static596.method8419(new Class185[] { Static56.method1328(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass15_Sub3_5) }, super.aClass15_Sub3_5);
		this.aClass147_4 = Static596.method8419(new Class185[] { Static56.method1328(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass15_Sub3_5) }, super.aClass15_Sub3_5);
		return this.aClass147_3 != null && this.aClass147_1 != null && this.aClass147_2 != null && this.aClass147_4 != null;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)Z")
	public boolean method1556() {
		return super.aClass15_Sub3_5.aBoolean444 && super.aClass15_Sub3_5.aBoolean437 && super.aClass15_Sub3_5.aBoolean458;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method1543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1572 = arg0;
		this.anInt1563 = arg1;
		@Pc(21) int local21 = Static332.method5752(this.anInt1563);
		@Pc(26) int local26 = Static332.method5752(this.anInt1572);
		if (this.anInt1576 == local21 && this.anInt1571 == local26) {
			return;
		}
		@Pc(39) int local39;
		if (this.aClass11_Sub2Array1 != null) {
			for (local39 = 0; local39 < this.aClass11_Sub2Array1.length; local39++) {
				this.aClass11_Sub2Array1[local39].method7411();
			}
			this.aClass11_Sub2Array1 = null;
		}
		if (local21 <= 256 && local26 <= 256) {
			this.aClass269_1 = null;
		} else {
			local39 = local21;
			@Pc(79) int local79 = local26;
			@Pc(81) int local81 = 0;
			label56: while (true) {
				if (local39 <= 256 && local79 <= 256) {
					if (this.aClass269_1 == null) {
						this.aClass269_1 = new Class269(super.aClass15_Sub3_5);
					}
					local79 = local26;
					this.aClass11_Sub2Array1 = new Class11_Sub2[local81];
					local39 = local21;
					local81 = 0;
					while (true) {
						if (local39 <= 256 && local79 <= 256) {
							break label56;
						}
						this.aClass11_Sub2Array1[local81++] = new Class11_Sub2(super.aClass15_Sub3_5, 3553, 34842, local39, local79);
						if (local79 > 256) {
							local79 >>= 0x1;
						}
						if (local39 > 256) {
							local39 >>= 0x1;
						}
					}
				}
				local81++;
				if (local79 > 256) {
					local79 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
			}
		}
		this.anInt1571 = local26;
		this.anInt1576 = local21;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	@Override
	public void method1544(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB((long) 0);
		super.aClass15_Sub3_5.method4458(1);
		super.aClass15_Sub3_5.method4377(null);
		super.aClass15_Sub3_5.method4458(0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!vga;Lclient!vga;II)V")
	@Override
	public void method1550(@OriginalArg(0) Class11_Sub2 arg0, @OriginalArg(1) Class11_Sub2 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, (double) -1, 1.0D);
		@Pc(271) long local271;
		if (this.aClass11_Sub2Array1 == null) {
			super.aClass15_Sub3_5.method4377(arg1);
			super.aClass15_Sub3_5.method4384(this.aClass269_2);
			this.aClass269_2.method6780(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local271 = this.aClass147_1.aLong114;
			OpenGL.glUseProgramObjectARB(local271);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "params"), Static66.aFloat20, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1563, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1563, (float) this.anInt1572);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1572);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass15_Sub3_5.method4384(this.aClass269_1);
			@Pc(33) int local33 = Static332.method5752(this.anInt1563);
			@Pc(38) int local38 = Static332.method5752(this.anInt1572);
			@Pc(40) int local40 = 0;
			while (local33 > 256 || local38 > 256) {
				OpenGL.glViewport(0, 0, local33, local38);
				this.aClass269_1.method6781(this.aClass11_Sub2Array1[local40], 0);
				if (local33 > 256) {
					local33 >>= 0x1;
				}
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local40 == 0) {
					super.aClass15_Sub3_5.method4377(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1563, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1563, (float) this.anInt1572);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1572);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass15_Sub3_5.method4377(this.aClass11_Sub2Array1[local40 - 1]);
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
				local40++;
			}
			super.aClass15_Sub3_5.method4379(this.aClass269_1);
			super.aClass15_Sub3_5.method4377(this.aClass11_Sub2Array1[local40 - 1]);
			super.aClass15_Sub3_5.method4384(this.aClass269_2);
			this.aClass269_2.method6780(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(201) long local201 = this.aClass147_3.aLong114;
			OpenGL.glUseProgramObjectARB(local201);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local201, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local201, "params"), Static66.aFloat20, 0.0F, 0.0F);
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
		this.aClass269_2.method6780(1);
		super.aClass15_Sub3_5.method4377(this.aClass11_Sub2_1);
		local271 = this.aClass147_4.aLong114;
		OpenGL.glUseProgramObjectARB(local271);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local271, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass269_2.method6780(0);
		super.aClass15_Sub3_5.method4377(this.aClass11_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local271, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass15_Sub3_5.method4379(this.aClass269_2);
		@Pc(435) long local435 = this.aClass147_2.aLong114;
		OpenGL.glUseProgramObjectARB(local435);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local435, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local435, "params"), Static93.aFloat25, Static598.aFloat205, 0.0F);
		super.aClass15_Sub3_5.method4458(1);
		super.aClass15_Sub3_5.method4377(this.aClass11_Sub2_1);
		super.aClass15_Sub3_5.method4458(0);
		super.aClass15_Sub3_5.method4377(arg1);
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)I")
	@Override
	public int method1549() {
		return 1;
	}
}
