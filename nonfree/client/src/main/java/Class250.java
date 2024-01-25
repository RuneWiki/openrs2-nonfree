import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class250 {

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!wba;")
	private Class355 aClass355_5;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_28;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class250(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_28 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fba;Lclient!fba;BF)Z")
	public boolean method5423(@OriginalArg(0) Class46_Sub3 arg0, @OriginalArg(1) Class46_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method5427()) {
			return false;
		}
		@Pc(15) Class343 local15 = this.aClass78_Sub3_28.aClass343_4;
		@Pc(26) Class1_Sub8_Sub19 local26 = new Class1_Sub8_Sub19(this.aClass78_Sub3_28, 6408, arg0.anInt2620, arg0.anInt2619);
		@Pc(28) boolean local28 = false;
		this.aClass78_Sub3_28.method4529(local15);
		local15.method7468(0, local26);
		if (local15.method7469()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2620, arg0.anInt2619);
			OpenGL.glUseProgramObjectARB(this.aClass355_5.aLong264);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass355_5.aLong264, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass355_5.aLong264, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass355_5.aLong264, "sampleSize"), 1.0F / (float) arg1.anInt2620, 1.0F / (float) arg1.anInt2619);
			for (@Pc(102) int local102 = 0; local102 < arg0.anInt2612; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg0.anInt2612;
				this.aClass78_Sub3_28.method4535(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local111);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local111);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local111);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local111);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method2302(arg0.anInt2619, local102, arg0.anInt2620);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7470(0);
		this.aClass78_Sub3_28.method4495(local15);
		return local28;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
	public boolean method5427() {
		if (this.aClass78_Sub3_28.aBoolean428 && this.aClass78_Sub3_28.aBoolean418 && this.aClass355_5 == null) {
			@Pc(17) Class230 local17 = Static226.method3357(this.aClass78_Sub3_28, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass355_5 = Static211.method3208(this.aClass78_Sub3_28, new Class230[] { local17 });
			}
		}
		return this.aClass355_5 != null;
	}
}
