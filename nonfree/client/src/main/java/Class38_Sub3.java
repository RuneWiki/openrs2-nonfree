import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!sn;")
	private final Class336 aClass336_1;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "Lclient!tw;")
	private Class356 aClass356_1;

	static {
		new Class162("", 76);
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!pi;Lclient!sn;)V")
	public Class38_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_1 = arg1;
		if (this.aClass336_1.aClass161_Sub3_3 != null && super.aClass144_Sub3_43.aBoolean574 && super.aClass144_Sub3_43.aBoolean578) {
			@Pc(34) Class95 local34 = Static73.method1220("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass144_Sub3_43, 35633);
			@Pc(43) Class95 local43 = Static73.method1220("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass144_Sub3_43, 35632);
			this.aClass356_1 = Static264.method4385(new Class95[] { local34, local43 }, super.aClass144_Sub3_43);
			this.aBoolean151 = this.aClass356_1 != null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9399(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9406(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class161_Sub4 local8 = super.aClass144_Sub3_43.method7027();
		if (!this.aBoolean151 || local8 == null) {
			return;
		}
		@Pc(29) float local29 = (1.0F - Math.abs(super.aClass144_Sub3_43.aFloatArray65[1])) * 2.0F + 1.0F;
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982(local8);
		super.aClass144_Sub3_43.method7028(0);
		super.aClass144_Sub3_43.method6982(this.aClass336_1.aClass161_Sub3_3);
		@Pc(55) long local55 = this.aClass356_1.aLong275;
		OpenGL.glUseProgramObjectARB(local55);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local55, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local55, "sunDir"), -super.aClass144_Sub3_43.aFloatArray65[0], -super.aClass144_Sub3_43.aFloatArray65[1], -super.aClass144_Sub3_43.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local55, "sunColour"), super.aClass144_Sub3_43.aFloat144 * local29, local29 * super.aClass144_Sub3_43.aFloat161, local29 * super.aClass144_Sub3_43.aFloat145, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local55, "sunExponent"), Math.abs(super.aClass144_Sub3_43.aFloatArray65[1]) * 928.0F + 64.0F);
		this.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V")
	@Override
	public void method9398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean152) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass356_1.aLong275;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass144_Sub3_43.anInt8054 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLclient!pu;I)V")
	@Override
	public void method9401(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean152) {
			super.aClass144_Sub3_43.method6982(arg0);
			super.aClass144_Sub3_43.method6988(arg1);
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V")
	@Override
	public void method9402() {
		if (!this.aBoolean152) {
			return;
		}
		super.aClass144_Sub3_43.method7028(1);
		super.aClass144_Sub3_43.method6982((Class161) null);
		super.aClass144_Sub3_43.method7028(0);
		super.aClass144_Sub3_43.method6982((Class161) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean152 = false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9403() {
		return this.aBoolean151;
	}
}
