import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class185 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!it;")
	private Class167 aClass167_3;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_20;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class185(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FLclient!sga;Lclient!sga;Z)Z")
	public boolean method4467(@OriginalArg(0) float arg0, @OriginalArg(1) Class10_Sub4 arg1, @OriginalArg(2) Class10_Sub4 arg2) {
		if (!this.method4469()) {
			return false;
		}
		@Pc(18) Class227 local18 = this.aClass13_Sub2_20.aClass227_2;
		@Pc(29) Class2_Sub7_Sub10 local29 = new Class2_Sub7_Sub10(this.aClass13_Sub2_20, 6408, arg2.anInt8440, arg2.anInt8433);
		this.aClass13_Sub2_20.method1061(local18);
		@Pc(36) boolean local36 = false;
		local18.method5345(0, local29);
		if (local18.method5351()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt8440, arg2.anInt8433);
			OpenGL.glUseProgramObjectARB(this.aClass167_3.aLong112);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass167_3.aLong112, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass167_3.aLong112, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass167_3.aLong112, "sampleSize"), 1.0F / (float) arg1.anInt8440, 1.0F / (float) arg1.anInt8433);
			for (@Pc(105) int local105 = 0; local105 < arg2.anInt8437; local105++) {
				@Pc(113) float local113 = (float) local105 / (float) arg2.anInt8437;
				this.aClass13_Sub2_20.method1096(arg1);
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
				arg2.method7266(arg2.anInt8433, arg2.anInt8440, local105);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local36 = true;
		}
		local18.method5342(0);
		this.aClass13_Sub2_20.method1097(local18);
		return local36;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public boolean method4469() {
		if (this.aClass13_Sub2_20.aBoolean91 && this.aClass13_Sub2_20.aBoolean97 && this.aClass167_3 == null) {
			@Pc(17) Class268 local17 = Static179.method3071(this.aClass13_Sub2_20, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass167_3 = Static254.method4243(this.aClass13_Sub2_20, new Class268[] { local17 });
			}
		}
		return this.aClass167_3 != null;
	}
}
