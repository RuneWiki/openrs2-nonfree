import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class31_Sub4 extends Class31 {

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Z")
	private boolean aBoolean444 = false;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Z")
	private boolean aBoolean445 = false;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!an;")
	private final Class19 aClass19_3;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!kba;")
	private Class190 aClass190_3;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!lea;Lclient!an;)V")
	public Class31_Sub4(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class19 arg1) {
		super(arg0);
		this.aClass19_3 = arg1;
		if (this.aClass19_3.aClass50_Sub1_1 != null && super.aClass101_Sub2_43.aBoolean451 && super.aClass101_Sub2_43.aBoolean452) {
			@Pc(30) Class57 local30 = Static524.method8166("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass101_Sub2_43, 35633);
			@Pc(37) Class57 local37 = Static524.method8166("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass101_Sub2_43, 35632);
			this.aClass190_3 = Static105.method1884(new Class57[] { local30, local37 }, super.aClass101_Sub2_43);
			this.aBoolean444 = this.aClass190_3 != null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!fga;I)V")
	@Override
	public void method9598(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean445) {
			super.aClass101_Sub2_43.method5690(arg0);
			super.aClass101_Sub2_43.method5681(arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZI)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean445) {
			return;
		}
		@Pc(15) int local15 = 0x1 << (arg0 & 0x3);
		@Pc(26) float local26 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(30) int local30 = arg1 & 0xFFFF;
		@Pc(39) float local39 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(43) long local43 = this.aClass190_3.aLong151;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "time"), (float) (local15 * super.aClass101_Sub2_43.anInt6314 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "scale"), local26);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterDepth"), (float) local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "breakWaterOffset"), local39);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9600(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class50_Sub3 local8 = super.aClass101_Sub2_43.method5637();
		if (!this.aBoolean444 || local8 == null) {
			return;
		}
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690(local8);
		super.aClass101_Sub2_43.method5627(0);
		super.aClass101_Sub2_43.method5690(this.aClass19_3.aClass50_Sub1_1);
		@Pc(47) long local47 = this.aClass190_3.aLong151;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass101_Sub2_43.aFloatArray38[0], -super.aClass101_Sub2_43.aFloatArray38[1], -super.aClass101_Sub2_43.aFloatArray38[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass101_Sub2_43.aFloat141, super.aClass101_Sub2_43.aFloat127, super.aClass101_Sub2_43.aFloat125, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass101_Sub2_43.aFloatArray38[1]) * 928.0F + 96.0F);
		this.aBoolean445 = true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9602(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9604() {
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	@Override
	public void method9597() {
		if (!this.aBoolean445) {
			return;
		}
		super.aClass101_Sub2_43.method5627(1);
		super.aClass101_Sub2_43.method5690((Class50) null);
		super.aClass101_Sub2_43.method5627(0);
		super.aClass101_Sub2_43.method5690((Class50) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean445 = false;
	}
}
