import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class188 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!v;")
	private Class249 aClass249_3;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_26;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class188(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_26 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z")
	public boolean method4068() {
		if (this.aClass121_Sub2_26.aBoolean466 && this.aClass121_Sub2_26.aBoolean465 && this.aClass249_3 == null) {
			@Pc(22) Class259 local22 = Static216.method3232(35632, this.aClass121_Sub2_26, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local22 != null) {
				this.aClass249_3 = Static309.method4242(this.aClass121_Sub2_26, new Class259[] { local22 });
			}
		}
		return this.aClass249_3 != null;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!bd;Lclient!bd;IF)Z")
	public boolean method4071(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class21_Sub1 arg1, @OriginalArg(3) float arg2) {
		if (!this.method4068()) {
			return false;
		}
		@Pc(15) Class19 local15 = this.aClass121_Sub2_26.aClass19_4;
		@Pc(34) Class1_Sub1_Sub7 local34 = new Class1_Sub1_Sub7(this.aClass121_Sub2_26, 6408, arg0.anInt427, arg0.anInt421);
		this.aClass121_Sub2_26.method4675(local15);
		@Pc(41) boolean local41 = false;
		local15.method315(local34, 0);
		if (local15.method320()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt427, arg0.anInt421);
			OpenGL.glUseProgramObjectARB(this.aClass249_3.aLong215);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass249_3.aLong215, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass249_3.aLong215, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass249_3.aLong215, "sampleSize"), 1.0F / (float) arg1.anInt427, 1.0F / (float) arg1.anInt421);
			for (@Pc(110) int local110 = 0; local110 < arg0.anInt428; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg0.anInt428;
				this.aClass121_Sub2_26.method4681(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local119);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local119);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local119);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local119);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method353(local110, arg0.anInt421, arg0.anInt427);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local41 = true;
			OpenGL.glPopMatrix();
		}
		local15.method321(0);
		this.aClass121_Sub2_26.method4699(local15);
		return local41;
	}
}
