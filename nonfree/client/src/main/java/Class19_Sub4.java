import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!gha", name = "l", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!gha", name = "n", descriptor = "Lclient!b;")
	private final Class25 aClass25_2;

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Lclient!gb;")
	private Class125 aClass125_5;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!kv;Lclient!b;)V")
	public Class19_Sub4(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class25 arg1) {
		super(arg0);
		this.aClass25_2 = arg1;
		if (this.aClass25_2.aClass44_Sub2_3 != null && super.aClass143_Sub2_39.aBoolean412 && super.aClass143_Sub2_39.aBoolean421) {
			@Pc(30) Class227 local30 = Static285.method3923(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass143_Sub2_39);
			@Pc(37) Class227 local37 = Static285.method3923(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass143_Sub2_39);
			this.aClass125_5 = Static616.method8266(new Class227[] { local30, local37 }, super.aClass143_Sub2_39);
			this.aBoolean214 = this.aClass125_5 != null;
		}
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7874() {
		return this.aBoolean214;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!fia;IZ)V")
	@Override
	public void method7873(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean213) {
			super.aClass143_Sub2_39.method4945(arg0);
			super.aClass143_Sub2_39.method4994(arg1);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7872(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
	@Override
	public void method7876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean213) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass125_5.aLong111;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass143_Sub2_39.anInt5822 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7875(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class44_Sub3 local12 = super.aClass143_Sub2_39.method4953();
		if (!this.aBoolean214 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass143_Sub2_39.aFloatArray40[1])) * 2.0F + 1.0F;
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945(local12);
		super.aClass143_Sub2_39.method4930(0);
		super.aClass143_Sub2_39.method4945(this.aClass25_2.aClass44_Sub2_3);
		@Pc(56) long local56 = this.aClass125_5.aLong111;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass143_Sub2_39.aFloatArray40[0], -super.aClass143_Sub2_39.aFloatArray40[1], -super.aClass143_Sub2_39.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass143_Sub2_39.aFloat100, local30 * super.aClass143_Sub2_39.aFloat98, super.aClass143_Sub2_39.aFloat96 * local30, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass143_Sub2_39.aFloatArray40[1]) * 928.0F + 64.0F);
		this.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
	@Override
	public void method7871() {
		if (!this.aBoolean213) {
			return;
		}
		super.aClass143_Sub2_39.method4930(1);
		super.aClass143_Sub2_39.method4945((Class44) null);
		super.aClass143_Sub2_39.method4930(0);
		super.aClass143_Sub2_39.method4945((Class44) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean213 = false;
	}
}
