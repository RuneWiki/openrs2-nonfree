import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class222 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!uq;")
	private Class246 aClass246_7;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_33;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class222(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z")
	public boolean method4886() {
		if (this.aClass34_Sub2_33.aBoolean774 && this.aClass34_Sub2_33.aBoolean760 && this.aClass246_7 == null) {
			@Pc(23) Class188 local23 = Static416.method5407("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass34_Sub2_33);
			if (local23 != null) {
				this.aClass246_7 = Static321.method4318(new Class188[] { local23 }, this.aClass34_Sub2_33);
			}
		}
		return this.aClass246_7 != null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!wt;ILclient!wt;F)Z")
	public boolean method4888(@OriginalArg(0) Class10_Sub4 arg0, @OriginalArg(2) Class10_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method4886()) {
			return false;
		}
		@Pc(15) Class158 local15 = this.aClass34_Sub2_33.aClass158_6;
		@Pc(32) Class1_Sub5_Sub17 local32 = new Class1_Sub5_Sub17(this.aClass34_Sub2_33, 6408, arg1.anInt7533, arg1.anInt7529);
		this.aClass34_Sub2_33.method5521(local15);
		@Pc(39) boolean local39 = false;
		local15.method3669(0, local32);
		if (local15.method3667()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt7533, arg1.anInt7529);
			OpenGL.glUseProgramObjectARB(this.aClass246_7.aLong214);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass246_7.aLong214, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass246_7.aLong214, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass246_7.aLong214, "sampleSize"), 1.0F / (float) arg0.anInt7533, 1.0F / (float) arg0.anInt7529);
			for (@Pc(108) int local108 = 0; local108 < arg1.anInt7532; local108++) {
				@Pc(117) float local117 = (float) local108 / (float) arg1.anInt7532;
				this.aClass34_Sub2_33.method5493(arg0);
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
				arg1.method5940(arg1.anInt7533, local108, arg1.anInt7529);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local39 = true;
		}
		local15.method3659(0);
		this.aClass34_Sub2_33.method5528(local15);
		return local39;
	}
}
