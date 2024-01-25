import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class59_Sub5 extends Class59 {

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Z")
	private boolean aBoolean352 = false;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
	private boolean aBoolean353 = false;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!lha;")
	private final Class213 aClass213_4;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!it;")
	private Class167 aClass167_2;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!bi;Lclient!lha;)V")
	public Class59_Sub5(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_4 = arg1;
		if (this.aClass213_4.aClass10_Sub4_3 != null && super.aClass13_Sub2_43.aBoolean82 && super.aClass13_Sub2_43.aBoolean97) {
			@Pc(30) Class268 local30 = Static179.method3071(super.aClass13_Sub2_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class268 local37 = Static179.method3071(super.aClass13_Sub2_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass167_2 = Static254.method4243(super.aClass13_Sub2_43, new Class268[] { local30, local37 });
			this.aBoolean353 = this.aClass167_2 != null;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class10_Sub3 local8 = super.aClass13_Sub2_43.method1059();
		if (!this.aBoolean353 || local8 == null) {
			return;
		}
		@Pc(26) float local26 = (1.0F - Math.abs(super.aClass13_Sub2_43.aFloatArray10[1])) * 2.0F + 1.0F;
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096(local8);
		super.aClass13_Sub2_43.method1093(0);
		super.aClass13_Sub2_43.method1096(this.aClass213_4.aClass10_Sub4_3);
		@Pc(52) long local52 = this.aClass167_2.aLong112;
		OpenGL.glUseProgramObjectARB(local52);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local52, "sunDir"), -super.aClass13_Sub2_43.aFloatArray10[0], -super.aClass13_Sub2_43.aFloatArray10[1], -super.aClass13_Sub2_43.aFloatArray10[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local52, "sunColour"), local26 * super.aClass13_Sub2_43.aFloat22, local26 * super.aClass13_Sub2_43.aFloat23, super.aClass13_Sub2_43.aFloat10 * local26, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local52, "sunExponent"), Math.abs(super.aClass13_Sub2_43.aFloatArray10[1]) * 928.0F + 64.0F);
		this.aBoolean352 = true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		if (!this.aBoolean352) {
			super.aClass13_Sub2_43.method1096(arg1);
			super.aClass13_Sub2_43.method1046(arg0);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean352) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg0 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass167_2.aLong112;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (local20 * super.aClass13_Sub2_43.anInt1076 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (!this.aBoolean352) {
			return;
		}
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096((Class10) null);
		super.aClass13_Sub2_43.method1093(0);
		super.aClass13_Sub2_43.method1096((Class10) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean352 = false;
	}
}
