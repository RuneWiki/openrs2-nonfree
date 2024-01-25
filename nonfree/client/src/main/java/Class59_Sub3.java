import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!lha;")
	private final Class213 aClass213_3;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!it;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!bi;Lclient!lha;)V")
	public Class59_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_3 = arg1;
		if (this.aClass213_3.aClass10_Sub4_3 != null && super.aClass13_Sub2_43.aBoolean82 && super.aClass13_Sub2_43.aBoolean97) {
			@Pc(30) Class268 local30 = Static179.method3071(super.aClass13_Sub2_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class268 local37 = Static179.method3071(super.aClass13_Sub2_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass167_1 = Static254.method4243(super.aClass13_Sub2_43, new Class268[] { local30, local37 });
			this.aBoolean239 = this.aClass167_1 != null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		if (!this.aBoolean238) {
			return;
		}
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096((Class10) null);
		super.aClass13_Sub2_43.method1093(0);
		super.aClass13_Sub2_43.method1096((Class10) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean238 = false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class10_Sub3 local16 = super.aClass13_Sub2_43.method1059();
		if (!this.aBoolean239 || local16 == null) {
			return;
		}
		super.aClass13_Sub2_43.method1093(1);
		super.aClass13_Sub2_43.method1096(local16);
		super.aClass13_Sub2_43.method1093(0);
		super.aClass13_Sub2_43.method1096(this.aClass213_3.aClass10_Sub4_3);
		@Pc(49) long local49 = this.aClass167_1.aLong112;
		OpenGL.glUseProgramObjectARB(local49);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local49, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local49, "sunDir"), -super.aClass13_Sub2_43.aFloatArray10[0], -super.aClass13_Sub2_43.aFloatArray10[1], -super.aClass13_Sub2_43.aFloatArray10[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local49, "sunColour"), super.aClass13_Sub2_43.aFloat22, super.aClass13_Sub2_43.aFloat23, super.aClass13_Sub2_43.aFloat10, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local49, "sunExponent"), Math.abs(super.aClass13_Sub2_43.aFloatArray10[1]) * 928.0F + 96.0F);
		this.aBoolean238 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		if (!this.aBoolean238) {
			super.aClass13_Sub2_43.method1096(arg1);
			super.aClass13_Sub2_43.method1046(arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean238) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass167_1.aLong112;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass13_Sub2_43.anInt1076 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return false;
	}
}
