import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class6_Sub25_Sub1 extends Class6_Sub25 {

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "Lclient!aw;")
	private Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!ida", name = "H", descriptor = "Lclient!rv;")
	private Class300 aClass300_3;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
	private int anInt4613;

	@OriginalMember(owner = "client!ida", name = "J", descriptor = "Lclient!rv;")
	private Class300 aClass300_4;

	@OriginalMember(owner = "client!ida", name = "K", descriptor = "Lclient!rv;")
	private Class300 aClass300_5;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
	private int anInt4614;

	@OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
	private int anInt4615;

	@OriginalMember(owner = "client!ida", name = "O", descriptor = "Lclient!iha;")
	private Class149 aClass149_4;

	@OriginalMember(owner = "client!ida", name = "P", descriptor = "[Lclient!aw;")
	private Class3_Sub2[] aClass3_Sub2Array2;

	@OriginalMember(owner = "client!ida", name = "Q", descriptor = "Lclient!aw;")
	private Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!ida", name = "S", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!ida", name = "U", descriptor = "Lclient!iha;")
	private Class149 aClass149_5;

	@OriginalMember(owner = "client!ida", name = "Y", descriptor = "Lclient!rv;")
	private Class300 aClass300_6;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class6_Sub25_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "(I)I")
	@Override
	public int method4000() {
		return 1;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(IZ)V")
	@Override
	public void method3995(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass100_Sub3_28.method8861(1);
		super.aClass100_Sub3_28.method8925((Class3) null);
		super.aClass100_Sub3_28.method8861(0);
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3990() {
		return this.aClass149_4 != null;
	}

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "(I)Z")
	public boolean method4004() {
		return super.aClass100_Sub3_28.aBoolean698 && super.aClass100_Sub3_28.aBoolean714 && super.aClass100_Sub3_28.aBoolean723;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
	@Override
	public void method3989() {
		this.aClass300_4 = null;
		this.aClass3_Sub2_3 = null;
		this.aClass300_5 = null;
		this.aClass149_4 = null;
		this.aClass300_6 = null;
		this.aClass149_5 = null;
		this.aClass3_Sub2_2 = null;
		this.aClass3_Sub2Array2 = null;
		this.aClass300_3 = null;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILclient!aw;Lclient!aw;)V")
	@Override
	public void method3998(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) Class3_Sub2 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(268) long local268;
		if (this.aClass3_Sub2Array2 == null) {
			super.aClass100_Sub3_28.method8925(arg1);
			super.aClass100_Sub3_28.method8935(this.aClass149_4);
			this.aClass149_4.method4097(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local268 = this.aClass300_3.aLong224;
			OpenGL.glUseProgramObjectARB(local268);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "params"), Static68.aFloat23, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt4614, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt4614, (float) this.anInt4613);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt4613);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass100_Sub3_28.method8935(this.aClass149_5);
			@Pc(32) int local32 = Static600.method8449(this.anInt4614);
			@Pc(37) int local37 = Static600.method8449(this.anInt4613);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass149_5.method4098(0, this.aClass3_Sub2Array2[local39]);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass100_Sub3_28.method8925(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt4614, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt4614, (float) this.anInt4613);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4613);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass100_Sub3_28.method8925(this.aClass3_Sub2Array2[local39 - 1]);
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
			super.aClass100_Sub3_28.method8896(this.aClass149_5);
			super.aClass100_Sub3_28.method8925(this.aClass3_Sub2Array2[local39 - 1]);
			super.aClass100_Sub3_28.method8935(this.aClass149_4);
			this.aClass149_4.method4097(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(200) long local200 = this.aClass300_6.aLong224;
			OpenGL.glUseProgramObjectARB(local200);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local200, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local200, "params"), Static68.aFloat23, 0.0F, 0.0F);
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
		this.aClass149_4.method4097(1);
		super.aClass100_Sub3_28.method8925(this.aClass3_Sub2_3);
		local268 = this.aClass300_4.aLong224;
		OpenGL.glUseProgramObjectARB(local268);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local268, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass149_4.method4097(0);
		super.aClass100_Sub3_28.method8925(this.aClass3_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local268, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass100_Sub3_28.method8896(this.aClass149_4);
		@Pc(436) long local436 = this.aClass300_5.aLong224;
		OpenGL.glUseProgramObjectARB(local436);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local436, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local436, "params"), Static50.aFloat16, Static124.aFloat31, 0.0F);
		super.aClass100_Sub3_28.method8861(1);
		super.aClass100_Sub3_28.method8925(this.aClass3_Sub2_3);
		super.aClass100_Sub3_28.method8861(0);
		super.aClass100_Sub3_28.method8925(arg1);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3988() {
		if (!super.aClass100_Sub3_28.aBoolean698 || !super.aClass100_Sub3_28.aBoolean714 || !super.aClass100_Sub3_28.aBoolean723) {
			return false;
		}
		this.aClass149_4 = new Class149(super.aClass100_Sub3_28);
		this.aClass3_Sub2_3 = new Class3_Sub2(super.aClass100_Sub3_28, 3553, 34842, 256, 256);
		this.aClass3_Sub2_3.method3904(false, false);
		this.aClass3_Sub2_2 = new Class3_Sub2(super.aClass100_Sub3_28, 3553, 34842, 256, 256);
		this.aClass3_Sub2_2.method3904(false, false);
		super.aClass100_Sub3_28.method8935(this.aClass149_4);
		this.aClass149_4.method4098(0, this.aClass3_Sub2_3);
		this.aClass149_4.method4098(1, this.aClass3_Sub2_2);
		this.aClass149_4.method4097(0);
		if (!this.aClass149_4.method4101()) {
			super.aClass100_Sub3_28.method8896(this.aClass149_4);
			return false;
		}
		super.aClass100_Sub3_28.method8896(this.aClass149_4);
		this.aClass300_3 = Static648.method9037(new Class375[] { Static142.method2295(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass100_Sub3_28) }, super.aClass100_Sub3_28);
		this.aClass300_6 = Static648.method9037(new Class375[] { Static142.method2295(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass100_Sub3_28) }, super.aClass100_Sub3_28);
		this.aClass300_5 = Static648.method9037(new Class375[] { Static142.method2295(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass100_Sub3_28) }, super.aClass100_Sub3_28);
		this.aClass300_4 = Static648.method9037(new Class375[] { Static142.method2295(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass100_Sub3_28) }, super.aClass100_Sub3_28);
		return this.aClass300_6 != null && this.aClass300_3 != null && this.aClass300_5 != null && this.aClass300_4 != null;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)V")
	@Override
	public void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4614 = arg1;
		this.anInt4613 = arg0;
		@Pc(16) int local16 = Static600.method8449(this.anInt4614);
		@Pc(27) int local27 = Static600.method8449(this.anInt4613);
		if (local16 == this.anInt4618 && local27 == this.anInt4615) {
			return;
		}
		@Pc(48) int local48;
		if (this.aClass3_Sub2Array2 != null) {
			for (local48 = 0; local48 < this.aClass3_Sub2Array2.length; local48++) {
				this.aClass3_Sub2Array2[local48].method5770();
			}
			this.aClass3_Sub2Array2 = null;
		}
		if (local16 <= 256 && local27 <= 256) {
			this.aClass149_5 = null;
		} else {
			local48 = local16;
			@Pc(84) int local84 = local27;
			@Pc(86) int local86 = 0;
			label58: while (true) {
				if (local48 <= 256 && local84 <= 256) {
					if (this.aClass149_5 == null) {
						this.aClass149_5 = new Class149(super.aClass100_Sub3_28);
					}
					this.aClass3_Sub2Array2 = new Class3_Sub2[local86];
					local48 = local16;
					local84 = local27;
					local86 = 0;
					while (true) {
						if (local48 <= 256 && local84 <= 256) {
							break label58;
						}
						this.aClass3_Sub2Array2[local86++] = new Class3_Sub2(super.aClass100_Sub3_28, 3553, 34842, local48, local84);
						if (local84 > 256) {
							local84 >>= 0x1;
						}
						if (local48 > 256) {
							local48 >>= 0x1;
						}
					}
				}
				if (local48 > 256) {
					local48 >>= 0x1;
				}
				if (local84 > 256) {
					local84 >>= 0x1;
				}
				local86++;
			}
		}
		this.anInt4618 = local16;
		this.anInt4615 = local27;
	}
}
