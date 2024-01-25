import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Lclient!nw;")
	private Class245_Sub2 aClass245_Sub2_2;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "Lclient!sj;")
	private Class339 aClass339_1;

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "Lclient!ima;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "Lclient!ima;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Lclient!ima;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Lclient!sj;")
	private Class339 aClass339_2;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "[Lclient!nw;")
	private Class245_Sub2[] aClass245_Sub2Array1;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "Lclient!ima;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
	private int anInt3389;

	@OriginalMember(owner = "client!ft", name = "D", descriptor = "Lclient!nw;")
	private Class245_Sub2 aClass245_Sub2_3;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
	private int anInt3391;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class3_Sub19_Sub1(@OriginalArg(0) Class67_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)I")
	@Override
	public int method2915() {
		return 1;
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)Z")
	public boolean method2926() {
		return super.aClass67_Sub2_13.aBoolean309 && super.aClass67_Sub2_13.aBoolean307 && super.aClass67_Sub2_13.aBoolean328;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	@Override
	public void method2916() {
		this.aClass339_1 = null;
		this.aClass245_Sub2Array1 = null;
		this.aClass245_Sub2_3 = null;
		this.aClass175_1 = null;
		this.aClass339_2 = null;
		this.aClass245_Sub2_2 = null;
		this.aClass175_4 = null;
		this.aClass175_3 = null;
		this.aClass175_2 = null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3385 = arg1;
		this.anInt3389 = arg0;
		@Pc(25) int local25 = Static487.method7093(this.anInt3389);
		@Pc(30) int local30 = Static487.method7093(this.anInt3385);
		if (local25 == this.anInt3377 && this.anInt3391 == local30) {
			return;
		}
		@Pc(55) int local55;
		if (this.aClass245_Sub2Array1 != null) {
			for (local55 = 0; local55 < this.aClass245_Sub2Array1.length; local55++) {
				this.aClass245_Sub2Array1[local55].method8676();
			}
			this.aClass245_Sub2Array1 = null;
		}
		if (local25 <= 256 && local30 <= 256) {
			this.aClass339_1 = null;
		} else {
			local55 = local25;
			@Pc(96) int local96 = local30;
			@Pc(98) int local98 = 0;
			if (this.aClass339_1 == null) {
				this.aClass339_1 = new Class339(super.aClass67_Sub2_13);
			}
			label57: while (true) {
				if (local55 <= 256 && local96 <= 256) {
					local96 = local30;
					this.aClass245_Sub2Array1 = new Class245_Sub2[local98];
					local55 = local25;
					local98 = 0;
					while (true) {
						if (local55 <= 256 && local96 <= 256) {
							break label57;
						}
						this.aClass245_Sub2Array1[local98++] = new Class245_Sub2(super.aClass67_Sub2_13, 3553, 34842, local55, local96);
						if (local96 > 256) {
							local96 >>= 0x1;
						}
						if (local55 > 256) {
							local55 >>= 0x1;
						}
					}
				}
				if (local96 > 256) {
					local96 >>= 0x1;
				}
				if (local55 > 256) {
					local55 >>= 0x1;
				}
				local98++;
			}
		}
		this.anInt3377 = local25;
		this.anInt3391 = local30;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
	@Override
	public void method2917(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass67_Sub2_13.method3268(1);
		super.aClass67_Sub2_13.method3234((Class245) null);
		super.aClass67_Sub2_13.method3268(0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZLclient!nw;Lclient!nw;I)V")
	@Override
	public void method2913(@OriginalArg(1) Class245_Sub2 arg0, @OriginalArg(2) Class245_Sub2 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass245_Sub2Array1 == null) {
			super.aClass67_Sub2_13.method3234(arg0);
			super.aClass67_Sub2_13.method3253(this.aClass339_2);
			this.aClass339_2.method8083(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass175_1.aLong173;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static11.aFloat1, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3389, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3389, (float) this.anInt3385);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3385);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass67_Sub2_13.method3253(this.aClass339_1);
			@Pc(112) int local112 = Static487.method7093(this.anInt3389);
			@Pc(117) int local117 = Static487.method7093(this.anInt3385);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass339_1.method8076(0, this.aClass245_Sub2Array1[local119]);
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				if (local119 == 0) {
					super.aClass67_Sub2_13.method3234(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3389, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3389, (float) this.anInt3385);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3385);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass67_Sub2_13.method3234(this.aClass245_Sub2Array1[local119 - 1]);
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
			super.aClass67_Sub2_13.method3223(this.aClass339_1);
			super.aClass67_Sub2_13.method3234(this.aClass245_Sub2Array1[local119 - 1]);
			super.aClass67_Sub2_13.method3253(this.aClass339_2);
			this.aClass339_2.method8083(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(290) long local290 = this.aClass175_3.aLong173;
			OpenGL.glUseProgramObjectARB(local290);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local290, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local290, "params"), Static11.aFloat1, 0.0F, 0.0F);
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
		this.aClass339_2.method8083(1);
		super.aClass67_Sub2_13.method3234(this.aClass245_Sub2_2);
		local46 = this.aClass175_4.aLong173;
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
		this.aClass339_2.method8083(0);
		super.aClass67_Sub2_13.method3234(this.aClass245_Sub2_3);
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
		super.aClass67_Sub2_13.method3223(this.aClass339_2);
		@Pc(464) long local464 = this.aClass175_2.aLong173;
		OpenGL.glUseProgramObjectARB(local464);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local464, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local464, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local464, "params"), Static173.aFloat59, Static162.aFloat58, 0.0F);
		super.aClass67_Sub2_13.method3268(1);
		super.aClass67_Sub2_13.method3234(this.aClass245_Sub2_2);
		super.aClass67_Sub2_13.method3268(0);
		super.aClass67_Sub2_13.method3234(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2924() {
		if (!super.aClass67_Sub2_13.aBoolean309 || !super.aClass67_Sub2_13.aBoolean307 || !super.aClass67_Sub2_13.aBoolean328) {
			return false;
		}
		this.aClass339_2 = new Class339(super.aClass67_Sub2_13);
		this.aClass245_Sub2_2 = new Class245_Sub2(super.aClass67_Sub2_13, 3553, 34842, 256, 256);
		this.aClass245_Sub2_2.method8473(false, false);
		this.aClass245_Sub2_3 = new Class245_Sub2(super.aClass67_Sub2_13, 3553, 34842, 256, 256);
		this.aClass245_Sub2_3.method8473(false, false);
		super.aClass67_Sub2_13.method3253(this.aClass339_2);
		this.aClass339_2.method8076(0, this.aClass245_Sub2_2);
		this.aClass339_2.method8076(1, this.aClass245_Sub2_3);
		this.aClass339_2.method8083(0);
		if (!this.aClass339_2.method8070()) {
			super.aClass67_Sub2_13.method3223(this.aClass339_2);
			return false;
		}
		super.aClass67_Sub2_13.method3223(this.aClass339_2);
		this.aClass175_1 = Static435.method6374(super.aClass67_Sub2_13, -67, new Class127[] { Static304.method4645("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass67_Sub2_13) });
		this.aClass175_3 = Static435.method6374(super.aClass67_Sub2_13, -78, new Class127[] { Static304.method4645("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass67_Sub2_13) });
		this.aClass175_2 = Static435.method6374(super.aClass67_Sub2_13, -99, new Class127[] { Static304.method4645("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass67_Sub2_13) });
		this.aClass175_4 = Static435.method6374(super.aClass67_Sub2_13, -101, new Class127[] { Static304.method4645("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass67_Sub2_13) });
		return this.aClass175_3 != null && this.aClass175_1 != null && this.aClass175_2 != null && this.aClass175_4 != null;
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method2919() {
		return this.aClass339_2 != null;
	}
}
