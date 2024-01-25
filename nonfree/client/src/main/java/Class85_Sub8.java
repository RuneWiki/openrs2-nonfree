import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class85_Sub8 extends Class85 {

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "[I")
	public static final int[] anIntArray426 = new int[16384];

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "[I")
	public static final int[] anIntArray427 = new int[16384];

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
	private boolean aBoolean551 = false;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!ud;")
	private final Class329 aClass329_5;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!wba;")
	private Class355 aClass355_6;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray426[local11] = (int) (Math.sin(local9 * (double) local11) * 16384.0D);
			anIntArray427[local11] = (int) (Math.cos(local9 * (double) local11) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!lj;Lclient!ud;)V")
	public Class85_Sub8(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class329 arg1) {
		super(arg0);
		this.aClass329_5 = arg1;
		if (this.aClass329_5.aClass46_Sub3_1 != null && super.aClass78_Sub3_37.aBoolean415 && super.aClass78_Sub3_37.aBoolean418) {
			@Pc(30) Class230 local30 = Static226.method3357(super.aClass78_Sub3_37, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class230 local37 = Static226.method3357(super.aClass78_Sub3_37, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass355_6 = Static211.method3208(super.aClass78_Sub3_37, new Class230[] { local30, local37 });
			this.aBoolean551 = this.aClass355_6 != null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	@Override
	public void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean550) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg1 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass355_6.aLong264;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (local16 * super.aClass78_Sub3_37.anInt5559 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!vf;)V")
	@Override
	public void method6288(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		if (!this.aBoolean550) {
			super.aClass78_Sub3_37.method4535(arg1);
			super.aClass78_Sub3_37.method4534(arg0);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6291() {
		return this.aBoolean551;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6294(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	@Override
	public void method6287() {
		if (!this.aBoolean550) {
			return;
		}
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(null);
		super.aClass78_Sub3_37.method4549(0);
		super.aClass78_Sub3_37.method4535(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean550 = false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6289(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class46_Sub4 local12 = super.aClass78_Sub3_37.method4497();
		if (!this.aBoolean551 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass78_Sub3_37.aFloatArray49[1])) * 2.0F + 1.0F;
		super.aClass78_Sub3_37.method4549(1);
		super.aClass78_Sub3_37.method4535(local12);
		super.aClass78_Sub3_37.method4549(0);
		super.aClass78_Sub3_37.method4535(this.aClass329_5.aClass46_Sub3_1);
		@Pc(56) long local56 = this.aClass355_6.aLong264;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass78_Sub3_37.aFloatArray49[0], -super.aClass78_Sub3_37.aFloatArray49[1], -super.aClass78_Sub3_37.aFloatArray49[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass78_Sub3_37.aFloat148, local30 * super.aClass78_Sub3_37.aFloat149, local30 * super.aClass78_Sub3_37.aFloat153, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass78_Sub3_37.aFloatArray49[1]) * 928.0F + 64.0F);
		this.aBoolean550 = true;
	}
}
