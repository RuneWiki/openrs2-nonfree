import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!qb;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Lclient!qb;")
	private Class134 aClass134_2;

	@OriginalMember(owner = "client!qg", name = "M", descriptor = "Lclient!qb;")
	private Class134 aClass134_3;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "Lclient!qb;")
	private Class134 aClass134_4;

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
	private int anInt4248 = -1;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
	private int anInt4250 = -1;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
	private int anInt4251 = -1;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
	private int anInt4249 = Static37.anInt940;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
	private int anInt4252 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	@Override
	public void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(5) int local5 = Static215.method3400(arg0);
		@Pc(9) int local9 = Static215.method3400(arg1);
		if (this.anIntArray380 != null) {
			local1.glDeleteTextures(this.anIntArray380.length, this.anIntArray380, 0);
			this.anIntArray380 = null;
		}
		if (this.anInt4249 == Static37.anInt940 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt4252 == -1) {
				this.anInt4252 = Static206.method3308();
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
			this.anIntArray380 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray380[local39++] = Static37.method777(Static37.anInt929, Static37.anInt935, local35, local37, Static37.anInt940, Static37.anInt940, Static37.anInt932, Static37.anInt943, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt4252 != -1) {
			Static206.method3305(this.anInt4252);
			this.anInt4252 = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()Z")
	@Override
	public boolean method3378() {
		return this.anInt4250 != -1;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	@Override
	public int method3385() {
		return 1;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()Z")
	@Override
	public boolean method3389() {
		if (!Static277.aBoolean408 || !Static277.aBoolean404 || !Static277.aBoolean411) {
			return false;
		}
		@Pc(7) GL local7 = Static277.aGL1;
		this.anInt4250 = Static206.method3308();
		this.anInt4248 = Static37.method777(Static37.anInt929, Static37.anInt935, 256, 256, Static37.anInt940, Static37.anInt940, Static37.anInt932, Static37.anInt943, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt4251 = Static37.method777(Static37.anInt929, Static37.anInt935, 256, 256, Static37.anInt940, Static37.anInt940, Static37.anInt932, Static37.anInt943, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static206.method3301(this.anInt4250);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt4248, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt4251, 0);
		local7.glDrawBuffer(36064);
		if (!Static206.method3304()) {
			this.anInt4249 = Static37.anInt941;
			Static277.method4212(this.anInt4248);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static277.method4212(this.anInt4251);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static206.method3304()) {
				Static206.method3299();
				return false;
			}
		}
		Static206.method3299();
		this.aClass134_2 = Static208.method3314(new Class43[] { Static70.method1263("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static70.anInt1517) });
		this.aClass134_4 = Static208.method3314(new Class43[] { Static70.method1263("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static70.anInt1517) });
		this.aClass134_1 = Static208.method3314(new Class43[] { Static70.method1263("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static70.anInt1517) });
		this.aClass134_3 = Static208.method3314(new Class43[] { Static70.method1263("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static70.anInt1517) });
		return this.aClass134_4 != null && this.aClass134_2 != null && this.aClass134_1 != null && this.aClass134_3 != null;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
	@Override
	public void method3392() {
		if (this.anIntArray380 != null) {
			Static277.aGL1.glDeleteTextures(this.anIntArray380.length, this.anIntArray380, 0);
			this.anIntArray380 = null;
		}
		if (this.anInt4252 != -1) {
			Static206.method3305(this.anInt4252);
			this.anInt4252 = -1;
		}
		if (this.anInt4250 != -1) {
			Static206.method3305(this.anInt4250);
			this.anInt4250 = -1;
		}
		if (this.anInt4248 != -1) {
			Static37.method775(this.anInt4248);
			this.anInt4248 = -1;
		}
		if (this.anInt4251 != -1) {
			Static37.method775(this.anInt4251);
			this.anInt4251 = -1;
		}
		this.aClass134_2 = null;
		this.aClass134_4 = null;
		this.aClass134_1 = null;
		this.aClass134_3 = null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	@Override
	public void method3377(@OriginalArg(0) int arg0) {
		Static277.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray380 == null) {
			local1.glBindTexture(34037, arg3);
			Static206.method3301(this.anInt4250);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass134_2.anInt4168;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static213.aFloat39, 0.0F, 0.0F);
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
			Static206.method3301(this.anInt4252);
			local29 = Static215.method3400(arg1);
			local33 = Static215.method3400(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray380[local35], 0);
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
					Static277.method4212(this.anIntArray380[local35 - 1]);
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
			Static206.method3299();
			Static277.method4212(this.anIntArray380[local35 - 1]);
			Static206.method3301(this.anInt4250);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass134_4.anInt4168;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static213.aFloat39, 0.0F, 0.0F);
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
		Static277.method4212(this.anInt4248);
		local29 = this.aClass134_3.anInt4168;
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
		Static277.method4212(this.anInt4251);
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
		Static206.method3299();
		local33 = this.aClass134_1.anInt4168;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static213.aFloat40, Static213.aFloat38, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt4248);
		local1.glActiveTexture(33984);
	}
}
