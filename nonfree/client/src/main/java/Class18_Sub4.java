import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!fa;")
	private final Class101 aClass101_2;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!waa;")
	private Class369 aClass369_2;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ep;Lclient!fa;)V")
	public Class18_Sub4(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class101 arg1) {
		super(arg0);
		this.aClass101_2 = arg1;
		if (this.aClass101_2.aClass65_Sub2_1 != null && super.aClass95_Sub1_39.aBoolean198 && super.aClass95_Sub1_39.aBoolean179) {
			@Pc(30) Class83 local30 = Static547.method7553("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass95_Sub1_39, 35633);
			@Pc(37) Class83 local37 = Static547.method7553("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass95_Sub1_39, 35632);
			this.aClass369_2 = Static238.method3336(super.aClass95_Sub1_39, new Class83[] { local30, local37 });
			this.aBoolean163 = this.aClass369_2 != null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (!this.aBoolean162) {
			return;
		}
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(null);
		super.aClass95_Sub1_39.method2098(0);
		super.aClass95_Sub1_39.method2077(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub4 local8 = super.aClass95_Sub1_39.method2052();
		if (!this.aBoolean163 || local8 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass95_Sub1_39.aFloatArray7[1])) * 2.0F + 1.0F;
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(local8);
		super.aClass95_Sub1_39.method2098(0);
		super.aClass95_Sub1_39.method2077(this.aClass101_2.aClass65_Sub2_1);
		@Pc(60) long local60 = this.aClass369_2.aLong271;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass95_Sub1_39.aFloatArray7[0], -super.aClass95_Sub1_39.aFloatArray7[1], -super.aClass95_Sub1_39.aFloatArray7[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), super.aClass95_Sub1_39.aFloat30 * local34, super.aClass95_Sub1_39.aFloat32 * local34, super.aClass95_Sub1_39.aFloat35 * local34, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass95_Sub1_39.aFloatArray7[1]) * 928.0F + 64.0F);
		this.aBoolean162 = true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean162) {
			return;
		}
		@Pc(14) int local14 = 0x1 << (arg0 & 0x3);
		@Pc(25) float local25 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(29) int local29 = arg1 & 0xFFFF;
		@Pc(38) float local38 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(47) float local47 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(56) float local56 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(62) int local62 = arg1 >> 27 & 0xF;
		@Pc(66) long local66 = this.aClass369_2.aLong271;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "time"), (float) (local14 * super.aClass95_Sub1_39.anInt2513 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "scale"), local25);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterDepth"), (float) local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterOffset"), local38);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local66, "waveIntensity"), local56, local47);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "waveExponent"), (float) local62);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		if (!this.aBoolean162) {
			super.aClass95_Sub1_39.method2077(arg1);
			super.aClass95_Sub1_39.method2106(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return this.aBoolean163;
	}
}
