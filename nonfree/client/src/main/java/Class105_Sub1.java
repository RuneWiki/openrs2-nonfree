import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!ul;")
	private final Class330 aClass330_1;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Lclient!qn;")
	private Class281 aClass281_1;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!kfa;Lclient!ul;)V")
	public Class105_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class330 arg1) {
		super(arg0);
		this.aClass330_1 = arg1;
		if (this.aClass330_1.aClass3_Sub3_3 != null && super.aClass7_Sub2_41.aBoolean382 && super.aClass7_Sub2_41.aBoolean401) {
			@Pc(30) Class11 local30 = Static427.method6369(super.aClass7_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class11 local37 = Static427.method6369(super.aClass7_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass281_1 = Static110.method2036(new Class11[] { local30, local37 }, super.aClass7_Sub2_41);
			this.aBoolean228 = this.aClass281_1 != null;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (!this.aBoolean229) {
			return;
		}
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(null);
		super.aClass7_Sub2_41.method4326(0);
		super.aClass7_Sub2_41.method4313(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean229 = false;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean229) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg0 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass281_1.aLong222;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (super.aClass7_Sub2_41.anInt5597 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (!this.aBoolean229) {
			super.aClass7_Sub2_41.method4313(arg1);
			super.aClass7_Sub2_41.method4288(arg0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class3_Sub4 local8 = super.aClass7_Sub2_41.method4353();
		if (!this.aBoolean228 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass7_Sub2_41.aFloatArray43[1])) * 2.0F + 1.0F;
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(local8);
		super.aClass7_Sub2_41.method4326(0);
		super.aClass7_Sub2_41.method4313(this.aClass330_1.aClass3_Sub3_3);
		@Pc(55) long local55 = this.aClass281_1.aLong222;
		OpenGL.glUseProgramObjectARB(local55);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local55, "sunDir"), -super.aClass7_Sub2_41.aFloatArray43[0], -super.aClass7_Sub2_41.aFloatArray43[1], -super.aClass7_Sub2_41.aFloatArray43[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local55, "sunColour"), super.aClass7_Sub2_41.aFloat145 * local27, local27 * super.aClass7_Sub2_41.aFloat137, local27 * super.aClass7_Sub2_41.aFloat129, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local55, "sunExponent"), Math.abs(super.aClass7_Sub2_41.aFloatArray43[1]) * 928.0F + 64.0F);
		this.aBoolean229 = true;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return this.aBoolean228;
	}
}
