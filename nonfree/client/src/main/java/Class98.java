import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class98 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!re;")
	private Class218 aClass218_2;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_15;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class98(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(FLclient!em;ILclient!em;)Z")
	public boolean method1763(@OriginalArg(0) float arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(3) Class23_Sub2 arg2) {
		if (!this.method1766()) {
			return false;
		}
		@Pc(15) Class90 local15 = this.aClass117_Sub1_15.aClass90_4;
		@Pc(26) Class1_Sub3_Sub12 local26 = new Class1_Sub3_Sub12(this.aClass117_Sub1_15, 6408, arg1.anInt1323, arg1.anInt1328);
		@Pc(28) boolean local28 = false;
		this.aClass117_Sub1_15.method2464(local15);
		local15.method1656(0, local26);
		if (local15.method1659()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt1323, arg1.anInt1328);
			OpenGL.glUseProgramObjectARB(this.aClass218_2.aLong188);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass218_2.aLong188, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass218_2.aLong188, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass218_2.aLong188, "sampleSize"), 1.0F / (float) arg2.anInt1323, 1.0F / (float) arg2.anInt1328);
			for (@Pc(102) int local102 = 0; local102 < arg1.anInt1326; local102++) {
				@Pc(111) float local111 = (float) local102 / (float) arg1.anInt1326;
				this.aClass117_Sub1_15.method2504(arg2);
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
				arg1.method1161(arg1.anInt1323, arg1.anInt1328, local102);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local28 = true;
			OpenGL.glPopMatrix();
		}
		local15.method1649(0);
		this.aClass117_Sub1_15.method2467(local15);
		return local28;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z")
	public boolean method1766() {
		if (this.aClass117_Sub1_15.aBoolean310 && this.aClass117_Sub1_15.bf && this.aClass218_2 == null) {
			@Pc(24) Class143 local24 = Static410.method5251("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass117_Sub1_15, 35632);
			if (local24 != null) {
				this.aClass218_2 = Static343.method4474(this.aClass117_Sub1_15, new Class143[] { local24 });
			}
		}
		return this.aClass218_2 != null;
	}
}
