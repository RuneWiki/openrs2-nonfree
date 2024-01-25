import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class112_Sub7 extends Class112 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "Z")
	private boolean aBoolean537 = false;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "Lclient!de;")
	private final Class67 aClass67_5;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!iu;")
	private Class150 aClass150_3;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!gi;Lclient!de;)V")
	public Class112_Sub7(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class67 arg1) {
		super(arg0);
		this.aClass67_5 = arg1;
		if (this.aClass67_5.aClass79_Sub3_1 != null && super.aClass42_Sub3_39.aBoolean297 && super.aClass42_Sub3_39.aBoolean302) {
			@Pc(30) Class272 local30 = Static67.method1543(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass42_Sub3_39);
			@Pc(37) Class272 local37 = Static67.method1543(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass42_Sub3_39);
			this.aClass150_3 = Static152.method3025(new Class272[] { local30, local37 }, super.aClass42_Sub3_39);
			this.aBoolean537 = this.aClass150_3 != null;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean536) {
			super.aClass42_Sub3_39.method3219(arg0);
			super.aClass42_Sub3_39.method3257(arg1);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class79_Sub4 local8 = super.aClass42_Sub3_39.method3270();
		if (!this.aBoolean537 || local8 == null) {
			return;
		}
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(local8);
		super.aClass42_Sub3_39.method3259(0);
		super.aClass42_Sub3_39.method3219(this.aClass67_5.aClass79_Sub3_1);
		@Pc(41) long local41 = this.aClass150_3.aLong125;
		OpenGL.glUseProgramObjectARB(local41);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local41, "sunDir"), -super.aClass42_Sub3_39.aFloatArray33[0], -super.aClass42_Sub3_39.aFloatArray33[1], -super.aClass42_Sub3_39.aFloatArray33[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local41, "sunColour"), super.aClass42_Sub3_39.aFloat99, super.aClass42_Sub3_39.aFloat104, super.aClass42_Sub3_39.aFloat93, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "sunExponent"), Math.abs(super.aClass42_Sub3_39.aFloatArray33[1]) * 928.0F + 96.0F);
		this.aBoolean536 = true;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean536) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass150_3.aLong125;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass42_Sub3_39.anInt3674 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (!this.aBoolean536) {
			return;
		}
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(null);
		super.aClass42_Sub3_39.method3259(0);
		super.aClass42_Sub3_39.method3219(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean536 = false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
	}
}
