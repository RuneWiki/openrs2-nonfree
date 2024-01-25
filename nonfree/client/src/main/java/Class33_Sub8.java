import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class33_Sub8 extends Class33 {

	@OriginalMember(owner = "client!tja", name = "l", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "client!tja", name = "o", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "client!tja", name = "s", descriptor = "Lclient!go;")
	private final Class130 aClass130_5;

	@OriginalMember(owner = "client!tja", name = "p", descriptor = "Lclient!hw;")
	private Class152 aClass152_7;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lclient!qfa;Lclient!go;)V")
	public Class33_Sub8(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class130 arg1) {
		super(arg0);
		this.aClass130_5 = arg1;
		if (this.aClass130_5.aClass66_Sub2_3 != null && super.aClass137_Sub3_42.aBoolean598 && super.aClass137_Sub3_42.aBoolean599) {
			@Pc(30) Class237 local30 = Static489.method7252(35633, super.aClass137_Sub3_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class237 local37 = Static489.method7252(35632, super.aClass137_Sub3_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass152_7 = Static174.method9031(new Class237[] { local30, local37 }, super.aClass137_Sub3_42);
			this.aBoolean701 = this.aClass152_7 != null;
		}
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V")
	@Override
	public void method8848() {
		if (!this.aBoolean702) {
			return;
		}
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090((Class66) null);
		super.aClass137_Sub3_42.method7095(0);
		super.aClass137_Sub3_42.method7090((Class66) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean702 = false;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8846() {
		return this.aBoolean701;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BII)V")
	@Override
	public void method8849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean702) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass152_7.aLong121;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass137_Sub3_42.anInt8544 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8847(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IZLclient!dca;)V")
	@Override
	public void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		if (!this.aBoolean702) {
			super.aClass137_Sub3_42.method7090(arg1);
			super.aClass137_Sub3_42.method7077(arg0);
		}
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(ZI)V")
	@Override
	public void method8854(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class66_Sub4 local8 = super.aClass137_Sub3_42.method7085();
		if (!this.aBoolean701 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass137_Sub3_42.aFloatArray65[1])) * 2.0F + 1.0F;
		super.aClass137_Sub3_42.method7095(1);
		super.aClass137_Sub3_42.method7090(local8);
		super.aClass137_Sub3_42.method7095(0);
		super.aClass137_Sub3_42.method7090(this.aClass130_5.aClass66_Sub2_3);
		@Pc(53) long local53 = this.aClass152_7.aLong121;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "sunDir"), -super.aClass137_Sub3_42.aFloatArray65[0], -super.aClass137_Sub3_42.aFloatArray65[1], -super.aClass137_Sub3_42.aFloatArray65[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local53, "sunColour"), local27 * super.aClass137_Sub3_42.aFloat205, super.aClass137_Sub3_42.aFloat210 * local27, super.aClass137_Sub3_42.aFloat191 * local27, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local53, "sunExponent"), Math.abs(super.aClass137_Sub3_42.aFloatArray65[1]) * 928.0F + 64.0F);
		this.aBoolean702 = true;
	}
}
