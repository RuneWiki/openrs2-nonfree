import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class264 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!ie;")
	private Class113 aClass113_7;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_41;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class264(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_41 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Z")
	public boolean method5602() {
		if (this.aClass163_Sub2_41.aBoolean368 && this.aClass163_Sub2_41.aBoolean362 && this.aClass113_7 == null) {
			@Pc(17) Class19 local17 = Static22.method267(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass163_Sub2_41);
			if (local17 != null) {
				this.aClass113_7 = Static125.method1834(new Class19[] { local17 }, this.aClass163_Sub2_41);
			}
		}
		return this.aClass113_7 != null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!cl;FBLclient!cl;)Z")
	public boolean method5604(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class20_Sub2 arg2) {
		if (!this.method5602()) {
			return false;
		}
		@Pc(15) Class61 local15 = this.aClass163_Sub2_41.aClass61_6;
		@Pc(26) Class2_Sub5_Sub14 local26 = new Class2_Sub5_Sub14(this.aClass163_Sub2_41, 6408, arg2.anInt938, arg2.anInt939);
		this.aClass163_Sub2_41.method4142(local15);
		@Pc(33) boolean local33 = false;
		local15.method1401(local26, 0);
		if (local15.method1410()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt938, arg2.anInt939);
			OpenGL.glUseProgramObjectARB(this.aClass113_7.aLong104);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass113_7.aLong104, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass113_7.aLong104, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass113_7.aLong104, "sampleSize"), 1.0F / (float) arg0.anInt938, 1.0F / (float) arg0.anInt939);
			for (@Pc(108) int local108 = 0; local108 < arg2.anInt940; local108++) {
				@Pc(117) float local117 = (float) local108 / (float) arg2.anInt940;
				this.aClass163_Sub2_41.method4118(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local117);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local117);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local117);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local117);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method758(local108, arg2.anInt939, arg2.anInt938);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method1407(0);
		this.aClass163_Sub2_41.method4111(local15);
		return local33;
	}
}
