import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class151 {

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!gb;")
	private Class125 aClass125_7;

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_22;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class151(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Z")
	public boolean method3103() {
		if (this.aClass143_Sub2_22.aBoolean420 && this.aClass143_Sub2_22.aBoolean421 && this.aClass125_7 == null) {
			@Pc(21) Class227 local21 = Static285.method3923(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass143_Sub2_22);
			if (local21 != null) {
				this.aClass125_7 = Static616.method8266(new Class227[] { local21 }, this.aClass143_Sub2_22);
			}
		}
		return this.aClass125_7 != null;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IFLclient!kga;Lclient!kga;)Z")
	public boolean method3105(@OriginalArg(1) float arg0, @OriginalArg(2) Class44_Sub2 arg1, @OriginalArg(3) Class44_Sub2 arg2) {
		if (!this.method3103()) {
			return false;
		}
		@Pc(13) Class318 local13 = this.aClass143_Sub2_22.aClass318_7;
		@Pc(29) Class5_Sub2_Sub6 local29 = new Class5_Sub2_Sub6(this.aClass143_Sub2_22, 6408, arg2.anInt4680, arg2.anInt4678);
		this.aClass143_Sub2_22.method4987(local13);
		@Pc(36) boolean local36 = false;
		local13.method7395(0, local29);
		if (local13.method7392()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt4680, arg2.anInt4678);
			OpenGL.glUseProgramObjectARB(this.aClass125_7.aLong111);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass125_7.aLong111, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass125_7.aLong111, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass125_7.aLong111, "sampleSize"), 1.0F / (float) arg1.anInt4680, 1.0F / (float) arg1.anInt4678);
			for (@Pc(105) int local105 = 0; local105 < arg2.anInt4681; local105++) {
				@Pc(113) float local113 = (float) local105 / (float) arg2.anInt4681;
				this.aClass143_Sub2_22.method4945(arg1);
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
				arg2.method4111(local105, arg2.anInt4678, arg2.anInt4680);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local36 = true;
			OpenGL.glPopMatrix();
		}
		local13.method7388(0);
		this.aClass143_Sub2_22.method4966(local13);
		return local36;
	}
}
