import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class215 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!vv;")
	private Class308 aClass308_2;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_26;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class215(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_26 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
	public boolean method5313() {
		if (this.aClass62_Sub3_26.aBoolean282 && this.aClass62_Sub3_26.aBoolean274 && this.aClass308_2 == null) {
			@Pc(31) Class289 local31 = Static89.method1961(35632, this.aClass62_Sub3_26, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local31 != null) {
				this.aClass308_2 = Static392.method5719(new Class289[] { local31 }, this.aClass62_Sub3_26);
			}
		}
		return this.aClass308_2 != null;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(FLclient!ho;BLclient!ho;)Z")
	public boolean method5314(@OriginalArg(0) float arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(3) Class4_Sub1 arg2) {
		if (!this.method5313()) {
			return false;
		}
		@Pc(20) Class103 local20 = this.aClass62_Sub3_26.aClass103_1;
		@Pc(31) Class5_Sub2_Sub6 local31 = new Class5_Sub2_Sub6(this.aClass62_Sub3_26, 6408, arg1.anInt3662, arg1.anInt3663);
		@Pc(33) boolean local33 = false;
		this.aClass62_Sub3_26.method3948(local20);
		local20.method2744(0, local31);
		if (local20.method2741()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt3662, arg1.anInt3663);
			OpenGL.glUseProgramObjectARB(this.aClass308_2.aLong245);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass308_2.aLong245, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass308_2.aLong245, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass308_2.aLong245, "sampleSize"), 1.0F / (float) arg2.anInt3662, 1.0F / (float) arg2.anInt3663);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt3665; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt3665;
				this.aClass62_Sub3_26.method4007(arg2);
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
				arg1.method3193(local107, arg1.anInt3662, arg1.anInt3663);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local20.method2746(0);
		this.aClass62_Sub3_26.method3962(local20);
		return local33;
	}
}
