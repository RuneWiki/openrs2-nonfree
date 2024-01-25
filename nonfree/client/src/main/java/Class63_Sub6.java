import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class63_Sub6 extends Class63 {

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
	private boolean aBoolean543 = false;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!au;")
	private final Class26 aClass26_4;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "Lclient!fp;")
	private Class122 aClass122_6;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!aq;Lclient!au;)V")
	public Class63_Sub6(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		super(arg0);
		this.aClass26_4 = arg1;
		if (this.aClass26_4.aClass125_Sub3_3 != null && super.aClass22_Sub1_43.aBoolean80 && super.aClass22_Sub1_43.aBoolean73) {
			@Pc(34) Class328 local34 = Static77.method1637("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass22_Sub1_43, 35633);
			@Pc(43) Class328 local43 = Static77.method1637("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass22_Sub1_43, 35632);
			this.aClass122_6 = Static88.method1894(new Class328[] { local34, local43 }, super.aClass22_Sub1_43);
			this.aBoolean542 = this.aClass122_6 != null;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (!this.aBoolean543) {
			return;
		}
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955((Class125) null);
		super.aClass22_Sub1_43.method931(0);
		super.aClass22_Sub1_43.method955((Class125) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean543 = false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean543) {
			super.aClass22_Sub1_43.method955(arg0);
			super.aClass22_Sub1_43.method894(arg1);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return this.aBoolean542;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean543) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg0 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass122_6.aLong126;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass22_Sub1_43.anInt995 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class125_Sub2 local16 = super.aClass22_Sub1_43.method920();
		if (!this.aBoolean542 || local16 == null) {
			return;
		}
		@Pc(36) float local36 = (1.0F - Math.abs(super.aClass22_Sub1_43.aFloatArray4[1])) * 2.0F + 1.0F;
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955(local16);
		super.aClass22_Sub1_43.method931(0);
		super.aClass22_Sub1_43.method955(this.aClass26_4.aClass125_Sub3_3);
		@Pc(62) long local62 = this.aClass122_6.aLong126;
		OpenGL.glUseProgramObjectARB(local62);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local62, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local62, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local62, "sunDir"), -super.aClass22_Sub1_43.aFloatArray4[0], -super.aClass22_Sub1_43.aFloatArray4[1], -super.aClass22_Sub1_43.aFloatArray4[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local62, "sunColour"), super.aClass22_Sub1_43.aFloat19 * local36, local36 * super.aClass22_Sub1_43.aFloat28, super.aClass22_Sub1_43.aFloat25 * local36, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local62, "sunExponent"), Math.abs(super.aClass22_Sub1_43.aFloatArray4[1]) * 928.0F + 64.0F);
		this.aBoolean543 = true;
	}
}
