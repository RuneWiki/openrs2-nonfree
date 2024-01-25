import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Lclient!fj;")
	private final Class105 aClass105_1;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!caa;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!er;Lclient!fj;)V")
	public Class15_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Class105 arg1) {
		super(arg0);
		this.aClass105_1 = arg1;
		if (this.aClass105_1.aClass50_Sub3_3 != null && super.aClass31_Sub2_40.aBoolean212 && super.aClass31_Sub2_40.aBoolean221) {
			@Pc(30) Class157 local30 = Static524.method7238(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass31_Sub2_40);
			@Pc(37) Class157 local37 = Static524.method7238(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass31_Sub2_40);
			this.aClass45_1 = Static467.method6394(super.aClass31_Sub2_40, new Class157[] { local30, local37 });
			this.aBoolean9 = this.aClass45_1 != null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ep;I)V")
	@Override
	public void method6947(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean8) {
			super.aClass31_Sub2_40.method2535(arg0);
			super.aClass31_Sub2_40.method2495(arg1);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6945(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	public void method6944() {
		if (!this.aBoolean8) {
			return;
		}
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(null);
		super.aClass31_Sub2_40.method2513(0);
		super.aClass31_Sub2_40.method2535(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
	@Override
	public void method6948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean8) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass45_1.aLong21;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass31_Sub2_40.anInt3134 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6946() {
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class50_Sub4 local14 = super.aClass31_Sub2_40.method2559();
		if (!this.aBoolean9 || local14 == null) {
			return;
		}
		super.aClass31_Sub2_40.method2513(1);
		super.aClass31_Sub2_40.method2535(local14);
		super.aClass31_Sub2_40.method2513(0);
		super.aClass31_Sub2_40.method2535(this.aClass105_1.aClass50_Sub3_3);
		@Pc(45) long local45 = this.aClass45_1.aLong21;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass31_Sub2_40.aFloatArray29[0], super.aClass31_Sub2_40.aFloatArray29[1], super.aClass31_Sub2_40.aFloatArray29[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass31_Sub2_40.aFloat86, super.aClass31_Sub2_40.aFloat76, super.aClass31_Sub2_40.aFloat88, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass31_Sub2_40.aFloatArray29[1]) * 928.0F + 96.0F);
		this.aBoolean8 = true;
	}
}
