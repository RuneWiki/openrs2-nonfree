import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!w", name = "H", descriptor = "Lclient!fg;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!w", name = "L", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "Lclient!fg;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Lclient!fg;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "Lclient!fg;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!w", name = "I", descriptor = "I")
	private int anInt5991 = -1;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	private int anInt5992 = Static211.anInt4146;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private int anInt5994 = -1;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "I")
	private int anInt5993 = -1;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	private int anInt5995 = -1;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	@Override
	public void method4900(@OriginalArg(0) int arg0) {
		Static283.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
	@Override
	public void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(5) int local5 = Static310.method4990(arg0);
		@Pc(9) int local9 = Static310.method4990(arg1);
		if (this.anIntArray617 != null) {
			local1.glDeleteTextures(this.anIntArray617.length, this.anIntArray617, 0);
			this.anIntArray617 = null;
		}
		if (this.anInt5992 == Static211.anInt4146 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt5995 == -1) {
				this.anInt5995 = Static121.method2018();
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
			this.anIntArray617 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray617[local39++] = Static211.method3481(Static211.anInt4135, Static211.anInt4141, local35, local37, Static211.anInt4146, Static211.anInt4146, Static211.anInt4138, Static211.anInt4149, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt5995 != -1) {
			Static121.method2012(this.anInt5995);
			this.anInt5995 = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()Z")
	@Override
	public boolean method4897() {
		return this.anInt5991 != -1;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	@Override
	public void method4899() {
		if (this.anIntArray617 != null) {
			Static283.aGL1.glDeleteTextures(this.anIntArray617.length, this.anIntArray617, 0);
			this.anIntArray617 = null;
		}
		if (this.anInt5995 != -1) {
			Static121.method2012(this.anInt5995);
			this.anInt5995 = -1;
		}
		if (this.anInt5991 != -1) {
			Static121.method2012(this.anInt5991);
			this.anInt5991 = -1;
		}
		if (this.anInt5994 != -1) {
			Static211.method3480(this.anInt5994);
			this.anInt5994 = -1;
		}
		if (this.anInt5993 != -1) {
			Static211.method3480(this.anInt5993);
			this.anInt5993 = -1;
		}
		this.aClass53_2 = null;
		this.aClass53_3 = null;
		this.aClass53_4 = null;
		this.aClass53_1 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray617 == null) {
			local1.glBindTexture(34037, arg3);
			Static121.method2020(this.anInt5991);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass53_2.anInt1523;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static303.aFloat74, 0.0F, 0.0F);
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
			Static121.method2020(this.anInt5995);
			local29 = Static310.method4990(arg1);
			local33 = Static310.method4990(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray617[local35], 0);
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
					Static283.method4636(this.anIntArray617[local35 - 1]);
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
			Static121.method2016();
			Static283.method4636(this.anIntArray617[local35 - 1]);
			Static121.method2020(this.anInt5991);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass53_3.anInt1523;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static303.aFloat74, 0.0F, 0.0F);
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
		Static283.method4636(this.anInt5994);
		local29 = this.aClass53_1.anInt1523;
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
		Static283.method4636(this.anInt5993);
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
		Static121.method2016();
		local33 = this.aClass53_4.anInt1523;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static303.aFloat73, Static303.aFloat72, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt5994);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()Z")
	@Override
	public boolean method4894() {
		if (!Static283.aBoolean391 || !Static283.aBoolean390 || !Static283.aBoolean399) {
			return false;
		}
		@Pc(7) GL local7 = Static283.aGL1;
		this.anInt5991 = Static121.method2018();
		this.anInt5994 = Static211.method3481(Static211.anInt4135, Static211.anInt4141, 256, 256, Static211.anInt4146, Static211.anInt4146, Static211.anInt4138, Static211.anInt4149, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt5993 = Static211.method3481(Static211.anInt4135, Static211.anInt4141, 256, 256, Static211.anInt4146, Static211.anInt4146, Static211.anInt4138, Static211.anInt4149, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static121.method2020(this.anInt5991);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt5994, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt5993, 0);
		local7.glDrawBuffer(36064);
		if (!Static121.method2014()) {
			this.anInt5992 = Static211.anInt4147;
			Static283.method4636(this.anInt5994);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static283.method4636(this.anInt5993);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static121.method2014()) {
				Static121.method2016();
				return false;
			}
		}
		Static121.method2016();
		this.aClass53_2 = Static80.method1249(new Class185[] { Static294.method4802("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static294.anInt5848) });
		this.aClass53_3 = Static80.method1249(new Class185[] { Static294.method4802("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static294.anInt5848) });
		this.aClass53_4 = Static80.method1249(new Class185[] { Static294.method4802("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static294.anInt5848) });
		this.aClass53_1 = Static80.method1249(new Class185[] { Static294.method4802("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static294.anInt5848) });
		return this.aClass53_3 != null && this.aClass53_2 != null && this.aClass53_4 != null && this.aClass53_1 != null;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()I")
	@Override
	public int method4905() {
		return 1;
	}
}
