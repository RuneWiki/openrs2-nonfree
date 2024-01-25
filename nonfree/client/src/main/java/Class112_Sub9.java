import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class112_Sub9 extends Class112 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "Z")
	private boolean aBoolean815 = false;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Z")
	private boolean aBoolean814 = false;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!qf;")
	private final Class308 aClass308_6;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!kj;")
	private Class212 aClass212_7;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!uja;Lclient!qf;)V")
	public Class112_Sub9(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class308 arg1) {
		super(arg0);
		this.aClass308_6 = arg1;
		if (this.aClass308_6.aClass64_Sub1_2 != null && super.aClass145_Sub3_43.aBoolean862 && super.aClass145_Sub3_43.aBoolean853) {
			@Pc(34) Class87 local34 = Static507.method7183("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass145_Sub3_43, 35633);
			@Pc(43) Class87 local43 = Static507.method7183("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass145_Sub3_43, 35632);
			this.aClass212_7 = Static404.method5980(new Class87[] { local34, local43 }, 121, super.aClass145_Sub3_43);
			this.aBoolean814 = this.aClass212_7 != null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean815) {
			super.aClass145_Sub3_43.method8872(arg0);
			super.aClass145_Sub3_43.method8900(arg1);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class64_Sub2 local16 = super.aClass145_Sub3_43.method8860();
		if (!this.aBoolean814 || local16 == null) {
			return;
		}
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872(local16);
		super.aClass145_Sub3_43.method8859(0);
		super.aClass145_Sub3_43.method8872(this.aClass308_6.aClass64_Sub1_2);
		@Pc(49) long local49 = this.aClass212_7.aLong162;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass145_Sub3_43.aFloatArray62[0], -super.aClass145_Sub3_43.aFloatArray62[1], -super.aClass145_Sub3_43.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass145_Sub3_43.aFloat157, super.aClass145_Sub3_43.aFloat168, super.aClass145_Sub3_43.aFloat173, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass145_Sub3_43.aFloatArray62[1]) * 928.0F + 96.0F);
		this.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		if (!this.aBoolean815) {
			return;
		}
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872((Class64) null);
		super.aClass145_Sub3_43.method8859(0);
		super.aClass145_Sub3_43.method8872((Class64) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean815 = false;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean815) {
			return;
		}
		@Pc(17) int local17 = 0x1 << (arg1 & 0x3);
		@Pc(28) float local28 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(32) int local32 = arg0 & 0xFFFF;
		@Pc(41) float local41 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) long local45 = this.aClass212_7.aLong162;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "time"), (float) (local17 * super.aClass145_Sub3_43.anInt10142 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "scale"), local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterDepth"), (float) local32);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "breakWaterOffset"), local41);
	}
}
