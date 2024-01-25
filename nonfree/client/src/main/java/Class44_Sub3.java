import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!hm;")
	private final Class145 aClass145_2;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!vca;")
	private Class344 aClass344_2;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!no;Lclient!hm;)V")
	public Class44_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class145 arg1) {
		super(arg0);
		this.aClass145_2 = arg1;
		if (this.aClass145_2.aClass114_Sub2_1 != null && super.aClass66_Sub3_38.aBoolean479 && super.aClass66_Sub3_38.aBoolean469) {
			@Pc(30) Class312 local30 = Static527.method7358(super.aClass66_Sub3_38, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class312 local37 = Static527.method7358(super.aClass66_Sub3_38, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass344_2 = Static80.method1405(new Class312[] { local30, local37 }, super.aClass66_Sub3_38);
			this.aBoolean358 = this.aClass344_2 != null;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class114_Sub3 local16 = super.aClass66_Sub3_38.method5385();
		if (!this.aBoolean358 || local16 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass66_Sub3_38.aFloatArray41[1])) * 2.0F + 1.0F;
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(local16);
		super.aClass66_Sub3_38.method5381(0);
		super.aClass66_Sub3_38.method5382(this.aClass145_2.aClass114_Sub2_1);
		@Pc(61) long local61 = this.aClass344_2.aLong283;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass66_Sub3_38.aFloatArray41[0], -super.aClass66_Sub3_38.aFloatArray41[1], -super.aClass66_Sub3_38.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), local35 * super.aClass66_Sub3_38.aFloat116, local35 * super.aClass66_Sub3_38.aFloat112, local35 * super.aClass66_Sub3_38.aFloat131, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass66_Sub3_38.aFloatArray41[1]) * 928.0F + 64.0F);
		this.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		if (!this.aBoolean359) {
			return;
		}
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(null);
		super.aClass66_Sub3_38.method5381(0);
		super.aClass66_Sub3_38.method5382(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean359 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		if (!this.aBoolean359) {
			super.aClass66_Sub3_38.method5382(arg1);
			super.aClass66_Sub3_38.method5355(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean359) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg1 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg0 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(48) float local48 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(57) float local57 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(63) int local63 = arg0 >> 27 & 0xF;
		@Pc(67) long local67 = this.aClass344_2.aLong283;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "time"), (float) (super.aClass66_Sub3_38.anInt6442 * local15 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "breakWaterOffset"), local39);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local67, "waveIntensity"), local57, local48);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local67, "waveExponent"), (float) local63);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return this.aBoolean358;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
	}
}
