import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Lclient!pf;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!pf;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "Lclient!pf;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!pf;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt933 = -1;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	private int anInt934 = Static267.anInt5145;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
	private int anInt937 = -1;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray66 == null) {
			local1.glBindTexture(34037, arg3);
			Static14.method216(this.anInt933);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass136_4.anInt4123;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static49.aFloat26, 0.0F, 0.0F);
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
			Static14.method216(this.anInt936);
			local29 = Static162.method2618(arg1);
			local33 = Static162.method2618(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray66[local35], 0);
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
					Static94.method1600(this.anIntArray66[local35 - 1]);
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
			Static14.method215();
			Static94.method1600(this.anIntArray66[local35 - 1]);
			Static14.method216(this.anInt933);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass136_2.anInt4123;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static49.aFloat26, 0.0F, 0.0F);
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
		Static94.method1600(this.anInt937);
		local29 = this.aClass136_3.anInt4123;
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
		Static94.method1600(this.anInt935);
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
		Static14.method215();
		local33 = this.aClass136_1.anInt4123;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static49.aFloat25, Static49.aFloat27, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt937);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	@Override
	public void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(5) int local5 = Static162.method2618(arg0);
		@Pc(9) int local9 = Static162.method2618(arg1);
		if (this.anIntArray66 != null) {
			local1.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt934 == Static267.anInt5145 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt936 == -1) {
				this.anInt936 = Static14.method210();
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
			this.anIntArray66 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray66[local39++] = Static267.method4205(Static267.anInt5134, Static267.anInt5140, local35, local37, Static267.anInt5145, Static267.anInt5145, Static267.anInt5137, Static267.anInt5148, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt936 != -1) {
			Static14.method211(this.anInt936);
			this.anInt936 = -1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()V")
	@Override
	public void method760() {
		if (this.anIntArray66 != null) {
			Static94.aGL1.glDeleteTextures(this.anIntArray66.length, this.anIntArray66, 0);
			this.anIntArray66 = null;
		}
		if (this.anInt936 != -1) {
			Static14.method211(this.anInt936);
			this.anInt936 = -1;
		}
		if (this.anInt933 != -1) {
			Static14.method211(this.anInt933);
			this.anInt933 = -1;
		}
		if (this.anInt937 != -1) {
			Static267.method4206(this.anInt937);
			this.anInt937 = -1;
		}
		if (this.anInt935 != -1) {
			Static267.method4206(this.anInt935);
			this.anInt935 = -1;
		}
		this.aClass136_4 = null;
		this.aClass136_2 = null;
		this.aClass136_1 = null;
		this.aClass136_3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "()Z")
	@Override
	public boolean method766() {
		return this.anInt933 != -1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	@Override
	public int method754() {
		return 1;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public void method756(@OriginalArg(0) int arg0) {
		Static94.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "()Z")
	@Override
	public boolean method762() {
		if (!Static94.aBoolean134 || !Static94.aBoolean131 || !Static94.aBoolean141) {
			return false;
		}
		@Pc(7) GL local7 = Static94.aGL1;
		this.anInt933 = Static14.method210();
		this.anInt937 = Static267.method4205(Static267.anInt5134, Static267.anInt5140, 256, 256, Static267.anInt5145, Static267.anInt5145, Static267.anInt5137, Static267.anInt5148, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt935 = Static267.method4205(Static267.anInt5134, Static267.anInt5140, 256, 256, Static267.anInt5145, Static267.anInt5145, Static267.anInt5137, Static267.anInt5148, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static14.method216(this.anInt933);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt937, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt935, 0);
		local7.glDrawBuffer(36064);
		if (!Static14.method217()) {
			this.anInt934 = Static267.anInt5146;
			Static94.method1600(this.anInt937);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static94.method1600(this.anInt935);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static14.method217()) {
				Static14.method215();
				return false;
			}
		}
		Static14.method215();
		this.aClass136_4 = Static209.method3415(new Class43[] { Static59.method991("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static59.anInt1200) });
		this.aClass136_2 = Static209.method3415(new Class43[] { Static59.method991("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static59.anInt1200) });
		this.aClass136_1 = Static209.method3415(new Class43[] { Static59.method991("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static59.anInt1200) });
		this.aClass136_3 = Static209.method3415(new Class43[] { Static59.method991("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static59.anInt1200) });
		return this.aClass136_2 != null && this.aClass136_4 != null && this.aClass136_1 != null && this.aClass136_3 != null;
	}
}
