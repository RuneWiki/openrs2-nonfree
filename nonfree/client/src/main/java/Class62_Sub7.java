import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class62_Sub7 extends Class62 {

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!mc;")
	private final Class159 aClass159_4;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!bt;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!ef;Lclient!mc;)V")
	public Class62_Sub7(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class159 arg1) {
		super(arg0);
		this.aClass159_4 = arg1;
		if (this.aClass159_4.aClass55_Sub2_3 != null && super.aClass49_Sub2_43.aBoolean133 && super.aClass49_Sub2_43.aBoolean112) {
			@Pc(30) Class130 local30 = Static178.method5745(super.aClass49_Sub2_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class130 local37 = Static178.method5745(super.aClass49_Sub2_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass32_6 = Static91.method1767(new Class130[] { local30, local37 }, super.aClass49_Sub2_43);
			this.aBoolean450 = this.aClass32_6 != null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!mk;II)V")
	@Override
	public void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean451) {
			super.aClass49_Sub2_43.method1646(arg0);
			super.aClass49_Sub2_43.method1624(arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean451) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass32_6.aLong35;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass49_Sub2_43.anInt2002 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5822(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class55_Sub4 local8 = super.aClass49_Sub2_43.method1609();
		if (!this.aBoolean450 || local8 == null) {
			return;
		}
		@Pc(26) float local26 = (1.0F - Math.abs(super.aClass49_Sub2_43.aFloatArray12[1])) * 2.0F + 1.0F;
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1646(local8);
		super.aClass49_Sub2_43.method1600(0);
		super.aClass49_Sub2_43.method1646(this.aClass159_4.aClass55_Sub2_3);
		@Pc(52) long local52 = this.aClass32_6.aLong35;
		OpenGL.glUseProgramObjectARB(local52);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local52, "sunDir"), -super.aClass49_Sub2_43.aFloatArray12[0], -super.aClass49_Sub2_43.aFloatArray12[1], -super.aClass49_Sub2_43.aFloatArray12[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local52, "sunColour"), local26 * super.aClass49_Sub2_43.aFloat42, super.aClass49_Sub2_43.aFloat39 * local26, local26 * super.aClass49_Sub2_43.aFloat32, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local52, "sunExponent"), Math.abs(super.aClass49_Sub2_43.aFloatArray12[1]) * 928.0F + 64.0F);
		this.aBoolean451 = true;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	@Override
	public void method5829() {
		if (!this.aBoolean451) {
			return;
		}
		super.aClass49_Sub2_43.method1600(1);
		super.aClass49_Sub2_43.method1646(null);
		super.aClass49_Sub2_43.method1600(0);
		super.aClass49_Sub2_43.method1646(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean451 = false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5821() {
		return this.aBoolean450;
	}
}
