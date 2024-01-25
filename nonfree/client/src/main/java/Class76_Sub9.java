import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class76_Sub9 extends Class76 {

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Z")
	private boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!sda;")
	private final Class303 aClass303_6;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!hca;")
	private Class132 aClass132_7;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!ok;Lclient!sda;)V")
	public Class76_Sub9(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class303 arg1) {
		super(arg0);
		this.aClass303_6 = arg1;
		if (this.aClass303_6.aClass40_Sub2_1 != null && super.aClass134_Sub2_43.aBoolean510 && super.aClass134_Sub2_43.aBoolean504) {
			@Pc(30) Class189 local30 = Static364.method4918(35633, super.aClass134_Sub2_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class189 local37 = Static364.method4918(35632, super.aClass134_Sub2_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass132_7 = Static269.method3841(new Class189[] { local30, local37 }, super.aClass134_Sub2_43);
			this.aBoolean729 = this.aClass132_7 != null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class40_Sub4 local13 = super.aClass134_Sub2_43.method5276();
		if (!this.aBoolean729 || local13 == null) {
			return;
		}
		@Pc(32) float local32 = (1.0F - Math.abs(super.aClass134_Sub2_43.aFloatArray40[1])) * 2.0F + 1.0F;
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(local13);
		super.aClass134_Sub2_43.method5197(0);
		super.aClass134_Sub2_43.method5202(this.aClass303_6.aClass40_Sub2_1);
		@Pc(58) long local58 = this.aClass132_7.aLong105;
		OpenGL.glUseProgramObjectARB(local58);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local58, "sunDir"), -super.aClass134_Sub2_43.aFloatArray40[0], -super.aClass134_Sub2_43.aFloatArray40[1], -super.aClass134_Sub2_43.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local58, "sunColour"), local32 * super.aClass134_Sub2_43.aFloat138, local32 * super.aClass134_Sub2_43.aFloat149, super.aClass134_Sub2_43.aFloat152 * local32, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local58, "sunExponent"), Math.abs(super.aClass134_Sub2_43.aFloatArray40[1]) * 928.0F + 64.0F);
		this.aBoolean728 = true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return this.aBoolean729;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		if (!this.aBoolean728) {
			super.aClass134_Sub2_43.method5202(arg1);
			super.aClass134_Sub2_43.method5194(arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean728) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg0 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg1 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(50) float local50 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(59) float local59 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(65) int local65 = arg1 >> 27 & 0xF;
		@Pc(69) long local69 = this.aClass132_7.aLong105;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "time"), (float) (local17 * super.aClass134_Sub2_43.anInt6551 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterOffset"), local41);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local69, "waveIntensity"), local59, local50);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "waveExponent"), (float) local65);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (!this.aBoolean728) {
			return;
		}
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(null);
		super.aClass134_Sub2_43.method5197(0);
		super.aClass134_Sub2_43.method5202(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean728 = false;
	}
}
