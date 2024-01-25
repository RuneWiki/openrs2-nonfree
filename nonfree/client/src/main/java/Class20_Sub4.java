import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!wca;")
	private final Class353 aClass353_3;

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Lclient!fr;")
	private Class107 aClass107_2;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!kga;Lclient!wca;)V")
	public Class20_Sub4(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class353 arg1) {
		super(arg0);
		this.aClass353_3 = arg1;
		if (this.aClass353_3.aClass77_Sub2_3 != null && super.aClass44_Sub3_42.aBoolean409 && super.aClass44_Sub3_42.aBoolean407) {
			@Pc(30) Class27 local30 = Static487.method7237(super.aClass44_Sub3_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class27 local37 = Static487.method7237(super.aClass44_Sub3_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632);
			this.aClass107_2 = Static391.method6206(new Class27[] { local30, local37 }, super.aClass44_Sub3_42);
			this.aBoolean204 = this.aClass107_2 != null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	@Override
	public void method7867() {
		if (!this.aBoolean205) {
			return;
		}
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(null);
		super.aClass44_Sub3_42.method4648(0);
		super.aClass44_Sub3_42.method4605(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean205 = false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	@Override
	public void method7864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean205) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg1 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass107_2.aLong74;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (super.aClass44_Sub3_42.anInt5471 * local20 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7862(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class77_Sub4 local8 = super.aClass44_Sub3_42.method4603();
		if (!this.aBoolean204 || local8 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass44_Sub3_42.aFloatArray41[1])) * 2.0F + 1.0F;
		super.aClass44_Sub3_42.method4648(1);
		super.aClass44_Sub3_42.method4605(local8);
		super.aClass44_Sub3_42.method4648(0);
		super.aClass44_Sub3_42.method4605(this.aClass353_3.aClass77_Sub2_3);
		@Pc(57) long local57 = this.aClass107_2.aLong74;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass44_Sub3_42.aFloatArray41[0], -super.aClass44_Sub3_42.aFloatArray41[1], -super.aClass44_Sub3_42.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), local31 * super.aClass44_Sub3_42.aFloat169, local31 * super.aClass44_Sub3_42.aFloat176, local31 * super.aClass44_Sub3_42.aFloat162, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass44_Sub3_42.aFloatArray41[1]) * 928.0F + 64.0F);
		this.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!jf;II)V")
	@Override
	public void method7863(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean205) {
			super.aClass44_Sub3_42.method4605(arg0);
			super.aClass44_Sub3_42.method4658(arg1);
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7868() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7870(@OriginalArg(1) boolean arg0) {
	}
}
