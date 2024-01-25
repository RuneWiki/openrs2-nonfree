import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!afa", name = "q", descriptor = "Lclient!sa;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!afa", name = "m", descriptor = "Lclient!on;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!pq;Lclient!sa;)V")
	public Class11_Sub1(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0);
		this.aClass314_1 = arg1;
		if (this.aClass314_1.aClass53_Sub4_1 != null && super.aClass132_Sub3_43.aBoolean522 && super.aClass132_Sub3_43.aBoolean543) {
			@Pc(30) Class142 local30 = Static639.method8744(35633, super.aClass132_Sub3_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class142 local37 = Static639.method8744(35632, super.aClass132_Sub3_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass260_1 = Static677.method9169(new Class142[] { local30, local37 }, super.aClass132_Sub3_43);
			this.aBoolean22 = this.aClass260_1 != null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		if (!this.aBoolean21) {
			return;
		}
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759((Class53) null);
		super.aClass132_Sub3_43.method6802(0);
		super.aClass132_Sub3_43.method6759((Class53) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean21 = false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class53_Sub3 local12 = super.aClass132_Sub3_43.method6784();
		if (!this.aBoolean22 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass132_Sub3_43.aFloatArray45[1])) * 2.0F + 1.0F;
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759(local12);
		super.aClass132_Sub3_43.method6802(0);
		super.aClass132_Sub3_43.method6759(this.aClass314_1.aClass53_Sub4_1);
		@Pc(56) long local56 = this.aClass260_1.aLong213;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass132_Sub3_43.aFloatArray45[0], -super.aClass132_Sub3_43.aFloatArray45[1], -super.aClass132_Sub3_43.aFloatArray45[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), super.aClass132_Sub3_43.aFloat144 * local30, super.aClass132_Sub3_43.aFloat147 * local30, local30 * super.aClass132_Sub3_43.aFloat135, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass132_Sub3_43.aFloatArray45[1]) * 928.0F + 64.0F);
		this.aBoolean21 = true;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return this.aBoolean22;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		if (!this.aBoolean21) {
			super.aClass132_Sub3_43.method6759(arg1);
			super.aClass132_Sub3_43.method6803(arg0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean21) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass260_1.aLong213;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass132_Sub3_43.anInt7881 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
	}
}
