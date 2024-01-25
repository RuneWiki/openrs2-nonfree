import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "[I")
	public static final int[] anIntArray508 = new int[4096];

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Z")
	private boolean aBoolean387 = false;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "Lclient!re;")
	private final Class202 aClass202_5;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!rs;")
	private Class210 aClass210_7;

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray508[local12] = Static385.method4421(local12);
		}
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!bv;Lclient!re;)V")
	public Class2_Sub7(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_5 = arg1;
		if (this.aClass202_5.aClass1_Sub4_2 != null && super.aClass30_Sub1_42.aBoolean77 && super.aClass30_Sub1_42.aBoolean65) {
			@Pc(30) Class79 local30 = Static47.method994(super.aClass30_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class79 local37 = Static47.method994(super.aClass30_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass210_7 = Static94.method1545(new Class79[] { local30, local37 }, super.aClass30_Sub1_42);
			this.aBoolean386 = this.aClass210_7 != null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean387) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass210_7.aLong180;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass30_Sub1_42.anInt1244 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class1_Sub2 local8 = super.aClass30_Sub1_42.method934();
		if (!this.aBoolean386 || local8 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass30_Sub1_42.aFloatArray8[1])) * 2.0F + 1.0F;
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(local8);
		super.aClass30_Sub1_42.method948(0);
		super.aClass30_Sub1_42.method916(this.aClass202_5.aClass1_Sub4_2);
		@Pc(57) long local57 = this.aClass210_7.aLong180;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass30_Sub1_42.aFloatArray8[0], -super.aClass30_Sub1_42.aFloatArray8[1], -super.aClass30_Sub1_42.aFloatArray8[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), local31 * super.aClass30_Sub1_42.aFloat23, super.aClass30_Sub1_42.aFloat36 * local31, super.aClass30_Sub1_42.aFloat38 * local31, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass30_Sub1_42.aFloatArray8[1]) * 928.0F + 64.0F);
		this.aBoolean387 = true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return this.aBoolean386;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		if (!this.aBoolean387) {
			return;
		}
		super.aClass30_Sub1_42.method948(1);
		super.aClass30_Sub1_42.method916(null);
		super.aClass30_Sub1_42.method948(0);
		super.aClass30_Sub1_42.method916(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		if (!this.aBoolean387) {
			super.aClass30_Sub1_42.method916(arg1);
			super.aClass30_Sub1_42.method923(arg0);
		}
	}
}
