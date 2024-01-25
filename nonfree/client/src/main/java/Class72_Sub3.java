import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class72_Sub3 extends Class72 {

	@OriginalMember(owner = "client!hp", name = "s", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!po;")
	private final Class194 aClass194_4;

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "Lclient!wf;")
	private Class265 aClass265_3;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!vj;Lclient!po;)V")
	public Class72_Sub3(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class194 arg1) {
		super(arg0);
		this.aClass194_4 = arg1;
		if (this.aClass194_4.aClass112_Sub1_1 != null && super.aClass172_Sub2_43.aBoolean602 && super.aClass172_Sub2_43.aBoolean623) {
			@Pc(30) Class104 local30 = Static444.method5856(35633, super.aClass172_Sub2_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class104 local37 = Static444.method5856(35632, super.aClass172_Sub2_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass265_3 = Static64.method1304(new Class104[] { local30, local37 }, super.aClass172_Sub2_43);
			this.aBoolean279 = this.aClass265_3 != null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		if (!this.aBoolean278) {
			super.aClass172_Sub2_43.method5630(arg1);
			super.aClass172_Sub2_43.method5629(arg0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class112_Sub4 local13 = super.aClass172_Sub2_43.method5554();
		if (!this.aBoolean279 || local13 == null) {
			return;
		}
		@Pc(32) float local32 = (1.0F - Math.abs(super.aClass172_Sub2_43.aFloatArray26[1])) * 2.0F + 1.0F;
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(local13);
		super.aClass172_Sub2_43.method5569(0);
		super.aClass172_Sub2_43.method5630(this.aClass194_4.aClass112_Sub1_1);
		@Pc(60) long local60 = this.aClass265_3.aLong224;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass172_Sub2_43.aFloatArray26[0], -super.aClass172_Sub2_43.aFloatArray26[1], -super.aClass172_Sub2_43.aFloatArray26[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local32 * super.aClass172_Sub2_43.aFloat84, local32 * super.aClass172_Sub2_43.aFloat85, local32 * super.aClass172_Sub2_43.aFloat76, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass172_Sub2_43.aFloatArray26[1]) * 928.0F + 64.0F);
		this.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		if (!this.aBoolean278) {
			return;
		}
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(null);
		super.aClass172_Sub2_43.method5569(0);
		super.aClass172_Sub2_43.method5630(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean278) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass265_3.aLong224;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass172_Sub2_43.anInt7161 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}
}
