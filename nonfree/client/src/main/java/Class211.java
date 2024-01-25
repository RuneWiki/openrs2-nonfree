import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class211 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lclient!gda;")
	private Class99 aClass99_2;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_27;

	static {
		new Class114("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class211(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	public boolean method5457() {
		if (this.aClass9_Sub3_27.aBoolean527 && this.aClass9_Sub3_27.aBoolean520 && this.aClass99_2 == null) {
			@Pc(25) Class315 local25 = Static405.method6070(35632, this.aClass9_Sub3_27, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local25 != null) {
				this.aClass99_2 = Static422.method6283(this.aClass9_Sub3_27, new Class315[] { local25 });
			}
		}
		return this.aClass99_2 != null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(FBLclient!au;Lclient!au;)Z")
	public boolean method5459(@OriginalArg(0) float arg0, @OriginalArg(2) Class20_Sub1 arg1, @OriginalArg(3) Class20_Sub1 arg2) {
		if (!this.method5457()) {
			return false;
		}
		@Pc(13) Class205 local13 = this.aClass9_Sub3_27.aClass205_6;
		@Pc(24) Class1_Sub1_Sub9 local24 = new Class1_Sub1_Sub9(this.aClass9_Sub3_27, 6408, arg2.anInt1009, arg2.anInt1002);
		@Pc(26) boolean local26 = false;
		this.aClass9_Sub3_27.method6698(local13);
		local13.method5228(0, local24);
		if (local13.method5232()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt1009, arg2.anInt1002);
			OpenGL.glUseProgramObjectARB(this.aClass99_2.aLong90);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass99_2.aLong90, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass99_2.aLong90, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass99_2.aLong90, "sampleSize"), 1.0F / (float) arg1.anInt1009, 1.0F / (float) arg1.anInt1002);
			for (@Pc(100) int local100 = 0; local100 < arg2.anInt1003; local100++) {
				@Pc(108) float local108 = (float) local100 / (float) arg2.anInt1003;
				this.aClass9_Sub3_27.method6701(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local108);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local108);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local108);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local108);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg2.method1017(arg2.anInt1009, local100, arg2.anInt1002);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local26 = true;
			OpenGL.glPopMatrix();
		}
		local13.method5233(0);
		this.aClass9_Sub3_27.method6707(local13);
		return local26;
	}
}
