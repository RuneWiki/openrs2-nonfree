import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class56_Sub5 extends Class56 {

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
	private boolean aBoolean286 = false;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "Lclient!go;")
	private final Class96 aClass96_4;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Lclient!ed;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!ht;Lclient!go;)V")
	public Class56_Sub5(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_4 = arg1;
		if (this.aClass96_4.aClass13_Sub2_1 != null && super.aClass109_Sub1_41.aBoolean157 && super.aClass109_Sub1_41.aBoolean160) {
			@Pc(30) Class149 local30 = Static325.method4587("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass109_Sub1_41, 35633);
			@Pc(37) Class149 local37 = Static325.method4587("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass109_Sub1_41, 35632);
			this.aClass65_6 = Static292.method3804(super.aClass109_Sub1_41, new Class149[] { local30, local37 });
			this.aBoolean285 = this.aClass65_6 != null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		if (!this.aBoolean286) {
			super.aClass109_Sub1_41.method2578(arg1);
			super.aClass109_Sub1_41.method2531(arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		if (!this.aBoolean286) {
			return;
		}
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(null);
		super.aClass109_Sub1_41.method2564(0);
		super.aClass109_Sub1_41.method2578(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean286) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass65_6.aLong47;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass109_Sub1_41.anInt2974 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		@Pc(14) Class13_Sub4 local14 = super.aClass109_Sub1_41.method2536();
		if (!this.aBoolean285 || local14 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass109_Sub1_41.aFloatArray21[1])) * 2.0F + 1.0F;
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(local14);
		super.aClass109_Sub1_41.method2564(0);
		super.aClass109_Sub1_41.method2578(this.aClass96_4.aClass13_Sub2_1);
		@Pc(59) long local59 = this.aClass65_6.aLong47;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass109_Sub1_41.aFloatArray21[0], -super.aClass109_Sub1_41.aFloatArray21[1], -super.aClass109_Sub1_41.aFloatArray21[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), local33 * super.aClass109_Sub1_41.aFloat55, super.aClass109_Sub1_41.aFloat47 * local33, local33 * super.aClass109_Sub1_41.aFloat62, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass109_Sub1_41.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean286 = true;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return this.aBoolean285;
	}
}
