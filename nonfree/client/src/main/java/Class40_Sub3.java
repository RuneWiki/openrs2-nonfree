import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!wc;")
	private final Class266 aClass266_2;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!mv;")
	private Class177 aClass177_6;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!na;Lclient!wc;)V")
	public Class40_Sub3(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class266 arg1) {
		super(arg0);
		this.aClass266_2 = arg1;
		if (this.aClass266_2.aClass64_Sub2_1 != null && super.aClass75_Sub2_41.aBoolean333 && super.aClass75_Sub2_41.aBoolean344) {
			@Pc(30) Class124 local30 = Static373.method5186(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass75_Sub2_41);
			@Pc(37) Class124 local37 = Static373.method5186(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass75_Sub2_41);
			this.aClass177_6 = Static148.method2249(super.aClass75_Sub2_41, new Class124[] { local30, local37 });
			this.aBoolean131 = this.aClass177_6 != null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5755(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5753() {
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!ed;)V")
	@Override
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		if (!this.aBoolean132) {
			super.aClass75_Sub2_41.method3844(arg1);
			super.aClass75_Sub2_41.method3798(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(ZB)V")
	@Override
	public void method5758(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class64_Sub1 local8 = super.aClass75_Sub2_41.method3821();
		if (!this.aBoolean131 || local8 == null) {
			return;
		}
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(local8);
		super.aClass75_Sub2_41.method3811(0);
		super.aClass75_Sub2_41.method3844(this.aClass266_2.aClass64_Sub2_1);
		@Pc(39) long local39 = this.aClass177_6.aLong221;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass75_Sub2_41.aFloatArray9[0], -super.aClass75_Sub2_41.aFloatArray9[1], -super.aClass75_Sub2_41.aFloatArray9[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass75_Sub2_41.aFloat56, super.aClass75_Sub2_41.aFloat40, super.aClass75_Sub2_41.aFloat45, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass75_Sub2_41.aFloatArray9[1]) * 928.0F + 96.0F);
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean132) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass177_6.aLong221;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass75_Sub2_41.anInt4860 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	@Override
	public void method5757() {
		if (!this.aBoolean132) {
			return;
		}
		super.aClass75_Sub2_41.method3811(1);
		super.aClass75_Sub2_41.method3844(null);
		super.aClass75_Sub2_41.method3811(0);
		super.aClass75_Sub2_41.method3844(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean132 = false;
	}
}
