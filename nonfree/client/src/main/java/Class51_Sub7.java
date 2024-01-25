import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class51_Sub7 extends Class51 {

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Z")
	private boolean aBoolean392 = false;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "Lclient!wl;")
	private final Class264 aClass264_6;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Lclient!ss;")
	private Class213 aClass213_3;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!gk;Lclient!wl;)V")
	public Class51_Sub7(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_6 = arg1;
		if (this.aClass264_6.aClass42_Sub4_1 != null && super.aClass75_Sub2_39.aBoolean221 && super.aClass75_Sub2_39.aBoolean219) {
			@Pc(30) Class86 local30 = Static207.method3388(super.aClass75_Sub2_39, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class86 local37 = Static207.method3388(super.aClass75_Sub2_39, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass213_3 = Static426.method5667(super.aClass75_Sub2_39, new Class86[] { local30, local37 });
			this.aBoolean392 = this.aClass213_3 != null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return this.aBoolean392;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class42_Sub3 local13 = super.aClass75_Sub2_39.method2471();
		if (!this.aBoolean392 || local13 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass75_Sub2_39.aFloatArray23[1])) * 2.0F + 1.0F;
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(local13);
		super.aClass75_Sub2_39.method2426(0);
		super.aClass75_Sub2_39.method2456(this.aClass264_6.aClass42_Sub4_1);
		@Pc(57) long local57 = this.aClass213_3.aLong194;
		OpenGL.glUseProgramObjectARB(local57);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local57, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local57, "sunDir"), -super.aClass75_Sub2_39.aFloatArray23[0], -super.aClass75_Sub2_39.aFloatArray23[1], -super.aClass75_Sub2_39.aFloatArray23[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local57, "sunColour"), super.aClass75_Sub2_39.aFloat43 * local31, local31 * super.aClass75_Sub2_39.aFloat47, super.aClass75_Sub2_39.aFloat37 * local31, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local57, "sunExponent"), Math.abs(super.aClass75_Sub2_39.aFloatArray23[1]) * 928.0F + 64.0F);
		this.aBoolean393 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean393) {
			super.aClass75_Sub2_39.method2456(arg0);
			super.aClass75_Sub2_39.method2424(arg1);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean393) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass213_3.aLong194;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (super.aClass75_Sub2_39.anInt3079 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		if (!this.aBoolean393) {
			return;
		}
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(null);
		super.aClass75_Sub2_39.method2426(0);
		super.aClass75_Sub2_39.method2456(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean393 = false;
	}
}
