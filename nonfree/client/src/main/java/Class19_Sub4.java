import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "Lclient!lc;")
	private final Class189 aClass189_2;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!dw;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!qo;Lclient!lc;)V")
	public Class19_Sub4(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class189 arg1) {
		super(arg0);
		this.aClass189_2 = arg1;
		if (this.aClass189_2.aClass85_Sub2_2 != null && super.aClass20_Sub3_42.aBoolean619 && super.aClass20_Sub3_42.aBoolean617) {
			@Pc(30) Class324 local30 = Static137.method3091(35633, super.aClass20_Sub3_42, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(37) Class324 local37 = Static137.method3091(35632, super.aClass20_Sub3_42, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass81_1 = Static442.method7011(super.aClass20_Sub3_42, new Class324[] { local30, local37 });
			this.aBoolean256 = this.aClass81_1 != null;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean255) {
			super.aClass20_Sub3_42.method7358(arg0);
			super.aClass20_Sub3_42.method7348(arg1);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (!this.aBoolean255) {
			return;
		}
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(null);
		super.aClass20_Sub3_42.method7325(0);
		super.aClass20_Sub3_42.method7358(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean255 = false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class85_Sub3 local14 = super.aClass20_Sub3_42.method7328();
		if (!this.aBoolean256 || local14 == null) {
			return;
		}
		@Pc(33) float local33 = (1.0F - Math.abs(super.aClass20_Sub3_42.aFloatArray75[1])) * 2.0F + 1.0F;
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(local14);
		super.aClass20_Sub3_42.method7325(0);
		super.aClass20_Sub3_42.method7358(this.aClass189_2.aClass85_Sub2_2);
		@Pc(59) long local59 = this.aClass81_1.aLong70;
		OpenGL.glUseProgramObjectARB(local59);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local59, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local59, "sunDir"), -super.aClass20_Sub3_42.aFloatArray75[0], -super.aClass20_Sub3_42.aFloatArray75[1], -super.aClass20_Sub3_42.aFloatArray75[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local59, "sunColour"), super.aClass20_Sub3_42.aFloat176 * local33, super.aClass20_Sub3_42.aFloat180 * local33, super.aClass20_Sub3_42.aFloat181 * local33, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local59, "sunExponent"), Math.abs(super.aClass20_Sub3_42.aFloatArray75[1]) * 928.0F + 64.0F);
		this.aBoolean255 = true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean255) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) long local60 = this.aClass81_1.aLong70;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "time"), (float) (local8 * super.aClass20_Sub3_42.anInt8773 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "scale"), local19);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return this.aBoolean256;
	}
}
