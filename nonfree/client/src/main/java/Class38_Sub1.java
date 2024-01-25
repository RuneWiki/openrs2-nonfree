import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cr", name = "v", descriptor = "Lclient!hl;")
	private final Class100 aClass100_1;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Lclient!su;")
	private Class230 aClass230_1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!nq;Lclient!hl;)V")
	public Class38_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class100 arg1) {
		super(arg0);
		this.aClass100_1 = arg1;
		if (this.aClass100_1.aClass137_Sub2_3 != null && super.aClass167_Sub1_42.aBoolean360 && super.aClass167_Sub1_42.aBoolean340) {
			@Pc(30) Class184 local30 = Static21.method6257("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass167_Sub1_42, 35633);
			@Pc(37) Class184 local37 = Static21.method6257("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass167_Sub1_42, 35632);
			this.aClass230_1 = Static368.method5128(super.aClass167_Sub1_42, new Class184[] { local30, local37 });
			this.aBoolean76 = this.aClass230_1 != null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean75) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass230_1.aLong217;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass167_Sub1_42.anInt4890 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean75) {
			super.aClass167_Sub1_42.method4028(arg0);
			super.aClass167_Sub1_42.method3998(arg1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return false;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		if (!this.aBoolean75) {
			return;
		}
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(null);
		super.aClass167_Sub1_42.method3993(0);
		super.aClass167_Sub1_42.method4028(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		@Pc(14) Class137_Sub4 local14 = super.aClass167_Sub1_42.method4033();
		if (!this.aBoolean76 || local14 == null) {
			return;
		}
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(local14);
		super.aClass167_Sub1_42.method3993(0);
		super.aClass167_Sub1_42.method4028(this.aClass100_1.aClass137_Sub2_3);
		@Pc(45) long local45 = this.aClass230_1.aLong217;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass167_Sub1_42.aFloatArray27[0], -super.aClass167_Sub1_42.aFloatArray27[1], -super.aClass167_Sub1_42.aFloatArray27[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass167_Sub1_42.aFloat71, super.aClass167_Sub1_42.aFloat78, super.aClass167_Sub1_42.aFloat69, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass167_Sub1_42.aFloatArray27[1]) * 928.0F + 96.0F);
		this.aBoolean75 = true;
	}
}
