import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class203 {

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!vca;")
	private Class344 aClass344_3;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_20;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class203(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_20 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)Z")
	public boolean method4527() {
		if (this.aClass66_Sub3_20.aBoolean482 && this.aClass66_Sub3_20.aBoolean469 && this.aClass344_3 == null) {
			@Pc(19) Class312 local19 = Static527.method7358(this.aClass66_Sub3_20, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
			if (local19 != null) {
				this.aClass344_3 = Static80.method1405(new Class312[] { local19 }, this.aClass66_Sub3_20);
			}
		}
		return this.aClass344_3 != null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IFLclient!ij;Lclient!ij;)Z")
	public boolean method4531(@OriginalArg(1) float arg0, @OriginalArg(2) Class114_Sub2 arg1, @OriginalArg(3) Class114_Sub2 arg2) {
		if (!this.method4527()) {
			return false;
		}
		@Pc(15) Class347 local15 = this.aClass66_Sub3_20.aClass347_4;
		@Pc(31) Class4_Sub7_Sub2 local31 = new Class4_Sub7_Sub2(this.aClass66_Sub3_20, 6408, arg2.anInt4574, arg2.anInt4572);
		this.aClass66_Sub3_20.method5391(local15);
		@Pc(38) boolean local38 = false;
		local15.method7680(local31, 0);
		if (local15.method7689()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt4574, arg2.anInt4572);
			OpenGL.glUseProgramObjectARB(this.aClass344_3.aLong283);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass344_3.aLong283, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass344_3.aLong283, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass344_3.aLong283, "sampleSize"), 1.0F / (float) arg1.anInt4574, 1.0F / (float) arg1.anInt4572);
			for (@Pc(107) int local107 = 0; local107 < arg2.anInt4571; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg2.anInt4571;
				this.aClass66_Sub3_20.method5382(arg1);
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
				arg2.method3844(local107, arg2.anInt4574, arg2.anInt4572);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7686(0);
		this.aClass66_Sub3_20.method5410(local15);
		return local38;
	}
}
