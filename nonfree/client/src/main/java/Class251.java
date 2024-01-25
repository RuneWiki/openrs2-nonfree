import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class251 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!fr;")
	private Class107 aClass107_3;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_29;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class251(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_29 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(FBLclient!pfa;Lclient!pfa;)Z")
	public boolean method6099(@OriginalArg(0) float arg0, @OriginalArg(2) Class77_Sub2 arg1, @OriginalArg(3) Class77_Sub2 arg2) {
		if (!this.method6100()) {
			return false;
		}
		@Pc(20) Class51 local20 = this.aClass44_Sub3_29.aClass51_5;
		@Pc(31) Class4_Sub5_Sub13 local31 = new Class4_Sub5_Sub13(this.aClass44_Sub3_29, 6408, arg2.anInt7644, arg2.anInt7646);
		this.aClass44_Sub3_29.method4626(local20);
		@Pc(38) boolean local38 = false;
		local20.method1096(local31, 0);
		if (local20.method1102()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt7644, arg2.anInt7646);
			OpenGL.glUseProgramObjectARB(this.aClass107_3.aLong74);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass107_3.aLong74, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass107_3.aLong74, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass107_3.aLong74, "sampleSize"), 1.0F / (float) arg1.anInt7644, 1.0F / (float) arg1.anInt7646);
			for (@Pc(107) int local107 = 0; local107 < arg2.anInt7643; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg2.anInt7643;
				this.aClass44_Sub3_29.method4605(arg1);
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
				arg2.method6304(local107, arg2.anInt7646, arg2.anInt7644);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local20.method1100(0);
		this.aClass44_Sub3_29.method4627(local20);
		return local38;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	public boolean method6100() {
		if (this.aClass44_Sub3_29.aBoolean412 && this.aClass44_Sub3_29.aBoolean407 && this.aClass107_3 == null) {
			@Pc(23) Class27 local23 = Static487.method7237(this.aClass44_Sub3_29, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
			if (local23 != null) {
				this.aClass107_3 = Static391.method6206(new Class27[] { local23 }, this.aClass44_Sub3_29);
			}
		}
		return this.aClass107_3 != null;
	}
}
