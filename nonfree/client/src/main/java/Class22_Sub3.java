import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Lclient!bt;")
	private final Class30 aClass30_2;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Lclient!ij;")
	private Class114 aClass114_2;

	static {
		new Class55("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!vd;Lclient!bt;)V")
	public Class22_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class30 arg1) {
		super(arg0);
		this.aClass30_2 = arg1;
		if (this.aClass30_2.aClass59_Sub2_3 != null && super.aClass51_Sub2_33.aBoolean440 && super.aClass51_Sub2_33.aBoolean441) {
			@Pc(30) Class225 local30 = Static237.method3236(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass51_Sub2_33);
			@Pc(37) Class225 local37 = Static237.method3236(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass51_Sub2_33);
			this.aClass114_2 = Static322.method4280(new Class225[] { local30, local37 }, super.aClass51_Sub2_33);
			this.aBoolean81 = this.aClass114_2 != null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class59_Sub4 local8 = super.aClass51_Sub2_33.method5407();
		if (!this.aBoolean81 || local8 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass51_Sub2_33.aFloatArray30[1])) * 2.0F + 1.0F;
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(local8);
		super.aClass51_Sub2_33.method5371(0);
		super.aClass51_Sub2_33.method5364(this.aClass30_2.aClass59_Sub2_3);
		@Pc(59) long local59 = this.aClass114_2.aLong97;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass51_Sub2_33.aFloatArray30[0], -super.aClass51_Sub2_33.aFloatArray30[1], -super.aClass51_Sub2_33.aFloatArray30[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), super.aClass51_Sub2_33.aFloat203 * local33, local33 * super.aClass51_Sub2_33.aFloat193, local33 * super.aClass51_Sub2_33.aFloat202, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass51_Sub2_33.aFloatArray30[1]) * 928.0F + 64.0F);
		this.aBoolean82 = true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return this.aBoolean81;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		if (!this.aBoolean82) {
			return;
		}
		super.aClass51_Sub2_33.method5371(1);
		super.aClass51_Sub2_33.method5364(null);
		super.aClass51_Sub2_33.method5371(0);
		super.aClass51_Sub2_33.method5364(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean82) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg0 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg1 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg1 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass114_2.aLong97;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass51_Sub2_33.anInt6911 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean82) {
			super.aClass51_Sub2_33.method5364(arg0);
			super.aClass51_Sub2_33.method5400(arg1);
		}
	}
}
