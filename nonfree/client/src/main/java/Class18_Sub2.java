import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "Lclient!fa;")
	private final Class101 aClass101_1;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!waa;")
	private Class369 aClass369_1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!ep;Lclient!fa;)V")
	public Class18_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class101 arg1) {
		super(arg0);
		this.aClass101_1 = arg1;
		if (this.aClass101_1.aClass65_Sub2_1 != null && super.aClass95_Sub1_39.aBoolean198 && super.aClass95_Sub1_39.aBoolean179) {
			@Pc(30) Class83 local30 = Static547.method7553("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass95_Sub1_39, 35633);
			@Pc(37) Class83 local37 = Static547.method7553("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass95_Sub1_39, 35632);
			this.aClass369_1 = Static238.method3336(super.aClass95_Sub1_39, new Class83[] { local30, local37 });
			this.aBoolean153 = this.aClass369_1 != null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean154) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass369_1.aLong271;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (local16 * super.aClass95_Sub1_39.anInt2513 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (!this.aBoolean154) {
			return;
		}
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(null);
		super.aClass95_Sub1_39.method2098(0);
		super.aClass95_Sub1_39.method2077(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean154 = false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub4 local8 = super.aClass95_Sub1_39.method2052();
		if (!this.aBoolean153 || local8 == null) {
			return;
		}
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(local8);
		super.aClass95_Sub1_39.method2098(0);
		super.aClass95_Sub1_39.method2077(this.aClass101_1.aClass65_Sub2_1);
		@Pc(43) long local43 = this.aClass369_1.aLong271;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass95_Sub1_39.aFloatArray7[0], -super.aClass95_Sub1_39.aFloatArray7[1], -super.aClass95_Sub1_39.aFloatArray7[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass95_Sub1_39.aFloat30, super.aClass95_Sub1_39.aFloat32, super.aClass95_Sub1_39.aFloat35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass95_Sub1_39.aFloatArray7[1]) * 928.0F + 96.0F);
		this.aBoolean154 = true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		if (!this.aBoolean154) {
			super.aClass95_Sub1_39.method2077(arg1);
			super.aClass95_Sub1_39.method2106(arg0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}
}
