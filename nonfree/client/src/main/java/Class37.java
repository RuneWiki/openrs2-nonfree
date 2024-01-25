import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class37 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!hca;")
	private Class132 aClass132_5;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_3;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class37(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!hj;FILclient!hj;)Z")
	public boolean method706(@OriginalArg(0) Class40_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class40_Sub2 arg2) {
		if (!this.method707()) {
			return false;
		}
		@Pc(15) Class98 local15 = this.aClass134_Sub2_3.aClass98_7;
		@Pc(26) Class1_Sub6_Sub3 local26 = new Class1_Sub6_Sub3(this.aClass134_Sub2_3, 6408, arg2.anInt3587, arg2.anInt3591);
		this.aClass134_Sub2_3.method5275(local15);
		@Pc(33) boolean local33 = false;
		local15.method1984(0, local26);
		if (local15.method1975()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt3587, arg2.anInt3591);
			OpenGL.glUseProgramObjectARB(this.aClass132_5.aLong105);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass132_5.aLong105, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass132_5.aLong105, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass132_5.aLong105, "sampleSize"), 1.0F / (float) arg0.anInt3587, 1.0F / (float) arg0.anInt3591);
			for (@Pc(104) int local104 = 0; local104 < arg2.anInt3589; local104++) {
				@Pc(113) float local113 = (float) local104 / (float) arg2.anInt3589;
				this.aClass134_Sub2_3.method5202(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local113);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local113);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local113);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local113);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method2951(arg2.anInt3591, local104, arg2.anInt3587);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method1973(0);
		this.aClass134_Sub2_3.method5262(local15);
		return local33;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Z")
	public boolean method707() {
		if (this.aClass134_Sub2_3.aBoolean518 && this.aClass134_Sub2_3.aBoolean504 && this.aClass132_5 == null) {
			@Pc(17) Class189 local17 = Static364.method4918(35632, this.aClass134_Sub2_3, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass132_5 = Static269.method3841(new Class189[] { local17 }, this.aClass134_Sub2_3);
			}
		}
		return this.aClass132_5 != null;
	}
}
