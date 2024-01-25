import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class39_Sub9 extends Class39 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
	private boolean aBoolean746 = false;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
	private boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!ah;")
	private final Class12 aClass12_6;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!un;")
	private Class350 aClass350_7;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!rs;Lclient!ah;)V")
	public Class39_Sub9(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class12 arg1) {
		super(arg0);
		this.aClass12_6 = arg1;
		if (this.aClass12_6.aClass167_Sub4_2 != null && super.aClass133_Sub3_42.aBoolean630 && super.aClass133_Sub3_42.aBoolean628) {
			@Pc(30) Class369 local30 = Static432.method6590("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass133_Sub3_42, 35633);
			@Pc(37) Class369 local37 = Static432.method6590("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass133_Sub3_42, 35632);
			this.aClass350_7 = Static457.method6820(new Class369[] { local30, local37 }, super.aClass133_Sub3_42);
			this.aBoolean746 = this.aClass350_7 != null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		if (!this.aBoolean745) {
			super.aClass133_Sub3_42.method7375(arg1);
			super.aClass133_Sub3_42.method7401(arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class167_Sub1 local8 = super.aClass133_Sub3_42.method7399();
		if (!this.aBoolean746 || local8 == null) {
			return;
		}
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(local8);
		super.aClass133_Sub3_42.method7368(0);
		super.aClass133_Sub3_42.method7375(this.aClass12_6.aClass167_Sub4_2);
		@Pc(39) long local39 = this.aClass350_7.aLong247;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass133_Sub3_42.aFloatArray67[0], -super.aClass133_Sub3_42.aFloatArray67[1], -super.aClass133_Sub3_42.aFloatArray67[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass133_Sub3_42.aFloat153, super.aClass133_Sub3_42.aFloat151, super.aClass133_Sub3_42.aFloat159, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass133_Sub3_42.aFloatArray67[1]) * 928.0F + 96.0F);
		this.aBoolean745 = true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean745) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass350_7.aLong247;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (local18 * super.aClass133_Sub3_42.anInt8530 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (!this.aBoolean745) {
			return;
		}
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(null);
		super.aClass133_Sub3_42.method7368(0);
		super.aClass133_Sub3_42.method7375(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean745 = false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}
}
