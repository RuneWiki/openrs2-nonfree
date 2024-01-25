import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class106 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lclient!on;")
	private Class260 aClass260_6;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_13;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class106(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_13 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FLclient!ui;ILclient!ui;)Z")
	public boolean method2165(@OriginalArg(0) float arg0, @OriginalArg(1) Class53_Sub4 arg1, @OriginalArg(3) Class53_Sub4 arg2) {
		if (!this.method2166()) {
			return false;
		}
		@Pc(15) Class143 local15 = this.aClass132_Sub3_13.aClass143_7;
		@Pc(26) Class6_Sub4_Sub9 local26 = new Class6_Sub4_Sub9(this.aClass132_Sub3_13, 6408, arg2.anInt9828, arg2.anInt9825);
		this.aClass132_Sub3_13.method6814(local15);
		@Pc(38) boolean local38 = false;
		local15.method3132(0, local26);
		if (local15.method3136()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt9828, arg2.anInt9825);
			OpenGL.glUseProgramObjectARB(this.aClass260_6.aLong213);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass260_6.aLong213, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass260_6.aLong213, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass260_6.aLong213, "sampleSize"), 1.0F / (float) arg1.anInt9828, 1.0F / (float) arg1.anInt9825);
			for (@Pc(107) int local107 = 0; local107 < arg2.anInt9831; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg2.anInt9831;
				this.aClass132_Sub3_13.method6759(arg1);
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
				arg2.method8295(local107, arg2.anInt9825, arg2.anInt9828);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local15.method3138(0);
		this.aClass132_Sub3_13.method6799(local15);
		return local38;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z")
	public boolean method2166() {
		if (this.aClass132_Sub3_13.aBoolean529 && this.aClass132_Sub3_13.aBoolean543 && this.aClass260_6 == null) {
			@Pc(23) Class142 local23 = Static639.method8744(35632, this.aClass132_Sub3_13, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local23 != null) {
				this.aClass260_6 = Static677.method9169(new Class142[] { local23 }, this.aClass132_Sub3_13);
			}
		}
		return this.aClass260_6 != null;
	}
}
