import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class293 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Lclient!is;")
	private Class138 aClass138_7;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_40;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class293(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_40 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
	public boolean method7165() {
		if (this.aClass5_Sub1_40.aBoolean43 && this.aClass5_Sub1_40.aBoolean36 && this.aClass138_7 == null) {
			@Pc(17) Class206 local17 = Static403.method6129("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass5_Sub1_40, 35632);
			if (local17 != null) {
				this.aClass138_7 = Static345.method5497(new Class206[] { local17 }, this.aClass5_Sub1_40);
			}
		}
		return this.aClass138_7 != null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!rv;FLclient!rv;)Z")
	public boolean method7171(@OriginalArg(1) Class11_Sub2 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class11_Sub2 arg2) {
		if (!this.method7165()) {
			return false;
		}
		@Pc(15) Class141 local15 = this.aClass5_Sub1_40.aClass141_1;
		@Pc(26) Class3_Sub10_Sub14 local26 = new Class3_Sub10_Sub14(this.aClass5_Sub1_40, 6408, arg0.anInt7938, arg0.anInt7943);
		this.aClass5_Sub1_40.method394(local15);
		@Pc(33) boolean local33 = false;
		local15.method3974(0, local26);
		if (local15.method3977()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt7938, arg0.anInt7943);
			OpenGL.glUseProgramObjectARB(this.aClass138_7.aLong119);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass138_7.aLong119, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass138_7.aLong119, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass138_7.aLong119, "sampleSize"), 1.0F / (float) arg2.anInt7938, 1.0F / (float) arg2.anInt7943);
			for (@Pc(110) int local110 = 0; local110 < arg0.anInt7946; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg0.anInt7946;
				this.aClass5_Sub1_40.method423(arg2);
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
				arg0.method6570(arg0.anInt7938, local110, arg0.anInt7943);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method3978(0);
		this.aClass5_Sub1_40.method389(local15);
		return local33;
	}
}
