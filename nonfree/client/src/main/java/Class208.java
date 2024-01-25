import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class208 {

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!bt;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_35;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class208(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_35 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z")
	public boolean method4555() {
		if (this.aClass49_Sub2_35.aBoolean117 && this.aClass49_Sub2_35.aBoolean112 && this.aClass32_5 == null) {
			@Pc(17) Class130 local17 = Static178.method5745(this.aClass49_Sub2_35, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local17 != null) {
				this.aClass32_5 = Static91.method1767(new Class130[] { local17 }, this.aClass49_Sub2_35);
			}
		}
		return this.aClass32_5 != null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!md;Lclient!md;FB)Z")
	public boolean method4557(@OriginalArg(0) Class55_Sub2 arg0, @OriginalArg(1) Class55_Sub2 arg1, @OriginalArg(2) float arg2) {
		if (!this.method4555()) {
			return false;
		}
		@Pc(15) Class127 local15 = this.aClass49_Sub2_35.aClass127_1;
		@Pc(26) Class2_Sub5_Sub15 local26 = new Class2_Sub5_Sub15(this.aClass49_Sub2_35, 6408, arg1.anInt4568, arg1.anInt4569);
		this.aClass49_Sub2_35.method1589(local15);
		@Pc(33) boolean local33 = false;
		local15.method2874(0, local26);
		if (local15.method2871()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt4568, arg1.anInt4569);
			OpenGL.glUseProgramObjectARB(this.aClass32_5.aLong35);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass32_5.aLong35, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass32_5.aLong35, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass32_5.aLong35, "sampleSize"), 1.0F / (float) arg0.anInt4568, 1.0F / (float) arg0.anInt4569);
			for (@Pc(111) int local111 = 0; local111 < arg1.anInt4574; local111++) {
				@Pc(120) float local120 = (float) local111 / (float) arg1.anInt4574;
				this.aClass49_Sub2_35.method1646(arg0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local120);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local120);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local120);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local120);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg1.method3683(arg1.anInt4568, arg1.anInt4569, local111);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local33 = true;
			OpenGL.glPopMatrix();
		}
		local15.method2875(0);
		this.aClass49_Sub2_35.method1659(local15);
		return local33;
	}
}
