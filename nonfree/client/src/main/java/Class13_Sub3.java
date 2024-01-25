import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Z")
	private boolean aBoolean288 = false;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "Lclient!pr;")
	private final Class264 aClass264_2;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "Lclient!rda;")
	private Class288 aClass288_1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!nv;Lclient!pr;)V")
	public Class13_Sub3(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_2 = arg1;
		if (this.aClass264_2.aClass20_Sub2_1 != null && super.aClass16_Sub3_42.aBoolean526 && super.aClass16_Sub3_42.aBoolean523) {
			@Pc(30) Class362 local30 = Static384.method6163(super.aClass16_Sub3_42, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class362 local37 = Static384.method6163(super.aClass16_Sub3_42, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass288_1 = Static237.method4354(super.aClass16_Sub3_42, new Class362[] { local30, local37 });
			this.aBoolean288 = this.aClass288_1 != null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public void method8260() {
		if (!this.aBoolean289) {
			return;
		}
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(null);
		super.aClass16_Sub3_42.method5944(0);
		super.aClass16_Sub3_42.method6020(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean289 = false;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean289) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass288_1.aLong223;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass16_Sub3_42.anInt7338 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!tha;II)V")
	@Override
	public void method8264(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean289) {
			super.aClass16_Sub3_42.method6020(arg0);
			super.aClass16_Sub3_42.method5972(arg1);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8265() {
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8268(@OriginalArg(1) boolean arg0) {
		@Pc(14) Class20_Sub3 local14 = super.aClass16_Sub3_42.method5949();
		if (!this.aBoolean288 || local14 == null) {
			return;
		}
		super.aClass16_Sub3_42.method5944(1);
		super.aClass16_Sub3_42.method6020(local14);
		super.aClass16_Sub3_42.method5944(0);
		super.aClass16_Sub3_42.method6020(this.aClass264_2.aClass20_Sub2_1);
		@Pc(47) long local47 = this.aClass288_1.aLong223;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass16_Sub3_42.aFloatArray64[0], -super.aClass16_Sub3_42.aFloatArray64[1], -super.aClass16_Sub3_42.aFloatArray64[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass16_Sub3_42.aFloat150, super.aClass16_Sub3_42.aFloat167, super.aClass16_Sub3_42.aFloat153, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass16_Sub3_42.aFloatArray64[1]) * 928.0F + 96.0F);
		this.aBoolean289 = true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8266(@OriginalArg(1) boolean arg0) {
	}
}
