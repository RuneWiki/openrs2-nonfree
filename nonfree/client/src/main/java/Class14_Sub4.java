import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!el", name = "v", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "Lclient!faa;")
	private final Class91 aClass91_3;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Lclient!ua;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!eq;Lclient!faa;)V")
	public Class14_Sub4(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_3 = arg1;
		if (this.aClass91_3.aClass121_Sub4_2 != null && super.aClass33_Sub3_43.aBoolean276 && super.aClass33_Sub3_43.aBoolean272) {
			@Pc(30) Class45 local30 = Static335.method5570(super.aClass33_Sub3_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class45 local37 = Static335.method5570(super.aClass33_Sub3_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass326_1 = Static143.method3168(new Class45[] { local30, local37 }, super.aClass33_Sub3_43);
			this.aBoolean248 = this.aClass326_1 != null;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (!this.aBoolean249) {
			return;
		}
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(null);
		super.aClass33_Sub3_43.method3027(0);
		super.aClass33_Sub3_43.method3012(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return this.aBoolean248;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean249) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg1 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg0 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(50) float local50 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(59) float local59 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(65) int local65 = arg0 >> 27 & 0xF;
		@Pc(69) long local69 = this.aClass326_1.aLong247;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "time"), (float) (local17 * super.aClass33_Sub3_43.anInt3418 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "breakWaterOffset"), local41);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local69, "waveIntensity"), local59, local50);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local69, "waveExponent"), (float) local65);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class121_Sub1 local8 = super.aClass33_Sub3_43.method3060();
		if (!this.aBoolean248 || local8 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass33_Sub3_43.aFloatArray42[1])) * 2.0F + 1.0F;
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(local8);
		super.aClass33_Sub3_43.method3027(0);
		super.aClass33_Sub3_43.method3012(this.aClass91_3.aClass121_Sub4_2);
		@Pc(60) long local60 = this.aClass326_1.aLong247;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass33_Sub3_43.aFloatArray42[0], -super.aClass33_Sub3_43.aFloatArray42[1], -super.aClass33_Sub3_43.aFloatArray42[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), super.aClass33_Sub3_43.aFloat123 * local34, super.aClass33_Sub3_43.aFloat110 * local34, local34 * super.aClass33_Sub3_43.aFloat109, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass33_Sub3_43.aFloatArray42[1]) * 928.0F + 64.0F);
		this.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean249) {
			super.aClass33_Sub3_43.method3012(arg0);
			super.aClass33_Sub3_43.method3045(arg1);
		}
	}
}
