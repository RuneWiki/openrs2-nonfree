import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class323 {

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "Lclient!as;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_35;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class323(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_35 = arg0;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!efa;Lclient!efa;IF)Z")
	public boolean method7609(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7611()) {
			return false;
		}
		@Pc(13) Class161 local13 = this.aClass87_Sub2_35.aClass161_2;
		@Pc(24) Class2_Sub5_Sub15 local24 = new Class2_Sub5_Sub15(this.aClass87_Sub2_35, 6408, arg0.anInt2865, arg0.anInt2856);
		this.aClass87_Sub2_35.method6188(local13);
		@Pc(39) boolean local39 = false;
		local13.method3967(0, local24);
		if (local13.method3960()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2865, arg0.anInt2856);
			OpenGL.glUseProgramObjectARB(this.aClass23_3.aLong24);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass23_3.aLong24, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass23_3.aLong24, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass23_3.aLong24, "sampleSize"), 1.0F / (float) arg1.anInt2865, 1.0F / (float) arg1.anInt2856);
			for (@Pc(108) int local108 = 0; local108 < arg0.anInt2858; local108++) {
				@Pc(116) float local116 = (float) local108 / (float) arg0.anInt2858;
				this.aClass87_Sub2_35.method6167(arg1);
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
				arg0.method2464(local108, arg0.anInt2865, arg0.anInt2856);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local39 = true;
			OpenGL.glPopMatrix();
		}
		local13.method3958(0);
		this.aClass87_Sub2_35.method6184(local13);
		return local39;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z")
	public boolean method7611() {
		if (this.aClass87_Sub2_35.aBoolean546 && this.aClass87_Sub2_35.aBoolean560 && this.aClass23_3 == null) {
			@Pc(23) Class134 local23 = Static532.method7450(35632, this.aClass87_Sub2_35, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local23 != null) {
				this.aClass23_3 = Static85.method1550(new Class134[] { local23 }, this.aClass87_Sub2_35);
			}
		}
		return this.aClass23_3 != null;
	}
}
