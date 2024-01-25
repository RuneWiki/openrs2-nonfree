import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class147 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!fe;")
	private Class72 aClass72_7;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_23;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class147(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_23 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!is;IFLclient!is;)Z")
	public boolean method3379(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		if (!this.method3380()) {
			return false;
		}
		@Pc(13) Class238 local13 = this.aClass39_Sub2_23.aClass238_3;
		@Pc(24) Class1_Sub2_Sub7 local24 = new Class1_Sub2_Sub7(this.aClass39_Sub2_23, 6408, arg0.anInt3244, arg0.anInt3243);
		@Pc(26) boolean local26 = false;
		this.aClass39_Sub2_23.method3198(local13);
		local13.method5317(local24, 0);
		if (local13.method5321()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt3244, arg0.anInt3243);
			OpenGL.glUseProgramObjectARB(this.aClass72_7.aLong73);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass72_7.aLong73, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass72_7.aLong73, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass72_7.aLong73, "sampleSize"), 1.0F / (float) arg2.anInt3244, 1.0F / (float) arg2.anInt3243);
			for (@Pc(108) int local108 = 0; local108 < arg0.anInt3246; local108++) {
				@Pc(116) float local116 = (float) local108 / (float) arg0.anInt3246;
				this.aClass39_Sub2_23.method3203(arg2);
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
				arg0.method2817(local108, arg0.anInt3243, arg0.anInt3244);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local26 = true;
		}
		local13.method5322(0);
		this.aClass39_Sub2_23.method3197(local13);
		return local26;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
	public boolean method3380() {
		if (this.aClass39_Sub2_23.aBoolean251 && this.aClass39_Sub2_23.aBoolean256 && this.aClass72_7 == null) {
			@Pc(22) Class224 local22 = Static92.method1684("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass39_Sub2_23, 35632);
			if (local22 != null) {
				this.aClass72_7 = Static346.method4845(this.aClass39_Sub2_23, new Class224[] { local22 });
			}
		}
		return this.aClass72_7 != null;
	}
}
