import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class79 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!cba;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_12;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class79(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
	public boolean method1821() {
		if (this.aClass82_Sub1_12.aBoolean185 && this.aClass82_Sub1_12.aBoolean177 && this.aClass42_3 == null) {
			@Pc(26) Class158 local26 = Static519.method7555(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass82_Sub1_12);
			if (local26 != null) {
				this.aClass42_3 = Static516.method7517(new Class158[] { local26 }, this.aClass82_Sub1_12);
			}
		}
		return this.aClass42_3 != null;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!fj;Lclient!fj;F)Z")
	public boolean method1822(@OriginalArg(1) Class94_Sub3 arg0, @OriginalArg(2) Class94_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method1821()) {
			return false;
		}
		@Pc(15) Class85 local15 = this.aClass82_Sub1_12.aClass85_2;
		@Pc(26) Class3_Sub7_Sub2 local26 = new Class3_Sub7_Sub2(this.aClass82_Sub1_12, 6408, arg0.anInt3184, arg0.anInt3189);
		@Pc(28) boolean local28 = false;
		this.aClass82_Sub1_12.method2043(local15);
		local15.method2142(local26, 0);
		if (local15.method2143()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt3184, arg0.anInt3189);
			OpenGL.glUseProgramObjectARB(this.aClass42_3.aLong45);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass42_3.aLong45, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass42_3.aLong45, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass42_3.aLong45, "sampleSize"), 1.0F / (float) arg1.anInt3184, 1.0F / (float) arg1.anInt3189);
			for (@Pc(102) int local102 = 0; local102 < arg0.anInt3188; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg0.anInt3188;
				this.aClass82_Sub1_12.method2029(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local111);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local111);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local111);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local111);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method2754(arg0.anInt3189, arg0.anInt3184, local102);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local28 = true;
		}
		local15.method2145(0);
		this.aClass82_Sub1_12.method2042(local15);
		return local28;
	}
}
