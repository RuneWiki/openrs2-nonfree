import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class205 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!su;")
	private Class230 aClass230_3;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_33;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class205(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_33 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FB)Z")
	public boolean method4877(@OriginalArg(0) Class137_Sub2 arg0, @OriginalArg(1) Class137_Sub2 arg1, @OriginalArg(2) float arg2) {
		if (!this.method4878()) {
			return false;
		}
		@Pc(22) Class224 local22 = this.aClass167_Sub1_33.aClass224_4;
		@Pc(33) Class3_Sub3_Sub12 local33 = new Class3_Sub3_Sub12(this.aClass167_Sub1_33, 6408, arg1.anInt4026, arg1.anInt4029);
		this.aClass167_Sub1_33.method4024(local22);
		@Pc(42) boolean local42 = false;
		local22.method5232(0, local33);
		if (local22.method5230()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt4026, arg1.anInt4029);
			OpenGL.glUseProgramObjectARB(this.aClass230_3.aLong217);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass230_3.aLong217, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass230_3.aLong217, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass230_3.aLong217, "sampleSize"), 1.0F / (float) arg0.anInt4026, 1.0F / (float) arg0.anInt4029);
			for (@Pc(111) int local111 = 0; local111 < arg1.anInt4024; local111++) {
				@Pc(120) float local120 = (float) local111 / (float) arg1.anInt4024;
				this.aClass167_Sub1_33.method4028(arg0);
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
				arg1.method3432(arg1.anInt4026, local111, arg1.anInt4029);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local42 = true;
		}
		local22.method5234(0);
		this.aClass167_Sub1_33.method4008(local22);
		return local42;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
	public boolean method4878() {
		if (this.aClass167_Sub1_33.aBoolean343 && this.aClass167_Sub1_33.aBoolean340 && this.aClass230_3 == null) {
			@Pc(17) Class184 local17 = Static21.method6257("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass167_Sub1_33, 35632);
			if (local17 != null) {
				this.aClass230_3 = Static368.method5128(this.aClass167_Sub1_33, new Class184[] { local17 });
			}
		}
		return this.aClass230_3 != null;
	}
}
