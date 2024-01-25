import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class43_Sub6 extends Class43 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!taa;")
	private final Class349 aClass349_3;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!ima;")
	private Class175 aClass175_5;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!gia;Lclient!taa;)V")
	public Class43_Sub6(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class349 arg1) {
		super(arg0);
		this.aClass349_3 = arg1;
		if (this.aClass349_3.aClass245_Sub3_1 != null && super.aClass67_Sub2_41.aBoolean317 && super.aClass67_Sub2_41.aBoolean307) {
			@Pc(34) Class127 local34 = Static304.method4645("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass67_Sub2_41);
			@Pc(43) Class127 local43 = Static304.method4645("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", 35632, super.aClass67_Sub2_41);
			this.aClass175_5 = Static435.method6374(super.aClass67_Sub2_41, -92, new Class127[] { local34, local43 });
			this.aBoolean425 = this.aClass175_5 != null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean424) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass175_5.aLong173;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass67_Sub2_41.anInt3876 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8859() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!sga;I)V")
	@Override
	public void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1) {
		if (!this.aBoolean424) {
			super.aClass67_Sub2_41.method3234(arg1);
			super.aClass67_Sub2_41.method3255(arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8858(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class245_Sub1 local13 = super.aClass67_Sub2_41.method3302();
		if (!this.aBoolean425 || local13 == null) {
			return;
		}
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234(local13);
		super.aClass67_Sub2_41.method3268(0);
		super.aClass67_Sub2_41.method3234(this.aClass349_3.aClass245_Sub3_1);
		@Pc(46) long local46 = this.aClass175_5.aLong173;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass67_Sub2_41.aFloatArray38[0], -super.aClass67_Sub2_41.aFloatArray38[1], -super.aClass67_Sub2_41.aFloatArray38[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass67_Sub2_41.aFloat77, super.aClass67_Sub2_41.aFloat76, super.aClass67_Sub2_41.aFloat68, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass67_Sub2_41.aFloatArray38[1]) * 928.0F + 96.0F);
		this.aBoolean424 = true;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	@Override
	public void method8866() {
		if (!this.aBoolean424) {
			return;
		}
		super.aClass67_Sub2_41.method3268(1);
		super.aClass67_Sub2_41.method3234((Class245) null);
		super.aClass67_Sub2_41.method3268(0);
		super.aClass67_Sub2_41.method3234((Class245) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean424 = false;
	}
}
