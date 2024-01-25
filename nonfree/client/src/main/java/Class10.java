import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class10 {

	@OriginalMember(owner = "client!al", name = "h", descriptor = "Lclient!eu;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class10(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IFLclient!fb;Lclient!fb;)Z")
	public boolean method215(@OriginalArg(1) float arg0, @OriginalArg(2) Class65_Sub2 arg1, @OriginalArg(3) Class65_Sub2 arg2) {
		if (!this.method217()) {
			return false;
		}
		@Pc(17) Class200 local17 = this.aClass26_Sub1_1.aClass200_2;
		@Pc(28) Class2_Sub2_Sub4 local28 = new Class2_Sub2_Sub4(this.aClass26_Sub1_1, 6408, arg1.anInt2257, arg1.anInt2261);
		this.aClass26_Sub1_1.method631(local17);
		@Pc(35) boolean local35 = false;
		local17.method4539(local28, 0);
		if (local17.method4552()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt2257, arg1.anInt2261);
			OpenGL.glUseProgramObjectARB(this.aClass74_1.aLong60);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass74_1.aLong60, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass74_1.aLong60, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass74_1.aLong60, "sampleSize"), 1.0F / (float) arg2.anInt2257, 1.0F / (float) arg2.anInt2261);
			for (@Pc(104) int local104 = 0; local104 < arg1.anInt2262; local104++) {
				@Pc(113) float local113 = (float) local104 / (float) arg1.anInt2262;
				this.aClass26_Sub1_1.method673(arg2);
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
				arg1.method1684(arg1.anInt2261, local104, arg1.anInt2257);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local35 = true;
		}
		local17.method4548(0);
		this.aClass26_Sub1_1.method635(local17);
		return local35;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	public boolean method217() {
		if (this.aClass26_Sub1_1.aBoolean80 && this.aClass26_Sub1_1.aBoolean62 && this.aClass74_1 == null) {
			@Pc(17) Class235 local17 = Static102.method1620("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass26_Sub1_1, 35632);
			if (local17 != null) {
				this.aClass74_1 = Static436.method5907(this.aClass26_Sub1_1, new Class235[] { local17 });
			}
		}
		return this.aClass74_1 != null;
	}
}
