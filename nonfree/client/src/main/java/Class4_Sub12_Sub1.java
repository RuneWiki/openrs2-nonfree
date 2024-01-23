import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 {

	@OriginalMember(owner = "client!e", name = "D", descriptor = "Lclient!ta;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!ta;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!e", name = "G", descriptor = "Lclient!ta;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "Lclient!ta;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	private int anInt1123 = -1;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	private int anInt1121 = Static144.anInt2938;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	private int anInt1124 = -1;

	@OriginalMember(owner = "client!e", name = "F", descriptor = "I")
	private int anInt1125 = -1;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	private int anInt1122 = -1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
	@Override
	public boolean method912() {
		return this.anInt1125 != -1;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	@Override
	public int method908() {
		return 1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	@Override
	public void method911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(5) int local5 = Static276.method4104(arg0);
		@Pc(9) int local9 = Static276.method4104(arg1);
		if (this.anIntArray128 != null) {
			local1.glDeleteTextures(this.anIntArray128.length, this.anIntArray128, 0);
			this.anIntArray128 = null;
		}
		if (this.anInt1121 == Static144.anInt2938 && (local5 != 256 || local9 != 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt1122 == -1) {
				this.anInt1122 = Static29.method452();
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
			this.anIntArray128 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 != 256 || local37 != 256) {
				this.anIntArray128[local39++] = Static144.method2324(Static144.anInt2927, Static144.anInt2933, local35, local37, Static144.anInt2938, Static144.anInt2938, Static144.anInt2930, Static144.anInt2941, null);
				if (local35 != 256) {
					local35 >>= 0x1;
				}
				if (local37 != 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt1122 != -1) {
			Static29.method448(this.anInt1122);
			this.anInt1122 = -1;
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()Z")
	@Override
	public boolean method919() {
		if (!Static178.aBoolean221 || !Static178.aBoolean219 || !Static178.aBoolean223) {
			return false;
		}
		@Pc(7) GL local7 = Static178.aGL1;
		this.anInt1125 = Static29.method452();
		this.anInt1123 = Static144.method2324(Static144.anInt2927, Static144.anInt2933, 256, 256, Static144.anInt2938, Static144.anInt2938, Static144.anInt2930, Static144.anInt2941, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt1124 = Static144.method2324(Static144.anInt2927, Static144.anInt2933, 256, 256, Static144.anInt2938, Static144.anInt2938, Static144.anInt2930, Static144.anInt2941, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static29.method451(this.anInt1125);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt1123, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt1124, 0);
		local7.glDrawBuffer(36064);
		if (!Static29.method449()) {
			this.anInt1121 = Static144.anInt2939;
			Static178.method2763(this.anInt1123);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static178.method2763(this.anInt1124);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static29.method449()) {
				Static29.method450();
				return false;
			}
		}
		Static29.method450();
		this.aClass160_1 = Static252.method3787(new Class5[] { Static4.method51("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static4.anInt74) });
		this.aClass160_3 = Static252.method3787(new Class5[] { Static4.method51("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static4.anInt74) });
		this.aClass160_2 = Static252.method3787(new Class5[] { Static4.method51("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static4.anInt74) });
		this.aClass160_4 = Static252.method3787(new Class5[] { Static4.method51("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static4.anInt74) });
		return this.aClass160_3 != null && this.aClass160_1 != null && this.aClass160_2 != null && this.aClass160_4 != null;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public void method909(@OriginalArg(0) int arg0) {
		Static178.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray128 == null) {
			local1.glBindTexture(34037, arg3);
			Static29.method451(this.anInt1125);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass160_1.anInt4745;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static56.aFloat8, 0.0F, 0.0F);
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
			Static29.method451(this.anInt1122);
			local29 = Static276.method4104(arg1);
			local33 = Static276.method4104(arg2);
			@Pc(35) int local35 = 0;
			while (local29 != 256 || local33 != 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray128[local35], 0);
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
					Static178.method2763(this.anIntArray128[local35 - 1]);
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
			Static29.method450();
			Static178.method2763(this.anIntArray128[local35 - 1]);
			Static29.method451(this.anInt1125);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass160_3.anInt4745;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static56.aFloat8, 0.0F, 0.0F);
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
		Static178.method2763(this.anInt1123);
		local29 = this.aClass160_4.anInt4745;
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
		Static178.method2763(this.anInt1124);
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
		Static29.method450();
		local33 = this.aClass160_2.anInt4745;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static56.aFloat7, Static56.aFloat6, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt1123);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	@Override
	public void method905() {
		if (this.anIntArray128 != null) {
			Static178.aGL1.glDeleteTextures(this.anIntArray128.length, this.anIntArray128, 0);
			this.anIntArray128 = null;
		}
		if (this.anInt1122 != -1) {
			Static29.method448(this.anInt1122);
			this.anInt1122 = -1;
		}
		if (this.anInt1125 != -1) {
			Static29.method448(this.anInt1125);
			this.anInt1125 = -1;
		}
		if (this.anInt1123 != -1) {
			Static144.method2330(this.anInt1123);
			this.anInt1123 = -1;
		}
		if (this.anInt1124 != -1) {
			Static144.method2330(this.anInt1124);
			this.anInt1124 = -1;
		}
		this.aClass160_1 = null;
		this.aClass160_3 = null;
		this.aClass160_2 = null;
		this.aClass160_4 = null;
	}
}
