import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class359 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!te;")
	private Class309 aClass309_7;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_44;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class359(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_44 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Z")
	public boolean method7838() {
		if (this.aClass12_Sub1_44.aBoolean34 && this.aClass12_Sub1_44.aBoolean19 && this.aClass309_7 == null) {
			@Pc(17) Class344 local17 = Static245.method3978("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass12_Sub1_44, 35632);
			if (local17 != null) {
				this.aClass309_7 = Static490.method6896(this.aClass12_Sub1_44, new Class344[] { local17 });
			}
		}
		return this.aClass309_7 != null;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!pd;FZLclient!pd;)Z")
	public boolean method7841(@OriginalArg(0) Class52_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class52_Sub4 arg2) {
		if (!this.method7838()) {
			return false;
		}
		@Pc(15) Class161 local15 = this.aClass12_Sub1_44.aClass161_2;
		@Pc(26) Class1_Sub3_Sub12 local26 = new Class1_Sub3_Sub12(this.aClass12_Sub1_44, 6408, arg2.anInt6867, arg2.anInt6864);
		@Pc(28) boolean local28 = false;
		this.aClass12_Sub1_44.method424(local15);
		local15.method3791(local26, 0);
		if (local15.method3792()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt6867, arg2.anInt6864);
			OpenGL.glUseProgramObjectARB(this.aClass309_7.aLong372);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass309_7.aLong372, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass309_7.aLong372, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass309_7.aLong372, "sampleSize"), 1.0F / (float) arg0.anInt6867, 1.0F / (float) arg0.anInt6864);
			for (@Pc(102) int local102 = 0; local102 < arg2.anInt6871; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg2.anInt6871;
				this.aClass12_Sub1_44.method378(arg0);
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
				arg2.method5646(arg2.anInt6867, local102, arg2.anInt6864);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method3784(0);
		this.aClass12_Sub1_44.method372(local15);
		return local28;
	}
}
