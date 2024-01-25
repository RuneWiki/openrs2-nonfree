import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!dja;")
	private final Class65 aClass65_2;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!uj;")
	private Class342 aClass342_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ac;Lclient!dja;)V")
	public Class16_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class65 arg1) {
		super(arg0);
		this.aClass65_2 = arg1;
		if (this.aClass65_2.aClass2_Sub4_1 != null && super.aClass5_Sub1_42.aBoolean25 && super.aClass5_Sub1_42.aBoolean34) {
			@Pc(30) Class349 local30 = Static327.method5481(35633, super.aClass5_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class349 local37 = Static327.method5481(35632, super.aClass5_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass342_1 = Static333.method5541(super.aClass5_Sub1_42, new Class349[] { local30, local37 });
			this.aBoolean77 = this.aClass342_1 != null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean76) {
			super.aClass5_Sub1_42.method352(arg0);
			super.aClass5_Sub1_42.method385(arg1);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		if (!this.aBoolean76) {
			return;
		}
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352((Class2) null);
		super.aClass5_Sub1_42.method334(0);
		super.aClass5_Sub1_42.method352((Class2) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class2_Sub2 local12 = super.aClass5_Sub1_42.method316();
		if (!this.aBoolean77 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass5_Sub1_42.aFloatArray3[1])) * 2.0F + 1.0F;
		super.aClass5_Sub1_42.method334(1);
		super.aClass5_Sub1_42.method352(local12);
		super.aClass5_Sub1_42.method334(0);
		super.aClass5_Sub1_42.method352(this.aClass65_2.aClass2_Sub4_1);
		@Pc(56) long local56 = this.aClass342_1.aLong257;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass5_Sub1_42.aFloatArray3[0], -super.aClass5_Sub1_42.aFloatArray3[1], -super.aClass5_Sub1_42.aFloatArray3[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass5_Sub1_42.aFloat17, local30 * super.aClass5_Sub1_42.aFloat14, local30 * super.aClass5_Sub1_42.aFloat21, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass5_Sub1_42.aFloatArray3[1]) * 928.0F + 64.0F);
		this.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return this.aBoolean77;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean76) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass342_1.aLong257;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass5_Sub1_42.anInt361 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}
}
