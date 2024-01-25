import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
	private boolean aBoolean328 = false;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!od;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!pq;")
	private Class290 aClass290_5;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!pc;Lclient!od;)V")
	public Class44_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class262 arg1) {
		super(arg0);
		this.aClass262_1 = arg1;
		if (this.aClass262_1.aClass116_Sub3_2 != null && super.aClass33_Sub3_34.aBoolean556 && super.aClass33_Sub3_34.aBoolean554) {
			@Pc(30) Class297 local30 = Static572.method7590(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass33_Sub3_34);
			@Pc(37) Class297 local37 = Static572.method7590(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass33_Sub3_34);
			this.aClass290_5 = Static208.method3117(new Class297[] { local30, local37 }, super.aClass33_Sub3_34);
			this.aBoolean328 = this.aClass290_5 != null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class116_Sub1 local12 = super.aClass33_Sub3_34.method6366();
		if (!this.aBoolean328 || local12 == null) {
			return;
		}
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340(local12);
		super.aClass33_Sub3_34.method6329(0);
		super.aClass33_Sub3_34.method6340(this.aClass262_1.aClass116_Sub3_2);
		@Pc(43) long local43 = this.aClass290_5.aLong217;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass33_Sub3_34.aFloatArray54[0], -super.aClass33_Sub3_34.aFloatArray54[1], -super.aClass33_Sub3_34.aFloatArray54[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass33_Sub3_34.aFloat164, super.aClass33_Sub3_34.aFloat179, super.aClass33_Sub3_34.aFloat171, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass33_Sub3_34.aFloatArray54[1]) * 928.0F + 96.0F);
		this.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean329) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg0 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg1 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(43) long local43 = this.aClass290_5.aLong217;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "time"), (float) (super.aClass33_Sub3_34.anInt7264 * local15 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterOffset"), local39);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		if (!this.aBoolean329) {
			super.aClass33_Sub3_34.method6340(arg1);
			super.aClass33_Sub3_34.method6336(arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		if (!this.aBoolean329) {
			return;
		}
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6340((Class116) null);
		super.aClass33_Sub3_34.method6329(0);
		super.aClass33_Sub3_34.method6340((Class116) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean329 = false;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}
}
