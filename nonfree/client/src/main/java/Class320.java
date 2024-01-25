import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class320 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!tw;")
	private Class356 aClass356_7;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_36;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class320(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_36 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
	public boolean method7901() {
		if (this.aClass144_Sub3_36.aBoolean576 && this.aClass144_Sub3_36.aBoolean578 && this.aClass356_7 == null) {
			@Pc(27) Class95 local27 = Static73.method1220("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass144_Sub3_36, 35632);
			if (local27 != null) {
				this.aClass356_7 = Static264.method4385(new Class95[] { local27 }, this.aClass144_Sub3_36);
			}
		}
		return this.aClass356_7 != null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!pl;ILclient!pl;F)Z")
	public boolean method7904(@OriginalArg(0) Class161_Sub3 arg0, @OriginalArg(2) Class161_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7901()) {
			return false;
		}
		@Pc(14) Class217 local14 = this.aClass144_Sub3_36.aClass217_7;
		@Pc(25) Class14_Sub2_Sub13 local25 = new Class14_Sub2_Sub13(this.aClass144_Sub3_36, 6408, arg1.anInt8157, arg1.anInt8156);
		this.aClass144_Sub3_36.method7006(local14);
		@Pc(47) boolean local47 = false;
		local14.method5189(local25, 0);
		if (local14.method5184()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt8157, arg1.anInt8156);
			OpenGL.glUseProgramObjectARB(this.aClass356_7.aLong275);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass356_7.aLong275, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass356_7.aLong275, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass356_7.aLong275, "sampleSize"), 1.0F / (float) arg0.anInt8157, 1.0F / (float) arg0.anInt8156);
			for (@Pc(122) int local122 = 0; local122 < arg1.anInt8159; local122++) {
				@Pc(130) float local130 = (float) local122 / (float) arg1.anInt8159;
				this.aClass144_Sub3_36.method6982(arg0);
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
				arg1.method7100(arg1.anInt8156, local122, arg1.anInt8157);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local47 = true;
		}
		local14.method5187(0);
		this.aClass144_Sub3_36.method7030(local14);
		return local47;
	}
}
