import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub31_Sub1 extends Class2_Sub31 {

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
	private int anInt10856;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "Lclient!wi;")
	private Class50_Sub4 aClass50_Sub4_5;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
	private int anInt10858;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!kba;")
	private Class190 aClass190_4;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!bq;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!kba;")
	private Class190 aClass190_5;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
	private int anInt10860;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "Lclient!bq;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	private int anInt10863;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "[Lclient!wi;")
	private Class50_Sub4[] aClass50_Sub4Array4;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "Lclient!wi;")
	private Class50_Sub4 aClass50_Sub4_6;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "Lclient!kba;")
	private Class190 aClass190_6;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "Lclient!kba;")
	private Class190 aClass190_7;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class2_Sub31_Sub1(@OriginalArg(0) Class101_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	@Override
	public void method9288() {
		this.aClass39_6 = null;
		this.aClass190_4 = null;
		this.aClass50_Sub4_6 = null;
		this.aClass50_Sub4Array4 = null;
		this.aClass190_5 = null;
		this.aClass39_7 = null;
		this.aClass50_Sub4_5 = null;
		this.aClass190_6 = null;
		this.aClass190_7 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	@Override
	public int method9276() {
		return 1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	@Override
	public void method9283(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass101_Sub2_42.method5627(1);
		super.aClass101_Sub2_42.method5690((Class50) null);
		super.aClass101_Sub2_42.method5627(0);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9282() {
		return this.aClass39_6 != null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10863 = arg0;
		this.anInt10856 = arg1;
		@Pc(16) int local16 = Static427.method7013(this.anInt10856);
		@Pc(25) int local25 = Static427.method7013(this.anInt10863);
		if (local16 == this.anInt10858 && local25 == this.anInt10860) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass50_Sub4Array4 != null) {
			for (local46 = 0; local46 < this.aClass50_Sub4Array4.length; local46++) {
				this.aClass50_Sub4Array4[local46].method9140();
			}
			this.aClass50_Sub4Array4 = null;
		}
		if (local16 <= 256 && local25 <= 256) {
			this.aClass39_7 = null;
		} else {
			local46 = local16;
			@Pc(77) int local77 = local25;
			@Pc(79) int local79 = 0;
			label57: while (true) {
				if (local46 <= 256 && local77 <= 256) {
					if (this.aClass39_7 == null) {
						this.aClass39_7 = new Class39(super.aClass101_Sub2_42);
					}
					local46 = local16;
					local77 = local25;
					this.aClass50_Sub4Array4 = new Class50_Sub4[local79];
					local79 = 0;
					while (true) {
						if (local46 <= 256 && local77 <= 256) {
							break label57;
						}
						this.aClass50_Sub4Array4[local79++] = new Class50_Sub4(super.aClass101_Sub2_42, 3553, 34842, local46, local77);
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
		this.anInt10858 = local16;
		this.anInt10860 = local25;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9274() {
		if (!super.aClass101_Sub2_42.aBoolean463 || !super.aClass101_Sub2_42.aBoolean452 || !super.aClass101_Sub2_42.aBoolean455) {
			return false;
		}
		this.aClass39_6 = new Class39(super.aClass101_Sub2_42);
		this.aClass50_Sub4_5 = new Class50_Sub4(super.aClass101_Sub2_42, 3553, 34842, 256, 256);
		this.aClass50_Sub4_5.method9152(false, false);
		this.aClass50_Sub4_6 = new Class50_Sub4(super.aClass101_Sub2_42, 3553, 34842, 256, 256);
		this.aClass50_Sub4_6.method9152(false, false);
		super.aClass101_Sub2_42.method5613(this.aClass39_6);
		this.aClass39_6.method1111(0, this.aClass50_Sub4_5);
		this.aClass39_6.method1111(1, this.aClass50_Sub4_6);
		this.aClass39_6.method1109(0);
		if (!this.aClass39_6.method1110()) {
			super.aClass101_Sub2_42.method5678(this.aClass39_6);
			return false;
		}
		super.aClass101_Sub2_42.method5678(this.aClass39_6);
		this.aClass190_6 = Static105.method1884(new Class57[] { Static524.method8166("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass101_Sub2_42, 35632) }, super.aClass101_Sub2_42);
		this.aClass190_4 = Static105.method1884(new Class57[] { Static524.method8166("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass101_Sub2_42, 35632) }, super.aClass101_Sub2_42);
		this.aClass190_5 = Static105.method1884(new Class57[] { Static524.method8166("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass101_Sub2_42, 35632) }, super.aClass101_Sub2_42);
		this.aClass190_7 = Static105.method1884(new Class57[] { Static524.method8166("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass101_Sub2_42, 35632) }, super.aClass101_Sub2_42);
		return this.aClass190_4 != null && this.aClass190_6 != null && this.aClass190_5 != null && this.aClass190_7 != null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wi;ILclient!wi;I)V")
	@Override
	public void method9281(@OriginalArg(0) Class50_Sub4 arg0, @OriginalArg(2) Class50_Sub4 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(267) long local267;
		if (this.aClass50_Sub4Array4 == null) {
			super.aClass101_Sub2_42.method5690(arg0);
			super.aClass101_Sub2_42.method5613(this.aClass39_6);
			this.aClass39_6.method1109(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local267 = this.aClass190_6.aLong151;
			OpenGL.glUseProgramObjectARB(local267);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local267, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local267, "params"), Static421.aFloat163, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt10856, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt10856, (float) this.anInt10863);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt10863);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass101_Sub2_42.method5613(this.aClass39_7);
			@Pc(32) int local32 = Static427.method7013(this.anInt10856);
			@Pc(37) int local37 = Static427.method7013(this.anInt10863);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass39_7.method1111(0, this.aClass50_Sub4Array4[local39]);
				if (local39 == 0) {
					super.aClass101_Sub2_42.method5690(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt10856, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt10856, (float) this.anInt10863);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt10863);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass101_Sub2_42.method5690(this.aClass50_Sub4Array4[local39 - 1]);
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
			super.aClass101_Sub2_42.method5678(this.aClass39_7);
			super.aClass101_Sub2_42.method5690(this.aClass50_Sub4Array4[local39 - 1]);
			super.aClass101_Sub2_42.method5613(this.aClass39_6);
			this.aClass39_6.method1109(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(197) long local197 = this.aClass190_4.aLong151;
			OpenGL.glUseProgramObjectARB(local197);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local197, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local197, "params"), Static421.aFloat163, 0.0F, 0.0F);
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
		this.aClass39_6.method1109(1);
		super.aClass101_Sub2_42.method5690(this.aClass50_Sub4_5);
		local267 = this.aClass190_7.aLong151;
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
		this.aClass39_6.method1109(0);
		super.aClass101_Sub2_42.method5690(this.aClass50_Sub4_6);
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
		super.aClass101_Sub2_42.method5678(this.aClass39_6);
		@Pc(439) long local439 = this.aClass190_5.aLong151;
		OpenGL.glUseProgramObjectARB(local439);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local439, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local439, "params"), Static275.aFloat107, Static620.aFloat200, 0.0F);
		super.aClass101_Sub2_42.method5627(1);
		super.aClass101_Sub2_42.method5690(this.aClass50_Sub4_5);
		super.aClass101_Sub2_42.method5627(0);
		super.aClass101_Sub2_42.method5690(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)Z")
	public boolean method9292() {
		return super.aClass101_Sub2_42.aBoolean463 && super.aClass101_Sub2_42.aBoolean452 && super.aClass101_Sub2_42.aBoolean455;
	}
}
