import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class146 {

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!ej;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_27;

	static {
		new Class131("", 73);
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class146(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_27 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public boolean method3827() {
		if (this.aClass30_Sub1_27.aBoolean60 && this.aClass30_Sub1_27.aBoolean37 && this.aClass63_3 == null) {
			@Pc(29) Class27 local29 = Static15.method256(this.aClass30_Sub1_27, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
			if (local29 != null) {
				this.aClass63_3 = Static325.method4858(this.aClass30_Sub1_27, new Class27[] { local29 });
			}
		}
		return this.aClass63_3 != null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!gh;Lclient!gh;F)Z")
	public boolean method3830(@OriginalArg(1) Class62_Sub1 arg0, @OriginalArg(2) Class62_Sub1 arg1, @OriginalArg(3) float arg2) {
		if (!this.method3827()) {
			return false;
		}
		@Pc(20) Class172 local20 = this.aClass30_Sub1_27.aClass172_1;
		@Pc(31) Class4_Sub1_Sub3 local31 = new Class4_Sub1_Sub3(this.aClass30_Sub1_27, 6408, arg1.anInt2660, arg1.anInt2653);
		this.aClass30_Sub1_27.method734(local20);
		@Pc(38) boolean local38 = false;
		local20.method4338(0, local31);
		if (local20.method4326()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt2660, arg1.anInt2653);
			OpenGL.glUseProgramObjectARB(this.aClass63_3.aLong62);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass63_3.aLong62, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass63_3.aLong62, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass63_3.aLong62, "sampleSize"), 1.0F / (float) arg0.anInt2660, 1.0F / (float) arg0.anInt2653);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt2651; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt2651;
				this.aClass30_Sub1_27.method730(arg0);
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
				arg1.method2397(local107, arg1.anInt2660, arg1.anInt2653);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local20.method4334(0);
		this.aClass30_Sub1_27.method728(local20);
		return local38;
	}
}
