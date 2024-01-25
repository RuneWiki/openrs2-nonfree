import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
	private boolean aBoolean454 = false;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "Lclient!h;")
	private final Class122 aClass122_4;

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "Lclient!kba;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!en;Lclient!h;)V")
	public Class8_Sub6(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class122 arg1) {
		super(arg0);
		this.aClass122_4 = arg1;
		if (this.aClass122_4.aClass16_Sub2_1 != null && super.aClass90_Sub1_38.aBoolean166 && super.aClass90_Sub1_38.aBoolean162) {
			@Pc(30) Class123 local30 = Static194.method3296(35633, super.aClass90_Sub1_38, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class123 local37 = Static194.method3296(35632, super.aClass90_Sub1_38, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass164_2 = Static499.method7167(new Class123[] { local30, local37 }, super.aClass90_Sub1_38);
			this.aBoolean455 = this.aClass164_2 != null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6927(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!it;)V")
	@Override
	public void method6923(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		if (!this.aBoolean454) {
			super.aClass90_Sub1_38.method2126(arg1);
			super.aClass90_Sub1_38.method2123(arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	@Override
	public void method6922() {
		if (!this.aBoolean454) {
			return;
		}
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2126(null);
		super.aClass90_Sub1_38.method2069(0);
		super.aClass90_Sub1_38.method2126(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean454 = false;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6918(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class16_Sub4 local8 = super.aClass90_Sub1_38.method2068();
		if (!this.aBoolean455 || local8 == null) {
			return;
		}
		super.aClass90_Sub1_38.method2069(1);
		super.aClass90_Sub1_38.method2126(local8);
		super.aClass90_Sub1_38.method2069(0);
		super.aClass90_Sub1_38.method2126(this.aClass122_4.aClass16_Sub2_1);
		@Pc(47) long local47 = this.aClass164_2.aLong99;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass90_Sub1_38.aFloatArray16[0], -super.aClass90_Sub1_38.aFloatArray16[1], -super.aClass90_Sub1_38.aFloatArray16[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass90_Sub1_38.aFloat52, super.aClass90_Sub1_38.aFloat41, super.aClass90_Sub1_38.aFloat44, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass90_Sub1_38.aFloatArray16[1]) * 928.0F + 96.0F);
		this.aBoolean454 = true;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean454) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass164_2.aLong99;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass90_Sub1_38.anInt2434 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6919() {
		return false;
	}
}
