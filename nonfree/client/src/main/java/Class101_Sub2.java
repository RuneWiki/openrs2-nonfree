import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "Z")
	private boolean aBoolean299 = false;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!pea;")
	private final Class252 aClass252_1;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!laa;")
	private Class201 aClass201_5;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!qj;Lclient!pea;)V")
	public Class101_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class252 arg1) {
		super(arg0);
		this.aClass252_1 = arg1;
		if (this.aClass252_1.aClass23_Sub2_2 != null && super.aClass100_Sub3_43.aBoolean599 && super.aClass100_Sub3_43.aBoolean588) {
			@Pc(30) Class10 local30 = Static337.method5151(super.aClass100_Sub3_43, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class10 local37 = Static337.method5151(super.aClass100_Sub3_43, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass201_5 = Static273.method4135(new Class10[] { local30, local37 }, super.aClass100_Sub3_43);
			this.aBoolean298 = this.aClass201_5 != null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7836() {
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method7834(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		if (!this.aBoolean299) {
			super.aClass100_Sub3_43.method6277(arg1);
			super.aClass100_Sub3_43.method6322(arg0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7839(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7841(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class23_Sub4 local16 = super.aClass100_Sub3_43.method6282();
		if (!this.aBoolean298 || local16 == null) {
			return;
		}
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(local16);
		super.aClass100_Sub3_43.method6344(0);
		super.aClass100_Sub3_43.method6277(this.aClass252_1.aClass23_Sub2_2);
		@Pc(47) long local47 = this.aClass201_5.aLong134;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass100_Sub3_43.aFloatArray62[0], super.aClass100_Sub3_43.aFloatArray62[1], super.aClass100_Sub3_43.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass100_Sub3_43.aFloat217, super.aClass100_Sub3_43.aFloat230, super.aClass100_Sub3_43.aFloat215, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass100_Sub3_43.aFloatArray62[1]) * 928.0F + 96.0F);
		this.aBoolean299 = true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean299) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass201_5.aLong134;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass100_Sub3_43.anInt7664 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	@Override
	public void method7835() {
		if (!this.aBoolean299) {
			return;
		}
		super.aClass100_Sub3_43.method6344(1);
		super.aClass100_Sub3_43.method6277(null);
		super.aClass100_Sub3_43.method6344(0);
		super.aClass100_Sub3_43.method6277(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean299 = false;
	}
}
