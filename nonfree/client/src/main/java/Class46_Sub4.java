import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class46_Sub4 extends Class46 {

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!gba", name = "k", descriptor = "Lclient!ud;")
	private final Class335 aClass335_4;

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "Lclient!di;")
	private Class70 aClass70_6;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!vj;Lclient!ud;)V")
	public Class46_Sub4(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class335 arg1) {
		super(arg0);
		this.aClass335_4 = arg1;
		if (this.aClass335_4.aClass24_Sub2_1 != null && super.aClass45_Sub3_40.aBoolean706 && super.aClass45_Sub3_40.aBoolean689) {
			@Pc(30) Class203 local30 = Static131.method2612(35633, super.aClass45_Sub3_40, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class203 local37 = Static131.method2612(35632, super.aClass45_Sub3_40, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass70_6 = Static403.method5837(new Class203[] { local30, local37 }, super.aClass45_Sub3_40);
			this.aBoolean260 = this.aClass70_6 != null;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class24_Sub3 local15 = super.aClass45_Sub3_40.method7446();
		if (!this.aBoolean260 || local15 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass45_Sub3_40.aFloatArray98[1])) * 2.0F + 1.0F;
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(local15);
		super.aClass45_Sub3_40.method7510(0);
		super.aClass45_Sub3_40.method7475(this.aClass335_4.aClass24_Sub2_1);
		@Pc(60) long local60 = this.aClass70_6.aLong48;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass45_Sub3_40.aFloatArray98[0], -super.aClass45_Sub3_40.aFloatArray98[1], -super.aClass45_Sub3_40.aFloatArray98[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local34 * super.aClass45_Sub3_40.aFloat196, local34 * super.aClass45_Sub3_40.aFloat186, local34 * super.aClass45_Sub3_40.aFloat184, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass45_Sub3_40.aFloatArray98[1]) * 928.0F + 64.0F);
		this.aBoolean261 = true;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return this.aBoolean260;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		if (!this.aBoolean261) {
			super.aClass45_Sub3_40.method7475(arg1);
			super.aClass45_Sub3_40.method7500(arg0);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean261) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg0 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass70_6.aLong48;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (local16 * super.aClass45_Sub3_40.anInt9042 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		if (!this.aBoolean261) {
			return;
		}
		super.aClass45_Sub3_40.method7510(1);
		super.aClass45_Sub3_40.method7475(null);
		super.aClass45_Sub3_40.method7510(0);
		super.aClass45_Sub3_40.method7475(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean261 = false;
	}
}
