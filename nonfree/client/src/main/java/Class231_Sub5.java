import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class231_Sub5 extends Class231 {

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "Lclient!wo;")
	private final Class391 aClass391_3;

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "Lclient!fm;")
	private Class123 aClass123_6;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ck;Lclient!wo;)V")
	public Class231_Sub5(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class391 arg1) {
		super(arg0);
		this.aClass391_3 = arg1;
		if (this.aClass391_3.aClass80_Sub3_3 != null && super.aClass65_Sub1_41.aBoolean111 && super.aClass65_Sub1_41.aBoolean101) {
			@Pc(30) Class206 local30 = Static577.method7970(35633, super.aClass65_Sub1_41, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class206 local37 = Static577.method7970(35632, super.aClass65_Sub1_41, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass123_6 = Static425.method6297(new Class206[] { local30, local37 }, super.aClass65_Sub1_41);
			this.aBoolean682 = this.aClass123_6 != null;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return this.aBoolean682;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean683) {
			return;
		}
		@Pc(19) int local19 = 0x1 << (arg1 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg0 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(52) float local52 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(61) float local61 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(67) int local67 = arg0 >> 27 & 0xF;
		@Pc(71) long local71 = this.aClass123_6.aLong68;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "time"), (float) (local19 * super.aClass65_Sub1_41.anInt1383 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "scale"), local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterDepth"), (float) local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterOffset"), local43);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local71, "waveIntensity"), local61, local52);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "waveExponent"), (float) local67);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean683) {
			super.aClass65_Sub1_41.method1286(arg0);
			super.aClass65_Sub1_41.method1290(arg1);
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (!this.aBoolean683) {
			return;
		}
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286((Class80) null);
		super.aClass65_Sub1_41.method1256(0);
		super.aClass65_Sub1_41.method1286((Class80) null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean683 = false;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class80_Sub4 local12 = super.aClass65_Sub1_41.method1244();
		if (!this.aBoolean682 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass65_Sub1_41.aFloatArray5[1])) * 2.0F + 1.0F;
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286(local12);
		super.aClass65_Sub1_41.method1256(0);
		super.aClass65_Sub1_41.method1286(this.aClass391_3.aClass80_Sub3_3);
		@Pc(56) long local56 = this.aClass123_6.aLong68;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass65_Sub1_41.aFloatArray5[0], -super.aClass65_Sub1_41.aFloatArray5[1], -super.aClass65_Sub1_41.aFloatArray5[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), super.aClass65_Sub1_41.aFloat23 * local30, super.aClass65_Sub1_41.aFloat22 * local30, local30 * super.aClass65_Sub1_41.aFloat24, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass65_Sub1_41.aFloatArray5[1]) * 928.0F + 64.0F);
		this.aBoolean683 = true;
	}
}
