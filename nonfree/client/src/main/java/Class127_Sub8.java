import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class127_Sub8 extends Class127 {

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "Lclient!rb;")
	private final Class287 aClass287_6;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Lclient!dc;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!kw;Lclient!rb;)V")
	public Class127_Sub8(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class287 arg1) {
		super(arg0);
		this.aClass287_6 = arg1;
		if (this.aClass287_6.aClass76_Sub4_1 != null && super.aClass5_Sub2_42.aBoolean396 && super.aClass5_Sub2_42.aBoolean389) {
			@Pc(30) Class324 local30 = Static483.method7199(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass5_Sub2_42);
			@Pc(37) Class324 local37 = Static483.method7199(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass5_Sub2_42);
			this.aClass65_6 = Static116.method2392(super.aClass5_Sub2_42, new Class324[] { local30, local37 });
			this.aBoolean647 = this.aClass65_6 != null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (!this.aBoolean648) {
			return;
		}
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(null);
		super.aClass5_Sub2_42.method5004(0);
		super.aClass5_Sub2_42.method4997(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean648 = false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean648) {
			super.aClass5_Sub2_42.method4997(arg0);
			super.aClass5_Sub2_42.method4953(arg1);
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class76_Sub1 local8 = super.aClass5_Sub2_42.method4983();
		if (!this.aBoolean647 || local8 == null) {
			return;
		}
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(local8);
		super.aClass5_Sub2_42.method5004(0);
		super.aClass5_Sub2_42.method4997(this.aClass287_6.aClass76_Sub4_1);
		@Pc(45) long local45 = this.aClass65_6.aLong42;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass5_Sub2_42.aFloatArray38[0], -super.aClass5_Sub2_42.aFloatArray38[1], -super.aClass5_Sub2_42.aFloatArray38[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass5_Sub2_42.aFloat125, super.aClass5_Sub2_42.aFloat114, super.aClass5_Sub2_42.aFloat120, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass5_Sub2_42.aFloatArray38[1]) * 928.0F + 96.0F);
		this.aBoolean648 = true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean648) {
			return;
		}
		@Pc(13) int local13 = 0x1 << (arg1 & 0x3);
		@Pc(24) float local24 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		@Pc(37) float local37 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(41) long local41 = this.aClass65_6.aLong42;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "time"), (float) (super.aClass5_Sub2_42.anInt5646 * local13 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "scale"), local24);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterDepth"), (float) local28);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local41, "breakWaterOffset"), local37);
	}
}
