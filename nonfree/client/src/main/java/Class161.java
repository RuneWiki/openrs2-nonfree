import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class161 {

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!kh;")
	private Class136 aClass136_6;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_27;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class161(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_27 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z")
	public boolean method3266() {
		if (this.aClass128_Sub2_27.aBoolean363 && this.aClass128_Sub2_27.aBoolean366 && this.aClass136_6 == null) {
			@Pc(29) Class153 local29 = Static379.method4853("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass128_Sub2_27, 35632);
			if (local29 != null) {
				this.aClass136_6 = Static50.method734(this.aClass128_Sub2_27, new Class153[] { local29 });
			}
		}
		return this.aClass136_6 != null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!mi;Lclient!mi;BF)Z")
	public boolean method3269(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class5_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method3266()) {
			return false;
		}
		@Pc(15) Class87 local15 = this.aClass128_Sub2_27.aClass87_4;
		@Pc(34) Class1_Sub3_Sub18 local34 = new Class1_Sub3_Sub18(this.aClass128_Sub2_27, 6408, arg1.anInt4037, arg1.anInt4039);
		this.aClass128_Sub2_27.method3628(local15);
		@Pc(41) boolean local41 = false;
		local15.method1771(local34, 0);
		if (local15.method1773()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt4037, arg1.anInt4039);
			OpenGL.glUseProgramObjectARB(this.aClass136_6.aLong102);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass136_6.aLong102, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass136_6.aLong102, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass136_6.aLong102, "sampleSize"), 1.0F / (float) arg0.anInt4037, 1.0F / (float) arg0.anInt4039);
			for (@Pc(110) int local110 = 0; local110 < arg1.anInt4038; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg1.anInt4038;
				this.aClass128_Sub2_27.method3691(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local119);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local119);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local119);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local119);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method3225(arg1.anInt4039, arg1.anInt4037, local110);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local41 = true;
			OpenGL.glPopMatrix();
		}
		local15.method1776(0);
		this.aClass128_Sub2_27.method3624(local15);
		return local41;
	}
}
