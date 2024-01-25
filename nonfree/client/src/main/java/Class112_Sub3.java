import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class112_Sub3 extends Class112 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Z")
	private boolean aBoolean342 = false;

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Lclient!de;")
	private final Class67 aClass67_2;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "Lclient!iu;")
	private Class150 aClass150_1;

	static {
		new Class98("", 76);
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!gi;Lclient!de;)V")
	public Class112_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_2 = arg1;
		if (this.aClass67_2.aClass79_Sub3_1 != null && super.aClass42_Sub3_39.aBoolean297 && super.aClass42_Sub3_39.aBoolean302) {
			@Pc(30) Class272 local30 = Static67.method1543(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass42_Sub3_39);
			@Pc(37) Class272 local37 = Static67.method1543(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass42_Sub3_39);
			this.aClass150_1 = Static152.method3025(new Class272[] { local30, local37 }, super.aClass42_Sub3_39);
			this.aBoolean343 = this.aClass150_1 != null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean342) {
			super.aClass42_Sub3_39.method3219(arg0);
			super.aClass42_Sub3_39.method3257(arg1);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class79_Sub4 local15 = super.aClass42_Sub3_39.method3270();
		if (!this.aBoolean343 || local15 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass42_Sub3_39.aFloatArray33[1])) * 2.0F + 1.0F;
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(local15);
		super.aClass42_Sub3_39.method3259(0);
		super.aClass42_Sub3_39.method3219(this.aClass67_2.aClass79_Sub3_1);
		@Pc(60) long local60 = this.aClass150_1.aLong125;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass42_Sub3_39.aFloatArray33[0], -super.aClass42_Sub3_39.aFloatArray33[1], -super.aClass42_Sub3_39.aFloatArray33[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local34 * super.aClass42_Sub3_39.aFloat99, local34 * super.aClass42_Sub3_39.aFloat104, local34 * super.aClass42_Sub3_39.aFloat93, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass42_Sub3_39.aFloatArray33[1]) * 928.0F + 64.0F);
		this.aBoolean342 = true;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean342) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass150_1.aLong125;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass42_Sub3_39.anInt3674 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return this.aBoolean343;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (!this.aBoolean342) {
			return;
		}
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(null);
		super.aClass42_Sub3_39.method3259(0);
		super.aClass42_Sub3_39.method3219(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean342 = false;
	}
}
