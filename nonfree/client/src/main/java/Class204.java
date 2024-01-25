import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class204 {

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!gw;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_23;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class204(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Z")
	public boolean method4645() {
		if (this.aClass95_Sub3_23.aBoolean392 && this.aClass95_Sub3_23.aBoolean378 && this.aClass142_3 == null) {
			@Pc(17) Class232 local17 = Static406.method5599(this.aClass95_Sub3_23, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass142_3 = Static45.method801(new Class232[] { local17 }, this.aClass95_Sub3_23);
			}
		}
		return this.aClass142_3 != null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(FILclient!ah;Lclient!ah;)Z")
	public boolean method4647(@OriginalArg(0) float arg0, @OriginalArg(2) Class10_Sub1 arg1, @OriginalArg(3) Class10_Sub1 arg2) {
		if (!this.method4645()) {
			return false;
		}
		@Pc(15) Class127 local15 = this.aClass95_Sub3_23.aClass127_5;
		@Pc(26) Class3_Sub5_Sub5 local26 = new Class3_Sub5_Sub5(this.aClass95_Sub3_23, 6408, arg1.anInt340, arg1.anInt343);
		@Pc(28) boolean local28 = false;
		this.aClass95_Sub3_23.method4863(local15);
		local15.method2986(local26, 0);
		if (local15.method2988()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt340, arg1.anInt343);
			OpenGL.glUseProgramObjectARB(this.aClass142_3.aLong98);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass142_3.aLong98, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass142_3.aLong98, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass142_3.aLong98, "sampleSize"), 1.0F / (float) arg2.anInt340, 1.0F / (float) arg2.anInt343);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt344; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt344;
				this.aClass95_Sub3_23.method4864(arg2);
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
				arg1.method377(arg1.anInt343, arg1.anInt340, local107);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method2983(0);
		this.aClass95_Sub3_23.method4836(local15);
		return local28;
	}
}
