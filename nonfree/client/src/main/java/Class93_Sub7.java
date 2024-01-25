import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class93_Sub7 extends Class93 {

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Z")
	private boolean aBoolean588 = false;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!km;")
	private final Class162 aClass162_3;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Lclient!dca;")
	private Class51 aClass51_5;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!os;Lclient!km;)V")
	public Class93_Sub7(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class162 arg1) {
		super(arg0);
		this.aClass162_3 = arg1;
		if (this.aClass162_3.aClass19_Sub4_1 != null && super.aClass39_Sub3_40.aBoolean504 && super.aClass39_Sub3_40.aBoolean500) {
			@Pc(30) Class305 local30 = Static515.method3365("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass39_Sub3_40, 35633);
			@Pc(37) Class305 local37 = Static515.method3365("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass39_Sub3_40, 35632);
			this.aClass51_5 = Static426.method6568(new Class305[] { local30, local37 }, super.aClass39_Sub3_40);
			this.aBoolean588 = this.aClass51_5 != null;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean589) {
			return;
		}
		@Pc(13) int local13 = 0x1 << (arg0 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg1 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) long local41 = this.aClass51_5.aLong41;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "time"), (float) (super.aClass39_Sub3_40.anInt6717 * local13 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "scale"), local24);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterDepth"), (float) local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterOffset"), local37);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		if (!this.aBoolean589) {
			return;
		}
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5719(null);
		super.aClass39_Sub3_40.method5750(0);
		super.aClass39_Sub3_40.method5719(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean589 = false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class19_Sub1 local16 = super.aClass39_Sub3_40.method5727();
		if (!this.aBoolean588 || local16 == null) {
			return;
		}
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5719(local16);
		super.aClass39_Sub3_40.method5750(0);
		super.aClass39_Sub3_40.method5719(this.aClass162_3.aClass19_Sub4_1);
		@Pc(47) long local47 = this.aClass51_5.aLong41;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass39_Sub3_40.aFloatArray53[0], -super.aClass39_Sub3_40.aFloatArray53[1], -super.aClass39_Sub3_40.aFloatArray53[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass39_Sub3_40.aFloat173, super.aClass39_Sub3_40.aFloat160, super.aClass39_Sub3_40.aFloat174, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass39_Sub3_40.aFloatArray53[1]) * 928.0F + 96.0F);
		this.aBoolean589 = true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean589) {
			super.aClass39_Sub3_40.method5719(arg0);
			super.aClass39_Sub3_40.method5699(arg1);
		}
	}
}
