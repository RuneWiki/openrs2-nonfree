import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class38_Sub7 extends Class38 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Lclient!hl;")
	private final Class100 aClass100_5;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!su;")
	private Class230 aClass230_2;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!nq;Lclient!hl;)V")
	public Class38_Sub7(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class100 arg1) {
		super(arg0);
		this.aClass100_5 = arg1;
		if (this.aClass100_5.aClass137_Sub2_3 != null && super.aClass167_Sub1_42.aBoolean360 && super.aClass167_Sub1_42.aBoolean340) {
			@Pc(30) Class184 local30 = Static21.method6257("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", super.aClass167_Sub1_42, 35633);
			@Pc(37) Class184 local37 = Static21.method6257("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", super.aClass167_Sub1_42, 35632);
			this.aClass230_2 = Static368.method5128(super.aClass167_Sub1_42, new Class184[] { local30, local37 });
			this.aBoolean395 = this.aClass230_2 != null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	@Override
	public void method5706() {
		if (!this.aBoolean394) {
			return;
		}
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(null);
		super.aClass167_Sub1_42.method3993(0);
		super.aClass167_Sub1_42.method4028(null);
		OpenGL.glUseProgramObjectARB(0L);
		this.aBoolean394 = false;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5707(@OriginalArg(1) boolean arg0) {
		@Pc(13) Class137_Sub4 local13 = super.aClass167_Sub1_42.method4033();
		if (!this.aBoolean395 || local13 == null) {
			return;
		}
		@Pc(32) float local32 = (1.0F - Math.abs(super.aClass167_Sub1_42.aFloatArray27[1])) * 2.0F + 1.0F;
		super.aClass167_Sub1_42.method3993(1);
		super.aClass167_Sub1_42.method4028(local13);
		super.aClass167_Sub1_42.method3993(0);
		super.aClass167_Sub1_42.method4028(this.aClass100_5.aClass137_Sub2_3);
		@Pc(58) long local58 = this.aClass230_2.aLong217;
		OpenGL.glUseProgramObjectARB(local58);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "normalSampler"), 0);
		OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(local58, "envMapSampler"), 1);
		OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(local58, "sunDir"), -super.aClass167_Sub1_42.aFloatArray27[0], -super.aClass167_Sub1_42.aFloatArray27[1], -super.aClass167_Sub1_42.aFloatArray27[2]);
		OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(local58, "sunColour"), super.aClass167_Sub1_42.aFloat71 * local32, super.aClass167_Sub1_42.aFloat78 * local32, local32 * super.aClass167_Sub1_42.aFloat69, 1.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local58, "sunExponent"), Math.abs(super.aClass167_Sub1_42.aFloatArray27[1]) * 928.0F + 64.0F);
		this.aBoolean394 = true;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5704() {
		return this.aBoolean395;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!lr;I)V")
	@Override
	public void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean394) {
			super.aClass167_Sub1_42.method4028(arg0);
			super.aClass167_Sub1_42.method3998(arg1);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean394) {
			return;
		}
		@Pc(12) int local12 = 0x1 << (arg1 & 0x3);
		@Pc(23) float local23 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
		@Pc(27) int local27 = arg0 & 0xFFFF;
		@Pc(36) float local36 = (float) (arg0 >> 16 & 0x3) / 8.0F;
		@Pc(45) float local45 = (float) (arg0 >> 19 & 0xF) / 16.0F;
		@Pc(54) float local54 = (float) (arg0 >> 23 & 0xF) / 16.0F;
		@Pc(60) int local60 = arg0 >> 27 & 0xF;
		@Pc(64) long local64 = this.aClass230_2.aLong217;
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "time"), (float) (super.aClass167_Sub1_42.anInt4890 * local12 % 40000) / 40000.0F);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "scale"), local23);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterDepth"), (float) local27);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "breakWaterOffset"), local36);
		OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(local64, "waveIntensity"), local54, local45);
		OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(local64, "waveExponent"), (float) local60);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5708(@OriginalArg(0) boolean arg0) {
	}
}
