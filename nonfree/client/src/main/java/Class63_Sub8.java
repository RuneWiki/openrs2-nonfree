import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class63_Sub8 extends Class63 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "Lclient!rk;")
	private final Class215 aClass215_5;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "Lclient!ie;")
	private Class113 aClass113_6;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!pg;Lclient!rk;)V")
	public Class63_Sub8(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class215 arg1) {
		super(arg0);
		this.aClass215_5 = arg1;
		if (this.aClass215_5.aClass20_Sub2_2 != null && super.aClass163_Sub2_43.aBoolean384 && super.aClass163_Sub2_43.aBoolean362) {
			@Pc(30) Class19 local30 = Static22.method267(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass163_Sub2_43);
			@Pc(37) Class19 local37 = Static22.method267(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass163_Sub2_43);
			this.aClass113_6 = Static125.method1834(new Class19[] { local30, local37 }, super.aClass163_Sub2_43);
			this.aBoolean418 = this.aClass113_6 != null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5722(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class20_Sub3 local12 = super.aClass163_Sub2_43.method4143();
		if (!this.aBoolean418 || local12 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass163_Sub2_43.aFloatArray27[1])) * 2.0F + 1.0F;
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(local12);
		super.aClass163_Sub2_43.method4131(0);
		super.aClass163_Sub2_43.method4118(this.aClass215_5.aClass20_Sub2_2);
		@Pc(57) long local57 = this.aClass113_6.aLong104;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass163_Sub2_43.aFloatArray27[0], -super.aClass163_Sub2_43.aFloatArray27[1], -super.aClass163_Sub2_43.aFloatArray27[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), local31 * super.aClass163_Sub2_43.aFloat63, super.aClass163_Sub2_43.aFloat74 * local31, super.aClass163_Sub2_43.aFloat77 * local31, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass163_Sub2_43.aFloatArray27[1]) * 928.0F + 64.0F);
		this.aBoolean417 = true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5723() {
		return this.aBoolean418;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public void method5725() {
		if (!this.aBoolean417) {
			return;
		}
		super.aClass163_Sub2_43.method4131(1);
		super.aClass163_Sub2_43.method4118(null);
		super.aClass163_Sub2_43.method4131(0);
		super.aClass163_Sub2_43.method4118(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5724(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
	@Override
	public void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean417) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass113_6.aLong104;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass163_Sub2_43.anInt5219 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!fg;I)V")
	@Override
	public void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean417) {
			super.aClass163_Sub2_43.method4118(arg0);
			super.aClass163_Sub2_43.method4107(arg1);
		}
	}
}
