import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class75_Sub5 extends Class75 {

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
	private boolean aBoolean706 = false;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "Z")
	private boolean aBoolean707 = false;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "Lclient!pm;")
	private final Class256 aClass256_4;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!hq;")
	private Class147 aClass147_7;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!ji;Lclient!pm;)V")
	public Class75_Sub5(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class256 arg1) {
		super(arg0);
		this.aClass256_4 = arg1;
		if (this.aClass256_4.aClass11_Sub4_2 != null && super.aClass15_Sub3_42.aBoolean440 && super.aClass15_Sub3_42.aBoolean437) {
			@Pc(30) Class185 local30 = Static56.method1328(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass15_Sub3_42);
			@Pc(37) Class185 local37 = Static56.method1328(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass15_Sub3_42);
			this.aClass147_7 = Static596.method8419(new Class185[] { local30, local37 }, super.aClass15_Sub3_42);
			this.aBoolean707 = this.aClass147_7 != null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class11_Sub3 local15 = super.aClass15_Sub3_42.method4436();
		if (!this.aBoolean707 || local15 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass15_Sub3_42.aFloatArray41[1])) * 2.0F + 1.0F;
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4377(local15);
		super.aClass15_Sub3_42.method4458(0);
		super.aClass15_Sub3_42.method4377(this.aClass256_4.aClass11_Sub4_2);
		@Pc(60) long local60 = this.aClass147_7.aLong114;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass15_Sub3_42.aFloatArray41[0], -super.aClass15_Sub3_42.aFloatArray41[1], -super.aClass15_Sub3_42.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local34 * super.aClass15_Sub3_42.aFloat93, local34 * super.aClass15_Sub3_42.aFloat98, super.aClass15_Sub3_42.aFloat100 * local34, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass15_Sub3_42.aFloatArray41[1]) * 928.0F + 64.0F);
		this.aBoolean706 = true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean706) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg1 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass147_7.aLong114;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (super.aClass15_Sub3_42.anInt5325 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		if (!this.aBoolean706) {
			return;
		}
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4377(null);
		super.aClass15_Sub3_42.method4458(0);
		super.aClass15_Sub3_42.method4377(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean706 = false;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return this.aBoolean707;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		if (!this.aBoolean706) {
			super.aClass15_Sub3_42.method4377(arg1);
			super.aClass15_Sub3_42.method4432(arg0);
		}
	}
}
