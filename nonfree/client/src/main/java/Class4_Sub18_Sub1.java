import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fka")
public final class Class4_Sub18_Sub1 extends Class4_Sub18 {

	@OriginalMember(owner = "client!fka", name = "z", descriptor = "[Lclient!ld;")
	private Class116_Sub2[] aClass116_Sub2Array1;

	@OriginalMember(owner = "client!fka", name = "A", descriptor = "I")
	private int anInt2969;

	@OriginalMember(owner = "client!fka", name = "B", descriptor = "Lclient!ld;")
	private Class116_Sub2 aClass116_Sub2_2;

	@OriginalMember(owner = "client!fka", name = "C", descriptor = "Lclient!pq;")
	private Class290 aClass290_1;

	@OriginalMember(owner = "client!fka", name = "D", descriptor = "Lclient!vda;")
	private Class371 aClass371_1;

	@OriginalMember(owner = "client!fka", name = "E", descriptor = "Lclient!ld;")
	private Class116_Sub2 aClass116_Sub2_3;

	@OriginalMember(owner = "client!fka", name = "H", descriptor = "Lclient!pq;")
	private Class290 aClass290_2;

	@OriginalMember(owner = "client!fka", name = "K", descriptor = "Lclient!pq;")
	private Class290 aClass290_3;

	@OriginalMember(owner = "client!fka", name = "O", descriptor = "I")
	private int anInt2975;

	@OriginalMember(owner = "client!fka", name = "Q", descriptor = "Lclient!pq;")
	private Class290 aClass290_4;

	@OriginalMember(owner = "client!fka", name = "R", descriptor = "Lclient!vda;")
	private Class371 aClass371_2;

	@OriginalMember(owner = "client!fka", name = "T", descriptor = "I")
	private int anInt2978;

