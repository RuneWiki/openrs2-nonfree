import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Lclient!m;")
	private final Class144 aClass144_2;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!ru;")
	private Class210 aClass210_3;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!fd;Lclient!m;)V")
	public Class9_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class144 arg1) {
		super(arg0);
		this.aClass144_2 = arg1;
		if (this.aClass144_2.aClass6_Sub3_2 != null && super.aClass19_Sub2_41.aBoolean217 && super.aClass19_Sub2_41.aBoolean214) {
			@Pc(30) Class267 local30 = Static325.method4397(super.aClass19_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class267 local37 = Static325.method4397(super.aClass19_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass210_3 = Static256.method3694(new Class267[] { local30, local37 }, super.aClass19_Sub2_41);
			this.aBoolean146 = this.aClass210_3 != null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class6_Sub4 local13 = super.aClass19_Sub2_41.method1946();
		if (!this.aBoolean146 || local13 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass19_Sub2_41.aFloatArray19[1])) * 2.0F + 1.0F;
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(local13);
		super.aClass19_Sub2_41.method1936(0);
		super.aClass19_Sub2_41.method1905(this.aClass144_2.aClass6_Sub3_2);
		@Pc(59) long local59 = this.aClass210_3.aLong202;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass19_Sub2_41.aFloatArray19[0], -super.aClass19_Sub2_41.aFloatArray19[1], -super.aClass19_Sub2_41.aFloatArray19[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), local31 * super.aClass19_Sub2_41.aFloat72, super.aClass19_Sub2_41.aFloat58 * local31, super.aClass19_Sub2_41.aFloat74 * local31, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass19_Sub2_41.aFloatArray19[1]) * 928.0F + 64.0F);
		this.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return this.aBoolean146;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean147) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass210_3.aLong202;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass19_Sub2_41.anInt2274 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		if (!this.aBoolean147) {
			super.aClass19_Sub2_41.method1905(arg1);
			super.aClass19_Sub2_41.method1900(arg0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		if (!this.aBoolean147) {
			return;
		}
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(null);
		super.aClass19_Sub2_41.method1936(0);
		super.aClass19_Sub2_41.method1905(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
	}
}
