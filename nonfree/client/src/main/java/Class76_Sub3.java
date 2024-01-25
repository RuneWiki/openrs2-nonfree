import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Lclient!pe;")
	private final Class191 aClass191_4;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "Lclient!v;")
	private Class249 aClass249_2;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!qg;Lclient!pe;)V")
	public Class76_Sub3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		super(arg0);
		this.aClass191_4 = arg1;
		if (this.aClass191_4.aClass21_Sub1_3 != null && super.aClass121_Sub2_39.aBoolean482 && super.aClass121_Sub2_39.aBoolean465) {
			@Pc(30) Class259 local30 = Static216.method3232(35633, super.aClass121_Sub2_39, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class259 local37 = Static216.method3232(35632, super.aClass121_Sub2_39, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass249_2 = Static309.method4242(super.aClass121_Sub2_39, new Class259[] { local30, local37 });
			this.aBoolean248 = this.aClass249_2 != null;
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		if (!this.aBoolean247) {
			return;
		}
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(null);
		super.aClass121_Sub2_39.method4669(0);
		super.aClass121_Sub2_39.method4681(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean247 = false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		if (!this.aBoolean247) {
			super.aClass121_Sub2_39.method4681(arg1);
			super.aClass121_Sub2_39.method4707(arg0);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean247) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass249_2.aLong215;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass121_Sub2_39.anInt5935 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class21_Sub4 local8 = super.aClass121_Sub2_39.method4728();
		if (!this.aBoolean248 || local8 == null) {
			return;
		}
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(local8);
		super.aClass121_Sub2_39.method4669(0);
		super.aClass121_Sub2_39.method4681(this.aClass191_4.aClass21_Sub1_3);
		@Pc(47) long local47 = this.aClass249_2.aLong215;
		OpenGL.glUseProgramObjectARB(local47);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local47, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local47, "sunDir"), -super.aClass121_Sub2_39.aFloatArray36[0], -super.aClass121_Sub2_39.aFloatArray36[1], -super.aClass121_Sub2_39.aFloatArray36[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local47, "sunColour"), super.aClass121_Sub2_39.aFloat87, super.aClass121_Sub2_39.aFloat100, super.aClass121_Sub2_39.aFloat88, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "sunExponent"), Math.abs(super.aClass121_Sub2_39.aFloatArray36[1]) * 928.0F + 96.0F);
		this.aBoolean247 = true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
	}
}
