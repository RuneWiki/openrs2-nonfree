import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!dk;")
	private final Class69 aClass69_2;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!sh;")
	private Class305 aClass305_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!jaa;Lclient!dk;)V")
	public Class60_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class69 arg1) {
		super(arg0);
		this.aClass69_2 = arg1;
		if (this.aClass69_2.aClass51_Sub2_3 != null && super.aClass14_Sub3_42.aBoolean316 && super.aClass14_Sub3_42.aBoolean320) {
			@Pc(30) Class137 local30 = Static482.method6640("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass14_Sub3_42, 35633);
			@Pc(37) Class137 local37 = Static482.method6640("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass14_Sub3_42, 35632);
			this.aClass305_1 = Static154.method2915(new Class137[] { local30, local37 }, super.aClass14_Sub3_42);
			this.aBoolean119 = this.aClass305_1 != null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class51_Sub3 local13 = super.aClass14_Sub3_42.method3978();
		if (!this.aBoolean119 || local13 == null) {
			return;
		}
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(local13);
		super.aClass14_Sub3_42.method3917(0);
		super.aClass14_Sub3_42.method3985(this.aClass69_2.aClass51_Sub2_3);
		@Pc(46) long local46 = this.aClass305_1.aLong218;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass14_Sub3_42.aFloatArray40[0], -super.aClass14_Sub3_42.aFloatArray40[1], -super.aClass14_Sub3_42.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass14_Sub3_42.aFloat103, super.aClass14_Sub3_42.aFloat93, super.aClass14_Sub3_42.aFloat108, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass14_Sub3_42.aFloatArray40[1]) * 928.0F + 96.0F);
		this.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		if (!this.aBoolean120) {
			return;
		}
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(null);
		super.aClass14_Sub3_42.method3917(0);
		super.aClass14_Sub3_42.method3985(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean120) {
			return;
		}
		@Pc(18) int local18 = 0x1 << (arg0 & 0x3);
		@Pc(29) float local29 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(33) int local33 = arg1 & 0xFFFF;
		@Pc(42) float local42 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(46) long local46 = this.aClass305_1.aLong218;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "time"), (float) (super.aClass14_Sub3_42.anInt4557 * local18 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "scale"), local29);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterDepth"), (float) local33);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "breakWaterOffset"), local42);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		if (!this.aBoolean120) {
			super.aClass14_Sub3_42.method3985(arg1);
			super.aClass14_Sub3_42.method3925(arg0);
		}
	}
}
