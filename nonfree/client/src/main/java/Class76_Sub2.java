import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Lclient!pe;")
	private final Class191 aClass191_3;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!v;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!qg;Lclient!pe;)V")
	public Class76_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		super(arg0);
		this.aClass191_3 = arg1;
		if (this.aClass191_3.aClass21_Sub1_3 != null && super.aClass121_Sub2_39.aBoolean482 && super.aClass121_Sub2_39.aBoolean465) {
			@Pc(30) Class259 local30 = Static216.method3232(35633, super.aClass121_Sub2_39, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class259 local37 = Static216.method3232(35632, super.aClass121_Sub2_39, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n");
			this.aClass249_1 = Static309.method4242(super.aClass121_Sub2_39, new Class259[] { local30, local37 });
			this.aBoolean193 = this.aClass249_1 != null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return this.aBoolean193;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		if (!this.aBoolean195) {
			return;
		}
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(null);
		super.aClass121_Sub2_39.method4669(0);
		super.aClass121_Sub2_39.method4681(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean195 = false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class21_Sub4 local16 = super.aClass121_Sub2_39.method4728();
		if (!this.aBoolean193 || local16 == null) {
			return;
		}
		@Pc(35) float local35 = (1.0F - Math.abs(super.aClass121_Sub2_39.aFloatArray36[1])) * 2.0F + 1.0F;
		super.aClass121_Sub2_39.method4669(1);
		super.aClass121_Sub2_39.method4681(local16);
		super.aClass121_Sub2_39.method4669(0);
		super.aClass121_Sub2_39.method4681(this.aClass191_3.aClass21_Sub1_3);
		@Pc(61) long local61 = this.aClass249_1.aLong215;
		OpenGL.glUseProgramObjectARB(local61);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local61, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local61, "sunDir"), -super.aClass121_Sub2_39.aFloatArray36[0], -super.aClass121_Sub2_39.aFloatArray36[1], -super.aClass121_Sub2_39.aFloatArray36[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local61, "sunColour"), super.aClass121_Sub2_39.aFloat87 * local35, super.aClass121_Sub2_39.aFloat100 * local35, local35 * super.aClass121_Sub2_39.aFloat88, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local61, "sunExponent"), Math.abs(super.aClass121_Sub2_39.aFloatArray36[1]) * 928.0F + 64.0F);
		this.aBoolean195 = true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean195) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg0 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass249_1.aLong215;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (local12 * super.aClass121_Sub2_39.anInt5935 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		if (!this.aBoolean195) {
			super.aClass121_Sub2_39.method4681(arg1);
			super.aClass121_Sub2_39.method4707(arg0);
		}
	}
}
