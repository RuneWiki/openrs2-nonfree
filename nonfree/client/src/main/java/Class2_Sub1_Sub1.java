import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
	private int anInt4140;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "Lclient!kj;")
	private Class212 aClass212_2;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
	private int anInt4141;

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "Lclient!ng;")
	private Class64_Sub4 aClass64_Sub4_2;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "Lclient!kj;")
	private Class212 aClass212_3;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "Lclient!hi;")
	private Class155 aClass155_1;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
	private int anInt4146;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "Lclient!ng;")
	private Class64_Sub4 aClass64_Sub4_3;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!kj;")
	private Class212 aClass212_4;

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "Lclient!hi;")
	private Class155 aClass155_2;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "[Lclient!ng;")
	private Class64_Sub4[] aClass64_Sub4Array1;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "Lclient!kj;")
	private Class212 aClass212_5;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class145_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Z")
	public boolean method3769() {
		return super.aClass145_Sub3_20.aBoolean876 && super.aClass145_Sub3_20.aBoolean853 && super.aClass145_Sub3_20.aBoolean874;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3764() {
		if (!super.aClass145_Sub3_20.aBoolean876 || !super.aClass145_Sub3_20.aBoolean853 || !super.aClass145_Sub3_20.aBoolean874) {
			return false;
		}
		this.aClass155_1 = new Class155(super.aClass145_Sub3_20);
		this.aClass64_Sub4_2 = new Class64_Sub4(super.aClass145_Sub3_20, 3553, 34842, 256, 256);
		this.aClass64_Sub4_2.method4548(false, false);
		this.aClass64_Sub4_3 = new Class64_Sub4(super.aClass145_Sub3_20, 3553, 34842, 256, 256);
		this.aClass64_Sub4_3.method4548(false, false);
		super.aClass145_Sub3_20.method8906(this.aClass155_1);
		this.aClass155_1.method3391(this.aClass64_Sub4_2, 0);
		this.aClass155_1.method3391(this.aClass64_Sub4_3, 1);
		this.aClass155_1.method3389(0);
		if (!this.aClass155_1.method3383()) {
			super.aClass145_Sub3_20.method8863(this.aClass155_1);
			return false;
		}
		super.aClass145_Sub3_20.method8863(this.aClass155_1);
		this.aClass212_4 = Static404.method5980(new Class87[] { Static507.method7183("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass145_Sub3_20, 35632) }, 50, super.aClass145_Sub3_20);
		this.aClass212_2 = Static404.method5980(new Class87[] { Static507.method7183("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass145_Sub3_20, 35632) }, 105, super.aClass145_Sub3_20);
		this.aClass212_5 = Static404.method5980(new Class87[] { Static507.method7183("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass145_Sub3_20, 35632) }, 69, super.aClass145_Sub3_20);
		this.aClass212_3 = Static404.method5980(new Class87[] { Static507.method7183("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass145_Sub3_20, 35632) }, 78, super.aClass145_Sub3_20);
		return this.aClass212_2 != null && this.aClass212_4 != null && this.aClass212_5 != null && this.aClass212_3 != null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	@Override
	public void method3768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4146 = arg0;
		this.anInt4153 = arg1;
		@Pc(27) int local27 = Static457.method6640(this.anInt4146);
		@Pc(32) int local32 = Static457.method6640(this.anInt4153);
		if (local27 == this.anInt4140 && this.anInt4141 == local32) {
			return;
		}
		@Pc(53) int local53;
		if (this.aClass64_Sub4Array1 != null) {
			for (local53 = 0; local53 < this.aClass64_Sub4Array1.length; local53++) {
				this.aClass64_Sub4Array1[local53].method4545();
			}
			this.aClass64_Sub4Array1 = null;
		}
		if (local27 <= 256 && local32 <= 256) {
			this.aClass155_2 = null;
		} else {
			local53 = local27;
			@Pc(103) int local103 = local32;
			@Pc(105) int local105 = 0;
			label56: while (true) {
				if (local53 <= 256 && local103 <= 256) {
					if (this.aClass155_2 == null) {
						this.aClass155_2 = new Class155(super.aClass145_Sub3_20);
					}
					this.aClass64_Sub4Array1 = new Class64_Sub4[local105];
					local103 = local32;
					local53 = local27;
					local105 = 0;
					while (true) {
						if (local53 <= 256 && local103 <= 256) {
							break label56;
						}
						this.aClass64_Sub4Array1[local105++] = new Class64_Sub4(super.aClass145_Sub3_20, 3553, 34842, local53, local103);
						if (local103 > 256) {
							local103 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local105++;
				if (local103 > 256) {
					local103 >>= 0x1;
				}
			}
		}
		this.anInt4141 = local32;
		this.anInt4140 = local27;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	@Override
	public void method3765() {
		this.aClass155_1 = null;
		this.aClass64_Sub4_3 = null;
		this.aClass212_4 = null;
		this.aClass212_5 = null;
		this.aClass155_2 = null;
		this.aClass64_Sub4_2 = null;
		this.aClass212_2 = null;
		this.aClass64_Sub4Array1 = null;
		this.aClass212_3 = null;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)I")
	@Override
	public int method3762() {
		return 1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ng;ZLclient!ng;)V")
	@Override
	public void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) Class64_Sub4 arg1, @OriginalArg(3) Class64_Sub4 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(46) long local46;
		if (this.aClass64_Sub4Array1 == null) {
			super.aClass145_Sub3_20.method8872(arg1);
			super.aClass145_Sub3_20.method8906(this.aClass155_1);
			this.aClass155_1.method3389(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local46 = this.aClass212_4.aLong162;
			OpenGL.glUseProgramObjectARB(local46);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "params"), Static210.aFloat44, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4146, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4146, (float) this.anInt4153);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4153);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass145_Sub3_20.method8906(this.aClass155_2);
			@Pc(112) int local112 = Static457.method6640(this.anInt4146);
			@Pc(117) int local117 = Static457.method6640(this.anInt4153);
			@Pc(119) int local119 = 0;
			while (local112 > 256 || local117 > 256) {
				OpenGL.glViewport(0, 0, local112, local117);
				this.aClass155_2.method3391(this.aClass64_Sub4Array1[local119], 0);
				if (local119 == 0) {
					super.aClass145_Sub3_20.method8872(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4146, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4146, (float) this.anInt4153);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4153);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass145_Sub3_20.method8872(this.aClass64_Sub4Array1[local119 - 1]);
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
				if (local112 > 256) {
					local112 >>= 0x1;
				}
				local119++;
			}
			super.aClass145_Sub3_20.method8863(this.aClass155_2);
			super.aClass145_Sub3_20.method8872(this.aClass64_Sub4Array1[local119 - 1]);
			super.aClass145_Sub3_20.method8906(this.aClass155_1);
			this.aClass155_1.method3389(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(291) long local291 = this.aClass212_2.aLong162;
			OpenGL.glUseProgramObjectARB(local291);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local291, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local291, "params"), Static210.aFloat44, 0.0F, 0.0F);
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
		this.aClass155_1.method3389(1);
		super.aClass145_Sub3_20.method8872(this.aClass64_Sub4_2);
		local46 = this.aClass212_3.aLong162;
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
		this.aClass155_1.method3389(0);
		super.aClass145_Sub3_20.method8872(this.aClass64_Sub4_3);
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
		super.aClass145_Sub3_20.method8863(this.aClass155_1);
		@Pc(465) long local465 = this.aClass212_5.aLong162;
		OpenGL.glUseProgramObjectARB(local465);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local465, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local465, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local465, "params"), Static469.aFloat126, Static188.aFloat29, 0.0F);
		super.aClass145_Sub3_20.method8859(1);
		super.aClass145_Sub3_20.method8872(this.aClass64_Sub4_2);
		super.aClass145_Sub3_20.method8859(0);
		super.aClass145_Sub3_20.method8872(arg1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	@Override
	public void method3759(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB((long) 0);
		super.aClass145_Sub3_20.method8859(1);
		super.aClass145_Sub3_20.method8872((Class64) null);
		super.aClass145_Sub3_20.method8859(0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3766() {
		return this.aClass155_1 != null;
	}
}
