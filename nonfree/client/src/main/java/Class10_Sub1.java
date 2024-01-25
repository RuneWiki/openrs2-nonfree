import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!pl;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!me;")
	private Class168 aClass168_1;

	static {
		new Class15("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ug;Lclient!pl;)V")
	public Class10_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_1 = arg1;
		if (this.aClass198_1.aClass65_Sub1_2 != null && super.aClass135_Sub2_41.aBoolean480 && super.aClass135_Sub2_41.aBoolean459) {
			@Pc(30) Class228 local30 = Static103.method1539("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass135_Sub2_41);
			@Pc(37) Class228 local37 = Static103.method1539("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass135_Sub2_41);
			this.aClass168_1 = Static400.method5265(super.aClass135_Sub2_41, new Class228[] { local30, local37 });
			this.aBoolean6 = this.aClass168_1 != null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean8) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass168_1.aLong114;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass135_Sub2_41.anInt6779 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	@Override
	public void method5729() {
		if (!this.aBoolean8) {
			return;
		}
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(null);
		super.aClass135_Sub2_41.method5457(0);
		super.aClass135_Sub2_41.method5458(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5733() {
		return this.aBoolean6;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5735(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub3 local8 = super.aClass135_Sub2_41.method5421();
		if (!this.aBoolean6 || local8 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass135_Sub2_41.aFloatArray29[1])) * 2.0F + 1.0F;
		super.aClass135_Sub2_41.method5457(1);
		super.aClass135_Sub2_41.method5458(local8);
		super.aClass135_Sub2_41.method5457(0);
		super.aClass135_Sub2_41.method5458(this.aClass198_1.aClass65_Sub1_2);
		@Pc(59) long local59 = this.aClass168_1.aLong114;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass135_Sub2_41.aFloatArray29[0], -super.aClass135_Sub2_41.aFloatArray29[1], -super.aClass135_Sub2_41.aFloatArray29[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), super.aClass135_Sub2_41.aFloat93 * local33, local33 * super.aClass135_Sub2_41.aFloat83, super.aClass135_Sub2_41.aFloat94 * local33, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass135_Sub2_41.aFloatArray29[1]) * 928.0F + 64.0F);
		this.aBoolean8 = true;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(ZZ)V")
	@Override
	public void method5736(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!sq;II)V")
	@Override
	public void method5730(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean8) {
			super.aClass135_Sub2_41.method5458(arg0);
			super.aClass135_Sub2_41.method5441(arg1);
		}
	}
}
