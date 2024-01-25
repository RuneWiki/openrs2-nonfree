import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class14_Sub6 extends Class14 {

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "Z")
	private boolean aBoolean578 = false;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Z")
	private boolean aBoolean579 = false;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Lclient!faa;")
	private final Class91 aClass91_5;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "Lclient!ua;")
	private Class326 aClass326_6;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!eq;Lclient!faa;)V")
	public Class14_Sub6(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class91 arg1) {
		super(arg0);
		this.aClass91_5 = arg1;
		if (this.aClass91_5.aClass121_Sub4_2 != null && super.aClass33_Sub3_43.aBoolean276 && super.aClass33_Sub3_43.aBoolean272) {
			@Pc(30) Class45 local30 = Static335.method5570(super.aClass33_Sub3_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class45 local37 = Static335.method5570(super.aClass33_Sub3_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass326_6 = Static143.method3168(new Class45[] { local30, local37 }, super.aClass33_Sub3_43);
			this.aBoolean578 = this.aClass326_6 != null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	@Override
	public void method8545() {
		if (!this.aBoolean579) {
			return;
		}
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(null);
		super.aClass33_Sub3_43.method3027(0);
		super.aClass33_Sub3_43.method3012(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	@Override
	public void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean579) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass326_6.aLong247;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (local16 * super.aClass33_Sub3_43.anInt3418 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!kp;I)V")
	@Override
	public void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean579) {
			super.aClass33_Sub3_43.method3012(arg0);
			super.aClass33_Sub3_43.method3045(arg1);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8550(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8549() {
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8543(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class121_Sub1 local16 = super.aClass33_Sub3_43.method3060();
		if (!this.aBoolean578 || local16 == null) {
			return;
		}
		super.aClass33_Sub3_43.method3027(1);
		super.aClass33_Sub3_43.method3012(local16);
		super.aClass33_Sub3_43.method3027(0);
		super.aClass33_Sub3_43.method3012(this.aClass91_5.aClass121_Sub4_2);
		@Pc(47) long local47 = this.aClass326_6.aLong247;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass33_Sub3_43.aFloatArray42[0], -super.aClass33_Sub3_43.aFloatArray42[1], -super.aClass33_Sub3_43.aFloatArray42[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass33_Sub3_43.aFloat123, super.aClass33_Sub3_43.aFloat110, super.aClass33_Sub3_43.aFloat109, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass33_Sub3_43.aFloatArray42[1]) * 928.0F + 96.0F);
		this.aBoolean579 = true;
	}
}
