import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub21_Sub1 extends Class1_Sub21 {

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Lclient!sl;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "Lclient!sl;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "Lclient!sl;")
	private Class150 aClass150_3;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "Lclient!sl;")
	private Class150 aClass150_4;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "[I")
	private int[] anIntArray396;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
	private int anInt3366 = -1;

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
	private int anInt3368 = Static231.anInt4850;

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	private int anInt3369 = -1;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	private int anInt3365 = -1;

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
	private int anInt3367 = -1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray396 == null) {
			local1.glBindTexture(34037, arg3);
			Static157.method2445(this.anInt3365);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass150_4.anInt5043;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static181.aFloat103, 0.0F, 0.0F);
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
			Static157.method2445(this.anInt3366);
			local29 = Static202.method3145(arg1);
			local33 = Static202.method3145(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray396[local35], 0);
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
					Static240.method3789(this.anIntArray396[local35 - 1]);
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
			Static157.method2446();
			Static240.method3789(this.anIntArray396[local35 - 1]);
			Static157.method2445(this.anInt3365);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass150_1.anInt5043;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static181.aFloat103, 0.0F, 0.0F);
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
		Static240.method3789(this.anInt3369);
		local29 = this.aClass150_2.anInt5043;
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
		Static240.method3789(this.anInt3367);
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
		Static157.method2446();
		local33 = this.aClass150_3.anInt5043;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static181.aFloat104, Static181.aFloat102, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt3369);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
	@Override
	public void method2729() {
		if (this.anIntArray396 != null) {
			Static240.aGL1.glDeleteTextures(this.anIntArray396.length, this.anIntArray396, 0);
			this.anIntArray396 = null;
		}
		if (this.anInt3366 != -1) {
			Static157.method2443(this.anInt3366);
			this.anInt3366 = -1;
		}
		if (this.anInt3365 != -1) {
			Static157.method2443(this.anInt3365);
			this.anInt3365 = -1;
		}
		if (this.anInt3369 != -1) {
			Static231.method3694(this.anInt3369);
			this.anInt3369 = -1;
		}
		if (this.anInt3367 != -1) {
			Static231.method3694(this.anInt3367);
			this.anInt3367 = -1;
		}
		this.aClass150_4 = null;
		this.aClass150_1 = null;
		this.aClass150_3 = null;
		this.aClass150_2 = null;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()Z")
	@Override
	public boolean method2736() {
		if (!Static240.aBoolean370 || !Static240.aBoolean382 || !Static240.aBoolean383) {
			return false;
		}
		@Pc(7) GL local7 = Static240.aGL1;
		this.anInt3365 = Static157.method2452();
		this.anInt3369 = Static231.method3697(Static231.anInt4839, Static231.anInt4845, 256, 256, Static231.anInt4850, Static231.anInt4850, Static231.anInt4842, Static231.anInt4853, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt3367 = Static231.method3697(Static231.anInt4839, Static231.anInt4845, 256, 256, Static231.anInt4850, Static231.anInt4850, Static231.anInt4842, Static231.anInt4853, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static157.method2445(this.anInt3365);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt3369, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt3367, 0);
		local7.glDrawBuffer(36064);
		if (!Static157.method2449()) {
			this.anInt3368 = Static231.anInt4851;
			Static240.method3789(this.anInt3369);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static240.method3789(this.anInt3367);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static157.method2449()) {
				Static157.method2446();
				return false;
			}
		}
		Static157.method2446();
		this.aClass150_4 = Static248.method3875(new Class41[] { Static59.method1008("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static59.anInt1235) });
		this.aClass150_1 = Static248.method3875(new Class41[] { Static59.method1008("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static59.anInt1235) });
		this.aClass150_3 = Static248.method3875(new Class41[] { Static59.method1008("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static59.anInt1235) });
		this.aClass150_2 = Static248.method3875(new Class41[] { Static59.method1008("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static59.anInt1235) });
		return this.aClass150_1 != null && this.aClass150_4 != null && this.aClass150_3 != null && this.aClass150_2 != null;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()Z")
	@Override
	public boolean method2730() {
		return this.anInt3365 != -1;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()I")
	@Override
	public int method2734() {
		return 1;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	@Override
	public void method2728(@OriginalArg(0) int arg0) {
		Static240.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	@Override
	public void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(5) int local5 = Static202.method3145(arg0);
		@Pc(9) int local9 = Static202.method3145(arg1);
		if (this.anIntArray396 != null) {
			local1.glDeleteTextures(this.anIntArray396.length, this.anIntArray396, 0);
			this.anIntArray396 = null;
		}
		if (this.anInt3368 == Static231.anInt4850 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt3366 == -1) {
				this.anInt3366 = Static157.method2452();
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
			this.anIntArray396 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray396[local39++] = Static231.method3697(Static231.anInt4839, Static231.anInt4845, local35, local37, Static231.anInt4850, Static231.anInt4850, Static231.anInt4842, Static231.anInt4853, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt3366 != -1) {
			Static157.method2443(this.anInt3366);
			this.anInt3366 = -1;
		}
	}
}
