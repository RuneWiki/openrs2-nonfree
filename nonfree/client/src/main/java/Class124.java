import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class124 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!hq;")
	private Class147 aClass147_5;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_15;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class124(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_15 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Z")
	public boolean method3094() {
		if (this.aClass15_Sub3_15.aBoolean444 && this.aClass15_Sub3_15.aBoolean437 && this.aClass147_5 == null) {
			@Pc(26) Class185 local26 = Static56.method1328(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass15_Sub3_15);
			if (local26 != null) {
				this.aClass147_5 = Static596.method8419(new Class185[] { local26 }, this.aClass15_Sub3_15);
			}
		}
		return this.aClass147_5 != null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sp;Lclient!sp;ZF)Z")
	public boolean method3096(@OriginalArg(0) Class11_Sub4 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method3094()) {
			return false;
		}
		@Pc(18) Class269 local18 = this.aClass15_Sub3_15.aClass269_4;
		@Pc(29) Class3_Sub4_Sub19 local29 = new Class3_Sub4_Sub19(this.aClass15_Sub3_15, 6408, arg1.anInt9065, arg1.anInt9062);
		@Pc(31) boolean local31 = false;
		this.aClass15_Sub3_15.method4384(local18);
		local18.method6779(0, local29);
		if (local18.method6773()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt9065, arg1.anInt9062);
			OpenGL.glUseProgramObjectARB(this.aClass147_5.aLong114);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass147_5.aLong114, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass147_5.aLong114, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass147_5.aLong114, "sampleSize"), 1.0F / (float) arg0.anInt9065, 1.0F / (float) arg0.anInt9062);
			for (@Pc(105) int local105 = 0; local105 < arg1.anInt9064; local105++) {
				@Pc(113) float local113 = (float) local105 / (float) arg1.anInt9064;
				this.aClass15_Sub3_15.method4377(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local113);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local113);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local113);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local113);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method7414(local105, arg1.anInt9062, arg1.anInt9065);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local31 = true;
			OpenGL.glPopMatrix();
		}
		local18.method6783(0);
		this.aClass15_Sub3_15.method4379(local18);
		return local31;
	}
}
