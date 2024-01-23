import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub18_Sub1 extends Class1_Sub18 {

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "Lclient!jd;")
	private Class88 aClass88_1;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "Lclient!jd;")
	private Class88 aClass88_2;

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "Lclient!jd;")
	private Class88 aClass88_3;

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "Lclient!jd;")
	private Class88 aClass88_4;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
	private int anInt3592 = -1;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
	private int anInt3593 = -1;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
	private int anInt3596 = -1;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
	private int anInt3595 = Static160.anInt3378;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
	private int anInt3594 = -1;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()Z")
	@Override
	public boolean method2876() {
		if (!Static291.aBoolean397 || !Static291.aBoolean401 || !Static291.aBoolean399) {
			return false;
		}
		@Pc(7) GL local7 = Static291.aGL1;
		this.anInt3594 = Static180.method2957();
		this.anInt3592 = Static160.method2701(Static160.anInt3367, Static160.anInt3373, 256, 256, Static160.anInt3378, Static160.anInt3378, Static160.anInt3370, Static160.anInt3381, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		this.anInt3596 = Static160.method2701(Static160.anInt3367, Static160.anInt3373, 256, 256, Static160.anInt3378, Static160.anInt3378, Static160.anInt3370, Static160.anInt3381, null);
		local7.glTexParameteri(3553, 10242, 33071);
		local7.glTexParameteri(3553, 10243, 33071);
		Static180.method2958(this.anInt3594);
		local7.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anInt3592, 0);
		local7.glFramebufferTexture2DEXT(36160, 36065, 3553, this.anInt3596, 0);
		local7.glDrawBuffer(36064);
		if (!Static180.method2960()) {
			this.anInt3595 = Static160.anInt3379;
			Static291.method4310(this.anInt3592);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			Static291.method4310(this.anInt3596);
			local7.glTexParameteri(3553, 10241, 9728);
			local7.glTexParameteri(3553, 10240, 9728);
			if (!Static180.method2960()) {
				Static180.method2964();
				return false;
			}
		}
		Static180.method2964();
		this.aClass88_1 = Static125.method2006(new Class4[] { Static3.method46("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static3.anInt54) });
		this.aClass88_4 = Static125.method2006(new Class4[] { Static3.method46("uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Static3.anInt54) });
		this.aClass88_3 = Static125.method2006(new Class4[] { Static3.method46("#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n", Static3.anInt54) });
		this.aClass88_2 = Static125.method2006(new Class4[] { Static3.method46("uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n", Static3.anInt54) });
		return this.aClass88_4 != null && this.aClass88_1 != null && this.aClass88_3 != null && this.aClass88_2 != null;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()V")
	@Override
	public void method2879() {
		if (this.anIntArray285 != null) {
			Static291.aGL1.glDeleteTextures(this.anIntArray285.length, this.anIntArray285, 0);
			this.anIntArray285 = null;
		}
		if (this.anInt3593 != -1) {
			Static180.method2966(this.anInt3593);
			this.anInt3593 = -1;
		}
		if (this.anInt3594 != -1) {
			Static180.method2966(this.anInt3594);
			this.anInt3594 = -1;
		}
		if (this.anInt3592 != -1) {
			Static160.method2699(this.anInt3592);
			this.anInt3592 = -1;
		}
		if (this.anInt3596 != -1) {
			Static160.method2699(this.anInt3596);
			this.anInt3596 = -1;
		}
		this.aClass88_1 = null;
		this.aClass88_4 = null;
		this.aClass88_3 = null;
		this.aClass88_2 = null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()Z")
	@Override
	public boolean method2870() {
		return this.anInt3594 != -1;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	@Override
	public void method2873(@OriginalArg(0) int arg0) {
		Static291.aGL1.glUseProgramObjectARB(0);
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
	@Override
	public int method2877() {
		return 1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glPushAttrib(2048);
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (this.anIntArray285 == null) {
			local1.glBindTexture(34037, arg3);
			Static180.method2958(this.anInt3594);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			local29 = this.aClass88_1.anInt2537;
			local1.glUseProgramObjectARB(local29);
			local1.glUniform1iARB(local1.glGetUniformLocation(local29, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local29, "params"), Static170.aFloat36, 0.0F, 0.0F);
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
			Static180.method2958(this.anInt3593);
			local29 = Static302.method4512(arg1);
			local33 = Static302.method4512(arg2);
			@Pc(35) int local35 = 0;
			while (local29 > 256 || local33 > 256) {
				local1.glViewport(0, 0, local29, local33);
				local1.glFramebufferTexture2DEXT(36160, 36064, 3553, this.anIntArray285[local35], 0);
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
					Static291.method4310(this.anIntArray285[local35 - 1]);
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
			Static180.method2964();
			Static291.method4310(this.anIntArray285[local35 - 1]);
			Static180.method2958(this.anInt3594);
			local1.glDrawBuffer(36064);
			local1.glViewport(0, 0, 256, 256);
			@Pc(195) int local195 = this.aClass88_4.anInt2537;
			local1.glUseProgramObjectARB(local195);
			local1.glUniform1iARB(local1.glGetUniformLocation(local195, "sceneTex"), 0);
			local1.glUniform3fARB(local1.glGetUniformLocation(local195, "params"), Static170.aFloat36, 0.0F, 0.0F);
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
		Static291.method4310(this.anInt3592);
		local29 = this.aClass88_2.anInt2537;
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
		Static291.method4310(this.anInt3596);
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
		Static180.method2964();
		local33 = this.aClass88_3.anInt2537;
		local1.glUseProgramObjectARB(local33);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "sceneTex"), 0);
		local1.glUniform1iARB(local1.glGetUniformLocation(local33, "bloomTex"), 1);
		local1.glUniform3fARB(local1.glGetUniformLocation(local33, "params"), Static170.aFloat37, Static170.aFloat38, 0.0F);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, this.anInt3592);
		local1.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	@Override
	public void method2878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(5) int local5 = Static302.method4512(arg0);
		@Pc(9) int local9 = Static302.method4512(arg1);
		if (this.anIntArray285 != null) {
			local1.glDeleteTextures(this.anIntArray285.length, this.anIntArray285, 0);
			this.anIntArray285 = null;
		}
		if (this.anInt3595 == Static160.anInt3378 && (local5 > 256 || local9 > 256)) {
			@Pc(35) int local35 = local5;
			@Pc(37) int local37 = local9;
			@Pc(39) int local39 = 0;
			if (this.anInt3593 == -1) {
				this.anInt3593 = Static180.method2957();
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
			this.anIntArray285 = new int[local39];
			local35 = local5;
			local37 = local9;
			local39 = 0;
			while (local35 > 256 || local37 > 256) {
				this.anIntArray285[local39++] = Static160.method2701(Static160.anInt3367, Static160.anInt3373, local35, local37, Static160.anInt3378, Static160.anInt3378, Static160.anInt3370, Static160.anInt3381, null);
				if (local35 > 256) {
					local35 >>= 0x1;
				}
				if (local37 > 256) {
					local37 >>= 0x1;
				}
			}
		} else if (this.anInt3593 != -1) {
			Static180.method2966(this.anInt3593);
			this.anInt3593 = -1;
		}
	}
}
