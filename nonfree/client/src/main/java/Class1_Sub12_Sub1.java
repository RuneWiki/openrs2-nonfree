import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Lclient!fe;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!fe;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!fe;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!fe;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	private int anInt1530 = -1;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	private int anInt1531 = -1;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt1529 = -1;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	private int anInt1532 = Static157.anInt3138;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	private int anInt1533 = -1;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
	@Override
	public int method1365() {
		return 1;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()Z")
	@Override
	public boolean method1368() {
		return this.anInt1530 != -1;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	@Override
	public void method1361(@OriginalArg(0) int arg0) {
		Static71.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	@Override
	public void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static71.aGL1;
		@Pc(5) int local5 = Static218.method3531(arg0);
		@Pc(9) int local9 = Static218.method3531(arg1);
		if (this.anIntArray125 != null) {
			local1.glDeleteTextures(this.anIntArray125.length, this.anIntArray125, 0);
			this.anIntArray125 = null;
		}
		if (this.anInt1532 == Static157.anInt3138 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt1533 == -1) {
				this.anInt1533 = Static127.method2240();
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
			this.anIntArray125 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray125[local39++] = Static157.method2696(Static157.anInt3127, Static157.anInt3133, local35, local37, Static157.anInt3138, Static157.anInt3138, Static157.anInt3130, Static157.anInt3141, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt1533 != -1) {
			Static127.method2238(this.anInt1533);
			this.anInt1533 = -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "()V")
	@Override
	public void method1372() {
		if (this.anIntArray125 != null) {
			Static71.aGL1.glDeleteTextures(this.anIntArray125.length, this.anIntArray125, 0);
			this.anIntArray125 = null;
		}
		if (this.anInt1533 != -1) {
			Static127.method2238(this.anInt1533);
			this.anInt1533 = -1;
		}
		if (this.anInt1530 != -1) {
			Static127.method2238(this.anInt1530);
			this.anInt1530 = -1;
		}
		if (this.anInt1529 != -1) {
			Static157.method2701(this.anInt1529);
			this.anInt1529 = -1;
		}
		if (this.anInt1531 != -1) {
			Static157.method2701(this.anInt1531);
			this.anInt1531 = -1;
		}
		this.aClass51_2 = null;
		this.aClass51_3 = null;
		this.aClass51_4 = null;
		this.aClass51_1 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray125 == null) {
			local1.glBindTexture(34037, arg3);
			Static127.method2242(this.anInt1530);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass51_2.anInt1553;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static70.aFloat38, 0.0F, 0.0F);
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
			Static127.method2242(this.anInt1533);
			local29 = Static218.method3531(arg1);
			local33 = Static218.method3531(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray125[local35], 0);
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
					Static71.method1400(this.anIntArray125[local35 - 1]);
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
			Static127.method2237();
			Static71.method1400(this.anIntArray125[local35 - 1]);
			Static127.method2242(this.anInt1530);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass51_3.anInt1553;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static70.aFloat38, 0.0F, 0.0F);
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
		Static71.method1400(this.anInt1529);
		local29 = this.aClass51_1.anInt1553;
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
		Static71.method1400(this.anInt1531);
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
		Static127.method2237();
		local33 = this.aClass51_4.anInt1553;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static70.aFloat36, Static70.aFloat37, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt1529);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()Z")
	@Override
	public boolean method1362() {
		if (!Static71.aBoolean166 || !Static71.aBoolean157 || !Static71.aBoolean160) {
			return false;
		}
		@Pc(7) GL local7 = Static71.aGL1;
		this.anInt1530 = Static127.method2240();
		this.anInt1529 = Static157.method2696(Static157.anInt3127, Static157.anInt3133, 256, 256, Static157.anInt3138, Static157.anInt3138, Static157.anInt3130, Static157.anInt3141, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt1531 = Static157.method2696(Static157.anInt3127, Static157.anInt3133, 256, 256, Static157.anInt3138, Static157.anInt3138, Static157.anInt3130, Static157.anInt3141, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static127.method2242(this.anInt1530);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt1529, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt1531, 0);
		local7.glDrawBuffer(36064);
		if (!Static127.method2236()) {
			this.anInt1532 = Static157.anInt3139;
			Static71.method1400(this.anInt1529);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static71.method1400(this.anInt1531);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static127.method2236()) {
				Static127.method2237();
				return false;
			}
		}
		Static127.method2237();
		this.aClass51_2 = Static72.method1419(new Class113[] { Static177.method3010("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static177.anInt3428) });
		this.aClass51_3 = Static72.method1419(new Class113[] { Static177.method3010("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static177.anInt3428) });
		this.aClass51_4 = Static72.method1419(new Class113[] { Static177.method3010("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static177.anInt3428) });
		this.aClass51_1 = Static72.method1419(new Class113[] { Static177.method3010("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static177.anInt3428) });
		return this.aClass51_3 != null && this.aClass51_2 != null && this.aClass51_4 != null && this.aClass51_1 != null;
	}
}
