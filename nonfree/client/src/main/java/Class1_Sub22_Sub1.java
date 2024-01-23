import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!ce;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!ce;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "Lclient!ce;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!ce;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	private int anInt4708 = -1;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	private int anInt4709 = -1;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private int anInt4707 = Static297.anInt6227;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
	private int anInt4710 = -1;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	private int anInt4706 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()Z")
	@Override
	public boolean method3720() {
		return this.anInt4709 != -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray475 == null) {
			local1.glBindTexture(34037, arg3);
			Static17.method373(this.anInt4709);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass27_2.anInt801;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static211.aFloat154, 0.0F, 0.0F);
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
			Static17.method373(this.anInt4710);
			local29 = Static56.method1126(arg1);
			local33 = Static56.method1126(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray475[local35], 0);
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
					Static296.method4812(this.anIntArray475[local35 - 1]);
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
			Static17.method368();
			Static296.method4812(this.anIntArray475[local35 - 1]);
			Static17.method373(this.anInt4709);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass27_1.anInt801;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static211.aFloat154, 0.0F, 0.0F);
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
		Static296.method4812(this.anInt4706);
		local29 = this.aClass27_4.anInt801;
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
		Static296.method4812(this.anInt4708);
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
		Static17.method368();
		local33 = this.aClass27_3.anInt801;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static211.aFloat153, Static211.aFloat152, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt4706);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()Z")
	@Override
	public boolean method3731() {
		if (!Static296.aBoolean340 || !Static296.aBoolean337 || !Static296.aBoolean330) {
			return false;
		}
		@Pc(7) GL local7 = Static296.aGL1;
		this.anInt4709 = Static17.method365();
		this.anInt4706 = Static297.method4842(Static297.anInt6216, Static297.anInt6222, 256, 256, Static297.anInt6227, Static297.anInt6227, Static297.anInt6219, Static297.anInt6230, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt4708 = Static297.method4842(Static297.anInt6216, Static297.anInt6222, 256, 256, Static297.anInt6227, Static297.anInt6227, Static297.anInt6219, Static297.anInt6230, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static17.method373(this.anInt4709);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt4706, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt4708, 0);
		local7.glDrawBuffer(36064);
		if (!Static17.method367()) {
			this.anInt4707 = Static297.anInt6228;
			Static296.method4812(this.anInt4706);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static296.method4812(this.anInt4708);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static17.method367()) {
				Static17.method368();
				return false;
			}
		}
		Static17.method368();
		this.aClass27_2 = Static30.method658(new Class40[] { Static51.method1057("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static51.anInt1390) });
		this.aClass27_1 = Static30.method658(new Class40[] { Static51.method1057("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static51.anInt1390) });
		this.aClass27_3 = Static30.method658(new Class40[] { Static51.method1057("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static51.anInt1390) });
		this.aClass27_4 = Static30.method658(new Class40[] { Static51.method1057("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static51.anInt1390) });
		return this.aClass27_1 != null && this.aClass27_2 != null && this.aClass27_3 != null && this.aClass27_4 != null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
	@Override
	public int method3722() {
		return 1;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
	@Override
	public void method3725() {
		if (this.anIntArray475 != null) {
			Static296.aGL1.glDeleteTextures(this.anIntArray475.length, this.anIntArray475, 0);
			this.anIntArray475 = null;
		}
		if (this.anInt4710 != -1) {
			Static17.method372(this.anInt4710);
			this.anInt4710 = -1;
		}
		if (this.anInt4709 != -1) {
			Static17.method372(this.anInt4709);
			this.anInt4709 = -1;
		}
		if (this.anInt4706 != -1) {
			Static297.method4843(this.anInt4706);
			this.anInt4706 = -1;
		}
		if (this.anInt4708 != -1) {
			Static297.method4843(this.anInt4708);
			this.anInt4708 = -1;
		}
		this.aClass27_2 = null;
		this.aClass27_1 = null;
		this.aClass27_3 = null;
		this.aClass27_4 = null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	@Override
	public void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(5) int local5 = Static56.method1126(arg0);
		@Pc(9) int local9 = Static56.method1126(arg1);
		if (this.anIntArray475 != null) {
			local1.glDeleteTextures(this.anIntArray475.length, this.anIntArray475, 0);
			this.anIntArray475 = null;
		}
		if (this.anInt4707 == Static297.anInt6227 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt4710 == -1) {
				this.anInt4710 = Static17.method365();
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
			this.anIntArray475 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray475[local39++] = Static297.method4842(Static297.anInt6216, Static297.anInt6222, local35, local37, Static297.anInt6227, Static297.anInt6227, Static297.anInt6219, Static297.anInt6230, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt4710 != -1) {
			Static17.method372(this.anInt4710);
			this.anInt4710 = -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method3729(@OriginalArg(0) int arg0) {
		Static296.aGL1.glUseProgramObjectARB(0);
	}
}
