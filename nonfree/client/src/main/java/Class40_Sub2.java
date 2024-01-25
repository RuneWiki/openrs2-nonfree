import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!wc;")
	private final Class266 aClass266_1;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!mv;")
	private Class177 aClass177_5;

	static {
		new Class231("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!na;Lclient!wc;)V")
	public Class40_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class266 arg1) {
		super(arg0);
		this.aClass266_1 = arg1;
		if (this.aClass266_1.aClass64_Sub2_1 != null && super.aClass75_Sub2_41.aBoolean333 && super.aClass75_Sub2_41.aBoolean344) {
			@Pc(30) Class124 local30 = Static373.method5186(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass75_Sub2_41);
			@Pc(37) Class124 local37 = Static373.method5186(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass75_Sub2_41);
			this.aClass177_5 = Static148.method2249(super.aClass75_Sub2_41, new Class124[] { local30, local37 });
			this.aBoolean90 = this.aClass177_5 != null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean89) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg0 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass177_5.aLong221;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass75_Sub2_41.anInt4860 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class64_Sub1 local12 = super.aClass75_Sub2_41.method3821();
		if (!this.aBoolean90 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass75_Sub2_41.aFloatArray9[1])) * 2.0F + 1.0F;
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(local12);
		super.aClass75_Sub2_41.method3811(0);
		super.aClass75_Sub2_41.method3844(this.aClass266_1.aClass64_Sub2_1);
		@Pc(56) long local56 = this.aClass177_5.aLong221;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass75_Sub2_41.aFloatArray9[0], -super.aClass75_Sub2_41.aFloatArray9[1], -super.aClass75_Sub2_41.aFloatArray9[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass75_Sub2_41.aFloat56, local30 * super.aClass75_Sub2_41.aFloat40, local30 * super.aClass75_Sub2_41.aFloat45, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass75_Sub2_41.aFloatArray9[1]) * 928.0F + 64.0F);
		this.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		if (!this.aBoolean89) {
			super.aClass75_Sub2_41.method3844(arg1);
			super.aClass75_Sub2_41.method3798(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		if (!this.aBoolean89) {
			return;
		}
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(null);
		super.aClass75_Sub2_41.method3811(0);
		super.aClass75_Sub2_41.method3844(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return this.aBoolean90;
	}
}
