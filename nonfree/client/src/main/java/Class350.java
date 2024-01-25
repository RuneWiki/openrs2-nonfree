import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class350 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!ima;")
	private Class175 aClass175_6;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_38;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class350(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Z")
	public boolean method8300() {
		if (this.aClass67_Sub2_38.aBoolean309 && this.aClass67_Sub2_38.aBoolean307 && this.aClass175_6 == null) {
			@Pc(23) Class127 local23 = Static304.method4645("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass67_Sub2_38);
			if (local23 != null) {
				this.aClass175_6 = Static435.method6374(this.aClass67_Sub2_38, -104, new Class127[] { local23 });
			}
		}
		return this.aClass175_6 != null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!oka;Lclient!oka;FI)Z")
	public boolean method8301(@OriginalArg(0) Class245_Sub3 arg0, @OriginalArg(1) Class245_Sub3 arg1, @OriginalArg(2) float arg2) {
		if (!this.method8300()) {
			return false;
		}
		@Pc(16) Class339 local16 = this.aClass67_Sub2_38.aClass339_4;
		@Pc(34) Class3_Sub4_Sub16 local34 = new Class3_Sub4_Sub16(this.aClass67_Sub2_38, 6408, arg0.anInt8102, arg0.anInt8098);
		@Pc(36) boolean local36 = false;
		this.aClass67_Sub2_38.method3253(local16);
		local16.method8073(0, local34);
		if (local16.method8070()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt8102, arg0.anInt8098);
			OpenGL.glUseProgramObjectARB(this.aClass175_6.aLong173);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong173, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong173, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass175_6.aLong173, "sampleSize"), 1.0F / (float) arg1.anInt8102, 1.0F / (float) arg1.anInt8098);
			for (@Pc(116) int local116 = 0; local116 < arg0.anInt8104; local116++) {
				@Pc(127) float local127 = (float) local116 / (float) arg0.anInt8104;
				this.aClass67_Sub2_38.method3234(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local127);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local127);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local127);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local127);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method6825(arg0.anInt8102, arg0.anInt8098, local116);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local36 = true;
			OpenGL.glPopMatrix();
		}
		local16.method8077(0);
		this.aClass67_Sub2_38.method3223(local16);
		return local36;
	}
}
