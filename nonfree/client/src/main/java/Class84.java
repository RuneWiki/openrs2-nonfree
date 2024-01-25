import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class84 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!lj;")
	private Class200 aClass200_1;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_5;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class84(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!jm;BFLclient!jm;)Z")
	public boolean method2328(@OriginalArg(0) Class132_Sub2 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class132_Sub2 arg2) {
		if (!this.method2329()) {
			return false;
		}
		@Pc(15) Class89 local15 = this.aClass9_Sub2_5.aClass89_1;
		@Pc(26) Class6_Sub4_Sub13 local26 = new Class6_Sub4_Sub13(this.aClass9_Sub2_5, 6408, arg0.anInt5108, arg0.anInt5106);
		@Pc(28) boolean local28 = false;
		this.aClass9_Sub2_5.method821(local15);
		local15.method2371(local26, 0);
		if (local15.method2370()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt5108, arg0.anInt5106);
			OpenGL.glUseProgramObjectARB(this.aClass200_1.aLong136);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass200_1.aLong136, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass200_1.aLong136, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass200_1.aLong136, "sampleSize"), 1.0F / (float) arg2.anInt5108, 1.0F / (float) arg2.anInt5106);
			for (@Pc(102) int local102 = 0; local102 < arg0.anInt5109; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg0.anInt5109;
				this.aClass9_Sub2_5.method814(arg2);
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
				arg0.method4416(local102, arg0.anInt5106, arg0.anInt5108);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method2382(0);
		this.aClass9_Sub2_5.method767(local15);
		return local28;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
	public boolean method2329() {
		if (this.aClass9_Sub2_5.aBoolean70 && this.aClass9_Sub2_5.aBoolean47 && this.aClass200_1 == null) {
			@Pc(17) Class72 local17 = Static568.method8021("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass9_Sub2_5);
			if (local17 != null) {
				this.aClass200_1 = Static147.method2698(new Class72[] { local17 }, this.aClass9_Sub2_5);
			}
		}
		return this.aClass200_1 != null;
	}
}
