import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class142 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!kba;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_18;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class142(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_18 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z")
	public boolean method3509() {
		if (this.aClass90_Sub1_18.aBoolean153 && this.aClass90_Sub1_18.aBoolean162 && this.aClass164_1 == null) {
			@Pc(22) Class123 local22 = Static194.method3296(35632, this.aClass90_Sub1_18, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local22 != null) {
				this.aClass164_1 = Static499.method7167(new Class123[] { local22 }, this.aClass90_Sub1_18);
			}
		}
		return this.aClass164_1 != null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(FBLclient!rb;Lclient!rb;)Z")
	public boolean method3511(@OriginalArg(0) float arg0, @OriginalArg(2) Class16_Sub2 arg1, @OriginalArg(3) Class16_Sub2 arg2) {
		if (!this.method3509()) {
			return false;
		}
		@Pc(15) Class319 local15 = this.aClass90_Sub1_18.aClass319_1;
		@Pc(26) Class6_Sub5_Sub4 local26 = new Class6_Sub5_Sub4(this.aClass90_Sub1_18, 6408, arg1.anInt7796, arg1.anInt7798);
		this.aClass90_Sub1_18.method2139(local15);
		@Pc(33) boolean local33 = false;
		local15.method7197(0, local26);
		if (local15.method7196()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt7796, arg1.anInt7798);
			OpenGL.glUseProgramObjectARB(this.aClass164_1.aLong99);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass164_1.aLong99, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass164_1.aLong99, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass164_1.aLong99, "sampleSize"), 1.0F / (float) arg2.anInt7796, 1.0F / (float) arg2.anInt7798);
			for (@Pc(110) int local110 = 0; local110 < arg1.anInt7795; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg1.anInt7795;
				this.aClass90_Sub1_18.method2126(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local119);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local119);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local119);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local119);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method6208(arg1.anInt7796, local110, arg1.anInt7798);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method7190(0);
		this.aClass90_Sub1_18.method2107(local15);
		return local33;
	}
}
