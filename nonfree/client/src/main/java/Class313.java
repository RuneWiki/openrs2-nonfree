import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class313 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!un;")
	private Class350 aClass350_2;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_30;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class313(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_30 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(FLclient!tq;Lclient!tq;I)Z")
	public boolean method7539(@OriginalArg(0) float arg0, @OriginalArg(1) Class167_Sub4 arg1, @OriginalArg(2) Class167_Sub4 arg2) {
		if (!this.method7541()) {
			return false;
		}
		@Pc(17) Class186 local17 = this.aClass133_Sub3_30.aClass186_5;
		@Pc(28) Class5_Sub5_Sub17 local28 = new Class5_Sub5_Sub17(this.aClass133_Sub3_30, 6408, arg1.anInt9285, arg1.anInt9283);
		this.aClass133_Sub3_30.method7390(local17);
		@Pc(35) boolean local35 = false;
		local17.method4339(0, local28);
		if (local17.method4344()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt9285, arg1.anInt9283);
			OpenGL.glUseProgramObjectARB(this.aClass350_2.aLong247);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass350_2.aLong247, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass350_2.aLong247, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass350_2.aLong247, "sampleSize"), 1.0F / (float) arg2.anInt9285, 1.0F / (float) arg2.anInt9283);
			for (@Pc(104) int local104 = 0; local104 < arg1.anInt9278; local104++) {
				@Pc(113) float local113 = (float) local104 / (float) arg1.anInt9278;
				this.aClass133_Sub3_30.method7375(arg2);
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
				arg1.method8016(arg1.anInt9285, arg1.anInt9283, local104);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local35 = true;
			OpenGL.glPopMatrix();
		}
		local17.method4345(0);
		this.aClass133_Sub3_30.method7363(local17);
		return local35;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
	public boolean method7541() {
		if (this.aClass133_Sub3_30.aBoolean615 && this.aClass133_Sub3_30.aBoolean628 && this.aClass350_2 == null) {
			@Pc(17) Class369 local17 = Static432.method6590("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass133_Sub3_30, 35632);
			if (local17 != null) {
				this.aClass350_2 = Static457.method6820(new Class369[] { local17 }, this.aClass133_Sub3_30);
			}
		}
		return this.aClass350_2 != null;
	}
}
