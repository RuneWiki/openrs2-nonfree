import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class86 {

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!ed;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_16;

	static {
		new Class84("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class86(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_16 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FI)Z")
	public boolean method1700(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) float arg2) {
		if (!this.method1704()) {
			return false;
		}
		@Pc(20) Class150 local20 = this.aClass109_Sub1_16.aClass150_6;
		@Pc(31) Class1_Sub2_Sub16 local31 = new Class1_Sub2_Sub16(this.aClass109_Sub1_16, 6408, arg0.anInt1607, arg0.anInt1610);
		this.aClass109_Sub1_16.method2600(local20);
		@Pc(38) boolean local38 = false;
		local20.method3520(local31, 0);
		if (local20.method3526()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt1607, arg0.anInt1610);
			OpenGL.glUseProgramObjectARB(this.aClass65_1.aLong47);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass65_1.aLong47, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass65_1.aLong47, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass65_1.aLong47, "sampleSize"), 1.0F / (float) arg1.anInt1607, 1.0F / (float) arg1.anInt1610);
			for (@Pc(107) int local107 = 0; local107 < arg0.anInt1611; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg0.anInt1611;
				this.aClass109_Sub1_16.method2578(arg1);
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
				arg0.method1401(arg0.anInt1607, arg0.anInt1610, local107);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local20.method3525(0);
		this.aClass109_Sub1_16.method2591(local20);
		return local38;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
	public boolean method1704() {
		if (this.aClass109_Sub1_16.aBoolean153 && this.aClass109_Sub1_16.aBoolean160 && this.aClass65_1 == null) {
			@Pc(26) Class149 local26 = Static325.method4587("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass109_Sub1_16, 35632);
			if (local26 != null) {
				this.aClass65_1 = Static292.method3804(this.aClass109_Sub1_16, new Class149[] { local26 });
			}
		}
		return this.aClass65_1 != null;
	}
}
