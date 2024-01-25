import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Z")
	private boolean aBoolean473 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Z")
	private boolean aBoolean472 = false;

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "Lclient!ica;")
	private final Class150 aClass150_3;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!te;")
	private Class309 aClass309_2;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!ag;Lclient!ica;)V")
	public Class7_Sub6(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class150 arg1) {
		super(arg0);
		this.aClass150_3 = arg1;
		if (this.aClass150_3.aClass52_Sub4_1 != null && super.aClass12_Sub1_42.aBoolean40 && super.aClass12_Sub1_42.aBoolean19) {
			@Pc(30) Class344 local30 = Static245.method3978("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass12_Sub1_42, 35633);
			@Pc(37) Class344 local37 = Static245.method3978("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass12_Sub1_42, 35632);
			this.aClass309_2 = Static490.method6896(super.aClass12_Sub1_42, new Class344[] { local30, local37 });
			this.aBoolean473 = this.aClass309_2 != null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		if (!this.aBoolean472) {
			return;
		}
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(null);
		super.aClass12_Sub1_42.method376(0);
		super.aClass12_Sub1_42.method378(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean472 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		if (!this.aBoolean472) {
			super.aClass12_Sub1_42.method378(arg1);
			super.aClass12_Sub1_42.method401(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class52_Sub2 local16 = super.aClass12_Sub1_42.method432();
		if (!this.aBoolean473 || local16 == null) {
			return;
		}
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(local16);
		super.aClass12_Sub1_42.method376(0);
		super.aClass12_Sub1_42.method378(this.aClass150_3.aClass52_Sub4_1);
		@Pc(47) long local47 = this.aClass309_2.aLong372;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass12_Sub1_42.aFloatArray2[0], super.aClass12_Sub1_42.aFloatArray2[1], super.aClass12_Sub1_42.aFloatArray2[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass12_Sub1_42.aFloat14, super.aClass12_Sub1_42.aFloat12, super.aClass12_Sub1_42.aFloat1, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass12_Sub1_42.aFloatArray2[1]) * 928.0F + 96.0F);
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean472) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass309_2.aLong372;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass12_Sub1_42.anInt461 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
