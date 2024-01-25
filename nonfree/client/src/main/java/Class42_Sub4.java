import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class42_Sub4 extends Class42 {

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "Lclient!al;")
	private final Class14 aClass14_4;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "Lclient!nba;")
	private Class233 aClass233_7;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!uca;Lclient!al;)V")
	public Class42_Sub4(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class14 arg1) {
		super(arg0);
		this.aClass14_4 = arg1;
		if (this.aClass14_4.aClass3_Sub4_2 != null && super.aClass162_Sub3_44.aBoolean724 && super.aClass162_Sub3_44.aBoolean728) {
			@Pc(30) Class118 local30 = Static61.method1063("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass162_Sub3_44, 35633);
			@Pc(37) Class118 local37 = Static61.method1063("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass162_Sub3_44, 35632);
			this.aClass233_7 = Static9.method178(new Class118[] { local30, local37 }, super.aClass162_Sub3_44);
			this.aBoolean465 = this.aClass233_7 != null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean464) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass233_7.aLong160;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass162_Sub3_44.anInt8686 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return false;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class3_Sub3 local8 = super.aClass162_Sub3_44.method6900();
		if (!this.aBoolean465 || local8 == null) {
			return;
		}
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(local8);
		super.aClass162_Sub3_44.method6947(0);
		super.aClass162_Sub3_44.method6911(this.aClass14_4.aClass3_Sub4_2);
		@Pc(39) long local39 = this.aClass233_7.aLong160;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass162_Sub3_44.aFloatArray70[0], super.aClass162_Sub3_44.aFloatArray70[1], super.aClass162_Sub3_44.aFloatArray70[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass162_Sub3_44.aFloat218, super.aClass162_Sub3_44.aFloat214, super.aClass162_Sub3_44.aFloat211, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass162_Sub3_44.aFloatArray70[1]) * 928.0F + 96.0F);
		this.aBoolean464 = true;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (!this.aBoolean464) {
			return;
		}
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(null);
		super.aClass162_Sub3_44.method6947(0);
		super.aClass162_Sub3_44.method6911(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		if (!this.aBoolean464) {
			super.aClass162_Sub3_44.method6911(arg1);
			super.aClass162_Sub3_44.method6953(arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
	}
}
