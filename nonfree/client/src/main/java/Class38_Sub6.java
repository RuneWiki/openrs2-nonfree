import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Z")
	private boolean aBoolean658 = false;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Lclient!qf;")
	private final Class198 aClass198_4;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!uq;")
	private Class246 aClass246_6;

	static {
		new Class119(" days.", " Tage.", " jours.", " dias.");
		new Class119("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ur;Lclient!qf;)V")
	public Class38_Sub6(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_4 = arg1;
		if (this.aClass198_4.aClass10_Sub4_3 != null && super.aClass34_Sub2_41.aBoolean772 && super.aClass34_Sub2_41.aBoolean760) {
			@Pc(30) Class188 local30 = Static416.method5407("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass34_Sub2_41);
			@Pc(37) Class188 local37 = Static416.method5407("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass34_Sub2_41);
			this.aClass246_6 = Static321.method4318(new Class188[] { local30, local37 }, super.aClass34_Sub2_41);
			this.aBoolean658 = this.aClass246_6 != null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		@Pc(11) Class10_Sub3 local11 = super.aClass34_Sub2_41.method5525();
		if (!this.aBoolean658 || local11 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass34_Sub2_41.aFloatArray28[1])) * 2.0F + 1.0F;
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(local11);
		super.aClass34_Sub2_41.method5507(0);
		super.aClass34_Sub2_41.method5493(this.aClass198_4.aClass10_Sub4_3);
		@Pc(56) long local56 = this.aClass246_6.aLong214;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass34_Sub2_41.aFloatArray28[0], -super.aClass34_Sub2_41.aFloatArray28[1], -super.aClass34_Sub2_41.aFloatArray28[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass34_Sub2_41.aFloat102, local30 * super.aClass34_Sub2_41.aFloat85, super.aClass34_Sub2_41.aFloat96 * local30, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass34_Sub2_41.aFloatArray28[1]) * 928.0F + 64.0F);
		this.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		if (!this.aBoolean659) {
			return;
		}
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(null);
		super.aClass34_Sub2_41.method5507(0);
		super.aClass34_Sub2_41.method5493(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean659 = false;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean659) {
			super.aClass34_Sub2_41.method5493(arg0);
			super.aClass34_Sub2_41.method5517(arg1);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return this.aBoolean658;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean659) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass246_6.aLong214;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass34_Sub2_41.anInt7073 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}
}
