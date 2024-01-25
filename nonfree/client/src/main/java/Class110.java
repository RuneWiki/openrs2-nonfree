import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class110 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!eq;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_22;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class110(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!iv;Lclient!iv;FB)Z")
	public boolean method2636(@OriginalArg(0) Class8_Sub4 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method2637()) {
			return false;
		}
		@Pc(13) Class131 local13 = this.aClass106_Sub2_22.aClass131_1;
		@Pc(24) Class1_Sub1_Sub4 local24 = new Class1_Sub1_Sub4(this.aClass106_Sub2_22, 6408, arg1.anInt3963, arg1.anInt3968);
		this.aClass106_Sub2_22.method2870(local13);
		@Pc(31) boolean local31 = false;
		local13.method3143(local24, 0);
		if (local13.method3154()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt3963, arg1.anInt3968);
			OpenGL.glUseProgramObjectARB(this.aClass77_1.aLong69);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass77_1.aLong69, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass77_1.aLong69, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass77_1.aLong69, "sampleSize"), 1.0F / (float) arg0.anInt3963, 1.0F / (float) arg0.anInt3968);
			for (@Pc(108) int local108 = 0; local108 < arg1.anInt3964; local108++) {
				@Pc(116) float local116 = (float) local108 / (float) arg1.anInt3964;
				this.aClass106_Sub2_22.method2912(arg0);
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
				arg1.method3078(arg1.anInt3963, local108, arg1.anInt3968);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local31 = true;
			OpenGL.glPopMatrix();
		}
		local13.method3146(0);
		this.aClass106_Sub2_22.method2857(local13);
		return local31;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Z")
	public boolean method2637() {
		if (this.aClass106_Sub2_22.aBoolean233 && this.aClass106_Sub2_22.aBoolean232 && this.aClass77_1 == null) {
			@Pc(17) Class10 local17 = Static403.method5533(35632, this.aClass106_Sub2_22, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass77_1 = Static86.method1530(new Class10[] { local17 }, this.aClass106_Sub2_22);
			}
		}
		return this.aClass77_1 != null;
	}
}