	@OriginalMember(owner = "client!fka", name = "U", descriptor = "I")
	private int anInt2979;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class4_Sub18_Sub1(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fka", name = "e", descriptor = "(Z)Z")
	public boolean method2783() {
		return super.aClass33_Sub3_10.aBoolean567 && super.aClass33_Sub3_10.aBoolean554 && super.aClass33_Sub3_10.aBoolean557;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2975 = arg0;
		this.anInt2978 = arg1;
		@Pc(22) int local22 = Static125.method2245(this.anInt2975);
		@Pc(27) int local27 = Static125.method2245(this.anInt2978);
		if (this.anInt2979 == local22 && this.anInt2969 == local27) {
			return;
		}
		@Pc(40) int local40;
		if (this.aClass116_Sub2Array1 != null) {
			for (local40 = 0; local40 < this.aClass116_Sub2Array1.length; local40++) {
				this.aClass116_Sub2Array1[local40].method8345();
			}
			this.aClass116_Sub2Array1 = null;
		}
		if (local22 <= 256 && local27 <= 256) {
			this.aClass371_1 = null;
		} else {
			local40 = local22;
			@Pc(74) int local74 = local27;
			@Pc(76) int local76 = 0;
			if (this.aClass371_1 == null) {
				this.aClass371_1 = new Class371(super.aClass33_Sub3_10);
			}
			label56: while (true) {
				if (local40 <= 256 && local74 <= 256) {
					local40 = local22;
					local74 = local27;
					this.aClass116_Sub2Array1 = new Class116_Sub2[local76];
					local76 = 0;
					while (true) {
						if (local40 <= 256 && local74 <= 256) {
							break label56;
						}
						this.aClass116_Sub2Array1[local76++] = new Class116_Sub2(super.aClass33_Sub3_10, 3553, 34842, local40, local74);
						if (local74 > 256) {
							local74 >>= 0x1;
						}
						if (local40 > 256) {
							local40 >>= 0x1;
						}
					}
				}
				if (local74 > 256) {
					local74 >>= 0x1;
				}
				if (local40 > 256) {
					local40 >>= 0x1;
				}
				local76++;
			}
		}
		this.anInt2969 = local27;
		this.anInt2979 = local22;
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)V")
	@Override
	public void method2782() {
		this.aClass290_3 = null;
		this.aClass290_2 = null;
		this.aClass116_Sub2_3 = null;
		this.aClass371_1 = null;
		this.aClass116_Sub2_2 = null;
		this.aClass290_4 = null;
		this.aClass371_2 = null;
		this.aClass116_Sub2Array1 = null;
		this.aClass290_1 = null;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!ld;Lclient!ld;IB)V")
	@Override
	public void method2768(@OriginalArg(0) Class116_Sub2 arg0, @OriginalArg(1) Class116_Sub2 arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(270) long local270;
		if (this.aClass116_Sub2Array1 == null) {
			super.aClass33_Sub3_10.method6340(arg1);
			super.aClass33_Sub3_10.method6360(this.aClass371_2);
			this.aClass371_2.method8439(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local270 = this.aClass290_1.aLong217;
			OpenGL.glUseProgramObjectARB(local270);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "params"), Static626.aFloat227, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2975, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2975, (float) this.anInt2978);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2978);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass33_Sub3_10.method6360(this.aClass371_1);
			@Pc(38) int local38 = Static125.method2245(this.anInt2975);
			@Pc(43) int local43 = Static125.method2245(this.anInt2978);
			@Pc(45) int local45 = 0;
			while (local38 > 256 || local43 > 256) {
				OpenGL.glViewport(0, 0, local38, local43);
				this.aClass371_1.method8441(0, this.aClass116_Sub2Array1[local45]);
				if (local38 > 256) {
					local38 >>= 0x1;
				}
				if (local43 > 256) {
					local43 >>= 0x1;
				}
				if (local45 == 0) {
					super.aClass33_Sub3_10.method6340(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt2975, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt2975, (float) this.anInt2978);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2978);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass33_Sub3_10.method6340(this.aClass116_Sub2Array1[local45 - 1]);
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
				local45++;
			}
			super.aClass33_Sub3_10.method6368(this.aClass371_1);
			super.aClass33_Sub3_10.method6340(this.aClass116_Sub2Array1[local45 - 1]);
			super.aClass33_Sub3_10.method6360(this.aClass371_2);
			this.aClass371_2.method8439(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(202) long local202 = this.aClass290_2.aLong217;
			OpenGL.glUseProgramObjectARB(local202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local202, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local202, "params"), Static626.aFloat227, 0.0F, 0.0F);
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
		this.aClass371_2.method8439(1);
		super.aClass33_Sub3_10.method6340(this.aClass116_Sub2_3);
		local270 = this.aClass290_3.aLong217;
		OpenGL.glUseProgramObjectARB(local270);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local270, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass371_2.method8439(0);
		super.aClass33_Sub3_10.method6340(this.aClass116_Sub2_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local270, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass33_Sub3_10.method6368(this.aClass371_2);
		@Pc(434) long local434 = this.aClass290_4.aLong217;
		OpenGL.glUseProgramObjectARB(local434);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local434, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local434, "params"), Static72.aFloat17, Static669.aFloat237, 0.0F);
		super.aClass33_Sub3_10.method6329(1);
		super.aClass33_Sub3_10.method6340(this.aClass116_Sub2_3);
		super.aClass33_Sub3_10.method6329(0);
		super.aClass33_Sub3_10.method6340(arg1);
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2766() {
		if (!super.aClass33_Sub3_10.aBoolean567 || !super.aClass33_Sub3_10.aBoolean554 || !super.aClass33_Sub3_10.aBoolean557) {
			return false;
		}
		this.aClass371_2 = new Class371(super.aClass33_Sub3_10);
		this.aClass116_Sub2_3 = new Class116_Sub2(super.aClass33_Sub3_10, 3553, 34842, 256, 256);
		this.aClass116_Sub2_3.method6838(false, false);
		this.aClass116_Sub2_2 = new Class116_Sub2(super.aClass33_Sub3_10, 3553, 34842, 256, 256);
		this.aClass116_Sub2_2.method6838(false, false);
		super.aClass33_Sub3_10.method6360(this.aClass371_2);
		this.aClass371_2.method8441(0, this.aClass116_Sub2_3);
		this.aClass371_2.method8441(1, this.aClass116_Sub2_2);
		this.aClass371_2.method8439(0);
		if (!this.aClass371_2.method8443()) {
			super.aClass33_Sub3_10.method6368(this.aClass371_2);
			return false;
		}
		super.aClass33_Sub3_10.method6368(this.aClass371_2);
		this.aClass290_1 = Static208.method3117(new Class297[] { Static572.method7590(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass33_Sub3_10) }, super.aClass33_Sub3_10);
		this.aClass290_2 = Static208.method3117(new Class297[] { Static572.method7590(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass33_Sub3_10) }, super.aClass33_Sub3_10);
		this.aClass290_4 = Static208.method3117(new Class297[] { Static572.method7590(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass33_Sub3_10) }, super.aClass33_Sub3_10);
		this.aClass290_3 = Static208.method3117(new Class297[] { Static572.method7590(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass33_Sub3_10) }, super.aClass33_Sub3_10);
		return this.aClass290_2 != null && this.aClass290_1 != null && this.aClass290_4 != null && this.aClass290_3 != null;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)V")
	@Override
	public void method2775(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass33_Sub3_10.method6329(1);
		super.aClass33_Sub3_10.method6340((Class116) null);
		super.aClass33_Sub3_10.method6329(0);
	}

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2773() {
		return this.aClass371_2 != null;
	}

	@OriginalMember(owner = "client!fka", name = "d", descriptor = "(Z)I")
	@Override
	public int method2781() {
		return 1;
	}
}
