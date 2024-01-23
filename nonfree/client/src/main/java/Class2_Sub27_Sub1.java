import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class2_Sub27_Sub1 extends Class2_Sub27 {

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "Lclient!si;")
	private Class158 aClass158_1;

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "Lclient!si;")
	private Class158 aClass158_2;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "Lclient!si;")
	private Class158 aClass158_3;

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "Lclient!si;")
	private Class158 aClass158_4;

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	private int anInt5396 = Static48.anInt1129;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	private int anInt5395 = -1;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
	private int anInt5398 = -1;

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
	private int anInt5397 = -1;

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
	private int anInt5399 = -1;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "()I")
	@Override
	public int method4325() {
		return 1;
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V")
	@Override
	public void method4327(@OriginalArg(0) int arg0) {
		Static60.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray475 == null) {
			local1.glBindTexture(34037, arg3);
			Static147.method2593(this.anInt5395);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass158_1.anInt4871;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static258.aFloat52, 0.0F, 0.0F);
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
			Static147.method2593(this.anInt5398);
			local29 = Static186.method3169(arg1);
			local33 = Static186.method3169(arg2);
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
					Static60.method1157(this.anIntArray475[local35 - 1]);
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
			Static147.method2591();
			Static60.method1157(this.anIntArray475[local35 - 1]);
			Static147.method2593(this.anInt5395);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass158_4.anInt4871;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static258.aFloat52, 0.0F, 0.0F);
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
		Static60.method1157(this.anInt5397);
		local29 = this.aClass158_3.anInt4871;
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
		Static60.method1157(this.anInt5399);
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
		Static147.method2591();
		local33 = this.aClass158_2.anInt4871;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static258.aFloat51, Static258.aFloat53, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt5397);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "()Z")
	@Override
	public boolean method4324() {
		return this.anInt5395 != -1;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "()Z")
	@Override
	public boolean method4326() {
		if (!Static60.aBoolean99 || !Static60.aBoolean111 || !Static60.aBoolean102) {
			return false;
		}
		@Pc(7) GL local7 = Static60.aGL1;
		this.anInt5395 = Static147.method2597();
		this.anInt5397 = Static48.method981(Static48.anInt1118, Static48.anInt1124, 256, 256, Static48.anInt1129, Static48.anInt1129, Static48.anInt1121, Static48.anInt1132, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt5399 = Static48.method981(Static48.anInt1118, Static48.anInt1124, 256, 256, Static48.anInt1129, Static48.anInt1129, Static48.anInt1121, Static48.anInt1132, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static147.method2593(this.anInt5395);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt5397, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt5399, 0);
		local7.glDrawBuffer(36064);
		if (!Static147.method2592()) {
			this.anInt5396 = Static48.anInt1130;
			Static60.method1157(this.anInt5397);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static60.method1157(this.anInt5399);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static147.method2592()) {
				Static147.method2591();
				return false;
			}
		}
		Static147.method2591();
		this.aClass158_1 = Static240.method3937(new Class160[] { Static244.method3957("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static244.anInt4910) });
		this.aClass158_4 = Static240.method3937(new Class160[] { Static244.method3957("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static244.anInt4910) });
		this.aClass158_2 = Static240.method3937(new Class160[] { Static244.method3957("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static244.anInt4910) });
		this.aClass158_3 = Static240.method3937(new Class160[] { Static244.method3957("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static244.anInt4910) });
		return this.aClass158_4 != null && this.aClass158_1 != null && this.aClass158_2 != null && this.aClass158_3 != null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	@Override
	public void method4329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(5) int local5 = Static186.method3169(arg0);
		@Pc(9) int local9 = Static186.method3169(arg1);
		if (this.anIntArray475 != null) {
			local1.glDeleteTextures(this.anIntArray475.length, this.anIntArray475, 0);
			this.anIntArray475 = null;
		}
		if (this.anInt5396 == Static48.anInt1129 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt5398 == -1) {
				this.anInt5398 = Static147.method2597();
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
				this.anIntArray475[local39++] = Static48.method981(Static48.anInt1118, Static48.anInt1124, local35, local37, Static48.anInt1129, Static48.anInt1129, Static48.anInt1121, Static48.anInt1132, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt5398 != -1) {
			Static147.method2590(this.anInt5398);
			this.anInt5398 = -1;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "()V")
	@Override
	public void method4321() {
		if (this.anIntArray475 != null) {
			Static60.aGL1.glDeleteTextures(this.anIntArray475.length, this.anIntArray475, 0);
			this.anIntArray475 = null;
		}
		if (this.anInt5398 != -1) {
			Static147.method2590(this.anInt5398);
			this.anInt5398 = -1;
		}
		if (this.anInt5395 != -1) {
			Static147.method2590(this.anInt5395);
			this.anInt5395 = -1;
		}
		if (this.anInt5397 != -1) {
			Static48.method977(this.anInt5397);
			this.anInt5397 = -1;
		}
		if (this.anInt5399 != -1) {
			Static48.method977(this.anInt5399);
			this.anInt5399 = -1;
		}
		this.aClass158_1 = null;
		this.aClass158_4 = null;
		this.aClass158_2 = null;
		this.aClass158_3 = null;
	}
}
