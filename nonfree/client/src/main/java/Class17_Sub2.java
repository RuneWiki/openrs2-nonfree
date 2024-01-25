import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!uo;")
	private final Class249 aClass249_1;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!fe;")
	private Class72 aClass72_5;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!kd;Lclient!uo;)V")
	public Class17_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class249 arg1) {
		super(arg0);
		this.aClass249_1 = arg1;
		if (this.aClass249_1.aClass3_Sub4_2 != null && super.aClass39_Sub2_41.aBoolean247 && super.aClass39_Sub2_41.aBoolean256) {
			@Pc(30) Class224 local30 = Static92.method1684("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass39_Sub2_41, 35633);
			@Pc(37) Class224 local37 = Static92.method1684("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass39_Sub2_41, 35632);
			this.aClass72_5 = Static346.method4845(super.aClass39_Sub2_41, new Class224[] { local30, local37 });
			this.aBoolean112 = this.aClass72_5 != null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5675() {
		return this.aBoolean112;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	@Override
	public void method5672() {
		if (!this.aBoolean113) {
			return;
		}
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(null);
		super.aClass39_Sub2_41.method3221(0);
		super.aClass39_Sub2_41.method3203(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5674(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5673(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class3_Sub3 local12 = super.aClass39_Sub2_41.method3175();
		if (!this.aBoolean112 || local12 == null) {
			return;
		}
		@Pc(30) float local30 = (1.0F - Math.abs(super.aClass39_Sub2_41.aFloatArray11[1])) * 2.0F + 1.0F;
		super.aClass39_Sub2_41.method3221(1);
		super.aClass39_Sub2_41.method3203(local12);
		super.aClass39_Sub2_41.method3221(0);
		super.aClass39_Sub2_41.method3203(this.aClass249_1.aClass3_Sub4_2);
		@Pc(56) long local56 = this.aClass72_5.aLong73;
		OpenGL.glUseProgramObjectARB(local56);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local56, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local56, "sunDir"), -super.aClass39_Sub2_41.aFloatArray11[0], -super.aClass39_Sub2_41.aFloatArray11[1], -super.aClass39_Sub2_41.aFloatArray11[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local56, "sunColour"), local30 * super.aClass39_Sub2_41.aFloat48, local30 * super.aClass39_Sub2_41.aFloat50, local30 * super.aClass39_Sub2_41.aFloat54, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local56, "sunExponent"), Math.abs(super.aClass39_Sub2_41.aFloatArray11[1]) * 928.0F + 64.0F);
		this.aBoolean113 = true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!av;IB)V")
	@Override
	public void method5668(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean113) {
			super.aClass39_Sub2_41.method3203(arg0);
			super.aClass39_Sub2_41.method3162(arg1);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	@Override
	public void method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean113) {
			return;
		}
		@Pc(20) int local20 = 0x1 << (arg1 & 0x3);
		@Pc(31) float local31 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(35) int local35 = arg0 & 0xFFFF;
		@Pc(44) float local44 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(53) float local53 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(62) float local62 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(68) int local68 = arg0 >> 27 & 0xF;
		@Pc(72) long local72 = this.aClass72_5.aLong73;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "time"), (float) (local20 * super.aClass39_Sub2_41.anInt3776 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "scale"), local31);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterDepth"), (float) local35);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "breakWaterOffset"), local44);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local72, "waveIntensity"), local62, local53);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local72, "waveExponent"), (float) local68);
	}
}
