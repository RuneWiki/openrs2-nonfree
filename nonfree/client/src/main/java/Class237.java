import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class237 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "Lclient!iu;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_26;

	static {
		new Class88("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class237(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_26 = arg0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)Z")
	public boolean method5726() {
		if (this.aClass42_Sub3_26.aBoolean305 && this.aClass42_Sub3_26.aBoolean302 && this.aClass150_2 == null) {
			@Pc(26) Class272 local26 = Static67.method1543(35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", this.aClass42_Sub3_26);
			if (local26 != null) {
				this.aClass150_2 = Static152.method3025(new Class272[] { local26 }, this.aClass42_Sub3_26);
			}
		}
		return this.aClass150_2 != null;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(FLclient!mj;Lclient!mj;I)Z")
	public boolean method5727(@OriginalArg(0) float arg0, @OriginalArg(1) Class79_Sub3 arg1, @OriginalArg(2) Class79_Sub3 arg2) {
		if (!this.method5726()) {
			return false;
		}
		@Pc(15) Class9 local15 = this.aClass42_Sub3_26.aClass9_4;
		@Pc(26) Class12_Sub4_Sub5 local26 = new Class12_Sub4_Sub5(this.aClass42_Sub3_26, 6408, arg1.anInt5943, arg1.anInt5938);
		this.aClass42_Sub3_26.method3211(local15);
		@Pc(33) boolean local33 = false;
		local15.method285(local26, 0);
		if (local15.method284()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt5943, arg1.anInt5938);
			OpenGL.glUseProgramObjectARB(this.aClass150_2.aLong125);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass150_2.aLong125, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass150_2.aLong125, "rcpRelief"), 1.0F / arg0);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass150_2.aLong125, "sampleSize"), 1.0F / (float) arg2.anInt5943, 1.0F / (float) arg2.anInt5938);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt5942; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt5942;
				this.aClass42_Sub3_26.method3219(arg2);
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
				arg1.method4968(local107, arg1.anInt5938, arg1.anInt5943);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local33 = true;
		}
		local15.method287(0);
		this.aClass42_Sub3_26.method3256(local15);
		return local33;
	}
}
