import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub19_Sub1 extends Class4_Sub19 {

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "Lclient!jj;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "Lclient!jj;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "Lclient!jj;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "Lclient!jj;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	private int anInt2605 = -1;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
	private int anInt2606 = -1;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	private int anInt2607 = -1;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	private int anInt2608 = -1;

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
	private int anInt2609 = Static206.anInt4064;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray221 == null) {
			local1.glBindTexture(34037, arg3);
			Static196.method3194(this.anInt2607);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass84_3.anInt2610;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static129.aFloat79, 0.0F, 0.0F);
			local1.glBegin(7);
			local1.glTexCoord2f(0.0F, 0.0F);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2f((float) arg1, 0.0F);
			local1.glVertex2i(1, 0);
			local1.glTexCoord2f((float) arg1, (float) arg2);
			local1.glVertex2i(1, 1);
			local1.glTexCoord2f(0.0F, (float) arg2);
			local1.glVertex2i(0, 1);
			local1.glEnd();
		} else {
			Static196.method3194(this.anInt2605);
			local29 = Static70.method1196(arg1);
			local33 = Static70.method1196(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray221[local35], 0);
				if (local35 == 0) {
					local1.glEnable(34037);
					local1.glBindTexture(34037, arg3);
					local1.glBegin(7);
					local1.glTexCoord2f(0.0F, 0.0F);
					local1.glVertex2i(0, 0);
					local1.glTexCoord2f((float) arg1, 0.0F);
					local1.glVertex2i(1, 0);
					local1.glTexCoord2f((float) arg1, (float) arg2);
					local1.glVertex2i(1, 1);
					local1.glTexCoord2f(0.0F, (float) arg2);
					local1.glVertex2i(0, 1);
					local1.glEnd();
					local1.glDisable(34037);
				} else {
					Static251.method3892(this.anIntArray221[local35 - 1]);
					local1.glBegin(7);
					local1.glTexCoord2f(0.0F, 0.0F);
					local1.glVertex2i(0, 0);
					local1.glTexCoord2f(1.0F, 0.0F);
					local1.glVertex2i(1, 0);
					local1.glTexCoord2f(1.0F, 1.0F);
					local1.glVertex2i(1, 1);
					local1.glTexCoord2f(0.0F, 1.0F);
					local1.glVertex2i(0, 1);
					local1.glEnd();
				}
				if (local29 != 256) {
					local29 >>= 0x1;
				}
				if (local33 != 256) {
					local33 >>= 0x1;
				}
				local35++;
			}
			Static196.method3189();
			Static251.method3892(this.anIntArray221[local35 - 1]);
			Static196.method3194(this.anInt2607);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass84_2.anInt2610;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static129.aFloat79, 0.0F, 0.0F);
			local1.glBegin(7);
			local1.glTexCoord2f(0.0F, 0.0F);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2f(1.0F, 0.0F);
			local1.glVertex2i(1, 0);
			local1.glTexCoord2f(1.0F, 1.0F);
			local1.glVertex2i(1, 1);
			local1.glTexCoord2f(0.0F, 1.0F);
			local1.glVertex2i(0, 1);
			local1.glEnd();
		}
		local1.glDrawBuffer(36065);
		Static251.method3892(this.anInt2606);
		local29 = this.aClass84_1.anInt2610;
		local1.glUseProgramObjectARB(local29);
		local1.glUniform1iARB(local1.glGetUniformLocation(local29, "baseTex"), 0);
		local1.glUniform3fARB(local1.glGetUniformLocation(local29, "step"), 0.00390625F, 0.0F, 0.0F);
		local1.glBegin(7);
		local1.glTexCoord2f(0.0F, 0.0F);
		local1.glVertex2i(0, 0);
		local1.glTexCoord2f(1.0F, 0.0F);
		local1.glVertex2i(1, 0);
		local1.glTexCoord2f(1.0F, 1.0F);
		local1.glVertex2i(1, 1);
		local1.glTexCoord2f(0.0F, 1.0F);
		local1.glVertex2i(0, 1);
		local1.glEnd();
		local1.glDrawBuffer(36064);
		Static251.method3892(this.anInt2608);
		local1.glUniform3fARB(local1.glGetUniformLocation(local29, "step"), 0.0F, 0.00390625F, 0.0F);
		local1.glBegin(7);
		local1.glTexCoord2f(0.0F, 0.0F);
		local1.glVertex2i(0, 0);
		local1.glTexCoord2f(1.0F, 0.0F);
		local1.glVertex2i(1, 0);
		local1.glTexCoord2f(1.0F, 1.0F);
		local1.glVertex2i(1, 1);
		local1.glTexCoord2f(0.0F, 1.0F);
		local1.glVertex2i(0, 1);
		local1.glEnd();
		local1.glPopAttrib();
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		Static196.method3189();
		local33 = this.aClass84_4.anInt2610;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static129.aFloat78, Static129.aFloat80, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt2606);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
	@Override
	public int method2132() {
		return 1;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "()Z")
	@Override
	public boolean method2130() {
		return this.anInt2607 != -1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	@Override
	public void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static251.aGL1;
		@Pc(5) int local5 = Static70.method1196(arg0);
		@Pc(9) int local9 = Static70.method1196(arg1);
		if (this.anIntArray221 != null) {
			local1.glDeleteTextures(this.anIntArray221.length, this.anIntArray221, 0);
			this.anIntArray221 = null;
		}
		if (this.anInt2609 == Static206.anInt4064 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt2605 == -1) {
				this.anInt2605 = Static196.method3186();
			}
			while (local35 != 256 || local37 != 256) {
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
				local39++;
			}
			this.anIntArray221 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray221[local39++] = Static206.method3274(Static206.anInt4053, Static206.anInt4059, local35, local37, Static206.anInt4064, Static206.anInt4064, Static206.anInt4056, Static206.anInt4067, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt2605 != -1) {
			Static196.method3185(this.anInt2605);
			this.anInt2605 = -1;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	@Override
	public void method2125(@OriginalArg(0) int arg0) {
		Static251.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	@Override
	public void method2127() {
		if (this.anIntArray221 != null) {
			Static251.aGL1.glDeleteTextures(this.anIntArray221.length, this.anIntArray221, 0);
			this.anIntArray221 = null;
		}
		if (this.anInt2605 != -1) {
			Static196.method3185(this.anInt2605);
			this.anInt2605 = -1;
		}
		if (this.anInt2607 != -1) {
			Static196.method3185(this.anInt2607);
			this.anInt2607 = -1;
		}
		if (this.anInt2606 != -1) {
			Static206.method3276(this.anInt2606);
			this.anInt2606 = -1;
		}
		if (this.anInt2608 != -1) {
			Static206.method3276(this.anInt2608);
			this.anInt2608 = -1;
		}
		this.aClass84_3 = null;
		this.aClass84_2 = null;
		this.aClass84_4 = null;
		this.aClass84_1 = null;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()Z")
	@Override
	public boolean method2140() {
		if (!Static251.aBoolean324 || !Static251.aBoolean323 || !Static251.aBoolean319) {
			return false;
		}
		@Pc(7) GL local7 = Static251.aGL1;
		this.anInt2607 = Static196.method3186();
		this.anInt2606 = Static206.method3274(Static206.anInt4053, Static206.anInt4059, 256, 256, Static206.anInt4064, Static206.anInt4064, Static206.anInt4056, Static206.anInt4067, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt2608 = Static206.method3274(Static206.anInt4053, Static206.anInt4059, 256, 256, Static206.anInt4064, Static206.anInt4064, Static206.anInt4056, Static206.anInt4067, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static196.method3194(this.anInt2607);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt2606, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt2608, 0);
		local7.glDrawBuffer(36064);
		if (!Static196.method3195()) {
			this.anInt2609 = Static206.anInt4065;
			Static251.method3892(this.anInt2606);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static251.method3892(this.anInt2608);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static196.method3195()) {
				Static196.method3189();
				return false;
			}
		}
		Static196.method3189();
		this.aClass84_3 = Static130.method2141(new Class41[] { Static62.method1151("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static62.anInt1361) });
		this.aClass84_2 = Static130.method2141(new Class41[] { Static62.method1151("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static62.anInt1361) });
		this.aClass84_4 = Static130.method2141(new Class41[] { Static62.method1151("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static62.anInt1361) });
		this.aClass84_1 = Static130.method2141(new Class41[] { Static62.method1151("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static62.anInt1361) });
		return this.aClass84_2 != null && this.aClass84_3 != null && this.aClass84_4 != null && this.aClass84_1 != null;
	}
}
