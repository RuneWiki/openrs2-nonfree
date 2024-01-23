import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class2_Sub21_Sub1 extends Class2_Sub21 {

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "Lclient!hi;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "Lclient!hi;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "Lclient!hi;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "Lclient!hi;")
	private Class72 aClass72_4;

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "[I")
	private int[] anIntArray596;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
	private int anInt6034 = -1;

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
	private int anInt6037 = -1;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
	private int anInt6036 = -1;

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	private int anInt6038 = Static298.anInt5779;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
	private int anInt6035 = -1;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray596 == null) {
			local1.glBindTexture(34037, arg3);
			Static240.method3841(this.anInt6037);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass72_3.anInt2491;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static313.aFloat57, 0.0F, 0.0F);
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
			Static240.method3841(this.anInt6034);
			local29 = Static295.method4523(arg1);
			local33 = Static295.method4523(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray596[local35], 0);
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
					Static116.method1945(this.anIntArray596[local35 - 1]);
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
			Static240.method3838();
			Static116.method1945(this.anIntArray596[local35 - 1]);
			Static240.method3841(this.anInt6037);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass72_4.anInt2491;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static313.aFloat57, 0.0F, 0.0F);
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
		Static116.method1945(this.anInt6035);
		local29 = this.aClass72_1.anInt2491;
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
		Static116.method1945(this.anInt6036);
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
		Static240.method3838();
		local33 = this.aClass72_2.anInt2491;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static313.aFloat58, Static313.aFloat56, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt6035);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()I")
	@Override
	public int method4726() {
		return 1;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
	@Override
	public void method4734() {
		if (this.anIntArray596 != null) {
			Static116.aGL1.glDeleteTextures(this.anIntArray596.length, this.anIntArray596, 0);
			this.anIntArray596 = null;
		}
		if (this.anInt6034 != -1) {
			Static240.method3837(this.anInt6034);
			this.anInt6034 = -1;
		}
		if (this.anInt6037 != -1) {
			Static240.method3837(this.anInt6037);
			this.anInt6037 = -1;
		}
		if (this.anInt6035 != -1) {
			Static298.method4556(this.anInt6035);
			this.anInt6035 = -1;
		}
		if (this.anInt6036 != -1) {
			Static298.method4556(this.anInt6036);
			this.anInt6036 = -1;
		}
		this.aClass72_3 = null;
		this.aClass72_4 = null;
		this.aClass72_2 = null;
		this.aClass72_1 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()Z")
	@Override
	public boolean method4722() {
		if (!Static116.aBoolean191 || !Static116.aBoolean176 || !Static116.aBoolean185) {
			return false;
		}
		@Pc(7) GL local7 = Static116.aGL1;
		this.anInt6037 = Static240.method3836();
		this.anInt6035 = Static298.method4554(Static298.anInt5768, Static298.anInt5774, 256, 256, Static298.anInt5779, Static298.anInt5779, Static298.anInt5771, Static298.anInt5782, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt6036 = Static298.method4554(Static298.anInt5768, Static298.anInt5774, 256, 256, Static298.anInt5779, Static298.anInt5779, Static298.anInt5771, Static298.anInt5782, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static240.method3841(this.anInt6037);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt6035, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt6036, 0);
		local7.glDrawBuffer(36064);
		if (!Static240.method3843()) {
			this.anInt6038 = Static298.anInt5780;
			Static116.method1945(this.anInt6035);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static116.method1945(this.anInt6036);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static240.method3843()) {
				Static240.method3838();
				return false;
			}
		}
		Static240.method3838();
		this.aClass72_3 = Static109.method1850(new Class38[] { Static62.method1174("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static62.anInt1531) });
		this.aClass72_4 = Static109.method1850(new Class38[] { Static62.method1174("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static62.anInt1531) });
		this.aClass72_2 = Static109.method1850(new Class38[] { Static62.method1174("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static62.anInt1531) });
		this.aClass72_1 = Static109.method1850(new Class38[] { Static62.method1174("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static62.anInt1531) });
		return this.aClass72_4 != null && this.aClass72_3 != null && this.aClass72_2 != null && this.aClass72_1 != null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	@Override
	public void method4736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(5) int local5 = Static295.method4523(arg0);
		@Pc(9) int local9 = Static295.method4523(arg1);
		if (this.anIntArray596 != null) {
			local1.glDeleteTextures(this.anIntArray596.length, this.anIntArray596, 0);
			this.anIntArray596 = null;
		}
		if (this.anInt6038 == Static298.anInt5779 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt6034 == -1) {
				this.anInt6034 = Static240.method3836();
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
			this.anIntArray596 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray596[local39++] = Static298.method4554(Static298.anInt5768, Static298.anInt5774, local35, local37, Static298.anInt5779, Static298.anInt5779, Static298.anInt5771, Static298.anInt5782, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt6034 != -1) {
			Static240.method3837(this.anInt6034);
			this.anInt6034 = -1;
		}
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)V")
	@Override
	public void method4739(@OriginalArg(0) int arg0) {
		Static116.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()Z")
	@Override
	public boolean method4731() {
		return this.anInt6037 != -1;
	}
}
