import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Lclient!mt;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!sj;")
	private Class230 aClass230_1;

	static {
		new Class231("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!bl;Lclient!mt;)V")
	public Class5_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass171_1 = arg1;
		if (this.aClass171_1.aClass40_Sub2_2 != null && super.aClass28_Sub1_42.aBoolean50 && super.aClass28_Sub1_42.aBoolean44) {
			@Pc(30) Class243 local30 = Static239.method3725(35633, super.aClass28_Sub1_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class243 local37 = Static239.method3725(35632, super.aClass28_Sub1_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass230_1 = Static313.method4477(super.aClass28_Sub1_42, new Class243[] { local30, local37 });
			this.aBoolean32 = this.aClass230_1 != null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean31) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg0 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(44) long local44 = this.aClass230_1.aLong180;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "time"), (float) (super.aClass28_Sub1_42.anInt737 * local16 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local44, "breakWaterOffset"), local40);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class40_Sub4 local8 = super.aClass28_Sub1_42.method674();
		if (!this.aBoolean32 || local8 == null) {
			return;
		}
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(local8);
		super.aClass28_Sub1_42.method650(0);
		super.aClass28_Sub1_42.method654(this.aClass171_1.aClass40_Sub2_2);
		@Pc(39) long local39 = this.aClass230_1.aLong180;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass28_Sub1_42.aFloatArray6[0], -super.aClass28_Sub1_42.aFloatArray6[1], -super.aClass28_Sub1_42.aFloatArray6[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass28_Sub1_42.aFloat26, super.aClass28_Sub1_42.aFloat8, super.aClass28_Sub1_42.aFloat19, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass28_Sub1_42.aFloatArray6[1]) * 928.0F + 96.0F);
		this.aBoolean31 = true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		if (!this.aBoolean31) {
			return;
		}
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method654(null);
		super.aClass28_Sub1_42.method650(0);
		super.aClass28_Sub1_42.method654(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean31 = false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean31) {
			super.aClass28_Sub1_42.method654(arg0);
			super.aClass28_Sub1_42.method678(arg1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
	}
}
