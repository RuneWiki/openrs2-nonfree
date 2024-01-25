import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!as", name = "q", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Lclient!tf;")
	private final Class336 aClass336_1;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Lclient!gw;")
	private Class142 aClass142_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!lf;Lclient!tf;)V")
	public Class22_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class336 arg1) {
		super(arg0);
		this.aClass336_1 = arg1;
		if (this.aClass336_1.aClass10_Sub1_2 != null && super.aClass95_Sub3_37.aBoolean366 && super.aClass95_Sub3_37.aBoolean378) {
			@Pc(30) Class232 local30 = Static406.method5599(super.aClass95_Sub3_37, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class232 local37 = Static406.method5599(super.aClass95_Sub3_37, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass142_1 = Static45.method801(new Class232[] { local30, local37 }, super.aClass95_Sub3_37);
			this.aBoolean34 = this.aClass142_1 != null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		if (!this.aBoolean35) {
			return;
		}
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864((Class10) null);
		super.aClass95_Sub3_37.method4900(0);
		super.aClass95_Sub3_37.method4864((Class10) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean35 = false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6984(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	@Override
	public void method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean35) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass142_1.aLong98;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass95_Sub3_37.anInt5751 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6982() {
		return false;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ru;II)V")
	@Override
	public void method6979(@OriginalArg(0) Class10 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean35) {
			super.aClass95_Sub3_37.method4864(arg0);
			super.aClass95_Sub3_37.method4870(arg1);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6978(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class10_Sub3 local8 = super.aClass95_Sub3_37.method4846();
		if (!this.aBoolean34 || local8 == null) {
			return;
		}
		super.aClass95_Sub3_37.method4900(1);
		super.aClass95_Sub3_37.method4864(local8);
		super.aClass95_Sub3_37.method4900(0);
		super.aClass95_Sub3_37.method4864(this.aClass336_1.aClass10_Sub1_2);
		@Pc(39) long local39 = this.aClass142_1.aLong98;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass95_Sub3_37.aFloatArray33[0], -super.aClass95_Sub3_37.aFloatArray33[1], -super.aClass95_Sub3_37.aFloatArray33[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass95_Sub3_37.aFloat101, super.aClass95_Sub3_37.aFloat85, super.aClass95_Sub3_37.aFloat99, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass95_Sub3_37.aFloatArray33[1]) * 928.0F + 96.0F);
		this.aBoolean35 = true;
	}
}
