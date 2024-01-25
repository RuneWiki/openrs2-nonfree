import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class5_Sub17_Sub1 extends Class5_Sub17 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	private int anInt1852;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!gb;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "Lclient!sca;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	private int anInt1860;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "I")
	private int anInt1861;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "Lclient!ho;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!di", name = "E", descriptor = "Lclient!gb;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "Lclient!ho;")
	private Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "Lclient!gb;")
	private Class125 aClass125_3;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Lclient!sca;")
	private Class318 aClass318_2;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "[Lclient!ho;")
	private Class44_Sub1[] aClass44_Sub1Array3;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "Lclient!gb;")
	private Class125 aClass125_4;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class5_Sub17_Sub1(@OriginalArg(0) Class143_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!di", name = "h", descriptor = "(I)Z")
	public boolean method1738() {
		return super.aClass143_Sub2_15.aBoolean420 && super.aClass143_Sub2_15.aBoolean421 && super.aClass143_Sub2_15.aBoolean410;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V")
	@Override
	public void method1731() {
		this.aClass125_4 = null;
		this.aClass125_3 = null;
		this.aClass125_1 = null;
		this.aClass44_Sub1_1 = null;
		this.aClass125_2 = null;
		this.aClass318_2 = null;
		this.aClass44_Sub1_2 = null;
		this.aClass44_Sub1Array3 = null;
		this.aClass318_1 = null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	@Override
	public void method1730(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass143_Sub2_15.method4930(1);
		super.aClass143_Sub2_15.method4945((Class44) null);
		super.aClass143_Sub2_15.method4930(0);
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1733() {
		return this.aClass318_1 != null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1853 = arg0;
		this.anInt1861 = arg1;
		@Pc(20) int local20 = Static630.method8378(this.anInt1853);
		@Pc(25) int local25 = Static630.method8378(this.anInt1861);
		if (this.anInt1860 == local20 && local25 == this.anInt1852) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass44_Sub1Array3 != null) {
			for (local46 = 0; local46 < this.aClass44_Sub1Array3.length; local46++) {
				this.aClass44_Sub1Array3[local46].method6703();
			}
			this.aClass44_Sub1Array3 = null;
		}
		if (local20 <= 256 && local25 <= 256) {
			this.aClass318_2 = null;
		} else {
			local46 = local20;
			@Pc(77) int local77 = local25;
			@Pc(79) int local79 = 0;
			if (this.aClass318_2 == null) {
				this.aClass318_2 = new Class318(super.aClass143_Sub2_15);
			}
			label55: while (true) {
				if (local46 <= 256 && local77 <= 256) {
					local46 = local20;
					local77 = local25;
					this.aClass44_Sub1Array3 = new Class44_Sub1[local79];
					local79 = 0;
					while (true) {
						if (local46 <= 256 && local77 <= 256) {
							break label55;
						}
						this.aClass44_Sub1Array3[local79++] = new Class44_Sub1(super.aClass143_Sub2_15, 3553, 34842, local46, local77);
						if (local77 > 256) {
							local77 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
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
		this.anInt1852 = local25;
		this.anInt1860 = local20;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I")
	@Override
	public int method1727() {
		return 1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1729() {
		if (!super.aClass143_Sub2_15.aBoolean420 || !super.aClass143_Sub2_15.aBoolean421 || !super.aClass143_Sub2_15.aBoolean410) {
			return false;
		}
		this.aClass318_1 = new Class318(super.aClass143_Sub2_15);
		this.aClass44_Sub1_2 = new Class44_Sub1(super.aClass143_Sub2_15, 3553, 34842, 256, 256);
		this.aClass44_Sub1_2.method794(false, false);
		this.aClass44_Sub1_1 = new Class44_Sub1(super.aClass143_Sub2_15, 3553, 34842, 256, 256);
		this.aClass44_Sub1_1.method794(false, false);
		super.aClass143_Sub2_15.method4987(this.aClass318_1);
		this.aClass318_1.method7393(this.aClass44_Sub1_2, 0);
		this.aClass318_1.method7393(this.aClass44_Sub1_1, 1);
		this.aClass318_1.method7389(0);
		if (!this.aClass318_1.method7392()) {
			super.aClass143_Sub2_15.method4966(this.aClass318_1);
			return false;
		}
		super.aClass143_Sub2_15.method4966(this.aClass318_1);
		this.aClass125_3 = Static616.method8266(new Class227[] { Static285.method3923(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass143_Sub2_15) }, super.aClass143_Sub2_15);
		this.aClass125_2 = Static616.method8266(new Class227[] { Static285.method3923(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass143_Sub2_15) }, super.aClass143_Sub2_15);
		this.aClass125_4 = Static616.method8266(new Class227[] { Static285.method3923(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass143_Sub2_15) }, super.aClass143_Sub2_15);
		this.aClass125_1 = Static616.method8266(new Class227[] { Static285.method3923(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass143_Sub2_15) }, super.aClass143_Sub2_15);
		return this.aClass125_2 != null && this.aClass125_3 != null && this.aClass125_4 != null && this.aClass125_1 != null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZILclient!ho;Lclient!ho;)V")
	@Override
	public void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) Class44_Sub1 arg1, @OriginalArg(3) Class44_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(266) long local266;
		if (this.aClass44_Sub1Array3 == null) {
			super.aClass143_Sub2_15.method4945(arg2);
			super.aClass143_Sub2_15.method4987(this.aClass318_1);
			this.aClass318_1.method7389(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local266 = this.aClass125_3.aLong111;
			OpenGL.glUseProgramObjectARB(local266);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "params"), Static226.aFloat54, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt1853, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt1853, (float) this.anInt1861);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt1861);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass143_Sub2_15.method4987(this.aClass318_2);
			@Pc(32) int local32 = Static630.method8378(this.anInt1853);
			@Pc(37) int local37 = Static630.method8378(this.anInt1861);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass318_2.method7393(this.aClass44_Sub1Array3[local39], 0);
				if (local39 == 0) {
					super.aClass143_Sub2_15.method4945(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt1853, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt1853, (float) this.anInt1861);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1861);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass143_Sub2_15.method4945(this.aClass44_Sub1Array3[local39 - 1]);
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
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				local39++;
			}
			super.aClass143_Sub2_15.method4966(this.aClass318_2);
			super.aClass143_Sub2_15.method4945(this.aClass44_Sub1Array3[local39 - 1]);
			super.aClass143_Sub2_15.method4987(this.aClass318_1);
			this.aClass318_1.method7389(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(198) long local198 = this.aClass125_2.aLong111;
			OpenGL.glUseProgramObjectARB(local198);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local198, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local198, "params"), Static226.aFloat54, 0.0F, 0.0F);
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
		this.aClass318_1.method7389(1);
		super.aClass143_Sub2_15.method4945(this.aClass44_Sub1_2);
		local266 = this.aClass125_1.aLong111;
		OpenGL.glUseProgramObjectARB(local266);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local266, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass318_1.method7389(0);
		super.aClass143_Sub2_15.method4945(this.aClass44_Sub1_1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local266, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass143_Sub2_15.method4966(this.aClass318_1);
		@Pc(438) long local438 = this.aClass125_4.aLong111;
		OpenGL.glUseProgramObjectARB(local438);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local438, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local438, "params"), Static322.aFloat116, Static139.aFloat47, 0.0F);
		super.aClass143_Sub2_15.method4930(1);
		super.aClass143_Sub2_15.method4945(this.aClass44_Sub1_2);
		super.aClass143_Sub2_15.method4930(0);
		super.aClass143_Sub2_15.method4945(arg2);
	}
}
