import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "Lclient!pba;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!og;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!pea;Lclient!pba;)V")
	public Class52_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class240 arg1) {
		super(arg0);
		this.aClass240_1 = arg1;
		if (this.aClass240_1.aClass35_Sub1_3 != null && super.aClass121_Sub3_43.aBoolean477 && super.aClass121_Sub3_43.aBoolean481) {
			@Pc(30) Class241 local30 = Static96.method1498(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass121_Sub3_43);
			@Pc(37) Class241 local37 = Static96.method1498(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass121_Sub3_43);
			this.aClass227_1 = Static46.method647(new Class241[] { local30, local37 }, super.aClass121_Sub3_43);
			this.aBoolean52 = this.aClass227_1 != null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean51) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass227_1.aLong166;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass121_Sub3_43.anInt6800 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean51) {
			super.aClass121_Sub3_43.method5713(arg0);
			super.aClass121_Sub3_43.method5684(arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		@Pc(15) Class35_Sub2 local15 = super.aClass121_Sub3_43.method5688();
		if (!this.aBoolean52 || local15 == null) {
			return;
		}
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(local15);
		super.aClass121_Sub3_43.method5648(0);
		super.aClass121_Sub3_43.method5713(this.aClass240_1.aClass35_Sub1_3);
		@Pc(46) long local46 = this.aClass227_1.aLong166;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass121_Sub3_43.aFloatArray41[0], -super.aClass121_Sub3_43.aFloatArray41[1], -super.aClass121_Sub3_43.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass121_Sub3_43.aFloat159, super.aClass121_Sub3_43.aFloat143, super.aClass121_Sub3_43.aFloat163, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass121_Sub3_43.aFloatArray41[1]) * 928.0F + 96.0F);
		this.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		if (!this.aBoolean51) {
			return;
		}
		super.aClass121_Sub3_43.method5648(1);
		super.aClass121_Sub3_43.method5713(null);
		super.aClass121_Sub3_43.method5648(0);
		super.aClass121_Sub3_43.method5713(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean51 = false;
	}
}
