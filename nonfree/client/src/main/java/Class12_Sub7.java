import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!ha;")
	private final Class98 aClass98_5;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!jh;")
	private Class129 aClass129_6;

	static {
		new Class267("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!rl;Lclient!ha;)V")
	public Class12_Sub7(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class98 arg1) {
		super(arg0);
		this.aClass98_5 = arg1;
		if (this.aClass98_5.aClass19_Sub1_2 != null && super.aClass66_Sub2_41.aBoolean378 && super.aClass66_Sub2_41.aBoolean375) {
			@Pc(30) Class168 local30 = Static227.method3401(super.aClass66_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class168 local37 = Static227.method3401(super.aClass66_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass129_6 = Static143.method2455(super.aClass66_Sub2_41, new Class168[] { local30, local37 });
			this.aBoolean425 = this.aClass129_6 != null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (!this.aBoolean427) {
			super.aClass66_Sub2_41.method5109(arg1);
			super.aClass66_Sub2_41.method5140(arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		if (!this.aBoolean427) {
			return;
		}
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(null);
		super.aClass66_Sub2_41.method5075(0);
		super.aClass66_Sub2_41.method5109(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean427 = false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class19_Sub3 local14 = super.aClass66_Sub2_41.method5111();
		if (!this.aBoolean425 || local14 == null) {
			return;
		}
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(local14);
		super.aClass66_Sub2_41.method5075(0);
		super.aClass66_Sub2_41.method5109(this.aClass98_5.aClass19_Sub1_2);
		@Pc(47) long local47 = this.aClass129_6.aLong103;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass66_Sub2_41.aFloatArray21[0], -super.aClass66_Sub2_41.aFloatArray21[1], -super.aClass66_Sub2_41.aFloatArray21[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass66_Sub2_41.aFloat74, super.aClass66_Sub2_41.aFloat76, super.aClass66_Sub2_41.aFloat84, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass66_Sub2_41.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean427 = true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean427) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass129_6.aLong103;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass66_Sub2_41.anInt6140 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
	}
}
