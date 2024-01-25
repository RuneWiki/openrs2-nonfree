import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class178 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!nba;")
	private Class233 aClass233_2;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_21;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class178(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_21 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!pj;Lclient!pj;BF)Z")
	public boolean method3644(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method3646()) {
			return false;
		}
		@Pc(15) Class105 local15 = this.aClass162_Sub3_21.aClass105_7;
		@Pc(26) Class2_Sub2_Sub3 local26 = new Class2_Sub2_Sub3(this.aClass162_Sub3_21, 6408, arg1.anInt6731, arg1.anInt6736);
		@Pc(28) boolean local28 = false;
		this.aClass162_Sub3_21.method6942(local15);
		local15.method1944(local26, 0);
		if (local15.method1943()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt6731, arg1.anInt6736);
			OpenGL.glUseProgramObjectARB(this.aClass233_2.aLong160);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass233_2.aLong160, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass233_2.aLong160, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass233_2.aLong160, "sampleSize"), 1.0F / (float) arg0.anInt6731, 1.0F / (float) arg0.anInt6736);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt6732; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt6732;
				this.aClass162_Sub3_21.method6911(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local111);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local111);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local111);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local111);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method5578(arg1.anInt6736, local102, arg1.anInt6731);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local28 = true;
		}
		local15.method1949(0);
		this.aClass162_Sub3_21.method6897(local15);
		return local28;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)Z")
	public boolean method3646() {
		if (this.aClass162_Sub3_21.aBoolean721 && this.aClass162_Sub3_21.aBoolean728 && this.aClass233_2 == null) {
			@Pc(22) Class118 local22 = Static61.method1063("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass162_Sub3_21, 35632);
			if (local22 != null) {
				this.aClass233_2 = Static9.method178(new Class118[] { local22 }, this.aClass162_Sub3_21);
			}
		}
		return this.aClass233_2 != null;
	}
}
