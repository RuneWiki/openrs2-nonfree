import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class204 {

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!fp;")
	private Class122 aClass122_5;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_23;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class204(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
	public boolean method4776() {
		if (this.aClass22_Sub1_23.aBoolean66 && this.aClass22_Sub1_23.aBoolean73 && this.aClass122_5 == null) {
			@Pc(34) Class328 local34 = Static77.method1637("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass22_Sub1_23, 35632);
			if (local34 != null) {
				this.aClass122_5 = Static88.method1894(new Class328[] { local34 }, this.aClass22_Sub1_23);
			}
		}
		return this.aClass122_5 != null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(FLclient!nh;Lclient!nh;I)Z")
	public boolean method4779(@OriginalArg(0) float arg0, @OriginalArg(1) Class125_Sub3 arg1, @OriginalArg(2) Class125_Sub3 arg2) {
		if (!this.method4776()) {
			return false;
		}
		@Pc(18) Class52 local18 = this.aClass22_Sub1_23.aClass52_2;
		@Pc(29) Class3_Sub7_Sub4 local29 = new Class3_Sub7_Sub4(this.aClass22_Sub1_23, 6408, arg1.anInt6758, arg1.anInt6762);
		@Pc(31) boolean local31 = false;
		this.aClass22_Sub1_23.method959(local18);
		local18.method1515(local29, 0);
		if (local18.method1510()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt6758, arg1.anInt6762);
			OpenGL.glUseProgramObjectARB(this.aClass122_5.aLong126);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass122_5.aLong126, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass122_5.aLong126, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass122_5.aLong126, "sampleSize"), 1.0F / (float) arg2.anInt6758, 1.0F / (float) arg2.anInt6762);
			for (@Pc(119) int local119 = 0; local119 < arg1.anInt6760; local119++) {
				@Pc(130) float local130 = (float) local119 / (float) arg1.anInt6760;
				this.aClass22_Sub1_23.method955(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local130);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local130);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local130);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local130);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method5850(arg1.anInt6758, arg1.anInt6762, local119);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local31 = true;
			OpenGL.glPopMatrix();
		}
		local18.method1512(0);
		this.aClass22_Sub1_23.method923(local18);
		return local31;
	}
}
