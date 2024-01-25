import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class390 {

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!ag;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_42;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class390(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Z")
	public boolean method8679() {
		if (this.aClass16_Sub2_42.aBoolean331 && this.aClass16_Sub2_42.aBoolean339 && this.aClass12_7 == null) {
			@Pc(24) Class166 local24 = Static245.method3919("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass16_Sub2_42);
			if (local24 != null) {
				this.aClass12_7 = Static551.method7571(this.aClass16_Sub2_42, new Class166[] { local24 });
			}
		}
		return this.aClass12_7 != null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ew;ILclient!ew;F)Z")
	public boolean method8681(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(2) Class39_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method8679()) {
			return false;
		}
		@Pc(20) Class109 local20 = this.aClass16_Sub2_42.aClass109_2;
		@Pc(31) Class3_Sub6_Sub10 local31 = new Class3_Sub6_Sub10(this.aClass16_Sub2_42, 6408, arg0.anInt2807, arg0.anInt2806);
		this.aClass16_Sub2_42.method3615(local20);
		@Pc(38) boolean local38 = false;
		local20.method2548(local31, 0);
		if (local20.method2549()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt2807, arg0.anInt2806);
			OpenGL.glUseProgramObjectARB(this.aClass12_7.aLong4);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass12_7.aLong4, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass12_7.aLong4, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass12_7.aLong4, "sampleSize"), 1.0F / (float) arg1.anInt2807, 1.0F / (float) arg1.anInt2806);
			for (@Pc(107) int local107 = 0; local107 < arg0.anInt2805; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg0.anInt2805;
				this.aClass16_Sub2_42.method3620(arg1);
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
				arg0.method2573(local107, arg0.anInt2806, arg0.anInt2807);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local38 = true;
		}
		local20.method2552(0);
		this.aClass16_Sub2_42.method3635(local20);
		return local38;
	}
}
