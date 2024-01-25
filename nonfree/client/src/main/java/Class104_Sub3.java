import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "Z")
	private boolean aBoolean531 = false;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "Z")
	private boolean aBoolean532 = false;

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "Lclient!um;")
	private final Class319 aClass319_3;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "Lclient!lj;")
	private Class200 aClass200_3;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ap;Lclient!um;)V")
	public Class104_Sub3(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_3 = arg1;
		if (this.aClass319_3.aClass132_Sub2_3 != null && super.aClass9_Sub2_40.aBoolean62 && super.aClass9_Sub2_40.aBoolean47) {
			@Pc(30) Class72 local30 = Static568.method8021("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass9_Sub2_40);
			@Pc(37) Class72 local37 = Static568.method8021("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass9_Sub2_40);
			this.aClass200_3 = Static147.method2698(new Class72[] { local30, local37 }, super.aClass9_Sub2_40);
			this.aBoolean531 = this.aClass200_3 != null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		if (!this.aBoolean532) {
			return;
		}
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method814(null);
		super.aClass9_Sub2_40.method806(0);
		super.aClass9_Sub2_40.method814(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean532 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean532) {
			return;
		}
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(52) float local52 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(61) float local61 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(67) int local67 = arg1 >> 27 & 0xF;
		@Pc(71) long local71 = this.aClass200_3.aLong136;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "time"), (float) (super.aClass9_Sub2_40.anInt810 * local19 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "scale"), local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterDepth"), (float) local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterOffset"), local43);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local71, "waveIntensity"), local61, local52);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "waveExponent"), (float) local67);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class132_Sub4 local8 = super.aClass9_Sub2_40.method820();
		if (!this.aBoolean531 || local8 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass9_Sub2_40.aFloatArray3[1])) * 2.0F + 1.0F;
		super.aClass9_Sub2_40.method806(1);
		super.aClass9_Sub2_40.method814(local8);
		super.aClass9_Sub2_40.method806(0);
		super.aClass9_Sub2_40.method814(this.aClass319_3.aClass132_Sub2_3);
		@Pc(56) long local56 = this.aClass200_3.aLong136;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass9_Sub2_40.aFloatArray3[0], -super.aClass9_Sub2_40.aFloatArray3[1], -super.aClass9_Sub2_40.aFloatArray3[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), super.aClass9_Sub2_40.aFloat29 * local30, super.aClass9_Sub2_40.aFloat23 * local30, local30 * super.aClass9_Sub2_40.aFloat18, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass9_Sub2_40.aFloatArray3[1]) * 928.0F + 64.0F);
		this.aBoolean532 = true;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return this.aBoolean531;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		if (!this.aBoolean532) {
			super.aClass9_Sub2_40.method814(arg1);
			super.aClass9_Sub2_40.method822(arg0);
		}
	}
}
