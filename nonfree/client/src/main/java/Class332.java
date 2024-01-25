import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class332 {

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!qn;")
	private Class281 aClass281_7;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_43;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class332(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BFLclient!fp;Lclient!fp;)Z")
	public boolean method7539(@OriginalArg(1) float arg0, @OriginalArg(2) Class3_Sub3 arg1, @OriginalArg(3) Class3_Sub3 arg2) {
		if (!this.method7541()) {
			return false;
		}
		@Pc(15) Class87 local15 = this.aClass7_Sub2_43.aClass87_2;
		@Pc(34) Class4_Sub6_Sub12 local34 = new Class4_Sub6_Sub12(this.aClass7_Sub2_43, 6408, arg2.anInt3177, arg2.anInt3184);
		this.aClass7_Sub2_43.method4281(local15);
		@Pc(41) boolean local41 = false;
		local15.method2063(local34, 0);
		if (local15.method2072()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt3177, arg2.anInt3184);
			OpenGL.glUseProgramObjectARB(this.aClass281_7.aLong222);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass281_7.aLong222, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass281_7.aLong222, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass281_7.aLong222, "sampleSize"), 1.0F / (float) arg1.anInt3177, 1.0F / (float) arg1.anInt3184);
			for (@Pc(110) int local110 = 0; local110 < arg2.anInt3185; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg2.anInt3185;
				this.aClass7_Sub2_43.method4313(arg1);
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
				arg2.method2569(arg2.anInt3184, local110, arg2.anInt3177);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local41 = true;
			OpenGL.glPopMatrix();
		}
		local15.method2070(0);
		this.aClass7_Sub2_43.method4358(local15);
		return local41;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
	public boolean method7541() {
		if (this.aClass7_Sub2_43.aBoolean390 && this.aClass7_Sub2_43.aBoolean401 && this.aClass281_7 == null) {
			@Pc(28) Class11 local28 = Static427.method6369(this.aClass7_Sub2_43, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local28 != null) {
				this.aClass281_7 = Static110.method2036(new Class11[] { local28 }, this.aClass7_Sub2_43);
			}
		}
		return this.aClass281_7 != null;
	}
}
