import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class44_Sub6 extends Class44 {

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!nea", name = "j", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!nea", name = "f", descriptor = "Lclient!od;")
	private final Class262 aClass262_5;

	@OriginalMember(owner = "client!nea", name = "o", descriptor = "Lclient!pq;")
	private Class290 aClass290_6;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!pc;Lclient!od;)V")
	public Class44_Sub6(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class262 arg1) {
		super(arg0);
		this.aClass262_5 = arg1;
		if (this.aClass262_5.aClass116_Sub3_2 != null && super.aClass33_Sub3_34.aBoolean556 && super.aClass33_Sub3_34.aBoolean554) {
			@Pc(30) Class297 local30 = Static572.method7590(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass33_Sub3_34);
			@Pc(37) Class297 local37 = Static572.method7590(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass33_Sub3_34);
			this.aClass290_6 = Static208.method3117(new Class297[] { local30, local37 }, super.aClass33_Sub3_34);
			this.aBoolean444 = this.aClass290_6 != null;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return this.aBoolean444;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (!this.aBoolean445) {
			return;
		}
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340((Class116) null);
		super.aClass33_Sub3_34.method6329(0);
		super.aClass33_Sub3_34.method6340((Class116) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean445 = false;
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		if (!this.aBoolean445) {
			super.aClass33_Sub3_34.method6340(arg1);
			super.aClass33_Sub3_34.method6336(arg0);
		}
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class116_Sub1 local8 = super.aClass33_Sub3_34.method6366();
		if (!this.aBoolean444 || local8 == null) {
			return;
		}
		@Pc(26) float local26 = (1.0F - Math.abs(super.aClass33_Sub3_34.aFloatArray54[1])) * 2.0F + 1.0F;
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340(local8);
		super.aClass33_Sub3_34.method6329(0);
		super.aClass33_Sub3_34.method6340(this.aClass262_5.aClass116_Sub3_2);
		@Pc(52) long local52 = this.aClass290_6.aLong217;
		OpenGL.glUseProgramObjectARB(local52);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local52, "sunDir"), -super.aClass33_Sub3_34.aFloatArray54[0], -super.aClass33_Sub3_34.aFloatArray54[1], -super.aClass33_Sub3_34.aFloatArray54[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local52, "sunColour"), local26 * super.aClass33_Sub3_34.aFloat164, local26 * super.aClass33_Sub3_34.aFloat179, local26 * super.aClass33_Sub3_34.aFloat171, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local52, "sunExponent"), Math.abs(super.aClass33_Sub3_34.aFloatArray54[1]) * 928.0F + 64.0F);
		this.aBoolean445 = true;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean445) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass290_6.aLong217;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass33_Sub3_34.anInt7264 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}
}
