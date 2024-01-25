import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!ij;")
	private Class114 aClass114_1;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class3(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	public boolean method10() {
		if (this.aClass51_Sub2_1.aBoolean458 && this.aClass51_Sub2_1.aBoolean441 && this.aClass114_1 == null) {
			@Pc(19) Class225 local19 = Static237.method3236(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass51_Sub2_1);
			if (local19 != null) {
				this.aClass114_1 = Static322.method4280(new Class225[] { local19 }, this.aClass51_Sub2_1);
			}
		}
		return this.aClass114_1 != null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(FBLclient!jk;Lclient!jk;)Z")
	public boolean method12(@OriginalArg(0) float arg0, @OriginalArg(2) Class59_Sub2 arg1, @OriginalArg(3) Class59_Sub2 arg2) {
		if (!this.method10()) {
			return false;
		}
		@Pc(15) Class73 local15 = this.aClass51_Sub2_1.aClass73_6;
		@Pc(26) Class7_Sub4_Sub11 local26 = new Class7_Sub4_Sub11(this.aClass51_Sub2_1, 6408, arg2.anInt3423, arg2.anInt3425);
		this.aClass51_Sub2_1.method5386(local15);
		@Pc(33) boolean local33 = false;
		local15.method1738(0, local26);
		if (local15.method1739()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt3423, arg2.anInt3425);
			OpenGL.glUseProgramObjectARB(this.aClass114_1.aLong97);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass114_1.aLong97, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass114_1.aLong97, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass114_1.aLong97, "sampleSize"), 1.0F / (float) arg1.anInt3423, 1.0F / (float) arg1.anInt3425);
			for (@Pc(109) int local109 = 0; local109 < arg2.anInt3416; local109++) {
				@Pc(118) float local118 = (float) local109 / (float) arg2.anInt3416;
				this.aClass51_Sub2_1.method5364(arg1);
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
				arg2.method2786(local109, arg2.anInt3423, arg2.anInt3425);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method1740(0);
		this.aClass51_Sub2_1.method5372(local15);
		return local33;
	}
}
