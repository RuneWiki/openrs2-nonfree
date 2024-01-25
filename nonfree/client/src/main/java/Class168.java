import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class168 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!kba;")
	private Class190 aClass190_2;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_16;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class168(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_16 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!cfa;FLclient!cfa;)Z")
	public boolean method4510(@OriginalArg(1) Class50_Sub1 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class50_Sub1 arg2) {
		if (!this.method4511()) {
			return false;
		}
		@Pc(20) Class39 local20 = this.aClass101_Sub2_16.aClass39_2;
		@Pc(31) Class2_Sub1_Sub17 local31 = new Class2_Sub1_Sub17(this.aClass101_Sub2_16, 6408, arg0.anInt1408, arg0.anInt1409);
		this.aClass101_Sub2_16.method5613(local20);
		@Pc(38) boolean local38 = false;
		local20.method1112(local31, 0);
		if (local20.method1110()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt1408, arg0.anInt1409);
			OpenGL.glUseProgramObjectARB(this.aClass190_2.aLong151);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass190_2.aLong151, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass190_2.aLong151, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass190_2.aLong151, "sampleSize"), 1.0F / (float) arg2.anInt1408, 1.0F / (float) arg2.anInt1409);
			for (@Pc(107) int local107 = 0; local107 < arg0.anInt1403; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg0.anInt1403;
				this.aClass101_Sub2_16.method5690(arg2);
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
				arg0.method1356(arg0.anInt1408, local107, arg0.anInt1409);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local38 = true;
		}
		local20.method1114(0);
		this.aClass101_Sub2_16.method5678(local20);
		return local38;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
	public boolean method4511() {
		if (this.aClass101_Sub2_16.aBoolean463 && this.aClass101_Sub2_16.aBoolean452 && this.aClass190_2 == null) {
			@Pc(26) Class57 local26 = Static524.method8166("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass101_Sub2_16, 35632);
			if (local26 != null) {
				this.aClass190_2 = Static105.method1884(new Class57[] { local26 }, this.aClass101_Sub2_16);
			}
		}
		return this.aClass190_2 != null;
	}
}
