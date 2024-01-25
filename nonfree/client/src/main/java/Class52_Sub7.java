import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class52_Sub7 extends Class52 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
	private boolean aBoolean296 = false;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!pba;")
	private final Class240 aClass240_5;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!og;")
	private Class227 aClass227_3;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!pea;Lclient!pba;)V")
	public Class52_Sub7(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class240 arg1) {
		super(arg0);
		this.aClass240_5 = arg1;
		if (this.aClass240_5.aClass35_Sub1_3 != null && super.aClass121_Sub3_43.aBoolean477 && super.aClass121_Sub3_43.aBoolean481) {
			@Pc(30) Class241 local30 = Static96.method1498(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass121_Sub3_43);
			@Pc(37) Class241 local37 = Static96.method1498(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass121_Sub3_43);
			this.aClass227_3 = Static46.method647(new Class241[] { local30, local37 }, super.aClass121_Sub3_43);
			this.aBoolean296 = this.aClass227_3 != null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return this.aBoolean296;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean295) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg1 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass227_3.aLong166;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass121_Sub3_43.anInt6800 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		if (!this.aBoolean295) {
			return;
		}
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(null);
		super.aClass121_Sub3_43.method5648(0);
		super.aClass121_Sub3_43.method5713(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean295 = false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean295) {
			super.aClass121_Sub3_43.method5713(arg0);
			super.aClass121_Sub3_43.method5684(arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		@Pc(23) Class35_Sub2 local23 = super.aClass121_Sub3_43.method5688();
		if (!this.aBoolean296 || local23 == null) {
			return;
		}
		@Pc(42) float local42 = (1.0F - Math.abs(super.aClass121_Sub3_43.aFloatArray41[1])) * 2.0F + 1.0F;
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(local23);
		super.aClass121_Sub3_43.method5648(0);
		super.aClass121_Sub3_43.method5713(this.aClass240_5.aClass35_Sub1_3);
		@Pc(68) long local68 = this.aClass227_3.aLong166;
		OpenGL.glUseProgramObjectARB(local68);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local68, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local68, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local68, "sunDir"), -super.aClass121_Sub3_43.aFloatArray41[0], -super.aClass121_Sub3_43.aFloatArray41[1], -super.aClass121_Sub3_43.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local68, "sunColour"), local42 * super.aClass121_Sub3_43.aFloat159, local42 * super.aClass121_Sub3_43.aFloat143, local42 * super.aClass121_Sub3_43.aFloat163, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "sunExponent"), Math.abs(super.aClass121_Sub3_43.aFloatArray41[1]) * 928.0F + 64.0F);
		this.aBoolean295 = true;
	}
}
