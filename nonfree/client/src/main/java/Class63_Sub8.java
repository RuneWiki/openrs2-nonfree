import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class63_Sub8 extends Class63 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!au;")
	private final Class26 aClass26_6;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!fp;")
	private Class122 aClass122_7;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!aq;Lclient!au;)V")
	public Class63_Sub8(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		super(arg0);
		this.aClass26_6 = arg1;
		if (this.aClass26_6.aClass125_Sub3_3 != null && super.aClass22_Sub1_43.aBoolean80 && super.aClass22_Sub1_43.aBoolean73) {
			@Pc(34) Class328 local34 = Static77.method1637("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass22_Sub1_43, 35633);
			@Pc(43) Class328 local43 = Static77.method1637("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass22_Sub1_43, 35632);
			this.aClass122_7 = Static88.method1894(new Class328[] { local34, local43 }, super.aClass22_Sub1_43);
			this.aBoolean615 = this.aClass122_7 != null;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean616) {
			super.aClass22_Sub1_43.method955(arg0);
			super.aClass22_Sub1_43.method894(arg1);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (!this.aBoolean616) {
			return;
		}
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955((Class125) null);
		super.aClass22_Sub1_43.method931(0);
		super.aClass22_Sub1_43.method955((Class125) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean616 = false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean616) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass122_7.aLong126;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass22_Sub1_43.anInt995 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class125_Sub2 local8 = super.aClass22_Sub1_43.method920();
		if (!this.aBoolean615 || local8 == null) {
			return;
		}
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955(local8);
		super.aClass22_Sub1_43.method931(0);
		super.aClass22_Sub1_43.method955(this.aClass26_6.aClass125_Sub3_3);
		@Pc(48) long local48 = this.aClass122_7.aLong126;
		OpenGL.glUseProgramObjectARB(local48);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local48, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local48, "sunDir"), -super.aClass22_Sub1_43.aFloatArray4[0], -super.aClass22_Sub1_43.aFloatArray4[1], -super.aClass22_Sub1_43.aFloatArray4[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local48, "sunColour"), super.aClass22_Sub1_43.aFloat19, super.aClass22_Sub1_43.aFloat28, super.aClass22_Sub1_43.aFloat25, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "sunExponent"), Math.abs(super.aClass22_Sub1_43.aFloatArray4[1]) * 928.0F + 96.0F);
		this.aBoolean616 = true;
	}
}
