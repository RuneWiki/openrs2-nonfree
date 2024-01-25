import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class5_Sub34_Sub1 extends Class5_Sub34 {

	@OriginalMember(owner = "client!lea", name = "V", descriptor = "Lclient!vc;")
	private Class364 aClass364_2;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "Lclient!ct;")
	private Class76 aClass76_6;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "Lclient!bca;")
	private Class32_Sub1 aClass32_Sub1_4;

	@OriginalMember(owner = "client!lea", name = "K", descriptor = "Lclient!vc;")
	private Class364 aClass364_3;

	@OriginalMember(owner = "client!lea", name = "J", descriptor = "Lclient!ct;")
	private Class76 aClass76_7;

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
	private int anInt5987;

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "Lclient!vc;")
	private Class364 aClass364_4;

	@OriginalMember(owner = "client!lea", name = "T", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
	private int anInt5992;

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "[Lclient!bca;")
	private Class32_Sub1[] aClass32_Sub1Array4;

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "Lclient!vc;")
	private Class364 aClass364_5;

	@OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
	private int anInt5994;

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "Lclient!bca;")
	private Class32_Sub1 aClass32_Sub1_5;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class5_Sub34_Sub1(@OriginalArg(0) Class57_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V")
	@Override
	public void method5103(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass57_Sub2_22.method2345(1);
		super.aClass57_Sub2_22.method2362((Class32) null);
		super.aClass57_Sub2_22.method2345(0);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)I")
	@Override
	public int method5099() {
		return 1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5104() {
		return this.aClass76_7 != null;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V")
	@Override
	public void method5101() {
		this.aClass32_Sub1_5 = null;
		this.aClass364_4 = null;
		this.aClass76_6 = null;
		this.aClass364_2 = null;
		this.aClass76_7 = null;
		this.aClass32_Sub1_4 = null;
		this.aClass364_3 = null;
		this.aClass32_Sub1Array4 = null;
		this.aClass364_5 = null;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5992 = arg1;
		this.anInt5989 = arg0;
		@Pc(16) int local16 = Static228.method3242(this.anInt5992);
		@Pc(21) int local21 = Static228.method3242(this.anInt5989);
		if (local16 == this.anInt5994 && local21 == this.anInt5987) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass32_Sub1Array4 != null) {
			for (local46 = 0; local46 < this.aClass32_Sub1Array4.length; local46++) {
				this.aClass32_Sub1Array4[local46].method8429();
			}
			this.aClass32_Sub1Array4 = null;
		}
		if (local16 <= 256 && local21 <= 256) {
			this.aClass76_6 = null;
		} else {
			local46 = local16;
			@Pc(90) int local90 = local21;
			@Pc(92) int local92 = 0;
			if (this.aClass76_6 == null) {
				this.aClass76_6 = new Class76(super.aClass57_Sub2_22);
			}
			label54: while (true) {
				if (local46 <= 256 && local90 <= 256) {
					this.aClass32_Sub1Array4 = new Class32_Sub1[local92];
					local46 = local16;
					local90 = local21;
					local92 = 0;
					while (true) {
						if (local46 <= 256 && local90 <= 256) {
							break label54;
						}
						this.aClass32_Sub1Array4[local92++] = new Class32_Sub1(super.aClass57_Sub2_22, 3553, 34842, local46, local90);
						if (local90 > 256) {
							local90 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				local92++;
				if (local90 > 256) {
					local90 >>= 0x1;
				}
				if (local46 > 256) {
					local46 >>= 0x1;
				}
			}
		}
		this.anInt5994 = local16;
		this.anInt5987 = local21;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5098() {
		if (!super.aClass57_Sub2_22.aBoolean234 || !super.aClass57_Sub2_22.aBoolean220 || !super.aClass57_Sub2_22.aBoolean233) {
			return false;
		}
		this.aClass76_7 = new Class76(super.aClass57_Sub2_22);
		this.aClass32_Sub1_4 = new Class32_Sub1(super.aClass57_Sub2_22, 3553, 34842, 256, 256);
		this.aClass32_Sub1_4.method2721(false, false);
		this.aClass32_Sub1_5 = new Class32_Sub1(super.aClass57_Sub2_22, 3553, 34842, 256, 256);
		this.aClass32_Sub1_5.method2721(false, false);
		super.aClass57_Sub2_22.method2384(this.aClass76_7);
		this.aClass76_7.method1342(0, this.aClass32_Sub1_4);
		this.aClass76_7.method1342(1, this.aClass32_Sub1_5);
		this.aClass76_7.method1340(0);
		if (!this.aClass76_7.method1346()) {
			super.aClass57_Sub2_22.method2375(this.aClass76_7);
			return false;
		}
		super.aClass57_Sub2_22.method2375(this.aClass76_7);
		this.aClass364_3 = Static586.method8421(super.aClass57_Sub2_22, (byte) -126, new Class388[] { Static542.method7939(super.aClass57_Sub2_22, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass364_4 = Static586.method8421(super.aClass57_Sub2_22, (byte) -127, new Class388[] { Static542.method7939(super.aClass57_Sub2_22, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass364_2 = Static586.method8421(super.aClass57_Sub2_22, (byte) -124, new Class388[] { Static542.method7939(super.aClass57_Sub2_22, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass364_5 = Static586.method8421(super.aClass57_Sub2_22, (byte) -119, new Class388[] { Static542.method7939(super.aClass57_Sub2_22, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass364_4 != null && this.aClass364_3 != null && this.aClass364_2 != null && this.aClass364_5 != null;
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)Z")
	public boolean method5109() {
		return super.aClass57_Sub2_22.aBoolean234 && super.aClass57_Sub2_22.aBoolean220 && super.aClass57_Sub2_22.aBoolean233;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!bca;ILclient!bca;)V")
	@Override
	public void method5096(@OriginalArg(1) Class32_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass32_Sub1Array4 == null) {
			super.aClass57_Sub2_22.method2362(arg0);
			super.aClass57_Sub2_22.method2384(this.aClass76_7);
			this.aClass76_7.method1340(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass364_3.aLong292;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static250.aFloat59, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt5992, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt5992, (float) this.anInt5989);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt5989);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass57_Sub2_22.method2384(this.aClass76_6);
			@Pc(112) int local112 = Static228.method3242(this.anInt5992);
			@Pc(117) int local117 = Static228.method3242(this.anInt5989);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass76_6.method1342(0, this.aClass32_Sub1Array4[local119]);
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass57_Sub2_22.method2362(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt5992, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt5992, (float) this.anInt5989);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5989);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass57_Sub2_22.method2362(this.aClass32_Sub1Array4[local119 - 1]);
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
				if (local117 > 256) {
					local117 >>= 0x1;
				}
				local119++;
			}
			super.aClass57_Sub2_22.method2375(this.aClass76_6);
			super.aClass57_Sub2_22.method2362(this.aClass32_Sub1Array4[local119 - 1]);
			super.aClass57_Sub2_22.method2384(this.aClass76_7);
			this.aClass76_7.method1340(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(293) long local293 = this.aClass364_4.aLong292;
			OpenGL.glUseProgramObjectARB(local293);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local293, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local293, "params"), Static250.aFloat59, 0.0F, 0.0F);
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
		this.aClass76_7.method1340(1);
		super.aClass57_Sub2_22.method2362(this.aClass32_Sub1_4);
		local46 = this.aClass364_5.aLong292;
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
		this.aClass76_7.method1340(0);
		super.aClass57_Sub2_22.method2362(this.aClass32_Sub1_5);
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
		super.aClass57_Sub2_22.method2375(this.aClass76_7);
		@Pc(461) long local461 = this.aClass364_2.aLong292;
		OpenGL.glUseProgramObjectARB(local461);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local461, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local461, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local461, "params"), Static452.aFloat134, Static376.aFloat117, 0.0F);
		super.aClass57_Sub2_22.method2345(1);
		super.aClass57_Sub2_22.method2362(this.aClass32_Sub1_4);
		super.aClass57_Sub2_22.method2345(0);
		super.aClass57_Sub2_22.method2362(arg0);
	}
}
