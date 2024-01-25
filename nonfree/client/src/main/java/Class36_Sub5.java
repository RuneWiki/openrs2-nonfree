import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class36_Sub5 extends Class36 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Z")
	private boolean aBoolean540 = false;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
	private boolean aBoolean541 = false;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!ri;")
	private final Class212 aClass212_4;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!eu;")
	private Class74 aClass74_3;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!bo;Lclient!ri;)V")
	public Class36_Sub5(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class212 arg1) {
		super(arg0);
		this.aClass212_4 = arg1;
		if (this.aClass212_4.aClass65_Sub2_1 != null && super.aClass26_Sub1_43.aBoolean64 && super.aClass26_Sub1_43.aBoolean62) {
			@Pc(30) Class235 local30 = Static102.method1620("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass26_Sub1_43, 35633);
			@Pc(37) Class235 local37 = Static102.method1620("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass26_Sub1_43, 35632);
			this.aClass74_3 = Static436.method5907(super.aClass26_Sub1_43, new Class235[] { local30, local37 });
			this.aBoolean540 = this.aClass74_3 != null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean541) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass74_3.aLong60;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (local12 * super.aClass26_Sub1_43.anInt925 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	@Override
	public void method6012() {
		if (!this.aBoolean541) {
			return;
		}
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method673(null);
		super.aClass26_Sub1_43.method696(0);
		super.aClass26_Sub1_43.method673(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean541 = false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6010() {
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6011(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class65_Sub1 local8 = super.aClass26_Sub1_43.method629();
		if (!this.aBoolean540 || local8 == null) {
			return;
		}
		super.aClass26_Sub1_43.method696(1);
		super.aClass26_Sub1_43.method673(local8);
		super.aClass26_Sub1_43.method696(0);
		super.aClass26_Sub1_43.method673(this.aClass212_4.aClass65_Sub2_1);
		@Pc(41) long local41 = this.aClass74_3.aLong60;
		OpenGL.glUseProgramObjectARB(local41);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local41, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local41, "sunDir"), -super.aClass26_Sub1_43.aFloatArray3[0], -super.aClass26_Sub1_43.aFloatArray3[1], -super.aClass26_Sub1_43.aFloatArray3[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local41, "sunColour"), super.aClass26_Sub1_43.aFloat32, super.aClass26_Sub1_43.aFloat30, super.aClass26_Sub1_43.aFloat29, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "sunExponent"), Math.abs(super.aClass26_Sub1_43.aFloatArray3[1]) * 928.0F + 96.0F);
		this.aBoolean541 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!nk;II)V")
	@Override
	public void method6008(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean541) {
			super.aClass26_Sub1_43.method673(arg0);
			super.aClass26_Sub1_43.method669(arg1);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6015(@OriginalArg(0) boolean arg0) {
	}
}
