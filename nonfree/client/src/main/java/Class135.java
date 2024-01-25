import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class135 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!uj;")
	private Class342 aClass342_6;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_15;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class135(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z")
	public boolean method3846() {
		if (this.aClass5_Sub1_15.aBoolean40 && this.aClass5_Sub1_15.aBoolean34 && this.aClass342_6 == null) {
			@Pc(26) Class349 local26 = Static327.method5481(35632, this.aClass5_Sub1_15, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local26 != null) {
				this.aClass342_6 = Static333.method5541(this.aClass5_Sub1_15, new Class349[] { local26 });
			}
		}
		return this.aClass342_6 != null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!qj;FLclient!qj;)Z")
	public boolean method3847(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class2_Sub4 arg2) {
		if (!this.method3846()) {
			return false;
		}
		@Pc(15) Class297 local15 = this.aClass5_Sub1_15.aClass297_2;
		@Pc(26) Class6_Sub5_Sub16 local26 = new Class6_Sub5_Sub16(this.aClass5_Sub1_15, 6408, arg2.anInt8332, arg2.anInt8337);
		@Pc(28) boolean local28 = false;
		this.aClass5_Sub1_15.method387(local15);
		local15.method7268(0, local26);
		if (local15.method7265()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg2.anInt8332, arg2.anInt8337);
			OpenGL.glUseProgramObjectARB(this.aClass342_6.aLong257);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass342_6.aLong257, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass342_6.aLong257, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass342_6.aLong257, "sampleSize"), 1.0F / (float) arg0.anInt8332, 1.0F / (float) arg0.anInt8337);
			for (@Pc(102) int local102 = 0; local102 < arg2.anInt8331; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg2.anInt8331;
				this.aClass5_Sub1_15.method352(arg0);
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
				arg2.method6982(local102, arg2.anInt8332, arg2.anInt8337);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method7263(0);
		this.aClass5_Sub1_15.method396(local15);
		return local28;
	}
}
