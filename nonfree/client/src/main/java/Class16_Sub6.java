import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class16_Sub6 extends Class16 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "Lclient!mm;")
	private final Class162 aClass162_4;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Lclient!br;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!tt;Lclient!mm;)V")
	public Class16_Sub6(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_4 = arg1;
		if (this.aClass162_4.aClass31_Sub2_1 != null && super.aClass200_Sub2_36.aBoolean450 && super.aClass200_Sub2_36.aBoolean441) {
			@Pc(30) Class54 local30 = Static4.method41("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass200_Sub2_36);
			@Pc(37) Class54 local37 = Static4.method41("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass200_Sub2_36);
			this.aClass26_2 = Static148.method2145(new Class54[] { local30, local37 }, super.aClass200_Sub2_36);
			this.aBoolean203 = this.aClass26_2 != null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	@Override
	public void method5148() {
		if (!this.aBoolean202) {
			return;
		}
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5312(null);
		super.aClass200_Sub2_36.method5319(0);
		super.aClass200_Sub2_36.method5312(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean202 = false;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class31_Sub4 local8 = super.aClass200_Sub2_36.method5292();
		if (!this.aBoolean203 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass200_Sub2_36.aFloatArray19[1])) * 2.0F + 1.0F;
		super.aClass200_Sub2_36.method5319(1);
		super.aClass200_Sub2_36.method5312(local8);
		super.aClass200_Sub2_36.method5319(0);
		super.aClass200_Sub2_36.method5312(this.aClass162_4.aClass31_Sub2_1);
		@Pc(57) long local57 = this.aClass26_2.aLong37;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass200_Sub2_36.aFloatArray19[0], -super.aClass200_Sub2_36.aFloatArray19[1], -super.aClass200_Sub2_36.aFloatArray19[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), local27 * super.aClass200_Sub2_36.aFloat163, super.aClass200_Sub2_36.aFloat159 * local27, super.aClass200_Sub2_36.aFloat156 * local27, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass200_Sub2_36.aFloatArray19[1]) * 928.0F + 64.0F);
		this.aBoolean202 = true;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean202) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg0 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass26_2.aLong37;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass200_Sub2_36.anInt6720 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5154() {
		return this.aBoolean203;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILclient!in;)V")
	@Override
	public void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1) {
		if (!this.aBoolean202) {
			super.aClass200_Sub2_36.method5312(arg1);
			super.aClass200_Sub2_36.method5297(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZ)V")
	@Override
	public void method5157(@OriginalArg(1) boolean arg0) {
	}
}
