import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "Lclient!ha;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "Lclient!jh;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!rl;Lclient!ha;)V")
	public Class12_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class98 arg1) {
		super(arg0);
		this.aClass98_1 = arg1;
		if (this.aClass98_1.aClass19_Sub1_2 != null && super.aClass66_Sub2_41.aBoolean378 && super.aClass66_Sub2_41.aBoolean375) {
			@Pc(30) Class168 local30 = Static227.method3401(super.aClass66_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class168 local37 = Static227.method3401(super.aClass66_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass129_1 = Static143.method2455(super.aClass66_Sub2_41, new Class168[] { local30, local37 });
			this.aBoolean20 = this.aClass129_1 != null;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean18) {
			return;
		}
		@Pc(14) int local14 = 0x1 << (arg1 & 0x3);
		@Pc(25) float local25 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(29) int local29 = arg0 & 0xFFFF;
		@Pc(38) float local38 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(47) float local47 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(56) float local56 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(62) int local62 = arg0 >> 27 & 0xF;
		@Pc(66) long local66 = this.aClass129_1.aLong103;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "time"), (float) (super.aClass66_Sub2_41.anInt6140 * local14 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "scale"), local25);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterDepth"), (float) local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterOffset"), local38);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local66, "waveIntensity"), local56, local47);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "waveExponent"), (float) local62);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (!this.aBoolean18) {
			super.aClass66_Sub2_41.method5109(arg1);
			super.aClass66_Sub2_41.method5140(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		if (!this.aBoolean18) {
			return;
		}
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(null);
		super.aClass66_Sub2_41.method5075(0);
		super.aClass66_Sub2_41.method5109(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean18 = false;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class19_Sub3 local8 = super.aClass66_Sub2_41.method5111();
		if (!this.aBoolean20 || local8 == null) {
			return;
		}
		@Pc(26) float local26 = (1.0F - Math.abs(super.aClass66_Sub2_41.aFloatArray21[1])) * 2.0F + 1.0F;
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(local8);
		super.aClass66_Sub2_41.method5075(0);
		super.aClass66_Sub2_41.method5109(this.aClass98_1.aClass19_Sub1_2);
		@Pc(52) long local52 = this.aClass129_1.aLong103;
		OpenGL.glUseProgramObjectARB(local52);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local52, "sunDir"), -super.aClass66_Sub2_41.aFloatArray21[0], -super.aClass66_Sub2_41.aFloatArray21[1], -super.aClass66_Sub2_41.aFloatArray21[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local52, "sunColour"), local26 * super.aClass66_Sub2_41.aFloat74, local26 * super.aClass66_Sub2_41.aFloat76, local26 * super.aClass66_Sub2_41.aFloat84, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local52, "sunExponent"), Math.abs(super.aClass66_Sub2_41.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
	}
}
