import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class16 {

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "Lclient!pi;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_3;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class16(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z")
	public boolean method590() {
		if (this.aClass4_Sub3_3.aBoolean448 && this.aClass4_Sub3_3.aBoolean424 && this.aClass227_1 == null) {
			@Pc(27) Class205 local27 = Static60.method1520(this.aClass4_Sub3_3, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local27 != null) {
				this.aClass227_1 = Static136.method5800(new Class205[] { local27 }, this.aClass4_Sub3_3);
			}
		}
		return this.aClass227_1 != null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IFLclient!lh;Lclient!lh;)Z")
	public boolean method591(@OriginalArg(1) float arg0, @OriginalArg(2) Class164_Sub2 arg1, @OriginalArg(3) Class164_Sub2 arg2) {
		if (!this.method590()) {
			return false;
		}
		@Pc(17) Class89 local17 = this.aClass4_Sub3_3.aClass89_6;
		@Pc(28) Class1_Sub2_Sub5 local28 = new Class1_Sub2_Sub5(this.aClass4_Sub3_3, 6408, arg2.anInt5252, arg2.anInt5250);
		@Pc(30) boolean local30 = false;
		this.aClass4_Sub3_3.method5263(local17);
		local17.method2256(0, local28);
		if (local17.method2261()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt5252, arg2.anInt5250);
			OpenGL.glUseProgramObjectARB(this.aClass227_1.aLong185);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass227_1.aLong185, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass227_1.aLong185, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass227_1.aLong185, "sampleSize"), 1.0F / (float) arg1.anInt5252, 1.0F / (float) arg1.anInt5250);
			for (@Pc(104) int local104 = 0; local104 < arg2.anInt5251; local104++) {
				@Pc(113) float local113 = (float) local104 / (float) arg2.anInt5251;
				this.aClass4_Sub3_3.method5250(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local113);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local113);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local113);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local113);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method4850(arg2.anInt5252, arg2.anInt5250, local104);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local30 = true;
		}
		local17.method2253(0);
		this.aClass4_Sub3_3.method5276(local17);
		return local30;
	}
}
