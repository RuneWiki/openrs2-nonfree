import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oka")
public final class Class271 {

	@OriginalMember(owner = "client!oka", name = "i", descriptor = "Lclient!ir;")
	private Class175 aClass175_6;

	@OriginalMember(owner = "client!oka", name = "e", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_31;

	@OriginalMember(owner = "client!oka", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class271(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_31 = arg0;
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(ZFLclient!be;Lclient!be;)Z")
	public boolean method6194(@OriginalArg(1) float arg0, @OriginalArg(2) Class29_Sub1 arg1, @OriginalArg(3) Class29_Sub1 arg2) {
		if (!this.method6195()) {
			return false;
		}
		@Pc(16) Class219 local16 = this.aClass100_Sub3_31.aClass219_7;
		@Pc(27) Class5_Sub1_Sub1 local27 = new Class5_Sub1_Sub1(this.aClass100_Sub3_31, 6408, arg2.anInt519, arg2.anInt515);
		@Pc(29) boolean local29 = false;
		this.aClass100_Sub3_31.method8670(local16);
		local16.method4979(local27, 0);
		if (local16.method4974()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt519, arg2.anInt515);
			OpenGL.glUseProgramObjectARB(this.aClass175_6.aLong134);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong134, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong134, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong134, "sampleSize"), 1.0F / (float) arg1.anInt519, 1.0F / (float) arg1.anInt515);
			for (@Pc(109) int local109 = 0; local109 < arg2.anInt521; local109++) {
				@Pc(120) float local120 = (float) local109 / (float) arg2.anInt521;
				this.aClass100_Sub3_31.method8743(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local120);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local120);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local120);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local120);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method558(local109, arg2.anInt515, arg2.anInt519);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local29 = true;
			OpenGL.glPopMatrix();
		}
		local16.method4976(0);
		this.aClass100_Sub3_31.method8748(local16);
		return local29;
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(I)Z")
	public boolean method6195() {
		if (this.aClass100_Sub3_31.aBoolean741 && this.aClass100_Sub3_31.aBoolean738 && this.aClass175_6 == null) {
			@Pc(39) Class224 local39 = Static500.method6963(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass100_Sub3_31);
			if (local39 != null) {
				this.aClass175_6 = Static542.method7425(new Class224[] { local39 }, this.aClass100_Sub3_31);
			}
		}
		return this.aClass175_6 != null;
	}
}
