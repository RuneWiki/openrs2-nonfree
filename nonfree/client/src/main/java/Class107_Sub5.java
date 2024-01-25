import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class107_Sub5 extends Class107 {

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Z")
	private boolean aBoolean522 = false;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "Lclient!qr;")
	private final Class282 aClass282_4;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!as;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!oea;Lclient!qr;)V")
	public Class107_Sub5(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class282 arg1) {
		super(arg0);
		this.aClass282_4 = arg1;
		if (this.aClass282_4.aClass88_Sub1_2 != null && super.aClass87_Sub2_37.aBoolean544 && super.aClass87_Sub2_37.aBoolean560) {
			@Pc(30) Class134 local30 = Static532.method7450(35633, super.aClass87_Sub2_37, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class134 local37 = Static532.method7450(35632, super.aClass87_Sub2_37, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass23_1 = Static85.method1550(new Class134[] { local30, local37 }, super.aClass87_Sub2_37);
			this.aBoolean521 = this.aClass23_1 != null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (!this.aBoolean522) {
			return;
		}
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(null);
		super.aClass87_Sub2_37.method6155(0);
		super.aClass87_Sub2_37.method6167(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean522 = false;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class88_Sub3 local8 = super.aClass87_Sub2_37.method6174();
		if (!this.aBoolean521 || local8 == null) {
			return;
		}
		@Pc(27) float local27 = (1.0F - Math.abs(super.aClass87_Sub2_37.aFloatArray62[1])) * 2.0F + 1.0F;
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(local8);
		super.aClass87_Sub2_37.method6155(0);
		super.aClass87_Sub2_37.method6167(this.aClass282_4.aClass88_Sub1_2);
		@Pc(53) long local53 = this.aClass23_1.aLong24;
		OpenGL.glUseProgramObjectARB(local53);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local53, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local53, "sunDir"), -super.aClass87_Sub2_37.aFloatArray62[0], -super.aClass87_Sub2_37.aFloatArray62[1], -super.aClass87_Sub2_37.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local53, "sunColour"), local27 * super.aClass87_Sub2_37.aFloat176, super.aClass87_Sub2_37.aFloat180 * local27, super.aClass87_Sub2_37.aFloat179 * local27, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local53, "sunExponent"), Math.abs(super.aClass87_Sub2_37.aFloatArray62[1]) * 928.0F + 64.0F);
		this.aBoolean522 = true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean522) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg0 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass23_1.aLong24;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (local16 * super.aClass87_Sub2_37.anInt7366 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return this.aBoolean521;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean522) {
			super.aClass87_Sub2_37.method6167(arg0);
			super.aClass87_Sub2_37.method6159(arg1);
		}
	}
}
