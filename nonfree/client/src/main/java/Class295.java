import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class295 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!pq;")
	private Class290 aClass290_7;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_25;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class295(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_25 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!tj;FLclient!tj;)Z")
	public boolean method6555(@OriginalArg(1) Class116_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class116_Sub3 arg2) {
		if (!this.method6556()) {
			return false;
		}
		@Pc(17) Class371 local17 = this.aClass33_Sub3_25.aClass371_7;
		@Pc(28) Class4_Sub5_Sub20 local28 = new Class4_Sub5_Sub20(this.aClass33_Sub3_25, 6408, arg0.anInt8959, arg0.anInt8962);
		this.aClass33_Sub3_25.method6360(local17);
		@Pc(35) boolean local35 = false;
		local17.method8436(0, local28);
		if (local17.method8443()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt8959, arg0.anInt8962);
			OpenGL.glUseProgramObjectARB(this.aClass290_7.aLong217);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass290_7.aLong217, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass290_7.aLong217, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass290_7.aLong217, "sampleSize"), 1.0F / (float) arg2.anInt8959, 1.0F / (float) arg2.anInt8962);
			for (@Pc(113) int local113 = 0; local113 < arg0.anInt8965; local113++) {
				@Pc(122) float local122 = (float) local113 / (float) arg0.anInt8965;
				this.aClass33_Sub3_25.method6340(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local122);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local122);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local122);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local122);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method7647(arg0.anInt8959, arg0.anInt8962, local113);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local35 = true;
			OpenGL.glPopMatrix();
		}
		local17.method8447(0);
		this.aClass33_Sub3_25.method6368(local17);
		return local35;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
	public boolean method6556() {
		if (this.aClass33_Sub3_25.aBoolean567 && this.aClass33_Sub3_25.aBoolean554 && this.aClass290_7 == null) {
			@Pc(17) Class297 local17 = Static572.method7590(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass33_Sub3_25);
			if (local17 != null) {
				this.aClass290_7 = Static208.method3117(new Class297[] { local17 }, this.aClass33_Sub3_25);
			}
		}
		return this.aClass290_7 != null;
	}
}
