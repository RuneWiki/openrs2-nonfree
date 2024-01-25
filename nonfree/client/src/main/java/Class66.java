import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class66 {

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "Lclient!rv;")
	private Class300 aClass300_2;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_18;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class66(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_18 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Lclient!gp;BLclient!gp;F)Z")
	public boolean method1756(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) Class3_Sub3 arg1, @OriginalArg(3) float arg2) {
		if (!this.method1759()) {
			return false;
		}
		@Pc(15) Class149 local15 = this.aClass100_Sub3_18.aClass149_7;
		@Pc(26) Class6_Sub2_Sub2 local26 = new Class6_Sub2_Sub2(this.aClass100_Sub3_18, 6408, arg0.anInt3826, arg0.anInt3825);
		this.aClass100_Sub3_18.method8935(local15);
		@Pc(40) boolean local40 = false;
		local15.method4102(local26, 0);
		if (local15.method4101()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt3826, arg0.anInt3825);
			OpenGL.glUseProgramObjectARB(this.aClass300_2.aLong224);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass300_2.aLong224, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass300_2.aLong224, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass300_2.aLong224, "sampleSize"), 1.0F / (float) arg1.anInt3826, 1.0F / (float) arg1.anInt3825);
			for (@Pc(111) int local111 = 0; local111 < arg0.anInt3827; local111++) {
				@Pc(120) float local120 = (float) local111 / (float) arg0.anInt3827;
				this.aClass100_Sub3_18.method8925(arg1);
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
				arg0.method3389(arg0.anInt3825, arg0.anInt3826, local111);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local40 = true;
			OpenGL.glPopMatrix();
		}
		local15.method4104(0);
		this.aClass100_Sub3_18.method8896(local15);
		return local40;
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)Z")
	public boolean method1759() {
		if (this.aClass100_Sub3_18.aBoolean698 && this.aClass100_Sub3_18.aBoolean714 && this.aClass300_2 == null) {
			@Pc(21) Class375 local21 = Static142.method2295(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass100_Sub3_18);
			if (local21 != null) {
				this.aClass300_2 = Static648.method9037(new Class375[] { local21 }, this.aClass100_Sub3_18);
			}
		}
		return this.aClass300_2 != null;
	}
}
