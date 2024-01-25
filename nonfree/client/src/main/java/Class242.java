import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class242 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!vo;")
	private Class261 aClass261_7;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_36;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class242(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
	public boolean method5277() {
		if (this.aClass50_Sub1_36.aBoolean98 && this.aClass50_Sub1_36.aBoolean89 && this.aClass261_7 == null) {
			@Pc(17) Class214 local17 = Static223.method3364(35632, this.aClass50_Sub1_36, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass261_7 = Static91.method1694(this.aClass50_Sub1_36, new Class214[] { local17 });
			}
		}
		return this.aClass261_7 != null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(FLclient!iq;Lclient!iq;I)Z")
	public boolean method5279(@OriginalArg(0) float arg0, @OriginalArg(1) Class4_Sub3 arg1, @OriginalArg(2) Class4_Sub3 arg2) {
		if (!this.method5277()) {
			return false;
		}
		@Pc(15) Class260 local15 = this.aClass50_Sub1_36.aClass260_3;
		@Pc(26) Class10_Sub1_Sub18 local26 = new Class10_Sub1_Sub18(this.aClass50_Sub1_36, 6408, arg1.anInt3690, arg1.anInt3688);
		@Pc(28) boolean local28 = false;
		this.aClass50_Sub1_36.method1320(local15);
		local15.method5730(0, local26);
		if (local15.method5736()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt3690, arg1.anInt3688);
			OpenGL.glUseProgramObjectARB(this.aClass261_7.aLong248);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass261_7.aLong248, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass261_7.aLong248, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass261_7.aLong248, "sampleSize"), 1.0F / (float) arg2.anInt3690, 1.0F / (float) arg2.anInt3688);
			for (@Pc(106) int local106 = 0; local106 < arg1.anInt3689; local106++) {
				@Pc(115) float local115 = (float) local106 / (float) arg1.anInt3689;
				this.aClass50_Sub1_36.method1295(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local115);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local115);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local115);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local115);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method2971(arg1.anInt3690, arg1.anInt3688, local106);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local28 = true;
		}
		local15.method5732(0);
		this.aClass50_Sub1_36.method1284(local15);
		return local28;
	}
}
