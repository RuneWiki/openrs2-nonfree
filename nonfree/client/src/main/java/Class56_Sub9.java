import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class56_Sub9 extends Class56 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	private boolean aBoolean642 = false;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!me;")
	private final Class190 aClass190_6;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!is;")
	private Class138 aClass138_6;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ad;Lclient!me;)V")
	public Class56_Sub9(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class190 arg1) {
		super(arg0);
		this.aClass190_6 = arg1;
		if (this.aClass190_6.aClass11_Sub2_1 != null && super.aClass5_Sub1_39.aBoolean18 && super.aClass5_Sub1_39.aBoolean36) {
			@Pc(30) Class206 local30 = Static403.method6129("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass5_Sub1_39, 35633);
			@Pc(37) Class206 local37 = Static403.method6129("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass5_Sub1_39, 35632);
			this.aClass138_6 = Static345.method5497(new Class206[] { local30, local37 }, super.aClass5_Sub1_39);
			this.aBoolean643 = this.aClass138_6 != null;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method7137() {
		if (!this.aBoolean642) {
			return;
		}
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method423(null);
		super.aClass5_Sub1_39.method397(0);
		super.aClass5_Sub1_39.method423(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean642 = false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7141(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class11_Sub4 local15 = super.aClass5_Sub1_39.method464();
		if (!this.aBoolean643 || local15 == null) {
			return;
		}
		super.aClass5_Sub1_39.method397(1);
		super.aClass5_Sub1_39.method423(local15);
		super.aClass5_Sub1_39.method397(0);
		super.aClass5_Sub1_39.method423(this.aClass190_6.aClass11_Sub2_1);
		@Pc(46) long local46 = this.aClass138_6.aLong119;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass5_Sub1_39.bf[0], -super.aClass5_Sub1_39.bf[1], -super.aClass5_Sub1_39.bf[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass5_Sub1_39.aFloat6, super.aClass5_Sub1_39.aFloat14, super.aClass5_Sub1_39.aFloat18, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass5_Sub1_39.bf[1]) * 928.0F + 96.0F);
		this.aBoolean642 = true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7138(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7142() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean642) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass138_6.aLong119;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass5_Sub1_39.anInt377 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!pm;)V")
	@Override
	public void method7139(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		if (!this.aBoolean642) {
			super.aClass5_Sub1_39.method423(arg1);
			super.aClass5_Sub1_39.method416(arg0);
		}
	}
}
