import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "Lclient!jd;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Lclient!jd;")
	private Class82 aClass82_2;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Lclient!jd;")
	private Class82 aClass82_3;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "Lclient!jd;")
	private Class82 aClass82_4;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	private int anInt1153 = -1;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt1154 = -1;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt1155 = -1;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt1156 = Static121.anInt2522;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt1157 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()I")
	@Override
	public int method1087() {
		return 1;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z")
	@Override
	public boolean method1095() {
		if (!Static156.aBoolean194 || !Static156.aBoolean207 || !Static156.aBoolean202) {
			return false;
		}
		@Pc(7) GL local7 = Static156.aGL1;
		this.anInt1154 = Static14.method185();
		this.anInt1157 = Static121.method2155(Static121.anInt2511, Static121.anInt2517, 256, 256, Static121.anInt2522, Static121.anInt2522, Static121.anInt2514, Static121.anInt2525, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt1153 = Static121.method2155(Static121.anInt2511, Static121.anInt2517, 256, 256, Static121.anInt2522, Static121.anInt2522, Static121.anInt2514, Static121.anInt2525, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static14.method190(this.anInt1154);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt1157, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt1153, 0);
		local7.glDrawBuffer(36064);
		if (!Static14.method188()) {
			this.anInt1156 = Static121.anInt2523;
			Static156.method2699(this.anInt1157);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static156.method2699(this.anInt1153);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static14.method188()) {
				Static14.method193();
				return false;
			}
		}
		Static14.method193();
		this.aClass82_2 = Static128.method2227(new Class62[] { Static99.method1808("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static99.anInt2011) });
		this.aClass82_1 = Static128.method2227(new Class62[] { Static99.method1808("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static99.anInt2011) });
		this.aClass82_4 = Static128.method2227(new Class62[] { Static99.method1808("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static99.anInt2011) });
		this.aClass82_3 = Static128.method2227(new Class62[] { Static99.method1808("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static99.anInt2011) });
		return this.aClass82_1 != null && this.aClass82_2 != null && this.aClass82_4 != null && this.aClass82_3 != null;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()Z")
	@Override
	public boolean method1101() {
		return this.anInt1154 != -1;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
	@Override
	public void method1090() {
		if (this.anIntArray109 != null) {
			Static156.aGL1.glDeleteTextures(this.anIntArray109.length, this.anIntArray109, 0);
			this.anIntArray109 = null;
		}
		if (this.anInt1155 != -1) {
			Static14.method186(this.anInt1155);
			this.anInt1155 = -1;
		}
		if (this.anInt1154 != -1) {
			Static14.method186(this.anInt1154);
			this.anInt1154 = -1;
		}
		if (this.anInt1157 != -1) {
			Static121.method2157(this.anInt1157);
			this.anInt1157 = -1;
		}
		if (this.anInt1153 != -1) {
			Static121.method2157(this.anInt1153);
			this.anInt1153 = -1;
		}
		this.aClass82_2 = null;
		this.aClass82_1 = null;
		this.aClass82_4 = null;
		this.aClass82_3 = null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	@Override
	public void method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(5) int local5 = Static27.method458(arg0);
		@Pc(9) int local9 = Static27.method458(arg1);
		if (this.anIntArray109 != null) {
			local1.glDeleteTextures(this.anIntArray109.length, this.anIntArray109, 0);
			this.anIntArray109 = null;
		}
		if (this.anInt1156 == Static121.anInt2522 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt1155 == -1) {
				this.anInt1155 = Static14.method185();
			}
			while (local35 > 256 || local37 > 256) {
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
				local39++;
			}
			this.anIntArray109 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray109[local39++] = Static121.method2155(Static121.anInt2511, Static121.anInt2517, local35, local37, Static121.anInt2522, Static121.anInt2522, Static121.anInt2514, Static121.anInt2525, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt1155 != -1) {
			Static14.method186(this.anInt1155);
			this.anInt1155 = -1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method1097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray109 == null) {
			local1.glBindTexture(34037, arg3);
			Static14.method190(this.anInt1154);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass82_2.anInt2582;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static59.aFloat39, 0.0F, 0.0F);
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
			Static14.method190(this.anInt1155);
			local29 = Static27.method458(arg1);
			local33 = Static27.method458(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray109[local35], 0);
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
					Static156.method2699(this.anIntArray109[local35 - 1]);
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
				if (local29 > 256) {
					local29 >>= 0x1;
				}
				if (local33 > 256) {
					local33 >>= 0x1;
				}
				local35++;
			}
			Static14.method193();
			Static156.method2699(this.anIntArray109[local35 - 1]);
			Static14.method190(this.anInt1154);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass82_1.anInt2582;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static59.aFloat39, 0.0F, 0.0F);
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
		Static156.method2699(this.anInt1157);
		local29 = this.aClass82_3.anInt2582;
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
		Static156.method2699(this.anInt1153);
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
		Static14.method193();
		local33 = this.aClass82_4.anInt2582;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static59.aFloat38, Static59.aFloat40, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt1157);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	public void method1089(@OriginalArg(0) int arg0) {
		Static156.aGL1.glUseProgramObjectARB(0);
	}
}
