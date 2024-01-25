import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class125 {

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!laa;")
	private Class201 aClass201_6;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_22;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class125(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
	public boolean method2991() {
		if (this.aClass100_Sub3_22.aBoolean600 && this.aClass100_Sub3_22.aBoolean588 && this.aClass201_6 == null) {
			@Pc(17) Class10 local17 = Static337.method5151(this.aClass100_Sub3_22, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass201_6 = Static273.method4135(new Class10[] { local17 }, this.aClass100_Sub3_22);
			}
		}
		return this.aClass201_6 != null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!gba;Lclient!gba;FB)Z")
	public boolean method2992(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) float arg2) {
		if (!this.method2991()) {
			return false;
		}
		@Pc(15) Class271 local15 = this.aClass100_Sub3_22.aClass271_7;
		@Pc(31) Class2_Sub3_Sub12 local31 = new Class2_Sub3_Sub12(this.aClass100_Sub3_22, 6408, arg0.anInt3472, arg0.anInt3467);
		this.aClass100_Sub3_22.method6343(local15);
		@Pc(38) boolean local38 = false;
		local15.method6358(0, local31);
		if (local15.method6357()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt3472, arg0.anInt3467);
			OpenGL.glUseProgramObjectARB(this.aClass201_6.aLong134);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass201_6.aLong134, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass201_6.aLong134, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass201_6.aLong134, "sampleSize"), 1.0F / (float) arg1.anInt3472, 1.0F / (float) arg1.anInt3467);
			for (@Pc(107) int local107 = 0; local107 < arg0.anInt3471; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg0.anInt3471;
				this.aClass100_Sub3_22.method6277(arg1);
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
				arg0.method2873(arg0.anInt3472, local107, arg0.anInt3467);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local38 = true;
		}
		local15.method6352(0);
		this.aClass100_Sub3_22.method6298(local15);
		return local38;
	}
}
