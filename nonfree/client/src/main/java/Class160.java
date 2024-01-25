import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class160 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!rs;")
	private Class210 aClass210_6;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_28;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class160(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_28 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Z")
	public boolean method3578() {
		if (this.aClass30_Sub1_28.aBoolean69 && this.aClass30_Sub1_28.aBoolean65 && this.aClass210_6 == null) {
			@Pc(21) Class79 local21 = Static47.method994(this.aClass30_Sub1_28, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632);
			if (local21 != null) {
				this.aClass210_6 = Static94.method1545(new Class79[] { local21 }, this.aClass30_Sub1_28);
			}
		}
		return this.aClass210_6 != null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!pp;Lclient!pp;FB)Z")
	public boolean method3579(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) Class1_Sub4 arg1, @OriginalArg(2) float arg2) {
		if (!this.method3578()) {
			return false;
		}
		@Pc(22) Class142 local22 = this.aClass30_Sub1_28.aClass142_2;
		@Pc(33) Class4_Sub1_Sub15 local33 = new Class4_Sub1_Sub15(this.aClass30_Sub1_28, 6408, arg0.anInt5568, arg0.anInt5576);
		this.aClass30_Sub1_28.method972(local22);
		@Pc(42) boolean local42 = false;
		local22.method3087(local33, 0);
		if (local22.method3094()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt5568, arg0.anInt5576);
			OpenGL.glUseProgramObjectARB(this.aClass210_6.aLong180);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass210_6.aLong180, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass210_6.aLong180, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass210_6.aLong180, "sampleSize"), 1.0F / (float) arg1.anInt5568, 1.0F / (float) arg1.anInt5576);
			for (@Pc(111) int local111 = 0; local111 < arg0.anInt5567; local111++) {
				@Pc(120) float local120 = (float) local111 / (float) arg0.anInt5567;
				this.aClass30_Sub1_28.method916(arg1);
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
				arg0.method4281(arg0.anInt5568, arg0.anInt5576, local111);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local42 = true;
		}
		local22.method3097(0);
		this.aClass30_Sub1_28.method908(local22);
		return local42;
	}
}
