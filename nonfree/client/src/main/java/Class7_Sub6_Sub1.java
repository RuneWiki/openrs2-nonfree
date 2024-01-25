import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class7_Sub6_Sub1 extends Class7_Sub6 {

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!oe;")
	private Class92_Sub4 aClass92_Sub4_1;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Lclient!ge;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Lclient!gm;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Lclient!ge;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "Lclient!oe;")
	private Class92_Sub4 aClass92_Sub4_2;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!gm;")
	private Class85 aClass85_2;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "[Lclient!oe;")
	private Class92_Sub4[] aClass92_Sub4Array3;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "Lclient!ge;")
	private Class81 aClass81_3;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "Lclient!ge;")
	private Class81 aClass81_4;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class7_Sub6_Sub1(@OriginalArg(0) Class89_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()Z")
	public boolean method866() {
		return this.aClass89_Sub1_8.aBoolean197 && this.aClass89_Sub1_8.aBoolean200 && this.aClass89_Sub1_8.aBoolean185;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
	@Override
	public void method860() {
		this.aClass85_1 = null;
		this.aClass92_Sub4Array3 = null;
		this.aClass85_2 = null;
		this.aClass92_Sub4_2 = null;
		this.aClass92_Sub4_1 = null;
		this.aClass81_1 = null;
		this.aClass81_4 = null;
		this.aClass81_3 = null;
		this.aClass81_2 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	@Override
	public void method864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1066 = arg0;
		this.anInt1067 = arg1;
		@Pc(10) int local10 = Static108.method1053(this.anInt1066);
		@Pc(15) int local15 = Static108.method1053(this.anInt1067);
		if (this.anInt1068 == local10 && this.anInt1069 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass92_Sub4Array3 != null) {
			for (local28 = 0; local28 < this.aClass92_Sub4Array3.length; local28++) {
				this.aClass92_Sub4Array3[local28].method3519();
			}
			this.aClass92_Sub4Array3 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass85_1 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass85_1 == null) {
						this.aClass85_1 = new Class85(this.aClass89_Sub1_8);
					}
					this.aClass92_Sub4Array3 = new Class92_Sub4[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass92_Sub4Array3[local55++] = new Class92_Sub4(this.aClass89_Sub1_8, 3553, 34842, local28, local53);
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
		this.anInt1068 = local10;
		this.anInt1069 = local15;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!oe;Lclient!oe;)V")
	@Override
	public void method865(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub4 arg1, @OriginalArg(2) Class92_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_8.anOpengl2;
		local3.glPushAttrib(2048);
		local3.glMatrixMode(5889);
		local3.glPushMatrix();
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(34) int local34;
		@Pc(39) int local39;
		if (this.aClass92_Sub4Array3 == null) {
			this.aClass89_Sub1_8.method2445(arg1);
			this.aClass89_Sub1_8.method2468(this.aClass85_2);
			this.aClass85_2.method2071(0);
			local3.glViewport(0, 0, 256, 256);
			local34 = this.aClass81_1.anInt2398;
			local3.glUseProgramObjectARB(local34);
			local3.glUniform1iARB(local3.glGetUniformLocation(local34, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local34, "params"), Static39.aFloat12, 0.0F, 0.0F);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(0, 0);
			local3.glTexCoord2f((float) this.anInt1066, 0.0F);
			local3.glVertex2i(1, 0);
			local3.glTexCoord2f((float) this.anInt1066, (float) this.anInt1067);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, (float) this.anInt1067);
			local3.glVertex2i(0, 1);
			local3.glEnd();
		} else {
			this.aClass89_Sub1_8.method2468(this.aClass85_1);
			local34 = Static108.method1053(this.anInt1066);
			local39 = Static108.method1053(this.anInt1067);
			@Pc(41) int local41 = 0;
			while (local34 > 256 || local39 > 256) {
				local3.glViewport(0, 0, local34, local39);
				this.aClass85_1.method2074(0, this.aClass92_Sub4Array3[local41]);
				if (local41 == 0) {
					this.aClass89_Sub1_8.method2445(arg1);
					local3.glBegin(7);
					local3.glTexCoord2f(0.0F, 0.0F);
					local3.glVertex2i(0, 0);
					local3.glTexCoord2f((float) this.anInt1066, 0.0F);
					local3.glVertex2i(1, 0);
					local3.glTexCoord2f((float) this.anInt1066, (float) this.anInt1067);
					local3.glVertex2i(1, 1);
					local3.glTexCoord2f(0.0F, (float) this.anInt1067);
					local3.glVertex2i(0, 1);
					local3.glEnd();
				} else {
					this.aClass89_Sub1_8.method2445(this.aClass92_Sub4Array3[local41 - 1]);
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
			this.aClass89_Sub1_8.method2447(this.aClass85_1);
			this.aClass89_Sub1_8.method2445(this.aClass92_Sub4Array3[local41 - 1]);
			this.aClass89_Sub1_8.method2468(this.aClass85_2);
			this.aClass85_2.method2071(0);
			local3.glViewport(0, 0, 256, 256);
			@Pc(208) int local208 = this.aClass81_4.anInt2398;
			local3.glUseProgramObjectARB(local208);
			local3.glUniform1iARB(local3.glGetUniformLocation(local208, "sceneTex"), 0);
			local3.glUniform3fARB(local3.glGetUniformLocation(local208, "params"), Static39.aFloat12, 0.0F, 0.0F);
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
		this.aClass85_2.method2071(1);
		this.aClass89_Sub1_8.method2445(this.aClass92_Sub4_2);
		local34 = this.aClass81_2.anInt2398;
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
		this.aClass85_2.method2071(0);
		this.aClass89_Sub1_8.method2445(this.aClass92_Sub4_1);
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
		this.aClass89_Sub1_8.method2447(this.aClass85_2);
		local39 = this.aClass81_3.anInt2398;
		local3.glUseProgramObjectARB(local39);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "sceneTex"), 0);
		local3.glUniform1iARB(local3.glGetUniformLocation(local39, "bloomTex"), 1);
		local3.glUniform3fARB(local3.glGetUniformLocation(local39, "params"), Static39.aFloat10, Static39.aFloat11, 0.0F);
		this.aClass89_Sub1_8.method2433(1);
		this.aClass89_Sub1_8.method2445(this.aClass92_Sub4_2);
		this.aClass89_Sub1_8.method2433(0);
		this.aClass89_Sub1_8.method2445(arg1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()Z")
	@Override
	public boolean method857() {
		if (!this.aClass89_Sub1_8.aBoolean197 || !this.aClass89_Sub1_8.aBoolean200 || !this.aClass89_Sub1_8.aBoolean185) {
			return false;
		}
		this.aClass85_2 = new Class85(this.aClass89_Sub1_8);
		this.aClass92_Sub4_2 = new Class92_Sub4(this.aClass89_Sub1_8, 3553, 34842, 256, 256);
		this.aClass92_Sub4_2.method3530(false, false);
		this.aClass92_Sub4_1 = new Class92_Sub4(this.aClass89_Sub1_8, 3553, 34842, 256, 256);
		this.aClass92_Sub4_1.method3530(false, false);
		this.aClass89_Sub1_8.method2468(this.aClass85_2);
		this.aClass85_2.method2074(0, this.aClass92_Sub4_2);
		this.aClass85_2.method2074(1, this.aClass92_Sub4_1);
		this.aClass85_2.method2071(0);
		if (!this.aClass85_2.method2069()) {
			this.aClass89_Sub1_8.method2447(this.aClass85_2);
			return false;
		}
		this.aClass89_Sub1_8.method2447(this.aClass85_2);
		this.aClass81_1 = Static99.method1992(this.aClass89_Sub1_8, new Class132[] { Static190.method3449(this.aClass89_Sub1_8, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass81_4 = Static99.method1992(this.aClass89_Sub1_8, new Class132[] { Static190.method3449(this.aClass89_Sub1_8, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass81_3 = Static99.method1992(this.aClass89_Sub1_8, new Class132[] { Static190.method3449(this.aClass89_Sub1_8, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.aClass81_2 = Static99.method1992(this.aClass89_Sub1_8, new Class132[] { Static190.method3449(this.aClass89_Sub1_8, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass81_4 != null && this.aClass81_1 != null && this.aClass81_3 != null && this.aClass81_2 != null;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	@Override
	public int method858() {
		return 1;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	@Override
	public void method856(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_8.anOpengl2.glUseProgramObjectARB(0);
		this.aClass89_Sub1_8.method2433(1);
		this.aClass89_Sub1_8.method2445(null);
		this.aClass89_Sub1_8.method2433(0);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()Z")
	@Override
	public boolean method859() {
		return this.aClass85_2 != null;
	}
}
