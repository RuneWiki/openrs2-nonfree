import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class346 {

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!vc;")
	private Class364 aClass364_7;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_37;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class346(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!bv;Lclient!bv;F)Z")
	public boolean method8622(@OriginalArg(1) Class32_Sub2 arg0, @OriginalArg(2) Class32_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method8625()) {
			return false;
		}
		@Pc(16) Class76 local16 = this.aClass57_Sub2_37.aClass76_2;
		@Pc(27) Class5_Sub5_Sub20 local27 = new Class5_Sub5_Sub20(this.aClass57_Sub2_37, 6408, arg0.anInt892, arg0.anInt898);
		@Pc(29) boolean local29 = false;
		this.aClass57_Sub2_37.method2384(local16);
		local16.method1347(0, local27);
		if (local16.method1346()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt892, arg0.anInt898);
			OpenGL.glUseProgramObjectARB(this.aClass364_7.aLong292);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass364_7.aLong292, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass364_7.aLong292, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass364_7.aLong292, "sampleSize"), 1.0F / (float) arg1.anInt892, 1.0F / (float) arg1.anInt898);
			for (@Pc(109) int local109 = 0; local109 < arg0.anInt900; local109++) {
				@Pc(120) float local120 = (float) local109 / (float) arg0.anInt900;
				this.aClass57_Sub2_37.method2362(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local120);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local120);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local120);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local120);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method841(arg0.anInt898, arg0.anInt892, local109);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local29 = true;
		}
		local16.method1338(0);
		this.aClass57_Sub2_37.method2375(local16);
		return local29;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Z")
	public boolean method8625() {
		if (this.aClass57_Sub2_37.aBoolean234 && this.aClass57_Sub2_37.aBoolean220 && this.aClass364_7 == null) {
			@Pc(32) Class388 local32 = Static542.method7939(this.aClass57_Sub2_37, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local32 != null) {
				this.aClass364_7 = Static586.method8421(this.aClass57_Sub2_37, (byte) -127, new Class388[] { local32 });
			}
		}
		return this.aClass364_7 != null;
	}
}
