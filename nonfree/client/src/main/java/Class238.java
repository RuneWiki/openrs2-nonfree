import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class238 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!sh;")
	private Class305 aClass305_7;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_32;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class238(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_32 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
	public boolean method5547() {
		if (this.aClass14_Sub3_32.aBoolean302 && this.aClass14_Sub3_32.aBoolean320 && this.aClass305_7 == null) {
			@Pc(31) Class137 local31 = Static482.method6640("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass14_Sub3_32, 35632);
			if (local31 != null) {
				this.aClass305_7 = Static154.method2915(new Class137[] { local31 }, this.aClass14_Sub3_32);
			}
		}
		return this.aClass305_7 != null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ep;BLclient!ep;F)Z")
	public boolean method5548(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(2) Class51_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method5547()) {
			return false;
		}
		@Pc(15) Class74 local15 = this.aClass14_Sub3_32.aClass74_4;
		@Pc(26) Class6_Sub2_Sub8 local26 = new Class6_Sub2_Sub8(this.aClass14_Sub3_32, 6408, arg0.anInt2842, arg0.anInt2850);
		@Pc(28) boolean local28 = false;
		this.aClass14_Sub3_32.method3910(local15);
		local15.method1764(0, local26);
		if (local15.method1766()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2842, arg0.anInt2850);
			OpenGL.glUseProgramObjectARB(this.aClass305_7.aLong218);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass305_7.aLong218, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass305_7.aLong218, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass305_7.aLong218, "sampleSize"), 1.0F / (float) arg1.anInt2842, 1.0F / (float) arg1.anInt2850);
			for (@Pc(102) int local102 = 0; local102 < arg0.anInt2848; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg0.anInt2848;
				this.aClass14_Sub3_32.method3985(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local111);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local111);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local111);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local111);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method2512(arg0.anInt2842, arg0.anInt2850, local102);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local28 = true;
		}
		local15.method1777(0);
		this.aClass14_Sub3_32.method3955(local15);
		return local28;
	}
}
