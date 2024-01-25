import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "Lclient!hm;")
	private final Class145 aClass145_1;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!vca;")
	private Class344 aClass344_1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!no;Lclient!hm;)V")
	public Class44_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class145 arg1) {
		super(arg0);
		this.aClass145_1 = arg1;
		if (this.aClass145_1.aClass114_Sub2_1 != null && super.aClass66_Sub3_38.aBoolean479 && super.aClass66_Sub3_38.aBoolean469) {
			@Pc(30) Class312 local30 = Static527.method7358(super.aClass66_Sub3_38, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
			@Pc(37) Class312 local37 = Static527.method7358(super.aClass66_Sub3_38, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
			this.aClass344_1 = Static80.method1405(new Class312[] { local30, local37 }, super.aClass66_Sub3_38);
			this.aBoolean256 = this.aClass344_1 != null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		if (!this.aBoolean257) {
			return;
		}
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(null);
		super.aClass66_Sub3_38.method5381(0);
		super.aClass66_Sub3_38.method5382(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean257 = false;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class114_Sub3 local16 = super.aClass66_Sub3_38.method5385();
		if (!this.aBoolean256 || local16 == null) {
			return;
		}
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(local16);
		super.aClass66_Sub3_38.method5381(0);
		super.aClass66_Sub3_38.method5382(this.aClass145_1.aClass114_Sub2_1);
		@Pc(47) long local47 = this.aClass344_1.aLong283;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass66_Sub3_38.aFloatArray41[0], -super.aClass66_Sub3_38.aFloatArray41[1], -super.aClass66_Sub3_38.aFloatArray41[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass66_Sub3_38.aFloat116, super.aClass66_Sub3_38.aFloat112, super.aClass66_Sub3_38.aFloat131, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass66_Sub3_38.aFloatArray41[1]) * 928.0F + 96.0F);
		this.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		if (!this.aBoolean257) {
			super.aClass66_Sub3_38.method5382(arg1);
			super.aClass66_Sub3_38.method5355(arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean257) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg1 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg0 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass344_1.aLong283;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (local18 * super.aClass66_Sub3_38.anInt6442 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}
}
