import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!ol;")
	private final Class264 aClass264_1;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "Lclient!ag;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!hk;Lclient!ol;)V")
	public Class21_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_1 = arg1;
		if (this.aClass264_1.aClass39_Sub3_1 != null && super.aClass16_Sub2_43.aBoolean332 && super.aClass16_Sub2_43.aBoolean339) {
			@Pc(30) Class166 local30 = Static245.method3919("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass16_Sub2_43);
			@Pc(37) Class166 local37 = Static245.method3919("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.aClass16_Sub2_43);
			this.aClass12_1 = Static551.method7571(super.aClass16_Sub2_43, new Class166[] { local30, local37 });
			this.aBoolean68 = this.aClass12_1 != null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		if (!this.aBoolean67) {
			super.aClass16_Sub2_43.method3620(arg1);
			super.aClass16_Sub2_43.method3680(arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class39_Sub1 local16 = super.aClass16_Sub2_43.method3685();
		if (!this.aBoolean68 || local16 == null) {
			return;
		}
		@Pc(34) float local34 = (1.0F - Math.abs(super.aClass16_Sub2_43.aFloatArray42[1])) * 2.0F + 1.0F;
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620(local16);
		super.aClass16_Sub2_43.method3683(0);
		super.aClass16_Sub2_43.method3620(this.aClass264_1.aClass39_Sub3_1);
		@Pc(60) long local60 = this.aClass12_1.aLong4;
		OpenGL.glUseProgramObjectARB(local60);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local60, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local60, "sunDir"), -super.aClass16_Sub2_43.aFloatArray42[0], -super.aClass16_Sub2_43.aFloatArray42[1], -super.aClass16_Sub2_43.aFloatArray42[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local60, "sunColour"), local34 * super.aClass16_Sub2_43.aFloat94, local34 * super.aClass16_Sub2_43.aFloat88, super.aClass16_Sub2_43.aFloat91 * local34, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "sunExponent"), Math.abs(super.aClass16_Sub2_43.aFloatArray42[1]) * 928.0F + 64.0F);
		this.aBoolean67 = true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		if (!this.aBoolean67) {
			return;
		}
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3620((Class39) null);
		super.aClass16_Sub2_43.method3683(0);
		super.aClass16_Sub2_43.method3620((Class39) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean67 = false;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean67) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass12_1.aLong4;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass16_Sub2_43.anInt4365 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return this.aBoolean68;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
	}
}
