import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class365 {

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "Lclient!ua;")
	private Class326 aClass326_7;

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_42;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class365(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!saa;ILclient!saa;F)Z")
	public boolean method8391(@OriginalArg(0) Class121_Sub4 arg0, @OriginalArg(2) Class121_Sub4 arg1, @OriginalArg(3) float arg2) {
		if (!this.method8392()) {
			return false;
		}
		@Pc(20) Class324 local20 = this.aClass33_Sub3_42.aClass324_2;
		@Pc(31) Class3_Sub1_Sub5 local31 = new Class3_Sub1_Sub5(this.aClass33_Sub3_42, 6408, arg1.anInt8892, arg1.anInt8895);
		this.aClass33_Sub3_42.method3050(local20);
		@Pc(38) boolean local38 = false;
		local20.method7846(0, local31);
		if (local20.method7847()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg1.anInt8892, arg1.anInt8895);
			OpenGL.glUseProgramObjectARB(this.aClass326_7.aLong247);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(this.aClass326_7.aLong247, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(this.aClass326_7.aLong247, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(this.aClass326_7.aLong247, "sampleSize"), 1.0F / (float) arg0.anInt8892, 1.0F / (float) arg0.anInt8895);
			for (@Pc(107) int local107 = 0; local107 < arg1.anInt8893; local107++) {
				@Pc(116) float local116 = (float) local107 / (float) arg1.anInt8893;
				this.aClass33_Sub3_42.method3012(arg0);
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
				arg1.method7333(local107, arg1.anInt8892, arg1.anInt8895);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local38 = true;
		}
		local20.method7845(0);
		this.aClass33_Sub3_42.method3034(local20);
		return local38;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Z")
	public boolean method8392() {
		if (this.aClass33_Sub3_42.aBoolean273 && this.aClass33_Sub3_42.aBoolean272 && this.aClass326_7 == null) {
			@Pc(29) Class45 local29 = Static335.method5570(this.aClass33_Sub3_42, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local29 != null) {
				this.aClass326_7 = Static143.method3168(new Class45[] { local29 }, this.aClass33_Sub3_42);
			}
		}
		return this.aClass326_7 != null;
	}
}
