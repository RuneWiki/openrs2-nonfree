import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class385 {

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!nfa;")
	private Class241 aClass241_7;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_43;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class385(@OriginalArg(0) Class126_Sub3 arg0) {
		this.aClass126_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!gr;FBLclient!gr;)Z")
	public boolean method8900(@OriginalArg(0) Class24_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class24_Sub2 arg2) {
		if (!this.method8901()) {
			return false;
		}
		@Pc(15) Class243 local15 = this.aClass126_Sub3_43.aClass243_2;
		@Pc(26) Class5_Sub4_Sub5 local26 = new Class5_Sub4_Sub5(this.aClass126_Sub3_43, 6408, arg0.anInt3462, arg0.anInt3468);
		@Pc(38) boolean local38 = false;
		this.aClass126_Sub3_43.method7097(local15);
		local15.method5833(local26, 0);
		if (local15.method5826()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt3462, arg0.anInt3468);
			OpenGL.glUseProgramObjectARB(this.aClass241_7.aLong184);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass241_7.aLong184, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass241_7.aLong184, "rcpRelief"), 1.0F / arg1);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass241_7.aLong184, "sampleSize"), 1.0F / (float) arg2.anInt3462, 1.0F / (float) arg2.anInt3468);
			for (@Pc(112) int local112 = 0; local112 < arg0.anInt3470; local112++) {
				@Pc(121) float local121 = (float) local112 / (float) arg0.anInt3470;
				this.aClass126_Sub3_43.method7113(arg2);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local121);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local121);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local121);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local121);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method3064(local112, arg0.anInt3462, arg0.anInt3468);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			local38 = true;
			OpenGL.glPopMatrix();
		}
		local15.method5839(0);
		this.aClass126_Sub3_43.method7111(local15);
		return local38;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z")
	public boolean method8901() {
		if (this.aClass126_Sub3_43.aBoolean666 && this.aClass126_Sub3_43.aBoolean687 && this.aClass241_7 == null) {
			@Pc(35) Class46 local35 = Static304.method4409("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, this.aClass126_Sub3_43);
			if (local35 != null) {
				this.aClass241_7 = Static38.method711(this.aClass126_Sub3_43, new Class46[] { local35 });
			}
		}
		return this.aClass241_7 != null;
	}
}
