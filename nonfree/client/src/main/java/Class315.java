import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class315 {

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Lclient!qca;")
	private Class243 aClass243_7;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_43;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class315(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
	public boolean method7499() {
		if (this.aClass122_Sub3_43.aBoolean601 && this.aClass122_Sub3_43.aBoolean589 && this.aClass243_7 == null) {
			@Pc(26) Class221 local26 = Static538.method7473("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass122_Sub3_43, 35632);
			if (local26 != null) {
				this.aClass243_7 = Static37.method843(this.aClass122_Sub3_43, new Class221[] { local26 });
			}
		}
		return this.aClass243_7 != null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!mm;ILclient!mm;F)Z")
	public boolean method7500(@OriginalArg(0) Class73_Sub3 arg0, @OriginalArg(2) Class73_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7499()) {
			return false;
		}
		@Pc(15) Class311 local15 = this.aClass122_Sub3_43.aClass311_6;
		@Pc(31) Class1_Sub1_Sub8 local31 = new Class1_Sub1_Sub8(this.aClass122_Sub3_43, 6408, arg1.anInt5617, arg1.anInt5619);
		@Pc(33) boolean local33 = false;
		this.aClass122_Sub3_43.method6884(local15);
		local15.method7351(0, local31);
		if (local15.method7354()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt5617, arg1.anInt5619);
			OpenGL.glUseProgramObjectARB(this.aClass243_7.aLong296);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass243_7.aLong296, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass243_7.aLong296, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass243_7.aLong296, "sampleSize"), 1.0F / (float) arg0.anInt5617, 1.0F / (float) arg0.anInt5619);
			for (@Pc(109) int local109 = 0; local109 < arg1.anInt5618; local109++) {
				@Pc(118) float local118 = (float) local109 / (float) arg1.anInt5618;
				this.aClass122_Sub3_43.method6850(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local118);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local118);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local118);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local118);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method4803(local109, arg1.anInt5617, arg1.anInt5619);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7356(0);
		this.aClass122_Sub3_43.method6883(local15);
		return local33;
	}
}
