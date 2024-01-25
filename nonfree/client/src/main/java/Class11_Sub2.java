import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "Lclient!jga;")
	private final Class161 aClass161_2;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Lclient!rv;")
	private Class300 aClass300_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!wh;Lclient!jga;)V")
	public Class11_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		this.aClass161_2 = arg1;
		if (this.aClass161_2.aClass3_Sub3_3 != null && super.aClass100_Sub3_41.aBoolean706 && super.aClass100_Sub3_41.aBoolean714) {
			@Pc(30) Class375 local30 = Static142.method2295(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass100_Sub3_41);
			@Pc(37) Class375 local37 = Static142.method2295(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass100_Sub3_41);
			this.aClass300_1 = Static648.method9037(new Class375[] { local30, local37 }, super.aClass100_Sub3_41);
			this.aBoolean48 = this.aClass300_1 != null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean50) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass300_1.aLong224;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass100_Sub3_41.anInt10585 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		@Pc(14) Class3_Sub4 local14 = super.aClass100_Sub3_41.method8908();
		if (!this.aBoolean48 || local14 == null) {
			return;
		}
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925(local14);
		super.aClass100_Sub3_41.method8861(0);
		super.aClass100_Sub3_41.method8925(this.aClass161_2.aClass3_Sub3_3);
		@Pc(47) long local47 = this.aClass300_1.aLong224;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass100_Sub3_41.aFloatArray80[0], -super.aClass100_Sub3_41.aFloatArray80[1], -super.aClass100_Sub3_41.aFloatArray80[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass100_Sub3_41.aFloat221, super.aClass100_Sub3_41.aFloat222, super.aClass100_Sub3_41.aFloat217, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass100_Sub3_41.aFloatArray80[1]) * 928.0F + 96.0F);
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean50) {
			super.aClass100_Sub3_41.method8925(arg0);
			super.aClass100_Sub3_41.method8903(arg1);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		if (!this.aBoolean50) {
			return;
		}
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8925((Class3) null);
		super.aClass100_Sub3_41.method8861(0);
		super.aClass100_Sub3_41.method8925((Class3) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean50 = false;
	}
}
