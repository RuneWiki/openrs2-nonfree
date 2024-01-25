import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class51_Sub5 extends Class51 {

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!wl;")
	private final Class264 aClass264_3;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Lclient!ss;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!gk;Lclient!wl;)V")
	public Class51_Sub5(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_3 = arg1;
		if (this.aClass264_3.aClass42_Sub4_1 != null && super.aClass75_Sub2_39.aBoolean221 && super.aClass75_Sub2_39.aBoolean219) {
			@Pc(30) Class86 local30 = Static207.method3388(super.aClass75_Sub2_39, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class86 local37 = Static207.method3388(super.aClass75_Sub2_39, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass213_2 = Static426.method5667(super.aClass75_Sub2_39, new Class86[] { local30, local37 });
			this.aBoolean347 = this.aClass213_2 != null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4955() {
		return false;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4961(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class42_Sub3 local12 = super.aClass75_Sub2_39.method2471();
		if (!this.aBoolean347 || local12 == null) {
			return;
		}
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(local12);
		super.aClass75_Sub2_39.method2426(0);
		super.aClass75_Sub2_39.method2456(this.aClass264_3.aClass42_Sub4_1);
		@Pc(43) long local43 = this.aClass213_2.aLong194;
		OpenGL.glUseProgramObjectARB(local43);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local43, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local43, "sunDir"), -super.aClass75_Sub2_39.aFloatArray23[0], -super.aClass75_Sub2_39.aFloatArray23[1], -super.aClass75_Sub2_39.aFloatArray23[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local43, "sunColour"), super.aClass75_Sub2_39.aFloat43, super.aClass75_Sub2_39.aFloat47, super.aClass75_Sub2_39.aFloat37, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local43, "sunExponent"), Math.abs(super.aClass75_Sub2_39.aFloatArray23[1]) * 928.0F + 96.0F);
		this.aBoolean346 = true;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	@Override
	public void method4957() {
		if (!this.aBoolean346) {
			return;
		}
		super.aClass75_Sub2_39.method2426(1);
		super.aClass75_Sub2_39.method2456(null);
		super.aClass75_Sub2_39.method2426(0);
		super.aClass75_Sub2_39.method2456(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean346 = false;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)V")
	@Override
	public void method4958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean346) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass213_2.aLong194;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass75_Sub2_39.anInt3079 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!rh;II)V")
	@Override
	public void method4960(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean346) {
			super.aClass75_Sub2_39.method2456(arg0);
			super.aClass75_Sub2_39.method2424(arg1);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4956(@OriginalArg(0) boolean arg0) {
	}
}
