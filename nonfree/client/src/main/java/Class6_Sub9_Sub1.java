import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class6_Sub9_Sub1 extends Class6_Sub9 {

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[Lclient!kp;")
	private Class132_Sub1[] aClass132_Sub1Array4;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	private int anInt9397;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!lj;")
	private Class200 aClass200_4;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "Lclient!kp;")
	private Class132_Sub1 aClass132_Sub1_4;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "Lclient!lj;")
	private Class200 aClass200_5;

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "Lclient!lj;")
	private Class200 aClass200_6;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
	private int anInt9403;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "Lclient!ei;")
	private Class89 aClass89_5;

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "Lclient!lj;")
	private Class200 aClass200_7;

	@OriginalMember(owner = "client!vn", name = "M", descriptor = "Lclient!ei;")
	private Class89 aClass89_6;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "Lclient!kp;")
	private Class132_Sub1 aClass132_Sub1_5;

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
	private int anInt9407;

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "I")
	private int anInt9409;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class6_Sub9_Sub1(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		if (!super.aClass9_Sub2_39.aBoolean70 || !super.aClass9_Sub2_39.aBoolean47 || !super.aClass9_Sub2_39.aBoolean56) {
			return false;
		}
		this.aClass89_5 = new Class89(super.aClass9_Sub2_39);
		this.aClass132_Sub1_5 = new Class132_Sub1(super.aClass9_Sub2_39, 3553, 34842, 256, 256);
		this.aClass132_Sub1_5.method3694(false, false);
		this.aClass132_Sub1_4 = new Class132_Sub1(super.aClass9_Sub2_39, 3553, 34842, 256, 256);
		this.aClass132_Sub1_4.method3694(false, false);
		super.aClass9_Sub2_39.method821(this.aClass89_5);
		this.aClass89_5.method2378(0, this.aClass132_Sub1_5);
		this.aClass89_5.method2378(1, this.aClass132_Sub1_4);
		this.aClass89_5.method2376(0);
		if (!this.aClass89_5.method2370()) {
			super.aClass9_Sub2_39.method767(this.aClass89_5);
			return false;
		}
		super.aClass9_Sub2_39.method767(this.aClass89_5);
		this.aClass200_4 = Static147.method2698(new Class72[] { Static568.method8021("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass9_Sub2_39) }, super.aClass9_Sub2_39);
		this.aClass200_7 = Static147.method2698(new Class72[] { Static568.method8021("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n", 35632, super.aClass9_Sub2_39) }, super.aClass9_Sub2_39);
		this.aClass200_5 = Static147.method2698(new Class72[] { Static568.method8021("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n", 35632, super.aClass9_Sub2_39) }, super.aClass9_Sub2_39);
		this.aClass200_6 = Static147.method2698(new Class72[] { Static568.method8021("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", 35632, super.aClass9_Sub2_39) }, super.aClass9_Sub2_39);
		return this.aClass200_7 != null && this.aClass200_4 != null && this.aClass200_5 != null && this.aClass200_6 != null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!kp;ILclient!kp;I)V")
	@Override
	public void method7848(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, (double) 1, -1.0D, 1.0D);
		@Pc(47) long local47;
		if (this.aClass132_Sub1Array4 == null) {
			super.aClass9_Sub2_39.method814(arg0);
			super.aClass9_Sub2_39.method821(this.aClass89_5);
			this.aClass89_5.method2376(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local47 = this.aClass200_4.aLong136;
			OpenGL.glUseProgramObjectARB(local47);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "params"), Static293.aFloat121, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt9407, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt9407, (float) this.anInt9403);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt9403);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			super.aClass9_Sub2_39.method821(this.aClass89_6);
			@Pc(109) int local109 = Static479.method7316(this.anInt9407);
			@Pc(114) int local114 = Static479.method7316(this.anInt9403);
			@Pc(116) int local116 = 0;
			while (local109 > 256 || local114 > 256) {
				OpenGL.glViewport(0, 0, local109, local114);
				this.aClass89_6.method2378(0, this.aClass132_Sub1Array4[local116]);
				if (local109 > 256) {
					local109 >>= 0x1;
				}
				if (local114 > 256) {
					local114 >>= 0x1;
				}
				if (local116 == 0) {
					super.aClass9_Sub2_39.method814(arg0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.anInt9407, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.anInt9407, (float) this.anInt9403);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9403);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					super.aClass9_Sub2_39.method814(this.aClass132_Sub1Array4[local116 - 1]);
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
				local116++;
			}
			super.aClass9_Sub2_39.method767(this.aClass89_6);
			super.aClass9_Sub2_39.method814(this.aClass132_Sub1Array4[local116 - 1]);
			super.aClass9_Sub2_39.method821(this.aClass89_5);
			this.aClass89_5.method2376(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(272) long local272 = this.aClass200_7.aLong136;
			OpenGL.glUseProgramObjectARB(local272);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local272, "sceneTex"), 0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local272, "params"), Static293.aFloat121, 0.0F, 0.0F);
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
		this.aClass89_5.method2376(1);
		super.aClass9_Sub2_39.method814(this.aClass132_Sub1_5);
		local47 = this.aClass200_6.aLong136;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "baseTex"), 0);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.aClass89_5.method2376(0);
		super.aClass9_Sub2_39.method814(this.aClass132_Sub1_4);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "step"), 0.0F, 0.00390625F, 0.0F);
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
		super.aClass9_Sub2_39.method767(this.aClass89_5);
		@Pc(428) long local428 = this.aClass200_5.aLong136;
		OpenGL.glUseProgramObjectARB(local428);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local428, "sceneTex"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local428, "bloomTex"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local428, "params"), Static571.aFloat196, Static539.aFloat193, 0.0F);
		super.aClass9_Sub2_39.method806(1);
		super.aClass9_Sub2_39.method814(this.aClass132_Sub1_5);
		super.aClass9_Sub2_39.method806(0);
		super.aClass9_Sub2_39.method814(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	@Override
	public void method7845(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgramObjectARB(0L);
		super.aClass9_Sub2_39.method806(1);
		super.aClass9_Sub2_39.method814(null);
		super.aClass9_Sub2_39.method806(0);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V")
	@Override
	public void method7852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9403 = arg1;
		this.anInt9407 = arg0;
		@Pc(24) int local24 = Static479.method7316(this.anInt9407);
		@Pc(29) int local29 = Static479.method7316(this.anInt9403);
		if (this.anInt9397 == local24 && this.anInt9409 == local29) {
			return;
		}
		@Pc(50) int local50;
		if (this.aClass132_Sub1Array4 != null) {
			for (local50 = 0; local50 < this.aClass132_Sub1Array4.length; local50++) {
				this.aClass132_Sub1Array4[local50].method5609();
			}
			this.aClass132_Sub1Array4 = null;
		}
		if (local24 <= 256 && local29 <= 256) {
			this.aClass89_6 = null;
		} else {
			local50 = local24;
			@Pc(77) int local77 = local29;
			@Pc(79) int local79 = 0;
			label57: while (true) {
				if (local50 <= 256 && local77 <= 256) {
					if (this.aClass89_6 == null) {
						this.aClass89_6 = new Class89(super.aClass9_Sub2_39);
					}
					local50 = local24;
					local77 = local29;
					this.aClass132_Sub1Array4 = new Class132_Sub1[local79];
					local79 = 0;
					while (true) {
						if (local50 <= 256 && local77 <= 256) {
							break label57;
						}
						this.aClass132_Sub1Array4[local79++] = new Class132_Sub1(super.aClass9_Sub2_39, 3553, 34842, local50, local77);
						if (local77 > 256) {
							local77 >>= 0x1;
						}
						if (local50 > 256) {
							local50 >>= 0x1;
						}
					}
				}
				if (local77 > 256) {
					local77 >>= 0x1;
				}
				local79++;
				if (local50 > 256) {
					local50 >>= 0x1;
				}
			}
		}
		this.anInt9397 = local24;
		this.anInt9409 = local29;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)Z")
	public boolean method7859() {
		return super.aClass9_Sub2_39.aBoolean70 && super.aClass9_Sub2_39.aBoolean47 && super.aClass9_Sub2_39.aBoolean56;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	@Override
	public void method7849() {
		this.aClass132_Sub1Array4 = null;
		this.aClass89_5 = null;
		this.aClass200_4 = null;
		this.aClass200_6 = null;
		this.aClass200_5 = null;
		this.aClass132_Sub1_4 = null;
		this.aClass132_Sub1_5 = null;
		this.aClass200_7 = null;
		this.aClass89_6 = null;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)I")
	@Override
	public int method7850() {
		return 1;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7854() {
		return this.aClass89_5 != null;
	}
}
