import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class27 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!sj;")
	private Class230 aClass230_2;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_5;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class27(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ga;BLclient!ga;F)Z")
	public boolean method407(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(2) Class40_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method410()) {
			return false;
		}
		@Pc(15) Class166 local15 = this.aClass28_Sub1_5.aClass166_1;
		@Pc(38) Class6_Sub1_Sub13 local38 = new Class6_Sub1_Sub13(this.aClass28_Sub1_5, 6408, arg0.anInt2093, arg0.anInt2089);
		@Pc(40) boolean local40 = false;
		this.aClass28_Sub1_5.method680(local15);
		local15.method3762(local38, 0);
		if (local15.method3758()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2093, arg0.anInt2089);
			OpenGL.glUseProgramObjectARB(this.aClass230_2.aLong180);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass230_2.aLong180, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass230_2.aLong180, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass230_2.aLong180, "sampleSize"), 1.0F / (float) arg1.anInt2093, 1.0F / (float) arg1.anInt2089);
			for (@Pc(114) int local114 = 0; local114 < arg0.anInt2087; local114++) {
				@Pc(123) float local123 = (float) local114 / (float) arg0.anInt2087;
				this.aClass28_Sub1_5.method654(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local123);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local123);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local123);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local123);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method1923(local114, arg0.anInt2093, arg0.anInt2089);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local40 = true;
			OpenGL.glPopMatrix();
		}
		local15.method3763(0);
		this.aClass28_Sub1_5.method659(local15);
		return local40;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z")
	public boolean method410() {
		if (this.aClass28_Sub1_5.aBoolean60 && this.aClass28_Sub1_5.aBoolean44 && this.aClass230_2 == null) {
			@Pc(19) Class243 local19 = Static239.method3725(35632, this.aClass28_Sub1_5, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local19 != null) {
				this.aClass230_2 = Static313.method4477(this.aClass28_Sub1_5, new Class243[] { local19 });
			}
		}
		return this.aClass230_2 != null;
	}
}
