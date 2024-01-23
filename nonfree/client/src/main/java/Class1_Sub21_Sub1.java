import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub21_Sub1 extends Class1_Sub21 {

	@OriginalMember(owner = "client!uj", name = "D", descriptor = "Lclient!wd;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!uj", name = "E", descriptor = "Lclient!wd;")
	private Class190 aClass190_2;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "Lclient!wd;")
	private Class190 aClass190_3;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "Lclient!wd;")
	private Class190 aClass190_4;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	private int anInt5704 = -1;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	private int anInt5705 = -1;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
	private int anInt5706 = -1;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	private int anInt5707 = Static201.anInt4377;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
	private int anInt5708 = -1;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()I")
	@Override
	public int method4328() {
		return 1;
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)V")
	@Override
	public void method4332(@OriginalArg(0) int arg0) {
		Static294.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "()Z")
	@Override
	public boolean method4331() {
		if (!Static294.aBoolean366 || !Static294.aBoolean378 || !Static294.aBoolean368) {
			return false;
		}
		@Pc(7) GL local7 = Static294.aGL1;
		this.anInt5708 = Static164.method2588();
		this.anInt5705 = Static201.method3211(Static201.anInt4366, Static201.anInt4372, 256, 256, Static201.anInt4377, Static201.anInt4377, Static201.anInt4369, Static201.anInt4380, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt5706 = Static201.method3211(Static201.anInt4366, Static201.anInt4372, 256, 256, Static201.anInt4377, Static201.anInt4377, Static201.anInt4369, Static201.anInt4380, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static164.method2593(this.anInt5708);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt5705, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt5706, 0);
		local7.glDrawBuffer(36064);
		if (!Static164.method2589()) {
			this.anInt5707 = Static201.anInt4378;
			Static294.method4486(this.anInt5705);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static294.method4486(this.anInt5706);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static164.method2589()) {
				Static164.method2585();
				return false;
			}
		}
		Static164.method2585();
		this.aClass190_1 = Static307.method4662(new Class175[] { Static285.method4386("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static285.anInt5732) });
		this.aClass190_3 = Static307.method4662(new Class175[] { Static285.method4386("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static285.anInt5732) });
		this.aClass190_4 = Static307.method4662(new Class175[] { Static285.method4386("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static285.anInt5732) });
		this.aClass190_2 = Static307.method4662(new Class175[] { Static285.method4386("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static285.anInt5732) });
		return this.aClass190_3 != null && this.aClass190_1 != null && this.aClass190_4 != null && this.aClass190_2 != null;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
	@Override
	public void method4329() {
		if (this.anIntArray513 != null) {
			Static294.aGL1.glDeleteTextures(this.anIntArray513.length, this.anIntArray513, 0);
			this.anIntArray513 = null;
		}
		if (this.anInt5704 != -1) {
			Static164.method2583(this.anInt5704);
			this.anInt5704 = -1;
		}
		if (this.anInt5708 != -1) {
			Static164.method2583(this.anInt5708);
			this.anInt5708 = -1;
		}
		if (this.anInt5705 != -1) {
			Static201.method3210(this.anInt5705);
			this.anInt5705 = -1;
		}
		if (this.anInt5706 != -1) {
			Static201.method3210(this.anInt5706);
			this.anInt5706 = -1;
		}
		this.aClass190_1 = null;
		this.aClass190_3 = null;
		this.aClass190_4 = null;
		this.aClass190_2 = null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray513 == null) {
			local1.glBindTexture(34037, arg3);
			Static164.method2593(this.anInt5708);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass190_1.anInt6078;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static284.aFloat54, 0.0F, 0.0F);
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
			Static164.method2593(this.anInt5704);
			local29 = Static151.method2450(arg1);
			local33 = Static151.method2450(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray513[local35], 0);
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
					Static294.method4486(this.anIntArray513[local35 - 1]);
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
			Static164.method2585();
			Static294.method4486(this.anIntArray513[local35 - 1]);
			Static164.method2593(this.anInt5708);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass190_3.anInt6078;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static284.aFloat54, 0.0F, 0.0F);
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
		Static294.method4486(this.anInt5705);
		local29 = this.aClass190_2.anInt6078;
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
		Static294.method4486(this.anInt5706);
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
		Static164.method2585();
		local33 = this.aClass190_4.anInt6078;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static284.aFloat55, Static284.aFloat56, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt5705);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	@Override
	public void method4322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static294.aGL1;
		@Pc(5) int local5 = Static151.method2450(arg0);
		@Pc(9) int local9 = Static151.method2450(arg1);
		if (this.anIntArray513 != null) {
			local1.glDeleteTextures(this.anIntArray513.length, this.anIntArray513, 0);
			this.anIntArray513 = null;
		}
		if (this.anInt5707 == Static201.anInt4377 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt5704 == -1) {
				this.anInt5704 = Static164.method2588();
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
			this.anIntArray513 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray513[local39++] = Static201.method3211(Static201.anInt4366, Static201.anInt4372, local35, local37, Static201.anInt4377, Static201.anInt4377, Static201.anInt4369, Static201.anInt4380, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt5704 != -1) {
			Static164.method2583(this.anInt5704);
			this.anInt5704 = -1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "()Z")
	@Override
	public boolean method4330() {
		return this.anInt5708 != -1;
	}
}
