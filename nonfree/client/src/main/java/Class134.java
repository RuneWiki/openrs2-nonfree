import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class134 {

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!br;")
	private Class26 aClass26_3;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_27;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class134(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_27 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IFLclient!fd;Lclient!fd;)Z")
	public boolean method2820(@OriginalArg(1) float arg0, @OriginalArg(2) Class31_Sub2 arg1, @OriginalArg(3) Class31_Sub2 arg2) {
		if (!this.method2824()) {
			return false;
		}
		@Pc(15) Class11 local15 = this.aClass200_Sub2_27.aClass11_3;
		@Pc(26) Class5_Sub2_Sub5 local26 = new Class5_Sub2_Sub5(this.aClass200_Sub2_27, 6408, arg1.anInt1939, arg1.anInt1936);
		this.aClass200_Sub2_27.method5328(local15);
		@Pc(33) boolean local33 = false;
		local15.method202(local26, 0);
		if (local15.method195()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt1939, arg1.anInt1936);
			OpenGL.glUseProgramObjectARB(this.aClass26_3.aLong37);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass26_3.aLong37, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass26_3.aLong37, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass26_3.aLong37, "sampleSize"), 1.0F / (float) arg2.anInt1939, 1.0F / (float) arg2.anInt1936);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt1938; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt1938;
				this.aClass200_Sub2_27.method5312(arg2);
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
				arg1.method1579(local102, arg1.anInt1939, arg1.anInt1936);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method203(0);
		this.aClass200_Sub2_27.method5345(local15);
		return local33;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z")
	public boolean method2824() {
		if (this.aClass200_Sub2_27.aBoolean435 && this.aClass200_Sub2_27.aBoolean441 && this.aClass26_3 == null) {
			@Pc(23) Class54 local23 = Static4.method41("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass200_Sub2_27);
			if (local23 != null) {
				this.aClass26_3 = Static148.method2145(new Class54[] { local23 }, this.aClass200_Sub2_27);
			}
		}
		return this.aClass26_3 != null;
	}
}
