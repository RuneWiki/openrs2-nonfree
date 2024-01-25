import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class41 {

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!vr;")
	private Class384 aClass384_1;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class41(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!nu;Lclient!nu;F)Z")
	public boolean method562(@OriginalArg(1) Class44_Sub3 arg0, @OriginalArg(2) Class44_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method563()) {
			return false;
		}
		@Pc(16) Class146 local16 = this.aClass75_Sub3_1.aClass146_2;
		@Pc(27) Class6_Sub2_Sub12 local27 = new Class6_Sub2_Sub12(this.aClass75_Sub3_1, 6408, arg0.anInt7134, arg0.anInt7138);
		@Pc(29) boolean local29 = false;
		this.aClass75_Sub3_1.method5769(local16);
		local16.method3883(local27, 0);
		if (local16.method3884()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt7134, arg0.anInt7138);
			OpenGL.glUseProgramObjectARB(this.aClass384_1.aLong333);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass384_1.aLong333, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass384_1.aLong333, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass384_1.aLong333, "sampleSize"), 1.0F / (float) arg1.anInt7134, 1.0F / (float) arg1.anInt7138);
			for (@Pc(109) int local109 = 0; local109 < arg0.anInt7133; local109++) {
				@Pc(120) float local120 = (float) local109 / (float) arg0.anInt7133;
				this.aClass75_Sub3_1.method5774(arg1);
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
				arg0.method6272(local109, arg0.anInt7134, arg0.anInt7138);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local29 = true;
		}
		local16.method3887(0);
		this.aClass75_Sub3_1.method5791(local16);
		return local29;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Z")
	public boolean method563() {
		if (this.aClass75_Sub3_1.aBoolean473 && this.aClass75_Sub3_1.aBoolean494 && this.aClass384_1 == null) {
			@Pc(31) Class362 local31 = Static182.method3448(35632, this.aClass75_Sub3_1, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local31 != null) {
				this.aClass384_1 = Static420.method6421(this.aClass75_Sub3_1, new Class362[] { local31 });
			}
		}
		return this.aClass384_1 != null;
	}
}
