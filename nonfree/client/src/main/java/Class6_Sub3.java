import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!cd;")
	private final Class45 aClass45_3;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!cba;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!dw;Lclient!cd;)V")
	public Class6_Sub3(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class45 arg1) {
		super(arg0);
		this.aClass45_3 = arg1;
		if (this.aClass45_3.aClass94_Sub3_3 != null && super.aClass82_Sub1_41.aBoolean186 && super.aClass82_Sub1_41.aBoolean177) {
			@Pc(30) Class158 local30 = Static519.method7555(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass82_Sub1_41);
			@Pc(37) Class158 local37 = Static519.method7555(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass82_Sub1_41);
			this.aClass42_2 = Static516.method7517(new Class158[] { local30, local37 }, super.aClass82_Sub1_41);
			this.aBoolean54 = this.aClass42_2 != null;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean55) {
			return;
		}
		@Pc(19) int local19 = 0x1 << (arg0 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg1 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(47) long local47 = this.aClass42_2.aLong45;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "time"), (float) (local19 * super.aClass82_Sub1_41.anInt2463 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "scale"), local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "breakWaterDepth"), (float) local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local47, "breakWaterOffset"), local43);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean55) {
			super.aClass82_Sub1_41.method2029(arg0);
			super.aClass82_Sub1_41.method2068(arg1);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (!this.aBoolean55) {
			return;
		}
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029((Class94) null);
		super.aClass82_Sub1_41.method2086(0);
		super.aClass82_Sub1_41.method2029((Class94) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean55 = false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return false;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class94_Sub4 local13 = super.aClass82_Sub1_41.method2024();
		if (!this.aBoolean54 || local13 == null) {
			return;
		}
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029(local13);
		super.aClass82_Sub1_41.method2086(0);
		super.aClass82_Sub1_41.method2029(this.aClass45_3.aClass94_Sub3_3);
		@Pc(44) long local44 = this.aClass42_2.aLong45;
		OpenGL.glUseProgramObjectARB(local44);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local44, "sunDir"), -super.aClass82_Sub1_41.aFloatArray11[0], -super.aClass82_Sub1_41.aFloatArray11[1], -super.aClass82_Sub1_41.aFloatArray11[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local44, "sunColour"), super.aClass82_Sub1_41.aFloat40, super.aClass82_Sub1_41.aFloat34, super.aClass82_Sub1_41.aFloat35, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "sunExponent"), Math.abs(super.aClass82_Sub1_41.aFloatArray11[1]) * 928.0F + 96.0F);
		this.aBoolean55 = true;
	}
}
