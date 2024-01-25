import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class268 {

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "Lclient!hw;")
	private Class152 aClass152_6;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_32;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class268(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_32 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(FLclient!ek;ZLclient!ek;)Z")
	public boolean method6471(@OriginalArg(0) float arg0, @OriginalArg(1) Class66_Sub2 arg1, @OriginalArg(3) Class66_Sub2 arg2) {
		if (!this.method6472()) {
			return false;
		}
		@Pc(15) Class125 local15 = this.aClass137_Sub3_32.aClass125_7;
		@Pc(26) Class14_Sub3_Sub12 local26 = new Class14_Sub3_Sub12(this.aClass137_Sub3_32, 6408, arg1.anInt2634, arg1.anInt2629);
		this.aClass137_Sub3_32.method7058(local15);
		@Pc(33) boolean local33 = false;
		local15.method2974(0, local26);
		if (local15.method2968()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt2634, arg1.anInt2629);
			OpenGL.glUseProgramObjectARB(this.aClass152_6.aLong121);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass152_6.aLong121, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass152_6.aLong121, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass152_6.aLong121, "sampleSize"), 1.0F / (float) arg2.anInt2634, 1.0F / (float) arg2.anInt2629);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt2630; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt2630;
				this.aClass137_Sub3_32.method7090(arg2);
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
				arg1.method2189(arg1.anInt2634, local102, arg1.anInt2629);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method2965(0);
		this.aClass137_Sub3_32.method7037(local15);
		return local33;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Z")
	public boolean method6472() {
		if (this.aClass137_Sub3_32.aBoolean608 && this.aClass137_Sub3_32.aBoolean599 && this.aClass152_6 == null) {
			@Pc(27) Class237 local27 = Static489.method7252(35632, this.aClass137_Sub3_32, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local27 != null) {
				this.aClass152_6 = Static174.method9031(new Class237[] { local27 }, this.aClass137_Sub3_32);
			}
		}
		return this.aClass152_6 != null;
	}
}
