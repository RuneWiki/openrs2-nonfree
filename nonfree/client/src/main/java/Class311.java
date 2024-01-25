import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class311 {

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!dca;")
	private Class51 aClass51_7;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_42;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class311(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!mu;ILclient!mu;F)Z")
	public boolean method7660(@OriginalArg(0) Class19_Sub4 arg0, @OriginalArg(2) Class19_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7662()) {
			return false;
		}
		@Pc(15) Class293 local15 = this.aClass39_Sub3_42.aClass293_6;
		@Pc(26) Class2_Sub13_Sub8 local26 = new Class2_Sub13_Sub8(this.aClass39_Sub3_42, 6408, arg1.anInt5640, arg1.anInt5638);
		@Pc(34) boolean local34 = false;
		this.aClass39_Sub3_42.method5697(local15);
		local15.method7371(local26, 0);
		if (local15.method7368()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt5640, arg1.anInt5638);
			OpenGL.glUseProgramObjectARB(this.aClass51_7.aLong41);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass51_7.aLong41, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass51_7.aLong41, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass51_7.aLong41, "sampleSize"), 1.0F / (float) arg0.anInt5640, 1.0F / (float) arg0.anInt5638);
			for (@Pc(108) int local108 = 0; local108 < arg1.anInt5637; local108++) {
				@Pc(117) float local117 = (float) local108 / (float) arg1.anInt5637;
				this.aClass39_Sub3_42.method5719(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local117);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local117);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local117);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local117);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method4810(local108, arg1.anInt5638, arg1.anInt5640);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local34 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7367(0);
		this.aClass39_Sub3_42.method5696(local15);
		return local34;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Z")
	public boolean method7662() {
		if (this.aClass39_Sub3_42.aBoolean484 && this.aClass39_Sub3_42.aBoolean500 && this.aClass51_7 == null) {
			@Pc(21) Class305 local21 = Static515.method3365("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass39_Sub3_42, 35632);
			if (local21 != null) {
				this.aClass51_7 = Static426.method6568(new Class305[] { local21 }, this.aClass39_Sub3_42);
			}
		}
		return this.aClass51_7 != null;
	}
}
