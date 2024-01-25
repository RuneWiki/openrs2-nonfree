import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class279 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!dw;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_31;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class279(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_31 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!gj;Lclient!gj;IF)Z")
	public boolean method7174(@OriginalArg(0) Class85_Sub2 arg0, @OriginalArg(1) Class85_Sub2 arg1, @OriginalArg(3) float arg2) {
		if (!this.method7175()) {
			return false;
		}
		@Pc(15) Class295 local15 = this.aClass20_Sub3_31.aClass295_5;
		@Pc(34) Class2_Sub6_Sub13 local34 = new Class2_Sub6_Sub13(this.aClass20_Sub3_31, 6408, arg0.anInt4450, arg0.anInt4455);
		this.aClass20_Sub3_31.method7360(local15);
		@Pc(41) boolean local41 = false;
		local15.method7570(0, local34);
		if (local15.method7569()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt4450, arg0.anInt4455);
			OpenGL.glUseProgramObjectARB(this.aClass81_2.aLong70);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass81_2.aLong70, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass81_2.aLong70, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass81_2.aLong70, "sampleSize"), 1.0F / (float) arg1.anInt4450, 1.0F / (float) arg1.anInt4455);
			for (@Pc(110) int local110 = 0; local110 < arg0.anInt4449; local110++) {
				@Pc(119) float local119 = (float) local110 / (float) arg0.anInt4449;
				this.aClass20_Sub3_31.method7358(arg1);
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
				arg0.method3894(arg0.anInt4450, local110, arg0.anInt4455);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local41 = true;
		}
		local15.method7562(0);
		this.aClass20_Sub3_31.method7357(local15);
		return local41;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
	public boolean method7175() {
		if (this.aClass20_Sub3_31.aBoolean626 && this.aClass20_Sub3_31.aBoolean617 && this.aClass81_2 == null) {
			@Pc(17) Class324 local17 = Static137.method3091(35632, this.aClass20_Sub3_31, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass81_2 = Static442.method7011(this.aClass20_Sub3_31, new Class324[] { local17 });
			}
		}
		return this.aClass81_2 != null;
	}
}
