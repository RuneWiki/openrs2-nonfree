import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class112 {

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "Lclient!fm;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_6;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class112(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!kq;FBLclient!kq;)Z")
	public boolean method2787(@OriginalArg(0) Class80_Sub3 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class80_Sub3 arg2) {
		if (!this.method2789()) {
			return false;
		}
		@Pc(13) Class363 local13 = this.aClass65_Sub1_6.aClass363_2;
		@Pc(24) Class5_Sub3_Sub18 local24 = new Class5_Sub3_Sub18(this.aClass65_Sub1_6, 6408, arg0.anInt6042, arg0.anInt6036);
		this.aClass65_Sub1_6.method1299(local13);
		@Pc(39) boolean local39 = false;
		local13.method8451(0, local24);
		if (local13.method8445()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt6042, arg0.anInt6036);
			OpenGL.glUseProgramObjectARB(this.aClass123_1.aLong68);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass123_1.aLong68, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass123_1.aLong68, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass123_1.aLong68, "sampleSize"), 1.0F / (float) arg2.anInt6042, 1.0F / (float) arg2.anInt6036);
			for (@Pc(108) int local108 = 0; local108 < arg0.anInt6041; local108++) {
				@Pc(116) float local116 = (float) local108 / (float) arg0.anInt6041;
				this.aClass65_Sub1_6.method1286(arg2);
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
				arg0.method5017(arg0.anInt6042, local108, arg0.anInt6036);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local39 = true;
		}
		local13.method8446(0);
		this.aClass65_Sub1_6.method1229(local13);
		return local39;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Z")
	public boolean method2789() {
		if (this.aClass65_Sub1_6.aBoolean100 && this.aClass65_Sub1_6.aBoolean101 && this.aClass123_1 == null) {
			@Pc(31) Class206 local31 = Static577.method7970(35632, this.aClass65_Sub1_6, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local31 != null) {
				this.aClass123_1 = Static425.method6297(new Class206[] { local31 }, this.aClass65_Sub1_6);
			}
		}
		return this.aClass123_1 != null;
	}
}
