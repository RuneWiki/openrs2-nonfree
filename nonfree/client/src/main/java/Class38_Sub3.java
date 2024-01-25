import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!go", name = "r", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!qf;")
	private final Class198 aClass198_2;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!uq;")
	private Class246 aClass246_1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!ur;Lclient!qf;)V")
	public Class38_Sub3(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class198 arg1) {
		super(arg0);
		this.aClass198_2 = arg1;
		if (this.aClass198_2.aClass10_Sub4_3 != null && super.aClass34_Sub2_41.aBoolean772 && super.aClass34_Sub2_41.aBoolean760) {
			@Pc(30) Class188 local30 = Static416.method5407("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633, super.aClass34_Sub2_41);
			@Pc(37) Class188 local37 = Static416.method5407("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632, super.aClass34_Sub2_41);
			this.aClass246_1 = Static321.method4318(new Class188[] { local30, local37 }, super.aClass34_Sub2_41);
			this.aBoolean271 = this.aClass246_1 != null;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	@Override
	public void method5824() {
		if (!this.aBoolean270) {
			return;
		}
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(null);
		super.aClass34_Sub2_41.method5507(0);
		super.aClass34_Sub2_41.method5493(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean270 = false;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!he;I)V")
	@Override
	public void method5821(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean270) {
			super.aClass34_Sub2_41.method5493(arg0);
			super.aClass34_Sub2_41.method5517(arg1);
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5825(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)V")
	@Override
	public void method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean270) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass246_1.aLong214;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass34_Sub2_41.anInt7073 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5820(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class10_Sub3 local8 = super.aClass34_Sub2_41.method5525();
		if (!this.aBoolean271 || local8 == null) {
			return;
		}
		super.aClass34_Sub2_41.method5507(1);
		super.aClass34_Sub2_41.method5493(local8);
		super.aClass34_Sub2_41.method5507(0);
		super.aClass34_Sub2_41.method5493(this.aClass198_2.aClass10_Sub4_3);
		@Pc(45) long local45 = this.aClass246_1.aLong214;
		OpenGL.glUseProgramObjectARB(local45);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local45, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local45, "sunDir"), -super.aClass34_Sub2_41.aFloatArray28[0], -super.aClass34_Sub2_41.aFloatArray28[1], -super.aClass34_Sub2_41.aFloatArray28[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local45, "sunColour"), super.aClass34_Sub2_41.aFloat102, super.aClass34_Sub2_41.aFloat85, super.aClass34_Sub2_41.aFloat96, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local45, "sunExponent"), Math.abs(super.aClass34_Sub2_41.aFloatArray28[1]) * 928.0F + 96.0F);
		this.aBoolean270 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5823() {
		return false;
	}
}
