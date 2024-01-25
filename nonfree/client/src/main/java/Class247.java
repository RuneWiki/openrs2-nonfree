import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class247 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!caa;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_32;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class247(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_32 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!nh;FILclient!nh;)Z")
	public boolean method5593(@OriginalArg(0) Class50_Sub3 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class50_Sub3 arg2) {
		if (!this.method5595()) {
			return false;
		}
		@Pc(15) Class219 local15 = this.aClass31_Sub2_32.aClass219_2;
		@Pc(26) Class3_Sub7_Sub14 local26 = new Class3_Sub7_Sub14(this.aClass31_Sub2_32, 6408, arg2.anInt6380, arg2.anInt6387);
		this.aClass31_Sub2_32.method2560(local15);
		@Pc(33) boolean local33 = false;
		local15.method5041(0, local26);
		if (local15.method5046()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt6380, arg2.anInt6387);
			OpenGL.glUseProgramObjectARB(this.aClass45_2.aLong21);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass45_2.aLong21, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass45_2.aLong21, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass45_2.aLong21, "sampleSize"), 1.0F / (float) arg0.anInt6380, 1.0F / (float) arg0.anInt6387);
			for (@Pc(107) int local107 = 0; local107 < arg2.anInt6381; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg2.anInt6381;
				this.aClass31_Sub2_32.method2535(arg0);
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
				arg2.method5151(arg2.anInt6387, local107, arg2.anInt6380);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method5042(0);
		this.aClass31_Sub2_32.method2507(local15);
		return local33;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Z")
	public boolean method5595() {
		if (this.aClass31_Sub2_32.aBoolean229 && this.aClass31_Sub2_32.aBoolean221 && this.aClass45_2 == null) {
			@Pc(25) Class157 local25 = Static524.method7238(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass31_Sub2_32);
			if (local25 != null) {
				this.aClass45_2 = Static467.method6394(this.aClass31_Sub2_32, new Class157[] { local25 });
			}
		}
		return this.aClass45_2 != null;
	}
}
