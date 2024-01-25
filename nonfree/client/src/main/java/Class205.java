import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class205 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!mv;")
	private Class177 aClass177_7;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_35;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class205(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_35 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)Z")
	public boolean method4760() {
		if (this.aClass75_Sub2_35.aBoolean339 && this.aClass75_Sub2_35.aBoolean344 && this.aClass177_7 == null) {
			@Pc(26) Class124 local26 = Static373.method5186(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass75_Sub2_35);
			if (local26 != null) {
				this.aClass177_7 = Static148.method2249(this.aClass75_Sub2_35, new Class124[] { local26 });
			}
		}
		return this.aClass177_7 != null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!er;IFLclient!er;)Z")
	public boolean method4761(@OriginalArg(0) Class64_Sub2 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class64_Sub2 arg2) {
		if (!this.method4760()) {
			return false;
		}
		@Pc(15) Class51 local15 = this.aClass75_Sub2_35.aClass51_6;
		@Pc(26) Class2_Sub1_Sub17 local26 = new Class2_Sub1_Sub17(this.aClass75_Sub2_35, 6408, arg2.anInt1592, arg2.anInt1593);
		this.aClass75_Sub2_35.method3826(local15);
		@Pc(33) boolean local33 = false;
		local15.method1082(0, local26);
		if (local15.method1089()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt1592, arg2.anInt1593);
			OpenGL.glUseProgramObjectARB(this.aClass177_7.aLong221);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass177_7.aLong221, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass177_7.aLong221, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass177_7.aLong221, "sampleSize"), 1.0F / (float) arg0.anInt1592, 1.0F / (float) arg0.anInt1593);
			for (@Pc(102) int local102 = 0; local102 < arg2.anInt1596; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg2.anInt1596;
				this.aClass75_Sub2_35.method3844(arg0);
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
				arg2.method1467(arg2.anInt1592, local102, arg2.anInt1593);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method1081(0);
		this.aClass75_Sub2_35.method3807(local15);
		return local33;
	}
}
