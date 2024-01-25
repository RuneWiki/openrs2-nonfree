import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class113 {

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "Lclient!me;")
	private Class168 aClass168_2;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_14;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class113(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!eh;ILclient!eh;F)Z")
	public boolean method2116(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(2) Class65_Sub1 arg1, @OriginalArg(3) float arg2) {
		if (!this.method2117()) {
			return false;
		}
		@Pc(15) Class183 local15 = this.aClass135_Sub2_14.aClass183_6;
		@Pc(26) Class4_Sub2_Sub5 local26 = new Class4_Sub2_Sub5(this.aClass135_Sub2_14, 6408, arg1.anInt1721, arg1.anInt1719);
		this.aClass135_Sub2_14.method5439(local15);
		@Pc(33) boolean local33 = false;
		local15.method3619(local26, 0);
		if (local15.method3616()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt1721, arg1.anInt1719);
			OpenGL.glUseProgramObjectARB(this.aClass168_2.aLong114);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass168_2.aLong114, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass168_2.aLong114, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass168_2.aLong114, "sampleSize"), 1.0F / (float) arg0.anInt1721, 1.0F / (float) arg0.anInt1719);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt1718; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt1718;
				this.aClass135_Sub2_14.method5458(arg0);
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
				arg1.method1408(local102, arg1.anInt1721, arg1.anInt1719);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method3605(0);
		this.aClass135_Sub2_14.method5419(local15);
		return local33;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z")
	public boolean method2117() {
		if (this.aClass135_Sub2_14.aBoolean458 && this.aClass135_Sub2_14.aBoolean459 && this.aClass168_2 == null) {
			@Pc(26) Class228 local26 = Static103.method1539("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass135_Sub2_14);
			if (local26 != null) {
				this.aClass168_2 = Static400.method5265(this.aClass135_Sub2_14, new Class228[] { local26 });
			}
		}
		return this.aClass168_2 != null;
	}
}
