import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class207 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!oca;")
	private Class249 aClass249_5;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_22;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class207(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Z")
	public boolean method5252() {
		if (this.aClass13_Sub2_22.aBoolean172 && this.aClass13_Sub2_22.aBoolean173 && this.aClass249_5 == null) {
			@Pc(29) Class184 local29 = Static189.method5096(35632, this.aClass13_Sub2_22, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local29 != null) {
				this.aClass249_5 = Static69.method1361(new Class184[] { local29 }, this.aClass13_Sub2_22);
			}
		}
		return this.aClass249_5 != null;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BFLclient!sk;Lclient!sk;)Z")
	public boolean method5254(@OriginalArg(1) float arg0, @OriginalArg(2) Class85_Sub4 arg1, @OriginalArg(3) Class85_Sub4 arg2) {
		if (!this.method5252()) {
			return false;
		}
		@Pc(13) Class221 local13 = this.aClass13_Sub2_22.aClass221_4;
		@Pc(29) Class3_Sub11_Sub12 local29 = new Class3_Sub11_Sub12(this.aClass13_Sub2_22, 6408, arg1.anInt9020, arg1.anInt9022);
		this.aClass13_Sub2_22.method2009(local13);
		@Pc(36) boolean local36 = false;
		local13.method5435(local29, 0);
		if (local13.method5428()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt9020, arg1.anInt9022);
			OpenGL.glUseProgramObjectARB(this.aClass249_5.aLong213);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass249_5.aLong213, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass249_5.aLong213, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass249_5.aLong213, "sampleSize"), 1.0F / (float) arg2.anInt9020, 1.0F / (float) arg2.anInt9022);
			for (@Pc(105) int local105 = 0; local105 < arg1.anInt9029; local105++) {
				@Pc(113) float local113 = (float) local105 / (float) arg1.anInt9029;
				this.aClass13_Sub2_22.method2024(arg2);
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
				arg1.method7881(local105, arg1.anInt9020, arg1.anInt9022);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local36 = true;
		}
		local13.method5433(0);
		this.aClass13_Sub2_22.method1992(local13);
		return local36;
	}
}
