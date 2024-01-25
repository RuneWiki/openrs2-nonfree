import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!vb;")
	private final Class343 aClass343_1;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!taa;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!us;Lclient!vb;)V")
	public Class60_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class343 arg1) {
		super(arg0);
		this.aClass343_1 = arg1;
		if (this.aClass343_1.aClass34_Sub3_3 != null && super.aClass43_Sub3_43.aBoolean690 && super.aClass43_Sub3_43.aBoolean691) {
			@Pc(30) Class165 local30 = Static556.method7402(35633, super.aClass43_Sub3_43, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class165 local37 = Static556.method7402(35632, super.aClass43_Sub3_43, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass315_1 = Static280.method4448(new Class165[] { local30, local37 }, super.aClass43_Sub3_43);
			this.aBoolean176 = this.aClass315_1 != null;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean175) {
			return;
		}
		@Pc(16) int local16 = 0x1 << (arg1 & 0x3);
		@Pc(27) float local27 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(31) int local31 = arg0 & 0xFFFF;
		@Pc(40) float local40 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(49) float local49 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(58) float local58 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(64) int local64 = arg0 >> 27 & 0xF;
		@Pc(68) long local68 = this.aClass315_1.aLong230;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "time"), (float) (local16 * super.aClass43_Sub3_43.anInt8735 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "scale"), local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterDepth"), (float) local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "breakWaterOffset"), local40);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local68, "waveIntensity"), local58, local49);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local68, "waveExponent"), (float) local64);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (!this.aBoolean175) {
			return;
		}
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(null);
		super.aClass43_Sub3_43.method7277(0);
		super.aClass43_Sub3_43.method7220(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean175 = false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return this.aBoolean176;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class34_Sub4 local8 = super.aClass43_Sub3_43.method7261();
		if (!this.aBoolean176 || local8 == null) {
			return;
		}
		@Pc(26) float local26 = (1.0F - Math.abs(super.aClass43_Sub3_43.aFloatArray64[1])) * 2.0F + 1.0F;
		super.aClass43_Sub3_43.method7277(1);
		super.aClass43_Sub3_43.method7220(local8);
		super.aClass43_Sub3_43.method7277(0);
		super.aClass43_Sub3_43.method7220(this.aClass343_1.aClass34_Sub3_3);
		@Pc(52) long local52 = this.aClass315_1.aLong230;
		OpenGL.glUseProgramObjectARB(local52);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local52, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local52, "sunDir"), -super.aClass43_Sub3_43.aFloatArray64[0], -super.aClass43_Sub3_43.aFloatArray64[1], -super.aClass43_Sub3_43.aFloatArray64[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local52, "sunColour"), super.aClass43_Sub3_43.aFloat217 * local26, local26 * super.aClass43_Sub3_43.aFloat216, super.aClass43_Sub3_43.aFloat206 * local26, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local52, "sunExponent"), Math.abs(super.aClass43_Sub3_43.aFloatArray64[1]) * 928.0F + 64.0F);
		this.aBoolean175 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		if (!this.aBoolean175) {
			super.aClass43_Sub3_43.method7220(arg1);
			super.aClass43_Sub3_43.method7281(arg0);
		}
	}
}
