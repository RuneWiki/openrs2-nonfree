import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class193 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!waa;")
	private Class369 aClass369_3;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_23;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class193(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z")
	public boolean method4090() {
		if (this.aClass95_Sub1_23.aBoolean184 && this.aClass95_Sub1_23.aBoolean179 && this.aClass369_3 == null) {
			@Pc(21) Class83 local21 = Static547.method7553("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass95_Sub1_23, 35632);
			if (local21 != null) {
				this.aClass369_3 = Static238.method3336(this.aClass95_Sub1_23, new Class83[] { local21 });
			}
		}
		return this.aClass369_3 != null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!dv;Lclient!dv;IF)Z")
	public boolean method4091(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class65_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method4090()) {
			return false;
		}
		@Pc(20) Class333 local20 = this.aClass95_Sub1_23.aClass333_2;
		@Pc(31) Class2_Sub2_Sub13 local31 = new Class2_Sub2_Sub13(this.aClass95_Sub1_23, 6408, arg1.anInt2080, arg1.anInt2077);
		this.aClass95_Sub1_23.method2090(local20);
		@Pc(38) boolean local38 = false;
		local20.method7491(local31, 0);
		if (local20.method7490()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt2080, arg1.anInt2077);
			OpenGL.glUseProgramObjectARB(this.aClass369_3.aLong271);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass369_3.aLong271, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass369_3.aLong271, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass369_3.aLong271, "sampleSize"), 1.0F / (float) arg0.anInt2080, 1.0F / (float) arg0.anInt2077);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt2076; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt2076;
				this.aClass95_Sub1_23.method2077(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local116);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local116);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local116);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local116);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method1699(local107, arg1.anInt2077, arg1.anInt2080);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local38 = true;
		}
		local20.method7485(0);
		this.aClass95_Sub1_23.method2070(local20);
		return local38;
	}
}
