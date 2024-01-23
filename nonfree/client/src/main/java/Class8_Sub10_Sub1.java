import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class8_Sub10_Sub1 extends Class8_Sub10 {

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Lclient!la;")
	private Class99 aClass99_1;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "Lclient!la;")
	private Class99 aClass99_2;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "Lclient!la;")
	private Class99 aClass99_3;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "Lclient!la;")
	private Class99 aClass99_4;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	private int anInt1766 = Static287.anInt5648;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt1767 = -1;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private int anInt1768 = -1;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
	private int anInt1770 = -1;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	private int anInt1769 = -1;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	public void method1338(@OriginalArg(0) int arg0) {
		Static116.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()Z")
	@Override
	public boolean method1336() {
		if (!Static116.aBoolean201 || !Static116.aBoolean186 || !Static116.aBoolean193) {
			return false;
		}
		@Pc(7) GL local7 = Static116.aGL1;
		this.anInt1769 = Static251.method3766();
		this.anInt1768 = Static287.method4256(Static287.anInt5637, Static287.anInt5643, 256, 256, Static287.anInt5648, Static287.anInt5648, Static287.anInt5640, Static287.anInt5651, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt1767 = Static287.method4256(Static287.anInt5637, Static287.anInt5643, 256, 256, Static287.anInt5648, Static287.anInt5648, Static287.anInt5640, Static287.anInt5651, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static251.method3769(this.anInt1769);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt1768, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt1767, 0);
		local7.glDrawBuffer(36064);
		if (!Static251.method3764()) {
			this.anInt1766 = Static287.anInt5649;
			Static116.method1897(this.anInt1768);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static116.method1897(this.anInt1767);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static251.method3764()) {
				Static251.method3770();
				return false;
			}
		}
		Static251.method3770();
		this.aClass99_2 = Static143.method2266(new Class1[] { Static1.method1("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static1.anInt1) });
		this.aClass99_1 = Static143.method2266(new Class1[] { Static1.method1("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static1.anInt1) });
		this.aClass99_4 = Static143.method2266(new Class1[] { Static1.method1("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static1.anInt1) });
		this.aClass99_3 = Static143.method2266(new Class1[] { Static1.method1("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static1.anInt1) });
		return this.aClass99_1 != null && this.aClass99_2 != null && this.aClass99_4 != null && this.aClass99_3 != null;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()Z")
	@Override
	public boolean method1333() {
		return this.anInt1769 != -1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	@Override
	public void method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(5) int local5 = Static125.method1987(arg0);
		@Pc(9) int local9 = Static125.method1987(arg1);
		if (this.anIntArray120 != null) {
			local1.glDeleteTextures(this.anIntArray120.length, this.anIntArray120, 0);
			this.anIntArray120 = null;
		}
		if (this.anInt1766 == Static287.anInt5648 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt1770 == -1) {
				this.anInt1770 = Static251.method3766();
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
			this.anIntArray120 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray120[local39++] = Static287.method4256(Static287.anInt5637, Static287.anInt5643, local35, local37, Static287.anInt5648, Static287.anInt5648, Static287.anInt5640, Static287.anInt5651, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt1770 != -1) {
			Static251.method3774(this.anInt1770);
			this.anInt1770 = -1;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
	@Override
	public void method1322() {
		if (this.anIntArray120 != null) {
			Static116.aGL1.glDeleteTextures(this.anIntArray120.length, this.anIntArray120, 0);
			this.anIntArray120 = null;
		}
		if (this.anInt1770 != -1) {
			Static251.method3774(this.anInt1770);
			this.anInt1770 = -1;
		}
		if (this.anInt1769 != -1) {
			Static251.method3774(this.anInt1769);
			this.anInt1769 = -1;
		}
		if (this.anInt1768 != -1) {
			Static287.method4255(this.anInt1768);
			this.anInt1768 = -1;
		}
		if (this.anInt1767 != -1) {
			Static287.method4255(this.anInt1767);
			this.anInt1767 = -1;
		}
		this.aClass99_2 = null;
		this.aClass99_1 = null;
		this.aClass99_4 = null;
		this.aClass99_3 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()I")
	@Override
	public int method1321() {
		return 1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray120 == null) {
			local1.glBindTexture(34037, arg3);
			Static251.method3769(this.anInt1769);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass99_2.anInt2834;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static80.aFloat17, 0.0F, 0.0F);
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
			Static251.method3769(this.anInt1770);
			local29 = Static125.method1987(arg1);
			local33 = Static125.method1987(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray120[local35], 0);
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
					Static116.method1897(this.anIntArray120[local35 - 1]);
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
			Static251.method3770();
			Static116.method1897(this.anIntArray120[local35 - 1]);
			Static251.method3769(this.anInt1769);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass99_1.anInt2834;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static80.aFloat17, 0.0F, 0.0F);
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
		Static116.method1897(this.anInt1768);
		local29 = this.aClass99_3.anInt2834;
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
		Static116.method1897(this.anInt1767);
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
		Static251.method3770();
		local33 = this.aClass99_4.anInt2834;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static80.aFloat19, Static80.aFloat18, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt1768);
		local1.glActiveTexture(33984);
	}
}
