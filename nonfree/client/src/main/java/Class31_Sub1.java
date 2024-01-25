import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bha", name = "n", descriptor = "Lclient!an;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "Lclient!kba;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!lea;Lclient!an;)V")
	public Class31_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class19 arg1) {
		super(arg0);
		this.aClass19_1 = arg1;
		if (this.aClass19_1.aClass50_Sub1_1 != null && super.aClass101_Sub2_43.aBoolean451 && super.aClass101_Sub2_43.aBoolean452) {
			@Pc(30) Class57 local30 = Static524.method8166("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass101_Sub2_43, 35633);
			@Pc(37) Class57 local37 = Static524.method8166("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass101_Sub2_43, 35632);
			this.aClass190_1 = Static105.method1884(new Class57[] { local30, local37 }, super.aClass101_Sub2_43);
			this.aBoolean57 = this.aClass190_1 != null;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return this.aBoolean57;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean56) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(50) float local50 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(59) float local59 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(65) int local65 = arg1 >> 27 & 0xF;
		@Pc(69) long local69 = this.aClass190_1.aLong151;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "time"), (float) (super.aClass101_Sub2_43.anInt6314 * local17 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterOffset"), local41);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local69, "waveIntensity"), local59, local50);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "waveExponent"), (float) local65);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (!this.aBoolean56) {
			return;
		}
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690((Class50) null);
		super.aClass101_Sub2_43.method5627(0);
		super.aClass101_Sub2_43.method5690((Class50) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class50_Sub3 local8 = super.aClass101_Sub2_43.method5637();
		if (!this.aBoolean57 || local8 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass101_Sub2_43.aFloatArray38[1])) * 2.0F + 1.0F;
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690(local8);
		super.aClass101_Sub2_43.method5627(0);
		super.aClass101_Sub2_43.method5690(this.aClass19_1.aClass50_Sub1_1);
		@Pc(61) long local61 = this.aClass190_1.aLong151;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass101_Sub2_43.aFloatArray38[0], -super.aClass101_Sub2_43.aFloatArray38[1], -super.aClass101_Sub2_43.aFloatArray38[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), local31 * super.aClass101_Sub2_43.aFloat141, local31 * super.aClass101_Sub2_43.aFloat127, local31 * super.aClass101_Sub2_43.aFloat125, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass101_Sub2_43.aFloatArray38[1]) * 928.0F + 64.0F);
		this.aBoolean56 = true;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean56) {
			super.aClass101_Sub2_43.method5690(arg0);
			super.aClass101_Sub2_43.method5681(arg1);
		}
	}
}
