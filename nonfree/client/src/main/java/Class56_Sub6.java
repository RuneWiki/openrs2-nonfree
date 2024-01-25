import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class56_Sub6 extends Class56 {

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!go;")
	private final Class96 aClass96_5;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!ed;")
	private Class65 aClass65_7;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ht;Lclient!go;)V")
	public Class56_Sub6(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_5 = arg1;
		if (this.aClass96_5.aClass13_Sub2_1 != null && super.aClass109_Sub1_41.aBoolean157 && super.aClass109_Sub1_41.aBoolean160) {
			@Pc(30) Class149 local30 = Static325.method4587("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass109_Sub1_41, 35633);
			@Pc(37) Class149 local37 = Static325.method4587("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass109_Sub1_41, 35632);
			this.aClass65_7 = Static292.method3804(super.aClass109_Sub1_41, new Class149[] { local30, local37 });
			this.aBoolean302 = this.aClass65_7 != null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean301) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg0 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg1 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(48) long local48 = this.aClass65_7.aLong47;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "time"), (float) (local20 * super.aClass109_Sub1_41.anInt2974 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local48, "breakWaterOffset"), local44);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!ao;)V")
	@Override
	public void method5086(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		if (!this.aBoolean301) {
			super.aClass109_Sub1_41.method2578(arg1);
			super.aClass109_Sub1_41.method2531(arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5085() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5087(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class13_Sub4 local8 = super.aClass109_Sub1_41.method2536();
		if (!this.aBoolean302 || local8 == null) {
			return;
		}
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(local8);
		super.aClass109_Sub1_41.method2564(0);
		super.aClass109_Sub1_41.method2578(this.aClass96_5.aClass13_Sub2_1);
		@Pc(39) long local39 = this.aClass65_7.aLong47;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass109_Sub1_41.aFloatArray21[0], -super.aClass109_Sub1_41.aFloatArray21[1], -super.aClass109_Sub1_41.aFloatArray21[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass109_Sub1_41.aFloat55, super.aClass109_Sub1_41.aFloat47, super.aClass109_Sub1_41.aFloat62, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass109_Sub1_41.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean301 = true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5079(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	@Override
	public void method5084() {
		if (!this.aBoolean301) {
			return;
		}
		super.aClass109_Sub1_41.method2564(1);
		super.aClass109_Sub1_41.method2578(null);
		super.aClass109_Sub1_41.method2564(0);
		super.aClass109_Sub1_41.method2578(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean301 = false;
	}
}
