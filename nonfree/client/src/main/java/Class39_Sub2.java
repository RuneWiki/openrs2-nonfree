import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Lclient!ah;")
	private final Class12 aClass12_1;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Lclient!un;")
	private Class350 aClass350_1;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!rs;Lclient!ah;)V")
	public Class39_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class12 arg1) {
		super(arg0);
		this.aClass12_1 = arg1;
		if (this.aClass12_1.aClass167_Sub4_2 != null && super.aClass133_Sub3_42.aBoolean630 && super.aClass133_Sub3_42.aBoolean628) {
			@Pc(30) Class369 local30 = Static432.method6590("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass133_Sub3_42, 35633);
			@Pc(37) Class369 local37 = Static432.method6590("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass133_Sub3_42, 35632);
			this.aClass350_1 = Static457.method6820(new Class369[] { local30, local37 }, super.aClass133_Sub3_42);
			this.aBoolean119 = this.aClass350_1 != null;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return this.aBoolean119;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		if (!this.aBoolean120) {
			super.aClass133_Sub3_42.method7375(arg1);
			super.aClass133_Sub3_42.method7401(arg0);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean120) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass350_1.aLong247;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass133_Sub3_42.anInt8530 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (!this.aBoolean120) {
			return;
		}
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(null);
		super.aClass133_Sub3_42.method7368(0);
		super.aClass133_Sub3_42.method7375(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		@Pc(11) Class167_Sub1 local11 = super.aClass133_Sub3_42.method7399();
		if (!this.aBoolean119 || local11 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass133_Sub3_42.aFloatArray67[1])) * 2.0F + 1.0F;
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(local11);
		super.aClass133_Sub3_42.method7368(0);
		super.aClass133_Sub3_42.method7375(this.aClass12_1.aClass167_Sub4_2);
		@Pc(58) long local58 = this.aClass350_1.aLong247;
		OpenGL.glUseProgramObjectARB(local58);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local58, "sunDir"), -super.aClass133_Sub3_42.aFloatArray67[0], -super.aClass133_Sub3_42.aFloatArray67[1], -super.aClass133_Sub3_42.aFloatArray67[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local58, "sunColour"), super.aClass133_Sub3_42.aFloat153 * local30, super.aClass133_Sub3_42.aFloat151 * local30, super.aClass133_Sub3_42.aFloat159 * local30, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local58, "sunExponent"), Math.abs(super.aClass133_Sub3_42.aFloatArray67[1]) * 928.0F + 64.0F);
		this.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}
}
