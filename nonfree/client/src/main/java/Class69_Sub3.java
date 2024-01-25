import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class69_Sub3 extends Class69 {

	@OriginalMember(owner = "client!md", name = "t", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Lclient!pq;")
	private final Class202 aClass202_3;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!re;")
	private Class218 aClass218_7;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ih;Lclient!pq;)V")
	public Class69_Sub3(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_3 = arg1;
		if (this.aClass202_3.aClass23_Sub2_2 != null && super.aClass117_Sub1_43.aBoolean296 && super.aClass117_Sub1_43.bf) {
			@Pc(30) Class143 local30 = Static410.method5251("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass117_Sub1_43, 35633);
			@Pc(37) Class143 local37 = Static410.method5251("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass117_Sub1_43, 35632);
			this.aClass218_7 = Static343.method4474(super.aClass117_Sub1_43, new Class143[] { local30, local37 });
			this.aBoolean414 = this.aClass218_7 != null;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class23_Sub1 local16 = super.aClass117_Sub1_43.method2518();
		if (!this.aBoolean414 || local16 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass117_Sub1_43.aFloatArray12[1])) * 2.0F + 1.0F;
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2504(local16);
		super.aClass117_Sub1_43.method2476(0);
		super.aClass117_Sub1_43.method2504(this.aClass202_3.aClass23_Sub2_2);
		@Pc(61) long local61 = this.aClass218_7.aLong188;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass117_Sub1_43.aFloatArray12[0], -super.aClass117_Sub1_43.aFloatArray12[1], -super.aClass117_Sub1_43.aFloatArray12[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), super.aClass117_Sub1_43.aFloat47 * local35, super.aClass117_Sub1_43.aFloat45 * local35, super.aClass117_Sub1_43.aFloat30 * local35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass117_Sub1_43.aFloatArray12[1]) * 928.0F + 64.0F);
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean413) {
			super.aClass117_Sub1_43.method2504(arg0);
			super.aClass117_Sub1_43.method2535(arg1);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return this.aBoolean414;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		if (!this.aBoolean413) {
			return;
		}
		super.aClass117_Sub1_43.method2476(1);
		super.aClass117_Sub1_43.method2504(null);
		super.aClass117_Sub1_43.method2476(0);
		super.aClass117_Sub1_43.method2504(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean413) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass218_7.aLong188;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass117_Sub1_43.anInt3092 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}
}
