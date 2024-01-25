import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class121 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!kj;")
	private Class212 aClass212_1;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_13;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class121(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_13 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!cka;FILclient!cka;)Z")
	public boolean method2619(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class64_Sub1 arg2) {
		if (!this.method2620()) {
			return false;
		}
		@Pc(16) Class155 local16 = this.aClass145_Sub3_13.aClass155_7;
		@Pc(27) Class2_Sub6_Sub4 local27 = new Class2_Sub6_Sub4(this.aClass145_Sub3_13, 6408, arg0.anInt1517, arg0.anInt1510);
		this.aClass145_Sub3_13.method8906(local16);
		@Pc(36) boolean local36 = false;
		local16.method3382(0, local27);
		if (local16.method3383()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt1517, arg0.anInt1510);
			OpenGL.glUseProgramObjectARB(this.aClass212_1.aLong162);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass212_1.aLong162, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass212_1.aLong162, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass212_1.aLong162, "sampleSize"), 1.0F / (float) arg2.anInt1517, 1.0F / (float) arg2.anInt1510);
			for (@Pc(111) int local111 = 0; local111 < arg0.anInt1512; local111++) {
				@Pc(122) float local122 = (float) local111 / (float) arg0.anInt1512;
				this.aClass145_Sub3_13.method8872(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local122);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local122);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local122);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local122);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method1324(local111, arg0.anInt1517, arg0.anInt1510);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local36 = true;
		}
		local16.method3380(0);
		this.aClass145_Sub3_13.method8863(local16);
		return local36;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
	public boolean method2620() {
		if (this.aClass145_Sub3_13.aBoolean876 && this.aClass145_Sub3_13.aBoolean853 && this.aClass212_1 == null) {
			@Pc(33) Class87 local33 = Static507.method7183("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass145_Sub3_13, 35632);
			if (local33 != null) {
				this.aClass212_1 = Static404.method5980(new Class87[] { local33 }, 73, this.aClass145_Sub3_13);
			}
		}
		return this.aClass212_1 != null;
	}
}
