import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class45 {

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Lclient!wf;")
	private Class265 aClass265_1;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_3;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class45(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!jd;ZFLclient!jd;)Z")
	public boolean method1220(@OriginalArg(0) Class112_Sub1 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class112_Sub1 arg2) {
		if (!this.method1222()) {
			return false;
		}
		@Pc(13) Class259 local13 = this.aClass172_Sub2_3.aClass259_7;
		@Pc(24) Class3_Sub4_Sub10 local24 = new Class3_Sub4_Sub10(this.aClass172_Sub2_3, 6408, arg2.anInt3730, arg2.anInt3720);
		this.aClass172_Sub2_3.method5585(local13);
		@Pc(40) boolean local40 = false;
		local13.method5442(0, local24);
		if (local13.method5444()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt3730, arg2.anInt3720);
			OpenGL.glUseProgramObjectARB(this.aClass265_1.aLong224);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass265_1.aLong224, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass265_1.aLong224, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass265_1.aLong224, "sampleSize"), 1.0F / (float) arg0.anInt3730, 1.0F / (float) arg0.anInt3720);
			for (@Pc(109) int local109 = 0; local109 < arg2.anInt3726; local109++) {
				@Pc(117) float local117 = (float) local109 / (float) arg2.anInt3726;
				this.aClass172_Sub2_3.method5630(arg0);
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
				arg2.method2978(local109, arg2.anInt3730, arg2.anInt3720);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local40 = true;
			OpenGL.glPopMatrix();
		}
		local13.method5441(0);
		this.aClass172_Sub2_3.method5556(local13);
		return local40;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
	public boolean method1222() {
		if (this.aClass172_Sub2_3.aBoolean605 && this.aClass172_Sub2_3.aBoolean623 && this.aClass265_1 == null) {
			@Pc(17) Class104 local17 = Static444.method5856(35632, this.aClass172_Sub2_3, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass265_1 = Static64.method1304(new Class104[] { local17 }, this.aClass172_Sub2_3);
			}
		}
		return this.aClass265_1 != null;
	}
}
