import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "Lclient!fo;")
	private Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "Lclient!tv;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "[Lclient!fo;")
	private Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "Lclient!fo;")
	private Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "Lclient!tv;")
	private Class238 aClass238_2;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "Lclient!fe;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "Lclient!fe;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!bm", name = "U", descriptor = "Lclient!fe;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "Lclient!fe;")
	private Class72 aClass72_4;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	@Override
	public void method642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt708 = arg1;
		this.anInt711 = arg0;
		@Pc(23) int local23 = Static434.method5757(this.anInt711);
		@Pc(28) int local28 = Static434.method5757(this.anInt708);
		if (local23 == this.anInt707 && this.anInt705 == local28) {
			return;
		}
		@Pc(49) int local49;
		if (this.aClass3_Sub2Array1 != null) {
			for (local49 = 0; local49 < this.aClass3_Sub2Array1.length; local49++) {
				this.aClass3_Sub2Array1[local49].method4152();
			}
			this.aClass3_Sub2Array1 = null;
		}
		if (local23 <= 256 && local28 <= 256) {
			this.aClass238_1 = null;
		} else {
			local49 = local23;
			@Pc(76) int local76 = local28;
			@Pc(78) int local78 = 0;
			if (this.aClass238_1 == null) {
				this.aClass238_1 = new Class238(super.aClass39_Sub2_7);
			}
			label55: while (true) {
				if (local49 <= 256 && local76 <= 256) {
					local49 = local23;
					this.aClass3_Sub2Array1 = new Class3_Sub2[local78];
					local76 = local28;
					local78 = 0;
					while (true) {
						if (local49 <= 256 && local76 <= 256) {
							break label55;
						}
						this.aClass3_Sub2Array1[local78++] = new Class3_Sub2(super.aClass39_Sub2_7, 3553, 34842, local49, local76);
						if (local49 > 256) {
							local49 >>= 0x1;
						}
						if (local76 > 256) {
							local76 >>= 0x1;
						}
					}
				}
				if (local49 > 256) {
					local49 >>= 0x1;
				}
				local78++;
				if (local76 > 256) {
					local76 >>= 0x1;
				}
			}
		}
		this.anInt707 = local23;
		this.anInt705 = local28;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void method647() {
		this.aClass3_Sub2_2 = null;
		this.aClass72_3 = null;
		this.aClass238_1 = null;
		this.aClass72_4 = null;
		this.aClass238_2 = null;
		this.aClass3_Sub2Array1 = null;
		this.aClass72_2 = null;
		this.aClass3_Sub2_1 = null;
		this.aClass72_1 = null;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)Z")
	public boolean method653() {
		return super.aClass39_Sub2_7.aBoolean251 && super.aClass39_Sub2_7.aBoolean256 && super.aClass39_Sub2_7.aBoolean255;
	}

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method650() {
		return this.aClass238_2 != null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!fo;IILclient!fo;)V")
	@Override
	public void method646(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) 1, -1.0D, 1.0D);
		@Pc(49) long local49;
		if (this.aClass3_Sub2Array1 == null) {
			super.aClass39_Sub2_7.method3203(arg2);
			super.aClass39_Sub2_7.method3198(this.aClass238_2);
			this.aClass238_2.method5316(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local49 = this.aClass72_1.aLong73;
			OpenGL.glUseProgramObjectARB(local49);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "params"), Static171.aFloat33, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt711, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt711, (float) this.anInt708);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt708);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass39_Sub2_7.method3198(this.aClass238_1);
			@Pc(111) int local111 = Static434.method5757(this.anInt711);
			@Pc(116) int local116 = Static434.method5757(this.anInt708);
			@Pc(118) int local118 = 0;
			while (local111 > 256 || local116 > 256) {
				OpenGL.glViewport(0, 0, local111, local116);
				this.aClass238_1.method5324(0, this.aClass3_Sub2Array1[local118]);
				if (local118 == 0) {
					super.aClass39_Sub2_7.method3203(arg2);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt711, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt711, (float) this.anInt708);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt708);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass39_Sub2_7.method3203(this.aClass3_Sub2Array1[local118 - 1]);
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
				if (local111 > 256) {
					local111 >>= 0x1;
				}
				if (local116 > 256) {
					local116 >>= 0x1;
				}
				local118++;
			}
			super.aClass39_Sub2_7.method3197(this.aClass238_1);
			super.aClass39_Sub2_7.method3203(this.aClass3_Sub2Array1[local118 - 1]);
			super.aClass39_Sub2_7.method3198(this.aClass238_2);
			this.aClass238_2.method5316(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(280) long local280 = this.aClass72_4.aLong73;
			OpenGL.glUseProgramObjectARB(local280);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local280, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local280, "params"), Static171.aFloat33, 0.0F, 0.0F);
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
		this.aClass238_2.method5316(1);
		super.aClass39_Sub2_7.method3203(this.aClass3_Sub2_1);
		local49 = this.aClass72_2.aLong73;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass238_2.method5316(0);
		super.aClass39_Sub2_7.method3203(this.aClass3_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass39_Sub2_7.method3197(this.aClass238_2);
		@Pc(436) long local436 = this.aClass72_3.aLong73;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static269.aFloat67, Static206.aFloat58, 0.0F);
		super.aClass39_Sub2_7.method3221(1);
		super.aClass39_Sub2_7.method3203(this.aClass3_Sub2_1);
		super.aClass39_Sub2_7.method3221(0);
		super.aClass39_Sub2_7.method3203(arg2);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	@Override
	public void method645(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass39_Sub2_7.method3221(1);
		super.aClass39_Sub2_7.method3203(null);
		super.aClass39_Sub2_7.method3221(0);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)I")
	@Override
	public int method651() {
		return 1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method644() {
		if (!super.aClass39_Sub2_7.aBoolean251 || !super.aClass39_Sub2_7.aBoolean256 || !super.aClass39_Sub2_7.aBoolean255) {
			return false;
		}
		this.aClass238_2 = new Class238(super.aClass39_Sub2_7);
		this.aClass3_Sub2_1 = new Class3_Sub2(super.aClass39_Sub2_7, 3553, 34842, 256, 256);
		this.aClass3_Sub2_1.method4163(false, false);
		this.aClass3_Sub2_2 = new Class3_Sub2(super.aClass39_Sub2_7, 3553, 34842, 256, 256);
		this.aClass3_Sub2_2.method4163(false, false);
		super.aClass39_Sub2_7.method3198(this.aClass238_2);
		this.aClass238_2.method5324(0, this.aClass3_Sub2_1);
		this.aClass238_2.method5324(1, this.aClass3_Sub2_2);
		this.aClass238_2.method5316(0);
		if (!this.aClass238_2.method5321()) {
			super.aClass39_Sub2_7.method3197(this.aClass238_2);
			return false;
		}
		super.aClass39_Sub2_7.method3197(this.aClass238_2);
		this.aClass72_1 = Static346.method4845(super.aClass39_Sub2_7, new Class224[] { Static92.method1684("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass39_Sub2_7, 35632) });
		this.aClass72_4 = Static346.method4845(super.aClass39_Sub2_7, new Class224[] { Static92.method1684("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass39_Sub2_7, 35632) });
		this.aClass72_3 = Static346.method4845(super.aClass39_Sub2_7, new Class224[] { Static92.method1684("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass39_Sub2_7, 35632) });
		this.aClass72_2 = Static346.method4845(super.aClass39_Sub2_7, new Class224[] { Static92.method1684("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass39_Sub2_7, 35632) });
		return this.aClass72_4 != null && this.aClass72_1 != null && this.aClass72_3 != null && this.aClass72_2 != null;
	}
}
