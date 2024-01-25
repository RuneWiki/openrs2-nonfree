import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class55 {

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!ss;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_9;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class55(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Z")
	public boolean method1360() {
		if (this.aClass75_Sub2_9.aBoolean220 && this.aClass75_Sub2_9.aBoolean219 && this.aClass213_1 == null) {
			@Pc(19) Class86 local19 = Static207.method3388(this.aClass75_Sub2_9, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local19 != null) {
				this.aClass213_1 = Static426.method5667(this.aClass75_Sub2_9, new Class86[] { local19 });
			}
		}
		return this.aClass213_1 != null;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!rg;FILclient!rg;)Z")
	public boolean method1361(@OriginalArg(0) Class42_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class42_Sub4 arg2) {
		if (!this.method1360()) {
			return false;
		}
		@Pc(21) Class122 local21 = this.aClass75_Sub2_9.aClass122_2;
		@Pc(32) Class3_Sub3_Sub11 local32 = new Class3_Sub3_Sub11(this.aClass75_Sub2_9, 6408, arg2.anInt6252, arg2.anInt6250);
		this.aClass75_Sub2_9.method2432(local21);
		@Pc(39) boolean local39 = false;
		local21.method3167(0, local32);
		if (local21.method3174()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt6252, arg2.anInt6250);
			OpenGL.glUseProgramObjectARB(this.aClass213_1.aLong194);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass213_1.aLong194, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass213_1.aLong194, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass213_1.aLong194, "sampleSize"), 1.0F / (float) arg0.anInt6252, 1.0F / (float) arg0.anInt6250);
			for (@Pc(108) int local108 = 0; local108 < arg2.anInt6247; local108++) {
				@Pc(116) float local116 = (float) local108 / (float) arg2.anInt6247;
				this.aClass75_Sub2_9.method2456(arg0);
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
				arg2.method4921(arg2.anInt6252, arg2.anInt6250, local108);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local39 = true;
			OpenGL.glPopMatrix();
		}
		local21.method3165(0);
		this.aClass75_Sub2_9.method2455(local21);
		return local39;
	}
}
