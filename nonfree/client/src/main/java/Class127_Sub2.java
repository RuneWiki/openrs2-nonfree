import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
	private boolean aBoolean338 = false;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
	private boolean aBoolean337 = false;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!rb;")
	private final Class287 aClass287_3;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!dc;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!kw;Lclient!rb;)V")
	public Class127_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class287 arg1) {
		super(arg0);
		this.aClass287_3 = arg1;
		if (this.aClass287_3.aClass76_Sub4_1 != null && super.aClass5_Sub2_42.aBoolean396 && super.aClass5_Sub2_42.aBoolean389) {
			@Pc(30) Class324 local30 = Static483.method7199(35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass5_Sub2_42);
			@Pc(37) Class324 local37 = Static483.method7199(35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", super.aClass5_Sub2_42);
			this.aClass65_1 = Static116.method2392(super.aClass5_Sub2_42, new Class324[] { local30, local37 });
			this.aBoolean337 = this.aClass65_1 != null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean338) {
			super.aClass5_Sub2_42.method4997(arg0);
			super.aClass5_Sub2_42.method4953(arg1);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		if (!this.aBoolean338) {
			return;
		}
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(null);
		super.aClass5_Sub2_42.method5004(0);
		super.aClass5_Sub2_42.method4997(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean338) {
			return;
		}
		@Pc(19) int local19 = 0x1 << (arg1 & 0x3);
		@Pc(30) float local30 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(34) int local34 = arg0 & 0xFFFF;
		@Pc(43) float local43 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(52) float local52 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(61) float local61 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(67) int local67 = arg0 >> 27 & 0xF;
		@Pc(71) long local71 = this.aClass65_1.aLong42;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "time"), (float) (super.aClass5_Sub2_42.anInt5646 * local19 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "scale"), local30);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterDepth"), (float) local34);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "breakWaterOffset"), local43);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local71, "waveIntensity"), local61, local52);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local71, "waveExponent"), (float) local67);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return this.aBoolean337;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class76_Sub1 local12 = super.aClass5_Sub2_42.method4983();
		if (!this.aBoolean337 || local12 == null) {
			return;
		}
		@Pc(31) float local31 = (1.0F - Math.abs(super.aClass5_Sub2_42.aFloatArray38[1])) * 2.0F + 1.0F;
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(local12);
		super.aClass5_Sub2_42.method5004(0);
		super.aClass5_Sub2_42.method4997(this.aClass287_3.aClass76_Sub4_1);
		@Pc(59) long local59 = this.aClass65_1.aLong42;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass5_Sub2_42.aFloatArray38[0], -super.aClass5_Sub2_42.aFloatArray38[1], -super.aClass5_Sub2_42.aFloatArray38[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), local31 * super.aClass5_Sub2_42.aFloat125, super.aClass5_Sub2_42.aFloat114 * local31, local31 * super.aClass5_Sub2_42.aFloat120, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass5_Sub2_42.aFloatArray38[1]) * 928.0F + 64.0F);
		this.aBoolean338 = true;
	}
}
