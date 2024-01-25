import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class107_Sub6 extends Class107 {

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "Z")
	private boolean aBoolean570 = false;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "Lclient!qr;")
	private final Class282 aClass282_5;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Lclient!as;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!oea;Lclient!qr;)V")
	public Class107_Sub6(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class282 arg1) {
		super(arg0);
		this.aClass282_5 = arg1;
		if (this.aClass282_5.aClass88_Sub1_2 != null && super.aClass87_Sub2_37.aBoolean544 && super.aClass87_Sub2_37.aBoolean560) {
			@Pc(30) Class134 local30 = Static532.method7450(35633, super.aClass87_Sub2_37, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class134 local37 = Static532.method7450(35632, super.aClass87_Sub2_37, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass23_2 = Static85.method1550(new Class134[] { local30, local37 }, super.aClass87_Sub2_37);
			this.aBoolean570 = this.aClass23_2 != null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7696() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean569) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass23_2.aLong24;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (super.aClass87_Sub2_37.anInt7366 * local8 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!iia;ZI)V")
	@Override
	public void method7695(@OriginalArg(0) Class88 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean569) {
			super.aClass87_Sub2_37.method6167(arg0);
			super.aClass87_Sub2_37.method6159(arg1);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7702(@OriginalArg(1) boolean arg0) {
		@Pc(15) Class88_Sub3 local15 = super.aClass87_Sub2_37.method6174();
		if (!this.aBoolean570 || local15 == null) {
			return;
		}
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(local15);
		super.aClass87_Sub2_37.method6155(0);
		super.aClass87_Sub2_37.method6167(this.aClass282_5.aClass88_Sub1_2);
		@Pc(46) long local46 = this.aClass23_2.aLong24;
		OpenGL.glUseProgramObjectARB(local46);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local46, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local46, "sunDir"), -super.aClass87_Sub2_37.aFloatArray62[0], -super.aClass87_Sub2_37.aFloatArray62[1], -super.aClass87_Sub2_37.aFloatArray62[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local46, "sunColour"), super.aClass87_Sub2_37.aFloat176, super.aClass87_Sub2_37.aFloat180, super.aClass87_Sub2_37.aFloat179, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local46, "sunExponent"), Math.abs(super.aClass87_Sub2_37.aFloatArray62[1]) * 928.0F + 96.0F);
		this.aBoolean569 = true;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7697(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7698() {
		if (!this.aBoolean569) {
			return;
		}
		super.aClass87_Sub2_37.method6155(1);
		super.aClass87_Sub2_37.method6167(null);
		super.aClass87_Sub2_37.method6155(0);
		super.aClass87_Sub2_37.method6167(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean569 = false;
	}
}
