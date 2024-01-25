import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class54 {

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!og;")
	private Class227 aClass227_2;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_10;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class54(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!bu;FLclient!bu;B)Z")
	public boolean method886(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class35_Sub1 arg2) {
		if (!this.method887()) {
			return false;
		}
		@Pc(21) Class315 local21 = this.aClass121_Sub3_10.aClass315_3;
		@Pc(32) Class6_Sub1_Sub8 local32 = new Class6_Sub1_Sub8(this.aClass121_Sub3_10, 6408, arg2.anInt798, arg2.anInt800);
		this.aClass121_Sub3_10.method5701(local21);
		@Pc(39) boolean local39 = false;
		local21.method7053(local32, 0);
		if (local21.method7059()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt798, arg2.anInt800);
			OpenGL.glUseProgramObjectARB(this.aClass227_2.aLong166);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass227_2.aLong166, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass227_2.aLong166, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass227_2.aLong166, "sampleSize"), 1.0F / (float) arg0.anInt798, 1.0F / (float) arg0.anInt800);
			for (@Pc(108) int local108 = 0; local108 < arg2.anInt801; local108++) {
				@Pc(117) float local117 = (float) local108 / (float) arg2.anInt801;
				this.aClass121_Sub3_10.method5713(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local117);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local117);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local117);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local117);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method649(arg2.anInt798, local108, arg2.anInt800);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local39 = true;
			OpenGL.glPopMatrix();
		}
		local21.method7060(0);
		this.aClass121_Sub3_10.method5682(local21);
		return local39;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)Z")
	public boolean method887() {
		if (this.aClass121_Sub3_10.aBoolean468 && this.aClass121_Sub3_10.aBoolean481 && this.aClass227_2 == null) {
			@Pc(21) Class241 local21 = Static96.method1498(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass121_Sub3_10);
			if (local21 != null) {
				this.aClass227_2 = Static46.method647(new Class241[] { local21 }, this.aClass121_Sub3_10);
			}
		}
		return this.aClass227_2 != null;
	}
}
