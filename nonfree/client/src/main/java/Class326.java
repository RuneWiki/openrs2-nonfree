import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class326 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!dc;")
	private Class65 aClass65_7;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_39;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class326(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!te;Lclient!te;F)Z")
	public boolean method8009(@OriginalArg(1) Class76_Sub4 arg0, @OriginalArg(2) Class76_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method8010()) {
			return false;
		}
		@Pc(15) Class320 local15 = this.aClass5_Sub2_39.aClass320_5;
		@Pc(26) Class3_Sub4_Sub21 local26 = new Class3_Sub4_Sub21(this.aClass5_Sub2_39, 6408, arg0.anInt9212, arg0.anInt9211);
		this.aClass5_Sub2_39.method5028(local15);
		@Pc(35) boolean local35 = false;
		local15.method7959(0, local26);
		if (local15.method7964()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt9212, arg0.anInt9211);
			OpenGL.glUseProgramObjectARB(this.aClass65_7.aLong42);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass65_7.aLong42, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass65_7.aLong42, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass65_7.aLong42, "sampleSize"), 1.0F / (float) arg1.anInt9212, 1.0F / (float) arg1.anInt9211);
			for (@Pc(104) int local104 = 0; local104 < arg0.anInt9219; local104++) {
				@Pc(113) float local113 = (float) local104 / (float) arg0.anInt9219;
				this.aClass5_Sub2_39.method4997(arg1);
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
				arg0.method7933(arg0.anInt9211, arg0.anInt9212, local104);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local35 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7961(0);
		this.aClass5_Sub2_39.method5026(local15);
		return local35;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Z")
	public boolean method8010() {
		if (this.aClass5_Sub2_39.aBoolean374 && this.aClass5_Sub2_39.aBoolean389 && this.aClass65_7 == null) {
			@Pc(17) Class324 local17 = Static483.method7199(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass5_Sub2_39);
			if (local17 != null) {
				this.aClass65_7 = Static116.method2392(this.aClass5_Sub2_39, new Class324[] { local17 });
			}
		}
		return this.aClass65_7 != null;
	}
}
