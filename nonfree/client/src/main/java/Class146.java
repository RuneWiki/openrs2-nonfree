import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class146 {

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!di;")
	private Class70 aClass70_7;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_25;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class146(@OriginalArg(0) Class45_Sub3 arg0) {
		this.aClass45_Sub3_25 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z")
	public boolean method3529() {
		if (this.aClass45_Sub3_25.aBoolean704 && this.aClass45_Sub3_25.aBoolean689 && this.aClass70_7 == null) {
			@Pc(22) Class203 local22 = Static131.method2612(35632, this.aClass45_Sub3_25, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local22 != null) {
				this.aClass70_7 = Static403.method5837(new Class203[] { local22 }, this.aClass45_Sub3_25);
			}
		}
		return this.aClass70_7 != null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZFLclient!cd;Lclient!cd;)Z")
	public boolean method3531(@OriginalArg(1) float arg0, @OriginalArg(2) Class24_Sub2 arg1, @OriginalArg(3) Class24_Sub2 arg2) {
		if (!this.method3529()) {
			return false;
		}
		@Pc(20) Class364 local20 = this.aClass45_Sub3_25.aClass364_7;
		@Pc(31) Class3_Sub7_Sub2 local31 = new Class3_Sub7_Sub2(this.aClass45_Sub3_25, 6408, arg1.anInt1296, arg1.anInt1290);
		this.aClass45_Sub3_25.method7443(local20);
		@Pc(38) boolean local38 = false;
		local20.method7927(local31, 0);
		if (local20.method7934()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt1296, arg1.anInt1290);
			OpenGL.glUseProgramObjectARB(this.aClass70_7.aLong48);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass70_7.aLong48, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass70_7.aLong48, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass70_7.aLong48, "sampleSize"), 1.0F / (float) arg2.anInt1296, 1.0F / (float) arg2.anInt1290);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt1289; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt1289;
				this.aClass45_Sub3_25.method7475(arg2);
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
				arg1.method1219(arg1.anInt1296, local107, arg1.anInt1290);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local20.method7935(0);
		this.aClass45_Sub3_25.method7508(local20);
		return local38;
	}
}
