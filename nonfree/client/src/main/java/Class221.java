import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class221 {

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "Lclient!rda;")
	private Class288 aClass288_7;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_29;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class221(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_29 = arg0;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!dl;ILclient!dl;F)Z")
	public boolean method5675(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(2) Class20_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method5676()) {
			return false;
		}
		@Pc(22) Class89 local22 = this.aClass16_Sub3_29.aClass89_7;
		@Pc(33) Class8_Sub5_Sub5 local33 = new Class8_Sub5_Sub5(this.aClass16_Sub3_29, 6408, arg0.anInt2743, arg0.anInt2741);
		this.aClass16_Sub3_29.method6014(local22);
		@Pc(40) boolean local40 = false;
		local22.method2924(local33, 0);
		if (local22.method2925()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2743, arg0.anInt2741);
			OpenGL.glUseProgramObjectARB(this.aClass288_7.aLong223);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass288_7.aLong223, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass288_7.aLong223, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass288_7.aLong223, "sampleSize"), 1.0F / (float) arg1.anInt2743, 1.0F / (float) arg1.anInt2741);
			for (@Pc(109) int local109 = 0; local109 < arg0.anInt2744; local109++) {
				@Pc(118) float local118 = (float) local109 / (float) arg0.anInt2744;
				this.aClass16_Sub3_29.method6020(arg1);
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
				arg0.method2345(arg0.anInt2743, arg0.anInt2741, local109);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local40 = true;
			OpenGL.glPopMatrix();
		}
		local22.method2932(0);
		this.aClass16_Sub3_29.method6016(local22);
		return local40;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)Z")
	public boolean method5676() {
		if (this.aClass16_Sub3_29.aBoolean524 && this.aClass16_Sub3_29.aBoolean523 && this.aClass288_7 == null) {
			@Pc(26) Class362 local26 = Static384.method6163(this.aClass16_Sub3_29, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local26 != null) {
				this.aClass288_7 = Static237.method4354(this.aClass16_Sub3_29, new Class362[] { local26 });
			}
		}
		return this.aClass288_7 != null;
	}
}
