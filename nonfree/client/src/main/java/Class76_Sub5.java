import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class76_Sub5 extends Class76 {

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Z")
	private boolean aBoolean669 = false;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Lclient!sda;")
	private final Class303 aClass303_3;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Lclient!hca;")
	private Class132 aClass132_6;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!ok;Lclient!sda;)V")
	public Class76_Sub5(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class303 arg1) {
		super(arg0);
		this.aClass303_3 = arg1;
		if (this.aClass303_3.aClass40_Sub2_1 != null && super.aClass134_Sub2_43.aBoolean510 && super.aClass134_Sub2_43.aBoolean504) {
			@Pc(30) Class189 local30 = Static364.method4918(35633, super.aClass134_Sub2_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x =  dot(gl_ModelViewMatrix[0].xyz, ecVertex.xyz);\nwvVertex.y = -dot(gl_ModelViewMatrix[1].xyz, ecVertex.xyz);\nwvVertex.z = -dot(gl_ModelViewMatrix[2].xyz, ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class189 local37 = Static364.method4918(35632, super.aClass134_Sub2_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass132_6 = Static269.method3841(new Class189[] { local30, local37 }, super.aClass134_Sub2_43);
			this.aBoolean670 = this.aClass132_6 != null;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7606() {
		return false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	@Override
	public void method7610() {
		if (!this.aBoolean669) {
			return;
		}
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(null);
		super.aClass134_Sub2_43.method5197(0);
		super.aClass134_Sub2_43.method5202(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean669 = false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7613(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ip;I)V")
	@Override
	public void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		if (!this.aBoolean669) {
			super.aClass134_Sub2_43.method5202(arg1);
			super.aClass134_Sub2_43.method5194(arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean669) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(40) long local40 = this.aClass132_6.aLong105;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "time"), (float) (super.aClass134_Sub2_43.anInt6551 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local40, "breakWaterOffset"), local36);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7607(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class40_Sub4 local8 = super.aClass134_Sub2_43.method5276();
		if (!this.aBoolean670 || local8 == null) {
			return;
		}
		super.aClass134_Sub2_43.method5197(1);
		super.aClass134_Sub2_43.method5202(local8);
		super.aClass134_Sub2_43.method5197(0);
		super.aClass134_Sub2_43.method5202(this.aClass303_3.aClass40_Sub2_1);
		@Pc(39) long local39 = this.aClass132_6.aLong105;
		OpenGL.glUseProgramObjectARB(local39);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local39, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local39, "sunDir"), -super.aClass134_Sub2_43.aFloatArray40[0], super.aClass134_Sub2_43.aFloatArray40[1], super.aClass134_Sub2_43.aFloatArray40[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local39, "sunColour"), super.aClass134_Sub2_43.aFloat138, super.aClass134_Sub2_43.aFloat149, super.aClass134_Sub2_43.aFloat152, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local39, "sunExponent"), Math.abs(super.aClass134_Sub2_43.aFloatArray40[1]) * 928.0F + 96.0F);
		this.aBoolean669 = true;
	}
}
