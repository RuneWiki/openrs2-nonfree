import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class367 {

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Lclient!taa;")
	private Class315 aClass315_7;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_44;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class367(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_44 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jba;BLclient!jba;F)Z")
	public boolean method7807(@OriginalArg(0) Class34_Sub3 arg0, @OriginalArg(2) Class34_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7808()) {
			return false;
		}
		@Pc(21) Class293 local21 = this.aClass43_Sub3_44.aClass293_7;
		@Pc(32) Class3_Sub3_Sub12 local32 = new Class3_Sub3_Sub12(this.aClass43_Sub3_44, 6408, arg0.anInt4491, arg0.anInt4490);
		@Pc(34) boolean local34 = false;
		this.aClass43_Sub3_44.method7247(local21);
		local21.method6426(0, local32);
		if (local21.method6416()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt4491, arg0.anInt4490);
			OpenGL.glUseProgramObjectARB(this.aClass315_7.aLong230);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass315_7.aLong230, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass315_7.aLong230, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass315_7.aLong230, "sampleSize"), 1.0F / (float) arg1.anInt4491, 1.0F / (float) arg1.anInt4490);
			for (@Pc(108) int local108 = 0; local108 < arg0.anInt4489; local108++) {
				@Pc(117) float local117 = (float) local108 / (float) arg0.anInt4489;
				this.aClass43_Sub3_44.method7220(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local117);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local117);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local117);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local117);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method3996(arg0.anInt4490, arg0.anInt4491, local108);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local34 = true;
			OpenGL.glPopMatrix();
		}
		local21.method6411(0);
		this.aClass43_Sub3_44.method7286(local21);
		return local34;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z")
	public boolean method7808() {
		if (this.aClass43_Sub3_44.aBoolean676 && this.aClass43_Sub3_44.aBoolean691 && this.aClass315_7 == null) {
			@Pc(29) Class165 local29 = Static556.method7402(35632, this.aClass43_Sub3_44, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local29 != null) {
				this.aClass315_7 = Static280.method4448(new Class165[] { local29 }, this.aClass43_Sub3_44);
			}
		}
		return this.aClass315_7 != null;
	}
}
