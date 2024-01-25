import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class47 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!ru;")
	private Class210 aClass210_2;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_8;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class47(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Z")
	public boolean method1248() {
		if (this.aClass19_Sub2_8.aBoolean191 && this.aClass19_Sub2_8.aBoolean214 && this.aClass210_2 == null) {
			@Pc(26) Class267 local26 = Static325.method4397(this.aClass19_Sub2_8, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local26 != null) {
				this.aClass210_2 = Static256.method3694(new Class267[] { local26 }, this.aClass19_Sub2_8);
			}
		}
		return this.aClass210_2 != null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FLclient!cf;ILclient!cf;)Z")
	public boolean method1250(@OriginalArg(0) float arg0, @OriginalArg(1) Class6_Sub3 arg1, @OriginalArg(3) Class6_Sub3 arg2) {
		if (!this.method1248()) {
			return false;
		}
		@Pc(15) Class150 local15 = this.aClass19_Sub2_8.aClass150_2;
		@Pc(26) Class4_Sub1_Sub13 local26 = new Class4_Sub1_Sub13(this.aClass19_Sub2_8, 6408, arg2.anInt833, arg2.anInt841);
		this.aClass19_Sub2_8.method1922(local15);
		@Pc(38) boolean local38 = false;
		local15.method3614(local26, 0);
		if (local15.method3616()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt833, arg2.anInt841);
			OpenGL.glUseProgramObjectARB(this.aClass210_2.aLong202);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass210_2.aLong202, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass210_2.aLong202, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass210_2.aLong202, "sampleSize"), 1.0F / (float) arg1.anInt833, 1.0F / (float) arg1.anInt841);
			for (@Pc(107) int local107 = 0; local107 < arg2.anInt835; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg2.anInt835;
				this.aClass19_Sub2_8.method1905(arg1);
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
				arg2.method793(arg2.anInt833, local107, arg2.anInt841);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local15.method3611(0);
		this.aClass19_Sub2_8.method1971(local15);
		return local38;
	}
}
