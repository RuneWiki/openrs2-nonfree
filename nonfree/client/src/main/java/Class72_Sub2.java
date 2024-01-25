import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Lclient!po;")
	private final Class194 aClass194_3;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "Lclient!wf;")
	private Class265 aClass265_2;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!vj;Lclient!po;)V")
	public Class72_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class194 arg1) {
		super(arg0);
		this.aClass194_3 = arg1;
		if (this.aClass194_3.aClass112_Sub1_1 != null && super.aClass172_Sub2_43.aBoolean602 && super.aClass172_Sub2_43.aBoolean623) {
			@Pc(30) Class104 local30 = Static444.method5856(35633, super.aClass172_Sub2_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class104 local37 = Static444.method5856(35632, super.aClass172_Sub2_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass265_2 = Static64.method1304(new Class104[] { local30, local37 }, super.aClass172_Sub2_43);
			this.aBoolean236 = this.aClass265_2 != null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		if (!this.aBoolean237) {
			return;
		}
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(null);
		super.aClass172_Sub2_43.method5569(0);
		super.aClass172_Sub2_43.method5630(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean237 = false;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean237) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass265_2.aLong224;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass172_Sub2_43.anInt7161 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		if (!this.aBoolean237) {
			super.aClass172_Sub2_43.method5630(arg1);
			super.aClass172_Sub2_43.method5629(arg0);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class112_Sub4 local12 = super.aClass172_Sub2_43.method5554();
		if (!this.aBoolean236 || local12 == null) {
			return;
		}
		super.aClass172_Sub2_43.method5569(1);
		super.aClass172_Sub2_43.method5630(local12);
		super.aClass172_Sub2_43.method5569(0);
		super.aClass172_Sub2_43.method5630(this.aClass194_3.aClass112_Sub1_1);
		@Pc(45) long local45 = this.aClass265_2.aLong224;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass172_Sub2_43.aFloatArray26[0], -super.aClass172_Sub2_43.aFloatArray26[1], -super.aClass172_Sub2_43.aFloatArray26[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass172_Sub2_43.aFloat84, super.aClass172_Sub2_43.aFloat85, super.aClass172_Sub2_43.aFloat76, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass172_Sub2_43.aFloatArray26[1]) * 928.0F + 96.0F);
		this.aBoolean237 = true;
	}
}
