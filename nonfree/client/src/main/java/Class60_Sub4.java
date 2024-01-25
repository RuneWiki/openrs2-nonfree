import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Lclient!dk;")
	private final Class69 aClass69_4;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "Lclient!sh;")
	private Class305 aClass305_6;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!jaa;Lclient!dk;)V")
	public Class60_Sub4(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass69_4 = arg1;
		if (this.aClass69_4.aClass51_Sub2_3 != null && super.aClass14_Sub3_42.aBoolean316 && super.aClass14_Sub3_42.aBoolean320) {
			@Pc(30) Class137 local30 = Static482.method6640("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass14_Sub3_42, 35633);
			@Pc(37) Class137 local37 = Static482.method6640("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass14_Sub3_42, 35632);
			this.aClass305_6 = Static154.method2915(new Class137[] { local30, local37 }, super.aClass14_Sub3_42);
			this.aBoolean387 = this.aClass305_6 != null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return this.aBoolean387;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class51_Sub3 local8 = super.aClass14_Sub3_42.method3978();
		if (!this.aBoolean387 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass14_Sub3_42.aFloatArray40[1])) * 2.0F + 1.0F;
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(local8);
		super.aClass14_Sub3_42.method3917(0);
		super.aClass14_Sub3_42.method3985(this.aClass69_4.aClass51_Sub2_3);
		@Pc(53) long local53 = this.aClass305_6.aLong218;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "sunDir"), -super.aClass14_Sub3_42.aFloatArray40[0], -super.aClass14_Sub3_42.aFloatArray40[1], -super.aClass14_Sub3_42.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local53, "sunColour"), local27 * super.aClass14_Sub3_42.aFloat103, super.aClass14_Sub3_42.aFloat93 * local27, local27 * super.aClass14_Sub3_42.aFloat108, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local53, "sunExponent"), Math.abs(super.aClass14_Sub3_42.aFloatArray40[1]) * 928.0F + 64.0F);
		this.aBoolean388 = true;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean388) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(51) float local51 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(60) float local60 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(66) int local66 = arg1 >> 27 & 0xF;
		@Pc(70) long local70 = this.aClass305_6.aLong218;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local70, "time"), (float) (local18 * super.aClass14_Sub3_42.anInt4557 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local70, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local70, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local70, "breakWaterOffset"), local42);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local70, "waveIntensity"), local60, local51);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local70, "waveExponent"), (float) local66);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		if (!this.aBoolean388) {
			return;
		}
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(null);
		super.aClass14_Sub3_42.method3917(0);
		super.aClass14_Sub3_42.method3985(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean388 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		if (!this.aBoolean388) {
			super.aClass14_Sub3_42.method3985(arg1);
			super.aClass14_Sub3_42.method3925(arg0);
		}
	}
}
