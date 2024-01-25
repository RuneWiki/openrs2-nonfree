import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Lclient!qh;")
	private final Class202 aClass202_1;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "Lclient!kh;")
	private Class136 aClass136_5;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!od;Lclient!qh;)V")
	public Class84_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_1 = arg1;
		if (this.aClass202_1.aClass5_Sub3_1 != null && super.aClass128_Sub2_39.aBoolean361 && super.aClass128_Sub2_39.aBoolean366) {
			@Pc(30) Class153 local30 = Static379.method4853("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass128_Sub2_39, 35633);
			@Pc(37) Class153 local37 = Static379.method4853("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass128_Sub2_39, 35632);
			this.aClass136_5 = Static50.method734(super.aClass128_Sub2_39, new Class153[] { local30, local37 });
			this.aBoolean155 = this.aClass136_5 != null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class5_Sub4 local16 = super.aClass128_Sub2_39.method3642();
		if (!this.aBoolean155 || local16 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass128_Sub2_39.aFloatArray23[1])) * 2.0F + 1.0F;
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3691(local16);
		super.aClass128_Sub2_39.method3667(0);
		super.aClass128_Sub2_39.method3691(this.aClass202_1.aClass5_Sub3_1);
		@Pc(60) long local60 = this.aClass136_5.aLong102;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass128_Sub2_39.aFloatArray23[0], -super.aClass128_Sub2_39.aFloatArray23[1], -super.aClass128_Sub2_39.aFloatArray23[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local34 * super.aClass128_Sub2_39.aFloat69, local34 * super.aClass128_Sub2_39.aFloat63, local34 * super.aClass128_Sub2_39.aFloat58, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass128_Sub2_39.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean153 = true;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean153) {
			super.aClass128_Sub2_39.method3691(arg0);
			super.aClass128_Sub2_39.method3677(arg1);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		if (!this.aBoolean153) {
			return;
		}
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3691(null);
		super.aClass128_Sub2_39.method3667(0);
		super.aClass128_Sub2_39.method3691(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean153) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg0 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass136_5.aLong102;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass128_Sub2_39.anInt4604 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return this.aBoolean155;
	}
}
