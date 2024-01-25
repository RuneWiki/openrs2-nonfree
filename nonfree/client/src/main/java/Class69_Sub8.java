import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class69_Sub8 extends Class69 {

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
	private boolean aBoolean587 = false;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!au;")
	private final Class27 aClass27_5;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!vr;")
	private Class384 aClass384_3;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ml;Lclient!au;)V")
	public Class69_Sub8(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class27 arg1) {
		super(arg0);
		this.aClass27_5 = arg1;
		if (this.aClass27_5.aClass44_Sub3_3 != null && super.aClass75_Sub3_41.aBoolean493 && super.aClass75_Sub3_41.aBoolean494) {
			@Pc(34) Class362 local34 = Static182.method3448(35633, super.aClass75_Sub3_41, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(43) Class362 local43 = Static182.method3448(35632, super.aClass75_Sub3_41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass384_3 = Static420.method6421(super.aClass75_Sub3_41, new Class362[] { local34, local43 });
			this.aBoolean586 = this.aClass384_3 != null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean587) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass384_3.aLong333;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass75_Sub3_41.anInt6532 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class44_Sub2 local8 = super.aClass75_Sub3_41.method5807();
		if (!this.aBoolean586 || local8 == null) {
			return;
		}
		@Pc(36) float local36 = (1.0F - Math.abs(super.aClass75_Sub3_41.aFloatArray51[1])) * 2.0F + 1.0F;
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774(local8);
		super.aClass75_Sub3_41.method5775(0);
		super.aClass75_Sub3_41.method5774(this.aClass27_5.aClass44_Sub3_3);
		@Pc(62) long local62 = this.aClass384_3.aLong333;
		OpenGL.glUseProgramObjectARB(local62);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local62, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local62, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local62, "sunDir"), -super.aClass75_Sub3_41.aFloatArray51[0], -super.aClass75_Sub3_41.aFloatArray51[1], -super.aClass75_Sub3_41.aFloatArray51[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local62, "sunColour"), super.aClass75_Sub3_41.aFloat123 * local36, super.aClass75_Sub3_41.aFloat128 * local36, super.aClass75_Sub3_41.aFloat114 * local36, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local62, "sunExponent"), Math.abs(super.aClass75_Sub3_41.aFloatArray51[1]) * 928.0F + 64.0F);
		this.aBoolean587 = true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		if (!this.aBoolean587) {
			return;
		}
		super.aClass75_Sub3_41.method5775(1);
		super.aClass75_Sub3_41.method5774((Class44) null);
		super.aClass75_Sub3_41.method5775(0);
		super.aClass75_Sub3_41.method5774((Class44) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean587 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		if (!this.aBoolean587) {
			super.aClass75_Sub3_41.method5774(arg1);
			super.aClass75_Sub3_41.method5787(arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return this.aBoolean586;
	}
}
