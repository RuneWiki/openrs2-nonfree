import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "Lclient!m;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!ru;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!fd;Lclient!m;)V")
	public Class9_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class144 arg1) {
		super(arg0);
		this.aClass144_1 = arg1;
		if (this.aClass144_1.aClass6_Sub3_2 != null && super.aClass19_Sub2_41.aBoolean217 && super.aClass19_Sub2_41.aBoolean214) {
			@Pc(30) Class267 local30 = Static325.method4397(super.aClass19_Sub2_41, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class267 local37 = Static325.method4397(super.aClass19_Sub2_41, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass210_1 = Static256.method3694(new Class267[] { local30, local37 }, super.aClass19_Sub2_41);
			this.aBoolean17 = this.aClass210_1 != null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class6_Sub4 local8 = super.aClass19_Sub2_41.method1946();
		if (!this.aBoolean17 || local8 == null) {
			return;
		}
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(local8);
		super.aClass19_Sub2_41.method1936(0);
		super.aClass19_Sub2_41.method1905(this.aClass144_1.aClass6_Sub3_2);
		@Pc(51) long local51 = this.aClass210_1.aLong202;
		OpenGL.glUseProgramObjectARB(local51);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local51, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local51, "sunDir"), -super.aClass19_Sub2_41.aFloatArray19[0], -super.aClass19_Sub2_41.aFloatArray19[1], -super.aClass19_Sub2_41.aFloatArray19[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local51, "sunColour"), super.aClass19_Sub2_41.aFloat72, super.aClass19_Sub2_41.aFloat58, super.aClass19_Sub2_41.aFloat74, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local51, "sunExponent"), Math.abs(super.aClass19_Sub2_41.aFloatArray19[1]) * 928.0F + 96.0F);
		this.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		if (!this.aBoolean16) {
			return;
		}
		super.aClass19_Sub2_41.method1936(1);
		super.aClass19_Sub2_41.method1905(null);
		super.aClass19_Sub2_41.method1936(0);
		super.aClass19_Sub2_41.method1905(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		if (!this.aBoolean16) {
			super.aClass19_Sub2_41.method1905(arg1);
			super.aClass19_Sub2_41.method1900(arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean16) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass210_1.aLong202;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass19_Sub2_41.anInt2274 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}
}
