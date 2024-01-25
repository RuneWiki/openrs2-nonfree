import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class231_Sub7 extends Class231 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
	private boolean aBoolean830 = false;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
	private boolean aBoolean831 = false;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!wo;")
	private final Class391 aClass391_5;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!fm;")
	private Class123 aClass123_7;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ck;Lclient!wo;)V")
	public Class231_Sub7(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class391 arg1) {
		super(arg0);
		this.aClass391_5 = arg1;
		if (this.aClass391_5.aClass80_Sub3_3 != null && super.aClass65_Sub1_41.aBoolean111 && super.aClass65_Sub1_41.aBoolean101) {
			@Pc(30) Class206 local30 = Static577.method7970(35633, super.aClass65_Sub1_41, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class206 local37 = Static577.method7970(35632, super.aClass65_Sub1_41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass123_7 = Static425.method6297(new Class206[] { local30, local37 }, super.aClass65_Sub1_41);
			this.aBoolean830 = this.aClass123_7 != null;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean831) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg1 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg0 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(36) long local36 = this.aClass123_7.aLong68;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "time"), (float) (local8 * super.aClass65_Sub1_41.anInt1383 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class80_Sub4 local8 = super.aClass65_Sub1_41.method1244();
		if (!this.aBoolean830 || local8 == null) {
			return;
		}
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286(local8);
		super.aClass65_Sub1_41.method1256(0);
		super.aClass65_Sub1_41.method1286(this.aClass391_5.aClass80_Sub3_3);
		@Pc(44) long local44 = this.aClass123_7.aLong68;
		OpenGL.glUseProgramObjectARB(local44);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local44, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local44, "sunDir"), -super.aClass65_Sub1_41.aFloatArray5[0], -super.aClass65_Sub1_41.aFloatArray5[1], -super.aClass65_Sub1_41.aFloatArray5[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local44, "sunColour"), super.aClass65_Sub1_41.aFloat23, super.aClass65_Sub1_41.aFloat22, super.aClass65_Sub1_41.aFloat24, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "sunExponent"), Math.abs(super.aClass65_Sub1_41.aFloatArray5[1]) * 928.0F + 96.0F);
		this.aBoolean831 = true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean831) {
			super.aClass65_Sub1_41.method1286(arg0);
			super.aClass65_Sub1_41.method1290(arg1);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (!this.aBoolean831) {
			return;
		}
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286((Class80) null);
		super.aClass65_Sub1_41.method1256(0);
		super.aClass65_Sub1_41.method1286((Class80) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean831 = false;
	}
}
