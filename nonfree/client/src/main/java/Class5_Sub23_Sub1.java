import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class5_Sub23_Sub1 extends Class5_Sub23 {

	@OriginalMember(owner = "client!go", name = "D", descriptor = "Lclient!lea;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "Lclient!ir;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "Lclient!ir;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "Lclient!lea;")
	private Class219 aClass219_2;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "Lclient!ir;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "I")
	private int anInt3557;

	@OriginalMember(owner = "client!go", name = "z", descriptor = "[Lclient!kia;")
	private Class29_Sub3[] aClass29_Sub3Array1;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "Lclient!ir;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "I")
	private int anInt3559;

	@OriginalMember(owner = "client!go", name = "G", descriptor = "Lclient!kia;")
	private Class29_Sub3 aClass29_Sub3_1;

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Lclient!kia;")
	private Class29_Sub3 aClass29_Sub3_2;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class5_Sub23_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)V")
	@Override
	public void method3262(@OriginalArg(1) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass100_Sub3_14.method8678(1);
		super.aClass100_Sub3_14.method8743((Class29) null);
		super.aClass100_Sub3_14.method8678(0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method3261() {
		if (!super.aClass100_Sub3_14.aBoolean741 || !super.aClass100_Sub3_14.aBoolean738 || !super.aClass100_Sub3_14.aBoolean730) {
			return false;
		}
		this.aClass219_1 = new Class219(super.aClass100_Sub3_14);
		this.aClass29_Sub3_1 = new Class29_Sub3(super.aClass100_Sub3_14, 3553, 34842, 256, 256);
		this.aClass29_Sub3_1.method8174(false, false);
		this.aClass29_Sub3_2 = new Class29_Sub3(super.aClass100_Sub3_14, 3553, 34842, 256, 256);
		this.aClass29_Sub3_2.method8174(false, false);
		super.aClass100_Sub3_14.method8670(this.aClass219_1);
		this.aClass219_1.method4969(this.aClass29_Sub3_1, 0);
		this.aClass219_1.method4969(this.aClass29_Sub3_2, 1);
		this.aClass219_1.method4967(0);
		if (!this.aClass219_1.method4974()) {
			super.aClass100_Sub3_14.method8748(this.aClass219_1);
			return false;
		}
		super.aClass100_Sub3_14.method8748(this.aClass219_1);
		this.aClass175_4 = Static542.method7425(new Class224[] { Static500.method6963(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass100_Sub3_14) }, super.aClass100_Sub3_14);
		this.aClass175_3 = Static542.method7425(new Class224[] { Static500.method6963(35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", super.aClass100_Sub3_14) }, super.aClass100_Sub3_14);
		this.aClass175_1 = Static542.method7425(new Class224[] { Static500.method6963(35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", super.aClass100_Sub3_14) }, super.aClass100_Sub3_14);
		this.aClass175_2 = Static542.method7425(new Class224[] { Static500.method6963(35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", super.aClass100_Sub3_14) }, super.aClass100_Sub3_14);
		return this.aClass175_3 != null && this.aClass175_4 != null && this.aClass175_1 != null && this.aClass175_2 != null;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3254() {
		return this.aClass219_1 != null;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)I")
	@Override
	public int method3251() {
		return 1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!kia;Lclient!kia;I)V")
	@Override
	public void method3260(@OriginalArg(1) Class29_Sub3 arg0, @OriginalArg(2) Class29_Sub3 arg1, @OriginalArg(3) int arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(281) long local281;
		if (this.aClass29_Sub3Array1 == null) {
			super.aClass100_Sub3_14.method8743(arg1);
			super.aClass100_Sub3_14.method8670(this.aClass219_1);
			this.aClass219_1.method4967(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local281 = this.aClass175_4.aLong134;
			OpenGL.glUseProgramObjectARB(local281);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local281, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "params"), Static17.aFloat14, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3554, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3554, (float) this.anInt3559);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3559);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass100_Sub3_14.method8670(this.aClass219_2);
			@Pc(32) int local32 = Static186.method3180(this.anInt3554);
			@Pc(37) int local37 = Static186.method3180(this.anInt3559);
			@Pc(39) int local39 = 0;
			while (local32 > 256 || local37 > 256) {
				OpenGL.glViewport(0, 0, local32, local37);
				this.aClass219_2.method4969(this.aClass29_Sub3Array1[local39], 0);
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				if (local32 > 256) {
					local32 >>= 0x1;
				}
				if (local39 == 0) {
					super.aClass100_Sub3_14.method8743(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt3554, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt3554, (float) this.anInt3559);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3559);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass100_Sub3_14.method8743(this.aClass29_Sub3Array1[local39 - 1]);
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
			super.aClass100_Sub3_14.method8748(this.aClass219_2);
			super.aClass100_Sub3_14.method8743(this.aClass29_Sub3Array1[local39 - 1]);
			super.aClass100_Sub3_14.method8670(this.aClass219_1);
			this.aClass219_1.method4967(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(209) long local209 = this.aClass175_3.aLong134;
			OpenGL.glUseProgramObjectARB(local209);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local209, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local209, "params"), Static17.aFloat14, 0.0F, 0.0F);
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
		this.aClass219_1.method4967(1);
		super.aClass100_Sub3_14.method8743(this.aClass29_Sub3_1);
		local281 = this.aClass175_2.aLong134;
		OpenGL.glUseProgramObjectARB(local281);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local281, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass219_1.method4967(0);
		super.aClass100_Sub3_14.method8743(this.aClass29_Sub3_2);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local281, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass100_Sub3_14.method8748(this.aClass219_1);
		@Pc(462) long local462 = this.aClass175_1.aLong134;
		OpenGL.glUseProgramObjectARB(local462);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local462, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local462, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local462, "params"), Static105.aFloat43, Static41.aFloat26, 0.0F);
		super.aClass100_Sub3_14.method8678(1);
		super.aClass100_Sub3_14.method8743(this.aClass29_Sub3_1);
		super.aClass100_Sub3_14.method8678(0);
		super.aClass100_Sub3_14.method8743(arg1);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BII)V")
	@Override
	public void method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3559 = arg1;
		this.anInt3554 = arg0;
		@Pc(24) int local24 = Static186.method3180(this.anInt3554);
		@Pc(29) int local29 = Static186.method3180(this.anInt3559);
		if (this.anInt3550 == local24 && this.anInt3557 == local29) {
			return;
		}
		@Pc(46) int local46;
		if (this.aClass29_Sub3Array1 != null) {
			for (local46 = 0; local46 < this.aClass29_Sub3Array1.length; local46++) {
				this.aClass29_Sub3Array1[local46].method8167();
			}
			this.aClass29_Sub3Array1 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass219_2 = null;
		} else {
			local46 = local24;
			@Pc(85) int local85 = local29;
			@Pc(87) int local87 = 0;
			if (this.aClass219_2 == null) {
				this.aClass219_2 = new Class219(super.aClass100_Sub3_14);
			}
			label55: while (true) {
				if (local46 <= 256 && local85 <= 256) {
					local46 = local24;
					local85 = local29;
					this.aClass29_Sub3Array1 = new Class29_Sub3[local87];
					local87 = 0;
					while (true) {
						if (local46 <= 256 && local85 <= 256) {
							break label55;
						}
						this.aClass29_Sub3Array1[local87++] = new Class29_Sub3(super.aClass100_Sub3_14, 3553, 34842, local46, local85);
						if (local85 > 256) {
							local85 >>= 0x1;
						}
						if (local46 > 256) {
							local46 >>= 0x1;
						}
					}
				}
				local87++;
				if (local46 > 256) {
					local46 >>= 0x1;
				}
				if (local85 > 256) {
					local85 >>= 0x1;
				}
			}
		}
		this.anInt3557 = local29;
		this.anInt3550 = local24;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
	@Override
	public void method3252() {
		this.aClass29_Sub3Array1 = null;
		this.aClass175_4 = null;
		this.aClass175_1 = null;
		this.aClass175_2 = null;
		this.aClass29_Sub3_2 = null;
		this.aClass175_3 = null;
		this.aClass29_Sub3_1 = null;
		this.aClass219_2 = null;
		this.aClass219_1 = null;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)Z")
	public boolean method3265() {
		return super.aClass100_Sub3_14.aBoolean741 && super.aClass100_Sub3_14.aBoolean738 && super.aClass100_Sub3_14.aBoolean730;
	}
}
