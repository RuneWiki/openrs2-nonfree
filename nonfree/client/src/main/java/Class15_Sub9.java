import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class15_Sub9 extends Class15 {

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "Lclient!fj;")
	private final Class105 aClass105_5;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!caa;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!er;Lclient!fj;)V")
	public Class15_Sub9(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class105 arg1) {
		super(arg0);
		this.aClass105_5 = arg1;
		if (this.aClass105_5.aClass50_Sub3_3 != null && super.aClass31_Sub2_40.aBoolean212 && super.aClass31_Sub2_40.aBoolean221) {
			@Pc(30) Class157 local30 = Static524.method7238(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass31_Sub2_40);
			@Pc(37) Class157 local37 = Static524.method7238(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass31_Sub2_40);
			this.aClass45_7 = Static467.method6394(super.aClass31_Sub2_40, new Class157[] { local30, local37 });
			this.aBoolean590 = this.aClass45_7 != null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean591) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg0 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass45_7.aLong21;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (super.aClass31_Sub2_40.anInt3134 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		@Pc(17) Class50_Sub4 local17 = super.aClass31_Sub2_40.method2559();
		if (!this.aBoolean590 || local17 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass31_Sub2_40.aFloatArray29[1])) * 2.0F + 1.0F;
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(local17);
		super.aClass31_Sub2_40.method2513(0);
		super.aClass31_Sub2_40.method2535(this.aClass105_5.aClass50_Sub3_3);
		@Pc(61) long local61 = this.aClass45_7.aLong21;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass31_Sub2_40.aFloatArray29[0], -super.aClass31_Sub2_40.aFloatArray29[1], -super.aClass31_Sub2_40.aFloatArray29[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), super.aClass31_Sub2_40.aFloat86 * local35, local35 * super.aClass31_Sub2_40.aFloat76, super.aClass31_Sub2_40.aFloat88 * local35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass31_Sub2_40.aFloatArray29[1]) * 928.0F + 64.0F);
		this.aBoolean591 = true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (!this.aBoolean591) {
			return;
		}
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(null);
		super.aClass31_Sub2_40.method2513(0);
		super.aClass31_Sub2_40.method2535(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean591 = false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean591) {
			super.aClass31_Sub2_40.method2535(arg0);
			super.aClass31_Sub2_40.method2495(arg1);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return this.aBoolean590;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}
}
