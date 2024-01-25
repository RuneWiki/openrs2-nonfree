import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!ig;")
	private Class100 aClass100_1;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private int anInt6317;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!ig;")
	private Class100 aClass100_2;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	private int anInt6318;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ig;")
	private Class100 aClass100_3;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!bh;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!pq;")
	private Class81_Sub4 aClass81_Sub4_6;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!bh;")
	private Class23 aClass23_4;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
	private int anInt6319;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!pq;")
	private Class81_Sub4 aClass81_Sub4_7;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!ig;")
	private Class100 aClass100_4;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "[Lclient!pq;")
	private Class81_Sub4[] aClass81_Sub4Array4;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	private int anInt6320;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class2_Sub6_Sub1(@OriginalArg(0) Class37_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()V")
	@Override
	public void method5321() {
		this.aClass23_4 = null;
		this.aClass81_Sub4Array4 = null;
		this.aClass23_3 = null;
		this.aClass81_Sub4_7 = null;
		this.aClass81_Sub4_6 = null;
		this.aClass100_4 = null;
		this.aClass100_3 = null;
		this.aClass100_1 = null;
		this.aClass100_2 = null;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()Z")
	@Override
	public boolean method5325() {
		return this.aClass23_3 != null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
	@Override
	public int method5323() {
		return 1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!pq;Lclient!pq;)V")
	@Override
	public void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub4 arg1, @OriginalArg(2) Class81_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_39.anOpengl1;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass81_Sub4Array4 == null) {
			this.aClass37_Sub1_39.method767(arg1);
			this.aClass37_Sub1_39.method798(this.aClass23_3);
			this.aClass23_3.method351(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass100_4.anInt2912;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static322.aFloat74, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt6320, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt6320, (float) this.anInt6318);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt6318);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass37_Sub1_39.method798(this.aClass23_4);
			local34 = Static344.method5603(this.anInt6320);
			local39 = Static344.method5603(this.anInt6318);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass23_4.method346(0, this.aClass81_Sub4Array4[local41]);
				if (local41 == 0) {
					this.aClass37_Sub1_39.method767(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt6320, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt6320, (float) this.anInt6318);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt6318);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass37_Sub1_39.method767(this.aClass81_Sub4Array4[local41 - 1]);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f(1.0F, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f(1.0F, 1.0F);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, 1.0F);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				}
				if (local34 > 256) {
					local34 >>= 0x1;
				}
				if (local39 > 256) {
					local39 >>= 0x1;
				}
				local41++;
			}
			this.aClass37_Sub1_39.method782(this.aClass23_4);
			this.aClass37_Sub1_39.method767(this.aClass81_Sub4Array4[local41 - 1]);
			this.aClass37_Sub1_39.method798(this.aClass23_3);
			this.aClass23_3.method351(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass100_3.anInt2912;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static322.aFloat74, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		}
		this.aClass23_3.method351(1);
		this.aClass37_Sub1_39.method767(this.aClass81_Sub4_7);
		local34 = this.aClass100_2.anInt2912;
		local3.glUseProgramObjectARB(local34);
		local3.glUniform1iARB(local3.glGetUniformLocation(local34, "baseTex"), 0);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.00390625F, 0.0F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		this.aClass23_3.method351(0);
		this.aClass37_Sub1_39.method767(this.aClass81_Sub4_6);
		local3.glUniform3fARB(local3.glGetUniformLocation(local34, "step"), 0.0F, 0.00390625F, 0.0F);
		local3.glBegin(7);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(0, 0);
		local3.glTexCoord2f(1.0F, 0.0F);
		local3.glVertex2i(1, 0);
		local3.glTexCoord2f(1.0F, 1.0F);
		local3.glVertex2i(1, 1);
		local3.glTexCoord2f(0.0F, 1.0F);
		local3.glVertex2i(0, 1);
		local3.glEnd();
		local3.glPopAttrib();
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
		this.aClass37_Sub1_39.method782(this.aClass23_3);
		local39 = this.aClass100_1.anInt2912;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static322.aFloat75, Static322.aFloat76, 0.0F);
		this.aClass37_Sub1_39.method759(1);
		this.aClass37_Sub1_39.method767(this.aClass81_Sub4_7);
		this.aClass37_Sub1_39.method759(0);
		this.aClass37_Sub1_39.method767(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	@Override
	public void method5326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6320 = arg0;
		this.anInt6318 = arg1;
		@Pc(10) int local10 = Static344.method5603(this.anInt6320);
		@Pc(15) int local15 = Static344.method5603(this.anInt6318);
		if (this.anInt6319 == local10 && this.anInt6317 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass81_Sub4Array4 != null) {
			for (local28 = 0; local28 < this.aClass81_Sub4Array4.length; local28++) {
				this.aClass81_Sub4Array4[local28].method4738();
			}
			this.aClass81_Sub4Array4 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass23_4 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass23_4 == null) {
						this.aClass23_4 = new Class23(this.aClass37_Sub1_39);
					}
					this.aClass81_Sub4Array4 = new Class81_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass81_Sub4Array4[local55++] = new Class81_Sub4(this.aClass37_Sub1_39, 3553, 34842, local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt6319 = local10;
		this.anInt6317 = local15;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()Z")
	@Override
	public boolean method5327() {
		if (!this.aClass37_Sub1_39.aBoolean77 || !this.aClass37_Sub1_39.aBoolean59 || !this.aClass37_Sub1_39.aBoolean76) {
			return false;
		}
		this.aClass23_3 = new Class23(this.aClass37_Sub1_39);
		this.aClass81_Sub4_7 = new Class81_Sub4(this.aClass37_Sub1_39, 3553, 34842, 256, 256);
		this.aClass81_Sub4_7.method4745(false, false);
		this.aClass81_Sub4_6 = new Class81_Sub4(this.aClass37_Sub1_39, 3553, 34842, 256, 256);
		this.aClass81_Sub4_6.method4745(false, false);
		this.aClass37_Sub1_39.method798(this.aClass23_3);
		this.aClass23_3.method346(0, this.aClass81_Sub4_7);
		this.aClass23_3.method346(1, this.aClass81_Sub4_6);
		this.aClass23_3.method351(0);
		if (!this.aClass23_3.method344()) {
			this.aClass37_Sub1_39.method782(this.aClass23_3);
			return false;
		}
		this.aClass37_Sub1_39.method782(this.aClass23_3);
		this.aClass100_4 = Static136.method2630(this.aClass37_Sub1_39, new Class86[] { Static117.method2284(this.aClass37_Sub1_39, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_3 = Static136.method2630(this.aClass37_Sub1_39, new Class86[] { Static117.method2284(this.aClass37_Sub1_39, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass100_1 = Static136.method2630(this.aClass37_Sub1_39, new Class86[] { Static117.method2284(this.aClass37_Sub1_39, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass100_2 = Static136.method2630(this.aClass37_Sub1_39, new Class86[] { Static117.method2284(this.aClass37_Sub1_39, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass100_3 != null && this.aClass100_4 != null && this.aClass100_1 != null && this.aClass100_2 != null;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method5320(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_39.anOpengl1.glUseProgramObjectARB(0);
		this.aClass37_Sub1_39.method759(1);
		this.aClass37_Sub1_39.method767(null);
		this.aClass37_Sub1_39.method759(0);
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()Z")
	public boolean method5330() {
		return this.aClass37_Sub1_39.aBoolean77 && this.aClass37_Sub1_39.aBoolean59 && this.aClass37_Sub1_39.aBoolean76;
	}
}
