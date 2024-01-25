import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class258 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!jh;")
	private Class129 aClass129_7;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_43;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class258(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BFLclient!bc;Lclient!bc;)Z")
	public boolean method6301(@OriginalArg(1) float arg0, @OriginalArg(2) Class19_Sub1 arg1, @OriginalArg(3) Class19_Sub1 arg2) {
		if (!this.method6303()) {
			return false;
		}
		@Pc(15) Class200 local15 = this.aClass66_Sub2_43.aClass200_7;
		@Pc(26) Class6_Sub2_Sub5 local26 = new Class6_Sub2_Sub5(this.aClass66_Sub2_43, 6408, arg1.anInt757, arg1.anInt746);
		this.aClass66_Sub2_43.method5098(local15);
		@Pc(33) boolean local33 = false;
		local15.method4540(0, local26);
		if (local15.method4546()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt757, arg1.anInt746);
			OpenGL.glUseProgramObjectARB(this.aClass129_7.aLong103);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass129_7.aLong103, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass129_7.aLong103, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass129_7.aLong103, "sampleSize"), 1.0F / (float) arg2.anInt757, 1.0F / (float) arg2.anInt746);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt755; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt755;
				this.aClass66_Sub2_43.method5109(arg2);
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
				arg1.method652(arg1.anInt746, local102, arg1.anInt757);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method4541(0);
		this.aClass66_Sub2_43.method5153(local15);
		return local33;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Z")
	public boolean method6303() {
		if (this.aClass66_Sub2_43.aBoolean372 && this.aClass66_Sub2_43.aBoolean375 && this.aClass129_7 == null) {
			@Pc(22) Class168 local22 = Static227.method3401(this.aClass66_Sub2_43, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local22 != null) {
				this.aClass129_7 = Static143.method2455(this.aClass66_Sub2_43, new Class168[] { local22 });
			}
		}
		return this.aClass129_7 != null;
	}
}
