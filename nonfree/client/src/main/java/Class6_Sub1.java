import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "Lclient!cd;")
	private final Class45 aClass45_1;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "Lclient!cba;")
	private Class42 aClass42_1;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!dw;Lclient!cd;)V")
	public Class6_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class45 arg1) {
		super(arg0);
		this.aClass45_1 = arg1;
		if (this.aClass45_1.aClass94_Sub3_3 != null && super.aClass82_Sub1_41.aBoolean186 && super.aClass82_Sub1_41.aBoolean177) {
			@Pc(30) Class158 local30 = Static519.method7555(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass82_Sub1_41);
			@Pc(37) Class158 local37 = Static519.method7555(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass82_Sub1_41);
			this.aClass42_1 = Static516.method7517(new Class158[] { local30, local37 }, super.aClass82_Sub1_41);
			this.aBoolean7 = this.aClass42_1 != null;
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (!this.aBoolean8) {
			return;
		}
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029((Class94) null);
		super.aClass82_Sub1_41.method2086(0);
		super.aClass82_Sub1_41.method2029((Class94) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class94_Sub4 local14 = super.aClass82_Sub1_41.method2024();
		if (!this.aBoolean7 || local14 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass82_Sub1_41.aFloatArray11[1])) * 2.0F + 1.0F;
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029(local14);
		super.aClass82_Sub1_41.method2086(0);
		super.aClass82_Sub1_41.method2029(this.aClass45_1.aClass94_Sub3_3);
		@Pc(59) long local59 = this.aClass42_1.aLong45;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass82_Sub1_41.aFloatArray11[0], -super.aClass82_Sub1_41.aFloatArray11[1], -super.aClass82_Sub1_41.aFloatArray11[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), super.aClass82_Sub1_41.aFloat40 * local33, super.aClass82_Sub1_41.aFloat34 * local33, super.aClass82_Sub1_41.aFloat35 * local33, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass82_Sub1_41.aFloatArray11[1]) * 928.0F + 64.0F);
		this.aBoolean8 = true;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean8) {
			super.aClass82_Sub1_41.method2029(arg0);
			super.aClass82_Sub1_41.method2068(arg1);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean8) {
			return;
		}
		@Pc(14) int local14 = 0x1 << (arg0 & 0x3);
		@Pc(25) float local25 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(29) int local29 = arg1 & 0xFFFF;
		@Pc(38) float local38 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(47) float local47 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(56) float local56 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(62) int local62 = arg1 >> 27 & 0xF;
		@Pc(66) long local66 = this.aClass42_1.aLong45;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "time"), (float) (super.aClass82_Sub1_41.anInt2463 * local14 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "scale"), local25);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterDepth"), (float) local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "breakWaterOffset"), local38);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local66, "waveIntensity"), local56, local47);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local66, "waveExponent"), (float) local62);
	}
}
